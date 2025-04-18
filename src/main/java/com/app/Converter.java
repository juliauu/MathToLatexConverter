package com.app;

public class Converter extends LatexBaseVisitor<String> {
    @Override
    public String visitProg(LatexParser.ProgContext ctx) {
        if (ctx.stat() != null) return visit(ctx.stat());
        return "";
    }

    @Override
    public String visitStat(LatexParser.StatContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitExpr(LatexParser.ExprContext ctx) {
        if (ctx.INT() != null) {
            return ctx.INT().getText();
        }
        if (ctx.VAR() != null) {  // Obsługa zmiennych
            return ctx.VAR().getText();
        }
        if (ctx.ADD() != null) {
            return visit(ctx.expr(0)) + " + " + visit(ctx.expr(1));
        }
        if (ctx.SUB() != null) {
            return visit(ctx.expr(0)) + " - " + visit(ctx.expr(1));
        }
        if (ctx.MUL() != null) {
            return visit(ctx.expr(0)) + " \\cdot " + visit(ctx.expr(1));
        }
        if (ctx.DIV() != null) {
            return "\\frac{" + visit(ctx.expr(0)) + "}{" + visit(ctx.expr(1)) + "}";
        }
        if (ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("^")) {
            return visit(ctx.expr(0)) + "^{" + visit(ctx.expr(1)) + "}";
        }
        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
            return "(" + visit(ctx.expr(1)) + ")";
        }
        if (ctx.func() != null) {
            return "\\" + ctx.func().getText() + "(" + visit(ctx.expr(0)) + ")";
        }
        if (ctx.getChildCount() == 2 && ctx.getChild(0).getText().equals("√")) {
            return "\\sqrt{" + visit(ctx.expr(1)) + "}";
        }
        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("frac")) {
            return "\\frac{" + visit(ctx.expr(1)) + "}{" + visit(ctx.expr(2)) + "}";
        }
        return "";
    }
}

