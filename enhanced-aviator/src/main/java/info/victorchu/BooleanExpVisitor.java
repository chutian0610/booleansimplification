package info.victorchu;

import info.victorchu.antlr4.AviatorBaseVisitor;
import info.victorchu.antlr4.AviatorParser;
import info.victorchu.boolexp.AbstractBooleanExpression;
import info.victorchu.boolexp.AndOpBooleanExpression;
import info.victorchu.boolexp.NotOpBooleanExpression;
import info.victorchu.boolexp.OrOpBooleanExpression;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * aviator的语法产生式粗略分为表达式和值两类对应于 grammar文件的 expression和primary
 * 我们要处理的是布尔表达式的组合:
 * 1. 对于 expression 中 and ，join ，unary（!）的标签，需要特殊处理
 * 2. 对于 expression 中其他的标签，作为布尔变量处理
 * 3. 对于 primary 中的 reference，literal ，functionExpression，lambdaExpression 都直接作为布尔变量
 * 4. 对于 primary 中的 括号嵌套表达式，分情况讨论，如果，括号嵌套表达式的内部是 and ，join ，unary，需要进行化简，否则，直接作为布尔变量。
 */

public class BooleanExpVisitor extends AviatorBaseVisitor {

    @Override
    public Object visitPattern(AviatorParser.PatternContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Rule visitStatement(AviatorParser.StatementContext ctx) {
        Rule rule = new Rule();
        rule.setOriginExp(ctx.getText());
        rule.setAbstractBooleanExpression((AbstractBooleanExpression) super.visitStatement(ctx));
        return rule;
    }

    @Override
    public Object visitBitOr(AviatorParser.BitOrContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 位或不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitShift(AviatorParser.ShiftContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 位移不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitUnary(AviatorParser.UnaryContext ctx) {
        if(ctx.prefix.getText().equals("!")){
            return new NotOpBooleanExpression((AbstractBooleanExpression) ctx.expression().accept(this));
        }else {
            String exp = ctx.getText();
            AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
            aviatorAtomBooleanExpression.setExpression(exp);
            return aviatorAtomBooleanExpression;
        }
    }

    @Override
    public Object visitLambda(AviatorParser.LambdaContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // lambda不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitBitAnd(AviatorParser.BitAndContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 位与不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitAnd(AviatorParser.AndContext ctx) {
        AviatorParser.ExpressionContext left = ctx.expression(0);
        AviatorParser.ExpressionContext right = ctx.expression(0);
        return new AndOpBooleanExpression((AbstractBooleanExpression)left.accept(this)
                ,(AbstractBooleanExpression)right.accept(this));
    }

    @Override
    public Object visitRel(AviatorParser.RelContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 关系比较不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitTerm(AviatorParser.TermContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 数学运算不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitExpr(AviatorParser.ExprContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 数学运算不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitXor(AviatorParser.XorContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 异或不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitJoin(AviatorParser.JoinContext ctx) {
        AviatorParser.ExpressionContext left = ctx.expression(0);
        AviatorParser.ExpressionContext right = ctx.expression(0);
        return new OrOpBooleanExpression((AbstractBooleanExpression)left.accept(this)
                ,(AbstractBooleanExpression)right.accept(this));
    }

    @Override
    public Object visitArrayAccess(AviatorParser.ArrayAccessContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 异或不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitFactor(AviatorParser.FactorContext ctx) {
        // factor 有几种类型，继续向下推导
        return super.visitFactor(ctx);
    }

    @Override
    public Object visitEquality(AviatorParser.EqualityContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 关系判断不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitTernary(AviatorParser.TernaryContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 三目操作符不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitAssign(AviatorParser.AssignContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 赋值不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitPrimary(AviatorParser.PrimaryContext ctx) {
        // Primary 有几种类型，继续向下推导
        return super.visitPrimary(ctx);
    }

    @Override
    public Object visitLambdaExpression(AviatorParser.LambdaExpressionContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // lambda不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitLambdaDefineExpression(AviatorParser.LambdaDefineExpressionContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // lambda不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitLambdaExpressionBody(AviatorParser.LambdaExpressionBodyContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // lambda不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitFunctionExpression(AviatorParser.FunctionExpressionContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // function不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitReference(AviatorParser.ReferenceContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        // 引用不需要继续深入
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitExpressionList(AviatorParser.ExpressionListContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitLiteral(AviatorParser.LiteralContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitIntegerLiteral(AviatorParser.IntegerLiteralContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        return aviatorAtomBooleanExpression;
    }

    @Override
    public Object visitFloatLiteral(AviatorParser.FloatLiteralContext ctx) {
        String exp = ctx.getText();
        AviatorAtomBooleanExpression aviatorAtomBooleanExpression = new AviatorAtomBooleanExpression();
        aviatorAtomBooleanExpression.setExpression(exp);
        return aviatorAtomBooleanExpression;
    }
}
