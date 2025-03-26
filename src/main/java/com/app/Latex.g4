grammar Latex;

prog:	stat EOF;

stat: expr;


expr: expr ADD expr
    | INT
    ;

ADD : '+' ;

INT     : [0-9]+ ;


