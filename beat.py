import sys

from antlr4.tree.Tree import Tree
from rich import print
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
if __name__ is not None and "." in __name__:
    from .llullVisitor import llullVisitor
else:
    from llullVisitor import llullVisitor


class Visitor(llullVisitor):
    def __init__(self):
        # no cal fer cap operacio prinicpal
        # nomes em de guardar una variable que guardi la identacio que cal
        # daquesta manera, les instruccions que es trobin dins d'una
        # estructura (per exemple, if, procediment) simprimiran a dins mes
        # a la dreta
        # farem que la indentacio sigui per nivells separats per 4 espais
        self.identation = 0

        self.AssAcabaEnFinalDeLine = True

    # S'executa al principi. Conté totes les definicions dels procediments, i
    # per tant té tot el codi
    def visitInitialRule(self, ctx: llullParser.InitialRuleContext):
        # iterem sobre els procediments ordenadament per imprimirlos
        for procediment in list(ctx.getChildren()):
            # visitem el procediment per imprimirlo sencer
            self.visit(procediment)

    # imprimeix tota l'estructura d'un procediment, és a dir, la seva
    # declaració i codi interior
    def visitDefinicioProc(self, ctx):
        # imprimim la linia principal
        # void
        print('[color(160)] void ', end='')
        # nom de la funcio
        print('[color(170)]' + ctx.VARIABLE(0).getText(), end='')
        print('(', end='')
        # imprimim els noms dels parametres, si hi ha algun
        z = 3
        while ctx.getChild(z).getText() != ')':
            if ctx.getChild(z).getText() == ',':
                print(', ', end='')
            else:
                print(ctx.getChild(z).getText(), end='')
            z += 1
        print(') {')
        # ara imprimim linterior de la funcio
        self.identation += 4
        self.visit(ctx.interior())
        self.identation -= 4
        print('}')

    # imprimeix el codi que fa referencia a la crida duna funcio
    def visitCridaProc(self, ctx):
        # nom de la funcio
        identacio = ' ' * self.identation
        print('[color(69)]' + identacio + ctx.VARIABLE().getText(), end='')
        print('(', end='')
        # imprimim els noms dels parametres, si hi ha algun
        z = 2
        while ctx.getChild(z).getText() != ')':
            if ctx.getChild(z).getText() == ',':
                print(', ', end='')
            else:
                self.visit(ctx.getChild(z))
            z += 1
        print(')')

    # imprimeix el codi que fa referencia a lestructura if else, i linterior
    # d'aquest
    def visitCondicional(self, ctx):
        # paraula 'if'
        identacio = ' ' * self.identation
        print('[color(160)]' + identacio + 'if ', end='')
        print('(', end='')
        # imprimir expresio que es la condicio
        self.visit(ctx.expr())
        print(') {')
        # interior
        self.identation += 4
        self.visit(ctx.interior(0))
        self.identation -= 4
        print(identacio + '} ', end='')
        # fem el mateix amb else si hi ha
        if len(list(ctx.getChildren())) > 7:
            print('[color(160)]' + 'else {')
            self.identation += 4
            self.visit(ctx.interior(1))
            self.identation -= 4
            print(identacio + '} ')
        else:
            print()

    # imprimeix el codi que fa referencia a lestructura while, i linterior
    # d'aquest
    def visitWhilee(self, ctx):
        # paraula 'while'
        identacio = ' ' * self.identation
        print('[color(160)]' + identacio + 'while ', end='')
        print('(', end='')
        # imprimir expresio que es la condicio
        self.visit(ctx.expr())
        print(') {')
        # interior
        self.identation += 4
        self.visit(ctx.interior())
        self.identation -= 4
        print(identacio + '} ')

    # imprimeix el codi que fa referencia a lestructura for, i linterior
    # d'aquest
    def visitForr(self, ctx):
        # paraula 'for'
        identacio = ' ' * self.identation
        print('[color(160)]' + identacio + 'for ', end='')
        print('(', end='')
        # imprimir la primera assignacio
        identationReal = self.identation
        self.identation = 0
        self.AssAcabaEnFinalDeLine = False
        self.visit(ctx.assignacio(0))
        self.AssAcabaEnFinalDeLine = True
        # imprimir expresio de la condicio de al for
        print('; ', end='')
        self.visit(ctx.expr())
        print('; ', end='')
        # imprimir la altra assignacio
        self.AssAcabaEnFinalDeLine = False
        self.visit(ctx.assignacio(1))
        self.AssAcabaEnFinalDeLine = True
        self.identation = identationReal
        print(') {')
        # ell interior
        self.identation += 4
        self.visit(ctx.interior())
        self.identation -= 4
        print(identacio + '} ')

    # imprimeix tot el que va dins d'un else if, while, for, procediment
    def visitInterior(self, ctx):
        # iterem sobre cada instruccio, de forma ordenada
        for instruccioactual in list(ctx.getChildren()):

            # imprimim la instruccio que hi ha
            self.visit(instruccioactual)

    # imprimeix assignacio
    def visitAssignacio(self, ctx):
        # part esquerra
        identacio = ' ' * self.identation
        print(identacio + ctx.VARIABLE().getText() + ' ', end='')
        # igual
        print('= ', end='')
        # part dreta
        self.visit(ctx.expr())
        if self.AssAcabaEnFinalDeLine:
            print()

    # imprimeix el tros de codi que es read
    def visitLlegir(self, ctx):
        # paraula read
        identacio = ' ' * self.identation
        print('[color(69)]' + identacio + 'read', end='')
        print('(', end='')
        # la variable
        print(ctx.VARIABLE().getText(), end='')
        print(')')

    # imprimeix el tros de codi write
    def visitEscriure(self, ctx):
        # la paraula write
        identacio = ' ' * self.identation
        print('[color(69)]' + identacio + 'write', end='')
        print('(', end='')
        # imprimir parametres
        z = 2
        while ctx.getChild(z).getText() != ')':
            if ctx.getChild(z).getText() == ',':
                # imprimim una coma
                print(', ', end='')
            else:
                # comprovar si es TEXT o expr
                if (ctx.getChild(z).getText().startswith('"')):
                    # si es TEXT
                    text = ctx.getChild(z).getText()
                    # imprimir el text
                    print('[color(20)]' + text, end='')
                else:
                    # si es expr
                    # imprimir expr
                    self.visit(ctx.getChild(z))
            z += 1
        print(')')

    # imprimeix el tros de codi array
    def visitCreadorArray(self, ctx):
        # la paraula array
        identacio = ' ' * self.identation
        print('[color(69)]' + identacio + 'array', end='')
        print('(', end='')
        # imprimir variable
        print(ctx.VARIABLE().getText(), end='')
        print(', ', end='')
        # imprimir expr
        self.visit(ctx.expr())
        print(')')

    # imprimeix el tros de codi get
    def visitGetArray(self, ctx):
        # la paraula get
        print('[color(69)]' + 'get', end='')
        print('(', end='')
        # imprimir variable
        print(ctx.VARIABLE().getText(), end='')
        print(', ', end='')
        # imprimir la expr
        self.visit(ctx.expr())
        print(')', end='')

    # imprimeix el tros de codi set
    def visitSetArray(self, ctx):
        # la paraula set
        identacio = ' ' * self.identation
        print('[color(69)]' + identacio + 'set', end='')
        print('(', end='')
        # imprimir variable
        print(ctx.VARIABLE().getText(), end='')
        print(', ', end='')
        # imprimir  expr
        self.visit(ctx.expr(0))
        print(', ', end='')
        # imprimir  expr
        self.visit(ctx.expr(1))
        print(')')

    # imprimeix el tros de codi operacio de multiplicar
    def visitMultiplicacio(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' * ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de divisio
    def visitDivisio(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' / ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de mod
    def visitMod(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' % ', end='')
        # imprimir expr

    # imprimeix el tros de codi operacio de suma
    def visitSuma(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' + ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de resta
    def visitResta(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' - ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de MESQUE
    def visitMesQue(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' > ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de MESIGQUE
    def visitMesIgualQue(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' >= ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de MENYSQUE
    def visitMenysQue(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' < ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de MENYSIGQUE
    def visitMenysIgualQue(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' <= ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de IGUAL
    def visitIgual(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' == ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi operacio de NIGUAL
    def visitNoIgual(self, ctx):
        # imprimir expr
        self.visit(ctx.expr(0))
        # imprimir signe
        print(' <> ', end='')
        # imprimir expr
        self.visit(ctx.expr(1))

    # imprimeix el tros de codi get
    def visitGet(self, ctx):
        # fa exactament el mateix que getarray
        self.visit(ctx.getArray())

    # imprimeix variables
    def visitVariable(self, ctx):
        print(ctx.VARIABLE().getText(), end='')

    # imprimeix els nombres
    def visitEnter(self, ctx):
        print('[color(71)]' + ctx.ENTER().getText(), end='')

    # imprimeix la expresio que hi ha entre pare...
    def visitParentesis(self, ctx):
        # primer parentesis
        print('(', end='')
        # imprimir la expr
        self.visit(ctx.expr())
        # imprimir el segon parentesis
        print(')', end='')


if __name__ == '__main__':
    if len(sys.argv) < 2:
        raise Exception('parametres insuficients')

    input_stream = FileStream(sys.argv[1], 'utf-8')
    lexer = llullLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = llullParser(token_stream)
    tree = parser.initialRule()
    # print(tree.toStringTree(recog=parser))

    visitor = Visitor()

    try:
        visitor.visit(tree)
    except Exception as error:
        print('Error:  ' + str(error))
