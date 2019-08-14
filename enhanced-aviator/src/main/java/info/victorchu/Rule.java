package info.victorchu;

import info.victorchu.boolexp.AbstractBooleanExpression;

import java.util.List;

public class Rule {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String originExp;
    private AbstractBooleanExpression booleanExpression;
    private List<List<AbstractBooleanExpression>> booleanMatrix;

    public String getOriginExp() {
        return originExp;
    }

    public void setOriginExp(String originExp) {
        this.originExp = originExp;
    }

    public AbstractBooleanExpression getBooleanExpression() {
        return booleanExpression;
    }

    public void setBooleanExpression(AbstractBooleanExpression booleanExpression) {
        this.booleanExpression = booleanExpression;
    }

    public List<List<AbstractBooleanExpression>> getBooleanMatrix() {
        return booleanMatrix;
    }

    public void setBooleanMatrix(List<List<AbstractBooleanExpression>> booleanMatrix) {
        this.booleanMatrix = booleanMatrix;
    }
}
