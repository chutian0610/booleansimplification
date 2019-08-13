package info.victorchu.simplification;

import info.victorchu.boolexp.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Data 2019/5/23
 * @Version 1.0
 * @Description 化简器
 */
public final class BooleanMatrixSimplificator {
    public List<AbstractBooleanExpression> getBooleanExpressionList() {
        return booleanExpressionList;
    }

    public BooleanMatrix booleanMatrix ;
    public List<AbstractBooleanExpression> booleanExpressionList = new ArrayList<>();

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

    public String printBooleanValues(){
        StringBuilder stringBuilder = new StringBuilder();
        booleanExpressionList.forEach(item -> stringBuilder.append(item.print()+"\n"));
        return stringBuilder.toString();
    }

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
                if(((NotOpBooleanExpression) expression).getInner() instanceof AtomBooleanExpression){
                    addExpression(expression);
                }else {
                    travelExpression(((NotOpBooleanExpression) expression).getInner());
                }
            }
        }
    }

    public BooleanMatrix getBooleanMatrix(AbstractBooleanExpression expression){
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

    public BooleanMatrix buildBoolenMatrixForAtom(AbstractBooleanExpression expression){
        if( (expression instanceof AtomBooleanExpression) ||
                (expression instanceof NotOpBooleanExpression
                        && ((NotOpBooleanExpression) expression).getInner() instanceof AtomBooleanExpression)
        ){
            int index = getExpressionIndex(expression);
            int[][] tmp = new int[1][booleanExpressionList.size()];
            for (int j = 0; j <booleanExpressionList.size() ; j++) {
                if(index == j){
                    tmp[0][j] = 1;
                }else {
                    tmp[0][j] =0;
                }
            }
            return new BooleanMatrix(1,booleanExpressionList.size(),tmp);
        }
        throw new IllegalArgumentException("error expression:"+expression.print() +",expression must be atom or not(atom)!");
    }

    /**
     * or { a1 and a2 and a3 ...}
     * or { b1 and b2 and b3 ...}
     * or
     * ...
     *
     * @return
     */
    public List<List<AbstractBooleanExpression>> getExpressionsFromBooleanMatrix(){
        List<List<AbstractBooleanExpression>> list =new ArrayList<>();
        for (int i = 0; i < booleanMatrix.getM(); i++) {
            List<AbstractBooleanExpression> expressions = new ArrayList<>();
            for (int j = 0; j <booleanMatrix.getN() ; j++) {
                if(booleanMatrix.getMatrix()[i][j] ==1){
                    expressions.add(booleanExpressionList.get(j));
                }
            }
            list.add(expressions);
        }
        return list;
    }

    /**
     * 析范式
     * @param expression 简化not expression 后的语法树
     * @return 最小项list
     */
    public List<List<AbstractBooleanExpression>> handleBooleanExpression(AbstractBooleanExpression expression){
        // 1. 获得expression 使用的所有 atom expression ,not(atom) expression
        travelExpression(expression);
        // 2. 生成 expression 对应的 matrix
        booleanMatrix = getBooleanMatrix(expression);
        // 3. 根据 boolean matrix 和 atom list 生成最小项list
        return getExpressionsFromBooleanMatrix();
    }
}
