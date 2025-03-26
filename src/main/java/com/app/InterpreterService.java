package com.app;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.springframework.stereotype.Service;

@Service
public class InterpreterService {
    public String interpret(String expression) {
        try {
            CharStream input = CharStreams.fromString(expression);
            LatexLexer lexer = new LatexLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LatexParser parser = new LatexParser(tokens);
            ParseTree tree = parser.prog();
            Converter visitor = new Converter();
            return visitor.visit(tree);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
