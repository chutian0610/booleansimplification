package info.victorchu.simplification;

import java.util.ArrayList;
import java.util.List;

import info.victorchu.boolexp.AbstractBooleanExpression;
import info.victorchu.boolexp.AndOpBooleanExpression;
import info.victorchu.boolexp.AtomBooleanExpression;
import info.victorchu.boolexp.NotOpBooleanExpression;
import info.victorchu.boolexp.OrOpBooleanExpression;
import info.victorchu.simplification.BooleanMatrixV2.MatrixNode;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Data 2020/6/01
 * @Version 2.0
 * @Description 使用BooleanMatrixV2 的化简器
 */
public class BooleanMatrixSimplificatorV2 {
    // 表达式
    public List<AbstractBooleanExpression> booleanExpressionList = new ArrayList<>();

    // 内部矩阵
    public BooleanMatrixV2 booleanMatrixV2 ;

    /**
     * 新增表达式,返回表达式所在index
     * @param expression
     * @return
     */
    public int addExpression(AbstractBooleanExpression expression){
        int index = -1;
        for (int i = 0; i <booleanExpressionList.size() ; i++) {
            if(booleanExpressionList.get(i).equal(expression)){
                index = i;
                break;
            }
        }
        if(index == -1){
            booleanExpressionList.add(expression);
            return booleanExpressionList.size()-1;
        }else {
            return index;
        }

    }

    /**
     * 获得表达式索引
     * @param expression
     * @return
     */
    public int getExpressionIndex(AbstractBooleanExpression expression){
        int index = -1;
        for (int i = 0; i <booleanExpressionList.size() ; i++) {
            if(booleanExpressionList.get(i).equal(expression)){
                index = i;
                break;
            }
        }
        if(index == -1){
            throw new RuntimeException("not constains this expression:"+expression.print()+",please check!");
        }else {
            return index;
        }

    }

    /**
     * 打印所有表达式
     *
     * @return
     */
    public String printBooleanValues(){
        StringBuilder stringBuilder = new StringBuilder();
        booleanExpressionList.forEach(item -> stringBuilder.append(item.print()+"\n"));
        return stringBuilder.toString();
    }

    /**
     * travelExpression 方法中识别 原变量和反变量,被识别成同一个变量。
     * @param expression
     */
    public void travelExpression(AbstractBooleanExpression expression){
        if(expression instanceof AtomBooleanExpression){
            addExpression(expression);
        }else {
            if(expression instanceof AndOpBooleanExpression){
                travelExpression(((AndOpBooleanExpression) expression).getLeft());
                travelExpression(((AndOpBooleanExpression) expression).getRight());
                return;
            }

            if(expression instanceof OrOpBooleanExpression){
                travelExpression(((OrOpBooleanExpression) expression).getLeft());
                travelExpression(((OrOpBooleanExpression) expression).getRight());
                return;
            }
            if(expression instanceof NotOpBooleanExpression){
                travelExpression(((NotOpBooleanExpression) expression).getInner());
            }
        }
    }

    /**
     * 表达式生成矩阵
     * @param expression
     * @return
     */
    public BooleanMatrixV2 getBooleanMatrix(AbstractBooleanExpression expression){
        if(expression instanceof AtomBooleanExpression || expression instanceof NotOpBooleanExpression){
            return buildBoolenMatrixForAtom(expression);
        }else if(expression instanceof AndOpBooleanExpression){
            // 与运算
            return getBooleanMatrix(((AndOpBooleanExpression) expression).getLeft())
                .and(getBooleanMatrix(((AndOpBooleanExpression) expression).getRight()))
                .simplify();
        }else {
            // 或运算
            return getBooleanMatrix(((OrOpBooleanExpression) expression).getLeft())
                .or(getBooleanMatrix(((OrOpBooleanExpression) expression).getRight()))
                .simplify();
        }
    }

    public BooleanMatrixV2 buildBoolenMatrixForAtom(AbstractBooleanExpression expression){
        if( (expression instanceof AtomBooleanExpression) ||
            (expression instanceof NotOpBooleanExpression
                && ((NotOpBooleanExpression) expression).getInner() instanceof AtomBooleanExpression)
        ){
            int index = getExpressionIndex(expression);
            MatrixNode[][] tmp = new MatrixNode[1][booleanExpressionList.size()];
            for (int j = 0; j <booleanExpressionList.size() ; j++) {
                if(index == j){
                    if(expression instanceof NotOpBooleanExpression){
                        tmp[0][j] = MatrixNode.NEGATIVE;
                    }else {
                        tmp[0][j] = MatrixNode.POSITIVE;
                    }

                }else {
                    tmp[0][j] = MatrixNode.EMPTY;
                }
            }
            return new BooleanMatrixV2(1,booleanExpressionList.size(),tmp);
        }
        throw new IllegalArgumentException("error expression:"+expression.print() +",expression must be atom or not(atom)!");
    }

    /**
     * 从矩阵生成化简表达式
     * or { a1 and a2 and a3 ...}
     * or { b1 and b2 and b3 ...}
     * or
     * ...
     *
     * @return
     */
    public List<List<AbstractBooleanExpression>> getExpressionsFromBooleanMatrix(){
        List<List<AbstractBooleanExpression>> list =new ArrayList<>();
        for (int i = 0; i < booleanMatrixV2.getM(); i++) {
            List<AbstractBooleanExpression> expressions = new ArrayList<>();
            for (int j = 0; j <booleanMatrixV2.getN() ; j++) {
                if(booleanMatrixV2.getMatrix()[i][j].equals(MatrixNode.POSITIVE)){
                    expressions.add(booleanExpressionList.get(j));
                }else if(booleanMatrixV2.getMatrix()[i][j].equals(MatrixNode.NEGATIVE)){
                    expressions.add(new NotOpBooleanExpression(booleanExpressionList.get(j)));
                }
            }
            list.add(expressions);
        }
        return list;
    }

    /**
     * 析范式提取矩阵
     * @param expression 简化not expression 后的语法树
     * @return 最小项list
     */
    public List<List<AbstractBooleanExpression>> handleBooleanExpression(AbstractBooleanExpression expression){
        // 1. 获得expression 使用的所有 atom expression ,not(atom) expression
        travelExpression(expression);
        // 2. 生成 expression 对应的 matrix
        booleanMatrixV2 = getBooleanMatrix(expression);
        // 3. 根据 boolean matrix 和 atom list 生成最小项list
        return getExpressionsFromBooleanMatrix();
    }

}
