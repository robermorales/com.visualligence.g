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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Module'", "'{'", "'input'", "','", "'}'", "'output'", "'instances'", "'types'", "'Input'", "'type'", "'Output'", "'left'", "'ModuleInstances'", "'desc'", "'Stream'", "'Literal'", "'value'", "'NativeType'", "'List'", "'Hash'", "'items'", "'NativeTypeOptions'", "'HashItem'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:76:1: ruleModule returns [EObject current=null] : ( () otherlv_1= 'Module' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleInput ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleOutput ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) ) )* otherlv_15= '}' )? (otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleModuleInstances ) ) (otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) ) )* otherlv_21= '}' )? (otherlv_22= 'types' otherlv_23= '{' ( (lv_types_24_0= ruleTypeDecl ) ) (otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_input_6_0 = null;

        EObject lv_input_8_0 = null;

        EObject lv_output_12_0 = null;

        EObject lv_output_14_0 = null;

        EObject lv_instances_18_0 = null;

        EObject lv_instances_20_0 = null;

        EObject lv_types_24_0 = null;

        EObject lv_types_26_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:79:28: ( ( () otherlv_1= 'Module' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleInput ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleOutput ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) ) )* otherlv_15= '}' )? (otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleModuleInstances ) ) (otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) ) )* otherlv_21= '}' )? (otherlv_22= 'types' otherlv_23= '{' ( (lv_types_24_0= ruleTypeDecl ) ) (otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:1: ( () otherlv_1= 'Module' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleInput ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleOutput ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) ) )* otherlv_15= '}' )? (otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleModuleInstances ) ) (otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) ) )* otherlv_21= '}' )? (otherlv_22= 'types' otherlv_23= '{' ( (lv_types_24_0= ruleTypeDecl ) ) (otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:1: ( () otherlv_1= 'Module' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleInput ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleOutput ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) ) )* otherlv_15= '}' )? (otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleModuleInstances ) ) (otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) ) )* otherlv_21= '}' )? (otherlv_22= 'types' otherlv_23= '{' ( (lv_types_24_0= ruleTypeDecl ) ) (otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:2: () otherlv_1= 'Module' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleInput ) ) )* otherlv_9= '}' )? (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleOutput ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) ) )* otherlv_15= '}' )? (otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleModuleInstances ) ) (otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) ) )* otherlv_21= '}' )? (otherlv_22= 'types' otherlv_23= '{' ( (lv_types_24_0= ruleTypeDecl ) ) (otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:80:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModule131); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:91:1: (lv_name_2_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModuleAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleModule152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModule164); 

                	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:112:1: (otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleInput ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:112:3: otherlv_4= 'input' otherlv_5= '{' ( (lv_input_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_input_8_0= ruleInput ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModule177); 

                        	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getInputKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleModule189); 

                        	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:120:1: ( (lv_input_6_0= ruleInput ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:121:1: (lv_input_6_0= ruleInput )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:121:1: (lv_input_6_0= ruleInput )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:122:3: lv_input_6_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getInputInputParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInput_in_ruleModule210);
                    lv_input_6_0=ruleInput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		add(
                           			current, 
                           			"input",
                            		lv_input_6_0, 
                            		"Input");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:138:2: (otherlv_7= ',' ( (lv_input_8_0= ruleInput ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:138:4: otherlv_7= ',' ( (lv_input_8_0= ruleInput ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleModule223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:142:1: ( (lv_input_8_0= ruleInput ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:143:1: (lv_input_8_0= ruleInput )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:143:1: (lv_input_8_0= ruleInput )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:144:3: lv_input_8_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getInputInputParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInput_in_ruleModule244);
                    	    lv_input_8_0=ruleInput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"input",
                    	            		lv_input_8_0, 
                    	            		"Input");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleModule258); 

                        	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:164:3: (otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleOutput ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:164:5: otherlv_10= 'output' otherlv_11= '{' ( (lv_output_12_0= ruleOutput ) ) (otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleModule273); 

                        	newLeafNode(otherlv_10, grammarAccess.getModuleAccess().getOutputKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FOLLOW_12_in_ruleModule285); 

                        	newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:172:1: ( (lv_output_12_0= ruleOutput ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:173:1: (lv_output_12_0= ruleOutput )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:173:1: (lv_output_12_0= ruleOutput )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:174:3: lv_output_12_0= ruleOutput
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getOutputOutputParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutput_in_ruleModule306);
                    lv_output_12_0=ruleOutput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		add(
                           			current, 
                           			"output",
                            		lv_output_12_0, 
                            		"Output");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:190:2: (otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:190:4: otherlv_13= ',' ( (lv_output_14_0= ruleOutput ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleModule319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getModuleAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:194:1: ( (lv_output_14_0= ruleOutput ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:195:1: (lv_output_14_0= ruleOutput )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:195:1: (lv_output_14_0= ruleOutput )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:196:3: lv_output_14_0= ruleOutput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getOutputOutputParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOutput_in_ruleModule340);
                    	    lv_output_14_0=ruleOutput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"output",
                    	            		lv_output_14_0, 
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

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleModule354); 

                        	newLeafNode(otherlv_15, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:216:3: (otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleModuleInstances ) ) (otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:216:5: otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleModuleInstances ) ) (otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleModule369); 

                        	newLeafNode(otherlv_16, grammarAccess.getModuleAccess().getInstancesKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FOLLOW_12_in_ruleModule381); 

                        	newLeafNode(otherlv_17, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:224:1: ( (lv_instances_18_0= ruleModuleInstances ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:225:1: (lv_instances_18_0= ruleModuleInstances )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:225:1: (lv_instances_18_0= ruleModuleInstances )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:226:3: lv_instances_18_0= ruleModuleInstances
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getInstancesModuleInstancesParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModuleInstances_in_ruleModule402);
                    lv_instances_18_0=ruleModuleInstances();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		add(
                           			current, 
                           			"instances",
                            		lv_instances_18_0, 
                            		"ModuleInstances");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:242:2: (otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:242:4: otherlv_19= ',' ( (lv_instances_20_0= ruleModuleInstances ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_14_in_ruleModule415); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getModuleAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:246:1: ( (lv_instances_20_0= ruleModuleInstances ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:247:1: (lv_instances_20_0= ruleModuleInstances )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:247:1: (lv_instances_20_0= ruleModuleInstances )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:248:3: lv_instances_20_0= ruleModuleInstances
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getInstancesModuleInstancesParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModuleInstances_in_ruleModule436);
                    	    lv_instances_20_0=ruleModuleInstances();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instances",
                    	            		lv_instances_20_0, 
                    	            		"ModuleInstances");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleModule450); 

                        	newLeafNode(otherlv_21, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:268:3: (otherlv_22= 'types' otherlv_23= '{' ( (lv_types_24_0= ruleTypeDecl ) ) (otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) ) )* otherlv_27= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:268:5: otherlv_22= 'types' otherlv_23= '{' ( (lv_types_24_0= ruleTypeDecl ) ) (otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,18,FOLLOW_18_in_ruleModule465); 

                        	newLeafNode(otherlv_22, grammarAccess.getModuleAccess().getTypesKeyword_7_0());
                        
                    otherlv_23=(Token)match(input,12,FOLLOW_12_in_ruleModule477); 

                        	newLeafNode(otherlv_23, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:276:1: ( (lv_types_24_0= ruleTypeDecl ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:277:1: (lv_types_24_0= ruleTypeDecl )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:277:1: (lv_types_24_0= ruleTypeDecl )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:278:3: lv_types_24_0= ruleTypeDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getTypesTypeDeclParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeDecl_in_ruleModule498);
                    lv_types_24_0=ruleTypeDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_24_0, 
                            		"TypeDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:294:2: (otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:294:4: otherlv_25= ',' ( (lv_types_26_0= ruleTypeDecl ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleModule511); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getModuleAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:298:1: ( (lv_types_26_0= ruleTypeDecl ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:299:1: (lv_types_26_0= ruleTypeDecl )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:299:1: (lv_types_26_0= ruleTypeDecl )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:300:3: lv_types_26_0= ruleTypeDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getTypesTypeDeclParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeDecl_in_ruleModule532);
                    	    lv_types_26_0=ruleTypeDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_26_0, 
                    	            		"TypeDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleModule546); 

                        	newLeafNode(otherlv_27, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleModule560); 

                	newLeafNode(otherlv_28, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:332:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:333:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:334:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl596);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl606); 

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:341:1: ruleTypeDecl returns [EObject current=null] : (this_NativeType_0= ruleNativeType | this_List_1= ruleList | this_Hash_2= ruleHash ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject this_NativeType_0 = null;

        EObject this_List_1 = null;

        EObject this_Hash_2 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:344:28: ( (this_NativeType_0= ruleNativeType | this_List_1= ruleList | this_Hash_2= ruleHash ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:345:1: (this_NativeType_0= ruleNativeType | this_List_1= ruleList | this_Hash_2= ruleHash )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:345:1: (this_NativeType_0= ruleNativeType | this_List_1= ruleList | this_Hash_2= ruleHash )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:346:5: this_NativeType_0= ruleNativeType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDeclAccess().getNativeTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNativeType_in_ruleTypeDecl653);
                    this_NativeType_0=ruleNativeType();

                    state._fsp--;

                     
                            current = this_NativeType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:356:5: this_List_1= ruleList
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDeclAccess().getListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleList_in_ruleTypeDecl680);
                    this_List_1=ruleList();

                    state._fsp--;

                     
                            current = this_List_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:366:5: this_Hash_2= ruleHash
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDeclAccess().getHashParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHash_in_ruleTypeDecl707);
                    this_Hash_2=ruleHash();

                    state._fsp--;

                     
                            current = this_Hash_2; 
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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleStream"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:382:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:383:2: (iv_ruleStream= ruleStream EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:384:2: iv_ruleStream= ruleStream EOF
            {
             newCompositeNode(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_ruleStream_in_entryRuleStream742);
            iv_ruleStream=ruleStream();

            state._fsp--;

             current =iv_ruleStream; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream752); 

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:391:1: ruleStream returns [EObject current=null] : (this_Stream_Impl_0= ruleStream_Impl | this_Literal_1= ruleLiteral | this_Input_2= ruleInput | this_Output_3= ruleOutput ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        EObject this_Stream_Impl_0 = null;

        EObject this_Literal_1 = null;

        EObject this_Input_2 = null;

        EObject this_Output_3 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:394:28: ( (this_Stream_Impl_0= ruleStream_Impl | this_Literal_1= ruleLiteral | this_Input_2= ruleInput | this_Output_3= ruleOutput ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:395:1: (this_Stream_Impl_0= ruleStream_Impl | this_Literal_1= ruleLiteral | this_Input_2= ruleInput | this_Output_3= ruleOutput )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:395:1: (this_Stream_Impl_0= ruleStream_Impl | this_Literal_1= ruleLiteral | this_Input_2= ruleInput | this_Output_3= ruleOutput )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:396:5: this_Stream_Impl_0= ruleStream_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getStreamAccess().getStream_ImplParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStream_Impl_in_ruleStream799);
                    this_Stream_Impl_0=ruleStream_Impl();

                    state._fsp--;

                     
                            current = this_Stream_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:406:5: this_Literal_1= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getStreamAccess().getLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleStream826);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:416:5: this_Input_2= ruleInput
                    {
                     
                            newCompositeNode(grammarAccess.getStreamAccess().getInputParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInput_in_ruleStream853);
                    this_Input_2=ruleInput();

                    state._fsp--;

                     
                            current = this_Input_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:426:5: this_Output_3= ruleOutput
                    {
                     
                            newCompositeNode(grammarAccess.getStreamAccess().getOutputParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOutput_in_ruleStream880);
                    this_Output_3=ruleOutput();

                    state._fsp--;

                     
                            current = this_Output_3; 
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
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleEString"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:442:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:443:2: (iv_ruleEString= ruleEString EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:444:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString916);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString927); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:451:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:454:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:455:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:455:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:455:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString967); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:463:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString993); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleInput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:478:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:479:2: (iv_ruleInput= ruleInput EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:480:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput1038);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput1048); 

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:487:1: ruleInput returns [EObject current=null] : (otherlv_0= 'Input' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:490:28: ( (otherlv_0= 'Input' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:491:1: (otherlv_0= 'Input' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:491:1: (otherlv_0= 'Input' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:491:3: otherlv_0= 'Input' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleInput1085); 

                	newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:495:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:496:1: (lv_name_1_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:496:1: (lv_name_1_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:497:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleInput1106);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInput1118); 

                	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInput1130); 

                	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getTypeKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:521:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:522:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:522:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:523:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInputRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInputAccess().getTypeTypeDeclCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleInput1153);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleInput1165); 

                	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:548:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:549:2: (iv_ruleOutput= ruleOutput EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:550:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput1201);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput1211); 

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:557:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'Output' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) (otherlv_5= 'left' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:560:28: ( (otherlv_0= 'Output' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) (otherlv_5= 'left' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:561:1: (otherlv_0= 'Output' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) (otherlv_5= 'left' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:561:1: (otherlv_0= 'Output' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) (otherlv_5= 'left' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:561:3: otherlv_0= 'Output' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) (otherlv_5= 'left' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleOutput1248); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:565:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:566:1: (lv_name_1_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:566:1: (lv_name_1_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:567:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOutput1269);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOutput1281); 

                	newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOutput1293); 

                	newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getTypeKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:591:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:592:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:592:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:593:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOutputAccess().getTypeTypeDeclCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOutput1316);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:606:2: (otherlv_5= 'left' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:606:4: otherlv_5= 'left' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleOutput1329); 

                        	newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getLeftKeyword_5_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:610:1: ( ( ruleEString ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:611:1: ( ruleEString )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:611:1: ( ruleEString )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:612:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getLeftStreamCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleOutput1352);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleOutput1366); 

                	newLeafNode(otherlv_7, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleModuleInstances"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:637:1: entryRuleModuleInstances returns [EObject current=null] : iv_ruleModuleInstances= ruleModuleInstances EOF ;
    public final EObject entryRuleModuleInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleInstances = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:638:2: (iv_ruleModuleInstances= ruleModuleInstances EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:639:2: iv_ruleModuleInstances= ruleModuleInstances EOF
            {
             newCompositeNode(grammarAccess.getModuleInstancesRule()); 
            pushFollow(FOLLOW_ruleModuleInstances_in_entryRuleModuleInstances1402);
            iv_ruleModuleInstances=ruleModuleInstances();

            state._fsp--;

             current =iv_ruleModuleInstances; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleInstances1412); 

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
    // $ANTLR end "entryRuleModuleInstances"


    // $ANTLR start "ruleModuleInstances"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:646:1: ruleModuleInstances returns [EObject current=null] : (otherlv_0= 'ModuleInstances' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'desc' ( ( ruleEString ) ) (otherlv_5= 'left' otherlv_6= '{' ( (lv_left_7_0= ruleStream ) ) (otherlv_8= ',' ( (lv_left_9_0= ruleStream ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleModuleInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_left_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:649:28: ( (otherlv_0= 'ModuleInstances' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'desc' ( ( ruleEString ) ) (otherlv_5= 'left' otherlv_6= '{' ( (lv_left_7_0= ruleStream ) ) (otherlv_8= ',' ( (lv_left_9_0= ruleStream ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:650:1: (otherlv_0= 'ModuleInstances' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'desc' ( ( ruleEString ) ) (otherlv_5= 'left' otherlv_6= '{' ( (lv_left_7_0= ruleStream ) ) (otherlv_8= ',' ( (lv_left_9_0= ruleStream ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:650:1: (otherlv_0= 'ModuleInstances' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'desc' ( ( ruleEString ) ) (otherlv_5= 'left' otherlv_6= '{' ( (lv_left_7_0= ruleStream ) ) (otherlv_8= ',' ( (lv_left_9_0= ruleStream ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:650:3: otherlv_0= 'ModuleInstances' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'desc' ( ( ruleEString ) ) (otherlv_5= 'left' otherlv_6= '{' ( (lv_left_7_0= ruleStream ) ) (otherlv_8= ',' ( (lv_left_9_0= ruleStream ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleModuleInstances1449); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleInstancesAccess().getModuleInstancesKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:654:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:655:1: (lv_name_1_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:655:1: (lv_name_1_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:656:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModuleInstancesAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleModuleInstances1470);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleInstancesRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModuleInstances1482); 

                	newLeafNode(otherlv_2, grammarAccess.getModuleInstancesAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleModuleInstances1494); 

                	newLeafNode(otherlv_3, grammarAccess.getModuleInstancesAccess().getDescKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:680:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:681:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:681:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:682:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleInstancesRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getModuleInstancesAccess().getDescModuleCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleModuleInstances1517);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:695:2: (otherlv_5= 'left' otherlv_6= '{' ( (lv_left_7_0= ruleStream ) ) (otherlv_8= ',' ( (lv_left_9_0= ruleStream ) ) )* otherlv_10= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:695:4: otherlv_5= 'left' otherlv_6= '{' ( (lv_left_7_0= ruleStream ) ) (otherlv_8= ',' ( (lv_left_9_0= ruleStream ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleModuleInstances1530); 

                        	newLeafNode(otherlv_5, grammarAccess.getModuleInstancesAccess().getLeftKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleModuleInstances1542); 

                        	newLeafNode(otherlv_6, grammarAccess.getModuleInstancesAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:703:1: ( (lv_left_7_0= ruleStream ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:704:1: (lv_left_7_0= ruleStream )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:704:1: (lv_left_7_0= ruleStream )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:705:3: lv_left_7_0= ruleStream
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleInstancesAccess().getLeftStreamParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStream_in_ruleModuleInstances1563);
                    lv_left_7_0=ruleStream();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleInstancesRule());
                    	        }
                           		add(
                           			current, 
                           			"left",
                            		lv_left_7_0, 
                            		"Stream");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:721:2: (otherlv_8= ',' ( (lv_left_9_0= ruleStream ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:721:4: otherlv_8= ',' ( (lv_left_9_0= ruleStream ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleModuleInstances1576); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getModuleInstancesAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:725:1: ( (lv_left_9_0= ruleStream ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:726:1: (lv_left_9_0= ruleStream )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:726:1: (lv_left_9_0= ruleStream )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:727:3: lv_left_9_0= ruleStream
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleInstancesAccess().getLeftStreamParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStream_in_ruleModuleInstances1597);
                    	    lv_left_9_0=ruleStream();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleInstancesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"left",
                    	            		lv_left_9_0, 
                    	            		"Stream");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleModuleInstances1611); 

                        	newLeafNode(otherlv_10, grammarAccess.getModuleInstancesAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleModuleInstances1625); 

                	newLeafNode(otherlv_11, grammarAccess.getModuleInstancesAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleModuleInstances"


    // $ANTLR start "entryRuleStream_Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:759:1: entryRuleStream_Impl returns [EObject current=null] : iv_ruleStream_Impl= ruleStream_Impl EOF ;
    public final EObject entryRuleStream_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream_Impl = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:760:2: (iv_ruleStream_Impl= ruleStream_Impl EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:761:2: iv_ruleStream_Impl= ruleStream_Impl EOF
            {
             newCompositeNode(grammarAccess.getStream_ImplRule()); 
            pushFollow(FOLLOW_ruleStream_Impl_in_entryRuleStream_Impl1661);
            iv_ruleStream_Impl=ruleStream_Impl();

            state._fsp--;

             current =iv_ruleStream_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream_Impl1671); 

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
    // $ANTLR end "entryRuleStream_Impl"


    // $ANTLR start "ruleStream_Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:768:1: ruleStream_Impl returns [EObject current=null] : (otherlv_0= 'Stream' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleStream_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:771:28: ( (otherlv_0= 'Stream' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:772:1: (otherlv_0= 'Stream' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:772:1: (otherlv_0= 'Stream' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:772:3: otherlv_0= 'Stream' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleStream_Impl1708); 

                	newLeafNode(otherlv_0, grammarAccess.getStream_ImplAccess().getStreamKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:776:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:777:1: (lv_name_1_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:777:1: (lv_name_1_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:778:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStream_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleStream_Impl1729);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStream_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStream_Impl1741); 

                	newLeafNode(otherlv_2, grammarAccess.getStream_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleStream_Impl1753); 

                	newLeafNode(otherlv_3, grammarAccess.getStream_ImplAccess().getTypeKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:802:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:803:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:803:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:804:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStream_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStream_ImplAccess().getTypeTypeDeclCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleStream_Impl1776);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleStream_Impl1788); 

                	newLeafNode(otherlv_5, grammarAccess.getStream_ImplAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleStream_Impl"


    // $ANTLR start "entryRuleLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:829:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:830:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:831:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1824);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1834); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:838:1: ruleLiteral returns [EObject current=null] : (otherlv_0= 'Literal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= 'type' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:841:28: ( (otherlv_0= 'Literal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= 'type' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:842:1: (otherlv_0= 'Literal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= 'type' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:842:1: (otherlv_0= 'Literal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= 'type' ( ( ruleEString ) ) otherlv_7= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:842:3: otherlv_0= 'Literal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= 'type' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLiteral1871); 

                	newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getLiteralKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:846:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:847:1: (lv_name_1_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:847:1: (lv_name_1_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:848:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLiteralAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleLiteral1892);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleLiteral1904); 

                	newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:868:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:868:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleLiteral1917); 

                        	newLeafNode(otherlv_3, grammarAccess.getLiteralAccess().getValueKeyword_3_0());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:872:1: ( (lv_value_4_0= ruleEString ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:873:1: (lv_value_4_0= ruleEString )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:873:1: (lv_value_4_0= ruleEString )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:874:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleLiteral1938);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleLiteral1952); 

                	newLeafNode(otherlv_5, grammarAccess.getLiteralAccess().getTypeKeyword_4());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:894:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:895:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:895:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:896:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLiteralAccess().getTypeTypeDeclCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleLiteral1975);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleLiteral1987); 

                	newLeafNode(otherlv_7, grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNativeType"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:921:1: entryRuleNativeType returns [EObject current=null] : iv_ruleNativeType= ruleNativeType EOF ;
    public final EObject entryRuleNativeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeType = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:922:2: (iv_ruleNativeType= ruleNativeType EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:923:2: iv_ruleNativeType= ruleNativeType EOF
            {
             newCompositeNode(grammarAccess.getNativeTypeRule()); 
            pushFollow(FOLLOW_ruleNativeType_in_entryRuleNativeType2023);
            iv_ruleNativeType=ruleNativeType();

            state._fsp--;

             current =iv_ruleNativeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeType2033); 

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
    // $ANTLR end "entryRuleNativeType"


    // $ANTLR start "ruleNativeType"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:930:1: ruleNativeType returns [EObject current=null] : (otherlv_0= 'NativeType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleNativeTypeOptions ) ) otherlv_5= '}' ) ;
    public final EObject ruleNativeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:933:28: ( (otherlv_0= 'NativeType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleNativeTypeOptions ) ) otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:934:1: (otherlv_0= 'NativeType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleNativeTypeOptions ) ) otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:934:1: (otherlv_0= 'NativeType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleNativeTypeOptions ) ) otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:934:3: otherlv_0= 'NativeType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleNativeTypeOptions ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleNativeType2070); 

                	newLeafNode(otherlv_0, grammarAccess.getNativeTypeAccess().getNativeTypeKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:938:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:939:1: (lv_name_1_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:939:1: (lv_name_1_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:940:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getNativeTypeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleNativeType2091);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNativeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNativeType2103); 

                	newLeafNode(otherlv_2, grammarAccess.getNativeTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleNativeType2115); 

                	newLeafNode(otherlv_3, grammarAccess.getNativeTypeAccess().getTypeKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:964:1: ( (lv_type_4_0= ruleNativeTypeOptions ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:965:1: (lv_type_4_0= ruleNativeTypeOptions )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:965:1: (lv_type_4_0= ruleNativeTypeOptions )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:966:3: lv_type_4_0= ruleNativeTypeOptions
            {
             
            	        newCompositeNode(grammarAccess.getNativeTypeAccess().getTypeNativeTypeOptionsParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleNativeTypeOptions_in_ruleNativeType2136);
            lv_type_4_0=ruleNativeTypeOptions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNativeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"NativeTypeOptions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleNativeType2148); 

                	newLeafNode(otherlv_5, grammarAccess.getNativeTypeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleNativeType"


    // $ANTLR start "entryRuleList"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:994:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:995:2: (iv_ruleList= ruleList EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:996:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList2184);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList2194); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1003:1: ruleList returns [EObject current=null] : (otherlv_0= 'List' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1006:28: ( (otherlv_0= 'List' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1007:1: (otherlv_0= 'List' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1007:1: (otherlv_0= 'List' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1007:3: otherlv_0= 'List' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleList2231); 

                	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1011:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1012:1: (lv_name_1_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1012:1: (lv_name_1_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1013:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getListAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleList2252);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleList2264); 

                	newLeafNode(otherlv_2, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleList2276); 

                	newLeafNode(otherlv_3, grammarAccess.getListAccess().getTypeKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1037:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1038:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1038:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1039:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getListAccess().getTypeTypeDeclCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleList2299);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleList2311); 

                	newLeafNode(otherlv_5, grammarAccess.getListAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleHash"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1064:1: entryRuleHash returns [EObject current=null] : iv_ruleHash= ruleHash EOF ;
    public final EObject entryRuleHash() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHash = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1065:2: (iv_ruleHash= ruleHash EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1066:2: iv_ruleHash= ruleHash EOF
            {
             newCompositeNode(grammarAccess.getHashRule()); 
            pushFollow(FOLLOW_ruleHash_in_entryRuleHash2347);
            iv_ruleHash=ruleHash();

            state._fsp--;

             current =iv_ruleHash; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHash2357); 

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1073:1: ruleHash returns [EObject current=null] : ( () otherlv_1= 'Hash' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_items_6_0= ruleHashItem ) ) (otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleHash() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_items_6_0 = null;

        EObject lv_items_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1076:28: ( ( () otherlv_1= 'Hash' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_items_6_0= ruleHashItem ) ) (otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1077:1: ( () otherlv_1= 'Hash' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_items_6_0= ruleHashItem ) ) (otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1077:1: ( () otherlv_1= 'Hash' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_items_6_0= ruleHashItem ) ) (otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1077:2: () otherlv_1= 'Hash' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_items_6_0= ruleHashItem ) ) (otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1077:2: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1078:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHashAccess().getHashAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleHash2403); 

                	newLeafNode(otherlv_1, grammarAccess.getHashAccess().getHashKeyword_1());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1087:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1088:1: (lv_name_2_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1088:1: (lv_name_2_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1089:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getHashAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleHash2424);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHashRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleHash2436); 

                	newLeafNode(otherlv_3, grammarAccess.getHashAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1109:1: (otherlv_4= 'items' otherlv_5= '{' ( (lv_items_6_0= ruleHashItem ) ) (otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) ) )* otherlv_9= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1109:3: otherlv_4= 'items' otherlv_5= '{' ( (lv_items_6_0= ruleHashItem ) ) (otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleHash2449); 

                        	newLeafNode(otherlv_4, grammarAccess.getHashAccess().getItemsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleHash2461); 

                        	newLeafNode(otherlv_5, grammarAccess.getHashAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1117:1: ( (lv_items_6_0= ruleHashItem ) )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1118:1: (lv_items_6_0= ruleHashItem )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1118:1: (lv_items_6_0= ruleHashItem )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1119:3: lv_items_6_0= ruleHashItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getHashAccess().getItemsHashItemParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHashItem_in_ruleHash2482);
                    lv_items_6_0=ruleHashItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHashRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_6_0, 
                            		"HashItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1135:2: (otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1135:4: otherlv_7= ',' ( (lv_items_8_0= ruleHashItem ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleHash2495); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getHashAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1139:1: ( (lv_items_8_0= ruleHashItem ) )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1140:1: (lv_items_8_0= ruleHashItem )
                    	    {
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1140:1: (lv_items_8_0= ruleHashItem )
                    	    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1141:3: lv_items_8_0= ruleHashItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHashAccess().getItemsHashItemParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleHashItem_in_ruleHash2516);
                    	    lv_items_8_0=ruleHashItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHashRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_8_0, 
                    	            		"HashItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleHash2530); 

                        	newLeafNode(otherlv_9, grammarAccess.getHashAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleHash2544); 

                	newLeafNode(otherlv_10, grammarAccess.getHashAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleNativeTypeOptions"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1173:1: entryRuleNativeTypeOptions returns [EObject current=null] : iv_ruleNativeTypeOptions= ruleNativeTypeOptions EOF ;
    public final EObject entryRuleNativeTypeOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeTypeOptions = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1174:2: (iv_ruleNativeTypeOptions= ruleNativeTypeOptions EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1175:2: iv_ruleNativeTypeOptions= ruleNativeTypeOptions EOF
            {
             newCompositeNode(grammarAccess.getNativeTypeOptionsRule()); 
            pushFollow(FOLLOW_ruleNativeTypeOptions_in_entryRuleNativeTypeOptions2580);
            iv_ruleNativeTypeOptions=ruleNativeTypeOptions();

            state._fsp--;

             current =iv_ruleNativeTypeOptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeTypeOptions2590); 

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
    // $ANTLR end "entryRuleNativeTypeOptions"


    // $ANTLR start "ruleNativeTypeOptions"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1182:1: ruleNativeTypeOptions returns [EObject current=null] : otherlv_0= 'NativeTypeOptions' ;
    public final EObject ruleNativeTypeOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1185:28: (otherlv_0= 'NativeTypeOptions' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1186:2: otherlv_0= 'NativeTypeOptions'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleNativeTypeOptions2626); 

                	newLeafNode(otherlv_0, grammarAccess.getNativeTypeOptionsAccess().getNativeTypeOptionsKeyword());
                

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
    // $ANTLR end "ruleNativeTypeOptions"


    // $ANTLR start "entryRuleHashItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1198:1: entryRuleHashItem returns [EObject current=null] : iv_ruleHashItem= ruleHashItem EOF ;
    public final EObject entryRuleHashItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashItem = null;


        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1199:2: (iv_ruleHashItem= ruleHashItem EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1200:2: iv_ruleHashItem= ruleHashItem EOF
            {
             newCompositeNode(grammarAccess.getHashItemRule()); 
            pushFollow(FOLLOW_ruleHashItem_in_entryRuleHashItem2661);
            iv_ruleHashItem=ruleHashItem();

            state._fsp--;

             current =iv_ruleHashItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashItem2671); 

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
    // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1207:1: ruleHashItem returns [EObject current=null] : (otherlv_0= 'HashItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleHashItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1210:28: ( (otherlv_0= 'HashItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1211:1: (otherlv_0= 'HashItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1211:1: (otherlv_0= 'HashItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1211:3: otherlv_0= 'HashItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleHashItem2708); 

                	newLeafNode(otherlv_0, grammarAccess.getHashItemAccess().getHashItemKeyword_0());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1215:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1216:1: (lv_name_1_0= ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1216:1: (lv_name_1_0= ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1217:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getHashItemAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleHashItem2729);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHashItemRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleHashItem2741); 

                	newLeafNode(otherlv_2, grammarAccess.getHashItemAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleHashItem2753); 

                	newLeafNode(otherlv_3, grammarAccess.getHashItemAccess().getTypeKeyword_3());
                
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1241:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1242:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1242:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/parser/antlr/internal/InternalVML.g:1243:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getHashItemRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getHashItemAccess().getTypeTypeDeclCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleHashItem2776);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleHashItem2788); 

                	newLeafNode(otherlv_5, grammarAccess.getHashItemAccess().getRightCurlyBracketKeyword_5());
                

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModule131 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModule152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule164 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_13_in_ruleModule177 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule189 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleInput_in_ruleModule210 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModule223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleInput_in_ruleModule244 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleModule258 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_16_in_ruleModule273 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule285 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleModule306 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModule319 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleModule340 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleModule354 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_17_in_ruleModule369 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule381 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleModuleInstances_in_ruleModule402 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModule415 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleModuleInstances_in_ruleModule436 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleModule450 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleModule465 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule477 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleModule498 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModule511 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleModule532 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleModule546 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModule560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_ruleTypeDecl653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleTypeDecl680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHash_in_ruleTypeDecl707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_entryRuleStream742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_Impl_in_ruleStream799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleStream826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_ruleStream853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleStream880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleInput1085 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleInput1106 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInput1118 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInput1130 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleInput1153 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInput1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOutput1248 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOutput1269 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOutput1281 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOutput1293 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOutput1316 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleOutput1329 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOutput1352 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOutput1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleInstances_in_entryRuleModuleInstances1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleInstances1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleModuleInstances1449 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModuleInstances1470 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModuleInstances1482 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModuleInstances1494 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModuleInstances1517 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleModuleInstances1530 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModuleInstances1542 = new BitSet(new long[]{0x0000000006280000L});
    public static final BitSet FOLLOW_ruleStream_in_ruleModuleInstances1563 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModuleInstances1576 = new BitSet(new long[]{0x0000000006280000L});
    public static final BitSet FOLLOW_ruleStream_in_ruleModuleInstances1597 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleModuleInstances1611 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModuleInstances1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_Impl_in_entryRuleStream_Impl1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream_Impl1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStream_Impl1708 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleStream_Impl1729 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStream_Impl1741 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStream_Impl1753 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleStream_Impl1776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStream_Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLiteral1871 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLiteral1892 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLiteral1904 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_27_in_ruleLiteral1917 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLiteral1938 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLiteral1952 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleLiteral1975 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLiteral1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_entryRuleNativeType2023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeType2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNativeType2070 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleNativeType2091 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNativeType2103 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNativeType2115 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleNativeTypeOptions_in_ruleNativeType2136 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNativeType2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleList2231 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleList2252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleList2264 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleList2276 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleList2299 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleList2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHash_in_entryRuleHash2347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHash2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleHash2403 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleHash2424 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHash2436 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_31_in_ruleHash2449 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHash2461 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleHashItem_in_ruleHash2482 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleHash2495 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleHashItem_in_ruleHash2516 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleHash2530 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHash2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeTypeOptions_in_entryRuleNativeTypeOptions2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeTypeOptions2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleNativeTypeOptions2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashItem_in_entryRuleHashItem2661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashItem2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleHashItem2708 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleHashItem2729 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHashItem2741 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHashItem2753 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleHashItem2776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHashItem2788 = new BitSet(new long[]{0x0000000000000002L});

}