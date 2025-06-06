grammar Latex;

prog:	stat EOF;

stat: expr;

expr:
     expr '^' expr
    | '√' expr
    | expr '_' expr
    | expr (MUL|DIV) expr
    | expr (ADD|SUB) expr
    | constant
    | NUMBER
    | '(' expr ')'
    | expr '!'
    | '\u03A3' '(' expr ',' expr ',' expr ')'
    | '\u222B' '(' expr ',' expr ',' expr ')'
    | '\u220F' '(' expr ',' expr ')'
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
    | '\u03B1'
    | '\u03B2'
    | '\u03B3'
    | '\u03B4'
    | '\u03B5'
    | '\u03B6'
    | '\u03B7'
    | '\u03B8'
    | '\u03B9'
    | '\u03BA'
    | '\u03BB'
    | '\u03BC'
    | '\u03BD'
    | '\u03BE'
    | '\u03BF'
    | '\u03C0'
    | '\u03C1'
    | '\u03C3'
    | '\u03C4'
    | '\u03C5'
    | '\u03C6'
    | '\u03C7'
    | '\u03C8'
    | '\u03C9'
    | '\u0391'
    | '\u0392'
    | '\u0393'
    | '\u0394'
    | '\u0395'
    | '\u0396'
    | '\u0397'
    | '\u0398'
    | '\u0399'
    | '\u039A'
    | '\u039B'
    | '\u039C'
    | '\u039D'
    | '\u039E'
    | '\u039F'
    | '\u03A0'
    | '\u03A1'
    | '\u03A3'
    | '\u03A4'
    | '\u03A5'
    | '\u03A6'
    | '\u03A7'
    | '\u03A8'
    | '\u03A9'
;
matrixContent: '[' row (',' row)* ']';
row: '[' cell (',' cell)* ']';
cell: expr?;

WS: [ \t\r\n]+ -> skip;

