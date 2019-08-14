package info.victorchu;

import info.victorchu.boolexp.AbstractBooleanExpression;
import info.victorchu.boolexp.AtomBooleanExpression;

import java.util.Map;

public class AviatorAtomBooleanExpression extends AtomBooleanExpression {

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    private String expression;

    @Override
    public boolean equal(AbstractBooleanExpression abstractBooleanExpression) {
        if(abstractBooleanExpression == null){
            return false;
        }
        if(abstractBooleanExpression instanceof AviatorAtomBooleanExpression){
            return ((AviatorAtomBooleanExpression) abstractBooleanExpression).getExpression().equals(this.expression);
        }else {
            return false;
        }
    }

    @Override
    public String print() {
        return expression;
    }
}
