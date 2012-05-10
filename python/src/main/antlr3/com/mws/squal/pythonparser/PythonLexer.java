// $ANTLR 3.3 Nov 30, 2010 12:50:56 /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g 2011-03-17 13:06:40

package com.mws.squal.pythonparser;

import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PythonLexer extends Lexer {
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

    /** Handles context-sensitive lexing of implicit line joining such as
     *  the case where newline is ignored in cases like this:
     *  a = [3,
     *       4]
     */
    int implicitLineJoiningLevel = 0;

    int currentIndentation = 0;
    int startOfLineIndex;

    Set<Integer> commentLines = new HashSet<Integer>();
    Set<Integer> mixedCodeCommentLines = new HashSet<Integer>();
    Set<Integer> wsLines = new HashSet<Integer>();

    int previousLine = -1;

    int getStartPos() {
        int curIndex = getCharIndex();
        int matchLen = getText().length();
        String textFromStartOfLine =
            getCharStream().substring(startOfLineIndex, curIndex - matchLen - 1);
        System.out.println("Line: " + getLine() + " Start pos:" + textFromStartOfLine.length());
        return textFromStartOfLine.length();
    }



    // delegates
    // delegators

    public PythonLexer() {;} 
    public PythonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PythonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g"; }

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:37:7: ( 'def' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:37:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:38:7: ( 'print' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:38:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:39:7: ( 'del' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:39:9: 'del'
            {
            match("del"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:40:7: ( 'pass' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:40:9: 'pass'
            {
            match("pass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:41:7: ( 'break' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:41:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:42:7: ( 'continue' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:42:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:43:7: ( 'return' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:43:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:44:7: ( 'raise' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:44:9: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:45:7: ( 'import' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:45:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:46:7: ( 'from' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:46:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:47:7: ( 'as' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:47:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:48:7: ( 'global' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:48:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:49:7: ( 'exec' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:49:9: 'exec'
            {
            match("exec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:50:7: ( 'in' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:50:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:51:7: ( 'assert' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:51:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:52:7: ( 'if' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:52:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:53:7: ( 'else' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:53:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:54:7: ( 'elif' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:54:9: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:55:7: ( 'while' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:55:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:56:7: ( 'for' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:56:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:57:7: ( 'try' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:57:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:58:7: ( 'finally' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:58:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:59:7: ( 'with' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:59:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:60:7: ( 'except' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:60:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:61:7: ( 'is' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:61:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:62:7: ( 'lambda' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:62:9: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:63:7: ( 'class' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:63:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:64:7: ( 'yield' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:64:9: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:471:11: ( '(' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:471:13: '('
            {
            match('('); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:473:11: ( ')' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:473:13: ')'
            {
            match(')'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:475:11: ( '[' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:475:13: '['
            {
            match('['); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:477:11: ( ']' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:477:13: ']'
            {
            match(']'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:479:11: ( ':' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:479:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:481:10: ( ',' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:481:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:483:9: ( ';' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:483:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:485:9: ( '+' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:485:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:487:10: ( '-' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:487:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:489:9: ( '*' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:489:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:491:10: ( '/' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:491:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "VBAR"
    public final void mVBAR() throws RecognitionException {
        try {
            int _type = VBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:493:9: ( '|' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:493:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAR"

    // $ANTLR start "AMPER"
    public final void mAMPER() throws RecognitionException {
        try {
            int _type = AMPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:495:10: ( '&' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:495:12: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:497:9: ( '<' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:497:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:499:12: ( '>' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:499:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:501:11: ( '=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:501:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:503:12: ( '%' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:503:14: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "BACKQUOTE"
    public final void mBACKQUOTE() throws RecognitionException {
        try {
            int _type = BACKQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:505:14: ( '`' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:505:16: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BACKQUOTE"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:507:11: ( '{' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:507:13: '{'
            {
            match('{'); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:509:11: ( '}' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:509:13: '}'
            {
            match('}'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "CIRCUMFLEX"
    public final void mCIRCUMFLEX() throws RecognitionException {
        try {
            int _type = CIRCUMFLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:511:15: ( '^' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:511:17: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CIRCUMFLEX"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:513:10: ( '~' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:513:12: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:515:10: ( '==' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:515:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:517:13: ( '!=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:517:15: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "ALT_NOTEQUAL"
    public final void mALT_NOTEQUAL() throws RecognitionException {
        try {
            int _type = ALT_NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:519:13: ( '<>' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:519:15: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALT_NOTEQUAL"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:521:14: ( '<=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:521:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "LEFTSHIFT"
    public final void mLEFTSHIFT() throws RecognitionException {
        try {
            int _type = LEFTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:523:14: ( '<<' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:523:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTSHIFT"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:525:17: ( '>=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:525:19: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "RIGHTSHIFT"
    public final void mRIGHTSHIFT() throws RecognitionException {
        try {
            int _type = RIGHTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:527:15: ( '>>' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:527:17: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTSHIFT"

    // $ANTLR start "PLUSEQUAL"
    public final void mPLUSEQUAL() throws RecognitionException {
        try {
            int _type = PLUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:529:14: ( '+=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:529:16: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSEQUAL"

    // $ANTLR start "MINUSEQUAL"
    public final void mMINUSEQUAL() throws RecognitionException {
        try {
            int _type = MINUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:531:15: ( '-=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:531:17: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUSEQUAL"

    // $ANTLR start "DOUBLESTAR"
    public final void mDOUBLESTAR() throws RecognitionException {
        try {
            int _type = DOUBLESTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:533:15: ( '**' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:533:17: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESTAR"

    // $ANTLR start "STAREQUAL"
    public final void mSTAREQUAL() throws RecognitionException {
        try {
            int _type = STAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:535:14: ( '*=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:535:16: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAREQUAL"

    // $ANTLR start "DOUBLESLASH"
    public final void mDOUBLESLASH() throws RecognitionException {
        try {
            int _type = DOUBLESLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:537:16: ( '//' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:537:18: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESLASH"

    // $ANTLR start "SLASHEQUAL"
    public final void mSLASHEQUAL() throws RecognitionException {
        try {
            int _type = SLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:539:15: ( '/=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:539:17: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASHEQUAL"

    // $ANTLR start "VBAREQUAL"
    public final void mVBAREQUAL() throws RecognitionException {
        try {
            int _type = VBAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:541:14: ( '|=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:541:16: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAREQUAL"

    // $ANTLR start "PERCENTEQUAL"
    public final void mPERCENTEQUAL() throws RecognitionException {
        try {
            int _type = PERCENTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:543:17: ( '%=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:543:19: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTEQUAL"

    // $ANTLR start "AMPEREQUAL"
    public final void mAMPEREQUAL() throws RecognitionException {
        try {
            int _type = AMPEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:545:15: ( '&=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:545:17: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPEREQUAL"

    // $ANTLR start "CIRCUMFLEXEQUAL"
    public final void mCIRCUMFLEXEQUAL() throws RecognitionException {
        try {
            int _type = CIRCUMFLEXEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:547:20: ( '^=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:547:22: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CIRCUMFLEXEQUAL"

    // $ANTLR start "LEFTSHIFTEQUAL"
    public final void mLEFTSHIFTEQUAL() throws RecognitionException {
        try {
            int _type = LEFTSHIFTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:549:19: ( '<<=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:549:21: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTSHIFTEQUAL"

    // $ANTLR start "RIGHTSHIFTEQUAL"
    public final void mRIGHTSHIFTEQUAL() throws RecognitionException {
        try {
            int _type = RIGHTSHIFTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:551:20: ( '>>=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:551:22: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTSHIFTEQUAL"

    // $ANTLR start "DOUBLESTAREQUAL"
    public final void mDOUBLESTAREQUAL() throws RecognitionException {
        try {
            int _type = DOUBLESTAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:553:20: ( '**=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:553:22: '**='
            {
            match("**="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESTAREQUAL"

    // $ANTLR start "DOUBLESLASHEQUAL"
    public final void mDOUBLESLASHEQUAL() throws RecognitionException {
        try {
            int _type = DOUBLESLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:555:21: ( '//=' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:555:23: '//='
            {
            match("//="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESLASHEQUAL"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:557:5: ( '.' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:557:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:559:4: ( '@' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:559:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:561:5: ( 'and' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:561:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:563:4: ( 'or' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:563:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:565:5: ( 'not' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:565:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:568:5: ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:568:9: '.' DIGITS ( Exponent )?
                    {
                    match('.'); 
                    mDIGITS(); 
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:568:20: ( Exponent )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='E'||LA1_0=='e') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:568:21: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:569:9: DIGITS '.' Exponent
                    {
                    mDIGITS(); 
                    match('.'); 
                    mExponent(); 

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:570:9: DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent )
                    {
                    mDIGITS(); 
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:570:16: ( '.' ( DIGITS ( Exponent )? )? | Exponent )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    else if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:570:17: '.' ( DIGITS ( Exponent )? )?
                            {
                            match('.'); 
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:570:21: ( DIGITS ( Exponent )? )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:570:22: DIGITS ( Exponent )?
                                    {
                                    mDIGITS(); 
                                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:570:29: ( Exponent )?
                                    int alt2=2;
                                    int LA2_0 = input.LA(1);

                                    if ( (LA2_0=='E'||LA2_0=='e') ) {
                                        alt2=1;
                                    }
                                    switch (alt2) {
                                        case 1 :
                                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:570:30: Exponent
                                            {
                                            mExponent(); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:570:45: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "LONGINT"
    public final void mLONGINT() throws RecognitionException {
        try {
            int _type = LONGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:574:5: ( INT ( 'l' | 'L' ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:574:9: INT ( 'l' | 'L' )
            {
            mINT(); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONGINT"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:579:5: ( ( 'e' | 'E' ) ( '+' | '-' )? DIGITS )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:579:10: ( 'e' | 'E' ) ( '+' | '-' )? DIGITS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:579:22: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:582:5: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ | '0' ( DIGITS )* | '1' .. '9' ( DIGITS )* )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='X'||LA10_1=='x') ) {
                    alt10=1;
                }
                else {
                    alt10=2;}
            }
            else if ( ((LA10_0>='1' && LA10_0<='9')) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:583:9: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:583:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:585:9: '0' ( DIGITS )*
                    {
                    match('0'); 
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:585:13: ( DIGITS )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:585:13: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:586:9: '1' .. '9' ( DIGITS )*
                    {
                    matchRange('1','9'); 
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:586:18: ( DIGITS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:586:18: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMPLEX"
    public final void mCOMPLEX() throws RecognitionException {
        try {
            int _type = COMPLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:590:5: ( INT ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:590:9: INT ( 'j' | 'J' )
                    {
                    mINT(); 
                    if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:591:9: FLOAT ( 'j' | 'J' )
                    {
                    mFLOAT(); 
                    if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPLEX"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:595:8: ( ( '0' .. '9' )+ )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:595:10: ( '0' .. '9' )+
            {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:595:10: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:595:12: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:597:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:597:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:598:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:605:5: ( ( 'r' | 'u' | 'ur' )? ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:605:9: ( 'r' | 'u' | 'ur' )? ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:605:9: ( 'r' | 'u' | 'ur' )?
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='r') ) {
                alt14=1;
            }
            else if ( (LA14_0=='u') ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2=='r') ) {
                    alt14=3;
                }
                else if ( (LA14_2=='\"'||LA14_2=='\'') ) {
                    alt14=2;
                }
            }
            switch (alt14) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:605:10: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:605:14: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:605:18: 'ur'
                    {
                    match("ur"); 


                    }
                    break;

            }

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:606:9: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\'') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='\'') ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3=='\'') ) {
                        alt19=1;
                    }
                    else {
                        alt19=4;}
                }
                else if ( ((LA19_1>='\u0000' && LA19_1<='\t')||(LA19_1>='\u000B' && LA19_1<='&')||(LA19_1>='(' && LA19_1<='\uFFFF')) ) {
                    alt19=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0=='\"') ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2=='\"') ) {
                    int LA19_5 = input.LA(3);

                    if ( (LA19_5=='\"') ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;}
                }
                else if ( ((LA19_2>='\u0000' && LA19_2<='\t')||(LA19_2>='\u000B' && LA19_2<='!')||(LA19_2>='#' && LA19_2<='\uFFFF')) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:606:13: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:606:22: ( options {greedy=false; } : . )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\'') ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1=='\'') ) {
                                int LA15_3 = input.LA(3);

                                if ( (LA15_3=='\'') ) {
                                    alt15=2;
                                }
                                else if ( ((LA15_3>='\u0000' && LA15_3<='&')||(LA15_3>='(' && LA15_3<='\uFFFF')) ) {
                                    alt15=1;
                                }


                            }
                            else if ( ((LA15_1>='\u0000' && LA15_1<='&')||(LA15_1>='(' && LA15_1<='\uFFFF')) ) {
                                alt15=1;
                            }


                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\uFFFF')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:606:48: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:607:13: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:607:19: ( options {greedy=false; } : . )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\"') ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1=='\"') ) {
                                int LA16_3 = input.LA(3);

                                if ( (LA16_3=='\"') ) {
                                    alt16=2;
                                }
                                else if ( ((LA16_3>='\u0000' && LA16_3<='!')||(LA16_3>='#' && LA16_3<='\uFFFF')) ) {
                                    alt16=1;
                                }


                            }
                            else if ( ((LA16_1>='\u0000' && LA16_1<='!')||(LA16_1>='#' && LA16_1<='\uFFFF')) ) {
                                alt16=1;
                            }


                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:607:45: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 3 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:608:13: '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:608:17: ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:608:18: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:608:22: ~ ( '\\\\' | '\\n' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 4 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:609:13: '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:609:18: ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:609:19: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:609:23: ~ ( '\\\\' | '\\n' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:615:5: ( '\\\\' . )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:615:10: '\\\\' .
            {
            match('\\'); 
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "CONTINUED_LINE"
    public final void mCONTINUED_LINE() throws RecognitionException {
        try {
            int _type = CONTINUED_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken nl=null;

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:623:5: ( '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* (nl= NEWLINE | ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:623:10: '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* (nl= NEWLINE | )
            {
            match('\\'); 
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:623:15: ( '\\r' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:623:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:623:28: ( ' ' | '\\t' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\t'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             _channel=HIDDEN; 
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:624:10: (nl= NEWLINE | )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||(LA22_0>='\f' && LA22_0<='\r')) ) {
                alt22=1;
            }
            else {
                alt22=2;}
            switch (alt22) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:624:12: nl= NEWLINE
                    {
                    int nlStart1463 = getCharIndex();
                    int nlStartLine1463 = getLine();
                    int nlStartCharPos1463 = getCharPositionInLine();
                    mNEWLINE(); 
                    nl = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nlStart1463, getCharIndex()-1);
                    nl.setLine(nlStartLine1463);
                    nl.setCharPositionInLine(nlStartCharPos1463);
                    emit(new ClassicToken(NEWLINE,nl.getText()));

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:626:10: 
                    {
                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUED_LINE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:636:5: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' )+ )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:636:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            {
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:636:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\n'||(LA25_0>='\f' && LA25_0<='\r')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:636:10: ( '\\u000C' )? ( '\\r' )? '\\n'
            	    {
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:636:10: ( '\\u000C' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0=='\f') ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:636:11: '\\u000C'
            	            {
            	            match('\f'); 

            	            }
            	            break;

            	    }

            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:636:21: ( '\\r' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0=='\r') ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:636:22: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


                    previousLine = getLine() - 1;
                    System.out.println("Current line: " + getLine() + " previous line " + previousLine);
                    startOfLineIndex = getCharIndex();
                    if (getStartPos() == 0 || implicitLineJoiningLevel > 0)
                        _channel=HIDDEN;
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:646:5: ({...}? => ( ' ' | '\\t' | '\\u000C' )+ )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:646:10: {...}? => ( ' ' | '\\t' | '\\u000C' )+
            {
            if ( !((getStartPos() > 0)) ) {
                throw new FailedPredicateException(input, "WS", "getStartPos() > 0");
            }
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:646:33: ( ' ' | '\\t' | '\\u000C' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\t'||LA26_0=='\f'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LEADING_WS"
    public final void mLEADING_WS() throws RecognitionException {
        try {
            int _type = LEADING_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                int spaces = 0;

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:659:5: ({...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:659:9: {...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            {
            if ( !((getStartPos()==0)) ) {
                throw new FailedPredicateException(input, "LEADING_WS", "getStartPos()==0");
            }
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:660:9: ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==' ') ) {
                int LA31_1 = input.LA(2);

                if ( ((implicitLineJoiningLevel>0)) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA31_0=='\t') ) {
                int LA31_2 = input.LA(2);

                if ( ((implicitLineJoiningLevel>0)) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:660:13: {...}? ( ' ' | '\\t' )+
                    {
                    if ( !((implicitLineJoiningLevel>0)) ) {
                        throw new FailedPredicateException(input, "LEADING_WS", "implicitLineJoiningLevel>0");
                    }
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:660:43: ( ' ' | '\\t' )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\t'||LA27_0==' ') ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:661:17: ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )*
                    {
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:661:17: ( ' ' | '\\t' )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==' ') ) {
                            alt28=1;
                        }
                        else if ( (LA28_0=='\t') ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:661:23: ' '
                    	    {
                    	    match(' '); 
                    	     spaces++; 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:662:18: '\\t'
                    	    {
                    	    match('\t'); 
                    	     spaces += 8; spaces -= (spaces % 8); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                                // make a string of n spaces where n is column number - 1
                                    char[] indentation = new char[spaces];
                                        for (int i=0; i<spaces; i++) {
                                        indentation[i] = ' ';
                                    }
                                    String s = new String(indentation);
                                    emit(new ClassicToken(LEADING_WS, s));
                                    int lineIndentation = s.length();
                                    System.out.println("line indent: " + lineIndentation);
                                    if (currentIndentation < lineIndentation) {
                                        emit(new ClassicToken(INDENT, s));
                                        currentIndentation = lineIndentation;
                                    } else if (currentIndentation > lineIndentation) {
                                        emit(new ClassicToken(DEDENT, s));
                                        currentIndentation = lineIndentation;
                                    }
                                
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:683:13: ( ( '\\r' )? '\\n' )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:683:15: ( '\\r' )? '\\n'
                    	    {
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:683:15: ( '\\r' )?
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0=='\r') ) {
                    	        alt29=1;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:683:16: '\\r'
                    	            {
                    	            match('\r'); 

                    	            }
                    	            break;

                    	    }

                    	    match('\n'); 
                    	    _channel=HIDDEN; wsLines.add(getLine());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEADING_WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                _channel=HIDDEN;

            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:709:5: ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ | {...}? => '#' (~ '\\n' )* )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:709:10: {...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+
                    {
                    if ( !((getStartPos() == 0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "getStartPos() == 0");
                    }
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:709:34: ( ' ' | '\\t' )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0=='\t'||LA32_0==' ') ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    match('#'); 
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:709:50: (~ '\\n' )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='\uFFFF')) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:709:51: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:709:59: ( '\\n' )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0=='\n') ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:709:59: '\\n'
                    	    {
                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                            commentLines.add(getLine());
                        

                    }
                    break;
                case 2 :
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:713:10: {...}? => '#' (~ '\\n' )*
                    {
                    if ( !((getStartPos() > 0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "getStartPos() > 0");
                    }
                    match('#'); 
                    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:713:37: (~ '\\n' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>='\u0000' && LA35_0<='\t')||(LA35_0>='\u000B' && LA35_0<='\uFFFF')) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:713:38: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                            mixedCodeCommentLines.add(getLine());
                        

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "DEDENT"
    public final void mDEDENT() throws RecognitionException {
        try {
            int _type = DEDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:720:7: ({...}? => ( '\\n' ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:720:9: {...}? => ( '\\n' )
            {
            if ( !((0==1)) ) {
                throw new FailedPredicateException(input, "DEDENT", "0==1");
            }
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:720:19: ( '\\n' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:720:20: '\\n'
            {
            match('\n'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEDENT"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:721:7: ({...}? => ( '\\n' ) )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:721:9: {...}? => ( '\\n' )
            {
            if ( !((0==1)) ) {
                throw new FailedPredicateException(input, "INDENT", "0==1");
            }
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:721:19: ( '\\n' )
            // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:721:20: '\\n'
            {
            match('\n'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDENT"

    public void mTokens() throws RecognitionException {
        // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:8: ( T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | DOT | AT | AND | OR | NOT | FLOAT | LONGINT | INT | COMPLEX | NAME | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT | DEDENT | INDENT )
        int alt37=89;
        alt37 = dfa37.predict(input);
        switch (alt37) {
            case 1 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:10: T__68
                {
                mT__68(); 

                }
                break;
            case 2 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:16: T__69
                {
                mT__69(); 

                }
                break;
            case 3 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:22: T__70
                {
                mT__70(); 

                }
                break;
            case 4 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:28: T__71
                {
                mT__71(); 

                }
                break;
            case 5 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:34: T__72
                {
                mT__72(); 

                }
                break;
            case 6 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:40: T__73
                {
                mT__73(); 

                }
                break;
            case 7 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:46: T__74
                {
                mT__74(); 

                }
                break;
            case 8 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:52: T__75
                {
                mT__75(); 

                }
                break;
            case 9 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:58: T__76
                {
                mT__76(); 

                }
                break;
            case 10 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:64: T__77
                {
                mT__77(); 

                }
                break;
            case 11 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:70: T__78
                {
                mT__78(); 

                }
                break;
            case 12 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:76: T__79
                {
                mT__79(); 

                }
                break;
            case 13 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:82: T__80
                {
                mT__80(); 

                }
                break;
            case 14 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:88: T__81
                {
                mT__81(); 

                }
                break;
            case 15 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:94: T__82
                {
                mT__82(); 

                }
                break;
            case 16 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:100: T__83
                {
                mT__83(); 

                }
                break;
            case 17 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:106: T__84
                {
                mT__84(); 

                }
                break;
            case 18 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:112: T__85
                {
                mT__85(); 

                }
                break;
            case 19 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:118: T__86
                {
                mT__86(); 

                }
                break;
            case 20 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:124: T__87
                {
                mT__87(); 

                }
                break;
            case 21 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:130: T__88
                {
                mT__88(); 

                }
                break;
            case 22 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:136: T__89
                {
                mT__89(); 

                }
                break;
            case 23 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:142: T__90
                {
                mT__90(); 

                }
                break;
            case 24 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:148: T__91
                {
                mT__91(); 

                }
                break;
            case 25 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:154: T__92
                {
                mT__92(); 

                }
                break;
            case 26 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:160: T__93
                {
                mT__93(); 

                }
                break;
            case 27 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:166: T__94
                {
                mT__94(); 

                }
                break;
            case 28 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:172: T__95
                {
                mT__95(); 

                }
                break;
            case 29 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:178: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 30 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:185: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 31 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:192: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 32 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:199: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 33 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:206: COLON
                {
                mCOLON(); 

                }
                break;
            case 34 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:212: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 35 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:218: SEMI
                {
                mSEMI(); 

                }
                break;
            case 36 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:223: PLUS
                {
                mPLUS(); 

                }
                break;
            case 37 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:228: MINUS
                {
                mMINUS(); 

                }
                break;
            case 38 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:234: STAR
                {
                mSTAR(); 

                }
                break;
            case 39 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:239: SLASH
                {
                mSLASH(); 

                }
                break;
            case 40 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:245: VBAR
                {
                mVBAR(); 

                }
                break;
            case 41 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:250: AMPER
                {
                mAMPER(); 

                }
                break;
            case 42 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:256: LESS
                {
                mLESS(); 

                }
                break;
            case 43 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:261: GREATER
                {
                mGREATER(); 

                }
                break;
            case 44 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:269: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 45 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:276: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 46 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:284: BACKQUOTE
                {
                mBACKQUOTE(); 

                }
                break;
            case 47 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:294: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 48 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:301: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 49 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:308: CIRCUMFLEX
                {
                mCIRCUMFLEX(); 

                }
                break;
            case 50 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:319: TILDE
                {
                mTILDE(); 

                }
                break;
            case 51 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:325: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 52 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:331: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 53 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:340: ALT_NOTEQUAL
                {
                mALT_NOTEQUAL(); 

                }
                break;
            case 54 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:353: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 55 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:363: LEFTSHIFT
                {
                mLEFTSHIFT(); 

                }
                break;
            case 56 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:373: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 57 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:386: RIGHTSHIFT
                {
                mRIGHTSHIFT(); 

                }
                break;
            case 58 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:397: PLUSEQUAL
                {
                mPLUSEQUAL(); 

                }
                break;
            case 59 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:407: MINUSEQUAL
                {
                mMINUSEQUAL(); 

                }
                break;
            case 60 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:418: DOUBLESTAR
                {
                mDOUBLESTAR(); 

                }
                break;
            case 61 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:429: STAREQUAL
                {
                mSTAREQUAL(); 

                }
                break;
            case 62 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:439: DOUBLESLASH
                {
                mDOUBLESLASH(); 

                }
                break;
            case 63 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:451: SLASHEQUAL
                {
                mSLASHEQUAL(); 

                }
                break;
            case 64 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:462: VBAREQUAL
                {
                mVBAREQUAL(); 

                }
                break;
            case 65 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:472: PERCENTEQUAL
                {
                mPERCENTEQUAL(); 

                }
                break;
            case 66 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:485: AMPEREQUAL
                {
                mAMPEREQUAL(); 

                }
                break;
            case 67 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:496: CIRCUMFLEXEQUAL
                {
                mCIRCUMFLEXEQUAL(); 

                }
                break;
            case 68 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:512: LEFTSHIFTEQUAL
                {
                mLEFTSHIFTEQUAL(); 

                }
                break;
            case 69 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:527: RIGHTSHIFTEQUAL
                {
                mRIGHTSHIFTEQUAL(); 

                }
                break;
            case 70 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:543: DOUBLESTAREQUAL
                {
                mDOUBLESTAREQUAL(); 

                }
                break;
            case 71 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:559: DOUBLESLASHEQUAL
                {
                mDOUBLESLASHEQUAL(); 

                }
                break;
            case 72 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:576: DOT
                {
                mDOT(); 

                }
                break;
            case 73 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:580: AT
                {
                mAT(); 

                }
                break;
            case 74 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:583: AND
                {
                mAND(); 

                }
                break;
            case 75 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:587: OR
                {
                mOR(); 

                }
                break;
            case 76 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:590: NOT
                {
                mNOT(); 

                }
                break;
            case 77 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:594: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 78 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:600: LONGINT
                {
                mLONGINT(); 

                }
                break;
            case 79 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:608: INT
                {
                mINT(); 

                }
                break;
            case 80 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:612: COMPLEX
                {
                mCOMPLEX(); 

                }
                break;
            case 81 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:620: NAME
                {
                mNAME(); 

                }
                break;
            case 82 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:625: STRING
                {
                mSTRING(); 

                }
                break;
            case 83 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:632: CONTINUED_LINE
                {
                mCONTINUED_LINE(); 

                }
                break;
            case 84 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:647: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 85 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:655: WS
                {
                mWS(); 

                }
                break;
            case 86 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:658: LEADING_WS
                {
                mLEADING_WS(); 

                }
                break;
            case 87 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:669: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 88 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:677: DEDENT
                {
                mDEDENT(); 

                }
                break;
            case 89 :
                // /Users/Panos/Documents/Work/mws/squal/parsers/python/src/main/antlr3/com/mws/squal/pythonparser/Python.g:1:684: INDENT
                {
                mINDENT(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA5_eotS =
        "\3\uffff\1\4\2\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\1\56\1\uffff\1\56\1\105\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\uffff\2\145\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\uffff\12\2",
            "",
            "\1\3\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
            "\1\5\37\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "567:1: FLOAT : ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) );";
        }
    }
    static final String DFA11_eotS =
        "\7\uffff";
    static final String DFA11_eofS =
        "\7\uffff";
    static final String DFA11_minS =
        "\3\56\2\uffff\2\56";
    static final String DFA11_maxS =
        "\1\71\1\170\1\152\2\uffff\2\152";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA11_specialS =
        "\7\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\3\1\uffff\12\5\13\uffff\1\3\4\uffff\1\4\15\uffff\1\4\14"+
            "\uffff\1\3\4\uffff\1\4\15\uffff\1\4",
            "\1\3\1\uffff\12\6\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\12\5\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4",
            "\1\3\1\uffff\12\6\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "589:1: COMPLEX : ( INT ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) );";
        }
    }
    static final String DFA36_eotS =
        "\2\uffff\2\4\1\uffff";
    static final String DFA36_eofS =
        "\5\uffff";
    static final String DFA36_minS =
        "\1\11\1\uffff\2\0\1\uffff";
    static final String DFA36_maxS =
        "\1\43\1\uffff\2\uffff\1\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\2\uffff\1\2";
    static final String DFA36_specialS =
        "\1\0\1\uffff\1\2\1\1\1\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\26\uffff\1\1\2\uffff\1\2",
            "",
            "\12\3\1\1\ufff5\3",
            "\12\3\1\1\ufff5\3",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "688:1: COMMENT : ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ | {...}? => '#' (~ '\\n' )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0=='\t'||LA36_0==' ') && ((getStartPos() == 0))) {s = 1;}

                        else if ( (LA36_0=='#') && (((getStartPos() == 0)||(getStartPos() > 0)))) {s = 2;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_3=='\n') && ((getStartPos() == 0))) {s = 1;}

                        else if ( ((LA36_3>='\u0000' && LA36_3<='\t')||(LA36_3>='\u000B' && LA36_3<='\uFFFF')) && (((getStartPos() == 0)||(getStartPos() > 0)))) {s = 3;}

                        else s = 4;

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA36_2>='\u0000' && LA36_2<='\t')||(LA36_2>='\u000B' && LA36_2<='\uFFFF')) && (((getStartPos() == 0)||(getStartPos() > 0)))) {s = 3;}

                        else if ( (LA36_2=='\n') && ((getStartPos() == 0))) {s = 1;}

                        else s = 4;

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\1\uffff\16\55\7\uffff\1\120\1\122\1\125\1\130\1\132\1\134\1\140"+
        "\1\143\1\145\1\147\3\uffff\1\151\2\uffff\1\152\1\uffff\2\55\2\157"+
        "\1\55\3\uffff\1\167\1\uffff\1\170\1\171\1\174\1\uffff\11\55\1\u0087"+
        "\1\u0088\1\u0089\3\55\1\u008e\11\55\4\uffff\1\u009b\2\uffff\1\u009d"+
        "\10\uffff\1\u009f\2\uffff\1\u00a1\10\uffff\1\u00a2\1\u00a4\1\55"+
        "\2\uffff\1\u00a2\1\157\3\uffff\1\157\1\55\6\uffff\1\u00ad\1\u00ae"+
        "\10\55\3\uffff\1\55\1\u00b8\2\55\1\uffff\1\u00bb\7\55\1\u00c3\2"+
        "\55\13\uffff\1\u00c8\1\157\1\uffff\1\u00a2\1\uffff\1\u00a2\4\uffff"+
        "\1\55\1\u00cd\6\55\1\u00d4\1\uffff\2\55\1\uffff\1\55\1\u00d8\1\55"+
        "\1\u00da\1\u00db\1\55\1\u00dd\1\uffff\2\55\1\uffff\1\u00a2\2\uffff"+
        "\1\u00a2\1\uffff\1\u00e2\1\uffff\1\u00e3\1\55\1\u00e5\1\55\1\u00e7"+
        "\1\55\1\uffff\3\55\1\uffff\1\55\2\uffff\1\u00ed\1\uffff\1\55\1\u00ef"+
        "\1\uffff\1\u00a2\2\uffff\1\55\1\uffff\1\u00f1\1\uffff\1\u00f2\1"+
        "\55\1\u00f4\1\u00f5\1\u00f6\1\uffff\1\u00f7\1\uffff\1\55\2\uffff"+
        "\1\u00f9\4\uffff\1\u00fa\2\uffff";
    static final String DFA37_eofS =
        "\u00fb\uffff";
    static final String DFA37_minS =
        "\1\11\1\145\1\141\1\162\1\154\1\42\1\146\1\151\1\156\2\154\1\150"+
        "\1\162\1\141\1\151\7\uffff\2\75\1\52\1\57\2\75\1\74\3\75\3\uffff"+
        "\1\75\2\uffff\1\60\1\uffff\1\162\1\157\2\56\1\42\3\uffff\1\12\1"+
        "\uffff\1\12\2\11\1\uffff\1\146\1\151\1\163\1\145\1\156\1\141\1\164"+
        "\1\151\1\160\3\60\1\157\1\162\1\156\1\60\1\144\1\157\1\143\2\151"+
        "\1\164\1\171\1\155\1\145\4\uffff\1\75\2\uffff\1\75\10\uffff\1\75"+
        "\2\uffff\1\75\10\uffff\2\60\1\164\1\60\1\uffff\1\60\1\56\1\53\2"+
        "\uffff\1\56\1\42\1\uffff\2\0\2\uffff\1\0\2\60\1\156\1\163\1\141"+
        "\1\164\1\163\1\165\1\163\1\157\3\uffff\1\155\1\60\1\141\1\145\1"+
        "\uffff\1\60\1\142\1\143\2\145\1\146\1\154\1\150\1\60\1\142\1\154"+
        "\11\uffff\1\53\1\uffff\2\60\1\53\3\60\4\uffff\1\164\1\60\1\153\1"+
        "\151\1\163\1\162\1\145\1\162\1\60\1\uffff\1\154\1\162\1\uffff\1"+
        "\141\1\60\1\160\2\60\1\145\1\60\1\uffff\2\144\2\60\1\uffff\2\60"+
        "\1\53\1\60\1\uffff\1\60\1\156\1\60\1\156\1\60\1\164\1\uffff\1\154"+
        "\1\164\1\154\1\uffff\1\164\2\uffff\1\60\1\uffff\1\141\3\60\2\uffff"+
        "\1\165\1\uffff\1\60\1\uffff\1\60\1\171\3\60\1\uffff\1\60\1\uffff"+
        "\1\145\2\uffff\1\60\4\uffff\1\60\2\uffff";
    static final String DFA37_maxS =
        "\1\176\1\145\2\162\1\157\1\145\1\163\1\162\1\163\1\154\1\170\1\151"+
        "\1\162\1\141\1\151\7\uffff\6\75\2\76\2\75\3\uffff\1\75\2\uffff\1"+
        "\71\1\uffff\1\162\1\157\1\170\1\154\1\162\3\uffff\1\15\1\uffff\1"+
        "\15\2\43\1\uffff\1\154\1\151\1\163\1\145\1\156\1\141\1\164\1\151"+
        "\1\160\3\172\1\157\1\162\1\156\1\172\1\144\1\157\1\145\1\163\1\151"+
        "\1\164\1\171\1\155\1\145\4\uffff\1\75\2\uffff\1\75\10\uffff\1\75"+
        "\2\uffff\1\75\10\uffff\1\152\1\172\1\164\1\146\1\uffff\1\152\1\154"+
        "\1\71\2\uffff\1\154\1\47\1\uffff\2\0\2\uffff\1\0\2\172\1\156\1\163"+
        "\1\141\1\164\1\163\1\165\1\163\1\157\3\uffff\1\155\1\172\1\141\1"+
        "\145\1\uffff\1\172\1\142\1\143\2\145\1\146\1\154\1\150\1\172\1\142"+
        "\1\154\11\uffff\1\71\1\uffff\1\172\1\154\1\71\1\152\1\71\1\152\4"+
        "\uffff\1\164\1\172\1\153\1\151\1\163\1\162\1\145\1\162\1\172\1\uffff"+
        "\1\154\1\162\1\uffff\1\141\1\172\1\160\2\172\1\145\1\172\1\uffff"+
        "\2\144\1\71\1\152\1\uffff\1\71\1\152\1\71\1\172\1\uffff\1\172\1"+
        "\156\1\172\1\156\1\172\1\164\1\uffff\1\154\1\164\1\154\1\uffff\1"+
        "\164\2\uffff\1\172\1\uffff\1\141\1\172\1\71\1\152\2\uffff\1\165"+
        "\1\uffff\1\172\1\uffff\1\172\1\171\3\172\1\uffff\1\172\1\uffff\1"+
        "\145\2\uffff\1\172\4\uffff\1\172\2\uffff";
    static final String DFA37_acceptS =
        "\17\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\12\uffff\1\56\1\57"+
        "\1\60\1\uffff\1\62\1\64\1\uffff\1\111\5\uffff\1\121\1\122\1\123"+
        "\1\uffff\1\124\3\uffff\1\127\31\uffff\1\72\1\44\1\73\1\45\1\uffff"+
        "\1\75\1\46\1\uffff\1\77\1\47\1\100\1\50\1\102\1\51\1\65\1\66\1\uffff"+
        "\1\52\1\70\1\uffff\1\53\1\63\1\54\1\101\1\55\1\103\1\61\1\110\4"+
        "\uffff\1\117\3\uffff\1\116\1\120\2\uffff\1\125\2\uffff\1\126\1\127"+
        "\13\uffff\1\16\1\20\1\31\4\uffff\1\13\13\uffff\1\106\1\74\1\107"+
        "\1\76\1\104\1\67\1\105\1\71\1\115\1\uffff\1\113\6\uffff\1\130\1"+
        "\131\1\1\1\3\11\uffff\1\24\2\uffff\1\112\7\uffff\1\25\4\uffff\1"+
        "\114\4\uffff\1\4\6\uffff\1\12\3\uffff\1\15\1\uffff\1\21\1\22\1\uffff"+
        "\1\27\4\uffff\1\2\1\5\1\uffff\1\33\1\uffff\1\10\5\uffff\1\23\1\uffff"+
        "\1\34\1\uffff\1\7\1\11\1\uffff\1\17\1\14\1\30\1\32\1\uffff\1\26"+
        "\1\6";
    static final String DFA37_specialS =
        "\1\2\57\uffff\1\3\2\uffff\1\0\1\1\103\uffff\1\6\1\4\2\uffff\1\5"+
        "\176\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\64\1\62\1\uffff\1\60\1\61\22\uffff\1\63\1\45\1\56\1\65\1"+
            "\uffff\1\37\1\33\1\56\1\17\1\20\1\30\1\26\1\24\1\27\1\46\1\31"+
            "\1\52\11\53\1\23\1\25\1\34\1\36\1\35\1\uffff\1\47\32\55\1\21"+
            "\1\57\1\22\1\43\1\55\1\40\1\10\1\3\1\4\1\1\1\12\1\7\1\11\1\55"+
            "\1\6\2\55\1\15\1\55\1\51\1\50\1\2\1\55\1\5\1\55\1\14\1\54\1"+
            "\55\1\13\1\55\1\16\1\55\1\41\1\32\1\42\1\44",
            "\1\66",
            "\1\70\20\uffff\1\67",
            "\1\71",
            "\1\73\2\uffff\1\72",
            "\1\56\4\uffff\1\56\71\uffff\1\75\3\uffff\1\74",
            "\1\100\6\uffff\1\76\1\77\4\uffff\1\101",
            "\1\104\5\uffff\1\103\2\uffff\1\102",
            "\1\106\4\uffff\1\105",
            "\1\107",
            "\1\111\13\uffff\1\110",
            "\1\112\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\121",
            "\1\123\22\uffff\1\124",
            "\1\126\15\uffff\1\127",
            "\1\131",
            "\1\133",
            "\1\137\1\136\1\135",
            "\1\141\1\142",
            "\1\144",
            "\1\146",
            "",
            "",
            "",
            "\1\150",
            "",
            "",
            "\12\153",
            "",
            "\1\154",
            "\1\155",
            "\1\160\1\uffff\12\161\13\uffff\1\162\4\uffff\1\164\1\uffff"+
            "\1\163\13\uffff\1\156\14\uffff\1\162\4\uffff\1\164\1\uffff\1"+
            "\163\13\uffff\1\156",
            "\1\160\1\uffff\12\165\13\uffff\1\162\4\uffff\1\164\1\uffff"+
            "\1\163\30\uffff\1\162\4\uffff\1\164\1\uffff\1\163",
            "\1\56\4\uffff\1\56\112\uffff\1\166",
            "",
            "",
            "",
            "\1\61\2\uffff\1\61",
            "",
            "\1\61\1\uffff\2\61",
            "\1\64\1\172\1\uffff\1\167\1\172\22\uffff\1\63\2\uffff\1\173",
            "\1\64\1\172\1\uffff\1\167\1\172\22\uffff\1\63\2\uffff\1\173",
            "",
            "\1\175\5\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u008d\7\55",
            "\1\u008f",
            "\1\u0090",
            "\1\u0092\1\uffff\1\u0091",
            "\1\u0094\11\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "",
            "",
            "\1\u009c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "\1\u00a0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\153\13\uffff\1\u00a3\4\uffff\1\164\32\uffff\1\u00a3\4\uffff"+
            "\1\164",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a5",
            "\12\u00a6\7\uffff\6\u00a6\32\uffff\6\u00a6",
            "",
            "\12\u00a8\13\uffff\1\u00a7\4\uffff\1\164\32\uffff\1\u00a7\4"+
            "\uffff\1\164",
            "\1\160\1\uffff\12\161\13\uffff\1\162\4\uffff\1\164\1\uffff"+
            "\1\163\30\uffff\1\162\4\uffff\1\164\1\uffff\1\163",
            "\1\u00a9\1\uffff\1\u00a9\2\uffff\12\u00aa",
            "",
            "",
            "\1\160\1\uffff\12\165\13\uffff\1\162\4\uffff\1\164\1\uffff"+
            "\1\163\30\uffff\1\162\4\uffff\1\164\1\uffff\1\163",
            "\1\56\4\uffff\1\56",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "",
            "\1\u00b7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c6\1\uffff\1\u00c6\2\uffff\12\u00c7",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u00a6\7\uffff\6\u00a6\3\uffff\1\164\1\uffff\1\163\24\uffff"+
            "\6\u00a6\3\uffff\1\164\1\uffff\1\163",
            "\1\u00c9\1\uffff\1\u00c9\2\uffff\12\u00ca",
            "\12\u00a8\13\uffff\1\u00cb\4\uffff\1\164\32\uffff\1\u00cb\4"+
            "\uffff\1\164",
            "\12\u00aa",
            "\12\u00aa\20\uffff\1\164\37\uffff\1\164",
            "",
            "",
            "",
            "",
            "\1\u00cc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00dc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00de",
            "\1\u00df",
            "\12\u00c7",
            "\12\u00c7\20\uffff\1\164\37\uffff\1\164",
            "",
            "\12\u00ca",
            "\12\u00ca\20\uffff\1\164\37\uffff\1\164",
            "\1\u00e0\1\uffff\1\u00e0\2\uffff\12\u00e1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00ee",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u00e1",
            "\12\u00e1\20\uffff\1\164\37\uffff\1\164",
            "",
            "",
            "\1\u00f0",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00f8",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | DOT | AT | AND | OR | NOT | FLOAT | LONGINT | INT | COMPLEX | NAME | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT | DEDENT | INDENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_51 = input.LA(1);

                         
                        int index37_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_51==' ') && (((getStartPos()==0)||(getStartPos() == 0)||(getStartPos() > 0)))) {s = 51;}

                        else if ( (LA37_51=='\f') && ((getStartPos() > 0))) {s = 119;}

                        else if ( (LA37_51=='\n'||LA37_51=='\r') && ((getStartPos()==0))) {s = 122;}

                        else if ( (LA37_51=='\t') && (((getStartPos()==0)||(getStartPos() == 0)||(getStartPos() > 0)))) {s = 52;}

                        else if ( (LA37_51=='#') && ((getStartPos() == 0))) {s = 123;}

                        else s = 121;

                         
                        input.seek(index37_51);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_52 = input.LA(1);

                         
                        int index37_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_52==' ') && (((getStartPos()==0)||(getStartPos() == 0)||(getStartPos() > 0)))) {s = 51;}

                        else if ( (LA37_52=='\f') && ((getStartPos() > 0))) {s = 119;}

                        else if ( (LA37_52=='\n'||LA37_52=='\r') && ((getStartPos()==0))) {s = 122;}

                        else if ( (LA37_52=='\t') && (((getStartPos()==0)||(getStartPos() == 0)||(getStartPos() > 0)))) {s = 52;}

                        else if ( (LA37_52=='#') && ((getStartPos() == 0))) {s = 123;}

                        else s = 124;

                         
                        input.seek(index37_52);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_0=='d') ) {s = 1;}

                        else if ( (LA37_0=='p') ) {s = 2;}

                        else if ( (LA37_0=='b') ) {s = 3;}

                        else if ( (LA37_0=='c') ) {s = 4;}

                        else if ( (LA37_0=='r') ) {s = 5;}

                        else if ( (LA37_0=='i') ) {s = 6;}

                        else if ( (LA37_0=='f') ) {s = 7;}

                        else if ( (LA37_0=='a') ) {s = 8;}

                        else if ( (LA37_0=='g') ) {s = 9;}

                        else if ( (LA37_0=='e') ) {s = 10;}

                        else if ( (LA37_0=='w') ) {s = 11;}

                        else if ( (LA37_0=='t') ) {s = 12;}

                        else if ( (LA37_0=='l') ) {s = 13;}

                        else if ( (LA37_0=='y') ) {s = 14;}

                        else if ( (LA37_0=='(') ) {s = 15;}

                        else if ( (LA37_0==')') ) {s = 16;}

                        else if ( (LA37_0=='[') ) {s = 17;}

                        else if ( (LA37_0==']') ) {s = 18;}

                        else if ( (LA37_0==':') ) {s = 19;}

                        else if ( (LA37_0==',') ) {s = 20;}

                        else if ( (LA37_0==';') ) {s = 21;}

                        else if ( (LA37_0=='+') ) {s = 22;}

                        else if ( (LA37_0=='-') ) {s = 23;}

                        else if ( (LA37_0=='*') ) {s = 24;}

                        else if ( (LA37_0=='/') ) {s = 25;}

                        else if ( (LA37_0=='|') ) {s = 26;}

                        else if ( (LA37_0=='&') ) {s = 27;}

                        else if ( (LA37_0=='<') ) {s = 28;}

                        else if ( (LA37_0=='>') ) {s = 29;}

                        else if ( (LA37_0=='=') ) {s = 30;}

                        else if ( (LA37_0=='%') ) {s = 31;}

                        else if ( (LA37_0=='`') ) {s = 32;}

                        else if ( (LA37_0=='{') ) {s = 33;}

                        else if ( (LA37_0=='}') ) {s = 34;}

                        else if ( (LA37_0=='^') ) {s = 35;}

                        else if ( (LA37_0=='~') ) {s = 36;}

                        else if ( (LA37_0=='!') ) {s = 37;}

                        else if ( (LA37_0=='.') ) {s = 38;}

                        else if ( (LA37_0=='@') ) {s = 39;}

                        else if ( (LA37_0=='o') ) {s = 40;}

                        else if ( (LA37_0=='n') ) {s = 41;}

                        else if ( (LA37_0=='0') ) {s = 42;}

                        else if ( ((LA37_0>='1' && LA37_0<='9')) ) {s = 43;}

                        else if ( (LA37_0=='u') ) {s = 44;}

                        else if ( ((LA37_0>='A' && LA37_0<='Z')||LA37_0=='_'||LA37_0=='h'||(LA37_0>='j' && LA37_0<='k')||LA37_0=='m'||LA37_0=='q'||LA37_0=='s'||LA37_0=='v'||LA37_0=='x'||LA37_0=='z') ) {s = 45;}

                        else if ( (LA37_0=='\"'||LA37_0=='\'') ) {s = 46;}

                        else if ( (LA37_0=='\\') ) {s = 47;}

                        else if ( (LA37_0=='\f') ) {s = 48;}

                        else if ( (LA37_0=='\r') ) {s = 49;}

                        else if ( (LA37_0=='\n') ) {s = 50;}

                        else if ( (LA37_0==' ') && (((getStartPos()==0)||(getStartPos() == 0)||(getStartPos() > 0)))) {s = 51;}

                        else if ( (LA37_0=='\t') && (((getStartPos()==0)||(getStartPos() == 0)||(getStartPos() > 0)))) {s = 52;}

                        else if ( (LA37_0=='#') && (((getStartPos() == 0)||(getStartPos() > 0)))) {s = 53;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_48 = input.LA(1);

                         
                        int index37_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_48=='\n'||LA37_48=='\r') ) {s = 49;}

                        else s = 119;

                         
                        input.seek(index37_48);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_121 = input.LA(1);

                         
                        int index37_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((getStartPos() > 0)) ) {s = 119;}

                        else if ( ((((getStartPos()==0)&&(implicitLineJoiningLevel>0))||(getStartPos()==0))) ) {s = 122;}

                         
                        input.seek(index37_121);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_124 = input.LA(1);

                         
                        int index37_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((getStartPos() > 0)) ) {s = 119;}

                        else if ( ((((getStartPos()==0)&&(implicitLineJoiningLevel>0))||(getStartPos()==0))) ) {s = 122;}

                         
                        input.seek(index37_124);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_120 = input.LA(1);

                         
                        int index37_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((0==1)))) ) {s = 49;}

                        else if ( ((0==1)) ) {s = 171;}

                        else if ( ((0==1)) ) {s = 172;}

                         
                        input.seek(index37_120);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}