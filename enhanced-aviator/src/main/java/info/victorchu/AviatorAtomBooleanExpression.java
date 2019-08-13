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

    public Map<String, Object> getEnv() {
        return env;
    }

    public void setEnv(Map<String, Object> env) {
        this.env = env;
    }

    private String expression;
    private Map<String,Object> env;

    @Override
    public boolean evaluate() {
        return false;
    }

    @Override
    public boolean equal(AbstractBooleanExpression abstractBooleanExpression) {
        return false;
    }

    @Override
    public String print() {
        return null;
    }
}
