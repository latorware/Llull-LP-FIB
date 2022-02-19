# Llull

Aquest projecte és una implementacio del llenguatge de programació Llull. És a dir, un intent de la creació d'un llenguatge el més semblant possible a les escritures de Ramon LLull. 

En aquest [Repositori](https://github.com/jordi-petit/lp-llull-2021) es troba tota la informació sobre el llenguatge Llull. 

## Què hi ha en aquest projecte?

En aquest projecte hi trobem tres principals arxius: 

- El fitxer `llull.g4`, el qual implementa la gramàtica del llenguatge. 

- El fitxer `llull.py`, el qual és el el programa interpret del llenguatge, i que per tant ens sereix per executar fitxers que contenent codi en el llenguatge Llull. (**A dins ja hi ha els visitadors del programa.**)

- El fitxer `beat.py`, el qual conté el programa *pretty-printer* del llenguatge. Aquest programa ens serveix per imprimir per la terminal fitxers en codi Llull d'un manera visual més còmoda i fàcil d'interpretar.(**A dins ja hi ha els visitadors del programa.**)

- Els fitxers que comencen amb `test-*.lull`. Aquests fitxers estan escrits amb codi llull, i són exemples del llenguatge de programació Llull, els quals són útils per provar el funcionament de l'interpret i del *pretty-printer*. 

## Compatibilitat

Tant l'interpret com el beautificador funcionen amb Linux, OSX i Windows, i es requereix com a minim Python 3.6.1. 

Pel que fa al beautificador, es recomana executar aquest programa en les terminals natives tant de Linux, OSX i Windows (classic Windows Terminal en aquest cas), altrament potser no es poden visualitzar tots els colors de forma correcta. 

Per treure-li el màxim suc al beautificador, es recomana que la interfície gràfica de la terminal tingui un fons negre, altrament potser no es poden identificar tots els colors. 

## Instalació

Abans d'executar els programes, primer es necesari: 

- Instal·lar requeriments per a Python: 
    - ```bash
      pip3 install -r requirements.txt
      ```

    - Generar fitxers (lexer, parser i plantilla visitor) a partir de la gramatica: 

        ```bash
        antlr4 -Dlanguage=Python3 -no-listener -visitor llull.g4
        ```

## Com executar l'intèrpret

- Si es desitja començar pel procediment `main()` llavors nomes cal passar com a parametre el nom del fitxer que es vol executar: 
    - ```bash
      python3 llull.py nomdelprograma.llull
      ```

- Si es vol començar per un procediment diferent al `main()`, llavors caldrà especificar aquest procediment, i els paràmetres d'aquest, en cas que n'existeixin de parametres: 
    - ```bash
      python3 llull.py nomdelprograma.llull nomdelprocediment param1 param2 param3 param4 param5 ...
      ```

## Com executar el beautificador

Per executar el *pretty printer* només cal específicar el nom del arxiu que es vol beautificar:

- ```bash
  python3 beat.py programa.llull
  ```

## Informació adicional sobre l'interpret
    
El programa intèrpret interpretarà els arxius escrits en codi Llull seguint les regles del repositori especificat al principi d'aquest README, (és l'enucniat de la practica), no obstant, hi ha una sèrie d'aspectes que cal especificar: 

- Cada cop que es detecti un error d'execució, es farà saltar una excepció que s'imprimirà per la terminal, i l'execució finalitzarà. 

- Pel que fa als condicionals (també whiles i fors), com que en temps de Llull no existia el Bool, s'ha interpretat que tota condició que sigui superior a 0 s'interpreti com a certa, i tota aquella que sigui igual a zero s'interpreti com a falsa. 

- Pel que fa a l'hora d'escriure un programa en codi Llull, no cal seguir cap regla d'espaiats (per exemple, es pot o no escriure espais abans del parentesi `(` de la crida d'una funció, ja que la gramàtica posteriorment eliminarà aquests)

- Tampoc cal seguir cap reglar d'indentació a l'hora d'escriure els programes en codi Llull. 

## Informació adicional sobre el programa beautificador

- En aquest cas, els dos punts de l'apartat anterior es segueixen complint. Independentment de l'espaiat i indentació que s'usi en els programes en codi Llull, el beautificador acabarà imprimint el codi d'una forma còmoda i fàcil d'interpretar. 

- Pel que fa als colors, el beautificador coloritzarà amb diferents colors: 

    - Els noms de les definicions dels procediments (el nom del procediment)

    - Els noms de les crides dels procediments (el nom del procediment)

    - Els enters. 

    - Les paraules: `void`, `while`, `for`, `if`, `else`, `read`, `write`, `array`, `get`, `set`

    - Els textos representats entre *cometes*

## Informació adicional sobre Tests

Els tests que trobem en aquest projecte: 

- [test-HelloWorld.llull](test-HelloWorld.llull)

- [test-MCDeuclides.llull](test-MCDeuclides.llull)

- [test-TaulesNombresPrimers.llull](test-TaulesNombresPrimers.llull)

- [test-TorresDeHanoi.llull](test-TorresDeHanoi.llull)

## Autor

David Latorre
