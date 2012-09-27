package com.visualligence.g.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.visualligence.g.services.VMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NativeTypeOptions'", "'Module'", "'{'", "'}'", "'input'", "','", "'output'", "'instances'", "'types'", "'Input'", "'type'", "'Output'", "'left'", "'ModuleInstances'", "'desc'", "'Stream'", "'Literal'", "'value'", "'NativeType'", "'List'", "'Hash'", "'items'", "'HashItem'"
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
    public String getGrammarFileName() { return "../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g"; }


     
     	private VMLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VMLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModule"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:60:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:61:1: ( ruleModule EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:62:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule61);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule68); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:69:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:73:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:74:1: ( ( rule__Module__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:74:1: ( ( rule__Module__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:75:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:76:1: ( rule__Module__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:76:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule94);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleTypeDecl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:88:1: entryRuleTypeDecl : ruleTypeDecl EOF ;
    public final void entryRuleTypeDecl() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:89:1: ( ruleTypeDecl EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:90:1: ruleTypeDecl EOF
            {
             before(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl121);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getTypeDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl128); 

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
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:97:1: ruleTypeDecl : ( ( rule__TypeDecl__Alternatives ) ) ;
    public final void ruleTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:101:2: ( ( ( rule__TypeDecl__Alternatives ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:102:1: ( ( rule__TypeDecl__Alternatives ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:102:1: ( ( rule__TypeDecl__Alternatives ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:103:1: ( rule__TypeDecl__Alternatives )
            {
             before(grammarAccess.getTypeDeclAccess().getAlternatives()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:104:1: ( rule__TypeDecl__Alternatives )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:104:2: rule__TypeDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeDecl__Alternatives_in_ruleTypeDecl154);
            rule__TypeDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleStream"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:116:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:117:1: ( ruleStream EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:118:1: ruleStream EOF
            {
             before(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_ruleStream_in_entryRuleStream181);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getStreamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream188); 

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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:125:1: ruleStream : ( ( rule__Stream__Alternatives ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:129:2: ( ( ( rule__Stream__Alternatives ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:130:1: ( ( rule__Stream__Alternatives ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:130:1: ( ( rule__Stream__Alternatives ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:131:1: ( rule__Stream__Alternatives )
            {
             before(grammarAccess.getStreamAccess().getAlternatives()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:132:1: ( rule__Stream__Alternatives )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:132:2: rule__Stream__Alternatives
            {
            pushFollow(FOLLOW_rule__Stream__Alternatives_in_ruleStream214);
            rule__Stream__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleEString"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:145:1: ( ruleEString EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString248); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:160:1: ( rule__EString__Alternatives )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleInput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:172:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:173:1: ( ruleInput EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:174:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput301);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput308); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:181:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:185:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:186:1: ( ( rule__Input__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:186:1: ( ( rule__Input__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:187:1: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:188:1: ( rule__Input__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:188:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput334);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:200:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:201:1: ( ruleOutput EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:202:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput361);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput368); 

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:209:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:213:2: ( ( ( rule__Output__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:214:1: ( ( rule__Output__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:214:1: ( ( rule__Output__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:215:1: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:216:1: ( rule__Output__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:216:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_rule__Output__Group__0_in_ruleOutput394);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleModuleInstances"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:228:1: entryRuleModuleInstances : ruleModuleInstances EOF ;
    public final void entryRuleModuleInstances() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:229:1: ( ruleModuleInstances EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:230:1: ruleModuleInstances EOF
            {
             before(grammarAccess.getModuleInstancesRule()); 
            pushFollow(FOLLOW_ruleModuleInstances_in_entryRuleModuleInstances421);
            ruleModuleInstances();

            state._fsp--;

             after(grammarAccess.getModuleInstancesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleInstances428); 

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
    // $ANTLR end "entryRuleModuleInstances"


    // $ANTLR start "ruleModuleInstances"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:237:1: ruleModuleInstances : ( ( rule__ModuleInstances__Group__0 ) ) ;
    public final void ruleModuleInstances() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:241:2: ( ( ( rule__ModuleInstances__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:242:1: ( ( rule__ModuleInstances__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:242:1: ( ( rule__ModuleInstances__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:243:1: ( rule__ModuleInstances__Group__0 )
            {
             before(grammarAccess.getModuleInstancesAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:244:1: ( rule__ModuleInstances__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:244:2: rule__ModuleInstances__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group__0_in_ruleModuleInstances454);
            rule__ModuleInstances__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleInstancesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleInstances"


    // $ANTLR start "entryRuleStream_Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:256:1: entryRuleStream_Impl : ruleStream_Impl EOF ;
    public final void entryRuleStream_Impl() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:257:1: ( ruleStream_Impl EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:258:1: ruleStream_Impl EOF
            {
             before(grammarAccess.getStream_ImplRule()); 
            pushFollow(FOLLOW_ruleStream_Impl_in_entryRuleStream_Impl481);
            ruleStream_Impl();

            state._fsp--;

             after(grammarAccess.getStream_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream_Impl488); 

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
    // $ANTLR end "entryRuleStream_Impl"


    // $ANTLR start "ruleStream_Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:265:1: ruleStream_Impl : ( ( rule__Stream_Impl__Group__0 ) ) ;
    public final void ruleStream_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:269:2: ( ( ( rule__Stream_Impl__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:270:1: ( ( rule__Stream_Impl__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:270:1: ( ( rule__Stream_Impl__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:271:1: ( rule__Stream_Impl__Group__0 )
            {
             before(grammarAccess.getStream_ImplAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:272:1: ( rule__Stream_Impl__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:272:2: rule__Stream_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__Stream_Impl__Group__0_in_ruleStream_Impl514);
            rule__Stream_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStream_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStream_Impl"


    // $ANTLR start "entryRuleLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:284:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:285:1: ( ruleLiteral EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:286:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral541);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral548); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:293:1: ruleLiteral : ( ( rule__Literal__Group__0 ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:297:2: ( ( ( rule__Literal__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:298:1: ( ( rule__Literal__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:298:1: ( ( rule__Literal__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:299:1: ( rule__Literal__Group__0 )
            {
             before(grammarAccess.getLiteralAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:300:1: ( rule__Literal__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:300:2: rule__Literal__Group__0
            {
            pushFollow(FOLLOW_rule__Literal__Group__0_in_ruleLiteral574);
            rule__Literal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNativeType"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:312:1: entryRuleNativeType : ruleNativeType EOF ;
    public final void entryRuleNativeType() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:313:1: ( ruleNativeType EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:314:1: ruleNativeType EOF
            {
             before(grammarAccess.getNativeTypeRule()); 
            pushFollow(FOLLOW_ruleNativeType_in_entryRuleNativeType601);
            ruleNativeType();

            state._fsp--;

             after(grammarAccess.getNativeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeType608); 

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
    // $ANTLR end "entryRuleNativeType"


    // $ANTLR start "ruleNativeType"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:321:1: ruleNativeType : ( ( rule__NativeType__Group__0 ) ) ;
    public final void ruleNativeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:325:2: ( ( ( rule__NativeType__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:326:1: ( ( rule__NativeType__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:326:1: ( ( rule__NativeType__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:327:1: ( rule__NativeType__Group__0 )
            {
             before(grammarAccess.getNativeTypeAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:328:1: ( rule__NativeType__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:328:2: rule__NativeType__Group__0
            {
            pushFollow(FOLLOW_rule__NativeType__Group__0_in_ruleNativeType634);
            rule__NativeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNativeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeType"


    // $ANTLR start "entryRuleList"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:340:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:341:1: ( ruleList EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:342:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList661);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList668); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:349:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:353:2: ( ( ( rule__List__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:354:1: ( ( rule__List__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:354:1: ( ( rule__List__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:355:1: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:356:1: ( rule__List__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:356:2: rule__List__Group__0
            {
            pushFollow(FOLLOW_rule__List__Group__0_in_ruleList694);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleHash"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:368:1: entryRuleHash : ruleHash EOF ;
    public final void entryRuleHash() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:369:1: ( ruleHash EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:370:1: ruleHash EOF
            {
             before(grammarAccess.getHashRule()); 
            pushFollow(FOLLOW_ruleHash_in_entryRuleHash721);
            ruleHash();

            state._fsp--;

             after(grammarAccess.getHashRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHash728); 

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
    // $ANTLR end "entryRuleHash"


    // $ANTLR start "ruleHash"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:377:1: ruleHash : ( ( rule__Hash__Group__0 ) ) ;
    public final void ruleHash() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:381:2: ( ( ( rule__Hash__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:382:1: ( ( rule__Hash__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:382:1: ( ( rule__Hash__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:383:1: ( rule__Hash__Group__0 )
            {
             before(grammarAccess.getHashAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:384:1: ( rule__Hash__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:384:2: rule__Hash__Group__0
            {
            pushFollow(FOLLOW_rule__Hash__Group__0_in_ruleHash754);
            rule__Hash__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHashAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHash"


    // $ANTLR start "entryRuleNativeTypeOptions"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:396:1: entryRuleNativeTypeOptions : ruleNativeTypeOptions EOF ;
    public final void entryRuleNativeTypeOptions() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:397:1: ( ruleNativeTypeOptions EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:398:1: ruleNativeTypeOptions EOF
            {
             before(grammarAccess.getNativeTypeOptionsRule()); 
            pushFollow(FOLLOW_ruleNativeTypeOptions_in_entryRuleNativeTypeOptions781);
            ruleNativeTypeOptions();

            state._fsp--;

             after(grammarAccess.getNativeTypeOptionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeTypeOptions788); 

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
    // $ANTLR end "entryRuleNativeTypeOptions"


    // $ANTLR start "ruleNativeTypeOptions"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:405:1: ruleNativeTypeOptions : ( 'NativeTypeOptions' ) ;
    public final void ruleNativeTypeOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:409:2: ( ( 'NativeTypeOptions' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:410:1: ( 'NativeTypeOptions' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:410:1: ( 'NativeTypeOptions' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:411:1: 'NativeTypeOptions'
            {
             before(grammarAccess.getNativeTypeOptionsAccess().getNativeTypeOptionsKeyword()); 
            match(input,11,FOLLOW_11_in_ruleNativeTypeOptions815); 
             after(grammarAccess.getNativeTypeOptionsAccess().getNativeTypeOptionsKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeTypeOptions"


    // $ANTLR start "entryRuleHashItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:426:1: entryRuleHashItem : ruleHashItem EOF ;
    public final void entryRuleHashItem() throws RecognitionException {
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:427:1: ( ruleHashItem EOF )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:428:1: ruleHashItem EOF
            {
             before(grammarAccess.getHashItemRule()); 
            pushFollow(FOLLOW_ruleHashItem_in_entryRuleHashItem843);
            ruleHashItem();

            state._fsp--;

             after(grammarAccess.getHashItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashItem850); 

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
    // $ANTLR end "entryRuleHashItem"


    // $ANTLR start "ruleHashItem"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:435:1: ruleHashItem : ( ( rule__HashItem__Group__0 ) ) ;
    public final void ruleHashItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:439:2: ( ( ( rule__HashItem__Group__0 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:440:1: ( ( rule__HashItem__Group__0 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:440:1: ( ( rule__HashItem__Group__0 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:441:1: ( rule__HashItem__Group__0 )
            {
             before(grammarAccess.getHashItemAccess().getGroup()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:442:1: ( rule__HashItem__Group__0 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:442:2: rule__HashItem__Group__0
            {
            pushFollow(FOLLOW_rule__HashItem__Group__0_in_ruleHashItem876);
            rule__HashItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHashItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHashItem"


    // $ANTLR start "rule__TypeDecl__Alternatives"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:454:1: rule__TypeDecl__Alternatives : ( ( ruleNativeType ) | ( ruleList ) | ( ruleHash ) );
    public final void rule__TypeDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:458:1: ( ( ruleNativeType ) | ( ruleList ) | ( ruleHash ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:459:1: ( ruleNativeType )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:459:1: ( ruleNativeType )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:460:1: ruleNativeType
                    {
                     before(grammarAccess.getTypeDeclAccess().getNativeTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNativeType_in_rule__TypeDecl__Alternatives912);
                    ruleNativeType();

                    state._fsp--;

                     after(grammarAccess.getTypeDeclAccess().getNativeTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:465:6: ( ruleList )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:465:6: ( ruleList )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:466:1: ruleList
                    {
                     before(grammarAccess.getTypeDeclAccess().getListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleList_in_rule__TypeDecl__Alternatives929);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getTypeDeclAccess().getListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:471:6: ( ruleHash )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:471:6: ( ruleHash )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:472:1: ruleHash
                    {
                     before(grammarAccess.getTypeDeclAccess().getHashParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHash_in_rule__TypeDecl__Alternatives946);
                    ruleHash();

                    state._fsp--;

                     after(grammarAccess.getTypeDeclAccess().getHashParserRuleCall_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Alternatives"


    // $ANTLR start "rule__Stream__Alternatives"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:482:1: rule__Stream__Alternatives : ( ( ruleStream_Impl ) | ( ruleLiteral ) | ( ruleInput ) | ( ruleOutput ) );
    public final void rule__Stream__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:486:1: ( ( ruleStream_Impl ) | ( ruleLiteral ) | ( ruleInput ) | ( ruleOutput ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:487:1: ( ruleStream_Impl )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:487:1: ( ruleStream_Impl )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:488:1: ruleStream_Impl
                    {
                     before(grammarAccess.getStreamAccess().getStream_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStream_Impl_in_rule__Stream__Alternatives978);
                    ruleStream_Impl();

                    state._fsp--;

                     after(grammarAccess.getStreamAccess().getStream_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:493:6: ( ruleLiteral )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:493:6: ( ruleLiteral )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:494:1: ruleLiteral
                    {
                     before(grammarAccess.getStreamAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Stream__Alternatives995);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getStreamAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:499:6: ( ruleInput )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:499:6: ( ruleInput )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:500:1: ruleInput
                    {
                     before(grammarAccess.getStreamAccess().getInputParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInput_in_rule__Stream__Alternatives1012);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getStreamAccess().getInputParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:505:6: ( ruleOutput )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:505:6: ( ruleOutput )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:506:1: ruleOutput
                    {
                     before(grammarAccess.getStreamAccess().getOutputParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOutput_in_rule__Stream__Alternatives1029);
                    ruleOutput();

                    state._fsp--;

                     after(grammarAccess.getStreamAccess().getOutputParserRuleCall_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:516:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:520:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:521:1: ( RULE_STRING )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:521:1: ( RULE_STRING )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:522:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1061); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:527:6: ( RULE_ID )
                    {
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:527:6: ( RULE_ID )
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:528:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1078); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:540:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:544:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:545:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01108);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01111);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:552:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:556:1: ( ( () ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:557:1: ( () )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:557:1: ( () )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:558:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:559:1: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:561:1: 
            {
            }

             after(grammarAccess.getModuleAccess().getModuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:571:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:575:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:576:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11169);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11172);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:583:1: rule__Module__Group__1__Impl : ( 'Module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:587:1: ( ( 'Module' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:588:1: ( 'Module' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:588:1: ( 'Module' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:589:1: 'Module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Module__Group__1__Impl1200); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:602:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:606:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:607:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21231);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21234);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:614:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:618:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:619:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:619:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:620:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:621:1: ( rule__Module__NameAssignment_2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:621:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1261);
            rule__Module__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:631:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:635:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:636:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31291);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31294);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:643:1: rule__Module__Group__3__Impl : ( '{' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:647:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:648:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:648:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:649:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group__3__Impl1322); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:662:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:666:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:667:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41353);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41356);
            rule__Module__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:674:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:678:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:679:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:679:1: ( ( rule__Module__Group_4__0 )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:680:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:681:1: ( rule__Module__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:681:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1383);
                    rule__Module__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:691:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:695:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:696:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51414);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__51417);
            rule__Module__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:703:1: rule__Module__Group__5__Impl : ( ( rule__Module__Group_5__0 )? ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:707:1: ( ( ( rule__Module__Group_5__0 )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:708:1: ( ( rule__Module__Group_5__0 )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:708:1: ( ( rule__Module__Group_5__0 )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:709:1: ( rule__Module__Group_5__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_5()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:710:1: ( rule__Module__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:710:2: rule__Module__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_5__0_in_rule__Module__Group__5__Impl1444);
                    rule__Module__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:720:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:724:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:725:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__61475);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__61478);
            rule__Module__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:732:1: rule__Module__Group__6__Impl : ( ( rule__Module__Group_6__0 )? ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:736:1: ( ( ( rule__Module__Group_6__0 )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:737:1: ( ( rule__Module__Group_6__0 )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:737:1: ( ( rule__Module__Group_6__0 )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:738:1: ( rule__Module__Group_6__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_6()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:739:1: ( rule__Module__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:739:2: rule__Module__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_6__0_in_rule__Module__Group__6__Impl1505);
                    rule__Module__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group__7"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:749:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:753:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:754:2: rule__Module__Group__7__Impl rule__Module__Group__8
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__71536);
            rule__Module__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__8_in_rule__Module__Group__71539);
            rule__Module__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7"


    // $ANTLR start "rule__Module__Group__7__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:761:1: rule__Module__Group__7__Impl : ( ( rule__Module__Group_7__0 )? ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:765:1: ( ( ( rule__Module__Group_7__0 )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:766:1: ( ( rule__Module__Group_7__0 )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:766:1: ( ( rule__Module__Group_7__0 )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:767:1: ( rule__Module__Group_7__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_7()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:768:1: ( rule__Module__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:768:2: rule__Module__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_7__0_in_rule__Module__Group__7__Impl1566);
                    rule__Module__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7__Impl"


    // $ANTLR start "rule__Module__Group__8"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:778:1: rule__Module__Group__8 : rule__Module__Group__8__Impl ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:782:1: ( rule__Module__Group__8__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:783:2: rule__Module__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__81597);
            rule__Module__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__8"


    // $ANTLR start "rule__Module__Group__8__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:789:1: rule__Module__Group__8__Impl : ( '}' ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:793:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:794:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:794:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:795:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group__8__Impl1625); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__8__Impl"


    // $ANTLR start "rule__Module__Group_4__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:826:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:830:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:831:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01674);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01677);
            rule__Module__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0"


    // $ANTLR start "rule__Module__Group_4__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:838:1: rule__Module__Group_4__0__Impl : ( 'input' ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:842:1: ( ( 'input' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:843:1: ( 'input' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:843:1: ( 'input' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:844:1: 'input'
            {
             before(grammarAccess.getModuleAccess().getInputKeyword_4_0()); 
            match(input,15,FOLLOW_15_in_rule__Module__Group_4__0__Impl1705); 
             after(grammarAccess.getModuleAccess().getInputKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0__Impl"


    // $ANTLR start "rule__Module__Group_4__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:857:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl rule__Module__Group_4__2 ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:861:1: ( rule__Module__Group_4__1__Impl rule__Module__Group_4__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:862:2: rule__Module__Group_4__1__Impl rule__Module__Group_4__2
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11736);
            rule__Module__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__2_in_rule__Module__Group_4__11739);
            rule__Module__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1"


    // $ANTLR start "rule__Module__Group_4__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:869:1: rule__Module__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:873:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:874:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:874:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:875:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group_4__1__Impl1767); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1__Impl"


    // $ANTLR start "rule__Module__Group_4__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:888:1: rule__Module__Group_4__2 : rule__Module__Group_4__2__Impl rule__Module__Group_4__3 ;
    public final void rule__Module__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:892:1: ( rule__Module__Group_4__2__Impl rule__Module__Group_4__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:893:2: rule__Module__Group_4__2__Impl rule__Module__Group_4__3
            {
            pushFollow(FOLLOW_rule__Module__Group_4__2__Impl_in_rule__Module__Group_4__21798);
            rule__Module__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__3_in_rule__Module__Group_4__21801);
            rule__Module__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__2"


    // $ANTLR start "rule__Module__Group_4__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:900:1: rule__Module__Group_4__2__Impl : ( ( rule__Module__InputAssignment_4_2 ) ) ;
    public final void rule__Module__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:904:1: ( ( ( rule__Module__InputAssignment_4_2 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:905:1: ( ( rule__Module__InputAssignment_4_2 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:905:1: ( ( rule__Module__InputAssignment_4_2 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:906:1: ( rule__Module__InputAssignment_4_2 )
            {
             before(grammarAccess.getModuleAccess().getInputAssignment_4_2()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:907:1: ( rule__Module__InputAssignment_4_2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:907:2: rule__Module__InputAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Module__InputAssignment_4_2_in_rule__Module__Group_4__2__Impl1828);
            rule__Module__InputAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getInputAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__2__Impl"


    // $ANTLR start "rule__Module__Group_4__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:917:1: rule__Module__Group_4__3 : rule__Module__Group_4__3__Impl rule__Module__Group_4__4 ;
    public final void rule__Module__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:921:1: ( rule__Module__Group_4__3__Impl rule__Module__Group_4__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:922:2: rule__Module__Group_4__3__Impl rule__Module__Group_4__4
            {
            pushFollow(FOLLOW_rule__Module__Group_4__3__Impl_in_rule__Module__Group_4__31858);
            rule__Module__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__4_in_rule__Module__Group_4__31861);
            rule__Module__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__3"


    // $ANTLR start "rule__Module__Group_4__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:929:1: rule__Module__Group_4__3__Impl : ( ( rule__Module__Group_4_3__0 )* ) ;
    public final void rule__Module__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:933:1: ( ( ( rule__Module__Group_4_3__0 )* ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:934:1: ( ( rule__Module__Group_4_3__0 )* )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:934:1: ( ( rule__Module__Group_4_3__0 )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:935:1: ( rule__Module__Group_4_3__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_4_3()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:936:1: ( rule__Module__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:936:2: rule__Module__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_4_3__0_in_rule__Module__Group_4__3__Impl1888);
            	    rule__Module__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__3__Impl"


    // $ANTLR start "rule__Module__Group_4__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:946:1: rule__Module__Group_4__4 : rule__Module__Group_4__4__Impl ;
    public final void rule__Module__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:950:1: ( rule__Module__Group_4__4__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:951:2: rule__Module__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__4__Impl_in_rule__Module__Group_4__41919);
            rule__Module__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__4"


    // $ANTLR start "rule__Module__Group_4__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:957:1: rule__Module__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Module__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:961:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:962:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:962:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:963:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group_4__4__Impl1947); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__4__Impl"


    // $ANTLR start "rule__Module__Group_4_3__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:986:1: rule__Module__Group_4_3__0 : rule__Module__Group_4_3__0__Impl rule__Module__Group_4_3__1 ;
    public final void rule__Module__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:990:1: ( rule__Module__Group_4_3__0__Impl rule__Module__Group_4_3__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:991:2: rule__Module__Group_4_3__0__Impl rule__Module__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4_3__0__Impl_in_rule__Module__Group_4_3__01988);
            rule__Module__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4_3__1_in_rule__Module__Group_4_3__01991);
            rule__Module__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4_3__0"


    // $ANTLR start "rule__Module__Group_4_3__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:998:1: rule__Module__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Module__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1002:1: ( ( ',' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1003:1: ( ',' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1003:1: ( ',' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1004:1: ','
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Module__Group_4_3__0__Impl2019); 
             after(grammarAccess.getModuleAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4_3__0__Impl"


    // $ANTLR start "rule__Module__Group_4_3__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1017:1: rule__Module__Group_4_3__1 : rule__Module__Group_4_3__1__Impl ;
    public final void rule__Module__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1021:1: ( rule__Module__Group_4_3__1__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1022:2: rule__Module__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4_3__1__Impl_in_rule__Module__Group_4_3__12050);
            rule__Module__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4_3__1"


    // $ANTLR start "rule__Module__Group_4_3__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1028:1: rule__Module__Group_4_3__1__Impl : ( ( rule__Module__InputAssignment_4_3_1 ) ) ;
    public final void rule__Module__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1032:1: ( ( ( rule__Module__InputAssignment_4_3_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1033:1: ( ( rule__Module__InputAssignment_4_3_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1033:1: ( ( rule__Module__InputAssignment_4_3_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1034:1: ( rule__Module__InputAssignment_4_3_1 )
            {
             before(grammarAccess.getModuleAccess().getInputAssignment_4_3_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1035:1: ( rule__Module__InputAssignment_4_3_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1035:2: rule__Module__InputAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Module__InputAssignment_4_3_1_in_rule__Module__Group_4_3__1__Impl2077);
            rule__Module__InputAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getInputAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4_3__1__Impl"


    // $ANTLR start "rule__Module__Group_5__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1049:1: rule__Module__Group_5__0 : rule__Module__Group_5__0__Impl rule__Module__Group_5__1 ;
    public final void rule__Module__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1053:1: ( rule__Module__Group_5__0__Impl rule__Module__Group_5__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1054:2: rule__Module__Group_5__0__Impl rule__Module__Group_5__1
            {
            pushFollow(FOLLOW_rule__Module__Group_5__0__Impl_in_rule__Module__Group_5__02111);
            rule__Module__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_5__1_in_rule__Module__Group_5__02114);
            rule__Module__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__0"


    // $ANTLR start "rule__Module__Group_5__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1061:1: rule__Module__Group_5__0__Impl : ( 'output' ) ;
    public final void rule__Module__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1065:1: ( ( 'output' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1066:1: ( 'output' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1066:1: ( 'output' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1067:1: 'output'
            {
             before(grammarAccess.getModuleAccess().getOutputKeyword_5_0()); 
            match(input,17,FOLLOW_17_in_rule__Module__Group_5__0__Impl2142); 
             after(grammarAccess.getModuleAccess().getOutputKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__0__Impl"


    // $ANTLR start "rule__Module__Group_5__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1080:1: rule__Module__Group_5__1 : rule__Module__Group_5__1__Impl rule__Module__Group_5__2 ;
    public final void rule__Module__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1084:1: ( rule__Module__Group_5__1__Impl rule__Module__Group_5__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1085:2: rule__Module__Group_5__1__Impl rule__Module__Group_5__2
            {
            pushFollow(FOLLOW_rule__Module__Group_5__1__Impl_in_rule__Module__Group_5__12173);
            rule__Module__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_5__2_in_rule__Module__Group_5__12176);
            rule__Module__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__1"


    // $ANTLR start "rule__Module__Group_5__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1092:1: rule__Module__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Module__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1096:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1097:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1097:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1098:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group_5__1__Impl2204); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__1__Impl"


    // $ANTLR start "rule__Module__Group_5__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1111:1: rule__Module__Group_5__2 : rule__Module__Group_5__2__Impl rule__Module__Group_5__3 ;
    public final void rule__Module__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1115:1: ( rule__Module__Group_5__2__Impl rule__Module__Group_5__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1116:2: rule__Module__Group_5__2__Impl rule__Module__Group_5__3
            {
            pushFollow(FOLLOW_rule__Module__Group_5__2__Impl_in_rule__Module__Group_5__22235);
            rule__Module__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_5__3_in_rule__Module__Group_5__22238);
            rule__Module__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__2"


    // $ANTLR start "rule__Module__Group_5__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1123:1: rule__Module__Group_5__2__Impl : ( ( rule__Module__OutputAssignment_5_2 ) ) ;
    public final void rule__Module__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1127:1: ( ( ( rule__Module__OutputAssignment_5_2 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1128:1: ( ( rule__Module__OutputAssignment_5_2 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1128:1: ( ( rule__Module__OutputAssignment_5_2 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1129:1: ( rule__Module__OutputAssignment_5_2 )
            {
             before(grammarAccess.getModuleAccess().getOutputAssignment_5_2()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1130:1: ( rule__Module__OutputAssignment_5_2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1130:2: rule__Module__OutputAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Module__OutputAssignment_5_2_in_rule__Module__Group_5__2__Impl2265);
            rule__Module__OutputAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getOutputAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__2__Impl"


    // $ANTLR start "rule__Module__Group_5__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1140:1: rule__Module__Group_5__3 : rule__Module__Group_5__3__Impl rule__Module__Group_5__4 ;
    public final void rule__Module__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1144:1: ( rule__Module__Group_5__3__Impl rule__Module__Group_5__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1145:2: rule__Module__Group_5__3__Impl rule__Module__Group_5__4
            {
            pushFollow(FOLLOW_rule__Module__Group_5__3__Impl_in_rule__Module__Group_5__32295);
            rule__Module__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_5__4_in_rule__Module__Group_5__32298);
            rule__Module__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__3"


    // $ANTLR start "rule__Module__Group_5__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1152:1: rule__Module__Group_5__3__Impl : ( ( rule__Module__Group_5_3__0 )* ) ;
    public final void rule__Module__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1156:1: ( ( ( rule__Module__Group_5_3__0 )* ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1157:1: ( ( rule__Module__Group_5_3__0 )* )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1157:1: ( ( rule__Module__Group_5_3__0 )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1158:1: ( rule__Module__Group_5_3__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_5_3()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1159:1: ( rule__Module__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1159:2: rule__Module__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_5_3__0_in_rule__Module__Group_5__3__Impl2325);
            	    rule__Module__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__3__Impl"


    // $ANTLR start "rule__Module__Group_5__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1169:1: rule__Module__Group_5__4 : rule__Module__Group_5__4__Impl ;
    public final void rule__Module__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1173:1: ( rule__Module__Group_5__4__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1174:2: rule__Module__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_5__4__Impl_in_rule__Module__Group_5__42356);
            rule__Module__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__4"


    // $ANTLR start "rule__Module__Group_5__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1180:1: rule__Module__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Module__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1184:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1185:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1185:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1186:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group_5__4__Impl2384); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5__4__Impl"


    // $ANTLR start "rule__Module__Group_5_3__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1209:1: rule__Module__Group_5_3__0 : rule__Module__Group_5_3__0__Impl rule__Module__Group_5_3__1 ;
    public final void rule__Module__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1213:1: ( rule__Module__Group_5_3__0__Impl rule__Module__Group_5_3__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1214:2: rule__Module__Group_5_3__0__Impl rule__Module__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__Module__Group_5_3__0__Impl_in_rule__Module__Group_5_3__02425);
            rule__Module__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_5_3__1_in_rule__Module__Group_5_3__02428);
            rule__Module__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5_3__0"


    // $ANTLR start "rule__Module__Group_5_3__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1221:1: rule__Module__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Module__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1225:1: ( ( ',' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1226:1: ( ',' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1226:1: ( ',' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1227:1: ','
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Module__Group_5_3__0__Impl2456); 
             after(grammarAccess.getModuleAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5_3__0__Impl"


    // $ANTLR start "rule__Module__Group_5_3__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1240:1: rule__Module__Group_5_3__1 : rule__Module__Group_5_3__1__Impl ;
    public final void rule__Module__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1244:1: ( rule__Module__Group_5_3__1__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1245:2: rule__Module__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_5_3__1__Impl_in_rule__Module__Group_5_3__12487);
            rule__Module__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5_3__1"


    // $ANTLR start "rule__Module__Group_5_3__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1251:1: rule__Module__Group_5_3__1__Impl : ( ( rule__Module__OutputAssignment_5_3_1 ) ) ;
    public final void rule__Module__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1255:1: ( ( ( rule__Module__OutputAssignment_5_3_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1256:1: ( ( rule__Module__OutputAssignment_5_3_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1256:1: ( ( rule__Module__OutputAssignment_5_3_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1257:1: ( rule__Module__OutputAssignment_5_3_1 )
            {
             before(grammarAccess.getModuleAccess().getOutputAssignment_5_3_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1258:1: ( rule__Module__OutputAssignment_5_3_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1258:2: rule__Module__OutputAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__Module__OutputAssignment_5_3_1_in_rule__Module__Group_5_3__1__Impl2514);
            rule__Module__OutputAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getOutputAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_5_3__1__Impl"


    // $ANTLR start "rule__Module__Group_6__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1272:1: rule__Module__Group_6__0 : rule__Module__Group_6__0__Impl rule__Module__Group_6__1 ;
    public final void rule__Module__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1276:1: ( rule__Module__Group_6__0__Impl rule__Module__Group_6__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1277:2: rule__Module__Group_6__0__Impl rule__Module__Group_6__1
            {
            pushFollow(FOLLOW_rule__Module__Group_6__0__Impl_in_rule__Module__Group_6__02548);
            rule__Module__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_6__1_in_rule__Module__Group_6__02551);
            rule__Module__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__0"


    // $ANTLR start "rule__Module__Group_6__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1284:1: rule__Module__Group_6__0__Impl : ( 'instances' ) ;
    public final void rule__Module__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1288:1: ( ( 'instances' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1289:1: ( 'instances' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1289:1: ( 'instances' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1290:1: 'instances'
            {
             before(grammarAccess.getModuleAccess().getInstancesKeyword_6_0()); 
            match(input,18,FOLLOW_18_in_rule__Module__Group_6__0__Impl2579); 
             after(grammarAccess.getModuleAccess().getInstancesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__0__Impl"


    // $ANTLR start "rule__Module__Group_6__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1303:1: rule__Module__Group_6__1 : rule__Module__Group_6__1__Impl rule__Module__Group_6__2 ;
    public final void rule__Module__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1307:1: ( rule__Module__Group_6__1__Impl rule__Module__Group_6__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1308:2: rule__Module__Group_6__1__Impl rule__Module__Group_6__2
            {
            pushFollow(FOLLOW_rule__Module__Group_6__1__Impl_in_rule__Module__Group_6__12610);
            rule__Module__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_6__2_in_rule__Module__Group_6__12613);
            rule__Module__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__1"


    // $ANTLR start "rule__Module__Group_6__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1315:1: rule__Module__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Module__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1319:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1320:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1320:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1321:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group_6__1__Impl2641); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__1__Impl"


    // $ANTLR start "rule__Module__Group_6__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1334:1: rule__Module__Group_6__2 : rule__Module__Group_6__2__Impl rule__Module__Group_6__3 ;
    public final void rule__Module__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1338:1: ( rule__Module__Group_6__2__Impl rule__Module__Group_6__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1339:2: rule__Module__Group_6__2__Impl rule__Module__Group_6__3
            {
            pushFollow(FOLLOW_rule__Module__Group_6__2__Impl_in_rule__Module__Group_6__22672);
            rule__Module__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_6__3_in_rule__Module__Group_6__22675);
            rule__Module__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__2"


    // $ANTLR start "rule__Module__Group_6__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1346:1: rule__Module__Group_6__2__Impl : ( ( rule__Module__InstancesAssignment_6_2 ) ) ;
    public final void rule__Module__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1350:1: ( ( ( rule__Module__InstancesAssignment_6_2 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1351:1: ( ( rule__Module__InstancesAssignment_6_2 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1351:1: ( ( rule__Module__InstancesAssignment_6_2 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1352:1: ( rule__Module__InstancesAssignment_6_2 )
            {
             before(grammarAccess.getModuleAccess().getInstancesAssignment_6_2()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1353:1: ( rule__Module__InstancesAssignment_6_2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1353:2: rule__Module__InstancesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Module__InstancesAssignment_6_2_in_rule__Module__Group_6__2__Impl2702);
            rule__Module__InstancesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getInstancesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__2__Impl"


    // $ANTLR start "rule__Module__Group_6__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1363:1: rule__Module__Group_6__3 : rule__Module__Group_6__3__Impl rule__Module__Group_6__4 ;
    public final void rule__Module__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1367:1: ( rule__Module__Group_6__3__Impl rule__Module__Group_6__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1368:2: rule__Module__Group_6__3__Impl rule__Module__Group_6__4
            {
            pushFollow(FOLLOW_rule__Module__Group_6__3__Impl_in_rule__Module__Group_6__32732);
            rule__Module__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_6__4_in_rule__Module__Group_6__32735);
            rule__Module__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__3"


    // $ANTLR start "rule__Module__Group_6__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1375:1: rule__Module__Group_6__3__Impl : ( ( rule__Module__Group_6_3__0 )* ) ;
    public final void rule__Module__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1379:1: ( ( ( rule__Module__Group_6_3__0 )* ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1380:1: ( ( rule__Module__Group_6_3__0 )* )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1380:1: ( ( rule__Module__Group_6_3__0 )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1381:1: ( rule__Module__Group_6_3__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_6_3()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1382:1: ( rule__Module__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1382:2: rule__Module__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_6_3__0_in_rule__Module__Group_6__3__Impl2762);
            	    rule__Module__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__3__Impl"


    // $ANTLR start "rule__Module__Group_6__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1392:1: rule__Module__Group_6__4 : rule__Module__Group_6__4__Impl ;
    public final void rule__Module__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1396:1: ( rule__Module__Group_6__4__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1397:2: rule__Module__Group_6__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_6__4__Impl_in_rule__Module__Group_6__42793);
            rule__Module__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__4"


    // $ANTLR start "rule__Module__Group_6__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1403:1: rule__Module__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Module__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1407:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1408:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1408:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1409:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group_6__4__Impl2821); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6__4__Impl"


    // $ANTLR start "rule__Module__Group_6_3__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1432:1: rule__Module__Group_6_3__0 : rule__Module__Group_6_3__0__Impl rule__Module__Group_6_3__1 ;
    public final void rule__Module__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1436:1: ( rule__Module__Group_6_3__0__Impl rule__Module__Group_6_3__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1437:2: rule__Module__Group_6_3__0__Impl rule__Module__Group_6_3__1
            {
            pushFollow(FOLLOW_rule__Module__Group_6_3__0__Impl_in_rule__Module__Group_6_3__02862);
            rule__Module__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_6_3__1_in_rule__Module__Group_6_3__02865);
            rule__Module__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6_3__0"


    // $ANTLR start "rule__Module__Group_6_3__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1444:1: rule__Module__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Module__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1448:1: ( ( ',' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1449:1: ( ',' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1449:1: ( ',' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1450:1: ','
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Module__Group_6_3__0__Impl2893); 
             after(grammarAccess.getModuleAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6_3__0__Impl"


    // $ANTLR start "rule__Module__Group_6_3__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1463:1: rule__Module__Group_6_3__1 : rule__Module__Group_6_3__1__Impl ;
    public final void rule__Module__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1467:1: ( rule__Module__Group_6_3__1__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1468:2: rule__Module__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_6_3__1__Impl_in_rule__Module__Group_6_3__12924);
            rule__Module__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6_3__1"


    // $ANTLR start "rule__Module__Group_6_3__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1474:1: rule__Module__Group_6_3__1__Impl : ( ( rule__Module__InstancesAssignment_6_3_1 ) ) ;
    public final void rule__Module__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1478:1: ( ( ( rule__Module__InstancesAssignment_6_3_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1479:1: ( ( rule__Module__InstancesAssignment_6_3_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1479:1: ( ( rule__Module__InstancesAssignment_6_3_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1480:1: ( rule__Module__InstancesAssignment_6_3_1 )
            {
             before(grammarAccess.getModuleAccess().getInstancesAssignment_6_3_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1481:1: ( rule__Module__InstancesAssignment_6_3_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1481:2: rule__Module__InstancesAssignment_6_3_1
            {
            pushFollow(FOLLOW_rule__Module__InstancesAssignment_6_3_1_in_rule__Module__Group_6_3__1__Impl2951);
            rule__Module__InstancesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getInstancesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_6_3__1__Impl"


    // $ANTLR start "rule__Module__Group_7__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1495:1: rule__Module__Group_7__0 : rule__Module__Group_7__0__Impl rule__Module__Group_7__1 ;
    public final void rule__Module__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1499:1: ( rule__Module__Group_7__0__Impl rule__Module__Group_7__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1500:2: rule__Module__Group_7__0__Impl rule__Module__Group_7__1
            {
            pushFollow(FOLLOW_rule__Module__Group_7__0__Impl_in_rule__Module__Group_7__02985);
            rule__Module__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_7__1_in_rule__Module__Group_7__02988);
            rule__Module__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__0"


    // $ANTLR start "rule__Module__Group_7__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1507:1: rule__Module__Group_7__0__Impl : ( 'types' ) ;
    public final void rule__Module__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1511:1: ( ( 'types' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1512:1: ( 'types' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1512:1: ( 'types' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1513:1: 'types'
            {
             before(grammarAccess.getModuleAccess().getTypesKeyword_7_0()); 
            match(input,19,FOLLOW_19_in_rule__Module__Group_7__0__Impl3016); 
             after(grammarAccess.getModuleAccess().getTypesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__0__Impl"


    // $ANTLR start "rule__Module__Group_7__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1526:1: rule__Module__Group_7__1 : rule__Module__Group_7__1__Impl rule__Module__Group_7__2 ;
    public final void rule__Module__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1530:1: ( rule__Module__Group_7__1__Impl rule__Module__Group_7__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1531:2: rule__Module__Group_7__1__Impl rule__Module__Group_7__2
            {
            pushFollow(FOLLOW_rule__Module__Group_7__1__Impl_in_rule__Module__Group_7__13047);
            rule__Module__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_7__2_in_rule__Module__Group_7__13050);
            rule__Module__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__1"


    // $ANTLR start "rule__Module__Group_7__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1538:1: rule__Module__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Module__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1542:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1543:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1543:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1544:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group_7__1__Impl3078); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__1__Impl"


    // $ANTLR start "rule__Module__Group_7__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1557:1: rule__Module__Group_7__2 : rule__Module__Group_7__2__Impl rule__Module__Group_7__3 ;
    public final void rule__Module__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1561:1: ( rule__Module__Group_7__2__Impl rule__Module__Group_7__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1562:2: rule__Module__Group_7__2__Impl rule__Module__Group_7__3
            {
            pushFollow(FOLLOW_rule__Module__Group_7__2__Impl_in_rule__Module__Group_7__23109);
            rule__Module__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_7__3_in_rule__Module__Group_7__23112);
            rule__Module__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__2"


    // $ANTLR start "rule__Module__Group_7__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1569:1: rule__Module__Group_7__2__Impl : ( ( rule__Module__TypesAssignment_7_2 ) ) ;
    public final void rule__Module__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1573:1: ( ( ( rule__Module__TypesAssignment_7_2 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1574:1: ( ( rule__Module__TypesAssignment_7_2 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1574:1: ( ( rule__Module__TypesAssignment_7_2 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1575:1: ( rule__Module__TypesAssignment_7_2 )
            {
             before(grammarAccess.getModuleAccess().getTypesAssignment_7_2()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1576:1: ( rule__Module__TypesAssignment_7_2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1576:2: rule__Module__TypesAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Module__TypesAssignment_7_2_in_rule__Module__Group_7__2__Impl3139);
            rule__Module__TypesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getTypesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__2__Impl"


    // $ANTLR start "rule__Module__Group_7__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1586:1: rule__Module__Group_7__3 : rule__Module__Group_7__3__Impl rule__Module__Group_7__4 ;
    public final void rule__Module__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1590:1: ( rule__Module__Group_7__3__Impl rule__Module__Group_7__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1591:2: rule__Module__Group_7__3__Impl rule__Module__Group_7__4
            {
            pushFollow(FOLLOW_rule__Module__Group_7__3__Impl_in_rule__Module__Group_7__33169);
            rule__Module__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_7__4_in_rule__Module__Group_7__33172);
            rule__Module__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__3"


    // $ANTLR start "rule__Module__Group_7__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1598:1: rule__Module__Group_7__3__Impl : ( ( rule__Module__Group_7_3__0 )* ) ;
    public final void rule__Module__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1602:1: ( ( ( rule__Module__Group_7_3__0 )* ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1603:1: ( ( rule__Module__Group_7_3__0 )* )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1603:1: ( ( rule__Module__Group_7_3__0 )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1604:1: ( rule__Module__Group_7_3__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_7_3()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1605:1: ( rule__Module__Group_7_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1605:2: rule__Module__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_7_3__0_in_rule__Module__Group_7__3__Impl3199);
            	    rule__Module__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__3__Impl"


    // $ANTLR start "rule__Module__Group_7__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1615:1: rule__Module__Group_7__4 : rule__Module__Group_7__4__Impl ;
    public final void rule__Module__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1619:1: ( rule__Module__Group_7__4__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1620:2: rule__Module__Group_7__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_7__4__Impl_in_rule__Module__Group_7__43230);
            rule__Module__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__4"


    // $ANTLR start "rule__Module__Group_7__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1626:1: rule__Module__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Module__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1630:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1631:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1631:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1632:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group_7__4__Impl3258); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7__4__Impl"


    // $ANTLR start "rule__Module__Group_7_3__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1655:1: rule__Module__Group_7_3__0 : rule__Module__Group_7_3__0__Impl rule__Module__Group_7_3__1 ;
    public final void rule__Module__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1659:1: ( rule__Module__Group_7_3__0__Impl rule__Module__Group_7_3__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1660:2: rule__Module__Group_7_3__0__Impl rule__Module__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__Module__Group_7_3__0__Impl_in_rule__Module__Group_7_3__03299);
            rule__Module__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_7_3__1_in_rule__Module__Group_7_3__03302);
            rule__Module__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7_3__0"


    // $ANTLR start "rule__Module__Group_7_3__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1667:1: rule__Module__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Module__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1671:1: ( ( ',' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1672:1: ( ',' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1672:1: ( ',' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1673:1: ','
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_7_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Module__Group_7_3__0__Impl3330); 
             after(grammarAccess.getModuleAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7_3__0__Impl"


    // $ANTLR start "rule__Module__Group_7_3__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1686:1: rule__Module__Group_7_3__1 : rule__Module__Group_7_3__1__Impl ;
    public final void rule__Module__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1690:1: ( rule__Module__Group_7_3__1__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1691:2: rule__Module__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_7_3__1__Impl_in_rule__Module__Group_7_3__13361);
            rule__Module__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7_3__1"


    // $ANTLR start "rule__Module__Group_7_3__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1697:1: rule__Module__Group_7_3__1__Impl : ( ( rule__Module__TypesAssignment_7_3_1 ) ) ;
    public final void rule__Module__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1701:1: ( ( ( rule__Module__TypesAssignment_7_3_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1702:1: ( ( rule__Module__TypesAssignment_7_3_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1702:1: ( ( rule__Module__TypesAssignment_7_3_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1703:1: ( rule__Module__TypesAssignment_7_3_1 )
            {
             before(grammarAccess.getModuleAccess().getTypesAssignment_7_3_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1704:1: ( rule__Module__TypesAssignment_7_3_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1704:2: rule__Module__TypesAssignment_7_3_1
            {
            pushFollow(FOLLOW_rule__Module__TypesAssignment_7_3_1_in_rule__Module__Group_7_3__1__Impl3388);
            rule__Module__TypesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getTypesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_7_3__1__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1718:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1722:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1723:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03422);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03425);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1730:1: rule__Input__Group__0__Impl : ( 'Input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1734:1: ( ( 'Input' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1735:1: ( 'Input' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1735:1: ( 'Input' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1736:1: 'Input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Input__Group__0__Impl3453); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1749:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1753:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1754:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13484);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__13487);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1761:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1765:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1766:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1766:1: ( ( rule__Input__NameAssignment_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1767:1: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1768:1: ( rule__Input__NameAssignment_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1768:2: rule__Input__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__NameAssignment_1_in_rule__Input__Group__1__Impl3514);
            rule__Input__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1778:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1782:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1783:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__23544);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__23547);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1790:1: rule__Input__Group__2__Impl : ( '{' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1794:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1795:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1795:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1796:1: '{'
            {
             before(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Input__Group__2__Impl3575); 
             after(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1809:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1813:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1814:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__33606);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__33609);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1821:1: rule__Input__Group__3__Impl : ( 'type' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1825:1: ( ( 'type' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1826:1: ( 'type' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1826:1: ( 'type' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1827:1: 'type'
            {
             before(grammarAccess.getInputAccess().getTypeKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Input__Group__3__Impl3637); 
             after(grammarAccess.getInputAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1840:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1844:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1845:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__43668);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__5_in_rule__Input__Group__43671);
            rule__Input__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1852:1: rule__Input__Group__4__Impl : ( ( rule__Input__TypeAssignment_4 ) ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1856:1: ( ( ( rule__Input__TypeAssignment_4 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1857:1: ( ( rule__Input__TypeAssignment_4 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1857:1: ( ( rule__Input__TypeAssignment_4 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1858:1: ( rule__Input__TypeAssignment_4 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1859:1: ( rule__Input__TypeAssignment_4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1859:2: rule__Input__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Input__TypeAssignment_4_in_rule__Input__Group__4__Impl3698);
            rule__Input__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Input__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1869:1: rule__Input__Group__5 : rule__Input__Group__5__Impl ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1873:1: ( rule__Input__Group__5__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1874:2: rule__Input__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__53728);
            rule__Input__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5"


    // $ANTLR start "rule__Input__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1880:1: rule__Input__Group__5__Impl : ( '}' ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1884:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1885:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1885:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1886:1: '}'
            {
             before(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Input__Group__5__Impl3756); 
             after(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1911:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1915:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1916:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03799);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03802);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1923:1: rule__Output__Group__0__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1927:1: ( ( 'Output' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1928:1: ( 'Output' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1928:1: ( 'Output' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1929:1: 'Output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Output__Group__0__Impl3830); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1942:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1946:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1947:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13861);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Output__Group__2_in_rule__Output__Group__13864);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1954:1: rule__Output__Group__1__Impl : ( ( rule__Output__NameAssignment_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1958:1: ( ( ( rule__Output__NameAssignment_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1959:1: ( ( rule__Output__NameAssignment_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1959:1: ( ( rule__Output__NameAssignment_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1960:1: ( rule__Output__NameAssignment_1 )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1961:1: ( rule__Output__NameAssignment_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1961:2: rule__Output__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Output__NameAssignment_1_in_rule__Output__Group__1__Impl3891);
            rule__Output__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1971:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1975:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1976:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_rule__Output__Group__2__Impl_in_rule__Output__Group__23921);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Output__Group__3_in_rule__Output__Group__23924);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1983:1: rule__Output__Group__2__Impl : ( '{' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1987:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1988:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1988:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:1989:1: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Output__Group__2__Impl3952); 
             after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2002:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2006:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2007:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_rule__Output__Group__3__Impl_in_rule__Output__Group__33983);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Output__Group__4_in_rule__Output__Group__33986);
            rule__Output__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2014:1: rule__Output__Group__3__Impl : ( 'type' ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2018:1: ( ( 'type' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2019:1: ( 'type' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2019:1: ( 'type' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2020:1: 'type'
            {
             before(grammarAccess.getOutputAccess().getTypeKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Output__Group__3__Impl4014); 
             after(grammarAccess.getOutputAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2033:1: rule__Output__Group__4 : rule__Output__Group__4__Impl rule__Output__Group__5 ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2037:1: ( rule__Output__Group__4__Impl rule__Output__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2038:2: rule__Output__Group__4__Impl rule__Output__Group__5
            {
            pushFollow(FOLLOW_rule__Output__Group__4__Impl_in_rule__Output__Group__44045);
            rule__Output__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Output__Group__5_in_rule__Output__Group__44048);
            rule__Output__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2045:1: rule__Output__Group__4__Impl : ( ( rule__Output__TypeAssignment_4 ) ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2049:1: ( ( ( rule__Output__TypeAssignment_4 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2050:1: ( ( rule__Output__TypeAssignment_4 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2050:1: ( ( rule__Output__TypeAssignment_4 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2051:1: ( rule__Output__TypeAssignment_4 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2052:1: ( rule__Output__TypeAssignment_4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2052:2: rule__Output__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Output__TypeAssignment_4_in_rule__Output__Group__4__Impl4075);
            rule__Output__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2062:1: rule__Output__Group__5 : rule__Output__Group__5__Impl rule__Output__Group__6 ;
    public final void rule__Output__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2066:1: ( rule__Output__Group__5__Impl rule__Output__Group__6 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2067:2: rule__Output__Group__5__Impl rule__Output__Group__6
            {
            pushFollow(FOLLOW_rule__Output__Group__5__Impl_in_rule__Output__Group__54105);
            rule__Output__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Output__Group__6_in_rule__Output__Group__54108);
            rule__Output__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__5"


    // $ANTLR start "rule__Output__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2074:1: rule__Output__Group__5__Impl : ( ( rule__Output__Group_5__0 )? ) ;
    public final void rule__Output__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2078:1: ( ( ( rule__Output__Group_5__0 )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2079:1: ( ( rule__Output__Group_5__0 )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2079:1: ( ( rule__Output__Group_5__0 )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2080:1: ( rule__Output__Group_5__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_5()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2081:1: ( rule__Output__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2081:2: rule__Output__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Output__Group_5__0_in_rule__Output__Group__5__Impl4135);
                    rule__Output__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__5__Impl"


    // $ANTLR start "rule__Output__Group__6"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2091:1: rule__Output__Group__6 : rule__Output__Group__6__Impl ;
    public final void rule__Output__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2095:1: ( rule__Output__Group__6__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2096:2: rule__Output__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__6__Impl_in_rule__Output__Group__64166);
            rule__Output__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__6"


    // $ANTLR start "rule__Output__Group__6__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2102:1: rule__Output__Group__6__Impl : ( '}' ) ;
    public final void rule__Output__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2106:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2107:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2107:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2108:1: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Output__Group__6__Impl4194); 
             after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__6__Impl"


    // $ANTLR start "rule__Output__Group_5__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2135:1: rule__Output__Group_5__0 : rule__Output__Group_5__0__Impl rule__Output__Group_5__1 ;
    public final void rule__Output__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2139:1: ( rule__Output__Group_5__0__Impl rule__Output__Group_5__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2140:2: rule__Output__Group_5__0__Impl rule__Output__Group_5__1
            {
            pushFollow(FOLLOW_rule__Output__Group_5__0__Impl_in_rule__Output__Group_5__04239);
            rule__Output__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Output__Group_5__1_in_rule__Output__Group_5__04242);
            rule__Output__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_5__0"


    // $ANTLR start "rule__Output__Group_5__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2147:1: rule__Output__Group_5__0__Impl : ( 'left' ) ;
    public final void rule__Output__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2151:1: ( ( 'left' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2152:1: ( 'left' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2152:1: ( 'left' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2153:1: 'left'
            {
             before(grammarAccess.getOutputAccess().getLeftKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Output__Group_5__0__Impl4270); 
             after(grammarAccess.getOutputAccess().getLeftKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_5__0__Impl"


    // $ANTLR start "rule__Output__Group_5__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2166:1: rule__Output__Group_5__1 : rule__Output__Group_5__1__Impl ;
    public final void rule__Output__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2170:1: ( rule__Output__Group_5__1__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2171:2: rule__Output__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_5__1__Impl_in_rule__Output__Group_5__14301);
            rule__Output__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_5__1"


    // $ANTLR start "rule__Output__Group_5__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2177:1: rule__Output__Group_5__1__Impl : ( ( rule__Output__LeftAssignment_5_1 ) ) ;
    public final void rule__Output__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2181:1: ( ( ( rule__Output__LeftAssignment_5_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2182:1: ( ( rule__Output__LeftAssignment_5_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2182:1: ( ( rule__Output__LeftAssignment_5_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2183:1: ( rule__Output__LeftAssignment_5_1 )
            {
             before(grammarAccess.getOutputAccess().getLeftAssignment_5_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2184:1: ( rule__Output__LeftAssignment_5_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2184:2: rule__Output__LeftAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Output__LeftAssignment_5_1_in_rule__Output__Group_5__1__Impl4328);
            rule__Output__LeftAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getLeftAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_5__1__Impl"


    // $ANTLR start "rule__ModuleInstances__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2198:1: rule__ModuleInstances__Group__0 : rule__ModuleInstances__Group__0__Impl rule__ModuleInstances__Group__1 ;
    public final void rule__ModuleInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2202:1: ( rule__ModuleInstances__Group__0__Impl rule__ModuleInstances__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2203:2: rule__ModuleInstances__Group__0__Impl rule__ModuleInstances__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group__0__Impl_in_rule__ModuleInstances__Group__04362);
            rule__ModuleInstances__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group__1_in_rule__ModuleInstances__Group__04365);
            rule__ModuleInstances__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__0"


    // $ANTLR start "rule__ModuleInstances__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2210:1: rule__ModuleInstances__Group__0__Impl : ( 'ModuleInstances' ) ;
    public final void rule__ModuleInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2214:1: ( ( 'ModuleInstances' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2215:1: ( 'ModuleInstances' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2215:1: ( 'ModuleInstances' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2216:1: 'ModuleInstances'
            {
             before(grammarAccess.getModuleInstancesAccess().getModuleInstancesKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ModuleInstances__Group__0__Impl4393); 
             after(grammarAccess.getModuleInstancesAccess().getModuleInstancesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__0__Impl"


    // $ANTLR start "rule__ModuleInstances__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2229:1: rule__ModuleInstances__Group__1 : rule__ModuleInstances__Group__1__Impl rule__ModuleInstances__Group__2 ;
    public final void rule__ModuleInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2233:1: ( rule__ModuleInstances__Group__1__Impl rule__ModuleInstances__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2234:2: rule__ModuleInstances__Group__1__Impl rule__ModuleInstances__Group__2
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group__1__Impl_in_rule__ModuleInstances__Group__14424);
            rule__ModuleInstances__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group__2_in_rule__ModuleInstances__Group__14427);
            rule__ModuleInstances__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__1"


    // $ANTLR start "rule__ModuleInstances__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2241:1: rule__ModuleInstances__Group__1__Impl : ( ( rule__ModuleInstances__NameAssignment_1 ) ) ;
    public final void rule__ModuleInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2245:1: ( ( ( rule__ModuleInstances__NameAssignment_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2246:1: ( ( rule__ModuleInstances__NameAssignment_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2246:1: ( ( rule__ModuleInstances__NameAssignment_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2247:1: ( rule__ModuleInstances__NameAssignment_1 )
            {
             before(grammarAccess.getModuleInstancesAccess().getNameAssignment_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2248:1: ( rule__ModuleInstances__NameAssignment_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2248:2: rule__ModuleInstances__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ModuleInstances__NameAssignment_1_in_rule__ModuleInstances__Group__1__Impl4454);
            rule__ModuleInstances__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleInstancesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__1__Impl"


    // $ANTLR start "rule__ModuleInstances__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2258:1: rule__ModuleInstances__Group__2 : rule__ModuleInstances__Group__2__Impl rule__ModuleInstances__Group__3 ;
    public final void rule__ModuleInstances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2262:1: ( rule__ModuleInstances__Group__2__Impl rule__ModuleInstances__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2263:2: rule__ModuleInstances__Group__2__Impl rule__ModuleInstances__Group__3
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group__2__Impl_in_rule__ModuleInstances__Group__24484);
            rule__ModuleInstances__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group__3_in_rule__ModuleInstances__Group__24487);
            rule__ModuleInstances__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__2"


    // $ANTLR start "rule__ModuleInstances__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2270:1: rule__ModuleInstances__Group__2__Impl : ( '{' ) ;
    public final void rule__ModuleInstances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2274:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2275:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2275:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2276:1: '{'
            {
             before(grammarAccess.getModuleInstancesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__ModuleInstances__Group__2__Impl4515); 
             after(grammarAccess.getModuleInstancesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__2__Impl"


    // $ANTLR start "rule__ModuleInstances__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2289:1: rule__ModuleInstances__Group__3 : rule__ModuleInstances__Group__3__Impl rule__ModuleInstances__Group__4 ;
    public final void rule__ModuleInstances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2293:1: ( rule__ModuleInstances__Group__3__Impl rule__ModuleInstances__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2294:2: rule__ModuleInstances__Group__3__Impl rule__ModuleInstances__Group__4
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group__3__Impl_in_rule__ModuleInstances__Group__34546);
            rule__ModuleInstances__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group__4_in_rule__ModuleInstances__Group__34549);
            rule__ModuleInstances__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__3"


    // $ANTLR start "rule__ModuleInstances__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2301:1: rule__ModuleInstances__Group__3__Impl : ( 'desc' ) ;
    public final void rule__ModuleInstances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2305:1: ( ( 'desc' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2306:1: ( 'desc' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2306:1: ( 'desc' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2307:1: 'desc'
            {
             before(grammarAccess.getModuleInstancesAccess().getDescKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__ModuleInstances__Group__3__Impl4577); 
             after(grammarAccess.getModuleInstancesAccess().getDescKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__3__Impl"


    // $ANTLR start "rule__ModuleInstances__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2320:1: rule__ModuleInstances__Group__4 : rule__ModuleInstances__Group__4__Impl rule__ModuleInstances__Group__5 ;
    public final void rule__ModuleInstances__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2324:1: ( rule__ModuleInstances__Group__4__Impl rule__ModuleInstances__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2325:2: rule__ModuleInstances__Group__4__Impl rule__ModuleInstances__Group__5
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group__4__Impl_in_rule__ModuleInstances__Group__44608);
            rule__ModuleInstances__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group__5_in_rule__ModuleInstances__Group__44611);
            rule__ModuleInstances__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__4"


    // $ANTLR start "rule__ModuleInstances__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2332:1: rule__ModuleInstances__Group__4__Impl : ( ( rule__ModuleInstances__DescAssignment_4 ) ) ;
    public final void rule__ModuleInstances__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2336:1: ( ( ( rule__ModuleInstances__DescAssignment_4 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2337:1: ( ( rule__ModuleInstances__DescAssignment_4 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2337:1: ( ( rule__ModuleInstances__DescAssignment_4 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2338:1: ( rule__ModuleInstances__DescAssignment_4 )
            {
             before(grammarAccess.getModuleInstancesAccess().getDescAssignment_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2339:1: ( rule__ModuleInstances__DescAssignment_4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2339:2: rule__ModuleInstances__DescAssignment_4
            {
            pushFollow(FOLLOW_rule__ModuleInstances__DescAssignment_4_in_rule__ModuleInstances__Group__4__Impl4638);
            rule__ModuleInstances__DescAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModuleInstancesAccess().getDescAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__4__Impl"


    // $ANTLR start "rule__ModuleInstances__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2349:1: rule__ModuleInstances__Group__5 : rule__ModuleInstances__Group__5__Impl rule__ModuleInstances__Group__6 ;
    public final void rule__ModuleInstances__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2353:1: ( rule__ModuleInstances__Group__5__Impl rule__ModuleInstances__Group__6 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2354:2: rule__ModuleInstances__Group__5__Impl rule__ModuleInstances__Group__6
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group__5__Impl_in_rule__ModuleInstances__Group__54668);
            rule__ModuleInstances__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group__6_in_rule__ModuleInstances__Group__54671);
            rule__ModuleInstances__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__5"


    // $ANTLR start "rule__ModuleInstances__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2361:1: rule__ModuleInstances__Group__5__Impl : ( ( rule__ModuleInstances__Group_5__0 )? ) ;
    public final void rule__ModuleInstances__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2365:1: ( ( ( rule__ModuleInstances__Group_5__0 )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2366:1: ( ( rule__ModuleInstances__Group_5__0 )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2366:1: ( ( rule__ModuleInstances__Group_5__0 )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2367:1: ( rule__ModuleInstances__Group_5__0 )?
            {
             before(grammarAccess.getModuleInstancesAccess().getGroup_5()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2368:1: ( rule__ModuleInstances__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2368:2: rule__ModuleInstances__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ModuleInstances__Group_5__0_in_rule__ModuleInstances__Group__5__Impl4698);
                    rule__ModuleInstances__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleInstancesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__5__Impl"


    // $ANTLR start "rule__ModuleInstances__Group__6"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2378:1: rule__ModuleInstances__Group__6 : rule__ModuleInstances__Group__6__Impl ;
    public final void rule__ModuleInstances__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2382:1: ( rule__ModuleInstances__Group__6__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2383:2: rule__ModuleInstances__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group__6__Impl_in_rule__ModuleInstances__Group__64729);
            rule__ModuleInstances__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__6"


    // $ANTLR start "rule__ModuleInstances__Group__6__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2389:1: rule__ModuleInstances__Group__6__Impl : ( '}' ) ;
    public final void rule__ModuleInstances__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2393:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2394:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2394:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2395:1: '}'
            {
             before(grammarAccess.getModuleInstancesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__ModuleInstances__Group__6__Impl4757); 
             after(grammarAccess.getModuleInstancesAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group__6__Impl"


    // $ANTLR start "rule__ModuleInstances__Group_5__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2422:1: rule__ModuleInstances__Group_5__0 : rule__ModuleInstances__Group_5__0__Impl rule__ModuleInstances__Group_5__1 ;
    public final void rule__ModuleInstances__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2426:1: ( rule__ModuleInstances__Group_5__0__Impl rule__ModuleInstances__Group_5__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2427:2: rule__ModuleInstances__Group_5__0__Impl rule__ModuleInstances__Group_5__1
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__0__Impl_in_rule__ModuleInstances__Group_5__04802);
            rule__ModuleInstances__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__1_in_rule__ModuleInstances__Group_5__04805);
            rule__ModuleInstances__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__0"


    // $ANTLR start "rule__ModuleInstances__Group_5__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2434:1: rule__ModuleInstances__Group_5__0__Impl : ( 'left' ) ;
    public final void rule__ModuleInstances__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2438:1: ( ( 'left' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2439:1: ( 'left' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2439:1: ( 'left' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2440:1: 'left'
            {
             before(grammarAccess.getModuleInstancesAccess().getLeftKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__ModuleInstances__Group_5__0__Impl4833); 
             after(grammarAccess.getModuleInstancesAccess().getLeftKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__0__Impl"


    // $ANTLR start "rule__ModuleInstances__Group_5__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2453:1: rule__ModuleInstances__Group_5__1 : rule__ModuleInstances__Group_5__1__Impl rule__ModuleInstances__Group_5__2 ;
    public final void rule__ModuleInstances__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2457:1: ( rule__ModuleInstances__Group_5__1__Impl rule__ModuleInstances__Group_5__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2458:2: rule__ModuleInstances__Group_5__1__Impl rule__ModuleInstances__Group_5__2
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__1__Impl_in_rule__ModuleInstances__Group_5__14864);
            rule__ModuleInstances__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__2_in_rule__ModuleInstances__Group_5__14867);
            rule__ModuleInstances__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__1"


    // $ANTLR start "rule__ModuleInstances__Group_5__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2465:1: rule__ModuleInstances__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ModuleInstances__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2469:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2470:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2470:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2471:1: '{'
            {
             before(grammarAccess.getModuleInstancesAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FOLLOW_13_in_rule__ModuleInstances__Group_5__1__Impl4895); 
             after(grammarAccess.getModuleInstancesAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__1__Impl"


    // $ANTLR start "rule__ModuleInstances__Group_5__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2484:1: rule__ModuleInstances__Group_5__2 : rule__ModuleInstances__Group_5__2__Impl rule__ModuleInstances__Group_5__3 ;
    public final void rule__ModuleInstances__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2488:1: ( rule__ModuleInstances__Group_5__2__Impl rule__ModuleInstances__Group_5__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2489:2: rule__ModuleInstances__Group_5__2__Impl rule__ModuleInstances__Group_5__3
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__2__Impl_in_rule__ModuleInstances__Group_5__24926);
            rule__ModuleInstances__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__3_in_rule__ModuleInstances__Group_5__24929);
            rule__ModuleInstances__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__2"


    // $ANTLR start "rule__ModuleInstances__Group_5__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2496:1: rule__ModuleInstances__Group_5__2__Impl : ( ( rule__ModuleInstances__LeftAssignment_5_2 ) ) ;
    public final void rule__ModuleInstances__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2500:1: ( ( ( rule__ModuleInstances__LeftAssignment_5_2 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2501:1: ( ( rule__ModuleInstances__LeftAssignment_5_2 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2501:1: ( ( rule__ModuleInstances__LeftAssignment_5_2 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2502:1: ( rule__ModuleInstances__LeftAssignment_5_2 )
            {
             before(grammarAccess.getModuleInstancesAccess().getLeftAssignment_5_2()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2503:1: ( rule__ModuleInstances__LeftAssignment_5_2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2503:2: rule__ModuleInstances__LeftAssignment_5_2
            {
            pushFollow(FOLLOW_rule__ModuleInstances__LeftAssignment_5_2_in_rule__ModuleInstances__Group_5__2__Impl4956);
            rule__ModuleInstances__LeftAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleInstancesAccess().getLeftAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__2__Impl"


    // $ANTLR start "rule__ModuleInstances__Group_5__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2513:1: rule__ModuleInstances__Group_5__3 : rule__ModuleInstances__Group_5__3__Impl rule__ModuleInstances__Group_5__4 ;
    public final void rule__ModuleInstances__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2517:1: ( rule__ModuleInstances__Group_5__3__Impl rule__ModuleInstances__Group_5__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2518:2: rule__ModuleInstances__Group_5__3__Impl rule__ModuleInstances__Group_5__4
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__3__Impl_in_rule__ModuleInstances__Group_5__34986);
            rule__ModuleInstances__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__4_in_rule__ModuleInstances__Group_5__34989);
            rule__ModuleInstances__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__3"


    // $ANTLR start "rule__ModuleInstances__Group_5__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2525:1: rule__ModuleInstances__Group_5__3__Impl : ( ( rule__ModuleInstances__Group_5_3__0 )* ) ;
    public final void rule__ModuleInstances__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2529:1: ( ( ( rule__ModuleInstances__Group_5_3__0 )* ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2530:1: ( ( rule__ModuleInstances__Group_5_3__0 )* )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2530:1: ( ( rule__ModuleInstances__Group_5_3__0 )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2531:1: ( rule__ModuleInstances__Group_5_3__0 )*
            {
             before(grammarAccess.getModuleInstancesAccess().getGroup_5_3()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2532:1: ( rule__ModuleInstances__Group_5_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2532:2: rule__ModuleInstances__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ModuleInstances__Group_5_3__0_in_rule__ModuleInstances__Group_5__3__Impl5016);
            	    rule__ModuleInstances__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModuleInstancesAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__3__Impl"


    // $ANTLR start "rule__ModuleInstances__Group_5__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2542:1: rule__ModuleInstances__Group_5__4 : rule__ModuleInstances__Group_5__4__Impl ;
    public final void rule__ModuleInstances__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2546:1: ( rule__ModuleInstances__Group_5__4__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2547:2: rule__ModuleInstances__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group_5__4__Impl_in_rule__ModuleInstances__Group_5__45047);
            rule__ModuleInstances__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__4"


    // $ANTLR start "rule__ModuleInstances__Group_5__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2553:1: rule__ModuleInstances__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ModuleInstances__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2557:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2558:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2558:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2559:1: '}'
            {
             before(grammarAccess.getModuleInstancesAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_14_in_rule__ModuleInstances__Group_5__4__Impl5075); 
             after(grammarAccess.getModuleInstancesAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5__4__Impl"


    // $ANTLR start "rule__ModuleInstances__Group_5_3__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2582:1: rule__ModuleInstances__Group_5_3__0 : rule__ModuleInstances__Group_5_3__0__Impl rule__ModuleInstances__Group_5_3__1 ;
    public final void rule__ModuleInstances__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2586:1: ( rule__ModuleInstances__Group_5_3__0__Impl rule__ModuleInstances__Group_5_3__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2587:2: rule__ModuleInstances__Group_5_3__0__Impl rule__ModuleInstances__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group_5_3__0__Impl_in_rule__ModuleInstances__Group_5_3__05116);
            rule__ModuleInstances__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleInstances__Group_5_3__1_in_rule__ModuleInstances__Group_5_3__05119);
            rule__ModuleInstances__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5_3__0"


    // $ANTLR start "rule__ModuleInstances__Group_5_3__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2594:1: rule__ModuleInstances__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ModuleInstances__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2598:1: ( ( ',' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2599:1: ( ',' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2599:1: ( ',' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2600:1: ','
            {
             before(grammarAccess.getModuleInstancesAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_16_in_rule__ModuleInstances__Group_5_3__0__Impl5147); 
             after(grammarAccess.getModuleInstancesAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5_3__0__Impl"


    // $ANTLR start "rule__ModuleInstances__Group_5_3__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2613:1: rule__ModuleInstances__Group_5_3__1 : rule__ModuleInstances__Group_5_3__1__Impl ;
    public final void rule__ModuleInstances__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2617:1: ( rule__ModuleInstances__Group_5_3__1__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2618:2: rule__ModuleInstances__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleInstances__Group_5_3__1__Impl_in_rule__ModuleInstances__Group_5_3__15178);
            rule__ModuleInstances__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5_3__1"


    // $ANTLR start "rule__ModuleInstances__Group_5_3__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2624:1: rule__ModuleInstances__Group_5_3__1__Impl : ( ( rule__ModuleInstances__LeftAssignment_5_3_1 ) ) ;
    public final void rule__ModuleInstances__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2628:1: ( ( ( rule__ModuleInstances__LeftAssignment_5_3_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2629:1: ( ( rule__ModuleInstances__LeftAssignment_5_3_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2629:1: ( ( rule__ModuleInstances__LeftAssignment_5_3_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2630:1: ( rule__ModuleInstances__LeftAssignment_5_3_1 )
            {
             before(grammarAccess.getModuleInstancesAccess().getLeftAssignment_5_3_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2631:1: ( rule__ModuleInstances__LeftAssignment_5_3_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2631:2: rule__ModuleInstances__LeftAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__ModuleInstances__LeftAssignment_5_3_1_in_rule__ModuleInstances__Group_5_3__1__Impl5205);
            rule__ModuleInstances__LeftAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleInstancesAccess().getLeftAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__Group_5_3__1__Impl"


    // $ANTLR start "rule__Stream_Impl__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2645:1: rule__Stream_Impl__Group__0 : rule__Stream_Impl__Group__0__Impl rule__Stream_Impl__Group__1 ;
    public final void rule__Stream_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2649:1: ( rule__Stream_Impl__Group__0__Impl rule__Stream_Impl__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2650:2: rule__Stream_Impl__Group__0__Impl rule__Stream_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__Stream_Impl__Group__0__Impl_in_rule__Stream_Impl__Group__05239);
            rule__Stream_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream_Impl__Group__1_in_rule__Stream_Impl__Group__05242);
            rule__Stream_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__0"


    // $ANTLR start "rule__Stream_Impl__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2657:1: rule__Stream_Impl__Group__0__Impl : ( 'Stream' ) ;
    public final void rule__Stream_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2661:1: ( ( 'Stream' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2662:1: ( 'Stream' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2662:1: ( 'Stream' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2663:1: 'Stream'
            {
             before(grammarAccess.getStream_ImplAccess().getStreamKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Stream_Impl__Group__0__Impl5270); 
             after(grammarAccess.getStream_ImplAccess().getStreamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__0__Impl"


    // $ANTLR start "rule__Stream_Impl__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2676:1: rule__Stream_Impl__Group__1 : rule__Stream_Impl__Group__1__Impl rule__Stream_Impl__Group__2 ;
    public final void rule__Stream_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2680:1: ( rule__Stream_Impl__Group__1__Impl rule__Stream_Impl__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2681:2: rule__Stream_Impl__Group__1__Impl rule__Stream_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__Stream_Impl__Group__1__Impl_in_rule__Stream_Impl__Group__15301);
            rule__Stream_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream_Impl__Group__2_in_rule__Stream_Impl__Group__15304);
            rule__Stream_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__1"


    // $ANTLR start "rule__Stream_Impl__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2688:1: rule__Stream_Impl__Group__1__Impl : ( ( rule__Stream_Impl__NameAssignment_1 ) ) ;
    public final void rule__Stream_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2692:1: ( ( ( rule__Stream_Impl__NameAssignment_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2693:1: ( ( rule__Stream_Impl__NameAssignment_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2693:1: ( ( rule__Stream_Impl__NameAssignment_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2694:1: ( rule__Stream_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getStream_ImplAccess().getNameAssignment_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2695:1: ( rule__Stream_Impl__NameAssignment_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2695:2: rule__Stream_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Stream_Impl__NameAssignment_1_in_rule__Stream_Impl__Group__1__Impl5331);
            rule__Stream_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStream_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__1__Impl"


    // $ANTLR start "rule__Stream_Impl__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2705:1: rule__Stream_Impl__Group__2 : rule__Stream_Impl__Group__2__Impl rule__Stream_Impl__Group__3 ;
    public final void rule__Stream_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2709:1: ( rule__Stream_Impl__Group__2__Impl rule__Stream_Impl__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2710:2: rule__Stream_Impl__Group__2__Impl rule__Stream_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__Stream_Impl__Group__2__Impl_in_rule__Stream_Impl__Group__25361);
            rule__Stream_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream_Impl__Group__3_in_rule__Stream_Impl__Group__25364);
            rule__Stream_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__2"


    // $ANTLR start "rule__Stream_Impl__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2717:1: rule__Stream_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Stream_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2721:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2722:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2722:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2723:1: '{'
            {
             before(grammarAccess.getStream_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Stream_Impl__Group__2__Impl5392); 
             after(grammarAccess.getStream_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__2__Impl"


    // $ANTLR start "rule__Stream_Impl__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2736:1: rule__Stream_Impl__Group__3 : rule__Stream_Impl__Group__3__Impl rule__Stream_Impl__Group__4 ;
    public final void rule__Stream_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2740:1: ( rule__Stream_Impl__Group__3__Impl rule__Stream_Impl__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2741:2: rule__Stream_Impl__Group__3__Impl rule__Stream_Impl__Group__4
            {
            pushFollow(FOLLOW_rule__Stream_Impl__Group__3__Impl_in_rule__Stream_Impl__Group__35423);
            rule__Stream_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream_Impl__Group__4_in_rule__Stream_Impl__Group__35426);
            rule__Stream_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__3"


    // $ANTLR start "rule__Stream_Impl__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2748:1: rule__Stream_Impl__Group__3__Impl : ( 'type' ) ;
    public final void rule__Stream_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2752:1: ( ( 'type' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2753:1: ( 'type' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2753:1: ( 'type' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2754:1: 'type'
            {
             before(grammarAccess.getStream_ImplAccess().getTypeKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Stream_Impl__Group__3__Impl5454); 
             after(grammarAccess.getStream_ImplAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__3__Impl"


    // $ANTLR start "rule__Stream_Impl__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2767:1: rule__Stream_Impl__Group__4 : rule__Stream_Impl__Group__4__Impl rule__Stream_Impl__Group__5 ;
    public final void rule__Stream_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2771:1: ( rule__Stream_Impl__Group__4__Impl rule__Stream_Impl__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2772:2: rule__Stream_Impl__Group__4__Impl rule__Stream_Impl__Group__5
            {
            pushFollow(FOLLOW_rule__Stream_Impl__Group__4__Impl_in_rule__Stream_Impl__Group__45485);
            rule__Stream_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream_Impl__Group__5_in_rule__Stream_Impl__Group__45488);
            rule__Stream_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__4"


    // $ANTLR start "rule__Stream_Impl__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2779:1: rule__Stream_Impl__Group__4__Impl : ( ( rule__Stream_Impl__TypeAssignment_4 ) ) ;
    public final void rule__Stream_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2783:1: ( ( ( rule__Stream_Impl__TypeAssignment_4 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2784:1: ( ( rule__Stream_Impl__TypeAssignment_4 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2784:1: ( ( rule__Stream_Impl__TypeAssignment_4 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2785:1: ( rule__Stream_Impl__TypeAssignment_4 )
            {
             before(grammarAccess.getStream_ImplAccess().getTypeAssignment_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2786:1: ( rule__Stream_Impl__TypeAssignment_4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2786:2: rule__Stream_Impl__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Stream_Impl__TypeAssignment_4_in_rule__Stream_Impl__Group__4__Impl5515);
            rule__Stream_Impl__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStream_ImplAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__4__Impl"


    // $ANTLR start "rule__Stream_Impl__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2796:1: rule__Stream_Impl__Group__5 : rule__Stream_Impl__Group__5__Impl ;
    public final void rule__Stream_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2800:1: ( rule__Stream_Impl__Group__5__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2801:2: rule__Stream_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Stream_Impl__Group__5__Impl_in_rule__Stream_Impl__Group__55545);
            rule__Stream_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__5"


    // $ANTLR start "rule__Stream_Impl__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2807:1: rule__Stream_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Stream_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2811:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2812:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2812:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2813:1: '}'
            {
             before(grammarAccess.getStream_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Stream_Impl__Group__5__Impl5573); 
             after(grammarAccess.getStream_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__Group__5__Impl"


    // $ANTLR start "rule__Literal__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2838:1: rule__Literal__Group__0 : rule__Literal__Group__0__Impl rule__Literal__Group__1 ;
    public final void rule__Literal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2842:1: ( rule__Literal__Group__0__Impl rule__Literal__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2843:2: rule__Literal__Group__0__Impl rule__Literal__Group__1
            {
            pushFollow(FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__05616);
            rule__Literal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__05619);
            rule__Literal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0"


    // $ANTLR start "rule__Literal__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2850:1: rule__Literal__Group__0__Impl : ( 'Literal' ) ;
    public final void rule__Literal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2854:1: ( ( 'Literal' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2855:1: ( 'Literal' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2855:1: ( 'Literal' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2856:1: 'Literal'
            {
             before(grammarAccess.getLiteralAccess().getLiteralKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Literal__Group__0__Impl5647); 
             after(grammarAccess.getLiteralAccess().getLiteralKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0__Impl"


    // $ANTLR start "rule__Literal__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2869:1: rule__Literal__Group__1 : rule__Literal__Group__1__Impl rule__Literal__Group__2 ;
    public final void rule__Literal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2873:1: ( rule__Literal__Group__1__Impl rule__Literal__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2874:2: rule__Literal__Group__1__Impl rule__Literal__Group__2
            {
            pushFollow(FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__15678);
            rule__Literal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group__2_in_rule__Literal__Group__15681);
            rule__Literal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1"


    // $ANTLR start "rule__Literal__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2881:1: rule__Literal__Group__1__Impl : ( ( rule__Literal__NameAssignment_1 ) ) ;
    public final void rule__Literal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2885:1: ( ( ( rule__Literal__NameAssignment_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2886:1: ( ( rule__Literal__NameAssignment_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2886:1: ( ( rule__Literal__NameAssignment_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2887:1: ( rule__Literal__NameAssignment_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2888:1: ( rule__Literal__NameAssignment_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2888:2: rule__Literal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_1_in_rule__Literal__Group__1__Impl5708);
            rule__Literal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1__Impl"


    // $ANTLR start "rule__Literal__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2898:1: rule__Literal__Group__2 : rule__Literal__Group__2__Impl rule__Literal__Group__3 ;
    public final void rule__Literal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2902:1: ( rule__Literal__Group__2__Impl rule__Literal__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2903:2: rule__Literal__Group__2__Impl rule__Literal__Group__3
            {
            pushFollow(FOLLOW_rule__Literal__Group__2__Impl_in_rule__Literal__Group__25738);
            rule__Literal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group__3_in_rule__Literal__Group__25741);
            rule__Literal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__2"


    // $ANTLR start "rule__Literal__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2910:1: rule__Literal__Group__2__Impl : ( '{' ) ;
    public final void rule__Literal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2914:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2915:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2915:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2916:1: '{'
            {
             before(grammarAccess.getLiteralAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Literal__Group__2__Impl5769); 
             after(grammarAccess.getLiteralAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__2__Impl"


    // $ANTLR start "rule__Literal__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2929:1: rule__Literal__Group__3 : rule__Literal__Group__3__Impl rule__Literal__Group__4 ;
    public final void rule__Literal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2933:1: ( rule__Literal__Group__3__Impl rule__Literal__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2934:2: rule__Literal__Group__3__Impl rule__Literal__Group__4
            {
            pushFollow(FOLLOW_rule__Literal__Group__3__Impl_in_rule__Literal__Group__35800);
            rule__Literal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group__4_in_rule__Literal__Group__35803);
            rule__Literal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__3"


    // $ANTLR start "rule__Literal__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2941:1: rule__Literal__Group__3__Impl : ( ( rule__Literal__Group_3__0 )? ) ;
    public final void rule__Literal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2945:1: ( ( ( rule__Literal__Group_3__0 )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2946:1: ( ( rule__Literal__Group_3__0 )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2946:1: ( ( rule__Literal__Group_3__0 )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2947:1: ( rule__Literal__Group_3__0 )?
            {
             before(grammarAccess.getLiteralAccess().getGroup_3()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2948:1: ( rule__Literal__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2948:2: rule__Literal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Group__3__Impl5830);
                    rule__Literal__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__3__Impl"


    // $ANTLR start "rule__Literal__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2958:1: rule__Literal__Group__4 : rule__Literal__Group__4__Impl rule__Literal__Group__5 ;
    public final void rule__Literal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2962:1: ( rule__Literal__Group__4__Impl rule__Literal__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2963:2: rule__Literal__Group__4__Impl rule__Literal__Group__5
            {
            pushFollow(FOLLOW_rule__Literal__Group__4__Impl_in_rule__Literal__Group__45861);
            rule__Literal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group__5_in_rule__Literal__Group__45864);
            rule__Literal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__4"


    // $ANTLR start "rule__Literal__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2970:1: rule__Literal__Group__4__Impl : ( 'type' ) ;
    public final void rule__Literal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2974:1: ( ( 'type' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2975:1: ( 'type' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2975:1: ( 'type' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2976:1: 'type'
            {
             before(grammarAccess.getLiteralAccess().getTypeKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Literal__Group__4__Impl5892); 
             after(grammarAccess.getLiteralAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__4__Impl"


    // $ANTLR start "rule__Literal__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2989:1: rule__Literal__Group__5 : rule__Literal__Group__5__Impl rule__Literal__Group__6 ;
    public final void rule__Literal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2993:1: ( rule__Literal__Group__5__Impl rule__Literal__Group__6 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:2994:2: rule__Literal__Group__5__Impl rule__Literal__Group__6
            {
            pushFollow(FOLLOW_rule__Literal__Group__5__Impl_in_rule__Literal__Group__55923);
            rule__Literal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group__6_in_rule__Literal__Group__55926);
            rule__Literal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__5"


    // $ANTLR start "rule__Literal__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3001:1: rule__Literal__Group__5__Impl : ( ( rule__Literal__TypeAssignment_5 ) ) ;
    public final void rule__Literal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3005:1: ( ( ( rule__Literal__TypeAssignment_5 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3006:1: ( ( rule__Literal__TypeAssignment_5 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3006:1: ( ( rule__Literal__TypeAssignment_5 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3007:1: ( rule__Literal__TypeAssignment_5 )
            {
             before(grammarAccess.getLiteralAccess().getTypeAssignment_5()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3008:1: ( rule__Literal__TypeAssignment_5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3008:2: rule__Literal__TypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Literal__TypeAssignment_5_in_rule__Literal__Group__5__Impl5953);
            rule__Literal__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__5__Impl"


    // $ANTLR start "rule__Literal__Group__6"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3018:1: rule__Literal__Group__6 : rule__Literal__Group__6__Impl ;
    public final void rule__Literal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3022:1: ( rule__Literal__Group__6__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3023:2: rule__Literal__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group__6__Impl_in_rule__Literal__Group__65983);
            rule__Literal__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__6"


    // $ANTLR start "rule__Literal__Group__6__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3029:1: rule__Literal__Group__6__Impl : ( '}' ) ;
    public final void rule__Literal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3033:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3034:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3034:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3035:1: '}'
            {
             before(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Literal__Group__6__Impl6011); 
             after(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__6__Impl"


    // $ANTLR start "rule__Literal__Group_3__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3062:1: rule__Literal__Group_3__0 : rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 ;
    public final void rule__Literal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3066:1: ( rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3067:2: rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__06056);
            rule__Literal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__06059);
            rule__Literal__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__0"


    // $ANTLR start "rule__Literal__Group_3__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3074:1: rule__Literal__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Literal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3078:1: ( ( 'value' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3079:1: ( 'value' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3079:1: ( 'value' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3080:1: 'value'
            {
             before(grammarAccess.getLiteralAccess().getValueKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Literal__Group_3__0__Impl6087); 
             after(grammarAccess.getLiteralAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__0__Impl"


    // $ANTLR start "rule__Literal__Group_3__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3093:1: rule__Literal__Group_3__1 : rule__Literal__Group_3__1__Impl ;
    public final void rule__Literal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3097:1: ( rule__Literal__Group_3__1__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3098:2: rule__Literal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__16118);
            rule__Literal__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__1"


    // $ANTLR start "rule__Literal__Group_3__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3104:1: rule__Literal__Group_3__1__Impl : ( ( rule__Literal__ValueAssignment_3_1 ) ) ;
    public final void rule__Literal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3108:1: ( ( ( rule__Literal__ValueAssignment_3_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3109:1: ( ( rule__Literal__ValueAssignment_3_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3109:1: ( ( rule__Literal__ValueAssignment_3_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3110:1: ( rule__Literal__ValueAssignment_3_1 )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment_3_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3111:1: ( rule__Literal__ValueAssignment_3_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3111:2: rule__Literal__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Literal__ValueAssignment_3_1_in_rule__Literal__Group_3__1__Impl6145);
            rule__Literal__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__1__Impl"


    // $ANTLR start "rule__NativeType__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3125:1: rule__NativeType__Group__0 : rule__NativeType__Group__0__Impl rule__NativeType__Group__1 ;
    public final void rule__NativeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3129:1: ( rule__NativeType__Group__0__Impl rule__NativeType__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3130:2: rule__NativeType__Group__0__Impl rule__NativeType__Group__1
            {
            pushFollow(FOLLOW_rule__NativeType__Group__0__Impl_in_rule__NativeType__Group__06179);
            rule__NativeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NativeType__Group__1_in_rule__NativeType__Group__06182);
            rule__NativeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__0"


    // $ANTLR start "rule__NativeType__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3137:1: rule__NativeType__Group__0__Impl : ( 'NativeType' ) ;
    public final void rule__NativeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3141:1: ( ( 'NativeType' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3142:1: ( 'NativeType' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3142:1: ( 'NativeType' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3143:1: 'NativeType'
            {
             before(grammarAccess.getNativeTypeAccess().getNativeTypeKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__NativeType__Group__0__Impl6210); 
             after(grammarAccess.getNativeTypeAccess().getNativeTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__0__Impl"


    // $ANTLR start "rule__NativeType__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3156:1: rule__NativeType__Group__1 : rule__NativeType__Group__1__Impl rule__NativeType__Group__2 ;
    public final void rule__NativeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3160:1: ( rule__NativeType__Group__1__Impl rule__NativeType__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3161:2: rule__NativeType__Group__1__Impl rule__NativeType__Group__2
            {
            pushFollow(FOLLOW_rule__NativeType__Group__1__Impl_in_rule__NativeType__Group__16241);
            rule__NativeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NativeType__Group__2_in_rule__NativeType__Group__16244);
            rule__NativeType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__1"


    // $ANTLR start "rule__NativeType__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3168:1: rule__NativeType__Group__1__Impl : ( ( rule__NativeType__NameAssignment_1 ) ) ;
    public final void rule__NativeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3172:1: ( ( ( rule__NativeType__NameAssignment_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3173:1: ( ( rule__NativeType__NameAssignment_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3173:1: ( ( rule__NativeType__NameAssignment_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3174:1: ( rule__NativeType__NameAssignment_1 )
            {
             before(grammarAccess.getNativeTypeAccess().getNameAssignment_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3175:1: ( rule__NativeType__NameAssignment_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3175:2: rule__NativeType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NativeType__NameAssignment_1_in_rule__NativeType__Group__1__Impl6271);
            rule__NativeType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNativeTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__1__Impl"


    // $ANTLR start "rule__NativeType__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3185:1: rule__NativeType__Group__2 : rule__NativeType__Group__2__Impl rule__NativeType__Group__3 ;
    public final void rule__NativeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3189:1: ( rule__NativeType__Group__2__Impl rule__NativeType__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3190:2: rule__NativeType__Group__2__Impl rule__NativeType__Group__3
            {
            pushFollow(FOLLOW_rule__NativeType__Group__2__Impl_in_rule__NativeType__Group__26301);
            rule__NativeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NativeType__Group__3_in_rule__NativeType__Group__26304);
            rule__NativeType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__2"


    // $ANTLR start "rule__NativeType__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3197:1: rule__NativeType__Group__2__Impl : ( '{' ) ;
    public final void rule__NativeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3201:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3202:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3202:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3203:1: '{'
            {
             before(grammarAccess.getNativeTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__NativeType__Group__2__Impl6332); 
             after(grammarAccess.getNativeTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__2__Impl"


    // $ANTLR start "rule__NativeType__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3216:1: rule__NativeType__Group__3 : rule__NativeType__Group__3__Impl rule__NativeType__Group__4 ;
    public final void rule__NativeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3220:1: ( rule__NativeType__Group__3__Impl rule__NativeType__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3221:2: rule__NativeType__Group__3__Impl rule__NativeType__Group__4
            {
            pushFollow(FOLLOW_rule__NativeType__Group__3__Impl_in_rule__NativeType__Group__36363);
            rule__NativeType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NativeType__Group__4_in_rule__NativeType__Group__36366);
            rule__NativeType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__3"


    // $ANTLR start "rule__NativeType__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3228:1: rule__NativeType__Group__3__Impl : ( 'type' ) ;
    public final void rule__NativeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3232:1: ( ( 'type' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3233:1: ( 'type' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3233:1: ( 'type' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3234:1: 'type'
            {
             before(grammarAccess.getNativeTypeAccess().getTypeKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__NativeType__Group__3__Impl6394); 
             after(grammarAccess.getNativeTypeAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__3__Impl"


    // $ANTLR start "rule__NativeType__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3247:1: rule__NativeType__Group__4 : rule__NativeType__Group__4__Impl rule__NativeType__Group__5 ;
    public final void rule__NativeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3251:1: ( rule__NativeType__Group__4__Impl rule__NativeType__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3252:2: rule__NativeType__Group__4__Impl rule__NativeType__Group__5
            {
            pushFollow(FOLLOW_rule__NativeType__Group__4__Impl_in_rule__NativeType__Group__46425);
            rule__NativeType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NativeType__Group__5_in_rule__NativeType__Group__46428);
            rule__NativeType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__4"


    // $ANTLR start "rule__NativeType__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3259:1: rule__NativeType__Group__4__Impl : ( ( rule__NativeType__TypeAssignment_4 ) ) ;
    public final void rule__NativeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3263:1: ( ( ( rule__NativeType__TypeAssignment_4 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3264:1: ( ( rule__NativeType__TypeAssignment_4 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3264:1: ( ( rule__NativeType__TypeAssignment_4 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3265:1: ( rule__NativeType__TypeAssignment_4 )
            {
             before(grammarAccess.getNativeTypeAccess().getTypeAssignment_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3266:1: ( rule__NativeType__TypeAssignment_4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3266:2: rule__NativeType__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__NativeType__TypeAssignment_4_in_rule__NativeType__Group__4__Impl6455);
            rule__NativeType__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNativeTypeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__4__Impl"


    // $ANTLR start "rule__NativeType__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3276:1: rule__NativeType__Group__5 : rule__NativeType__Group__5__Impl ;
    public final void rule__NativeType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3280:1: ( rule__NativeType__Group__5__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3281:2: rule__NativeType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__NativeType__Group__5__Impl_in_rule__NativeType__Group__56485);
            rule__NativeType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__5"


    // $ANTLR start "rule__NativeType__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3287:1: rule__NativeType__Group__5__Impl : ( '}' ) ;
    public final void rule__NativeType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3291:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3292:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3292:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3293:1: '}'
            {
             before(grammarAccess.getNativeTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__NativeType__Group__5__Impl6513); 
             after(grammarAccess.getNativeTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__Group__5__Impl"


    // $ANTLR start "rule__List__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3318:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3322:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3323:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__06556);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group__1_in_rule__List__Group__06559);
            rule__List__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3330:1: rule__List__Group__0__Impl : ( 'List' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3334:1: ( ( 'List' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3335:1: ( 'List' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3335:1: ( 'List' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3336:1: 'List'
            {
             before(grammarAccess.getListAccess().getListKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__List__Group__0__Impl6587); 
             after(grammarAccess.getListAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3349:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3353:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3354:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__16618);
            rule__List__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group__2_in_rule__List__Group__16621);
            rule__List__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3361:1: rule__List__Group__1__Impl : ( ( rule__List__NameAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3365:1: ( ( ( rule__List__NameAssignment_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3366:1: ( ( rule__List__NameAssignment_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3366:1: ( ( rule__List__NameAssignment_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3367:1: ( rule__List__NameAssignment_1 )
            {
             before(grammarAccess.getListAccess().getNameAssignment_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3368:1: ( rule__List__NameAssignment_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3368:2: rule__List__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__List__NameAssignment_1_in_rule__List__Group__1__Impl6648);
            rule__List__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3378:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3382:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3383:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__26678);
            rule__List__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group__3_in_rule__List__Group__26681);
            rule__List__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3390:1: rule__List__Group__2__Impl : ( '{' ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3394:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3395:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3395:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3396:1: '{'
            {
             before(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__List__Group__2__Impl6709); 
             after(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3409:1: rule__List__Group__3 : rule__List__Group__3__Impl rule__List__Group__4 ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3413:1: ( rule__List__Group__3__Impl rule__List__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3414:2: rule__List__Group__3__Impl rule__List__Group__4
            {
            pushFollow(FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__36740);
            rule__List__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group__4_in_rule__List__Group__36743);
            rule__List__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3"


    // $ANTLR start "rule__List__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3421:1: rule__List__Group__3__Impl : ( 'type' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3425:1: ( ( 'type' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3426:1: ( 'type' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3426:1: ( 'type' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3427:1: 'type'
            {
             before(grammarAccess.getListAccess().getTypeKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__List__Group__3__Impl6771); 
             after(grammarAccess.getListAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3__Impl"


    // $ANTLR start "rule__List__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3440:1: rule__List__Group__4 : rule__List__Group__4__Impl rule__List__Group__5 ;
    public final void rule__List__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3444:1: ( rule__List__Group__4__Impl rule__List__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3445:2: rule__List__Group__4__Impl rule__List__Group__5
            {
            pushFollow(FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__46802);
            rule__List__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group__5_in_rule__List__Group__46805);
            rule__List__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__4"


    // $ANTLR start "rule__List__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3452:1: rule__List__Group__4__Impl : ( ( rule__List__TypeAssignment_4 ) ) ;
    public final void rule__List__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3456:1: ( ( ( rule__List__TypeAssignment_4 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3457:1: ( ( rule__List__TypeAssignment_4 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3457:1: ( ( rule__List__TypeAssignment_4 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3458:1: ( rule__List__TypeAssignment_4 )
            {
             before(grammarAccess.getListAccess().getTypeAssignment_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3459:1: ( rule__List__TypeAssignment_4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3459:2: rule__List__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__List__TypeAssignment_4_in_rule__List__Group__4__Impl6832);
            rule__List__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__4__Impl"


    // $ANTLR start "rule__List__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3469:1: rule__List__Group__5 : rule__List__Group__5__Impl ;
    public final void rule__List__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3473:1: ( rule__List__Group__5__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3474:2: rule__List__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__List__Group__5__Impl_in_rule__List__Group__56862);
            rule__List__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__5"


    // $ANTLR start "rule__List__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3480:1: rule__List__Group__5__Impl : ( '}' ) ;
    public final void rule__List__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3484:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3485:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3485:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3486:1: '}'
            {
             before(grammarAccess.getListAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__List__Group__5__Impl6890); 
             after(grammarAccess.getListAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__5__Impl"


    // $ANTLR start "rule__Hash__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3511:1: rule__Hash__Group__0 : rule__Hash__Group__0__Impl rule__Hash__Group__1 ;
    public final void rule__Hash__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3515:1: ( rule__Hash__Group__0__Impl rule__Hash__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3516:2: rule__Hash__Group__0__Impl rule__Hash__Group__1
            {
            pushFollow(FOLLOW_rule__Hash__Group__0__Impl_in_rule__Hash__Group__06933);
            rule__Hash__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group__1_in_rule__Hash__Group__06936);
            rule__Hash__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__0"


    // $ANTLR start "rule__Hash__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3523:1: rule__Hash__Group__0__Impl : ( () ) ;
    public final void rule__Hash__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3527:1: ( ( () ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3528:1: ( () )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3528:1: ( () )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3529:1: ()
            {
             before(grammarAccess.getHashAccess().getHashAction_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3530:1: ()
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3532:1: 
            {
            }

             after(grammarAccess.getHashAccess().getHashAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__0__Impl"


    // $ANTLR start "rule__Hash__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3542:1: rule__Hash__Group__1 : rule__Hash__Group__1__Impl rule__Hash__Group__2 ;
    public final void rule__Hash__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3546:1: ( rule__Hash__Group__1__Impl rule__Hash__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3547:2: rule__Hash__Group__1__Impl rule__Hash__Group__2
            {
            pushFollow(FOLLOW_rule__Hash__Group__1__Impl_in_rule__Hash__Group__16994);
            rule__Hash__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group__2_in_rule__Hash__Group__16997);
            rule__Hash__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__1"


    // $ANTLR start "rule__Hash__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3554:1: rule__Hash__Group__1__Impl : ( 'Hash' ) ;
    public final void rule__Hash__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3558:1: ( ( 'Hash' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3559:1: ( 'Hash' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3559:1: ( 'Hash' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3560:1: 'Hash'
            {
             before(grammarAccess.getHashAccess().getHashKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Hash__Group__1__Impl7025); 
             after(grammarAccess.getHashAccess().getHashKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__1__Impl"


    // $ANTLR start "rule__Hash__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3573:1: rule__Hash__Group__2 : rule__Hash__Group__2__Impl rule__Hash__Group__3 ;
    public final void rule__Hash__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3577:1: ( rule__Hash__Group__2__Impl rule__Hash__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3578:2: rule__Hash__Group__2__Impl rule__Hash__Group__3
            {
            pushFollow(FOLLOW_rule__Hash__Group__2__Impl_in_rule__Hash__Group__27056);
            rule__Hash__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group__3_in_rule__Hash__Group__27059);
            rule__Hash__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__2"


    // $ANTLR start "rule__Hash__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3585:1: rule__Hash__Group__2__Impl : ( ( rule__Hash__NameAssignment_2 ) ) ;
    public final void rule__Hash__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3589:1: ( ( ( rule__Hash__NameAssignment_2 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3590:1: ( ( rule__Hash__NameAssignment_2 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3590:1: ( ( rule__Hash__NameAssignment_2 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3591:1: ( rule__Hash__NameAssignment_2 )
            {
             before(grammarAccess.getHashAccess().getNameAssignment_2()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3592:1: ( rule__Hash__NameAssignment_2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3592:2: rule__Hash__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Hash__NameAssignment_2_in_rule__Hash__Group__2__Impl7086);
            rule__Hash__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHashAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__2__Impl"


    // $ANTLR start "rule__Hash__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3602:1: rule__Hash__Group__3 : rule__Hash__Group__3__Impl rule__Hash__Group__4 ;
    public final void rule__Hash__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3606:1: ( rule__Hash__Group__3__Impl rule__Hash__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3607:2: rule__Hash__Group__3__Impl rule__Hash__Group__4
            {
            pushFollow(FOLLOW_rule__Hash__Group__3__Impl_in_rule__Hash__Group__37116);
            rule__Hash__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group__4_in_rule__Hash__Group__37119);
            rule__Hash__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__3"


    // $ANTLR start "rule__Hash__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3614:1: rule__Hash__Group__3__Impl : ( '{' ) ;
    public final void rule__Hash__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3618:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3619:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3619:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3620:1: '{'
            {
             before(grammarAccess.getHashAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Hash__Group__3__Impl7147); 
             after(grammarAccess.getHashAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__3__Impl"


    // $ANTLR start "rule__Hash__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3633:1: rule__Hash__Group__4 : rule__Hash__Group__4__Impl rule__Hash__Group__5 ;
    public final void rule__Hash__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3637:1: ( rule__Hash__Group__4__Impl rule__Hash__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3638:2: rule__Hash__Group__4__Impl rule__Hash__Group__5
            {
            pushFollow(FOLLOW_rule__Hash__Group__4__Impl_in_rule__Hash__Group__47178);
            rule__Hash__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group__5_in_rule__Hash__Group__47181);
            rule__Hash__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__4"


    // $ANTLR start "rule__Hash__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3645:1: rule__Hash__Group__4__Impl : ( ( rule__Hash__Group_4__0 )? ) ;
    public final void rule__Hash__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3649:1: ( ( ( rule__Hash__Group_4__0 )? ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3650:1: ( ( rule__Hash__Group_4__0 )? )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3650:1: ( ( rule__Hash__Group_4__0 )? )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3651:1: ( rule__Hash__Group_4__0 )?
            {
             before(grammarAccess.getHashAccess().getGroup_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3652:1: ( rule__Hash__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3652:2: rule__Hash__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Hash__Group_4__0_in_rule__Hash__Group__4__Impl7208);
                    rule__Hash__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHashAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__4__Impl"


    // $ANTLR start "rule__Hash__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3662:1: rule__Hash__Group__5 : rule__Hash__Group__5__Impl ;
    public final void rule__Hash__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3666:1: ( rule__Hash__Group__5__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3667:2: rule__Hash__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Hash__Group__5__Impl_in_rule__Hash__Group__57239);
            rule__Hash__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__5"


    // $ANTLR start "rule__Hash__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3673:1: rule__Hash__Group__5__Impl : ( '}' ) ;
    public final void rule__Hash__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3677:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3678:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3678:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3679:1: '}'
            {
             before(grammarAccess.getHashAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Hash__Group__5__Impl7267); 
             after(grammarAccess.getHashAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group__5__Impl"


    // $ANTLR start "rule__Hash__Group_4__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3704:1: rule__Hash__Group_4__0 : rule__Hash__Group_4__0__Impl rule__Hash__Group_4__1 ;
    public final void rule__Hash__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3708:1: ( rule__Hash__Group_4__0__Impl rule__Hash__Group_4__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3709:2: rule__Hash__Group_4__0__Impl rule__Hash__Group_4__1
            {
            pushFollow(FOLLOW_rule__Hash__Group_4__0__Impl_in_rule__Hash__Group_4__07310);
            rule__Hash__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group_4__1_in_rule__Hash__Group_4__07313);
            rule__Hash__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__0"


    // $ANTLR start "rule__Hash__Group_4__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3716:1: rule__Hash__Group_4__0__Impl : ( 'items' ) ;
    public final void rule__Hash__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3720:1: ( ( 'items' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3721:1: ( 'items' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3721:1: ( 'items' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3722:1: 'items'
            {
             before(grammarAccess.getHashAccess().getItemsKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__Hash__Group_4__0__Impl7341); 
             after(grammarAccess.getHashAccess().getItemsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__0__Impl"


    // $ANTLR start "rule__Hash__Group_4__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3735:1: rule__Hash__Group_4__1 : rule__Hash__Group_4__1__Impl rule__Hash__Group_4__2 ;
    public final void rule__Hash__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3739:1: ( rule__Hash__Group_4__1__Impl rule__Hash__Group_4__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3740:2: rule__Hash__Group_4__1__Impl rule__Hash__Group_4__2
            {
            pushFollow(FOLLOW_rule__Hash__Group_4__1__Impl_in_rule__Hash__Group_4__17372);
            rule__Hash__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group_4__2_in_rule__Hash__Group_4__17375);
            rule__Hash__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__1"


    // $ANTLR start "rule__Hash__Group_4__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3747:1: rule__Hash__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Hash__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3751:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3752:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3752:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3753:1: '{'
            {
             before(grammarAccess.getHashAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,13,FOLLOW_13_in_rule__Hash__Group_4__1__Impl7403); 
             after(grammarAccess.getHashAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__1__Impl"


    // $ANTLR start "rule__Hash__Group_4__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3766:1: rule__Hash__Group_4__2 : rule__Hash__Group_4__2__Impl rule__Hash__Group_4__3 ;
    public final void rule__Hash__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3770:1: ( rule__Hash__Group_4__2__Impl rule__Hash__Group_4__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3771:2: rule__Hash__Group_4__2__Impl rule__Hash__Group_4__3
            {
            pushFollow(FOLLOW_rule__Hash__Group_4__2__Impl_in_rule__Hash__Group_4__27434);
            rule__Hash__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group_4__3_in_rule__Hash__Group_4__27437);
            rule__Hash__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__2"


    // $ANTLR start "rule__Hash__Group_4__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3778:1: rule__Hash__Group_4__2__Impl : ( ( rule__Hash__ItemsAssignment_4_2 ) ) ;
    public final void rule__Hash__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3782:1: ( ( ( rule__Hash__ItemsAssignment_4_2 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3783:1: ( ( rule__Hash__ItemsAssignment_4_2 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3783:1: ( ( rule__Hash__ItemsAssignment_4_2 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3784:1: ( rule__Hash__ItemsAssignment_4_2 )
            {
             before(grammarAccess.getHashAccess().getItemsAssignment_4_2()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3785:1: ( rule__Hash__ItemsAssignment_4_2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3785:2: rule__Hash__ItemsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Hash__ItemsAssignment_4_2_in_rule__Hash__Group_4__2__Impl7464);
            rule__Hash__ItemsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getHashAccess().getItemsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__2__Impl"


    // $ANTLR start "rule__Hash__Group_4__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3795:1: rule__Hash__Group_4__3 : rule__Hash__Group_4__3__Impl rule__Hash__Group_4__4 ;
    public final void rule__Hash__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3799:1: ( rule__Hash__Group_4__3__Impl rule__Hash__Group_4__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3800:2: rule__Hash__Group_4__3__Impl rule__Hash__Group_4__4
            {
            pushFollow(FOLLOW_rule__Hash__Group_4__3__Impl_in_rule__Hash__Group_4__37494);
            rule__Hash__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group_4__4_in_rule__Hash__Group_4__37497);
            rule__Hash__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__3"


    // $ANTLR start "rule__Hash__Group_4__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3807:1: rule__Hash__Group_4__3__Impl : ( ( rule__Hash__Group_4_3__0 )* ) ;
    public final void rule__Hash__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3811:1: ( ( ( rule__Hash__Group_4_3__0 )* ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3812:1: ( ( rule__Hash__Group_4_3__0 )* )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3812:1: ( ( rule__Hash__Group_4_3__0 )* )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3813:1: ( rule__Hash__Group_4_3__0 )*
            {
             before(grammarAccess.getHashAccess().getGroup_4_3()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3814:1: ( rule__Hash__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3814:2: rule__Hash__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Hash__Group_4_3__0_in_rule__Hash__Group_4__3__Impl7524);
            	    rule__Hash__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getHashAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__3__Impl"


    // $ANTLR start "rule__Hash__Group_4__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3824:1: rule__Hash__Group_4__4 : rule__Hash__Group_4__4__Impl ;
    public final void rule__Hash__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3828:1: ( rule__Hash__Group_4__4__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3829:2: rule__Hash__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Hash__Group_4__4__Impl_in_rule__Hash__Group_4__47555);
            rule__Hash__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__4"


    // $ANTLR start "rule__Hash__Group_4__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3835:1: rule__Hash__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Hash__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3839:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3840:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3840:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3841:1: '}'
            {
             before(grammarAccess.getHashAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_14_in_rule__Hash__Group_4__4__Impl7583); 
             after(grammarAccess.getHashAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4__4__Impl"


    // $ANTLR start "rule__Hash__Group_4_3__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3864:1: rule__Hash__Group_4_3__0 : rule__Hash__Group_4_3__0__Impl rule__Hash__Group_4_3__1 ;
    public final void rule__Hash__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3868:1: ( rule__Hash__Group_4_3__0__Impl rule__Hash__Group_4_3__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3869:2: rule__Hash__Group_4_3__0__Impl rule__Hash__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Hash__Group_4_3__0__Impl_in_rule__Hash__Group_4_3__07624);
            rule__Hash__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hash__Group_4_3__1_in_rule__Hash__Group_4_3__07627);
            rule__Hash__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4_3__0"


    // $ANTLR start "rule__Hash__Group_4_3__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3876:1: rule__Hash__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Hash__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3880:1: ( ( ',' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3881:1: ( ',' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3881:1: ( ',' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3882:1: ','
            {
             before(grammarAccess.getHashAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Hash__Group_4_3__0__Impl7655); 
             after(grammarAccess.getHashAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4_3__0__Impl"


    // $ANTLR start "rule__Hash__Group_4_3__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3895:1: rule__Hash__Group_4_3__1 : rule__Hash__Group_4_3__1__Impl ;
    public final void rule__Hash__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3899:1: ( rule__Hash__Group_4_3__1__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3900:2: rule__Hash__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Hash__Group_4_3__1__Impl_in_rule__Hash__Group_4_3__17686);
            rule__Hash__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4_3__1"


    // $ANTLR start "rule__Hash__Group_4_3__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3906:1: rule__Hash__Group_4_3__1__Impl : ( ( rule__Hash__ItemsAssignment_4_3_1 ) ) ;
    public final void rule__Hash__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3910:1: ( ( ( rule__Hash__ItemsAssignment_4_3_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3911:1: ( ( rule__Hash__ItemsAssignment_4_3_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3911:1: ( ( rule__Hash__ItemsAssignment_4_3_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3912:1: ( rule__Hash__ItemsAssignment_4_3_1 )
            {
             before(grammarAccess.getHashAccess().getItemsAssignment_4_3_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3913:1: ( rule__Hash__ItemsAssignment_4_3_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3913:2: rule__Hash__ItemsAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Hash__ItemsAssignment_4_3_1_in_rule__Hash__Group_4_3__1__Impl7713);
            rule__Hash__ItemsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHashAccess().getItemsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__Group_4_3__1__Impl"


    // $ANTLR start "rule__HashItem__Group__0"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3927:1: rule__HashItem__Group__0 : rule__HashItem__Group__0__Impl rule__HashItem__Group__1 ;
    public final void rule__HashItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3931:1: ( rule__HashItem__Group__0__Impl rule__HashItem__Group__1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3932:2: rule__HashItem__Group__0__Impl rule__HashItem__Group__1
            {
            pushFollow(FOLLOW_rule__HashItem__Group__0__Impl_in_rule__HashItem__Group__07747);
            rule__HashItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashItem__Group__1_in_rule__HashItem__Group__07750);
            rule__HashItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__0"


    // $ANTLR start "rule__HashItem__Group__0__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3939:1: rule__HashItem__Group__0__Impl : ( 'HashItem' ) ;
    public final void rule__HashItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3943:1: ( ( 'HashItem' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3944:1: ( 'HashItem' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3944:1: ( 'HashItem' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3945:1: 'HashItem'
            {
             before(grammarAccess.getHashItemAccess().getHashItemKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__HashItem__Group__0__Impl7778); 
             after(grammarAccess.getHashItemAccess().getHashItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__0__Impl"


    // $ANTLR start "rule__HashItem__Group__1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3958:1: rule__HashItem__Group__1 : rule__HashItem__Group__1__Impl rule__HashItem__Group__2 ;
    public final void rule__HashItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3962:1: ( rule__HashItem__Group__1__Impl rule__HashItem__Group__2 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3963:2: rule__HashItem__Group__1__Impl rule__HashItem__Group__2
            {
            pushFollow(FOLLOW_rule__HashItem__Group__1__Impl_in_rule__HashItem__Group__17809);
            rule__HashItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashItem__Group__2_in_rule__HashItem__Group__17812);
            rule__HashItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__1"


    // $ANTLR start "rule__HashItem__Group__1__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3970:1: rule__HashItem__Group__1__Impl : ( ( rule__HashItem__NameAssignment_1 ) ) ;
    public final void rule__HashItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3974:1: ( ( ( rule__HashItem__NameAssignment_1 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3975:1: ( ( rule__HashItem__NameAssignment_1 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3975:1: ( ( rule__HashItem__NameAssignment_1 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3976:1: ( rule__HashItem__NameAssignment_1 )
            {
             before(grammarAccess.getHashItemAccess().getNameAssignment_1()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3977:1: ( rule__HashItem__NameAssignment_1 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3977:2: rule__HashItem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HashItem__NameAssignment_1_in_rule__HashItem__Group__1__Impl7839);
            rule__HashItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHashItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__1__Impl"


    // $ANTLR start "rule__HashItem__Group__2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3987:1: rule__HashItem__Group__2 : rule__HashItem__Group__2__Impl rule__HashItem__Group__3 ;
    public final void rule__HashItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3991:1: ( rule__HashItem__Group__2__Impl rule__HashItem__Group__3 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3992:2: rule__HashItem__Group__2__Impl rule__HashItem__Group__3
            {
            pushFollow(FOLLOW_rule__HashItem__Group__2__Impl_in_rule__HashItem__Group__27869);
            rule__HashItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashItem__Group__3_in_rule__HashItem__Group__27872);
            rule__HashItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__2"


    // $ANTLR start "rule__HashItem__Group__2__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:3999:1: rule__HashItem__Group__2__Impl : ( '{' ) ;
    public final void rule__HashItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4003:1: ( ( '{' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4004:1: ( '{' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4004:1: ( '{' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4005:1: '{'
            {
             before(grammarAccess.getHashItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__HashItem__Group__2__Impl7900); 
             after(grammarAccess.getHashItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__2__Impl"


    // $ANTLR start "rule__HashItem__Group__3"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4018:1: rule__HashItem__Group__3 : rule__HashItem__Group__3__Impl rule__HashItem__Group__4 ;
    public final void rule__HashItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4022:1: ( rule__HashItem__Group__3__Impl rule__HashItem__Group__4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4023:2: rule__HashItem__Group__3__Impl rule__HashItem__Group__4
            {
            pushFollow(FOLLOW_rule__HashItem__Group__3__Impl_in_rule__HashItem__Group__37931);
            rule__HashItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashItem__Group__4_in_rule__HashItem__Group__37934);
            rule__HashItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__3"


    // $ANTLR start "rule__HashItem__Group__3__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4030:1: rule__HashItem__Group__3__Impl : ( 'type' ) ;
    public final void rule__HashItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4034:1: ( ( 'type' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4035:1: ( 'type' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4035:1: ( 'type' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4036:1: 'type'
            {
             before(grammarAccess.getHashItemAccess().getTypeKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__HashItem__Group__3__Impl7962); 
             after(grammarAccess.getHashItemAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__3__Impl"


    // $ANTLR start "rule__HashItem__Group__4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4049:1: rule__HashItem__Group__4 : rule__HashItem__Group__4__Impl rule__HashItem__Group__5 ;
    public final void rule__HashItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4053:1: ( rule__HashItem__Group__4__Impl rule__HashItem__Group__5 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4054:2: rule__HashItem__Group__4__Impl rule__HashItem__Group__5
            {
            pushFollow(FOLLOW_rule__HashItem__Group__4__Impl_in_rule__HashItem__Group__47993);
            rule__HashItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashItem__Group__5_in_rule__HashItem__Group__47996);
            rule__HashItem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__4"


    // $ANTLR start "rule__HashItem__Group__4__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4061:1: rule__HashItem__Group__4__Impl : ( ( rule__HashItem__TypeAssignment_4 ) ) ;
    public final void rule__HashItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4065:1: ( ( ( rule__HashItem__TypeAssignment_4 ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4066:1: ( ( rule__HashItem__TypeAssignment_4 ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4066:1: ( ( rule__HashItem__TypeAssignment_4 ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4067:1: ( rule__HashItem__TypeAssignment_4 )
            {
             before(grammarAccess.getHashItemAccess().getTypeAssignment_4()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4068:1: ( rule__HashItem__TypeAssignment_4 )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4068:2: rule__HashItem__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__HashItem__TypeAssignment_4_in_rule__HashItem__Group__4__Impl8023);
            rule__HashItem__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHashItemAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__4__Impl"


    // $ANTLR start "rule__HashItem__Group__5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4078:1: rule__HashItem__Group__5 : rule__HashItem__Group__5__Impl ;
    public final void rule__HashItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4082:1: ( rule__HashItem__Group__5__Impl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4083:2: rule__HashItem__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__HashItem__Group__5__Impl_in_rule__HashItem__Group__58053);
            rule__HashItem__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__5"


    // $ANTLR start "rule__HashItem__Group__5__Impl"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4089:1: rule__HashItem__Group__5__Impl : ( '}' ) ;
    public final void rule__HashItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4093:1: ( ( '}' ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4094:1: ( '}' )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4094:1: ( '}' )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4095:1: '}'
            {
             before(grammarAccess.getHashItemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__HashItem__Group__5__Impl8081); 
             after(grammarAccess.getHashItemAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__Group__5__Impl"


    // $ANTLR start "rule__Module__NameAssignment_2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4121:1: rule__Module__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4125:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4126:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4126:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4127:1: ruleEString
            {
             before(grammarAccess.getModuleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Module__NameAssignment_28129);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_2"


    // $ANTLR start "rule__Module__InputAssignment_4_2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4136:1: rule__Module__InputAssignment_4_2 : ( ruleInput ) ;
    public final void rule__Module__InputAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4140:1: ( ( ruleInput ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4141:1: ( ruleInput )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4141:1: ( ruleInput )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4142:1: ruleInput
            {
             before(grammarAccess.getModuleAccess().getInputInputParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleInput_in_rule__Module__InputAssignment_4_28160);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getInputInputParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__InputAssignment_4_2"


    // $ANTLR start "rule__Module__InputAssignment_4_3_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4151:1: rule__Module__InputAssignment_4_3_1 : ( ruleInput ) ;
    public final void rule__Module__InputAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4155:1: ( ( ruleInput ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4156:1: ( ruleInput )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4156:1: ( ruleInput )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4157:1: ruleInput
            {
             before(grammarAccess.getModuleAccess().getInputInputParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleInput_in_rule__Module__InputAssignment_4_3_18191);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getInputInputParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__InputAssignment_4_3_1"


    // $ANTLR start "rule__Module__OutputAssignment_5_2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4166:1: rule__Module__OutputAssignment_5_2 : ( ruleOutput ) ;
    public final void rule__Module__OutputAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4170:1: ( ( ruleOutput ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4171:1: ( ruleOutput )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4171:1: ( ruleOutput )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4172:1: ruleOutput
            {
             before(grammarAccess.getModuleAccess().getOutputOutputParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleOutput_in_rule__Module__OutputAssignment_5_28222);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getOutputOutputParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__OutputAssignment_5_2"


    // $ANTLR start "rule__Module__OutputAssignment_5_3_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4181:1: rule__Module__OutputAssignment_5_3_1 : ( ruleOutput ) ;
    public final void rule__Module__OutputAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4185:1: ( ( ruleOutput ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4186:1: ( ruleOutput )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4186:1: ( ruleOutput )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4187:1: ruleOutput
            {
             before(grammarAccess.getModuleAccess().getOutputOutputParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_ruleOutput_in_rule__Module__OutputAssignment_5_3_18253);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getOutputOutputParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__OutputAssignment_5_3_1"


    // $ANTLR start "rule__Module__InstancesAssignment_6_2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4196:1: rule__Module__InstancesAssignment_6_2 : ( ruleModuleInstances ) ;
    public final void rule__Module__InstancesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4200:1: ( ( ruleModuleInstances ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4201:1: ( ruleModuleInstances )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4201:1: ( ruleModuleInstances )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4202:1: ruleModuleInstances
            {
             before(grammarAccess.getModuleAccess().getInstancesModuleInstancesParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleModuleInstances_in_rule__Module__InstancesAssignment_6_28284);
            ruleModuleInstances();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getInstancesModuleInstancesParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__InstancesAssignment_6_2"


    // $ANTLR start "rule__Module__InstancesAssignment_6_3_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4211:1: rule__Module__InstancesAssignment_6_3_1 : ( ruleModuleInstances ) ;
    public final void rule__Module__InstancesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4215:1: ( ( ruleModuleInstances ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4216:1: ( ruleModuleInstances )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4216:1: ( ruleModuleInstances )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4217:1: ruleModuleInstances
            {
             before(grammarAccess.getModuleAccess().getInstancesModuleInstancesParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_ruleModuleInstances_in_rule__Module__InstancesAssignment_6_3_18315);
            ruleModuleInstances();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getInstancesModuleInstancesParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__InstancesAssignment_6_3_1"


    // $ANTLR start "rule__Module__TypesAssignment_7_2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4226:1: rule__Module__TypesAssignment_7_2 : ( ruleTypeDecl ) ;
    public final void rule__Module__TypesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4230:1: ( ( ruleTypeDecl ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4231:1: ( ruleTypeDecl )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4231:1: ( ruleTypeDecl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4232:1: ruleTypeDecl
            {
             before(grammarAccess.getModuleAccess().getTypesTypeDeclParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_rule__Module__TypesAssignment_7_28346);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getTypesTypeDeclParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__TypesAssignment_7_2"


    // $ANTLR start "rule__Module__TypesAssignment_7_3_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4241:1: rule__Module__TypesAssignment_7_3_1 : ( ruleTypeDecl ) ;
    public final void rule__Module__TypesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4245:1: ( ( ruleTypeDecl ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4246:1: ( ruleTypeDecl )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4246:1: ( ruleTypeDecl )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4247:1: ruleTypeDecl
            {
             before(grammarAccess.getModuleAccess().getTypesTypeDeclParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_rule__Module__TypesAssignment_7_3_18377);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getTypesTypeDeclParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__TypesAssignment_7_3_1"


    // $ANTLR start "rule__Input__NameAssignment_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4256:1: rule__Input__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4260:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4261:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4261:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4262:1: ruleEString
            {
             before(grammarAccess.getInputAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Input__NameAssignment_18408);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NameAssignment_1"


    // $ANTLR start "rule__Input__TypeAssignment_4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4271:1: rule__Input__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Input__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4275:1: ( ( ( ruleEString ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4276:1: ( ( ruleEString ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4276:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4277:1: ( ruleEString )
            {
             before(grammarAccess.getInputAccess().getTypeTypeDeclCrossReference_4_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4278:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4279:1: ruleEString
            {
             before(grammarAccess.getInputAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Input__TypeAssignment_48443);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInputAccess().getTypeTypeDeclCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TypeAssignment_4"


    // $ANTLR start "rule__Output__NameAssignment_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4290:1: rule__Output__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Output__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4294:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4295:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4295:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4296:1: ruleEString
            {
             before(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Output__NameAssignment_18478);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__NameAssignment_1"


    // $ANTLR start "rule__Output__TypeAssignment_4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4305:1: rule__Output__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Output__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4309:1: ( ( ( ruleEString ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4310:1: ( ( ruleEString ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4310:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4311:1: ( ruleEString )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeDeclCrossReference_4_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4312:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4313:1: ruleEString
            {
             before(grammarAccess.getOutputAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Output__TypeAssignment_48513);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getOutputAccess().getTypeTypeDeclCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__TypeAssignment_4"


    // $ANTLR start "rule__Output__LeftAssignment_5_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4324:1: rule__Output__LeftAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Output__LeftAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4328:1: ( ( ( ruleEString ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4329:1: ( ( ruleEString ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4329:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4330:1: ( ruleEString )
            {
             before(grammarAccess.getOutputAccess().getLeftStreamCrossReference_5_1_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4331:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4332:1: ruleEString
            {
             before(grammarAccess.getOutputAccess().getLeftStreamEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Output__LeftAssignment_5_18552);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getLeftStreamEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getOutputAccess().getLeftStreamCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__LeftAssignment_5_1"


    // $ANTLR start "rule__ModuleInstances__NameAssignment_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4343:1: rule__ModuleInstances__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ModuleInstances__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4347:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4348:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4348:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4349:1: ruleEString
            {
             before(grammarAccess.getModuleInstancesAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ModuleInstances__NameAssignment_18587);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModuleInstancesAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__NameAssignment_1"


    // $ANTLR start "rule__ModuleInstances__DescAssignment_4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4358:1: rule__ModuleInstances__DescAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ModuleInstances__DescAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4362:1: ( ( ( ruleEString ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4363:1: ( ( ruleEString ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4363:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4364:1: ( ruleEString )
            {
             before(grammarAccess.getModuleInstancesAccess().getDescModuleCrossReference_4_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4365:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4366:1: ruleEString
            {
             before(grammarAccess.getModuleInstancesAccess().getDescModuleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ModuleInstances__DescAssignment_48622);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModuleInstancesAccess().getDescModuleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getModuleInstancesAccess().getDescModuleCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__DescAssignment_4"


    // $ANTLR start "rule__ModuleInstances__LeftAssignment_5_2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4377:1: rule__ModuleInstances__LeftAssignment_5_2 : ( ruleStream ) ;
    public final void rule__ModuleInstances__LeftAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4381:1: ( ( ruleStream ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4382:1: ( ruleStream )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4382:1: ( ruleStream )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4383:1: ruleStream
            {
             before(grammarAccess.getModuleInstancesAccess().getLeftStreamParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleStream_in_rule__ModuleInstances__LeftAssignment_5_28657);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getModuleInstancesAccess().getLeftStreamParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__LeftAssignment_5_2"


    // $ANTLR start "rule__ModuleInstances__LeftAssignment_5_3_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4392:1: rule__ModuleInstances__LeftAssignment_5_3_1 : ( ruleStream ) ;
    public final void rule__ModuleInstances__LeftAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4396:1: ( ( ruleStream ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4397:1: ( ruleStream )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4397:1: ( ruleStream )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4398:1: ruleStream
            {
             before(grammarAccess.getModuleInstancesAccess().getLeftStreamParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_ruleStream_in_rule__ModuleInstances__LeftAssignment_5_3_18688);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getModuleInstancesAccess().getLeftStreamParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleInstances__LeftAssignment_5_3_1"


    // $ANTLR start "rule__Stream_Impl__NameAssignment_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4407:1: rule__Stream_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Stream_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4411:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4412:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4412:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4413:1: ruleEString
            {
             before(grammarAccess.getStream_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Stream_Impl__NameAssignment_18719);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStream_ImplAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__NameAssignment_1"


    // $ANTLR start "rule__Stream_Impl__TypeAssignment_4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4422:1: rule__Stream_Impl__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Stream_Impl__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4426:1: ( ( ( ruleEString ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4427:1: ( ( ruleEString ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4427:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4428:1: ( ruleEString )
            {
             before(grammarAccess.getStream_ImplAccess().getTypeTypeDeclCrossReference_4_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4429:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4430:1: ruleEString
            {
             before(grammarAccess.getStream_ImplAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Stream_Impl__TypeAssignment_48754);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStream_ImplAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getStream_ImplAccess().getTypeTypeDeclCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream_Impl__TypeAssignment_4"


    // $ANTLR start "rule__Literal__NameAssignment_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4441:1: rule__Literal__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Literal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4445:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4446:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4446:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4447:1: ruleEString
            {
             before(grammarAccess.getLiteralAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Literal__NameAssignment_18789);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_1"


    // $ANTLR start "rule__Literal__ValueAssignment_3_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4456:1: rule__Literal__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Literal__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4460:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4461:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4461:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4462:1: ruleEString
            {
             before(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Literal__ValueAssignment_3_18820);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_3_1"


    // $ANTLR start "rule__Literal__TypeAssignment_5"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4471:1: rule__Literal__TypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Literal__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4475:1: ( ( ( ruleEString ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4476:1: ( ( ruleEString ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4476:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4477:1: ( ruleEString )
            {
             before(grammarAccess.getLiteralAccess().getTypeTypeDeclCrossReference_5_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4478:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4479:1: ruleEString
            {
             before(grammarAccess.getLiteralAccess().getTypeTypeDeclEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Literal__TypeAssignment_58855);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getTypeTypeDeclEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLiteralAccess().getTypeTypeDeclCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__TypeAssignment_5"


    // $ANTLR start "rule__NativeType__NameAssignment_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4490:1: rule__NativeType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__NativeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4494:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4495:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4495:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4496:1: ruleEString
            {
             before(grammarAccess.getNativeTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__NativeType__NameAssignment_18890);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNativeTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__NameAssignment_1"


    // $ANTLR start "rule__NativeType__TypeAssignment_4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4505:1: rule__NativeType__TypeAssignment_4 : ( ruleNativeTypeOptions ) ;
    public final void rule__NativeType__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4509:1: ( ( ruleNativeTypeOptions ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4510:1: ( ruleNativeTypeOptions )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4510:1: ( ruleNativeTypeOptions )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4511:1: ruleNativeTypeOptions
            {
             before(grammarAccess.getNativeTypeAccess().getTypeNativeTypeOptionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNativeTypeOptions_in_rule__NativeType__TypeAssignment_48921);
            ruleNativeTypeOptions();

            state._fsp--;

             after(grammarAccess.getNativeTypeAccess().getTypeNativeTypeOptionsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__TypeAssignment_4"


    // $ANTLR start "rule__List__NameAssignment_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4520:1: rule__List__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__List__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4524:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4525:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4525:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4526:1: ruleEString
            {
             before(grammarAccess.getListAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__List__NameAssignment_18952);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getListAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__NameAssignment_1"


    // $ANTLR start "rule__List__TypeAssignment_4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4535:1: rule__List__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__List__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4539:1: ( ( ( ruleEString ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4540:1: ( ( ruleEString ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4540:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4541:1: ( ruleEString )
            {
             before(grammarAccess.getListAccess().getTypeTypeDeclCrossReference_4_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4542:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4543:1: ruleEString
            {
             before(grammarAccess.getListAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__List__TypeAssignment_48987);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getListAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getListAccess().getTypeTypeDeclCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__TypeAssignment_4"


    // $ANTLR start "rule__Hash__NameAssignment_2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4554:1: rule__Hash__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Hash__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4558:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4559:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4559:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4560:1: ruleEString
            {
             before(grammarAccess.getHashAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Hash__NameAssignment_29022);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHashAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__NameAssignment_2"


    // $ANTLR start "rule__Hash__ItemsAssignment_4_2"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4569:1: rule__Hash__ItemsAssignment_4_2 : ( ruleHashItem ) ;
    public final void rule__Hash__ItemsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4573:1: ( ( ruleHashItem ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4574:1: ( ruleHashItem )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4574:1: ( ruleHashItem )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4575:1: ruleHashItem
            {
             before(grammarAccess.getHashAccess().getItemsHashItemParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleHashItem_in_rule__Hash__ItemsAssignment_4_29053);
            ruleHashItem();

            state._fsp--;

             after(grammarAccess.getHashAccess().getItemsHashItemParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__ItemsAssignment_4_2"


    // $ANTLR start "rule__Hash__ItemsAssignment_4_3_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4584:1: rule__Hash__ItemsAssignment_4_3_1 : ( ruleHashItem ) ;
    public final void rule__Hash__ItemsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4588:1: ( ( ruleHashItem ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4589:1: ( ruleHashItem )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4589:1: ( ruleHashItem )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4590:1: ruleHashItem
            {
             before(grammarAccess.getHashAccess().getItemsHashItemParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleHashItem_in_rule__Hash__ItemsAssignment_4_3_19084);
            ruleHashItem();

            state._fsp--;

             after(grammarAccess.getHashAccess().getItemsHashItemParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hash__ItemsAssignment_4_3_1"


    // $ANTLR start "rule__HashItem__NameAssignment_1"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4599:1: rule__HashItem__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__HashItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4603:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4604:1: ( ruleEString )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4604:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4605:1: ruleEString
            {
             before(grammarAccess.getHashItemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__HashItem__NameAssignment_19115);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHashItemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__NameAssignment_1"


    // $ANTLR start "rule__HashItem__TypeAssignment_4"
    // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4614:1: rule__HashItem__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__HashItem__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4618:1: ( ( ( ruleEString ) ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4619:1: ( ( ruleEString ) )
            {
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4619:1: ( ( ruleEString ) )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4620:1: ( ruleEString )
            {
             before(grammarAccess.getHashItemAccess().getTypeTypeDeclCrossReference_4_0()); 
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4621:1: ( ruleEString )
            // ../com.visualligence.g/src-gen/com/visualligence/g/ui/contentassist/antlr/internal/InternalVML.g:4622:1: ruleEString
            {
             before(grammarAccess.getHashItemAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__HashItem__TypeAssignment_49150);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHashItemAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getHashItemAccess().getTypeTypeDeclCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashItem__TypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Alternatives_in_ruleTypeDecl154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_entryRuleStream181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Alternatives_in_ruleStream214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0_in_ruleOutput394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleInstances_in_entryRuleModuleInstances421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleInstances428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__0_in_ruleModuleInstances454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_Impl_in_entryRuleStream_Impl481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream_Impl488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__0_in_ruleStream_Impl514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__0_in_ruleLiteral574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_entryRuleNativeType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__Group__0_in_ruleNativeType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0_in_ruleList694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHash_in_entryRuleHash721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHash728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group__0_in_ruleHash754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeTypeOptions_in_entryRuleNativeTypeOptions781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeTypeOptions788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNativeTypeOptions815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashItem_in_entryRuleHashItem843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashItem850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__Group__0_in_ruleHashItem876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_rule__TypeDecl__Alternatives912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__TypeDecl__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHash_in_rule__TypeDecl__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_Impl_in_rule__Stream__Alternatives978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Stream__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Stream__Alternatives1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Stream__Alternatives1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01108 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11169 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Module__Group__1__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31291 = new BitSet(new long[]{0x00000000000EC000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group__3__Impl1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41353 = new BitSet(new long[]{0x00000000000EC000L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51414 = new BitSet(new long[]{0x00000000000EC000L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__51417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_5__0_in_rule__Module__Group__5__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__61475 = new BitSet(new long[]{0x00000000000EC000L});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__61478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__0_in_rule__Module__Group__6__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__71536 = new BitSet(new long[]{0x00000000000EC000L});
    public static final BitSet FOLLOW_rule__Module__Group__8_in_rule__Module__Group__71539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_7__0_in_rule__Module__Group__7__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__81597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group__8__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01674 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Module__Group_4__0__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11736 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__2_in_rule__Module__Group_4__11739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group_4__1__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__2__Impl_in_rule__Module__Group_4__21798 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__3_in_rule__Module__Group_4__21801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__InputAssignment_4_2_in_rule__Module__Group_4__2__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__3__Impl_in_rule__Module__Group_4__31858 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__4_in_rule__Module__Group_4__31861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_3__0_in_rule__Module__Group_4__3__Impl1888 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__4__Impl_in_rule__Module__Group_4__41919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group_4__4__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_3__0__Impl_in_rule__Module__Group_4_3__01988 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Module__Group_4_3__1_in_rule__Module__Group_4_3__01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Module__Group_4_3__0__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_3__1__Impl_in_rule__Module__Group_4_3__12050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__InputAssignment_4_3_1_in_rule__Module__Group_4_3__1__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_5__0__Impl_in_rule__Module__Group_5__02111 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Module__Group_5__1_in_rule__Module__Group_5__02114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Module__Group_5__0__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_5__1__Impl_in_rule__Module__Group_5__12173 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Module__Group_5__2_in_rule__Module__Group_5__12176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group_5__1__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_5__2__Impl_in_rule__Module__Group_5__22235 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Module__Group_5__3_in_rule__Module__Group_5__22238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__OutputAssignment_5_2_in_rule__Module__Group_5__2__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_5__3__Impl_in_rule__Module__Group_5__32295 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Module__Group_5__4_in_rule__Module__Group_5__32298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_5_3__0_in_rule__Module__Group_5__3__Impl2325 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Module__Group_5__4__Impl_in_rule__Module__Group_5__42356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group_5__4__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_5_3__0__Impl_in_rule__Module__Group_5_3__02425 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Module__Group_5_3__1_in_rule__Module__Group_5_3__02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Module__Group_5_3__0__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_5_3__1__Impl_in_rule__Module__Group_5_3__12487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__OutputAssignment_5_3_1_in_rule__Module__Group_5_3__1__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__0__Impl_in_rule__Module__Group_6__02548 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Module__Group_6__1_in_rule__Module__Group_6__02551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Module__Group_6__0__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__1__Impl_in_rule__Module__Group_6__12610 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Module__Group_6__2_in_rule__Module__Group_6__12613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group_6__1__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__2__Impl_in_rule__Module__Group_6__22672 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Module__Group_6__3_in_rule__Module__Group_6__22675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__InstancesAssignment_6_2_in_rule__Module__Group_6__2__Impl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__3__Impl_in_rule__Module__Group_6__32732 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Module__Group_6__4_in_rule__Module__Group_6__32735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6_3__0_in_rule__Module__Group_6__3__Impl2762 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Module__Group_6__4__Impl_in_rule__Module__Group_6__42793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group_6__4__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6_3__0__Impl_in_rule__Module__Group_6_3__02862 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Module__Group_6_3__1_in_rule__Module__Group_6_3__02865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Module__Group_6_3__0__Impl2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_6_3__1__Impl_in_rule__Module__Group_6_3__12924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__InstancesAssignment_6_3_1_in_rule__Module__Group_6_3__1__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_7__0__Impl_in_rule__Module__Group_7__02985 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Module__Group_7__1_in_rule__Module__Group_7__02988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Module__Group_7__0__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_7__1__Impl_in_rule__Module__Group_7__13047 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__Module__Group_7__2_in_rule__Module__Group_7__13050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group_7__1__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_7__2__Impl_in_rule__Module__Group_7__23109 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Module__Group_7__3_in_rule__Module__Group_7__23112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__TypesAssignment_7_2_in_rule__Module__Group_7__2__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_7__3__Impl_in_rule__Module__Group_7__33169 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Module__Group_7__4_in_rule__Module__Group_7__33172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_7_3__0_in_rule__Module__Group_7__3__Impl3199 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Module__Group_7__4__Impl_in_rule__Module__Group_7__43230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group_7__4__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_7_3__0__Impl_in_rule__Module__Group_7_3__03299 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__Module__Group_7_3__1_in_rule__Module__Group_7_3__03302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Module__Group_7_3__0__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_7_3__1__Impl_in_rule__Module__Group_7_3__13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__TypesAssignment_7_3_1_in_rule__Module__Group_7_3__1__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03422 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Input__Group__0__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13484 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__13487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__NameAssignment_1_in_rule__Input__Group__1__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__23544 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__23547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Input__Group__2__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__33606 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__33609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Input__Group__3__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__43668 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Input__Group__5_in_rule__Input__Group__43671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TypeAssignment_4_in_rule__Input__Group__4__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__53728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Input__Group__5__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03799 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Output__Group__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Output__Group__2_in_rule__Output__Group__13864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__NameAssignment_1_in_rule__Output__Group__1__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__2__Impl_in_rule__Output__Group__23921 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Output__Group__3_in_rule__Output__Group__23924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Output__Group__2__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__3__Impl_in_rule__Output__Group__33983 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Output__Group__4_in_rule__Output__Group__33986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Output__Group__3__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__4__Impl_in_rule__Output__Group__44045 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_rule__Output__Group__5_in_rule__Output__Group__44048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__TypeAssignment_4_in_rule__Output__Group__4__Impl4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__5__Impl_in_rule__Output__Group__54105 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_rule__Output__Group__6_in_rule__Output__Group__54108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_5__0_in_rule__Output__Group__5__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__6__Impl_in_rule__Output__Group__64166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Output__Group__6__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_5__0__Impl_in_rule__Output__Group_5__04239 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Output__Group_5__1_in_rule__Output__Group_5__04242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Output__Group_5__0__Impl4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_5__1__Impl_in_rule__Output__Group_5__14301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__LeftAssignment_5_1_in_rule__Output__Group_5__1__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__0__Impl_in_rule__ModuleInstances__Group__04362 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__1_in_rule__ModuleInstances__Group__04365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ModuleInstances__Group__0__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__1__Impl_in_rule__ModuleInstances__Group__14424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__2_in_rule__ModuleInstances__Group__14427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__NameAssignment_1_in_rule__ModuleInstances__Group__1__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__2__Impl_in_rule__ModuleInstances__Group__24484 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__3_in_rule__ModuleInstances__Group__24487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ModuleInstances__Group__2__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__3__Impl_in_rule__ModuleInstances__Group__34546 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__4_in_rule__ModuleInstances__Group__34549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ModuleInstances__Group__3__Impl4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__4__Impl_in_rule__ModuleInstances__Group__44608 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__5_in_rule__ModuleInstances__Group__44611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__DescAssignment_4_in_rule__ModuleInstances__Group__4__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__5__Impl_in_rule__ModuleInstances__Group__54668 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__6_in_rule__ModuleInstances__Group__54671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__0_in_rule__ModuleInstances__Group__5__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group__6__Impl_in_rule__ModuleInstances__Group__64729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModuleInstances__Group__6__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__0__Impl_in_rule__ModuleInstances__Group_5__04802 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__1_in_rule__ModuleInstances__Group_5__04805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ModuleInstances__Group_5__0__Impl4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__1__Impl_in_rule__ModuleInstances__Group_5__14864 = new BitSet(new long[]{0x000000000C500000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__2_in_rule__ModuleInstances__Group_5__14867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ModuleInstances__Group_5__1__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__2__Impl_in_rule__ModuleInstances__Group_5__24926 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__3_in_rule__ModuleInstances__Group_5__24929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__LeftAssignment_5_2_in_rule__ModuleInstances__Group_5__2__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__3__Impl_in_rule__ModuleInstances__Group_5__34986 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__4_in_rule__ModuleInstances__Group_5__34989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5_3__0_in_rule__ModuleInstances__Group_5__3__Impl5016 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5__4__Impl_in_rule__ModuleInstances__Group_5__45047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModuleInstances__Group_5__4__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5_3__0__Impl_in_rule__ModuleInstances__Group_5_3__05116 = new BitSet(new long[]{0x000000000C500000L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5_3__1_in_rule__ModuleInstances__Group_5_3__05119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModuleInstances__Group_5_3__0__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__Group_5_3__1__Impl_in_rule__ModuleInstances__Group_5_3__15178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleInstances__LeftAssignment_5_3_1_in_rule__ModuleInstances__Group_5_3__1__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__0__Impl_in_rule__Stream_Impl__Group__05239 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__1_in_rule__Stream_Impl__Group__05242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Stream_Impl__Group__0__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__1__Impl_in_rule__Stream_Impl__Group__15301 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__2_in_rule__Stream_Impl__Group__15304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__NameAssignment_1_in_rule__Stream_Impl__Group__1__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__2__Impl_in_rule__Stream_Impl__Group__25361 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__3_in_rule__Stream_Impl__Group__25364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Stream_Impl__Group__2__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__3__Impl_in_rule__Stream_Impl__Group__35423 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__4_in_rule__Stream_Impl__Group__35426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Stream_Impl__Group__3__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__4__Impl_in_rule__Stream_Impl__Group__45485 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__5_in_rule__Stream_Impl__Group__45488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__TypeAssignment_4_in_rule__Stream_Impl__Group__4__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream_Impl__Group__5__Impl_in_rule__Stream_Impl__Group__55545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Stream_Impl__Group__5__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__05616 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__05619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Literal__Group__0__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__15678 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Literal__Group__2_in_rule__Literal__Group__15681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_1_in_rule__Literal__Group__1__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__2__Impl_in_rule__Literal__Group__25738 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_rule__Literal__Group__3_in_rule__Literal__Group__25741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Literal__Group__2__Impl5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__3__Impl_in_rule__Literal__Group__35800 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_rule__Literal__Group__4_in_rule__Literal__Group__35803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Group__3__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__4__Impl_in_rule__Literal__Group__45861 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Literal__Group__5_in_rule__Literal__Group__45864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Literal__Group__4__Impl5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__5__Impl_in_rule__Literal__Group__55923 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Literal__Group__6_in_rule__Literal__Group__55926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__TypeAssignment_5_in_rule__Literal__Group__5__Impl5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__6__Impl_in_rule__Literal__Group__65983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Literal__Group__6__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__06056 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__06059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Literal__Group_3__0__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__16118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ValueAssignment_3_1_in_rule__Literal__Group_3__1__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__Group__0__Impl_in_rule__NativeType__Group__06179 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NativeType__Group__1_in_rule__NativeType__Group__06182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NativeType__Group__0__Impl6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__Group__1__Impl_in_rule__NativeType__Group__16241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NativeType__Group__2_in_rule__NativeType__Group__16244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__NameAssignment_1_in_rule__NativeType__Group__1__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__Group__2__Impl_in_rule__NativeType__Group__26301 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NativeType__Group__3_in_rule__NativeType__Group__26304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NativeType__Group__2__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__Group__3__Impl_in_rule__NativeType__Group__36363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__NativeType__Group__4_in_rule__NativeType__Group__36366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NativeType__Group__3__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__Group__4__Impl_in_rule__NativeType__Group__46425 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__NativeType__Group__5_in_rule__NativeType__Group__46428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__TypeAssignment_4_in_rule__NativeType__Group__4__Impl6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__Group__5__Impl_in_rule__NativeType__Group__56485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NativeType__Group__5__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__06556 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__06559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__List__Group__0__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__16618 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__List__Group__2_in_rule__List__Group__16621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__NameAssignment_1_in_rule__List__Group__1__Impl6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__26678 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__List__Group__3_in_rule__List__Group__26681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__List__Group__2__Impl6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__36740 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__List__Group__4_in_rule__List__Group__36743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__List__Group__3__Impl6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__46802 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__List__Group__5_in_rule__List__Group__46805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__TypeAssignment_4_in_rule__List__Group__4__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__5__Impl_in_rule__List__Group__56862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__List__Group__5__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group__0__Impl_in_rule__Hash__Group__06933 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__Hash__Group__1_in_rule__Hash__Group__06936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group__1__Impl_in_rule__Hash__Group__16994 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Hash__Group__2_in_rule__Hash__Group__16997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Hash__Group__1__Impl7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group__2__Impl_in_rule__Hash__Group__27056 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Hash__Group__3_in_rule__Hash__Group__27059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__NameAssignment_2_in_rule__Hash__Group__2__Impl7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group__3__Impl_in_rule__Hash__Group__37116 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_rule__Hash__Group__4_in_rule__Hash__Group__37119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Hash__Group__3__Impl7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group__4__Impl_in_rule__Hash__Group__47178 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_rule__Hash__Group__5_in_rule__Hash__Group__47181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__0_in_rule__Hash__Group__4__Impl7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group__5__Impl_in_rule__Hash__Group__57239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Hash__Group__5__Impl7267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__0__Impl_in_rule__Hash__Group_4__07310 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__1_in_rule__Hash__Group_4__07313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Hash__Group_4__0__Impl7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__1__Impl_in_rule__Hash__Group_4__17372 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__2_in_rule__Hash__Group_4__17375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Hash__Group_4__1__Impl7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__2__Impl_in_rule__Hash__Group_4__27434 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__3_in_rule__Hash__Group_4__27437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__ItemsAssignment_4_2_in_rule__Hash__Group_4__2__Impl7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__3__Impl_in_rule__Hash__Group_4__37494 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__4_in_rule__Hash__Group_4__37497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4_3__0_in_rule__Hash__Group_4__3__Impl7524 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4__4__Impl_in_rule__Hash__Group_4__47555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Hash__Group_4__4__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4_3__0__Impl_in_rule__Hash__Group_4_3__07624 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Hash__Group_4_3__1_in_rule__Hash__Group_4_3__07627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Hash__Group_4_3__0__Impl7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__Group_4_3__1__Impl_in_rule__Hash__Group_4_3__17686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hash__ItemsAssignment_4_3_1_in_rule__Hash__Group_4_3__1__Impl7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__Group__0__Impl_in_rule__HashItem__Group__07747 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HashItem__Group__1_in_rule__HashItem__Group__07750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__HashItem__Group__0__Impl7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__Group__1__Impl_in_rule__HashItem__Group__17809 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__HashItem__Group__2_in_rule__HashItem__Group__17812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__NameAssignment_1_in_rule__HashItem__Group__1__Impl7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__Group__2__Impl_in_rule__HashItem__Group__27869 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__HashItem__Group__3_in_rule__HashItem__Group__27872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HashItem__Group__2__Impl7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__Group__3__Impl_in_rule__HashItem__Group__37931 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HashItem__Group__4_in_rule__HashItem__Group__37934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HashItem__Group__3__Impl7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__Group__4__Impl_in_rule__HashItem__Group__47993 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__HashItem__Group__5_in_rule__HashItem__Group__47996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__TypeAssignment_4_in_rule__HashItem__Group__4__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashItem__Group__5__Impl_in_rule__HashItem__Group__58053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HashItem__Group__5__Impl8081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Module__NameAssignment_28129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Module__InputAssignment_4_28160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Module__InputAssignment_4_3_18191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Module__OutputAssignment_5_28222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Module__OutputAssignment_5_3_18253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleInstances_in_rule__Module__InstancesAssignment_6_28284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleInstances_in_rule__Module__InstancesAssignment_6_3_18315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__Module__TypesAssignment_7_28346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__Module__TypesAssignment_7_3_18377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Input__NameAssignment_18408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Input__TypeAssignment_48443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Output__NameAssignment_18478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Output__TypeAssignment_48513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Output__LeftAssignment_5_18552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ModuleInstances__NameAssignment_18587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ModuleInstances__DescAssignment_48622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_rule__ModuleInstances__LeftAssignment_5_28657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_rule__ModuleInstances__LeftAssignment_5_3_18688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Stream_Impl__NameAssignment_18719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Stream_Impl__TypeAssignment_48754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Literal__NameAssignment_18789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Literal__ValueAssignment_3_18820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Literal__TypeAssignment_58855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__NativeType__NameAssignment_18890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeTypeOptions_in_rule__NativeType__TypeAssignment_48921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__List__NameAssignment_18952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__List__TypeAssignment_48987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Hash__NameAssignment_29022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashItem_in_rule__Hash__ItemsAssignment_4_29053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashItem_in_rule__Hash__ItemsAssignment_4_3_19084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__HashItem__NameAssignment_19115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__HashItem__TypeAssignment_49150 = new BitSet(new long[]{0x0000000000000002L});

}