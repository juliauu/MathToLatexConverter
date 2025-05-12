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
        // Obsługa indeksów dolnych (np. x_1)
        if (ctx.getChildCount() == 3 && "_".equals(ctx.getChild(1).getText())) {
            String base = visit(ctx.expr(0)); // Podstawa 
            String subscript = visit(ctx.expr(1));  // Indeks dolny

            return base + "_" + subscript;
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
                case "e": return "e";         // W LaTeX nie trzeba specjalnie formatować 'e'
                case "α": return "\\alpha";
                case "β": return "\\beta";
                case "γ": return "\\gamma";
                case "δ": return "\\delta";
                case "ε": return "\\epsilon";
                case "ζ": return "\\zeta";
                case "η": return "\\eta";
                case "θ": return "\\theta";
                case "ι": return "\\iota";
                case "κ": return "\\kappa";
                case "λ": return "\\lambda";
                case "μ": return "\\mu";
                case "ν": return "\\nu";
                case "ξ": return "\\xi";
                case "ο": return "o";
                case "π": return "\\pi";
                case "ρ": return "\\rho";
                case "σ": return "\\sigma";
                case "τ": return "\\tau";
                case "υ": return "\\upsilon";
                case "φ": return "\\phi";
                case "χ": return "\\chi";
                case "ψ": return "\\psi";
                case "ω": return "\\omega";
                case "Α": return "A";
                case "Β": return "B";
                case "Γ": return "\\Gamma";
                case "Δ": return "\\Delta";
                case "Ε": return "E";
                case "Ζ": return "Z";
                case "Η": return "H";
                case "Θ": return "\\Theta";
                case "Ι": return "I";
                case "Κ": return "K";
                case "Λ": return "\\Lambda";
                case "Μ": return "M";
                case "Ν": return "N";
                case "Ξ": return "\\Xi";
                case "Ο": return "O";
                case "Π": return "\\Pi";
                case "Ρ": return "P";
                case "Σ": return "\\Sigma";
                case "Τ": return "T";
                case "Υ": return "\\Upsilon";
                case "Φ": return "\\Phi";
                case "Χ": return "X";
                case "Ψ": return "\\Psi";
                case "Ω": return "\\Omega";
            }
        }
        if (ctx.getChild(0).getText().equals("frac")) {
            return "\\frac{" + visit(ctx.expr(0)) + "}{" + visit(ctx.expr(1)) + "}";
        }

        if (ctx.getChild(0).getText().equals("mod")) {
            return visit(ctx.expr(0)) + " \\bmod " + visit(ctx.expr(1));
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
        // Obsługa sumy (Σ)
        if (ctx.getChild(0).getText().equals("Σ")) {
            String start = visit(ctx.expr(0)); // Pierwszy argument sumy
            String end = visit(ctx.expr(1));   // Drugi argument sumy
            String step = visit(ctx.expr(2));  // Krok sumy

            return "\\sum_{" + start + "}^{" + end + "} " + step;
        }

        // Obsługa całki (∫)
        if (ctx.getChild(0).getText().equals("∫")) {
            String lower = visit(ctx.expr(0)); // Dolna granica całkowania
            String upper = visit(ctx.expr(1)); // Górna granica całkowania
            String integrand = visit(ctx.expr(2)); // Wyrażenie całkowane

            return "\\int_{" + lower + "}^{" + upper + "} " + integrand + " \\, dx";
        }

        // Obsługa iloczynu (∏)
        if (ctx.getChild(0).getText().equals("∏")) {
            String start = visit(ctx.expr(0)); // Pierwszy argument iloczynu
            String end = visit(ctx.expr(1));   // Drugi argument iloczynu

            return "\\prod_{" + start + "}^{" + end + "}";
        }
        // Obsługa macierzy
        if (ctx.getChild(0).getText().equals("matrix")) {
            String matrixContent = visit(ctx.matrixContent());
            return "\\begin{bmatrix} " + matrixContent + " \\end{bmatrix}";
        }
        return "";
    }

    @Override
    public String visitMatrixContent(LatexParser.MatrixContentContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (LatexParser.RowContext row : ctx.row()) {
            builder.append(visit(row));
            builder.append(" \\\\ ");
        }
        return builder.toString().trim();
    }

    @Override
    public String visitRow(LatexParser.RowContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (LatexParser.CellContext cellCtx : ctx.cell()) {
            String cell;
            if (cellCtx.expr() == null) {
                cell = "\\cdots";
            } else {
                cell = visit(cellCtx.expr());
            }
            builder.append(cell).append(" & ");
        }
        return builder.toString().substring(0, builder.length() - 2); // Usuń ostatnie "&"
    }
}

