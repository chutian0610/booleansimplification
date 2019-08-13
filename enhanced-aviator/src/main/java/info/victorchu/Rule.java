package info.victorchu;

import info.victorchu.boolexp.AbstractBooleanExpression;

public class Rule {
    private String originExp;
    private AbstractBooleanExpression abstractBooleanExpression;

    public String getOriginExp() {
        return originExp;
    }

    public void setOriginExp(String originExp) {
        this.originExp = originExp;
    }

    public AbstractBooleanExpression getAbstractBooleanExpression() {
        return abstractBooleanExpression;
    }

    public void setAbstractBooleanExpression(AbstractBooleanExpression abstractBooleanExpression) {
        this.abstractBooleanExpression = abstractBooleanExpression;
    }
}
