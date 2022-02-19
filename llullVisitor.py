# Generated from llull.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
else:
    from llullParser import llullParser

# This class defines a complete generic visitor for a parse tree produced by llullParser.

class llullVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by llullParser#initialRule.
    def visitInitialRule(self, ctx:llullParser.InitialRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#definicioProc.
    def visitDefinicioProc(self, ctx:llullParser.DefinicioProcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#condicional.
    def visitCondicional(self, ctx:llullParser.CondicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#whilee.
    def visitWhilee(self, ctx:llullParser.WhileeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#forr.
    def visitForr(self, ctx:llullParser.ForrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#interior.
    def visitInterior(self, ctx:llullParser.InteriorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#assignacio.
    def visitAssignacio(self, ctx:llullParser.AssignacioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#llegir.
    def visitLlegir(self, ctx:llullParser.LlegirContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#escriure.
    def visitEscriure(self, ctx:llullParser.EscriureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#creadorArray.
    def visitCreadorArray(self, ctx:llullParser.CreadorArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#getArray.
    def visitGetArray(self, ctx:llullParser.GetArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#setArray.
    def visitSetArray(self, ctx:llullParser.SetArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#cridaProc.
    def visitCridaProc(self, ctx:llullParser.CridaProcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Variable.
    def visitVariable(self, ctx:llullParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Mod.
    def visitMod(self, ctx:llullParser.ModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#NoIgual.
    def visitNoIgual(self, ctx:llullParser.NoIgualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Divisio.
    def visitDivisio(self, ctx:llullParser.DivisioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Parentesis.
    def visitParentesis(self, ctx:llullParser.ParentesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Multiplicacio.
    def visitMultiplicacio(self, ctx:llullParser.MultiplicacioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#MesQue.
    def visitMesQue(self, ctx:llullParser.MesQueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#MenysIgualQue.
    def visitMenysIgualQue(self, ctx:llullParser.MenysIgualQueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Suma.
    def visitSuma(self, ctx:llullParser.SumaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#MenysQue.
    def visitMenysQue(self, ctx:llullParser.MenysQueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#MesIgualQue.
    def visitMesIgualQue(self, ctx:llullParser.MesIgualQueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Get.
    def visitGet(self, ctx:llullParser.GetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Igual.
    def visitIgual(self, ctx:llullParser.IgualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Enter.
    def visitEnter(self, ctx:llullParser.EnterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#Resta.
    def visitResta(self, ctx:llullParser.RestaContext):
        return self.visitChildren(ctx)



del llullParser