package info.victorchu.utils;

import info.victorchu.boolexp.*;
import info.victorchu.simplification.BooleanExpressionHelper;
import org.junit.Test;


public class BooleanExpressionHelperTest {

    // !(!(1*2)+3)+4

    @Test
    public void simplifyNot() {
        TestAtomBooleanExpression testAtomBooleanExpression1 = new TestAtomBooleanExpression(false);
        TestAtomBooleanExpression testAtomBooleanExpression2 = new TestAtomBooleanExpression(true);
        TestAtomBooleanExpression testAtomBooleanExpression3 = new TestAtomBooleanExpression(false);
        TestAtomBooleanExpression testAtomBooleanExpression4 = new TestAtomBooleanExpression(true);
        AndOpBooleanExpression and1 = new AndOpBooleanExpression(testAtomBooleanExpression1,testAtomBooleanExpression2);
        OrOpBooleanExpression or1 = new OrOpBooleanExpression(
                new NotOpBooleanExpression(and1),testAtomBooleanExpression3);
        OrOpBooleanExpression or2 = new OrOpBooleanExpression(
                new NotOpBooleanExpression(or1),testAtomBooleanExpression4
        );
        System.out.println(or2.print());
       AbstractBooleanExpression abstractBooleanExpression =  BooleanExpressionHelper.simplifyNot(or2);
        System.out.println(abstractBooleanExpression.print());
    }
}