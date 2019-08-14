package info.victorchu.boolexp;

import static info.victorchu.utils.Checker.checkNotNull;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Data 2019/5/23
 * @Version 1.0
 * @Description 表示或表达式
 */
public class OrOpBooleanExpression extends OperatorBooleanExpression {
    private AbstractBooleanExpression left;
    private AbstractBooleanExpression right;

    public OrOpBooleanExpression(BooleanOp booleanOp, AbstractBooleanExpression left, AbstractBooleanExpression right) {
        super(booleanOp);
        checkNotNull(left, "or operator left parameter must not null!");
        this.left = left;
        checkNotNull(right, "or operator right parameter must not null!");
        this.right = right;
    }

    public OrOpBooleanExpression(AbstractBooleanExpression left, AbstractBooleanExpression right) {
        this(BooleanOp.OR, left, right);
    }

    @Override
    public boolean equal(AbstractBooleanExpression abstractBooleanExpression) {
        if (abstractBooleanExpression instanceof OrOpBooleanExpression) {
            if (left.equal(((OrOpBooleanExpression) abstractBooleanExpression).left)
                    && right.equal(((OrOpBooleanExpression) abstractBooleanExpression).right)) {
                return true;
            }
            ;
            // 交换律
            if (left.equal(((OrOpBooleanExpression) abstractBooleanExpression).right)
                    && right.equal(((OrOpBooleanExpression) abstractBooleanExpression).left)) {
                return true;
            }
        }
        return false;
    }

    public AbstractBooleanExpression getLeft() {
        return left;
    }

    public void setLeft(AbstractBooleanExpression left) {
        this.left = left;
    }

    public AbstractBooleanExpression getRight() {
        return right;
    }

    public void setRight(AbstractBooleanExpression right) {
        this.right = right;
    }

    @Override
    public AbstractBooleanExpression simplifiedNot() {
        return new AndOpBooleanExpression(this.getLeft().simplifiedNot(), this.getRight().simplifiedNot());
    }

    @Override
    public String print() {
        return "("+ left.print() +" | "+ right.print() +")";
    }
}
