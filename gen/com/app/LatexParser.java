// Generated from C:/Users/gabry/IdeaProjects/MathToLatexConverter/src/main/java/com/app/Latex.g4 by ANTLR 4.13.2
package com.app;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LatexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, VAR=29, NUMBER=30, MUL=31, DIV=32, 
		SUB=33, ADD=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_func = 3, RULE_constant = 4, 
		RULE_matrixContent = 5, RULE_row = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "func", "constant", "matrixContent", "row"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'('", "')'", "'\\u221A'", "'!'", "'\\u03A3'", "','", "'\\u222B'", 
			"'\\u220F'", "'|'", "'frac'", "'mod'", "'matrix'", "'sin'", "'cos'", 
			"'tan'", "'sinh'", "'cosh'", "'tanh'", "'exp'", "'gcd'", "'lfloor'", 
			"'lceil'", "'\\u03C0'", "'e'", "'\\u03A9'", "'['", "']'", null, null, 
			"'*'", "'/'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "VAR", "NUMBER", "MUL", "DIV", "SUB", "ADD", 
			"WS"
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
	public String getGrammarFileName() { return "Latex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LatexParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			stat();
			setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(LatexParser.NUMBER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MatrixContentContext matrixContent() {
			return getRuleContext(MatrixContentContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LatexParser.VAR, 0); }
		public TerminalNode MUL() { return getToken(LatexParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LatexParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(LatexParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LatexParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
				{
				setState(20);
				constant();
				}
				break;
			case NUMBER:
				{
				setState(21);
				match(NUMBER);
				}
				break;
			case T__1:
				{
				setState(22);
				match(T__1);
				setState(23);
				expr(0);
				setState(24);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(26);
				match(T__3);
				setState(27);
				expr(11);
				}
				break;
			case T__5:
				{
				setState(28);
				match(T__5);
				setState(29);
				match(T__1);
				setState(30);
				expr(0);
				setState(31);
				match(T__6);
				setState(32);
				expr(0);
				setState(33);
				match(T__6);
				setState(34);
				expr(0);
				setState(35);
				match(T__2);
				}
				break;
			case T__7:
				{
				setState(37);
				match(T__7);
				setState(38);
				match(T__1);
				setState(39);
				expr(0);
				setState(40);
				match(T__6);
				setState(41);
				expr(0);
				setState(42);
				match(T__6);
				setState(43);
				expr(0);
				setState(44);
				match(T__2);
				}
				break;
			case T__8:
				{
				setState(46);
				match(T__8);
				setState(47);
				match(T__1);
				setState(48);
				expr(0);
				setState(49);
				match(T__6);
				setState(50);
				expr(0);
				setState(51);
				match(T__2);
				}
				break;
			case T__9:
				{
				setState(53);
				match(T__9);
				setState(54);
				expr(0);
				setState(55);
				match(T__9);
				}
				break;
			case T__10:
				{
				setState(57);
				match(T__10);
				setState(58);
				match(T__1);
				setState(59);
				expr(0);
				setState(60);
				match(T__6);
				setState(61);
				expr(0);
				setState(62);
				match(T__2);
				}
				break;
			case T__11:
				{
				setState(64);
				match(T__11);
				setState(65);
				match(T__1);
				setState(66);
				expr(0);
				setState(67);
				match(T__6);
				setState(68);
				expr(0);
				setState(69);
				match(T__2);
				}
				break;
			case T__12:
				{
				setState(71);
				match(T__12);
				setState(72);
				match(T__1);
				setState(73);
				matrixContent();
				setState(74);
				match(T__2);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				{
				setState(76);
				func();
				setState(77);
				match(T__1);
				setState(78);
				expr(0);
				setState(79);
				match(T__2);
				}
				break;
			case VAR:
				{
				setState(81);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(85);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(88);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(91);
						match(T__0);
						setState(92);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(94);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16760832L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixContentContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public MatrixContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterMatrixContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitMatrixContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitMatrixContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContentContext matrixContent() throws RecognitionException {
		MatrixContentContext _localctx = new MatrixContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matrixContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__26);
			setState(105);
			row();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(106);
				match(T__6);
				setState(107);
				row();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__26);
			setState(116);
			expr(0);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(117);
				match(T__6);
				setState(118);
				expr(0);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__27);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002S\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002`\b\u0002\n\u0002\f\u0002c\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006x\b"+
		"\u0006\n\u0006\f\u0006{\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000"+
		"\u0001\u0004\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0004\u0001\u0000"+
		"\u001f \u0001\u0000!\"\u0001\u0000\u000e\u0017\u0001\u0000\u0018\u001a"+
		"\u0089\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000"+
		"\u0000\u0004R\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\b"+
		"f\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000\u0000\fs\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0000\u0000"+
		"\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0003\u0004\u0002"+
		"\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0014\u0006\u0002\uffff"+
		"\uffff\u0000\u0014S\u0003\b\u0004\u0000\u0015S\u0005\u001e\u0000\u0000"+
		"\u0016\u0017\u0005\u0002\u0000\u0000\u0017\u0018\u0003\u0004\u0002\u0000"+
		"\u0018\u0019\u0005\u0003\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0005\u0004\u0000\u0000\u001bS\u0003\u0004\u0002\u000b\u001c\u001d"+
		"\u0005\u0006\u0000\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u001f"+
		"\u0003\u0004\u0002\u0000\u001f \u0005\u0007\u0000\u0000 !\u0003\u0004"+
		"\u0002\u0000!\"\u0005\u0007\u0000\u0000\"#\u0003\u0004\u0002\u0000#$\u0005"+
		"\u0003\u0000\u0000$S\u0001\u0000\u0000\u0000%&\u0005\b\u0000\u0000&\'"+
		"\u0005\u0002\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0005\u0007\u0000"+
		"\u0000)*\u0003\u0004\u0002\u0000*+\u0005\u0007\u0000\u0000+,\u0003\u0004"+
		"\u0002\u0000,-\u0005\u0003\u0000\u0000-S\u0001\u0000\u0000\u0000./\u0005"+
		"\t\u0000\u0000/0\u0005\u0002\u0000\u000001\u0003\u0004\u0002\u000012\u0005"+
		"\u0007\u0000\u000023\u0003\u0004\u0002\u000034\u0005\u0003\u0000\u0000"+
		"4S\u0001\u0000\u0000\u000056\u0005\n\u0000\u000067\u0003\u0004\u0002\u0000"+
		"78\u0005\n\u0000\u00008S\u0001\u0000\u0000\u00009:\u0005\u000b\u0000\u0000"+
		":;\u0005\u0002\u0000\u0000;<\u0003\u0004\u0002\u0000<=\u0005\u0007\u0000"+
		"\u0000=>\u0003\u0004\u0002\u0000>?\u0005\u0003\u0000\u0000?S\u0001\u0000"+
		"\u0000\u0000@A\u0005\f\u0000\u0000AB\u0005\u0002\u0000\u0000BC\u0003\u0004"+
		"\u0002\u0000CD\u0005\u0007\u0000\u0000DE\u0003\u0004\u0002\u0000EF\u0005"+
		"\u0003\u0000\u0000FS\u0001\u0000\u0000\u0000GH\u0005\r\u0000\u0000HI\u0005"+
		"\u0002\u0000\u0000IJ\u0003\n\u0005\u0000JK\u0005\u0003\u0000\u0000KS\u0001"+
		"\u0000\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0005\u0002\u0000\u0000"+
		"NO\u0003\u0004\u0002\u0000OP\u0005\u0003\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QS\u0005\u001d\u0000\u0000R\u0013\u0001\u0000\u0000\u0000R\u0015"+
		"\u0001\u0000\u0000\u0000R\u0016\u0001\u0000\u0000\u0000R\u001a\u0001\u0000"+
		"\u0000\u0000R\u001c\u0001\u0000\u0000\u0000R%\u0001\u0000\u0000\u0000"+
		"R.\u0001\u0000\u0000\u0000R5\u0001\u0000\u0000\u0000R9\u0001\u0000\u0000"+
		"\u0000R@\u0001\u0000\u0000\u0000RG\u0001\u0000\u0000\u0000RL\u0001\u0000"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000Sa\u0001\u0000\u0000\u0000TU\n\u0011"+
		"\u0000\u0000UV\u0007\u0000\u0000\u0000V`\u0003\u0004\u0002\u0012WX\n\u0010"+
		"\u0000\u0000XY\u0007\u0001\u0000\u0000Y`\u0003\u0004\u0002\u0011Z[\n\u000f"+
		"\u0000\u0000[\\\u0005\u0001\u0000\u0000\\`\u0003\u0004\u0002\u0010]^\n"+
		"\n\u0000\u0000^`\u0005\u0005\u0000\u0000_T\u0001\u0000\u0000\u0000_W\u0001"+
		"\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b\u0005\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0007"+
		"\u0002\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fg\u0007\u0003\u0000"+
		"\u0000g\t\u0001\u0000\u0000\u0000hi\u0005\u001b\u0000\u0000in\u0003\f"+
		"\u0006\u0000jk\u0005\u0007\u0000\u0000km\u0003\f\u0006\u0000lj\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0005\u001c\u0000\u0000r\u000b\u0001\u0000\u0000\u0000st\u0005\u001b"+
		"\u0000\u0000ty\u0003\u0004\u0002\u0000uv\u0005\u0007\u0000\u0000vx\u0003"+
		"\u0004\u0002\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u001c\u0000\u0000}\r\u0001\u0000"+
		"\u0000\u0000\u0005R_any";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}