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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, VAR=75, NUMBER=76, MUL=77, DIV=78, SUB=79, ADD=80, WS=81;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_func = 3, RULE_constant = 4, 
		RULE_matrixContent = 5, RULE_row = 6, RULE_cell = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "func", "constant", "matrixContent", "row", "cell"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'\\u221A'", "'_'", "'('", "')'", "'!'", "'\\u03A3'", "','", 
			"'\\u222B'", "'\\u220F'", "'|'", "'frac'", "'mod'", "'matrix'", "'sin'", 
			"'cos'", "'tan'", "'sinh'", "'cosh'", "'tanh'", "'exp'", "'gcd'", "'lfloor'", 
			"'lceil'", "'e'", "'\\u03B1'", "'\\u03B2'", "'\\u03B3'", "'\\u03B4'", 
			"'\\u03B5'", "'\\u03B6'", "'\\u03B7'", "'\\u03B8'", "'\\u03B9'", "'\\u03BA'", 
			"'\\u03BB'", "'\\u03BC'", "'\\u03BD'", "'\\u03BE'", "'\\u03BF'", "'\\u03C0'", 
			"'\\u03C1'", "'\\u03C3'", "'\\u03C4'", "'\\u03C5'", "'\\u03C6'", "'\\u03C7'", 
			"'\\u03C8'", "'\\u03C9'", "'\\u0391'", "'\\u0392'", "'\\u0393'", "'\\u0394'", 
			"'\\u0395'", "'\\u0396'", "'\\u0397'", "'\\u0398'", "'\\u0399'", "'\\u039A'", 
			"'\\u039B'", "'\\u039C'", "'\\u039D'", "'\\u039E'", "'\\u039F'", "'\\u03A0'", 
			"'\\u03A1'", "'\\u03A4'", "'\\u03A5'", "'\\u03A6'", "'\\u03A7'", "'\\u03A8'", 
			"'\\u03A9'", "'['", "']'", null, null, "'*'", "'/'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VAR", "NUMBER", "MUL", "DIV", "SUB", "ADD", "WS"
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
			setState(16);
			stat();
			setState(17);
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
			setState(19);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(LatexParser.NUMBER, 0); }
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(22);
				match(T__1);
				setState(23);
				expr(17);
				}
				break;
			case 2:
				{
				setState(24);
				constant();
				}
				break;
			case 3:
				{
				setState(25);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(26);
				match(T__3);
				setState(27);
				expr(0);
				setState(28);
				match(T__4);
				}
				break;
			case 5:
				{
				setState(30);
				match(T__6);
				setState(31);
				match(T__3);
				setState(32);
				expr(0);
				setState(33);
				match(T__7);
				setState(34);
				expr(0);
				setState(35);
				match(T__7);
				setState(36);
				expr(0);
				setState(37);
				match(T__4);
				}
				break;
			case 6:
				{
				setState(39);
				match(T__8);
				setState(40);
				match(T__3);
				setState(41);
				expr(0);
				setState(42);
				match(T__7);
				setState(43);
				expr(0);
				setState(44);
				match(T__7);
				setState(45);
				expr(0);
				setState(46);
				match(T__4);
				}
				break;
			case 7:
				{
				setState(48);
				match(T__9);
				setState(49);
				match(T__3);
				setState(50);
				expr(0);
				setState(51);
				match(T__7);
				setState(52);
				expr(0);
				setState(53);
				match(T__4);
				}
				break;
			case 8:
				{
				setState(55);
				match(T__10);
				setState(56);
				expr(0);
				setState(57);
				match(T__10);
				}
				break;
			case 9:
				{
				setState(59);
				match(T__11);
				setState(60);
				match(T__3);
				setState(61);
				expr(0);
				setState(62);
				match(T__7);
				setState(63);
				expr(0);
				setState(64);
				match(T__4);
				}
				break;
			case 10:
				{
				setState(66);
				match(T__12);
				setState(67);
				match(T__3);
				setState(68);
				expr(0);
				setState(69);
				match(T__7);
				setState(70);
				expr(0);
				setState(71);
				match(T__4);
				}
				break;
			case 11:
				{
				setState(73);
				match(T__13);
				setState(74);
				match(T__3);
				setState(75);
				matrixContent();
				setState(76);
				match(T__4);
				}
				break;
			case 12:
				{
				setState(78);
				func();
				setState(79);
				match(T__3);
				setState(80);
				expr(0);
				setState(81);
				match(T__4);
				}
				break;
			case 13:
				{
				setState(83);
				match(VAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(87);
						match(T__0);
						setState(88);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(90);
						match(T__2);
						setState(91);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(93);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(94);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(96);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(99);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(104);
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
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33521664L) != 0)) ) {
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
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -33554304L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0)) ) {
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
			setState(109);
			match(T__72);
			setState(110);
			row();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(111);
				match(T__7);
				setState(112);
				row();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__73);
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
		public List<CellContext> cell() {
			return getRuleContexts(CellContext.class);
		}
		public CellContext cell(int i) {
			return getRuleContext(CellContext.class,i);
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
			setState(120);
			match(T__72);
			setState(121);
			cell();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(122);
				match(T__7);
				setState(123);
				cell();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(T__73);
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
	public static class CellContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -364L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6655L) != 0)) {
				{
				setState(131);
				expr(0);
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
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001Q\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002e\b\u0002\n\u0002\f\u0002h\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005r\b\u0005\n\u0005\f\u0005u\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006}\b\u0006\n\u0006"+
		"\f\u0006\u0080\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007"+
		"\u0085\b\u0007\u0001\u0007\u0000\u0001\u0004\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0004\u0001\u0000MN\u0001\u0000OP\u0001\u0000\u000f"+
		"\u0018\u0002\u0000\u0007\u0007\u0019H\u0092\u0000\u0010\u0001\u0000\u0000"+
		"\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000"+
		"\u0006i\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000\u0000\nm\u0001\u0000"+
		"\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0000\u0000"+
		"\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0004\u0002"+
		"\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0016\u0006\u0002\uffff"+
		"\uffff\u0000\u0016\u0017\u0005\u0002\u0000\u0000\u0017U\u0003\u0004\u0002"+
		"\u0011\u0018U\u0003\b\u0004\u0000\u0019U\u0005L\u0000\u0000\u001a\u001b"+
		"\u0005\u0004\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d"+
		"\u0005\u0005\u0000\u0000\u001dU\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0007\u0000\u0000\u001f \u0005\u0004\u0000\u0000 !\u0003\u0004\u0002"+
		"\u0000!\"\u0005\b\u0000\u0000\"#\u0003\u0004\u0002\u0000#$\u0005\b\u0000"+
		"\u0000$%\u0003\u0004\u0002\u0000%&\u0005\u0005\u0000\u0000&U\u0001\u0000"+
		"\u0000\u0000\'(\u0005\t\u0000\u0000()\u0005\u0004\u0000\u0000)*\u0003"+
		"\u0004\u0002\u0000*+\u0005\b\u0000\u0000+,\u0003\u0004\u0002\u0000,-\u0005"+
		"\b\u0000\u0000-.\u0003\u0004\u0002\u0000./\u0005\u0005\u0000\u0000/U\u0001"+
		"\u0000\u0000\u000001\u0005\n\u0000\u000012\u0005\u0004\u0000\u000023\u0003"+
		"\u0004\u0002\u000034\u0005\b\u0000\u000045\u0003\u0004\u0002\u000056\u0005"+
		"\u0005\u0000\u00006U\u0001\u0000\u0000\u000078\u0005\u000b\u0000\u0000"+
		"89\u0003\u0004\u0002\u00009:\u0005\u000b\u0000\u0000:U\u0001\u0000\u0000"+
		"\u0000;<\u0005\f\u0000\u0000<=\u0005\u0004\u0000\u0000=>\u0003\u0004\u0002"+
		"\u0000>?\u0005\b\u0000\u0000?@\u0003\u0004\u0002\u0000@A\u0005\u0005\u0000"+
		"\u0000AU\u0001\u0000\u0000\u0000BC\u0005\r\u0000\u0000CD\u0005\u0004\u0000"+
		"\u0000DE\u0003\u0004\u0002\u0000EF\u0005\b\u0000\u0000FG\u0003\u0004\u0002"+
		"\u0000GH\u0005\u0005\u0000\u0000HU\u0001\u0000\u0000\u0000IJ\u0005\u000e"+
		"\u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0003\n\u0005\u0000LM\u0005\u0005"+
		"\u0000\u0000MU\u0001\u0000\u0000\u0000NO\u0003\u0006\u0003\u0000OP\u0005"+
		"\u0004\u0000\u0000PQ\u0003\u0004\u0002\u0000QR\u0005\u0005\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SU\u0005K\u0000\u0000T\u0015\u0001\u0000\u0000"+
		"\u0000T\u0018\u0001\u0000\u0000\u0000T\u0019\u0001\u0000\u0000\u0000T"+
		"\u001a\u0001\u0000\u0000\u0000T\u001e\u0001\u0000\u0000\u0000T\'\u0001"+
		"\u0000\u0000\u0000T0\u0001\u0000\u0000\u0000T7\u0001\u0000\u0000\u0000"+
		"T;\u0001\u0000\u0000\u0000TB\u0001\u0000\u0000\u0000TI\u0001\u0000\u0000"+
		"\u0000TN\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000Uf\u0001\u0000"+
		"\u0000\u0000VW\n\u0012\u0000\u0000WX\u0005\u0001\u0000\u0000Xe\u0003\u0004"+
		"\u0002\u0013YZ\n\u0010\u0000\u0000Z[\u0005\u0003\u0000\u0000[e\u0003\u0004"+
		"\u0002\u0011\\]\n\u000f\u0000\u0000]^\u0007\u0000\u0000\u0000^e\u0003"+
		"\u0004\u0002\u0010_`\n\u000e\u0000\u0000`a\u0007\u0001\u0000\u0000ae\u0003"+
		"\u0004\u0002\u000fbc\n\n\u0000\u0000ce\u0005\u0006\u0000\u0000dV\u0001"+
		"\u0000\u0000\u0000dY\u0001\u0000\u0000\u0000d\\\u0001\u0000\u0000\u0000"+
		"d_\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0005\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0007\u0002\u0000\u0000"+
		"j\u0007\u0001\u0000\u0000\u0000kl\u0007\u0003\u0000\u0000l\t\u0001\u0000"+
		"\u0000\u0000mn\u0005I\u0000\u0000ns\u0003\f\u0006\u0000op\u0005\b\u0000"+
		"\u0000pr\u0003\f\u0006\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005J\u0000\u0000w\u000b\u0001"+
		"\u0000\u0000\u0000xy\u0005I\u0000\u0000y~\u0003\u000e\u0007\u0000z{\u0005"+
		"\b\u0000\u0000{}\u0003\u000e\u0007\u0000|z\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005J\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000"+
		"\u0083\u0085\u0003\u0004\u0002\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000"+
		"\u0006Tdfs~\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}