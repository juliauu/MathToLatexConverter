// Generated from C:/Users/gabry/IdeaProjects/MathToLatexConverter/src/main/java/com/app/Latex.g4 by ANTLR 4.13.2
package com.app;
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
	/**
	 * Enter a parse tree produced by {@link LatexParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(LatexParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(LatexParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(LatexParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(LatexParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#matrixContent}.
	 * @param ctx the parse tree
	 */
	void enterMatrixContent(LatexParser.MatrixContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#matrixContent}.
	 * @param ctx the parse tree
	 */
	void exitMatrixContent(LatexParser.MatrixContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(LatexParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(LatexParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#cell}.
	 * @param ctx the parse tree
	 */
	void enterCell(LatexParser.CellContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#cell}.
	 * @param ctx the parse tree
	 */
	void exitCell(LatexParser.CellContext ctx);
}