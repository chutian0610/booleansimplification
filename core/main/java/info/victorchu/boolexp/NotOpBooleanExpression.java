package info.victorchu.boolexp;

import static info.victorchu.utils.Checker.checkNotNull;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Data 2019/5/23
 * @Version 1.0
 * @Description 表示取反表达式
 */
public class NotOpBooleanExpression extends OperatorBooleanExpression {
    public AbstractBooleanExpression getInner() {
        return inner;
    }

    public void setInner(AbstractBooleanExpression inner) {
        this.inner = inner;
    }

    private AbstractBooleanExpression inner;
    public NotOpBooleanExpression(BooleanOp booleanOp, AbstractBooleanExpression inner) {
        super(booleanOp);
        checkNotNull(inner,"not operator inner parameter must not null!");
        this.inner = inner;
    }

    public NotOpBooleanExpression(AbstractBooleanExpression inner){
        this(BooleanOp.NOT,inner);
    }

    @Override
    public boolean equal(AbstractBooleanExpression abstractBooleanExpression) {
        if(abstractBooleanExpression instanceof NotOpBooleanExpression){
            return inner == ((NotOpBooleanExpression) abstractBooleanExpression).inner;
        }
        return false;
    }

    @Override
    public AbstractBooleanExpression simplifiedNot() {
        return this.getInner();
    }

    @Override
    public String print() {
        return "!(" + inner.print() +")";
    }
}
