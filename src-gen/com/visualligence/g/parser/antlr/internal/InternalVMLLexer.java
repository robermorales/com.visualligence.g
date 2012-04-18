package com.visualligence.g.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVMLLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=8;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_BIN=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_OCT=7;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalVMLLexer() {;} 
    public InternalVMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:11:7: ( 'module' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:11:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:12:7: ( 'input' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:12:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:13:7: ( 'output' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:13:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:14:7: ( 'author' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:14:9: 'author'
            {
            match("author"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:15:7: ( 'creation' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:15:9: 'creation'
            {
            match("creation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:16:7: ( 'more' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:16:9: 'more'
            {
            match("more"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:17:7: ( 'import' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:17:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:18:7: ( 'switch' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:18:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:19:7: ( '?' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:19:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:20:7: ( ':' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:21:7: ( '(' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:22:7: ( ')' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:23:7: ( '.' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:24:7: ( 'e' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:24:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:25:7: ( 'E' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:25:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:26:7: ( '+' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:26:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:27:7: ( '-' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:28:7: ( 'i' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:28:9: 'i'
            {
            match('i'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:29:7: ( 'j' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:29:9: 'j'
            {
            match('j'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:30:7: ( 'true' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:30:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:31:7: ( 'false' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:31:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:32:7: ( '[..' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:32:9: '[..'
            {
            match("[.."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:33:7: ( '->' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:33:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:34:7: ( ',' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:34:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:35:7: ( ']' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:35:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:36:7: ( '[' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:36:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:37:7: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:37:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:38:7: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:38:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:39:7: ( '~' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:39:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:40:7: ( 'noop' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:40:9: 'noop'
            {
            match("noop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:41:7: ( '=' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:41:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:42:7: ( 'constant' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:42:9: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:43:7: ( 'multi' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:43:9: 'multi'
            {
            match("multi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:44:7: ( 'unit' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:44:9: 'unit'
            {
            match("unit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:45:7: ( 'box' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:45:9: 'box'
            {
            match("box"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:46:7: ( 'shape' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:46:9: 'shape'
            {
            match("shape"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:47:7: ( 'void' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:47:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:48:7: ( 'auto' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:48:9: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:49:7: ( '<' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:49:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:50:7: ( '>' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:50:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:51:7: ( 'in' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:51:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:52:7: ( '~>' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:52:9: '~>'
            {
            match("~>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:53:7: ( 'alias' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:53:9: 'alias'
            {
            match("alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:54:7: ( 'stream' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:54:9: 'stream'
            {
            match("stream"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:55:7: ( '<-' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:55:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:56:7: ( 'I' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:56:9: 'I'
            {
            match('I'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:57:7: ( 'O' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:57:9: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:58:7: ( 'loop' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:58:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:59:7: ( 'for' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:59:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:60:7: ( 'factory' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:60:9: 'factory'
            {
            match("factory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:61:7: ( 'file' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:61:9: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:62:7: ( 'canvas' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:62:9: 'canvas'
            {
            match("canvas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:63:7: ( ';' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:63:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:64:7: ( '&&' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:64:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:65:7: ( '||' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:65:9: '||'
            {
            match("||"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:66:7: ( '!' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:66:9: '!'
            {
            match('!'); 

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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:67:7: ( '==' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:67:9: '=='
            {
            match("=="); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:68:7: ( '!=' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:68:9: '!='
            {
            match("!="); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:69:7: ( '<=' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:69:9: '<='
            {
            match("<="); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:70:7: ( '>=' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:70:9: '>='
            {
            match(">="); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:71:7: ( '*' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:71:9: '*'
            {
            match('*'); 

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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:72:7: ( '%' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:72:9: '%'
            {
            match('%'); 

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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:73:7: ( '//' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:73:9: '//'
            {
            match("//"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:74:7: ( '/' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:74:9: '/'
            {
            match('/'); 

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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:75:7: ( '**' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:75:9: '**'
            {
            match("**"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:76:7: ( 'positive' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:76:9: 'positive'
            {
            match("positive"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:77:7: ( 'natural' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:77:9: 'natural'
            {
            match("natural"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:78:7: ( 'integer' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:78:9: 'integer'
            {
            match("integer"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:79:7: ( 'rational' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:79:9: 'rational'
            {
            match("rational"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:7: ( 'color' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:9: 'color'
            {
            match("color"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:81:7: ( 'angle' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:81:9: 'angle'
            {
            match("angle"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:82:7: ( 'size' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:82:9: 'size'
            {
            match("size"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:83:7: ( 'position' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:83:9: 'position'
            {
            match("position"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:84:7: ( 'texture' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:84:9: 'texture'
            {
            match("texture"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:85:7: ( 'string' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:85:9: 'string'
            {
            match("string"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:86:7: ( 'bool' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:86:9: 'bool'
            {
            match("bool"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:87:7: ( 'set' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:87:9: 'set'
            {
            match("set"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:88:7: ( 'bag' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:88:9: 'bag'
            {
            match("bag"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:89:7: ( 'list' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:89:9: 'list'
            {
            match("list"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:90:7: ( 'graph' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:90:9: 'graph'
            {
            match("graph"); 


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
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:91:7: ( 'single' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:91:9: 'single'
            {
            match("single"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "RULE_OCT"
    public final void mRULE_OCT() throws RecognitionException {
        try {
            int _type = RULE_OCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4921:10: ( ( '0' .. '7' )+ 'o' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4921:12: ( '0' .. '7' )+ 'o'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4921:12: ( '0' .. '7' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='7')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4921:13: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('o'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4923:10: ( '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4923:12: '0x' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            {
            match("0x"); 

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4923:17: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_BIN"
    public final void mRULE_BIN() throws RecognitionException {
        try {
            int _type = RULE_BIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4925:10: ( ( '0' .. '1' )+ 'b' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4925:12: ( '0' .. '1' )+ 'b'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4925:12: ( '0' .. '1' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='1')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4925:13: '0' .. '1'
            	    {
            	    matchRange('0','1'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4927:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4927:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4927:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4927:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4927:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:
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
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4929:10: ( ( '0' .. '9' )+ )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4929:12: ( '0' .. '9' )+
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4929:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4929:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4931:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4933:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4933:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4933:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4933:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4935:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4935:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4935:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4935:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4935:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4935:41: ( '\\r' )? '\\n'
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4935:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4935:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4937:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4937:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4937:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4939:16: ( . )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4939:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_OCT | RULE_HEX | RULE_BIN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=91;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:496: RULE_OCT
                {
                mRULE_OCT(); 

                }
                break;
            case 83 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:505: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 84 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:514: RULE_BIN
                {
                mRULE_BIN(); 

                }
                break;
            case 85 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:523: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 86 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:531: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 87 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:540: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 88 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:552: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 89 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:568: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:584: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 91 :
                // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1:592: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\71\1\74\4\71\5\uffff\1\116\1\117\1\uffff\1\122\1\123"+
        "\2\71\1\132\4\uffff\1\140\1\71\1\144\3\71\1\153\1\155\1\156\1\157"+
        "\1\71\1\uffff\2\66\1\166\1\170\1\uffff\1\174\3\71\3\u0081\1\66\2"+
        "\uffff\2\66\2\uffff\2\71\1\uffff\1\u008d\1\71\1\uffff\14\71\13\uffff"+
        "\5\71\10\uffff\2\71\2\uffff\4\71\7\uffff\2\71\10\uffff\1\u00ac\2"+
        "\uffff\3\71\2\uffff\1\u0081\2\uffff\1\u0081\2\uffff\5\71\1\uffff"+
        "\16\71\1\u00c6\4\71\1\u00cb\4\71\1\u00d0\1\71\1\u00d2\3\71\2\uffff"+
        "\4\71\1\u00da\6\71\1\u00e1\12\71\1\u00ec\1\71\1\uffff\1\u00ee\3"+
        "\71\1\uffff\1\u00f2\1\u00f3\1\71\1\u00f5\1\uffff\1\u00f6\1\uffff"+
        "\1\u00f7\1\u00f8\1\u00f9\4\71\1\uffff\1\u00fe\1\u00ff\4\71\1\uffff"+
        "\1\u0104\1\u0105\2\71\1\u0108\2\71\1\u010b\2\71\1\uffff\1\71\1\uffff"+
        "\1\71\1\u0110\1\71\2\uffff\1\71\5\uffff\2\71\1\u0115\1\u0116\2\uffff"+
        "\1\71\1\u0118\1\u0119\1\u011a\2\uffff\2\71\1\uffff\1\u011d\1\u011e"+
        "\1\uffff\1\u011f\1\u0120\1\u0121\1\71\1\uffff\4\71\2\uffff\1\u0128"+
        "\3\uffff\2\71\5\uffff\1\u012b\1\u012c\1\u012d\3\71\1\uffff\1\u0131"+
        "\1\u0132\3\uffff\1\u0133\1\u0134\1\u0135\5\uffff";
    static final String DFA15_eofS =
        "\u0136\uffff";
    static final String DFA15_minS =
        "\1\0\1\157\1\60\1\165\1\154\1\141\1\145\5\uffff\2\60\1\uffff\1\76"+
        "\1\60\1\145\1\141\1\56\4\uffff\1\76\1\141\1\75\1\156\1\141\1\157"+
        "\1\55\1\75\2\60\1\151\1\uffff\1\46\1\174\1\75\1\52\1\uffff\1\52"+
        "\1\157\1\141\1\162\3\60\1\101\2\uffff\2\0\2\uffff\1\144\1\154\1"+
        "\uffff\1\60\1\160\1\uffff\2\164\1\151\1\147\1\145\1\154\1\156\1"+
        "\151\1\141\1\162\1\156\1\164\13\uffff\1\165\1\170\1\143\1\162\1"+
        "\154\10\uffff\1\157\1\164\2\uffff\1\151\1\157\1\147\1\151\7\uffff"+
        "\1\157\1\163\10\uffff\1\0\2\uffff\1\163\1\164\1\141\2\uffff\1\60"+
        "\2\uffff\1\60\2\uffff\1\165\1\145\1\164\1\165\1\145\1\uffff\1\157"+
        "\1\160\1\150\1\141\1\154\1\141\1\163\1\157\1\166\1\164\1\160\2\145"+
        "\1\147\1\60\1\145\1\164\1\163\1\164\1\60\1\145\1\160\1\165\1\164"+
        "\1\60\1\154\1\60\1\144\1\160\1\164\2\uffff\2\151\1\160\1\154\1\60"+
        "\1\151\1\164\1\147\1\162\1\165\1\157\1\60\1\163\1\145\2\164\1\162"+
        "\1\141\1\143\1\145\1\141\1\156\1\60\1\154\1\uffff\1\60\1\165\1\145"+
        "\1\157\1\uffff\2\60\1\162\1\60\1\uffff\1\60\1\uffff\3\60\1\164\1"+
        "\157\1\150\1\145\1\uffff\2\60\1\145\2\164\1\162\1\uffff\2\60\1\151"+
        "\1\141\1\60\1\163\1\150\1\60\1\155\1\147\1\uffff\1\145\1\uffff\1"+
        "\162\1\60\1\162\2\uffff\1\141\5\uffff\1\151\1\156\2\60\2\uffff\1"+
        "\162\3\60\2\uffff\1\157\1\156\1\uffff\2\60\1\uffff\3\60\1\145\1"+
        "\uffff\1\171\1\154\1\157\1\141\2\uffff\1\60\3\uffff\1\156\1\164"+
        "\5\uffff\3\60\1\145\1\156\1\154\1\uffff\2\60\3\uffff\3\60\5\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\165\1\172\2\165\1\162\1\167\5\uffff\2\172\1\uffff\1\76"+
        "\1\172\1\162\1\157\1\56\4\uffff\1\76\1\157\1\75\1\156\2\157\2\75"+
        "\2\172\1\157\1\uffff\1\46\1\174\1\75\1\52\1\uffff\1\57\1\157\1\141"+
        "\1\162\1\170\2\157\1\172\2\uffff\2\uffff\2\uffff\1\162\1\154\1\uffff"+
        "\1\172\1\160\1\uffff\2\164\1\151\1\147\1\145\2\156\1\151\1\141\1"+
        "\162\1\172\1\164\13\uffff\1\165\1\170\1\154\1\162\1\154\10\uffff"+
        "\1\157\1\164\2\uffff\1\151\1\170\1\147\1\151\7\uffff\1\157\1\163"+
        "\10\uffff\1\uffff\2\uffff\1\163\1\164\1\141\2\uffff\1\157\2\uffff"+
        "\1\157\2\uffff\1\165\1\145\1\164\1\165\1\145\1\uffff\1\157\1\160"+
        "\1\157\1\141\1\154\1\141\1\163\1\157\1\166\1\164\1\160\1\151\1\145"+
        "\1\147\1\172\1\145\1\164\1\163\1\164\1\172\1\145\1\160\1\165\1\164"+
        "\1\172\1\154\1\172\1\144\1\160\1\164\2\uffff\2\151\1\160\1\154\1"+
        "\172\1\151\1\164\1\147\1\162\1\165\1\157\1\172\1\163\1\145\2\164"+
        "\1\162\1\141\1\143\1\145\1\141\1\156\1\172\1\154\1\uffff\1\172\1"+
        "\165\1\145\1\157\1\uffff\2\172\1\162\1\172\1\uffff\1\172\1\uffff"+
        "\3\172\1\164\1\157\1\150\1\145\1\uffff\2\172\1\145\2\164\1\162\1"+
        "\uffff\2\172\1\151\1\141\1\172\1\163\1\150\1\172\1\155\1\147\1\uffff"+
        "\1\145\1\uffff\1\162\1\172\1\162\2\uffff\1\141\5\uffff\1\151\1\156"+
        "\2\172\2\uffff\1\162\3\172\2\uffff\1\157\1\156\1\uffff\2\172\1\uffff"+
        "\3\172\1\145\1\uffff\1\171\1\154\1\166\1\141\2\uffff\1\172\3\uffff"+
        "\1\156\1\164\5\uffff\3\172\1\145\1\156\1\154\1\uffff\2\172\3\uffff"+
        "\3\172\5\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\11\1\12\1\13\1\14\1\15\2\uffff\1\20\5\uffff\1\30\1\31"+
        "\1\33\1\34\13\uffff\1\65\4\uffff\1\76\10\uffff\1\125\1\126\2\uffff"+
        "\1\132\1\133\2\uffff\1\125\2\uffff\1\22\14\uffff\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\1\20\1\27\1\21\1\23\5\uffff\1\26\1\32\1\30"+
        "\1\31\1\33\1\34\1\52\1\35\2\uffff\1\71\1\37\4\uffff\1\55\1\73\1"+
        "\47\1\74\1\50\1\56\1\57\2\uffff\1\65\1\66\1\67\1\72\1\70\1\101\1"+
        "\75\1\76\1\uffff\1\130\1\100\3\uffff\1\123\1\126\1\uffff\1\122\1"+
        "\124\1\uffff\1\127\1\132\5\uffff\1\51\36\uffff\1\77\1\131\30\uffff"+
        "\1\115\4\uffff\1\61\4\uffff\1\43\1\uffff\1\116\7\uffff\1\6\6\uffff"+
        "\1\46\12\uffff\1\110\1\uffff\1\24\3\uffff\1\63\1\36\1\uffff\1\42"+
        "\1\114\1\45\1\60\1\117\4\uffff\1\41\1\2\4\uffff\1\53\1\107\2\uffff"+
        "\1\106\2\uffff\1\44\4\uffff\1\25\4\uffff\1\120\1\1\1\uffff\1\7\1"+
        "\3\1\4\2\uffff\1\64\1\10\1\54\1\113\1\121\6\uffff\1\104\2\uffff"+
        "\1\112\1\62\1\103\3\uffff\1\5\1\40\1\102\1\111\1\105";
    static final String DFA15_specialS =
        "\1\2\62\uffff\1\1\1\3\105\uffff\1\0\u00bb\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\46\1\63\2\66\1\50\1\44\1"+
            "\64\1\11\1\12\1\47\1\16\1\24\1\17\1\13\1\51\1\55\1\56\6\57\2"+
            "\62\1\10\1\43\1\36\1\32\1\37\1\7\1\66\4\61\1\15\3\61\1\40\5"+
            "\61\1\41\13\61\1\23\1\66\1\25\1\60\1\61\1\66\1\4\1\34\1\5\1"+
            "\61\1\14\1\22\1\54\1\61\1\2\1\20\1\61\1\42\1\1\1\31\1\3\1\52"+
            "\1\61\1\53\1\6\1\21\1\33\1\35\4\61\1\26\1\45\1\27\1\30\uff81"+
            "\66",
            "\1\67\5\uffff\1\70",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\14\71\1\73\1\72\14"+
            "\71",
            "\1\75",
            "\1\77\1\uffff\1\100\6\uffff\1\76",
            "\1\103\15\uffff\1\102\2\uffff\1\101",
            "\1\110\2\uffff\1\105\1\107\12\uffff\1\106\2\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\121",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\125\14\uffff\1\124",
            "\1\126\7\uffff\1\130\5\uffff\1\127",
            "\1\131",
            "",
            "",
            "",
            "",
            "\1\137",
            "\1\142\15\uffff\1\141",
            "\1\143",
            "\1\145",
            "\1\147\15\uffff\1\146",
            "\1\150",
            "\1\151\17\uffff\1\152",
            "\1\154",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\161\5\uffff\1\160",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167",
            "",
            "\1\173\4\uffff\1\172",
            "\1\175",
            "\1\176",
            "\1\177",
            "\2\u0082\6\u0085\52\uffff\1\u0084\14\uffff\1\u0083\10\uffff"+
            "\1\u0080",
            "\2\u0082\6\u0085\52\uffff\1\u0084\14\uffff\1\u0083",
            "\10\u0085\67\uffff\1\u0083",
            "\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\0\u0086",
            "\0\u0086",
            "",
            "",
            "\1\u0088\15\uffff\1\u0089",
            "\1\u008a",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\17\71\1\u008b\3\71"+
            "\1\u008c\6\71",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0095\1\uffff\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b\13\uffff\1\u009a",
            "\1\u009c",
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
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\10\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\1\u00a5",
            "\1\u00a7\10\uffff\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\2\u0082\6\u0085\52\uffff\1\u0084\14\uffff\1\u0083",
            "",
            "",
            "\10\u0085\67\uffff\1\u0083",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\6\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2\3\uffff\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00d1",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ed",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00f4",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0106",
            "\1\u0107",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0109",
            "\1\u010a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "",
            "\1\u010f",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0111",
            "",
            "",
            "\1\u0112",
            "",
            "",
            "",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u0117",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u011b",
            "\1\u011c",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0126\6\uffff\1\u0125",
            "\1\u0127",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "\1\u0129",
            "\1\u012a",
            "",
            "",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_OCT | RULE_HEX | RULE_BIN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_122 = input.LA(1);

                        s = -1;
                        if ( ((LA15_122>='\u0000' && LA15_122<='\uFFFF')) ) {s = 173;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_51 = input.LA(1);

                        s = -1;
                        if ( ((LA15_51>='\u0000' && LA15_51<='\uFFFF')) ) {s = 134;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='m') ) {s = 1;}

                        else if ( (LA15_0=='i') ) {s = 2;}

                        else if ( (LA15_0=='o') ) {s = 3;}

                        else if ( (LA15_0=='a') ) {s = 4;}

                        else if ( (LA15_0=='c') ) {s = 5;}

                        else if ( (LA15_0=='s') ) {s = 6;}

                        else if ( (LA15_0=='?') ) {s = 7;}

                        else if ( (LA15_0==':') ) {s = 8;}

                        else if ( (LA15_0=='(') ) {s = 9;}

                        else if ( (LA15_0==')') ) {s = 10;}

                        else if ( (LA15_0=='.') ) {s = 11;}

                        else if ( (LA15_0=='e') ) {s = 12;}

                        else if ( (LA15_0=='E') ) {s = 13;}

                        else if ( (LA15_0=='+') ) {s = 14;}

                        else if ( (LA15_0=='-') ) {s = 15;}

                        else if ( (LA15_0=='j') ) {s = 16;}

                        else if ( (LA15_0=='t') ) {s = 17;}

                        else if ( (LA15_0=='f') ) {s = 18;}

                        else if ( (LA15_0=='[') ) {s = 19;}

                        else if ( (LA15_0==',') ) {s = 20;}

                        else if ( (LA15_0==']') ) {s = 21;}

                        else if ( (LA15_0=='{') ) {s = 22;}

                        else if ( (LA15_0=='}') ) {s = 23;}

                        else if ( (LA15_0=='~') ) {s = 24;}

                        else if ( (LA15_0=='n') ) {s = 25;}

                        else if ( (LA15_0=='=') ) {s = 26;}

                        else if ( (LA15_0=='u') ) {s = 27;}

                        else if ( (LA15_0=='b') ) {s = 28;}

                        else if ( (LA15_0=='v') ) {s = 29;}

                        else if ( (LA15_0=='<') ) {s = 30;}

                        else if ( (LA15_0=='>') ) {s = 31;}

                        else if ( (LA15_0=='I') ) {s = 32;}

                        else if ( (LA15_0=='O') ) {s = 33;}

                        else if ( (LA15_0=='l') ) {s = 34;}

                        else if ( (LA15_0==';') ) {s = 35;}

                        else if ( (LA15_0=='&') ) {s = 36;}

                        else if ( (LA15_0=='|') ) {s = 37;}

                        else if ( (LA15_0=='!') ) {s = 38;}

                        else if ( (LA15_0=='*') ) {s = 39;}

                        else if ( (LA15_0=='%') ) {s = 40;}

                        else if ( (LA15_0=='/') ) {s = 41;}

                        else if ( (LA15_0=='p') ) {s = 42;}

                        else if ( (LA15_0=='r') ) {s = 43;}

                        else if ( (LA15_0=='g') ) {s = 44;}

                        else if ( (LA15_0=='0') ) {s = 45;}

                        else if ( (LA15_0=='1') ) {s = 46;}

                        else if ( ((LA15_0>='2' && LA15_0<='7')) ) {s = 47;}

                        else if ( (LA15_0=='^') ) {s = 48;}

                        else if ( ((LA15_0>='A' && LA15_0<='D')||(LA15_0>='F' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='N')||(LA15_0>='P' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='d'||LA15_0=='h'||LA15_0=='k'||LA15_0=='q'||(LA15_0>='w' && LA15_0<='z')) ) {s = 49;}

                        else if ( ((LA15_0>='8' && LA15_0<='9')) ) {s = 50;}

                        else if ( (LA15_0=='\"') ) {s = 51;}

                        else if ( (LA15_0=='\'') ) {s = 52;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 53;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='$')||LA15_0=='@'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='\u007F' && LA15_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_52 = input.LA(1);

                        s = -1;
                        if ( ((LA15_52>='\u0000' && LA15_52<='\uFFFF')) ) {s = 134;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}