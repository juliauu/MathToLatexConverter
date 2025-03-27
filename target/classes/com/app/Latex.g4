grammar Latex;

prog:	stat EOF;

stat: expr;


expr: expr ADD expr                         
    | INT                                   
    | expr op=('*'|'/') expr                
    | expr '^' expr                         
    | constant                              
    | '(' expr ')'                          
    | '√' expr                              
    | expr '!'                              
    | 'Σ' '(' expr ',' expr ',' expr ')'    
    | '∫' '(' expr ',' expr ',' expr ')'    
    | '∏' '(' expr ',' expr ')'             
    | '|' expr '|'                          
    | 'frac' '(' expr ',' expr ')'          
    | 'mod' '(' expr ',' expr ')'           
    | 'matrix' '(' matrixContent ')'        
    | func '(' expr ')'                     
    ;

ADD : '+' ;

func: 'sin' | 'cos' | 'tan' | 'sinh' | 'cosh' | 'tanh' | 'exp' | 'gcd' | 'lfloor' | 'lceil';
constant: 'π' | 'e' | 'Ω';
matrixContent: '[' row (',' row)* ']';
row: '[' expr (',' expr)* ']';

INT     : [0-9]+ ;
WS: [ \t\r\n]+ -> skip;  

