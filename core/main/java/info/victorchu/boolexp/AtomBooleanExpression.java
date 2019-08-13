package info.victorchu.boolexp;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Data 2019/5/23
 * @Version 1.0
 * @Description 表示原子布尔表达式
 */
public abstract class AtomBooleanExpression extends AbstractBooleanExpression {
    @Override
    public AbstractBooleanExpression simplifiedNot() {
        return new NotOpBooleanExpression(this);
    }
}
