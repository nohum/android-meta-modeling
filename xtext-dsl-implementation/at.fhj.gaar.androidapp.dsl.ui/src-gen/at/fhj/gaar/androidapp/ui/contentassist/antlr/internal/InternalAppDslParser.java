package at.fhj.gaar.androidapp.ui.contentassist.antlr.internal; 

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
import at.fhj.gaar.androidapp.services.AppDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PACKAGE_NAME", "RULE_INT", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'application'", "'{'", "'}'", "'min-sdk'", "'target-sdk'", "'compile-sdk'", "'permissions'", "'['", "']'", "'elements'", "'main-activity'", "'activity'", "'receiver'", "'service'", "'enabled'", "'exported'", "'title'", "'intents'", "'parent'", "'layout-elements'", "'button'", "'action'", "'spacer'", "'text'", "'show-toast'", "'start-activity'", "'start-service'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=6;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_PACKAGE_NAME=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalAppDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAppDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAppDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g"; }


     
     	private AppDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AppDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleAndroidAppProject"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:60:1: entryRuleAndroidAppProject : ruleAndroidAppProject EOF ;
    public final void entryRuleAndroidAppProject() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:61:1: ( ruleAndroidAppProject EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:62:1: ruleAndroidAppProject EOF
            {
             before(grammarAccess.getAndroidAppProjectRule()); 
            pushFollow(FOLLOW_ruleAndroidAppProject_in_entryRuleAndroidAppProject61);
            ruleAndroidAppProject();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidAppProject68); 

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
    // $ANTLR end "entryRuleAndroidAppProject"


    // $ANTLR start "ruleAndroidAppProject"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:69:1: ruleAndroidAppProject : ( ( rule__AndroidAppProject__Group__0 ) ) ;
    public final void ruleAndroidAppProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:73:2: ( ( ( rule__AndroidAppProject__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:74:1: ( ( rule__AndroidAppProject__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:74:1: ( ( rule__AndroidAppProject__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:75:1: ( rule__AndroidAppProject__Group__0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:76:1: ( rule__AndroidAppProject__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:76:2: rule__AndroidAppProject__Group__0
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__0_in_ruleAndroidAppProject94);
            rule__AndroidAppProject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getGroup()); 

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
    // $ANTLR end "ruleAndroidAppProject"


    // $ANTLR start "entryRuleApplication"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:88:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:89:1: ( ruleApplication EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:90:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication121);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication128); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:97:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:101:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:102:1: ( ( rule__Application__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:102:1: ( ( rule__Application__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:103:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:104:1: ( rule__Application__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:104:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication154);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleApplicationAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:116:1: entryRuleApplicationAttribute : ruleApplicationAttribute EOF ;
    public final void entryRuleApplicationAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:117:1: ( ruleApplicationAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:118:1: ruleApplicationAttribute EOF
            {
             before(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute181);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationAttribute188); 

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
    // $ANTLR end "entryRuleApplicationAttribute"


    // $ANTLR start "ruleApplicationAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:125:1: ruleApplicationAttribute : ( ( rule__ApplicationAttribute__Alternatives ) ) ;
    public final void ruleApplicationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:129:2: ( ( ( rule__ApplicationAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:130:1: ( ( rule__ApplicationAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:130:1: ( ( rule__ApplicationAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:131:1: ( rule__ApplicationAttribute__Alternatives )
            {
             before(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:132:1: ( rule__ApplicationAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:132:2: rule__ApplicationAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ApplicationAttribute__Alternatives_in_ruleApplicationAttribute214);
            rule__ApplicationAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleApplicationAttribute"


    // $ANTLR start "entryRuleApplicationMinSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:144:1: entryRuleApplicationMinSdk : ruleApplicationMinSdk EOF ;
    public final void entryRuleApplicationMinSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:145:1: ( ruleApplicationMinSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:146:1: ruleApplicationMinSdk EOF
            {
             before(grammarAccess.getApplicationMinSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk241);
            ruleApplicationMinSdk();

            state._fsp--;

             after(grammarAccess.getApplicationMinSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMinSdk248); 

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
    // $ANTLR end "entryRuleApplicationMinSdk"


    // $ANTLR start "ruleApplicationMinSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:153:1: ruleApplicationMinSdk : ( ( rule__ApplicationMinSdk__Group__0 ) ) ;
    public final void ruleApplicationMinSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:157:2: ( ( ( rule__ApplicationMinSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:158:1: ( ( rule__ApplicationMinSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:158:1: ( ( rule__ApplicationMinSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:159:1: ( rule__ApplicationMinSdk__Group__0 )
            {
             before(grammarAccess.getApplicationMinSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:160:1: ( rule__ApplicationMinSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:160:2: rule__ApplicationMinSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__0_in_ruleApplicationMinSdk274);
            rule__ApplicationMinSdk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMinSdkAccess().getGroup()); 

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
    // $ANTLR end "ruleApplicationMinSdk"


    // $ANTLR start "entryRuleApplicationTargetSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:172:1: entryRuleApplicationTargetSdk : ruleApplicationTargetSdk EOF ;
    public final void entryRuleApplicationTargetSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:173:1: ( ruleApplicationTargetSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:174:1: ruleApplicationTargetSdk EOF
            {
             before(grammarAccess.getApplicationTargetSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk301);
            ruleApplicationTargetSdk();

            state._fsp--;

             after(grammarAccess.getApplicationTargetSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationTargetSdk308); 

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
    // $ANTLR end "entryRuleApplicationTargetSdk"


    // $ANTLR start "ruleApplicationTargetSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:181:1: ruleApplicationTargetSdk : ( ( rule__ApplicationTargetSdk__Group__0 ) ) ;
    public final void ruleApplicationTargetSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:185:2: ( ( ( rule__ApplicationTargetSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:186:1: ( ( rule__ApplicationTargetSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:186:1: ( ( rule__ApplicationTargetSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:187:1: ( rule__ApplicationTargetSdk__Group__0 )
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:188:1: ( rule__ApplicationTargetSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:188:2: rule__ApplicationTargetSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__0_in_ruleApplicationTargetSdk334);
            rule__ApplicationTargetSdk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationTargetSdkAccess().getGroup()); 

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
    // $ANTLR end "ruleApplicationTargetSdk"


    // $ANTLR start "entryRuleApplicationCompileSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:200:1: entryRuleApplicationCompileSdk : ruleApplicationCompileSdk EOF ;
    public final void entryRuleApplicationCompileSdk() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:201:1: ( ruleApplicationCompileSdk EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:202:1: ruleApplicationCompileSdk EOF
            {
             before(grammarAccess.getApplicationCompileSdkRule()); 
            pushFollow(FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk361);
            ruleApplicationCompileSdk();

            state._fsp--;

             after(grammarAccess.getApplicationCompileSdkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationCompileSdk368); 

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
    // $ANTLR end "entryRuleApplicationCompileSdk"


    // $ANTLR start "ruleApplicationCompileSdk"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:209:1: ruleApplicationCompileSdk : ( ( rule__ApplicationCompileSdk__Group__0 ) ) ;
    public final void ruleApplicationCompileSdk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:213:2: ( ( ( rule__ApplicationCompileSdk__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:214:1: ( ( rule__ApplicationCompileSdk__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:214:1: ( ( rule__ApplicationCompileSdk__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:215:1: ( rule__ApplicationCompileSdk__Group__0 )
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:216:1: ( rule__ApplicationCompileSdk__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:216:2: rule__ApplicationCompileSdk__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__0_in_ruleApplicationCompileSdk394);
            rule__ApplicationCompileSdk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationCompileSdkAccess().getGroup()); 

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
    // $ANTLR end "ruleApplicationCompileSdk"


    // $ANTLR start "entryRuleApplicationPermissionList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:228:1: entryRuleApplicationPermissionList : ruleApplicationPermissionList EOF ;
    public final void entryRuleApplicationPermissionList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:229:1: ( ruleApplicationPermissionList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:230:1: ruleApplicationPermissionList EOF
            {
             before(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList421);
            ruleApplicationPermissionList();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationPermissionList428); 

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
    // $ANTLR end "entryRuleApplicationPermissionList"


    // $ANTLR start "ruleApplicationPermissionList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:237:1: ruleApplicationPermissionList : ( ( rule__ApplicationPermissionList__Group__0 ) ) ;
    public final void ruleApplicationPermissionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:241:2: ( ( ( rule__ApplicationPermissionList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:242:1: ( ( rule__ApplicationPermissionList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:242:1: ( ( rule__ApplicationPermissionList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:243:1: ( rule__ApplicationPermissionList__Group__0 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:244:1: ( rule__ApplicationPermissionList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:244:2: rule__ApplicationPermissionList__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__0_in_ruleApplicationPermissionList454);
            rule__ApplicationPermissionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getGroup()); 

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
    // $ANTLR end "ruleApplicationPermissionList"


    // $ANTLR start "entryRuleApplicationElementList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:256:1: entryRuleApplicationElementList : ruleApplicationElementList EOF ;
    public final void entryRuleApplicationElementList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:257:1: ( ruleApplicationElementList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:258:1: ruleApplicationElementList EOF
            {
             before(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList481);
            ruleApplicationElementList();

            state._fsp--;

             after(grammarAccess.getApplicationElementListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElementList488); 

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
    // $ANTLR end "entryRuleApplicationElementList"


    // $ANTLR start "ruleApplicationElementList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:265:1: ruleApplicationElementList : ( ( rule__ApplicationElementList__Group__0 ) ) ;
    public final void ruleApplicationElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:269:2: ( ( ( rule__ApplicationElementList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:270:1: ( ( rule__ApplicationElementList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:270:1: ( ( rule__ApplicationElementList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:271:1: ( rule__ApplicationElementList__Group__0 )
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:272:1: ( rule__ApplicationElementList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:272:2: rule__ApplicationElementList__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__0_in_ruleApplicationElementList514);
            rule__ApplicationElementList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementListAccess().getGroup()); 

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
    // $ANTLR end "ruleApplicationElementList"


    // $ANTLR start "entryRuleApplicationMainActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:284:1: entryRuleApplicationMainActivity : ruleApplicationMainActivity EOF ;
    public final void entryRuleApplicationMainActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:285:1: ( ruleApplicationMainActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:286:1: ruleApplicationMainActivity EOF
            {
             before(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity541);
            ruleApplicationMainActivity();

            state._fsp--;

             after(grammarAccess.getApplicationMainActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationMainActivity548); 

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
    // $ANTLR end "entryRuleApplicationMainActivity"


    // $ANTLR start "ruleApplicationMainActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:293:1: ruleApplicationMainActivity : ( ( rule__ApplicationMainActivity__Group__0 ) ) ;
    public final void ruleApplicationMainActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:297:2: ( ( ( rule__ApplicationMainActivity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:298:1: ( ( rule__ApplicationMainActivity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:298:1: ( ( rule__ApplicationMainActivity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:299:1: ( rule__ApplicationMainActivity__Group__0 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:300:1: ( rule__ApplicationMainActivity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:300:2: rule__ApplicationMainActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__0_in_ruleApplicationMainActivity574);
            rule__ApplicationMainActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMainActivityAccess().getGroup()); 

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
    // $ANTLR end "ruleApplicationMainActivity"


    // $ANTLR start "entryRulePermission"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:312:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:313:1: ( rulePermission EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:314:1: rulePermission EOF
            {
             before(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission601);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPermissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission608); 

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
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:321:1: rulePermission : ( ( rule__Permission__NameAssignment ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:325:2: ( ( ( rule__Permission__NameAssignment ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:326:1: ( ( rule__Permission__NameAssignment ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:326:1: ( ( rule__Permission__NameAssignment ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:327:1: ( rule__Permission__NameAssignment )
            {
             before(grammarAccess.getPermissionAccess().getNameAssignment()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:328:1: ( rule__Permission__NameAssignment )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:328:2: rule__Permission__NameAssignment
            {
            pushFollow(FOLLOW_rule__Permission__NameAssignment_in_rulePermission634);
            rule__Permission__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getNameAssignment()); 

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
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:340:1: entryRuleApplicationElement : ruleApplicationElement EOF ;
    public final void entryRuleApplicationElement() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:341:1: ( ruleApplicationElement EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:342:1: ruleApplicationElement EOF
            {
             before(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement661);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationElement668); 

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
    // $ANTLR end "entryRuleApplicationElement"


    // $ANTLR start "ruleApplicationElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:349:1: ruleApplicationElement : ( ( rule__ApplicationElement__Alternatives ) ) ;
    public final void ruleApplicationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:353:2: ( ( ( rule__ApplicationElement__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:354:1: ( ( rule__ApplicationElement__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:354:1: ( ( rule__ApplicationElement__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:355:1: ( rule__ApplicationElement__Alternatives )
            {
             before(grammarAccess.getApplicationElementAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:356:1: ( rule__ApplicationElement__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:356:2: rule__ApplicationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ApplicationElement__Alternatives_in_ruleApplicationElement694);
            rule__ApplicationElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleApplicationElement"


    // $ANTLR start "entryRuleActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:368:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:369:1: ( ruleActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:370:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity721);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity728); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:377:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:381:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:382:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:382:1: ( ( rule__Activity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:383:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:384:1: ( rule__Activity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:384:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity754);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleBroadcastReceiver"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:396:1: entryRuleBroadcastReceiver : ruleBroadcastReceiver EOF ;
    public final void entryRuleBroadcastReceiver() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:397:1: ( ruleBroadcastReceiver EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:398:1: ruleBroadcastReceiver EOF
            {
             before(grammarAccess.getBroadcastReceiverRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver781);
            ruleBroadcastReceiver();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiver788); 

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
    // $ANTLR end "entryRuleBroadcastReceiver"


    // $ANTLR start "ruleBroadcastReceiver"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:405:1: ruleBroadcastReceiver : ( ( rule__BroadcastReceiver__Group__0 ) ) ;
    public final void ruleBroadcastReceiver() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:409:2: ( ( ( rule__BroadcastReceiver__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:410:1: ( ( rule__BroadcastReceiver__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:410:1: ( ( rule__BroadcastReceiver__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:411:1: ( rule__BroadcastReceiver__Group__0 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:412:1: ( rule__BroadcastReceiver__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:412:2: rule__BroadcastReceiver__Group__0
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__0_in_ruleBroadcastReceiver814);
            rule__BroadcastReceiver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getGroup()); 

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
    // $ANTLR end "ruleBroadcastReceiver"


    // $ANTLR start "entryRuleService"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:424:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:425:1: ( ruleService EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:426:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService841);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService848); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:433:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:437:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:438:1: ( ( rule__Service__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:438:1: ( ( rule__Service__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:439:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:440:1: ( rule__Service__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:440:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService874);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleActivityAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:452:1: entryRuleActivityAttribute : ruleActivityAttribute EOF ;
    public final void entryRuleActivityAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:453:1: ( ruleActivityAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:454:1: ruleActivityAttribute EOF
            {
             before(grammarAccess.getActivityAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute901);
            ruleActivityAttribute();

            state._fsp--;

             after(grammarAccess.getActivityAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityAttribute908); 

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
    // $ANTLR end "entryRuleActivityAttribute"


    // $ANTLR start "ruleActivityAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:461:1: ruleActivityAttribute : ( ( rule__ActivityAttribute__Alternatives ) ) ;
    public final void ruleActivityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:465:2: ( ( ( rule__ActivityAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:466:1: ( ( rule__ActivityAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:466:1: ( ( rule__ActivityAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:467:1: ( rule__ActivityAttribute__Alternatives )
            {
             before(grammarAccess.getActivityAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:468:1: ( rule__ActivityAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:468:2: rule__ActivityAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ActivityAttribute__Alternatives_in_ruleActivityAttribute934);
            rule__ActivityAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActivityAttribute"


    // $ANTLR start "entryRuleBroadcastReceiverAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:480:1: entryRuleBroadcastReceiverAttribute : ruleBroadcastReceiverAttribute EOF ;
    public final void entryRuleBroadcastReceiverAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:481:1: ( ruleBroadcastReceiverAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:482:1: ruleBroadcastReceiverAttribute EOF
            {
             before(grammarAccess.getBroadcastReceiverAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute961);
            ruleBroadcastReceiverAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute968); 

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
    // $ANTLR end "entryRuleBroadcastReceiverAttribute"


    // $ANTLR start "ruleBroadcastReceiverAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:489:1: ruleBroadcastReceiverAttribute : ( ( rule__BroadcastReceiverAttribute__Alternatives ) ) ;
    public final void ruleBroadcastReceiverAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:493:2: ( ( ( rule__BroadcastReceiverAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:494:1: ( ( rule__BroadcastReceiverAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:494:1: ( ( rule__BroadcastReceiverAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:495:1: ( rule__BroadcastReceiverAttribute__Alternatives )
            {
             before(grammarAccess.getBroadcastReceiverAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:496:1: ( rule__BroadcastReceiverAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:496:2: rule__BroadcastReceiverAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverAttribute__Alternatives_in_ruleBroadcastReceiverAttribute994);
            rule__BroadcastReceiverAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBroadcastReceiverAttribute"


    // $ANTLR start "entryRuleServiceAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:508:1: entryRuleServiceAttribute : ruleServiceAttribute EOF ;
    public final void entryRuleServiceAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:509:1: ( ruleServiceAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:510:1: ruleServiceAttribute EOF
            {
             before(grammarAccess.getServiceAttributeRule()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute1021);
            ruleServiceAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceAttribute1028); 

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
    // $ANTLR end "entryRuleServiceAttribute"


    // $ANTLR start "ruleServiceAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:517:1: ruleServiceAttribute : ( ( rule__ServiceAttribute__Alternatives ) ) ;
    public final void ruleServiceAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:521:2: ( ( ( rule__ServiceAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:522:1: ( ( rule__ServiceAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:522:1: ( ( rule__ServiceAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:523:1: ( rule__ServiceAttribute__Alternatives )
            {
             before(grammarAccess.getServiceAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:524:1: ( rule__ServiceAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:524:2: rule__ServiceAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceAttribute__Alternatives_in_ruleServiceAttribute1054);
            rule__ServiceAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleServiceAttribute"


    // $ANTLR start "entryRuleElementEnabledAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:536:1: entryRuleElementEnabledAttribute : ruleElementEnabledAttribute EOF ;
    public final void entryRuleElementEnabledAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:537:1: ( ruleElementEnabledAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:538:1: ruleElementEnabledAttribute EOF
            {
             before(grammarAccess.getElementEnabledAttributeRule()); 
            pushFollow(FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute1081);
            ruleElementEnabledAttribute();

            state._fsp--;

             after(grammarAccess.getElementEnabledAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementEnabledAttribute1088); 

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
    // $ANTLR end "entryRuleElementEnabledAttribute"


    // $ANTLR start "ruleElementEnabledAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:545:1: ruleElementEnabledAttribute : ( ( rule__ElementEnabledAttribute__Group__0 ) ) ;
    public final void ruleElementEnabledAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:549:2: ( ( ( rule__ElementEnabledAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:550:1: ( ( rule__ElementEnabledAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:550:1: ( ( rule__ElementEnabledAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:551:1: ( rule__ElementEnabledAttribute__Group__0 )
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:552:1: ( rule__ElementEnabledAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:552:2: rule__ElementEnabledAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__0_in_ruleElementEnabledAttribute1114);
            rule__ElementEnabledAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementEnabledAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleElementEnabledAttribute"


    // $ANTLR start "entryRuleElementExportedAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:564:1: entryRuleElementExportedAttribute : ruleElementExportedAttribute EOF ;
    public final void entryRuleElementExportedAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:565:1: ( ruleElementExportedAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:566:1: ruleElementExportedAttribute EOF
            {
             before(grammarAccess.getElementExportedAttributeRule()); 
            pushFollow(FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute1141);
            ruleElementExportedAttribute();

            state._fsp--;

             after(grammarAccess.getElementExportedAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementExportedAttribute1148); 

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
    // $ANTLR end "entryRuleElementExportedAttribute"


    // $ANTLR start "ruleElementExportedAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:573:1: ruleElementExportedAttribute : ( ( rule__ElementExportedAttribute__Group__0 ) ) ;
    public final void ruleElementExportedAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:577:2: ( ( ( rule__ElementExportedAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:578:1: ( ( rule__ElementExportedAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:578:1: ( ( rule__ElementExportedAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:579:1: ( rule__ElementExportedAttribute__Group__0 )
            {
             before(grammarAccess.getElementExportedAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:580:1: ( rule__ElementExportedAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:580:2: rule__ElementExportedAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__0_in_ruleElementExportedAttribute1174);
            rule__ElementExportedAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementExportedAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleElementExportedAttribute"


    // $ANTLR start "entryRuleElementLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:592:1: entryRuleElementLabelAttribute : ruleElementLabelAttribute EOF ;
    public final void entryRuleElementLabelAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:593:1: ( ruleElementLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:594:1: ruleElementLabelAttribute EOF
            {
             before(grammarAccess.getElementLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute1201);
            ruleElementLabelAttribute();

            state._fsp--;

             after(grammarAccess.getElementLabelAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLabelAttribute1208); 

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
    // $ANTLR end "entryRuleElementLabelAttribute"


    // $ANTLR start "ruleElementLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:601:1: ruleElementLabelAttribute : ( ( rule__ElementLabelAttribute__Group__0 ) ) ;
    public final void ruleElementLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:605:2: ( ( ( rule__ElementLabelAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:606:1: ( ( rule__ElementLabelAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:606:1: ( ( rule__ElementLabelAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:607:1: ( rule__ElementLabelAttribute__Group__0 )
            {
             before(grammarAccess.getElementLabelAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:608:1: ( rule__ElementLabelAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:608:2: rule__ElementLabelAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__0_in_ruleElementLabelAttribute1234);
            rule__ElementLabelAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementLabelAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleElementLabelAttribute"


    // $ANTLR start "entryRuleElementIntentList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:620:1: entryRuleElementIntentList : ruleElementIntentList EOF ;
    public final void entryRuleElementIntentList() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:621:1: ( ruleElementIntentList EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:622:1: ruleElementIntentList EOF
            {
             before(grammarAccess.getElementIntentListRule()); 
            pushFollow(FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList1261);
            ruleElementIntentList();

            state._fsp--;

             after(grammarAccess.getElementIntentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementIntentList1268); 

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
    // $ANTLR end "entryRuleElementIntentList"


    // $ANTLR start "ruleElementIntentList"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:629:1: ruleElementIntentList : ( ( rule__ElementIntentList__Group__0 ) ) ;
    public final void ruleElementIntentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:633:2: ( ( ( rule__ElementIntentList__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:634:1: ( ( rule__ElementIntentList__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:634:1: ( ( rule__ElementIntentList__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:635:1: ( rule__ElementIntentList__Group__0 )
            {
             before(grammarAccess.getElementIntentListAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:636:1: ( rule__ElementIntentList__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:636:2: rule__ElementIntentList__Group__0
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__0_in_ruleElementIntentList1294);
            rule__ElementIntentList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementIntentListAccess().getGroup()); 

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
    // $ANTLR end "ruleElementIntentList"


    // $ANTLR start "entryRuleIntent"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:648:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:649:1: ( ruleIntent EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:650:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent1321);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent1328); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:657:1: ruleIntent : ( ( rule__Intent__NameAssignment ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:661:2: ( ( ( rule__Intent__NameAssignment ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:662:1: ( ( rule__Intent__NameAssignment ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:662:1: ( ( rule__Intent__NameAssignment ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:663:1: ( rule__Intent__NameAssignment )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:664:1: ( rule__Intent__NameAssignment )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:664:2: rule__Intent__NameAssignment
            {
            pushFollow(FOLLOW_rule__Intent__NameAssignment_in_ruleIntent1354);
            rule__Intent__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:676:1: entryRuleActivityParentAttribute : ruleActivityParentAttribute EOF ;
    public final void entryRuleActivityParentAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:677:1: ( ruleActivityParentAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:678:1: ruleActivityParentAttribute EOF
            {
             before(grammarAccess.getActivityParentAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute1381);
            ruleActivityParentAttribute();

            state._fsp--;

             after(grammarAccess.getActivityParentAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityParentAttribute1388); 

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
    // $ANTLR end "entryRuleActivityParentAttribute"


    // $ANTLR start "ruleActivityParentAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:685:1: ruleActivityParentAttribute : ( ( rule__ActivityParentAttribute__Group__0 ) ) ;
    public final void ruleActivityParentAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:689:2: ( ( ( rule__ActivityParentAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:690:1: ( ( rule__ActivityParentAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:690:1: ( ( rule__ActivityParentAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:691:1: ( rule__ActivityParentAttribute__Group__0 )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:692:1: ( rule__ActivityParentAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:692:2: rule__ActivityParentAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__0_in_ruleActivityParentAttribute1414);
            rule__ActivityParentAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityParentAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleActivityParentAttribute"


    // $ANTLR start "entryRuleActivityLayoutAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:704:1: entryRuleActivityLayoutAttribute : ruleActivityLayoutAttribute EOF ;
    public final void entryRuleActivityLayoutAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:705:1: ( ruleActivityLayoutAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:706:1: ruleActivityLayoutAttribute EOF
            {
             before(grammarAccess.getActivityLayoutAttributeRule()); 
            pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute1441);
            ruleActivityLayoutAttribute();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityLayoutAttribute1448); 

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
    // $ANTLR end "entryRuleActivityLayoutAttribute"


    // $ANTLR start "ruleActivityLayoutAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:713:1: ruleActivityLayoutAttribute : ( ( rule__ActivityLayoutAttribute__Group__0 ) ) ;
    public final void ruleActivityLayoutAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:717:2: ( ( ( rule__ActivityLayoutAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:718:1: ( ( rule__ActivityLayoutAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:718:1: ( ( rule__ActivityLayoutAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:719:1: ( rule__ActivityLayoutAttribute__Group__0 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:720:1: ( rule__ActivityLayoutAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:720:2: rule__ActivityLayoutAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__0_in_ruleActivityLayoutAttribute1474);
            rule__ActivityLayoutAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleActivityLayoutAttribute"


    // $ANTLR start "entryRuleLayoutElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:732:1: entryRuleLayoutElement : ruleLayoutElement EOF ;
    public final void entryRuleLayoutElement() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:733:1: ( ruleLayoutElement EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:734:1: ruleLayoutElement EOF
            {
             before(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement1501);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getLayoutElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElement1508); 

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
    // $ANTLR end "entryRuleLayoutElement"


    // $ANTLR start "ruleLayoutElement"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:741:1: ruleLayoutElement : ( ( rule__LayoutElement__Alternatives ) ) ;
    public final void ruleLayoutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:745:2: ( ( ( rule__LayoutElement__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:746:1: ( ( rule__LayoutElement__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:746:1: ( ( rule__LayoutElement__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:747:1: ( rule__LayoutElement__Alternatives )
            {
             before(grammarAccess.getLayoutElementAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:748:1: ( rule__LayoutElement__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:748:2: rule__LayoutElement__Alternatives
            {
            pushFollow(FOLLOW_rule__LayoutElement__Alternatives_in_ruleLayoutElement1534);
            rule__LayoutElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLayoutElement"


    // $ANTLR start "entryRuleButton"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:760:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:761:1: ( ruleButton EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:762:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton1561);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton1568); 

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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:769:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:773:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:774:1: ( ( rule__Button__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:774:1: ( ( rule__Button__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:775:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:776:1: ( rule__Button__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:776:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton1594);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:788:1: entryRuleButtonAttribute : ruleButtonAttribute EOF ;
    public final void entryRuleButtonAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:789:1: ( ruleButtonAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:790:1: ruleButtonAttribute EOF
            {
             before(grammarAccess.getButtonAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute1621);
            ruleButtonAttribute();

            state._fsp--;

             after(grammarAccess.getButtonAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonAttribute1628); 

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
    // $ANTLR end "entryRuleButtonAttribute"


    // $ANTLR start "ruleButtonAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:797:1: ruleButtonAttribute : ( ( rule__ButtonAttribute__Alternatives ) ) ;
    public final void ruleButtonAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:801:2: ( ( ( rule__ButtonAttribute__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:802:1: ( ( rule__ButtonAttribute__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:802:1: ( ( rule__ButtonAttribute__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:803:1: ( rule__ButtonAttribute__Alternatives )
            {
             before(grammarAccess.getButtonAttributeAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:804:1: ( rule__ButtonAttribute__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:804:2: rule__ButtonAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__ButtonAttribute__Alternatives_in_ruleButtonAttribute1654);
            rule__ButtonAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getButtonAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleButtonAttribute"


    // $ANTLR start "entryRuleButtonLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:816:1: entryRuleButtonLabelAttribute : ruleButtonLabelAttribute EOF ;
    public final void entryRuleButtonLabelAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:817:1: ( ruleButtonLabelAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:818:1: ruleButtonLabelAttribute EOF
            {
             before(grammarAccess.getButtonLabelAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute1681);
            ruleButtonLabelAttribute();

            state._fsp--;

             after(grammarAccess.getButtonLabelAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonLabelAttribute1688); 

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
    // $ANTLR end "entryRuleButtonLabelAttribute"


    // $ANTLR start "ruleButtonLabelAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:825:1: ruleButtonLabelAttribute : ( ( rule__ButtonLabelAttribute__Group__0 ) ) ;
    public final void ruleButtonLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:829:2: ( ( ( rule__ButtonLabelAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:830:1: ( ( rule__ButtonLabelAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:830:1: ( ( rule__ButtonLabelAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:831:1: ( rule__ButtonLabelAttribute__Group__0 )
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:832:1: ( rule__ButtonLabelAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:832:2: rule__ButtonLabelAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__0_in_ruleButtonLabelAttribute1714);
            rule__ButtonLabelAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonLabelAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleButtonLabelAttribute"


    // $ANTLR start "entryRuleButtonActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:844:1: entryRuleButtonActionAttribute : ruleButtonActionAttribute EOF ;
    public final void entryRuleButtonActionAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:845:1: ( ruleButtonActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:846:1: ruleButtonActionAttribute EOF
            {
             before(grammarAccess.getButtonActionAttributeRule()); 
            pushFollow(FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute1741);
            ruleButtonActionAttribute();

            state._fsp--;

             after(grammarAccess.getButtonActionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonActionAttribute1748); 

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
    // $ANTLR end "entryRuleButtonActionAttribute"


    // $ANTLR start "ruleButtonActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:853:1: ruleButtonActionAttribute : ( ( rule__ButtonActionAttribute__Group__0 ) ) ;
    public final void ruleButtonActionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:857:2: ( ( ( rule__ButtonActionAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:858:1: ( ( rule__ButtonActionAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:858:1: ( ( rule__ButtonActionAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:859:1: ( rule__ButtonActionAttribute__Group__0 )
            {
             before(grammarAccess.getButtonActionAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:860:1: ( rule__ButtonActionAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:860:2: rule__ButtonActionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__0_in_ruleButtonActionAttribute1774);
            rule__ButtonActionAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonActionAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleButtonActionAttribute"


    // $ANTLR start "entryRuleSpacer"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:872:1: entryRuleSpacer : ruleSpacer EOF ;
    public final void entryRuleSpacer() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:873:1: ( ruleSpacer EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:874:1: ruleSpacer EOF
            {
             before(grammarAccess.getSpacerRule()); 
            pushFollow(FOLLOW_ruleSpacer_in_entryRuleSpacer1801);
            ruleSpacer();

            state._fsp--;

             after(grammarAccess.getSpacerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpacer1808); 

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
    // $ANTLR end "entryRuleSpacer"


    // $ANTLR start "ruleSpacer"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:881:1: ruleSpacer : ( ( rule__Spacer__Group__0 ) ) ;
    public final void ruleSpacer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:885:2: ( ( ( rule__Spacer__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:886:1: ( ( rule__Spacer__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:886:1: ( ( rule__Spacer__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:887:1: ( rule__Spacer__Group__0 )
            {
             before(grammarAccess.getSpacerAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:888:1: ( rule__Spacer__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:888:2: rule__Spacer__Group__0
            {
            pushFollow(FOLLOW_rule__Spacer__Group__0_in_ruleSpacer1834);
            rule__Spacer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpacerAccess().getGroup()); 

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
    // $ANTLR end "ruleSpacer"


    // $ANTLR start "entryRuleText"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:900:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:901:1: ( ruleText EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:902:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1861);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1868); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:909:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:913:2: ( ( ( rule__Text__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:914:1: ( ( rule__Text__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:914:1: ( ( rule__Text__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:915:1: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:916:1: ( rule__Text__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:916:2: rule__Text__Group__0
            {
            pushFollow(FOLLOW_rule__Text__Group__0_in_ruleText1894);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleLayoutElementClickAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:928:1: entryRuleLayoutElementClickAction : ruleLayoutElementClickAction EOF ;
    public final void entryRuleLayoutElementClickAction() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:929:1: ( ruleLayoutElementClickAction EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:930:1: ruleLayoutElementClickAction EOF
            {
             before(grammarAccess.getLayoutElementClickActionRule()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction1921);
            ruleLayoutElementClickAction();

            state._fsp--;

             after(grammarAccess.getLayoutElementClickActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayoutElementClickAction1928); 

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
    // $ANTLR end "entryRuleLayoutElementClickAction"


    // $ANTLR start "ruleLayoutElementClickAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:937:1: ruleLayoutElementClickAction : ( ( rule__LayoutElementClickAction__Alternatives ) ) ;
    public final void ruleLayoutElementClickAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:941:2: ( ( ( rule__LayoutElementClickAction__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:942:1: ( ( rule__LayoutElementClickAction__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:942:1: ( ( rule__LayoutElementClickAction__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:943:1: ( rule__LayoutElementClickAction__Alternatives )
            {
             before(grammarAccess.getLayoutElementClickActionAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:944:1: ( rule__LayoutElementClickAction__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:944:2: rule__LayoutElementClickAction__Alternatives
            {
            pushFollow(FOLLOW_rule__LayoutElementClickAction__Alternatives_in_ruleLayoutElementClickAction1954);
            rule__LayoutElementClickAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutElementClickActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLayoutElementClickAction"


    // $ANTLR start "entryRuleBroadcastReceiverActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:956:1: entryRuleBroadcastReceiverActionAttribute : ruleBroadcastReceiverActionAttribute EOF ;
    public final void entryRuleBroadcastReceiverActionAttribute() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:957:1: ( ruleBroadcastReceiverActionAttribute EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:958:1: ruleBroadcastReceiverActionAttribute EOF
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute1981);
            ruleBroadcastReceiverActionAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute1988); 

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
    // $ANTLR end "entryRuleBroadcastReceiverActionAttribute"


    // $ANTLR start "ruleBroadcastReceiverActionAttribute"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:965:1: ruleBroadcastReceiverActionAttribute : ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) ) ;
    public final void ruleBroadcastReceiverActionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:969:2: ( ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:970:1: ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:970:1: ( ( rule__BroadcastReceiverActionAttribute__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:971:1: ( rule__BroadcastReceiverActionAttribute__Group__0 )
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:972:1: ( rule__BroadcastReceiverActionAttribute__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:972:2: rule__BroadcastReceiverActionAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0_in_ruleBroadcastReceiverActionAttribute2014);
            rule__BroadcastReceiverActionAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverActionAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleBroadcastReceiverActionAttribute"


    // $ANTLR start "entryRuleBroadcastReceiverAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:984:1: entryRuleBroadcastReceiverAction : ruleBroadcastReceiverAction EOF ;
    public final void entryRuleBroadcastReceiverAction() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:985:1: ( ruleBroadcastReceiverAction EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:986:1: ruleBroadcastReceiverAction EOF
            {
             before(grammarAccess.getBroadcastReceiverActionRule()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction2041);
            ruleBroadcastReceiverAction();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBroadcastReceiverAction2048); 

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
    // $ANTLR end "entryRuleBroadcastReceiverAction"


    // $ANTLR start "ruleBroadcastReceiverAction"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:993:1: ruleBroadcastReceiverAction : ( ( rule__BroadcastReceiverAction__Alternatives ) ) ;
    public final void ruleBroadcastReceiverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:997:2: ( ( ( rule__BroadcastReceiverAction__Alternatives ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:998:1: ( ( rule__BroadcastReceiverAction__Alternatives ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:998:1: ( ( rule__BroadcastReceiverAction__Alternatives ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:999:1: ( rule__BroadcastReceiverAction__Alternatives )
            {
             before(grammarAccess.getBroadcastReceiverActionAccess().getAlternatives()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1000:1: ( rule__BroadcastReceiverAction__Alternatives )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1000:2: rule__BroadcastReceiverAction__Alternatives
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverAction__Alternatives_in_ruleBroadcastReceiverAction2074);
            rule__BroadcastReceiverAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBroadcastReceiverAction"


    // $ANTLR start "entryRuleActionShowToast"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1012:1: entryRuleActionShowToast : ruleActionShowToast EOF ;
    public final void entryRuleActionShowToast() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1013:1: ( ruleActionShowToast EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1014:1: ruleActionShowToast EOF
            {
             before(grammarAccess.getActionShowToastRule()); 
            pushFollow(FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast2101);
            ruleActionShowToast();

            state._fsp--;

             after(grammarAccess.getActionShowToastRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionShowToast2108); 

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
    // $ANTLR end "entryRuleActionShowToast"


    // $ANTLR start "ruleActionShowToast"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1021:1: ruleActionShowToast : ( ( rule__ActionShowToast__Group__0 ) ) ;
    public final void ruleActionShowToast() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1025:2: ( ( ( rule__ActionShowToast__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1026:1: ( ( rule__ActionShowToast__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1026:1: ( ( rule__ActionShowToast__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1027:1: ( rule__ActionShowToast__Group__0 )
            {
             before(grammarAccess.getActionShowToastAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1028:1: ( rule__ActionShowToast__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1028:2: rule__ActionShowToast__Group__0
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__0_in_ruleActionShowToast2134);
            rule__ActionShowToast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionShowToastAccess().getGroup()); 

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
    // $ANTLR end "ruleActionShowToast"


    // $ANTLR start "entryRuleActionStartActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1040:1: entryRuleActionStartActivity : ruleActionStartActivity EOF ;
    public final void entryRuleActionStartActivity() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1041:1: ( ruleActionStartActivity EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1042:1: ruleActionStartActivity EOF
            {
             before(grammarAccess.getActionStartActivityRule()); 
            pushFollow(FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity2161);
            ruleActionStartActivity();

            state._fsp--;

             after(grammarAccess.getActionStartActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartActivity2168); 

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
    // $ANTLR end "entryRuleActionStartActivity"


    // $ANTLR start "ruleActionStartActivity"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1049:1: ruleActionStartActivity : ( ( rule__ActionStartActivity__Group__0 ) ) ;
    public final void ruleActionStartActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1053:2: ( ( ( rule__ActionStartActivity__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1054:1: ( ( rule__ActionStartActivity__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1054:1: ( ( rule__ActionStartActivity__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1055:1: ( rule__ActionStartActivity__Group__0 )
            {
             before(grammarAccess.getActionStartActivityAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1056:1: ( rule__ActionStartActivity__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1056:2: rule__ActionStartActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__0_in_ruleActionStartActivity2194);
            rule__ActionStartActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionStartActivityAccess().getGroup()); 

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
    // $ANTLR end "ruleActionStartActivity"


    // $ANTLR start "entryRuleActionStartService"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1068:1: entryRuleActionStartService : ruleActionStartService EOF ;
    public final void entryRuleActionStartService() throws RecognitionException {
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1069:1: ( ruleActionStartService EOF )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1070:1: ruleActionStartService EOF
            {
             before(grammarAccess.getActionStartServiceRule()); 
            pushFollow(FOLLOW_ruleActionStartService_in_entryRuleActionStartService2221);
            ruleActionStartService();

            state._fsp--;

             after(grammarAccess.getActionStartServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStartService2228); 

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
    // $ANTLR end "entryRuleActionStartService"


    // $ANTLR start "ruleActionStartService"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1077:1: ruleActionStartService : ( ( rule__ActionStartService__Group__0 ) ) ;
    public final void ruleActionStartService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1081:2: ( ( ( rule__ActionStartService__Group__0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1082:1: ( ( rule__ActionStartService__Group__0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1082:1: ( ( rule__ActionStartService__Group__0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1083:1: ( rule__ActionStartService__Group__0 )
            {
             before(grammarAccess.getActionStartServiceAccess().getGroup()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1084:1: ( rule__ActionStartService__Group__0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1084:2: rule__ActionStartService__Group__0
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__0_in_ruleActionStartService2254);
            rule__ActionStartService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionStartServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleActionStartService"


    // $ANTLR start "rule__ApplicationAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1096:1: rule__ApplicationAttribute__Alternatives : ( ( ruleElementLabelAttribute ) | ( ruleApplicationMinSdk ) | ( ruleApplicationTargetSdk ) | ( ruleApplicationCompileSdk ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1100:1: ( ( ruleElementLabelAttribute ) | ( ruleApplicationMinSdk ) | ( ruleApplicationTargetSdk ) | ( ruleApplicationCompileSdk ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            case 23:
                {
                alt1=6;
                }
                break;
            case 24:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1101:1: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1101:1: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1102:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ApplicationAttribute__Alternatives2290);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getElementLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1107:6: ( ruleApplicationMinSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1107:6: ( ruleApplicationMinSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1108:1: ruleApplicationMinSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleApplicationMinSdk_in_rule__ApplicationAttribute__Alternatives2307);
                    ruleApplicationMinSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1113:6: ( ruleApplicationTargetSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1113:6: ( ruleApplicationTargetSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1114:1: ruleApplicationTargetSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleApplicationTargetSdk_in_rule__ApplicationAttribute__Alternatives2324);
                    ruleApplicationTargetSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1119:6: ( ruleApplicationCompileSdk )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1119:6: ( ruleApplicationCompileSdk )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1120:1: ruleApplicationCompileSdk
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleApplicationCompileSdk_in_rule__ApplicationAttribute__Alternatives2341);
                    ruleApplicationCompileSdk();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1125:6: ( ruleApplicationPermissionList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1125:6: ( ruleApplicationPermissionList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1126:1: ruleApplicationPermissionList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleApplicationPermissionList_in_rule__ApplicationAttribute__Alternatives2358);
                    ruleApplicationPermissionList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1131:6: ( ruleApplicationElementList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1131:6: ( ruleApplicationElementList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1132:1: ruleApplicationElementList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleApplicationElementList_in_rule__ApplicationAttribute__Alternatives2375);
                    ruleApplicationElementList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1137:6: ( ruleApplicationMainActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1137:6: ( ruleApplicationMainActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1138:1: ruleApplicationMainActivity
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleApplicationMainActivity_in_rule__ApplicationAttribute__Alternatives2392);
                    ruleApplicationMainActivity();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 

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
    // $ANTLR end "rule__ApplicationAttribute__Alternatives"


    // $ANTLR start "rule__ApplicationElement__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1148:1: rule__ApplicationElement__Alternatives : ( ( ruleActivity ) | ( ruleBroadcastReceiver ) | ( ruleService ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1152:1: ( ( ruleActivity ) | ( ruleBroadcastReceiver ) | ( ruleService ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1153:1: ( ruleActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1153:1: ( ruleActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1154:1: ruleActivity
                    {
                     before(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__ApplicationElement__Alternatives2424);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1159:6: ( ruleBroadcastReceiver )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1159:6: ( ruleBroadcastReceiver )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1160:1: ruleBroadcastReceiver
                    {
                     before(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBroadcastReceiver_in_rule__ApplicationElement__Alternatives2441);
                    ruleBroadcastReceiver();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1165:6: ( ruleService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1165:6: ( ruleService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1166:1: ruleService
                    {
                     before(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleService_in_rule__ApplicationElement__Alternatives2458);
                    ruleService();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 

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
    // $ANTLR end "rule__ApplicationElement__Alternatives"


    // $ANTLR start "rule__ActivityAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1176:1: rule__ActivityAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleActivityParentAttribute ) | ( ruleActivityLayoutAttribute ) );
    public final void rule__ActivityAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1180:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleActivityParentAttribute ) | ( ruleActivityLayoutAttribute ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            case 32:
                {
                alt3=5;
                }
                break;
            case 33:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1181:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1181:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1182:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__ActivityAttribute__Alternatives2490);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1187:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1187:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1188:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__ActivityAttribute__Alternatives2507);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1193:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1193:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1194:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ActivityAttribute__Alternatives2524);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1199:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1199:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1200:1: ruleElementIntentList
                    {
                     before(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__ActivityAttribute__Alternatives2541);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getElementIntentListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1205:6: ( ruleActivityParentAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1205:6: ( ruleActivityParentAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1206:1: ruleActivityParentAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleActivityParentAttribute_in_rule__ActivityAttribute__Alternatives2558);
                    ruleActivityParentAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getActivityParentAttributeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1211:6: ( ruleActivityLayoutAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1211:6: ( ruleActivityLayoutAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1212:1: ruleActivityLayoutAttribute
                    {
                     before(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleActivityLayoutAttribute_in_rule__ActivityAttribute__Alternatives2575);
                    ruleActivityLayoutAttribute();

                    state._fsp--;

                     after(grammarAccess.getActivityAttributeAccess().getActivityLayoutAttributeParserRuleCall_5()); 

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
    // $ANTLR end "rule__ActivityAttribute__Alternatives"


    // $ANTLR start "rule__BroadcastReceiverAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1222:1: rule__BroadcastReceiverAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleBroadcastReceiverActionAttribute ) );
    public final void rule__BroadcastReceiverAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1226:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) | ( ruleBroadcastReceiverActionAttribute ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1227:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1227:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1228:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2607);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1233:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1233:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1234:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2624);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1239:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1239:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1240:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2641);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1245:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1245:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1246:1: ruleElementIntentList
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__BroadcastReceiverAttribute__Alternatives2658);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getElementIntentListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1251:6: ( ruleBroadcastReceiverActionAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1251:6: ( ruleBroadcastReceiverActionAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1252:1: ruleBroadcastReceiverActionAttribute
                    {
                     before(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBroadcastReceiverActionAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2675);
                    ruleBroadcastReceiverActionAttribute();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverAttributeAccess().getBroadcastReceiverActionAttributeParserRuleCall_4()); 

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
    // $ANTLR end "rule__BroadcastReceiverAttribute__Alternatives"


    // $ANTLR start "rule__ServiceAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1262:1: rule__ServiceAttribute__Alternatives : ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) );
    public final void rule__ServiceAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1266:1: ( ( ruleElementEnabledAttribute ) | ( ruleElementExportedAttribute ) | ( ruleElementLabelAttribute ) | ( ruleElementIntentList ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            case 31:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1267:1: ( ruleElementEnabledAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1267:1: ( ruleElementEnabledAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1268:1: ruleElementEnabledAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementEnabledAttribute_in_rule__ServiceAttribute__Alternatives2707);
                    ruleElementEnabledAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1273:6: ( ruleElementExportedAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1273:6: ( ruleElementExportedAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1274:1: ruleElementExportedAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleElementExportedAttribute_in_rule__ServiceAttribute__Alternatives2724);
                    ruleElementExportedAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1279:6: ( ruleElementLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1279:6: ( ruleElementLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1280:1: ruleElementLabelAttribute
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElementLabelAttribute_in_rule__ServiceAttribute__Alternatives2741);
                    ruleElementLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementLabelAttributeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1285:6: ( ruleElementIntentList )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1285:6: ( ruleElementIntentList )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1286:1: ruleElementIntentList
                    {
                     before(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleElementIntentList_in_rule__ServiceAttribute__Alternatives2758);
                    ruleElementIntentList();

                    state._fsp--;

                     after(grammarAccess.getServiceAttributeAccess().getElementIntentListParserRuleCall_3()); 

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
    // $ANTLR end "rule__ServiceAttribute__Alternatives"


    // $ANTLR start "rule__LayoutElement__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1296:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleSpacer ) | ( ruleText ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1300:1: ( ( ruleButton ) | ( ruleSpacer ) | ( ruleText ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1301:1: ( ruleButton )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1301:1: ( ruleButton )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1302:1: ruleButton
                    {
                     before(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__LayoutElement__Alternatives2790);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1307:6: ( ruleSpacer )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1307:6: ( ruleSpacer )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1308:1: ruleSpacer
                    {
                     before(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSpacer_in_rule__LayoutElement__Alternatives2807);
                    ruleSpacer();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getSpacerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1313:6: ( ruleText )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1313:6: ( ruleText )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1314:1: ruleText
                    {
                     before(grammarAccess.getLayoutElementAccess().getTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleText_in_rule__LayoutElement__Alternatives2824);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getTextParserRuleCall_2()); 

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
    // $ANTLR end "rule__LayoutElement__Alternatives"


    // $ANTLR start "rule__ButtonAttribute__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1324:1: rule__ButtonAttribute__Alternatives : ( ( ruleButtonLabelAttribute ) | ( ruleButtonActionAttribute ) );
    public final void rule__ButtonAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1328:1: ( ( ruleButtonLabelAttribute ) | ( ruleButtonActionAttribute ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1329:1: ( ruleButtonLabelAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1329:1: ( ruleButtonLabelAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1330:1: ruleButtonLabelAttribute
                    {
                     before(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleButtonLabelAttribute_in_rule__ButtonAttribute__Alternatives2856);
                    ruleButtonLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getButtonAttributeAccess().getButtonLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1335:6: ( ruleButtonActionAttribute )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1335:6: ( ruleButtonActionAttribute )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1336:1: ruleButtonActionAttribute
                    {
                     before(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButtonActionAttribute_in_rule__ButtonAttribute__Alternatives2873);
                    ruleButtonActionAttribute();

                    state._fsp--;

                     after(grammarAccess.getButtonAttributeAccess().getButtonActionAttributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ButtonAttribute__Alternatives"


    // $ANTLR start "rule__LayoutElementClickAction__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1346:1: rule__LayoutElementClickAction__Alternatives : ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) );
    public final void rule__LayoutElementClickAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1350:1: ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1351:1: ( ruleActionShowToast )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1351:1: ( ruleActionShowToast )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1352:1: ruleActionShowToast
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionShowToast_in_rule__LayoutElementClickAction__Alternatives2905);
                    ruleActionShowToast();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionShowToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1357:6: ( ruleActionStartActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1357:6: ( ruleActionStartActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1358:1: ruleActionStartActivity
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionStartActivity_in_rule__LayoutElementClickAction__Alternatives2922);
                    ruleActionStartActivity();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionStartActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1363:6: ( ruleActionStartService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1363:6: ( ruleActionStartService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1364:1: ruleActionStartService
                    {
                     before(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActionStartService_in_rule__LayoutElementClickAction__Alternatives2939);
                    ruleActionStartService();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementClickActionAccess().getActionStartServiceParserRuleCall_2()); 

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
    // $ANTLR end "rule__LayoutElementClickAction__Alternatives"


    // $ANTLR start "rule__BroadcastReceiverAction__Alternatives"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1374:1: rule__BroadcastReceiverAction__Alternatives : ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) );
    public final void rule__BroadcastReceiverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1378:1: ( ( ruleActionShowToast ) | ( ruleActionStartActivity ) | ( ruleActionStartService ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case 40:
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
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1379:1: ( ruleActionShowToast )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1379:1: ( ruleActionShowToast )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1380:1: ruleActionShowToast
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionShowToast_in_rule__BroadcastReceiverAction__Alternatives2971);
                    ruleActionShowToast();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionShowToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1385:6: ( ruleActionStartActivity )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1385:6: ( ruleActionStartActivity )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1386:1: ruleActionStartActivity
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActionStartActivity_in_rule__BroadcastReceiverAction__Alternatives2988);
                    ruleActionStartActivity();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionStartActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1391:6: ( ruleActionStartService )
                    {
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1391:6: ( ruleActionStartService )
                    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1392:1: ruleActionStartService
                    {
                     before(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActionStartService_in_rule__BroadcastReceiverAction__Alternatives3005);
                    ruleActionStartService();

                    state._fsp--;

                     after(grammarAccess.getBroadcastReceiverActionAccess().getActionStartServiceParserRuleCall_2()); 

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
    // $ANTLR end "rule__BroadcastReceiverAction__Alternatives"


    // $ANTLR start "rule__AndroidAppProject__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1404:1: rule__AndroidAppProject__Group__0 : rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 ;
    public final void rule__AndroidAppProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1408:1: ( rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1409:2: rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__0__Impl_in_rule__AndroidAppProject__Group__03035);
            rule__AndroidAppProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndroidAppProject__Group__1_in_rule__AndroidAppProject__Group__03038);
            rule__AndroidAppProject__Group__1();

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
    // $ANTLR end "rule__AndroidAppProject__Group__0"


    // $ANTLR start "rule__AndroidAppProject__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1416:1: rule__AndroidAppProject__Group__0__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) ;
    public final void rule__AndroidAppProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1420:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1421:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1421:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1422:1: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1423:1: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1423:2: rule__AndroidAppProject__ApplicationsAssignment_0
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_0_in_rule__AndroidAppProject__Group__0__Impl3065);
            rule__AndroidAppProject__ApplicationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 

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
    // $ANTLR end "rule__AndroidAppProject__Group__0__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1433:1: rule__AndroidAppProject__Group__1 : rule__AndroidAppProject__Group__1__Impl ;
    public final void rule__AndroidAppProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1437:1: ( rule__AndroidAppProject__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1438:2: rule__AndroidAppProject__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group__1__Impl_in_rule__AndroidAppProject__Group__13095);
            rule__AndroidAppProject__Group__1__Impl();

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
    // $ANTLR end "rule__AndroidAppProject__Group__1"


    // $ANTLR start "rule__AndroidAppProject__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1444:1: rule__AndroidAppProject__Group__1__Impl : ( ( rule__AndroidAppProject__Group_1__0 )* ) ;
    public final void rule__AndroidAppProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1448:1: ( ( ( rule__AndroidAppProject__Group_1__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1449:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1449:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1450:1: ( rule__AndroidAppProject__Group_1__0 )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1451:1: ( rule__AndroidAppProject__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1451:2: rule__AndroidAppProject__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__0_in_rule__AndroidAppProject__Group__1__Impl3122);
            	    rule__AndroidAppProject__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndroidAppProject__Group__1__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group_1__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1465:1: rule__AndroidAppProject__Group_1__0 : rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 ;
    public final void rule__AndroidAppProject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1469:1: ( rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1470:2: rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__0__Impl_in_rule__AndroidAppProject__Group_1__03157);
            rule__AndroidAppProject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__1_in_rule__AndroidAppProject__Group_1__03160);
            rule__AndroidAppProject__Group_1__1();

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
    // $ANTLR end "rule__AndroidAppProject__Group_1__0"


    // $ANTLR start "rule__AndroidAppProject__Group_1__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1477:1: rule__AndroidAppProject__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AndroidAppProject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1481:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1482:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1482:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1483:1: ','
            {
             before(grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__AndroidAppProject__Group_1__0__Impl3188); 
             after(grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__AndroidAppProject__Group_1__0__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group_1__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1496:1: rule__AndroidAppProject__Group_1__1 : rule__AndroidAppProject__Group_1__1__Impl ;
    public final void rule__AndroidAppProject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1500:1: ( rule__AndroidAppProject__Group_1__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1501:2: rule__AndroidAppProject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__Group_1__1__Impl_in_rule__AndroidAppProject__Group_1__13219);
            rule__AndroidAppProject__Group_1__1__Impl();

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
    // $ANTLR end "rule__AndroidAppProject__Group_1__1"


    // $ANTLR start "rule__AndroidAppProject__Group_1__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1507:1: rule__AndroidAppProject__Group_1__1__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) ;
    public final void rule__AndroidAppProject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1511:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1512:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1512:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1513:1: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1514:1: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1514:2: rule__AndroidAppProject__ApplicationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_1_1_in_rule__AndroidAppProject__Group_1__1__Impl3246);
            rule__AndroidAppProject__ApplicationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 

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
    // $ANTLR end "rule__AndroidAppProject__Group_1__1__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1528:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1532:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1533:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__03280);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03283);
            rule__Application__Group__1();

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
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1540:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1544:1: ( ( 'application' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1545:1: ( 'application' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1545:1: ( 'application' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1546:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Application__Group__0__Impl3311); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

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
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1559:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1563:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1564:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__13342);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13345);
            rule__Application__Group__2();

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
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1571:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1575:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1576:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1576:1: ( ( rule__Application__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1577:1: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1578:1: ( rule__Application__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1578:2: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl3372);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1588:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1592:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1593:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__23402);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23405);
            rule__Application__Group__3();

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
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1600:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1604:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1605:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1605:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1606:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Application__Group__2__Impl3433); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1619:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1623:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1624:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__33464);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33467);
            rule__Application__Group__4();

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
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1631:1: rule__Application__Group__3__Impl : ( ( rule__Application__AttributesAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1635:1: ( ( ( rule__Application__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1636:1: ( ( rule__Application__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1636:1: ( ( rule__Application__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1637:1: ( rule__Application__AttributesAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1638:1: ( rule__Application__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1638:2: rule__Application__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Application__AttributesAssignment_3_in_rule__Application__Group__3__Impl3494);
            rule__Application__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1648:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1652:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1653:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__43524);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43527);
            rule__Application__Group__5();

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
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1660:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )* ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1664:1: ( ( ( rule__Application__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1665:1: ( ( rule__Application__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1665:1: ( ( rule__Application__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1666:1: ( rule__Application__Group_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1667:1: ( rule__Application__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1667:2: rule__Application__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl3554);
            	    rule__Application__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1677:1: rule__Application__Group__5 : rule__Application__Group__5__Impl ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1681:1: ( rule__Application__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1682:2: rule__Application__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__53585);
            rule__Application__Group__5__Impl();

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
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1688:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1692:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1693:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1693:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1694:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Application__Group__5__Impl3613); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1719:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1723:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1724:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__03656);
            rule__Application__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03659);
            rule__Application__Group_4__1();

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
    // $ANTLR end "rule__Application__Group_4__0"


    // $ANTLR start "rule__Application__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1731:1: rule__Application__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1735:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1736:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1736:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1737:1: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group_4__0__Impl3687); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Application__Group_4__0__Impl"


    // $ANTLR start "rule__Application__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1750:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1754:1: ( rule__Application__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1755:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__13718);
            rule__Application__Group_4__1__Impl();

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
    // $ANTLR end "rule__Application__Group_4__1"


    // $ANTLR start "rule__Application__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1761:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__AttributesAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1765:1: ( ( ( rule__Application__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1766:1: ( ( rule__Application__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1766:1: ( ( rule__Application__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1767:1: ( rule__Application__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1768:1: ( rule__Application__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1768:2: rule__Application__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Application__AttributesAssignment_4_1_in_rule__Application__Group_4__1__Impl3745);
            rule__Application__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getAttributesAssignment_4_1()); 

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
    // $ANTLR end "rule__Application__Group_4__1__Impl"


    // $ANTLR start "rule__ApplicationMinSdk__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1782:1: rule__ApplicationMinSdk__Group__0 : rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1 ;
    public final void rule__ApplicationMinSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1786:1: ( rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1787:2: rule__ApplicationMinSdk__Group__0__Impl rule__ApplicationMinSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__0__Impl_in_rule__ApplicationMinSdk__Group__03779);
            rule__ApplicationMinSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__1_in_rule__ApplicationMinSdk__Group__03782);
            rule__ApplicationMinSdk__Group__1();

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
    // $ANTLR end "rule__ApplicationMinSdk__Group__0"


    // $ANTLR start "rule__ApplicationMinSdk__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1794:1: rule__ApplicationMinSdk__Group__0__Impl : ( 'min-sdk' ) ;
    public final void rule__ApplicationMinSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1798:1: ( ( 'min-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1799:1: ( 'min-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1799:1: ( 'min-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1800:1: 'min-sdk'
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__ApplicationMinSdk__Group__0__Impl3810); 
             after(grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0()); 

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
    // $ANTLR end "rule__ApplicationMinSdk__Group__0__Impl"


    // $ANTLR start "rule__ApplicationMinSdk__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1813:1: rule__ApplicationMinSdk__Group__1 : rule__ApplicationMinSdk__Group__1__Impl ;
    public final void rule__ApplicationMinSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1817:1: ( rule__ApplicationMinSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1818:2: rule__ApplicationMinSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__Group__1__Impl_in_rule__ApplicationMinSdk__Group__13841);
            rule__ApplicationMinSdk__Group__1__Impl();

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
    // $ANTLR end "rule__ApplicationMinSdk__Group__1"


    // $ANTLR start "rule__ApplicationMinSdk__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1824:1: rule__ApplicationMinSdk__Group__1__Impl : ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) ) ;
    public final void rule__ApplicationMinSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1828:1: ( ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1829:1: ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1829:1: ( ( rule__ApplicationMinSdk__MinSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1830:1: ( rule__ApplicationMinSdk__MinSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1831:1: ( rule__ApplicationMinSdk__MinSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1831:2: rule__ApplicationMinSdk__MinSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationMinSdk__MinSdkAssignment_1_in_rule__ApplicationMinSdk__Group__1__Impl3868);
            rule__ApplicationMinSdk__MinSdkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMinSdkAccess().getMinSdkAssignment_1()); 

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
    // $ANTLR end "rule__ApplicationMinSdk__Group__1__Impl"


    // $ANTLR start "rule__ApplicationTargetSdk__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1845:1: rule__ApplicationTargetSdk__Group__0 : rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1 ;
    public final void rule__ApplicationTargetSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1849:1: ( rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1850:2: rule__ApplicationTargetSdk__Group__0__Impl rule__ApplicationTargetSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__0__Impl_in_rule__ApplicationTargetSdk__Group__03902);
            rule__ApplicationTargetSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__1_in_rule__ApplicationTargetSdk__Group__03905);
            rule__ApplicationTargetSdk__Group__1();

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
    // $ANTLR end "rule__ApplicationTargetSdk__Group__0"


    // $ANTLR start "rule__ApplicationTargetSdk__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1857:1: rule__ApplicationTargetSdk__Group__0__Impl : ( 'target-sdk' ) ;
    public final void rule__ApplicationTargetSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1861:1: ( ( 'target-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1862:1: ( 'target-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1862:1: ( 'target-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1863:1: 'target-sdk'
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ApplicationTargetSdk__Group__0__Impl3933); 
             after(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0()); 

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
    // $ANTLR end "rule__ApplicationTargetSdk__Group__0__Impl"


    // $ANTLR start "rule__ApplicationTargetSdk__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1876:1: rule__ApplicationTargetSdk__Group__1 : rule__ApplicationTargetSdk__Group__1__Impl ;
    public final void rule__ApplicationTargetSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1880:1: ( rule__ApplicationTargetSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1881:2: rule__ApplicationTargetSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__Group__1__Impl_in_rule__ApplicationTargetSdk__Group__13964);
            rule__ApplicationTargetSdk__Group__1__Impl();

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
    // $ANTLR end "rule__ApplicationTargetSdk__Group__1"


    // $ANTLR start "rule__ApplicationTargetSdk__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1887:1: rule__ApplicationTargetSdk__Group__1__Impl : ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) ) ;
    public final void rule__ApplicationTargetSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1891:1: ( ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1892:1: ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1892:1: ( ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1893:1: ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1894:1: ( rule__ApplicationTargetSdk__TargetSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1894:2: rule__ApplicationTargetSdk__TargetSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationTargetSdk__TargetSdkAssignment_1_in_rule__ApplicationTargetSdk__Group__1__Impl3991);
            rule__ApplicationTargetSdk__TargetSdkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkAssignment_1()); 

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
    // $ANTLR end "rule__ApplicationTargetSdk__Group__1__Impl"


    // $ANTLR start "rule__ApplicationCompileSdk__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1908:1: rule__ApplicationCompileSdk__Group__0 : rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1 ;
    public final void rule__ApplicationCompileSdk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1912:1: ( rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1913:2: rule__ApplicationCompileSdk__Group__0__Impl rule__ApplicationCompileSdk__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__0__Impl_in_rule__ApplicationCompileSdk__Group__04025);
            rule__ApplicationCompileSdk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__1_in_rule__ApplicationCompileSdk__Group__04028);
            rule__ApplicationCompileSdk__Group__1();

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
    // $ANTLR end "rule__ApplicationCompileSdk__Group__0"


    // $ANTLR start "rule__ApplicationCompileSdk__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1920:1: rule__ApplicationCompileSdk__Group__0__Impl : ( 'compile-sdk' ) ;
    public final void rule__ApplicationCompileSdk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1924:1: ( ( 'compile-sdk' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1925:1: ( 'compile-sdk' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1925:1: ( 'compile-sdk' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1926:1: 'compile-sdk'
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ApplicationCompileSdk__Group__0__Impl4056); 
             after(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0()); 

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
    // $ANTLR end "rule__ApplicationCompileSdk__Group__0__Impl"


    // $ANTLR start "rule__ApplicationCompileSdk__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1939:1: rule__ApplicationCompileSdk__Group__1 : rule__ApplicationCompileSdk__Group__1__Impl ;
    public final void rule__ApplicationCompileSdk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1943:1: ( rule__ApplicationCompileSdk__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1944:2: rule__ApplicationCompileSdk__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__Group__1__Impl_in_rule__ApplicationCompileSdk__Group__14087);
            rule__ApplicationCompileSdk__Group__1__Impl();

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
    // $ANTLR end "rule__ApplicationCompileSdk__Group__1"


    // $ANTLR start "rule__ApplicationCompileSdk__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1950:1: rule__ApplicationCompileSdk__Group__1__Impl : ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) ) ;
    public final void rule__ApplicationCompileSdk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1954:1: ( ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1955:1: ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1955:1: ( ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1956:1: ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 )
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1957:1: ( rule__ApplicationCompileSdk__CompileSdkAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1957:2: rule__ApplicationCompileSdk__CompileSdkAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationCompileSdk__CompileSdkAssignment_1_in_rule__ApplicationCompileSdk__Group__1__Impl4114);
            rule__ApplicationCompileSdk__CompileSdkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkAssignment_1()); 

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
    // $ANTLR end "rule__ApplicationCompileSdk__Group__1__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1971:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1975:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1976:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__0__Impl_in_rule__ApplicationPermissionList__Group__04148);
            rule__ApplicationPermissionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__1_in_rule__ApplicationPermissionList__Group__04151);
            rule__ApplicationPermissionList__Group__1();

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__0"


    // $ANTLR start "rule__ApplicationPermissionList__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1983:1: rule__ApplicationPermissionList__Group__0__Impl : ( 'permissions' ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1987:1: ( ( 'permissions' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1988:1: ( 'permissions' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1988:1: ( 'permissions' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:1989:1: 'permissions'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ApplicationPermissionList__Group__0__Impl4179); 
             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__0__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2002:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2006:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2007:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__1__Impl_in_rule__ApplicationPermissionList__Group__14210);
            rule__ApplicationPermissionList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__2_in_rule__ApplicationPermissionList__Group__14213);
            rule__ApplicationPermissionList__Group__2();

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__1"


    // $ANTLR start "rule__ApplicationPermissionList__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2014:1: rule__ApplicationPermissionList__Group__1__Impl : ( '[' ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2018:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2019:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2019:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2020:1: '['
            {
             before(grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ApplicationPermissionList__Group__1__Impl4241); 
             after(grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__1__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2033:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3 ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2037:1: ( rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2038:2: rule__ApplicationPermissionList__Group__2__Impl rule__ApplicationPermissionList__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__2__Impl_in_rule__ApplicationPermissionList__Group__24272);
            rule__ApplicationPermissionList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__3_in_rule__ApplicationPermissionList__Group__24275);
            rule__ApplicationPermissionList__Group__3();

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__2"


    // $ANTLR start "rule__ApplicationPermissionList__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2045:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2049:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2050:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2050:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2051:1: ( rule__ApplicationPermissionList__PermissionsAssignment_2 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2052:1: ( rule__ApplicationPermissionList__PermissionsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2052:2: rule__ApplicationPermissionList__PermissionsAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_2_in_rule__ApplicationPermissionList__Group__2__Impl4302);
            rule__ApplicationPermissionList__PermissionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__2__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2062:1: rule__ApplicationPermissionList__Group__3 : rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4 ;
    public final void rule__ApplicationPermissionList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2066:1: ( rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2067:2: rule__ApplicationPermissionList__Group__3__Impl rule__ApplicationPermissionList__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__3__Impl_in_rule__ApplicationPermissionList__Group__34332);
            rule__ApplicationPermissionList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__4_in_rule__ApplicationPermissionList__Group__34335);
            rule__ApplicationPermissionList__Group__4();

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__3"


    // $ANTLR start "rule__ApplicationPermissionList__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2074:1: rule__ApplicationPermissionList__Group__3__Impl : ( ( rule__ApplicationPermissionList__Group_3__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2078:1: ( ( ( rule__ApplicationPermissionList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2079:1: ( ( rule__ApplicationPermissionList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2079:1: ( ( rule__ApplicationPermissionList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2080:1: ( rule__ApplicationPermissionList__Group_3__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2081:1: ( rule__ApplicationPermissionList__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2081:2: rule__ApplicationPermissionList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__0_in_rule__ApplicationPermissionList__Group__3__Impl4362);
            	    rule__ApplicationPermissionList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getApplicationPermissionListAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__3__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2091:1: rule__ApplicationPermissionList__Group__4 : rule__ApplicationPermissionList__Group__4__Impl ;
    public final void rule__ApplicationPermissionList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2095:1: ( rule__ApplicationPermissionList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2096:2: rule__ApplicationPermissionList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group__4__Impl_in_rule__ApplicationPermissionList__Group__44393);
            rule__ApplicationPermissionList__Group__4__Impl();

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__4"


    // $ANTLR start "rule__ApplicationPermissionList__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2102:1: rule__ApplicationPermissionList__Group__4__Impl : ( ']' ) ;
    public final void rule__ApplicationPermissionList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2106:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2107:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2107:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2108:1: ']'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ApplicationPermissionList__Group__4__Impl4421); 
             after(grammarAccess.getApplicationPermissionListAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__Group__4__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group_3__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2131:1: rule__ApplicationPermissionList__Group_3__0 : rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1 ;
    public final void rule__ApplicationPermissionList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2135:1: ( rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2136:2: rule__ApplicationPermissionList__Group_3__0__Impl rule__ApplicationPermissionList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__0__Impl_in_rule__ApplicationPermissionList__Group_3__04462);
            rule__ApplicationPermissionList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__1_in_rule__ApplicationPermissionList__Group_3__04465);
            rule__ApplicationPermissionList__Group_3__1();

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
    // $ANTLR end "rule__ApplicationPermissionList__Group_3__0"


    // $ANTLR start "rule__ApplicationPermissionList__Group_3__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2143:1: rule__ApplicationPermissionList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationPermissionList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2147:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2148:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2148:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2149:1: ','
            {
             before(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ApplicationPermissionList__Group_3__0__Impl4493); 
             after(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__Group_3__0__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group_3__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2162:1: rule__ApplicationPermissionList__Group_3__1 : rule__ApplicationPermissionList__Group_3__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2166:1: ( rule__ApplicationPermissionList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2167:2: rule__ApplicationPermissionList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__Group_3__1__Impl_in_rule__ApplicationPermissionList__Group_3__14524);
            rule__ApplicationPermissionList__Group_3__1__Impl();

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
    // $ANTLR end "rule__ApplicationPermissionList__Group_3__1"


    // $ANTLR start "rule__ApplicationPermissionList__Group_3__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2173:1: rule__ApplicationPermissionList__Group_3__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2177:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2178:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2178:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2179:1: ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2180:1: ( rule__ApplicationPermissionList__PermissionsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2180:2: rule__ApplicationPermissionList__PermissionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_3_1_in_rule__ApplicationPermissionList__Group_3__1__Impl4551);
            rule__ApplicationPermissionList__PermissionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_3_1()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__Group_3__1__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2194:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2198:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2199:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__0__Impl_in_rule__ApplicationElementList__Group__04585);
            rule__ApplicationElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__1_in_rule__ApplicationElementList__Group__04588);
            rule__ApplicationElementList__Group__1();

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
    // $ANTLR end "rule__ApplicationElementList__Group__0"


    // $ANTLR start "rule__ApplicationElementList__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2206:1: rule__ApplicationElementList__Group__0__Impl : ( 'elements' ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2210:1: ( ( 'elements' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2211:1: ( 'elements' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2211:1: ( 'elements' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2212:1: 'elements'
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ApplicationElementList__Group__0__Impl4616); 
             after(grammarAccess.getApplicationElementListAccess().getElementsKeyword_0()); 

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
    // $ANTLR end "rule__ApplicationElementList__Group__0__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2225:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2229:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2230:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__1__Impl_in_rule__ApplicationElementList__Group__14647);
            rule__ApplicationElementList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__2_in_rule__ApplicationElementList__Group__14650);
            rule__ApplicationElementList__Group__2();

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
    // $ANTLR end "rule__ApplicationElementList__Group__1"


    // $ANTLR start "rule__ApplicationElementList__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2237:1: rule__ApplicationElementList__Group__1__Impl : ( '[' ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2241:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2242:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2242:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2243:1: '['
            {
             before(grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ApplicationElementList__Group__1__Impl4678); 
             after(grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__ApplicationElementList__Group__1__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2256:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2260:1: ( rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2261:2: rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__2__Impl_in_rule__ApplicationElementList__Group__24709);
            rule__ApplicationElementList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__3_in_rule__ApplicationElementList__Group__24712);
            rule__ApplicationElementList__Group__3();

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
    // $ANTLR end "rule__ApplicationElementList__Group__2"


    // $ANTLR start "rule__ApplicationElementList__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2268:1: rule__ApplicationElementList__Group__2__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_2 ) ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2272:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2273:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2273:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2274:1: ( rule__ApplicationElementList__ElementsAssignment_2 )
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2275:1: ( rule__ApplicationElementList__ElementsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2275:2: rule__ApplicationElementList__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__ElementsAssignment_2_in_rule__ApplicationElementList__Group__2__Impl4739);
            rule__ApplicationElementList__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__ApplicationElementList__Group__2__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2285:1: rule__ApplicationElementList__Group__3 : rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 ;
    public final void rule__ApplicationElementList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2289:1: ( rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2290:2: rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__3__Impl_in_rule__ApplicationElementList__Group__34769);
            rule__ApplicationElementList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group__4_in_rule__ApplicationElementList__Group__34772);
            rule__ApplicationElementList__Group__4();

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
    // $ANTLR end "rule__ApplicationElementList__Group__3"


    // $ANTLR start "rule__ApplicationElementList__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2297:1: rule__ApplicationElementList__Group__3__Impl : ( ( rule__ApplicationElementList__Group_3__0 )* ) ;
    public final void rule__ApplicationElementList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2301:1: ( ( ( rule__ApplicationElementList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2302:1: ( ( rule__ApplicationElementList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2302:1: ( ( rule__ApplicationElementList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2303:1: ( rule__ApplicationElementList__Group_3__0 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2304:1: ( rule__ApplicationElementList__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2304:2: rule__ApplicationElementList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__0_in_rule__ApplicationElementList__Group__3__Impl4799);
            	    rule__ApplicationElementList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getApplicationElementListAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ApplicationElementList__Group__3__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2314:1: rule__ApplicationElementList__Group__4 : rule__ApplicationElementList__Group__4__Impl ;
    public final void rule__ApplicationElementList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2318:1: ( rule__ApplicationElementList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2319:2: rule__ApplicationElementList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group__4__Impl_in_rule__ApplicationElementList__Group__44830);
            rule__ApplicationElementList__Group__4__Impl();

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
    // $ANTLR end "rule__ApplicationElementList__Group__4"


    // $ANTLR start "rule__ApplicationElementList__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2325:1: rule__ApplicationElementList__Group__4__Impl : ( ']' ) ;
    public final void rule__ApplicationElementList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2329:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2330:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2330:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2331:1: ']'
            {
             before(grammarAccess.getApplicationElementListAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ApplicationElementList__Group__4__Impl4858); 
             after(grammarAccess.getApplicationElementListAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__ApplicationElementList__Group__4__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group_3__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2354:1: rule__ApplicationElementList__Group_3__0 : rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1 ;
    public final void rule__ApplicationElementList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2358:1: ( rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2359:2: rule__ApplicationElementList__Group_3__0__Impl rule__ApplicationElementList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__0__Impl_in_rule__ApplicationElementList__Group_3__04899);
            rule__ApplicationElementList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__1_in_rule__ApplicationElementList__Group_3__04902);
            rule__ApplicationElementList__Group_3__1();

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
    // $ANTLR end "rule__ApplicationElementList__Group_3__0"


    // $ANTLR start "rule__ApplicationElementList__Group_3__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2366:1: rule__ApplicationElementList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationElementList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2370:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2371:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2371:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2372:1: ','
            {
             before(grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ApplicationElementList__Group_3__0__Impl4930); 
             after(grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ApplicationElementList__Group_3__0__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group_3__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2385:1: rule__ApplicationElementList__Group_3__1 : rule__ApplicationElementList__Group_3__1__Impl ;
    public final void rule__ApplicationElementList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2389:1: ( rule__ApplicationElementList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2390:2: rule__ApplicationElementList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__Group_3__1__Impl_in_rule__ApplicationElementList__Group_3__14961);
            rule__ApplicationElementList__Group_3__1__Impl();

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
    // $ANTLR end "rule__ApplicationElementList__Group_3__1"


    // $ANTLR start "rule__ApplicationElementList__Group_3__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2396:1: rule__ApplicationElementList__Group_3__1__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) ) ;
    public final void rule__ApplicationElementList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2400:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2401:1: ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2401:1: ( ( rule__ApplicationElementList__ElementsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2402:1: ( rule__ApplicationElementList__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2403:1: ( rule__ApplicationElementList__ElementsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2403:2: rule__ApplicationElementList__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationElementList__ElementsAssignment_3_1_in_rule__ApplicationElementList__Group_3__1__Impl4988);
            rule__ApplicationElementList__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3_1()); 

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
    // $ANTLR end "rule__ApplicationElementList__Group_3__1__Impl"


    // $ANTLR start "rule__ApplicationMainActivity__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2417:1: rule__ApplicationMainActivity__Group__0 : rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 ;
    public final void rule__ApplicationMainActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2421:1: ( rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2422:2: rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__0__Impl_in_rule__ApplicationMainActivity__Group__05022);
            rule__ApplicationMainActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__1_in_rule__ApplicationMainActivity__Group__05025);
            rule__ApplicationMainActivity__Group__1();

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
    // $ANTLR end "rule__ApplicationMainActivity__Group__0"


    // $ANTLR start "rule__ApplicationMainActivity__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2429:1: rule__ApplicationMainActivity__Group__0__Impl : ( 'main-activity' ) ;
    public final void rule__ApplicationMainActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2433:1: ( ( 'main-activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2434:1: ( 'main-activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2434:1: ( 'main-activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2435:1: 'main-activity'
            {
             before(grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ApplicationMainActivity__Group__0__Impl5053); 
             after(grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0()); 

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
    // $ANTLR end "rule__ApplicationMainActivity__Group__0__Impl"


    // $ANTLR start "rule__ApplicationMainActivity__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2448:1: rule__ApplicationMainActivity__Group__1 : rule__ApplicationMainActivity__Group__1__Impl ;
    public final void rule__ApplicationMainActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2452:1: ( rule__ApplicationMainActivity__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2453:2: rule__ApplicationMainActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__Group__1__Impl_in_rule__ApplicationMainActivity__Group__15084);
            rule__ApplicationMainActivity__Group__1__Impl();

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
    // $ANTLR end "rule__ApplicationMainActivity__Group__1"


    // $ANTLR start "rule__ApplicationMainActivity__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2459:1: rule__ApplicationMainActivity__Group__1__Impl : ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) ;
    public final void rule__ApplicationMainActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2463:1: ( ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2464:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2464:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2465:1: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2466:1: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2466:2: rule__ApplicationMainActivity__LauncherActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationMainActivity__LauncherActivityAssignment_1_in_rule__ApplicationMainActivity__Group__1__Impl5111);
            rule__ApplicationMainActivity__LauncherActivityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 

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
    // $ANTLR end "rule__ApplicationMainActivity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2480:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2484:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2485:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__05145);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__05148);
            rule__Activity__Group__1();

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
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2492:1: rule__Activity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2496:1: ( ( 'activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2497:1: ( 'activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2497:1: ( 'activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2498:1: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group__0__Impl5176); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

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
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2511:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2515:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2516:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__15207);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__15210);
            rule__Activity__Group__2();

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
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2523:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2527:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2528:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2528:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2529:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2530:1: ( rule__Activity__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2530:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl5237);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2540:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2544:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2545:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__25267);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__25270);
            rule__Activity__Group__3();

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
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2552:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2556:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2557:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2557:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2558:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Activity__Group__2__Impl5298); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2571:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2575:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2576:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__35329);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__35332);
            rule__Activity__Group__4();

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
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2583:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__AttributesAssignment_3 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2587:1: ( ( ( rule__Activity__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2588:1: ( ( rule__Activity__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2588:1: ( ( rule__Activity__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2589:1: ( rule__Activity__AttributesAssignment_3 )
            {
             before(grammarAccess.getActivityAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2590:1: ( rule__Activity__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2590:2: rule__Activity__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Activity__AttributesAssignment_3_in_rule__Activity__Group__3__Impl5359);
            rule__Activity__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2600:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2604:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2605:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__45389);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__45392);
            rule__Activity__Group__5();

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
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2612:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2616:1: ( ( ( rule__Activity__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2617:1: ( ( rule__Activity__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2617:1: ( ( rule__Activity__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2618:1: ( rule__Activity__Group_4__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2619:1: ( rule__Activity__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2619:2: rule__Activity__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl5419);
            	    rule__Activity__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2629:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2633:1: ( rule__Activity__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2634:2: rule__Activity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__55450);
            rule__Activity__Group__5__Impl();

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
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2640:1: rule__Activity__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2644:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2645:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2645:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2646:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Activity__Group__5__Impl5478); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2671:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2675:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2676:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__05521);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__05524);
            rule__Activity__Group_4__1();

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
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2683:1: rule__Activity__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2687:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2688:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2688:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2689:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Activity__Group_4__0__Impl5552); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2702:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2706:1: ( rule__Activity__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2707:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__15583);
            rule__Activity__Group_4__1__Impl();

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
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2713:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__AttributesAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2717:1: ( ( ( rule__Activity__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2718:1: ( ( rule__Activity__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2718:1: ( ( rule__Activity__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2719:1: ( rule__Activity__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2720:1: ( rule__Activity__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2720:2: rule__Activity__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__AttributesAssignment_4_1_in_rule__Activity__Group_4__1__Impl5610);
            rule__Activity__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAttributesAssignment_4_1()); 

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
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2734:1: rule__BroadcastReceiver__Group__0 : rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1 ;
    public final void rule__BroadcastReceiver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2738:1: ( rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2739:2: rule__BroadcastReceiver__Group__0__Impl rule__BroadcastReceiver__Group__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__0__Impl_in_rule__BroadcastReceiver__Group__05644);
            rule__BroadcastReceiver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__1_in_rule__BroadcastReceiver__Group__05647);
            rule__BroadcastReceiver__Group__1();

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
    // $ANTLR end "rule__BroadcastReceiver__Group__0"


    // $ANTLR start "rule__BroadcastReceiver__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2746:1: rule__BroadcastReceiver__Group__0__Impl : ( 'receiver' ) ;
    public final void rule__BroadcastReceiver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2750:1: ( ( 'receiver' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2751:1: ( 'receiver' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2751:1: ( 'receiver' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2752:1: 'receiver'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__BroadcastReceiver__Group__0__Impl5675); 
             after(grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0()); 

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
    // $ANTLR end "rule__BroadcastReceiver__Group__0__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2765:1: rule__BroadcastReceiver__Group__1 : rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2 ;
    public final void rule__BroadcastReceiver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2769:1: ( rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2770:2: rule__BroadcastReceiver__Group__1__Impl rule__BroadcastReceiver__Group__2
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__1__Impl_in_rule__BroadcastReceiver__Group__15706);
            rule__BroadcastReceiver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__2_in_rule__BroadcastReceiver__Group__15709);
            rule__BroadcastReceiver__Group__2();

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
    // $ANTLR end "rule__BroadcastReceiver__Group__1"


    // $ANTLR start "rule__BroadcastReceiver__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2777:1: rule__BroadcastReceiver__Group__1__Impl : ( ( rule__BroadcastReceiver__NameAssignment_1 ) ) ;
    public final void rule__BroadcastReceiver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2781:1: ( ( ( rule__BroadcastReceiver__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2782:1: ( ( rule__BroadcastReceiver__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2782:1: ( ( rule__BroadcastReceiver__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2783:1: ( rule__BroadcastReceiver__NameAssignment_1 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2784:1: ( rule__BroadcastReceiver__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2784:2: rule__BroadcastReceiver__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__NameAssignment_1_in_rule__BroadcastReceiver__Group__1__Impl5736);
            rule__BroadcastReceiver__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BroadcastReceiver__Group__1__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2794:1: rule__BroadcastReceiver__Group__2 : rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3 ;
    public final void rule__BroadcastReceiver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2798:1: ( rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2799:2: rule__BroadcastReceiver__Group__2__Impl rule__BroadcastReceiver__Group__3
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__2__Impl_in_rule__BroadcastReceiver__Group__25766);
            rule__BroadcastReceiver__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__3_in_rule__BroadcastReceiver__Group__25769);
            rule__BroadcastReceiver__Group__3();

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
    // $ANTLR end "rule__BroadcastReceiver__Group__2"


    // $ANTLR start "rule__BroadcastReceiver__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2806:1: rule__BroadcastReceiver__Group__2__Impl : ( '{' ) ;
    public final void rule__BroadcastReceiver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2810:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2811:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2811:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2812:1: '{'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__BroadcastReceiver__Group__2__Impl5797); 
             after(grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BroadcastReceiver__Group__2__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2825:1: rule__BroadcastReceiver__Group__3 : rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4 ;
    public final void rule__BroadcastReceiver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2829:1: ( rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2830:2: rule__BroadcastReceiver__Group__3__Impl rule__BroadcastReceiver__Group__4
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__3__Impl_in_rule__BroadcastReceiver__Group__35828);
            rule__BroadcastReceiver__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__4_in_rule__BroadcastReceiver__Group__35831);
            rule__BroadcastReceiver__Group__4();

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
    // $ANTLR end "rule__BroadcastReceiver__Group__3"


    // $ANTLR start "rule__BroadcastReceiver__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2837:1: rule__BroadcastReceiver__Group__3__Impl : ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) ) ;
    public final void rule__BroadcastReceiver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2841:1: ( ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2842:1: ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2842:1: ( ( rule__BroadcastReceiver__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2843:1: ( rule__BroadcastReceiver__AttributesAssignment_3 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2844:1: ( rule__BroadcastReceiver__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2844:2: rule__BroadcastReceiver__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__AttributesAssignment_3_in_rule__BroadcastReceiver__Group__3__Impl5858);
            rule__BroadcastReceiver__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__BroadcastReceiver__Group__3__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2854:1: rule__BroadcastReceiver__Group__4 : rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5 ;
    public final void rule__BroadcastReceiver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2858:1: ( rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2859:2: rule__BroadcastReceiver__Group__4__Impl rule__BroadcastReceiver__Group__5
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__4__Impl_in_rule__BroadcastReceiver__Group__45888);
            rule__BroadcastReceiver__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__5_in_rule__BroadcastReceiver__Group__45891);
            rule__BroadcastReceiver__Group__5();

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
    // $ANTLR end "rule__BroadcastReceiver__Group__4"


    // $ANTLR start "rule__BroadcastReceiver__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2866:1: rule__BroadcastReceiver__Group__4__Impl : ( ( rule__BroadcastReceiver__Group_4__0 )* ) ;
    public final void rule__BroadcastReceiver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2870:1: ( ( ( rule__BroadcastReceiver__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2871:1: ( ( rule__BroadcastReceiver__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2871:1: ( ( rule__BroadcastReceiver__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2872:1: ( rule__BroadcastReceiver__Group_4__0 )*
            {
             before(grammarAccess.getBroadcastReceiverAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2873:1: ( rule__BroadcastReceiver__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2873:2: rule__BroadcastReceiver__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__0_in_rule__BroadcastReceiver__Group__4__Impl5918);
            	    rule__BroadcastReceiver__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBroadcastReceiverAccess().getGroup_4()); 

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
    // $ANTLR end "rule__BroadcastReceiver__Group__4__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2883:1: rule__BroadcastReceiver__Group__5 : rule__BroadcastReceiver__Group__5__Impl ;
    public final void rule__BroadcastReceiver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2887:1: ( rule__BroadcastReceiver__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2888:2: rule__BroadcastReceiver__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group__5__Impl_in_rule__BroadcastReceiver__Group__55949);
            rule__BroadcastReceiver__Group__5__Impl();

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
    // $ANTLR end "rule__BroadcastReceiver__Group__5"


    // $ANTLR start "rule__BroadcastReceiver__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2894:1: rule__BroadcastReceiver__Group__5__Impl : ( '}' ) ;
    public final void rule__BroadcastReceiver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2898:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2899:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2899:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2900:1: '}'
            {
             before(grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__BroadcastReceiver__Group__5__Impl5977); 
             after(grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__BroadcastReceiver__Group__5__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2925:1: rule__BroadcastReceiver__Group_4__0 : rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1 ;
    public final void rule__BroadcastReceiver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2929:1: ( rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2930:2: rule__BroadcastReceiver__Group_4__0__Impl rule__BroadcastReceiver__Group_4__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__0__Impl_in_rule__BroadcastReceiver__Group_4__06020);
            rule__BroadcastReceiver__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__1_in_rule__BroadcastReceiver__Group_4__06023);
            rule__BroadcastReceiver__Group_4__1();

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
    // $ANTLR end "rule__BroadcastReceiver__Group_4__0"


    // $ANTLR start "rule__BroadcastReceiver__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2937:1: rule__BroadcastReceiver__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BroadcastReceiver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2941:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2942:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2942:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2943:1: ','
            {
             before(grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__BroadcastReceiver__Group_4__0__Impl6051); 
             after(grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__BroadcastReceiver__Group_4__0__Impl"


    // $ANTLR start "rule__BroadcastReceiver__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2956:1: rule__BroadcastReceiver__Group_4__1 : rule__BroadcastReceiver__Group_4__1__Impl ;
    public final void rule__BroadcastReceiver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2960:1: ( rule__BroadcastReceiver__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2961:2: rule__BroadcastReceiver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__Group_4__1__Impl_in_rule__BroadcastReceiver__Group_4__16082);
            rule__BroadcastReceiver__Group_4__1__Impl();

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
    // $ANTLR end "rule__BroadcastReceiver__Group_4__1"


    // $ANTLR start "rule__BroadcastReceiver__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2967:1: rule__BroadcastReceiver__Group_4__1__Impl : ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) ) ;
    public final void rule__BroadcastReceiver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2971:1: ( ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2972:1: ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2972:1: ( ( rule__BroadcastReceiver__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2973:1: ( rule__BroadcastReceiver__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2974:1: ( rule__BroadcastReceiver__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2974:2: rule__BroadcastReceiver__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiver__AttributesAssignment_4_1_in_rule__BroadcastReceiver__Group_4__1__Impl6109);
            rule__BroadcastReceiver__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_4_1()); 

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
    // $ANTLR end "rule__BroadcastReceiver__Group_4__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2988:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2992:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:2993:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06143);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06146);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3000:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3004:1: ( ( 'service' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3005:1: ( 'service' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3005:1: ( 'service' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3006:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Service__Group__0__Impl6174); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3019:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3023:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3024:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16205);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16208);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3031:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3035:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3036:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3036:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3037:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3038:1: ( rule__Service__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3038:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl6235);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3048:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3052:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3053:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26265);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26268);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3060:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3064:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3065:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3065:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3066:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Service__Group__2__Impl6296); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3079:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3083:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3084:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36327);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36330);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3091:1: rule__Service__Group__3__Impl : ( ( rule__Service__AttributesAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3095:1: ( ( ( rule__Service__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3096:1: ( ( rule__Service__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3096:1: ( ( rule__Service__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3097:1: ( rule__Service__AttributesAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3098:1: ( rule__Service__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3098:2: rule__Service__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__AttributesAssignment_3_in_rule__Service__Group__3__Impl6357);
            rule__Service__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3108:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3112:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3113:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46387);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46390);
            rule__Service__Group__5();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3120:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3124:1: ( ( ( rule__Service__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3125:1: ( ( rule__Service__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3125:1: ( ( rule__Service__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3126:1: ( rule__Service__Group_4__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3127:1: ( rule__Service__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3127:2: rule__Service__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl6417);
            	    rule__Service__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3137:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3141:1: ( rule__Service__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3142:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56448);
            rule__Service__Group__5__Impl();

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3148:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3152:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3153:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3153:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3154:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Service__Group__5__Impl6476); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3179:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3183:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3184:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__06519);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__06522);
            rule__Service__Group_4__1();

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
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3191:1: rule__Service__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3195:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3196:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3196:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3197:1: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Service__Group_4__0__Impl6550); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3210:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3214:1: ( rule__Service__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3215:2: rule__Service__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__16581);
            rule__Service__Group_4__1__Impl();

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
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3221:1: rule__Service__Group_4__1__Impl : ( ( rule__Service__AttributesAssignment_4_1 ) ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3225:1: ( ( ( rule__Service__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3226:1: ( ( rule__Service__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3226:1: ( ( rule__Service__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3227:1: ( rule__Service__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3228:1: ( rule__Service__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3228:2: rule__Service__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Service__AttributesAssignment_4_1_in_rule__Service__Group_4__1__Impl6608);
            rule__Service__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAttributesAssignment_4_1()); 

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
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__ElementEnabledAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3242:1: rule__ElementEnabledAttribute__Group__0 : rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1 ;
    public final void rule__ElementEnabledAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3246:1: ( rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3247:2: rule__ElementEnabledAttribute__Group__0__Impl rule__ElementEnabledAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__0__Impl_in_rule__ElementEnabledAttribute__Group__06642);
            rule__ElementEnabledAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__1_in_rule__ElementEnabledAttribute__Group__06645);
            rule__ElementEnabledAttribute__Group__1();

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
    // $ANTLR end "rule__ElementEnabledAttribute__Group__0"


    // $ANTLR start "rule__ElementEnabledAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3254:1: rule__ElementEnabledAttribute__Group__0__Impl : ( 'enabled' ) ;
    public final void rule__ElementEnabledAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3258:1: ( ( 'enabled' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3259:1: ( 'enabled' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3259:1: ( 'enabled' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3260:1: 'enabled'
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ElementEnabledAttribute__Group__0__Impl6673); 
             after(grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0()); 

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
    // $ANTLR end "rule__ElementEnabledAttribute__Group__0__Impl"


    // $ANTLR start "rule__ElementEnabledAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3273:1: rule__ElementEnabledAttribute__Group__1 : rule__ElementEnabledAttribute__Group__1__Impl ;
    public final void rule__ElementEnabledAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3277:1: ( rule__ElementEnabledAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3278:2: rule__ElementEnabledAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__Group__1__Impl_in_rule__ElementEnabledAttribute__Group__16704);
            rule__ElementEnabledAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__ElementEnabledAttribute__Group__1"


    // $ANTLR start "rule__ElementEnabledAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3284:1: rule__ElementEnabledAttribute__Group__1__Impl : ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) ) ;
    public final void rule__ElementEnabledAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3288:1: ( ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3289:1: ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3289:1: ( ( rule__ElementEnabledAttribute__EnabledAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3290:1: ( rule__ElementEnabledAttribute__EnabledAssignment_1 )
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3291:1: ( rule__ElementEnabledAttribute__EnabledAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3291:2: rule__ElementEnabledAttribute__EnabledAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementEnabledAttribute__EnabledAssignment_1_in_rule__ElementEnabledAttribute__Group__1__Impl6731);
            rule__ElementEnabledAttribute__EnabledAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementEnabledAttributeAccess().getEnabledAssignment_1()); 

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
    // $ANTLR end "rule__ElementEnabledAttribute__Group__1__Impl"


    // $ANTLR start "rule__ElementExportedAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3305:1: rule__ElementExportedAttribute__Group__0 : rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1 ;
    public final void rule__ElementExportedAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3309:1: ( rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3310:2: rule__ElementExportedAttribute__Group__0__Impl rule__ElementExportedAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__0__Impl_in_rule__ElementExportedAttribute__Group__06765);
            rule__ElementExportedAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__1_in_rule__ElementExportedAttribute__Group__06768);
            rule__ElementExportedAttribute__Group__1();

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
    // $ANTLR end "rule__ElementExportedAttribute__Group__0"


    // $ANTLR start "rule__ElementExportedAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3317:1: rule__ElementExportedAttribute__Group__0__Impl : ( 'exported' ) ;
    public final void rule__ElementExportedAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3321:1: ( ( 'exported' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3322:1: ( 'exported' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3322:1: ( 'exported' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3323:1: 'exported'
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ElementExportedAttribute__Group__0__Impl6796); 
             after(grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0()); 

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
    // $ANTLR end "rule__ElementExportedAttribute__Group__0__Impl"


    // $ANTLR start "rule__ElementExportedAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3336:1: rule__ElementExportedAttribute__Group__1 : rule__ElementExportedAttribute__Group__1__Impl ;
    public final void rule__ElementExportedAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3340:1: ( rule__ElementExportedAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3341:2: rule__ElementExportedAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__Group__1__Impl_in_rule__ElementExportedAttribute__Group__16827);
            rule__ElementExportedAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__ElementExportedAttribute__Group__1"


    // $ANTLR start "rule__ElementExportedAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3347:1: rule__ElementExportedAttribute__Group__1__Impl : ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) ) ;
    public final void rule__ElementExportedAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3351:1: ( ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3352:1: ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3352:1: ( ( rule__ElementExportedAttribute__ExportedAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3353:1: ( rule__ElementExportedAttribute__ExportedAssignment_1 )
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3354:1: ( rule__ElementExportedAttribute__ExportedAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3354:2: rule__ElementExportedAttribute__ExportedAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementExportedAttribute__ExportedAssignment_1_in_rule__ElementExportedAttribute__Group__1__Impl6854);
            rule__ElementExportedAttribute__ExportedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementExportedAttributeAccess().getExportedAssignment_1()); 

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
    // $ANTLR end "rule__ElementExportedAttribute__Group__1__Impl"


    // $ANTLR start "rule__ElementLabelAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3368:1: rule__ElementLabelAttribute__Group__0 : rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1 ;
    public final void rule__ElementLabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3372:1: ( rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3373:2: rule__ElementLabelAttribute__Group__0__Impl rule__ElementLabelAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__0__Impl_in_rule__ElementLabelAttribute__Group__06888);
            rule__ElementLabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__1_in_rule__ElementLabelAttribute__Group__06891);
            rule__ElementLabelAttribute__Group__1();

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
    // $ANTLR end "rule__ElementLabelAttribute__Group__0"


    // $ANTLR start "rule__ElementLabelAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3380:1: rule__ElementLabelAttribute__Group__0__Impl : ( 'title' ) ;
    public final void rule__ElementLabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3384:1: ( ( 'title' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3385:1: ( 'title' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3385:1: ( 'title' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3386:1: 'title'
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ElementLabelAttribute__Group__0__Impl6919); 
             after(grammarAccess.getElementLabelAttributeAccess().getTitleKeyword_0()); 

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
    // $ANTLR end "rule__ElementLabelAttribute__Group__0__Impl"


    // $ANTLR start "rule__ElementLabelAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3399:1: rule__ElementLabelAttribute__Group__1 : rule__ElementLabelAttribute__Group__1__Impl ;
    public final void rule__ElementLabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3403:1: ( rule__ElementLabelAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3404:2: rule__ElementLabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__Group__1__Impl_in_rule__ElementLabelAttribute__Group__16950);
            rule__ElementLabelAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__ElementLabelAttribute__Group__1"


    // $ANTLR start "rule__ElementLabelAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3410:1: rule__ElementLabelAttribute__Group__1__Impl : ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) ) ;
    public final void rule__ElementLabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3414:1: ( ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3415:1: ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3415:1: ( ( rule__ElementLabelAttribute__TitleAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3416:1: ( rule__ElementLabelAttribute__TitleAssignment_1 )
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3417:1: ( rule__ElementLabelAttribute__TitleAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3417:2: rule__ElementLabelAttribute__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementLabelAttribute__TitleAssignment_1_in_rule__ElementLabelAttribute__Group__1__Impl6977);
            rule__ElementLabelAttribute__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementLabelAttributeAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__ElementLabelAttribute__Group__1__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3431:1: rule__ElementIntentList__Group__0 : rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1 ;
    public final void rule__ElementIntentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3435:1: ( rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3436:2: rule__ElementIntentList__Group__0__Impl rule__ElementIntentList__Group__1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__0__Impl_in_rule__ElementIntentList__Group__07011);
            rule__ElementIntentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__1_in_rule__ElementIntentList__Group__07014);
            rule__ElementIntentList__Group__1();

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
    // $ANTLR end "rule__ElementIntentList__Group__0"


    // $ANTLR start "rule__ElementIntentList__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3443:1: rule__ElementIntentList__Group__0__Impl : ( 'intents' ) ;
    public final void rule__ElementIntentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3447:1: ( ( 'intents' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3448:1: ( 'intents' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3448:1: ( 'intents' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3449:1: 'intents'
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ElementIntentList__Group__0__Impl7042); 
             after(grammarAccess.getElementIntentListAccess().getIntentsKeyword_0()); 

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
    // $ANTLR end "rule__ElementIntentList__Group__0__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3462:1: rule__ElementIntentList__Group__1 : rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2 ;
    public final void rule__ElementIntentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3466:1: ( rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3467:2: rule__ElementIntentList__Group__1__Impl rule__ElementIntentList__Group__2
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__1__Impl_in_rule__ElementIntentList__Group__17073);
            rule__ElementIntentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__2_in_rule__ElementIntentList__Group__17076);
            rule__ElementIntentList__Group__2();

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
    // $ANTLR end "rule__ElementIntentList__Group__1"


    // $ANTLR start "rule__ElementIntentList__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3474:1: rule__ElementIntentList__Group__1__Impl : ( '[' ) ;
    public final void rule__ElementIntentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3478:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3479:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3479:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3480:1: '['
            {
             before(grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ElementIntentList__Group__1__Impl7104); 
             after(grammarAccess.getElementIntentListAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__ElementIntentList__Group__1__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3493:1: rule__ElementIntentList__Group__2 : rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3 ;
    public final void rule__ElementIntentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3497:1: ( rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3498:2: rule__ElementIntentList__Group__2__Impl rule__ElementIntentList__Group__3
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__2__Impl_in_rule__ElementIntentList__Group__27135);
            rule__ElementIntentList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__3_in_rule__ElementIntentList__Group__27138);
            rule__ElementIntentList__Group__3();

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
    // $ANTLR end "rule__ElementIntentList__Group__2"


    // $ANTLR start "rule__ElementIntentList__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3505:1: rule__ElementIntentList__Group__2__Impl : ( ( rule__ElementIntentList__IntentsAssignment_2 ) ) ;
    public final void rule__ElementIntentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3509:1: ( ( ( rule__ElementIntentList__IntentsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3510:1: ( ( rule__ElementIntentList__IntentsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3510:1: ( ( rule__ElementIntentList__IntentsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3511:1: ( rule__ElementIntentList__IntentsAssignment_2 )
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3512:1: ( rule__ElementIntentList__IntentsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3512:2: rule__ElementIntentList__IntentsAssignment_2
            {
            pushFollow(FOLLOW_rule__ElementIntentList__IntentsAssignment_2_in_rule__ElementIntentList__Group__2__Impl7165);
            rule__ElementIntentList__IntentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementIntentListAccess().getIntentsAssignment_2()); 

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
    // $ANTLR end "rule__ElementIntentList__Group__2__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3522:1: rule__ElementIntentList__Group__3 : rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4 ;
    public final void rule__ElementIntentList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3526:1: ( rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3527:2: rule__ElementIntentList__Group__3__Impl rule__ElementIntentList__Group__4
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__3__Impl_in_rule__ElementIntentList__Group__37195);
            rule__ElementIntentList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group__4_in_rule__ElementIntentList__Group__37198);
            rule__ElementIntentList__Group__4();

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
    // $ANTLR end "rule__ElementIntentList__Group__3"


    // $ANTLR start "rule__ElementIntentList__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3534:1: rule__ElementIntentList__Group__3__Impl : ( ( rule__ElementIntentList__Group_3__0 )* ) ;
    public final void rule__ElementIntentList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3538:1: ( ( ( rule__ElementIntentList__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3539:1: ( ( rule__ElementIntentList__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3539:1: ( ( rule__ElementIntentList__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3540:1: ( rule__ElementIntentList__Group_3__0 )*
            {
             before(grammarAccess.getElementIntentListAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3541:1: ( rule__ElementIntentList__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3541:2: rule__ElementIntentList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ElementIntentList__Group_3__0_in_rule__ElementIntentList__Group__3__Impl7225);
            	    rule__ElementIntentList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getElementIntentListAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ElementIntentList__Group__3__Impl"


    // $ANTLR start "rule__ElementIntentList__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3551:1: rule__ElementIntentList__Group__4 : rule__ElementIntentList__Group__4__Impl ;
    public final void rule__ElementIntentList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3555:1: ( rule__ElementIntentList__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3556:2: rule__ElementIntentList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group__4__Impl_in_rule__ElementIntentList__Group__47256);
            rule__ElementIntentList__Group__4__Impl();

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
    // $ANTLR end "rule__ElementIntentList__Group__4"


    // $ANTLR start "rule__ElementIntentList__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3562:1: rule__ElementIntentList__Group__4__Impl : ( ']' ) ;
    public final void rule__ElementIntentList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3566:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3567:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3567:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3568:1: ']'
            {
             before(grammarAccess.getElementIntentListAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ElementIntentList__Group__4__Impl7284); 
             after(grammarAccess.getElementIntentListAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__ElementIntentList__Group__4__Impl"


    // $ANTLR start "rule__ElementIntentList__Group_3__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3591:1: rule__ElementIntentList__Group_3__0 : rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1 ;
    public final void rule__ElementIntentList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3595:1: ( rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3596:2: rule__ElementIntentList__Group_3__0__Impl rule__ElementIntentList__Group_3__1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__0__Impl_in_rule__ElementIntentList__Group_3__07325);
            rule__ElementIntentList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__1_in_rule__ElementIntentList__Group_3__07328);
            rule__ElementIntentList__Group_3__1();

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
    // $ANTLR end "rule__ElementIntentList__Group_3__0"


    // $ANTLR start "rule__ElementIntentList__Group_3__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3603:1: rule__ElementIntentList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ElementIntentList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3607:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3608:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3608:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3609:1: ','
            {
             before(grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ElementIntentList__Group_3__0__Impl7356); 
             after(grammarAccess.getElementIntentListAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ElementIntentList__Group_3__0__Impl"


    // $ANTLR start "rule__ElementIntentList__Group_3__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3622:1: rule__ElementIntentList__Group_3__1 : rule__ElementIntentList__Group_3__1__Impl ;
    public final void rule__ElementIntentList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3626:1: ( rule__ElementIntentList__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3627:2: rule__ElementIntentList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementIntentList__Group_3__1__Impl_in_rule__ElementIntentList__Group_3__17387);
            rule__ElementIntentList__Group_3__1__Impl();

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
    // $ANTLR end "rule__ElementIntentList__Group_3__1"


    // $ANTLR start "rule__ElementIntentList__Group_3__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3633:1: rule__ElementIntentList__Group_3__1__Impl : ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) ) ;
    public final void rule__ElementIntentList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3637:1: ( ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3638:1: ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3638:1: ( ( rule__ElementIntentList__IntentsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3639:1: ( rule__ElementIntentList__IntentsAssignment_3_1 )
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3640:1: ( rule__ElementIntentList__IntentsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3640:2: rule__ElementIntentList__IntentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ElementIntentList__IntentsAssignment_3_1_in_rule__ElementIntentList__Group_3__1__Impl7414);
            rule__ElementIntentList__IntentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElementIntentListAccess().getIntentsAssignment_3_1()); 

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
    // $ANTLR end "rule__ElementIntentList__Group_3__1__Impl"


    // $ANTLR start "rule__ActivityParentAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3654:1: rule__ActivityParentAttribute__Group__0 : rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1 ;
    public final void rule__ActivityParentAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3658:1: ( rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3659:2: rule__ActivityParentAttribute__Group__0__Impl rule__ActivityParentAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__0__Impl_in_rule__ActivityParentAttribute__Group__07448);
            rule__ActivityParentAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__1_in_rule__ActivityParentAttribute__Group__07451);
            rule__ActivityParentAttribute__Group__1();

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
    // $ANTLR end "rule__ActivityParentAttribute__Group__0"


    // $ANTLR start "rule__ActivityParentAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3666:1: rule__ActivityParentAttribute__Group__0__Impl : ( 'parent' ) ;
    public final void rule__ActivityParentAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3670:1: ( ( 'parent' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3671:1: ( 'parent' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3671:1: ( 'parent' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3672:1: 'parent'
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ActivityParentAttribute__Group__0__Impl7479); 
             after(grammarAccess.getActivityParentAttributeAccess().getParentKeyword_0()); 

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
    // $ANTLR end "rule__ActivityParentAttribute__Group__0__Impl"


    // $ANTLR start "rule__ActivityParentAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3685:1: rule__ActivityParentAttribute__Group__1 : rule__ActivityParentAttribute__Group__1__Impl ;
    public final void rule__ActivityParentAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3689:1: ( rule__ActivityParentAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3690:2: rule__ActivityParentAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__Group__1__Impl_in_rule__ActivityParentAttribute__Group__17510);
            rule__ActivityParentAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__ActivityParentAttribute__Group__1"


    // $ANTLR start "rule__ActivityParentAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3696:1: rule__ActivityParentAttribute__Group__1__Impl : ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) ) ;
    public final void rule__ActivityParentAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3700:1: ( ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3701:1: ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3701:1: ( ( rule__ActivityParentAttribute__ParentAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3702:1: ( rule__ActivityParentAttribute__ParentAssignment_1 )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3703:1: ( rule__ActivityParentAttribute__ParentAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3703:2: rule__ActivityParentAttribute__ParentAssignment_1
            {
            pushFollow(FOLLOW_rule__ActivityParentAttribute__ParentAssignment_1_in_rule__ActivityParentAttribute__Group__1__Impl7537);
            rule__ActivityParentAttribute__ParentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityParentAttributeAccess().getParentAssignment_1()); 

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
    // $ANTLR end "rule__ActivityParentAttribute__Group__1__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3717:1: rule__ActivityLayoutAttribute__Group__0 : rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1 ;
    public final void rule__ActivityLayoutAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3721:1: ( rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3722:2: rule__ActivityLayoutAttribute__Group__0__Impl rule__ActivityLayoutAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__0__Impl_in_rule__ActivityLayoutAttribute__Group__07571);
            rule__ActivityLayoutAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__1_in_rule__ActivityLayoutAttribute__Group__07574);
            rule__ActivityLayoutAttribute__Group__1();

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__0"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3729:1: rule__ActivityLayoutAttribute__Group__0__Impl : ( 'layout-elements' ) ;
    public final void rule__ActivityLayoutAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3733:1: ( ( 'layout-elements' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3734:1: ( 'layout-elements' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3734:1: ( 'layout-elements' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3735:1: 'layout-elements'
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ActivityLayoutAttribute__Group__0__Impl7602); 
             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsKeyword_0()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__0__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3748:1: rule__ActivityLayoutAttribute__Group__1 : rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2 ;
    public final void rule__ActivityLayoutAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3752:1: ( rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3753:2: rule__ActivityLayoutAttribute__Group__1__Impl rule__ActivityLayoutAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__1__Impl_in_rule__ActivityLayoutAttribute__Group__17633);
            rule__ActivityLayoutAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__2_in_rule__ActivityLayoutAttribute__Group__17636);
            rule__ActivityLayoutAttribute__Group__2();

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__1"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3760:1: rule__ActivityLayoutAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__ActivityLayoutAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3764:1: ( ( '[' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3765:1: ( '[' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3765:1: ( '[' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3766:1: '['
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ActivityLayoutAttribute__Group__1__Impl7664); 
             after(grammarAccess.getActivityLayoutAttributeAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__1__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3779:1: rule__ActivityLayoutAttribute__Group__2 : rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3 ;
    public final void rule__ActivityLayoutAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3783:1: ( rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3784:2: rule__ActivityLayoutAttribute__Group__2__Impl rule__ActivityLayoutAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__2__Impl_in_rule__ActivityLayoutAttribute__Group__27695);
            rule__ActivityLayoutAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__3_in_rule__ActivityLayoutAttribute__Group__27698);
            rule__ActivityLayoutAttribute__Group__3();

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__2"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3791:1: rule__ActivityLayoutAttribute__Group__2__Impl : ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) ) ;
    public final void rule__ActivityLayoutAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3795:1: ( ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3796:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3796:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3797:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_2()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3798:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3798:2: rule__ActivityLayoutAttribute__LayoutElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_2_in_rule__ActivityLayoutAttribute__Group__2__Impl7725);
            rule__ActivityLayoutAttribute__LayoutElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_2()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__2__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3808:1: rule__ActivityLayoutAttribute__Group__3 : rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4 ;
    public final void rule__ActivityLayoutAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3812:1: ( rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3813:2: rule__ActivityLayoutAttribute__Group__3__Impl rule__ActivityLayoutAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__3__Impl_in_rule__ActivityLayoutAttribute__Group__37755);
            rule__ActivityLayoutAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__4_in_rule__ActivityLayoutAttribute__Group__37758);
            rule__ActivityLayoutAttribute__Group__4();

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__3"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3820:1: rule__ActivityLayoutAttribute__Group__3__Impl : ( ( rule__ActivityLayoutAttribute__Group_3__0 )* ) ;
    public final void rule__ActivityLayoutAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3824:1: ( ( ( rule__ActivityLayoutAttribute__Group_3__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3825:1: ( ( rule__ActivityLayoutAttribute__Group_3__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3825:1: ( ( rule__ActivityLayoutAttribute__Group_3__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3826:1: ( rule__ActivityLayoutAttribute__Group_3__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getGroup_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3827:1: ( rule__ActivityLayoutAttribute__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3827:2: rule__ActivityLayoutAttribute__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__0_in_rule__ActivityLayoutAttribute__Group__3__Impl7785);
            	    rule__ActivityLayoutAttribute__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getActivityLayoutAttributeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__3__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3837:1: rule__ActivityLayoutAttribute__Group__4 : rule__ActivityLayoutAttribute__Group__4__Impl ;
    public final void rule__ActivityLayoutAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3841:1: ( rule__ActivityLayoutAttribute__Group__4__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3842:2: rule__ActivityLayoutAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group__4__Impl_in_rule__ActivityLayoutAttribute__Group__47816);
            rule__ActivityLayoutAttribute__Group__4__Impl();

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__4"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3848:1: rule__ActivityLayoutAttribute__Group__4__Impl : ( ']' ) ;
    public final void rule__ActivityLayoutAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3852:1: ( ( ']' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3853:1: ( ']' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3853:1: ( ']' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3854:1: ']'
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ActivityLayoutAttribute__Group__4__Impl7844); 
             after(grammarAccess.getActivityLayoutAttributeAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group__4__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group_3__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3877:1: rule__ActivityLayoutAttribute__Group_3__0 : rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1 ;
    public final void rule__ActivityLayoutAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3881:1: ( rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3882:2: rule__ActivityLayoutAttribute__Group_3__0__Impl rule__ActivityLayoutAttribute__Group_3__1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__0__Impl_in_rule__ActivityLayoutAttribute__Group_3__07885);
            rule__ActivityLayoutAttribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__1_in_rule__ActivityLayoutAttribute__Group_3__07888);
            rule__ActivityLayoutAttribute__Group_3__1();

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group_3__0"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group_3__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3889:1: rule__ActivityLayoutAttribute__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityLayoutAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3893:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3894:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3894:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3895:1: ','
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__ActivityLayoutAttribute__Group_3__0__Impl7916); 
             after(grammarAccess.getActivityLayoutAttributeAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group_3__0__Impl"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group_3__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3908:1: rule__ActivityLayoutAttribute__Group_3__1 : rule__ActivityLayoutAttribute__Group_3__1__Impl ;
    public final void rule__ActivityLayoutAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3912:1: ( rule__ActivityLayoutAttribute__Group_3__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3913:2: rule__ActivityLayoutAttribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__Group_3__1__Impl_in_rule__ActivityLayoutAttribute__Group_3__17947);
            rule__ActivityLayoutAttribute__Group_3__1__Impl();

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group_3__1"


    // $ANTLR start "rule__ActivityLayoutAttribute__Group_3__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3919:1: rule__ActivityLayoutAttribute__Group_3__1__Impl : ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) ) ;
    public final void rule__ActivityLayoutAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3923:1: ( ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3924:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3924:1: ( ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3925:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 )
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_3_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3926:1: ( rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3926:2: rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1_in_rule__ActivityLayoutAttribute__Group_3__1__Impl7974);
            rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_3_1()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__Group_3__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3940:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3944:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3945:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__08008);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__08011);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3952:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3956:1: ( ( 'button' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3957:1: ( 'button' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3957:1: ( 'button' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3958:1: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Button__Group__0__Impl8039); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

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
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3971:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3975:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3976:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__18070);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__2_in_rule__Button__Group__18073);
            rule__Button__Group__2();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3983:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3987:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3988:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3988:1: ( ( rule__Button__NameAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3989:1: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3990:1: ( rule__Button__NameAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:3990:2: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl8100);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4000:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4004:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4005:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28130);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28133);
            rule__Button__Group__3();

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
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4012:1: rule__Button__Group__2__Impl : ( '{' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4016:1: ( ( '{' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4017:1: ( '{' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4017:1: ( '{' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4018:1: '{'
            {
             before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Button__Group__2__Impl8161); 
             after(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4031:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4035:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4036:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38192);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38195);
            rule__Button__Group__4();

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
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4043:1: rule__Button__Group__3__Impl : ( ( rule__Button__AttributesAssignment_3 ) ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4047:1: ( ( ( rule__Button__AttributesAssignment_3 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4048:1: ( ( rule__Button__AttributesAssignment_3 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4048:1: ( ( rule__Button__AttributesAssignment_3 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4049:1: ( rule__Button__AttributesAssignment_3 )
            {
             before(grammarAccess.getButtonAccess().getAttributesAssignment_3()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4050:1: ( rule__Button__AttributesAssignment_3 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4050:2: rule__Button__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Button__AttributesAssignment_3_in_rule__Button__Group__3__Impl8222);
            rule__Button__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4060:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4064:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4065:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48252);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48255);
            rule__Button__Group__5();

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
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4072:1: rule__Button__Group__4__Impl : ( ( rule__Button__Group_4__0 )* ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4076:1: ( ( ( rule__Button__Group_4__0 )* ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4077:1: ( ( rule__Button__Group_4__0 )* )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4077:1: ( ( rule__Button__Group_4__0 )* )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4078:1: ( rule__Button__Group_4__0 )*
            {
             before(grammarAccess.getButtonAccess().getGroup_4()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4079:1: ( rule__Button__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4079:2: rule__Button__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Button__Group_4__0_in_rule__Button__Group__4__Impl8282);
            	    rule__Button__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getButtonAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__Button__Group__5"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4089:1: rule__Button__Group__5 : rule__Button__Group__5__Impl ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4093:1: ( rule__Button__Group__5__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4094:2: rule__Button__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58313);
            rule__Button__Group__5__Impl();

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
    // $ANTLR end "rule__Button__Group__5"


    // $ANTLR start "rule__Button__Group__5__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4100:1: rule__Button__Group__5__Impl : ( '}' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4104:1: ( ( '}' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4105:1: ( '}' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4105:1: ( '}' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4106:1: '}'
            {
             before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Button__Group__5__Impl8341); 
             after(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Button__Group__5__Impl"


    // $ANTLR start "rule__Button__Group_4__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4131:1: rule__Button__Group_4__0 : rule__Button__Group_4__0__Impl rule__Button__Group_4__1 ;
    public final void rule__Button__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4135:1: ( rule__Button__Group_4__0__Impl rule__Button__Group_4__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4136:2: rule__Button__Group_4__0__Impl rule__Button__Group_4__1
            {
            pushFollow(FOLLOW_rule__Button__Group_4__0__Impl_in_rule__Button__Group_4__08384);
            rule__Button__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_4__1_in_rule__Button__Group_4__08387);
            rule__Button__Group_4__1();

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
    // $ANTLR end "rule__Button__Group_4__0"


    // $ANTLR start "rule__Button__Group_4__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4143:1: rule__Button__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Button__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4147:1: ( ( ',' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4148:1: ( ',' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4148:1: ( ',' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4149:1: ','
            {
             before(grammarAccess.getButtonAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__Button__Group_4__0__Impl8415); 
             after(grammarAccess.getButtonAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Button__Group_4__0__Impl"


    // $ANTLR start "rule__Button__Group_4__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4162:1: rule__Button__Group_4__1 : rule__Button__Group_4__1__Impl ;
    public final void rule__Button__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4166:1: ( rule__Button__Group_4__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4167:2: rule__Button__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_4__1__Impl_in_rule__Button__Group_4__18446);
            rule__Button__Group_4__1__Impl();

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
    // $ANTLR end "rule__Button__Group_4__1"


    // $ANTLR start "rule__Button__Group_4__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4173:1: rule__Button__Group_4__1__Impl : ( ( rule__Button__AttributesAssignment_4_1 ) ) ;
    public final void rule__Button__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4177:1: ( ( ( rule__Button__AttributesAssignment_4_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4178:1: ( ( rule__Button__AttributesAssignment_4_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4178:1: ( ( rule__Button__AttributesAssignment_4_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4179:1: ( rule__Button__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getButtonAccess().getAttributesAssignment_4_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4180:1: ( rule__Button__AttributesAssignment_4_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4180:2: rule__Button__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Button__AttributesAssignment_4_1_in_rule__Button__Group_4__1__Impl8473);
            rule__Button__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getAttributesAssignment_4_1()); 

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
    // $ANTLR end "rule__Button__Group_4__1__Impl"


    // $ANTLR start "rule__ButtonLabelAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4194:1: rule__ButtonLabelAttribute__Group__0 : rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1 ;
    public final void rule__ButtonLabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4198:1: ( rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4199:2: rule__ButtonLabelAttribute__Group__0__Impl rule__ButtonLabelAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__0__Impl_in_rule__ButtonLabelAttribute__Group__08507);
            rule__ButtonLabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__1_in_rule__ButtonLabelAttribute__Group__08510);
            rule__ButtonLabelAttribute__Group__1();

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
    // $ANTLR end "rule__ButtonLabelAttribute__Group__0"


    // $ANTLR start "rule__ButtonLabelAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4206:1: rule__ButtonLabelAttribute__Group__0__Impl : ( 'title' ) ;
    public final void rule__ButtonLabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4210:1: ( ( 'title' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4211:1: ( 'title' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4211:1: ( 'title' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4212:1: 'title'
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ButtonLabelAttribute__Group__0__Impl8538); 
             after(grammarAccess.getButtonLabelAttributeAccess().getTitleKeyword_0()); 

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
    // $ANTLR end "rule__ButtonLabelAttribute__Group__0__Impl"


    // $ANTLR start "rule__ButtonLabelAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4225:1: rule__ButtonLabelAttribute__Group__1 : rule__ButtonLabelAttribute__Group__1__Impl ;
    public final void rule__ButtonLabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4229:1: ( rule__ButtonLabelAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4230:2: rule__ButtonLabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__Group__1__Impl_in_rule__ButtonLabelAttribute__Group__18569);
            rule__ButtonLabelAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__ButtonLabelAttribute__Group__1"


    // $ANTLR start "rule__ButtonLabelAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4236:1: rule__ButtonLabelAttribute__Group__1__Impl : ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) ) ;
    public final void rule__ButtonLabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4240:1: ( ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4241:1: ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4241:1: ( ( rule__ButtonLabelAttribute__TitleAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4242:1: ( rule__ButtonLabelAttribute__TitleAssignment_1 )
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4243:1: ( rule__ButtonLabelAttribute__TitleAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4243:2: rule__ButtonLabelAttribute__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ButtonLabelAttribute__TitleAssignment_1_in_rule__ButtonLabelAttribute__Group__1__Impl8596);
            rule__ButtonLabelAttribute__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonLabelAttributeAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__ButtonLabelAttribute__Group__1__Impl"


    // $ANTLR start "rule__ButtonActionAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4257:1: rule__ButtonActionAttribute__Group__0 : rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1 ;
    public final void rule__ButtonActionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4261:1: ( rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4262:2: rule__ButtonActionAttribute__Group__0__Impl rule__ButtonActionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__0__Impl_in_rule__ButtonActionAttribute__Group__08630);
            rule__ButtonActionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__1_in_rule__ButtonActionAttribute__Group__08633);
            rule__ButtonActionAttribute__Group__1();

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
    // $ANTLR end "rule__ButtonActionAttribute__Group__0"


    // $ANTLR start "rule__ButtonActionAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4269:1: rule__ButtonActionAttribute__Group__0__Impl : ( 'action' ) ;
    public final void rule__ButtonActionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4273:1: ( ( 'action' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4274:1: ( 'action' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4274:1: ( 'action' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4275:1: 'action'
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ButtonActionAttribute__Group__0__Impl8661); 
             after(grammarAccess.getButtonActionAttributeAccess().getActionKeyword_0()); 

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
    // $ANTLR end "rule__ButtonActionAttribute__Group__0__Impl"


    // $ANTLR start "rule__ButtonActionAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4288:1: rule__ButtonActionAttribute__Group__1 : rule__ButtonActionAttribute__Group__1__Impl ;
    public final void rule__ButtonActionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4292:1: ( rule__ButtonActionAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4293:2: rule__ButtonActionAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__Group__1__Impl_in_rule__ButtonActionAttribute__Group__18692);
            rule__ButtonActionAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__ButtonActionAttribute__Group__1"


    // $ANTLR start "rule__ButtonActionAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4299:1: rule__ButtonActionAttribute__Group__1__Impl : ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) ) ;
    public final void rule__ButtonActionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4303:1: ( ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4304:1: ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4304:1: ( ( rule__ButtonActionAttribute__ActionAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4305:1: ( rule__ButtonActionAttribute__ActionAssignment_1 )
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4306:1: ( rule__ButtonActionAttribute__ActionAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4306:2: rule__ButtonActionAttribute__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__ButtonActionAttribute__ActionAssignment_1_in_rule__ButtonActionAttribute__Group__1__Impl8719);
            rule__ButtonActionAttribute__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonActionAttributeAccess().getActionAssignment_1()); 

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
    // $ANTLR end "rule__ButtonActionAttribute__Group__1__Impl"


    // $ANTLR start "rule__Spacer__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4320:1: rule__Spacer__Group__0 : rule__Spacer__Group__0__Impl rule__Spacer__Group__1 ;
    public final void rule__Spacer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4324:1: ( rule__Spacer__Group__0__Impl rule__Spacer__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4325:2: rule__Spacer__Group__0__Impl rule__Spacer__Group__1
            {
            pushFollow(FOLLOW_rule__Spacer__Group__0__Impl_in_rule__Spacer__Group__08753);
            rule__Spacer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spacer__Group__1_in_rule__Spacer__Group__08756);
            rule__Spacer__Group__1();

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
    // $ANTLR end "rule__Spacer__Group__0"


    // $ANTLR start "rule__Spacer__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4332:1: rule__Spacer__Group__0__Impl : ( () ) ;
    public final void rule__Spacer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4336:1: ( ( () ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4337:1: ( () )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4337:1: ( () )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4338:1: ()
            {
             before(grammarAccess.getSpacerAccess().getSpacerAction_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4339:1: ()
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4341:1: 
            {
            }

             after(grammarAccess.getSpacerAccess().getSpacerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spacer__Group__0__Impl"


    // $ANTLR start "rule__Spacer__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4351:1: rule__Spacer__Group__1 : rule__Spacer__Group__1__Impl ;
    public final void rule__Spacer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4355:1: ( rule__Spacer__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4356:2: rule__Spacer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Spacer__Group__1__Impl_in_rule__Spacer__Group__18814);
            rule__Spacer__Group__1__Impl();

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
    // $ANTLR end "rule__Spacer__Group__1"


    // $ANTLR start "rule__Spacer__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4362:1: rule__Spacer__Group__1__Impl : ( 'spacer' ) ;
    public final void rule__Spacer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4366:1: ( ( 'spacer' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4367:1: ( 'spacer' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4367:1: ( 'spacer' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4368:1: 'spacer'
            {
             before(grammarAccess.getSpacerAccess().getSpacerKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Spacer__Group__1__Impl8842); 
             after(grammarAccess.getSpacerAccess().getSpacerKeyword_1()); 

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
    // $ANTLR end "rule__Spacer__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4385:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4389:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4390:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__08877);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Text__Group__1_in_rule__Text__Group__08880);
            rule__Text__Group__1();

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
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4397:1: rule__Text__Group__0__Impl : ( 'text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4401:1: ( ( 'text' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4402:1: ( 'text' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4402:1: ( 'text' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4403:1: 'text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Text__Group__0__Impl8908); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

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
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4416:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4420:1: ( rule__Text__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4421:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__18939);
            rule__Text__Group__1__Impl();

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
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4427:1: rule__Text__Group__1__Impl : ( ( rule__Text__TextAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4431:1: ( ( ( rule__Text__TextAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4432:1: ( ( rule__Text__TextAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4432:1: ( ( rule__Text__TextAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4433:1: ( rule__Text__TextAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4434:1: ( rule__Text__TextAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4434:2: rule__Text__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Text__TextAssignment_1_in_rule__Text__Group__1__Impl8966);
            rule__Text__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4448:1: rule__BroadcastReceiverActionAttribute__Group__0 : rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1 ;
    public final void rule__BroadcastReceiverActionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4452:1: ( rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4453:2: rule__BroadcastReceiverActionAttribute__Group__0__Impl rule__BroadcastReceiverActionAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0__Impl_in_rule__BroadcastReceiverActionAttribute__Group__09000);
            rule__BroadcastReceiverActionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1_in_rule__BroadcastReceiverActionAttribute__Group__09003);
            rule__BroadcastReceiverActionAttribute__Group__1();

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
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__Group__0"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4460:1: rule__BroadcastReceiverActionAttribute__Group__0__Impl : ( 'action' ) ;
    public final void rule__BroadcastReceiverActionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4464:1: ( ( 'action' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4465:1: ( 'action' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4465:1: ( 'action' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4466:1: 'action'
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__BroadcastReceiverActionAttribute__Group__0__Impl9031); 
             after(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionKeyword_0()); 

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
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__Group__0__Impl"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4479:1: rule__BroadcastReceiverActionAttribute__Group__1 : rule__BroadcastReceiverActionAttribute__Group__1__Impl ;
    public final void rule__BroadcastReceiverActionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4483:1: ( rule__BroadcastReceiverActionAttribute__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4484:2: rule__BroadcastReceiverActionAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1__Impl_in_rule__BroadcastReceiverActionAttribute__Group__19062);
            rule__BroadcastReceiverActionAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__Group__1"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4490:1: rule__BroadcastReceiverActionAttribute__Group__1__Impl : ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) ) ;
    public final void rule__BroadcastReceiverActionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4494:1: ( ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4495:1: ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4495:1: ( ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4496:1: ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 )
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4497:1: ( rule__BroadcastReceiverActionAttribute__ActionAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4497:2: rule__BroadcastReceiverActionAttribute__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__BroadcastReceiverActionAttribute__ActionAssignment_1_in_rule__BroadcastReceiverActionAttribute__Group__1__Impl9089);
            rule__BroadcastReceiverActionAttribute__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionAssignment_1()); 

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
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__Group__1__Impl"


    // $ANTLR start "rule__ActionShowToast__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4511:1: rule__ActionShowToast__Group__0 : rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1 ;
    public final void rule__ActionShowToast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4515:1: ( rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4516:2: rule__ActionShowToast__Group__0__Impl rule__ActionShowToast__Group__1
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__0__Impl_in_rule__ActionShowToast__Group__09123);
            rule__ActionShowToast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionShowToast__Group__1_in_rule__ActionShowToast__Group__09126);
            rule__ActionShowToast__Group__1();

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
    // $ANTLR end "rule__ActionShowToast__Group__0"


    // $ANTLR start "rule__ActionShowToast__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4523:1: rule__ActionShowToast__Group__0__Impl : ( 'show-toast' ) ;
    public final void rule__ActionShowToast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4527:1: ( ( 'show-toast' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4528:1: ( 'show-toast' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4528:1: ( 'show-toast' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4529:1: 'show-toast'
            {
             before(grammarAccess.getActionShowToastAccess().getShowToastKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ActionShowToast__Group__0__Impl9154); 
             after(grammarAccess.getActionShowToastAccess().getShowToastKeyword_0()); 

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
    // $ANTLR end "rule__ActionShowToast__Group__0__Impl"


    // $ANTLR start "rule__ActionShowToast__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4542:1: rule__ActionShowToast__Group__1 : rule__ActionShowToast__Group__1__Impl ;
    public final void rule__ActionShowToast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4546:1: ( rule__ActionShowToast__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4547:2: rule__ActionShowToast__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionShowToast__Group__1__Impl_in_rule__ActionShowToast__Group__19185);
            rule__ActionShowToast__Group__1__Impl();

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
    // $ANTLR end "rule__ActionShowToast__Group__1"


    // $ANTLR start "rule__ActionShowToast__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4553:1: rule__ActionShowToast__Group__1__Impl : ( ( rule__ActionShowToast__ToastTextAssignment_1 ) ) ;
    public final void rule__ActionShowToast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4557:1: ( ( ( rule__ActionShowToast__ToastTextAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4558:1: ( ( rule__ActionShowToast__ToastTextAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4558:1: ( ( rule__ActionShowToast__ToastTextAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4559:1: ( rule__ActionShowToast__ToastTextAssignment_1 )
            {
             before(grammarAccess.getActionShowToastAccess().getToastTextAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4560:1: ( rule__ActionShowToast__ToastTextAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4560:2: rule__ActionShowToast__ToastTextAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionShowToast__ToastTextAssignment_1_in_rule__ActionShowToast__Group__1__Impl9212);
            rule__ActionShowToast__ToastTextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionShowToastAccess().getToastTextAssignment_1()); 

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
    // $ANTLR end "rule__ActionShowToast__Group__1__Impl"


    // $ANTLR start "rule__ActionStartActivity__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4574:1: rule__ActionStartActivity__Group__0 : rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1 ;
    public final void rule__ActionStartActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4578:1: ( rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4579:2: rule__ActionStartActivity__Group__0__Impl rule__ActionStartActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__0__Impl_in_rule__ActionStartActivity__Group__09246);
            rule__ActionStartActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionStartActivity__Group__1_in_rule__ActionStartActivity__Group__09249);
            rule__ActionStartActivity__Group__1();

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
    // $ANTLR end "rule__ActionStartActivity__Group__0"


    // $ANTLR start "rule__ActionStartActivity__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4586:1: rule__ActionStartActivity__Group__0__Impl : ( 'start-activity' ) ;
    public final void rule__ActionStartActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4590:1: ( ( 'start-activity' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4591:1: ( 'start-activity' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4591:1: ( 'start-activity' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4592:1: 'start-activity'
            {
             before(grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ActionStartActivity__Group__0__Impl9277); 
             after(grammarAccess.getActionStartActivityAccess().getStartActivityKeyword_0()); 

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
    // $ANTLR end "rule__ActionStartActivity__Group__0__Impl"


    // $ANTLR start "rule__ActionStartActivity__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4605:1: rule__ActionStartActivity__Group__1 : rule__ActionStartActivity__Group__1__Impl ;
    public final void rule__ActionStartActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4609:1: ( rule__ActionStartActivity__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4610:2: rule__ActionStartActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__Group__1__Impl_in_rule__ActionStartActivity__Group__19308);
            rule__ActionStartActivity__Group__1__Impl();

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
    // $ANTLR end "rule__ActionStartActivity__Group__1"


    // $ANTLR start "rule__ActionStartActivity__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4616:1: rule__ActionStartActivity__Group__1__Impl : ( ( rule__ActionStartActivity__ActivityAssignment_1 ) ) ;
    public final void rule__ActionStartActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4620:1: ( ( ( rule__ActionStartActivity__ActivityAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4621:1: ( ( rule__ActionStartActivity__ActivityAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4621:1: ( ( rule__ActionStartActivity__ActivityAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4622:1: ( rule__ActionStartActivity__ActivityAssignment_1 )
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4623:1: ( rule__ActionStartActivity__ActivityAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4623:2: rule__ActionStartActivity__ActivityAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionStartActivity__ActivityAssignment_1_in_rule__ActionStartActivity__Group__1__Impl9335);
            rule__ActionStartActivity__ActivityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionStartActivityAccess().getActivityAssignment_1()); 

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
    // $ANTLR end "rule__ActionStartActivity__Group__1__Impl"


    // $ANTLR start "rule__ActionStartService__Group__0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4637:1: rule__ActionStartService__Group__0 : rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1 ;
    public final void rule__ActionStartService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4641:1: ( rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4642:2: rule__ActionStartService__Group__0__Impl rule__ActionStartService__Group__1
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__0__Impl_in_rule__ActionStartService__Group__09369);
            rule__ActionStartService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionStartService__Group__1_in_rule__ActionStartService__Group__09372);
            rule__ActionStartService__Group__1();

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
    // $ANTLR end "rule__ActionStartService__Group__0"


    // $ANTLR start "rule__ActionStartService__Group__0__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4649:1: rule__ActionStartService__Group__0__Impl : ( 'start-service' ) ;
    public final void rule__ActionStartService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4653:1: ( ( 'start-service' ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4654:1: ( 'start-service' )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4654:1: ( 'start-service' )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4655:1: 'start-service'
            {
             before(grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ActionStartService__Group__0__Impl9400); 
             after(grammarAccess.getActionStartServiceAccess().getStartServiceKeyword_0()); 

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
    // $ANTLR end "rule__ActionStartService__Group__0__Impl"


    // $ANTLR start "rule__ActionStartService__Group__1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4668:1: rule__ActionStartService__Group__1 : rule__ActionStartService__Group__1__Impl ;
    public final void rule__ActionStartService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4672:1: ( rule__ActionStartService__Group__1__Impl )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4673:2: rule__ActionStartService__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionStartService__Group__1__Impl_in_rule__ActionStartService__Group__19431);
            rule__ActionStartService__Group__1__Impl();

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
    // $ANTLR end "rule__ActionStartService__Group__1"


    // $ANTLR start "rule__ActionStartService__Group__1__Impl"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4679:1: rule__ActionStartService__Group__1__Impl : ( ( rule__ActionStartService__ServiceAssignment_1 ) ) ;
    public final void rule__ActionStartService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4683:1: ( ( ( rule__ActionStartService__ServiceAssignment_1 ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4684:1: ( ( rule__ActionStartService__ServiceAssignment_1 ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4684:1: ( ( rule__ActionStartService__ServiceAssignment_1 ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4685:1: ( rule__ActionStartService__ServiceAssignment_1 )
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceAssignment_1()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4686:1: ( rule__ActionStartService__ServiceAssignment_1 )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4686:2: rule__ActionStartService__ServiceAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionStartService__ServiceAssignment_1_in_rule__ActionStartService__Group__1__Impl9458);
            rule__ActionStartService__ServiceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionStartServiceAccess().getServiceAssignment_1()); 

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
    // $ANTLR end "rule__ActionStartService__Group__1__Impl"


    // $ANTLR start "rule__AndroidAppProject__ApplicationsAssignment_0"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4701:1: rule__AndroidAppProject__ApplicationsAssignment_0 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4705:1: ( ( ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4706:1: ( ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4706:1: ( ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4707:1: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_09497);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AndroidAppProject__ApplicationsAssignment_0"


    // $ANTLR start "rule__AndroidAppProject__ApplicationsAssignment_1_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4716:1: rule__AndroidAppProject__ApplicationsAssignment_1_1 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4720:1: ( ( ruleApplication ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4721:1: ( ruleApplication )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4721:1: ( ruleApplication )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4722:1: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_1_19528);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AndroidAppProject__ApplicationsAssignment_1_1"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4731:1: rule__Application__NameAssignment_1 : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4735:1: ( ( RULE_PACKAGE_NAME ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4736:1: ( RULE_PACKAGE_NAME )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4736:1: ( RULE_PACKAGE_NAME )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4737:1: RULE_PACKAGE_NAME
            {
             before(grammarAccess.getApplicationAccess().getNamePACKAGE_NAMETerminalRuleCall_1_0()); 
            match(input,RULE_PACKAGE_NAME,FOLLOW_RULE_PACKAGE_NAME_in_rule__Application__NameAssignment_19559); 
             after(grammarAccess.getApplicationAccess().getNamePACKAGE_NAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4746:1: rule__Application__AttributesAssignment_3 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4750:1: ( ( ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4751:1: ( ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4751:1: ( ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4752:1: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_39590);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Application__AttributesAssignment_3"


    // $ANTLR start "rule__Application__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4761:1: rule__Application__AttributesAssignment_4_1 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4765:1: ( ( ruleApplicationAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4766:1: ( ruleApplicationAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4766:1: ( ruleApplicationAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4767:1: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_4_19621);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Application__AttributesAssignment_4_1"


    // $ANTLR start "rule__ApplicationMinSdk__MinSdkAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4776:1: rule__ApplicationMinSdk__MinSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationMinSdk__MinSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4780:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4781:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4781:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4782:1: RULE_INT
            {
             before(grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationMinSdk__MinSdkAssignment_19652); 
             after(grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ApplicationMinSdk__MinSdkAssignment_1"


    // $ANTLR start "rule__ApplicationTargetSdk__TargetSdkAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4791:1: rule__ApplicationTargetSdk__TargetSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationTargetSdk__TargetSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4795:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4796:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4796:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4797:1: RULE_INT
            {
             before(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationTargetSdk__TargetSdkAssignment_19683); 
             after(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ApplicationTargetSdk__TargetSdkAssignment_1"


    // $ANTLR start "rule__ApplicationCompileSdk__CompileSdkAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4806:1: rule__ApplicationCompileSdk__CompileSdkAssignment_1 : ( RULE_INT ) ;
    public final void rule__ApplicationCompileSdk__CompileSdkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4810:1: ( ( RULE_INT ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4811:1: ( RULE_INT )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4811:1: ( RULE_INT )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4812:1: RULE_INT
            {
             before(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ApplicationCompileSdk__CompileSdkAssignment_19714); 
             after(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ApplicationCompileSdk__CompileSdkAssignment_1"


    // $ANTLR start "rule__ApplicationPermissionList__PermissionsAssignment_2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4821:1: rule__ApplicationPermissionList__PermissionsAssignment_2 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4825:1: ( ( rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4826:1: ( rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4826:1: ( rulePermission )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4827:1: rulePermission
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_29745);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__PermissionsAssignment_2"


    // $ANTLR start "rule__ApplicationPermissionList__PermissionsAssignment_3_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4836:1: rule__ApplicationPermissionList__PermissionsAssignment_3_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4840:1: ( ( rulePermission ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4841:1: ( rulePermission )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4841:1: ( rulePermission )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4842:1: rulePermission
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_3_19776);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ApplicationPermissionList__PermissionsAssignment_3_1"


    // $ANTLR start "rule__ApplicationElementList__ElementsAssignment_2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4851:1: rule__ApplicationElementList__ElementsAssignment_2 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4855:1: ( ( ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4856:1: ( ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4856:1: ( ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4857:1: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_29807);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ApplicationElementList__ElementsAssignment_2"


    // $ANTLR start "rule__ApplicationElementList__ElementsAssignment_3_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4866:1: rule__ApplicationElementList__ElementsAssignment_3_1 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4870:1: ( ( ruleApplicationElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4871:1: ( ruleApplicationElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4871:1: ( ruleApplicationElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4872:1: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_3_19838);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ApplicationElementList__ElementsAssignment_3_1"


    // $ANTLR start "rule__ApplicationMainActivity__LauncherActivityAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4881:1: rule__ApplicationMainActivity__LauncherActivityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationMainActivity__LauncherActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4885:1: ( ( ( RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4886:1: ( ( RULE_ID ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4886:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4887:1: ( RULE_ID )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4888:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4889:1: RULE_ID
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationMainActivity__LauncherActivityAssignment_19873); 
             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0()); 

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
    // $ANTLR end "rule__ApplicationMainActivity__LauncherActivityAssignment_1"


    // $ANTLR start "rule__Permission__NameAssignment"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4900:1: rule__Permission__NameAssignment : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Permission__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4904:1: ( ( RULE_PACKAGE_NAME ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4905:1: ( RULE_PACKAGE_NAME )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4905:1: ( RULE_PACKAGE_NAME )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4906:1: RULE_PACKAGE_NAME
            {
             before(grammarAccess.getPermissionAccess().getNamePACKAGE_NAMETerminalRuleCall_0()); 
            match(input,RULE_PACKAGE_NAME,FOLLOW_RULE_PACKAGE_NAME_in_rule__Permission__NameAssignment9908); 
             after(grammarAccess.getPermissionAccess().getNamePACKAGE_NAMETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Permission__NameAssignment"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4915:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4919:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4920:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4920:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4921:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_19939); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4930:1: rule__Activity__AttributesAssignment_3 : ( ruleActivityAttribute ) ;
    public final void rule__Activity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4934:1: ( ( ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4935:1: ( ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4935:1: ( ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4936:1: ruleActivityAttribute
            {
             before(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_39970);
            ruleActivityAttribute();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Activity__AttributesAssignment_3"


    // $ANTLR start "rule__Activity__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4945:1: rule__Activity__AttributesAssignment_4_1 : ( ruleActivityAttribute ) ;
    public final void rule__Activity__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4949:1: ( ( ruleActivityAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4950:1: ( ruleActivityAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4950:1: ( ruleActivityAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4951:1: ruleActivityAttribute
            {
             before(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_4_110001);
            ruleActivityAttribute();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Activity__AttributesAssignment_4_1"


    // $ANTLR start "rule__BroadcastReceiver__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4960:1: rule__BroadcastReceiver__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BroadcastReceiver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4964:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4965:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4965:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4966:1: RULE_ID
            {
             before(grammarAccess.getBroadcastReceiverAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BroadcastReceiver__NameAssignment_110032); 
             after(grammarAccess.getBroadcastReceiverAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BroadcastReceiver__NameAssignment_1"


    // $ANTLR start "rule__BroadcastReceiver__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4975:1: rule__BroadcastReceiver__AttributesAssignment_3 : ( ruleBroadcastReceiverAttribute ) ;
    public final void rule__BroadcastReceiver__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4979:1: ( ( ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4980:1: ( ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4980:1: ( ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4981:1: ruleBroadcastReceiverAttribute
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_310063);
            ruleBroadcastReceiverAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BroadcastReceiver__AttributesAssignment_3"


    // $ANTLR start "rule__BroadcastReceiver__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4990:1: rule__BroadcastReceiver__AttributesAssignment_4_1 : ( ruleBroadcastReceiverAttribute ) ;
    public final void rule__BroadcastReceiver__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4994:1: ( ( ruleBroadcastReceiverAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4995:1: ( ruleBroadcastReceiverAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4995:1: ( ruleBroadcastReceiverAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:4996:1: ruleBroadcastReceiverAttribute
            {
             before(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_4_110094);
            ruleBroadcastReceiverAttribute();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__BroadcastReceiver__AttributesAssignment_4_1"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5005:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5009:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5010:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5010:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5011:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_110125); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5020:1: rule__Service__AttributesAssignment_3 : ( ruleServiceAttribute ) ;
    public final void rule__Service__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5024:1: ( ( ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5025:1: ( ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5025:1: ( ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5026:1: ruleServiceAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_310156);
            ruleServiceAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Service__AttributesAssignment_3"


    // $ANTLR start "rule__Service__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5035:1: rule__Service__AttributesAssignment_4_1 : ( ruleServiceAttribute ) ;
    public final void rule__Service__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5039:1: ( ( ruleServiceAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5040:1: ( ruleServiceAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5040:1: ( ruleServiceAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5041:1: ruleServiceAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_4_110187);
            ruleServiceAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Service__AttributesAssignment_4_1"


    // $ANTLR start "rule__ElementEnabledAttribute__EnabledAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5050:1: rule__ElementEnabledAttribute__EnabledAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__ElementEnabledAttribute__EnabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5054:1: ( ( RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5055:1: ( RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5055:1: ( RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5056:1: RULE_BOOLEAN
            {
             before(grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ElementEnabledAttribute__EnabledAssignment_110218); 
             after(grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ElementEnabledAttribute__EnabledAssignment_1"


    // $ANTLR start "rule__ElementExportedAttribute__ExportedAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5065:1: rule__ElementExportedAttribute__ExportedAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__ElementExportedAttribute__ExportedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5069:1: ( ( RULE_BOOLEAN ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5070:1: ( RULE_BOOLEAN )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5070:1: ( RULE_BOOLEAN )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5071:1: RULE_BOOLEAN
            {
             before(grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ElementExportedAttribute__ExportedAssignment_110249); 
             after(grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ElementExportedAttribute__ExportedAssignment_1"


    // $ANTLR start "rule__ElementLabelAttribute__TitleAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5080:1: rule__ElementLabelAttribute__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ElementLabelAttribute__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5084:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5085:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5085:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5086:1: RULE_STRING
            {
             before(grammarAccess.getElementLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ElementLabelAttribute__TitleAssignment_110280); 
             after(grammarAccess.getElementLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ElementLabelAttribute__TitleAssignment_1"


    // $ANTLR start "rule__ElementIntentList__IntentsAssignment_2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5095:1: rule__ElementIntentList__IntentsAssignment_2 : ( ruleIntent ) ;
    public final void rule__ElementIntentList__IntentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5099:1: ( ( ruleIntent ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5100:1: ( ruleIntent )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5100:1: ( ruleIntent )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5101:1: ruleIntent
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_210311);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ElementIntentList__IntentsAssignment_2"


    // $ANTLR start "rule__ElementIntentList__IntentsAssignment_3_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5110:1: rule__ElementIntentList__IntentsAssignment_3_1 : ( ruleIntent ) ;
    public final void rule__ElementIntentList__IntentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5114:1: ( ( ruleIntent ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5115:1: ( ruleIntent )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5115:1: ( ruleIntent )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5116:1: ruleIntent
            {
             before(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_3_110342);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getElementIntentListAccess().getIntentsIntentParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ElementIntentList__IntentsAssignment_3_1"


    // $ANTLR start "rule__Intent__NameAssignment"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5125:1: rule__Intent__NameAssignment : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Intent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5129:1: ( ( RULE_PACKAGE_NAME ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5130:1: ( RULE_PACKAGE_NAME )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5130:1: ( RULE_PACKAGE_NAME )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5131:1: RULE_PACKAGE_NAME
            {
             before(grammarAccess.getIntentAccess().getNamePACKAGE_NAMETerminalRuleCall_0()); 
            match(input,RULE_PACKAGE_NAME,FOLLOW_RULE_PACKAGE_NAME_in_rule__Intent__NameAssignment10373); 
             after(grammarAccess.getIntentAccess().getNamePACKAGE_NAMETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Intent__NameAssignment"


    // $ANTLR start "rule__ActivityParentAttribute__ParentAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5140:1: rule__ActivityParentAttribute__ParentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActivityParentAttribute__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5144:1: ( ( ( RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5145:1: ( ( RULE_ID ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5145:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5146:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentActivityCrossReference_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5147:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5148:1: RULE_ID
            {
             before(grammarAccess.getActivityParentAttributeAccess().getParentActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityParentAttribute__ParentAssignment_110408); 
             after(grammarAccess.getActivityParentAttributeAccess().getParentActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActivityParentAttributeAccess().getParentActivityCrossReference_1_0()); 

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
    // $ANTLR end "rule__ActivityParentAttribute__ParentAssignment_1"


    // $ANTLR start "rule__ActivityLayoutAttribute__LayoutElementsAssignment_2"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5159:1: rule__ActivityLayoutAttribute__LayoutElementsAssignment_2 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttribute__LayoutElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5163:1: ( ( ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5164:1: ( ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5164:1: ( ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5165:1: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_210443);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__LayoutElementsAssignment_2"


    // $ANTLR start "rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5174:1: rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5178:1: ( ( ruleLayoutElement ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5179:1: ( ruleLayoutElement )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5179:1: ( ruleLayoutElement )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5180:1: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_110474);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsLayoutElementParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5189:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5193:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5194:1: ( RULE_ID )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5194:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5195:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__NameAssignment_110505); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Button__NameAssignment_1"


    // $ANTLR start "rule__Button__AttributesAssignment_3"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5204:1: rule__Button__AttributesAssignment_3 : ( ruleButtonAttribute ) ;
    public final void rule__Button__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5208:1: ( ( ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5209:1: ( ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5209:1: ( ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5210:1: ruleButtonAttribute
            {
             before(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_310536);
            ruleButtonAttribute();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Button__AttributesAssignment_3"


    // $ANTLR start "rule__Button__AttributesAssignment_4_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5219:1: rule__Button__AttributesAssignment_4_1 : ( ruleButtonAttribute ) ;
    public final void rule__Button__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5223:1: ( ( ruleButtonAttribute ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5224:1: ( ruleButtonAttribute )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5224:1: ( ruleButtonAttribute )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5225:1: ruleButtonAttribute
            {
             before(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_4_110567);
            ruleButtonAttribute();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getAttributesButtonAttributeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Button__AttributesAssignment_4_1"


    // $ANTLR start "rule__ButtonLabelAttribute__TitleAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5234:1: rule__ButtonLabelAttribute__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ButtonLabelAttribute__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5238:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5239:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5239:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5240:1: RULE_STRING
            {
             before(grammarAccess.getButtonLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ButtonLabelAttribute__TitleAssignment_110598); 
             after(grammarAccess.getButtonLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ButtonLabelAttribute__TitleAssignment_1"


    // $ANTLR start "rule__ButtonActionAttribute__ActionAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5249:1: rule__ButtonActionAttribute__ActionAssignment_1 : ( ruleLayoutElementClickAction ) ;
    public final void rule__ButtonActionAttribute__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5253:1: ( ( ruleLayoutElementClickAction ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5254:1: ( ruleLayoutElementClickAction )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5254:1: ( ruleLayoutElementClickAction )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5255:1: ruleLayoutElementClickAction
            {
             before(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLayoutElementClickAction_in_rule__ButtonActionAttribute__ActionAssignment_110629);
            ruleLayoutElementClickAction();

            state._fsp--;

             after(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ButtonActionAttribute__ActionAssignment_1"


    // $ANTLR start "rule__Text__TextAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5264:1: rule__Text__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5268:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5269:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5269:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5270:1: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Text__TextAssignment_110660); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Text__TextAssignment_1"


    // $ANTLR start "rule__BroadcastReceiverActionAttribute__ActionAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5279:1: rule__BroadcastReceiverActionAttribute__ActionAssignment_1 : ( ruleBroadcastReceiverAction ) ;
    public final void rule__BroadcastReceiverActionAttribute__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5283:1: ( ( ruleBroadcastReceiverAction ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5284:1: ( ruleBroadcastReceiverAction )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5284:1: ( ruleBroadcastReceiverAction )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5285:1: ruleBroadcastReceiverAction
            {
             before(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBroadcastReceiverAction_in_rule__BroadcastReceiverActionAttribute__ActionAssignment_110691);
            ruleBroadcastReceiverAction();

            state._fsp--;

             after(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BroadcastReceiverActionAttribute__ActionAssignment_1"


    // $ANTLR start "rule__ActionShowToast__ToastTextAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5294:1: rule__ActionShowToast__ToastTextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ActionShowToast__ToastTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5298:1: ( ( RULE_STRING ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5299:1: ( RULE_STRING )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5299:1: ( RULE_STRING )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5300:1: RULE_STRING
            {
             before(grammarAccess.getActionShowToastAccess().getToastTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActionShowToast__ToastTextAssignment_110722); 
             after(grammarAccess.getActionShowToastAccess().getToastTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ActionShowToast__ToastTextAssignment_1"


    // $ANTLR start "rule__ActionStartActivity__ActivityAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5309:1: rule__ActionStartActivity__ActivityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionStartActivity__ActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5313:1: ( ( ( RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5314:1: ( ( RULE_ID ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5314:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5315:1: ( RULE_ID )
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityActivityCrossReference_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5316:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5317:1: RULE_ID
            {
             before(grammarAccess.getActionStartActivityAccess().getActivityActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionStartActivity__ActivityAssignment_110757); 
             after(grammarAccess.getActionStartActivityAccess().getActivityActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActionStartActivityAccess().getActivityActivityCrossReference_1_0()); 

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
    // $ANTLR end "rule__ActionStartActivity__ActivityAssignment_1"


    // $ANTLR start "rule__ActionStartService__ServiceAssignment_1"
    // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5328:1: rule__ActionStartService__ServiceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionStartService__ServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5332:1: ( ( ( RULE_ID ) ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5333:1: ( ( RULE_ID ) )
            {
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5333:1: ( ( RULE_ID ) )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5334:1: ( RULE_ID )
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceServiceCrossReference_1_0()); 
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5335:1: ( RULE_ID )
            // ../at.fhj.gaar.androidapp.dsl.ui/src-gen/at/fhj/gaar/androidapp/ui/contentassist/antlr/internal/InternalAppDsl.g:5336:1: RULE_ID
            {
             before(grammarAccess.getActionStartServiceAccess().getServiceServiceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionStartService__ServiceAssignment_110796); 
             after(grammarAccess.getActionStartServiceAccess().getServiceServiceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActionStartServiceAccess().getServiceServiceCrossReference_1_0()); 

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
    // $ANTLR end "rule__ActionStartService__ServiceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAndroidAppProject_in_entryRuleAndroidAppProject61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidAppProject68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__0_in_ruleAndroidAppProject94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_entryRuleApplicationAttribute181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationAttribute188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationAttribute__Alternatives_in_ruleApplicationAttribute214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_entryRuleApplicationMinSdk241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMinSdk248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__0_in_ruleApplicationMinSdk274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_entryRuleApplicationTargetSdk301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationTargetSdk308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__0_in_ruleApplicationTargetSdk334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_entryRuleApplicationCompileSdk361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationCompileSdk368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__0_in_ruleApplicationCompileSdk394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_entryRuleApplicationPermissionList421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationPermissionList428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__0_in_ruleApplicationPermissionList454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_entryRuleApplicationElementList481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElementList488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__0_in_ruleApplicationElementList514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_entryRuleApplicationMainActivity541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationMainActivity548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__0_in_ruleApplicationMainActivity574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__NameAssignment_in_rulePermission634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_entryRuleApplicationElement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationElement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElement__Alternatives_in_ruleApplicationElement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_entryRuleBroadcastReceiver781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiver788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__0_in_ruleBroadcastReceiver814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_entryRuleActivityAttribute901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityAttribute908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityAttribute__Alternatives_in_ruleActivityAttribute934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_entryRuleBroadcastReceiverAttribute961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAttribute968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverAttribute__Alternatives_in_ruleBroadcastReceiverAttribute994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_entryRuleServiceAttribute1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceAttribute1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceAttribute__Alternatives_in_ruleServiceAttribute1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_entryRuleElementEnabledAttribute1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementEnabledAttribute1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__0_in_ruleElementEnabledAttribute1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_entryRuleElementExportedAttribute1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementExportedAttribute1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__0_in_ruleElementExportedAttribute1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_entryRuleElementLabelAttribute1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLabelAttribute1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__0_in_ruleElementLabelAttribute1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_entryRuleElementIntentList1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementIntentList1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__0_in_ruleElementIntentList1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__NameAssignment_in_ruleIntent1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_entryRuleActivityParentAttribute1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityParentAttribute1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__0_in_ruleActivityParentAttribute1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_entryRuleActivityLayoutAttribute1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityLayoutAttribute1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__0_in_ruleActivityLayoutAttribute1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElement1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayoutElement__Alternatives_in_ruleLayoutElement1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_entryRuleButtonAttribute1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonAttribute1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonAttribute__Alternatives_in_ruleButtonAttribute1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_entryRuleButtonLabelAttribute1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonLabelAttribute1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__0_in_ruleButtonLabelAttribute1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_entryRuleButtonActionAttribute1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonActionAttribute1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__0_in_ruleButtonActionAttribute1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_entryRuleSpacer1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpacer1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spacer__Group__0_in_ruleSpacer1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__0_in_ruleText1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_entryRuleLayoutElementClickAction1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElementClickAction1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayoutElementClickAction__Alternatives_in_ruleLayoutElementClickAction1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_entryRuleBroadcastReceiverActionAttribute1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverActionAttribute1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0_in_ruleBroadcastReceiverActionAttribute2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_entryRuleBroadcastReceiverAction2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBroadcastReceiverAction2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverAction__Alternatives_in_ruleBroadcastReceiverAction2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_entryRuleActionShowToast2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionShowToast2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__0_in_ruleActionShowToast2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_entryRuleActionStartActivity2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartActivity2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__0_in_ruleActionStartActivity2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_entryRuleActionStartService2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStartService2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__0_in_ruleActionStartService2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ApplicationAttribute__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMinSdk_in_rule__ApplicationAttribute__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationTargetSdk_in_rule__ApplicationAttribute__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationCompileSdk_in_rule__ApplicationAttribute__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationPermissionList_in_rule__ApplicationAttribute__Alternatives2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElementList_in_rule__ApplicationAttribute__Alternatives2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationMainActivity_in_rule__ApplicationAttribute__Alternatives2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__ApplicationElement__Alternatives2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiver_in_rule__ApplicationElement__Alternatives2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__ApplicationElement__Alternatives2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__ActivityAttribute__Alternatives2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__ActivityAttribute__Alternatives2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ActivityAttribute__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__ActivityAttribute__Alternatives2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityParentAttribute_in_rule__ActivityAttribute__Alternatives2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityLayoutAttribute_in_rule__ActivityAttribute__Alternatives2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__BroadcastReceiverAttribute__Alternatives2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverActionAttribute_in_rule__BroadcastReceiverAttribute__Alternatives2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementEnabledAttribute_in_rule__ServiceAttribute__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementExportedAttribute_in_rule__ServiceAttribute__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLabelAttribute_in_rule__ServiceAttribute__Alternatives2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementIntentList_in_rule__ServiceAttribute__Alternatives2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__LayoutElement__Alternatives2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpacer_in_rule__LayoutElement__Alternatives2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__LayoutElement__Alternatives2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonLabelAttribute_in_rule__ButtonAttribute__Alternatives2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonActionAttribute_in_rule__ButtonAttribute__Alternatives2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_rule__LayoutElementClickAction__Alternatives2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_rule__LayoutElementClickAction__Alternatives2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_rule__LayoutElementClickAction__Alternatives2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionShowToast_in_rule__BroadcastReceiverAction__Alternatives2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartActivity_in_rule__BroadcastReceiverAction__Alternatives2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStartService_in_rule__BroadcastReceiverAction__Alternatives3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__0__Impl_in_rule__AndroidAppProject__Group__03035 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__1_in_rule__AndroidAppProject__Group__03038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_0_in_rule__AndroidAppProject__Group__0__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group__1__Impl_in_rule__AndroidAppProject__Group__13095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__0_in_rule__AndroidAppProject__Group__1__Impl3122 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__0__Impl_in_rule__AndroidAppProject__Group_1__03157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__1_in_rule__AndroidAppProject__Group_1__03160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AndroidAppProject__Group_1__0__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__Group_1__1__Impl_in_rule__AndroidAppProject__Group_1__13219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidAppProject__ApplicationsAssignment_1_1_in_rule__AndroidAppProject__Group_1__1__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__03280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Application__Group__0__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__13342 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__23402 = new BitSet(new long[]{0x00000000419E0000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Application__Group__2__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__33464 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AttributesAssignment_3_in_rule__Application__Group__3__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__43524 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl3554 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__53585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Application__Group__5__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__03656 = new BitSet(new long[]{0x00000000419E0000L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group_4__0__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AttributesAssignment_4_1_in_rule__Application__Group_4__1__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__0__Impl_in_rule__ApplicationMinSdk__Group__03779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__1_in_rule__ApplicationMinSdk__Group__03782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ApplicationMinSdk__Group__0__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__Group__1__Impl_in_rule__ApplicationMinSdk__Group__13841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMinSdk__MinSdkAssignment_1_in_rule__ApplicationMinSdk__Group__1__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__0__Impl_in_rule__ApplicationTargetSdk__Group__03902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__1_in_rule__ApplicationTargetSdk__Group__03905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ApplicationTargetSdk__Group__0__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__Group__1__Impl_in_rule__ApplicationTargetSdk__Group__13964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationTargetSdk__TargetSdkAssignment_1_in_rule__ApplicationTargetSdk__Group__1__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__0__Impl_in_rule__ApplicationCompileSdk__Group__04025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__1_in_rule__ApplicationCompileSdk__Group__04028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ApplicationCompileSdk__Group__0__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__Group__1__Impl_in_rule__ApplicationCompileSdk__Group__14087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationCompileSdk__CompileSdkAssignment_1_in_rule__ApplicationCompileSdk__Group__1__Impl4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__0__Impl_in_rule__ApplicationPermissionList__Group__04148 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__1_in_rule__ApplicationPermissionList__Group__04151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ApplicationPermissionList__Group__0__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__1__Impl_in_rule__ApplicationPermissionList__Group__14210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__2_in_rule__ApplicationPermissionList__Group__14213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ApplicationPermissionList__Group__1__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__2__Impl_in_rule__ApplicationPermissionList__Group__24272 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__3_in_rule__ApplicationPermissionList__Group__24275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_2_in_rule__ApplicationPermissionList__Group__2__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__3__Impl_in_rule__ApplicationPermissionList__Group__34332 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__4_in_rule__ApplicationPermissionList__Group__34335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__0_in_rule__ApplicationPermissionList__Group__3__Impl4362 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group__4__Impl_in_rule__ApplicationPermissionList__Group__44393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ApplicationPermissionList__Group__4__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__0__Impl_in_rule__ApplicationPermissionList__Group_3__04462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__1_in_rule__ApplicationPermissionList__Group_3__04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ApplicationPermissionList__Group_3__0__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__Group_3__1__Impl_in_rule__ApplicationPermissionList__Group_3__14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationPermissionList__PermissionsAssignment_3_1_in_rule__ApplicationPermissionList__Group_3__1__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__0__Impl_in_rule__ApplicationElementList__Group__04585 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__1_in_rule__ApplicationElementList__Group__04588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ApplicationElementList__Group__0__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__1__Impl_in_rule__ApplicationElementList__Group__14647 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__2_in_rule__ApplicationElementList__Group__14650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ApplicationElementList__Group__1__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__2__Impl_in_rule__ApplicationElementList__Group__24709 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__3_in_rule__ApplicationElementList__Group__24712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__ElementsAssignment_2_in_rule__ApplicationElementList__Group__2__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__3__Impl_in_rule__ApplicationElementList__Group__34769 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__4_in_rule__ApplicationElementList__Group__34772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__0_in_rule__ApplicationElementList__Group__3__Impl4799 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group__4__Impl_in_rule__ApplicationElementList__Group__44830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ApplicationElementList__Group__4__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__0__Impl_in_rule__ApplicationElementList__Group_3__04899 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__1_in_rule__ApplicationElementList__Group_3__04902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ApplicationElementList__Group_3__0__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__Group_3__1__Impl_in_rule__ApplicationElementList__Group_3__14961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationElementList__ElementsAssignment_3_1_in_rule__ApplicationElementList__Group_3__1__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__0__Impl_in_rule__ApplicationMainActivity__Group__05022 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__1_in_rule__ApplicationMainActivity__Group__05025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ApplicationMainActivity__Group__0__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__Group__1__Impl_in_rule__ApplicationMainActivity__Group__15084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationMainActivity__LauncherActivityAssignment_1_in_rule__ApplicationMainActivity__Group__1__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__05145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__05148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group__0__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__15207 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__15210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__25267 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__25270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activity__Group__2__Impl5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__35329 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__35332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AttributesAssignment_3_in_rule__Activity__Group__3__Impl5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__45389 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__45392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl5419 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__55450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Activity__Group__5__Impl5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__05521 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__05524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Activity__Group_4__0__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__15583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AttributesAssignment_4_1_in_rule__Activity__Group_4__1__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__0__Impl_in_rule__BroadcastReceiver__Group__05644 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__1_in_rule__BroadcastReceiver__Group__05647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BroadcastReceiver__Group__0__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__1__Impl_in_rule__BroadcastReceiver__Group__15706 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__2_in_rule__BroadcastReceiver__Group__15709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__NameAssignment_1_in_rule__BroadcastReceiver__Group__1__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__2__Impl_in_rule__BroadcastReceiver__Group__25766 = new BitSet(new long[]{0x00000008F0000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__3_in_rule__BroadcastReceiver__Group__25769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BroadcastReceiver__Group__2__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__3__Impl_in_rule__BroadcastReceiver__Group__35828 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__4_in_rule__BroadcastReceiver__Group__35831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__AttributesAssignment_3_in_rule__BroadcastReceiver__Group__3__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__4__Impl_in_rule__BroadcastReceiver__Group__45888 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__5_in_rule__BroadcastReceiver__Group__45891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__0_in_rule__BroadcastReceiver__Group__4__Impl5918 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group__5__Impl_in_rule__BroadcastReceiver__Group__55949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BroadcastReceiver__Group__5__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__0__Impl_in_rule__BroadcastReceiver__Group_4__06020 = new BitSet(new long[]{0x00000008F0000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__1_in_rule__BroadcastReceiver__Group_4__06023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BroadcastReceiver__Group_4__0__Impl6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__Group_4__1__Impl_in_rule__BroadcastReceiver__Group_4__16082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiver__AttributesAssignment_4_1_in_rule__BroadcastReceiver__Group_4__1__Impl6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06143 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Service__Group__0__Impl6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16205 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26265 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Service__Group__2__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36327 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_3_in_rule__Service__Group__3__Impl6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46387 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl6417 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Service__Group__5__Impl6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__06519 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__06522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Service__Group_4__0__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__16581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_4_1_in_rule__Service__Group_4__1__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__0__Impl_in_rule__ElementEnabledAttribute__Group__06642 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__1_in_rule__ElementEnabledAttribute__Group__06645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ElementEnabledAttribute__Group__0__Impl6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__Group__1__Impl_in_rule__ElementEnabledAttribute__Group__16704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementEnabledAttribute__EnabledAssignment_1_in_rule__ElementEnabledAttribute__Group__1__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__0__Impl_in_rule__ElementExportedAttribute__Group__06765 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__1_in_rule__ElementExportedAttribute__Group__06768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ElementExportedAttribute__Group__0__Impl6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__Group__1__Impl_in_rule__ElementExportedAttribute__Group__16827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementExportedAttribute__ExportedAssignment_1_in_rule__ElementExportedAttribute__Group__1__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__0__Impl_in_rule__ElementLabelAttribute__Group__06888 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__1_in_rule__ElementLabelAttribute__Group__06891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ElementLabelAttribute__Group__0__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__Group__1__Impl_in_rule__ElementLabelAttribute__Group__16950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementLabelAttribute__TitleAssignment_1_in_rule__ElementLabelAttribute__Group__1__Impl6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__0__Impl_in_rule__ElementIntentList__Group__07011 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__1_in_rule__ElementIntentList__Group__07014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ElementIntentList__Group__0__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__1__Impl_in_rule__ElementIntentList__Group__17073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__2_in_rule__ElementIntentList__Group__17076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ElementIntentList__Group__1__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__2__Impl_in_rule__ElementIntentList__Group__27135 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__3_in_rule__ElementIntentList__Group__27138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__IntentsAssignment_2_in_rule__ElementIntentList__Group__2__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__3__Impl_in_rule__ElementIntentList__Group__37195 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__4_in_rule__ElementIntentList__Group__37198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__0_in_rule__ElementIntentList__Group__3__Impl7225 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group__4__Impl_in_rule__ElementIntentList__Group__47256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ElementIntentList__Group__4__Impl7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__0__Impl_in_rule__ElementIntentList__Group_3__07325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__1_in_rule__ElementIntentList__Group_3__07328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ElementIntentList__Group_3__0__Impl7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__Group_3__1__Impl_in_rule__ElementIntentList__Group_3__17387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementIntentList__IntentsAssignment_3_1_in_rule__ElementIntentList__Group_3__1__Impl7414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__0__Impl_in_rule__ActivityParentAttribute__Group__07448 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__1_in_rule__ActivityParentAttribute__Group__07451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ActivityParentAttribute__Group__0__Impl7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__Group__1__Impl_in_rule__ActivityParentAttribute__Group__17510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityParentAttribute__ParentAssignment_1_in_rule__ActivityParentAttribute__Group__1__Impl7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__0__Impl_in_rule__ActivityLayoutAttribute__Group__07571 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__1_in_rule__ActivityLayoutAttribute__Group__07574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ActivityLayoutAttribute__Group__0__Impl7602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__1__Impl_in_rule__ActivityLayoutAttribute__Group__17633 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__2_in_rule__ActivityLayoutAttribute__Group__17636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ActivityLayoutAttribute__Group__1__Impl7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__2__Impl_in_rule__ActivityLayoutAttribute__Group__27695 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__3_in_rule__ActivityLayoutAttribute__Group__27698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_2_in_rule__ActivityLayoutAttribute__Group__2__Impl7725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__3__Impl_in_rule__ActivityLayoutAttribute__Group__37755 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__4_in_rule__ActivityLayoutAttribute__Group__37758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__0_in_rule__ActivityLayoutAttribute__Group__3__Impl7785 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group__4__Impl_in_rule__ActivityLayoutAttribute__Group__47816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ActivityLayoutAttribute__Group__4__Impl7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__0__Impl_in_rule__ActivityLayoutAttribute__Group_3__07885 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__1_in_rule__ActivityLayoutAttribute__Group_3__07888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ActivityLayoutAttribute__Group_3__0__Impl7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__Group_3__1__Impl_in_rule__ActivityLayoutAttribute__Group_3__17947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1_in_rule__ActivityLayoutAttribute__Group_3__1__Impl7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__08008 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__08011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Button__Group__0__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__18070 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Button__Group__2_in_rule__Button__Group__18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28130 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Button__Group__2__Impl8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38192 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__AttributesAssignment_3_in_rule__Button__Group__3__Impl8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48252 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__0_in_rule__Button__Group__4__Impl8282 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Button__Group__5__Impl8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__0__Impl_in_rule__Button__Group_4__08384 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Button__Group_4__1_in_rule__Button__Group_4__08387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Button__Group_4__0__Impl8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_4__1__Impl_in_rule__Button__Group_4__18446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__AttributesAssignment_4_1_in_rule__Button__Group_4__1__Impl8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__0__Impl_in_rule__ButtonLabelAttribute__Group__08507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__1_in_rule__ButtonLabelAttribute__Group__08510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ButtonLabelAttribute__Group__0__Impl8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__Group__1__Impl_in_rule__ButtonLabelAttribute__Group__18569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonLabelAttribute__TitleAssignment_1_in_rule__ButtonLabelAttribute__Group__1__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__0__Impl_in_rule__ButtonActionAttribute__Group__08630 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__1_in_rule__ButtonActionAttribute__Group__08633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ButtonActionAttribute__Group__0__Impl8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__Group__1__Impl_in_rule__ButtonActionAttribute__Group__18692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonActionAttribute__ActionAssignment_1_in_rule__ButtonActionAttribute__Group__1__Impl8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spacer__Group__0__Impl_in_rule__Spacer__Group__08753 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Spacer__Group__1_in_rule__Spacer__Group__08756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spacer__Group__1__Impl_in_rule__Spacer__Group__18814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Spacer__Group__1__Impl8842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__08877 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Text__Group__1_in_rule__Text__Group__08880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Text__Group__0__Impl8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__18939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__TextAssignment_1_in_rule__Text__Group__1__Impl8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__0__Impl_in_rule__BroadcastReceiverActionAttribute__Group__09000 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1_in_rule__BroadcastReceiverActionAttribute__Group__09003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BroadcastReceiverActionAttribute__Group__0__Impl9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__Group__1__Impl_in_rule__BroadcastReceiverActionAttribute__Group__19062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BroadcastReceiverActionAttribute__ActionAssignment_1_in_rule__BroadcastReceiverActionAttribute__Group__1__Impl9089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__0__Impl_in_rule__ActionShowToast__Group__09123 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__1_in_rule__ActionShowToast__Group__09126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ActionShowToast__Group__0__Impl9154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__Group__1__Impl_in_rule__ActionShowToast__Group__19185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionShowToast__ToastTextAssignment_1_in_rule__ActionShowToast__Group__1__Impl9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__0__Impl_in_rule__ActionStartActivity__Group__09246 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__1_in_rule__ActionStartActivity__Group__09249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ActionStartActivity__Group__0__Impl9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__Group__1__Impl_in_rule__ActionStartActivity__Group__19308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartActivity__ActivityAssignment_1_in_rule__ActionStartActivity__Group__1__Impl9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__0__Impl_in_rule__ActionStartService__Group__09369 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__1_in_rule__ActionStartService__Group__09372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ActionStartService__Group__0__Impl9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__Group__1__Impl_in_rule__ActionStartService__Group__19431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionStartService__ServiceAssignment_1_in_rule__ActionStartService__Group__1__Impl9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_09497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidAppProject__ApplicationsAssignment_1_19528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_NAME_in_rule__Application__NameAssignment_19559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_39590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationAttribute_in_rule__Application__AttributesAssignment_4_19621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationMinSdk__MinSdkAssignment_19652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationTargetSdk__TargetSdkAssignment_19683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ApplicationCompileSdk__CompileSdkAssignment_19714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_29745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__ApplicationPermissionList__PermissionsAssignment_3_19776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_29807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationElement_in_rule__ApplicationElementList__ElementsAssignment_3_19838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationMainActivity__LauncherActivityAssignment_19873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_NAME_in_rule__Permission__NameAssignment9908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_19939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_39970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityAttribute_in_rule__Activity__AttributesAssignment_4_110001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BroadcastReceiver__NameAssignment_110032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_310063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAttribute_in_rule__BroadcastReceiver__AttributesAssignment_4_110094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_110125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_310156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceAttribute_in_rule__Service__AttributesAssignment_4_110187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ElementEnabledAttribute__EnabledAssignment_110218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ElementExportedAttribute__ExportedAssignment_110249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ElementLabelAttribute__TitleAssignment_110280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_210311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__ElementIntentList__IntentsAssignment_3_110342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_NAME_in_rule__Intent__NameAssignment10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityParentAttribute__ParentAssignment_110408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_210443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElement_in_rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_110474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__NameAssignment_110505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_310536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAttribute_in_rule__Button__AttributesAssignment_4_110567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ButtonLabelAttribute__TitleAssignment_110598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayoutElementClickAction_in_rule__ButtonActionAttribute__ActionAssignment_110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Text__TextAssignment_110660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBroadcastReceiverAction_in_rule__BroadcastReceiverActionAttribute__ActionAssignment_110691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActionShowToast__ToastTextAssignment_110722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionStartActivity__ActivityAssignment_110757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionStartService__ServiceAssignment_110796 = new BitSet(new long[]{0x0000000000000002L});

}