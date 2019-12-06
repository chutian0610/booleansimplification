package info.victorchu.boolexp;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Data 2019/5/27
 * @Version 1.0
 * @Description TODO
 */
public class TestAtomBooleanExpression extends AtomBooleanExpression {
    private static final AtomicInteger currentIndex = new AtomicInteger(1);

    private boolean result;

    public Integer getIndex() {
        return index;
    }

    private Integer index ;
    public TestAtomBooleanExpression(boolean result) {
        this.result = result;
        index = currentIndex.getAndIncrement();
    }

    @Override
    public boolean equal(AbstractBooleanExpression abstractBooleanExpression) {
        if(abstractBooleanExpression instanceof  TestAtomBooleanExpression){
            if(((TestAtomBooleanExpression) abstractBooleanExpression).getIndex().equals(this.index)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String print() {
        return "{" +index +
                '}';
    }
}
