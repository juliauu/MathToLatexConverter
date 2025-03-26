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
        if (ctx.ADD() != null) {
            return visit(ctx.expr(0)) + " + " + visit(ctx.expr(1));
        }
        return "";
    }
}
