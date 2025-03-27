// Generated from c:/Users/aleks/Desktop/uczelnia/projekt miasi/1/MathToLatexConverter/src/main/java/com/app/Latex.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LatexParser}.
 */
public interface LatexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LatexParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LatexParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LatexParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LatexParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LatexParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LatexParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LatexParser.ExprContext ctx);
}