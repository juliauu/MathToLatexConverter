grammar Latex;

prog:	stat EOF;

stat: expr;

expr:
     expr (MUL|DIV) expr
    | expr (ADD|SUB) expr
    | expr '^' expr
    | constant
    | NUMBER
    | '(' expr ')'
    | '√' expr
    | expr '!'
    | '\u03A3' '(' expr ',' expr ',' expr ')' //Σ
    | '\u222B' '(' expr ',' expr ',' expr ')' //∫
    | '\u220F' '(' expr ',' expr ')' //∏
    | '|' expr '|'
    | 'frac' '(' expr ',' expr ')'
    | 'mod' '(' expr ',' expr ')'
    | 'matrix' '(' matrixContent ')'
    | func '(' expr ')'
    | VAR
    ;

VAR: [a-zA-Z] [a-zA-Z0-9]* ;
NUMBER: [0-9]+ ('.' [0-9]+)? ;
MUL : '*' ;
DIV : '/' ;
SUB : '-' ;
ADD : '+' ;

func: 'sin' | 'cos' | 'tan' | 'sinh' | 'cosh' | 'tanh' | 'exp' | 'gcd' | 'lfloor' | 'lceil';
constant:
      'e'
    | '\u03B1' // α
    | '\u03B2' // β
    | '\u03B3' // γ
    | '\u03B4' // δ
    | '\u03B5' // ε
    | '\u03B6' // ζ
    | '\u03B7' // η
    | '\u03B8' // θ
    | '\u03B9' // ι
    | '\u03BA' // κ
    | '\u03BB' // λ
    | '\u03BC' // μ
    | '\u03BD' // ν
    | '\u03BE' // ξ
    | '\u03BF' // ο
    | '\u03C0' // π
    | '\u03C1' // ρ
    | '\u03C3' // σ
    | '\u03C4' // τ
    | '\u03C5' // υ
    | '\u03C6' // φ
    | '\u03C7' // χ
    | '\u03C8' // ψ
    | '\u03C9' // ω
    | '\u0391' // Α
    | '\u0392' // Β
    | '\u0393' // Γ
    | '\u0394' // Δ
    | '\u0395' // Ε
    | '\u0396' // Ζ
    | '\u0397' // Η
    | '\u0398' // Θ
    | '\u0399' // Ι
    | '\u039A' // Κ
    | '\u039B' // Λ
    | '\u039C' // Μ
    | '\u039D' // Ν
    | '\u039E' // Ξ
    | '\u039F' // Ο
    | '\u03A0' // Π
    | '\u03A1' // Ρ
    | '\u03A3' // Σ
    | '\u03A4' // Τ
    | '\u03A5' // Υ
    | '\u03A6' // Φ
    | '\u03A7' // Χ
    | '\u03A8' // Ψ
    | '\u03A9' // Ω
;
matrixContent: '[' row (',' row)* ']';
row: '[' expr (',' expr)* ']';

WS: [ \t\r\n]+ -> skip;

