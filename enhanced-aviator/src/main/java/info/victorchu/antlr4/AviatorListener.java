// Generated from E:/IdeaProject/booleansimplification/enhanced-aviator/src/main/resources\Aviator.g4 by ANTLR 4.7.2
package info.victorchu.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AviatorParser}.
 */
public interface AviatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AviatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AviatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AviatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOr}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitOr(AviatorParser.BitOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOr}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitOr(AviatorParser.BitOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shift}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShift(AviatorParser.ShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shift}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShift(AviatorParser.ShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary(AviatorParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary(AviatorParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(AviatorParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(AviatorParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitAnd}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitAnd(AviatorParser.BitAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitAnd}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitAnd(AviatorParser.BitAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(AviatorParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(AviatorParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRel(AviatorParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRel(AviatorParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AviatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AviatorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AviatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AviatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xor}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterXor(AviatorParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitXor(AviatorParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code join}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterJoin(AviatorParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code join}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitJoin(AviatorParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(AviatorParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(AviatorParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFactor(AviatorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFactor(AviatorParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality(AviatorParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality(AviatorParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary(AviatorParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary(AviatorParser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AviatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AviatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(AviatorParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(AviatorParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(AviatorParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(AviatorParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(AviatorParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(AviatorParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#lambdaDefineExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDefineExpression(AviatorParser.LambdaDefineExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#lambdaDefineExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDefineExpression(AviatorParser.LambdaDefineExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#lambdaExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpressionBody(AviatorParser.LambdaExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#lambdaExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpressionBody(AviatorParser.LambdaExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(AviatorParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(AviatorParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(AviatorParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(AviatorParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AviatorParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AviatorParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AviatorParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AviatorParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(AviatorParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(AviatorParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AviatorParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(AviatorParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AviatorParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(AviatorParser.FloatLiteralContext ctx);
}