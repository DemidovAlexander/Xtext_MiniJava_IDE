package demidov.projects.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import demidov.projects.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'&&'", "'class'", "'{'", "'}'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'extends'", "'int'", "';'", "','", "'return'", "'else'", "'boolean'", "'if'", "'while'", "'System.out.println'", "'='", "'<'", "'!'", "'.'", "'true'", "'false'", "'this'", "'new'", "'length'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMiniJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniJava.g"; }


    	private MiniJavaGrammarAccess grammarAccess;

    	public void setGrammarAccess(MiniJavaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalMiniJava.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMiniJava.g:54:1: ( ruleProgram EOF )
            // InternalMiniJava.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniJava.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMiniJava.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMiniJava.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMiniJava.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMiniJava.g:69:3: ( rule__Program__Group__0 )
            // InternalMiniJava.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMainClass"
    // InternalMiniJava.g:78:1: entryRuleMainClass : ruleMainClass EOF ;
    public final void entryRuleMainClass() throws RecognitionException {
        try {
            // InternalMiniJava.g:79:1: ( ruleMainClass EOF )
            // InternalMiniJava.g:80:1: ruleMainClass EOF
            {
             before(grammarAccess.getMainClassRule()); 
            pushFollow(FOLLOW_1);
            ruleMainClass();

            state._fsp--;

             after(grammarAccess.getMainClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMainClass"


    // $ANTLR start "ruleMainClass"
    // InternalMiniJava.g:87:1: ruleMainClass : ( ( rule__MainClass__Group__0 ) ) ;
    public final void ruleMainClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:91:2: ( ( ( rule__MainClass__Group__0 ) ) )
            // InternalMiniJava.g:92:2: ( ( rule__MainClass__Group__0 ) )
            {
            // InternalMiniJava.g:92:2: ( ( rule__MainClass__Group__0 ) )
            // InternalMiniJava.g:93:3: ( rule__MainClass__Group__0 )
            {
             before(grammarAccess.getMainClassAccess().getGroup()); 
            // InternalMiniJava.g:94:3: ( rule__MainClass__Group__0 )
            // InternalMiniJava.g:94:4: rule__MainClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainClass"


    // $ANTLR start "entryRuleMainMethod"
    // InternalMiniJava.g:103:1: entryRuleMainMethod : ruleMainMethod EOF ;
    public final void entryRuleMainMethod() throws RecognitionException {
        try {
            // InternalMiniJava.g:104:1: ( ruleMainMethod EOF )
            // InternalMiniJava.g:105:1: ruleMainMethod EOF
            {
             before(grammarAccess.getMainMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMainMethod();

            state._fsp--;

             after(grammarAccess.getMainMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMainMethod"


    // $ANTLR start "ruleMainMethod"
    // InternalMiniJava.g:112:1: ruleMainMethod : ( ( rule__MainMethod__Group__0 ) ) ;
    public final void ruleMainMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:116:2: ( ( ( rule__MainMethod__Group__0 ) ) )
            // InternalMiniJava.g:117:2: ( ( rule__MainMethod__Group__0 ) )
            {
            // InternalMiniJava.g:117:2: ( ( rule__MainMethod__Group__0 ) )
            // InternalMiniJava.g:118:3: ( rule__MainMethod__Group__0 )
            {
             before(grammarAccess.getMainMethodAccess().getGroup()); 
            // InternalMiniJava.g:119:3: ( rule__MainMethod__Group__0 )
            // InternalMiniJava.g:119:4: rule__MainMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainMethod"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalMiniJava.g:128:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:129:1: ( ruleClassDeclaration EOF )
            // InternalMiniJava.g:130:1: ruleClassDeclaration EOF
            {
             before(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalMiniJava.g:137:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:141:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:142:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:142:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalMiniJava.g:143:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalMiniJava.g:144:3: ( rule__ClassDeclaration__Group__0 )
            // InternalMiniJava.g:144:4: rule__ClassDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalMiniJava.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMiniJava.g:154:1: ( ruleType EOF )
            // InternalMiniJava.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMiniJava.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMiniJava.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMiniJava.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalMiniJava.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMiniJava.g:169:3: ( rule__Type__Alternatives )
            // InternalMiniJava.g:169:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalMiniJava.g:178:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:179:1: ( ruleVarDeclaration EOF )
            // InternalMiniJava.g:180:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalMiniJava.g:187:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:191:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:192:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:192:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalMiniJava.g:193:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalMiniJava.g:194:3: ( rule__VarDeclaration__Group__0 )
            // InternalMiniJava.g:194:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVariable"
    // InternalMiniJava.g:203:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMiniJava.g:204:1: ( ruleVariable EOF )
            // InternalMiniJava.g:205:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMiniJava.g:212:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:216:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMiniJava.g:217:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMiniJava.g:217:2: ( ( rule__Variable__Group__0 ) )
            // InternalMiniJava.g:218:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMiniJava.g:219:3: ( rule__Variable__Group__0 )
            // InternalMiniJava.g:219:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleMethodDeclaration"
    // InternalMiniJava.g:228:1: entryRuleMethodDeclaration : ruleMethodDeclaration EOF ;
    public final void entryRuleMethodDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:229:1: ( ruleMethodDeclaration EOF )
            // InternalMiniJava.g:230:1: ruleMethodDeclaration EOF
            {
             before(grammarAccess.getMethodDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodDeclaration"


    // $ANTLR start "ruleMethodDeclaration"
    // InternalMiniJava.g:237:1: ruleMethodDeclaration : ( ( rule__MethodDeclaration__Group__0 ) ) ;
    public final void ruleMethodDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:241:2: ( ( ( rule__MethodDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:242:2: ( ( rule__MethodDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:242:2: ( ( rule__MethodDeclaration__Group__0 ) )
            // InternalMiniJava.g:243:3: ( rule__MethodDeclaration__Group__0 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup()); 
            // InternalMiniJava.g:244:3: ( rule__MethodDeclaration__Group__0 )
            // InternalMiniJava.g:244:4: rule__MethodDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodDeclaration"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:253:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:254:1: ( ruleStatement EOF )
            // InternalMiniJava.g:255:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniJava.g:262:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:266:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMiniJava.g:267:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMiniJava.g:267:2: ( ( rule__Statement__Alternatives ) )
            // InternalMiniJava.g:268:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMiniJava.g:269:3: ( rule__Statement__Alternatives )
            // InternalMiniJava.g:269:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:279:1: ( ruleExpression EOF )
            // InternalMiniJava.g:280:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniJava.g:287:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:291:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMiniJava.g:292:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMiniJava.g:292:2: ( ( rule__Expression__Group__0 ) )
            // InternalMiniJava.g:293:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMiniJava.g:294:3: ( rule__Expression__Group__0 )
            // InternalMiniJava.g:294:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalMiniJava.g:303:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalMiniJava.g:304:1: ( ruleAddition EOF )
            // InternalMiniJava.g:305:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMiniJava.g:312:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:316:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalMiniJava.g:317:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalMiniJava.g:317:2: ( ( rule__Addition__Group__0 ) )
            // InternalMiniJava.g:318:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalMiniJava.g:319:3: ( rule__Addition__Group__0 )
            // InternalMiniJava.g:319:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMiniJava.g:328:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalMiniJava.g:329:1: ( ruleMultiplication EOF )
            // InternalMiniJava.g:330:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMiniJava.g:337:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:341:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalMiniJava.g:342:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalMiniJava.g:342:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalMiniJava.g:343:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalMiniJava.g:344:3: ( rule__Multiplication__Group__0 )
            // InternalMiniJava.g:344:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNegationOrPointExpression"
    // InternalMiniJava.g:353:1: entryRuleNegationOrPointExpression : ruleNegationOrPointExpression EOF ;
    public final void entryRuleNegationOrPointExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:354:1: ( ruleNegationOrPointExpression EOF )
            // InternalMiniJava.g:355:1: ruleNegationOrPointExpression EOF
            {
             before(grammarAccess.getNegationOrPointExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNegationOrPointExpression();

            state._fsp--;

             after(grammarAccess.getNegationOrPointExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegationOrPointExpression"


    // $ANTLR start "ruleNegationOrPointExpression"
    // InternalMiniJava.g:362:1: ruleNegationOrPointExpression : ( ( rule__NegationOrPointExpression__Alternatives ) ) ;
    public final void ruleNegationOrPointExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:366:2: ( ( ( rule__NegationOrPointExpression__Alternatives ) ) )
            // InternalMiniJava.g:367:2: ( ( rule__NegationOrPointExpression__Alternatives ) )
            {
            // InternalMiniJava.g:367:2: ( ( rule__NegationOrPointExpression__Alternatives ) )
            // InternalMiniJava.g:368:3: ( rule__NegationOrPointExpression__Alternatives )
            {
             before(grammarAccess.getNegationOrPointExpressionAccess().getAlternatives()); 
            // InternalMiniJava.g:369:3: ( rule__NegationOrPointExpression__Alternatives )
            // InternalMiniJava.g:369:4: rule__NegationOrPointExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NegationOrPointExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNegationOrPointExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegationOrPointExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalMiniJava.g:378:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalMiniJava.g:379:1: ( ruleNegation EOF )
            // InternalMiniJava.g:380:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMiniJava.g:387:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:391:2: ( ( ( rule__Negation__Group__0 ) ) )
            // InternalMiniJava.g:392:2: ( ( rule__Negation__Group__0 ) )
            {
            // InternalMiniJava.g:392:2: ( ( rule__Negation__Group__0 ) )
            // InternalMiniJava.g:393:3: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // InternalMiniJava.g:394:3: ( rule__Negation__Group__0 )
            // InternalMiniJava.g:394:4: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRulePoint"
    // InternalMiniJava.g:403:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalMiniJava.g:404:1: ( rulePoint EOF )
            // InternalMiniJava.g:405:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalMiniJava.g:412:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:416:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalMiniJava.g:417:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalMiniJava.g:417:2: ( ( rule__Point__Group__0 ) )
            // InternalMiniJava.g:418:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalMiniJava.g:419:3: ( rule__Point__Group__0 )
            // InternalMiniJava.g:419:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleSquareBrackets"
    // InternalMiniJava.g:428:1: entryRuleSquareBrackets : ruleSquareBrackets EOF ;
    public final void entryRuleSquareBrackets() throws RecognitionException {
        try {
            // InternalMiniJava.g:429:1: ( ruleSquareBrackets EOF )
            // InternalMiniJava.g:430:1: ruleSquareBrackets EOF
            {
             before(grammarAccess.getSquareBracketsRule()); 
            pushFollow(FOLLOW_1);
            ruleSquareBrackets();

            state._fsp--;

             after(grammarAccess.getSquareBracketsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSquareBrackets"


    // $ANTLR start "ruleSquareBrackets"
    // InternalMiniJava.g:437:1: ruleSquareBrackets : ( ( rule__SquareBrackets__Group__0 ) ) ;
    public final void ruleSquareBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:441:2: ( ( ( rule__SquareBrackets__Group__0 ) ) )
            // InternalMiniJava.g:442:2: ( ( rule__SquareBrackets__Group__0 ) )
            {
            // InternalMiniJava.g:442:2: ( ( rule__SquareBrackets__Group__0 ) )
            // InternalMiniJava.g:443:3: ( rule__SquareBrackets__Group__0 )
            {
             before(grammarAccess.getSquareBracketsAccess().getGroup()); 
            // InternalMiniJava.g:444:3: ( rule__SquareBrackets__Group__0 )
            // InternalMiniJava.g:444:4: rule__SquareBrackets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSquareBracketsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSquareBrackets"


    // $ANTLR start "entryRulePrimary"
    // InternalMiniJava.g:453:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMiniJava.g:454:1: ( rulePrimary EOF )
            // InternalMiniJava.g:455:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMiniJava.g:462:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:466:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMiniJava.g:467:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMiniJava.g:467:2: ( ( rule__Primary__Alternatives ) )
            // InternalMiniJava.g:468:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMiniJava.g:469:3: ( rule__Primary__Alternatives )
            // InternalMiniJava.g:469:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMethodCallExpr"
    // InternalMiniJava.g:478:1: entryRuleMethodCallExpr : ruleMethodCallExpr EOF ;
    public final void entryRuleMethodCallExpr() throws RecognitionException {
        try {
            // InternalMiniJava.g:479:1: ( ruleMethodCallExpr EOF )
            // InternalMiniJava.g:480:1: ruleMethodCallExpr EOF
            {
             before(grammarAccess.getMethodCallExprRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodCallExpr();

            state._fsp--;

             after(grammarAccess.getMethodCallExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodCallExpr"


    // $ANTLR start "ruleMethodCallExpr"
    // InternalMiniJava.g:487:1: ruleMethodCallExpr : ( ( rule__MethodCallExpr__Alternatives ) ) ;
    public final void ruleMethodCallExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:491:2: ( ( ( rule__MethodCallExpr__Alternatives ) ) )
            // InternalMiniJava.g:492:2: ( ( rule__MethodCallExpr__Alternatives ) )
            {
            // InternalMiniJava.g:492:2: ( ( rule__MethodCallExpr__Alternatives ) )
            // InternalMiniJava.g:493:3: ( rule__MethodCallExpr__Alternatives )
            {
             before(grammarAccess.getMethodCallExprAccess().getAlternatives()); 
            // InternalMiniJava.g:494:3: ( rule__MethodCallExpr__Alternatives )
            // InternalMiniJava.g:494:4: rule__MethodCallExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MethodCallExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodCallExpr"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMiniJava.g:503:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // InternalMiniJava.g:504:1: ( ruleMethodCall EOF )
            // InternalMiniJava.g:505:1: ruleMethodCall EOF
            {
             before(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getMethodCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMiniJava.g:512:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:516:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // InternalMiniJava.g:517:2: ( ( rule__MethodCall__Group__0 ) )
            {
            // InternalMiniJava.g:517:2: ( ( rule__MethodCall__Group__0 ) )
            // InternalMiniJava.g:518:3: ( rule__MethodCall__Group__0 )
            {
             before(grammarAccess.getMethodCallAccess().getGroup()); 
            // InternalMiniJava.g:519:3: ( rule__MethodCall__Group__0 )
            // InternalMiniJava.g:519:4: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleNumberValue"
    // InternalMiniJava.g:528:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalMiniJava.g:529:1: ( ruleNumberValue EOF )
            // InternalMiniJava.g:530:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalMiniJava.g:537:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:541:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalMiniJava.g:542:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalMiniJava.g:542:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalMiniJava.g:543:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalMiniJava.g:544:3: ( rule__NumberValue__ValueAssignment )
            // InternalMiniJava.g:544:4: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMiniJava.g:552:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__TypeNameAssignment_1 ) ) | ( ( rule__Type__TypeNameAssignment_2 ) ) | ( ( rule__Type__ClassDeclAssignment_3 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:556:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__TypeNameAssignment_1 ) ) | ( ( rule__Type__TypeNameAssignment_2 ) ) | ( ( rule__Type__ClassDeclAssignment_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==24) ) {
                    alt1=1;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==22) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMiniJava.g:557:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:557:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalMiniJava.g:558:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalMiniJava.g:559:3: ( rule__Type__Group_0__0 )
                    // InternalMiniJava.g:559:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:563:2: ( ( rule__Type__TypeNameAssignment_1 ) )
                    {
                    // InternalMiniJava.g:563:2: ( ( rule__Type__TypeNameAssignment_1 ) )
                    // InternalMiniJava.g:564:3: ( rule__Type__TypeNameAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameAssignment_1()); 
                    // InternalMiniJava.g:565:3: ( rule__Type__TypeNameAssignment_1 )
                    // InternalMiniJava.g:565:4: rule__Type__TypeNameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TypeNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:569:2: ( ( rule__Type__TypeNameAssignment_2 ) )
                    {
                    // InternalMiniJava.g:569:2: ( ( rule__Type__TypeNameAssignment_2 ) )
                    // InternalMiniJava.g:570:3: ( rule__Type__TypeNameAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameAssignment_2()); 
                    // InternalMiniJava.g:571:3: ( rule__Type__TypeNameAssignment_2 )
                    // InternalMiniJava.g:571:4: rule__Type__TypeNameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TypeNameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:575:2: ( ( rule__Type__ClassDeclAssignment_3 ) )
                    {
                    // InternalMiniJava.g:575:2: ( ( rule__Type__ClassDeclAssignment_3 ) )
                    // InternalMiniJava.g:576:3: ( rule__Type__ClassDeclAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getClassDeclAssignment_3()); 
                    // InternalMiniJava.g:577:3: ( rule__Type__ClassDeclAssignment_3 )
                    // InternalMiniJava.g:577:4: rule__Type__ClassDeclAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__ClassDeclAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getClassDeclAssignment_3()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMiniJava.g:585:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:589:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 36:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5==37) ) {
                    alt2=5;
                }
                else if ( (LA2_5==24) ) {
                    alt2=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:590:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:590:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalMiniJava.g:591:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalMiniJava.g:592:3: ( rule__Statement__Group_0__0 )
                    // InternalMiniJava.g:592:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:596:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:596:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalMiniJava.g:597:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalMiniJava.g:598:3: ( rule__Statement__Group_1__0 )
                    // InternalMiniJava.g:598:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:602:2: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:602:2: ( ( rule__Statement__Group_2__0 ) )
                    // InternalMiniJava.g:603:3: ( rule__Statement__Group_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2()); 
                    // InternalMiniJava.g:604:3: ( rule__Statement__Group_2__0 )
                    // InternalMiniJava.g:604:4: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:608:2: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:608:2: ( ( rule__Statement__Group_3__0 ) )
                    // InternalMiniJava.g:609:3: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // InternalMiniJava.g:610:3: ( rule__Statement__Group_3__0 )
                    // InternalMiniJava.g:610:4: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:614:2: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:614:2: ( ( rule__Statement__Group_4__0 ) )
                    // InternalMiniJava.g:615:3: ( rule__Statement__Group_4__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_4()); 
                    // InternalMiniJava.g:616:3: ( rule__Statement__Group_4__0 )
                    // InternalMiniJava.g:616:4: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:620:2: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:620:2: ( ( rule__Statement__Group_5__0 ) )
                    // InternalMiniJava.g:621:3: ( rule__Statement__Group_5__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_5()); 
                    // InternalMiniJava.g:622:3: ( rule__Statement__Group_5__0 )
                    // InternalMiniJava.g:622:4: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Addition__ExpressionTypeAlternatives_1_1_0"
    // InternalMiniJava.g:630:1: rule__Addition__ExpressionTypeAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__ExpressionTypeAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:634:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniJava.g:635:2: ( '+' )
                    {
                    // InternalMiniJava.g:635:2: ( '+' )
                    // InternalMiniJava.g:636:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getExpressionTypePlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getExpressionTypePlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:641:2: ( '-' )
                    {
                    // InternalMiniJava.g:641:2: ( '-' )
                    // InternalMiniJava.g:642:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getExpressionTypeHyphenMinusKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getExpressionTypeHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Addition__ExpressionTypeAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__ExpressionTypeAlternatives_1_1_0"
    // InternalMiniJava.g:651:1: rule__Multiplication__ExpressionTypeAlternatives_1_1_0 : ( ( '*' ) | ( '&&' ) );
    public final void rule__Multiplication__ExpressionTypeAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:655:1: ( ( '*' ) | ( '&&' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:656:2: ( '*' )
                    {
                    // InternalMiniJava.g:656:2: ( '*' )
                    // InternalMiniJava.g:657:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getExpressionTypeAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getExpressionTypeAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:662:2: ( '&&' )
                    {
                    // InternalMiniJava.g:662:2: ( '&&' )
                    // InternalMiniJava.g:663:3: '&&'
                    {
                     before(grammarAccess.getMultiplicationAccess().getExpressionTypeAmpersandAmpersandKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getExpressionTypeAmpersandAmpersandKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__ExpressionTypeAlternatives_1_1_0"


    // $ANTLR start "rule__NegationOrPointExpression__Alternatives"
    // InternalMiniJava.g:672:1: rule__NegationOrPointExpression__Alternatives : ( ( ruleNegation ) | ( rulePoint ) );
    public final void rule__NegationOrPointExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:676:1: ( ( ruleNegation ) | ( rulePoint ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==22||(LA5_0>=41 && LA5_0<=44)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:677:2: ( ruleNegation )
                    {
                    // InternalMiniJava.g:677:2: ( ruleNegation )
                    // InternalMiniJava.g:678:3: ruleNegation
                    {
                     before(grammarAccess.getNegationOrPointExpressionAccess().getNegationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getNegationOrPointExpressionAccess().getNegationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:683:2: ( rulePoint )
                    {
                    // InternalMiniJava.g:683:2: ( rulePoint )
                    // InternalMiniJava.g:684:3: rulePoint
                    {
                     before(grammarAccess.getNegationOrPointExpressionAccess().getPointParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePoint();

                    state._fsp--;

                     after(grammarAccess.getNegationOrPointExpressionAccess().getPointParserRuleCall_1()); 

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
    // $ANTLR end "rule__NegationOrPointExpression__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMiniJava.g:693:1: rule__Primary__Alternatives : ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__VariableAssignment_6 ) ) | ( ( rule__Primary__NumberAssignment_7 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:697:1: ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__VariableAssignment_6 ) ) | ( ( rule__Primary__NumberAssignment_7 ) ) )
            int alt6=8;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:698:2: ( ( rule__Primary__ExpressionTypeAssignment_0 ) )
                    {
                    // InternalMiniJava.g:698:2: ( ( rule__Primary__ExpressionTypeAssignment_0 ) )
                    // InternalMiniJava.g:699:3: ( rule__Primary__ExpressionTypeAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_0()); 
                    // InternalMiniJava.g:700:3: ( rule__Primary__ExpressionTypeAssignment_0 )
                    // InternalMiniJava.g:700:4: rule__Primary__ExpressionTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ExpressionTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:704:2: ( ( rule__Primary__ExpressionTypeAssignment_1 ) )
                    {
                    // InternalMiniJava.g:704:2: ( ( rule__Primary__ExpressionTypeAssignment_1 ) )
                    // InternalMiniJava.g:705:3: ( rule__Primary__ExpressionTypeAssignment_1 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_1()); 
                    // InternalMiniJava.g:706:3: ( rule__Primary__ExpressionTypeAssignment_1 )
                    // InternalMiniJava.g:706:4: rule__Primary__ExpressionTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ExpressionTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:710:2: ( ( rule__Primary__ExpressionTypeAssignment_2 ) )
                    {
                    // InternalMiniJava.g:710:2: ( ( rule__Primary__ExpressionTypeAssignment_2 ) )
                    // InternalMiniJava.g:711:3: ( rule__Primary__ExpressionTypeAssignment_2 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_2()); 
                    // InternalMiniJava.g:712:3: ( rule__Primary__ExpressionTypeAssignment_2 )
                    // InternalMiniJava.g:712:4: rule__Primary__ExpressionTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ExpressionTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:716:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:716:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalMiniJava.g:717:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalMiniJava.g:718:3: ( rule__Primary__Group_3__0 )
                    // InternalMiniJava.g:718:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:722:2: ( ( rule__Primary__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:722:2: ( ( rule__Primary__Group_4__0 ) )
                    // InternalMiniJava.g:723:3: ( rule__Primary__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    // InternalMiniJava.g:724:3: ( rule__Primary__Group_4__0 )
                    // InternalMiniJava.g:724:4: rule__Primary__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:728:2: ( ( rule__Primary__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:728:2: ( ( rule__Primary__Group_5__0 ) )
                    // InternalMiniJava.g:729:3: ( rule__Primary__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_5()); 
                    // InternalMiniJava.g:730:3: ( rule__Primary__Group_5__0 )
                    // InternalMiniJava.g:730:4: rule__Primary__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:734:2: ( ( rule__Primary__VariableAssignment_6 ) )
                    {
                    // InternalMiniJava.g:734:2: ( ( rule__Primary__VariableAssignment_6 ) )
                    // InternalMiniJava.g:735:3: ( rule__Primary__VariableAssignment_6 )
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableAssignment_6()); 
                    // InternalMiniJava.g:736:3: ( rule__Primary__VariableAssignment_6 )
                    // InternalMiniJava.g:736:4: rule__Primary__VariableAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__VariableAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getVariableAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:740:2: ( ( rule__Primary__NumberAssignment_7 ) )
                    {
                    // InternalMiniJava.g:740:2: ( ( rule__Primary__NumberAssignment_7 ) )
                    // InternalMiniJava.g:741:3: ( rule__Primary__NumberAssignment_7 )
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberAssignment_7()); 
                    // InternalMiniJava.g:742:3: ( rule__Primary__NumberAssignment_7 )
                    // InternalMiniJava.g:742:4: rule__Primary__NumberAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__NumberAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getNumberAssignment_7()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MethodCallExpr__Alternatives"
    // InternalMiniJava.g:750:1: rule__MethodCallExpr__Alternatives : ( ( ( rule__MethodCallExpr__ExpressionTypeAssignment_0 ) ) | ( ( rule__MethodCallExpr__MethodCallAssignment_1 ) ) );
    public final void rule__MethodCallExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:754:1: ( ( ( rule__MethodCallExpr__ExpressionTypeAssignment_0 ) ) | ( ( rule__MethodCallExpr__MethodCallAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:755:2: ( ( rule__MethodCallExpr__ExpressionTypeAssignment_0 ) )
                    {
                    // InternalMiniJava.g:755:2: ( ( rule__MethodCallExpr__ExpressionTypeAssignment_0 ) )
                    // InternalMiniJava.g:756:3: ( rule__MethodCallExpr__ExpressionTypeAssignment_0 )
                    {
                     before(grammarAccess.getMethodCallExprAccess().getExpressionTypeAssignment_0()); 
                    // InternalMiniJava.g:757:3: ( rule__MethodCallExpr__ExpressionTypeAssignment_0 )
                    // InternalMiniJava.g:757:4: rule__MethodCallExpr__ExpressionTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCallExpr__ExpressionTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodCallExprAccess().getExpressionTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:761:2: ( ( rule__MethodCallExpr__MethodCallAssignment_1 ) )
                    {
                    // InternalMiniJava.g:761:2: ( ( rule__MethodCallExpr__MethodCallAssignment_1 ) )
                    // InternalMiniJava.g:762:3: ( rule__MethodCallExpr__MethodCallAssignment_1 )
                    {
                     before(grammarAccess.getMethodCallExprAccess().getMethodCallAssignment_1()); 
                    // InternalMiniJava.g:763:3: ( rule__MethodCallExpr__MethodCallAssignment_1 )
                    // InternalMiniJava.g:763:4: rule__MethodCallExpr__MethodCallAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCallExpr__MethodCallAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodCallExprAccess().getMethodCallAssignment_1()); 

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
    // $ANTLR end "rule__MethodCallExpr__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMiniJava.g:771:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:775:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMiniJava.g:776:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMiniJava.g:783:1: rule__Program__Group__0__Impl : ( ( rule__Program__ClassDeclarationsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:787:1: ( ( ( rule__Program__ClassDeclarationsAssignment_0 ) ) )
            // InternalMiniJava.g:788:1: ( ( rule__Program__ClassDeclarationsAssignment_0 ) )
            {
            // InternalMiniJava.g:788:1: ( ( rule__Program__ClassDeclarationsAssignment_0 ) )
            // InternalMiniJava.g:789:2: ( rule__Program__ClassDeclarationsAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getClassDeclarationsAssignment_0()); 
            // InternalMiniJava.g:790:2: ( rule__Program__ClassDeclarationsAssignment_0 )
            // InternalMiniJava.g:790:3: rule__Program__ClassDeclarationsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__ClassDeclarationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getClassDeclarationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMiniJava.g:798:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:802:1: ( rule__Program__Group__1__Impl )
            // InternalMiniJava.g:803:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMiniJava.g:809:1: rule__Program__Group__1__Impl : ( ( rule__Program__ClassDeclarationsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:813:1: ( ( ( rule__Program__ClassDeclarationsAssignment_1 )* ) )
            // InternalMiniJava.g:814:1: ( ( rule__Program__ClassDeclarationsAssignment_1 )* )
            {
            // InternalMiniJava.g:814:1: ( ( rule__Program__ClassDeclarationsAssignment_1 )* )
            // InternalMiniJava.g:815:2: ( rule__Program__ClassDeclarationsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getClassDeclarationsAssignment_1()); 
            // InternalMiniJava.g:816:2: ( rule__Program__ClassDeclarationsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMiniJava.g:816:3: rule__Program__ClassDeclarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ClassDeclarationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getClassDeclarationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__MainClass__Group__0"
    // InternalMiniJava.g:825:1: rule__MainClass__Group__0 : rule__MainClass__Group__0__Impl rule__MainClass__Group__1 ;
    public final void rule__MainClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:829:1: ( rule__MainClass__Group__0__Impl rule__MainClass__Group__1 )
            // InternalMiniJava.g:830:2: rule__MainClass__Group__0__Impl rule__MainClass__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MainClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__1();

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
    // $ANTLR end "rule__MainClass__Group__0"


    // $ANTLR start "rule__MainClass__Group__0__Impl"
    // InternalMiniJava.g:837:1: rule__MainClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__MainClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:841:1: ( ( 'class' ) )
            // InternalMiniJava.g:842:1: ( 'class' )
            {
            // InternalMiniJava.g:842:1: ( 'class' )
            // InternalMiniJava.g:843:2: 'class'
            {
             before(grammarAccess.getMainClassAccess().getClassKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__0__Impl"


    // $ANTLR start "rule__MainClass__Group__1"
    // InternalMiniJava.g:852:1: rule__MainClass__Group__1 : rule__MainClass__Group__1__Impl rule__MainClass__Group__2 ;
    public final void rule__MainClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:856:1: ( rule__MainClass__Group__1__Impl rule__MainClass__Group__2 )
            // InternalMiniJava.g:857:2: rule__MainClass__Group__1__Impl rule__MainClass__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MainClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__2();

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
    // $ANTLR end "rule__MainClass__Group__1"


    // $ANTLR start "rule__MainClass__Group__1__Impl"
    // InternalMiniJava.g:864:1: rule__MainClass__Group__1__Impl : ( ( rule__MainClass__NameAssignment_1 ) ) ;
    public final void rule__MainClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:868:1: ( ( ( rule__MainClass__NameAssignment_1 ) ) )
            // InternalMiniJava.g:869:1: ( ( rule__MainClass__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:869:1: ( ( rule__MainClass__NameAssignment_1 ) )
            // InternalMiniJava.g:870:2: ( rule__MainClass__NameAssignment_1 )
            {
             before(grammarAccess.getMainClassAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:871:2: ( rule__MainClass__NameAssignment_1 )
            // InternalMiniJava.g:871:3: rule__MainClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__1__Impl"


    // $ANTLR start "rule__MainClass__Group__2"
    // InternalMiniJava.g:879:1: rule__MainClass__Group__2 : rule__MainClass__Group__2__Impl rule__MainClass__Group__3 ;
    public final void rule__MainClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:883:1: ( rule__MainClass__Group__2__Impl rule__MainClass__Group__3 )
            // InternalMiniJava.g:884:2: rule__MainClass__Group__2__Impl rule__MainClass__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MainClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__3();

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
    // $ANTLR end "rule__MainClass__Group__2"


    // $ANTLR start "rule__MainClass__Group__2__Impl"
    // InternalMiniJava.g:891:1: rule__MainClass__Group__2__Impl : ( '{' ) ;
    public final void rule__MainClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:895:1: ( ( '{' ) )
            // InternalMiniJava.g:896:1: ( '{' )
            {
            // InternalMiniJava.g:896:1: ( '{' )
            // InternalMiniJava.g:897:2: '{'
            {
             before(grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__2__Impl"


    // $ANTLR start "rule__MainClass__Group__3"
    // InternalMiniJava.g:906:1: rule__MainClass__Group__3 : rule__MainClass__Group__3__Impl rule__MainClass__Group__4 ;
    public final void rule__MainClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:910:1: ( rule__MainClass__Group__3__Impl rule__MainClass__Group__4 )
            // InternalMiniJava.g:911:2: rule__MainClass__Group__3__Impl rule__MainClass__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__MainClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__4();

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
    // $ANTLR end "rule__MainClass__Group__3"


    // $ANTLR start "rule__MainClass__Group__3__Impl"
    // InternalMiniJava.g:918:1: rule__MainClass__Group__3__Impl : ( ( rule__MainClass__MainMethodAssignment_3 ) ) ;
    public final void rule__MainClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:922:1: ( ( ( rule__MainClass__MainMethodAssignment_3 ) ) )
            // InternalMiniJava.g:923:1: ( ( rule__MainClass__MainMethodAssignment_3 ) )
            {
            // InternalMiniJava.g:923:1: ( ( rule__MainClass__MainMethodAssignment_3 ) )
            // InternalMiniJava.g:924:2: ( rule__MainClass__MainMethodAssignment_3 )
            {
             before(grammarAccess.getMainClassAccess().getMainMethodAssignment_3()); 
            // InternalMiniJava.g:925:2: ( rule__MainClass__MainMethodAssignment_3 )
            // InternalMiniJava.g:925:3: rule__MainClass__MainMethodAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__MainMethodAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMainClassAccess().getMainMethodAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__3__Impl"


    // $ANTLR start "rule__MainClass__Group__4"
    // InternalMiniJava.g:933:1: rule__MainClass__Group__4 : rule__MainClass__Group__4__Impl ;
    public final void rule__MainClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:937:1: ( rule__MainClass__Group__4__Impl )
            // InternalMiniJava.g:938:2: rule__MainClass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__Group__4__Impl();

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
    // $ANTLR end "rule__MainClass__Group__4"


    // $ANTLR start "rule__MainClass__Group__4__Impl"
    // InternalMiniJava.g:944:1: rule__MainClass__Group__4__Impl : ( '}' ) ;
    public final void rule__MainClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:948:1: ( ( '}' ) )
            // InternalMiniJava.g:949:1: ( '}' )
            {
            // InternalMiniJava.g:949:1: ( '}' )
            // InternalMiniJava.g:950:2: '}'
            {
             before(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__4__Impl"


    // $ANTLR start "rule__MainMethod__Group__0"
    // InternalMiniJava.g:960:1: rule__MainMethod__Group__0 : rule__MainMethod__Group__0__Impl rule__MainMethod__Group__1 ;
    public final void rule__MainMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:964:1: ( rule__MainMethod__Group__0__Impl rule__MainMethod__Group__1 )
            // InternalMiniJava.g:965:2: rule__MainMethod__Group__0__Impl rule__MainMethod__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MainMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__1();

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
    // $ANTLR end "rule__MainMethod__Group__0"


    // $ANTLR start "rule__MainMethod__Group__0__Impl"
    // InternalMiniJava.g:972:1: rule__MainMethod__Group__0__Impl : ( 'public' ) ;
    public final void rule__MainMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:976:1: ( ( 'public' ) )
            // InternalMiniJava.g:977:1: ( 'public' )
            {
            // InternalMiniJava.g:977:1: ( 'public' )
            // InternalMiniJava.g:978:2: 'public'
            {
             before(grammarAccess.getMainMethodAccess().getPublicKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getPublicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__0__Impl"


    // $ANTLR start "rule__MainMethod__Group__1"
    // InternalMiniJava.g:987:1: rule__MainMethod__Group__1 : rule__MainMethod__Group__1__Impl rule__MainMethod__Group__2 ;
    public final void rule__MainMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:991:1: ( rule__MainMethod__Group__1__Impl rule__MainMethod__Group__2 )
            // InternalMiniJava.g:992:2: rule__MainMethod__Group__1__Impl rule__MainMethod__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MainMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__2();

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
    // $ANTLR end "rule__MainMethod__Group__1"


    // $ANTLR start "rule__MainMethod__Group__1__Impl"
    // InternalMiniJava.g:999:1: rule__MainMethod__Group__1__Impl : ( 'static' ) ;
    public final void rule__MainMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1003:1: ( ( 'static' ) )
            // InternalMiniJava.g:1004:1: ( 'static' )
            {
            // InternalMiniJava.g:1004:1: ( 'static' )
            // InternalMiniJava.g:1005:2: 'static'
            {
             before(grammarAccess.getMainMethodAccess().getStaticKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getStaticKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__1__Impl"


    // $ANTLR start "rule__MainMethod__Group__2"
    // InternalMiniJava.g:1014:1: rule__MainMethod__Group__2 : rule__MainMethod__Group__2__Impl rule__MainMethod__Group__3 ;
    public final void rule__MainMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1018:1: ( rule__MainMethod__Group__2__Impl rule__MainMethod__Group__3 )
            // InternalMiniJava.g:1019:2: rule__MainMethod__Group__2__Impl rule__MainMethod__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MainMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__3();

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
    // $ANTLR end "rule__MainMethod__Group__2"


    // $ANTLR start "rule__MainMethod__Group__2__Impl"
    // InternalMiniJava.g:1026:1: rule__MainMethod__Group__2__Impl : ( 'void' ) ;
    public final void rule__MainMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1030:1: ( ( 'void' ) )
            // InternalMiniJava.g:1031:1: ( 'void' )
            {
            // InternalMiniJava.g:1031:1: ( 'void' )
            // InternalMiniJava.g:1032:2: 'void'
            {
             before(grammarAccess.getMainMethodAccess().getVoidKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getVoidKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__2__Impl"


    // $ANTLR start "rule__MainMethod__Group__3"
    // InternalMiniJava.g:1041:1: rule__MainMethod__Group__3 : rule__MainMethod__Group__3__Impl rule__MainMethod__Group__4 ;
    public final void rule__MainMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1045:1: ( rule__MainMethod__Group__3__Impl rule__MainMethod__Group__4 )
            // InternalMiniJava.g:1046:2: rule__MainMethod__Group__3__Impl rule__MainMethod__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__MainMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__4();

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
    // $ANTLR end "rule__MainMethod__Group__3"


    // $ANTLR start "rule__MainMethod__Group__3__Impl"
    // InternalMiniJava.g:1053:1: rule__MainMethod__Group__3__Impl : ( 'main' ) ;
    public final void rule__MainMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1057:1: ( ( 'main' ) )
            // InternalMiniJava.g:1058:1: ( 'main' )
            {
            // InternalMiniJava.g:1058:1: ( 'main' )
            // InternalMiniJava.g:1059:2: 'main'
            {
             before(grammarAccess.getMainMethodAccess().getMainKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getMainKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__3__Impl"


    // $ANTLR start "rule__MainMethod__Group__4"
    // InternalMiniJava.g:1068:1: rule__MainMethod__Group__4 : rule__MainMethod__Group__4__Impl rule__MainMethod__Group__5 ;
    public final void rule__MainMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1072:1: ( rule__MainMethod__Group__4__Impl rule__MainMethod__Group__5 )
            // InternalMiniJava.g:1073:2: rule__MainMethod__Group__4__Impl rule__MainMethod__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__MainMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__5();

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
    // $ANTLR end "rule__MainMethod__Group__4"


    // $ANTLR start "rule__MainMethod__Group__4__Impl"
    // InternalMiniJava.g:1080:1: rule__MainMethod__Group__4__Impl : ( '(' ) ;
    public final void rule__MainMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1084:1: ( ( '(' ) )
            // InternalMiniJava.g:1085:1: ( '(' )
            {
            // InternalMiniJava.g:1085:1: ( '(' )
            // InternalMiniJava.g:1086:2: '('
            {
             before(grammarAccess.getMainMethodAccess().getLeftParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__4__Impl"


    // $ANTLR start "rule__MainMethod__Group__5"
    // InternalMiniJava.g:1095:1: rule__MainMethod__Group__5 : rule__MainMethod__Group__5__Impl rule__MainMethod__Group__6 ;
    public final void rule__MainMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1099:1: ( rule__MainMethod__Group__5__Impl rule__MainMethod__Group__6 )
            // InternalMiniJava.g:1100:2: rule__MainMethod__Group__5__Impl rule__MainMethod__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__MainMethod__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__6();

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
    // $ANTLR end "rule__MainMethod__Group__5"


    // $ANTLR start "rule__MainMethod__Group__5__Impl"
    // InternalMiniJava.g:1107:1: rule__MainMethod__Group__5__Impl : ( 'String' ) ;
    public final void rule__MainMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1111:1: ( ( 'String' ) )
            // InternalMiniJava.g:1112:1: ( 'String' )
            {
            // InternalMiniJava.g:1112:1: ( 'String' )
            // InternalMiniJava.g:1113:2: 'String'
            {
             before(grammarAccess.getMainMethodAccess().getStringKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getStringKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__5__Impl"


    // $ANTLR start "rule__MainMethod__Group__6"
    // InternalMiniJava.g:1122:1: rule__MainMethod__Group__6 : rule__MainMethod__Group__6__Impl rule__MainMethod__Group__7 ;
    public final void rule__MainMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1126:1: ( rule__MainMethod__Group__6__Impl rule__MainMethod__Group__7 )
            // InternalMiniJava.g:1127:2: rule__MainMethod__Group__6__Impl rule__MainMethod__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__MainMethod__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__7();

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
    // $ANTLR end "rule__MainMethod__Group__6"


    // $ANTLR start "rule__MainMethod__Group__6__Impl"
    // InternalMiniJava.g:1134:1: rule__MainMethod__Group__6__Impl : ( '[' ) ;
    public final void rule__MainMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1138:1: ( ( '[' ) )
            // InternalMiniJava.g:1139:1: ( '[' )
            {
            // InternalMiniJava.g:1139:1: ( '[' )
            // InternalMiniJava.g:1140:2: '['
            {
             before(grammarAccess.getMainMethodAccess().getLeftSquareBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getLeftSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__6__Impl"


    // $ANTLR start "rule__MainMethod__Group__7"
    // InternalMiniJava.g:1149:1: rule__MainMethod__Group__7 : rule__MainMethod__Group__7__Impl rule__MainMethod__Group__8 ;
    public final void rule__MainMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1153:1: ( rule__MainMethod__Group__7__Impl rule__MainMethod__Group__8 )
            // InternalMiniJava.g:1154:2: rule__MainMethod__Group__7__Impl rule__MainMethod__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__MainMethod__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__8();

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
    // $ANTLR end "rule__MainMethod__Group__7"


    // $ANTLR start "rule__MainMethod__Group__7__Impl"
    // InternalMiniJava.g:1161:1: rule__MainMethod__Group__7__Impl : ( ']' ) ;
    public final void rule__MainMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1165:1: ( ( ']' ) )
            // InternalMiniJava.g:1166:1: ( ']' )
            {
            // InternalMiniJava.g:1166:1: ( ']' )
            // InternalMiniJava.g:1167:2: ']'
            {
             before(grammarAccess.getMainMethodAccess().getRightSquareBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__7__Impl"


    // $ANTLR start "rule__MainMethod__Group__8"
    // InternalMiniJava.g:1176:1: rule__MainMethod__Group__8 : rule__MainMethod__Group__8__Impl rule__MainMethod__Group__9 ;
    public final void rule__MainMethod__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1180:1: ( rule__MainMethod__Group__8__Impl rule__MainMethod__Group__9 )
            // InternalMiniJava.g:1181:2: rule__MainMethod__Group__8__Impl rule__MainMethod__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__MainMethod__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__9();

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
    // $ANTLR end "rule__MainMethod__Group__8"


    // $ANTLR start "rule__MainMethod__Group__8__Impl"
    // InternalMiniJava.g:1188:1: rule__MainMethod__Group__8__Impl : ( RULE_ID ) ;
    public final void rule__MainMethod__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1192:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1193:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1193:1: ( RULE_ID )
            // InternalMiniJava.g:1194:2: RULE_ID
            {
             before(grammarAccess.getMainMethodAccess().getIDTerminalRuleCall_8()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getIDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__8__Impl"


    // $ANTLR start "rule__MainMethod__Group__9"
    // InternalMiniJava.g:1203:1: rule__MainMethod__Group__9 : rule__MainMethod__Group__9__Impl rule__MainMethod__Group__10 ;
    public final void rule__MainMethod__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1207:1: ( rule__MainMethod__Group__9__Impl rule__MainMethod__Group__10 )
            // InternalMiniJava.g:1208:2: rule__MainMethod__Group__9__Impl rule__MainMethod__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__MainMethod__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__10();

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
    // $ANTLR end "rule__MainMethod__Group__9"


    // $ANTLR start "rule__MainMethod__Group__9__Impl"
    // InternalMiniJava.g:1215:1: rule__MainMethod__Group__9__Impl : ( ')' ) ;
    public final void rule__MainMethod__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1219:1: ( ( ')' ) )
            // InternalMiniJava.g:1220:1: ( ')' )
            {
            // InternalMiniJava.g:1220:1: ( ')' )
            // InternalMiniJava.g:1221:2: ')'
            {
             before(grammarAccess.getMainMethodAccess().getRightParenthesisKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__9__Impl"


    // $ANTLR start "rule__MainMethod__Group__10"
    // InternalMiniJava.g:1230:1: rule__MainMethod__Group__10 : rule__MainMethod__Group__10__Impl rule__MainMethod__Group__11 ;
    public final void rule__MainMethod__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1234:1: ( rule__MainMethod__Group__10__Impl rule__MainMethod__Group__11 )
            // InternalMiniJava.g:1235:2: rule__MainMethod__Group__10__Impl rule__MainMethod__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__MainMethod__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__11();

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
    // $ANTLR end "rule__MainMethod__Group__10"


    // $ANTLR start "rule__MainMethod__Group__10__Impl"
    // InternalMiniJava.g:1242:1: rule__MainMethod__Group__10__Impl : ( '{' ) ;
    public final void rule__MainMethod__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1246:1: ( ( '{' ) )
            // InternalMiniJava.g:1247:1: ( '{' )
            {
            // InternalMiniJava.g:1247:1: ( '{' )
            // InternalMiniJava.g:1248:2: '{'
            {
             before(grammarAccess.getMainMethodAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__10__Impl"


    // $ANTLR start "rule__MainMethod__Group__11"
    // InternalMiniJava.g:1257:1: rule__MainMethod__Group__11 : rule__MainMethod__Group__11__Impl rule__MainMethod__Group__12 ;
    public final void rule__MainMethod__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1261:1: ( rule__MainMethod__Group__11__Impl rule__MainMethod__Group__12 )
            // InternalMiniJava.g:1262:2: rule__MainMethod__Group__11__Impl rule__MainMethod__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__MainMethod__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__12();

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
    // $ANTLR end "rule__MainMethod__Group__11"


    // $ANTLR start "rule__MainMethod__Group__11__Impl"
    // InternalMiniJava.g:1269:1: rule__MainMethod__Group__11__Impl : ( ( rule__MainMethod__StatementAssignment_11 ) ) ;
    public final void rule__MainMethod__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1273:1: ( ( ( rule__MainMethod__StatementAssignment_11 ) ) )
            // InternalMiniJava.g:1274:1: ( ( rule__MainMethod__StatementAssignment_11 ) )
            {
            // InternalMiniJava.g:1274:1: ( ( rule__MainMethod__StatementAssignment_11 ) )
            // InternalMiniJava.g:1275:2: ( rule__MainMethod__StatementAssignment_11 )
            {
             before(grammarAccess.getMainMethodAccess().getStatementAssignment_11()); 
            // InternalMiniJava.g:1276:2: ( rule__MainMethod__StatementAssignment_11 )
            // InternalMiniJava.g:1276:3: rule__MainMethod__StatementAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__MainMethod__StatementAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMainMethodAccess().getStatementAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__11__Impl"


    // $ANTLR start "rule__MainMethod__Group__12"
    // InternalMiniJava.g:1284:1: rule__MainMethod__Group__12 : rule__MainMethod__Group__12__Impl ;
    public final void rule__MainMethod__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1288:1: ( rule__MainMethod__Group__12__Impl )
            // InternalMiniJava.g:1289:2: rule__MainMethod__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainMethod__Group__12__Impl();

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
    // $ANTLR end "rule__MainMethod__Group__12"


    // $ANTLR start "rule__MainMethod__Group__12__Impl"
    // InternalMiniJava.g:1295:1: rule__MainMethod__Group__12__Impl : ( '}' ) ;
    public final void rule__MainMethod__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1299:1: ( ( '}' ) )
            // InternalMiniJava.g:1300:1: ( '}' )
            {
            // InternalMiniJava.g:1300:1: ( '}' )
            // InternalMiniJava.g:1301:2: '}'
            {
             before(grammarAccess.getMainMethodAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMainMethodAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__Group__12__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalMiniJava.g:1311:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1315:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalMiniJava.g:1316:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__1();

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
    // $ANTLR end "rule__ClassDeclaration__Group__0"


    // $ANTLR start "rule__ClassDeclaration__Group__0__Impl"
    // InternalMiniJava.g:1323:1: rule__ClassDeclaration__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1327:1: ( ( 'class' ) )
            // InternalMiniJava.g:1328:1: ( 'class' )
            {
            // InternalMiniJava.g:1328:1: ( 'class' )
            // InternalMiniJava.g:1329:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__1"
    // InternalMiniJava.g:1338:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1342:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalMiniJava.g:1343:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ClassDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__2();

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
    // $ANTLR end "rule__ClassDeclaration__Group__1"


    // $ANTLR start "rule__ClassDeclaration__Group__1__Impl"
    // InternalMiniJava.g:1350:1: rule__ClassDeclaration__Group__1__Impl : ( ( rule__ClassDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1354:1: ( ( ( rule__ClassDeclaration__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1355:1: ( ( rule__ClassDeclaration__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1355:1: ( ( rule__ClassDeclaration__NameAssignment_1 ) )
            // InternalMiniJava.g:1356:2: ( rule__ClassDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:1357:2: ( rule__ClassDeclaration__NameAssignment_1 )
            // InternalMiniJava.g:1357:3: rule__ClassDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__2"
    // InternalMiniJava.g:1365:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1369:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalMiniJava.g:1370:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ClassDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__3();

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
    // $ANTLR end "rule__ClassDeclaration__Group__2"


    // $ANTLR start "rule__ClassDeclaration__Group__2__Impl"
    // InternalMiniJava.g:1377:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__Group_2__0 )? ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1381:1: ( ( ( rule__ClassDeclaration__Group_2__0 )? ) )
            // InternalMiniJava.g:1382:1: ( ( rule__ClassDeclaration__Group_2__0 )? )
            {
            // InternalMiniJava.g:1382:1: ( ( rule__ClassDeclaration__Group_2__0 )? )
            // InternalMiniJava.g:1383:2: ( rule__ClassDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_2()); 
            // InternalMiniJava.g:1384:2: ( rule__ClassDeclaration__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:1384:3: rule__ClassDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__3"
    // InternalMiniJava.g:1392:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1396:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalMiniJava.g:1397:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ClassDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__4();

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
    // $ANTLR end "rule__ClassDeclaration__Group__3"


    // $ANTLR start "rule__ClassDeclaration__Group__3__Impl"
    // InternalMiniJava.g:1404:1: rule__ClassDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1408:1: ( ( '{' ) )
            // InternalMiniJava.g:1409:1: ( '{' )
            {
            // InternalMiniJava.g:1409:1: ( '{' )
            // InternalMiniJava.g:1410:2: '{'
            {
             before(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__4"
    // InternalMiniJava.g:1419:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1423:1: ( rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 )
            // InternalMiniJava.g:1424:2: rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ClassDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__5();

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
    // $ANTLR end "rule__ClassDeclaration__Group__4"


    // $ANTLR start "rule__ClassDeclaration__Group__4__Impl"
    // InternalMiniJava.g:1431:1: rule__ClassDeclaration__Group__4__Impl : ( ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )* ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1435:1: ( ( ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )* ) )
            // InternalMiniJava.g:1436:1: ( ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )* )
            {
            // InternalMiniJava.g:1436:1: ( ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )* )
            // InternalMiniJava.g:1437:2: ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getVarDeclarationsAssignment_4()); 
            // InternalMiniJava.g:1438:2: ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==28||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMiniJava.g:1438:3: rule__ClassDeclaration__VarDeclarationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ClassDeclaration__VarDeclarationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getVarDeclarationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__5"
    // InternalMiniJava.g:1446:1: rule__ClassDeclaration__Group__5 : rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6 ;
    public final void rule__ClassDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1450:1: ( rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6 )
            // InternalMiniJava.g:1451:2: rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__ClassDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__6();

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
    // $ANTLR end "rule__ClassDeclaration__Group__5"


    // $ANTLR start "rule__ClassDeclaration__Group__5__Impl"
    // InternalMiniJava.g:1458:1: rule__ClassDeclaration__Group__5__Impl : ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )* ) ;
    public final void rule__ClassDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1462:1: ( ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )* ) )
            // InternalMiniJava.g:1463:1: ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )* )
            {
            // InternalMiniJava.g:1463:1: ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )* )
            // InternalMiniJava.g:1464:2: ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsAssignment_5()); 
            // InternalMiniJava.g:1465:2: ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniJava.g:1465:3: rule__ClassDeclaration__MethodDeclarationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ClassDeclaration__MethodDeclarationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__6"
    // InternalMiniJava.g:1473:1: rule__ClassDeclaration__Group__6 : rule__ClassDeclaration__Group__6__Impl ;
    public final void rule__ClassDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1477:1: ( rule__ClassDeclaration__Group__6__Impl )
            // InternalMiniJava.g:1478:2: rule__ClassDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__ClassDeclaration__Group__6"


    // $ANTLR start "rule__ClassDeclaration__Group__6__Impl"
    // InternalMiniJava.g:1484:1: rule__ClassDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1488:1: ( ( '}' ) )
            // InternalMiniJava.g:1489:1: ( '}' )
            {
            // InternalMiniJava.g:1489:1: ( '}' )
            // InternalMiniJava.g:1490:2: '}'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_2__0"
    // InternalMiniJava.g:1500:1: rule__ClassDeclaration__Group_2__0 : rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1 ;
    public final void rule__ClassDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1504:1: ( rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1 )
            // InternalMiniJava.g:1505:2: rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_2__1();

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
    // $ANTLR end "rule__ClassDeclaration__Group_2__0"


    // $ANTLR start "rule__ClassDeclaration__Group_2__0__Impl"
    // InternalMiniJava.g:1512:1: rule__ClassDeclaration__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1516:1: ( ( 'extends' ) )
            // InternalMiniJava.g:1517:1: ( 'extends' )
            {
            // InternalMiniJava.g:1517:1: ( 'extends' )
            // InternalMiniJava.g:1518:2: 'extends'
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_2__1"
    // InternalMiniJava.g:1527:1: rule__ClassDeclaration__Group_2__1 : rule__ClassDeclaration__Group_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1531:1: ( rule__ClassDeclaration__Group_2__1__Impl )
            // InternalMiniJava.g:1532:2: rule__ClassDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_2__1__Impl();

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
    // $ANTLR end "rule__ClassDeclaration__Group_2__1"


    // $ANTLR start "rule__ClassDeclaration__Group_2__1__Impl"
    // InternalMiniJava.g:1538:1: rule__ClassDeclaration__Group_2__1__Impl : ( ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1542:1: ( ( ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 ) ) )
            // InternalMiniJava.g:1543:1: ( ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 ) )
            {
            // InternalMiniJava.g:1543:1: ( ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 ) )
            // InternalMiniJava.g:1544:2: ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendedClassAssignment_2_1()); 
            // InternalMiniJava.g:1545:2: ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 )
            // InternalMiniJava.g:1545:3: rule__ClassDeclaration__ExtendedClassAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__ExtendedClassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getExtendedClassAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalMiniJava.g:1554:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1558:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalMiniJava.g:1559:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

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
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalMiniJava.g:1566:1: rule__Type__Group_0__0__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1570:1: ( ( 'int' ) )
            // InternalMiniJava.g:1571:1: ( 'int' )
            {
            // InternalMiniJava.g:1571:1: ( 'int' )
            // InternalMiniJava.g:1572:2: 'int'
            {
             before(grammarAccess.getTypeAccess().getIntKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIntKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalMiniJava.g:1581:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl rule__Type__Group_0__2 ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1585:1: ( rule__Type__Group_0__1__Impl rule__Type__Group_0__2 )
            // InternalMiniJava.g:1586:2: rule__Type__Group_0__1__Impl rule__Type__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__2();

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
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalMiniJava.g:1593:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__TypeNameAssignment_0_1 ) ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1597:1: ( ( ( rule__Type__TypeNameAssignment_0_1 ) ) )
            // InternalMiniJava.g:1598:1: ( ( rule__Type__TypeNameAssignment_0_1 ) )
            {
            // InternalMiniJava.g:1598:1: ( ( rule__Type__TypeNameAssignment_0_1 ) )
            // InternalMiniJava.g:1599:2: ( rule__Type__TypeNameAssignment_0_1 )
            {
             before(grammarAccess.getTypeAccess().getTypeNameAssignment_0_1()); 
            // InternalMiniJava.g:1600:2: ( rule__Type__TypeNameAssignment_0_1 )
            // InternalMiniJava.g:1600:3: rule__Type__TypeNameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_0__2"
    // InternalMiniJava.g:1608:1: rule__Type__Group_0__2 : rule__Type__Group_0__2__Impl ;
    public final void rule__Type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1612:1: ( rule__Type__Group_0__2__Impl )
            // InternalMiniJava.g:1613:2: rule__Type__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__2__Impl();

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
    // $ANTLR end "rule__Type__Group_0__2"


    // $ANTLR start "rule__Type__Group_0__2__Impl"
    // InternalMiniJava.g:1619:1: rule__Type__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1623:1: ( ( ']' ) )
            // InternalMiniJava.g:1624:1: ( ']' )
            {
            // InternalMiniJava.g:1624:1: ( ']' )
            // InternalMiniJava.g:1625:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalMiniJava.g:1635:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1639:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalMiniJava.g:1640:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

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
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalMiniJava.g:1647:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VariableAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1651:1: ( ( ( rule__VarDeclaration__VariableAssignment_0 ) ) )
            // InternalMiniJava.g:1652:1: ( ( rule__VarDeclaration__VariableAssignment_0 ) )
            {
            // InternalMiniJava.g:1652:1: ( ( rule__VarDeclaration__VariableAssignment_0 ) )
            // InternalMiniJava.g:1653:2: ( rule__VarDeclaration__VariableAssignment_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariableAssignment_0()); 
            // InternalMiniJava.g:1654:2: ( rule__VarDeclaration__VariableAssignment_0 )
            // InternalMiniJava.g:1654:3: rule__VarDeclaration__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalMiniJava.g:1662:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1666:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalMiniJava.g:1667:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalMiniJava.g:1673:1: rule__VarDeclaration__Group__1__Impl : ( ';' ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1677:1: ( ( ';' ) )
            // InternalMiniJava.g:1678:1: ( ';' )
            {
            // InternalMiniJava.g:1678:1: ( ';' )
            // InternalMiniJava.g:1679:2: ';'
            {
             before(grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMiniJava.g:1689:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1693:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMiniJava.g:1694:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMiniJava.g:1701:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VariableTypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1705:1: ( ( ( rule__Variable__VariableTypeAssignment_0 ) ) )
            // InternalMiniJava.g:1706:1: ( ( rule__Variable__VariableTypeAssignment_0 ) )
            {
            // InternalMiniJava.g:1706:1: ( ( rule__Variable__VariableTypeAssignment_0 ) )
            // InternalMiniJava.g:1707:2: ( rule__Variable__VariableTypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getVariableTypeAssignment_0()); 
            // InternalMiniJava.g:1708:2: ( rule__Variable__VariableTypeAssignment_0 )
            // InternalMiniJava.g:1708:3: rule__Variable__VariableTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariableTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariableTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMiniJava.g:1716:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1720:1: ( rule__Variable__Group__1__Impl )
            // InternalMiniJava.g:1721:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMiniJava.g:1727:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1731:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1732:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1732:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalMiniJava.g:1733:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:1734:2: ( rule__Variable__NameAssignment_1 )
            // InternalMiniJava.g:1734:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__0"
    // InternalMiniJava.g:1743:1: rule__MethodDeclaration__Group__0 : rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1 ;
    public final void rule__MethodDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1747:1: ( rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1 )
            // InternalMiniJava.g:1748:2: rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__MethodDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__1();

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
    // $ANTLR end "rule__MethodDeclaration__Group__0"


    // $ANTLR start "rule__MethodDeclaration__Group__0__Impl"
    // InternalMiniJava.g:1755:1: rule__MethodDeclaration__Group__0__Impl : ( 'public' ) ;
    public final void rule__MethodDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1759:1: ( ( 'public' ) )
            // InternalMiniJava.g:1760:1: ( 'public' )
            {
            // InternalMiniJava.g:1760:1: ( 'public' )
            // InternalMiniJava.g:1761:2: 'public'
            {
             before(grammarAccess.getMethodDeclarationAccess().getPublicKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getPublicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__0__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__1"
    // InternalMiniJava.g:1770:1: rule__MethodDeclaration__Group__1 : rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2 ;
    public final void rule__MethodDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1774:1: ( rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2 )
            // InternalMiniJava.g:1775:2: rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MethodDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__2();

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
    // $ANTLR end "rule__MethodDeclaration__Group__1"


    // $ANTLR start "rule__MethodDeclaration__Group__1__Impl"
    // InternalMiniJava.g:1782:1: rule__MethodDeclaration__Group__1__Impl : ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) ) ;
    public final void rule__MethodDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1786:1: ( ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) ) )
            // InternalMiniJava.g:1787:1: ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) )
            {
            // InternalMiniJava.g:1787:1: ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) )
            // InternalMiniJava.g:1788:2: ( rule__MethodDeclaration__MethodTypeAssignment_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getMethodTypeAssignment_1()); 
            // InternalMiniJava.g:1789:2: ( rule__MethodDeclaration__MethodTypeAssignment_1 )
            // InternalMiniJava.g:1789:3: rule__MethodDeclaration__MethodTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__MethodTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getMethodTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__2"
    // InternalMiniJava.g:1797:1: rule__MethodDeclaration__Group__2 : rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3 ;
    public final void rule__MethodDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1801:1: ( rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3 )
            // InternalMiniJava.g:1802:2: rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MethodDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__3();

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
    // $ANTLR end "rule__MethodDeclaration__Group__2"


    // $ANTLR start "rule__MethodDeclaration__Group__2__Impl"
    // InternalMiniJava.g:1809:1: rule__MethodDeclaration__Group__2__Impl : ( ( rule__MethodDeclaration__NameAssignment_2 ) ) ;
    public final void rule__MethodDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1813:1: ( ( ( rule__MethodDeclaration__NameAssignment_2 ) ) )
            // InternalMiniJava.g:1814:1: ( ( rule__MethodDeclaration__NameAssignment_2 ) )
            {
            // InternalMiniJava.g:1814:1: ( ( rule__MethodDeclaration__NameAssignment_2 ) )
            // InternalMiniJava.g:1815:2: ( rule__MethodDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getNameAssignment_2()); 
            // InternalMiniJava.g:1816:2: ( rule__MethodDeclaration__NameAssignment_2 )
            // InternalMiniJava.g:1816:3: rule__MethodDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__2__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__3"
    // InternalMiniJava.g:1824:1: rule__MethodDeclaration__Group__3 : rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4 ;
    public final void rule__MethodDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1828:1: ( rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4 )
            // InternalMiniJava.g:1829:2: rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__MethodDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__4();

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
    // $ANTLR end "rule__MethodDeclaration__Group__3"


    // $ANTLR start "rule__MethodDeclaration__Group__3__Impl"
    // InternalMiniJava.g:1836:1: rule__MethodDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1840:1: ( ( '(' ) )
            // InternalMiniJava.g:1841:1: ( '(' )
            {
            // InternalMiniJava.g:1841:1: ( '(' )
            // InternalMiniJava.g:1842:2: '('
            {
             before(grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__3__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__4"
    // InternalMiniJava.g:1851:1: rule__MethodDeclaration__Group__4 : rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5 ;
    public final void rule__MethodDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1855:1: ( rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5 )
            // InternalMiniJava.g:1856:2: rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__MethodDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__5();

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
    // $ANTLR end "rule__MethodDeclaration__Group__4"


    // $ANTLR start "rule__MethodDeclaration__Group__4__Impl"
    // InternalMiniJava.g:1863:1: rule__MethodDeclaration__Group__4__Impl : ( ( rule__MethodDeclaration__Group_4__0 )? ) ;
    public final void rule__MethodDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1867:1: ( ( ( rule__MethodDeclaration__Group_4__0 )? ) )
            // InternalMiniJava.g:1868:1: ( ( rule__MethodDeclaration__Group_4__0 )? )
            {
            // InternalMiniJava.g:1868:1: ( ( rule__MethodDeclaration__Group_4__0 )? )
            // InternalMiniJava.g:1869:2: ( rule__MethodDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup_4()); 
            // InternalMiniJava.g:1870:2: ( rule__MethodDeclaration__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==28||LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:1870:3: rule__MethodDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__4__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__5"
    // InternalMiniJava.g:1878:1: rule__MethodDeclaration__Group__5 : rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6 ;
    public final void rule__MethodDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1882:1: ( rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6 )
            // InternalMiniJava.g:1883:2: rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__MethodDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__6();

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
    // $ANTLR end "rule__MethodDeclaration__Group__5"


    // $ANTLR start "rule__MethodDeclaration__Group__5__Impl"
    // InternalMiniJava.g:1890:1: rule__MethodDeclaration__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1894:1: ( ( ')' ) )
            // InternalMiniJava.g:1895:1: ( ')' )
            {
            // InternalMiniJava.g:1895:1: ( ')' )
            // InternalMiniJava.g:1896:2: ')'
            {
             before(grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__5__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__6"
    // InternalMiniJava.g:1905:1: rule__MethodDeclaration__Group__6 : rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7 ;
    public final void rule__MethodDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1909:1: ( rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7 )
            // InternalMiniJava.g:1910:2: rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__MethodDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__7();

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
    // $ANTLR end "rule__MethodDeclaration__Group__6"


    // $ANTLR start "rule__MethodDeclaration__Group__6__Impl"
    // InternalMiniJava.g:1917:1: rule__MethodDeclaration__Group__6__Impl : ( '{' ) ;
    public final void rule__MethodDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1921:1: ( ( '{' ) )
            // InternalMiniJava.g:1922:1: ( '{' )
            {
            // InternalMiniJava.g:1922:1: ( '{' )
            // InternalMiniJava.g:1923:2: '{'
            {
             before(grammarAccess.getMethodDeclarationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__6__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__7"
    // InternalMiniJava.g:1932:1: rule__MethodDeclaration__Group__7 : rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8 ;
    public final void rule__MethodDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1936:1: ( rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8 )
            // InternalMiniJava.g:1937:2: rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__MethodDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__8();

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
    // $ANTLR end "rule__MethodDeclaration__Group__7"


    // $ANTLR start "rule__MethodDeclaration__Group__7__Impl"
    // InternalMiniJava.g:1944:1: rule__MethodDeclaration__Group__7__Impl : ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* ) ;
    public final void rule__MethodDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1948:1: ( ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* ) )
            // InternalMiniJava.g:1949:1: ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* )
            {
            // InternalMiniJava.g:1949:1: ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* )
            // InternalMiniJava.g:1950:2: ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsAssignment_7()); 
            // InternalMiniJava.g:1951:2: ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_ID) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==28||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMiniJava.g:1951:3: rule__MethodDeclaration__LocalVarDeclarationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MethodDeclaration__LocalVarDeclarationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__7__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__8"
    // InternalMiniJava.g:1959:1: rule__MethodDeclaration__Group__8 : rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9 ;
    public final void rule__MethodDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1963:1: ( rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9 )
            // InternalMiniJava.g:1964:2: rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__MethodDeclaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__9();

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
    // $ANTLR end "rule__MethodDeclaration__Group__8"


    // $ANTLR start "rule__MethodDeclaration__Group__8__Impl"
    // InternalMiniJava.g:1971:1: rule__MethodDeclaration__Group__8__Impl : ( ( rule__MethodDeclaration__StatementsAssignment_8 )* ) ;
    public final void rule__MethodDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1975:1: ( ( ( rule__MethodDeclaration__StatementsAssignment_8 )* ) )
            // InternalMiniJava.g:1976:1: ( ( rule__MethodDeclaration__StatementsAssignment_8 )* )
            {
            // InternalMiniJava.g:1976:1: ( ( rule__MethodDeclaration__StatementsAssignment_8 )* )
            // InternalMiniJava.g:1977:2: ( rule__MethodDeclaration__StatementsAssignment_8 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getStatementsAssignment_8()); 
            // InternalMiniJava.g:1978:2: ( rule__MethodDeclaration__StatementsAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==16||(LA14_0>=34 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMiniJava.g:1978:3: rule__MethodDeclaration__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__MethodDeclaration__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMethodDeclarationAccess().getStatementsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__8__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__9"
    // InternalMiniJava.g:1986:1: rule__MethodDeclaration__Group__9 : rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10 ;
    public final void rule__MethodDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1990:1: ( rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10 )
            // InternalMiniJava.g:1991:2: rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__MethodDeclaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__10();

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
    // $ANTLR end "rule__MethodDeclaration__Group__9"


    // $ANTLR start "rule__MethodDeclaration__Group__9__Impl"
    // InternalMiniJava.g:1998:1: rule__MethodDeclaration__Group__9__Impl : ( ( rule__MethodDeclaration__Group_9__0 )? ) ;
    public final void rule__MethodDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2002:1: ( ( ( rule__MethodDeclaration__Group_9__0 )? ) )
            // InternalMiniJava.g:2003:1: ( ( rule__MethodDeclaration__Group_9__0 )? )
            {
            // InternalMiniJava.g:2003:1: ( ( rule__MethodDeclaration__Group_9__0 )? )
            // InternalMiniJava.g:2004:2: ( rule__MethodDeclaration__Group_9__0 )?
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup_9()); 
            // InternalMiniJava.g:2005:2: ( rule__MethodDeclaration__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:2005:3: rule__MethodDeclaration__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDeclaration__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodDeclarationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__9__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__10"
    // InternalMiniJava.g:2013:1: rule__MethodDeclaration__Group__10 : rule__MethodDeclaration__Group__10__Impl ;
    public final void rule__MethodDeclaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2017:1: ( rule__MethodDeclaration__Group__10__Impl )
            // InternalMiniJava.g:2018:2: rule__MethodDeclaration__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__10__Impl();

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
    // $ANTLR end "rule__MethodDeclaration__Group__10"


    // $ANTLR start "rule__MethodDeclaration__Group__10__Impl"
    // InternalMiniJava.g:2024:1: rule__MethodDeclaration__Group__10__Impl : ( '}' ) ;
    public final void rule__MethodDeclaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2028:1: ( ( '}' ) )
            // InternalMiniJava.g:2029:1: ( '}' )
            {
            // InternalMiniJava.g:2029:1: ( '}' )
            // InternalMiniJava.g:2030:2: '}'
            {
             before(grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__10__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_4__0"
    // InternalMiniJava.g:2040:1: rule__MethodDeclaration__Group_4__0 : rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1 ;
    public final void rule__MethodDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2044:1: ( rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1 )
            // InternalMiniJava.g:2045:2: rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__MethodDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_4__1();

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
    // $ANTLR end "rule__MethodDeclaration__Group_4__0"


    // $ANTLR start "rule__MethodDeclaration__Group_4__0__Impl"
    // InternalMiniJava.g:2052:1: rule__MethodDeclaration__Group_4__0__Impl : ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 ) ) ;
    public final void rule__MethodDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2056:1: ( ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 ) ) )
            // InternalMiniJava.g:2057:1: ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 ) )
            {
            // InternalMiniJava.g:2057:1: ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 ) )
            // InternalMiniJava.g:2058:2: ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsAssignment_4_0()); 
            // InternalMiniJava.g:2059:2: ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 )
            // InternalMiniJava.g:2059:3: rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_4__1"
    // InternalMiniJava.g:2067:1: rule__MethodDeclaration__Group_4__1 : rule__MethodDeclaration__Group_4__1__Impl ;
    public final void rule__MethodDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2071:1: ( rule__MethodDeclaration__Group_4__1__Impl )
            // InternalMiniJava.g:2072:2: rule__MethodDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_4__1__Impl();

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
    // $ANTLR end "rule__MethodDeclaration__Group_4__1"


    // $ANTLR start "rule__MethodDeclaration__Group_4__1__Impl"
    // InternalMiniJava.g:2078:1: rule__MethodDeclaration__Group_4__1__Impl : ( ( rule__MethodDeclaration__Group_4_1__0 )* ) ;
    public final void rule__MethodDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2082:1: ( ( ( rule__MethodDeclaration__Group_4_1__0 )* ) )
            // InternalMiniJava.g:2083:1: ( ( rule__MethodDeclaration__Group_4_1__0 )* )
            {
            // InternalMiniJava.g:2083:1: ( ( rule__MethodDeclaration__Group_4_1__0 )* )
            // InternalMiniJava.g:2084:2: ( rule__MethodDeclaration__Group_4_1__0 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup_4_1()); 
            // InternalMiniJava.g:2085:2: ( rule__MethodDeclaration__Group_4_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMiniJava.g:2085:3: rule__MethodDeclaration__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__MethodDeclaration__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMethodDeclarationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_4_1__0"
    // InternalMiniJava.g:2094:1: rule__MethodDeclaration__Group_4_1__0 : rule__MethodDeclaration__Group_4_1__0__Impl rule__MethodDeclaration__Group_4_1__1 ;
    public final void rule__MethodDeclaration__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2098:1: ( rule__MethodDeclaration__Group_4_1__0__Impl rule__MethodDeclaration__Group_4_1__1 )
            // InternalMiniJava.g:2099:2: rule__MethodDeclaration__Group_4_1__0__Impl rule__MethodDeclaration__Group_4_1__1
            {
            pushFollow(FOLLOW_23);
            rule__MethodDeclaration__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_4_1__1();

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
    // $ANTLR end "rule__MethodDeclaration__Group_4_1__0"


    // $ANTLR start "rule__MethodDeclaration__Group_4_1__0__Impl"
    // InternalMiniJava.g:2106:1: rule__MethodDeclaration__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MethodDeclaration__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2110:1: ( ( ',' ) )
            // InternalMiniJava.g:2111:1: ( ',' )
            {
            // InternalMiniJava.g:2111:1: ( ',' )
            // InternalMiniJava.g:2112:2: ','
            {
             before(grammarAccess.getMethodDeclarationAccess().getCommaKeyword_4_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_4_1__0__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_4_1__1"
    // InternalMiniJava.g:2121:1: rule__MethodDeclaration__Group_4_1__1 : rule__MethodDeclaration__Group_4_1__1__Impl ;
    public final void rule__MethodDeclaration__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2125:1: ( rule__MethodDeclaration__Group_4_1__1__Impl )
            // InternalMiniJava.g:2126:2: rule__MethodDeclaration__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__MethodDeclaration__Group_4_1__1"


    // $ANTLR start "rule__MethodDeclaration__Group_4_1__1__Impl"
    // InternalMiniJava.g:2132:1: rule__MethodDeclaration__Group_4_1__1__Impl : ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 ) ) ;
    public final void rule__MethodDeclaration__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2136:1: ( ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 ) ) )
            // InternalMiniJava.g:2137:1: ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 ) )
            {
            // InternalMiniJava.g:2137:1: ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 ) )
            // InternalMiniJava.g:2138:2: ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsAssignment_4_1_1()); 
            // InternalMiniJava.g:2139:2: ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 )
            // InternalMiniJava.g:2139:3: rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_4_1__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_9__0"
    // InternalMiniJava.g:2148:1: rule__MethodDeclaration__Group_9__0 : rule__MethodDeclaration__Group_9__0__Impl rule__MethodDeclaration__Group_9__1 ;
    public final void rule__MethodDeclaration__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2152:1: ( rule__MethodDeclaration__Group_9__0__Impl rule__MethodDeclaration__Group_9__1 )
            // InternalMiniJava.g:2153:2: rule__MethodDeclaration__Group_9__0__Impl rule__MethodDeclaration__Group_9__1
            {
            pushFollow(FOLLOW_29);
            rule__MethodDeclaration__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_9__1();

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
    // $ANTLR end "rule__MethodDeclaration__Group_9__0"


    // $ANTLR start "rule__MethodDeclaration__Group_9__0__Impl"
    // InternalMiniJava.g:2160:1: rule__MethodDeclaration__Group_9__0__Impl : ( 'return' ) ;
    public final void rule__MethodDeclaration__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2164:1: ( ( 'return' ) )
            // InternalMiniJava.g:2165:1: ( 'return' )
            {
            // InternalMiniJava.g:2165:1: ( 'return' )
            // InternalMiniJava.g:2166:2: 'return'
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__0__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_9__1"
    // InternalMiniJava.g:2175:1: rule__MethodDeclaration__Group_9__1 : rule__MethodDeclaration__Group_9__1__Impl rule__MethodDeclaration__Group_9__2 ;
    public final void rule__MethodDeclaration__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2179:1: ( rule__MethodDeclaration__Group_9__1__Impl rule__MethodDeclaration__Group_9__2 )
            // InternalMiniJava.g:2180:2: rule__MethodDeclaration__Group_9__1__Impl rule__MethodDeclaration__Group_9__2
            {
            pushFollow(FOLLOW_22);
            rule__MethodDeclaration__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_9__2();

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
    // $ANTLR end "rule__MethodDeclaration__Group_9__1"


    // $ANTLR start "rule__MethodDeclaration__Group_9__1__Impl"
    // InternalMiniJava.g:2187:1: rule__MethodDeclaration__Group_9__1__Impl : ( ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 ) ) ;
    public final void rule__MethodDeclaration__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2191:1: ( ( ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 ) ) )
            // InternalMiniJava.g:2192:1: ( ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 ) )
            {
            // InternalMiniJava.g:2192:1: ( ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 ) )
            // InternalMiniJava.g:2193:2: ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnExpressionAssignment_9_1()); 
            // InternalMiniJava.g:2194:2: ( rule__MethodDeclaration__ReturnExpressionAssignment_9_1 )
            // InternalMiniJava.g:2194:3: rule__MethodDeclaration__ReturnExpressionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__ReturnExpressionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getReturnExpressionAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_9__2"
    // InternalMiniJava.g:2202:1: rule__MethodDeclaration__Group_9__2 : rule__MethodDeclaration__Group_9__2__Impl ;
    public final void rule__MethodDeclaration__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2206:1: ( rule__MethodDeclaration__Group_9__2__Impl )
            // InternalMiniJava.g:2207:2: rule__MethodDeclaration__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_9__2__Impl();

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
    // $ANTLR end "rule__MethodDeclaration__Group_9__2"


    // $ANTLR start "rule__MethodDeclaration__Group_9__2__Impl"
    // InternalMiniJava.g:2213:1: rule__MethodDeclaration__Group_9__2__Impl : ( ';' ) ;
    public final void rule__MethodDeclaration__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2217:1: ( ( ';' ) )
            // InternalMiniJava.g:2218:1: ( ';' )
            {
            // InternalMiniJava.g:2218:1: ( ';' )
            // InternalMiniJava.g:2219:2: ';'
            {
             before(grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_9_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_9__2__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalMiniJava.g:2229:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2233:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalMiniJava.g:2234:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalMiniJava.g:2241:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__StatementTypeAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2245:1: ( ( ( rule__Statement__StatementTypeAssignment_0_0 ) ) )
            // InternalMiniJava.g:2246:1: ( ( rule__Statement__StatementTypeAssignment_0_0 ) )
            {
            // InternalMiniJava.g:2246:1: ( ( rule__Statement__StatementTypeAssignment_0_0 ) )
            // InternalMiniJava.g:2247:2: ( rule__Statement__StatementTypeAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_0_0()); 
            // InternalMiniJava.g:2248:2: ( rule__Statement__StatementTypeAssignment_0_0 )
            // InternalMiniJava.g:2248:3: rule__Statement__StatementTypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalMiniJava.g:2256:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2260:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // InternalMiniJava.g:2261:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_30);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__2();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalMiniJava.g:2268:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__StatementsAssignment_0_1 )* ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2272:1: ( ( ( rule__Statement__StatementsAssignment_0_1 )* ) )
            // InternalMiniJava.g:2273:1: ( ( rule__Statement__StatementsAssignment_0_1 )* )
            {
            // InternalMiniJava.g:2273:1: ( ( rule__Statement__StatementsAssignment_0_1 )* )
            // InternalMiniJava.g:2274:2: ( rule__Statement__StatementsAssignment_0_1 )*
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_0_1()); 
            // InternalMiniJava.g:2275:2: ( rule__Statement__StatementsAssignment_0_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==16||(LA17_0>=34 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiniJava.g:2275:3: rule__Statement__StatementsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Statement__StatementsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getStatementsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__2"
    // InternalMiniJava.g:2283:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2287:1: ( rule__Statement__Group_0__2__Impl )
            // InternalMiniJava.g:2288:2: rule__Statement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__2__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__2"


    // $ANTLR start "rule__Statement__Group_0__2__Impl"
    // InternalMiniJava.g:2294:1: rule__Statement__Group_0__2__Impl : ( '}' ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2298:1: ( ( '}' ) )
            // InternalMiniJava.g:2299:1: ( '}' )
            {
            // InternalMiniJava.g:2299:1: ( '}' )
            // InternalMiniJava.g:2300:2: '}'
            {
             before(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalMiniJava.g:2310:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2314:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalMiniJava.g:2315:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalMiniJava.g:2322:1: rule__Statement__Group_1__0__Impl : ( ( rule__Statement__StatementTypeAssignment_1_0 ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2326:1: ( ( ( rule__Statement__StatementTypeAssignment_1_0 ) ) )
            // InternalMiniJava.g:2327:1: ( ( rule__Statement__StatementTypeAssignment_1_0 ) )
            {
            // InternalMiniJava.g:2327:1: ( ( rule__Statement__StatementTypeAssignment_1_0 ) )
            // InternalMiniJava.g:2328:2: ( rule__Statement__StatementTypeAssignment_1_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_1_0()); 
            // InternalMiniJava.g:2329:2: ( rule__Statement__StatementTypeAssignment_1_0 )
            // InternalMiniJava.g:2329:3: rule__Statement__StatementTypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalMiniJava.g:2337:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2341:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalMiniJava.g:2342:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalMiniJava.g:2349:1: rule__Statement__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2353:1: ( ( '(' ) )
            // InternalMiniJava.g:2354:1: ( '(' )
            {
            // InternalMiniJava.g:2354:1: ( '(' )
            // InternalMiniJava.g:2355:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // InternalMiniJava.g:2364:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2368:1: ( rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 )
            // InternalMiniJava.g:2369:2: rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Statement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__3();

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
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // InternalMiniJava.g:2376:1: rule__Statement__Group_1__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_1_2 ) ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2380:1: ( ( ( rule__Statement__FirstExpressionAssignment_1_2 ) ) )
            // InternalMiniJava.g:2381:1: ( ( rule__Statement__FirstExpressionAssignment_1_2 ) )
            {
            // InternalMiniJava.g:2381:1: ( ( rule__Statement__FirstExpressionAssignment_1_2 ) )
            // InternalMiniJava.g:2382:2: ( rule__Statement__FirstExpressionAssignment_1_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_1_2()); 
            // InternalMiniJava.g:2383:2: ( rule__Statement__FirstExpressionAssignment_1_2 )
            // InternalMiniJava.g:2383:3: rule__Statement__FirstExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__3"
    // InternalMiniJava.g:2391:1: rule__Statement__Group_1__3 : rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4 ;
    public final void rule__Statement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2395:1: ( rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4 )
            // InternalMiniJava.g:2396:2: rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4
            {
            pushFollow(FOLLOW_17);
            rule__Statement__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__4();

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
    // $ANTLR end "rule__Statement__Group_1__3"


    // $ANTLR start "rule__Statement__Group_1__3__Impl"
    // InternalMiniJava.g:2403:1: rule__Statement__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Statement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2407:1: ( ( ')' ) )
            // InternalMiniJava.g:2408:1: ( ')' )
            {
            // InternalMiniJava.g:2408:1: ( ')' )
            // InternalMiniJava.g:2409:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__3__Impl"


    // $ANTLR start "rule__Statement__Group_1__4"
    // InternalMiniJava.g:2418:1: rule__Statement__Group_1__4 : rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5 ;
    public final void rule__Statement__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2422:1: ( rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5 )
            // InternalMiniJava.g:2423:2: rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5
            {
            pushFollow(FOLLOW_31);
            rule__Statement__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__5();

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
    // $ANTLR end "rule__Statement__Group_1__4"


    // $ANTLR start "rule__Statement__Group_1__4__Impl"
    // InternalMiniJava.g:2430:1: rule__Statement__Group_1__4__Impl : ( ( rule__Statement__StatementsAssignment_1_4 ) ) ;
    public final void rule__Statement__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2434:1: ( ( ( rule__Statement__StatementsAssignment_1_4 ) ) )
            // InternalMiniJava.g:2435:1: ( ( rule__Statement__StatementsAssignment_1_4 ) )
            {
            // InternalMiniJava.g:2435:1: ( ( rule__Statement__StatementsAssignment_1_4 ) )
            // InternalMiniJava.g:2436:2: ( rule__Statement__StatementsAssignment_1_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_1_4()); 
            // InternalMiniJava.g:2437:2: ( rule__Statement__StatementsAssignment_1_4 )
            // InternalMiniJava.g:2437:3: rule__Statement__StatementsAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementsAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementsAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__4__Impl"


    // $ANTLR start "rule__Statement__Group_1__5"
    // InternalMiniJava.g:2445:1: rule__Statement__Group_1__5 : rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6 ;
    public final void rule__Statement__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2449:1: ( rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6 )
            // InternalMiniJava.g:2450:2: rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6
            {
            pushFollow(FOLLOW_17);
            rule__Statement__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__6();

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
    // $ANTLR end "rule__Statement__Group_1__5"


    // $ANTLR start "rule__Statement__Group_1__5__Impl"
    // InternalMiniJava.g:2457:1: rule__Statement__Group_1__5__Impl : ( 'else' ) ;
    public final void rule__Statement__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2461:1: ( ( 'else' ) )
            // InternalMiniJava.g:2462:1: ( 'else' )
            {
            // InternalMiniJava.g:2462:1: ( 'else' )
            // InternalMiniJava.g:2463:2: 'else'
            {
             before(grammarAccess.getStatementAccess().getElseKeyword_1_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getElseKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__5__Impl"


    // $ANTLR start "rule__Statement__Group_1__6"
    // InternalMiniJava.g:2472:1: rule__Statement__Group_1__6 : rule__Statement__Group_1__6__Impl ;
    public final void rule__Statement__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2476:1: ( rule__Statement__Group_1__6__Impl )
            // InternalMiniJava.g:2477:2: rule__Statement__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__6__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__6"


    // $ANTLR start "rule__Statement__Group_1__6__Impl"
    // InternalMiniJava.g:2483:1: rule__Statement__Group_1__6__Impl : ( ( rule__Statement__StatementsAssignment_1_6 ) ) ;
    public final void rule__Statement__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2487:1: ( ( ( rule__Statement__StatementsAssignment_1_6 ) ) )
            // InternalMiniJava.g:2488:1: ( ( rule__Statement__StatementsAssignment_1_6 ) )
            {
            // InternalMiniJava.g:2488:1: ( ( rule__Statement__StatementsAssignment_1_6 ) )
            // InternalMiniJava.g:2489:2: ( rule__Statement__StatementsAssignment_1_6 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_1_6()); 
            // InternalMiniJava.g:2490:2: ( rule__Statement__StatementsAssignment_1_6 )
            // InternalMiniJava.g:2490:3: rule__Statement__StatementsAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementsAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementsAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__6__Impl"


    // $ANTLR start "rule__Statement__Group_2__0"
    // InternalMiniJava.g:2499:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2503:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // InternalMiniJava.g:2504:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__1();

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
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // InternalMiniJava.g:2511:1: rule__Statement__Group_2__0__Impl : ( ( rule__Statement__StatementTypeAssignment_2_0 ) ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2515:1: ( ( ( rule__Statement__StatementTypeAssignment_2_0 ) ) )
            // InternalMiniJava.g:2516:1: ( ( rule__Statement__StatementTypeAssignment_2_0 ) )
            {
            // InternalMiniJava.g:2516:1: ( ( rule__Statement__StatementTypeAssignment_2_0 ) )
            // InternalMiniJava.g:2517:2: ( rule__Statement__StatementTypeAssignment_2_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_2_0()); 
            // InternalMiniJava.g:2518:2: ( rule__Statement__StatementTypeAssignment_2_0 )
            // InternalMiniJava.g:2518:3: rule__Statement__StatementTypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // InternalMiniJava.g:2526:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2530:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // InternalMiniJava.g:2531:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_29);
            rule__Statement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__2();

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
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // InternalMiniJava.g:2538:1: rule__Statement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2542:1: ( ( '(' ) )
            // InternalMiniJava.g:2543:1: ( '(' )
            {
            // InternalMiniJava.g:2543:1: ( '(' )
            // InternalMiniJava.g:2544:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_2__2"
    // InternalMiniJava.g:2553:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2557:1: ( rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 )
            // InternalMiniJava.g:2558:2: rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3
            {
            pushFollow(FOLLOW_16);
            rule__Statement__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__3();

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
    // $ANTLR end "rule__Statement__Group_2__2"


    // $ANTLR start "rule__Statement__Group_2__2__Impl"
    // InternalMiniJava.g:2565:1: rule__Statement__Group_2__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_2_2 ) ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2569:1: ( ( ( rule__Statement__FirstExpressionAssignment_2_2 ) ) )
            // InternalMiniJava.g:2570:1: ( ( rule__Statement__FirstExpressionAssignment_2_2 ) )
            {
            // InternalMiniJava.g:2570:1: ( ( rule__Statement__FirstExpressionAssignment_2_2 ) )
            // InternalMiniJava.g:2571:2: ( rule__Statement__FirstExpressionAssignment_2_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_2_2()); 
            // InternalMiniJava.g:2572:2: ( rule__Statement__FirstExpressionAssignment_2_2 )
            // InternalMiniJava.g:2572:3: rule__Statement__FirstExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__2__Impl"


    // $ANTLR start "rule__Statement__Group_2__3"
    // InternalMiniJava.g:2580:1: rule__Statement__Group_2__3 : rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4 ;
    public final void rule__Statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2584:1: ( rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4 )
            // InternalMiniJava.g:2585:2: rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4
            {
            pushFollow(FOLLOW_17);
            rule__Statement__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__4();

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
    // $ANTLR end "rule__Statement__Group_2__3"


    // $ANTLR start "rule__Statement__Group_2__3__Impl"
    // InternalMiniJava.g:2592:1: rule__Statement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2596:1: ( ( ')' ) )
            // InternalMiniJava.g:2597:1: ( ')' )
            {
            // InternalMiniJava.g:2597:1: ( ')' )
            // InternalMiniJava.g:2598:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_2_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__3__Impl"


    // $ANTLR start "rule__Statement__Group_2__4"
    // InternalMiniJava.g:2607:1: rule__Statement__Group_2__4 : rule__Statement__Group_2__4__Impl ;
    public final void rule__Statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2611:1: ( rule__Statement__Group_2__4__Impl )
            // InternalMiniJava.g:2612:2: rule__Statement__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__4__Impl();

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
    // $ANTLR end "rule__Statement__Group_2__4"


    // $ANTLR start "rule__Statement__Group_2__4__Impl"
    // InternalMiniJava.g:2618:1: rule__Statement__Group_2__4__Impl : ( ( rule__Statement__StatementsAssignment_2_4 ) ) ;
    public final void rule__Statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2622:1: ( ( ( rule__Statement__StatementsAssignment_2_4 ) ) )
            // InternalMiniJava.g:2623:1: ( ( rule__Statement__StatementsAssignment_2_4 ) )
            {
            // InternalMiniJava.g:2623:1: ( ( rule__Statement__StatementsAssignment_2_4 ) )
            // InternalMiniJava.g:2624:2: ( rule__Statement__StatementsAssignment_2_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_2_4()); 
            // InternalMiniJava.g:2625:2: ( rule__Statement__StatementsAssignment_2_4 )
            // InternalMiniJava.g:2625:3: rule__Statement__StatementsAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementsAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementsAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__4__Impl"


    // $ANTLR start "rule__Statement__Group_3__0"
    // InternalMiniJava.g:2634:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2638:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // InternalMiniJava.g:2639:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__1();

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
    // $ANTLR end "rule__Statement__Group_3__0"


    // $ANTLR start "rule__Statement__Group_3__0__Impl"
    // InternalMiniJava.g:2646:1: rule__Statement__Group_3__0__Impl : ( ( rule__Statement__StatementTypeAssignment_3_0 ) ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2650:1: ( ( ( rule__Statement__StatementTypeAssignment_3_0 ) ) )
            // InternalMiniJava.g:2651:1: ( ( rule__Statement__StatementTypeAssignment_3_0 ) )
            {
            // InternalMiniJava.g:2651:1: ( ( rule__Statement__StatementTypeAssignment_3_0 ) )
            // InternalMiniJava.g:2652:2: ( rule__Statement__StatementTypeAssignment_3_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_3_0()); 
            // InternalMiniJava.g:2653:2: ( rule__Statement__StatementTypeAssignment_3_0 )
            // InternalMiniJava.g:2653:3: rule__Statement__StatementTypeAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_3__1"
    // InternalMiniJava.g:2661:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2665:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // InternalMiniJava.g:2666:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_29);
            rule__Statement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__2();

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
    // $ANTLR end "rule__Statement__Group_3__1"


    // $ANTLR start "rule__Statement__Group_3__1__Impl"
    // InternalMiniJava.g:2673:1: rule__Statement__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2677:1: ( ( '(' ) )
            // InternalMiniJava.g:2678:1: ( '(' )
            {
            // InternalMiniJava.g:2678:1: ( '(' )
            // InternalMiniJava.g:2679:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1__Impl"


    // $ANTLR start "rule__Statement__Group_3__2"
    // InternalMiniJava.g:2688:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2692:1: ( rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 )
            // InternalMiniJava.g:2693:2: rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3
            {
            pushFollow(FOLLOW_16);
            rule__Statement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__3();

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
    // $ANTLR end "rule__Statement__Group_3__2"


    // $ANTLR start "rule__Statement__Group_3__2__Impl"
    // InternalMiniJava.g:2700:1: rule__Statement__Group_3__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_3_2 ) ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2704:1: ( ( ( rule__Statement__FirstExpressionAssignment_3_2 ) ) )
            // InternalMiniJava.g:2705:1: ( ( rule__Statement__FirstExpressionAssignment_3_2 ) )
            {
            // InternalMiniJava.g:2705:1: ( ( rule__Statement__FirstExpressionAssignment_3_2 ) )
            // InternalMiniJava.g:2706:2: ( rule__Statement__FirstExpressionAssignment_3_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_3_2()); 
            // InternalMiniJava.g:2707:2: ( rule__Statement__FirstExpressionAssignment_3_2 )
            // InternalMiniJava.g:2707:3: rule__Statement__FirstExpressionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__2__Impl"


    // $ANTLR start "rule__Statement__Group_3__3"
    // InternalMiniJava.g:2715:1: rule__Statement__Group_3__3 : rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4 ;
    public final void rule__Statement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2719:1: ( rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4 )
            // InternalMiniJava.g:2720:2: rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4
            {
            pushFollow(FOLLOW_22);
            rule__Statement__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__4();

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
    // $ANTLR end "rule__Statement__Group_3__3"


    // $ANTLR start "rule__Statement__Group_3__3__Impl"
    // InternalMiniJava.g:2727:1: rule__Statement__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Statement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2731:1: ( ( ')' ) )
            // InternalMiniJava.g:2732:1: ( ')' )
            {
            // InternalMiniJava.g:2732:1: ( ')' )
            // InternalMiniJava.g:2733:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__3__Impl"


    // $ANTLR start "rule__Statement__Group_3__4"
    // InternalMiniJava.g:2742:1: rule__Statement__Group_3__4 : rule__Statement__Group_3__4__Impl ;
    public final void rule__Statement__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2746:1: ( rule__Statement__Group_3__4__Impl )
            // InternalMiniJava.g:2747:2: rule__Statement__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__4__Impl();

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
    // $ANTLR end "rule__Statement__Group_3__4"


    // $ANTLR start "rule__Statement__Group_3__4__Impl"
    // InternalMiniJava.g:2753:1: rule__Statement__Group_3__4__Impl : ( ';' ) ;
    public final void rule__Statement__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2757:1: ( ( ';' ) )
            // InternalMiniJava.g:2758:1: ( ';' )
            {
            // InternalMiniJava.g:2758:1: ( ';' )
            // InternalMiniJava.g:2759:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_3_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__4__Impl"


    // $ANTLR start "rule__Statement__Group_4__0"
    // InternalMiniJava.g:2769:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2773:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // InternalMiniJava.g:2774:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1();

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
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // InternalMiniJava.g:2781:1: rule__Statement__Group_4__0__Impl : ( ( rule__Statement__VariableAssignment_4_0 ) ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2785:1: ( ( ( rule__Statement__VariableAssignment_4_0 ) ) )
            // InternalMiniJava.g:2786:1: ( ( rule__Statement__VariableAssignment_4_0 ) )
            {
            // InternalMiniJava.g:2786:1: ( ( rule__Statement__VariableAssignment_4_0 ) )
            // InternalMiniJava.g:2787:2: ( rule__Statement__VariableAssignment_4_0 )
            {
             before(grammarAccess.getStatementAccess().getVariableAssignment_4_0()); 
            // InternalMiniJava.g:2788:2: ( rule__Statement__VariableAssignment_4_0 )
            // InternalMiniJava.g:2788:3: rule__Statement__VariableAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__VariableAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getVariableAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // InternalMiniJava.g:2796:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2800:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // InternalMiniJava.g:2801:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_29);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__2();

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
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // InternalMiniJava.g:2808:1: rule__Statement__Group_4__1__Impl : ( ( rule__Statement__StatementTypeAssignment_4_1 ) ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2812:1: ( ( ( rule__Statement__StatementTypeAssignment_4_1 ) ) )
            // InternalMiniJava.g:2813:1: ( ( rule__Statement__StatementTypeAssignment_4_1 ) )
            {
            // InternalMiniJava.g:2813:1: ( ( rule__Statement__StatementTypeAssignment_4_1 ) )
            // InternalMiniJava.g:2814:2: ( rule__Statement__StatementTypeAssignment_4_1 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_4_1()); 
            // InternalMiniJava.g:2815:2: ( rule__Statement__StatementTypeAssignment_4_1 )
            // InternalMiniJava.g:2815:3: rule__Statement__StatementTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_4__2"
    // InternalMiniJava.g:2823:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2827:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // InternalMiniJava.g:2828:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
            {
            pushFollow(FOLLOW_22);
            rule__Statement__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__3();

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
    // $ANTLR end "rule__Statement__Group_4__2"


    // $ANTLR start "rule__Statement__Group_4__2__Impl"
    // InternalMiniJava.g:2835:1: rule__Statement__Group_4__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_4_2 ) ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2839:1: ( ( ( rule__Statement__FirstExpressionAssignment_4_2 ) ) )
            // InternalMiniJava.g:2840:1: ( ( rule__Statement__FirstExpressionAssignment_4_2 ) )
            {
            // InternalMiniJava.g:2840:1: ( ( rule__Statement__FirstExpressionAssignment_4_2 ) )
            // InternalMiniJava.g:2841:2: ( rule__Statement__FirstExpressionAssignment_4_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_4_2()); 
            // InternalMiniJava.g:2842:2: ( rule__Statement__FirstExpressionAssignment_4_2 )
            // InternalMiniJava.g:2842:3: rule__Statement__FirstExpressionAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__2__Impl"


    // $ANTLR start "rule__Statement__Group_4__3"
    // InternalMiniJava.g:2850:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2854:1: ( rule__Statement__Group_4__3__Impl )
            // InternalMiniJava.g:2855:2: rule__Statement__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__3__Impl();

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
    // $ANTLR end "rule__Statement__Group_4__3"


    // $ANTLR start "rule__Statement__Group_4__3__Impl"
    // InternalMiniJava.g:2861:1: rule__Statement__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2865:1: ( ( ';' ) )
            // InternalMiniJava.g:2866:1: ( ';' )
            {
            // InternalMiniJava.g:2866:1: ( ';' )
            // InternalMiniJava.g:2867:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__3__Impl"


    // $ANTLR start "rule__Statement__Group_5__0"
    // InternalMiniJava.g:2877:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2881:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // InternalMiniJava.g:2882:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Statement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1();

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
    // $ANTLR end "rule__Statement__Group_5__0"


    // $ANTLR start "rule__Statement__Group_5__0__Impl"
    // InternalMiniJava.g:2889:1: rule__Statement__Group_5__0__Impl : ( ( rule__Statement__VariableAssignment_5_0 ) ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2893:1: ( ( ( rule__Statement__VariableAssignment_5_0 ) ) )
            // InternalMiniJava.g:2894:1: ( ( rule__Statement__VariableAssignment_5_0 ) )
            {
            // InternalMiniJava.g:2894:1: ( ( rule__Statement__VariableAssignment_5_0 ) )
            // InternalMiniJava.g:2895:2: ( rule__Statement__VariableAssignment_5_0 )
            {
             before(grammarAccess.getStatementAccess().getVariableAssignment_5_0()); 
            // InternalMiniJava.g:2896:2: ( rule__Statement__VariableAssignment_5_0 )
            // InternalMiniJava.g:2896:3: rule__Statement__VariableAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__VariableAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getVariableAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__0__Impl"


    // $ANTLR start "rule__Statement__Group_5__1"
    // InternalMiniJava.g:2904:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2908:1: ( rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 )
            // InternalMiniJava.g:2909:2: rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2
            {
            pushFollow(FOLLOW_29);
            rule__Statement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__2();

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
    // $ANTLR end "rule__Statement__Group_5__1"


    // $ANTLR start "rule__Statement__Group_5__1__Impl"
    // InternalMiniJava.g:2916:1: rule__Statement__Group_5__1__Impl : ( ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 ) ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2920:1: ( ( ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 ) ) )
            // InternalMiniJava.g:2921:1: ( ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 ) )
            {
            // InternalMiniJava.g:2921:1: ( ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 ) )
            // InternalMiniJava.g:2922:2: ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 )
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentAssignment_5_1()); 
            // InternalMiniJava.g:2923:2: ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 )
            // InternalMiniJava.g:2923:3: rule__Statement__IsArrayElementAssignmentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__IsArrayElementAssignmentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getIsArrayElementAssignmentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__1__Impl"


    // $ANTLR start "rule__Statement__Group_5__2"
    // InternalMiniJava.g:2931:1: rule__Statement__Group_5__2 : rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 ;
    public final void rule__Statement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2935:1: ( rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 )
            // InternalMiniJava.g:2936:2: rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3
            {
            pushFollow(FOLLOW_15);
            rule__Statement__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__3();

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
    // $ANTLR end "rule__Statement__Group_5__2"


    // $ANTLR start "rule__Statement__Group_5__2__Impl"
    // InternalMiniJava.g:2943:1: rule__Statement__Group_5__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_5_2 ) ) ;
    public final void rule__Statement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2947:1: ( ( ( rule__Statement__FirstExpressionAssignment_5_2 ) ) )
            // InternalMiniJava.g:2948:1: ( ( rule__Statement__FirstExpressionAssignment_5_2 ) )
            {
            // InternalMiniJava.g:2948:1: ( ( rule__Statement__FirstExpressionAssignment_5_2 ) )
            // InternalMiniJava.g:2949:2: ( rule__Statement__FirstExpressionAssignment_5_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_5_2()); 
            // InternalMiniJava.g:2950:2: ( rule__Statement__FirstExpressionAssignment_5_2 )
            // InternalMiniJava.g:2950:3: rule__Statement__FirstExpressionAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FirstExpressionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFirstExpressionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__2__Impl"


    // $ANTLR start "rule__Statement__Group_5__3"
    // InternalMiniJava.g:2958:1: rule__Statement__Group_5__3 : rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 ;
    public final void rule__Statement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2962:1: ( rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 )
            // InternalMiniJava.g:2963:2: rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4
            {
            pushFollow(FOLLOW_32);
            rule__Statement__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__4();

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
    // $ANTLR end "rule__Statement__Group_5__3"


    // $ANTLR start "rule__Statement__Group_5__3__Impl"
    // InternalMiniJava.g:2970:1: rule__Statement__Group_5__3__Impl : ( ']' ) ;
    public final void rule__Statement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2974:1: ( ( ']' ) )
            // InternalMiniJava.g:2975:1: ( ']' )
            {
            // InternalMiniJava.g:2975:1: ( ']' )
            // InternalMiniJava.g:2976:2: ']'
            {
             before(grammarAccess.getStatementAccess().getRightSquareBracketKeyword_5_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightSquareBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__3__Impl"


    // $ANTLR start "rule__Statement__Group_5__4"
    // InternalMiniJava.g:2985:1: rule__Statement__Group_5__4 : rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5 ;
    public final void rule__Statement__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2989:1: ( rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5 )
            // InternalMiniJava.g:2990:2: rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5
            {
            pushFollow(FOLLOW_29);
            rule__Statement__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__5();

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
    // $ANTLR end "rule__Statement__Group_5__4"


    // $ANTLR start "rule__Statement__Group_5__4__Impl"
    // InternalMiniJava.g:2997:1: rule__Statement__Group_5__4__Impl : ( ( rule__Statement__StatementTypeAssignment_5_4 ) ) ;
    public final void rule__Statement__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3001:1: ( ( ( rule__Statement__StatementTypeAssignment_5_4 ) ) )
            // InternalMiniJava.g:3002:1: ( ( rule__Statement__StatementTypeAssignment_5_4 ) )
            {
            // InternalMiniJava.g:3002:1: ( ( rule__Statement__StatementTypeAssignment_5_4 ) )
            // InternalMiniJava.g:3003:2: ( rule__Statement__StatementTypeAssignment_5_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_5_4()); 
            // InternalMiniJava.g:3004:2: ( rule__Statement__StatementTypeAssignment_5_4 )
            // InternalMiniJava.g:3004:3: rule__Statement__StatementTypeAssignment_5_4
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementTypeAssignment_5_4();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementTypeAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__4__Impl"


    // $ANTLR start "rule__Statement__Group_5__5"
    // InternalMiniJava.g:3012:1: rule__Statement__Group_5__5 : rule__Statement__Group_5__5__Impl rule__Statement__Group_5__6 ;
    public final void rule__Statement__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3016:1: ( rule__Statement__Group_5__5__Impl rule__Statement__Group_5__6 )
            // InternalMiniJava.g:3017:2: rule__Statement__Group_5__5__Impl rule__Statement__Group_5__6
            {
            pushFollow(FOLLOW_22);
            rule__Statement__Group_5__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__6();

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
    // $ANTLR end "rule__Statement__Group_5__5"


    // $ANTLR start "rule__Statement__Group_5__5__Impl"
    // InternalMiniJava.g:3024:1: rule__Statement__Group_5__5__Impl : ( ( rule__Statement__SecondExpressionAssignment_5_5 ) ) ;
    public final void rule__Statement__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3028:1: ( ( ( rule__Statement__SecondExpressionAssignment_5_5 ) ) )
            // InternalMiniJava.g:3029:1: ( ( rule__Statement__SecondExpressionAssignment_5_5 ) )
            {
            // InternalMiniJava.g:3029:1: ( ( rule__Statement__SecondExpressionAssignment_5_5 ) )
            // InternalMiniJava.g:3030:2: ( rule__Statement__SecondExpressionAssignment_5_5 )
            {
             before(grammarAccess.getStatementAccess().getSecondExpressionAssignment_5_5()); 
            // InternalMiniJava.g:3031:2: ( rule__Statement__SecondExpressionAssignment_5_5 )
            // InternalMiniJava.g:3031:3: rule__Statement__SecondExpressionAssignment_5_5
            {
            pushFollow(FOLLOW_2);
            rule__Statement__SecondExpressionAssignment_5_5();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getSecondExpressionAssignment_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__5__Impl"


    // $ANTLR start "rule__Statement__Group_5__6"
    // InternalMiniJava.g:3039:1: rule__Statement__Group_5__6 : rule__Statement__Group_5__6__Impl ;
    public final void rule__Statement__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3043:1: ( rule__Statement__Group_5__6__Impl )
            // InternalMiniJava.g:3044:2: rule__Statement__Group_5__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__6__Impl();

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
    // $ANTLR end "rule__Statement__Group_5__6"


    // $ANTLR start "rule__Statement__Group_5__6__Impl"
    // InternalMiniJava.g:3050:1: rule__Statement__Group_5__6__Impl : ( ';' ) ;
    public final void rule__Statement__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3054:1: ( ( ';' ) )
            // InternalMiniJava.g:3055:1: ( ';' )
            {
            // InternalMiniJava.g:3055:1: ( ';' )
            // InternalMiniJava.g:3056:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_5_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_5_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__6__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMiniJava.g:3066:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3070:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMiniJava.g:3071:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMiniJava.g:3078:1: rule__Expression__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3082:1: ( ( ruleAddition ) )
            // InternalMiniJava.g:3083:1: ( ruleAddition )
            {
            // InternalMiniJava.g:3083:1: ( ruleAddition )
            // InternalMiniJava.g:3084:2: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMiniJava.g:3093:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3097:1: ( rule__Expression__Group__1__Impl )
            // InternalMiniJava.g:3098:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMiniJava.g:3104:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3108:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalMiniJava.g:3109:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalMiniJava.g:3109:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalMiniJava.g:3110:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalMiniJava.g:3111:2: ( rule__Expression__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:3111:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMiniJava.g:3120:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3124:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMiniJava.g:3125:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalMiniJava.g:3132:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3136:1: ( ( () ) )
            // InternalMiniJava.g:3137:1: ( () )
            {
            // InternalMiniJava.g:3137:1: ( () )
            // InternalMiniJava.g:3138:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 
            // InternalMiniJava.g:3139:2: ()
            // InternalMiniJava.g:3139:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMiniJava.g:3147:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3151:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalMiniJava.g:3152:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMiniJava.g:3159:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3163:1: ( ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3164:1: ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3164:1: ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3165:2: ( rule__Expression__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3166:2: ( rule__Expression__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3166:3: rule__Expression__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalMiniJava.g:3174:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3178:1: ( rule__Expression__Group_1__2__Impl )
            // InternalMiniJava.g:3179:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalMiniJava.g:3185:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3189:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3190:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3190:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3191:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3192:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalMiniJava.g:3192:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalMiniJava.g:3201:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3205:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalMiniJava.g:3206:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalMiniJava.g:3213:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3217:1: ( ( ruleMultiplication ) )
            // InternalMiniJava.g:3218:1: ( ruleMultiplication )
            {
            // InternalMiniJava.g:3218:1: ( ruleMultiplication )
            // InternalMiniJava.g:3219:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalMiniJava.g:3228:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3232:1: ( rule__Addition__Group__1__Impl )
            // InternalMiniJava.g:3233:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalMiniJava.g:3239:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3243:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalMiniJava.g:3244:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalMiniJava.g:3244:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalMiniJava.g:3245:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalMiniJava.g:3246:2: ( rule__Addition__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=11 && LA19_0<=12)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniJava.g:3246:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalMiniJava.g:3255:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3259:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalMiniJava.g:3260:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalMiniJava.g:3267:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3271:1: ( ( () ) )
            // InternalMiniJava.g:3272:1: ( () )
            {
            // InternalMiniJava.g:3272:1: ( () )
            // InternalMiniJava.g:3273:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalMiniJava.g:3274:2: ()
            // InternalMiniJava.g:3274:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalMiniJava.g:3282:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3286:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalMiniJava.g:3287:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalMiniJava.g:3294:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3298:1: ( ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3299:1: ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3299:1: ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3300:2: ( rule__Addition__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3301:2: ( rule__Addition__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3301:3: rule__Addition__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalMiniJava.g:3309:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3313:1: ( rule__Addition__Group_1__2__Impl )
            // InternalMiniJava.g:3314:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalMiniJava.g:3320:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3324:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3325:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3325:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3326:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3327:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalMiniJava.g:3327:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalMiniJava.g:3336:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3340:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalMiniJava.g:3341:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalMiniJava.g:3348:1: rule__Multiplication__Group__0__Impl : ( ruleNegationOrPointExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3352:1: ( ( ruleNegationOrPointExpression ) )
            // InternalMiniJava.g:3353:1: ( ruleNegationOrPointExpression )
            {
            // InternalMiniJava.g:3353:1: ( ruleNegationOrPointExpression )
            // InternalMiniJava.g:3354:2: ruleNegationOrPointExpression
            {
             before(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNegationOrPointExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalMiniJava.g:3363:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3367:1: ( rule__Multiplication__Group__1__Impl )
            // InternalMiniJava.g:3368:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalMiniJava.g:3374:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3378:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalMiniJava.g:3379:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalMiniJava.g:3379:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalMiniJava.g:3380:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalMiniJava.g:3381:2: ( rule__Multiplication__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=13 && LA20_0<=14)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMiniJava.g:3381:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalMiniJava.g:3390:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3394:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalMiniJava.g:3395:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalMiniJava.g:3402:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3406:1: ( ( () ) )
            // InternalMiniJava.g:3407:1: ( () )
            {
            // InternalMiniJava.g:3407:1: ( () )
            // InternalMiniJava.g:3408:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalMiniJava.g:3409:2: ()
            // InternalMiniJava.g:3409:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalMiniJava.g:3417:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3421:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalMiniJava.g:3422:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalMiniJava.g:3429:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3433:1: ( ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3434:1: ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3434:1: ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3435:2: ( rule__Multiplication__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3436:2: ( rule__Multiplication__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3436:3: rule__Multiplication__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalMiniJava.g:3444:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3448:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalMiniJava.g:3449:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalMiniJava.g:3455:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3459:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3460:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3460:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3461:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3462:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalMiniJava.g:3462:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Negation__Group__0"
    // InternalMiniJava.g:3471:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3475:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // InternalMiniJava.g:3476:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__1();

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
    // $ANTLR end "rule__Negation__Group__0"


    // $ANTLR start "rule__Negation__Group__0__Impl"
    // InternalMiniJava.g:3483:1: rule__Negation__Group__0__Impl : ( ( rule__Negation__ExpressionTypeAssignment_0 ) ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3487:1: ( ( ( rule__Negation__ExpressionTypeAssignment_0 ) ) )
            // InternalMiniJava.g:3488:1: ( ( rule__Negation__ExpressionTypeAssignment_0 ) )
            {
            // InternalMiniJava.g:3488:1: ( ( rule__Negation__ExpressionTypeAssignment_0 ) )
            // InternalMiniJava.g:3489:2: ( rule__Negation__ExpressionTypeAssignment_0 )
            {
             before(grammarAccess.getNegationAccess().getExpressionTypeAssignment_0()); 
            // InternalMiniJava.g:3490:2: ( rule__Negation__ExpressionTypeAssignment_0 )
            // InternalMiniJava.g:3490:3: rule__Negation__ExpressionTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Negation__ExpressionTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getExpressionTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0__Impl"


    // $ANTLR start "rule__Negation__Group__1"
    // InternalMiniJava.g:3498:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3502:1: ( rule__Negation__Group__1__Impl )
            // InternalMiniJava.g:3503:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__1__Impl();

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
    // $ANTLR end "rule__Negation__Group__1"


    // $ANTLR start "rule__Negation__Group__1__Impl"
    // InternalMiniJava.g:3509:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__RightAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3513:1: ( ( ( rule__Negation__RightAssignment_1 ) ) )
            // InternalMiniJava.g:3514:1: ( ( rule__Negation__RightAssignment_1 ) )
            {
            // InternalMiniJava.g:3514:1: ( ( rule__Negation__RightAssignment_1 ) )
            // InternalMiniJava.g:3515:2: ( rule__Negation__RightAssignment_1 )
            {
             before(grammarAccess.getNegationAccess().getRightAssignment_1()); 
            // InternalMiniJava.g:3516:2: ( rule__Negation__RightAssignment_1 )
            // InternalMiniJava.g:3516:3: rule__Negation__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Negation__RightAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getRightAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalMiniJava.g:3525:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3529:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalMiniJava.g:3530:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

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
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalMiniJava.g:3537:1: rule__Point__Group__0__Impl : ( ruleSquareBrackets ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3541:1: ( ( ruleSquareBrackets ) )
            // InternalMiniJava.g:3542:1: ( ruleSquareBrackets )
            {
            // InternalMiniJava.g:3542:1: ( ruleSquareBrackets )
            // InternalMiniJava.g:3543:2: ruleSquareBrackets
            {
             before(grammarAccess.getPointAccess().getSquareBracketsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSquareBrackets();

            state._fsp--;

             after(grammarAccess.getPointAccess().getSquareBracketsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalMiniJava.g:3552:1: rule__Point__Group__1 : rule__Point__Group__1__Impl ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3556:1: ( rule__Point__Group__1__Impl )
            // InternalMiniJava.g:3557:2: rule__Point__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__1__Impl();

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
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalMiniJava.g:3563:1: rule__Point__Group__1__Impl : ( ( rule__Point__Group_1__0 )* ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3567:1: ( ( ( rule__Point__Group_1__0 )* ) )
            // InternalMiniJava.g:3568:1: ( ( rule__Point__Group_1__0 )* )
            {
            // InternalMiniJava.g:3568:1: ( ( rule__Point__Group_1__0 )* )
            // InternalMiniJava.g:3569:2: ( rule__Point__Group_1__0 )*
            {
             before(grammarAccess.getPointAccess().getGroup_1()); 
            // InternalMiniJava.g:3570:2: ( rule__Point__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==40) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMiniJava.g:3570:3: rule__Point__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Point__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPointAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group_1__0"
    // InternalMiniJava.g:3579:1: rule__Point__Group_1__0 : rule__Point__Group_1__0__Impl rule__Point__Group_1__1 ;
    public final void rule__Point__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3583:1: ( rule__Point__Group_1__0__Impl rule__Point__Group_1__1 )
            // InternalMiniJava.g:3584:2: rule__Point__Group_1__0__Impl rule__Point__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Point__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group_1__1();

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
    // $ANTLR end "rule__Point__Group_1__0"


    // $ANTLR start "rule__Point__Group_1__0__Impl"
    // InternalMiniJava.g:3591:1: rule__Point__Group_1__0__Impl : ( () ) ;
    public final void rule__Point__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3595:1: ( ( () ) )
            // InternalMiniJava.g:3596:1: ( () )
            {
            // InternalMiniJava.g:3596:1: ( () )
            // InternalMiniJava.g:3597:2: ()
            {
             before(grammarAccess.getPointAccess().getPointLeftAction_1_0()); 
            // InternalMiniJava.g:3598:2: ()
            // InternalMiniJava.g:3598:3: 
            {
            }

             after(grammarAccess.getPointAccess().getPointLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__0__Impl"


    // $ANTLR start "rule__Point__Group_1__1"
    // InternalMiniJava.g:3606:1: rule__Point__Group_1__1 : rule__Point__Group_1__1__Impl rule__Point__Group_1__2 ;
    public final void rule__Point__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3610:1: ( rule__Point__Group_1__1__Impl rule__Point__Group_1__2 )
            // InternalMiniJava.g:3611:2: rule__Point__Group_1__1__Impl rule__Point__Group_1__2
            {
            pushFollow(FOLLOW_40);
            rule__Point__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group_1__2();

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
    // $ANTLR end "rule__Point__Group_1__1"


    // $ANTLR start "rule__Point__Group_1__1__Impl"
    // InternalMiniJava.g:3618:1: rule__Point__Group_1__1__Impl : ( ( rule__Point__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Point__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3622:1: ( ( ( rule__Point__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3623:1: ( ( rule__Point__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3623:1: ( ( rule__Point__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3624:2: ( rule__Point__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getPointAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3625:2: ( rule__Point__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3625:3: rule__Point__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__1__Impl"


    // $ANTLR start "rule__Point__Group_1__2"
    // InternalMiniJava.g:3633:1: rule__Point__Group_1__2 : rule__Point__Group_1__2__Impl ;
    public final void rule__Point__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3637:1: ( rule__Point__Group_1__2__Impl )
            // InternalMiniJava.g:3638:2: rule__Point__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group_1__2__Impl();

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
    // $ANTLR end "rule__Point__Group_1__2"


    // $ANTLR start "rule__Point__Group_1__2__Impl"
    // InternalMiniJava.g:3644:1: rule__Point__Group_1__2__Impl : ( ( rule__Point__RightAssignment_1_2 ) ) ;
    public final void rule__Point__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3648:1: ( ( ( rule__Point__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3649:1: ( ( rule__Point__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3649:1: ( ( rule__Point__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3650:2: ( rule__Point__RightAssignment_1_2 )
            {
             before(grammarAccess.getPointAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3651:2: ( rule__Point__RightAssignment_1_2 )
            // InternalMiniJava.g:3651:3: rule__Point__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Point__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_1__2__Impl"


    // $ANTLR start "rule__SquareBrackets__Group__0"
    // InternalMiniJava.g:3660:1: rule__SquareBrackets__Group__0 : rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1 ;
    public final void rule__SquareBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3664:1: ( rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1 )
            // InternalMiniJava.g:3665:2: rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SquareBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group__1();

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
    // $ANTLR end "rule__SquareBrackets__Group__0"


    // $ANTLR start "rule__SquareBrackets__Group__0__Impl"
    // InternalMiniJava.g:3672:1: rule__SquareBrackets__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__SquareBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3676:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:3677:1: ( rulePrimary )
            {
            // InternalMiniJava.g:3677:1: ( rulePrimary )
            // InternalMiniJava.g:3678:2: rulePrimary
            {
             before(grammarAccess.getSquareBracketsAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getSquareBracketsAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group__0__Impl"


    // $ANTLR start "rule__SquareBrackets__Group__1"
    // InternalMiniJava.g:3687:1: rule__SquareBrackets__Group__1 : rule__SquareBrackets__Group__1__Impl ;
    public final void rule__SquareBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3691:1: ( rule__SquareBrackets__Group__1__Impl )
            // InternalMiniJava.g:3692:2: rule__SquareBrackets__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group__1__Impl();

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
    // $ANTLR end "rule__SquareBrackets__Group__1"


    // $ANTLR start "rule__SquareBrackets__Group__1__Impl"
    // InternalMiniJava.g:3698:1: rule__SquareBrackets__Group__1__Impl : ( ( rule__SquareBrackets__Group_1__0 )? ) ;
    public final void rule__SquareBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3702:1: ( ( ( rule__SquareBrackets__Group_1__0 )? ) )
            // InternalMiniJava.g:3703:1: ( ( rule__SquareBrackets__Group_1__0 )? )
            {
            // InternalMiniJava.g:3703:1: ( ( rule__SquareBrackets__Group_1__0 )? )
            // InternalMiniJava.g:3704:2: ( rule__SquareBrackets__Group_1__0 )?
            {
             before(grammarAccess.getSquareBracketsAccess().getGroup_1()); 
            // InternalMiniJava.g:3705:2: ( rule__SquareBrackets__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMiniJava.g:3705:3: rule__SquareBrackets__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SquareBrackets__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSquareBracketsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group__1__Impl"


    // $ANTLR start "rule__SquareBrackets__Group_1__0"
    // InternalMiniJava.g:3714:1: rule__SquareBrackets__Group_1__0 : rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1 ;
    public final void rule__SquareBrackets__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3718:1: ( rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1 )
            // InternalMiniJava.g:3719:2: rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__SquareBrackets__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group_1__1();

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
    // $ANTLR end "rule__SquareBrackets__Group_1__0"


    // $ANTLR start "rule__SquareBrackets__Group_1__0__Impl"
    // InternalMiniJava.g:3726:1: rule__SquareBrackets__Group_1__0__Impl : ( () ) ;
    public final void rule__SquareBrackets__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3730:1: ( ( () ) )
            // InternalMiniJava.g:3731:1: ( () )
            {
            // InternalMiniJava.g:3731:1: ( () )
            // InternalMiniJava.g:3732:2: ()
            {
             before(grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0()); 
            // InternalMiniJava.g:3733:2: ()
            // InternalMiniJava.g:3733:3: 
            {
            }

             after(grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__0__Impl"


    // $ANTLR start "rule__SquareBrackets__Group_1__1"
    // InternalMiniJava.g:3741:1: rule__SquareBrackets__Group_1__1 : rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2 ;
    public final void rule__SquareBrackets__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3745:1: ( rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2 )
            // InternalMiniJava.g:3746:2: rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__SquareBrackets__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group_1__2();

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
    // $ANTLR end "rule__SquareBrackets__Group_1__1"


    // $ANTLR start "rule__SquareBrackets__Group_1__1__Impl"
    // InternalMiniJava.g:3753:1: rule__SquareBrackets__Group_1__1__Impl : ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__SquareBrackets__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3757:1: ( ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3758:1: ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3758:1: ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3759:2: ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3760:2: ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3760:3: rule__SquareBrackets__ExpressionTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__ExpressionTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSquareBracketsAccess().getExpressionTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__1__Impl"


    // $ANTLR start "rule__SquareBrackets__Group_1__2"
    // InternalMiniJava.g:3768:1: rule__SquareBrackets__Group_1__2 : rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3 ;
    public final void rule__SquareBrackets__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3772:1: ( rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3 )
            // InternalMiniJava.g:3773:2: rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__SquareBrackets__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group_1__3();

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
    // $ANTLR end "rule__SquareBrackets__Group_1__2"


    // $ANTLR start "rule__SquareBrackets__Group_1__2__Impl"
    // InternalMiniJava.g:3780:1: rule__SquareBrackets__Group_1__2__Impl : ( ( rule__SquareBrackets__RightAssignment_1_2 ) ) ;
    public final void rule__SquareBrackets__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3784:1: ( ( ( rule__SquareBrackets__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3785:1: ( ( rule__SquareBrackets__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3785:1: ( ( rule__SquareBrackets__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3786:2: ( rule__SquareBrackets__RightAssignment_1_2 )
            {
             before(grammarAccess.getSquareBracketsAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3787:2: ( rule__SquareBrackets__RightAssignment_1_2 )
            // InternalMiniJava.g:3787:3: rule__SquareBrackets__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSquareBracketsAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__2__Impl"


    // $ANTLR start "rule__SquareBrackets__Group_1__3"
    // InternalMiniJava.g:3795:1: rule__SquareBrackets__Group_1__3 : rule__SquareBrackets__Group_1__3__Impl ;
    public final void rule__SquareBrackets__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3799:1: ( rule__SquareBrackets__Group_1__3__Impl )
            // InternalMiniJava.g:3800:2: rule__SquareBrackets__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquareBrackets__Group_1__3__Impl();

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
    // $ANTLR end "rule__SquareBrackets__Group_1__3"


    // $ANTLR start "rule__SquareBrackets__Group_1__3__Impl"
    // InternalMiniJava.g:3806:1: rule__SquareBrackets__Group_1__3__Impl : ( ']' ) ;
    public final void rule__SquareBrackets__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3810:1: ( ( ']' ) )
            // InternalMiniJava.g:3811:1: ( ']' )
            {
            // InternalMiniJava.g:3811:1: ( ']' )
            // InternalMiniJava.g:3812:2: ']'
            {
             before(grammarAccess.getSquareBracketsAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSquareBracketsAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__Group_1__3__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalMiniJava.g:3822:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3826:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalMiniJava.g:3827:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

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
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalMiniJava.g:3834:1: rule__Primary__Group_3__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3838:1: ( ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) ) )
            // InternalMiniJava.g:3839:1: ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) )
            {
            // InternalMiniJava.g:3839:1: ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) )
            // InternalMiniJava.g:3840:2: ( rule__Primary__ExpressionTypeAssignment_3_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_3_0()); 
            // InternalMiniJava.g:3841:2: ( rule__Primary__ExpressionTypeAssignment_3_0 )
            // InternalMiniJava.g:3841:3: rule__Primary__ExpressionTypeAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionTypeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalMiniJava.g:3849:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3853:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalMiniJava.g:3854:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

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
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalMiniJava.g:3861:1: rule__Primary__Group_3__1__Impl : ( 'int' ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3865:1: ( ( 'int' ) )
            // InternalMiniJava.g:3866:1: ( 'int' )
            {
            // InternalMiniJava.g:3866:1: ( 'int' )
            // InternalMiniJava.g:3867:2: 'int'
            {
             before(grammarAccess.getPrimaryAccess().getIntKeyword_3_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getIntKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalMiniJava.g:3876:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3880:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalMiniJava.g:3881:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
            {
            pushFollow(FOLLOW_29);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__3();

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
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalMiniJava.g:3888:1: rule__Primary__Group_3__2__Impl : ( '[' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3892:1: ( ( '[' ) )
            // InternalMiniJava.g:3893:1: ( '[' )
            {
            // InternalMiniJava.g:3893:1: ( '[' )
            // InternalMiniJava.g:3894:2: '['
            {
             before(grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_3_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__3"
    // InternalMiniJava.g:3903:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3907:1: ( rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 )
            // InternalMiniJava.g:3908:2: rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4
            {
            pushFollow(FOLLOW_15);
            rule__Primary__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__4();

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
    // $ANTLR end "rule__Primary__Group_3__3"


    // $ANTLR start "rule__Primary__Group_3__3__Impl"
    // InternalMiniJava.g:3915:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__ExpressionAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3919:1: ( ( ( rule__Primary__ExpressionAssignment_3_3 ) ) )
            // InternalMiniJava.g:3920:1: ( ( rule__Primary__ExpressionAssignment_3_3 ) )
            {
            // InternalMiniJava.g:3920:1: ( ( rule__Primary__ExpressionAssignment_3_3 ) )
            // InternalMiniJava.g:3921:2: ( rule__Primary__ExpressionAssignment_3_3 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_3_3()); 
            // InternalMiniJava.g:3922:2: ( rule__Primary__ExpressionAssignment_3_3 )
            // InternalMiniJava.g:3922:3: rule__Primary__ExpressionAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3__Impl"


    // $ANTLR start "rule__Primary__Group_3__4"
    // InternalMiniJava.g:3930:1: rule__Primary__Group_3__4 : rule__Primary__Group_3__4__Impl ;
    public final void rule__Primary__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3934:1: ( rule__Primary__Group_3__4__Impl )
            // InternalMiniJava.g:3935:2: rule__Primary__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__4__Impl();

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
    // $ANTLR end "rule__Primary__Group_3__4"


    // $ANTLR start "rule__Primary__Group_3__4__Impl"
    // InternalMiniJava.g:3941:1: rule__Primary__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Primary__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3945:1: ( ( ']' ) )
            // InternalMiniJava.g:3946:1: ( ']' )
            {
            // InternalMiniJava.g:3946:1: ( ']' )
            // InternalMiniJava.g:3947:2: ']'
            {
             before(grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__4__Impl"


    // $ANTLR start "rule__Primary__Group_4__0"
    // InternalMiniJava.g:3957:1: rule__Primary__Group_4__0 : rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 ;
    public final void rule__Primary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3961:1: ( rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 )
            // InternalMiniJava.g:3962:2: rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Primary__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__1();

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
    // $ANTLR end "rule__Primary__Group_4__0"


    // $ANTLR start "rule__Primary__Group_4__0__Impl"
    // InternalMiniJava.g:3969:1: rule__Primary__Group_4__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) ) ;
    public final void rule__Primary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3973:1: ( ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) ) )
            // InternalMiniJava.g:3974:1: ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) )
            {
            // InternalMiniJava.g:3974:1: ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) )
            // InternalMiniJava.g:3975:2: ( rule__Primary__ExpressionTypeAssignment_4_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_4_0()); 
            // InternalMiniJava.g:3976:2: ( rule__Primary__ExpressionTypeAssignment_4_0 )
            // InternalMiniJava.g:3976:3: rule__Primary__ExpressionTypeAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionTypeAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0__Impl"


    // $ANTLR start "rule__Primary__Group_4__1"
    // InternalMiniJava.g:3984:1: rule__Primary__Group_4__1 : rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 ;
    public final void rule__Primary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3988:1: ( rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 )
            // InternalMiniJava.g:3989:2: rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__2();

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
    // $ANTLR end "rule__Primary__Group_4__1"


    // $ANTLR start "rule__Primary__Group_4__1__Impl"
    // InternalMiniJava.g:3996:1: rule__Primary__Group_4__1__Impl : ( ( rule__Primary__TypeAssignment_4_1 ) ) ;
    public final void rule__Primary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4000:1: ( ( ( rule__Primary__TypeAssignment_4_1 ) ) )
            // InternalMiniJava.g:4001:1: ( ( rule__Primary__TypeAssignment_4_1 ) )
            {
            // InternalMiniJava.g:4001:1: ( ( rule__Primary__TypeAssignment_4_1 ) )
            // InternalMiniJava.g:4002:2: ( rule__Primary__TypeAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryAccess().getTypeAssignment_4_1()); 
            // InternalMiniJava.g:4003:2: ( rule__Primary__TypeAssignment_4_1 )
            // InternalMiniJava.g:4003:3: rule__Primary__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_4__2"
    // InternalMiniJava.g:4011:1: rule__Primary__Group_4__2 : rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3 ;
    public final void rule__Primary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4015:1: ( rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3 )
            // InternalMiniJava.g:4016:2: rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__3();

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
    // $ANTLR end "rule__Primary__Group_4__2"


    // $ANTLR start "rule__Primary__Group_4__2__Impl"
    // InternalMiniJava.g:4023:1: rule__Primary__Group_4__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4027:1: ( ( '(' ) )
            // InternalMiniJava.g:4028:1: ( '(' )
            {
            // InternalMiniJava.g:4028:1: ( '(' )
            // InternalMiniJava.g:4029:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2__Impl"


    // $ANTLR start "rule__Primary__Group_4__3"
    // InternalMiniJava.g:4038:1: rule__Primary__Group_4__3 : rule__Primary__Group_4__3__Impl ;
    public final void rule__Primary__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4042:1: ( rule__Primary__Group_4__3__Impl )
            // InternalMiniJava.g:4043:2: rule__Primary__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__3__Impl();

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
    // $ANTLR end "rule__Primary__Group_4__3"


    // $ANTLR start "rule__Primary__Group_4__3__Impl"
    // InternalMiniJava.g:4049:1: rule__Primary__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4053:1: ( ( ')' ) )
            // InternalMiniJava.g:4054:1: ( ')' )
            {
            // InternalMiniJava.g:4054:1: ( ')' )
            // InternalMiniJava.g:4055:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__3__Impl"


    // $ANTLR start "rule__Primary__Group_5__0"
    // InternalMiniJava.g:4065:1: rule__Primary__Group_5__0 : rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1 ;
    public final void rule__Primary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4069:1: ( rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1 )
            // InternalMiniJava.g:4070:2: rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__Primary__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__1();

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
    // $ANTLR end "rule__Primary__Group_5__0"


    // $ANTLR start "rule__Primary__Group_5__0__Impl"
    // InternalMiniJava.g:4077:1: rule__Primary__Group_5__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) ) ;
    public final void rule__Primary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4081:1: ( ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) ) )
            // InternalMiniJava.g:4082:1: ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) )
            {
            // InternalMiniJava.g:4082:1: ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) )
            // InternalMiniJava.g:4083:2: ( rule__Primary__ExpressionTypeAssignment_5_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_5_0()); 
            // InternalMiniJava.g:4084:2: ( rule__Primary__ExpressionTypeAssignment_5_0 )
            // InternalMiniJava.g:4084:3: rule__Primary__ExpressionTypeAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionTypeAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__0__Impl"


    // $ANTLR start "rule__Primary__Group_5__1"
    // InternalMiniJava.g:4092:1: rule__Primary__Group_5__1 : rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2 ;
    public final void rule__Primary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4096:1: ( rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2 )
            // InternalMiniJava.g:4097:2: rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__2();

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
    // $ANTLR end "rule__Primary__Group_5__1"


    // $ANTLR start "rule__Primary__Group_5__1__Impl"
    // InternalMiniJava.g:4104:1: rule__Primary__Group_5__1__Impl : ( ( rule__Primary__ExpressionAssignment_5_1 ) ) ;
    public final void rule__Primary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4108:1: ( ( ( rule__Primary__ExpressionAssignment_5_1 ) ) )
            // InternalMiniJava.g:4109:1: ( ( rule__Primary__ExpressionAssignment_5_1 ) )
            {
            // InternalMiniJava.g:4109:1: ( ( rule__Primary__ExpressionAssignment_5_1 ) )
            // InternalMiniJava.g:4110:2: ( rule__Primary__ExpressionAssignment_5_1 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_5_1()); 
            // InternalMiniJava.g:4111:2: ( rule__Primary__ExpressionAssignment_5_1 )
            // InternalMiniJava.g:4111:3: rule__Primary__ExpressionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__1__Impl"


    // $ANTLR start "rule__Primary__Group_5__2"
    // InternalMiniJava.g:4119:1: rule__Primary__Group_5__2 : rule__Primary__Group_5__2__Impl ;
    public final void rule__Primary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4123:1: ( rule__Primary__Group_5__2__Impl )
            // InternalMiniJava.g:4124:2: rule__Primary__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_5__2"


    // $ANTLR start "rule__Primary__Group_5__2__Impl"
    // InternalMiniJava.g:4130:1: rule__Primary__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4134:1: ( ( ')' ) )
            // InternalMiniJava.g:4135:1: ( ')' )
            {
            // InternalMiniJava.g:4135:1: ( ')' )
            // InternalMiniJava.g:4136:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__2__Impl"


    // $ANTLR start "rule__MethodCall__Group__0"
    // InternalMiniJava.g:4146:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4150:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // InternalMiniJava.g:4151:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__1();

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
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // InternalMiniJava.g:4158:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__MethodAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4162:1: ( ( ( rule__MethodCall__MethodAssignment_0 ) ) )
            // InternalMiniJava.g:4163:1: ( ( rule__MethodCall__MethodAssignment_0 ) )
            {
            // InternalMiniJava.g:4163:1: ( ( rule__MethodCall__MethodAssignment_0 ) )
            // InternalMiniJava.g:4164:2: ( rule__MethodCall__MethodAssignment_0 )
            {
             before(grammarAccess.getMethodCallAccess().getMethodAssignment_0()); 
            // InternalMiniJava.g:4165:2: ( rule__MethodCall__MethodAssignment_0 )
            // InternalMiniJava.g:4165:3: rule__MethodCall__MethodAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__MethodAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getMethodAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0__Impl"


    // $ANTLR start "rule__MethodCall__Group__1"
    // InternalMiniJava.g:4173:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4177:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // InternalMiniJava.g:4178:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__2();

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
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // InternalMiniJava.g:4185:1: rule__MethodCall__Group__1__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4189:1: ( ( '(' ) )
            // InternalMiniJava.g:4190:1: ( '(' )
            {
            // InternalMiniJava.g:4190:1: ( '(' )
            // InternalMiniJava.g:4191:2: '('
            {
             before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__2"
    // InternalMiniJava.g:4200:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4204:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // InternalMiniJava.g:4205:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__3();

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
    // $ANTLR end "rule__MethodCall__Group__2"


    // $ANTLR start "rule__MethodCall__Group__2__Impl"
    // InternalMiniJava.g:4212:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__Group_2__0 )? ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4216:1: ( ( ( rule__MethodCall__Group_2__0 )? ) )
            // InternalMiniJava.g:4217:1: ( ( rule__MethodCall__Group_2__0 )? )
            {
            // InternalMiniJava.g:4217:1: ( ( rule__MethodCall__Group_2__0 )? )
            // InternalMiniJava.g:4218:2: ( rule__MethodCall__Group_2__0 )?
            {
             before(grammarAccess.getMethodCallAccess().getGroup_2()); 
            // InternalMiniJava.g:4219:2: ( rule__MethodCall__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==22||LA23_0==39||(LA23_0>=41 && LA23_0<=44)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMiniJava.g:4219:3: rule__MethodCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__2__Impl"


    // $ANTLR start "rule__MethodCall__Group__3"
    // InternalMiniJava.g:4227:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4231:1: ( rule__MethodCall__Group__3__Impl )
            // InternalMiniJava.g:4232:2: rule__MethodCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__3__Impl();

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
    // $ANTLR end "rule__MethodCall__Group__3"


    // $ANTLR start "rule__MethodCall__Group__3__Impl"
    // InternalMiniJava.g:4238:1: rule__MethodCall__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4242:1: ( ( ')' ) )
            // InternalMiniJava.g:4243:1: ( ')' )
            {
            // InternalMiniJava.g:4243:1: ( ')' )
            // InternalMiniJava.g:4244:2: ')'
            {
             before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__3__Impl"


    // $ANTLR start "rule__MethodCall__Group_2__0"
    // InternalMiniJava.g:4254:1: rule__MethodCall__Group_2__0 : rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 ;
    public final void rule__MethodCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4258:1: ( rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 )
            // InternalMiniJava.g:4259:2: rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__MethodCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2__1();

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
    // $ANTLR end "rule__MethodCall__Group_2__0"


    // $ANTLR start "rule__MethodCall__Group_2__0__Impl"
    // InternalMiniJava.g:4266:1: rule__MethodCall__Group_2__0__Impl : ( ( rule__MethodCall__ParametersAssignment_2_0 ) ) ;
    public final void rule__MethodCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4270:1: ( ( ( rule__MethodCall__ParametersAssignment_2_0 ) ) )
            // InternalMiniJava.g:4271:1: ( ( rule__MethodCall__ParametersAssignment_2_0 ) )
            {
            // InternalMiniJava.g:4271:1: ( ( rule__MethodCall__ParametersAssignment_2_0 ) )
            // InternalMiniJava.g:4272:2: ( rule__MethodCall__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getMethodCallAccess().getParametersAssignment_2_0()); 
            // InternalMiniJava.g:4273:2: ( rule__MethodCall__ParametersAssignment_2_0 )
            // InternalMiniJava.g:4273:3: rule__MethodCall__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getParametersAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_2__1"
    // InternalMiniJava.g:4281:1: rule__MethodCall__Group_2__1 : rule__MethodCall__Group_2__1__Impl ;
    public final void rule__MethodCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4285:1: ( rule__MethodCall__Group_2__1__Impl )
            // InternalMiniJava.g:4286:2: rule__MethodCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2__1__Impl();

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
    // $ANTLR end "rule__MethodCall__Group_2__1"


    // $ANTLR start "rule__MethodCall__Group_2__1__Impl"
    // InternalMiniJava.g:4292:1: rule__MethodCall__Group_2__1__Impl : ( ( rule__MethodCall__Group_2_1__0 )* ) ;
    public final void rule__MethodCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4296:1: ( ( ( rule__MethodCall__Group_2_1__0 )* ) )
            // InternalMiniJava.g:4297:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            {
            // InternalMiniJava.g:4297:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            // InternalMiniJava.g:4298:2: ( rule__MethodCall__Group_2_1__0 )*
            {
             before(grammarAccess.getMethodCallAccess().getGroup_2_1()); 
            // InternalMiniJava.g:4299:2: ( rule__MethodCall__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMiniJava.g:4299:3: rule__MethodCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__MethodCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMethodCallAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_2_1__0"
    // InternalMiniJava.g:4308:1: rule__MethodCall__Group_2_1__0 : rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 ;
    public final void rule__MethodCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4312:1: ( rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 )
            // InternalMiniJava.g:4313:2: rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1
            {
            pushFollow(FOLLOW_29);
            rule__MethodCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2_1__1();

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
    // $ANTLR end "rule__MethodCall__Group_2_1__0"


    // $ANTLR start "rule__MethodCall__Group_2_1__0__Impl"
    // InternalMiniJava.g:4320:1: rule__MethodCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4324:1: ( ( ',' ) )
            // InternalMiniJava.g:4325:1: ( ',' )
            {
            // InternalMiniJava.g:4325:1: ( ',' )
            // InternalMiniJava.g:4326:2: ','
            {
             before(grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_2_1__1"
    // InternalMiniJava.g:4335:1: rule__MethodCall__Group_2_1__1 : rule__MethodCall__Group_2_1__1__Impl ;
    public final void rule__MethodCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4339:1: ( rule__MethodCall__Group_2_1__1__Impl )
            // InternalMiniJava.g:4340:2: rule__MethodCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__MethodCall__Group_2_1__1"


    // $ANTLR start "rule__MethodCall__Group_2_1__1__Impl"
    // InternalMiniJava.g:4346:1: rule__MethodCall__Group_2_1__1__Impl : ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__MethodCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4350:1: ( ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) ) )
            // InternalMiniJava.g:4351:1: ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) )
            {
            // InternalMiniJava.g:4351:1: ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) )
            // InternalMiniJava.g:4352:2: ( rule__MethodCall__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getMethodCallAccess().getParametersAssignment_2_1_1()); 
            // InternalMiniJava.g:4353:2: ( rule__MethodCall__ParametersAssignment_2_1_1 )
            // InternalMiniJava.g:4353:3: rule__MethodCall__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getParametersAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__Program__ClassDeclarationsAssignment_0"
    // InternalMiniJava.g:4362:1: rule__Program__ClassDeclarationsAssignment_0 : ( ruleMainClass ) ;
    public final void rule__Program__ClassDeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4366:1: ( ( ruleMainClass ) )
            // InternalMiniJava.g:4367:2: ( ruleMainClass )
            {
            // InternalMiniJava.g:4367:2: ( ruleMainClass )
            // InternalMiniJava.g:4368:3: ruleMainClass
            {
             before(grammarAccess.getProgramAccess().getClassDeclarationsMainClassParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMainClass();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getClassDeclarationsMainClassParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ClassDeclarationsAssignment_0"


    // $ANTLR start "rule__Program__ClassDeclarationsAssignment_1"
    // InternalMiniJava.g:4377:1: rule__Program__ClassDeclarationsAssignment_1 : ( ruleClassDeclaration ) ;
    public final void rule__Program__ClassDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4381:1: ( ( ruleClassDeclaration ) )
            // InternalMiniJava.g:4382:2: ( ruleClassDeclaration )
            {
            // InternalMiniJava.g:4382:2: ( ruleClassDeclaration )
            // InternalMiniJava.g:4383:3: ruleClassDeclaration
            {
             before(grammarAccess.getProgramAccess().getClassDeclarationsClassDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getClassDeclarationsClassDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ClassDeclarationsAssignment_1"


    // $ANTLR start "rule__MainClass__NameAssignment_1"
    // InternalMiniJava.g:4392:1: rule__MainClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MainClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4396:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4397:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4397:2: ( RULE_ID )
            // InternalMiniJava.g:4398:3: RULE_ID
            {
             before(grammarAccess.getMainClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__NameAssignment_1"


    // $ANTLR start "rule__MainClass__MainMethodAssignment_3"
    // InternalMiniJava.g:4407:1: rule__MainClass__MainMethodAssignment_3 : ( ruleMainMethod ) ;
    public final void rule__MainClass__MainMethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4411:1: ( ( ruleMainMethod ) )
            // InternalMiniJava.g:4412:2: ( ruleMainMethod )
            {
            // InternalMiniJava.g:4412:2: ( ruleMainMethod )
            // InternalMiniJava.g:4413:3: ruleMainMethod
            {
             before(grammarAccess.getMainClassAccess().getMainMethodMainMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMainMethod();

            state._fsp--;

             after(grammarAccess.getMainClassAccess().getMainMethodMainMethodParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__MainMethodAssignment_3"


    // $ANTLR start "rule__MainMethod__StatementAssignment_11"
    // InternalMiniJava.g:4422:1: rule__MainMethod__StatementAssignment_11 : ( ruleStatement ) ;
    public final void rule__MainMethod__StatementAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4426:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4427:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4427:2: ( ruleStatement )
            // InternalMiniJava.g:4428:3: ruleStatement
            {
             before(grammarAccess.getMainMethodAccess().getStatementStatementParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMainMethodAccess().getStatementStatementParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainMethod__StatementAssignment_11"


    // $ANTLR start "rule__ClassDeclaration__NameAssignment_1"
    // InternalMiniJava.g:4437:1: rule__ClassDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4441:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4442:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4442:2: ( RULE_ID )
            // InternalMiniJava.g:4443:3: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ClassDeclaration__ExtendedClassAssignment_2_1"
    // InternalMiniJava.g:4452:1: rule__ClassDeclaration__ExtendedClassAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassDeclaration__ExtendedClassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4456:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:4457:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:4457:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:4458:3: ( RULE_ID )
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendedClassClassDeclCrossReference_2_1_0()); 
            // InternalMiniJava.g:4459:3: ( RULE_ID )
            // InternalMiniJava.g:4460:4: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendedClassClassDeclIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getExtendedClassClassDeclIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getExtendedClassClassDeclCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__ExtendedClassAssignment_2_1"


    // $ANTLR start "rule__ClassDeclaration__VarDeclarationsAssignment_4"
    // InternalMiniJava.g:4471:1: rule__ClassDeclaration__VarDeclarationsAssignment_4 : ( ruleVarDeclaration ) ;
    public final void rule__ClassDeclaration__VarDeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4475:1: ( ( ruleVarDeclaration ) )
            // InternalMiniJava.g:4476:2: ( ruleVarDeclaration )
            {
            // InternalMiniJava.g:4476:2: ( ruleVarDeclaration )
            // InternalMiniJava.g:4477:3: ruleVarDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getVarDeclarationsVarDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getVarDeclarationsVarDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__VarDeclarationsAssignment_4"


    // $ANTLR start "rule__ClassDeclaration__MethodDeclarationsAssignment_5"
    // InternalMiniJava.g:4486:1: rule__ClassDeclaration__MethodDeclarationsAssignment_5 : ( ruleMethodDeclaration ) ;
    public final void rule__ClassDeclaration__MethodDeclarationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4490:1: ( ( ruleMethodDeclaration ) )
            // InternalMiniJava.g:4491:2: ( ruleMethodDeclaration )
            {
            // InternalMiniJava.g:4491:2: ( ruleMethodDeclaration )
            // InternalMiniJava.g:4492:3: ruleMethodDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__MethodDeclarationsAssignment_5"


    // $ANTLR start "rule__Type__TypeNameAssignment_0_1"
    // InternalMiniJava.g:4501:1: rule__Type__TypeNameAssignment_0_1 : ( ( '[' ) ) ;
    public final void rule__Type__TypeNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4505:1: ( ( ( '[' ) ) )
            // InternalMiniJava.g:4506:2: ( ( '[' ) )
            {
            // InternalMiniJava.g:4506:2: ( ( '[' ) )
            // InternalMiniJava.g:4507:3: ( '[' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 
            // InternalMiniJava.g:4508:3: ( '[' )
            // InternalMiniJava.g:4509:4: '['
            {
             before(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeNameAssignment_0_1"


    // $ANTLR start "rule__Type__TypeNameAssignment_1"
    // InternalMiniJava.g:4520:1: rule__Type__TypeNameAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Type__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4524:1: ( ( ( 'int' ) ) )
            // InternalMiniJava.g:4525:2: ( ( 'int' ) )
            {
            // InternalMiniJava.g:4525:2: ( ( 'int' ) )
            // InternalMiniJava.g:4526:3: ( 'int' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 
            // InternalMiniJava.g:4527:3: ( 'int' )
            // InternalMiniJava.g:4528:4: 'int'
            {
             before(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeNameAssignment_1"


    // $ANTLR start "rule__Type__TypeNameAssignment_2"
    // InternalMiniJava.g:4539:1: rule__Type__TypeNameAssignment_2 : ( ( 'boolean' ) ) ;
    public final void rule__Type__TypeNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4543:1: ( ( ( 'boolean' ) ) )
            // InternalMiniJava.g:4544:2: ( ( 'boolean' ) )
            {
            // InternalMiniJava.g:4544:2: ( ( 'boolean' ) )
            // InternalMiniJava.g:4545:3: ( 'boolean' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 
            // InternalMiniJava.g:4546:3: ( 'boolean' )
            // InternalMiniJava.g:4547:4: 'boolean'
            {
             before(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeNameAssignment_2"


    // $ANTLR start "rule__Type__ClassDeclAssignment_3"
    // InternalMiniJava.g:4558:1: rule__Type__ClassDeclAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Type__ClassDeclAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4562:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:4563:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:4563:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:4564:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getClassDeclClassDeclCrossReference_3_0()); 
            // InternalMiniJava.g:4565:3: ( RULE_ID )
            // InternalMiniJava.g:4566:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getClassDeclClassDeclIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getClassDeclClassDeclIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getClassDeclClassDeclCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ClassDeclAssignment_3"


    // $ANTLR start "rule__VarDeclaration__VariableAssignment_0"
    // InternalMiniJava.g:4577:1: rule__VarDeclaration__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__VarDeclaration__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4581:1: ( ( ruleVariable ) )
            // InternalMiniJava.g:4582:2: ( ruleVariable )
            {
            // InternalMiniJava.g:4582:2: ( ruleVariable )
            // InternalMiniJava.g:4583:3: ruleVariable
            {
             before(grammarAccess.getVarDeclarationAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getVariableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VariableAssignment_0"


    // $ANTLR start "rule__Variable__VariableTypeAssignment_0"
    // InternalMiniJava.g:4592:1: rule__Variable__VariableTypeAssignment_0 : ( ruleType ) ;
    public final void rule__Variable__VariableTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4596:1: ( ( ruleType ) )
            // InternalMiniJava.g:4597:2: ( ruleType )
            {
            // InternalMiniJava.g:4597:2: ( ruleType )
            // InternalMiniJava.g:4598:3: ruleType
            {
             before(grammarAccess.getVariableAccess().getVariableTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariableTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__VariableTypeAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalMiniJava.g:4607:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4611:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4612:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4612:2: ( RULE_ID )
            // InternalMiniJava.g:4613:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__MethodDeclaration__MethodTypeAssignment_1"
    // InternalMiniJava.g:4622:1: rule__MethodDeclaration__MethodTypeAssignment_1 : ( ruleType ) ;
    public final void rule__MethodDeclaration__MethodTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4626:1: ( ( ruleType ) )
            // InternalMiniJava.g:4627:2: ( ruleType )
            {
            // InternalMiniJava.g:4627:2: ( ruleType )
            // InternalMiniJava.g:4628:3: ruleType
            {
             before(grammarAccess.getMethodDeclarationAccess().getMethodTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getMethodTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__MethodTypeAssignment_1"


    // $ANTLR start "rule__MethodDeclaration__NameAssignment_2"
    // InternalMiniJava.g:4637:1: rule__MethodDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MethodDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4641:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4642:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4642:2: ( RULE_ID )
            // InternalMiniJava.g:4643:3: RULE_ID
            {
             before(grammarAccess.getMethodDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__NameAssignment_2"


    // $ANTLR start "rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0"
    // InternalMiniJava.g:4652:1: rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 : ( ruleVariable ) ;
    public final void rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4656:1: ( ( ruleVariable ) )
            // InternalMiniJava.g:4657:2: ( ruleVariable )
            {
            // InternalMiniJava.g:4657:2: ( ruleVariable )
            // InternalMiniJava.g:4658:3: ruleVariable
            {
             before(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsVariableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsVariableParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0"


    // $ANTLR start "rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1"
    // InternalMiniJava.g:4667:1: rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 : ( ruleVariable ) ;
    public final void rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4671:1: ( ( ruleVariable ) )
            // InternalMiniJava.g:4672:2: ( ruleVariable )
            {
            // InternalMiniJava.g:4672:2: ( ruleVariable )
            // InternalMiniJava.g:4673:3: ruleVariable
            {
             before(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsVariableParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsVariableParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1"


    // $ANTLR start "rule__MethodDeclaration__LocalVarDeclarationsAssignment_7"
    // InternalMiniJava.g:4682:1: rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 : ( ruleVarDeclaration ) ;
    public final void rule__MethodDeclaration__LocalVarDeclarationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4686:1: ( ( ruleVarDeclaration ) )
            // InternalMiniJava.g:4687:2: ( ruleVarDeclaration )
            {
            // InternalMiniJava.g:4687:2: ( ruleVarDeclaration )
            // InternalMiniJava.g:4688:3: ruleVarDeclaration
            {
             before(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsVarDeclarationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsVarDeclarationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__LocalVarDeclarationsAssignment_7"


    // $ANTLR start "rule__MethodDeclaration__StatementsAssignment_8"
    // InternalMiniJava.g:4697:1: rule__MethodDeclaration__StatementsAssignment_8 : ( ruleStatement ) ;
    public final void rule__MethodDeclaration__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4701:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4702:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4702:2: ( ruleStatement )
            // InternalMiniJava.g:4703:3: ruleStatement
            {
             before(grammarAccess.getMethodDeclarationAccess().getStatementsStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getStatementsStatementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__StatementsAssignment_8"


    // $ANTLR start "rule__MethodDeclaration__ReturnExpressionAssignment_9_1"
    // InternalMiniJava.g:4712:1: rule__MethodDeclaration__ReturnExpressionAssignment_9_1 : ( ruleExpression ) ;
    public final void rule__MethodDeclaration__ReturnExpressionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4716:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4717:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4717:2: ( ruleExpression )
            // InternalMiniJava.g:4718:3: ruleExpression
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__ReturnExpressionAssignment_9_1"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_0_0"
    // InternalMiniJava.g:4727:1: rule__Statement__StatementTypeAssignment_0_0 : ( ( '{' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4731:1: ( ( ( '{' ) ) )
            // InternalMiniJava.g:4732:2: ( ( '{' ) )
            {
            // InternalMiniJava.g:4732:2: ( ( '{' ) )
            // InternalMiniJava.g:4733:3: ( '{' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 
            // InternalMiniJava.g:4734:3: ( '{' )
            // InternalMiniJava.g:4735:4: '{'
            {
             before(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_0_0"


    // $ANTLR start "rule__Statement__StatementsAssignment_0_1"
    // InternalMiniJava.g:4746:1: rule__Statement__StatementsAssignment_0_1 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4750:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4751:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4751:2: ( ruleStatement )
            // InternalMiniJava.g:4752:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_0_1"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_1_0"
    // InternalMiniJava.g:4761:1: rule__Statement__StatementTypeAssignment_1_0 : ( ( 'if' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4765:1: ( ( ( 'if' ) ) )
            // InternalMiniJava.g:4766:2: ( ( 'if' ) )
            {
            // InternalMiniJava.g:4766:2: ( ( 'if' ) )
            // InternalMiniJava.g:4767:3: ( 'if' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 
            // InternalMiniJava.g:4768:3: ( 'if' )
            // InternalMiniJava.g:4769:4: 'if'
            {
             before(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_1_0"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_1_2"
    // InternalMiniJava.g:4780:1: rule__Statement__FirstExpressionAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4784:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4785:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4785:2: ( ruleExpression )
            // InternalMiniJava.g:4786:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_1_2"


    // $ANTLR start "rule__Statement__StatementsAssignment_1_4"
    // InternalMiniJava.g:4795:1: rule__Statement__StatementsAssignment_1_4 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4799:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4800:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4800:2: ( ruleStatement )
            // InternalMiniJava.g:4801:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_1_4"


    // $ANTLR start "rule__Statement__StatementsAssignment_1_6"
    // InternalMiniJava.g:4810:1: rule__Statement__StatementsAssignment_1_6 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4814:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4815:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4815:2: ( ruleStatement )
            // InternalMiniJava.g:4816:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_1_6"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_2_0"
    // InternalMiniJava.g:4825:1: rule__Statement__StatementTypeAssignment_2_0 : ( ( 'while' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4829:1: ( ( ( 'while' ) ) )
            // InternalMiniJava.g:4830:2: ( ( 'while' ) )
            {
            // InternalMiniJava.g:4830:2: ( ( 'while' ) )
            // InternalMiniJava.g:4831:3: ( 'while' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 
            // InternalMiniJava.g:4832:3: ( 'while' )
            // InternalMiniJava.g:4833:4: 'while'
            {
             before(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_2_0"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_2_2"
    // InternalMiniJava.g:4844:1: rule__Statement__FirstExpressionAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4848:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4849:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4849:2: ( ruleExpression )
            // InternalMiniJava.g:4850:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_2_2"


    // $ANTLR start "rule__Statement__StatementsAssignment_2_4"
    // InternalMiniJava.g:4859:1: rule__Statement__StatementsAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4863:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4864:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4864:2: ( ruleStatement )
            // InternalMiniJava.g:4865:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_2_4"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_3_0"
    // InternalMiniJava.g:4874:1: rule__Statement__StatementTypeAssignment_3_0 : ( ( 'System.out.println' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4878:1: ( ( ( 'System.out.println' ) ) )
            // InternalMiniJava.g:4879:2: ( ( 'System.out.println' ) )
            {
            // InternalMiniJava.g:4879:2: ( ( 'System.out.println' ) )
            // InternalMiniJava.g:4880:3: ( 'System.out.println' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeSystemOutPrintlnKeyword_3_0_0()); 
            // InternalMiniJava.g:4881:3: ( 'System.out.println' )
            // InternalMiniJava.g:4882:4: 'System.out.println'
            {
             before(grammarAccess.getStatementAccess().getStatementTypeSystemOutPrintlnKeyword_3_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeSystemOutPrintlnKeyword_3_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeSystemOutPrintlnKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_3_0"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_3_2"
    // InternalMiniJava.g:4893:1: rule__Statement__FirstExpressionAssignment_3_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4897:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4898:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4898:2: ( ruleExpression )
            // InternalMiniJava.g:4899:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_3_2"


    // $ANTLR start "rule__Statement__VariableAssignment_4_0"
    // InternalMiniJava.g:4908:1: rule__Statement__VariableAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Statement__VariableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4912:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:4913:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:4913:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:4914:3: ( RULE_ID )
            {
             before(grammarAccess.getStatementAccess().getVariableVariableCrossReference_4_0_0()); 
            // InternalMiniJava.g:4915:3: ( RULE_ID )
            // InternalMiniJava.g:4916:4: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getStatementAccess().getVariableVariableCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VariableAssignment_4_0"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_4_1"
    // InternalMiniJava.g:4927:1: rule__Statement__StatementTypeAssignment_4_1 : ( ( '=' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4931:1: ( ( ( '=' ) ) )
            // InternalMiniJava.g:4932:2: ( ( '=' ) )
            {
            // InternalMiniJava.g:4932:2: ( ( '=' ) )
            // InternalMiniJava.g:4933:3: ( '=' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_1_0()); 
            // InternalMiniJava.g:4934:3: ( '=' )
            // InternalMiniJava.g:4935:4: '='
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_1_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_4_1"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_4_2"
    // InternalMiniJava.g:4946:1: rule__Statement__FirstExpressionAssignment_4_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4950:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4951:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4951:2: ( ruleExpression )
            // InternalMiniJava.g:4952:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_4_2"


    // $ANTLR start "rule__Statement__VariableAssignment_5_0"
    // InternalMiniJava.g:4961:1: rule__Statement__VariableAssignment_5_0 : ( ( RULE_ID ) ) ;
    public final void rule__Statement__VariableAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4965:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:4966:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:4966:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:4967:3: ( RULE_ID )
            {
             before(grammarAccess.getStatementAccess().getVariableVariableCrossReference_5_0_0()); 
            // InternalMiniJava.g:4968:3: ( RULE_ID )
            // InternalMiniJava.g:4969:4: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_5_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_5_0_0_1()); 

            }

             after(grammarAccess.getStatementAccess().getVariableVariableCrossReference_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VariableAssignment_5_0"


    // $ANTLR start "rule__Statement__IsArrayElementAssignmentAssignment_5_1"
    // InternalMiniJava.g:4980:1: rule__Statement__IsArrayElementAssignmentAssignment_5_1 : ( ( '[' ) ) ;
    public final void rule__Statement__IsArrayElementAssignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4984:1: ( ( ( '[' ) ) )
            // InternalMiniJava.g:4985:2: ( ( '[' ) )
            {
            // InternalMiniJava.g:4985:2: ( ( '[' ) )
            // InternalMiniJava.g:4986:3: ( '[' )
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_5_1_0()); 
            // InternalMiniJava.g:4987:3: ( '[' )
            // InternalMiniJava.g:4988:4: '['
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_5_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_5_1_0()); 

            }

             after(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__IsArrayElementAssignmentAssignment_5_1"


    // $ANTLR start "rule__Statement__FirstExpressionAssignment_5_2"
    // InternalMiniJava.g:4999:1: rule__Statement__FirstExpressionAssignment_5_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5003:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5004:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5004:2: ( ruleExpression )
            // InternalMiniJava.g:5005:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__FirstExpressionAssignment_5_2"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_5_4"
    // InternalMiniJava.g:5014:1: rule__Statement__StatementTypeAssignment_5_4 : ( ( '=' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5018:1: ( ( ( '=' ) ) )
            // InternalMiniJava.g:5019:2: ( ( '=' ) )
            {
            // InternalMiniJava.g:5019:2: ( ( '=' ) )
            // InternalMiniJava.g:5020:3: ( '=' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_5_4_0()); 
            // InternalMiniJava.g:5021:3: ( '=' )
            // InternalMiniJava.g:5022:4: '='
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_5_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_5_4_0()); 

            }

             after(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementTypeAssignment_5_4"


    // $ANTLR start "rule__Statement__SecondExpressionAssignment_5_5"
    // InternalMiniJava.g:5033:1: rule__Statement__SecondExpressionAssignment_5_5 : ( ruleExpression ) ;
    public final void rule__Statement__SecondExpressionAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5037:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5038:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5038:2: ( ruleExpression )
            // InternalMiniJava.g:5039:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getSecondExpressionExpressionParserRuleCall_5_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getSecondExpressionExpressionParserRuleCall_5_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__SecondExpressionAssignment_5_5"


    // $ANTLR start "rule__Expression__ExpressionTypeAssignment_1_1"
    // InternalMiniJava.g:5048:1: rule__Expression__ExpressionTypeAssignment_1_1 : ( ( '<' ) ) ;
    public final void rule__Expression__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5052:1: ( ( ( '<' ) ) )
            // InternalMiniJava.g:5053:2: ( ( '<' ) )
            {
            // InternalMiniJava.g:5053:2: ( ( '<' ) )
            // InternalMiniJava.g:5054:3: ( '<' )
            {
             before(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 
            // InternalMiniJava.g:5055:3: ( '<' )
            // InternalMiniJava.g:5056:4: '<'
            {
             before(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 

            }

             after(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalMiniJava.g:5067:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5071:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5072:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5072:2: ( ruleExpression )
            // InternalMiniJava.g:5073:3: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__Addition__ExpressionTypeAssignment_1_1"
    // InternalMiniJava.g:5082:1: rule__Addition__ExpressionTypeAssignment_1_1 : ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5086:1: ( ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) ) )
            // InternalMiniJava.g:5087:2: ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) )
            {
            // InternalMiniJava.g:5087:2: ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) )
            // InternalMiniJava.g:5088:3: ( rule__Addition__ExpressionTypeAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getExpressionTypeAlternatives_1_1_0()); 
            // InternalMiniJava.g:5089:3: ( rule__Addition__ExpressionTypeAlternatives_1_1_0 )
            // InternalMiniJava.g:5089:4: rule__Addition__ExpressionTypeAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__ExpressionTypeAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getExpressionTypeAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalMiniJava.g:5097:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5101:1: ( ( ruleMultiplication ) )
            // InternalMiniJava.g:5102:2: ( ruleMultiplication )
            {
            // InternalMiniJava.g:5102:2: ( ruleMultiplication )
            // InternalMiniJava.g:5103:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__ExpressionTypeAssignment_1_1"
    // InternalMiniJava.g:5112:1: rule__Multiplication__ExpressionTypeAssignment_1_1 : ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5116:1: ( ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) ) )
            // InternalMiniJava.g:5117:2: ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) )
            {
            // InternalMiniJava.g:5117:2: ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) )
            // InternalMiniJava.g:5118:3: ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getExpressionTypeAlternatives_1_1_0()); 
            // InternalMiniJava.g:5119:3: ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 )
            // InternalMiniJava.g:5119:4: rule__Multiplication__ExpressionTypeAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__ExpressionTypeAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getExpressionTypeAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalMiniJava.g:5127:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNegationOrPointExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5131:1: ( ( ruleNegationOrPointExpression ) )
            // InternalMiniJava.g:5132:2: ( ruleNegationOrPointExpression )
            {
            // InternalMiniJava.g:5132:2: ( ruleNegationOrPointExpression )
            // InternalMiniJava.g:5133:3: ruleNegationOrPointExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightNegationOrPointExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNegationOrPointExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightNegationOrPointExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__Negation__ExpressionTypeAssignment_0"
    // InternalMiniJava.g:5142:1: rule__Negation__ExpressionTypeAssignment_0 : ( ( '!' ) ) ;
    public final void rule__Negation__ExpressionTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5146:1: ( ( ( '!' ) ) )
            // InternalMiniJava.g:5147:2: ( ( '!' ) )
            {
            // InternalMiniJava.g:5147:2: ( ( '!' ) )
            // InternalMiniJava.g:5148:3: ( '!' )
            {
             before(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 
            // InternalMiniJava.g:5149:3: ( '!' )
            // InternalMiniJava.g:5150:4: '!'
            {
             before(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 

            }

             after(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__ExpressionTypeAssignment_0"


    // $ANTLR start "rule__Negation__RightAssignment_1"
    // InternalMiniJava.g:5161:1: rule__Negation__RightAssignment_1 : ( rulePoint ) ;
    public final void rule__Negation__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5165:1: ( ( rulePoint ) )
            // InternalMiniJava.g:5166:2: ( rulePoint )
            {
            // InternalMiniJava.g:5166:2: ( rulePoint )
            // InternalMiniJava.g:5167:3: rulePoint
            {
             before(grammarAccess.getNegationAccess().getRightPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getRightPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__RightAssignment_1"


    // $ANTLR start "rule__Point__ExpressionTypeAssignment_1_1"
    // InternalMiniJava.g:5176:1: rule__Point__ExpressionTypeAssignment_1_1 : ( ( '.' ) ) ;
    public final void rule__Point__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5180:1: ( ( ( '.' ) ) )
            // InternalMiniJava.g:5181:2: ( ( '.' ) )
            {
            // InternalMiniJava.g:5181:2: ( ( '.' ) )
            // InternalMiniJava.g:5182:3: ( '.' )
            {
             before(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 
            // InternalMiniJava.g:5183:3: ( '.' )
            // InternalMiniJava.g:5184:4: '.'
            {
             before(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 

            }

             after(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__Point__RightAssignment_1_2"
    // InternalMiniJava.g:5195:1: rule__Point__RightAssignment_1_2 : ( ruleMethodCallExpr ) ;
    public final void rule__Point__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5199:1: ( ( ruleMethodCallExpr ) )
            // InternalMiniJava.g:5200:2: ( ruleMethodCallExpr )
            {
            // InternalMiniJava.g:5200:2: ( ruleMethodCallExpr )
            // InternalMiniJava.g:5201:3: ruleMethodCallExpr
            {
             before(grammarAccess.getPointAccess().getRightMethodCallExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodCallExpr();

            state._fsp--;

             after(grammarAccess.getPointAccess().getRightMethodCallExprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__RightAssignment_1_2"


    // $ANTLR start "rule__SquareBrackets__ExpressionTypeAssignment_1_1"
    // InternalMiniJava.g:5210:1: rule__SquareBrackets__ExpressionTypeAssignment_1_1 : ( ( '[' ) ) ;
    public final void rule__SquareBrackets__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5214:1: ( ( ( '[' ) ) )
            // InternalMiniJava.g:5215:2: ( ( '[' ) )
            {
            // InternalMiniJava.g:5215:2: ( ( '[' ) )
            // InternalMiniJava.g:5216:3: ( '[' )
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 
            // InternalMiniJava.g:5217:3: ( '[' )
            // InternalMiniJava.g:5218:4: '['
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 

            }

             after(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__ExpressionTypeAssignment_1_1"


    // $ANTLR start "rule__SquareBrackets__RightAssignment_1_2"
    // InternalMiniJava.g:5229:1: rule__SquareBrackets__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__SquareBrackets__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5233:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:5234:2: ( rulePrimary )
            {
            // InternalMiniJava.g:5234:2: ( rulePrimary )
            // InternalMiniJava.g:5235:3: rulePrimary
            {
             before(grammarAccess.getSquareBracketsAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getSquareBracketsAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareBrackets__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_0"
    // InternalMiniJava.g:5244:1: rule__Primary__ExpressionTypeAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5248:1: ( ( ( 'true' ) ) )
            // InternalMiniJava.g:5249:2: ( ( 'true' ) )
            {
            // InternalMiniJava.g:5249:2: ( ( 'true' ) )
            // InternalMiniJava.g:5250:3: ( 'true' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 
            // InternalMiniJava.g:5251:3: ( 'true' )
            // InternalMiniJava.g:5252:4: 'true'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_0"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_1"
    // InternalMiniJava.g:5263:1: rule__Primary__ExpressionTypeAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5267:1: ( ( ( 'false' ) ) )
            // InternalMiniJava.g:5268:2: ( ( 'false' ) )
            {
            // InternalMiniJava.g:5268:2: ( ( 'false' ) )
            // InternalMiniJava.g:5269:3: ( 'false' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 
            // InternalMiniJava.g:5270:3: ( 'false' )
            // InternalMiniJava.g:5271:4: 'false'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_1"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_2"
    // InternalMiniJava.g:5282:1: rule__Primary__ExpressionTypeAssignment_2 : ( ( 'this' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5286:1: ( ( ( 'this' ) ) )
            // InternalMiniJava.g:5287:2: ( ( 'this' ) )
            {
            // InternalMiniJava.g:5287:2: ( ( 'this' ) )
            // InternalMiniJava.g:5288:3: ( 'this' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 
            // InternalMiniJava.g:5289:3: ( 'this' )
            // InternalMiniJava.g:5290:4: 'this'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_2"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_3_0"
    // InternalMiniJava.g:5301:1: rule__Primary__ExpressionTypeAssignment_3_0 : ( ( 'new' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5305:1: ( ( ( 'new' ) ) )
            // InternalMiniJava.g:5306:2: ( ( 'new' ) )
            {
            // InternalMiniJava.g:5306:2: ( ( 'new' ) )
            // InternalMiniJava.g:5307:3: ( 'new' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 
            // InternalMiniJava.g:5308:3: ( 'new' )
            // InternalMiniJava.g:5309:4: 'new'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_3_0"


    // $ANTLR start "rule__Primary__ExpressionAssignment_3_3"
    // InternalMiniJava.g:5320:1: rule__Primary__ExpressionAssignment_3_3 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5324:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5325:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5325:2: ( ruleExpression )
            // InternalMiniJava.g:5326:3: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_3_3"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_4_0"
    // InternalMiniJava.g:5335:1: rule__Primary__ExpressionTypeAssignment_4_0 : ( ( 'new' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5339:1: ( ( ( 'new' ) ) )
            // InternalMiniJava.g:5340:2: ( ( 'new' ) )
            {
            // InternalMiniJava.g:5340:2: ( ( 'new' ) )
            // InternalMiniJava.g:5341:3: ( 'new' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 
            // InternalMiniJava.g:5342:3: ( 'new' )
            // InternalMiniJava.g:5343:4: 'new'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_4_0"


    // $ANTLR start "rule__Primary__TypeAssignment_4_1"
    // InternalMiniJava.g:5354:1: rule__Primary__TypeAssignment_4_1 : ( ruleType ) ;
    public final void rule__Primary__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5358:1: ( ( ruleType ) )
            // InternalMiniJava.g:5359:2: ( ruleType )
            {
            // InternalMiniJava.g:5359:2: ( ruleType )
            // InternalMiniJava.g:5360:3: ruleType
            {
             before(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__TypeAssignment_4_1"


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_5_0"
    // InternalMiniJava.g:5369:1: rule__Primary__ExpressionTypeAssignment_5_0 : ( ( '(' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5373:1: ( ( ( '(' ) ) )
            // InternalMiniJava.g:5374:2: ( ( '(' ) )
            {
            // InternalMiniJava.g:5374:2: ( ( '(' ) )
            // InternalMiniJava.g:5375:3: ( '(' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 
            // InternalMiniJava.g:5376:3: ( '(' )
            // InternalMiniJava.g:5377:4: '('
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_5_0"


    // $ANTLR start "rule__Primary__ExpressionAssignment_5_1"
    // InternalMiniJava.g:5388:1: rule__Primary__ExpressionAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5392:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5393:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5393:2: ( ruleExpression )
            // InternalMiniJava.g:5394:3: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_5_1"


    // $ANTLR start "rule__Primary__VariableAssignment_6"
    // InternalMiniJava.g:5403:1: rule__Primary__VariableAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__VariableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5407:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:5408:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:5408:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:5409:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_6_0()); 
            // InternalMiniJava.g:5410:3: ( RULE_ID )
            // InternalMiniJava.g:5411:4: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getVariableVariableIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getVariableVariableIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__VariableAssignment_6"


    // $ANTLR start "rule__Primary__NumberAssignment_7"
    // InternalMiniJava.g:5422:1: rule__Primary__NumberAssignment_7 : ( ruleNumberValue ) ;
    public final void rule__Primary__NumberAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5426:1: ( ( ruleNumberValue ) )
            // InternalMiniJava.g:5427:2: ( ruleNumberValue )
            {
            // InternalMiniJava.g:5427:2: ( ruleNumberValue )
            // InternalMiniJava.g:5428:3: ruleNumberValue
            {
             before(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__NumberAssignment_7"


    // $ANTLR start "rule__MethodCallExpr__ExpressionTypeAssignment_0"
    // InternalMiniJava.g:5437:1: rule__MethodCallExpr__ExpressionTypeAssignment_0 : ( ( 'length' ) ) ;
    public final void rule__MethodCallExpr__ExpressionTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5441:1: ( ( ( 'length' ) ) )
            // InternalMiniJava.g:5442:2: ( ( 'length' ) )
            {
            // InternalMiniJava.g:5442:2: ( ( 'length' ) )
            // InternalMiniJava.g:5443:3: ( 'length' )
            {
             before(grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0()); 
            // InternalMiniJava.g:5444:3: ( 'length' )
            // InternalMiniJava.g:5445:4: 'length'
            {
             before(grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0()); 

            }

             after(grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCallExpr__ExpressionTypeAssignment_0"


    // $ANTLR start "rule__MethodCallExpr__MethodCallAssignment_1"
    // InternalMiniJava.g:5456:1: rule__MethodCallExpr__MethodCallAssignment_1 : ( ruleMethodCall ) ;
    public final void rule__MethodCallExpr__MethodCallAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5460:1: ( ( ruleMethodCall ) )
            // InternalMiniJava.g:5461:2: ( ruleMethodCall )
            {
            // InternalMiniJava.g:5461:2: ( ruleMethodCall )
            // InternalMiniJava.g:5462:3: ruleMethodCall
            {
             before(grammarAccess.getMethodCallExprAccess().getMethodCallMethodCallParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getMethodCallExprAccess().getMethodCallMethodCallParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCallExpr__MethodCallAssignment_1"


    // $ANTLR start "rule__MethodCall__MethodAssignment_0"
    // InternalMiniJava.g:5471:1: rule__MethodCall__MethodAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5475:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:5476:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:5476:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:5477:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodCallAccess().getMethodMethodCrossReference_0_0()); 
            // InternalMiniJava.g:5478:3: ( RULE_ID )
            // InternalMiniJava.g:5479:4: RULE_ID
            {
             before(grammarAccess.getMethodCallAccess().getMethodMethodIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getMethodMethodIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMethodCallAccess().getMethodMethodCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__MethodAssignment_0"


    // $ANTLR start "rule__MethodCall__ParametersAssignment_2_0"
    // InternalMiniJava.g:5490:1: rule__MethodCall__ParametersAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5494:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5495:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5495:2: ( ruleExpression )
            // InternalMiniJava.g:5496:3: ruleExpression
            {
             before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__ParametersAssignment_2_0"


    // $ANTLR start "rule__MethodCall__ParametersAssignment_2_1_1"
    // InternalMiniJava.g:5505:1: rule__MethodCall__ParametersAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5509:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5510:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5510:2: ( ruleExpression )
            // InternalMiniJava.g:5511:3: ruleExpression
            {
             before(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // InternalMiniJava.g:5520:1: rule__NumberValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5524:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:5525:2: ( RULE_INT )
            {
            // InternalMiniJava.g:5525:2: ( RULE_INT )
            // InternalMiniJava.g:5526:3: RULE_INT
            {
             before(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\3\uffff\1\26\1\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\54\3\uffff\1\41\3\uffff\1\30\1\uffff\1\54\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\uffff\1\5\1\uffff\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\7\20\uffff\1\5\22\uffff\1\1\1\2\1\3\1\4",
            "",
            "",
            "",
            "\1\11\27\uffff\1\10\4\uffff\1\11",
            "",
            "",
            "",
            "\1\11\1\uffff\1\12",
            "",
            "\2\13\20\uffff\1\13\2\uffff\1\11\15\uffff\1\13\1\uffff\4\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "693:1: rule__Primary__Alternatives : ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__VariableAssignment_6 ) ) | ( ( rule__Primary__NumberAssignment_7 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001C00010010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000210060010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000210000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000210000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000214000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001E90030010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001C00010012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001E8000400030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001C00030010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00001E8004400030L});

}