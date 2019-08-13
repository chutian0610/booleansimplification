package info.victorchu.boolexp;

import static info.victorchu.utils.Checker.checkNotNull;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Data 2019/5/23
 * @Version 1.0
 * @Description 表示组合布尔表达式
 */
public abstract class OperatorBooleanExpression extends AbstractBooleanExpression {
    public BooleanOp getBooleanOp() {
        return booleanOp;
    }

    protected final BooleanOp booleanOp;

    public OperatorBooleanExpression(BooleanOp booleanOp) {
        checkNotNull(booleanOp,"boolean operator must not null!");
        this.booleanOp = booleanOp;
    }
}
