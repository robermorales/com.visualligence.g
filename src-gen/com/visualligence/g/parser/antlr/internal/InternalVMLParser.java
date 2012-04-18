package com.visualligence.g.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.visualligence.g.services.VMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_OCT", "RULE_HEX", "RULE_BIN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'input'", "'output'", "'author'", "'creation'", "'more'", "'import'", "'switch'", "'?'", "':'", "'('", "')'", "'.'", "'e'", "'E'", "'+'", "'-'", "'i'", "'j'", "'true'", "'false'", "'[..'", "'->'", "','", "']'", "'['", "'{'", "'}'", "'~'", "'noop'", "'='", "'constant'", "'multi'", "'unit'", "'box'", "'shape'", "'void'", "'auto'", "'<'", "'>'", "'in'", "'~>'", "'alias'", "'stream'", "'<-'", "'I'", "'O'", "'loop'", "'for'", "'factory'", "'file'", "'canvas'", "';'", "'&&'", "'||'", "'!'", "'=='", "'!='", "'<='", "'>='", "'*'", "'%'", "'//'", "'/'", "'**'", "'positive'", "'natural'", "'integer'", "'rational'", "'color'", "'angle'", "'size'", "'position'", "'texture'", "'string'", "'bool'", "'set'", "'bag'", "'list'", "'graph'", "'single'"
    };
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
    public static final int T__92=92;
    public static final int RULE_HEX=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
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


        public InternalVMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVMLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g"; }



     	private VMLGrammarAccess grammarAccess;
     	
        public InternalVMLParser(TokenStream input, VMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	}
       	
       	@Override
       	protected VMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModule"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:68:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:69:2: (iv_ruleModule= ruleModule EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:70:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:77:1: ruleModule returns [EObject current=null] : ( () (otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'input' ( (lv_inputtype_4_0= ruleTypeRef ) ) )? (otherlv_5= 'output' ( (lv_outputtype_6_0= ruleTypeRef ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= RULE_STRING ) ) )? (otherlv_9= 'creation' ( (lv_creation_10_0= RULE_STRING ) ) )? (otherlv_11= 'more' ( (lv_link_12_0= RULE_STRING ) ) )? ( (lv_imports_13_0= ruleImport ) )* ( (lv_sentences_14_0= ruleSentence ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_author_8_0=null;
        Token otherlv_9=null;
        Token lv_creation_10_0=null;
        Token otherlv_11=null;
        Token lv_link_12_0=null;
        EObject lv_inputtype_4_0 = null;

        EObject lv_outputtype_6_0 = null;

        EObject lv_imports_13_0 = null;

        EObject lv_sentences_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:28: ( ( () (otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'input' ( (lv_inputtype_4_0= ruleTypeRef ) ) )? (otherlv_5= 'output' ( (lv_outputtype_6_0= ruleTypeRef ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= RULE_STRING ) ) )? (otherlv_9= 'creation' ( (lv_creation_10_0= RULE_STRING ) ) )? (otherlv_11= 'more' ( (lv_link_12_0= RULE_STRING ) ) )? ( (lv_imports_13_0= ruleImport ) )* ( (lv_sentences_14_0= ruleSentence ) )* ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:81:1: ( () (otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'input' ( (lv_inputtype_4_0= ruleTypeRef ) ) )? (otherlv_5= 'output' ( (lv_outputtype_6_0= ruleTypeRef ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= RULE_STRING ) ) )? (otherlv_9= 'creation' ( (lv_creation_10_0= RULE_STRING ) ) )? (otherlv_11= 'more' ( (lv_link_12_0= RULE_STRING ) ) )? ( (lv_imports_13_0= ruleImport ) )* ( (lv_sentences_14_0= ruleSentence ) )* )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:81:1: ( () (otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'input' ( (lv_inputtype_4_0= ruleTypeRef ) ) )? (otherlv_5= 'output' ( (lv_outputtype_6_0= ruleTypeRef ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= RULE_STRING ) ) )? (otherlv_9= 'creation' ( (lv_creation_10_0= RULE_STRING ) ) )? (otherlv_11= 'more' ( (lv_link_12_0= RULE_STRING ) ) )? ( (lv_imports_13_0= ruleImport ) )* ( (lv_sentences_14_0= ruleSentence ) )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:81:2: () (otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'input' ( (lv_inputtype_4_0= ruleTypeRef ) ) )? (otherlv_5= 'output' ( (lv_outputtype_6_0= ruleTypeRef ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= RULE_STRING ) ) )? (otherlv_9= 'creation' ( (lv_creation_10_0= RULE_STRING ) ) )? (otherlv_11= 'more' ( (lv_link_12_0= RULE_STRING ) ) )? ( (lv_imports_13_0= ruleImport ) )* ( (lv_sentences_14_0= ruleSentence ) )*
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:81:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:87:2: (otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:87:4: otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleModule132); 

                        	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:91:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:92:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:92:1: (lv_name_2_0= RULE_ID )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:93:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule149); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:109:4: (otherlv_3= 'input' ( (lv_inputtype_4_0= ruleTypeRef ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:109:6: otherlv_3= 'input' ( (lv_inputtype_4_0= ruleTypeRef ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleModule169); 

                        	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getInputKeyword_2_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:113:1: ( (lv_inputtype_4_0= ruleTypeRef ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:114:1: (lv_inputtype_4_0= ruleTypeRef )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:114:1: (lv_inputtype_4_0= ruleTypeRef )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:115:3: lv_inputtype_4_0= ruleTypeRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getInputtypeTypeRefParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleModule190);
                    lv_inputtype_4_0=ruleTypeRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"inputtype",
                            		lv_inputtype_4_0, 
                            		"TypeRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:131:4: (otherlv_5= 'output' ( (lv_outputtype_6_0= ruleTypeRef ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:131:6: otherlv_5= 'output' ( (lv_outputtype_6_0= ruleTypeRef ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleModule205); 

                        	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getOutputKeyword_3_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:135:1: ( (lv_outputtype_6_0= ruleTypeRef ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:136:1: (lv_outputtype_6_0= ruleTypeRef )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:136:1: (lv_outputtype_6_0= ruleTypeRef )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:137:3: lv_outputtype_6_0= ruleTypeRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getOutputtypeTypeRefParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleModule226);
                    lv_outputtype_6_0=ruleTypeRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"outputtype",
                            		lv_outputtype_6_0, 
                            		"TypeRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:153:4: (otherlv_7= 'author' ( (lv_author_8_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:153:6: otherlv_7= 'author' ( (lv_author_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleModule241); 

                        	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getAuthorKeyword_4_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:157:1: ( (lv_author_8_0= RULE_STRING ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:158:1: (lv_author_8_0= RULE_STRING )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:158:1: (lv_author_8_0= RULE_STRING )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:159:3: lv_author_8_0= RULE_STRING
                    {
                    lv_author_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModule258); 

                    			newLeafNode(lv_author_8_0, grammarAccess.getModuleAccess().getAuthorSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"author",
                            		lv_author_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:175:4: (otherlv_9= 'creation' ( (lv_creation_10_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:175:6: otherlv_9= 'creation' ( (lv_creation_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleModule278); 

                        	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getCreationKeyword_5_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:179:1: ( (lv_creation_10_0= RULE_STRING ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:180:1: (lv_creation_10_0= RULE_STRING )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:180:1: (lv_creation_10_0= RULE_STRING )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:181:3: lv_creation_10_0= RULE_STRING
                    {
                    lv_creation_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModule295); 

                    			newLeafNode(lv_creation_10_0, grammarAccess.getModuleAccess().getCreationSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"creation",
                            		lv_creation_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:197:4: (otherlv_11= 'more' ( (lv_link_12_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:197:6: otherlv_11= 'more' ( (lv_link_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleModule315); 

                        	newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getMoreKeyword_6_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:201:1: ( (lv_link_12_0= RULE_STRING ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:202:1: (lv_link_12_0= RULE_STRING )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:202:1: (lv_link_12_0= RULE_STRING )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:203:3: lv_link_12_0= RULE_STRING
                    {
                    lv_link_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModule332); 

                    			newLeafNode(lv_link_12_0, grammarAccess.getModuleAccess().getLinkSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"link",
                            		lv_link_12_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:219:4: ( (lv_imports_13_0= ruleImport ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:220:1: (lv_imports_13_0= ruleImport )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:220:1: (lv_imports_13_0= ruleImport )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:221:3: lv_imports_13_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModule360);
            	    lv_imports_13_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_13_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:237:3: ( (lv_sentences_14_0= ruleSentence ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==21||LA8_0==40||LA8_0==43||(LA8_0>=45 && LA8_0<=49)||(LA8_0>=56 && LA8_0<=57)||(LA8_0>=60 && LA8_0<=61)||(LA8_0>=63 && LA8_0<=65)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:238:1: (lv_sentences_14_0= ruleSentence )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:238:1: (lv_sentences_14_0= ruleSentence )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:239:3: lv_sentences_14_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getSentencesSentenceParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSentence_in_ruleModule382);
            	    lv_sentences_14_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentences",
            	            		lv_sentences_14_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleImport"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:263:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:264:2: (iv_ruleImport= ruleImport EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:265:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport419);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:272:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:275:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:276:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:276:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:276:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleImport466); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:280:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:281:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:281:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:282:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport483); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleSentence"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:306:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:307:2: (iv_ruleSentence= ruleSentence EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:308:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence524);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence534); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:315:1: ruleSentence returns [EObject current=null] : (this_Multi_0= ruleMulti | this_Unit_1= ruleUnit | this_Box_2= ruleBox | this_Constant_3= ruleConstant | this_Shape_4= ruleShape | this_TypeAlias_5= ruleTypeAlias | this_Node_6= ruleNode | this_Stream_7= ruleStream | this_Canvas_8= ruleCanvas | this_Block_9= ruleBlock | this_Noop_10= ruleNoop ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject this_Multi_0 = null;

        EObject this_Unit_1 = null;

        EObject this_Box_2 = null;

        EObject this_Constant_3 = null;

        EObject this_Shape_4 = null;

        EObject this_TypeAlias_5 = null;

        EObject this_Node_6 = null;

        EObject this_Stream_7 = null;

        EObject this_Canvas_8 = null;

        EObject this_Block_9 = null;

        EObject this_Noop_10 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:318:28: ( (this_Multi_0= ruleMulti | this_Unit_1= ruleUnit | this_Box_2= ruleBox | this_Constant_3= ruleConstant | this_Shape_4= ruleShape | this_TypeAlias_5= ruleTypeAlias | this_Node_6= ruleNode | this_Stream_7= ruleStream | this_Canvas_8= ruleCanvas | this_Block_9= ruleBlock | this_Noop_10= ruleNoop ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:319:1: (this_Multi_0= ruleMulti | this_Unit_1= ruleUnit | this_Box_2= ruleBox | this_Constant_3= ruleConstant | this_Shape_4= ruleShape | this_TypeAlias_5= ruleTypeAlias | this_Node_6= ruleNode | this_Stream_7= ruleStream | this_Canvas_8= ruleCanvas | this_Block_9= ruleBlock | this_Noop_10= ruleNoop )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:319:1: (this_Multi_0= ruleMulti | this_Unit_1= ruleUnit | this_Box_2= ruleBox | this_Constant_3= ruleConstant | this_Shape_4= ruleShape | this_TypeAlias_5= ruleTypeAlias | this_Node_6= ruleNode | this_Stream_7= ruleStream | this_Canvas_8= ruleCanvas | this_Block_9= ruleBlock | this_Noop_10= ruleNoop )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt9=1;
                }
                break;
            case 47:
                {
                alt9=2;
                }
                break;
            case 48:
                {
                alt9=3;
                }
                break;
            case 45:
                {
                alt9=4;
                }
                break;
            case 49:
                {
                alt9=5;
                }
                break;
            case 56:
                {
                alt9=6;
                }
                break;
            case RULE_ID:
            case 21:
            case 61:
            case 63:
            case 64:
                {
                alt9=7;
                }
                break;
            case 57:
            case 60:
                {
                alt9=8;
                }
                break;
            case 65:
                {
                alt9=9;
                }
                break;
            case 40:
                {
                alt9=10;
                }
                break;
            case 43:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:320:5: this_Multi_0= ruleMulti
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getMultiParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMulti_in_ruleSentence581);
                    this_Multi_0=ruleMulti();

                    state._fsp--;

                     
                            current = this_Multi_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:330:5: this_Unit_1= ruleUnit
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getUnitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnit_in_ruleSentence608);
                    this_Unit_1=ruleUnit();

                    state._fsp--;

                     
                            current = this_Unit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:340:5: this_Box_2= ruleBox
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getBoxParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBox_in_ruleSentence635);
                    this_Box_2=ruleBox();

                    state._fsp--;

                     
                            current = this_Box_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:350:5: this_Constant_3= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getConstantParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleSentence662);
                    this_Constant_3=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:360:5: this_Shape_4= ruleShape
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getShapeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleShape_in_ruleSentence689);
                    this_Shape_4=ruleShape();

                    state._fsp--;

                     
                            current = this_Shape_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:370:5: this_TypeAlias_5= ruleTypeAlias
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getTypeAliasParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTypeAlias_in_ruleSentence716);
                    this_TypeAlias_5=ruleTypeAlias();

                    state._fsp--;

                     
                            current = this_TypeAlias_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:380:5: this_Node_6= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getNodeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleNode_in_ruleSentence743);
                    this_Node_6=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:390:5: this_Stream_7= ruleStream
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getStreamParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleStream_in_ruleSentence770);
                    this_Stream_7=ruleStream();

                    state._fsp--;

                     
                            current = this_Stream_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:400:5: this_Canvas_8= ruleCanvas
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getCanvasParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleCanvas_in_ruleSentence797);
                    this_Canvas_8=ruleCanvas();

                    state._fsp--;

                     
                            current = this_Canvas_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:410:5: this_Block_9= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getBlockParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleSentence824);
                    this_Block_9=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:420:5: this_Noop_10= ruleNoop
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getNoopParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleNoop_in_ruleSentence851);
                    this_Noop_10=ruleNoop();

                    state._fsp--;

                     
                            current = this_Noop_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleNode"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:436:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:437:2: (iv_ruleNode= ruleNode EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:438:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode886);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode896); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:445:1: ruleNode returns [EObject current=null] : (this_Invokation_0= ruleInvokation | this_Factory_1= ruleFactory | this_Loop_2= ruleLoop | this_Switch_3= ruleSwitch | this_File_4= ruleFile ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Invokation_0 = null;

        EObject this_Factory_1 = null;

        EObject this_Loop_2 = null;

        EObject this_Switch_3 = null;

        EObject this_File_4 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:448:28: ( (this_Invokation_0= ruleInvokation | this_Factory_1= ruleFactory | this_Loop_2= ruleLoop | this_Switch_3= ruleSwitch | this_File_4= ruleFile ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:449:1: (this_Invokation_0= ruleInvokation | this_Factory_1= ruleFactory | this_Loop_2= ruleLoop | this_Switch_3= ruleSwitch | this_File_4= ruleFile )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:449:1: (this_Invokation_0= ruleInvokation | this_Factory_1= ruleFactory | this_Loop_2= ruleLoop | this_Switch_3= ruleSwitch | this_File_4= ruleFile )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 63:
                {
                alt10=2;
                }
                break;
            case 61:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 64:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:450:5: this_Invokation_0= ruleInvokation
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getInvokationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInvokation_in_ruleNode943);
                    this_Invokation_0=ruleInvokation();

                    state._fsp--;

                     
                            current = this_Invokation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:460:5: this_Factory_1= ruleFactory
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getFactoryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFactory_in_ruleNode970);
                    this_Factory_1=ruleFactory();

                    state._fsp--;

                     
                            current = this_Factory_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:470:5: this_Loop_2= ruleLoop
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getLoopParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLoop_in_ruleNode997);
                    this_Loop_2=ruleLoop();

                    state._fsp--;

                     
                            current = this_Loop_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:480:5: this_Switch_3= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getSwitchParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleNode1024);
                    this_Switch_3=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:490:5: this_File_4= ruleFile
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getFileParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFile_in_ruleNode1051);
                    this_File_4=ruleFile();

                    state._fsp--;

                     
                            current = this_File_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleSwitch"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:506:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:507:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:508:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch1086);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch1096); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:515:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_test_2_0= ruleLiteralExpression ) ) otherlv_3= '?' ( (lv_a_4_0= ruleLiteralExpression ) ) otherlv_5= ':' ( (lv_b_6_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_test_2_0 = null;

        EObject lv_a_4_0 = null;

        EObject lv_b_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:518:28: ( (otherlv_0= 'switch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_test_2_0= ruleLiteralExpression ) ) otherlv_3= '?' ( (lv_a_4_0= ruleLiteralExpression ) ) otherlv_5= ':' ( (lv_b_6_0= ruleLiteralExpression ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:519:1: (otherlv_0= 'switch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_test_2_0= ruleLiteralExpression ) ) otherlv_3= '?' ( (lv_a_4_0= ruleLiteralExpression ) ) otherlv_5= ':' ( (lv_b_6_0= ruleLiteralExpression ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:519:1: (otherlv_0= 'switch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_test_2_0= ruleLiteralExpression ) ) otherlv_3= '?' ( (lv_a_4_0= ruleLiteralExpression ) ) otherlv_5= ':' ( (lv_b_6_0= ruleLiteralExpression ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:519:3: otherlv_0= 'switch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_test_2_0= ruleLiteralExpression ) ) otherlv_3= '?' ( (lv_a_4_0= ruleLiteralExpression ) ) otherlv_5= ':' ( (lv_b_6_0= ruleLiteralExpression ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSwitch1133); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:523:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:524:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:524:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:525:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitch1150); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSwitchAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSwitchRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:541:2: ( (lv_test_2_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:542:1: (lv_test_2_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:542:1: (lv_test_2_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:543:3: lv_test_2_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getTestLiteralExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSwitch1176);
            lv_test_2_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"test",
                    		lv_test_2_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSwitch1188); 

                	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getQuestionMarkKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:563:1: ( (lv_a_4_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:564:1: (lv_a_4_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:564:1: (lv_a_4_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:565:3: lv_a_4_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getALiteralExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSwitch1209);
            lv_a_4_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"a",
                    		lv_a_4_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleSwitch1221); 

                	newLeafNode(otherlv_5, grammarAccess.getSwitchAccess().getColonKeyword_5());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:585:1: ( (lv_b_6_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:586:1: (lv_b_6_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:586:1: (lv_b_6_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:587:3: lv_b_6_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getBLiteralExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSwitch1242);
            lv_b_6_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"b",
                    		lv_b_6_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleLiteralExpression"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:611:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:612:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:613:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression1278);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpression1288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:620:1: ruleLiteralExpression returns [EObject current=null] : this_LiteralExpressionBin_0= ruleLiteralExpressionBin ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpressionBin_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:623:28: (this_LiteralExpressionBin_0= ruleLiteralExpressionBin )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:625:5: this_LiteralExpressionBin_0= ruleLiteralExpressionBin
            {
             
                    newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionBinParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleLiteralExpressionBin_in_ruleLiteralExpression1334);
            this_LiteralExpressionBin_0=ruleLiteralExpressionBin();

            state._fsp--;

             
                    current = this_LiteralExpressionBin_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralExpressionBin"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:641:1: entryRuleLiteralExpressionBin returns [EObject current=null] : iv_ruleLiteralExpressionBin= ruleLiteralExpressionBin EOF ;
    public final EObject entryRuleLiteralExpressionBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpressionBin = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:642:2: (iv_ruleLiteralExpressionBin= ruleLiteralExpressionBin EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:643:2: iv_ruleLiteralExpressionBin= ruleLiteralExpressionBin EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionBinRule()); 
            pushFollow(FOLLOW_ruleLiteralExpressionBin_in_entryRuleLiteralExpressionBin1368);
            iv_ruleLiteralExpressionBin=ruleLiteralExpressionBin();

            state._fsp--;

             current =iv_ruleLiteralExpressionBin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpressionBin1378); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpressionBin"


    // $ANTLR start "ruleLiteralExpressionBin"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:650:1: ruleLiteralExpressionBin returns [EObject current=null] : (this_LiteralExpressionComp_0= ruleLiteralExpressionComp ( () ( (lv_op_2_0= ruleBinOp ) ) ( (lv_right_3_0= ruleLiteralExpressionBin ) ) )? ) ;
    public final EObject ruleLiteralExpressionBin() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpressionComp_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:653:28: ( (this_LiteralExpressionComp_0= ruleLiteralExpressionComp ( () ( (lv_op_2_0= ruleBinOp ) ) ( (lv_right_3_0= ruleLiteralExpressionBin ) ) )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:654:1: (this_LiteralExpressionComp_0= ruleLiteralExpressionComp ( () ( (lv_op_2_0= ruleBinOp ) ) ( (lv_right_3_0= ruleLiteralExpressionBin ) ) )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:654:1: (this_LiteralExpressionComp_0= ruleLiteralExpressionComp ( () ( (lv_op_2_0= ruleBinOp ) ) ( (lv_right_3_0= ruleLiteralExpressionBin ) ) )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:655:5: this_LiteralExpressionComp_0= ruleLiteralExpressionComp ( () ( (lv_op_2_0= ruleBinOp ) ) ( (lv_right_3_0= ruleLiteralExpressionBin ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLiteralExpressionBinAccess().getLiteralExpressionCompParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLiteralExpressionComp_in_ruleLiteralExpressionBin1425);
            this_LiteralExpressionComp_0=ruleLiteralExpressionComp();

            state._fsp--;

             
                    current = this_LiteralExpressionComp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:663:1: ( () ( (lv_op_2_0= ruleBinOp ) ) ( (lv_right_3_0= ruleLiteralExpressionBin ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=67 && LA11_0<=68)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:663:2: () ( (lv_op_2_0= ruleBinOp ) ) ( (lv_right_3_0= ruleLiteralExpressionBin ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:663:2: ()
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:664:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getLiteralExpressionBinAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:669:2: ( (lv_op_2_0= ruleBinOp ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:670:1: (lv_op_2_0= ruleBinOp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:670:1: (lv_op_2_0= ruleBinOp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:671:3: lv_op_2_0= ruleBinOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionBinAccess().getOpBinOpEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBinOp_in_ruleLiteralExpressionBin1455);
                    lv_op_2_0=ruleBinOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionBinRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"BinOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:687:2: ( (lv_right_3_0= ruleLiteralExpressionBin ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:688:1: (lv_right_3_0= ruleLiteralExpressionBin )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:688:1: (lv_right_3_0= ruleLiteralExpressionBin )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:689:3: lv_right_3_0= ruleLiteralExpressionBin
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionBinAccess().getRightLiteralExpressionBinParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpressionBin_in_ruleLiteralExpressionBin1476);
                    lv_right_3_0=ruleLiteralExpressionBin();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionBinRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"LiteralExpressionBin");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpressionBin"


    // $ANTLR start "entryRuleLiteralExpressionComp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:713:1: entryRuleLiteralExpressionComp returns [EObject current=null] : iv_ruleLiteralExpressionComp= ruleLiteralExpressionComp EOF ;
    public final EObject entryRuleLiteralExpressionComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpressionComp = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:714:2: (iv_ruleLiteralExpressionComp= ruleLiteralExpressionComp EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:715:2: iv_ruleLiteralExpressionComp= ruleLiteralExpressionComp EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionCompRule()); 
            pushFollow(FOLLOW_ruleLiteralExpressionComp_in_entryRuleLiteralExpressionComp1514);
            iv_ruleLiteralExpressionComp=ruleLiteralExpressionComp();

            state._fsp--;

             current =iv_ruleLiteralExpressionComp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpressionComp1524); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpressionComp"


    // $ANTLR start "ruleLiteralExpressionComp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:722:1: ruleLiteralExpressionComp returns [EObject current=null] : (this_LiteralExpressionAdd_0= ruleLiteralExpressionAdd ( () ( (lv_op_2_0= ruleCompOp ) ) ( (lv_right_3_0= ruleLiteralExpressionComp ) ) )? ) ;
    public final EObject ruleLiteralExpressionComp() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpressionAdd_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:725:28: ( (this_LiteralExpressionAdd_0= ruleLiteralExpressionAdd ( () ( (lv_op_2_0= ruleCompOp ) ) ( (lv_right_3_0= ruleLiteralExpressionComp ) ) )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:726:1: (this_LiteralExpressionAdd_0= ruleLiteralExpressionAdd ( () ( (lv_op_2_0= ruleCompOp ) ) ( (lv_right_3_0= ruleLiteralExpressionComp ) ) )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:726:1: (this_LiteralExpressionAdd_0= ruleLiteralExpressionAdd ( () ( (lv_op_2_0= ruleCompOp ) ) ( (lv_right_3_0= ruleLiteralExpressionComp ) ) )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:727:5: this_LiteralExpressionAdd_0= ruleLiteralExpressionAdd ( () ( (lv_op_2_0= ruleCompOp ) ) ( (lv_right_3_0= ruleLiteralExpressionComp ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLiteralExpressionCompAccess().getLiteralExpressionAddParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLiteralExpressionAdd_in_ruleLiteralExpressionComp1571);
            this_LiteralExpressionAdd_0=ruleLiteralExpressionAdd();

            state._fsp--;

             
                    current = this_LiteralExpressionAdd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:735:1: ( () ( (lv_op_2_0= ruleCompOp ) ) ( (lv_right_3_0= ruleLiteralExpressionComp ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=52 && LA12_0<=53)||(LA12_0>=70 && LA12_0<=73)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:735:2: () ( (lv_op_2_0= ruleCompOp ) ) ( (lv_right_3_0= ruleLiteralExpressionComp ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:735:2: ()
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:736:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getLiteralExpressionCompAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:741:2: ( (lv_op_2_0= ruleCompOp ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:742:1: (lv_op_2_0= ruleCompOp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:742:1: (lv_op_2_0= ruleCompOp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:743:3: lv_op_2_0= ruleCompOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionCompAccess().getOpCompOpEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCompOp_in_ruleLiteralExpressionComp1601);
                    lv_op_2_0=ruleCompOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionCompRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"CompOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:759:2: ( (lv_right_3_0= ruleLiteralExpressionComp ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:760:1: (lv_right_3_0= ruleLiteralExpressionComp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:760:1: (lv_right_3_0= ruleLiteralExpressionComp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:761:3: lv_right_3_0= ruleLiteralExpressionComp
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionCompAccess().getRightLiteralExpressionCompParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpressionComp_in_ruleLiteralExpressionComp1622);
                    lv_right_3_0=ruleLiteralExpressionComp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionCompRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"LiteralExpressionComp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpressionComp"


    // $ANTLR start "entryRuleLiteralExpressionAdd"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:785:1: entryRuleLiteralExpressionAdd returns [EObject current=null] : iv_ruleLiteralExpressionAdd= ruleLiteralExpressionAdd EOF ;
    public final EObject entryRuleLiteralExpressionAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpressionAdd = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:786:2: (iv_ruleLiteralExpressionAdd= ruleLiteralExpressionAdd EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:787:2: iv_ruleLiteralExpressionAdd= ruleLiteralExpressionAdd EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionAddRule()); 
            pushFollow(FOLLOW_ruleLiteralExpressionAdd_in_entryRuleLiteralExpressionAdd1660);
            iv_ruleLiteralExpressionAdd=ruleLiteralExpressionAdd();

            state._fsp--;

             current =iv_ruleLiteralExpressionAdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpressionAdd1670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpressionAdd"


    // $ANTLR start "ruleLiteralExpressionAdd"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:794:1: ruleLiteralExpressionAdd returns [EObject current=null] : (this_LiteralExpressionMulti_0= ruleLiteralExpressionMulti ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleLiteralExpressionAdd ) ) )? ) ;
    public final EObject ruleLiteralExpressionAdd() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpressionMulti_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:797:28: ( (this_LiteralExpressionMulti_0= ruleLiteralExpressionMulti ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleLiteralExpressionAdd ) ) )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:798:1: (this_LiteralExpressionMulti_0= ruleLiteralExpressionMulti ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleLiteralExpressionAdd ) ) )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:798:1: (this_LiteralExpressionMulti_0= ruleLiteralExpressionMulti ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleLiteralExpressionAdd ) ) )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:799:5: this_LiteralExpressionMulti_0= ruleLiteralExpressionMulti ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleLiteralExpressionAdd ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLiteralExpressionAddAccess().getLiteralExpressionMultiParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLiteralExpressionMulti_in_ruleLiteralExpressionAdd1717);
            this_LiteralExpressionMulti_0=ruleLiteralExpressionMulti();

            state._fsp--;

             
                    current = this_LiteralExpressionMulti_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:807:1: ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleLiteralExpressionAdd ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=29 && LA13_0<=30)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:807:2: () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleLiteralExpressionAdd ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:807:2: ()
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:808:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getLiteralExpressionAddAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:813:2: ( (lv_op_2_0= ruleAddOp ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:814:1: (lv_op_2_0= ruleAddOp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:814:1: (lv_op_2_0= ruleAddOp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:815:3: lv_op_2_0= ruleAddOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionAddAccess().getOpAddOpEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddOp_in_ruleLiteralExpressionAdd1747);
                    lv_op_2_0=ruleAddOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionAddRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"AddOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:831:2: ( (lv_right_3_0= ruleLiteralExpressionAdd ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:832:1: (lv_right_3_0= ruleLiteralExpressionAdd )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:832:1: (lv_right_3_0= ruleLiteralExpressionAdd )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:833:3: lv_right_3_0= ruleLiteralExpressionAdd
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionAddAccess().getRightLiteralExpressionAddParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpressionAdd_in_ruleLiteralExpressionAdd1768);
                    lv_right_3_0=ruleLiteralExpressionAdd();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionAddRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"LiteralExpressionAdd");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpressionAdd"


    // $ANTLR start "entryRuleLiteralExpressionMulti"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:857:1: entryRuleLiteralExpressionMulti returns [EObject current=null] : iv_ruleLiteralExpressionMulti= ruleLiteralExpressionMulti EOF ;
    public final EObject entryRuleLiteralExpressionMulti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpressionMulti = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:858:2: (iv_ruleLiteralExpressionMulti= ruleLiteralExpressionMulti EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:859:2: iv_ruleLiteralExpressionMulti= ruleLiteralExpressionMulti EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionMultiRule()); 
            pushFollow(FOLLOW_ruleLiteralExpressionMulti_in_entryRuleLiteralExpressionMulti1806);
            iv_ruleLiteralExpressionMulti=ruleLiteralExpressionMulti();

            state._fsp--;

             current =iv_ruleLiteralExpressionMulti; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpressionMulti1816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpressionMulti"


    // $ANTLR start "ruleLiteralExpressionMulti"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:866:1: ruleLiteralExpressionMulti returns [EObject current=null] : (this_LiteralExpressionExp_0= ruleLiteralExpressionExp ( () ( (lv_op_2_0= ruleMultiOp ) ) ( (lv_right_3_0= ruleLiteralExpressionMulti ) ) )? ) ;
    public final EObject ruleLiteralExpressionMulti() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpressionExp_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:869:28: ( (this_LiteralExpressionExp_0= ruleLiteralExpressionExp ( () ( (lv_op_2_0= ruleMultiOp ) ) ( (lv_right_3_0= ruleLiteralExpressionMulti ) ) )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:870:1: (this_LiteralExpressionExp_0= ruleLiteralExpressionExp ( () ( (lv_op_2_0= ruleMultiOp ) ) ( (lv_right_3_0= ruleLiteralExpressionMulti ) ) )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:870:1: (this_LiteralExpressionExp_0= ruleLiteralExpressionExp ( () ( (lv_op_2_0= ruleMultiOp ) ) ( (lv_right_3_0= ruleLiteralExpressionMulti ) ) )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:871:5: this_LiteralExpressionExp_0= ruleLiteralExpressionExp ( () ( (lv_op_2_0= ruleMultiOp ) ) ( (lv_right_3_0= ruleLiteralExpressionMulti ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLiteralExpressionMultiAccess().getLiteralExpressionExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLiteralExpressionExp_in_ruleLiteralExpressionMulti1863);
            this_LiteralExpressionExp_0=ruleLiteralExpressionExp();

            state._fsp--;

             
                    current = this_LiteralExpressionExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:879:1: ( () ( (lv_op_2_0= ruleMultiOp ) ) ( (lv_right_3_0= ruleLiteralExpressionMulti ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=74 && LA14_0<=77)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:879:2: () ( (lv_op_2_0= ruleMultiOp ) ) ( (lv_right_3_0= ruleLiteralExpressionMulti ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:879:2: ()
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:880:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getLiteralExpressionMultiAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:885:2: ( (lv_op_2_0= ruleMultiOp ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:886:1: (lv_op_2_0= ruleMultiOp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:886:1: (lv_op_2_0= ruleMultiOp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:887:3: lv_op_2_0= ruleMultiOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionMultiAccess().getOpMultiOpEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiOp_in_ruleLiteralExpressionMulti1893);
                    lv_op_2_0=ruleMultiOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionMultiRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"MultiOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:903:2: ( (lv_right_3_0= ruleLiteralExpressionMulti ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:904:1: (lv_right_3_0= ruleLiteralExpressionMulti )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:904:1: (lv_right_3_0= ruleLiteralExpressionMulti )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:905:3: lv_right_3_0= ruleLiteralExpressionMulti
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionMultiAccess().getRightLiteralExpressionMultiParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpressionMulti_in_ruleLiteralExpressionMulti1914);
                    lv_right_3_0=ruleLiteralExpressionMulti();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionMultiRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"LiteralExpressionMulti");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpressionMulti"


    // $ANTLR start "entryRuleLiteralExpressionExp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:929:1: entryRuleLiteralExpressionExp returns [EObject current=null] : iv_ruleLiteralExpressionExp= ruleLiteralExpressionExp EOF ;
    public final EObject entryRuleLiteralExpressionExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpressionExp = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:930:2: (iv_ruleLiteralExpressionExp= ruleLiteralExpressionExp EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:931:2: iv_ruleLiteralExpressionExp= ruleLiteralExpressionExp EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionExpRule()); 
            pushFollow(FOLLOW_ruleLiteralExpressionExp_in_entryRuleLiteralExpressionExp1952);
            iv_ruleLiteralExpressionExp=ruleLiteralExpressionExp();

            state._fsp--;

             current =iv_ruleLiteralExpressionExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpressionExp1962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpressionExp"


    // $ANTLR start "ruleLiteralExpressionExp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:938:1: ruleLiteralExpressionExp returns [EObject current=null] : (this_LiteralExpressionSigned_0= ruleLiteralExpressionSigned ( () ( (lv_op_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleLiteralExpressionExp ) ) )? ) ;
    public final EObject ruleLiteralExpressionExp() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpressionSigned_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:941:28: ( (this_LiteralExpressionSigned_0= ruleLiteralExpressionSigned ( () ( (lv_op_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleLiteralExpressionExp ) ) )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:942:1: (this_LiteralExpressionSigned_0= ruleLiteralExpressionSigned ( () ( (lv_op_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleLiteralExpressionExp ) ) )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:942:1: (this_LiteralExpressionSigned_0= ruleLiteralExpressionSigned ( () ( (lv_op_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleLiteralExpressionExp ) ) )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:943:5: this_LiteralExpressionSigned_0= ruleLiteralExpressionSigned ( () ( (lv_op_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleLiteralExpressionExp ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getLiteralExpressionExpAccess().getLiteralExpressionSignedParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLiteralExpressionSigned_in_ruleLiteralExpressionExp2009);
            this_LiteralExpressionSigned_0=ruleLiteralExpressionSigned();

            state._fsp--;

             
                    current = this_LiteralExpressionSigned_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:951:1: ( () ( (lv_op_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleLiteralExpressionExp ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==78) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:951:2: () ( (lv_op_2_0= ruleExpOp ) ) ( (lv_right_3_0= ruleLiteralExpressionExp ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:951:2: ()
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:952:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getLiteralExpressionExpAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:957:2: ( (lv_op_2_0= ruleExpOp ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:958:1: (lv_op_2_0= ruleExpOp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:958:1: (lv_op_2_0= ruleExpOp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:959:3: lv_op_2_0= ruleExpOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionExpAccess().getOpExpOpEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpOp_in_ruleLiteralExpressionExp2039);
                    lv_op_2_0=ruleExpOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionExpRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"ExpOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:975:2: ( (lv_right_3_0= ruleLiteralExpressionExp ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:976:1: (lv_right_3_0= ruleLiteralExpressionExp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:976:1: (lv_right_3_0= ruleLiteralExpressionExp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:977:3: lv_right_3_0= ruleLiteralExpressionExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionExpAccess().getRightLiteralExpressionExpParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpressionExp_in_ruleLiteralExpressionExp2060);
                    lv_right_3_0=ruleLiteralExpressionExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionExpRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"LiteralExpressionExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpressionExp"


    // $ANTLR start "entryRuleLiteralExpressionSigned"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1001:1: entryRuleLiteralExpressionSigned returns [EObject current=null] : iv_ruleLiteralExpressionSigned= ruleLiteralExpressionSigned EOF ;
    public final EObject entryRuleLiteralExpressionSigned() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpressionSigned = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1002:2: (iv_ruleLiteralExpressionSigned= ruleLiteralExpressionSigned EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1003:2: iv_ruleLiteralExpressionSigned= ruleLiteralExpressionSigned EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionSignedRule()); 
            pushFollow(FOLLOW_ruleLiteralExpressionSigned_in_entryRuleLiteralExpressionSigned2098);
            iv_ruleLiteralExpressionSigned=ruleLiteralExpressionSigned();

            state._fsp--;

             current =iv_ruleLiteralExpressionSigned; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpressionSigned2108); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpressionSigned"


    // $ANTLR start "ruleLiteralExpressionSigned"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1010:1: ruleLiteralExpressionSigned returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) ) ) ( (lv_right_2_0= ruleLiteralExpressionTerminal ) ) ) | this_LiteralExpressionTerminal_3= ruleLiteralExpressionTerminal ) ;
    public final EObject ruleLiteralExpressionSigned() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_1_1 = null;

        Enumerator lv_op_1_2 = null;

        EObject lv_right_2_0 = null;

        EObject this_LiteralExpressionTerminal_3 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1013:28: ( ( ( () ( ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) ) ) ( (lv_right_2_0= ruleLiteralExpressionTerminal ) ) ) | this_LiteralExpressionTerminal_3= ruleLiteralExpressionTerminal ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1014:1: ( ( () ( ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) ) ) ( (lv_right_2_0= ruleLiteralExpressionTerminal ) ) ) | this_LiteralExpressionTerminal_3= ruleLiteralExpressionTerminal )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1014:1: ( ( () ( ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) ) ) ( (lv_right_2_0= ruleLiteralExpressionTerminal ) ) ) | this_LiteralExpressionTerminal_3= ruleLiteralExpressionTerminal )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=29 && LA17_0<=30)||LA17_0==69) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_BIN)||LA17_0==24||LA17_0==26||(LA17_0>=31 && LA17_0<=35)||(LA17_0>=39 && LA17_0<=40)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1014:2: ( () ( ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) ) ) ( (lv_right_2_0= ruleLiteralExpressionTerminal ) ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1014:2: ( () ( ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) ) ) ( (lv_right_2_0= ruleLiteralExpressionTerminal ) ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1014:3: () ( ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) ) ) ( (lv_right_2_0= ruleLiteralExpressionTerminal ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1014:3: ()
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1015:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralExpressionSignedAccess().getUnaryOperationAction_0_0(),
                                current);
                        

                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1020:2: ( ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1021:1: ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1021:1: ( (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1022:1: (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1022:1: (lv_op_1_1= ruleAddOp | lv_op_1_2= ruleNegationOp )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=29 && LA16_0<=30)) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==69) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1023:3: lv_op_1_1= ruleAddOp
                            {
                             
                            	        newCompositeNode(grammarAccess.getLiteralExpressionSignedAccess().getOpAddOpEnumRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAddOp_in_ruleLiteralExpressionSigned2166);
                            lv_op_1_1=ruleAddOp();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLiteralExpressionSignedRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_1_1, 
                                    		"AddOp");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1038:8: lv_op_1_2= ruleNegationOp
                            {
                             
                            	        newCompositeNode(grammarAccess.getLiteralExpressionSignedAccess().getOpNegationOpEnumRuleCall_0_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleNegationOp_in_ruleLiteralExpressionSigned2185);
                            lv_op_1_2=ruleNegationOp();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLiteralExpressionSignedRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_1_2, 
                                    		"NegationOp");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1056:2: ( (lv_right_2_0= ruleLiteralExpressionTerminal ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1057:1: (lv_right_2_0= ruleLiteralExpressionTerminal )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1057:1: (lv_right_2_0= ruleLiteralExpressionTerminal )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1058:3: lv_right_2_0= ruleLiteralExpressionTerminal
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionSignedAccess().getRightLiteralExpressionTerminalParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpressionTerminal_in_ruleLiteralExpressionSigned2209);
                    lv_right_2_0=ruleLiteralExpressionTerminal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionSignedRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_2_0, 
                            		"LiteralExpressionTerminal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1076:5: this_LiteralExpressionTerminal_3= ruleLiteralExpressionTerminal
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralExpressionSignedAccess().getLiteralExpressionTerminalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralExpressionTerminal_in_ruleLiteralExpressionSigned2238);
                    this_LiteralExpressionTerminal_3=ruleLiteralExpressionTerminal();

                    state._fsp--;

                     
                            current = this_LiteralExpressionTerminal_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpressionSigned"


    // $ANTLR start "entryRuleLiteralExpressionTerminal"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1092:1: entryRuleLiteralExpressionTerminal returns [EObject current=null] : iv_ruleLiteralExpressionTerminal= ruleLiteralExpressionTerminal EOF ;
    public final EObject entryRuleLiteralExpressionTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpressionTerminal = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1093:2: (iv_ruleLiteralExpressionTerminal= ruleLiteralExpressionTerminal EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1094:2: iv_ruleLiteralExpressionTerminal= ruleLiteralExpressionTerminal EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionTerminalRule()); 
            pushFollow(FOLLOW_ruleLiteralExpressionTerminal_in_entryRuleLiteralExpressionTerminal2273);
            iv_ruleLiteralExpressionTerminal=ruleLiteralExpressionTerminal();

            state._fsp--;

             current =iv_ruleLiteralExpressionTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpressionTerminal2283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpressionTerminal"


    // $ANTLR start "ruleLiteralExpressionTerminal"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1101:1: ruleLiteralExpressionTerminal returns [EObject current=null] : ( (otherlv_0= '(' this_LiteralExpression_1= ruleLiteralExpression otherlv_2= ')' ) | this_RValue_3= ruleRValue ) ;
    public final EObject ruleLiteralExpressionTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_LiteralExpression_1 = null;

        EObject this_RValue_3 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1104:28: ( ( (otherlv_0= '(' this_LiteralExpression_1= ruleLiteralExpression otherlv_2= ')' ) | this_RValue_3= ruleRValue ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1105:1: ( (otherlv_0= '(' this_LiteralExpression_1= ruleLiteralExpression otherlv_2= ')' ) | this_RValue_3= ruleRValue )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1105:1: ( (otherlv_0= '(' this_LiteralExpression_1= ruleLiteralExpression otherlv_2= ')' ) | this_RValue_3= ruleRValue )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                case RULE_INT:
                case RULE_OCT:
                case RULE_HEX:
                case RULE_BIN:
                case 24:
                case 26:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 39:
                case 40:
                case 69:
                    {
                    alt18=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA18_4 = input.LA(3);

                    if ( (LA18_4==23) ) {
                        alt18=2;
                    }
                    else if ( (LA18_4==25||(LA18_4>=29 && LA18_4<=30)||(LA18_4>=52 && LA18_4<=53)||(LA18_4>=67 && LA18_4<=68)||(LA18_4>=70 && LA18_4<=78)) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 25:
                    {
                    alt18=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_BIN)||LA18_0==26||(LA18_0>=31 && LA18_0<=35)||(LA18_0>=39 && LA18_0<=40)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1105:2: (otherlv_0= '(' this_LiteralExpression_1= ruleLiteralExpression otherlv_2= ')' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1105:2: (otherlv_0= '(' this_LiteralExpression_1= ruleLiteralExpression otherlv_2= ')' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1105:4: otherlv_0= '(' this_LiteralExpression_1= ruleLiteralExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleLiteralExpressionTerminal2321); 

                        	newLeafNode(otherlv_0, grammarAccess.getLiteralExpressionTerminalAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getLiteralExpressionTerminalAccess().getLiteralExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleLiteralExpressionTerminal2343);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleLiteralExpressionTerminal2354); 

                        	newLeafNode(otherlv_2, grammarAccess.getLiteralExpressionTerminalAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1124:5: this_RValue_3= ruleRValue
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralExpressionTerminalAccess().getRValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRValue_in_ruleLiteralExpressionTerminal2383);
                    this_RValue_3=ruleRValue();

                    state._fsp--;

                     
                            current = this_RValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpressionTerminal"


    // $ANTLR start "entryRuleRValue"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1140:1: entryRuleRValue returns [EObject current=null] : iv_ruleRValue= ruleRValue EOF ;
    public final EObject entryRuleRValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRValue = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1141:2: (iv_ruleRValue= ruleRValue EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1142:2: iv_ruleRValue= ruleRValue EOF
            {
             newCompositeNode(grammarAccess.getRValueRule()); 
            pushFollow(FOLLOW_ruleRValue_in_entryRuleRValue2418);
            iv_ruleRValue=ruleRValue();

            state._fsp--;

             current =iv_ruleRValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRValue2428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRValue"


    // $ANTLR start "ruleRValue"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1149:1: ruleRValue returns [EObject current=null] : (this_SingleLiteral_0= ruleSingleLiteral | this_SequenceLiteral_1= ruleSequenceLiteral | this_TupleLiteral_2= ruleTupleLiteral | this_SetLiteral_3= ruleSetLiteral | this_ConstantRef_4= ruleConstantRef ) ;
    public final EObject ruleRValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleLiteral_0 = null;

        EObject this_SequenceLiteral_1 = null;

        EObject this_TupleLiteral_2 = null;

        EObject this_SetLiteral_3 = null;

        EObject this_ConstantRef_4 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1152:28: ( (this_SingleLiteral_0= ruleSingleLiteral | this_SequenceLiteral_1= ruleSequenceLiteral | this_TupleLiteral_2= ruleTupleLiteral | this_SetLiteral_3= ruleSetLiteral | this_ConstantRef_4= ruleConstantRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1153:1: (this_SingleLiteral_0= ruleSingleLiteral | this_SequenceLiteral_1= ruleSequenceLiteral | this_TupleLiteral_2= ruleTupleLiteral | this_SetLiteral_3= ruleSetLiteral | this_ConstantRef_4= ruleConstantRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1153:1: (this_SingleLiteral_0= ruleSingleLiteral | this_SequenceLiteral_1= ruleSequenceLiteral | this_TupleLiteral_2= ruleTupleLiteral | this_SetLiteral_3= ruleSetLiteral | this_ConstantRef_4= ruleConstantRef )
            int alt19=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_OCT:
            case RULE_HEX:
            case RULE_BIN:
            case 26:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
            case 39:
                {
                alt19=2;
                }
                break;
            case 24:
                {
                alt19=3;
                }
                break;
            case 40:
                {
                alt19=4;
                }
                break;
            case RULE_ID:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1154:5: this_SingleLiteral_0= ruleSingleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getRValueAccess().getSingleLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleLiteral_in_ruleRValue2475);
                    this_SingleLiteral_0=ruleSingleLiteral();

                    state._fsp--;

                     
                            current = this_SingleLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1164:5: this_SequenceLiteral_1= ruleSequenceLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getRValueAccess().getSequenceLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSequenceLiteral_in_ruleRValue2502);
                    this_SequenceLiteral_1=ruleSequenceLiteral();

                    state._fsp--;

                     
                            current = this_SequenceLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1174:5: this_TupleLiteral_2= ruleTupleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getRValueAccess().getTupleLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTupleLiteral_in_ruleRValue2529);
                    this_TupleLiteral_2=ruleTupleLiteral();

                    state._fsp--;

                     
                            current = this_TupleLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1184:5: this_SetLiteral_3= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getRValueAccess().getSetLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleRValue2556);
                    this_SetLiteral_3=ruleSetLiteral();

                    state._fsp--;

                     
                            current = this_SetLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1194:5: this_ConstantRef_4= ruleConstantRef
                    {
                     
                            newCompositeNode(grammarAccess.getRValueAccess().getConstantRefParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleConstantRef_in_ruleRValue2583);
                    this_ConstantRef_4=ruleConstantRef();

                    state._fsp--;

                     
                            current = this_ConstantRef_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRValue"


    // $ANTLR start "entryRuleConstantRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1214:1: entryRuleConstantRef returns [EObject current=null] : iv_ruleConstantRef= ruleConstantRef EOF ;
    public final EObject entryRuleConstantRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1215:2: (iv_ruleConstantRef= ruleConstantRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1216:2: iv_ruleConstantRef= ruleConstantRef EOF
            {
             newCompositeNode(grammarAccess.getConstantRefRule()); 
            pushFollow(FOLLOW_ruleConstantRef_in_entryRuleConstantRef2622);
            iv_ruleConstantRef=ruleConstantRef();

            state._fsp--;

             current =iv_ruleConstantRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantRef2632); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantRef"


    // $ANTLR start "ruleConstantRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1223:1: ruleConstantRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1226:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1227:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1227:1: ( (otherlv_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1228:1: (otherlv_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1228:1: (otherlv_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1229:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantRef2676); 

            		newLeafNode(otherlv_0, grammarAccess.getConstantRefAccess().getConstantrefConstantCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantRef"


    // $ANTLR start "entryRuleSingleLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1248:1: entryRuleSingleLiteral returns [EObject current=null] : iv_ruleSingleLiteral= ruleSingleLiteral EOF ;
    public final EObject entryRuleSingleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleLiteral = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1249:2: (iv_ruleSingleLiteral= ruleSingleLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1250:2: iv_ruleSingleLiteral= ruleSingleLiteral EOF
            {
             newCompositeNode(grammarAccess.getSingleLiteralRule()); 
            pushFollow(FOLLOW_ruleSingleLiteral_in_entryRuleSingleLiteral2711);
            iv_ruleSingleLiteral=ruleSingleLiteral();

            state._fsp--;

             current =iv_ruleSingleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleLiteral2721); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleLiteral"


    // $ANTLR start "ruleSingleLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1257:1: ruleSingleLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleSingleLiteralDT ) ) ;
    public final EObject ruleSingleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1260:28: ( ( (lv_value_0_0= ruleSingleLiteralDT ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1261:1: ( (lv_value_0_0= ruleSingleLiteralDT ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1261:1: ( (lv_value_0_0= ruleSingleLiteralDT ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1262:1: (lv_value_0_0= ruleSingleLiteralDT )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1262:1: (lv_value_0_0= ruleSingleLiteralDT )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1263:3: lv_value_0_0= ruleSingleLiteralDT
            {
             
            	        newCompositeNode(grammarAccess.getSingleLiteralAccess().getValueSingleLiteralDTParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleLiteralDT_in_ruleSingleLiteral2766);
            lv_value_0_0=ruleSingleLiteralDT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"SingleLiteralDT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleLiteral"


    // $ANTLR start "entryRuleSingleLiteralDT"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1287:1: entryRuleSingleLiteralDT returns [String current=null] : iv_ruleSingleLiteralDT= ruleSingleLiteralDT EOF ;
    public final String entryRuleSingleLiteralDT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleLiteralDT = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1288:2: (iv_ruleSingleLiteralDT= ruleSingleLiteralDT EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1289:2: iv_ruleSingleLiteralDT= ruleSingleLiteralDT EOF
            {
             newCompositeNode(grammarAccess.getSingleLiteralDTRule()); 
            pushFollow(FOLLOW_ruleSingleLiteralDT_in_entryRuleSingleLiteralDT2802);
            iv_ruleSingleLiteralDT=ruleSingleLiteralDT();

            state._fsp--;

             current =iv_ruleSingleLiteralDT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleLiteralDT2813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleLiteralDT"


    // $ANTLR start "ruleSingleLiteralDT"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1296:1: ruleSingleLiteralDT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BoolLiteral_0= ruleBoolLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_StringLiteral_2= ruleStringLiteral ) ;
    public final AntlrDatatypeRuleToken ruleSingleLiteralDT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BoolLiteral_0 = null;

        AntlrDatatypeRuleToken this_NumberLiteral_1 = null;

        AntlrDatatypeRuleToken this_StringLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1299:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_StringLiteral_2= ruleStringLiteral ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1300:1: (this_BoolLiteral_0= ruleBoolLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_StringLiteral_2= ruleStringLiteral )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1300:1: (this_BoolLiteral_0= ruleBoolLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_StringLiteral_2= ruleStringLiteral )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
            case RULE_OCT:
            case RULE_HEX:
            case RULE_BIN:
            case 26:
            case 31:
            case 32:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1301:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSingleLiteralDTAccess().getBoolLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleSingleLiteralDT2860);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;


                    		current.merge(this_BoolLiteral_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1313:5: this_NumberLiteral_1= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSingleLiteralDTAccess().getNumberLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleSingleLiteralDT2893);
                    this_NumberLiteral_1=ruleNumberLiteral();

                    state._fsp--;


                    		current.merge(this_NumberLiteral_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1325:5: this_StringLiteral_2= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSingleLiteralDTAccess().getStringLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleSingleLiteralDT2926);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;


                    		current.merge(this_StringLiteral_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleLiteralDT"


    // $ANTLR start "entryRuleStringLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1343:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1344:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1345:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2972);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2983); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1352:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1355:28: (this_STRING_0= RULE_STRING )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1356:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3022); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1371:1: entryRuleNumberLiteral returns [String current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final String entryRuleNumberLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberLiteral = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1372:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1373:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3067);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral3078); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1380:1: ruleNumberLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_Float_1= ruleFloat | this_SNotation_2= ruleSNotation | this_Imaginary_3= ruleImaginary ) ;
    public final AntlrDatatypeRuleToken ruleNumberLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Integer_0 = null;

        AntlrDatatypeRuleToken this_Float_1 = null;

        AntlrDatatypeRuleToken this_SNotation_2 = null;

        AntlrDatatypeRuleToken this_Imaginary_3 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1383:28: ( (this_Integer_0= ruleInteger | this_Float_1= ruleFloat | this_SNotation_2= ruleSNotation | this_Imaginary_3= ruleImaginary ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1384:1: (this_Integer_0= ruleInteger | this_Float_1= ruleFloat | this_SNotation_2= ruleSNotation | this_Imaginary_3= ruleImaginary )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1384:1: (this_Integer_0= ruleInteger | this_Float_1= ruleFloat | this_SNotation_2= ruleSNotation | this_Imaginary_3= ruleImaginary )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1385:5: this_Integer_0= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getNumberLiteralAccess().getIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInteger_in_ruleNumberLiteral3125);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    		current.merge(this_Integer_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1397:5: this_Float_1= ruleFloat
                    {
                     
                            newCompositeNode(grammarAccess.getNumberLiteralAccess().getFloatParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleNumberLiteral3158);
                    this_Float_1=ruleFloat();

                    state._fsp--;


                    		current.merge(this_Float_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1409:5: this_SNotation_2= ruleSNotation
                    {
                     
                            newCompositeNode(grammarAccess.getNumberLiteralAccess().getSNotationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSNotation_in_ruleNumberLiteral3191);
                    this_SNotation_2=ruleSNotation();

                    state._fsp--;


                    		current.merge(this_SNotation_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1421:5: this_Imaginary_3= ruleImaginary
                    {
                     
                            newCompositeNode(grammarAccess.getNumberLiteralAccess().getImaginaryParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleImaginary_in_ruleNumberLiteral3224);
                    this_Imaginary_3=ruleImaginary();

                    state._fsp--;


                    		current.merge(this_Imaginary_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleInteger"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1439:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1440:2: (iv_ruleInteger= ruleInteger EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1441:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger3270);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger3281); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1448:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_OCT_1= RULE_OCT | this_HEX_2= RULE_HEX | this_BIN_3= RULE_BIN ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_OCT_1=null;
        Token this_HEX_2=null;
        Token this_BIN_3=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1451:28: ( (this_INT_0= RULE_INT | this_OCT_1= RULE_OCT | this_HEX_2= RULE_HEX | this_BIN_3= RULE_BIN ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1452:1: (this_INT_0= RULE_INT | this_OCT_1= RULE_OCT | this_HEX_2= RULE_HEX | this_BIN_3= RULE_BIN )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1452:1: (this_INT_0= RULE_INT | this_OCT_1= RULE_OCT | this_HEX_2= RULE_HEX | this_BIN_3= RULE_BIN )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt22=1;
                }
                break;
            case RULE_OCT:
                {
                alt22=2;
                }
                break;
            case RULE_HEX:
                {
                alt22=3;
                }
                break;
            case RULE_BIN:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1452:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger3321); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1460:10: this_OCT_1= RULE_OCT
                    {
                    this_OCT_1=(Token)match(input,RULE_OCT,FOLLOW_RULE_OCT_in_ruleInteger3347); 

                    		current.merge(this_OCT_1);
                        
                     
                        newLeafNode(this_OCT_1, grammarAccess.getIntegerAccess().getOCTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1468:10: this_HEX_2= RULE_HEX
                    {
                    this_HEX_2=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleInteger3373); 

                    		current.merge(this_HEX_2);
                        
                     
                        newLeafNode(this_HEX_2, grammarAccess.getIntegerAccess().getHEXTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1476:10: this_BIN_3= RULE_BIN
                    {
                    this_BIN_3=(Token)match(input,RULE_BIN,FOLLOW_RULE_BIN_in_ruleInteger3399); 

                    		current.merge(this_BIN_3);
                        
                     
                        newLeafNode(this_BIN_3, grammarAccess.getIntegerAccess().getBINTerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloat"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1491:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1492:2: (iv_ruleFloat= ruleFloat EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1493:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat3445);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat3456); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1500:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? ) | (kw= '.' this_INT_4= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1503:28: ( ( (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? ) | (kw= '.' this_INT_4= RULE_INT ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1504:1: ( (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? ) | (kw= '.' this_INT_4= RULE_INT ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1504:1: ( (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? ) | (kw= '.' this_INT_4= RULE_INT ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==26) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1504:2: (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1504:2: (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1504:7: this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )?
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat3497); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleFloat3515); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_0_1()); 
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1517:1: (this_INT_2= RULE_INT )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_INT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1517:6: this_INT_2= RULE_INT
                            {
                            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat3531); 

                            		current.merge(this_INT_2);
                                
                             
                                newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0_2()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1525:6: (kw= '.' this_INT_4= RULE_INT )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1525:6: (kw= '.' this_INT_4= RULE_INT )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1526:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleFloat3559); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat3574); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleSNotation"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1546:1: entryRuleSNotation returns [String current=null] : iv_ruleSNotation= ruleSNotation EOF ;
    public final String entryRuleSNotation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSNotation = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1547:2: (iv_ruleSNotation= ruleSNotation EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1548:2: iv_ruleSNotation= ruleSNotation EOF
            {
             newCompositeNode(grammarAccess.getSNotationRule()); 
            pushFollow(FOLLOW_ruleSNotation_in_entryRuleSNotation3621);
            iv_ruleSNotation=ruleSNotation();

            state._fsp--;

             current =iv_ruleSNotation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSNotation3632); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSNotation"


    // $ANTLR start "ruleSNotation"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1555:1: ruleSNotation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) this_ExpConstant_2= ruleExpConstant (this_Sign_3= ruleSign )? this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSNotation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_Float_1 = null;

        AntlrDatatypeRuleToken this_ExpConstant_2 = null;

        AntlrDatatypeRuleToken this_Sign_3 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1558:28: ( ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) this_ExpConstant_2= ruleExpConstant (this_Sign_3= ruleSign )? this_INT_4= RULE_INT ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1559:1: ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) this_ExpConstant_2= ruleExpConstant (this_Sign_3= ruleSign )? this_INT_4= RULE_INT )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1559:1: ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) this_ExpConstant_2= ruleExpConstant (this_Sign_3= ruleSign )? this_INT_4= RULE_INT )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1559:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat ) this_ExpConstant_2= ruleExpConstant (this_Sign_3= ruleSign )? this_INT_4= RULE_INT
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1559:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==26) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=27 && LA25_1<=28)) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0==26) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1559:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSNotation3673); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getSNotationAccess().getINTTerminalRuleCall_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1568:5: this_Float_1= ruleFloat
                    {
                     
                            newCompositeNode(grammarAccess.getSNotationAccess().getFloatParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleSNotation3706);
                    this_Float_1=ruleFloat();

                    state._fsp--;


                    		current.merge(this_Float_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getSNotationAccess().getExpConstantParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpConstant_in_ruleSNotation3734);
            this_ExpConstant_2=ruleExpConstant();

            state._fsp--;


            		current.merge(this_ExpConstant_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1589:1: (this_Sign_3= ruleSign )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=29 && LA26_0<=30)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1590:5: this_Sign_3= ruleSign
                    {
                     
                            newCompositeNode(grammarAccess.getSNotationAccess().getSignParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSign_in_ruleSNotation3762);
                    this_Sign_3=ruleSign();

                    state._fsp--;


                    		current.merge(this_Sign_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSNotation3784); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getSNotationAccess().getINTTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSNotation"


    // $ANTLR start "entryRuleExpConstant"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1615:1: entryRuleExpConstant returns [String current=null] : iv_ruleExpConstant= ruleExpConstant EOF ;
    public final String entryRuleExpConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpConstant = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1616:2: (iv_ruleExpConstant= ruleExpConstant EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1617:2: iv_ruleExpConstant= ruleExpConstant EOF
            {
             newCompositeNode(grammarAccess.getExpConstantRule()); 
            pushFollow(FOLLOW_ruleExpConstant_in_entryRuleExpConstant3830);
            iv_ruleExpConstant=ruleExpConstant();

            state._fsp--;

             current =iv_ruleExpConstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpConstant3841); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpConstant"


    // $ANTLR start "ruleExpConstant"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1624:1: ruleExpConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e' | kw= 'E' ) ;
    public final AntlrDatatypeRuleToken ruleExpConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1627:28: ( (kw= 'e' | kw= 'E' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1628:1: (kw= 'e' | kw= 'E' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1628:1: (kw= 'e' | kw= 'E' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            else if ( (LA27_0==28) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1629:2: kw= 'e'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleExpConstant3879); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpConstantAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1636:2: kw= 'E'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleExpConstant3898); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExpConstantAccess().getEKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpConstant"


    // $ANTLR start "entryRuleSign"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1649:1: entryRuleSign returns [String current=null] : iv_ruleSign= ruleSign EOF ;
    public final String entryRuleSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSign = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1650:2: (iv_ruleSign= ruleSign EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1651:2: iv_ruleSign= ruleSign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_ruleSign_in_entryRuleSign3939);
            iv_ruleSign=ruleSign();

            state._fsp--;

             current =iv_ruleSign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSign3950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSign"


    // $ANTLR start "ruleSign"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1658:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1661:28: ( (kw= '+' | kw= '-' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1662:1: (kw= '+' | kw= '-' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1662:1: (kw= '+' | kw= '-' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            else if ( (LA28_0==30) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1663:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleSign3988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1670:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleSign4007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSign"


    // $ANTLR start "entryRuleImaginary"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1683:1: entryRuleImaginary returns [String current=null] : iv_ruleImaginary= ruleImaginary EOF ;
    public final String entryRuleImaginary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImaginary = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1684:2: (iv_ruleImaginary= ruleImaginary EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1685:2: iv_ruleImaginary= ruleImaginary EOF
            {
             newCompositeNode(grammarAccess.getImaginaryRule()); 
            pushFollow(FOLLOW_ruleImaginary_in_entryRuleImaginary4048);
            iv_ruleImaginary=ruleImaginary();

            state._fsp--;

             current =iv_ruleImaginary.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImaginary4059); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImaginary"


    // $ANTLR start "ruleImaginary"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1692:1: ruleImaginary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat )? this_ImaginaryConstant_2= ruleImaginaryConstant ) ;
    public final AntlrDatatypeRuleToken ruleImaginary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_Float_1 = null;

        AntlrDatatypeRuleToken this_ImaginaryConstant_2 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1695:28: ( ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat )? this_ImaginaryConstant_2= ruleImaginaryConstant ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1696:1: ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat )? this_ImaginaryConstant_2= ruleImaginaryConstant )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1696:1: ( (this_INT_0= RULE_INT | this_Float_1= ruleFloat )? this_ImaginaryConstant_2= ruleImaginaryConstant )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1696:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )? this_ImaginaryConstant_2= ruleImaginaryConstant
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1696:2: (this_INT_0= RULE_INT | this_Float_1= ruleFloat )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==26) ) {
                    alt29=2;
                }
                else if ( ((LA29_1>=31 && LA29_1<=32)) ) {
                    alt29=1;
                }
            }
            else if ( (LA29_0==26) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1696:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleImaginary4100); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getImaginaryAccess().getINTTerminalRuleCall_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1705:5: this_Float_1= ruleFloat
                    {
                     
                            newCompositeNode(grammarAccess.getImaginaryAccess().getFloatParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleImaginary4133);
                    this_Float_1=ruleFloat();

                    state._fsp--;


                    		current.merge(this_Float_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getImaginaryAccess().getImaginaryConstantParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleImaginaryConstant_in_ruleImaginary4162);
            this_ImaginaryConstant_2=ruleImaginaryConstant();

            state._fsp--;


            		current.merge(this_ImaginaryConstant_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImaginary"


    // $ANTLR start "entryRuleImaginaryConstant"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1734:1: entryRuleImaginaryConstant returns [String current=null] : iv_ruleImaginaryConstant= ruleImaginaryConstant EOF ;
    public final String entryRuleImaginaryConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImaginaryConstant = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1735:2: (iv_ruleImaginaryConstant= ruleImaginaryConstant EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1736:2: iv_ruleImaginaryConstant= ruleImaginaryConstant EOF
            {
             newCompositeNode(grammarAccess.getImaginaryConstantRule()); 
            pushFollow(FOLLOW_ruleImaginaryConstant_in_entryRuleImaginaryConstant4208);
            iv_ruleImaginaryConstant=ruleImaginaryConstant();

            state._fsp--;

             current =iv_ruleImaginaryConstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImaginaryConstant4219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImaginaryConstant"


    // $ANTLR start "ruleImaginaryConstant"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1743:1: ruleImaginaryConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'i' | kw= 'j' ) ;
    public final AntlrDatatypeRuleToken ruleImaginaryConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1746:28: ( (kw= 'i' | kw= 'j' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1747:1: (kw= 'i' | kw= 'j' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1747:1: (kw= 'i' | kw= 'j' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            else if ( (LA30_0==32) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1748:2: kw= 'i'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleImaginaryConstant4257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImaginaryConstantAccess().getIKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1755:2: kw= 'j'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleImaginaryConstant4276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImaginaryConstantAccess().getJKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImaginaryConstant"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1768:1: entryRuleBoolLiteral returns [String current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final String entryRuleBoolLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolLiteral = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1769:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1770:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral4317);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral4328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1777:1: ruleBoolLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1780:28: ( (kw= 'true' | kw= 'false' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1781:1: (kw= 'true' | kw= 'false' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1781:1: (kw= 'true' | kw= 'false' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            else if ( (LA31_0==34) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1782:2: kw= 'true'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleBoolLiteral4366); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolLiteralAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1789:2: kw= 'false'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleBoolLiteral4385); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolLiteralAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleSequenceLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1802:1: entryRuleSequenceLiteral returns [EObject current=null] : iv_ruleSequenceLiteral= ruleSequenceLiteral EOF ;
    public final EObject entryRuleSequenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceLiteral = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1803:2: (iv_ruleSequenceLiteral= ruleSequenceLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1804:2: iv_ruleSequenceLiteral= ruleSequenceLiteral EOF
            {
             newCompositeNode(grammarAccess.getSequenceLiteralRule()); 
            pushFollow(FOLLOW_ruleSequenceLiteral_in_entryRuleSequenceLiteral4425);
            iv_ruleSequenceLiteral=ruleSequenceLiteral();

            state._fsp--;

             current =iv_ruleSequenceLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceLiteral4435); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceLiteral"


    // $ANTLR start "ruleSequenceLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1811:1: ruleSequenceLiteral returns [EObject current=null] : (this_SequenceLiteralPlain_0= ruleSequenceLiteralPlain | this_SequenceLiteralSerie_1= ruleSequenceLiteralSerie ) ;
    public final EObject ruleSequenceLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceLiteralPlain_0 = null;

        EObject this_SequenceLiteralSerie_1 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1814:28: ( (this_SequenceLiteralPlain_0= ruleSequenceLiteralPlain | this_SequenceLiteralSerie_1= ruleSequenceLiteralSerie ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1815:1: (this_SequenceLiteralPlain_0= ruleSequenceLiteralPlain | this_SequenceLiteralSerie_1= ruleSequenceLiteralSerie )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1815:1: (this_SequenceLiteralPlain_0= ruleSequenceLiteralPlain | this_SequenceLiteralSerie_1= ruleSequenceLiteralSerie )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            else if ( (LA32_0==35) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1816:5: this_SequenceLiteralPlain_0= ruleSequenceLiteralPlain
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceLiteralAccess().getSequenceLiteralPlainParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSequenceLiteralPlain_in_ruleSequenceLiteral4482);
                    this_SequenceLiteralPlain_0=ruleSequenceLiteralPlain();

                    state._fsp--;

                     
                            current = this_SequenceLiteralPlain_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1826:5: this_SequenceLiteralSerie_1= ruleSequenceLiteralSerie
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceLiteralAccess().getSequenceLiteralSerieParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSequenceLiteralSerie_in_ruleSequenceLiteral4509);
                    this_SequenceLiteralSerie_1=ruleSequenceLiteralSerie();

                    state._fsp--;

                     
                            current = this_SequenceLiteralSerie_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceLiteral"


    // $ANTLR start "entryRuleSequenceLiteralSerie"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1842:1: entryRuleSequenceLiteralSerie returns [EObject current=null] : iv_ruleSequenceLiteralSerie= ruleSequenceLiteralSerie EOF ;
    public final EObject entryRuleSequenceLiteralSerie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceLiteralSerie = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1843:2: (iv_ruleSequenceLiteralSerie= ruleSequenceLiteralSerie EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1844:2: iv_ruleSequenceLiteralSerie= ruleSequenceLiteralSerie EOF
            {
             newCompositeNode(grammarAccess.getSequenceLiteralSerieRule()); 
            pushFollow(FOLLOW_ruleSequenceLiteralSerie_in_entryRuleSequenceLiteralSerie4544);
            iv_ruleSequenceLiteralSerie=ruleSequenceLiteralSerie();

            state._fsp--;

             current =iv_ruleSequenceLiteralSerie; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceLiteralSerie4554); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceLiteralSerie"


    // $ANTLR start "ruleSequenceLiteralSerie"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1851:1: ruleSequenceLiteralSerie returns [EObject current=null] : (otherlv_0= '[..' ( (lv_init_1_0= ruleLiteralExpression ) ) otherlv_2= '->' ( (lv_end_3_0= ruleLiteralExpression ) ) (otherlv_4= ',' ( (lv_inc_5_0= ruleLiteralExpression ) ) )? otherlv_6= ']' ) ;
    public final EObject ruleSequenceLiteralSerie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_init_1_0 = null;

        EObject lv_end_3_0 = null;

        EObject lv_inc_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1854:28: ( (otherlv_0= '[..' ( (lv_init_1_0= ruleLiteralExpression ) ) otherlv_2= '->' ( (lv_end_3_0= ruleLiteralExpression ) ) (otherlv_4= ',' ( (lv_inc_5_0= ruleLiteralExpression ) ) )? otherlv_6= ']' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1855:1: (otherlv_0= '[..' ( (lv_init_1_0= ruleLiteralExpression ) ) otherlv_2= '->' ( (lv_end_3_0= ruleLiteralExpression ) ) (otherlv_4= ',' ( (lv_inc_5_0= ruleLiteralExpression ) ) )? otherlv_6= ']' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1855:1: (otherlv_0= '[..' ( (lv_init_1_0= ruleLiteralExpression ) ) otherlv_2= '->' ( (lv_end_3_0= ruleLiteralExpression ) ) (otherlv_4= ',' ( (lv_inc_5_0= ruleLiteralExpression ) ) )? otherlv_6= ']' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1855:3: otherlv_0= '[..' ( (lv_init_1_0= ruleLiteralExpression ) ) otherlv_2= '->' ( (lv_end_3_0= ruleLiteralExpression ) ) (otherlv_4= ',' ( (lv_inc_5_0= ruleLiteralExpression ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleSequenceLiteralSerie4591); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceLiteralSerieAccess().getLeftSquareBracketFullStopFullStopKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1859:1: ( (lv_init_1_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1860:1: (lv_init_1_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1860:1: (lv_init_1_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1861:3: lv_init_1_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getSequenceLiteralSerieAccess().getInitLiteralExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralSerie4612);
            lv_init_1_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceLiteralSerieRule());
            	        }
                   		set(
                   			current, 
                   			"init",
                    		lv_init_1_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleSequenceLiteralSerie4624); 

                	newLeafNode(otherlv_2, grammarAccess.getSequenceLiteralSerieAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1881:1: ( (lv_end_3_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1882:1: (lv_end_3_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1882:1: (lv_end_3_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1883:3: lv_end_3_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getSequenceLiteralSerieAccess().getEndLiteralExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralSerie4645);
            lv_end_3_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceLiteralSerieRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_3_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1899:2: (otherlv_4= ',' ( (lv_inc_5_0= ruleLiteralExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1899:4: otherlv_4= ',' ( (lv_inc_5_0= ruleLiteralExpression ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleSequenceLiteralSerie4658); 

                        	newLeafNode(otherlv_4, grammarAccess.getSequenceLiteralSerieAccess().getCommaKeyword_4_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1903:1: ( (lv_inc_5_0= ruleLiteralExpression ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1904:1: (lv_inc_5_0= ruleLiteralExpression )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1904:1: (lv_inc_5_0= ruleLiteralExpression )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1905:3: lv_inc_5_0= ruleLiteralExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceLiteralSerieAccess().getIncLiteralExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralSerie4679);
                    lv_inc_5_0=ruleLiteralExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceLiteralSerieRule());
                    	        }
                           		set(
                           			current, 
                           			"inc",
                            		lv_inc_5_0, 
                            		"LiteralExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleSequenceLiteralSerie4693); 

                	newLeafNode(otherlv_6, grammarAccess.getSequenceLiteralSerieAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceLiteralSerie"


    // $ANTLR start "entryRuleSequenceLiteralPlain"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1933:1: entryRuleSequenceLiteralPlain returns [EObject current=null] : iv_ruleSequenceLiteralPlain= ruleSequenceLiteralPlain EOF ;
    public final EObject entryRuleSequenceLiteralPlain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceLiteralPlain = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1934:2: (iv_ruleSequenceLiteralPlain= ruleSequenceLiteralPlain EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1935:2: iv_ruleSequenceLiteralPlain= ruleSequenceLiteralPlain EOF
            {
             newCompositeNode(grammarAccess.getSequenceLiteralPlainRule()); 
            pushFollow(FOLLOW_ruleSequenceLiteralPlain_in_entryRuleSequenceLiteralPlain4729);
            iv_ruleSequenceLiteralPlain=ruleSequenceLiteralPlain();

            state._fsp--;

             current =iv_ruleSequenceLiteralPlain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceLiteralPlain4739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceLiteralPlain"


    // $ANTLR start "ruleSequenceLiteralPlain"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1942:1: ruleSequenceLiteralPlain returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSequenceLiteralPlain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1945:28: ( ( () otherlv_1= '[' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= ']' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1946:1: ( () otherlv_1= '[' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1946:1: ( () otherlv_1= '[' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= ']' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1946:2: () otherlv_1= '[' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= ']'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1946:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1947:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSequenceLiteralPlainAccess().getSequenceLiteralPlainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleSequenceLiteralPlain4785); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceLiteralPlainAccess().getLeftSquareBracketKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1956:1: ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_BIN)||LA35_0==24||LA35_0==26||(LA35_0>=29 && LA35_0<=35)||(LA35_0>=39 && LA35_0<=40)||LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1956:2: ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )*
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1956:2: ( (lv_items_2_0= ruleLiteralExpression ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1957:1: (lv_items_2_0= ruleLiteralExpression )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1957:1: (lv_items_2_0= ruleLiteralExpression )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1958:3: lv_items_2_0= ruleLiteralExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceLiteralPlainAccess().getItemsLiteralExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralPlain4807);
                    lv_items_2_0=ruleLiteralExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceLiteralPlainRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_2_0, 
                            		"LiteralExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1974:2: (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==37) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1974:4: otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleSequenceLiteralPlain4820); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSequenceLiteralPlainAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1978:1: ( (lv_items_4_0= ruleLiteralExpression ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1979:1: (lv_items_4_0= ruleLiteralExpression )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1979:1: (lv_items_4_0= ruleLiteralExpression )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1980:3: lv_items_4_0= ruleLiteralExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSequenceLiteralPlainAccess().getItemsLiteralExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralPlain4841);
                    	    lv_items_4_0=ruleLiteralExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSequenceLiteralPlainRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_4_0, 
                    	            		"LiteralExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleSequenceLiteralPlain4857); 

                	newLeafNode(otherlv_5, grammarAccess.getSequenceLiteralPlainAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceLiteralPlain"


    // $ANTLR start "entryRuleTupleLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2008:1: entryRuleTupleLiteral returns [EObject current=null] : iv_ruleTupleLiteral= ruleTupleLiteral EOF ;
    public final EObject entryRuleTupleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteral = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2009:2: (iv_ruleTupleLiteral= ruleTupleLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2010:2: iv_ruleTupleLiteral= ruleTupleLiteral EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralRule()); 
            pushFollow(FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral4893);
            iv_ruleTupleLiteral=ruleTupleLiteral();

            state._fsp--;

             current =iv_ruleTupleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteral4903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteral"


    // $ANTLR start "ruleTupleLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2017:1: ruleTupleLiteral returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleTupleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2020:28: ( ( () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) ) )* )? otherlv_5= ')' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2021:1: ( () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) ) )* )? otherlv_5= ')' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2021:1: ( () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) ) )* )? otherlv_5= ')' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2021:2: () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) ) )* )? otherlv_5= ')'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2021:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2022:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTupleLiteral4949); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralAccess().getLeftParenthesisKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2031:1: ( ( (lv_items_2_0= ruleTupleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2031:2: ( (lv_items_2_0= ruleTupleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) ) )*
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2031:2: ( (lv_items_2_0= ruleTupleItem ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2032:1: (lv_items_2_0= ruleTupleItem )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2032:1: (lv_items_2_0= ruleTupleItem )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2033:3: lv_items_2_0= ruleTupleItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getItemsTupleItemParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTupleItem_in_ruleTupleLiteral4971);
                    lv_items_2_0=ruleTupleItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTupleLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_2_0, 
                            		"TupleItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2049:2: (otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==37) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2049:4: otherlv_3= ',' ( (lv_items_4_0= ruleTupleItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleTupleLiteral4984); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2053:1: ( (lv_items_4_0= ruleTupleItem ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2054:1: (lv_items_4_0= ruleTupleItem )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2054:1: (lv_items_4_0= ruleTupleItem )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2055:3: lv_items_4_0= ruleTupleItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleLiteralAccess().getItemsTupleItemParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTupleItem_in_ruleTupleLiteral5005);
                    	    lv_items_4_0=ruleTupleItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTupleLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_4_0, 
                    	            		"TupleItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleTupleLiteral5021); 

                	newLeafNode(otherlv_5, grammarAccess.getTupleLiteralAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteral"


    // $ANTLR start "entryRuleTupleItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2083:1: entryRuleTupleItem returns [EObject current=null] : iv_ruleTupleItem= ruleTupleItem EOF ;
    public final EObject entryRuleTupleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleItem = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2084:2: (iv_ruleTupleItem= ruleTupleItem EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2085:2: iv_ruleTupleItem= ruleTupleItem EOF
            {
             newCompositeNode(grammarAccess.getTupleItemRule()); 
            pushFollow(FOLLOW_ruleTupleItem_in_entryRuleTupleItem5057);
            iv_ruleTupleItem=ruleTupleItem();

            state._fsp--;

             current =iv_ruleTupleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleItem5067); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleItem"


    // $ANTLR start "ruleTupleItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2092:1: ruleTupleItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleTupleItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2095:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleLiteralExpression ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2096:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleLiteralExpression ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2096:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleLiteralExpression ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2096:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleLiteralExpression ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2096:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2097:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2097:1: (lv_name_0_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2098:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTupleItem5109); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTupleItemAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTupleItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleTupleItem5126); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleItemAccess().getColonKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2118:1: ( (lv_value_2_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2119:1: (lv_value_2_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2119:1: (lv_value_2_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2120:3: lv_value_2_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getTupleItemAccess().getValueLiteralExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleTupleItem5147);
            lv_value_2_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTupleItemRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleItem"


    // $ANTLR start "entryRuleSetLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2144:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2145:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2146:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral5183);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral5193); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2153:1: ruleSetLiteral returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2156:28: ( ( () otherlv_1= '{' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2157:1: ( () otherlv_1= '{' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2157:1: ( () otherlv_1= '{' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2157:2: () otherlv_1= '{' ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2157:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2158:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSetLiteralAccess().getSetLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleSetLiteral5239); 

                	newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2167:1: ( ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_BIN)||LA39_0==24||LA39_0==26||(LA39_0>=29 && LA39_0<=35)||(LA39_0>=39 && LA39_0<=40)||LA39_0==69) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2167:2: ( (lv_items_2_0= ruleLiteralExpression ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )*
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2167:2: ( (lv_items_2_0= ruleLiteralExpression ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2168:1: (lv_items_2_0= ruleLiteralExpression )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2168:1: (lv_items_2_0= ruleLiteralExpression )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2169:3: lv_items_2_0= ruleLiteralExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getItemsLiteralExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSetLiteral5261);
                    lv_items_2_0=ruleLiteralExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_2_0, 
                            		"LiteralExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2185:2: (otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==37) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2185:4: otherlv_3= ',' ( (lv_items_4_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleSetLiteral5274); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2189:1: ( (lv_items_4_0= ruleLiteralExpression ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2190:1: (lv_items_4_0= ruleLiteralExpression )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2190:1: (lv_items_4_0= ruleLiteralExpression )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2191:3: lv_items_4_0= ruleLiteralExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getItemsLiteralExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleSetLiteral5295);
                    	    lv_items_4_0=ruleLiteralExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_4_0, 
                    	            		"LiteralExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleSetLiteral5311); 

                	newLeafNode(otherlv_5, grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleBlock"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2219:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2220:2: (iv_ruleBlock= ruleBlock EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2221:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock5347);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock5357); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2228:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '~' ( (lv_name_3_0= RULE_ID ) ) )? ( (lv_sentences_4_0= ruleSentence ) )* otherlv_5= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        EObject lv_sentences_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2231:28: ( ( () otherlv_1= '{' (otherlv_2= '~' ( (lv_name_3_0= RULE_ID ) ) )? ( (lv_sentences_4_0= ruleSentence ) )* otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2232:1: ( () otherlv_1= '{' (otherlv_2= '~' ( (lv_name_3_0= RULE_ID ) ) )? ( (lv_sentences_4_0= ruleSentence ) )* otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2232:1: ( () otherlv_1= '{' (otherlv_2= '~' ( (lv_name_3_0= RULE_ID ) ) )? ( (lv_sentences_4_0= ruleSentence ) )* otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2232:2: () otherlv_1= '{' (otherlv_2= '~' ( (lv_name_3_0= RULE_ID ) ) )? ( (lv_sentences_4_0= ruleSentence ) )* otherlv_5= '}'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2232:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2233:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleBlock5403); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2242:1: (otherlv_2= '~' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2242:3: otherlv_2= '~' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleBlock5416); 

                        	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getTildeKeyword_2_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2246:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2247:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2247:1: (lv_name_3_0= RULE_ID )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2248:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBlock5433); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBlockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2264:4: ( (lv_sentences_4_0= ruleSentence ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==21||LA41_0==40||LA41_0==43||(LA41_0>=45 && LA41_0<=49)||(LA41_0>=56 && LA41_0<=57)||(LA41_0>=60 && LA41_0<=61)||(LA41_0>=63 && LA41_0<=65)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2265:1: (lv_sentences_4_0= ruleSentence )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2265:1: (lv_sentences_4_0= ruleSentence )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2266:3: lv_sentences_4_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getSentencesSentenceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSentence_in_ruleBlock5461);
            	    lv_sentences_4_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentences",
            	            		lv_sentences_4_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleBlock5474); 

                	newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleNoop"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2294:1: entryRuleNoop returns [EObject current=null] : iv_ruleNoop= ruleNoop EOF ;
    public final EObject entryRuleNoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoop = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2295:2: (iv_ruleNoop= ruleNoop EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2296:2: iv_ruleNoop= ruleNoop EOF
            {
             newCompositeNode(grammarAccess.getNoopRule()); 
            pushFollow(FOLLOW_ruleNoop_in_entryRuleNoop5510);
            iv_ruleNoop=ruleNoop();

            state._fsp--;

             current =iv_ruleNoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoop5520); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoop"


    // $ANTLR start "ruleNoop"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2303:1: ruleNoop returns [EObject current=null] : ( () ( (lv_name_1_0= 'noop' ) ) ) ;
    public final EObject ruleNoop() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2306:28: ( ( () ( (lv_name_1_0= 'noop' ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2307:1: ( () ( (lv_name_1_0= 'noop' ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2307:1: ( () ( (lv_name_1_0= 'noop' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2307:2: () ( (lv_name_1_0= 'noop' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2307:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2308:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNoopAccess().getNoopAction_0(),
                        current);
                

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2313:2: ( (lv_name_1_0= 'noop' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2314:1: (lv_name_1_0= 'noop' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2314:1: (lv_name_1_0= 'noop' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2315:3: lv_name_1_0= 'noop'
            {
            lv_name_1_0=(Token)match(input,43,FOLLOW_43_in_ruleNoop5572); 

                    newLeafNode(lv_name_1_0, grammarAccess.getNoopAccess().getNameNoopKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoopRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "noop");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoop"


    // $ANTLR start "entryRulePair"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2336:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2337:2: (iv_rulePair= rulePair EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2338:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair5621);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair5631); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2345:1: rulePair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2348:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2349:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2349:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2349:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2349:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2350:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2350:1: (lv_name_0_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2351:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePair5673); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPairAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_rulePair5690); 

                	newLeafNode(otherlv_1, grammarAccess.getPairAccess().getEqualsSignKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2371:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2372:1: (lv_value_2_0= RULE_STRING )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2372:1: (lv_value_2_0= RULE_STRING )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2373:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePair5707); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleConstant"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2397:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2398:2: (iv_ruleConstant= ruleConstant EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2399:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant5748);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant5758); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2406:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2409:28: ( (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralExpression ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2410:1: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralExpression ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2410:1: (otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralExpression ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2410:3: otherlv_0= 'constant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralExpression ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleConstant5795); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstantKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2414:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2415:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2415:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2416:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant5812); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2432:2: ( (lv_type_2_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2433:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2433:1: (lv_type_2_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2434:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleConstant5838);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleConstant5850); 

                	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2454:1: ( (lv_value_4_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2455:1: (lv_value_4_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2455:1: (lv_value_4_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2456:3: lv_value_4_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValueLiteralExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleConstant5871);
            lv_value_4_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleMulti"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2480:1: entryRuleMulti returns [EObject current=null] : iv_ruleMulti= ruleMulti EOF ;
    public final EObject entryRuleMulti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulti = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2481:2: (iv_ruleMulti= ruleMulti EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2482:2: iv_ruleMulti= ruleMulti EOF
            {
             newCompositeNode(grammarAccess.getMultiRule()); 
            pushFollow(FOLLOW_ruleMulti_in_entryRuleMulti5907);
            iv_ruleMulti=ruleMulti();

            state._fsp--;

             current =iv_ruleMulti; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulti5917); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulti"


    // $ANTLR start "ruleMulti"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2489:1: ruleMulti returns [EObject current=null] : (otherlv_0= 'multi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? ) ;
    public final EObject ruleMulti() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_factor_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_op_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2492:28: ( (otherlv_0= 'multi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2493:1: (otherlv_0= 'multi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2493:1: (otherlv_0= 'multi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2493:3: otherlv_0= 'multi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleMulti5954); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiAccess().getMultiKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2497:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2498:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2498:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2499:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMulti5971); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMultiAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleMulti5988); 

                	newLeafNode(otherlv_2, grammarAccess.getMultiAccess().getEqualsSignKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2519:1: ( (lv_op_3_0= ruleMultiOp ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=74 && LA42_0<=77)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2520:1: (lv_op_3_0= ruleMultiOp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2520:1: (lv_op_3_0= ruleMultiOp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2521:3: lv_op_3_0= ruleMultiOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiAccess().getOpMultiOpEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiOp_in_ruleMulti6009);
                    lv_op_3_0=ruleMultiOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_3_0, 
                            		"MultiOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2537:3: ( (lv_factor_4_0= RULE_INT ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2538:1: (lv_factor_4_0= RULE_INT )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2538:1: (lv_factor_4_0= RULE_INT )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2539:3: lv_factor_4_0= RULE_INT
            {
            lv_factor_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMulti6027); 

            			newLeafNode(lv_factor_4_0, grammarAccess.getMultiAccess().getFactorINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"factor",
                    		lv_factor_4_0, 
                    		"INT");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2555:2: ( (otherlv_5= RULE_ID ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_ID) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==RULE_ID) ) {
                        alt43=1;
                    }
                }
                else if ( (LA43_1==EOF||LA43_1==21||(LA43_1>=40 && LA43_1<=41)||LA43_1==43||(LA43_1>=45 && LA43_1<=49)||(LA43_1>=56 && LA43_1<=57)||(LA43_1>=60 && LA43_1<=61)||(LA43_1>=63 && LA43_1<=65)) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2556:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2556:1: (otherlv_5= RULE_ID )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2557:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMulti6052); 

                    		newLeafNode(otherlv_5, grammarAccess.getMultiAccess().getParentMultiCrossReference_5_0()); 
                    	

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulti"


    // $ANTLR start "entryRuleUnit"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2576:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2577:2: (iv_ruleUnit= ruleUnit EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2578:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit6089);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit6099); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2585:1: ruleUnit returns [EObject current=null] : (this_DUnit_0= ruleDUnit | this_NUnit_1= ruleNUnit ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        EObject this_DUnit_0 = null;

        EObject this_NUnit_1 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2588:28: ( (this_DUnit_0= ruleDUnit | this_NUnit_1= ruleNUnit ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2589:1: (this_DUnit_0= ruleDUnit | this_NUnit_1= ruleNUnit )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2589:1: (this_DUnit_0= ruleDUnit | this_NUnit_1= ruleNUnit )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_ID) ) {
                    int LA44_2 = input.LA(3);

                    if ( (LA44_2==44) ) {
                        alt44=1;
                    }
                    else if ( ((LA44_2>=79 && LA44_2<=82)) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2590:5: this_DUnit_0= ruleDUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getDUnitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDUnit_in_ruleUnit6146);
                    this_DUnit_0=ruleDUnit();

                    state._fsp--;

                     
                            current = this_DUnit_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2600:5: this_NUnit_1= ruleNUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getNUnitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUnit_in_ruleUnit6173);
                    this_NUnit_1=ruleNUnit();

                    state._fsp--;

                     
                            current = this_NUnit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleDUnit"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2616:1: entryRuleDUnit returns [EObject current=null] : iv_ruleDUnit= ruleDUnit EOF ;
    public final EObject entryRuleDUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUnit = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2617:2: (iv_ruleDUnit= ruleDUnit EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2618:2: iv_ruleDUnit= ruleDUnit EOF
            {
             newCompositeNode(grammarAccess.getDUnitRule()); 
            pushFollow(FOLLOW_ruleDUnit_in_entryRuleDUnit6208);
            iv_ruleDUnit=ruleDUnit();

            state._fsp--;

             current =iv_ruleDUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDUnit6218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDUnit"


    // $ANTLR start "ruleDUnit"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2625:1: ruleDUnit returns [EObject current=null] : (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleDUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_factor_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_op_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2628:28: ( (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? ( (otherlv_6= RULE_ID ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2629:1: (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? ( (otherlv_6= RULE_ID ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2629:1: (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? ( (otherlv_6= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2629:3: otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_op_3_0= ruleMultiOp ) )? ( (lv_factor_4_0= RULE_INT ) ) ( (otherlv_5= RULE_ID ) )? ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleDUnit6255); 

                	newLeafNode(otherlv_0, grammarAccess.getDUnitAccess().getUnitKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2633:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2634:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2634:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2635:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDUnit6272); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDUnitAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDUnitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleDUnit6289); 

                	newLeafNode(otherlv_2, grammarAccess.getDUnitAccess().getEqualsSignKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2655:1: ( (lv_op_3_0= ruleMultiOp ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=74 && LA45_0<=77)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2656:1: (lv_op_3_0= ruleMultiOp )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2656:1: (lv_op_3_0= ruleMultiOp )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2657:3: lv_op_3_0= ruleMultiOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getDUnitAccess().getOpMultiOpEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiOp_in_ruleDUnit6310);
                    lv_op_3_0=ruleMultiOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_3_0, 
                            		"MultiOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2673:3: ( (lv_factor_4_0= RULE_INT ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2674:1: (lv_factor_4_0= RULE_INT )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2674:1: (lv_factor_4_0= RULE_INT )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2675:3: lv_factor_4_0= RULE_INT
            {
            lv_factor_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDUnit6328); 

            			newLeafNode(lv_factor_4_0, grammarAccess.getDUnitAccess().getFactorINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDUnitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"factor",
                    		lv_factor_4_0, 
                    		"INT");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2691:2: ( (otherlv_5= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==RULE_ID) ) {
                    int LA46_2 = input.LA(3);

                    if ( (LA46_2==RULE_ID) ) {
                        int LA46_4 = input.LA(4);

                        if ( (LA46_4==RULE_ID) ) {
                            alt46=1;
                        }
                    }
                    else if ( (LA46_2==EOF||LA46_2==21||(LA46_2>=40 && LA46_2<=41)||LA46_2==43||(LA46_2>=45 && LA46_2<=49)||(LA46_2>=56 && LA46_2<=57)||(LA46_2>=60 && LA46_2<=61)||(LA46_2>=63 && LA46_2<=65)) ) {
                        alt46=1;
                    }
                }
            }
            switch (alt46) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2692:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2692:1: (otherlv_5= RULE_ID )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2693:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDUnitRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDUnit6353); 

                    		newLeafNode(otherlv_5, grammarAccess.getDUnitAccess().getMultiMultiCrossReference_5_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2704:3: ( (otherlv_6= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2705:1: (otherlv_6= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2705:1: (otherlv_6= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2706:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDUnitRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDUnit6374); 

            		newLeafNode(otherlv_6, grammarAccess.getDUnitAccess().getParentUnitCrossReference_6_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDUnit"


    // $ANTLR start "entryRuleNUnit"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2725:1: entryRuleNUnit returns [EObject current=null] : iv_ruleNUnit= ruleNUnit EOF ;
    public final EObject entryRuleNUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNUnit = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2726:2: (iv_ruleNUnit= ruleNUnit EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2727:2: iv_ruleNUnit= ruleNUnit EOF
            {
             newCompositeNode(grammarAccess.getNUnitRule()); 
            pushFollow(FOLLOW_ruleNUnit_in_entryRuleNUnit6410);
            iv_ruleNUnit=ruleNUnit();

            state._fsp--;

             current =iv_ruleNUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUnit6420); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUnit"


    // $ANTLR start "ruleNUnit"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2734:1: ruleNUnit returns [EObject current=null] : (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numbertype_2_0= ruleNumberType ) ) ) ;
    public final EObject ruleNUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Enumerator lv_numbertype_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2737:28: ( (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numbertype_2_0= ruleNumberType ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2738:1: (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numbertype_2_0= ruleNumberType ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2738:1: (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numbertype_2_0= ruleNumberType ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2738:3: otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_numbertype_2_0= ruleNumberType ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleNUnit6457); 

                	newLeafNode(otherlv_0, grammarAccess.getNUnitAccess().getUnitKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2742:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2743:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2743:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2744:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNUnit6474); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNUnitAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNUnitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2760:2: ( (lv_numbertype_2_0= ruleNumberType ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2761:1: (lv_numbertype_2_0= ruleNumberType )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2761:1: (lv_numbertype_2_0= ruleNumberType )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2762:3: lv_numbertype_2_0= ruleNumberType
            {
             
            	        newCompositeNode(grammarAccess.getNUnitAccess().getNumbertypeNumberTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberType_in_ruleNUnit6500);
            lv_numbertype_2_0=ruleNumberType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNUnitRule());
            	        }
                   		set(
                   			current, 
                   			"numbertype",
                    		lv_numbertype_2_0, 
                    		"NumberType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUnit"


    // $ANTLR start "entryRuleBox"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2786:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2787:2: (iv_ruleBox= ruleBox EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2788:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_ruleBox_in_entryRuleBox6536);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBox6546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2795:1: ruleBox returns [EObject current=null] : (otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2798:28: ( (otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2799:1: (otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2799:1: (otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2799:3: otherlv_0= 'box' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleBox6583); 

                	newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2803:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2804:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2804:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2805:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBox6600); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleBox6617); 

                	newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2825:1: ( (lv_members_3_0= ruleMember ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2826:1: (lv_members_3_0= ruleMember )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2826:1: (lv_members_3_0= ruleMember )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2827:3: lv_members_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxAccess().getMembersMemberParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleBox6638);
            	    lv_members_3_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleBox6651); 

                	newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleShape"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2855:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2856:2: (iv_ruleShape= ruleShape EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2857:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_ruleShape_in_entryRuleShape6687);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShape6697); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2864:1: ruleShape returns [EObject current=null] : (otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2867:28: ( (otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2868:1: (otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2868:1: (otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2868:3: otherlv_0= 'shape' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleShape6734); 

                	newLeafNode(otherlv_0, grammarAccess.getShapeAccess().getShapeKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2872:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2873:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2873:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2874:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleShape6751); 

            			newLeafNode(lv_name_1_0, grammarAccess.getShapeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getShapeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleMember"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2898:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2899:2: (iv_ruleMember= ruleMember EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2900:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember6792);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember6802); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2907:1: ruleMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2910:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2911:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2911:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2911:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2911:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2912:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2912:1: (lv_name_0_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2913:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember6844); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2929:2: ( (lv_type_1_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2930:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2930:1: (lv_type_1_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2931:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getMemberAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleMember6870);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemberRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2955:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2956:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2957:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef6906);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef6916); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2964:1: ruleTypeRef returns [EObject current=null] : (this_PlainTypeRef_0= rulePlainTypeRef | this_CompositeTypeRef_1= ruleCompositeTypeRef ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_PlainTypeRef_0 = null;

        EObject this_CompositeTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2967:28: ( (this_PlainTypeRef_0= rulePlainTypeRef | this_CompositeTypeRef_1= ruleCompositeTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2968:1: (this_PlainTypeRef_0= rulePlainTypeRef | this_CompositeTypeRef_1= ruleCompositeTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2968:1: (this_PlainTypeRef_0= rulePlainTypeRef | this_CompositeTypeRef_1= ruleCompositeTypeRef )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==36||(LA48_0>=49 && LA48_0<=51)||(LA48_0>=54 && LA48_0<=55)||(LA48_0>=79 && LA48_0<=94)) ) {
                alt48=1;
            }
            else if ( (LA48_0==24||(LA48_0>=39 && LA48_0<=40)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2969:5: this_PlainTypeRef_0= rulePlainTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeRefAccess().getPlainTypeRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePlainTypeRef_in_ruleTypeRef6963);
                    this_PlainTypeRef_0=rulePlainTypeRef();

                    state._fsp--;

                     
                            current = this_PlainTypeRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2979:5: this_CompositeTypeRef_1= ruleCompositeTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeRefAccess().getCompositeTypeRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompositeTypeRef_in_ruleTypeRef6990);
                    this_CompositeTypeRef_1=ruleCompositeTypeRef();

                    state._fsp--;

                     
                            current = this_CompositeTypeRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRulePlainTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2995:1: entryRulePlainTypeRef returns [EObject current=null] : iv_rulePlainTypeRef= rulePlainTypeRef EOF ;
    public final EObject entryRulePlainTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2996:2: (iv_rulePlainTypeRef= rulePlainTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:2997:2: iv_rulePlainTypeRef= rulePlainTypeRef EOF
            {
             newCompositeNode(grammarAccess.getPlainTypeRefRule()); 
            pushFollow(FOLLOW_rulePlainTypeRef_in_entryRulePlainTypeRef7025);
            iv_rulePlainTypeRef=rulePlainTypeRef();

            state._fsp--;

             current =iv_rulePlainTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainTypeRef7035); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlainTypeRef"


    // $ANTLR start "rulePlainTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3004:1: rulePlainTypeRef returns [EObject current=null] : (this_VoidTypeRef_0= ruleVoidTypeRef | this_AutoTypeRef_1= ruleAutoTypeRef | this_NumberTypeRef_2= ruleNumberTypeRef | this_VisualTypeRef_3= ruleVisualTypeRef | this_AuxTypeRef_4= ruleAuxTypeRef | this_TypeAliasRef_5= ruleTypeAliasRef | this_ShapeRef_6= ruleShapeRef | this_BoxRef_7= ruleBoxRef | this_UnitRef_8= ruleUnitRef | this_CollectionRef_9= ruleCollectionRef ) ;
    public final EObject rulePlainTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_VoidTypeRef_0 = null;

        EObject this_AutoTypeRef_1 = null;

        EObject this_NumberTypeRef_2 = null;

        EObject this_VisualTypeRef_3 = null;

        EObject this_AuxTypeRef_4 = null;

        EObject this_TypeAliasRef_5 = null;

        EObject this_ShapeRef_6 = null;

        EObject this_BoxRef_7 = null;

        EObject this_UnitRef_8 = null;

        EObject this_CollectionRef_9 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3007:28: ( (this_VoidTypeRef_0= ruleVoidTypeRef | this_AutoTypeRef_1= ruleAutoTypeRef | this_NumberTypeRef_2= ruleNumberTypeRef | this_VisualTypeRef_3= ruleVisualTypeRef | this_AuxTypeRef_4= ruleAuxTypeRef | this_TypeAliasRef_5= ruleTypeAliasRef | this_ShapeRef_6= ruleShapeRef | this_BoxRef_7= ruleBoxRef | this_UnitRef_8= ruleUnitRef | this_CollectionRef_9= ruleCollectionRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3008:1: (this_VoidTypeRef_0= ruleVoidTypeRef | this_AutoTypeRef_1= ruleAutoTypeRef | this_NumberTypeRef_2= ruleNumberTypeRef | this_VisualTypeRef_3= ruleVisualTypeRef | this_AuxTypeRef_4= ruleAuxTypeRef | this_TypeAliasRef_5= ruleTypeAliasRef | this_ShapeRef_6= ruleShapeRef | this_BoxRef_7= ruleBoxRef | this_UnitRef_8= ruleUnitRef | this_CollectionRef_9= ruleCollectionRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3008:1: (this_VoidTypeRef_0= ruleVoidTypeRef | this_AutoTypeRef_1= ruleAutoTypeRef | this_NumberTypeRef_2= ruleNumberTypeRef | this_VisualTypeRef_3= ruleVisualTypeRef | this_AuxTypeRef_4= ruleAuxTypeRef | this_TypeAliasRef_5= ruleTypeAliasRef | this_ShapeRef_6= ruleShapeRef | this_BoxRef_7= ruleBoxRef | this_UnitRef_8= ruleUnitRef | this_CollectionRef_9= ruleCollectionRef )
            int alt49=10;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt49=1;
                }
                break;
            case 51:
                {
                alt49=2;
                }
                break;
            case 79:
            case 80:
            case 81:
            case 82:
                {
                alt49=3;
                }
                break;
            case 49:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt49=4;
                }
                break;
            case 88:
            case 89:
                {
                alt49=5;
                }
                break;
            case RULE_ID:
                {
                alt49=6;
                }
                break;
            case 55:
                {
                alt49=7;
                }
                break;
            case 36:
                {
                alt49=8;
                }
                break;
            case 54:
                {
                alt49=9;
                }
                break;
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
                {
                alt49=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3009:5: this_VoidTypeRef_0= ruleVoidTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getVoidTypeRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVoidTypeRef_in_rulePlainTypeRef7082);
                    this_VoidTypeRef_0=ruleVoidTypeRef();

                    state._fsp--;

                     
                            current = this_VoidTypeRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3019:5: this_AutoTypeRef_1= ruleAutoTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getAutoTypeRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAutoTypeRef_in_rulePlainTypeRef7109);
                    this_AutoTypeRef_1=ruleAutoTypeRef();

                    state._fsp--;

                     
                            current = this_AutoTypeRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3029:5: this_NumberTypeRef_2= ruleNumberTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getNumberTypeRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberTypeRef_in_rulePlainTypeRef7136);
                    this_NumberTypeRef_2=ruleNumberTypeRef();

                    state._fsp--;

                     
                            current = this_NumberTypeRef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3039:5: this_VisualTypeRef_3= ruleVisualTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getVisualTypeRefParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVisualTypeRef_in_rulePlainTypeRef7163);
                    this_VisualTypeRef_3=ruleVisualTypeRef();

                    state._fsp--;

                     
                            current = this_VisualTypeRef_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3049:5: this_AuxTypeRef_4= ruleAuxTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getAuxTypeRefParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAuxTypeRef_in_rulePlainTypeRef7190);
                    this_AuxTypeRef_4=ruleAuxTypeRef();

                    state._fsp--;

                     
                            current = this_AuxTypeRef_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3059:5: this_TypeAliasRef_5= ruleTypeAliasRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getTypeAliasRefParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTypeAliasRef_in_rulePlainTypeRef7217);
                    this_TypeAliasRef_5=ruleTypeAliasRef();

                    state._fsp--;

                     
                            current = this_TypeAliasRef_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3069:5: this_ShapeRef_6= ruleShapeRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getShapeRefParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleShapeRef_in_rulePlainTypeRef7244);
                    this_ShapeRef_6=ruleShapeRef();

                    state._fsp--;

                     
                            current = this_ShapeRef_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3079:5: this_BoxRef_7= ruleBoxRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getBoxRefParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleBoxRef_in_rulePlainTypeRef7271);
                    this_BoxRef_7=ruleBoxRef();

                    state._fsp--;

                     
                            current = this_BoxRef_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3089:5: this_UnitRef_8= ruleUnitRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getUnitRefParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleUnitRef_in_rulePlainTypeRef7298);
                    this_UnitRef_8=ruleUnitRef();

                    state._fsp--;

                     
                            current = this_UnitRef_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3099:5: this_CollectionRef_9= ruleCollectionRef
                    {
                     
                            newCompositeNode(grammarAccess.getPlainTypeRefAccess().getCollectionRefParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleCollectionRef_in_rulePlainTypeRef7325);
                    this_CollectionRef_9=ruleCollectionRef();

                    state._fsp--;

                     
                            current = this_CollectionRef_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlainTypeRef"


    // $ANTLR start "entryRuleCompositeTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3115:1: entryRuleCompositeTypeRef returns [EObject current=null] : iv_ruleCompositeTypeRef= ruleCompositeTypeRef EOF ;
    public final EObject entryRuleCompositeTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3116:2: (iv_ruleCompositeTypeRef= ruleCompositeTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3117:2: iv_ruleCompositeTypeRef= ruleCompositeTypeRef EOF
            {
             newCompositeNode(grammarAccess.getCompositeTypeRefRule()); 
            pushFollow(FOLLOW_ruleCompositeTypeRef_in_entryRuleCompositeTypeRef7360);
            iv_ruleCompositeTypeRef=ruleCompositeTypeRef();

            state._fsp--;

             current =iv_ruleCompositeTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeTypeRef7370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeTypeRef"


    // $ANTLR start "ruleCompositeTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3124:1: ruleCompositeTypeRef returns [EObject current=null] : (this_SequenceTypeRef_0= ruleSequenceTypeRef | this_TupleTypeRef_1= ruleTupleTypeRef | this_SetTypeRef_2= ruleSetTypeRef ) ;
    public final EObject ruleCompositeTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceTypeRef_0 = null;

        EObject this_TupleTypeRef_1 = null;

        EObject this_SetTypeRef_2 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3127:28: ( (this_SequenceTypeRef_0= ruleSequenceTypeRef | this_TupleTypeRef_1= ruleTupleTypeRef | this_SetTypeRef_2= ruleSetTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3128:1: (this_SequenceTypeRef_0= ruleSequenceTypeRef | this_TupleTypeRef_1= ruleTupleTypeRef | this_SetTypeRef_2= ruleSetTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3128:1: (this_SequenceTypeRef_0= ruleSequenceTypeRef | this_TupleTypeRef_1= ruleTupleTypeRef | this_SetTypeRef_2= ruleSetTypeRef )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt50=1;
                }
                break;
            case 24:
                {
                alt50=2;
                }
                break;
            case 40:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3129:5: this_SequenceTypeRef_0= ruleSequenceTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getCompositeTypeRefAccess().getSequenceTypeRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSequenceTypeRef_in_ruleCompositeTypeRef7417);
                    this_SequenceTypeRef_0=ruleSequenceTypeRef();

                    state._fsp--;

                     
                            current = this_SequenceTypeRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3139:5: this_TupleTypeRef_1= ruleTupleTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getCompositeTypeRefAccess().getTupleTypeRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleTypeRef_in_ruleCompositeTypeRef7444);
                    this_TupleTypeRef_1=ruleTupleTypeRef();

                    state._fsp--;

                     
                            current = this_TupleTypeRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3149:5: this_SetTypeRef_2= ruleSetTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getCompositeTypeRefAccess().getSetTypeRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSetTypeRef_in_ruleCompositeTypeRef7471);
                    this_SetTypeRef_2=ruleSetTypeRef();

                    state._fsp--;

                     
                            current = this_SetTypeRef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeTypeRef"


    // $ANTLR start "entryRuleSequenceTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3165:1: entryRuleSequenceTypeRef returns [EObject current=null] : iv_ruleSequenceTypeRef= ruleSequenceTypeRef EOF ;
    public final EObject entryRuleSequenceTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3166:2: (iv_ruleSequenceTypeRef= ruleSequenceTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3167:2: iv_ruleSequenceTypeRef= ruleSequenceTypeRef EOF
            {
             newCompositeNode(grammarAccess.getSequenceTypeRefRule()); 
            pushFollow(FOLLOW_ruleSequenceTypeRef_in_entryRuleSequenceTypeRef7506);
            iv_ruleSequenceTypeRef=ruleSequenceTypeRef();

            state._fsp--;

             current =iv_ruleSequenceTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceTypeRef7516); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceTypeRef"


    // $ANTLR start "ruleSequenceTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3174:1: ruleSequenceTypeRef returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= ']' ) ;
    public final EObject ruleSequenceTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3177:28: ( ( () otherlv_1= '[' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= ']' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3178:1: ( () otherlv_1= '[' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= ']' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3178:1: ( () otherlv_1= '[' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= ']' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3178:2: () otherlv_1= '[' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= ']'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3178:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3179:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSequenceTypeRefAccess().getSequenceTypeRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleSequenceTypeRef7562); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceTypeRefAccess().getLeftSquareBracketKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3188:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3189:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3189:1: (lv_type_2_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3190:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getSequenceTypeRefAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleSequenceTypeRef7583);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceTypeRefRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleSequenceTypeRef7595); 

                	newLeafNode(otherlv_3, grammarAccess.getSequenceTypeRefAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceTypeRef"


    // $ANTLR start "entryRuleTupleTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3218:1: entryRuleTupleTypeRef returns [EObject current=null] : iv_ruleTupleTypeRef= ruleTupleTypeRef EOF ;
    public final EObject entryRuleTupleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3219:2: (iv_ruleTupleTypeRef= ruleTupleTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3220:2: iv_ruleTupleTypeRef= ruleTupleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRefRule()); 
            pushFollow(FOLLOW_ruleTupleTypeRef_in_entryRuleTupleTypeRef7631);
            iv_ruleTupleTypeRef=ruleTupleTypeRef();

            state._fsp--;

             current =iv_ruleTupleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleTypeRef7641); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeRef"


    // $ANTLR start "ruleTupleTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3227:1: ruleTupleTypeRef returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleTypeRefItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleTupleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3230:28: ( ( () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleTypeRefItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) ) )* )? otherlv_5= ')' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3231:1: ( () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleTypeRefItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) ) )* )? otherlv_5= ')' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3231:1: ( () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleTypeRefItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) ) )* )? otherlv_5= ')' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3231:2: () otherlv_1= '(' ( ( (lv_items_2_0= ruleTupleTypeRefItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) ) )* )? otherlv_5= ')'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3231:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3232:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleTypeRefAccess().getTupleTypeRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTupleTypeRef7687); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleTypeRefAccess().getLeftParenthesisKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3241:1: ( ( (lv_items_2_0= ruleTupleTypeRefItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3241:2: ( (lv_items_2_0= ruleTupleTypeRefItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) ) )*
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3241:2: ( (lv_items_2_0= ruleTupleTypeRefItem ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3242:1: (lv_items_2_0= ruleTupleTypeRefItem )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3242:1: (lv_items_2_0= ruleTupleTypeRefItem )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3243:3: lv_items_2_0= ruleTupleTypeRefItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleTypeRefAccess().getItemsTupleTypeRefItemParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTupleTypeRefItem_in_ruleTupleTypeRef7709);
                    lv_items_2_0=ruleTupleTypeRefItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTupleTypeRefRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_2_0, 
                            		"TupleTypeRefItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3259:2: (otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==37) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3259:4: otherlv_3= ',' ( (lv_items_4_0= ruleTupleTypeRefItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleTupleTypeRef7722); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleTypeRefAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3263:1: ( (lv_items_4_0= ruleTupleTypeRefItem ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3264:1: (lv_items_4_0= ruleTupleTypeRefItem )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3264:1: (lv_items_4_0= ruleTupleTypeRefItem )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3265:3: lv_items_4_0= ruleTupleTypeRefItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleTypeRefAccess().getItemsTupleTypeRefItemParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTupleTypeRefItem_in_ruleTupleTypeRef7743);
                    	    lv_items_4_0=ruleTupleTypeRefItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTupleTypeRefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_4_0, 
                    	            		"TupleTypeRefItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleTupleTypeRef7759); 

                	newLeafNode(otherlv_5, grammarAccess.getTupleTypeRefAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeRef"


    // $ANTLR start "entryRuleTupleTypeRefItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3293:1: entryRuleTupleTypeRefItem returns [EObject current=null] : iv_ruleTupleTypeRefItem= ruleTupleTypeRefItem EOF ;
    public final EObject entryRuleTupleTypeRefItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeRefItem = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3294:2: (iv_ruleTupleTypeRefItem= ruleTupleTypeRefItem EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3295:2: iv_ruleTupleTypeRefItem= ruleTupleTypeRefItem EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRefItemRule()); 
            pushFollow(FOLLOW_ruleTupleTypeRefItem_in_entryRuleTupleTypeRefItem7795);
            iv_ruleTupleTypeRefItem=ruleTupleTypeRefItem();

            state._fsp--;

             current =iv_ruleTupleTypeRefItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleTypeRefItem7805); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeRefItem"


    // $ANTLR start "ruleTupleTypeRefItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3302:1: ruleTupleTypeRefItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleTupleTypeRefItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3305:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3306:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3306:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3306:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3306:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3307:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3307:1: (lv_name_0_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3308:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTupleTypeRefItem7847); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeRefItemAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTupleTypeRefItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleTupleTypeRefItem7864); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleTypeRefItemAccess().getColonKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3328:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3329:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3329:1: (lv_type_2_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3330:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getTupleTypeRefItemAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleTupleTypeRefItem7885);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTupleTypeRefItemRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeRefItem"


    // $ANTLR start "entryRuleSetTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3354:1: entryRuleSetTypeRef returns [EObject current=null] : iv_ruleSetTypeRef= ruleSetTypeRef EOF ;
    public final EObject entryRuleSetTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3355:2: (iv_ruleSetTypeRef= ruleSetTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3356:2: iv_ruleSetTypeRef= ruleSetTypeRef EOF
            {
             newCompositeNode(grammarAccess.getSetTypeRefRule()); 
            pushFollow(FOLLOW_ruleSetTypeRef_in_entryRuleSetTypeRef7921);
            iv_ruleSetTypeRef=ruleSetTypeRef();

            state._fsp--;

             current =iv_ruleSetTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetTypeRef7931); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetTypeRef"


    // $ANTLR start "ruleSetTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3363:1: ruleSetTypeRef returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '}' ) ;
    public final EObject ruleSetTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3366:28: ( ( () otherlv_1= '{' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3367:1: ( () otherlv_1= '{' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3367:1: ( () otherlv_1= '{' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3367:2: () otherlv_1= '{' ( (lv_type_2_0= ruleTypeRef ) ) otherlv_3= '}'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3367:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3368:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSetTypeRefAccess().getSetTypeRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleSetTypeRef7977); 

                	newLeafNode(otherlv_1, grammarAccess.getSetTypeRefAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3377:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3378:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3378:1: (lv_type_2_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3379:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getSetTypeRefAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleSetTypeRef7998);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetTypeRefRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleSetTypeRef8010); 

                	newLeafNode(otherlv_3, grammarAccess.getSetTypeRefAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetTypeRef"


    // $ANTLR start "entryRuleVoidTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3407:1: entryRuleVoidTypeRef returns [EObject current=null] : iv_ruleVoidTypeRef= ruleVoidTypeRef EOF ;
    public final EObject entryRuleVoidTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3408:2: (iv_ruleVoidTypeRef= ruleVoidTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3409:2: iv_ruleVoidTypeRef= ruleVoidTypeRef EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRefRule()); 
            pushFollow(FOLLOW_ruleVoidTypeRef_in_entryRuleVoidTypeRef8046);
            iv_ruleVoidTypeRef=ruleVoidTypeRef();

            state._fsp--;

             current =iv_ruleVoidTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidTypeRef8056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoidTypeRef"


    // $ANTLR start "ruleVoidTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3416:1: ruleVoidTypeRef returns [EObject current=null] : ( (lv_name_0_0= 'void' ) ) ;
    public final EObject ruleVoidTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3419:28: ( ( (lv_name_0_0= 'void' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3420:1: ( (lv_name_0_0= 'void' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3420:1: ( (lv_name_0_0= 'void' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3421:1: (lv_name_0_0= 'void' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3421:1: (lv_name_0_0= 'void' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3422:3: lv_name_0_0= 'void'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_50_in_ruleVoidTypeRef8098); 

                    newLeafNode(lv_name_0_0, grammarAccess.getVoidTypeRefAccess().getNameVoidKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVoidTypeRefRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "void");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoidTypeRef"


    // $ANTLR start "entryRuleAutoTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3443:1: entryRuleAutoTypeRef returns [EObject current=null] : iv_ruleAutoTypeRef= ruleAutoTypeRef EOF ;
    public final EObject entryRuleAutoTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3444:2: (iv_ruleAutoTypeRef= ruleAutoTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3445:2: iv_ruleAutoTypeRef= ruleAutoTypeRef EOF
            {
             newCompositeNode(grammarAccess.getAutoTypeRefRule()); 
            pushFollow(FOLLOW_ruleAutoTypeRef_in_entryRuleAutoTypeRef8146);
            iv_ruleAutoTypeRef=ruleAutoTypeRef();

            state._fsp--;

             current =iv_ruleAutoTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutoTypeRef8156); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutoTypeRef"


    // $ANTLR start "ruleAutoTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3452:1: ruleAutoTypeRef returns [EObject current=null] : ( () otherlv_1= 'auto' ) ;
    public final EObject ruleAutoTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3455:28: ( ( () otherlv_1= 'auto' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3456:1: ( () otherlv_1= 'auto' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3456:1: ( () otherlv_1= 'auto' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3456:2: () otherlv_1= 'auto'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3456:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3457:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAutoTypeRefAccess().getAutoTypeRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAutoTypeRef8202); 

                	newLeafNode(otherlv_1, grammarAccess.getAutoTypeRefAccess().getAutoKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutoTypeRef"


    // $ANTLR start "entryRuleCollectionRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3474:1: entryRuleCollectionRef returns [EObject current=null] : iv_ruleCollectionRef= ruleCollectionRef EOF ;
    public final EObject entryRuleCollectionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3475:2: (iv_ruleCollectionRef= ruleCollectionRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3476:2: iv_ruleCollectionRef= ruleCollectionRef EOF
            {
             newCompositeNode(grammarAccess.getCollectionRefRule()); 
            pushFollow(FOLLOW_ruleCollectionRef_in_entryRuleCollectionRef8238);
            iv_ruleCollectionRef=ruleCollectionRef();

            state._fsp--;

             current =iv_ruleCollectionRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionRef8248); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionRef"


    // $ANTLR start "ruleCollectionRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3483:1: ruleCollectionRef returns [EObject current=null] : ( ( (lv_collection_0_0= ruleCollectionType ) ) otherlv_1= '<' ( (lv_typeref_2_0= ruleTypeRef ) ) otherlv_3= '>' ) ;
    public final EObject ruleCollectionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_collection_0_0 = null;

        EObject lv_typeref_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3486:28: ( ( ( (lv_collection_0_0= ruleCollectionType ) ) otherlv_1= '<' ( (lv_typeref_2_0= ruleTypeRef ) ) otherlv_3= '>' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3487:1: ( ( (lv_collection_0_0= ruleCollectionType ) ) otherlv_1= '<' ( (lv_typeref_2_0= ruleTypeRef ) ) otherlv_3= '>' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3487:1: ( ( (lv_collection_0_0= ruleCollectionType ) ) otherlv_1= '<' ( (lv_typeref_2_0= ruleTypeRef ) ) otherlv_3= '>' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3487:2: ( (lv_collection_0_0= ruleCollectionType ) ) otherlv_1= '<' ( (lv_typeref_2_0= ruleTypeRef ) ) otherlv_3= '>'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3487:2: ( (lv_collection_0_0= ruleCollectionType ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3488:1: (lv_collection_0_0= ruleCollectionType )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3488:1: (lv_collection_0_0= ruleCollectionType )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3489:3: lv_collection_0_0= ruleCollectionType
            {
             
            	        newCompositeNode(grammarAccess.getCollectionRefAccess().getCollectionCollectionTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectionType_in_ruleCollectionRef8294);
            lv_collection_0_0=ruleCollectionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionRefRule());
            	        }
                   		set(
                   			current, 
                   			"collection",
                    		lv_collection_0_0, 
                    		"CollectionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleCollectionRef8306); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectionRefAccess().getLessThanSignKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3509:1: ( (lv_typeref_2_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3510:1: (lv_typeref_2_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3510:1: (lv_typeref_2_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3511:3: lv_typeref_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getCollectionRefAccess().getTyperefTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleCollectionRef8327);
            lv_typeref_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionRefRule());
            	        }
                   		set(
                   			current, 
                   			"typeref",
                    		lv_typeref_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleCollectionRef8339); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionRefAccess().getGreaterThanSignKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionRef"


    // $ANTLR start "entryRuleUnitRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3539:1: entryRuleUnitRef returns [EObject current=null] : iv_ruleUnitRef= ruleUnitRef EOF ;
    public final EObject entryRuleUnitRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3540:2: (iv_ruleUnitRef= ruleUnitRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3541:2: iv_ruleUnitRef= ruleUnitRef EOF
            {
             newCompositeNode(grammarAccess.getUnitRefRule()); 
            pushFollow(FOLLOW_ruleUnitRef_in_entryRuleUnitRef8375);
            iv_ruleUnitRef=ruleUnitRef();

            state._fsp--;

             current =iv_ruleUnitRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitRef8385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitRef"


    // $ANTLR start "ruleUnitRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3548:1: ruleUnitRef returns [EObject current=null] : (otherlv_0= 'in' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleUnitRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3551:28: ( (otherlv_0= 'in' ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3552:1: (otherlv_0= 'in' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3552:1: (otherlv_0= 'in' ( (otherlv_1= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3552:3: otherlv_0= 'in' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleUnitRef8422); 

                	newLeafNode(otherlv_0, grammarAccess.getUnitRefAccess().getInKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3556:1: ( (otherlv_1= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3557:1: (otherlv_1= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3557:1: (otherlv_1= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3558:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUnitRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnitRef8442); 

            		newLeafNode(otherlv_1, grammarAccess.getUnitRefAccess().getUnittypeUnitCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitRef"


    // $ANTLR start "entryRuleBoxRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3577:1: entryRuleBoxRef returns [EObject current=null] : iv_ruleBoxRef= ruleBoxRef EOF ;
    public final EObject entryRuleBoxRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3578:2: (iv_ruleBoxRef= ruleBoxRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3579:2: iv_ruleBoxRef= ruleBoxRef EOF
            {
             newCompositeNode(grammarAccess.getBoxRefRule()); 
            pushFollow(FOLLOW_ruleBoxRef_in_entryRuleBoxRef8478);
            iv_ruleBoxRef=ruleBoxRef();

            state._fsp--;

             current =iv_ruleBoxRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxRef8488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoxRef"


    // $ANTLR start "ruleBoxRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3586:1: ruleBoxRef returns [EObject current=null] : (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBoxRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3589:28: ( (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3590:1: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3590:1: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3590:3: otherlv_0= '->' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleBoxRef8525); 

                	newLeafNode(otherlv_0, grammarAccess.getBoxRefAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3594:1: ( (otherlv_1= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3595:1: (otherlv_1= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3595:1: (otherlv_1= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3596:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBoxRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoxRef8545); 

            		newLeafNode(otherlv_1, grammarAccess.getBoxRefAccess().getRefBoxCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoxRef"


    // $ANTLR start "entryRuleTypeAliasRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3615:1: entryRuleTypeAliasRef returns [EObject current=null] : iv_ruleTypeAliasRef= ruleTypeAliasRef EOF ;
    public final EObject entryRuleTypeAliasRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAliasRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3616:2: (iv_ruleTypeAliasRef= ruleTypeAliasRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3617:2: iv_ruleTypeAliasRef= ruleTypeAliasRef EOF
            {
             newCompositeNode(grammarAccess.getTypeAliasRefRule()); 
            pushFollow(FOLLOW_ruleTypeAliasRef_in_entryRuleTypeAliasRef8581);
            iv_ruleTypeAliasRef=ruleTypeAliasRef();

            state._fsp--;

             current =iv_ruleTypeAliasRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeAliasRef8591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeAliasRef"


    // $ANTLR start "ruleTypeAliasRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3624:1: ruleTypeAliasRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeAliasRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3627:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3628:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3628:1: ( (otherlv_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3629:1: (otherlv_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3629:1: (otherlv_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3630:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeAliasRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeAliasRef8635); 

            		newLeafNode(otherlv_0, grammarAccess.getTypeAliasRefAccess().getRefTypeAliasCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeAliasRef"


    // $ANTLR start "entryRuleAuxTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3649:1: entryRuleAuxTypeRef returns [EObject current=null] : iv_ruleAuxTypeRef= ruleAuxTypeRef EOF ;
    public final EObject entryRuleAuxTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuxTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3650:2: (iv_ruleAuxTypeRef= ruleAuxTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3651:2: iv_ruleAuxTypeRef= ruleAuxTypeRef EOF
            {
             newCompositeNode(grammarAccess.getAuxTypeRefRule()); 
            pushFollow(FOLLOW_ruleAuxTypeRef_in_entryRuleAuxTypeRef8670);
            iv_ruleAuxTypeRef=ruleAuxTypeRef();

            state._fsp--;

             current =iv_ruleAuxTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuxTypeRef8680); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuxTypeRef"


    // $ANTLR start "ruleAuxTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3658:1: ruleAuxTypeRef returns [EObject current=null] : ( (lv_ref_0_0= ruleAuxType ) ) ;
    public final EObject ruleAuxTypeRef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_ref_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3661:28: ( ( (lv_ref_0_0= ruleAuxType ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3662:1: ( (lv_ref_0_0= ruleAuxType ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3662:1: ( (lv_ref_0_0= ruleAuxType ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3663:1: (lv_ref_0_0= ruleAuxType )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3663:1: (lv_ref_0_0= ruleAuxType )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3664:3: lv_ref_0_0= ruleAuxType
            {
             
            	        newCompositeNode(grammarAccess.getAuxTypeRefAccess().getRefAuxTypeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAuxType_in_ruleAuxTypeRef8725);
            lv_ref_0_0=ruleAuxType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAuxTypeRefRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_0_0, 
                    		"AuxType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuxTypeRef"


    // $ANTLR start "entryRuleShapeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3688:1: entryRuleShapeRef returns [EObject current=null] : iv_ruleShapeRef= ruleShapeRef EOF ;
    public final EObject entryRuleShapeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3689:2: (iv_ruleShapeRef= ruleShapeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3690:2: iv_ruleShapeRef= ruleShapeRef EOF
            {
             newCompositeNode(grammarAccess.getShapeRefRule()); 
            pushFollow(FOLLOW_ruleShapeRef_in_entryRuleShapeRef8760);
            iv_ruleShapeRef=ruleShapeRef();

            state._fsp--;

             current =iv_ruleShapeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShapeRef8770); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeRef"


    // $ANTLR start "ruleShapeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3697:1: ruleShapeRef returns [EObject current=null] : (otherlv_0= '~>' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleShapeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3700:28: ( (otherlv_0= '~>' ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3701:1: (otherlv_0= '~>' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3701:1: (otherlv_0= '~>' ( (otherlv_1= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3701:3: otherlv_0= '~>' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleShapeRef8807); 

                	newLeafNode(otherlv_0, grammarAccess.getShapeRefAccess().getTildeGreaterThanSignKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3705:1: ( (otherlv_1= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3706:1: (otherlv_1= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3706:1: (otherlv_1= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3707:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getShapeRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleShapeRef8827); 

            		newLeafNode(otherlv_1, grammarAccess.getShapeRefAccess().getRefShapeCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeRef"


    // $ANTLR start "entryRuleNumberTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3726:1: entryRuleNumberTypeRef returns [EObject current=null] : iv_ruleNumberTypeRef= ruleNumberTypeRef EOF ;
    public final EObject entryRuleNumberTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3727:2: (iv_ruleNumberTypeRef= ruleNumberTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3728:2: iv_ruleNumberTypeRef= ruleNumberTypeRef EOF
            {
             newCompositeNode(grammarAccess.getNumberTypeRefRule()); 
            pushFollow(FOLLOW_ruleNumberTypeRef_in_entryRuleNumberTypeRef8863);
            iv_ruleNumberTypeRef=ruleNumberTypeRef();

            state._fsp--;

             current =iv_ruleNumberTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTypeRef8873); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberTypeRef"


    // $ANTLR start "ruleNumberTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3735:1: ruleNumberTypeRef returns [EObject current=null] : ( (lv_ref_0_0= ruleNumberType ) ) ;
    public final EObject ruleNumberTypeRef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_ref_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3738:28: ( ( (lv_ref_0_0= ruleNumberType ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3739:1: ( (lv_ref_0_0= ruleNumberType ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3739:1: ( (lv_ref_0_0= ruleNumberType ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3740:1: (lv_ref_0_0= ruleNumberType )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3740:1: (lv_ref_0_0= ruleNumberType )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3741:3: lv_ref_0_0= ruleNumberType
            {
             
            	        newCompositeNode(grammarAccess.getNumberTypeRefAccess().getRefNumberTypeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberType_in_ruleNumberTypeRef8918);
            lv_ref_0_0=ruleNumberType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberTypeRefRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_0_0, 
                    		"NumberType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberTypeRef"


    // $ANTLR start "entryRuleVisualTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3765:1: entryRuleVisualTypeRef returns [EObject current=null] : iv_ruleVisualTypeRef= ruleVisualTypeRef EOF ;
    public final EObject entryRuleVisualTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualTypeRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3766:2: (iv_ruleVisualTypeRef= ruleVisualTypeRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3767:2: iv_ruleVisualTypeRef= ruleVisualTypeRef EOF
            {
             newCompositeNode(grammarAccess.getVisualTypeRefRule()); 
            pushFollow(FOLLOW_ruleVisualTypeRef_in_entryRuleVisualTypeRef8953);
            iv_ruleVisualTypeRef=ruleVisualTypeRef();

            state._fsp--;

             current =iv_ruleVisualTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualTypeRef8963); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisualTypeRef"


    // $ANTLR start "ruleVisualTypeRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3774:1: ruleVisualTypeRef returns [EObject current=null] : ( (lv_ref_0_0= ruleVisualType ) ) ;
    public final EObject ruleVisualTypeRef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_ref_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3777:28: ( ( (lv_ref_0_0= ruleVisualType ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3778:1: ( (lv_ref_0_0= ruleVisualType ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3778:1: ( (lv_ref_0_0= ruleVisualType ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3779:1: (lv_ref_0_0= ruleVisualType )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3779:1: (lv_ref_0_0= ruleVisualType )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3780:3: lv_ref_0_0= ruleVisualType
            {
             
            	        newCompositeNode(grammarAccess.getVisualTypeRefAccess().getRefVisualTypeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleVisualType_in_ruleVisualTypeRef9008);
            lv_ref_0_0=ruleVisualType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVisualTypeRefRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_0_0, 
                    		"VisualType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisualTypeRef"


    // $ANTLR start "entryRuleTypeAlias"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3804:1: entryRuleTypeAlias returns [EObject current=null] : iv_ruleTypeAlias= ruleTypeAlias EOF ;
    public final EObject entryRuleTypeAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAlias = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3805:2: (iv_ruleTypeAlias= ruleTypeAlias EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3806:2: iv_ruleTypeAlias= ruleTypeAlias EOF
            {
             newCompositeNode(grammarAccess.getTypeAliasRule()); 
            pushFollow(FOLLOW_ruleTypeAlias_in_entryRuleTypeAlias9043);
            iv_ruleTypeAlias=ruleTypeAlias();

            state._fsp--;

             current =iv_ruleTypeAlias; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeAlias9053); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeAlias"


    // $ANTLR start "ruleTypeAlias"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3813:1: ruleTypeAlias returns [EObject current=null] : (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleTypeAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3816:28: ( (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3817:1: (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3817:1: (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3817:3: otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleTypeAlias9090); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeAliasAccess().getAliasKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3821:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3822:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3822:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3823:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeAlias9107); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeAliasRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3839:2: ( (lv_type_2_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3840:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3840:1: (lv_type_2_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3841:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getTypeAliasAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeAlias9133);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeAliasRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeAlias"


    // $ANTLR start "entryRuleStream"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3865:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3866:2: (iv_ruleStream= ruleStream EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3867:2: iv_ruleStream= ruleStream EOF
            {
             newCompositeNode(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_ruleStream_in_entryRuleStream9169);
            iv_ruleStream=ruleStream();

            state._fsp--;

             current =iv_ruleStream; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream9179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3874:1: ruleStream returns [EObject current=null] : ( ( (lv_name_0_0= 'stream' ) )? ( (lv_left_1_0= ruleLStreamValue ) ) otherlv_2= '<-' ( (lv_right_3_0= ruleRStreamValue ) ) ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3877:28: ( ( ( (lv_name_0_0= 'stream' ) )? ( (lv_left_1_0= ruleLStreamValue ) ) otherlv_2= '<-' ( (lv_right_3_0= ruleRStreamValue ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3878:1: ( ( (lv_name_0_0= 'stream' ) )? ( (lv_left_1_0= ruleLStreamValue ) ) otherlv_2= '<-' ( (lv_right_3_0= ruleRStreamValue ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3878:1: ( ( (lv_name_0_0= 'stream' ) )? ( (lv_left_1_0= ruleLStreamValue ) ) otherlv_2= '<-' ( (lv_right_3_0= ruleRStreamValue ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3878:2: ( (lv_name_0_0= 'stream' ) )? ( (lv_left_1_0= ruleLStreamValue ) ) otherlv_2= '<-' ( (lv_right_3_0= ruleRStreamValue ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3878:2: ( (lv_name_0_0= 'stream' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==57) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3879:1: (lv_name_0_0= 'stream' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3879:1: (lv_name_0_0= 'stream' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3880:3: lv_name_0_0= 'stream'
                    {
                    lv_name_0_0=(Token)match(input,57,FOLLOW_57_in_ruleStream9222); 

                            newLeafNode(lv_name_0_0, grammarAccess.getStreamAccess().getNameStreamKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStreamRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "stream");
                    	    

                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3893:3: ( (lv_left_1_0= ruleLStreamValue ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3894:1: (lv_left_1_0= ruleLStreamValue )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3894:1: (lv_left_1_0= ruleLStreamValue )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3895:3: lv_left_1_0= ruleLStreamValue
            {
             
            	        newCompositeNode(grammarAccess.getStreamAccess().getLeftLStreamValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLStreamValue_in_ruleStream9257);
            lv_left_1_0=ruleLStreamValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_1_0, 
                    		"LStreamValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleStream9269); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getLessThanSignHyphenMinusKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3915:1: ( (lv_right_3_0= ruleRStreamValue ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3916:1: (lv_right_3_0= ruleRStreamValue )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3916:1: (lv_right_3_0= ruleRStreamValue )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3917:3: lv_right_3_0= ruleRStreamValue
            {
             
            	        newCompositeNode(grammarAccess.getStreamAccess().getRightRStreamValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRStreamValue_in_ruleStream9290);
            lv_right_3_0=ruleRStreamValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_3_0, 
                    		"RStreamValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleLStreamValue"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3941:1: entryRuleLStreamValue returns [EObject current=null] : iv_ruleLStreamValue= ruleLStreamValue EOF ;
    public final EObject entryRuleLStreamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLStreamValue = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3942:2: (iv_ruleLStreamValue= ruleLStreamValue EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3943:2: iv_ruleLStreamValue= ruleLStreamValue EOF
            {
             newCompositeNode(grammarAccess.getLStreamValueRule()); 
            pushFollow(FOLLOW_ruleLStreamValue_in_entryRuleLStreamValue9326);
            iv_ruleLStreamValue=ruleLStreamValue();

            state._fsp--;

             current =iv_ruleLStreamValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLStreamValue9336); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLStreamValue"


    // $ANTLR start "ruleLStreamValue"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3950:1: ruleLStreamValue returns [EObject current=null] : this_OutputRef_0= ruleOutputRef ;
    public final EObject ruleLStreamValue() throws RecognitionException {
        EObject current = null;

        EObject this_OutputRef_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3953:28: (this_OutputRef_0= ruleOutputRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3955:5: this_OutputRef_0= ruleOutputRef
            {
             
                    newCompositeNode(grammarAccess.getLStreamValueAccess().getOutputRefParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOutputRef_in_ruleLStreamValue9382);
            this_OutputRef_0=ruleOutputRef();

            state._fsp--;

             
                    current = this_OutputRef_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLStreamValue"


    // $ANTLR start "entryRuleRStreamValue"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3971:1: entryRuleRStreamValue returns [EObject current=null] : iv_ruleRStreamValue= ruleRStreamValue EOF ;
    public final EObject entryRuleRStreamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRStreamValue = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3972:2: (iv_ruleRStreamValue= ruleRStreamValue EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3973:2: iv_ruleRStreamValue= ruleRStreamValue EOF
            {
             newCompositeNode(grammarAccess.getRStreamValueRule()); 
            pushFollow(FOLLOW_ruleRStreamValue_in_entryRuleRStreamValue9416);
            iv_ruleRStreamValue=ruleRStreamValue();

            state._fsp--;

             current =iv_ruleRStreamValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRStreamValue9426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRStreamValue"


    // $ANTLR start "ruleRStreamValue"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3980:1: ruleRStreamValue returns [EObject current=null] : (this_InputRef_0= ruleInputRef | this_LiteralExpression_1= ruleLiteralExpression ) ;
    public final EObject ruleRStreamValue() throws RecognitionException {
        EObject current = null;

        EObject this_InputRef_0 = null;

        EObject this_LiteralExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3983:28: ( (this_InputRef_0= ruleInputRef | this_LiteralExpression_1= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3984:1: (this_InputRef_0= ruleInputRef | this_LiteralExpression_1= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3984:1: (this_InputRef_0= ruleInputRef | this_LiteralExpression_1= ruleLiteralExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==59) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_BIN)||LA54_0==24||LA54_0==26||(LA54_0>=29 && LA54_0<=35)||(LA54_0>=39 && LA54_0<=40)||LA54_0==69) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3985:5: this_InputRef_0= ruleInputRef
                    {
                     
                            newCompositeNode(grammarAccess.getRStreamValueAccess().getInputRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputRef_in_ruleRStreamValue9473);
                    this_InputRef_0=ruleInputRef();

                    state._fsp--;

                     
                            current = this_InputRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:3995:5: this_LiteralExpression_1= ruleLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getRStreamValueAccess().getLiteralExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleRStreamValue9500);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRStreamValue"


    // $ANTLR start "entryRuleInputRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4011:1: entryRuleInputRef returns [EObject current=null] : iv_ruleInputRef= ruleInputRef EOF ;
    public final EObject entryRuleInputRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4012:2: (iv_ruleInputRef= ruleInputRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4013:2: iv_ruleInputRef= ruleInputRef EOF
            {
             newCompositeNode(grammarAccess.getInputRefRule()); 
            pushFollow(FOLLOW_ruleInputRef_in_entryRuleInputRef9535);
            iv_ruleInputRef=ruleInputRef();

            state._fsp--;

             current =iv_ruleInputRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputRef9545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputRef"


    // $ANTLR start "ruleInputRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4020:1: ruleInputRef returns [EObject current=null] : ( () otherlv_1= 'I' ) ;
    public final EObject ruleInputRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4023:28: ( ( () otherlv_1= 'I' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4024:1: ( () otherlv_1= 'I' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4024:1: ( () otherlv_1= 'I' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4024:2: () otherlv_1= 'I'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4024:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4025:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputRefAccess().getInputRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleInputRef9591); 

                	newLeafNode(otherlv_1, grammarAccess.getInputRefAccess().getIKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputRef"


    // $ANTLR start "entryRuleOutputRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4042:1: entryRuleOutputRef returns [EObject current=null] : iv_ruleOutputRef= ruleOutputRef EOF ;
    public final EObject entryRuleOutputRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputRef = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4043:2: (iv_ruleOutputRef= ruleOutputRef EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4044:2: iv_ruleOutputRef= ruleOutputRef EOF
            {
             newCompositeNode(grammarAccess.getOutputRefRule()); 
            pushFollow(FOLLOW_ruleOutputRef_in_entryRuleOutputRef9627);
            iv_ruleOutputRef=ruleOutputRef();

            state._fsp--;

             current =iv_ruleOutputRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputRef9637); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputRef"


    // $ANTLR start "ruleOutputRef"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4051:1: ruleOutputRef returns [EObject current=null] : ( () otherlv_1= 'O' ) ;
    public final EObject ruleOutputRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4054:28: ( ( () otherlv_1= 'O' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4055:1: ( () otherlv_1= 'O' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4055:1: ( () otherlv_1= 'O' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4055:2: () otherlv_1= 'O'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4055:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4056:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOutputRefAccess().getOutputRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleOutputRef9683); 

                	newLeafNode(otherlv_1, grammarAccess.getOutputRefAccess().getOKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputRef"


    // $ANTLR start "entryRuleInvokation"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4073:1: entryRuleInvokation returns [EObject current=null] : iv_ruleInvokation= ruleInvokation EOF ;
    public final EObject entryRuleInvokation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokation = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4074:2: (iv_ruleInvokation= ruleInvokation EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4075:2: iv_ruleInvokation= ruleInvokation EOF
            {
             newCompositeNode(grammarAccess.getInvokationRule()); 
            pushFollow(FOLLOW_ruleInvokation_in_entryRuleInvokation9719);
            iv_ruleInvokation=ruleInvokation();

            state._fsp--;

             current =iv_ruleInvokation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokation9729); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvokation"


    // $ANTLR start "ruleInvokation"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4082:1: ruleInvokation returns [EObject current=null] : ( ( (lv_module_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleInvokationParam ) )* otherlv_4= '}' ) ;
    public final EObject ruleInvokation() throws RecognitionException {
        EObject current = null;

        Token lv_module_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sentences_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4085:28: ( ( ( (lv_module_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleInvokationParam ) )* otherlv_4= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4086:1: ( ( (lv_module_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleInvokationParam ) )* otherlv_4= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4086:1: ( ( (lv_module_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleInvokationParam ) )* otherlv_4= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4086:2: ( (lv_module_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sentences_3_0= ruleInvokationParam ) )* otherlv_4= '}'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4086:2: ( (lv_module_0_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4087:1: (lv_module_0_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4087:1: (lv_module_0_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4088:3: lv_module_0_0= RULE_ID
            {
            lv_module_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvokation9771); 

            			newLeafNode(lv_module_0_0, grammarAccess.getInvokationAccess().getModuleIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInvokationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"module",
                    		lv_module_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4104:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4105:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4105:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4106:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvokation9793); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInvokationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInvokationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleInvokation9810); 

                	newLeafNode(otherlv_2, grammarAccess.getInvokationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4126:1: ( (lv_sentences_3_0= ruleInvokationParam ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4127:1: (lv_sentences_3_0= ruleInvokationParam )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4127:1: (lv_sentences_3_0= ruleInvokationParam )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4128:3: lv_sentences_3_0= ruleInvokationParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvokationAccess().getSentencesInvokationParamParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInvokationParam_in_ruleInvokation9831);
            	    lv_sentences_3_0=ruleInvokationParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvokationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentences",
            	            		lv_sentences_3_0, 
            	            		"InvokationParam");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleInvokation9844); 

                	newLeafNode(otherlv_4, grammarAccess.getInvokationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvokation"


    // $ANTLR start "entryRuleInvokationParam"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4156:1: entryRuleInvokationParam returns [EObject current=null] : iv_ruleInvokationParam= ruleInvokationParam EOF ;
    public final EObject entryRuleInvokationParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokationParam = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4157:2: (iv_ruleInvokationParam= ruleInvokationParam EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4158:2: iv_ruleInvokationParam= ruleInvokationParam EOF
            {
             newCompositeNode(grammarAccess.getInvokationParamRule()); 
            pushFollow(FOLLOW_ruleInvokationParam_in_entryRuleInvokationParam9880);
            iv_ruleInvokationParam=ruleInvokationParam();

            state._fsp--;

             current =iv_ruleInvokationParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokationParam9890); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvokationParam"


    // $ANTLR start "ruleInvokationParam"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4165:1: ruleInvokationParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_source_2_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleInvokationParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_source_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4168:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_source_2_0= ruleLiteralExpression ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4169:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_source_2_0= ruleLiteralExpression ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4169:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_source_2_0= ruleLiteralExpression ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4169:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_source_2_0= ruleLiteralExpression ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4169:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4170:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4170:1: (lv_name_0_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4171:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvokationParam9932); 

            			newLeafNode(lv_name_0_0, grammarAccess.getInvokationParamAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInvokationParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleInvokationParam9949); 

                	newLeafNode(otherlv_1, grammarAccess.getInvokationParamAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4191:1: ( (lv_source_2_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4192:1: (lv_source_2_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4192:1: (lv_source_2_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4193:3: lv_source_2_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getInvokationParamAccess().getSourceLiteralExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleInvokationParam9970);
            lv_source_2_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokationParamRule());
            	        }
                   		set(
                   			current, 
                   			"source",
                    		lv_source_2_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvokationParam"


    // $ANTLR start "entryRuleLoop"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4217:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4218:2: (iv_ruleLoop= ruleLoop EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4219:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop10006);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop10016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4226:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' ( (lv_it_1_0= ruleLoopFor ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sentences_4_0= ruleLoopSentence ) )* otherlv_5= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_it_1_0 = null;

        EObject lv_sentences_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4229:28: ( (otherlv_0= 'loop' ( (lv_it_1_0= ruleLoopFor ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sentences_4_0= ruleLoopSentence ) )* otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4230:1: (otherlv_0= 'loop' ( (lv_it_1_0= ruleLoopFor ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sentences_4_0= ruleLoopSentence ) )* otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4230:1: (otherlv_0= 'loop' ( (lv_it_1_0= ruleLoopFor ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sentences_4_0= ruleLoopSentence ) )* otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4230:3: otherlv_0= 'loop' ( (lv_it_1_0= ruleLoopFor ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sentences_4_0= ruleLoopSentence ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleLoop10053); 

                	newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4234:1: ( (lv_it_1_0= ruleLoopFor ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==62) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4235:1: (lv_it_1_0= ruleLoopFor )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4235:1: (lv_it_1_0= ruleLoopFor )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4236:3: lv_it_1_0= ruleLoopFor
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoopAccess().getItLoopForParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLoopFor_in_ruleLoop10074);
                    lv_it_1_0=ruleLoopFor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoopRule());
                    	        }
                           		set(
                           			current, 
                           			"it",
                            		lv_it_1_0, 
                            		"LoopFor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4252:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4253:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4253:1: (lv_name_2_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4254:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoop10092); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLoopAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoopRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleLoop10109); 

                	newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4274:1: ( (lv_sentences_4_0= ruleLoopSentence ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4275:1: (lv_sentences_4_0= ruleLoopSentence )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4275:1: (lv_sentences_4_0= ruleLoopSentence )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4276:3: lv_sentences_4_0= ruleLoopSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLoopAccess().getSentencesLoopSentenceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLoopSentence_in_ruleLoop10130);
            	    lv_sentences_4_0=ruleLoopSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLoopRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentences",
            	            		lv_sentences_4_0, 
            	            		"LoopSentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleLoop10143); 

                	newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleLoopSentence"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4304:1: entryRuleLoopSentence returns [EObject current=null] : iv_ruleLoopSentence= ruleLoopSentence EOF ;
    public final EObject entryRuleLoopSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopSentence = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4305:2: (iv_ruleLoopSentence= ruleLoopSentence EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4306:2: iv_ruleLoopSentence= ruleLoopSentence EOF
            {
             newCompositeNode(grammarAccess.getLoopSentenceRule()); 
            pushFollow(FOLLOW_ruleLoopSentence_in_entryRuleLoopSentence10179);
            iv_ruleLoopSentence=ruleLoopSentence();

            state._fsp--;

             current =iv_ruleLoopSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopSentence10189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopSentence"


    // $ANTLR start "ruleLoopSentence"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4313:1: ruleLoopSentence returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '<-' ( (lv_o_3_0= ruleLiteralExpression ) ) (otherlv_4= '<-' ( (lv_i_5_0= ruleLiteralExpression ) ) )? ) ;
    public final EObject ruleLoopSentence() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_o_3_0 = null;

        EObject lv_i_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4316:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '<-' ( (lv_o_3_0= ruleLiteralExpression ) ) (otherlv_4= '<-' ( (lv_i_5_0= ruleLiteralExpression ) ) )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4317:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '<-' ( (lv_o_3_0= ruleLiteralExpression ) ) (otherlv_4= '<-' ( (lv_i_5_0= ruleLiteralExpression ) ) )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4317:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '<-' ( (lv_o_3_0= ruleLiteralExpression ) ) (otherlv_4= '<-' ( (lv_i_5_0= ruleLiteralExpression ) ) )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4317:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) otherlv_2= '<-' ( (lv_o_3_0= ruleLiteralExpression ) ) (otherlv_4= '<-' ( (lv_i_5_0= ruleLiteralExpression ) ) )?
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4317:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4318:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4318:1: (lv_name_0_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4319:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoopSentence10231); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLoopSentenceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoopSentenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4335:2: ( (lv_type_1_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4336:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4336:1: (lv_type_1_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4337:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getLoopSentenceAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleLoopSentence10257);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoopSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleLoopSentence10269); 

                	newLeafNode(otherlv_2, grammarAccess.getLoopSentenceAccess().getLessThanSignHyphenMinusKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4357:1: ( (lv_o_3_0= ruleLiteralExpression ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4358:1: (lv_o_3_0= ruleLiteralExpression )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4358:1: (lv_o_3_0= ruleLiteralExpression )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4359:3: lv_o_3_0= ruleLiteralExpression
            {
             
            	        newCompositeNode(grammarAccess.getLoopSentenceAccess().getOLiteralExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralExpression_in_ruleLoopSentence10290);
            lv_o_3_0=ruleLiteralExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoopSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"o",
                    		lv_o_3_0, 
                    		"LiteralExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4375:2: (otherlv_4= '<-' ( (lv_i_5_0= ruleLiteralExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4375:4: otherlv_4= '<-' ( (lv_i_5_0= ruleLiteralExpression ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleLoopSentence10303); 

                        	newLeafNode(otherlv_4, grammarAccess.getLoopSentenceAccess().getLessThanSignHyphenMinusKeyword_4_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4379:1: ( (lv_i_5_0= ruleLiteralExpression ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4380:1: (lv_i_5_0= ruleLiteralExpression )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4380:1: (lv_i_5_0= ruleLiteralExpression )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4381:3: lv_i_5_0= ruleLiteralExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoopSentenceAccess().getILiteralExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleLoopSentence10324);
                    lv_i_5_0=ruleLiteralExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoopSentenceRule());
                    	        }
                           		set(
                           			current, 
                           			"i",
                            		lv_i_5_0, 
                            		"LiteralExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopSentence"


    // $ANTLR start "entryRuleLoopFor"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4405:1: entryRuleLoopFor returns [EObject current=null] : iv_ruleLoopFor= ruleLoopFor EOF ;
    public final EObject entryRuleLoopFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopFor = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4406:2: (iv_ruleLoopFor= ruleLoopFor EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4407:2: iv_ruleLoopFor= ruleLoopFor EOF
            {
             newCompositeNode(grammarAccess.getLoopForRule()); 
            pushFollow(FOLLOW_ruleLoopFor_in_entryRuleLoopFor10362);
            iv_ruleLoopFor=ruleLoopFor();

            state._fsp--;

             current =iv_ruleLoopFor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopFor10372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopFor"


    // $ANTLR start "ruleLoopFor"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4414:1: ruleLoopFor returns [EObject current=null] : (otherlv_0= 'for' this_SequenceLiteral_1= ruleSequenceLiteral ) ;
    public final EObject ruleLoopFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SequenceLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4417:28: ( (otherlv_0= 'for' this_SequenceLiteral_1= ruleSequenceLiteral ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4418:1: (otherlv_0= 'for' this_SequenceLiteral_1= ruleSequenceLiteral )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4418:1: (otherlv_0= 'for' this_SequenceLiteral_1= ruleSequenceLiteral )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4418:3: otherlv_0= 'for' this_SequenceLiteral_1= ruleSequenceLiteral
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleLoopFor10409); 

                	newLeafNode(otherlv_0, grammarAccess.getLoopForAccess().getForKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getLoopForAccess().getSequenceLiteralParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSequenceLiteral_in_ruleLoopFor10431);
            this_SequenceLiteral_1=ruleSequenceLiteral();

            state._fsp--;

             
                    current = this_SequenceLiteral_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopFor"


    // $ANTLR start "entryRuleFactory"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4439:1: entryRuleFactory returns [EObject current=null] : iv_ruleFactory= ruleFactory EOF ;
    public final EObject entryRuleFactory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactory = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4440:2: (iv_ruleFactory= ruleFactory EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4441:2: iv_ruleFactory= ruleFactory EOF
            {
             newCompositeNode(grammarAccess.getFactoryRule()); 
            pushFollow(FOLLOW_ruleFactory_in_entryRuleFactory10466);
            iv_ruleFactory=ruleFactory();

            state._fsp--;

             current =iv_ruleFactory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactory10476); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4448:1: ruleFactory returns [EObject current=null] : (otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleFactory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4451:28: ( (otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4452:1: (otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4452:1: (otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4452:3: otherlv_0= 'factory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleFactory10513); 

                	newLeafNode(otherlv_0, grammarAccess.getFactoryAccess().getFactoryKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4456:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4457:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4457:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4458:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFactory10530); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFactoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFactoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4474:2: ( (lv_type_2_0= ruleTypeRef ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4475:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4475:1: (lv_type_2_0= ruleTypeRef )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4476:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFactoryAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFactory10556);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactoryRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRuleFile"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4500:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4501:2: (iv_ruleFile= ruleFile EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4502:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile10592);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile10602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4509:1: ruleFile returns [EObject current=null] : (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isinput_2_0= '<-' ) ) | otherlv_3= '->' ) ( (lv_path_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isinput_2_0=null;
        Token otherlv_3=null;
        Token lv_path_4_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4512:28: ( (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isinput_2_0= '<-' ) ) | otherlv_3= '->' ) ( (lv_path_4_0= RULE_STRING ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4513:1: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isinput_2_0= '<-' ) ) | otherlv_3= '->' ) ( (lv_path_4_0= RULE_STRING ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4513:1: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isinput_2_0= '<-' ) ) | otherlv_3= '->' ) ( (lv_path_4_0= RULE_STRING ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4513:3: otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isinput_2_0= '<-' ) ) | otherlv_3= '->' ) ( (lv_path_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleFile10639); 

                	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4517:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4518:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4518:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4519:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFile10656); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4535:2: ( ( (lv_isinput_2_0= '<-' ) ) | otherlv_3= '->' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==58) ) {
                alt59=1;
            }
            else if ( (LA59_0==36) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4535:3: ( (lv_isinput_2_0= '<-' ) )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4535:3: ( (lv_isinput_2_0= '<-' ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4536:1: (lv_isinput_2_0= '<-' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4536:1: (lv_isinput_2_0= '<-' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4537:3: lv_isinput_2_0= '<-'
                    {
                    lv_isinput_2_0=(Token)match(input,58,FOLLOW_58_in_ruleFile10680); 

                            newLeafNode(lv_isinput_2_0, grammarAccess.getFileAccess().getIsinputLessThanSignHyphenMinusKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFileRule());
                    	        }
                           		setWithLastConsumed(current, "isinput", true, "<-");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4551:7: otherlv_3= '->'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleFile10711); 

                        	newLeafNode(otherlv_3, grammarAccess.getFileAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
                        

                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4555:2: ( (lv_path_4_0= RULE_STRING ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4556:1: (lv_path_4_0= RULE_STRING )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4556:1: (lv_path_4_0= RULE_STRING )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4557:3: lv_path_4_0= RULE_STRING
            {
            lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFile10729); 

            			newLeafNode(lv_path_4_0, grammarAccess.getFileAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_4_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleCanvas"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4581:1: entryRuleCanvas returns [EObject current=null] : iv_ruleCanvas= ruleCanvas EOF ;
    public final EObject entryRuleCanvas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCanvas = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4582:2: (iv_ruleCanvas= ruleCanvas EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4583:2: iv_ruleCanvas= ruleCanvas EOF
            {
             newCompositeNode(grammarAccess.getCanvasRule()); 
            pushFollow(FOLLOW_ruleCanvas_in_entryRuleCanvas10770);
            iv_ruleCanvas=ruleCanvas();

            state._fsp--;

             current =iv_ruleCanvas; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCanvas10780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCanvas"


    // $ANTLR start "ruleCanvas"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4590:1: ruleCanvas returns [EObject current=null] : (otherlv_0= 'canvas' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePair ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleCanvas() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4593:28: ( (otherlv_0= 'canvas' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePair ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4594:1: (otherlv_0= 'canvas' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePair ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4594:1: (otherlv_0= 'canvas' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePair ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4594:3: otherlv_0= 'canvas' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePair ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleCanvas10817); 

                	newLeafNode(otherlv_0, grammarAccess.getCanvasAccess().getCanvasKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4598:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4599:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4599:1: (lv_name_1_0= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4600:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCanvas10834); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCanvasAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCanvasRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleCanvas10851); 

                	newLeafNode(otherlv_2, grammarAccess.getCanvasAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4620:1: ( ( (lv_properties_3_0= rulePair ) ) otherlv_4= ';' )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4620:2: ( (lv_properties_3_0= rulePair ) ) otherlv_4= ';'
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4620:2: ( (lv_properties_3_0= rulePair ) )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4621:1: (lv_properties_3_0= rulePair )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4621:1: (lv_properties_3_0= rulePair )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4622:3: lv_properties_3_0= rulePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCanvasAccess().getPropertiesPairParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePair_in_ruleCanvas10873);
            	    lv_properties_3_0=rulePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCanvasRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_3_0, 
            	            		"Pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleCanvas10885); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCanvasAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleCanvas10899); 

                	newLeafNode(otherlv_5, grammarAccess.getCanvasAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCanvas"


    // $ANTLR start "ruleBinOp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4654:1: ruleBinOp returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleBinOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4656:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4657:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4657:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==67) ) {
                alt61=1;
            }
            else if ( (LA61_0==68) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4657:2: (enumLiteral_0= '&&' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4657:2: (enumLiteral_0= '&&' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4657:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleBinOp10949); 

                            current = grammarAccess.getBinOpAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinOpAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4663:6: (enumLiteral_1= '||' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4663:6: (enumLiteral_1= '||' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4663:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleBinOp10966); 

                            current = grammarAccess.getBinOpAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinOpAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinOp"


    // $ANTLR start "ruleNegationOp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4673:1: ruleNegationOp returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNegationOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4675:28: ( (enumLiteral_0= '!' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4676:1: (enumLiteral_0= '!' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4676:1: (enumLiteral_0= '!' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4676:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleNegationOp11010); 

                    current = grammarAccess.getNegationOpAccess().getNegEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getNegationOpAccess().getNegEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegationOp"


    // $ANTLR start "ruleCompOp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4686:1: ruleCompOp returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) ) ;
    public final Enumerator ruleCompOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4688:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4689:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4689:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt62=1;
                }
                break;
            case 71:
                {
                alt62=2;
                }
                break;
            case 52:
                {
                alt62=3;
                }
                break;
            case 53:
                {
                alt62=4;
                }
                break;
            case 72:
                {
                alt62=5;
                }
                break;
            case 73:
                {
                alt62=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4689:2: (enumLiteral_0= '==' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4689:2: (enumLiteral_0= '==' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4689:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleCompOp11054); 

                            current = grammarAccess.getCompOpAccess().getEqEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompOpAccess().getEqEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4695:6: (enumLiteral_1= '!=' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4695:6: (enumLiteral_1= '!=' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4695:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleCompOp11071); 

                            current = grammarAccess.getCompOpAccess().getNeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompOpAccess().getNeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4701:6: (enumLiteral_2= '<' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4701:6: (enumLiteral_2= '<' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4701:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleCompOp11088); 

                            current = grammarAccess.getCompOpAccess().getLtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompOpAccess().getLtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4707:6: (enumLiteral_3= '>' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4707:6: (enumLiteral_3= '>' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4707:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_ruleCompOp11105); 

                            current = grammarAccess.getCompOpAccess().getGtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCompOpAccess().getGtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4713:6: (enumLiteral_4= '<=' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4713:6: (enumLiteral_4= '<=' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4713:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_72_in_ruleCompOp11122); 

                            current = grammarAccess.getCompOpAccess().getLeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCompOpAccess().getLeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4719:6: (enumLiteral_5= '>=' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4719:6: (enumLiteral_5= '>=' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4719:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_73_in_ruleCompOp11139); 

                            current = grammarAccess.getCompOpAccess().getGeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getCompOpAccess().getGeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompOp"


    // $ANTLR start "ruleAddOp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4729:1: ruleAddOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAddOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4731:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4732:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4732:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==29) ) {
                alt63=1;
            }
            else if ( (LA63_0==30) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4732:2: (enumLiteral_0= '+' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4732:2: (enumLiteral_0= '+' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4732:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleAddOp11184); 

                            current = grammarAccess.getAddOpAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAddOpAccess().getPlusEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4738:6: (enumLiteral_1= '-' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4738:6: (enumLiteral_1= '-' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4738:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleAddOp11201); 

                            current = grammarAccess.getAddOpAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAddOpAccess().getMinusEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOp"


    // $ANTLR start "ruleMultiOp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4748:1: ruleMultiOp returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '%' ) | (enumLiteral_2= '//' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleMultiOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4750:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '%' ) | (enumLiteral_2= '//' ) | (enumLiteral_3= '/' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4751:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '%' ) | (enumLiteral_2= '//' ) | (enumLiteral_3= '/' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4751:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '%' ) | (enumLiteral_2= '//' ) | (enumLiteral_3= '/' ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt64=1;
                }
                break;
            case 75:
                {
                alt64=2;
                }
                break;
            case 76:
                {
                alt64=3;
                }
                break;
            case 77:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4751:2: (enumLiteral_0= '*' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4751:2: (enumLiteral_0= '*' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4751:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleMultiOp11246); 

                            current = grammarAccess.getMultiOpAccess().getTimesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiOpAccess().getTimesEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4757:6: (enumLiteral_1= '%' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4757:6: (enumLiteral_1= '%' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4757:8: enumLiteral_1= '%'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleMultiOp11263); 

                            current = grammarAccess.getMultiOpAccess().getModuloEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiOpAccess().getModuloEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4763:6: (enumLiteral_2= '//' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4763:6: (enumLiteral_2= '//' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4763:8: enumLiteral_2= '//'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleMultiOp11280); 

                            current = grammarAccess.getMultiOpAccess().getIntdivisionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMultiOpAccess().getIntdivisionEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4769:6: (enumLiteral_3= '/' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4769:6: (enumLiteral_3= '/' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4769:8: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleMultiOp11297); 

                            current = grammarAccess.getMultiOpAccess().getDividebyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMultiOpAccess().getDividebyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiOp"


    // $ANTLR start "ruleExpOp"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4779:1: ruleExpOp returns [Enumerator current=null] : (enumLiteral_0= '**' ) ;
    public final Enumerator ruleExpOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4781:28: ( (enumLiteral_0= '**' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4782:1: (enumLiteral_0= '**' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4782:1: (enumLiteral_0= '**' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4782:3: enumLiteral_0= '**'
            {
            enumLiteral_0=(Token)match(input,78,FOLLOW_78_in_ruleExpOp11341); 

                    current = grammarAccess.getExpOpAccess().getExpEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getExpOpAccess().getExpEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "ruleNumberType"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4792:1: ruleNumberType returns [Enumerator current=null] : ( (enumLiteral_0= 'positive' ) | (enumLiteral_1= 'natural' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'rational' ) ) ;
    public final Enumerator ruleNumberType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4794:28: ( ( (enumLiteral_0= 'positive' ) | (enumLiteral_1= 'natural' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'rational' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4795:1: ( (enumLiteral_0= 'positive' ) | (enumLiteral_1= 'natural' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'rational' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4795:1: ( (enumLiteral_0= 'positive' ) | (enumLiteral_1= 'natural' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'rational' ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt65=1;
                }
                break;
            case 80:
                {
                alt65=2;
                }
                break;
            case 81:
                {
                alt65=3;
                }
                break;
            case 82:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4795:2: (enumLiteral_0= 'positive' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4795:2: (enumLiteral_0= 'positive' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4795:4: enumLiteral_0= 'positive'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleNumberType11385); 

                            current = grammarAccess.getNumberTypeAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNumberTypeAccess().getPositiveEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4801:6: (enumLiteral_1= 'natural' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4801:6: (enumLiteral_1= 'natural' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4801:8: enumLiteral_1= 'natural'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleNumberType11402); 

                            current = grammarAccess.getNumberTypeAccess().getNaturalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNumberTypeAccess().getNaturalEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4807:6: (enumLiteral_2= 'integer' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4807:6: (enumLiteral_2= 'integer' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4807:8: enumLiteral_2= 'integer'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_81_in_ruleNumberType11419); 

                            current = grammarAccess.getNumberTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNumberTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4813:6: (enumLiteral_3= 'rational' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4813:6: (enumLiteral_3= 'rational' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4813:8: enumLiteral_3= 'rational'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_82_in_ruleNumberType11436); 

                            current = grammarAccess.getNumberTypeAccess().getRationalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getNumberTypeAccess().getRationalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberType"


    // $ANTLR start "ruleVisualType"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4823:1: ruleVisualType returns [Enumerator current=null] : ( (enumLiteral_0= 'shape' ) | (enumLiteral_1= 'color' ) | (enumLiteral_2= 'angle' ) | (enumLiteral_3= 'size' ) | (enumLiteral_4= 'position' ) | (enumLiteral_5= 'texture' ) ) ;
    public final Enumerator ruleVisualType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4825:28: ( ( (enumLiteral_0= 'shape' ) | (enumLiteral_1= 'color' ) | (enumLiteral_2= 'angle' ) | (enumLiteral_3= 'size' ) | (enumLiteral_4= 'position' ) | (enumLiteral_5= 'texture' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4826:1: ( (enumLiteral_0= 'shape' ) | (enumLiteral_1= 'color' ) | (enumLiteral_2= 'angle' ) | (enumLiteral_3= 'size' ) | (enumLiteral_4= 'position' ) | (enumLiteral_5= 'texture' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4826:1: ( (enumLiteral_0= 'shape' ) | (enumLiteral_1= 'color' ) | (enumLiteral_2= 'angle' ) | (enumLiteral_3= 'size' ) | (enumLiteral_4= 'position' ) | (enumLiteral_5= 'texture' ) )
            int alt66=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt66=1;
                }
                break;
            case 83:
                {
                alt66=2;
                }
                break;
            case 84:
                {
                alt66=3;
                }
                break;
            case 85:
                {
                alt66=4;
                }
                break;
            case 86:
                {
                alt66=5;
                }
                break;
            case 87:
                {
                alt66=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4826:2: (enumLiteral_0= 'shape' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4826:2: (enumLiteral_0= 'shape' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4826:4: enumLiteral_0= 'shape'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleVisualType11481); 

                            current = grammarAccess.getVisualTypeAccess().getShapeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisualTypeAccess().getShapeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4832:6: (enumLiteral_1= 'color' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4832:6: (enumLiteral_1= 'color' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4832:8: enumLiteral_1= 'color'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleVisualType11498); 

                            current = grammarAccess.getVisualTypeAccess().getColorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisualTypeAccess().getColorEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4838:6: (enumLiteral_2= 'angle' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4838:6: (enumLiteral_2= 'angle' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4838:8: enumLiteral_2= 'angle'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_84_in_ruleVisualType11515); 

                            current = grammarAccess.getVisualTypeAccess().getAngleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVisualTypeAccess().getAngleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4844:6: (enumLiteral_3= 'size' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4844:6: (enumLiteral_3= 'size' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4844:8: enumLiteral_3= 'size'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_85_in_ruleVisualType11532); 

                            current = grammarAccess.getVisualTypeAccess().getSizeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getVisualTypeAccess().getSizeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4850:6: (enumLiteral_4= 'position' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4850:6: (enumLiteral_4= 'position' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4850:8: enumLiteral_4= 'position'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_86_in_ruleVisualType11549); 

                            current = grammarAccess.getVisualTypeAccess().getPositionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getVisualTypeAccess().getPositionEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4856:6: (enumLiteral_5= 'texture' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4856:6: (enumLiteral_5= 'texture' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4856:8: enumLiteral_5= 'texture'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_87_in_ruleVisualType11566); 

                            current = grammarAccess.getVisualTypeAccess().getTextureEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getVisualTypeAccess().getTextureEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisualType"


    // $ANTLR start "ruleAuxType"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4866:1: ruleAuxType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'bool' ) ) ;
    public final Enumerator ruleAuxType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4868:28: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'bool' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4869:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'bool' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4869:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'bool' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==88) ) {
                alt67=1;
            }
            else if ( (LA67_0==89) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4869:2: (enumLiteral_0= 'string' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4869:2: (enumLiteral_0= 'string' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4869:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleAuxType11611); 

                            current = grammarAccess.getAuxTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAuxTypeAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4875:6: (enumLiteral_1= 'bool' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4875:6: (enumLiteral_1= 'bool' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4875:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleAuxType11628); 

                            current = grammarAccess.getAuxTypeAccess().getBoolEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAuxTypeAccess().getBoolEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuxType"


    // $ANTLR start "ruleCollectionType"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4885:1: ruleCollectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'set' ) | (enumLiteral_1= 'bag' ) | (enumLiteral_2= 'list' ) | (enumLiteral_3= 'graph' ) | (enumLiteral_4= 'single' ) ) ;
    public final Enumerator ruleCollectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4887:28: ( ( (enumLiteral_0= 'set' ) | (enumLiteral_1= 'bag' ) | (enumLiteral_2= 'list' ) | (enumLiteral_3= 'graph' ) | (enumLiteral_4= 'single' ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4888:1: ( (enumLiteral_0= 'set' ) | (enumLiteral_1= 'bag' ) | (enumLiteral_2= 'list' ) | (enumLiteral_3= 'graph' ) | (enumLiteral_4= 'single' ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4888:1: ( (enumLiteral_0= 'set' ) | (enumLiteral_1= 'bag' ) | (enumLiteral_2= 'list' ) | (enumLiteral_3= 'graph' ) | (enumLiteral_4= 'single' ) )
            int alt68=5;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt68=1;
                }
                break;
            case 91:
                {
                alt68=2;
                }
                break;
            case 92:
                {
                alt68=3;
                }
                break;
            case 93:
                {
                alt68=4;
                }
                break;
            case 94:
                {
                alt68=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4888:2: (enumLiteral_0= 'set' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4888:2: (enumLiteral_0= 'set' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4888:4: enumLiteral_0= 'set'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_90_in_ruleCollectionType11673); 

                            current = grammarAccess.getCollectionTypeAccess().getSetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCollectionTypeAccess().getSetEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4894:6: (enumLiteral_1= 'bag' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4894:6: (enumLiteral_1= 'bag' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4894:8: enumLiteral_1= 'bag'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_91_in_ruleCollectionType11690); 

                            current = grammarAccess.getCollectionTypeAccess().getBagEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCollectionTypeAccess().getBagEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4900:6: (enumLiteral_2= 'list' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4900:6: (enumLiteral_2= 'list' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4900:8: enumLiteral_2= 'list'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_92_in_ruleCollectionType11707); 

                            current = grammarAccess.getCollectionTypeAccess().getListEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCollectionTypeAccess().getListEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4906:6: (enumLiteral_3= 'graph' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4906:6: (enumLiteral_3= 'graph' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4906:8: enumLiteral_3= 'graph'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_93_in_ruleCollectionType11724); 

                            current = grammarAccess.getCollectionTypeAccess().getGraphEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCollectionTypeAccess().getGraphEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4912:6: (enumLiteral_4= 'single' )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4912:6: (enumLiteral_4= 'single' )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:4912:8: enumLiteral_4= 'single'
                    {
                    enumLiteral_4=(Token)match(input,94,FOLLOW_94_in_ruleCollectionType11741); 

                            current = grammarAccess.getCollectionTypeAccess().getSingleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCollectionTypeAccess().getSingleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionType"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\12\uffff";
    static final String DFA21_eofS =
        "\1\uffff\1\2\3\uffff\1\11\1\uffff\2\11\1\uffff";
    static final String DFA21_minS =
        "\1\6\1\4\1\uffff\1\6\1\uffff\1\4\1\uffff\2\4\1\uffff";
    static final String DFA21_maxS =
        "\1\40\1\116\1\uffff\1\6\1\uffff\1\116\1\uffff\2\116\1\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\1\uffff\1\4\1\uffff\1\3\2\uffff\1\2";
    static final String DFA21_specialS =
        "\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\3\2\20\uffff\1\3\4\uffff\2\4",
            "\1\2\20\uffff\3\2\1\uffff\1\2\1\5\2\6\2\2\2\4\3\uffff\3\2\1"+
            "\uffff\2\2\1\uffff\1\2\1\uffff\5\2\2\uffff\2\2\2\uffff\3\2\1"+
            "\uffff\2\2\1\uffff\3\2\1\uffff\2\2\1\uffff\11\2",
            "",
            "\1\7",
            "",
            "\1\11\1\uffff\1\10\16\uffff\3\11\1\uffff\1\11\1\uffff\2\6\2"+
            "\11\2\4\3\uffff\3\11\1\uffff\2\11\1\uffff\1\11\1\uffff\5\11"+
            "\2\uffff\2\11\2\uffff\3\11\1\uffff\2\11\1\uffff\3\11\1\uffff"+
            "\2\11\1\uffff\11\11",
            "",
            "\1\11\20\uffff\3\11\1\uffff\1\11\1\uffff\2\6\2\11\2\4\3\uffff"+
            "\3\11\1\uffff\2\11\1\uffff\1\11\1\uffff\5\11\2\uffff\2\11\2"+
            "\uffff\3\11\1\uffff\2\11\1\uffff\3\11\1\uffff\2\11\1\uffff\11"+
            "\11",
            "\1\11\20\uffff\3\11\1\uffff\1\11\1\uffff\2\6\2\11\2\4\3\uffff"+
            "\3\11\1\uffff\2\11\1\uffff\1\11\1\uffff\5\11\2\uffff\2\11\2"+
            "\uffff\3\11\1\uffff\2\11\1\uffff\3\11\1\uffff\2\11\1\uffff\11"+
            "\11",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1384:1: (this_Integer_0= ruleInteger | this_Float_1= ruleFloat | this_SNotation_2= ruleSNotation | this_Imaginary_3= ruleImaginary )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModule132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule149 = new BitSet(new long[]{0xB303E900003F8012L,0x0000000000000003L});
    public static final BitSet FOLLOW_15_in_ruleModule169 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleModule190 = new BitSet(new long[]{0xB303E900003F0012L,0x0000000000000003L});
    public static final BitSet FOLLOW_16_in_ruleModule205 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleModule226 = new BitSet(new long[]{0xB303E900003E0012L,0x0000000000000003L});
    public static final BitSet FOLLOW_17_in_ruleModule241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModule258 = new BitSet(new long[]{0xB303E900003C0012L,0x0000000000000003L});
    public static final BitSet FOLLOW_18_in_ruleModule278 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModule295 = new BitSet(new long[]{0xB303E90000380012L,0x0000000000000003L});
    public static final BitSet FOLLOW_19_in_ruleModule315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModule332 = new BitSet(new long[]{0xB303E90000300012L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule360 = new BitSet(new long[]{0xB303E90000300012L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleModule382 = new BitSet(new long[]{0xB303E90000200012L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleImport466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulti_in_ruleSentence581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleSentence608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBox_in_ruleSentence635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleSentence662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShape_in_ruleSentence689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAlias_in_ruleSentence716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleSentence743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_ruleSentence770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCanvas_in_ruleSentence797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSentence824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoop_in_ruleSentence851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokation_in_ruleNode943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactory_in_ruleNode970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_ruleNode997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleNode1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_ruleNode1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSwitch1133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitch1150 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSwitch1176 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSwitch1188 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSwitch1209 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSwitch1221 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSwitch1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionBin_in_ruleLiteralExpression1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionBin_in_entryRuleLiteralExpressionBin1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpressionBin1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionComp_in_ruleLiteralExpressionBin1425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleBinOp_in_ruleLiteralExpressionBin1455 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpressionBin_in_ruleLiteralExpressionBin1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionComp_in_entryRuleLiteralExpressionComp1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpressionComp1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionAdd_in_ruleLiteralExpressionComp1571 = new BitSet(new long[]{0x0030000000000002L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleCompOp_in_ruleLiteralExpressionComp1601 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpressionComp_in_ruleLiteralExpressionComp1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionAdd_in_entryRuleLiteralExpressionAdd1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpressionAdd1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionMulti_in_ruleLiteralExpressionAdd1717 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleAddOp_in_ruleLiteralExpressionAdd1747 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpressionAdd_in_ruleLiteralExpressionAdd1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionMulti_in_entryRuleLiteralExpressionMulti1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpressionMulti1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionExp_in_ruleLiteralExpressionMulti1863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleMultiOp_in_ruleLiteralExpressionMulti1893 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpressionMulti_in_ruleLiteralExpressionMulti1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionExp_in_entryRuleLiteralExpressionExp1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpressionExp1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionSigned_in_ruleLiteralExpressionExp2009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleExpOp_in_ruleLiteralExpressionExp2039 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpressionExp_in_ruleLiteralExpressionExp2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionSigned_in_entryRuleLiteralExpressionSigned2098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpressionSigned2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddOp_in_ruleLiteralExpressionSigned2166 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNegationOp_in_ruleLiteralExpressionSigned2185 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpressionTerminal_in_ruleLiteralExpressionSigned2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionTerminal_in_ruleLiteralExpressionSigned2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpressionTerminal_in_entryRuleLiteralExpressionTerminal2273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpressionTerminal2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLiteralExpressionTerminal2321 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleLiteralExpressionTerminal2343 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLiteralExpressionTerminal2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRValue_in_ruleLiteralExpressionTerminal2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRValue_in_entryRuleRValue2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRValue2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleLiteral_in_ruleRValue2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceLiteral_in_ruleRValue2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_ruleRValue2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleRValue2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantRef_in_ruleRValue2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantRef_in_entryRuleConstantRef2622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantRef2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantRef2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleLiteral_in_entryRuleSingleLiteral2711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleLiteral2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleLiteralDT_in_ruleSingleLiteral2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleLiteralDT_in_entryRuleSingleLiteralDT2802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleLiteralDT2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleSingleLiteralDT2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleSingleLiteralDT2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleSingleLiteralDT2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleNumberLiteral3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleNumberLiteral3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSNotation_in_ruleNumberLiteral3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImaginary_in_ruleNumberLiteral3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger3270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_in_ruleInteger3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleInteger3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIN_in_ruleInteger3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat3445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat3497 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFloat3515 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFloat3559 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSNotation_in_entryRuleSNotation3621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSNotation3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSNotation3673 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleSNotation3706 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleExpConstant_in_ruleSNotation3734 = new BitSet(new long[]{0x0000000060000040L});
    public static final BitSet FOLLOW_ruleSign_in_ruleSNotation3762 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSNotation3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpConstant_in_entryRuleExpConstant3830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpConstant3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExpConstant3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleExpConstant3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_entryRuleSign3939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSign3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSign3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSign4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImaginary_in_entryRuleImaginary4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImaginary4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleImaginary4100 = new BitSet(new long[]{0x00000001840003C0L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleImaginary4133 = new BitSet(new long[]{0x00000001840003C0L});
    public static final BitSet FOLLOW_ruleImaginaryConstant_in_ruleImaginary4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImaginaryConstant_in_entryRuleImaginaryConstant4208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImaginaryConstant4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleImaginaryConstant4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleImaginaryConstant4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral4317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBoolLiteral4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBoolLiteral4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceLiteral_in_entryRuleSequenceLiteral4425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceLiteral4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceLiteralPlain_in_ruleSequenceLiteral4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceLiteralSerie_in_ruleSequenceLiteral4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceLiteralSerie_in_entryRuleSequenceLiteralSerie4544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceLiteralSerie4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSequenceLiteralSerie4591 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralSerie4612 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSequenceLiteralSerie4624 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralSerie4645 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_ruleSequenceLiteralSerie4658 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralSerie4679 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSequenceLiteralSerie4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceLiteralPlain_in_entryRuleSequenceLiteralPlain4729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceLiteralPlain4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSequenceLiteralPlain4785 = new BitSet(new long[]{0x000001CFE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralPlain4807 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_ruleSequenceLiteralPlain4820 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSequenceLiteralPlain4841 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_38_in_ruleSequenceLiteralPlain4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteral_in_entryRuleTupleLiteral4893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteral4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTupleLiteral4949 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleTupleItem_in_ruleTupleLiteral4971 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_37_in_ruleTupleLiteral4984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTupleItem_in_ruleTupleLiteral5005 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_25_in_ruleTupleLiteral5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleItem_in_entryRuleTupleItem5057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleItem5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTupleItem5109 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTupleItem5126 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleTupleItem5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral5183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSetLiteral5239 = new BitSet(new long[]{0x0000038FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSetLiteral5261 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_ruleSetLiteral5274 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleSetLiteral5295 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_ruleSetLiteral5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock5347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBlock5403 = new BitSet(new long[]{0xB303EF0000200010L,0x0000000000000003L});
    public static final BitSet FOLLOW_42_in_ruleBlock5416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBlock5433 = new BitSet(new long[]{0xB303EB0000200010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleBlock5461 = new BitSet(new long[]{0xB303EB0000200010L,0x0000000000000003L});
    public static final BitSet FOLLOW_41_in_ruleBlock5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoop_in_entryRuleNoop5510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoop5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNoop5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair5621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePair5673 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePair5690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePair5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant5748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleConstant5795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant5812 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleConstant5838 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleConstant5850 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleConstant5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulti_in_entryRuleMulti5907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulti5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMulti5954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMulti5971 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleMulti5988 = new BitSet(new long[]{0x0000000000000040L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleMultiOp_in_ruleMulti6009 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMulti6027 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMulti6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit6089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDUnit_in_ruleUnit6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUnit_in_ruleUnit6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDUnit_in_entryRuleDUnit6208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDUnit6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDUnit6255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDUnit6272 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDUnit6289 = new BitSet(new long[]{0x0000000000000040L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleMultiOp_in_ruleDUnit6310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDUnit6328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDUnit6353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDUnit6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUnit_in_entryRuleNUnit6410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUnit6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNUnit6457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNUnit6474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleNumberType_in_ruleNUnit6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBox_in_entryRuleBox6536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBox6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBox6583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBox6600 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleBox6617 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleBox6638 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleBox6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShape_in_entryRuleShape6687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShape6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleShape6734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleShape6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember6792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember6844 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleMember6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef6906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainTypeRef_in_ruleTypeRef6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeTypeRef_in_ruleTypeRef6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainTypeRef_in_entryRulePlainTypeRef7025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainTypeRef7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeRef_in_rulePlainTypeRef7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutoTypeRef_in_rulePlainTypeRef7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTypeRef_in_rulePlainTypeRef7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualTypeRef_in_rulePlainTypeRef7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuxTypeRef_in_rulePlainTypeRef7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAliasRef_in_rulePlainTypeRef7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShapeRef_in_rulePlainTypeRef7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxRef_in_rulePlainTypeRef7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitRef_in_rulePlainTypeRef7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionRef_in_rulePlainTypeRef7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeTypeRef_in_entryRuleCompositeTypeRef7360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeTypeRef7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceTypeRef_in_ruleCompositeTypeRef7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleTypeRef_in_ruleCompositeTypeRef7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetTypeRef_in_ruleCompositeTypeRef7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceTypeRef_in_entryRuleSequenceTypeRef7506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceTypeRef7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSequenceTypeRef7562 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleSequenceTypeRef7583 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSequenceTypeRef7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleTypeRef_in_entryRuleTupleTypeRef7631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeRef7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTupleTypeRef7687 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleTupleTypeRefItem_in_ruleTupleTypeRef7709 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_37_in_ruleTupleTypeRef7722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTupleTypeRefItem_in_ruleTupleTypeRef7743 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_25_in_ruleTupleTypeRef7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleTypeRefItem_in_entryRuleTupleTypeRefItem7795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeRefItem7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTupleTypeRefItem7847 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTupleTypeRefItem7864 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTupleTypeRefItem7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetTypeRef_in_entryRuleSetTypeRef7921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetTypeRef7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSetTypeRef7977 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleSetTypeRef7998 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSetTypeRef8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidTypeRef_in_entryRuleVoidTypeRef8046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidTypeRef8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVoidTypeRef8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutoTypeRef_in_entryRuleAutoTypeRef8146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutoTypeRef8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAutoTypeRef8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionRef_in_entryRuleCollectionRef8238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionRef8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleCollectionRef8294 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleCollectionRef8306 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleCollectionRef8327 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleCollectionRef8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitRef_in_entryRuleUnitRef8375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitRef8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleUnitRef8422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnitRef8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxRef_in_entryRuleBoxRef8478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxRef8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBoxRef8525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoxRef8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAliasRef_in_entryRuleTypeAliasRef8581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAliasRef8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeAliasRef8635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuxTypeRef_in_entryRuleAuxTypeRef8670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuxTypeRef8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuxType_in_ruleAuxTypeRef8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShapeRef_in_entryRuleShapeRef8760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShapeRef8770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleShapeRef8807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleShapeRef8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTypeRef_in_entryRuleNumberTypeRef8863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTypeRef8873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_ruleNumberTypeRef8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualTypeRef_in_entryRuleVisualTypeRef8953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualTypeRef8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualType_in_ruleVisualTypeRef9008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAlias_in_entryRuleTypeAlias9043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAlias9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTypeAlias9090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeAlias9107 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeAlias9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_entryRuleStream9169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleStream9222 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_ruleLStreamValue_in_ruleStream9257 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleStream9269 = new BitSet(new long[]{0x0800018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRStreamValue_in_ruleStream9290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLStreamValue_in_entryRuleLStreamValue9326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLStreamValue9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputRef_in_ruleLStreamValue9382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRStreamValue_in_entryRuleRStreamValue9416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRStreamValue9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputRef_in_ruleRStreamValue9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleRStreamValue9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputRef_in_entryRuleInputRef9535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputRef9545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleInputRef9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputRef_in_entryRuleOutputRef9627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputRef9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOutputRef9683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokation_in_entryRuleInvokation9719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokation9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvokation9771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvokation9793 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleInvokation9810 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_ruleInvokationParam_in_ruleInvokation9831 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleInvokation9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokationParam_in_entryRuleInvokationParam9880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokationParam9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvokationParam9932 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleInvokationParam9949 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleInvokationParam9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop10006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLoop10053 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_ruleLoopFor_in_ruleLoop10074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoop10092 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleLoop10109 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_ruleLoopSentence_in_ruleLoop10130 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleLoop10143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopSentence_in_entryRuleLoopSentence10179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopSentence10189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoopSentence10231 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleLoopSentence10257 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleLoopSentence10269 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleLoopSentence10290 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLoopSentence10303 = new BitSet(new long[]{0x0000018FE50003F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleLoopSentence10324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFor_in_entryRuleLoopFor10362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopFor10372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLoopFor10409 = new BitSet(new long[]{0x0000008800000000L});
    public static final BitSet FOLLOW_ruleSequenceLiteral_in_ruleLoopFor10431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactory_in_entryRuleFactory10466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactory10476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleFactory10513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFactory10530 = new BitSet(new long[]{0x00CE019001000010L,0x000000007FFF8000L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFactory10556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile10592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile10602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleFile10639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFile10656 = new BitSet(new long[]{0x0400001000000000L});
    public static final BitSet FOLLOW_58_in_ruleFile10680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36_in_ruleFile10711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFile10729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCanvas_in_entryRuleCanvas10770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCanvas10780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCanvas10817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCanvas10834 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCanvas10851 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_rulePair_in_ruleCanvas10873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleCanvas10885 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleCanvas10899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBinOp10949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBinOp10966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleNegationOp11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCompOp11054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCompOp11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCompOp11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCompOp11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCompOp11122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCompOp11139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAddOp11184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAddOp11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleMultiOp11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleMultiOp11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleMultiOp11280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleMultiOp11297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleExpOp11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleNumberType11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleNumberType11402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleNumberType11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleNumberType11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVisualType11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleVisualType11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleVisualType11515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleVisualType11532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleVisualType11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleVisualType11566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAuxType11611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAuxType11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleCollectionType11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCollectionType11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCollectionType11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCollectionType11724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCollectionType11741 = new BitSet(new long[]{0x0000000000000002L});

}