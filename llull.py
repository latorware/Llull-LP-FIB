import sys
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
if __name__ is not None and "." in __name__:
    from .llullVisitor import llullVisitor
else:
    from llullVisitor import llullVisitor


class Visitor(llullVisitor):
    def __init__(self, procedimentinicial, parametres):
        self.procedimentinicial = procedimentinicial
        self.parametres = parametres

        # Aquí es guardarà l'estructura dels procediments que han sigut
        # definits.
        # Les claus dels diccionaris representen el nom del procediment
        # els valors seran llistes de dos items, on el primer item fa
        # referència al node que conté l'interior del codi
        # del procediment, i el segon item es una llista que fa referència
        # als noms dels paràmetres.
        self.totsProcediments = {}

        # Aquí es guardaran les variables locals d'un procediment quan
        # s'executi
        # Cada element de la llista serà un diccionari on es guardaran
        # les variables locals d'un procediment que s'està executant
        # D'aquesta manera, si per exemple tenim un procediment el qual
        # no ha sigut cridat per ningun procediment,
        # i aquest procediment crida a un procediment, llavors la llista
        # contindrà dos elements, dos diccionaris, un per cada un
        # dels procediments que estan sent executats, i el diccionari que
        # representa el procediment cridat tindrà lindex més gran en la
        # llista
        self.variables = []

    # S'executa al principi. Conté tots els procediments
    def visitInitialRule(self, ctx):
        # print('Passant per initialRule')
        # abans d'executar el procediment des del qual es comença, primer
        # cal establir la definició de tots els procediments
        for procediment in list(ctx.getChildren()):
            # sitera sobre la creacio dels procediments
            self.visit(procediment)
        # finalment ja podem cridar al procediment que es vol a l'inici
        self.executaProcediment(self.procedimentinicial, self.parametres)

    def visitDefinicioProc(self, ctx):
        # print('Passant per visitDefinicio')
        # primer comprovem que la definició del procediment no s'hagi fet
        if ctx.VARIABLE(0).getText() in self.totsProcediments:
            raise Exception('El procediment amb nom ' +
                            ctx.VARIABLE(0).getText() +
                            'es defineix mes duna vegada')
        else:
            # no s'ha fet, per tant, continuem
            # iterem sobre els parametres del procediment, i comprovem que
            # tampoc es dupliquin
            parametresProcediment = []
            # els parametres comencen en el quart fill
            z = 3
            while ctx.getChild(z).getText() != ')':
                if ctx.getChild(z).getText() != ',':
                    # ens trobem amb un fill que representa un parametre
                    # comprovem que el parametre no estigui duplicat
                    if ctx.getChild(z).getText() in parametresProcediment:
                        raise Exception('a la definició del procediment ' +
                                        ctx.VARIABLE(0).getText() +
                                        'hi ha multiples parametres amb el \
                                        mateix nom')
                    else:
                        # no es duplicat, llavors continuem
                        parametresProcediment.append(ctx.getChild(z).getText())
                z += 1
            # si arribem fins aquí, tot està correcte, i ja podem afegir el
            # procediment
            llistaAAfegir = [ctx.interior(), parametresProcediment]
            self.totsProcediments[ctx.VARIABLE(0).getText()] = llistaAAfegir

    def visitCridaProc(self, ctx):
        # print('Passant per visitCridaProc')
        # valors dels parametres
        valorsparamsvalues = []
        z = 2
        while ctx.getChild(z).getText() != ')':
            if ctx.getChild(z).getText() != ',':
                # ens trobem amb un fill que representa un parametre
                valorsparamsvalues.append(self.visit(ctx.getChild(z)))
            z += 1
        # ja hem agafat els parametres. Ara cridem a executaProcediment amb el
        # corresponent nom del procediment
        self.executaProcediment(ctx.VARIABLE().getText(), valorsparamsvalues)

    # executaProcediment es fa per separat de visitCridaProc perque
    # visitInitialRule també executa procediment
    # parametresProcediment és una llista on cada item és el valor d'un
    # parametre. Els valors dels parametres estan ordenats segons
    # la definició del procediment que es tracta
    def executaProcediment(self, nomProcediment, parametresProcediment):
        # print('Passant per executaProcediment')
        if nomProcediment not in self.totsProcediments:
            raise Exception('El procediment amb el nom ' + nomProcediment +
                            'no està definit')
        else:
            if len(self.totsProcediments[nomProcediment][1]) \
                 != len(parametresProcediment):
                raise Exception('No coincideixen el nombre de paràmetres que\
                    shan dintroduir a la crida de el procediment ' +
                                nomProcediment)
            else:
                variablesAAfegir = {}
                for nomParametre, valorParametre in \
                        zip(self.totsProcediments[nomProcediment][1],
                            parametresProcediment):
                    variablesAAfegir[nomParametre] = valorParametre
                self.variables.append(variablesAAfegir)
                self.visit(self.totsProcediments[nomProcediment][0])
                self.variables.pop()

    # if else
    def visitCondicional(self, ctx):
        # print('Passant per visitCondicional')
        # si la condicio es superior a 0, llavors no pasem a el else
        if self.visit(ctx.expr()) > 0:
            # executem el codi de linterior de if
            self.visit(ctx.interior(0))
        else:
            if len(list(ctx.getChildren())) > 7:
                # existeix else, per tant executem el codi daqui
                self.visit(ctx.interior(1))

    def visitWhilee(self, ctx):
        # print('Passant per visitWhilee')
        # mentre es compleixi la condicio, executarem linterior del codi
        while self.visit(ctx.expr()) > 0:
            # executem interior codi
            self.visit(ctx.interior())

    def visitForr(self, ctx):
        # print('Passant per visitForr')
        # mentre es compleixi la condicio, executarem linterior del codi
        # executem la primera assignacio de totes
        self.visit(ctx.assignacio(0))
        # iterem sempre que es compleixi condicio
        while self.visit(ctx.expr()) > 0:
            # executem interior
            self.visit(ctx.interior())
            # actualitzem la variable
            self.visit(ctx.assignacio(1))

    def visitInterior(self, ctx):
        # print('Passant per visitInterior')
        # executem en ordre les instruccions de el interior de una estructura
        # de codi
        for instruccioactual in list(ctx.getChildren()):
            # es fa amb ordre
            self.visit(instruccioactual)

    def visitAssignacio(self, ctx):
        # print('Passant per visitAssignacio')
        # modifiquem o creem la variable en el diccionari del procediment que
        # porta menys temps executanse
        # [-1] es lultim element
        self.variables[-1][ctx.VARIABLE().getText()] = self.visit(ctx.expr())

    def visitLlegir(self, ctx):
        # print('Passant per visitLlegir')
        # modifiquem o creem la variable en el diccionari del procediment que
        # porta menys temps executanse
        # [-1] es lultim element
        numeroaafegir = input()
        if numeroaafegir.isdigit():
            self.variables[-1][ctx.VARIABLE().getText()] = int(numeroaafegir)
        else:
            raise Exception('el input llegit no es pot traduir en un nombre\
                 enter')

    def visitEscriure(self, ctx):
        # print('Passant per visitEscriure')
        z = 2
        first = True
        # iterem sobre tots aquells fills fins el parentesi dret.
        while ctx.getChild(z).getText() != ')':
            if ctx.getChild(z).getText() != ',':
                # llavors ens trobem davant de un fill que representa una cosa
                # que imprimirem
                if (first):
                    first = False
                    # comprovar si es TEXT o expr
                    if (ctx.getChild(z).getText().startswith('"')):
                        # si es TEXT
                        text = ctx.getChild(z).getText()
                        text = text.replace('"', '')
                        print(text, end=' ')
                    else:
                        # si es expr
                        print(self.visit(ctx.getChild(z)), end=' ')
                else:
                    # comprovar si es TEXT o expr
                    if (ctx.getChild(z).getText().startswith('"')):
                        # si es TEXT
                        text = ctx.getChild(z).getText()
                        text = text.replace('"', '')
                        print(' ' + text, end=' ')
                    else:
                        # si es expr
                        print(' ' + str(self.visit(ctx.getChild(z))), end=' ')
            z += 1
        if not first:
            # vol dir que almenys s'ha imprimit alguna cosa en la instruccio
            print()  # perrr acabar descriure a la linia que sesta escrivint

    def visitCreadorArray(self, ctx):
        # print('Passant per visitCreadorArray')
        # modifiquem o creem la variable en el diccionari del procediment que
        # porta menys temps executanse
        # [-1] es lultim element
        self.variables[-1][ctx.VARIABLE().getText()] = [0]\
             * self.visit(ctx.expr())

    def visitGetArray(self, ctx):
        # print('Passant per visitGetArray')
        # consultem la variable en el diccionari del procediment que porta
        # menys temps executanse
        # [-1] es lultim element
        # primer comprovem que lindex existeixi
        if len(self.variables[-1][ctx.VARIABLE().getText()])\
             <= self.visit(ctx.expr()):
            raise Exception('acces a un index inexistent de la taula ' +
                            ctx.VARIABLE().getText() + ' Lindex que es vol\
                            consultar es ' +
                            self.visit(ctx.expr()) + ' pero la taula\
                                 te menys tamany que lindex')
        else:
            # lindex si que existeix
            nomV = ctx.VARIABLE().getText()
            return self.variables[-1][nomV][self.visit(ctx.expr())]

    def visitSetArray(self, ctx):
        # print('Passant per visitSetArray')
        # modifiquem la variable en el diccionari del procediment que porta
        # menys temps executanse
        # [-1] es lultim element
        # primer comprovem que lindex existeixi
        if len(self.variables[-1][ctx.VARIABLE().getText()])\
             <= self.visit(ctx.expr(0)):
            raise Exception('index inexistent de la taula ' +
                            ctx.VARIABLE().getText() + ' Lindex que es vol\
                            consultar\
                            es ' + self.visit(ctx.expr(0)) + ' pero la taula\
                            nomes te menys tamany')

        else:
            # lindex si que existeix
            nomV = ctx.VARIABLE().getText()
            expr0 = self.visit(ctx.expr(0))
            expr1 = self.visit(ctx.expr(1))
            self.variables[-1][nomV][expr0] = expr1

    # *
    def visitMultiplicacio(self, ctx):
        # print('Passant per visitMultiplicacio')
        return int(self.visit(ctx.expr(0)) * self.visit(ctx.expr(1)))

    # /
    def visitDivisio(self, ctx):
        # print('Passant per visitDivisio')
        # primer comprovem que el segon valor no sigui un 0
        if self.visit(ctx.expr(1)) == 0:
            raise Exception('No es pot dividir entre zero')
        else:
            return int(self.visit(ctx.expr(0)) / self.visit(ctx.expr(1)))

    # %
    def visitMod(self, ctx):
        # print('Passant per visitMod')
        return int(self.visit(ctx.expr(0)) % self.visit(ctx.expr(1)))

    # +
    def visitSuma(self, ctx):
        # print('Passant per visitSuma')
        return int(self.visit(ctx.expr(0)) + self.visit(ctx.expr(1)))

    # -
    def visitResta(self, ctx):
        # print('Passant per visitResta')
        return int(self.visit(ctx.expr(0)) - self.visit(ctx.expr(1)))

    # >
    def visitMesQue(self, ctx):
        # print('Passant per visitMesQue')
        # si MesQue retorna 1
        # sino retorna 0
        if self.visit(ctx.expr(0)) > self.visit(ctx.expr(1)):
            return 1
        else:
            return 0

    # >=
    def visitMesIgualQue(self, ctx):
        # print('Passant per visitMesIgualQue')
        # si MesIgualQue retorna 1
        # sino retorna 0
        if self.visit(ctx.expr(0)) >= self.visit(ctx.expr(1)):
            return 1
        else:
            return 0

    # <
    def visitMenysQue(self, ctx):
        # print('Passant per visitMenysQue')
        # si MenysQue retorna 1
        # sino retorna 0
        if self.visit(ctx.expr(0)) < self.visit(ctx.expr(1)):
            return 1
        else:
            return 0

    # <=
    def visitMenysIgualQue(self, ctx):
        # print('Passant per visitMenysIgualQue')
        # si MenysIgualQue retorna 1
        # sino retorna 0
        if self.visit(ctx.expr(0)) <= self.visit(ctx.expr(1)):
            return 1
        else:
            return 0

    # ==
    def visitIgual(self, ctx):
        # print('Passant per visitIgual')
        # si Igual retorna 1
        # sino retorna 0
        if self.visit(ctx.expr(0)) == self.visit(ctx.expr(1)):
            return 1
        else:
            return 0

    # <>
    def visitNoIgual(self, ctx):
        # print('Passant per visitNoIgual')
        # si NoIgual retorna 1
        # sino retorna 0
        if self.visit(ctx.expr(0)) != self.visit(ctx.expr(1)):
            return 1
        else:
            return 0

    # representa nombres enters, taules
    def visitVariable(self, ctx):
        # print('Passant per visitVariable')
        # print('      Nom variable: ' + ctx.VARIABLE().getText())
        # mirem si la variable es troba en el diccionari de el procediment que
        # porta menys temps en execucio
        # [-1] es lultim element
        if ctx.VARIABLE().getText() in self.variables[-1]:
            # la variable ja es troba, nomes lem de retornar
            return self.variables[-1][ctx.VARIABLE().getText()]
        else:
            # la variable no es troba, per tant la posem al diccionari com a
            # un valor 0
            self.variables[-1][ctx.VARIABLE().getText()] = 0
            return self.variables[-1][ctx.VARIABLE().getText()]

    # es un nombre enter
    def visitEnter(self, ctx):
        # print('Passant per visitEnter')
        # print('      Valor nombre enter: ' + ctx.ENTER().getText())
        return int(ctx.ENTER().getText())

    def visitParentesis(self, ctx):
        # print('Passant per visitParentesis')
        return self.visit(ctx.expr())

    def visitGet(self, ctx):
        # print('Passant per visitGet')
        return self.visit(ctx.getArray())


if __name__ == '__main__':
    if len(sys.argv) < 2:
        raise Exception('parametres insuficients')

    input_stream = FileStream(sys.argv[1], 'utf-8')
    lexer = llullLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = llullParser(token_stream)
    tree = parser.initialRule()
    # print(tree.toStringTree(recog=parser))

    if len(sys.argv) == 2:
        visitor = Visitor('main', [])
    elif len(sys.argv) == 3:
        visitor = Visitor(sys.argv[2], [])
    elif len(sys.argv) > 3:
        parametres = []
        for paramactual in sys.argv[3:]:
            if paramactual.isdigit():
                parametres.append(int(paramactual))
            else:
                raise Exception('hi ha parametres que no són nombres enters')
        visitor = Visitor(sys.argv[2], parametres)

    try:
        visitor.visit(tree)
    except Exception as error:
        print('Error:  ' + str(error))
