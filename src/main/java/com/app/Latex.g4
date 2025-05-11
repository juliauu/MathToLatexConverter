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
constant: '\u03C0' | 'e' | '\u03A9'; //constant: 'π' | 'e' | 'Ω';
matrixContent: '[' row (',' row)* ']';
row: '[' expr (',' expr)* ']';

WS: [ \t\r\n]+ -> skip;

