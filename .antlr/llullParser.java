// Generated from c:\Users\lator\Documents\GitHub\Practica-Python-LP(no esta encara a github)\llull.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class llullParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SUMA=11, RESTA=12, MULT=13, DIV=14, MOD=15, IGUAL=16, NIGUAL=17, 
		MENYSQUE=18, MESQUE=19, MENYSIGQUE=20, MESIGQUE=21, ASSIGNAR=22, LPARENTESI=23, 
		RPARENSTESI=24, LCLAUDATOR=25, RCLAUDATOR=26, COMA=27, PUNTCOMA=28, VARIABLE=29, 
		ENTER=30, COMENTARIS=31, TEXT=32, WS=33;
	public static final int
		RULE_initialRule = 0, RULE_definicioProc = 1, RULE_condicional = 2, RULE_whilee = 3, 
		RULE_forr = 4, RULE_interior = 5, RULE_assignacio = 6, RULE_llegir = 7, 
		RULE_escriure = 8, RULE_creadorArray = 9, RULE_getArray = 10, RULE_setArray = 11, 
		RULE_cridaProc = 12, RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"initialRule", "definicioProc", "condicional", "whilee", "forr", "interior", 
			"assignacio", "llegir", "escriure", "creadorArray", "getArray", "setArray", 
			"cridaProc", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'if'", "'else'", "'while'", "'for'", "'read'", "'write'", 
			"'array'", "'get'", "'set'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
			"'<>'", "'<'", "'>'", "'<='", "'>='", "'='", "'('", "')'", "'{'", "'}'", 
			"','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SUMA", 
			"RESTA", "MULT", "DIV", "MOD", "IGUAL", "NIGUAL", "MENYSQUE", "MESQUE", 
			"MENYSIGQUE", "MESIGQUE", "ASSIGNAR", "LPARENTESI", "RPARENSTESI", "LCLAUDATOR", 
			"RCLAUDATOR", "COMA", "PUNTCOMA", "VARIABLE", "ENTER", "COMENTARIS", 
			"TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "llull.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public llullParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitialRuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(llullParser.EOF, 0); }
		public List<DefinicioProcContext> definicioProc() {
			return getRuleContexts(DefinicioProcContext.class);
		}
		public DefinicioProcContext definicioProc(int i) {
			return getRuleContext(DefinicioProcContext.class,i);
		}
		public InitialRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialRule; }
	}

	public final InitialRuleContext initialRule() throws RecognitionException {
		InitialRuleContext _localctx = new InitialRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_initialRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(28);
				definicioProc();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicioProcContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(llullParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(llullParser.VARIABLE, i);
		}
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public TerminalNode LCLAUDATOR() { return getToken(llullParser.LCLAUDATOR, 0); }
		public InteriorContext interior() {
			return getRuleContext(InteriorContext.class,0);
		}
		public TerminalNode RCLAUDATOR() { return getToken(llullParser.RCLAUDATOR, 0); }
		public List<TerminalNode> COMA() { return getTokens(llullParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(llullParser.COMA, i);
		}
		public DefinicioProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicioProc; }
	}

	public final DefinicioProcContext definicioProc() throws RecognitionException {
		DefinicioProcContext _localctx = new DefinicioProcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicioProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(VARIABLE);
			setState(38);
			match(LPARENTESI);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(39);
				match(VARIABLE);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(40);
					match(COMA);
					setState(41);
					match(VARIABLE);
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(49);
			match(RPARENSTESI);
			setState(50);
			match(LCLAUDATOR);
			setState(51);
			interior();
			setState(52);
			match(RCLAUDATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public List<TerminalNode> LCLAUDATOR() { return getTokens(llullParser.LCLAUDATOR); }
		public TerminalNode LCLAUDATOR(int i) {
			return getToken(llullParser.LCLAUDATOR, i);
		}
		public List<InteriorContext> interior() {
			return getRuleContexts(InteriorContext.class);
		}
		public InteriorContext interior(int i) {
			return getRuleContext(InteriorContext.class,i);
		}
		public List<TerminalNode> RCLAUDATOR() { return getTokens(llullParser.RCLAUDATOR); }
		public TerminalNode RCLAUDATOR(int i) {
			return getToken(llullParser.RCLAUDATOR, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
			setState(55);
			match(LPARENTESI);
			setState(56);
			expr(0);
			setState(57);
			match(RPARENSTESI);
			setState(58);
			match(LCLAUDATOR);
			setState(59);
			interior();
			setState(60);
			match(RCLAUDATOR);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(61);
				match(T__2);
				setState(62);
				match(LCLAUDATOR);
				setState(63);
				interior();
				setState(64);
				match(RCLAUDATOR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileeContext extends ParserRuleContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public TerminalNode LCLAUDATOR() { return getToken(llullParser.LCLAUDATOR, 0); }
		public InteriorContext interior() {
			return getRuleContext(InteriorContext.class,0);
		}
		public TerminalNode RCLAUDATOR() { return getToken(llullParser.RCLAUDATOR, 0); }
		public WhileeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilee; }
	}

	public final WhileeContext whilee() throws RecognitionException {
		WhileeContext _localctx = new WhileeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whilee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__3);
			setState(69);
			match(LPARENTESI);
			setState(70);
			expr(0);
			setState(71);
			match(RPARENSTESI);
			setState(72);
			match(LCLAUDATOR);
			setState(73);
			interior();
			setState(74);
			match(RCLAUDATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrContext extends ParserRuleContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public List<AssignacioContext> assignacio() {
			return getRuleContexts(AssignacioContext.class);
		}
		public AssignacioContext assignacio(int i) {
			return getRuleContext(AssignacioContext.class,i);
		}
		public List<TerminalNode> PUNTCOMA() { return getTokens(llullParser.PUNTCOMA); }
		public TerminalNode PUNTCOMA(int i) {
			return getToken(llullParser.PUNTCOMA, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public TerminalNode LCLAUDATOR() { return getToken(llullParser.LCLAUDATOR, 0); }
		public InteriorContext interior() {
			return getRuleContext(InteriorContext.class,0);
		}
		public TerminalNode RCLAUDATOR() { return getToken(llullParser.RCLAUDATOR, 0); }
		public ForrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forr; }
	}

	public final ForrContext forr() throws RecognitionException {
		ForrContext _localctx = new ForrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__4);
			setState(77);
			match(LPARENTESI);
			setState(78);
			assignacio();
			setState(79);
			match(PUNTCOMA);
			setState(80);
			expr(0);
			setState(81);
			match(PUNTCOMA);
			setState(82);
			assignacio();
			setState(83);
			match(RPARENSTESI);
			setState(84);
			match(LCLAUDATOR);
			setState(85);
			interior();
			setState(86);
			match(RCLAUDATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InteriorContext extends ParserRuleContext {
		public List<AssignacioContext> assignacio() {
			return getRuleContexts(AssignacioContext.class);
		}
		public AssignacioContext assignacio(int i) {
			return getRuleContext(AssignacioContext.class,i);
		}
		public List<LlegirContext> llegir() {
			return getRuleContexts(LlegirContext.class);
		}
		public LlegirContext llegir(int i) {
			return getRuleContext(LlegirContext.class,i);
		}
		public List<EscriureContext> escriure() {
			return getRuleContexts(EscriureContext.class);
		}
		public EscriureContext escriure(int i) {
			return getRuleContext(EscriureContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<WhileeContext> whilee() {
			return getRuleContexts(WhileeContext.class);
		}
		public WhileeContext whilee(int i) {
			return getRuleContext(WhileeContext.class,i);
		}
		public List<ForrContext> forr() {
			return getRuleContexts(ForrContext.class);
		}
		public ForrContext forr(int i) {
			return getRuleContext(ForrContext.class,i);
		}
		public List<CridaProcContext> cridaProc() {
			return getRuleContexts(CridaProcContext.class);
		}
		public CridaProcContext cridaProc(int i) {
			return getRuleContext(CridaProcContext.class,i);
		}
		public List<CreadorArrayContext> creadorArray() {
			return getRuleContexts(CreadorArrayContext.class);
		}
		public CreadorArrayContext creadorArray(int i) {
			return getRuleContext(CreadorArrayContext.class,i);
		}
		public List<GetArrayContext> getArray() {
			return getRuleContexts(GetArrayContext.class);
		}
		public GetArrayContext getArray(int i) {
			return getRuleContext(GetArrayContext.class,i);
		}
		public List<SetArrayContext> setArray() {
			return getRuleContexts(SetArrayContext.class);
		}
		public SetArrayContext setArray(int i) {
			return getRuleContext(SetArrayContext.class,i);
		}
		public InteriorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interior; }
	}

	public final InteriorContext interior() throws RecognitionException {
		InteriorContext _localctx = new InteriorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << VARIABLE))) != 0)) {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(88);
					assignacio();
					}
					break;
				case 2:
					{
					setState(89);
					llegir();
					}
					break;
				case 3:
					{
					setState(90);
					escriure();
					}
					break;
				case 4:
					{
					setState(91);
					condicional();
					}
					break;
				case 5:
					{
					setState(92);
					whilee();
					}
					break;
				case 6:
					{
					setState(93);
					forr();
					}
					break;
				case 7:
					{
					setState(94);
					cridaProc();
					}
					break;
				case 8:
					{
					setState(95);
					creadorArray();
					}
					break;
				case 9:
					{
					setState(96);
					getArray();
					}
					break;
				case 10:
					{
					setState(97);
					setArray();
					}
					break;
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignacioContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(llullParser.VARIABLE, 0); }
		public TerminalNode ASSIGNAR() { return getToken(llullParser.ASSIGNAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignacio; }
	}

	public final AssignacioContext assignacio() throws RecognitionException {
		AssignacioContext _localctx = new AssignacioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(VARIABLE);
			setState(104);
			match(ASSIGNAR);
			setState(105);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlegirContext extends ParserRuleContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public TerminalNode VARIABLE() { return getToken(llullParser.VARIABLE, 0); }
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public LlegirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llegir; }
	}

	public final LlegirContext llegir() throws RecognitionException {
		LlegirContext _localctx = new LlegirContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_llegir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__5);
			setState(108);
			match(LPARENTESI);
			setState(109);
			match(VARIABLE);
			setState(110);
			match(RPARENSTESI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscriureContext extends ParserRuleContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(llullParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(llullParser.TEXT, i);
		}
		public List<TerminalNode> COMA() { return getTokens(llullParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(llullParser.COMA, i);
		}
		public EscriureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escriure; }
	}

	public final EscriureContext escriure() throws RecognitionException {
		EscriureContext _localctx = new EscriureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escriure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__6);
			setState(113);
			match(LPARENTESI);
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case LPARENTESI:
			case VARIABLE:
			case ENTER:
				{
				setState(114);
				expr(0);
				}
				break;
			case TEXT:
				{
				setState(115);
				match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(118);
				match(COMA);
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case LPARENTESI:
				case VARIABLE:
				case ENTER:
					{
					setState(119);
					expr(0);
					}
					break;
				case TEXT:
					{
					setState(120);
					match(TEXT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RPARENSTESI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreadorArrayContext extends ParserRuleContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public TerminalNode VARIABLE() { return getToken(llullParser.VARIABLE, 0); }
		public TerminalNode COMA() { return getToken(llullParser.COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public CreadorArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creadorArray; }
	}

	public final CreadorArrayContext creadorArray() throws RecognitionException {
		CreadorArrayContext _localctx = new CreadorArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_creadorArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__7);
			setState(131);
			match(LPARENTESI);
			setState(132);
			match(VARIABLE);
			setState(133);
			match(COMA);
			setState(134);
			expr(0);
			setState(135);
			match(RPARENSTESI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetArrayContext extends ParserRuleContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public TerminalNode VARIABLE() { return getToken(llullParser.VARIABLE, 0); }
		public TerminalNode COMA() { return getToken(llullParser.COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public GetArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getArray; }
	}

	public final GetArrayContext getArray() throws RecognitionException {
		GetArrayContext _localctx = new GetArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_getArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__8);
			setState(138);
			match(LPARENTESI);
			setState(139);
			match(VARIABLE);
			setState(140);
			match(COMA);
			setState(141);
			expr(0);
			setState(142);
			match(RPARENSTESI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetArrayContext extends ParserRuleContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public TerminalNode VARIABLE() { return getToken(llullParser.VARIABLE, 0); }
		public List<TerminalNode> COMA() { return getTokens(llullParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(llullParser.COMA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public SetArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setArray; }
	}

	public final SetArrayContext setArray() throws RecognitionException {
		SetArrayContext _localctx = new SetArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__9);
			setState(145);
			match(LPARENTESI);
			setState(146);
			match(VARIABLE);
			setState(147);
			match(COMA);
			setState(148);
			expr(0);
			setState(149);
			match(COMA);
			setState(150);
			expr(0);
			setState(151);
			match(RPARENSTESI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CridaProcContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(llullParser.VARIABLE, 0); }
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(llullParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(llullParser.COMA, i);
		}
		public CridaProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cridaProc; }
	}

	public final CridaProcContext cridaProc() throws RecognitionException {
		CridaProcContext _localctx = new CridaProcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cridaProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(VARIABLE);
			setState(154);
			match(LPARENTESI);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << LPARENTESI) | (1L << VARIABLE) | (1L << ENTER))) != 0)) {
				{
				setState(155);
				expr(0);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(156);
					match(COMA);
					setState(157);
					expr(0);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(165);
			match(RPARENSTESI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode VARIABLE() { return getToken(llullParser.VARIABLE, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(llullParser.MOD, 0); }
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NoIgualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NIGUAL() { return getToken(llullParser.NIGUAL, 0); }
		public NoIgualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivisioContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(llullParser.DIV, 0); }
		public DivisioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode LPARENTESI() { return getToken(llullParser.LPARENTESI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARENSTESI() { return getToken(llullParser.RPARENSTESI, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicacioContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(llullParser.MULT, 0); }
		public MultiplicacioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MesQueContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MESQUE() { return getToken(llullParser.MESQUE, 0); }
		public MesQueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MenysIgualQueContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENYSIGQUE() { return getToken(llullParser.MENYSIGQUE, 0); }
		public MenysIgualQueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SumaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(llullParser.SUMA, 0); }
		public SumaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MenysQueContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENYSQUE() { return getToken(llullParser.MENYSQUE, 0); }
		public MenysQueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MesIgualQueContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MESIGQUE() { return getToken(llullParser.MESIGQUE, 0); }
		public MesIgualQueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GetContext extends ExprContext {
		public GetArrayContext getArray() {
			return getRuleContext(GetArrayContext.class,0);
		}
		public GetContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IgualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(llullParser.IGUAL, 0); }
		public IgualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EnterContext extends ExprContext {
		public TerminalNode ENTER() { return getToken(llullParser.ENTER, 0); }
		public EnterContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RestaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RESTA() { return getToken(llullParser.RESTA, 0); }
		public RestaContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new GetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				getArray();
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(VARIABLE);
				}
				break;
			case ENTER:
				{
				_localctx = new EnterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(ENTER);
				}
				break;
			case LPARENTESI:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(LPARENTESI);
				setState(172);
				expr(0);
				setState(173);
				match(RPARENSTESI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacioContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(178);
						match(MULT);
						setState(179);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new DivisioContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(181);
						match(DIV);
						setState(182);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(184);
						match(MOD);
						setState(185);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new SumaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(187);
						match(SUMA);
						setState(188);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new RestaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(190);
						match(RESTA);
						setState(191);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new MesQueContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(193);
						match(MESQUE);
						setState(194);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new MesIgualQueContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(196);
						match(MESIGQUE);
						setState(197);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new MenysQueContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(199);
						match(MENYSQUE);
						setState(200);
						expr(9);
						}
						break;
					case 9:
						{
						_localctx = new MenysIgualQueContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(202);
						match(MENYSIGQUE);
						setState(203);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new IgualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(205);
						match(IGUAL);
						setState(206);
						expr(7);
						}
						break;
					case 11:
						{
						_localctx = new NoIgualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(208);
						match(NIGUAL);
						setState(209);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\5\3\62\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7e\n\7\f\7"+
		"\16\7h\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nw\n"+
		"\n\3\n\3\n\3\n\5\n|\n\n\7\n~\n\n\f\n\16\n\u0081\13\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00a1\n\16\f\16\16"+
		"\16\u00a4\13\16\5\16\u00a6\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00b2\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d5\n\17\f\17"+
		"\16\17\u00d8\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\2\2\u00ec\2!\3\2\2\2\4&\3\2\2\2\68\3\2\2\2\bF\3\2\2\2\nN\3\2\2\2\f"+
		"f\3\2\2\2\16i\3\2\2\2\20m\3\2\2\2\22r\3\2\2\2\24\u0084\3\2\2\2\26\u008b"+
		"\3\2\2\2\30\u0092\3\2\2\2\32\u009b\3\2\2\2\34\u00b1\3\2\2\2\36 \5\4\3"+
		"\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2"+
		"$%\7\2\2\3%\3\3\2\2\2&\'\7\3\2\2\'(\7\37\2\2(\61\7\31\2\2).\7\37\2\2*"+
		"+\7\35\2\2+-\7\37\2\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3"+
		"\2\2\2\60.\3\2\2\2\61)\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\32"+
		"\2\2\64\65\7\33\2\2\65\66\5\f\7\2\66\67\7\34\2\2\67\5\3\2\2\289\7\4\2"+
		"\29:\7\31\2\2:;\5\34\17\2;<\7\32\2\2<=\7\33\2\2=>\5\f\7\2>D\7\34\2\2?"+
		"@\7\5\2\2@A\7\33\2\2AB\5\f\7\2BC\7\34\2\2CE\3\2\2\2D?\3\2\2\2DE\3\2\2"+
		"\2E\7\3\2\2\2FG\7\6\2\2GH\7\31\2\2HI\5\34\17\2IJ\7\32\2\2JK\7\33\2\2K"+
		"L\5\f\7\2LM\7\34\2\2M\t\3\2\2\2NO\7\7\2\2OP\7\31\2\2PQ\5\16\b\2QR\7\36"+
		"\2\2RS\5\34\17\2ST\7\36\2\2TU\5\16\b\2UV\7\32\2\2VW\7\33\2\2WX\5\f\7\2"+
		"XY\7\34\2\2Y\13\3\2\2\2Ze\5\16\b\2[e\5\20\t\2\\e\5\22\n\2]e\5\6\4\2^e"+
		"\5\b\5\2_e\5\n\6\2`e\5\32\16\2ae\5\24\13\2be\5\26\f\2ce\5\30\r\2dZ\3\2"+
		"\2\2d[\3\2\2\2d\\\3\2\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3"+
		"\2\2\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hf"+
		"\3\2\2\2ij\7\37\2\2jk\7\30\2\2kl\5\34\17\2l\17\3\2\2\2mn\7\b\2\2no\7\31"+
		"\2\2op\7\37\2\2pq\7\32\2\2q\21\3\2\2\2rs\7\t\2\2sv\7\31\2\2tw\5\34\17"+
		"\2uw\7\"\2\2vt\3\2\2\2vu\3\2\2\2w\177\3\2\2\2x{\7\35\2\2y|\5\34\17\2z"+
		"|\7\"\2\2{y\3\2\2\2{z\3\2\2\2|~\3\2\2\2}x\3\2\2\2~\u0081\3\2\2\2\177}"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\7\32\2\2\u0083\23\3\2\2\2\u0084\u0085\7\n\2\2\u0085\u0086\7\31"+
		"\2\2\u0086\u0087\7\37\2\2\u0087\u0088\7\35\2\2\u0088\u0089\5\34\17\2\u0089"+
		"\u008a\7\32\2\2\u008a\25\3\2\2\2\u008b\u008c\7\13\2\2\u008c\u008d\7\31"+
		"\2\2\u008d\u008e\7\37\2\2\u008e\u008f\7\35\2\2\u008f\u0090\5\34\17\2\u0090"+
		"\u0091\7\32\2\2\u0091\27\3\2\2\2\u0092\u0093\7\f\2\2\u0093\u0094\7\31"+
		"\2\2\u0094\u0095\7\37\2\2\u0095\u0096\7\35\2\2\u0096\u0097\5\34\17\2\u0097"+
		"\u0098\7\35\2\2\u0098\u0099\5\34\17\2\u0099\u009a\7\32\2\2\u009a\31\3"+
		"\2\2\2\u009b\u009c\7\37\2\2\u009c\u00a5\7\31\2\2\u009d\u00a2\5\34\17\2"+
		"\u009e\u009f\7\35\2\2\u009f\u00a1\5\34\17\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\7\32\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\b\17"+
		"\1\2\u00aa\u00b2\5\26\f\2\u00ab\u00b2\7\37\2\2\u00ac\u00b2\7 \2\2\u00ad"+
		"\u00ae\7\31\2\2\u00ae\u00af\5\34\17\2\u00af\u00b0\7\32\2\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b2\u00d6\3\2\2\2\u00b3\u00b4\f\21\2\2\u00b4\u00b5\7"+
		"\17\2\2\u00b5\u00d5\5\34\17\22\u00b6\u00b7\f\20\2\2\u00b7\u00b8\7\20\2"+
		"\2\u00b8\u00d5\5\34\17\21\u00b9\u00ba\f\17\2\2\u00ba\u00bb\7\21\2\2\u00bb"+
		"\u00d5\5\34\17\20\u00bc\u00bd\f\16\2\2\u00bd\u00be\7\r\2\2\u00be\u00d5"+
		"\5\34\17\17\u00bf\u00c0\f\r\2\2\u00c0\u00c1\7\16\2\2\u00c1\u00d5\5\34"+
		"\17\16\u00c2\u00c3\f\f\2\2\u00c3\u00c4\7\25\2\2\u00c4\u00d5\5\34\17\r"+
		"\u00c5\u00c6\f\13\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00d5\5\34\17\f\u00c8"+
		"\u00c9\f\n\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00d5\5\34\17\13\u00cb\u00cc"+
		"\f\t\2\2\u00cc\u00cd\7\26\2\2\u00cd\u00d5\5\34\17\n\u00ce\u00cf\f\b\2"+
		"\2\u00cf\u00d0\7\22\2\2\u00d0\u00d5\5\34\17\t\u00d1\u00d2\f\7\2\2\u00d2"+
		"\u00d3\7\23\2\2\u00d3\u00d5\5\34\17\b\u00d4\u00b3\3\2\2\2\u00d4\u00b6"+
		"\3\2\2\2\u00d4\u00b9\3\2\2\2\u00d4\u00bc\3\2\2\2\u00d4\u00bf\3\2\2\2\u00d4"+
		"\u00c2\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00cb\3\2"+
		"\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\35\3\2\2\2\u00d8\u00d6\3\2\2"+
		"\2\20!.\61Ddfv{\177\u00a2\u00a5\u00b1\u00d4\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}