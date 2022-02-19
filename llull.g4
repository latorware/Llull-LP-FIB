grammar llull;

/* regla principal. Al no haver-hi variables globals, el codi estarà dins dels procediments */
initialRule: definicioProc* EOF; 

/* regla que marca l'estructura de la definició d'un procediment */
definicioProc : 'void' VARIABLE LPARENTESI (VARIABLE (COMA VARIABLE)*)? RPARENSTESI LCLAUDATOR interior RCLAUDATOR; 


condicional: 'if' LPARENTESI expr RPARENSTESI LCLAUDATOR interior RCLAUDATOR ('else' LCLAUDATOR interior RCLAUDATOR)?; 
/* Ha de ser whilee i no while ja que while ja existeix a python */
whilee: 'while' LPARENTESI expr RPARENSTESI LCLAUDATOR interior RCLAUDATOR; 
/* Ha de ser forr i no for ja que for ja existeix a python */
forr: 'for' LPARENTESI assignacio PUNTCOMA expr PUNTCOMA assignacio RPARENSTESI LCLAUDATOR interior RCLAUDATOR; 


/* tot el que pot anar a l'interior de un if (i else), while, for, procediment */
interior: (assignacio | llegir | escriure | condicional | whilee | forr | cridaProc | creadorArray | getArray | setArray)*; 


assignacio: VARIABLE ASSIGNAR expr; 

/* És el read() */
llegir: 'read' LPARENTESI VARIABLE RPARENSTESI; 

/* És el write() */
escriure: 'write' LPARENTESI (expr | TEXT) (COMA (expr | TEXT) )* RPARENSTESI; 


/* És el array() */
creadorArray: 'array' LPARENTESI VARIABLE COMA expr RPARENSTESI; 

/* És el get() */
getArray: 'get' LPARENTESI VARIABLE COMA expr RPARENSTESI; 

/* És el set() */
setArray: 'set' LPARENTESI VARIABLE COMA expr COMA expr RPARENSTESI; 


/* regla que defineix com és la crida d'un procediment */
cridaProc: VARIABLE LPARENTESI (expr (COMA expr)*)? RPARENSTESI;


/* qualsevol expressió. Com que les operacions relacionals retornen un enter (0 o 1), llavors podem posar tots els operadors junts */
expr: expr MULT expr #Multiplicacio
     | expr DIV expr #Divisio
     | expr MOD expr #Mod 
     | expr SUMA expr #Suma
     | expr RESTA expr #Resta
     | expr MESQUE expr #MesQue
     | expr MESIGQUE expr #MesIgualQue
     | expr MENYSQUE expr #MenysQue
     | expr MENYSIGQUE expr #MenysIgualQue
     | expr IGUAL expr #Igual
     | expr NIGUAL expr #NoIgual
     | getArray #Get
     | VARIABLE #Variable
     | ENTER #Enter
     | LPARENTESI expr RPARENSTESI #Parentesis; 



/* operadors aritmètics */
SUMA: '+';
RESTA: '-';
MULT: '*'; 
DIV: '/'; 
MOD: '%'; 

/* operadors relacionals */
IGUAL: '=='; 
NIGUAL: '<>'; 
MENYSQUE: '<'; 
MESQUE: '>'; 
MENYSIGQUE: '<='; 
MESIGQUE: '>=';  

ASSIGNAR: '='; 

/* Parèntesis, Claudators */
LPARENTESI: '('; 
RPARENSTESI: ')'; 
LCLAUDATOR: '{'; 
RCLAUDATOR: '}'; 

COMA: ','; 
PUNTCOMA: ';'; 

VARIABLE: [a-zA-Z][a-zA-Z0-9_]*; /* Necessari fer-ho així ja que el nom d'una variable no pot ser un simple número */
ENTER: '-'?[0-9]+; 

/* Fem skip d'una linia que representa un comentari */
COMENTARIS: '#' ~[\r\n]* -> skip;
/* Els espais en TEXT igualment es tractaran, ja que WS fa skip entre tokens, no dins dels tokens */
TEXT: '"' .*? '"'; 
/* No parsejarem salts de línia, tampoc espais i tampoc els \r */
WS: [ \t\r\n]+ -> skip;