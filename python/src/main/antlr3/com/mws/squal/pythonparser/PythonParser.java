// $ANTLR 3.3 Nov 30, 2010 12:50:56 /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g 2011-03-17 13:06:39

package com.mws.squal.pythonparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/** Python 2.3.3 Grammar
 *
 *  Terence Parr and Loring Craymer
 *  February 2004
 *
 *  Converted to ANTLR v3 November 2005 by Terence Parr.
 *
 *  This grammar was derived automatically from the Python 2.3.3
 *  parser grammar to get a syntactically correct ANTLR grammar
 *  for Python.  Then Terence hand tweaked it to be semantically
 *  correct; i.e., removed lookahead issues etc...  It is LL(1)
 *  except for the (sometimes optional) trailing commas and semi-colons.
 *  It needs two symbols of lookahead in this case.
 *
 *  Starting with Loring's preliminary lexer for Python, I modified it
 *  to do my version of the whole nasty INDENT/DEDENT issue just so I
 *  could understand the problem better.  This grammar requires
 *  PythonTokenStream.java to work.  Also I used some rules from the
 *  semi-formal grammar on the web for Python (automatically
 *  translated to ANTLR format by an ANTLR grammar, naturally <grin>).
 *  The lexical rules for python are particularly nasty and it took me
 *  a long time to get it 'right'; i.e., think about it in the proper
 *  way.  Resist changing the lexer unless you've used ANTLR a lot. ;)
 *
 *  I (Terence) tested this by running it on the jython-2.1/Lib
 *  directory of 40k lines of Python.
 *  
 */
public class PythonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "NEWLINE", "AT", "LPAREN", "RPAREN", "NAME", "DOT", "COLON", "COMMA", "STAR", "DOUBLESTAR", "ASSIGN", "SEMI", "PLUSEQUAL", "MINUSEQUAL", "STAREQUAL", "SLASHEQUAL", "PERCENTEQUAL", "AMPEREQUAL", "VBAREQUAL", "CIRCUMFLEXEQUAL", "LEFTSHIFTEQUAL", "RIGHTSHIFTEQUAL", "DOUBLESTAREQUAL", "DOUBLESLASHEQUAL", "RIGHTSHIFT", "OR", "AND", "NOT", "LESS", "GREATER", "EQUAL", "GREATEREQUAL", "LESSEQUAL", "ALT_NOTEQUAL", "NOTEQUAL", "VBAR", "CIRCUMFLEX", "AMPER", "LEFTSHIFT", "PLUS", "MINUS", "SLASH", "PERCENT", "DOUBLESLASH", "TILDE", "LBRACK", "RBRACK", "LCURLY", "RCURLY", "BACKQUOTE", "INT", "LONGINT", "FLOAT", "COMPLEX", "STRING", "DIGITS", "Exponent", "ESC", "CONTINUED_LINE", "WS", "LEADING_WS", "COMMENT", "'def'", "'print'", "'del'", "'pass'", "'break'", "'continue'", "'return'", "'raise'", "'import'", "'from'", "'as'", "'global'", "'exec'", "'in'", "'assert'", "'if'", "'else'", "'elif'", "'while'", "'for'", "'try'", "'finally'", "'with'", "'except'", "'is'", "'lambda'", "'class'", "'yield'"
    };
    public static final int EOF=-1;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int INDENT=4;
    public static final int DEDENT=5;
    public static final int NEWLINE=6;
    public static final int AT=7;
    public static final int LPAREN=8;
    public static final int RPAREN=9;
    public static final int NAME=10;
    public static final int DOT=11;
    public static final int COLON=12;
    public static final int COMMA=13;
    public static final int STAR=14;
    public static final int DOUBLESTAR=15;
    public static final int ASSIGN=16;
    public static final int SEMI=17;
    public static final int PLUSEQUAL=18;
    public static final int MINUSEQUAL=19;
    public static final int STAREQUAL=20;
    public static final int SLASHEQUAL=21;
    public static final int PERCENTEQUAL=22;
    public static final int AMPEREQUAL=23;
    public static final int VBAREQUAL=24;
    public static final int CIRCUMFLEXEQUAL=25;
    public static final int LEFTSHIFTEQUAL=26;
    public static final int RIGHTSHIFTEQUAL=27;
    public static final int DOUBLESTAREQUAL=28;
    public static final int DOUBLESLASHEQUAL=29;
    public static final int RIGHTSHIFT=30;
    public static final int OR=31;
    public static final int AND=32;
    public static final int NOT=33;
    public static final int LESS=34;
    public static final int GREATER=35;
    public static final int EQUAL=36;
    public static final int GREATEREQUAL=37;
    public static final int LESSEQUAL=38;
    public static final int ALT_NOTEQUAL=39;
    public static final int NOTEQUAL=40;
    public static final int VBAR=41;
    public static final int CIRCUMFLEX=42;
    public static final int AMPER=43;
    public static final int LEFTSHIFT=44;
    public static final int PLUS=45;
    public static final int MINUS=46;
    public static final int SLASH=47;
    public static final int PERCENT=48;
    public static final int DOUBLESLASH=49;
    public static final int TILDE=50;
    public static final int LBRACK=51;
    public static final int RBRACK=52;
    public static final int LCURLY=53;
    public static final int RCURLY=54;
    public static final int BACKQUOTE=55;
    public static final int INT=56;
    public static final int LONGINT=57;
    public static final int FLOAT=58;
    public static final int COMPLEX=59;
    public static final int STRING=60;
    public static final int DIGITS=61;
    public static final int Exponent=62;
    public static final int ESC=63;
    public static final int CONTINUED_LINE=64;
    public static final int WS=65;
    public static final int LEADING_WS=66;
    public static final int COMMENT=67;

    // delegates
    // delegators


        public PythonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PythonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PythonParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g"; }



    // $ANTLR start "single_input"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:104:1: single_input : ( NEWLINE | simple_stmt | compound_stmt NEWLINE );
    public final void single_input() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:104:14: ( NEWLINE | simple_stmt | compound_stmt NEWLINE )
            int alt1=3;
            switch ( input.LA(1) ) {
            case NEWLINE:
                {
                alt1=1;
                }
                break;
            case LPAREN:
            case NAME:
            case NOT:
            case PLUS:
            case MINUS:
            case TILDE:
            case LBRACK:
            case LCURLY:
            case BACKQUOTE:
            case INT:
            case LONGINT:
            case FLOAT:
            case COMPLEX:
            case STRING:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 79:
            case 80:
            case 82:
            case 93:
            case 95:
                {
                alt1=2;
                }
                break;
            case AT:
            case 68:
            case 83:
            case 86:
            case 87:
            case 88:
            case 90:
            case 94:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:104:16: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_single_input62); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:105:16: simple_stmt
                    {
                    pushFollow(FOLLOW_simple_stmt_in_single_input79);
                    simple_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:106:16: compound_stmt NEWLINE
                    {
                    pushFollow(FOLLOW_compound_stmt_in_single_input96);
                    compound_stmt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_single_input98); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "single_input"


    // $ANTLR start "file_input"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:109:1: file_input : ( NEWLINE | stmt )* ;
    public final void file_input() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:109:12: ( ( NEWLINE | stmt )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:109:14: ( NEWLINE | stmt )*
            {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:109:14: ( NEWLINE | stmt )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>=AT && LA2_0<=LPAREN)||LA2_0==NAME||LA2_0==NOT||(LA2_0>=PLUS && LA2_0<=MINUS)||(LA2_0>=TILDE && LA2_0<=LBRACK)||LA2_0==LCURLY||(LA2_0>=BACKQUOTE && LA2_0<=STRING)||(LA2_0>=68 && LA2_0<=77)||(LA2_0>=79 && LA2_0<=80)||(LA2_0>=82 && LA2_0<=83)||(LA2_0>=86 && LA2_0<=88)||LA2_0==90||(LA2_0>=93 && LA2_0<=95)) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:109:15: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_file_input121); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:109:25: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_file_input125);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "file_input"


    // $ANTLR start "eval_input"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:112:1: eval_input : ( NEWLINE )* testlist ( NEWLINE )* ;
    public final void eval_input() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:112:12: ( ( NEWLINE )* testlist ( NEWLINE )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:112:14: ( NEWLINE )* testlist ( NEWLINE )*
            {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:112:14: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:112:15: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_eval_input148); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_testlist_in_eval_input152);
            testlist();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:112:34: ( NEWLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:112:35: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_eval_input155); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "eval_input"


    // $ANTLR start "decorators"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:115:1: decorators : ( decorator )+ ;
    public final void decorators() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:115:11: ( ( decorator )+ )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:115:13: ( decorator )+
            {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:115:13: ( decorator )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:115:13: decorator
            	    {
            	    pushFollow(FOLLOW_decorator_in_decorators176);
            	    decorator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "decorators"


    // $ANTLR start "decorator"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:118:1: decorator : AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE ;
    public final void decorator() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:118:10: ( AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:118:12: AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE
            {
            match(input,AT,FOLLOW_AT_in_decorator195); if (state.failed) return ;
            pushFollow(FOLLOW_dotted_attr_in_decorator197);
            dotted_attr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:118:27: ( LPAREN ( arglist )? RPAREN )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:118:28: LPAREN ( arglist )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_decorator200); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:118:35: ( arglist )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==LPAREN||LA6_0==NAME||(LA6_0>=STAR && LA6_0<=DOUBLESTAR)||LA6_0==NOT||(LA6_0>=PLUS && LA6_0<=MINUS)||(LA6_0>=TILDE && LA6_0<=LBRACK)||LA6_0==LCURLY||(LA6_0>=BACKQUOTE && LA6_0<=STRING)||LA6_0==93) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:118:35: arglist
                            {
                            pushFollow(FOLLOW_arglist_in_decorator202);
                            arglist();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_decorator205); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_decorator209); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "decorator"


    // $ANTLR start "dotted_attr"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:121:1: dotted_attr : NAME ( DOT NAME )* ;
    public final void dotted_attr() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:122:5: ( NAME ( DOT NAME )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:122:7: NAME ( DOT NAME )*
            {
            match(input,NAME,FOLLOW_NAME_in_dotted_attr231); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:122:12: ( DOT NAME )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:122:13: DOT NAME
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_dotted_attr234); if (state.failed) return ;
            	    match(input,NAME,FOLLOW_NAME_in_dotted_attr236); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dotted_attr"


    // $ANTLR start "funcdef"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:125:1: funcdef : ( decorators )? 'def' NAME parameters COLON suite ;
    public final void funcdef() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:125:9: ( ( decorators )? 'def' NAME parameters COLON suite )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:125:11: ( decorators )? 'def' NAME parameters COLON suite
            {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:125:11: ( decorators )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==AT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:125:11: decorators
                    {
                    pushFollow(FOLLOW_decorators_in_funcdef251);
                    decorators();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,68,FOLLOW_68_in_funcdef254); if (state.failed) return ;
            match(input,NAME,FOLLOW_NAME_in_funcdef256); if (state.failed) return ;
            pushFollow(FOLLOW_parameters_in_funcdef258);
            parameters();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_funcdef260); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_funcdef262);
            suite();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "funcdef"


    // $ANTLR start "parameters"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:128:1: parameters : LPAREN ( varargslist )? RPAREN ;
    public final void parameters() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:128:12: ( LPAREN ( varargslist )? RPAREN )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:128:14: LPAREN ( varargslist )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parameters279); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:128:21: ( varargslist )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LPAREN||LA10_0==NAME||(LA10_0>=STAR && LA10_0<=DOUBLESTAR)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:128:22: varargslist
                    {
                    pushFollow(FOLLOW_varargslist_in_parameters282);
                    varargslist();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_parameters286); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameters"


    // $ANTLR start "varargslist"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:131:1: varargslist : ( defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )? | STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME );
    public final void varargslist() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:131:13: ( defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )? | STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )
            int alt16=3;
            switch ( input.LA(1) ) {
            case LPAREN:
            case NAME:
                {
                alt16=1;
                }
                break;
            case STAR:
                {
                alt16=2;
                }
                break;
            case DOUBLESTAR:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:131:15: defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )?
                    {
                    pushFollow(FOLLOW_defparameter_in_varargslist306);
                    defparameter();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:131:28: ( options {greedy=true; } : COMMA defparameter )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==LPAREN||LA11_1==NAME) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:131:52: COMMA defparameter
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_varargslist316); if (state.failed) return ;
                    	    pushFollow(FOLLOW_defparameter_in_varargslist318);
                    	    defparameter();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:132:15: ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==COMMA) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:132:16: COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )?
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_varargslist337); if (state.failed) return ;
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:133:19: ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )?
                            int alt13=3;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==STAR) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==DOUBLESTAR) ) {
                                alt13=2;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:133:21: STAR NAME ( COMMA DOUBLESTAR NAME )?
                                    {
                                    match(input,STAR,FOLLOW_STAR_in_varargslist359); if (state.failed) return ;
                                    match(input,NAME,FOLLOW_NAME_in_varargslist361); if (state.failed) return ;
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:133:31: ( COMMA DOUBLESTAR NAME )?
                                    int alt12=2;
                                    int LA12_0 = input.LA(1);

                                    if ( (LA12_0==COMMA) ) {
                                        alt12=1;
                                    }
                                    switch (alt12) {
                                        case 1 :
                                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:133:32: COMMA DOUBLESTAR NAME
                                            {
                                            match(input,COMMA,FOLLOW_COMMA_in_varargslist364); if (state.failed) return ;
                                            match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist366); if (state.failed) return ;
                                            match(input,NAME,FOLLOW_NAME_in_varargslist368); if (state.failed) return ;

                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:134:21: DOUBLESTAR NAME
                                    {
                                    match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist392); if (state.failed) return ;
                                    match(input,NAME,FOLLOW_NAME_in_varargslist394); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:137:15: STAR NAME ( COMMA DOUBLESTAR NAME )?
                    {
                    match(input,STAR,FOLLOW_STAR_in_varargslist448); if (state.failed) return ;
                    match(input,NAME,FOLLOW_NAME_in_varargslist450); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:137:25: ( COMMA DOUBLESTAR NAME )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==COMMA) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:137:26: COMMA DOUBLESTAR NAME
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_varargslist453); if (state.failed) return ;
                            match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist455); if (state.failed) return ;
                            match(input,NAME,FOLLOW_NAME_in_varargslist457); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:138:15: DOUBLESTAR NAME
                    {
                    match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist475); if (state.failed) return ;
                    match(input,NAME,FOLLOW_NAME_in_varargslist477); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varargslist"


    // $ANTLR start "defparameter"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:141:1: defparameter : fpdef ( ASSIGN test )? ;
    public final void defparameter() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:141:14: ( fpdef ( ASSIGN test )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:141:16: fpdef ( ASSIGN test )?
            {
            pushFollow(FOLLOW_fpdef_in_defparameter498);
            fpdef();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:141:22: ( ASSIGN test )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ASSIGN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:141:23: ASSIGN test
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_defparameter501); if (state.failed) return ;
                    pushFollow(FOLLOW_test_in_defparameter503);
                    test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "defparameter"


    // $ANTLR start "fpdef"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:144:1: fpdef : ( NAME | LPAREN fplist RPAREN );
    public final void fpdef() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:144:7: ( NAME | LPAREN fplist RPAREN )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NAME) ) {
                alt18=1;
            }
            else if ( (LA18_0==LPAREN) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:144:9: NAME
                    {
                    match(input,NAME,FOLLOW_NAME_in_fpdef527); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:145:9: LPAREN fplist RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_fpdef537); if (state.failed) return ;
                    pushFollow(FOLLOW_fplist_in_fpdef539);
                    fplist();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_fpdef541); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fpdef"


    // $ANTLR start "fplist"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:148:1: fplist : fpdef ( options {greedy=true; } : COMMA fpdef )* ( COMMA )? ;
    public final void fplist() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:148:8: ( fpdef ( options {greedy=true; } : COMMA fpdef )* ( COMMA )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:148:10: fpdef ( options {greedy=true; } : COMMA fpdef )* ( COMMA )?
            {
            pushFollow(FOLLOW_fpdef_in_fplist556);
            fpdef();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:148:16: ( options {greedy=true; } : COMMA fpdef )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==LPAREN||LA19_1==NAME) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:148:40: COMMA fpdef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_fplist566); if (state.failed) return ;
            	    pushFollow(FOLLOW_fpdef_in_fplist568);
            	    fpdef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:148:54: ( COMMA )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COMMA) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:148:55: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_fplist573); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fplist"


    // $ANTLR start "stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:151:1: stmt : ( simple_stmt | compound_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:151:6: ( simple_stmt | compound_stmt )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LPAREN||LA21_0==NAME||LA21_0==NOT||(LA21_0>=PLUS && LA21_0<=MINUS)||(LA21_0>=TILDE && LA21_0<=LBRACK)||LA21_0==LCURLY||(LA21_0>=BACKQUOTE && LA21_0<=STRING)||(LA21_0>=69 && LA21_0<=77)||(LA21_0>=79 && LA21_0<=80)||LA21_0==82||LA21_0==93||LA21_0==95) ) {
                alt21=1;
            }
            else if ( (LA21_0==AT||LA21_0==68||LA21_0==83||(LA21_0>=86 && LA21_0<=88)||LA21_0==90||LA21_0==94) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:151:8: simple_stmt
                    {
                    pushFollow(FOLLOW_simple_stmt_in_stmt591);
                    simple_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:152:8: compound_stmt
                    {
                    pushFollow(FOLLOW_compound_stmt_in_stmt600);
                    compound_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stmt"


    // $ANTLR start "simple_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:155:1: simple_stmt : small_stmt ( options {greedy=true; } : SEMI small_stmt )* ( SEMI )? NEWLINE ;
    public final void simple_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:155:13: ( small_stmt ( options {greedy=true; } : SEMI small_stmt )* ( SEMI )? NEWLINE )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:155:15: small_stmt ( options {greedy=true; } : SEMI small_stmt )* ( SEMI )? NEWLINE
            {
            pushFollow(FOLLOW_small_stmt_in_simple_stmt614);
            small_stmt();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:155:26: ( options {greedy=true; } : SEMI small_stmt )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==SEMI) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==LPAREN||LA22_1==NAME||LA22_1==NOT||(LA22_1>=PLUS && LA22_1<=MINUS)||(LA22_1>=TILDE && LA22_1<=LBRACK)||LA22_1==LCURLY||(LA22_1>=BACKQUOTE && LA22_1<=STRING)||(LA22_1>=69 && LA22_1<=77)||(LA22_1>=79 && LA22_1<=80)||LA22_1==82||LA22_1==93||LA22_1==95) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:155:50: SEMI small_stmt
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_simple_stmt624); if (state.failed) return ;
            	    pushFollow(FOLLOW_small_stmt_in_simple_stmt626);
            	    small_stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:155:68: ( SEMI )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==SEMI) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:155:69: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_simple_stmt631); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NEWLINE,FOLLOW_NEWLINE_in_simple_stmt635); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "simple_stmt"


    // $ANTLR start "small_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:158:1: small_stmt : ( expr_stmt | print_stmt | del_stmt | pass_stmt | flow_stmt | import_stmt | global_stmt | exec_stmt | assert_stmt );
    public final void small_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:158:12: ( expr_stmt | print_stmt | del_stmt | pass_stmt | flow_stmt | import_stmt | global_stmt | exec_stmt | assert_stmt )
            int alt24=9;
            switch ( input.LA(1) ) {
            case LPAREN:
            case NAME:
            case NOT:
            case PLUS:
            case MINUS:
            case TILDE:
            case LBRACK:
            case LCURLY:
            case BACKQUOTE:
            case INT:
            case LONGINT:
            case FLOAT:
            case COMPLEX:
            case STRING:
            case 93:
                {
                alt24=1;
                }
                break;
            case 69:
                {
                alt24=2;
                }
                break;
            case 70:
                {
                alt24=3;
                }
                break;
            case 71:
                {
                alt24=4;
                }
                break;
            case 72:
            case 73:
            case 74:
            case 75:
            case 95:
                {
                alt24=5;
                }
                break;
            case 76:
            case 77:
                {
                alt24=6;
                }
                break;
            case 79:
                {
                alt24=7;
                }
                break;
            case 80:
                {
                alt24=8;
                }
                break;
            case 82:
                {
                alt24=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:158:14: expr_stmt
                    {
                    pushFollow(FOLLOW_expr_stmt_in_small_stmt656);
                    expr_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:159:14: print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_small_stmt671);
                    print_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:160:14: del_stmt
                    {
                    pushFollow(FOLLOW_del_stmt_in_small_stmt686);
                    del_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:161:14: pass_stmt
                    {
                    pushFollow(FOLLOW_pass_stmt_in_small_stmt701);
                    pass_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:162:14: flow_stmt
                    {
                    pushFollow(FOLLOW_flow_stmt_in_small_stmt716);
                    flow_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:163:14: import_stmt
                    {
                    pushFollow(FOLLOW_import_stmt_in_small_stmt731);
                    import_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:164:14: global_stmt
                    {
                    pushFollow(FOLLOW_global_stmt_in_small_stmt746);
                    global_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:165:14: exec_stmt
                    {
                    pushFollow(FOLLOW_exec_stmt_in_small_stmt761);
                    exec_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:166:14: assert_stmt
                    {
                    pushFollow(FOLLOW_assert_stmt_in_small_stmt776);
                    assert_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "small_stmt"


    // $ANTLR start "expr_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:169:1: expr_stmt : testlist ( augassign yield_expr | augassign testlist | assigns )? ;
    public final void expr_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:169:11: ( testlist ( augassign yield_expr | augassign testlist | assigns )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:169:13: testlist ( augassign yield_expr | augassign testlist | assigns )?
            {
            pushFollow(FOLLOW_testlist_in_expr_stmt796);
            testlist();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:170:13: ( augassign yield_expr | augassign testlist | assigns )?
            int alt25=4;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=PLUSEQUAL && LA25_0<=DOUBLESLASHEQUAL)) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==95) ) {
                    alt25=1;
                }
                else if ( (LA25_1==LPAREN||LA25_1==NAME||LA25_1==NOT||(LA25_1>=PLUS && LA25_1<=MINUS)||(LA25_1>=TILDE && LA25_1<=LBRACK)||LA25_1==LCURLY||(LA25_1>=BACKQUOTE && LA25_1<=STRING)||LA25_1==93) ) {
                    alt25=2;
                }
            }
            else if ( (LA25_0==ASSIGN) ) {
                alt25=3;
            }
            switch (alt25) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:170:15: augassign yield_expr
                    {
                    pushFollow(FOLLOW_augassign_in_expr_stmt812);
                    augassign();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_yield_expr_in_expr_stmt814);
                    yield_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:171:15: augassign testlist
                    {
                    pushFollow(FOLLOW_augassign_in_expr_stmt830);
                    augassign();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_testlist_in_expr_stmt832);
                    testlist();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:172:15: assigns
                    {
                    pushFollow(FOLLOW_assigns_in_expr_stmt848);
                    assigns();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_stmt"


    // $ANTLR start "assigns"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:176:1: assigns : ( ( assign_testlist )+ | ( assign_yield )+ );
    public final void assigns() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:177:5: ( ( assign_testlist )+ | ( assign_yield )+ )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ASSIGN) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==LPAREN||LA28_1==NAME||LA28_1==NOT||(LA28_1>=PLUS && LA28_1<=MINUS)||(LA28_1>=TILDE && LA28_1<=LBRACK)||LA28_1==LCURLY||(LA28_1>=BACKQUOTE && LA28_1<=STRING)||LA28_1==93) ) {
                    alt28=1;
                }
                else if ( (LA28_1==95) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:177:7: ( assign_testlist )+
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:177:7: ( assign_testlist )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==ASSIGN) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:177:7: assign_testlist
                    	    {
                    	    pushFollow(FOLLOW_assign_testlist_in_assigns886);
                    	    assign_testlist();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:178:7: ( assign_yield )+
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:178:7: ( assign_yield )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==ASSIGN) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:178:7: assign_yield
                    	    {
                    	    pushFollow(FOLLOW_assign_yield_in_assigns895);
                    	    assign_yield();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assigns"


    // $ANTLR start "assign_testlist"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:181:1: assign_testlist : ASSIGN testlist ;
    public final void assign_testlist() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:182:8: ( ASSIGN testlist )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:182:10: ASSIGN testlist
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_testlist916); if (state.failed) return ;
            pushFollow(FOLLOW_testlist_in_assign_testlist918);
            testlist();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assign_testlist"


    // $ANTLR start "assign_yield"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:185:1: assign_yield : ASSIGN yield_expr ;
    public final void assign_yield() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:186:5: ( ASSIGN yield_expr )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:186:7: ASSIGN yield_expr
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_yield938); if (state.failed) return ;
            pushFollow(FOLLOW_yield_expr_in_assign_yield940);
            yield_expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assign_yield"


    // $ANTLR start "augassign"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:189:1: augassign : ( PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | PERCENTEQUAL | AMPEREQUAL | VBAREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL );
    public final void augassign() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:189:11: ( PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | PERCENTEQUAL | AMPEREQUAL | VBAREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:
            {
            if ( (input.LA(1)>=PLUSEQUAL && input.LA(1)<=DOUBLESLASHEQUAL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "augassign"


    // $ANTLR start "print_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:203:1: print_stmt : 'print' ( printlist | RIGHTSHIFT printlist )? ;
    public final void print_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:203:12: ( 'print' ( printlist | RIGHTSHIFT printlist )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:203:14: 'print' ( printlist | RIGHTSHIFT printlist )?
            {
            match(input,69,FOLLOW_69_in_print_stmt1126); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:203:22: ( printlist | RIGHTSHIFT printlist )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LPAREN||LA29_0==NAME||LA29_0==NOT||(LA29_0>=PLUS && LA29_0<=MINUS)||(LA29_0>=TILDE && LA29_0<=LBRACK)||LA29_0==LCURLY||(LA29_0>=BACKQUOTE && LA29_0<=STRING)||LA29_0==93) ) {
                alt29=1;
            }
            else if ( (LA29_0==RIGHTSHIFT) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:203:23: printlist
                    {
                    pushFollow(FOLLOW_printlist_in_print_stmt1129);
                    printlist();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:203:35: RIGHTSHIFT printlist
                    {
                    match(input,RIGHTSHIFT,FOLLOW_RIGHTSHIFT_in_print_stmt1133); if (state.failed) return ;
                    pushFollow(FOLLOW_printlist_in_print_stmt1135);
                    printlist();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "print_stmt"


    // $ANTLR start "printlist"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:206:1: printlist returns [boolean newline] : test ( options {k=2; } : COMMA test )* ( COMMA )? ;
    public final boolean printlist() throws RecognitionException {
        boolean newline = false;

        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:207:5: ( test ( options {k=2; } : COMMA test )* ( COMMA )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:207:7: test ( options {k=2; } : COMMA test )* ( COMMA )?
            {
            pushFollow(FOLLOW_test_in_printlist1165);
            test();

            state._fsp--;
            if (state.failed) return newline;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:207:12: ( options {k=2; } : COMMA test )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:207:29: COMMA test
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_printlist1176); if (state.failed) return newline;
            	    pushFollow(FOLLOW_test_in_printlist1178);
            	    test();

            	    state._fsp--;
            	    if (state.failed) return newline;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:207:42: ( COMMA )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COMMA) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:207:43: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_printlist1183); if (state.failed) return newline;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return newline;
    }
    // $ANTLR end "printlist"


    // $ANTLR start "del_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:211:1: del_stmt : 'del' exprlist ;
    public final void del_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:211:10: ( 'del' exprlist )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:211:12: 'del' exprlist
            {
            match(input,70,FOLLOW_70_in_del_stmt1199); if (state.failed) return ;
            pushFollow(FOLLOW_exprlist_in_del_stmt1201);
            exprlist();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "del_stmt"


    // $ANTLR start "pass_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:214:1: pass_stmt : 'pass' ;
    public final void pass_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:214:11: ( 'pass' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:214:13: 'pass'
            {
            match(input,71,FOLLOW_71_in_pass_stmt1219); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pass_stmt"


    // $ANTLR start "flow_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:217:1: flow_stmt : ( break_stmt | continue_stmt | return_stmt | raise_stmt | yield_stmt );
    public final void flow_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:217:11: ( break_stmt | continue_stmt | return_stmt | raise_stmt | yield_stmt )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt32=1;
                }
                break;
            case 73:
                {
                alt32=2;
                }
                break;
            case 74:
                {
                alt32=3;
                }
                break;
            case 75:
                {
                alt32=4;
                }
                break;
            case 95:
                {
                alt32=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:217:13: break_stmt
                    {
                    pushFollow(FOLLOW_break_stmt_in_flow_stmt1238);
                    break_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:218:13: continue_stmt
                    {
                    pushFollow(FOLLOW_continue_stmt_in_flow_stmt1252);
                    continue_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:219:13: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_flow_stmt1266);
                    return_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:220:13: raise_stmt
                    {
                    pushFollow(FOLLOW_raise_stmt_in_flow_stmt1280);
                    raise_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:221:13: yield_stmt
                    {
                    pushFollow(FOLLOW_yield_stmt_in_flow_stmt1294);
                    yield_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "flow_stmt"


    // $ANTLR start "break_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:224:1: break_stmt : 'break' ;
    public final void break_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:224:12: ( 'break' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:224:14: 'break'
            {
            match(input,72,FOLLOW_72_in_break_stmt1313); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "break_stmt"


    // $ANTLR start "continue_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:227:1: continue_stmt : 'continue' ;
    public final void continue_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:227:15: ( 'continue' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:227:17: 'continue'
            {
            match(input,73,FOLLOW_73_in_continue_stmt1333); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "continue_stmt"


    // $ANTLR start "return_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:230:1: return_stmt : 'return' ( testlist )? ;
    public final void return_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:230:13: ( 'return' ( testlist )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:230:15: 'return' ( testlist )?
            {
            match(input,74,FOLLOW_74_in_return_stmt1356); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:230:24: ( testlist )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LPAREN||LA33_0==NAME||LA33_0==NOT||(LA33_0>=PLUS && LA33_0<=MINUS)||(LA33_0>=TILDE && LA33_0<=LBRACK)||LA33_0==LCURLY||(LA33_0>=BACKQUOTE && LA33_0<=STRING)||LA33_0==93) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:230:25: testlist
                    {
                    pushFollow(FOLLOW_testlist_in_return_stmt1359);
                    testlist();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "return_stmt"


    // $ANTLR start "yield_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:233:1: yield_stmt : yield_expr ;
    public final void yield_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:233:12: ( yield_expr )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:233:14: yield_expr
            {
            pushFollow(FOLLOW_yield_expr_in_yield_stmt1382);
            yield_expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "yield_stmt"


    // $ANTLR start "raise_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:1: raise_stmt : 'raise' ( test ( COMMA test ( COMMA test )? )? )? ;
    public final void raise_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:11: ( 'raise' ( test ( COMMA test ( COMMA test )? )? )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:13: 'raise' ( test ( COMMA test ( COMMA test )? )? )?
            {
            match(input,75,FOLLOW_75_in_raise_stmt1401); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:21: ( test ( COMMA test ( COMMA test )? )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LPAREN||LA36_0==NAME||LA36_0==NOT||(LA36_0>=PLUS && LA36_0<=MINUS)||(LA36_0>=TILDE && LA36_0<=LBRACK)||LA36_0==LCURLY||(LA36_0>=BACKQUOTE && LA36_0<=STRING)||LA36_0==93) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:22: test ( COMMA test ( COMMA test )? )?
                    {
                    pushFollow(FOLLOW_test_in_raise_stmt1404);
                    test();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:27: ( COMMA test ( COMMA test )? )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMA) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:28: COMMA test ( COMMA test )?
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_raise_stmt1407); if (state.failed) return ;
                            pushFollow(FOLLOW_test_in_raise_stmt1409);
                            test();

                            state._fsp--;
                            if (state.failed) return ;
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:39: ( COMMA test )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==COMMA) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:236:40: COMMA test
                                    {
                                    match(input,COMMA,FOLLOW_COMMA_in_raise_stmt1412); if (state.failed) return ;
                                    pushFollow(FOLLOW_test_in_raise_stmt1414);
                                    test();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "raise_stmt"


    // $ANTLR start "import_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:239:1: import_stmt : ( import_name | import_from );
    public final void import_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:239:13: ( import_name | import_from )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==76) ) {
                alt37=1;
            }
            else if ( (LA37_0==77) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:239:15: import_name
                    {
                    pushFollow(FOLLOW_import_name_in_import_stmt1439);
                    import_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:240:15: import_from
                    {
                    pushFollow(FOLLOW_import_from_in_import_stmt1455);
                    import_from();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "import_stmt"


    // $ANTLR start "import_name"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:243:1: import_name : 'import' dotted_as_names ;
    public final void import_name() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:243:13: ( 'import' dotted_as_names )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:243:15: 'import' dotted_as_names
            {
            match(input,76,FOLLOW_76_in_import_name1476); if (state.failed) return ;
            pushFollow(FOLLOW_dotted_as_names_in_import_name1478);
            dotted_as_names();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "import_name"


    // $ANTLR start "import_from"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:1: import_from : 'from' ( ( DOT )* dotted_name | ( DOT )+ ) 'import' ( STAR | import_as_names | LPAREN import_as_names RPAREN ) ;
    public final void import_from() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:12: ( 'from' ( ( DOT )* dotted_name | ( DOT )+ ) 'import' ( STAR | import_as_names | LPAREN import_as_names RPAREN ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:14: 'from' ( ( DOT )* dotted_name | ( DOT )+ ) 'import' ( STAR | import_as_names | LPAREN import_as_names RPAREN )
            {
            match(input,77,FOLLOW_77_in_import_from1498); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:21: ( ( DOT )* dotted_name | ( DOT )+ )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:22: ( DOT )* dotted_name
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:22: ( DOT )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==DOT) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:22: DOT
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_import_from1501); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    pushFollow(FOLLOW_dotted_name_in_import_from1504);
                    dotted_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:41: ( DOT )+
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:41: ( DOT )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==DOT) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:246:41: DOT
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_import_from1508); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    }
                    break;

            }

            match(input,76,FOLLOW_76_in_import_from1512); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:247:15: ( STAR | import_as_names | LPAREN import_as_names RPAREN )
            int alt41=3;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt41=1;
                }
                break;
            case NAME:
                {
                alt41=2;
                }
                break;
            case LPAREN:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:247:16: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_import_from1529); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:248:17: import_as_names
                    {
                    pushFollow(FOLLOW_import_as_names_in_import_from1547);
                    import_as_names();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:249:17: LPAREN import_as_names RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_import_from1565); if (state.failed) return ;
                    pushFollow(FOLLOW_import_as_names_in_import_from1567);
                    import_as_names();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_import_from1569); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "import_from"


    // $ANTLR start "import_as_names"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:253:1: import_as_names : import_as_name ( COMMA import_as_name )* ( COMMA )? ;
    public final void import_as_names() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:253:17: ( import_as_name ( COMMA import_as_name )* ( COMMA )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:253:19: import_as_name ( COMMA import_as_name )* ( COMMA )?
            {
            pushFollow(FOLLOW_import_as_name_in_import_as_names1605);
            import_as_name();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:253:34: ( COMMA import_as_name )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==NAME) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:253:35: COMMA import_as_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_import_as_names1608); if (state.failed) return ;
            	    pushFollow(FOLLOW_import_as_name_in_import_as_names1610);
            	    import_as_name();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:253:58: ( COMMA )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==COMMA) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:253:59: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_import_as_names1615); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "import_as_names"


    // $ANTLR start "import_as_name"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:256:1: import_as_name : NAME ( 'as' NAME )? ;
    public final void import_as_name() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:256:16: ( NAME ( 'as' NAME )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:256:18: NAME ( 'as' NAME )?
            {
            match(input,NAME,FOLLOW_NAME_in_import_as_name1642); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:256:23: ( 'as' NAME )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==78) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:256:24: 'as' NAME
                    {
                    match(input,78,FOLLOW_78_in_import_as_name1645); if (state.failed) return ;
                    match(input,NAME,FOLLOW_NAME_in_import_as_name1647); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "import_as_name"


    // $ANTLR start "dotted_as_name"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:259:1: dotted_as_name : dotted_name ( 'as' NAME )? ;
    public final void dotted_as_name() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:259:16: ( dotted_name ( 'as' NAME )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:259:18: dotted_name ( 'as' NAME )?
            {
            pushFollow(FOLLOW_dotted_name_in_dotted_as_name1673);
            dotted_name();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:259:30: ( 'as' NAME )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==78) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:259:31: 'as' NAME
                    {
                    match(input,78,FOLLOW_78_in_dotted_as_name1676); if (state.failed) return ;
                    match(input,NAME,FOLLOW_NAME_in_dotted_as_name1678); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dotted_as_name"


    // $ANTLR start "dotted_as_names"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:262:1: dotted_as_names : dotted_as_name ( COMMA dotted_as_name )* ;
    public final void dotted_as_names() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:262:17: ( dotted_as_name ( COMMA dotted_as_name )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:262:19: dotted_as_name ( COMMA dotted_as_name )*
            {
            pushFollow(FOLLOW_dotted_as_name_in_dotted_as_names1704);
            dotted_as_name();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:262:34: ( COMMA dotted_as_name )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:262:35: COMMA dotted_as_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_dotted_as_names1707); if (state.failed) return ;
            	    pushFollow(FOLLOW_dotted_as_name_in_dotted_as_names1709);
            	    dotted_as_name();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dotted_as_names"


    // $ANTLR start "dotted_name"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:264:1: dotted_name : NAME ( DOT NAME )* ;
    public final void dotted_name() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:264:13: ( NAME ( DOT NAME )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:264:15: NAME ( DOT NAME )*
            {
            match(input,NAME,FOLLOW_NAME_in_dotted_name1735); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:264:20: ( DOT NAME )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==DOT) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:264:21: DOT NAME
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_dotted_name1738); if (state.failed) return ;
            	    match(input,NAME,FOLLOW_NAME_in_dotted_name1740); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dotted_name"


    // $ANTLR start "global_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:267:1: global_stmt : 'global' NAME ( COMMA NAME )* ;
    public final void global_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:267:13: ( 'global' NAME ( COMMA NAME )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:267:15: 'global' NAME ( COMMA NAME )*
            {
            match(input,79,FOLLOW_79_in_global_stmt1763); if (state.failed) return ;
            match(input,NAME,FOLLOW_NAME_in_global_stmt1765); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:267:29: ( COMMA NAME )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:267:30: COMMA NAME
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_global_stmt1768); if (state.failed) return ;
            	    match(input,NAME,FOLLOW_NAME_in_global_stmt1770); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "global_stmt"


    // $ANTLR start "exec_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:270:1: exec_stmt : 'exec' expr ( 'in' test ( COMMA test )? )? ;
    public final void exec_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:270:11: ( 'exec' expr ( 'in' test ( COMMA test )? )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:270:13: 'exec' expr ( 'in' test ( COMMA test )? )?
            {
            match(input,80,FOLLOW_80_in_exec_stmt1793); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_exec_stmt1795);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:270:25: ( 'in' test ( COMMA test )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==81) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:270:26: 'in' test ( COMMA test )?
                    {
                    match(input,81,FOLLOW_81_in_exec_stmt1798); if (state.failed) return ;
                    pushFollow(FOLLOW_test_in_exec_stmt1800);
                    test();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:270:36: ( COMMA test )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==COMMA) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:270:37: COMMA test
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_exec_stmt1803); if (state.failed) return ;
                            pushFollow(FOLLOW_test_in_exec_stmt1805);
                            test();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exec_stmt"


    // $ANTLR start "assert_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:273:1: assert_stmt : 'assert' test ( COMMA test )? ;
    public final void assert_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:273:13: ( 'assert' test ( COMMA test )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:273:15: 'assert' test ( COMMA test )?
            {
            match(input,82,FOLLOW_82_in_assert_stmt1828); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_assert_stmt1830);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:273:29: ( COMMA test )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COMMA) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:273:30: COMMA test
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_assert_stmt1833); if (state.failed) return ;
                    pushFollow(FOLLOW_test_in_assert_stmt1835);
                    test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assert_stmt"


    // $ANTLR start "compound_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:276:1: compound_stmt : ( if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef );
    public final void compound_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:276:15: ( if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef )
            int alt52=7;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt52=1;
                }
                break;
            case 86:
                {
                alt52=2;
                }
                break;
            case 87:
                {
                alt52=3;
                }
                break;
            case 88:
                {
                alt52=4;
                }
                break;
            case 90:
                {
                alt52=5;
                }
                break;
            case AT:
            case 68:
                {
                alt52=6;
                }
                break;
            case 94:
                {
                alt52=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:276:17: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_compound_stmt1858);
                    if_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:277:17: while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_compound_stmt1876);
                    while_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:278:17: for_stmt
                    {
                    pushFollow(FOLLOW_for_stmt_in_compound_stmt1894);
                    for_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:279:17: try_stmt
                    {
                    pushFollow(FOLLOW_try_stmt_in_compound_stmt1912);
                    try_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:280:17: with_stmt
                    {
                    pushFollow(FOLLOW_with_stmt_in_compound_stmt1930);
                    with_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:281:17: funcdef
                    {
                    pushFollow(FOLLOW_funcdef_in_compound_stmt1948);
                    funcdef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:282:17: classdef
                    {
                    pushFollow(FOLLOW_classdef_in_compound_stmt1966);
                    classdef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "compound_stmt"


    // $ANTLR start "if_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:285:1: if_stmt : 'if' test COLON suite ( elif_clause )* ( 'else' COLON suite )? ;
    public final void if_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:285:8: ( 'if' test COLON suite ( elif_clause )* ( 'else' COLON suite )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:285:10: 'if' test COLON suite ( elif_clause )* ( 'else' COLON suite )?
            {
            match(input,83,FOLLOW_83_in_if_stmt1988); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_if_stmt1990);
            test();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_if_stmt1992); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_if_stmt1994);
            suite();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:285:32: ( elif_clause )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==85) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:285:32: elif_clause
            	    {
            	    pushFollow(FOLLOW_elif_clause_in_if_stmt1996);
            	    elif_clause();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:285:46: ( 'else' COLON suite )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==84) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:285:47: 'else' COLON suite
                    {
                    match(input,84,FOLLOW_84_in_if_stmt2001); if (state.failed) return ;
                    match(input,COLON,FOLLOW_COLON_in_if_stmt2003); if (state.failed) return ;
                    pushFollow(FOLLOW_suite_in_if_stmt2005);
                    suite();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "if_stmt"


    // $ANTLR start "elif_clause"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:288:1: elif_clause : 'elif' test COLON suite ;
    public final void elif_clause() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:288:13: ( 'elif' test COLON suite )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:288:15: 'elif' test COLON suite
            {
            match(input,85,FOLLOW_85_in_elif_clause2023); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_elif_clause2025);
            test();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_elif_clause2027); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_elif_clause2029);
            suite();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "elif_clause"


    // $ANTLR start "while_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:291:1: while_stmt : 'while' test COLON suite ( 'else' COLON suite )? ;
    public final void while_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:291:12: ( 'while' test COLON suite ( 'else' COLON suite )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:291:14: 'while' test COLON suite ( 'else' COLON suite )?
            {
            match(input,86,FOLLOW_86_in_while_stmt2050); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_while_stmt2052);
            test();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_while_stmt2054); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_while_stmt2056);
            suite();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:291:39: ( 'else' COLON suite )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==84) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:291:40: 'else' COLON suite
                    {
                    match(input,84,FOLLOW_84_in_while_stmt2059); if (state.failed) return ;
                    match(input,COLON,FOLLOW_COLON_in_while_stmt2061); if (state.failed) return ;
                    pushFollow(FOLLOW_suite_in_while_stmt2063);
                    suite();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "while_stmt"


    // $ANTLR start "for_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:294:1: for_stmt : 'for' exprlist 'in' testlist COLON suite ( 'else' COLON suite )? ;
    public final void for_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:294:10: ( 'for' exprlist 'in' testlist COLON suite ( 'else' COLON suite )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:294:12: 'for' exprlist 'in' testlist COLON suite ( 'else' COLON suite )?
            {
            match(input,87,FOLLOW_87_in_for_stmt2085); if (state.failed) return ;
            pushFollow(FOLLOW_exprlist_in_for_stmt2087);
            exprlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,81,FOLLOW_81_in_for_stmt2089); if (state.failed) return ;
            pushFollow(FOLLOW_testlist_in_for_stmt2091);
            testlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_for_stmt2093); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_for_stmt2095);
            suite();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:294:53: ( 'else' COLON suite )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==84) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:294:54: 'else' COLON suite
                    {
                    match(input,84,FOLLOW_84_in_for_stmt2098); if (state.failed) return ;
                    match(input,COLON,FOLLOW_COLON_in_for_stmt2100); if (state.failed) return ;
                    pushFollow(FOLLOW_suite_in_for_stmt2102);
                    suite();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "for_stmt"


    // $ANTLR start "try_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:297:1: try_stmt : 'try' COLON suite ( ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )? | 'finally' COLON suite ) ;
    public final void try_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:297:10: ( 'try' COLON suite ( ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )? | 'finally' COLON suite ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:297:12: 'try' COLON suite ( ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )? | 'finally' COLON suite )
            {
            match(input,88,FOLLOW_88_in_try_stmt2122); if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_try_stmt2124); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_try_stmt2126);
            suite();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:298:12: ( ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )? | 'finally' COLON suite )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==91) ) {
                alt60=1;
            }
            else if ( (LA60_0==89) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:298:14: ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )?
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:298:14: ( except_clause )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==91) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:298:14: except_clause
                    	    {
                    	    pushFollow(FOLLOW_except_clause_in_try_stmt2141);
                    	    except_clause();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:298:29: ( 'else' COLON suite )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==84) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:298:30: 'else' COLON suite
                            {
                            match(input,84,FOLLOW_84_in_try_stmt2145); if (state.failed) return ;
                            match(input,COLON,FOLLOW_COLON_in_try_stmt2147); if (state.failed) return ;
                            pushFollow(FOLLOW_suite_in_try_stmt2149);
                            suite();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:298:51: ( 'finally' COLON suite )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==89) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:298:52: 'finally' COLON suite
                            {
                            match(input,89,FOLLOW_89_in_try_stmt2154); if (state.failed) return ;
                            match(input,COLON,FOLLOW_COLON_in_try_stmt2156); if (state.failed) return ;
                            pushFollow(FOLLOW_suite_in_try_stmt2158);
                            suite();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:299:14: 'finally' COLON suite
                    {
                    match(input,89,FOLLOW_89_in_try_stmt2175); if (state.failed) return ;
                    match(input,COLON,FOLLOW_COLON_in_try_stmt2177); if (state.failed) return ;
                    pushFollow(FOLLOW_suite_in_try_stmt2179);
                    suite();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "try_stmt"


    // $ANTLR start "with_stmt"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:303:1: with_stmt : 'with' test ( with_var )? COLON suite ;
    public final void with_stmt() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:303:10: ( 'with' test ( with_var )? COLON suite )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:303:12: 'with' test ( with_var )? COLON suite
            {
            match(input,90,FOLLOW_90_in_with_stmt2209); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_with_stmt2211);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:303:24: ( with_var )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==NAME||LA61_0==78) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:303:25: with_var
                    {
                    pushFollow(FOLLOW_with_var_in_with_stmt2214);
                    with_var();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_with_stmt2218); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_with_stmt2220);
            suite();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "with_stmt"


    // $ANTLR start "with_var"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:306:1: with_var : ( 'as' | NAME ) expr ;
    public final void with_var() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:306:9: ( ( 'as' | NAME ) expr )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:306:11: ( 'as' | NAME ) expr
            {
            if ( input.LA(1)==NAME||input.LA(1)==78 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_expr_in_with_var2245);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "with_var"


    // $ANTLR start "except_clause"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:309:1: except_clause : 'except' ( test ( COMMA test )? )? COLON suite ;
    public final void except_clause() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:309:15: ( 'except' ( test ( COMMA test )? )? COLON suite )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:309:17: 'except' ( test ( COMMA test )? )? COLON suite
            {
            match(input,91,FOLLOW_91_in_except_clause2262); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:309:26: ( test ( COMMA test )? )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LPAREN||LA63_0==NAME||LA63_0==NOT||(LA63_0>=PLUS && LA63_0<=MINUS)||(LA63_0>=TILDE && LA63_0<=LBRACK)||LA63_0==LCURLY||(LA63_0>=BACKQUOTE && LA63_0<=STRING)||LA63_0==93) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:309:27: test ( COMMA test )?
                    {
                    pushFollow(FOLLOW_test_in_except_clause2265);
                    test();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:309:32: ( COMMA test )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==COMMA) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:309:33: COMMA test
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_except_clause2268); if (state.failed) return ;
                            pushFollow(FOLLOW_test_in_except_clause2270);
                            test();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_except_clause2276); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_except_clause2278);
            suite();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "except_clause"


    // $ANTLR start "suite"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:312:1: suite : ( simple_stmt | NEWLINE INDENT ( stmt )+ DEDENT );
    public final void suite() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:312:7: ( simple_stmt | NEWLINE INDENT ( stmt )+ DEDENT )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LPAREN||LA65_0==NAME||LA65_0==NOT||(LA65_0>=PLUS && LA65_0<=MINUS)||(LA65_0>=TILDE && LA65_0<=LBRACK)||LA65_0==LCURLY||(LA65_0>=BACKQUOTE && LA65_0<=STRING)||(LA65_0>=69 && LA65_0<=77)||(LA65_0>=79 && LA65_0<=80)||LA65_0==82||LA65_0==93||LA65_0==95) ) {
                alt65=1;
            }
            else if ( (LA65_0==NEWLINE) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:312:9: simple_stmt
                    {
                    pushFollow(FOLLOW_simple_stmt_in_suite2301);
                    simple_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:313:9: NEWLINE INDENT ( stmt )+ DEDENT
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_suite2311); if (state.failed) return ;
                    match(input,INDENT,FOLLOW_INDENT_in_suite2313); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:313:24: ( stmt )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=AT && LA64_0<=LPAREN)||LA64_0==NAME||LA64_0==NOT||(LA64_0>=PLUS && LA64_0<=MINUS)||(LA64_0>=TILDE && LA64_0<=LBRACK)||LA64_0==LCURLY||(LA64_0>=BACKQUOTE && LA64_0<=STRING)||(LA64_0>=68 && LA64_0<=77)||(LA64_0>=79 && LA64_0<=80)||(LA64_0>=82 && LA64_0<=83)||(LA64_0>=86 && LA64_0<=88)||LA64_0==90||(LA64_0>=93 && LA64_0<=95)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:313:25: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_suite2316);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);

                    match(input,DEDENT,FOLLOW_DEDENT_in_suite2320); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "suite"


    // $ANTLR start "test"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:316:1: test : ( or_test ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )? | lambdef );
    public final void test() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:316:5: ( or_test ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )? | lambdef )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LPAREN||LA67_0==NAME||LA67_0==NOT||(LA67_0>=PLUS && LA67_0<=MINUS)||(LA67_0>=TILDE && LA67_0<=LBRACK)||LA67_0==LCURLY||(LA67_0>=BACKQUOTE && LA67_0<=STRING)) ) {
                alt67=1;
            }
            else if ( (LA67_0==93) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:316:7: or_test ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )?
                    {
                    pushFollow(FOLLOW_or_test_in_test2334);
                    or_test();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:317:5: ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )?
                    int alt66=2;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:317:7: ( 'if' or_test 'else' )=> 'if' or_test 'else' test
                            {
                            match(input,83,FOLLOW_83_in_test2352); if (state.failed) return ;
                            pushFollow(FOLLOW_or_test_in_test2354);
                            or_test();

                            state._fsp--;
                            if (state.failed) return ;
                            match(input,84,FOLLOW_84_in_test2356); if (state.failed) return ;
                            pushFollow(FOLLOW_test_in_test2358);
                            test();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:318:7: lambdef
                    {
                    pushFollow(FOLLOW_lambdef_in_test2368);
                    lambdef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "test"


    // $ANTLR start "or_test"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:321:1: or_test : and_test ( OR and_test )* ;
    public final void or_test() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:321:9: ( and_test ( OR and_test )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:321:11: and_test ( OR and_test )*
            {
            pushFollow(FOLLOW_and_test_in_or_test2381);
            and_test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:321:20: ( OR and_test )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==OR) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:321:21: OR and_test
            	    {
            	    match(input,OR,FOLLOW_OR_in_or_test2384); if (state.failed) return ;
            	    pushFollow(FOLLOW_and_test_in_or_test2386);
            	    and_test();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "or_test"


    // $ANTLR start "and_test"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:324:1: and_test : not_test ( AND not_test )* ;
    public final void and_test() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:324:10: ( not_test ( AND not_test )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:324:12: not_test ( AND not_test )*
            {
            pushFollow(FOLLOW_not_test_in_and_test2405);
            not_test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:324:21: ( AND not_test )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==AND) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:324:22: AND not_test
            	    {
            	    match(input,AND,FOLLOW_AND_in_and_test2408); if (state.failed) return ;
            	    pushFollow(FOLLOW_not_test_in_and_test2410);
            	    not_test();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "and_test"


    // $ANTLR start "not_test"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:327:1: not_test : ( NOT not_test | comparison );
    public final void not_test() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:327:10: ( NOT not_test | comparison )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==NOT) ) {
                alt70=1;
            }
            else if ( (LA70_0==LPAREN||LA70_0==NAME||(LA70_0>=PLUS && LA70_0<=MINUS)||(LA70_0>=TILDE && LA70_0<=LBRACK)||LA70_0==LCURLY||(LA70_0>=BACKQUOTE && LA70_0<=STRING)) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:327:12: NOT not_test
                    {
                    match(input,NOT,FOLLOW_NOT_in_not_test2430); if (state.failed) return ;
                    pushFollow(FOLLOW_not_test_in_not_test2432);
                    not_test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:328:12: comparison
                    {
                    pushFollow(FOLLOW_comparison_in_not_test2445);
                    comparison();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "not_test"


    // $ANTLR start "comparison"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:331:1: comparison : expr ( comp_op expr )* ;
    public final void comparison() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:331:11: ( expr ( comp_op expr )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:331:13: expr ( comp_op expr )*
            {
            pushFollow(FOLLOW_expr_in_comparison2462);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:331:18: ( comp_op expr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=NOT && LA71_0<=NOTEQUAL)||LA71_0==81||LA71_0==92) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:331:19: comp_op expr
            	    {
            	    pushFollow(FOLLOW_comp_op_in_comparison2465);
            	    comp_op();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_comparison2467);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "comparison"


    // $ANTLR start "comp_op"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:334:1: comp_op : ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | ALT_NOTEQUAL | NOTEQUAL | 'in' | NOT 'in' | 'is' | 'is' NOT );
    public final void comp_op() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:334:9: ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | ALT_NOTEQUAL | NOTEQUAL | 'in' | NOT 'in' | 'is' | 'is' NOT )
            int alt72=11;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:334:11: LESS
                    {
                    match(input,LESS,FOLLOW_LESS_in_comp_op2488); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:335:11: GREATER
                    {
                    match(input,GREATER,FOLLOW_GREATER_in_comp_op2500); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:336:11: EQUAL
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_comp_op2512); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:337:11: GREATEREQUAL
                    {
                    match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_comp_op2524); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:338:11: LESSEQUAL
                    {
                    match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_comp_op2536); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:339:11: ALT_NOTEQUAL
                    {
                    match(input,ALT_NOTEQUAL,FOLLOW_ALT_NOTEQUAL_in_comp_op2548); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:340:11: NOTEQUAL
                    {
                    match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_comp_op2560); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:341:11: 'in'
                    {
                    match(input,81,FOLLOW_81_in_comp_op2572); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:342:11: NOT 'in'
                    {
                    match(input,NOT,FOLLOW_NOT_in_comp_op2584); if (state.failed) return ;
                    match(input,81,FOLLOW_81_in_comp_op2586); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:343:11: 'is'
                    {
                    match(input,92,FOLLOW_92_in_comp_op2598); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:344:11: 'is' NOT
                    {
                    match(input,92,FOLLOW_92_in_comp_op2610); if (state.failed) return ;
                    match(input,NOT,FOLLOW_NOT_in_comp_op2612); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "comp_op"


    // $ANTLR start "expr"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:347:1: expr : xor_expr ( VBAR xor_expr )* ;
    public final void expr() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:347:6: ( xor_expr ( VBAR xor_expr )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:347:8: xor_expr ( VBAR xor_expr )*
            {
            pushFollow(FOLLOW_xor_expr_in_expr2629);
            xor_expr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:347:17: ( VBAR xor_expr )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==VBAR) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:347:18: VBAR xor_expr
            	    {
            	    match(input,VBAR,FOLLOW_VBAR_in_expr2632); if (state.failed) return ;
            	    pushFollow(FOLLOW_xor_expr_in_expr2634);
            	    xor_expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "xor_expr"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:350:1: xor_expr : and_expr ( CIRCUMFLEX and_expr )* ;
    public final void xor_expr() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:350:10: ( and_expr ( CIRCUMFLEX and_expr )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:350:12: and_expr ( CIRCUMFLEX and_expr )*
            {
            pushFollow(FOLLOW_and_expr_in_xor_expr2650);
            and_expr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:350:21: ( CIRCUMFLEX and_expr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==CIRCUMFLEX) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:350:22: CIRCUMFLEX and_expr
            	    {
            	    match(input,CIRCUMFLEX,FOLLOW_CIRCUMFLEX_in_xor_expr2653); if (state.failed) return ;
            	    pushFollow(FOLLOW_and_expr_in_xor_expr2655);
            	    and_expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "xor_expr"


    // $ANTLR start "and_expr"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:353:1: and_expr : shift_expr ( AMPER shift_expr )* ;
    public final void and_expr() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:353:10: ( shift_expr ( AMPER shift_expr )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:353:12: shift_expr ( AMPER shift_expr )*
            {
            pushFollow(FOLLOW_shift_expr_in_and_expr2675);
            shift_expr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:353:23: ( AMPER shift_expr )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==AMPER) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:353:24: AMPER shift_expr
            	    {
            	    match(input,AMPER,FOLLOW_AMPER_in_and_expr2678); if (state.failed) return ;
            	    pushFollow(FOLLOW_shift_expr_in_and_expr2680);
            	    shift_expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "and_expr"


    // $ANTLR start "shift_expr"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:356:1: shift_expr : arith_expr ( ( LEFTSHIFT | RIGHTSHIFT ) arith_expr )* ;
    public final void shift_expr() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:356:12: ( arith_expr ( ( LEFTSHIFT | RIGHTSHIFT ) arith_expr )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:356:14: arith_expr ( ( LEFTSHIFT | RIGHTSHIFT ) arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_shift_expr2700);
            arith_expr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:356:25: ( ( LEFTSHIFT | RIGHTSHIFT ) arith_expr )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RIGHTSHIFT||LA76_0==LEFTSHIFT) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:356:26: ( LEFTSHIFT | RIGHTSHIFT ) arith_expr
            	    {
            	    if ( input.LA(1)==RIGHTSHIFT||input.LA(1)==LEFTSHIFT ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_arith_expr_in_shift_expr2709);
            	    arith_expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "shift_expr"


    // $ANTLR start "arith_expr"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:359:1: arith_expr : term ( ( PLUS | MINUS ) term )* ;
    public final void arith_expr() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:359:11: ( term ( ( PLUS | MINUS ) term )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:359:13: term ( ( PLUS | MINUS ) term )*
            {
            pushFollow(FOLLOW_term_in_arith_expr2730);
            term();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:359:18: ( ( PLUS | MINUS ) term )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=PLUS && LA77_0<=MINUS)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:359:19: ( PLUS | MINUS ) term
            	    {
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_arith_expr2739);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arith_expr"


    // $ANTLR start "term"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:362:1: term : factor ( ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor )* ;
    public final void term() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:362:6: ( factor ( ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:362:8: factor ( ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor )*
            {
            pushFollow(FOLLOW_factor_in_term2760);
            factor();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:362:15: ( ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==STAR||(LA78_0>=SLASH && LA78_0<=DOUBLESLASH)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:362:16: ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor
            	    {
            	    if ( input.LA(1)==STAR||(input.LA(1)>=SLASH && input.LA(1)<=DOUBLESLASH) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term2780);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:365:1: factor : ( PLUS factor | MINUS factor | TILDE factor | power );
    public final void factor() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:365:8: ( PLUS factor | MINUS factor | TILDE factor | power )
            int alt79=4;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt79=1;
                }
                break;
            case MINUS:
                {
                alt79=2;
                }
                break;
            case TILDE:
                {
                alt79=3;
                }
                break;
            case LPAREN:
            case NAME:
            case LBRACK:
            case LCURLY:
            case BACKQUOTE:
            case INT:
            case LONGINT:
            case FLOAT:
            case COMPLEX:
            case STRING:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:365:10: PLUS factor
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_factor2796); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_factor2798);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:366:10: MINUS factor
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_factor2809); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_factor2811);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:367:10: TILDE factor
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_factor2822); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_factor2824);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:368:10: power
                    {
                    pushFollow(FOLLOW_power_in_factor2835);
                    power();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "power"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:371:1: power : atom ( trailer )* ( options {greedy=true; } : DOUBLESTAR factor )? ;
    public final void power() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:371:7: ( atom ( trailer )* ( options {greedy=true; } : DOUBLESTAR factor )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:371:9: atom ( trailer )* ( options {greedy=true; } : DOUBLESTAR factor )?
            {
            pushFollow(FOLLOW_atom_in_power2851);
            atom();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:371:14: ( trailer )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==LPAREN||LA80_0==DOT||LA80_0==LBRACK) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:371:15: trailer
            	    {
            	    pushFollow(FOLLOW_trailer_in_power2854);
            	    trailer();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:371:25: ( options {greedy=true; } : DOUBLESTAR factor )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==DOUBLESTAR) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:371:49: DOUBLESTAR factor
                    {
                    match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_power2866); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_power2868);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "power"


    // $ANTLR start "atom"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:374:1: atom : ( LPAREN ( yield_expr | testlist_gexp )? RPAREN | LBRACK ( listmaker )? RBRACK | LCURLY ( dictmaker )? RCURLY | BACKQUOTE testlist BACKQUOTE | NAME | INT | LONGINT | FLOAT | COMPLEX | ( STRING )+ );
    public final void atom() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:374:6: ( LPAREN ( yield_expr | testlist_gexp )? RPAREN | LBRACK ( listmaker )? RBRACK | LCURLY ( dictmaker )? RCURLY | BACKQUOTE testlist BACKQUOTE | NAME | INT | LONGINT | FLOAT | COMPLEX | ( STRING )+ )
            int alt86=10;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt86=1;
                }
                break;
            case LBRACK:
                {
                alt86=2;
                }
                break;
            case LCURLY:
                {
                alt86=3;
                }
                break;
            case BACKQUOTE:
                {
                alt86=4;
                }
                break;
            case NAME:
                {
                alt86=5;
                }
                break;
            case INT:
                {
                alt86=6;
                }
                break;
            case LONGINT:
                {
                alt86=7;
                }
                break;
            case FLOAT:
                {
                alt86=8;
                }
                break;
            case COMPLEX:
                {
                alt86=9;
                }
                break;
            case STRING:
                {
                alt86=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:374:8: LPAREN ( yield_expr | testlist_gexp )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_atom2885); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:375:8: ( yield_expr | testlist_gexp )?
                    int alt82=3;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==95) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==LPAREN||LA82_0==NAME||LA82_0==NOT||(LA82_0>=PLUS && LA82_0<=MINUS)||(LA82_0>=TILDE && LA82_0<=LBRACK)||LA82_0==LCURLY||(LA82_0>=BACKQUOTE && LA82_0<=STRING)||LA82_0==93) ) {
                        alt82=2;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:375:10: yield_expr
                            {
                            pushFollow(FOLLOW_yield_expr_in_atom2897);
                            yield_expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:376:10: testlist_gexp
                            {
                            pushFollow(FOLLOW_testlist_gexp_in_atom2908);
                            testlist_gexp();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_atom2927); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:379:8: LBRACK ( listmaker )? RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_atom2936); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:379:15: ( listmaker )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==LPAREN||LA83_0==NAME||LA83_0==NOT||(LA83_0>=PLUS && LA83_0<=MINUS)||(LA83_0>=TILDE && LA83_0<=LBRACK)||LA83_0==LCURLY||(LA83_0>=BACKQUOTE && LA83_0<=STRING)||LA83_0==93) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:379:16: listmaker
                            {
                            pushFollow(FOLLOW_listmaker_in_atom2939);
                            listmaker();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RBRACK,FOLLOW_RBRACK_in_atom2943); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:380:8: LCURLY ( dictmaker )? RCURLY
                    {
                    match(input,LCURLY,FOLLOW_LCURLY_in_atom2952); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:380:15: ( dictmaker )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==LPAREN||LA84_0==NAME||LA84_0==NOT||(LA84_0>=PLUS && LA84_0<=MINUS)||(LA84_0>=TILDE && LA84_0<=LBRACK)||LA84_0==LCURLY||(LA84_0>=BACKQUOTE && LA84_0<=STRING)||LA84_0==93) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:380:16: dictmaker
                            {
                            pushFollow(FOLLOW_dictmaker_in_atom2955);
                            dictmaker();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RCURLY,FOLLOW_RCURLY_in_atom2959); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:381:8: BACKQUOTE testlist BACKQUOTE
                    {
                    match(input,BACKQUOTE,FOLLOW_BACKQUOTE_in_atom2968); if (state.failed) return ;
                    pushFollow(FOLLOW_testlist_in_atom2970);
                    testlist();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,BACKQUOTE,FOLLOW_BACKQUOTE_in_atom2972); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:382:8: NAME
                    {
                    match(input,NAME,FOLLOW_NAME_in_atom2981); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:383:8: INT
                    {
                    match(input,INT,FOLLOW_INT_in_atom2990); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:384:8: LONGINT
                    {
                    match(input,LONGINT,FOLLOW_LONGINT_in_atom2999); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:385:8: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_atom3008); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:386:8: COMPLEX
                    {
                    match(input,COMPLEX,FOLLOW_COMPLEX_in_atom3017); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:387:8: ( STRING )+
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:387:8: ( STRING )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==STRING) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:387:9: STRING
                    	    {
                    	    match(input,STRING,FOLLOW_STRING_in_atom3027); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "atom"


    // $ANTLR start "listmaker"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:390:1: listmaker : test ( list_for | ( options {greedy=true; } : COMMA test )* ) ( COMMA )? ;
    public final void listmaker() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:390:11: ( test ( list_for | ( options {greedy=true; } : COMMA test )* ) ( COMMA )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:390:13: test ( list_for | ( options {greedy=true; } : COMMA test )* ) ( COMMA )?
            {
            pushFollow(FOLLOW_test_in_listmaker3043);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:391:13: ( list_for | ( options {greedy=true; } : COMMA test )* )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==87) ) {
                alt88=1;
            }
            else if ( (LA88_0==COMMA||LA88_0==RBRACK) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:391:15: list_for
                    {
                    pushFollow(FOLLOW_list_for_in_listmaker3060);
                    list_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:392:15: ( options {greedy=true; } : COMMA test )*
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:392:15: ( options {greedy=true; } : COMMA test )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==COMMA) ) {
                            int LA87_1 = input.LA(2);

                            if ( (LA87_1==LPAREN||LA87_1==NAME||LA87_1==NOT||(LA87_1>=PLUS && LA87_1<=MINUS)||(LA87_1>=TILDE && LA87_1<=LBRACK)||LA87_1==LCURLY||(LA87_1>=BACKQUOTE && LA87_1<=STRING)||LA87_1==93) ) {
                                alt87=1;
                            }


                        }


                        switch (alt87) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:392:39: COMMA test
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_listmaker3084); if (state.failed) return ;
                    	    pushFollow(FOLLOW_test_in_listmaker3086);
                    	    test();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:393:15: ( COMMA )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==COMMA) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:393:16: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_listmaker3105); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "listmaker"


    // $ANTLR start "testlist_gexp"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:396:1: testlist_gexp : test ( ( options {k=2; } : COMMA test )* ( COMMA )? | gen_for ) ;
    public final void testlist_gexp() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:397:5: ( test ( ( options {k=2; } : COMMA test )* ( COMMA )? | gen_for ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:397:7: test ( ( options {k=2; } : COMMA test )* ( COMMA )? | gen_for )
            {
            pushFollow(FOLLOW_test_in_testlist_gexp3130);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:397:12: ( ( options {k=2; } : COMMA test )* ( COMMA )? | gen_for )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RPAREN||LA92_0==COMMA) ) {
                alt92=1;
            }
            else if ( (LA92_0==87) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:397:14: ( options {k=2; } : COMMA test )* ( COMMA )?
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:397:14: ( options {k=2; } : COMMA test )*
                    loop90:
                    do {
                        int alt90=2;
                        alt90 = dfa90.predict(input);
                        switch (alt90) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:397:31: COMMA test
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_testlist_gexp3143); if (state.failed) return ;
                    	    pushFollow(FOLLOW_test_in_testlist_gexp3145);
                    	    test();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:397:44: ( COMMA )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==COMMA) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:397:45: COMMA
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_testlist_gexp3150); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:398:14: gen_for
                    {
                    pushFollow(FOLLOW_gen_for_in_testlist_gexp3167);
                    gen_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "testlist_gexp"


    // $ANTLR start "lambdef"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:403:1: lambdef : 'lambda' ( varargslist )? COLON test ;
    public final void lambdef() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:403:8: ( 'lambda' ( varargslist )? COLON test )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:403:10: 'lambda' ( varargslist )? COLON test
            {
            match(input,93,FOLLOW_93_in_lambdef3204); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:403:19: ( varargslist )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==LPAREN||LA93_0==NAME||(LA93_0>=STAR && LA93_0<=DOUBLESTAR)) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:403:20: varargslist
                    {
                    pushFollow(FOLLOW_varargslist_in_lambdef3207);
                    varargslist();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_lambdef3211); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_lambdef3213);
            test();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "lambdef"


    // $ANTLR start "trailer"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:406:1: trailer : ( LPAREN ( arglist )? RPAREN | LBRACK subscriptlist RBRACK | DOT NAME );
    public final void trailer() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:406:9: ( LPAREN ( arglist )? RPAREN | LBRACK subscriptlist RBRACK | DOT NAME )
            int alt95=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt95=1;
                }
                break;
            case LBRACK:
                {
                alt95=2;
                }
                break;
            case DOT:
                {
                alt95=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:406:11: LPAREN ( arglist )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_trailer3229); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:406:18: ( arglist )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==LPAREN||LA94_0==NAME||(LA94_0>=STAR && LA94_0<=DOUBLESTAR)||LA94_0==NOT||(LA94_0>=PLUS && LA94_0<=MINUS)||(LA94_0>=TILDE && LA94_0<=LBRACK)||LA94_0==LCURLY||(LA94_0>=BACKQUOTE && LA94_0<=STRING)||LA94_0==93) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:406:19: arglist
                            {
                            pushFollow(FOLLOW_arglist_in_trailer3232);
                            arglist();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_trailer3236); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:407:11: LBRACK subscriptlist RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_trailer3248); if (state.failed) return ;
                    pushFollow(FOLLOW_subscriptlist_in_trailer3250);
                    subscriptlist();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RBRACK,FOLLOW_RBRACK_in_trailer3252); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:408:11: DOT NAME
                    {
                    match(input,DOT,FOLLOW_DOT_in_trailer3264); if (state.failed) return ;
                    match(input,NAME,FOLLOW_NAME_in_trailer3266); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "trailer"


    // $ANTLR start "subscriptlist"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:411:1: subscriptlist : subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )? ;
    public final void subscriptlist() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:411:15: ( subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:411:17: subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )?
            {
            pushFollow(FOLLOW_subscript_in_subscriptlist3283);
            subscript();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:411:27: ( options {greedy=true; } : COMMA subscript )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==COMMA) ) {
                    int LA96_1 = input.LA(2);

                    if ( (LA96_1==LPAREN||(LA96_1>=NAME && LA96_1<=COLON)||LA96_1==NOT||(LA96_1>=PLUS && LA96_1<=MINUS)||(LA96_1>=TILDE && LA96_1<=LBRACK)||LA96_1==LCURLY||(LA96_1>=BACKQUOTE && LA96_1<=STRING)||LA96_1==93) ) {
                        alt96=1;
                    }


                }


                switch (alt96) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:411:51: COMMA subscript
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_subscriptlist3293); if (state.failed) return ;
            	    pushFollow(FOLLOW_subscript_in_subscriptlist3295);
            	    subscript();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:411:69: ( COMMA )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==COMMA) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:411:70: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_subscriptlist3300); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subscriptlist"


    // $ANTLR start "subscript"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:414:1: subscript : ( DOT DOT DOT | test ( COLON ( test )? ( sliceop )? )? | COLON ( test )? ( sliceop )? );
    public final void subscript() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:414:11: ( DOT DOT DOT | test ( COLON ( test )? ( sliceop )? )? | COLON ( test )? ( sliceop )? )
            int alt103=3;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt103=1;
                }
                break;
            case LPAREN:
            case NAME:
            case NOT:
            case PLUS:
            case MINUS:
            case TILDE:
            case LBRACK:
            case LCURLY:
            case BACKQUOTE:
            case INT:
            case LONGINT:
            case FLOAT:
            case COMPLEX:
            case STRING:
            case 93:
                {
                alt103=2;
                }
                break;
            case COLON:
                {
                alt103=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:414:13: DOT DOT DOT
                    {
                    match(input,DOT,FOLLOW_DOT_in_subscript3325); if (state.failed) return ;
                    match(input,DOT,FOLLOW_DOT_in_subscript3327); if (state.failed) return ;
                    match(input,DOT,FOLLOW_DOT_in_subscript3329); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:415:13: test ( COLON ( test )? ( sliceop )? )?
                    {
                    pushFollow(FOLLOW_test_in_subscript3343);
                    test();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:415:18: ( COLON ( test )? ( sliceop )? )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==COLON) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:415:19: COLON ( test )? ( sliceop )?
                            {
                            match(input,COLON,FOLLOW_COLON_in_subscript3346); if (state.failed) return ;
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:415:25: ( test )?
                            int alt98=2;
                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==LPAREN||LA98_0==NAME||LA98_0==NOT||(LA98_0>=PLUS && LA98_0<=MINUS)||(LA98_0>=TILDE && LA98_0<=LBRACK)||LA98_0==LCURLY||(LA98_0>=BACKQUOTE && LA98_0<=STRING)||LA98_0==93) ) {
                                alt98=1;
                            }
                            switch (alt98) {
                                case 1 :
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:415:26: test
                                    {
                                    pushFollow(FOLLOW_test_in_subscript3349);
                                    test();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }

                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:415:33: ( sliceop )?
                            int alt99=2;
                            int LA99_0 = input.LA(1);

                            if ( (LA99_0==COLON) ) {
                                alt99=1;
                            }
                            switch (alt99) {
                                case 1 :
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:415:34: sliceop
                                    {
                                    pushFollow(FOLLOW_sliceop_in_subscript3354);
                                    sliceop();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:416:13: COLON ( test )? ( sliceop )?
                    {
                    match(input,COLON,FOLLOW_COLON_in_subscript3372); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:416:19: ( test )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==LPAREN||LA101_0==NAME||LA101_0==NOT||(LA101_0>=PLUS && LA101_0<=MINUS)||(LA101_0>=TILDE && LA101_0<=LBRACK)||LA101_0==LCURLY||(LA101_0>=BACKQUOTE && LA101_0<=STRING)||LA101_0==93) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:416:20: test
                            {
                            pushFollow(FOLLOW_test_in_subscript3375);
                            test();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:416:27: ( sliceop )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==COLON) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:416:28: sliceop
                            {
                            pushFollow(FOLLOW_sliceop_in_subscript3380);
                            sliceop();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subscript"


    // $ANTLR start "sliceop"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:419:1: sliceop : COLON ( test )? ;
    public final void sliceop() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:419:9: ( COLON ( test )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:419:11: COLON ( test )?
            {
            match(input,COLON,FOLLOW_COLON_in_sliceop3401); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:419:17: ( test )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==LPAREN||LA104_0==NAME||LA104_0==NOT||(LA104_0>=PLUS && LA104_0<=MINUS)||(LA104_0>=TILDE && LA104_0<=LBRACK)||LA104_0==LCURLY||(LA104_0>=BACKQUOTE && LA104_0<=STRING)||LA104_0==93) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:419:18: test
                    {
                    pushFollow(FOLLOW_test_in_sliceop3404);
                    test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sliceop"


    // $ANTLR start "exprlist"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:422:1: exprlist : expr ( options {k=2; } : COMMA expr )* ( COMMA )? ;
    public final void exprlist() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:422:10: ( expr ( options {k=2; } : COMMA expr )* ( COMMA )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:422:12: expr ( options {k=2; } : COMMA expr )* ( COMMA )?
            {
            pushFollow(FOLLOW_expr_in_exprlist3423);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:422:17: ( options {k=2; } : COMMA expr )*
            loop105:
            do {
                int alt105=2;
                alt105 = dfa105.predict(input);
                switch (alt105) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:422:34: COMMA expr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprlist3434); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_exprlist3436);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:422:47: ( COMMA )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==COMMA) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:422:48: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_exprlist3441); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exprlist"


    // $ANTLR start "testlist"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:425:1: testlist : test ( options {k=2; } : COMMA test )* ( COMMA )? ;
    public final void testlist() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:426:5: ( test ( options {k=2; } : COMMA test )* ( COMMA )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:426:7: test ( options {k=2; } : COMMA test )* ( COMMA )?
            {
            pushFollow(FOLLOW_test_in_testlist3465);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:426:12: ( options {k=2; } : COMMA test )*
            loop107:
            do {
                int alt107=2;
                alt107 = dfa107.predict(input);
                switch (alt107) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:426:29: COMMA test
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_testlist3476); if (state.failed) return ;
            	    pushFollow(FOLLOW_test_in_testlist3478);
            	    test();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:426:42: ( COMMA )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==COMMA) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:426:43: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_testlist3483); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "testlist"


    // $ANTLR start "dictmaker"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:429:1: dictmaker : test COLON test ( options {k=2; } : COMMA test COLON test )* ( COMMA )? ;
    public final void dictmaker() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:429:11: ( test COLON test ( options {k=2; } : COMMA test COLON test )* ( COMMA )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:429:13: test COLON test ( options {k=2; } : COMMA test COLON test )* ( COMMA )?
            {
            pushFollow(FOLLOW_test_in_dictmaker3498);
            test();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_dictmaker3500); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_dictmaker3502);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:429:29: ( options {k=2; } : COMMA test COLON test )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:429:45: COMMA test COLON test
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_dictmaker3512); if (state.failed) return ;
            	    pushFollow(FOLLOW_test_in_dictmaker3514);
            	    test();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,COLON,FOLLOW_COLON_in_dictmaker3516); if (state.failed) return ;
            	    pushFollow(FOLLOW_test_in_dictmaker3518);
            	    test();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:429:69: ( COMMA )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==COMMA) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:429:70: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_dictmaker3523); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dictmaker"


    // $ANTLR start "classdef"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:432:1: classdef : 'class' NAME ( LPAREN ( testlist )? RPAREN )? COLON suite ;
    public final void classdef() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:432:9: ( 'class' NAME ( LPAREN ( testlist )? RPAREN )? COLON suite )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:432:11: 'class' NAME ( LPAREN ( testlist )? RPAREN )? COLON suite
            {
            match(input,94,FOLLOW_94_in_classdef3543); if (state.failed) return ;
            match(input,NAME,FOLLOW_NAME_in_classdef3545); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:432:24: ( LPAREN ( testlist )? RPAREN )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==LPAREN) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:432:25: LPAREN ( testlist )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_classdef3548); if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:432:32: ( testlist )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==LPAREN||LA111_0==NAME||LA111_0==NOT||(LA111_0>=PLUS && LA111_0<=MINUS)||(LA111_0>=TILDE && LA111_0<=LBRACK)||LA111_0==LCURLY||(LA111_0>=BACKQUOTE && LA111_0<=STRING)||LA111_0==93) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:432:32: testlist
                            {
                            pushFollow(FOLLOW_testlist_in_classdef3550);
                            testlist();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_classdef3553); if (state.failed) return ;

                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_classdef3557); if (state.failed) return ;
            pushFollow(FOLLOW_suite_in_classdef3559);
            suite();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "classdef"


    // $ANTLR start "arglist"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:435:1: arglist : ( argument ( COMMA argument )* ( COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )? )? | STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test );
    public final void arglist() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:435:9: ( argument ( COMMA argument )* ( COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )? )? | STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )
            int alt118=3;
            switch ( input.LA(1) ) {
            case LPAREN:
            case NAME:
            case NOT:
            case PLUS:
            case MINUS:
            case TILDE:
            case LBRACK:
            case LCURLY:
            case BACKQUOTE:
            case INT:
            case LONGINT:
            case FLOAT:
            case COMPLEX:
            case STRING:
            case 93:
                {
                alt118=1;
                }
                break;
            case STAR:
                {
                alt118=2;
                }
                break;
            case DOUBLESTAR:
                {
                alt118=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:435:11: argument ( COMMA argument )* ( COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )? )?
                    {
                    pushFollow(FOLLOW_argument_in_arglist3576);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:435:20: ( COMMA argument )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==COMMA) ) {
                            int LA113_1 = input.LA(2);

                            if ( (LA113_1==LPAREN||LA113_1==NAME||LA113_1==NOT||(LA113_1>=PLUS && LA113_1<=MINUS)||(LA113_1>=TILDE && LA113_1<=LBRACK)||LA113_1==LCURLY||(LA113_1>=BACKQUOTE && LA113_1<=STRING)||LA113_1==93) ) {
                                alt113=1;
                            }


                        }


                        switch (alt113) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:435:21: COMMA argument
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arglist3579); if (state.failed) return ;
                    	    pushFollow(FOLLOW_argument_in_arglist3581);
                    	    argument();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:436:11: ( COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )? )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==COMMA) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:436:13: COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )?
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_arglist3597); if (state.failed) return ;
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:437:13: ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )?
                            int alt115=3;
                            int LA115_0 = input.LA(1);

                            if ( (LA115_0==STAR) ) {
                                alt115=1;
                            }
                            else if ( (LA115_0==DOUBLESTAR) ) {
                                alt115=2;
                            }
                            switch (alt115) {
                                case 1 :
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:437:15: STAR test ( COMMA DOUBLESTAR test )?
                                    {
                                    match(input,STAR,FOLLOW_STAR_in_arglist3613); if (state.failed) return ;
                                    pushFollow(FOLLOW_test_in_arglist3615);
                                    test();

                                    state._fsp--;
                                    if (state.failed) return ;
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:437:25: ( COMMA DOUBLESTAR test )?
                                    int alt114=2;
                                    int LA114_0 = input.LA(1);

                                    if ( (LA114_0==COMMA) ) {
                                        alt114=1;
                                    }
                                    switch (alt114) {
                                        case 1 :
                                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:437:26: COMMA DOUBLESTAR test
                                            {
                                            match(input,COMMA,FOLLOW_COMMA_in_arglist3618); if (state.failed) return ;
                                            match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist3620); if (state.failed) return ;
                                            pushFollow(FOLLOW_test_in_arglist3622);
                                            test();

                                            state._fsp--;
                                            if (state.failed) return ;

                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:438:15: DOUBLESTAR test
                                    {
                                    match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist3640); if (state.failed) return ;
                                    pushFollow(FOLLOW_test_in_arglist3642);
                                    test();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:441:13: STAR test ( COMMA DOUBLESTAR test )?
                    {
                    match(input,STAR,FOLLOW_STAR_in_arglist3684); if (state.failed) return ;
                    pushFollow(FOLLOW_test_in_arglist3686);
                    test();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:441:23: ( COMMA DOUBLESTAR test )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==COMMA) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:441:24: COMMA DOUBLESTAR test
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_arglist3689); if (state.failed) return ;
                            match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist3691); if (state.failed) return ;
                            pushFollow(FOLLOW_test_in_arglist3693);
                            test();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:442:13: DOUBLESTAR test
                    {
                    match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist3709); if (state.failed) return ;
                    pushFollow(FOLLOW_test_in_arglist3711);
                    test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arglist"


    // $ANTLR start "argument"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:445:1: argument : test ( ( ASSIGN test ) | gen_for )? ;
    public final void argument() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:445:10: ( test ( ( ASSIGN test ) | gen_for )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:445:12: test ( ( ASSIGN test ) | gen_for )?
            {
            pushFollow(FOLLOW_test_in_argument3728);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:445:17: ( ( ASSIGN test ) | gen_for )?
            int alt119=3;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==ASSIGN) ) {
                alt119=1;
            }
            else if ( (LA119_0==87) ) {
                alt119=2;
            }
            switch (alt119) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:445:19: ( ASSIGN test )
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:445:19: ( ASSIGN test )
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:445:20: ASSIGN test
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_argument3733); if (state.failed) return ;
                    pushFollow(FOLLOW_test_in_argument3735);
                    test();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:445:35: gen_for
                    {
                    pushFollow(FOLLOW_gen_for_in_argument3740);
                    gen_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "argument"


    // $ANTLR start "list_iter"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:448:1: list_iter : ( list_for | list_if );
    public final void list_iter() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:448:11: ( list_for | list_if )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==87) ) {
                alt120=1;
            }
            else if ( (LA120_0==83) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:448:13: list_for
                    {
                    pushFollow(FOLLOW_list_for_in_list_iter3760);
                    list_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:449:13: list_if
                    {
                    pushFollow(FOLLOW_list_if_in_list_iter3774);
                    list_if();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "list_iter"


    // $ANTLR start "list_for"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:452:1: list_for : 'for' exprlist 'in' testlist ( list_iter )? ;
    public final void list_for() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:452:10: ( 'for' exprlist 'in' testlist ( list_iter )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:452:12: 'for' exprlist 'in' testlist ( list_iter )?
            {
            match(input,87,FOLLOW_87_in_list_for3793); if (state.failed) return ;
            pushFollow(FOLLOW_exprlist_in_list_for3795);
            exprlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,81,FOLLOW_81_in_list_for3797); if (state.failed) return ;
            pushFollow(FOLLOW_testlist_in_list_for3799);
            testlist();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:452:41: ( list_iter )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==83||LA121_0==87) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:452:42: list_iter
                    {
                    pushFollow(FOLLOW_list_iter_in_list_for3802);
                    list_iter();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "list_for"


    // $ANTLR start "list_if"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:455:1: list_if : 'if' test ( list_iter )? ;
    public final void list_if() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:455:9: ( 'if' test ( list_iter )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:455:11: 'if' test ( list_iter )?
            {
            match(input,83,FOLLOW_83_in_list_if3822); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_list_if3824);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:455:21: ( list_iter )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==83||LA122_0==87) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:455:22: list_iter
                    {
                    pushFollow(FOLLOW_list_iter_in_list_if3827);
                    list_iter();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "list_if"


    // $ANTLR start "gen_iter"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:458:1: gen_iter : ( gen_for | gen_if );
    public final void gen_iter() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:458:9: ( gen_for | gen_if )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==87) ) {
                alt123=1;
            }
            else if ( (LA123_0==83) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:458:11: gen_for
                    {
                    pushFollow(FOLLOW_gen_for_in_gen_iter3845);
                    gen_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:459:11: gen_if
                    {
                    pushFollow(FOLLOW_gen_if_in_gen_iter3857);
                    gen_if();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "gen_iter"


    // $ANTLR start "gen_for"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:462:1: gen_for : 'for' exprlist 'in' or_test ( gen_iter )? ;
    public final void gen_for() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:462:8: ( 'for' exprlist 'in' or_test ( gen_iter )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:462:10: 'for' exprlist 'in' or_test ( gen_iter )?
            {
            match(input,87,FOLLOW_87_in_gen_for3873); if (state.failed) return ;
            pushFollow(FOLLOW_exprlist_in_gen_for3875);
            exprlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,81,FOLLOW_81_in_gen_for3877); if (state.failed) return ;
            pushFollow(FOLLOW_or_test_in_gen_for3879);
            or_test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:462:38: ( gen_iter )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==83||LA124_0==87) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:462:38: gen_iter
                    {
                    pushFollow(FOLLOW_gen_iter_in_gen_for3881);
                    gen_iter();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "gen_for"


    // $ANTLR start "gen_if"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:465:1: gen_if : 'if' test ( gen_iter )? ;
    public final void gen_if() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:465:7: ( 'if' test ( gen_iter )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:465:9: 'if' test ( gen_iter )?
            {
            match(input,83,FOLLOW_83_in_gen_if3897); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_gen_if3899);
            test();

            state._fsp--;
            if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:465:19: ( gen_iter )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==83||LA125_0==87) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:465:19: gen_iter
                    {
                    pushFollow(FOLLOW_gen_iter_in_gen_if3901);
                    gen_iter();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "gen_if"


    // $ANTLR start "yield_expr"
    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:468:1: yield_expr : 'yield' ( testlist )? ;
    public final void yield_expr() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:468:12: ( 'yield' ( testlist )? )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:468:14: 'yield' ( testlist )?
            {
            match(input,95,FOLLOW_95_in_yield_expr3917); if (state.failed) return ;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:468:22: ( testlist )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==LPAREN||LA126_0==NAME||LA126_0==NOT||(LA126_0>=PLUS && LA126_0<=MINUS)||(LA126_0>=TILDE && LA126_0<=LBRACK)||LA126_0==LCURLY||(LA126_0>=BACKQUOTE && LA126_0<=STRING)||LA126_0==93) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:468:22: testlist
                    {
                    pushFollow(FOLLOW_testlist_in_yield_expr3919);
                    testlist();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "yield_expr"

    // $ANTLR start synpred1_Python
    public final void synpred1_Python_fragment() throws RecognitionException {   
        // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:317:7: ( 'if' or_test 'else' )
        // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:317:8: 'if' or_test 'else'
        {
        match(input,83,FOLLOW_83_in_synpred1_Python2343); if (state.failed) return ;
        pushFollow(FOLLOW_or_test_in_synpred1_Python2345);
        or_test();

        state._fsp--;
        if (state.failed) return ;
        match(input,84,FOLLOW_84_in_synpred1_Python2347); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Python

    // Delegated rules

    public final boolean synpred1_Python() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Python_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA105 dfa105 = new DFA105(this);
    protected DFA107 dfa107 = new DFA107(this);
    protected DFA109 dfa109 = new DFA109(this);
    static final String DFA30_eotS =
        "\25\uffff";
    static final String DFA30_eofS =
        "\25\uffff";
    static final String DFA30_minS =
        "\2\6\23\uffff";
    static final String DFA30_maxS =
        "\1\21\1\135\23\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\16\uffff";
    static final String DFA30_specialS =
        "\25\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\6\uffff\1\1\3\uffff\1\2",
            "\1\2\1\uffff\1\6\1\uffff\1\6\6\uffff\1\2\17\uffff\1\6\13\uffff"+
            "\2\6\3\uffff\2\6\1\uffff\1\6\1\uffff\6\6\40\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 207:12: ( options {k=2; } : COMMA test )*";
        }
    }
    static final String DFA40_eotS =
        "\4\uffff";
    static final String DFA40_eofS =
        "\4\uffff";
    static final String DFA40_minS =
        "\2\12\2\uffff";
    static final String DFA40_maxS =
        "\1\13\1\114\2\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA40_specialS =
        "\4\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\2\1\1",
            "\1\2\1\1\100\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "246:21: ( ( DOT )* dotted_name | ( DOT )+ )";
        }
    }
    static final String DFA66_eotS =
        "\20\uffff";
    static final String DFA66_eofS =
        "\1\2\17\uffff";
    static final String DFA66_minS =
        "\1\6\1\0\16\uffff";
    static final String DFA66_maxS =
        "\1\127\1\0\16\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\2\uffff\2\2\1\uffff\2\2\2\uffff\16\2\26\uffff\1\2\1\uffff"+
            "\2\2\26\uffff\1\2\4\uffff\1\1\3\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "317:5: ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Python()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\15\uffff";
    static final String DFA72_eofS =
        "\15\uffff";
    static final String DFA72_minS =
        "\1\41\11\uffff\1\10\2\uffff";
    static final String DFA72_maxS =
        "\1\134\11\uffff\1\74\2\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\1\12";
    static final String DFA72_specialS =
        "\15\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\50\uffff\1\10\12\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\uffff\1\14\26\uffff\1\13\13\uffff\2\14\3\uffff\2\14"+
            "\1\uffff\1\14\1\uffff\6\14",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "334:1: comp_op : ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | ALT_NOTEQUAL | NOTEQUAL | 'in' | NOT 'in' | 'is' | 'is' NOT );";
        }
    }
    static final String DFA90_eotS =
        "\23\uffff";
    static final String DFA90_eofS =
        "\23\uffff";
    static final String DFA90_minS =
        "\1\11\1\10\21\uffff";
    static final String DFA90_maxS =
        "\1\15\1\135\21\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\16\uffff";
    static final String DFA90_specialS =
        "\23\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\4\1\2\1\4\26\uffff\1\4\13\uffff\2\4\3\uffff\2\4\1\uffff"+
            "\1\4\1\uffff\6\4\40\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "()* loopback of 397:14: ( options {k=2; } : COMMA test )*";
        }
    }
    static final String DFA105_eotS =
        "\25\uffff";
    static final String DFA105_eofS =
        "\25\uffff";
    static final String DFA105_minS =
        "\2\6\23\uffff";
    static final String DFA105_maxS =
        "\2\121\23\uffff";
    static final String DFA105_acceptS =
        "\2\uffff\1\2\5\uffff\1\1\14\uffff";
    static final String DFA105_specialS =
        "\25\uffff}>";
    static final String[] DFA105_transitionS = {
            "\1\2\6\uffff\1\1\3\uffff\1\2\77\uffff\1\2",
            "\1\2\1\uffff\1\10\1\uffff\1\10\6\uffff\1\2\33\uffff\2\10\3"+
            "\uffff\2\10\1\uffff\1\10\1\uffff\6\10\24\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA105_eot = DFA.unpackEncodedString(DFA105_eotS);
    static final short[] DFA105_eof = DFA.unpackEncodedString(DFA105_eofS);
    static final char[] DFA105_min = DFA.unpackEncodedStringToUnsignedChars(DFA105_minS);
    static final char[] DFA105_max = DFA.unpackEncodedStringToUnsignedChars(DFA105_maxS);
    static final short[] DFA105_accept = DFA.unpackEncodedString(DFA105_acceptS);
    static final short[] DFA105_special = DFA.unpackEncodedString(DFA105_specialS);
    static final short[][] DFA105_transition;

    static {
        int numStates = DFA105_transitionS.length;
        DFA105_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA105_transition[i] = DFA.unpackEncodedString(DFA105_transitionS[i]);
        }
    }

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = DFA105_eot;
            this.eof = DFA105_eof;
            this.min = DFA105_min;
            this.max = DFA105_max;
            this.accept = DFA105_accept;
            this.special = DFA105_special;
            this.transition = DFA105_transition;
        }
        public String getDescription() {
            return "()* loopback of 422:17: ( options {k=2; } : COMMA expr )*";
        }
    }
    static final String DFA107_eotS =
        "\47\uffff";
    static final String DFA107_eofS =
        "\2\2\45\uffff";
    static final String DFA107_minS =
        "\2\6\45\uffff";
    static final String DFA107_maxS =
        "\1\127\1\135\45\uffff";
    static final String DFA107_acceptS =
        "\2\uffff\1\2\20\uffff\1\1\5\uffff\1\1\15\uffff";
    static final String DFA107_specialS =
        "\47\uffff}>";
    static final String[] DFA107_transitionS = {
            "\1\2\2\uffff\1\2\2\uffff\1\2\1\1\2\uffff\16\2\26\uffff\1\2\2"+
            "\uffff\1\2\33\uffff\1\2\3\uffff\1\2",
            "\1\2\1\uffff\1\31\1\2\1\31\1\uffff\2\2\2\uffff\16\2\3\uffff"+
            "\1\31\13\uffff\2\31\3\uffff\2\31\1\2\1\31\1\uffff\1\23\5\31"+
            "\26\uffff\1\2\3\uffff\1\2\5\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;

    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "()* loopback of 426:12: ( options {k=2; } : COMMA test )*";
        }
    }
    static final String DFA109_eotS =
        "\23\uffff";
    static final String DFA109_eofS =
        "\23\uffff";
    static final String DFA109_minS =
        "\1\15\1\10\21\uffff";
    static final String DFA109_maxS =
        "\1\66\1\135\21\uffff";
    static final String DFA109_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\16\uffff";
    static final String DFA109_specialS =
        "\23\uffff}>";
    static final String[] DFA109_transitionS = {
            "\1\1\50\uffff\1\2",
            "\1\4\1\uffff\1\4\26\uffff\1\4\13\uffff\2\4\3\uffff\2\4\1\uffff"+
            "\1\4\1\2\6\4\40\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "()* loopback of 429:29: ( options {k=2; } : COMMA test COLON test )*";
        }
    }
 

    public static final BitSet FOLLOW_NEWLINE_in_single_input62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_single_input79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_single_input96 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_single_input98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_file_input121 = new BitSet(new long[]{0x1FAC6002000005C2L,0x00000000E5CDBFF0L});
    public static final BitSet FOLLOW_stmt_in_file_input125 = new BitSet(new long[]{0x1FAC6002000005C2L,0x00000000E5CDBFF0L});
    public static final BitSet FOLLOW_NEWLINE_in_eval_input148 = new BitSet(new long[]{0x1FAC600200000540L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_eval_input152 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NEWLINE_in_eval_input155 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_decorator_in_decorators176 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AT_in_decorator195 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_dotted_attr_in_decorator197 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_LPAREN_in_decorator200 = new BitSet(new long[]{0x1FAC60020000C700L,0x0000000020000000L});
    public static final BitSet FOLLOW_arglist_in_decorator202 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_decorator205 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_decorator209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_dotted_attr231 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_DOT_in_dotted_attr234 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_dotted_attr236 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_decorators_in_funcdef251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_funcdef254 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_funcdef256 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parameters_in_funcdef258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_funcdef260 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_funcdef262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameters279 = new BitSet(new long[]{0x000000000000C700L});
    public static final BitSet FOLLOW_varargslist_in_parameters282 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_parameters286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defparameter_in_varargslist306 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_varargslist316 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_defparameter_in_varargslist318 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_varargslist337 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_STAR_in_varargslist359 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_varargslist361 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_varargslist364 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist366 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_varargslist368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist392 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_varargslist394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_varargslist448 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_varargslist450 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_varargslist453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist455 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_varargslist457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist475 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_varargslist477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fpdef_in_defparameter498 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ASSIGN_in_defparameter501 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_defparameter503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_fpdef527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_fpdef537 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_fplist_in_fpdef539 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_fpdef541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fpdef_in_fplist556 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_fplist566 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_fpdef_in_fplist568 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_fplist573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_stmt591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_small_stmt_in_simple_stmt614 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_SEMI_in_simple_stmt624 = new BitSet(new long[]{0x1FAC600200000500L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_small_stmt_in_simple_stmt626 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_SEMI_in_simple_stmt631 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_simple_stmt635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_stmt_in_small_stmt656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_small_stmt671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_del_stmt_in_small_stmt686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pass_stmt_in_small_stmt701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_stmt_in_small_stmt716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_stmt_in_small_stmt731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_stmt_in_small_stmt746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exec_stmt_in_small_stmt761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assert_stmt_in_small_stmt776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt796 = new BitSet(new long[]{0x000000003FFD0002L});
    public static final BitSet FOLLOW_augassign_in_expr_stmt812 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000F00L});
    public static final BitSet FOLLOW_yield_expr_in_expr_stmt814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_augassign_in_expr_stmt830 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigns_in_expr_stmt848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_testlist_in_assigns886 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_assign_yield_in_assigns895 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_testlist916 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_assign_testlist918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_yield938 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000F00L});
    public static final BitSet FOLLOW_yield_expr_in_assign_yield940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_augassign0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_print_stmt1126 = new BitSet(new long[]{0x1FAC600240000502L,0x0000000020000000L});
    public static final BitSet FOLLOW_printlist_in_print_stmt1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHTSHIFT_in_print_stmt1133 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_printlist_in_print_stmt1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_printlist1165 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_printlist1176 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_printlist1178 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_printlist1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_del_stmt1199 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_exprlist_in_del_stmt1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_pass_stmt1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_stmt_in_flow_stmt1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_stmt_in_flow_stmt1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_flow_stmt1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_stmt_in_flow_stmt1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yield_stmt_in_flow_stmt1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_break_stmt1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_continue_stmt1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_return_stmt1356 = new BitSet(new long[]{0x1FAC600200000502L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_return_stmt1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yield_expr_in_yield_stmt1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_raise_stmt1401 = new BitSet(new long[]{0x1FAC600200000502L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_raise_stmt1404 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_raise_stmt1407 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_raise_stmt1409 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_raise_stmt1412 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_raise_stmt1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_name_in_import_stmt1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_from_in_import_stmt1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_import_name1476 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_dotted_as_names_in_import_name1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_import_from1498 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_DOT_in_import_from1501 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_dotted_name_in_import_from1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_import_from1508 = new BitSet(new long[]{0x0000000000000800L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_import_from1512 = new BitSet(new long[]{0x0000000000004500L});
    public static final BitSet FOLLOW_STAR_in_import_from1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_as_names_in_import_from1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_import_from1565 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_import_as_names_in_import_from1567 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_import_from1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_as_name_in_import_as_names1605 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_import_as_names1608 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_import_as_name_in_import_as_names1610 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_import_as_names1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_import_as_name1642 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_import_as_name1645 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_import_as_name1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotted_name_in_dotted_as_name1673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_dotted_as_name1676 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_dotted_as_name1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotted_as_name_in_dotted_as_names1704 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_dotted_as_names1707 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_dotted_as_name_in_dotted_as_names1709 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_NAME_in_dotted_name1735 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_DOT_in_dotted_name1738 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_dotted_name1740 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_79_in_global_stmt1763 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_global_stmt1765 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_global_stmt1768 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_global_stmt1770 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_80_in_exec_stmt1793 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_expr_in_exec_stmt1795 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_exec_stmt1798 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_exec_stmt1800 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_exec_stmt1803 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_exec_stmt1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_assert_stmt1828 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_assert_stmt1830 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_assert_stmt1833 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_assert_stmt1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_compound_stmt1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_compound_stmt1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_compound_stmt1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_stmt_in_compound_stmt1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_stmt_in_compound_stmt1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcdef_in_compound_stmt1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classdef_in_compound_stmt1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_if_stmt1988 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_if_stmt1990 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_if_stmt1992 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_if_stmt1994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_elif_clause_in_if_stmt1996 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_84_in_if_stmt2001 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_if_stmt2003 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_if_stmt2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_elif_clause2023 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_elif_clause2025 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_elif_clause2027 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_elif_clause2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_while_stmt2050 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_while_stmt2052 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_while_stmt2054 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_while_stmt2056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_stmt2059 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_while_stmt2061 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_while_stmt2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_for_stmt2085 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_exprlist_in_for_stmt2087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_for_stmt2089 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_for_stmt2091 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_for_stmt2093 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_for_stmt2095 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_stmt2098 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_for_stmt2100 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_for_stmt2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_try_stmt2122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_try_stmt2124 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_try_stmt2126 = new BitSet(new long[]{0x0000000000000000L,0x000000000A000000L});
    public static final BitSet FOLLOW_except_clause_in_try_stmt2141 = new BitSet(new long[]{0x0000000000000002L,0x000000000A100000L});
    public static final BitSet FOLLOW_84_in_try_stmt2145 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_try_stmt2147 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_try_stmt2149 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_try_stmt2154 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_try_stmt2156 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_try_stmt2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_try_stmt2175 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_try_stmt2177 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_try_stmt2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_with_stmt2209 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_with_stmt2211 = new BitSet(new long[]{0x0000000000001400L,0x0000000000004000L});
    public static final BitSet FOLLOW_with_var_in_with_stmt2214 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_with_stmt2218 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_with_stmt2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_with_var2237 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_expr_in_with_var2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_except_clause2262 = new BitSet(new long[]{0x1FAC600200001500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_except_clause2265 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_except_clause2268 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_except_clause2270 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_except_clause2276 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_except_clause2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_suite2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_suite2311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INDENT_in_suite2313 = new BitSet(new long[]{0x1FAC6002000005E0L,0x00000000E5CDBFF0L});
    public static final BitSet FOLLOW_stmt_in_suite2316 = new BitSet(new long[]{0x1FAC6002000005E0L,0x00000000E5CDBFF0L});
    public static final BitSet FOLLOW_DEDENT_in_suite2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_test_in_test2334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_test2352 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_or_test_in_test2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_test2356 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_test2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdef_in_test2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_test_in_or_test2381 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_OR_in_or_test2384 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_and_test_in_or_test2386 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_not_test_in_and_test2405 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_AND_in_and_test2408 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_not_test_in_and_test2410 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_NOT_in_not_test2430 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_not_test_in_not_test2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_in_not_test2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_comparison2462 = new BitSet(new long[]{0x000001FE00000002L,0x0000000010020000L});
    public static final BitSet FOLLOW_comp_op_in_comparison2465 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_expr_in_comparison2467 = new BitSet(new long[]{0x000001FE00000002L,0x0000000010020000L});
    public static final BitSet FOLLOW_LESS_in_comp_op2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_comp_op2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_comp_op2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_comp_op2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSEQUAL_in_comp_op2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALT_NOTEQUAL_in_comp_op2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_comp_op2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_comp_op2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_comp_op2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_comp_op2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_comp_op2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_comp_op2610 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NOT_in_comp_op2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_expr_in_expr2629 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_VBAR_in_expr2632 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_xor_expr_in_expr2634 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_and_expr_in_xor_expr2650 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_CIRCUMFLEX_in_xor_expr2653 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_and_expr_in_xor_expr2655 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_shift_expr_in_and_expr2675 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_AMPER_in_and_expr2678 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_shift_expr_in_and_expr2680 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_arith_expr_in_shift_expr2700 = new BitSet(new long[]{0x0000100040000002L});
    public static final BitSet FOLLOW_set_in_shift_expr2703 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_arith_expr_in_shift_expr2709 = new BitSet(new long[]{0x0000100040000002L});
    public static final BitSet FOLLOW_term_in_arith_expr2730 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_set_in_arith_expr2733 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_term_in_arith_expr2739 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_factor_in_term2760 = new BitSet(new long[]{0x0003800000004002L});
    public static final BitSet FOLLOW_set_in_term2763 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_factor_in_term2780 = new BitSet(new long[]{0x0003800000004002L});
    public static final BitSet FOLLOW_PLUS_in_factor2796 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_factor_in_factor2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor2809 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_factor_in_factor2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor2822 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_factor_in_factor2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_power_in_factor2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_power2851 = new BitSet(new long[]{0x0008000000008902L});
    public static final BitSet FOLLOW_trailer_in_power2854 = new BitSet(new long[]{0x0008000000008902L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_power2866 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_factor_in_power2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom2885 = new BitSet(new long[]{0x1FAC600200000700L,0x00000000A0000F00L});
    public static final BitSet FOLLOW_yield_expr_in_atom2897 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_testlist_gexp_in_atom2908 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_atom2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_atom2936 = new BitSet(new long[]{0x1FBC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_listmaker_in_atom2939 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_atom2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_atom2952 = new BitSet(new long[]{0x1FEC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_dictmaker_in_atom2955 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_atom2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKQUOTE_in_atom2968 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_atom2970 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_BACKQUOTE_in_atom2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_atom2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGINT_in_atom2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPLEX_in_atom3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom3027 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_test_in_listmaker3043 = new BitSet(new long[]{0x0000000000002002L,0x0000000000800000L});
    public static final BitSet FOLLOW_list_for_in_listmaker3060 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_listmaker3084 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_listmaker3086 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_listmaker3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_testlist_gexp3130 = new BitSet(new long[]{0x0000000000002002L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_testlist_gexp3143 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_testlist_gexp3145 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_testlist_gexp3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gen_for_in_testlist_gexp3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_lambdef3204 = new BitSet(new long[]{0x000000000000D500L});
    public static final BitSet FOLLOW_varargslist_in_lambdef3207 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_lambdef3211 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_lambdef3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_trailer3229 = new BitSet(new long[]{0x1FAC60020000C700L,0x0000000020000000L});
    public static final BitSet FOLLOW_arglist_in_trailer3232 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_trailer3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_trailer3248 = new BitSet(new long[]{0x1FAC600200001D00L,0x0000000020000000L});
    public static final BitSet FOLLOW_subscriptlist_in_trailer3250 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_trailer3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_trailer3264 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_trailer3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscript_in_subscriptlist3283 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_subscriptlist3293 = new BitSet(new long[]{0x1FAC600200001D00L,0x0000000020000000L});
    public static final BitSet FOLLOW_subscript_in_subscriptlist3295 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_subscriptlist3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_subscript3325 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_subscript3327 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_subscript3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_subscript3343 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COLON_in_subscript3346 = new BitSet(new long[]{0x1FAC600200001502L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_subscript3349 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_sliceop_in_subscript3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_subscript3372 = new BitSet(new long[]{0x1FAC600200001502L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_subscript3375 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_sliceop_in_subscript3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sliceop3401 = new BitSet(new long[]{0x1FAC600200000502L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_sliceop3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprlist3423 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_exprlist3434 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_expr_in_exprlist3436 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_exprlist3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_testlist3465 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_testlist3476 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_testlist3478 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_testlist3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_dictmaker3498 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_dictmaker3500 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_dictmaker3502 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_dictmaker3512 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_dictmaker3514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_dictmaker3516 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_dictmaker3518 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_dictmaker3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_classdef3543 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_classdef3545 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_LPAREN_in_classdef3548 = new BitSet(new long[]{0x1FAC600200000700L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_classdef3550 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_classdef3553 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_classdef3557 = new BitSet(new long[]{0x1FAC600200000540L,0x00000000A005BFE0L});
    public static final BitSet FOLLOW_suite_in_classdef3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arglist3576 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_arglist3579 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_argument_in_arglist3581 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_arglist3597 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_STAR_in_arglist3613 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_arglist3615 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_arglist3618 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_arglist3620 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_arglist3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_arglist3640 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_arglist3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_arglist3684 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_arglist3686 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_arglist3689 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_arglist3691 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_arglist3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_arglist3709 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_arglist3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_argument3728 = new BitSet(new long[]{0x0000000000012000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_argument3733 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_argument3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gen_for_in_argument3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_for_in_list_iter3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_if_in_list_iter3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_list_for3793 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_exprlist_in_list_for3795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_list_for3797 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_list_for3799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000880000L});
    public static final BitSet FOLLOW_list_iter_in_list_for3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_list_if3822 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_list_if3824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000880000L});
    public static final BitSet FOLLOW_list_iter_in_list_if3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gen_for_in_gen_iter3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gen_if_in_gen_iter3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_gen_for3873 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_exprlist_in_gen_for3875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_gen_for3877 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_or_test_in_gen_for3879 = new BitSet(new long[]{0x0000000000002002L,0x0000000000880000L});
    public static final BitSet FOLLOW_gen_iter_in_gen_for3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_gen_if3897 = new BitSet(new long[]{0x1FAC600200000500L,0x0000000020000000L});
    public static final BitSet FOLLOW_test_in_gen_if3899 = new BitSet(new long[]{0x0000000000002002L,0x0000000000880000L});
    public static final BitSet FOLLOW_gen_iter_in_gen_if3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_yield_expr3917 = new BitSet(new long[]{0x1FAC600200000502L,0x0000000020000000L});
    public static final BitSet FOLLOW_testlist_in_yield_expr3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_synpred1_Python2343 = new BitSet(new long[]{0x1FAC600200000500L});
    public static final BitSet FOLLOW_or_test_in_synpred1_Python2345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred1_Python2347 = new BitSet(new long[]{0x0000000000000002L});

}