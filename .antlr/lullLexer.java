// Generated from c:\Users\lator\Documents\GitHub\Practica-Python-LP(no esta encara a github)\llull.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lullLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SUMA=10, RESTA=11, MULT=12, DIV=13, MOD=14, IGUAL=15, NIGUAL=16, MENYSQUE=17, 
		MESQUE=18, MENYSIGQUE=19, MESIGQUE=20, ASSIGNAR=21, LPARENTESI=22, RPARENSTESI=23, 
		LCLAUDATOR=24, RCLAUDATOR=25, COMA=26, PUNTCOMA=27, VARIABLE=28, ENTER=29, 
		COMENTARIS=30, TEXT=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "IGUAL", "NIGUAL", "MENYSQUE", 
			"MESQUE", "MENYSIGQUE", "MESIGQUE", "ASSIGNAR", "LPARENTESI", "RPARENSTESI", 
			"LCLAUDATOR", "RCLAUDATOR", "COMA", "PUNTCOMA", "VARIABLE", "ENTER", 
			"COMENTARIS", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'if'", "'while'", "'for'", "'read'", "'write'", "'array'", 
			"'get'", "'set'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'<>'", 
			"'<'", "'>'", "'<='", "'>='", "'='", "'('", "')'", "'{'", "'}'", "','", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "IGUAL", "NIGUAL", "MENYSQUE", "MESQUE", "MENYSIGQUE", 
			"MESIGQUE", "ASSIGNAR", "LPARENTESI", "RPARENSTESI", "LCLAUDATOR", "RCLAUDATOR", 
			"COMA", "PUNTCOMA", "VARIABLE", "ENTER", "COMENTARIS", "TEXT", "WS"
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


	public lullLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "llull.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u0099\n\35\f\35\16\35\u009c\13"+
		"\35\3\36\5\36\u009f\n\36\3\36\6\36\u00a2\n\36\r\36\16\36\u00a3\3\37\3"+
		"\37\7\37\u00a8\n\37\f\37\16\37\u00ab\13\37\3\37\3\37\3 \3 \7 \u00b1\n"+
		" \f \16 \u00b4\13 \3 \3 \3!\6!\u00b9\n!\r!\16!\u00ba\3!\3!\3\u00b2\2\""+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"\3\2\7\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5H\3"+
		"\2\2\2\7K\3\2\2\2\tQ\3\2\2\2\13U\3\2\2\2\rZ\3\2\2\2\17`\3\2\2\2\21f\3"+
		"\2\2\2\23j\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35"+
		"v\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#~\3\2\2\2%\u0080\3\2\2\2\'\u0082\3\2\2"+
		"\2)\u0085\3\2\2\2+\u0088\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\u008e"+
		"\3\2\2\2\63\u0090\3\2\2\2\65\u0092\3\2\2\2\67\u0094\3\2\2\29\u0096\3\2"+
		"\2\2;\u009e\3\2\2\2=\u00a5\3\2\2\2?\u00ae\3\2\2\2A\u00b8\3\2\2\2CD\7x"+
		"\2\2DE\7q\2\2EF\7k\2\2FG\7f\2\2G\4\3\2\2\2HI\7k\2\2IJ\7h\2\2J\6\3\2\2"+
		"\2KL\7y\2\2LM\7j\2\2MN\7k\2\2NO\7n\2\2OP\7g\2\2P\b\3\2\2\2QR\7h\2\2RS"+
		"\7q\2\2ST\7t\2\2T\n\3\2\2\2UV\7t\2\2VW\7g\2\2WX\7c\2\2XY\7f\2\2Y\f\3\2"+
		"\2\2Z[\7y\2\2[\\\7t\2\2\\]\7k\2\2]^\7v\2\2^_\7g\2\2_\16\3\2\2\2`a\7c\2"+
		"\2ab\7t\2\2bc\7t\2\2cd\7c\2\2de\7{\2\2e\20\3\2\2\2fg\7i\2\2gh\7g\2\2h"+
		"i\7v\2\2i\22\3\2\2\2jk\7u\2\2kl\7g\2\2lm\7v\2\2m\24\3\2\2\2no\7-\2\2o"+
		"\26\3\2\2\2pq\7/\2\2q\30\3\2\2\2rs\7,\2\2s\32\3\2\2\2tu\7\61\2\2u\34\3"+
		"\2\2\2vw\7\'\2\2w\36\3\2\2\2xy\7?\2\2yz\7?\2\2z \3\2\2\2{|\7>\2\2|}\7"+
		"@\2\2}\"\3\2\2\2~\177\7>\2\2\177$\3\2\2\2\u0080\u0081\7@\2\2\u0081&\3"+
		"\2\2\2\u0082\u0083\7>\2\2\u0083\u0084\7?\2\2\u0084(\3\2\2\2\u0085\u0086"+
		"\7@\2\2\u0086\u0087\7?\2\2\u0087*\3\2\2\2\u0088\u0089\7?\2\2\u0089,\3"+
		"\2\2\2\u008a\u008b\7*\2\2\u008b.\3\2\2\2\u008c\u008d\7+\2\2\u008d\60\3"+
		"\2\2\2\u008e\u008f\7}\2\2\u008f\62\3\2\2\2\u0090\u0091\7\177\2\2\u0091"+
		"\64\3\2\2\2\u0092\u0093\7.\2\2\u0093\66\3\2\2\2\u0094\u0095\7=\2\2\u0095"+
		"8\3\2\2\2\u0096\u009a\t\2\2\2\u0097\u0099\t\3\2\2\u0098\u0097\3\2\2\2"+
		"\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b:\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\7/\2\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\t\4\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"<\3\2\2\2\u00a5\u00a9\7%\2\2\u00a6\u00a8\n\5\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\37\2\2\u00ad>\3\2\2\2\u00ae\u00b2"+
		"\7$\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b6\7$\2\2\u00b6@\3\2\2\2\u00b7\u00b9\t\6\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b!\2\2\u00bdB\3\2\2\2\t\2\u009a\u009e\u00a3"+
		"\u00a9\u00b2\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}