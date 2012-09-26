package com.visualligence.g.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'types'", "'input'", "'output'", "'type'", "'{'", "','", "'}'", "':'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:67:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:68:2: (iv_ruleModule= ruleModule EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:69:2: iv_ruleModule= ruleModule EOF
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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:76:1: ruleModule returns [EObject current=null] : ( () (otherlv_1= 'types' ( (lv_types_2_0= ruleTypeDecl ) ) )* (otherlv_3= 'input' ( (lv_input_4_0= ruleInput ) ) )* (otherlv_5= 'output' ( (lv_output_6_0= ruleOutput ) ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_input_4_0 = null;

        EObject lv_output_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:79:28: ( ( () (otherlv_1= 'types' ( (lv_types_2_0= ruleTypeDecl ) ) )* (otherlv_3= 'input' ( (lv_input_4_0= ruleInput ) ) )* (otherlv_5= 'output' ( (lv_output_6_0= ruleOutput ) ) )* ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:1: ( () (otherlv_1= 'types' ( (lv_types_2_0= ruleTypeDecl ) ) )* (otherlv_3= 'input' ( (lv_input_4_0= ruleInput ) ) )* (otherlv_5= 'output' ( (lv_output_6_0= ruleOutput ) ) )* )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:1: ( () (otherlv_1= 'types' ( (lv_types_2_0= ruleTypeDecl ) ) )* (otherlv_3= 'input' ( (lv_input_4_0= ruleInput ) ) )* (otherlv_5= 'output' ( (lv_output_6_0= ruleOutput ) ) )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:2: () (otherlv_1= 'types' ( (lv_types_2_0= ruleTypeDecl ) ) )* (otherlv_3= 'input' ( (lv_input_4_0= ruleInput ) ) )* (otherlv_5= 'output' ( (lv_output_6_0= ruleOutput ) ) )*
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:86:2: (otherlv_1= 'types' ( (lv_types_2_0= ruleTypeDecl ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:86:4: otherlv_1= 'types' ( (lv_types_2_0= ruleTypeDecl ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModule132); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getTypesKeyword_1_0());
            	        
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:90:1: ( (lv_types_2_0= ruleTypeDecl ) )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:91:1: (lv_types_2_0= ruleTypeDecl )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:91:1: (lv_types_2_0= ruleTypeDecl )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:92:3: lv_types_2_0= ruleTypeDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getTypesTypeDeclParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeDecl_in_ruleModule153);
            	    lv_types_2_0=ruleTypeDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_2_0, 
            	            		"TypeDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:108:4: (otherlv_3= 'input' ( (lv_input_4_0= ruleInput ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:108:6: otherlv_3= 'input' ( (lv_input_4_0= ruleInput ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModule168); 

            	        	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getInputKeyword_2_0());
            	        
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:112:1: ( (lv_input_4_0= ruleInput ) )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:113:1: (lv_input_4_0= ruleInput )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:113:1: (lv_input_4_0= ruleInput )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:114:3: lv_input_4_0= ruleInput
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getInputInputParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInput_in_ruleModule189);
            	    lv_input_4_0=ruleInput();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"input",
            	            		lv_input_4_0, 
            	            		"Input");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:130:4: (otherlv_5= 'output' ( (lv_output_6_0= ruleOutput ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:130:6: otherlv_5= 'output' ( (lv_output_6_0= ruleOutput ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleModule204); 

            	        	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getOutputKeyword_3_0());
            	        
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:134:1: ( (lv_output_6_0= ruleOutput ) )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:135:1: (lv_output_6_0= ruleOutput )
            	    {
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:135:1: (lv_output_6_0= ruleOutput )
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:136:3: lv_output_6_0= ruleOutput
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getOutputOutputParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutput_in_ruleModule225);
            	    lv_output_6_0=ruleOutput();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"output",
            	            		lv_output_6_0, 
            	            		"Output");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleTypeDecl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:160:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:161:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:162:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl263);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl273); 

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
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:169:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' this_Hash_1= ruleHash ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject this_Hash_1 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:172:28: ( (otherlv_0= 'type' this_Hash_1= ruleHash ( (lv_name_2_0= RULE_STRING ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:173:1: (otherlv_0= 'type' this_Hash_1= ruleHash ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:173:1: (otherlv_0= 'type' this_Hash_1= ruleHash ( (lv_name_2_0= RULE_STRING ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:173:3: otherlv_0= 'type' this_Hash_1= ruleHash ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTypeDecl310); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getTypeDeclAccess().getHashParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleHash_in_ruleTypeDecl332);
            this_Hash_1=ruleHash();

            state._fsp--;

             
                    current = this_Hash_1; 
                    afterParserOrEnumRuleCall();
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:186:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:187:1: (lv_name_2_0= RULE_STRING )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:187:1: (lv_name_2_0= RULE_STRING )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:188:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeDecl348); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTypeDeclAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleHash"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:212:1: entryRuleHash returns [EObject current=null] : iv_ruleHash= ruleHash EOF ;
    public final EObject entryRuleHash() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHash = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:213:2: (iv_ruleHash= ruleHash EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:214:2: iv_ruleHash= ruleHash EOF
            {
             newCompositeNode(grammarAccess.getHashRule()); 
            pushFollow(FOLLOW_ruleHash_in_entryRuleHash389);
            iv_ruleHash=ruleHash();

            state._fsp--;

             current =iv_ruleHash; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHash399); 

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
    // $ANTLR end "entryRuleHash"


    // $ANTLR start "ruleHash"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:221:1: ruleHash returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_items_2_0= ruleHashItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleHash() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:224:28: ( ( () otherlv_1= '{' ( ( (lv_items_2_0= ruleHashItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) ) )* )? otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:225:1: ( () otherlv_1= '{' ( ( (lv_items_2_0= ruleHashItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) ) )* )? otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:225:1: ( () otherlv_1= '{' ( ( (lv_items_2_0= ruleHashItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) ) )* )? otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:225:2: () otherlv_1= '{' ( ( (lv_items_2_0= ruleHashItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) ) )* )? otherlv_5= '}'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:225:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHashAccess().getHashAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleHash445); 

                	newLeafNode(otherlv_1, grammarAccess.getHashAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:235:1: ( ( (lv_items_2_0= ruleHashItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:235:2: ( (lv_items_2_0= ruleHashItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) ) )*
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:235:2: ( (lv_items_2_0= ruleHashItem ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:236:1: (lv_items_2_0= ruleHashItem )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:236:1: (lv_items_2_0= ruleHashItem )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:237:3: lv_items_2_0= ruleHashItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getHashAccess().getItemsHashItemParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHashItem_in_ruleHash467);
                    lv_items_2_0=ruleHashItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHashRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_2_0, 
                            		"HashItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:253:2: (otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:253:4: otherlv_3= ',' ( (lv_items_4_0= ruleHashItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleHash480); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getHashAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:257:1: ( (lv_items_4_0= ruleHashItem ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:258:1: (lv_items_4_0= ruleHashItem )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:258:1: (lv_items_4_0= ruleHashItem )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:259:3: lv_items_4_0= ruleHashItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHashAccess().getItemsHashItemParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleHashItem_in_ruleHash501);
                    	    lv_items_4_0=ruleHashItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHashRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_4_0, 
                    	            		"HashItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleHash517); 

                	newLeafNode(otherlv_5, grammarAccess.getHashAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleHash"


    // $ANTLR start "entryRuleHashItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:287:1: entryRuleHashItem returns [EObject current=null] : iv_ruleHashItem= ruleHashItem EOF ;
    public final EObject entryRuleHashItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashItem = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:288:2: (iv_ruleHashItem= ruleHashItem EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:289:2: iv_ruleHashItem= ruleHashItem EOF
            {
             newCompositeNode(grammarAccess.getHashItemRule()); 
            pushFollow(FOLLOW_ruleHashItem_in_entryRuleHashItem553);
            iv_ruleHashItem=ruleHashItem();

            state._fsp--;

             current =iv_ruleHashItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashItem563); 

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
    // $ANTLR end "entryRuleHashItem"


    // $ANTLR start "ruleHashItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:296:1: ruleHashItem returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleHashItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:299:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:300:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:300:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:300:2: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:300:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHashItemAccess().getHashItemAction_0(),
                        current);
                

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:306:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:307:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:307:1: (lv_name_1_0= RULE_STRING )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:308:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHashItem614); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHashItemAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHashItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleHashItem631); 

                	newLeafNode(otherlv_2, grammarAccess.getHashItemAccess().getColonKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:328:1: ( (otherlv_3= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:329:1: (otherlv_3= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:329:1: (otherlv_3= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:330:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getHashItemRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHashItem651); 

            		newLeafNode(otherlv_3, grammarAccess.getHashItemAccess().getTypeTypeDeclCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleHashItem"


    // $ANTLR start "entryRuleInput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:349:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:350:2: (iv_ruleInput= ruleInput EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:351:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput687);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput697); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:358:1: ruleInput returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:361:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:362:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:362:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:362:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:362:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:363:1: (lv_name_0_0= RULE_STRING )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:363:1: (lv_name_0_0= RULE_STRING )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:364:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput739); 

            			newLeafNode(lv_name_0_0, grammarAccess.getInputAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleInput756); 

                	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getColonKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:384:1: ( (otherlv_2= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:385:1: (otherlv_2= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:385:1: (otherlv_2= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:386:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInputRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInput776); 

            		newLeafNode(otherlv_2, grammarAccess.getInputAccess().getTypeTypeDeclCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:405:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:406:2: (iv_ruleOutput= ruleOutput EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:407:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput812);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput822); 

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:414:1: ruleOutput returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:417:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:418:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:418:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:418:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:418:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:419:1: (lv_name_0_0= RULE_STRING )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:419:1: (lv_name_0_0= RULE_STRING )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:420:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOutput864); 

            			newLeafNode(lv_name_0_0, grammarAccess.getOutputAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleOutput881); 

                	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getColonKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:440:1: ( (otherlv_2= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:441:1: (otherlv_2= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:441:1: (otherlv_2= RULE_ID )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:442:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutput901); 

            		newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getTypeTypeDeclCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleOutput"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModule132 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleModule153 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_12_in_ruleModule168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInput_in_ruleModule189 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleModule204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleModule225 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTypeDecl310 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleHash_in_ruleTypeDecl332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeDecl348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHash_in_entryRuleHash389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHash399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleHash445 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleHashItem_in_ruleHash467 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleHash480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleHashItem_in_ruleHash501 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleHash517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashItem_in_entryRuleHashItem553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashItem563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHashItem614 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHashItem631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHashItem651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput739 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInput756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInput776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOutput864 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOutput881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutput901 = new BitSet(new long[]{0x0000000000000002L});

}