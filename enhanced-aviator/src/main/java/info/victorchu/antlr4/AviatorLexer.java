// Generated from E:/IdeaProject/booleansimplification/enhanced-aviator/src/main/resources\Aviator.g4 by ANTLR 4.7.2
package info.victorchu.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AviatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, IDENTIFIER=28, WS=29, CHAR_LITERAL=30, STRING_LITERAL=31, 
		BOOL_LITERAL=32, NULL_LITERAL=33, DECIMAL_LITERAL=34, HEX_LITERAL=35, 
		OCT_LITERAL=36, BINARY_LITERAL=37, FLOAT_LITERAL=38, HEX_FLOAT_LITERAL=39, 
		EQUALS=40, ARROW=41, LEFTBRACKET=42, RIGHTBRACKET=43, COLON=44, PERIOD=45, 
		SEMICOLON=46, COMMA=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "IDENTIFIER", "WS", "CHAR_LITERAL", "STRING_LITERAL", 
			"BOOL_LITERAL", "NULL_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", 
			"BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "EQUALS", "ARROW", 
			"LEFTBRACKET", "RIGHTBRACKET", "COLON", "PERIOD", "SEMICOLON", "COMMA", 
			"ExponentPart", "HexDigits", "EscapeSequence", "HexDigit", "Digits", 
			"LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'~'", "'!'", "'-'", "'*'", "'/'", "'%'", "'+'", 
			"'<<'", "'>>>'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'=~'", 
			"'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'?'", "'lambda'", "'end'", 
			null, null, null, null, null, "'null'", null, null, null, null, null, 
			null, "'='", "'->'", "'('", "')'", "':'", "'.'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFIER", "WS", "CHAR_LITERAL", "STRING_LITERAL", 
			"BOOL_LITERAL", "NULL_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", 
			"BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "EQUALS", "ARROW", 
			"LEFTBRACKET", "RIGHTBRACKET", "COLON", "PERIOD", "SEMICOLON", "COMMA"
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


	public AviatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aviator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u00ba\n\35\f\35\16\35\u00bd\13"+
		"\35\3\36\6\36\u00c0\n\36\r\36\16\36\u00c1\3\36\3\36\3\37\3\37\3\37\5\37"+
		"\u00c9\n\37\3\37\3\37\3 \3 \3 \7 \u00d0\n \f \16 \u00d3\13 \3 \3 \3 \3"+
		" \7 \u00d9\n \f \16 \u00dc\13 \3 \5 \u00df\n \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\5!\u00ea\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u00f4\n#\3#\6#\u00f7\n"+
		"#\r#\16#\u00f8\3#\5#\u00fc\n#\5#\u00fe\n#\3#\5#\u0101\n#\3$\3$\3$\3$\7"+
		"$\u0107\n$\f$\16$\u010a\13$\3$\5$\u010d\n$\3$\5$\u0110\n$\3%\3%\7%\u0114"+
		"\n%\f%\16%\u0117\13%\3%\3%\7%\u011b\n%\f%\16%\u011e\13%\3%\5%\u0121\n"+
		"%\3%\5%\u0124\n%\3&\3&\3&\3&\7&\u012a\n&\f&\16&\u012d\13&\3&\5&\u0130"+
		"\n&\3&\5&\u0133\n&\3\'\3\'\3\'\5\'\u0138\n\'\3\'\3\'\5\'\u013c\n\'\3\'"+
		"\5\'\u013f\n\'\3\'\5\'\u0142\n\'\3\'\3\'\3\'\5\'\u0147\n\'\3\'\5\'\u014a"+
		"\n\'\5\'\u014c\n\'\3(\3(\3(\3(\5(\u0152\n(\3(\5(\u0155\n(\3(\3(\5(\u0159"+
		"\n(\3(\3(\5(\u015d\n(\3(\3(\5(\u0161\n(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\5\61\u0176\n\61\3\61\3\61\3\62\3\62"+
		"\3\62\7\62\u017d\n\62\f\62\16\62\u0180\13\62\3\62\5\62\u0183\n\62\3\63"+
		"\3\63\3\63\3\63\5\63\u0189\n\63\3\63\5\63\u018c\n\63\3\63\3\63\3\63\6"+
		"\63\u0191\n\63\r\63\16\63\u0192\3\63\3\63\3\63\3\63\3\63\5\63\u019a\n"+
		"\63\3\64\3\64\3\65\3\65\7\65\u01a0\n\65\f\65\16\65\u01a3\13\65\3\65\5"+
		"\65\u01a6\n\65\3\66\3\66\5\66\u01aa\n\66\3\67\3\67\3\67\3\67\5\67\u01b0"+
		"\n\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\2g\2i\2k"+
		"\2m\2\3\2\33\5\2\13\f\16\17\"\"\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\3"+
		"\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2"+
		"DDdd\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\4\2GGgg\n\2$$)"+
		")^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u01db\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2"+
		"\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177"+
		"\3\2\2\2\25\u0081\3\2\2\2\27\u0084\3\2\2\2\31\u0088\3\2\2\2\33\u008b\3"+
		"\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0092\3\2\2\2#\u0095\3\2\2\2"+
		"%\u0098\3\2\2\2\'\u009b\3\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2-\u00a2\3"+
		"\2\2\2/\u00a4\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac\3\2\2"+
		"\2\67\u00b3\3\2\2\29\u00b7\3\2\2\2;\u00bf\3\2\2\2=\u00c5\3\2\2\2?\u00de"+
		"\3\2\2\2A\u00e9\3\2\2\2C\u00eb\3\2\2\2E\u00fd\3\2\2\2G\u0102\3\2\2\2I"+
		"\u0111\3\2\2\2K\u0125\3\2\2\2M\u014b\3\2\2\2O\u014d\3\2\2\2Q\u0162\3\2"+
		"\2\2S\u0164\3\2\2\2U\u0167\3\2\2\2W\u0169\3\2\2\2Y\u016b\3\2\2\2[\u016d"+
		"\3\2\2\2]\u016f\3\2\2\2_\u0171\3\2\2\2a\u0173\3\2\2\2c\u0179\3\2\2\2e"+
		"\u0199\3\2\2\2g\u019b\3\2\2\2i\u019d\3\2\2\2k\u01a9\3\2\2\2m\u01af\3\2"+
		"\2\2op\7]\2\2p\4\3\2\2\2qr\7_\2\2r\6\3\2\2\2st\7\u0080\2\2t\b\3\2\2\2"+
		"uv\7#\2\2v\n\3\2\2\2wx\7/\2\2x\f\3\2\2\2yz\7,\2\2z\16\3\2\2\2{|\7\61\2"+
		"\2|\20\3\2\2\2}~\7\'\2\2~\22\3\2\2\2\177\u0080\7-\2\2\u0080\24\3\2\2\2"+
		"\u0081\u0082\7>\2\2\u0082\u0083\7>\2\2\u0083\26\3\2\2\2\u0084\u0085\7"+
		"@\2\2\u0085\u0086\7@\2\2\u0086\u0087\7@\2\2\u0087\30\3\2\2\2\u0088\u0089"+
		"\7@\2\2\u0089\u008a\7@\2\2\u008a\32\3\2\2\2\u008b\u008c\7>\2\2\u008c\34"+
		"\3\2\2\2\u008d\u008e\7@\2\2\u008e\36\3\2\2\2\u008f\u0090\7>\2\2\u0090"+
		"\u0091\7?\2\2\u0091 \3\2\2\2\u0092\u0093\7@\2\2\u0093\u0094\7?\2\2\u0094"+
		"\"\3\2\2\2\u0095\u0096\7?\2\2\u0096\u0097\7?\2\2\u0097$\3\2\2\2\u0098"+
		"\u0099\7?\2\2\u0099\u009a\7\u0080\2\2\u009a&\3\2\2\2\u009b\u009c\7#\2"+
		"\2\u009c\u009d\7?\2\2\u009d(\3\2\2\2\u009e\u009f\7(\2\2\u009f*\3\2\2\2"+
		"\u00a0\u00a1\7`\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7~\2\2\u00a3.\3\2\2\2\u00a4"+
		"\u00a5\7(\2\2\u00a5\u00a6\7(\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7~\2\2\u00a8"+
		"\u00a9\7~\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7A\2\2\u00ab\64\3\2\2\2\u00ac"+
		"\u00ad\7n\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7d\2\2"+
		"\u00b0\u00b1\7f\2\2\u00b1\u00b2\7c\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7"+
		"g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7f\2\2\u00b68\3\2\2\2\u00b7\u00bb"+
		"\5m\67\2\u00b8\u00ba\5k\66\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc:\3\2\2\2\u00bd\u00bb\3\2\2\2"+
		"\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\36\2\2"+
		"\u00c4<\3\2\2\2\u00c5\u00c8\7)\2\2\u00c6\u00c9\n\3\2\2\u00c7\u00c9\5e"+
		"\63\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7)\2\2\u00cb>\3\2\2\2\u00cc\u00d1\7$\2\2\u00cd\u00d0\n\4\2\2\u00ce"+
		"\u00d0\5e\63\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00df\7$\2\2\u00d5\u00da\7)\2\2\u00d6\u00d9\n\3\2"+
		"\2\u00d7\u00d9\5e\63\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00df\7)\2\2\u00de\u00cc\3\2\2\2\u00de\u00d5\3\2"+
		"\2\2\u00df@\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3"+
		"\7w\2\2\u00e3\u00ea\7g\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7c\2\2\u00e6"+
		"\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8\u00ea\7g\2\2\u00e9\u00e0\3\2\2"+
		"\2\u00e9\u00e4\3\2\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7"+
		"w\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7n\2\2\u00efD\3\2\2\2\u00f0\u00fe"+
		"\7\62\2\2\u00f1\u00fb\t\5\2\2\u00f2\u00f4\5i\65\2\u00f3\u00f2\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00fc\3\2\2\2\u00f5\u00f7\7a\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\5i\65\2\u00fb\u00f3\3\2\2\2\u00fb\u00f6\3\2"+
		"\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u0101\t\6\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101F\3\2\2\2\u0102\u0103\7\62\2\2\u0103\u0104\t\7\2\2\u0104\u010c"+
		"\t\b\2\2\u0105\u0107\t\t\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u010d\t\b\2\2\u010c\u0108\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0110\t\6\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110H\3\2\2\2\u0111\u0115\7\62\2\2\u0112\u0114\7a\2\2\u0113\u0112"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0120\t\n\2\2\u0119\u011b\t\13"+
		"\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\t\n"+
		"\2\2\u0120\u011c\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0124\t\6\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124J\3\2\2\2"+
		"\u0125\u0126\7\62\2\2\u0126\u0127\t\f\2\2\u0127\u012f\t\r\2\2\u0128\u012a"+
		"\t\16\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130"+
		"\t\r\2\2\u012f\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u0133\t\6\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133L\3\2\2\2"+
		"\u0134\u0135\5i\65\2\u0135\u0137\7\60\2\2\u0136\u0138\5i\65\2\u0137\u0136"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013c\3\2\2\2\u0139\u013a\7\60\2\2"+
		"\u013a\u013c\5i\65\2\u013b\u0134\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e"+
		"\3\2\2\2\u013d\u013f\5a\61\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u0142\t\17\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3"+
		"\2\2\2\u0142\u014c\3\2\2\2\u0143\u0149\5i\65\2\u0144\u0146\5a\61\2\u0145"+
		"\u0147\t\17\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3"+
		"\2\2\2\u0148\u014a\t\17\2\2\u0149\u0144\3\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u013b\3\2\2\2\u014b\u0143\3\2\2\2\u014cN\3\2\2\2"+
		"\u014d\u014e\7\62\2\2\u014e\u0158\t\7\2\2\u014f\u0151\5c\62\2\u0150\u0152"+
		"\7\60\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0159\3\2\2\2"+
		"\u0153\u0155\5c\62\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\7\60\2\2\u0157\u0159\5c\62\2\u0158\u014f\3\2\2\2"+
		"\u0158\u0154\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\t\20\2\2\u015b\u015d"+
		"\t\21\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u0160\5i\65\2\u015f\u0161\t\17\2\2\u0160\u015f\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161P\3\2\2\2\u0162\u0163\7?\2\2\u0163R\3\2\2\2\u0164\u0165"+
		"\7/\2\2\u0165\u0166\7@\2\2\u0166T\3\2\2\2\u0167\u0168\7*\2\2\u0168V\3"+
		"\2\2\2\u0169\u016a\7+\2\2\u016aX\3\2\2\2\u016b\u016c\7<\2\2\u016cZ\3\2"+
		"\2\2\u016d\u016e\7\60\2\2\u016e\\\3\2\2\2\u016f\u0170\7=\2\2\u0170^\3"+
		"\2\2\2\u0171\u0172\7.\2\2\u0172`\3\2\2\2\u0173\u0175\t\22\2\2\u0174\u0176"+
		"\t\21\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0178\5i\65\2\u0178b\3\2\2\2\u0179\u0182\5g\64\2\u017a\u017d\5"+
		"g\64\2\u017b\u017d\7a\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181\u0183\5g\64\2\u0182\u017e\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183d\3\2\2\2\u0184\u0185\7^\2\2\u0185\u019a\t\23\2\2"+
		"\u0186\u018b\7^\2\2\u0187\u0189\t\24\2\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\t\n\2\2\u018b\u0188\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u019a\t\n\2\2\u018e\u0190\7^"+
		"\2\2\u018f\u0191\7w\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\5g"+
		"\64\2\u0195\u0196\5g\64\2\u0196\u0197\5g\64\2\u0197\u0198\5g\64\2\u0198"+
		"\u019a\3\2\2\2\u0199\u0184\3\2\2\2\u0199\u0186\3\2\2\2\u0199\u018e\3\2"+
		"\2\2\u019af\3\2\2\2\u019b\u019c\t\b\2\2\u019ch\3\2\2\2\u019d\u01a5\t\25"+
		"\2\2\u019e\u01a0\t\26\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a6\t\25\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"j\3\2\2\2\u01a7\u01aa\5m\67\2\u01a8\u01aa\t\25\2\2\u01a9\u01a7\3\2\2\2"+
		"\u01a9\u01a8\3\2\2\2\u01aal\3\2\2\2\u01ab\u01b0\t\27\2\2\u01ac\u01b0\n"+
		"\30\2\2\u01ad\u01ae\t\31\2\2\u01ae\u01b0\t\32\2\2\u01af\u01ab\3\2\2\2"+
		"\u01af\u01ac\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0n\3\2\2\2\63\2\u00bb\u00c1"+
		"\u00c8\u00cf\u00d1\u00d8\u00da\u00de\u00e9\u00f3\u00f8\u00fb\u00fd\u0100"+
		"\u0108\u010c\u010f\u0115\u011c\u0120\u0123\u012b\u012f\u0132\u0137\u013b"+
		"\u013e\u0141\u0146\u0149\u014b\u0151\u0154\u0158\u015c\u0160\u0175\u017c"+
		"\u017e\u0182\u0188\u018b\u0192\u0199\u01a1\u01a5\u01a9\u01af\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}