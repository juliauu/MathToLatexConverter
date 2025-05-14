// Generated from C:/Users/gabry/IdeaProjects/MathToLatexConverter/src/main/java/com/app/Latex.g4 by ANTLR 4.13.2
package com.app;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LatexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LatexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LatexParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LatexParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LatexParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LatexParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(LatexParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(LatexParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#matrixContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixContent(LatexParser.MatrixContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(LatexParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#cell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell(LatexParser.CellContext ctx);
}