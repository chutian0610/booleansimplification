// Generated from E:/IdeaProject/booleansimplification/enhanced-aviator/src/main/resources\Aviator.g4 by ANTLR 4.7.2
package info.victorchu.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AviatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AviatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AviatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AviatorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitOr}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOr(AviatorParser.BitOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shift}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift(AviatorParser.ShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(AviatorParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(AviatorParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitAnd}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAnd(AviatorParser.BitAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(AviatorParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(AviatorParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(AviatorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AviatorParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(AviatorParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code join}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(AviatorParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(AviatorParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(AviatorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(AviatorParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary(AviatorParser.TernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link AviatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AviatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(AviatorParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(AviatorParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(AviatorParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#lambdaDefineExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDefineExpression(AviatorParser.LambdaDefineExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#lambdaExpressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpressionBody(AviatorParser.LambdaExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(AviatorParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(AviatorParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AviatorParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AviatorParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(AviatorParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AviatorParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(AviatorParser.FloatLiteralContext ctx);
}