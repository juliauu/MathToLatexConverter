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
        if (ctx.VAR() != null) {  // Obsługa zmiennych
            return ctx.VAR().getText();
        }
        if (ctx.NUMBER() != null) {  // Obsługa zmiennych
            return ctx.NUMBER().getText();
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
            // Obsługa dzielenia z nawiasami
            String left = visit(ctx.expr(0));
            String right = visit(ctx.expr(1));

            // Jeśli wyrażenie jest w nawiasach, odpowiednio je otocz nawiasami
            if (ctx.expr(0).getChildCount() > 1) {
                left = "(" + left + ")";
            }
            if (ctx.expr(1).getChildCount() > 1) {
                right = "(" + right + ")";
            }

            return "\\frac{" + left + "}{" + right + "}";
        }


        // Obsługa potęgowania
        if (ctx.getChildCount() == 3 && "^".equals(ctx.getChild(1).getText())) {
            String base = visit(ctx.expr(0));  // Podstawa potęgi
            String exponent = visit(ctx.expr(1));  // Wykładnik

            // Otocz nawiasami wykładnik, jeśli jest wyrażeniem złożonym
            if (ctx.expr(1).getChildCount() > 1) {
                exponent = "{" + exponent + "}";
            }

            return base + "^" + exponent;
        }
        if (ctx.getChildCount() == 2 && ctx.getChild(0).getText().equals("√")) {
            String inner = visit(ctx.expr(0));

            // Jeśli argument pierwiastka to złożone wyrażenie (czyli więcej niż 1 dziecko),
            // to otaczamy go nawiasami, aby zakończyć pierwiastkowanie
            if (ctx.expr(0).getChildCount() > 1 || ctx.expr(0).getChild(0).getText().equals("(")) {
                inner = "{" + inner + "}";
            }

            return "\\sqrt" + inner;
        }

        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(") && ctx.getChild(2).getText().equals(")")) {
            // Obsługa nawiasów
            return visit(ctx.expr(0));
        }

        if (ctx.func() != null) {
            String func = ctx.func().getText();
            String arg = visit(ctx.expr(0));

            // Otocz argument nawiasami jeśli złożony
            if (ctx.expr(0).getChildCount() > 1) {
                arg = "{" + arg + "}";
            }

            return "\\" + func + "(" + arg + ")";
        }

        // --- Stałe ---
        if (ctx.constant() != null) {
            switch (ctx.constant().getText()) {
                case "π": return "\\pi";
                case "e": return "e";         // W LaTeX nie trzeba specjalnie formatować 'e'
                case "Ω": return "\\Omega";
            }
        }
        // Obsługa wartości bezwzględnej (| expr |)
        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("|") && ctx.getChild(2).getText().equals("|")) {
            String innerExpr = visit(ctx.expr(0));
            return "\\left|" + innerExpr + "\\right|";
        }
        // Obsługa silni (expr '!')
        if (ctx.getChildCount() == 2 && ctx.getChild(1).getText().equals("!")) {
            String innerExpr = visit(ctx.expr(0));

            // Jeśli wyrażenie jest złożone (np. w nawiasach), otocz je nawiasami LaTeX
            if (ctx.expr(0).getChildCount() > 1 || ctx.expr(0).getText().contains("(")) {
                innerExpr = "{" + innerExpr + "}";
            }

            return innerExpr + "!";
        }
        return "";
    }
}

