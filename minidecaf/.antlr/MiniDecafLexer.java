// Generated from /home/cyx/School/2020.9/Compiler/minidecaf/minidecaf/MiniDecaf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniDecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Int=3, Return=4, If=5, Else=6, For=7, Do=8, While=9, Break=10, 
		Continue=11, Lparen=12, Rparen=13, Lbrkt=14, Rbrkt=15, Lbrace=16, Rbrace=17, 
		Comma=18, Semicolon=19, Punctuator=20, Plus=21, Minus=22, Asterisk=23, 
		Slash=24, Percent=25, Exclamation=26, Tilde=27, Ampersand=28, Langle=29, 
		Rangle=30, Langle_eq=31, Rangle_eq=32, Double_eq=33, Exclam_eq=34, Equal=35, 
		Double_amp=36, Double_bar=37, Operator=38, Integer=39, Whitespace=40, 
		Ident=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Int", "Return", "If", "Else", "For", "Do", "While", 
			"Break", "Continue", "Lparen", "Rparen", "Lbrkt", "Rbrkt", "Lbrace", 
			"Rbrace", "Comma", "Semicolon", "Punctuator", "Plus", "Minus", "Asterisk", 
			"Slash", "Percent", "Exclamation", "Tilde", "Ampersand", "Langle", "Rangle", 
			"Langle_eq", "Rangle_eq", "Double_eq", "Exclam_eq", "Equal", "Double_amp", 
			"Double_bar", "Operator", "Integer", "Whitespace", "Ident", "IdentLead", 
			"WordChar", "Digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "':'", "'int'", "'return'", "'if'", "'else'", "'for'", "'do'", 
			"'while'", "'break'", "'continue'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "','", "';'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", 
			"'~'", "'&'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'='", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Int", "Return", "If", "Else", "For", "Do", "While", 
			"Break", "Continue", "Lparen", "Rparen", "Lbrkt", "Rbrkt", "Lbrace", 
			"Rbrace", "Comma", "Semicolon", "Punctuator", "Plus", "Minus", "Asterisk", 
			"Slash", "Percent", "Exclamation", "Tilde", "Ampersand", "Langle", "Rangle", 
			"Langle_eq", "Rangle_eq", "Double_eq", "Exclam_eq", "Equal", "Double_amp", 
			"Double_bar", "Operator", "Integer", "Whitespace", "Ident"
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


	public MiniDecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniDecaf.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u00fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00a7"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u00e2\n\'\3(\6(\u00e5\n(\r(\16(\u00e6\3"+
		")\6)\u00ea\n)\r)\16)\u00eb\3)\3)\3*\3*\7*\u00f2\n*\f*\16*\u00f5\13*\3"+
		"+\3+\3,\3,\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y\2\3\2\6\5\2\13\f"+
		"\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u0112\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3[\3\2\2\2\5]\3\2\2"+
		"\2\7_\3\2\2\2\tc\3\2\2\2\13j\3\2\2\2\rm\3\2\2\2\17r\3\2\2\2\21v\3\2\2"+
		"\2\23y\3\2\2\2\25\177\3\2\2\2\27\u0085\3\2\2\2\31\u008e\3\2\2\2\33\u0090"+
		"\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2"+
		"\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2-\u00aa"+
		"\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2\63\u00b0\3\2\2\2\65\u00b2\3\2"+
		"\2\2\67\u00b4\3\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2\2=\u00ba\3\2\2\2?\u00bc"+
		"\3\2\2\2A\u00bf\3\2\2\2C\u00c2\3\2\2\2E\u00c5\3\2\2\2G\u00c8\3\2\2\2I"+
		"\u00ca\3\2\2\2K\u00cd\3\2\2\2M\u00e1\3\2\2\2O\u00e4\3\2\2\2Q\u00e9\3\2"+
		"\2\2S\u00ef\3\2\2\2U\u00f6\3\2\2\2W\u00f8\3\2\2\2Y\u00fa\3\2\2\2[\\\7"+
		"A\2\2\\\4\3\2\2\2]^\7<\2\2^\6\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7v\2\2b\b\3"+
		"\2\2\2cd\7t\2\2de\7g\2\2ef\7v\2\2fg\7w\2\2gh\7t\2\2hi\7p\2\2i\n\3\2\2"+
		"\2jk\7k\2\2kl\7h\2\2l\f\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7g\2\2q\16"+
		"\3\2\2\2rs\7h\2\2st\7q\2\2tu\7t\2\2u\20\3\2\2\2vw\7f\2\2wx\7q\2\2x\22"+
		"\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7g\2\2~\24\3\2\2\2\177"+
		"\u0080\7d\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7c\2\2"+
		"\u0083\u0084\7m\2\2\u0084\26\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087\7"+
		"q\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7p\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2\u008d\30\3\2\2\2\u008e\u008f"+
		"\7*\2\2\u008f\32\3\2\2\2\u0090\u0091\7+\2\2\u0091\34\3\2\2\2\u0092\u0093"+
		"\7]\2\2\u0093\36\3\2\2\2\u0094\u0095\7_\2\2\u0095 \3\2\2\2\u0096\u0097"+
		"\7}\2\2\u0097\"\3\2\2\2\u0098\u0099\7\177\2\2\u0099$\3\2\2\2\u009a\u009b"+
		"\7.\2\2\u009b&\3\2\2\2\u009c\u009d\7=\2\2\u009d(\3\2\2\2\u009e\u00a7\5"+
		"\31\r\2\u009f\u00a7\5\33\16\2\u00a0\u00a7\5\35\17\2\u00a1\u00a7\5\37\20"+
		"\2\u00a2\u00a7\5!\21\2\u00a3\u00a7\5#\22\2\u00a4\u00a7\5%\23\2\u00a5\u00a7"+
		"\5\'\24\2\u00a6\u009e\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2"+
		"\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9,"+
		"\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7,\2\2\u00ad\60"+
		"\3\2\2\2\u00ae\u00af\7\61\2\2\u00af\62\3\2\2\2\u00b0\u00b1\7\'\2\2\u00b1"+
		"\64\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7\u0080\2"+
		"\2\u00b58\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7>\2\2"+
		"\u00b9<\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd"+
		"\u00be\7?\2\2\u00be@\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\u00c1\7?\2\2\u00c1"+
		"B\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\u00c4\7?\2\2\u00c4D\3\2\2\2\u00c5\u00c6"+
		"\7#\2\2\u00c6\u00c7\7?\2\2\u00c7F\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9H\3"+
		"\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7(\2\2\u00ccJ\3\2\2\2\u00cd\u00ce"+
		"\7~\2\2\u00ce\u00cf\7~\2\2\u00cfL\3\2\2\2\u00d0\u00e2\5+\26\2\u00d1\u00e2"+
		"\5-\27\2\u00d2\u00e2\5/\30\2\u00d3\u00e2\5\61\31\2\u00d4\u00e2\5\63\32"+
		"\2\u00d5\u00e2\5\65\33\2\u00d6\u00e2\5\67\34\2\u00d7\u00e2\59\35\2\u00d8"+
		"\u00e2\5;\36\2\u00d9\u00e2\5=\37\2\u00da\u00e2\5? \2\u00db\u00e2\5A!\2"+
		"\u00dc\u00e2\5C\"\2\u00dd\u00e2\5E#\2\u00de\u00e2\5G$\2\u00df\u00e2\5"+
		"I%\2\u00e0\u00e2\5K&\2\u00e1\u00d0\3\2\2\2\u00e1\u00d1\3\2\2\2\u00e1\u00d2"+
		"\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1"+
		"\u00d6\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00d9\3\2"+
		"\2\2\u00e1\u00da\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1"+
		"\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2N\3\2\2\2\u00e3\u00e5\5Y-\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7P\3\2\2\2\u00e8"+
		"\u00ea\t\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b)\2\2\u00ee"+
		"R\3\2\2\2\u00ef\u00f3\5U+\2\u00f0\u00f2\5W,\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4T\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7V\3\2\2\2\u00f8\u00f9\t"+
		"\4\2\2\u00f9X\3\2\2\2\u00fa\u00fb\t\5\2\2\u00fbZ\3\2\2\2\b\2\u00a6\u00e1"+
		"\u00e6\u00eb\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}