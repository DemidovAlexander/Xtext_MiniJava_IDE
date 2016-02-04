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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'&&'", "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'}'", "'extends'", "'int'", "';'", "'return'", "','", "'else'", "'boolean'", "'if'", "'while'", "'System.out.println'", "'='", "'<'", "'!'", "'.'", "'true'", "'false'", "'this'", "'new'", "'length'"
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


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalMiniJava.g:103:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:104:1: ( ruleClassDeclaration EOF )
            // InternalMiniJava.g:105:1: ruleClassDeclaration EOF
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
    // InternalMiniJava.g:112:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:116:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:117:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:117:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalMiniJava.g:118:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalMiniJava.g:119:3: ( rule__ClassDeclaration__Group__0 )
            // InternalMiniJava.g:119:4: rule__ClassDeclaration__Group__0
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
    // InternalMiniJava.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMiniJava.g:129:1: ( ruleType EOF )
            // InternalMiniJava.g:130:1: ruleType EOF
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
    // InternalMiniJava.g:137:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:141:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMiniJava.g:142:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMiniJava.g:142:2: ( ( rule__Type__Alternatives ) )
            // InternalMiniJava.g:143:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMiniJava.g:144:3: ( rule__Type__Alternatives )
            // InternalMiniJava.g:144:4: rule__Type__Alternatives
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
    // InternalMiniJava.g:153:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:154:1: ( ruleVarDeclaration EOF )
            // InternalMiniJava.g:155:1: ruleVarDeclaration EOF
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
    // InternalMiniJava.g:162:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:166:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:167:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:167:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalMiniJava.g:168:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalMiniJava.g:169:3: ( rule__VarDeclaration__Group__0 )
            // InternalMiniJava.g:169:4: rule__VarDeclaration__Group__0
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
    // InternalMiniJava.g:178:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMiniJava.g:179:1: ( ruleVariable EOF )
            // InternalMiniJava.g:180:1: ruleVariable EOF
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
    // InternalMiniJava.g:187:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:191:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMiniJava.g:192:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMiniJava.g:192:2: ( ( rule__Variable__Group__0 ) )
            // InternalMiniJava.g:193:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMiniJava.g:194:3: ( rule__Variable__Group__0 )
            // InternalMiniJava.g:194:4: rule__Variable__Group__0
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
    // InternalMiniJava.g:203:1: entryRuleMethodDeclaration : ruleMethodDeclaration EOF ;
    public final void entryRuleMethodDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:204:1: ( ruleMethodDeclaration EOF )
            // InternalMiniJava.g:205:1: ruleMethodDeclaration EOF
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
    // InternalMiniJava.g:212:1: ruleMethodDeclaration : ( ( rule__MethodDeclaration__Group__0 ) ) ;
    public final void ruleMethodDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:216:2: ( ( ( rule__MethodDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:217:2: ( ( rule__MethodDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:217:2: ( ( rule__MethodDeclaration__Group__0 ) )
            // InternalMiniJava.g:218:3: ( rule__MethodDeclaration__Group__0 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup()); 
            // InternalMiniJava.g:219:3: ( rule__MethodDeclaration__Group__0 )
            // InternalMiniJava.g:219:4: rule__MethodDeclaration__Group__0
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
    // InternalMiniJava.g:228:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:229:1: ( ruleStatement EOF )
            // InternalMiniJava.g:230:1: ruleStatement EOF
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
    // InternalMiniJava.g:237:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:241:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMiniJava.g:242:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMiniJava.g:242:2: ( ( rule__Statement__Alternatives ) )
            // InternalMiniJava.g:243:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMiniJava.g:244:3: ( rule__Statement__Alternatives )
            // InternalMiniJava.g:244:4: rule__Statement__Alternatives
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
    // InternalMiniJava.g:253:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:254:1: ( ruleExpression EOF )
            // InternalMiniJava.g:255:1: ruleExpression EOF
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
    // InternalMiniJava.g:262:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:266:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMiniJava.g:267:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMiniJava.g:267:2: ( ( rule__Expression__Group__0 ) )
            // InternalMiniJava.g:268:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMiniJava.g:269:3: ( rule__Expression__Group__0 )
            // InternalMiniJava.g:269:4: rule__Expression__Group__0
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
    // InternalMiniJava.g:278:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalMiniJava.g:279:1: ( ruleAddition EOF )
            // InternalMiniJava.g:280:1: ruleAddition EOF
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
    // InternalMiniJava.g:287:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:291:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalMiniJava.g:292:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalMiniJava.g:292:2: ( ( rule__Addition__Group__0 ) )
            // InternalMiniJava.g:293:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalMiniJava.g:294:3: ( rule__Addition__Group__0 )
            // InternalMiniJava.g:294:4: rule__Addition__Group__0
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
    // InternalMiniJava.g:303:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalMiniJava.g:304:1: ( ruleMultiplication EOF )
            // InternalMiniJava.g:305:1: ruleMultiplication EOF
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
    // InternalMiniJava.g:312:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:316:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalMiniJava.g:317:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalMiniJava.g:317:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalMiniJava.g:318:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalMiniJava.g:319:3: ( rule__Multiplication__Group__0 )
            // InternalMiniJava.g:319:4: rule__Multiplication__Group__0
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
    // InternalMiniJava.g:328:1: entryRuleNegationOrPointExpression : ruleNegationOrPointExpression EOF ;
    public final void entryRuleNegationOrPointExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:329:1: ( ruleNegationOrPointExpression EOF )
            // InternalMiniJava.g:330:1: ruleNegationOrPointExpression EOF
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
    // InternalMiniJava.g:337:1: ruleNegationOrPointExpression : ( ( rule__NegationOrPointExpression__Alternatives ) ) ;
    public final void ruleNegationOrPointExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:341:2: ( ( ( rule__NegationOrPointExpression__Alternatives ) ) )
            // InternalMiniJava.g:342:2: ( ( rule__NegationOrPointExpression__Alternatives ) )
            {
            // InternalMiniJava.g:342:2: ( ( rule__NegationOrPointExpression__Alternatives ) )
            // InternalMiniJava.g:343:3: ( rule__NegationOrPointExpression__Alternatives )
            {
             before(grammarAccess.getNegationOrPointExpressionAccess().getAlternatives()); 
            // InternalMiniJava.g:344:3: ( rule__NegationOrPointExpression__Alternatives )
            // InternalMiniJava.g:344:4: rule__NegationOrPointExpression__Alternatives
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
    // InternalMiniJava.g:353:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalMiniJava.g:354:1: ( ruleNegation EOF )
            // InternalMiniJava.g:355:1: ruleNegation EOF
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
    // InternalMiniJava.g:362:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:366:2: ( ( ( rule__Negation__Group__0 ) ) )
            // InternalMiniJava.g:367:2: ( ( rule__Negation__Group__0 ) )
            {
            // InternalMiniJava.g:367:2: ( ( rule__Negation__Group__0 ) )
            // InternalMiniJava.g:368:3: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // InternalMiniJava.g:369:3: ( rule__Negation__Group__0 )
            // InternalMiniJava.g:369:4: rule__Negation__Group__0
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
    // InternalMiniJava.g:378:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalMiniJava.g:379:1: ( rulePoint EOF )
            // InternalMiniJava.g:380:1: rulePoint EOF
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
    // InternalMiniJava.g:387:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:391:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalMiniJava.g:392:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalMiniJava.g:392:2: ( ( rule__Point__Group__0 ) )
            // InternalMiniJava.g:393:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalMiniJava.g:394:3: ( rule__Point__Group__0 )
            // InternalMiniJava.g:394:4: rule__Point__Group__0
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
    // InternalMiniJava.g:403:1: entryRuleSquareBrackets : ruleSquareBrackets EOF ;
    public final void entryRuleSquareBrackets() throws RecognitionException {
        try {
            // InternalMiniJava.g:404:1: ( ruleSquareBrackets EOF )
            // InternalMiniJava.g:405:1: ruleSquareBrackets EOF
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
    // InternalMiniJava.g:412:1: ruleSquareBrackets : ( ( rule__SquareBrackets__Group__0 ) ) ;
    public final void ruleSquareBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:416:2: ( ( ( rule__SquareBrackets__Group__0 ) ) )
            // InternalMiniJava.g:417:2: ( ( rule__SquareBrackets__Group__0 ) )
            {
            // InternalMiniJava.g:417:2: ( ( rule__SquareBrackets__Group__0 ) )
            // InternalMiniJava.g:418:3: ( rule__SquareBrackets__Group__0 )
            {
             before(grammarAccess.getSquareBracketsAccess().getGroup()); 
            // InternalMiniJava.g:419:3: ( rule__SquareBrackets__Group__0 )
            // InternalMiniJava.g:419:4: rule__SquareBrackets__Group__0
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
    // InternalMiniJava.g:428:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMiniJava.g:429:1: ( rulePrimary EOF )
            // InternalMiniJava.g:430:1: rulePrimary EOF
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
    // InternalMiniJava.g:437:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:441:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMiniJava.g:442:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMiniJava.g:442:2: ( ( rule__Primary__Alternatives ) )
            // InternalMiniJava.g:443:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMiniJava.g:444:3: ( rule__Primary__Alternatives )
            // InternalMiniJava.g:444:4: rule__Primary__Alternatives
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


    // $ANTLR start "entryRuleMethodCall"
    // InternalMiniJava.g:453:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // InternalMiniJava.g:454:1: ( ruleMethodCall EOF )
            // InternalMiniJava.g:455:1: ruleMethodCall EOF
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
    // InternalMiniJava.g:462:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:466:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // InternalMiniJava.g:467:2: ( ( rule__MethodCall__Group__0 ) )
            {
            // InternalMiniJava.g:467:2: ( ( rule__MethodCall__Group__0 ) )
            // InternalMiniJava.g:468:3: ( rule__MethodCall__Group__0 )
            {
             before(grammarAccess.getMethodCallAccess().getGroup()); 
            // InternalMiniJava.g:469:3: ( rule__MethodCall__Group__0 )
            // InternalMiniJava.g:469:4: rule__MethodCall__Group__0
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
    // InternalMiniJava.g:478:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalMiniJava.g:479:1: ( ruleNumberValue EOF )
            // InternalMiniJava.g:480:1: ruleNumberValue EOF
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
    // InternalMiniJava.g:487:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:491:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalMiniJava.g:492:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalMiniJava.g:492:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalMiniJava.g:493:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalMiniJava.g:494:3: ( rule__NumberValue__ValueAssignment )
            // InternalMiniJava.g:494:4: rule__NumberValue__ValueAssignment
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
    // InternalMiniJava.g:502:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__TypeNameAssignment_1 ) ) | ( ( rule__Type__TypeNameAssignment_2 ) ) | ( ( rule__Type__ClassDeclAssignment_3 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:506:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__TypeNameAssignment_1 ) ) | ( ( rule__Type__TypeNameAssignment_2 ) ) | ( ( rule__Type__ClassDeclAssignment_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==23) ) {
                    alt1=1;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==21) ) {
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
                    // InternalMiniJava.g:507:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:507:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalMiniJava.g:508:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalMiniJava.g:509:3: ( rule__Type__Group_0__0 )
                    // InternalMiniJava.g:509:4: rule__Type__Group_0__0
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
                    // InternalMiniJava.g:513:2: ( ( rule__Type__TypeNameAssignment_1 ) )
                    {
                    // InternalMiniJava.g:513:2: ( ( rule__Type__TypeNameAssignment_1 ) )
                    // InternalMiniJava.g:514:3: ( rule__Type__TypeNameAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameAssignment_1()); 
                    // InternalMiniJava.g:515:3: ( rule__Type__TypeNameAssignment_1 )
                    // InternalMiniJava.g:515:4: rule__Type__TypeNameAssignment_1
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
                    // InternalMiniJava.g:519:2: ( ( rule__Type__TypeNameAssignment_2 ) )
                    {
                    // InternalMiniJava.g:519:2: ( ( rule__Type__TypeNameAssignment_2 ) )
                    // InternalMiniJava.g:520:3: ( rule__Type__TypeNameAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameAssignment_2()); 
                    // InternalMiniJava.g:521:3: ( rule__Type__TypeNameAssignment_2 )
                    // InternalMiniJava.g:521:4: rule__Type__TypeNameAssignment_2
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
                    // InternalMiniJava.g:525:2: ( ( rule__Type__ClassDeclAssignment_3 ) )
                    {
                    // InternalMiniJava.g:525:2: ( ( rule__Type__ClassDeclAssignment_3 ) )
                    // InternalMiniJava.g:526:3: ( rule__Type__ClassDeclAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getClassDeclAssignment_3()); 
                    // InternalMiniJava.g:527:3: ( rule__Type__ClassDeclAssignment_3 )
                    // InternalMiniJava.g:527:4: rule__Type__ClassDeclAssignment_3
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
    // InternalMiniJava.g:535:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:539:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) )
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

                if ( (LA2_5==23) ) {
                    alt2=6;
                }
                else if ( (LA2_5==37) ) {
                    alt2=5;
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
                    // InternalMiniJava.g:540:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:540:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalMiniJava.g:541:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalMiniJava.g:542:3: ( rule__Statement__Group_0__0 )
                    // InternalMiniJava.g:542:4: rule__Statement__Group_0__0
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
                    // InternalMiniJava.g:546:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:546:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalMiniJava.g:547:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalMiniJava.g:548:3: ( rule__Statement__Group_1__0 )
                    // InternalMiniJava.g:548:4: rule__Statement__Group_1__0
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
                    // InternalMiniJava.g:552:2: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:552:2: ( ( rule__Statement__Group_2__0 ) )
                    // InternalMiniJava.g:553:3: ( rule__Statement__Group_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2()); 
                    // InternalMiniJava.g:554:3: ( rule__Statement__Group_2__0 )
                    // InternalMiniJava.g:554:4: rule__Statement__Group_2__0
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
                    // InternalMiniJava.g:558:2: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:558:2: ( ( rule__Statement__Group_3__0 ) )
                    // InternalMiniJava.g:559:3: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // InternalMiniJava.g:560:3: ( rule__Statement__Group_3__0 )
                    // InternalMiniJava.g:560:4: rule__Statement__Group_3__0
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
                    // InternalMiniJava.g:564:2: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:564:2: ( ( rule__Statement__Group_4__0 ) )
                    // InternalMiniJava.g:565:3: ( rule__Statement__Group_4__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_4()); 
                    // InternalMiniJava.g:566:3: ( rule__Statement__Group_4__0 )
                    // InternalMiniJava.g:566:4: rule__Statement__Group_4__0
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
                    // InternalMiniJava.g:570:2: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:570:2: ( ( rule__Statement__Group_5__0 ) )
                    // InternalMiniJava.g:571:3: ( rule__Statement__Group_5__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_5()); 
                    // InternalMiniJava.g:572:3: ( rule__Statement__Group_5__0 )
                    // InternalMiniJava.g:572:4: rule__Statement__Group_5__0
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
    // InternalMiniJava.g:580:1: rule__Addition__ExpressionTypeAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__ExpressionTypeAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:584:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalMiniJava.g:585:2: ( '+' )
                    {
                    // InternalMiniJava.g:585:2: ( '+' )
                    // InternalMiniJava.g:586:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getExpressionTypePlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getExpressionTypePlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:591:2: ( '-' )
                    {
                    // InternalMiniJava.g:591:2: ( '-' )
                    // InternalMiniJava.g:592:3: '-'
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
    // InternalMiniJava.g:601:1: rule__Multiplication__ExpressionTypeAlternatives_1_1_0 : ( ( '*' ) | ( '&&' ) );
    public final void rule__Multiplication__ExpressionTypeAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:605:1: ( ( '*' ) | ( '&&' ) )
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
                    // InternalMiniJava.g:606:2: ( '*' )
                    {
                    // InternalMiniJava.g:606:2: ( '*' )
                    // InternalMiniJava.g:607:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getExpressionTypeAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getExpressionTypeAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:612:2: ( '&&' )
                    {
                    // InternalMiniJava.g:612:2: ( '&&' )
                    // InternalMiniJava.g:613:3: '&&'
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
    // InternalMiniJava.g:622:1: rule__NegationOrPointExpression__Alternatives : ( ( ruleNegation ) | ( rulePoint ) );
    public final void rule__NegationOrPointExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:626:1: ( ( ruleNegation ) | ( rulePoint ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==21||(LA5_0>=41 && LA5_0<=45)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:627:2: ( ruleNegation )
                    {
                    // InternalMiniJava.g:627:2: ( ruleNegation )
                    // InternalMiniJava.g:628:3: ruleNegation
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
                    // InternalMiniJava.g:633:2: ( rulePoint )
                    {
                    // InternalMiniJava.g:633:2: ( rulePoint )
                    // InternalMiniJava.g:634:3: rulePoint
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
    // InternalMiniJava.g:643:1: rule__Primary__Alternatives : ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_6 ) ) | ( ( rule__Primary__VariableAssignment_7 ) ) | ( ( rule__Primary__MethodCallAssignment_8 ) ) | ( ( rule__Primary__NumberAssignment_9 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:647:1: ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_6 ) ) | ( ( rule__Primary__VariableAssignment_7 ) ) | ( ( rule__Primary__MethodCallAssignment_8 ) ) | ( ( rule__Primary__NumberAssignment_9 ) ) )
            int alt6=10;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:648:2: ( ( rule__Primary__ExpressionTypeAssignment_0 ) )
                    {
                    // InternalMiniJava.g:648:2: ( ( rule__Primary__ExpressionTypeAssignment_0 ) )
                    // InternalMiniJava.g:649:3: ( rule__Primary__ExpressionTypeAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_0()); 
                    // InternalMiniJava.g:650:3: ( rule__Primary__ExpressionTypeAssignment_0 )
                    // InternalMiniJava.g:650:4: rule__Primary__ExpressionTypeAssignment_0
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
                    // InternalMiniJava.g:654:2: ( ( rule__Primary__ExpressionTypeAssignment_1 ) )
                    {
                    // InternalMiniJava.g:654:2: ( ( rule__Primary__ExpressionTypeAssignment_1 ) )
                    // InternalMiniJava.g:655:3: ( rule__Primary__ExpressionTypeAssignment_1 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_1()); 
                    // InternalMiniJava.g:656:3: ( rule__Primary__ExpressionTypeAssignment_1 )
                    // InternalMiniJava.g:656:4: rule__Primary__ExpressionTypeAssignment_1
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
                    // InternalMiniJava.g:660:2: ( ( rule__Primary__ExpressionTypeAssignment_2 ) )
                    {
                    // InternalMiniJava.g:660:2: ( ( rule__Primary__ExpressionTypeAssignment_2 ) )
                    // InternalMiniJava.g:661:3: ( rule__Primary__ExpressionTypeAssignment_2 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_2()); 
                    // InternalMiniJava.g:662:3: ( rule__Primary__ExpressionTypeAssignment_2 )
                    // InternalMiniJava.g:662:4: rule__Primary__ExpressionTypeAssignment_2
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
                    // InternalMiniJava.g:666:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:666:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalMiniJava.g:667:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalMiniJava.g:668:3: ( rule__Primary__Group_3__0 )
                    // InternalMiniJava.g:668:4: rule__Primary__Group_3__0
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
                    // InternalMiniJava.g:672:2: ( ( rule__Primary__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:672:2: ( ( rule__Primary__Group_4__0 ) )
                    // InternalMiniJava.g:673:3: ( rule__Primary__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    // InternalMiniJava.g:674:3: ( rule__Primary__Group_4__0 )
                    // InternalMiniJava.g:674:4: rule__Primary__Group_4__0
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
                    // InternalMiniJava.g:678:2: ( ( rule__Primary__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:678:2: ( ( rule__Primary__Group_5__0 ) )
                    // InternalMiniJava.g:679:3: ( rule__Primary__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_5()); 
                    // InternalMiniJava.g:680:3: ( rule__Primary__Group_5__0 )
                    // InternalMiniJava.g:680:4: rule__Primary__Group_5__0
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
                    // InternalMiniJava.g:684:2: ( ( rule__Primary__ExpressionTypeAssignment_6 ) )
                    {
                    // InternalMiniJava.g:684:2: ( ( rule__Primary__ExpressionTypeAssignment_6 ) )
                    // InternalMiniJava.g:685:3: ( rule__Primary__ExpressionTypeAssignment_6 )
                    {
                     before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_6()); 
                    // InternalMiniJava.g:686:3: ( rule__Primary__ExpressionTypeAssignment_6 )
                    // InternalMiniJava.g:686:4: rule__Primary__ExpressionTypeAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ExpressionTypeAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:690:2: ( ( rule__Primary__VariableAssignment_7 ) )
                    {
                    // InternalMiniJava.g:690:2: ( ( rule__Primary__VariableAssignment_7 ) )
                    // InternalMiniJava.g:691:3: ( rule__Primary__VariableAssignment_7 )
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableAssignment_7()); 
                    // InternalMiniJava.g:692:3: ( rule__Primary__VariableAssignment_7 )
                    // InternalMiniJava.g:692:4: rule__Primary__VariableAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__VariableAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getVariableAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:696:2: ( ( rule__Primary__MethodCallAssignment_8 ) )
                    {
                    // InternalMiniJava.g:696:2: ( ( rule__Primary__MethodCallAssignment_8 ) )
                    // InternalMiniJava.g:697:3: ( rule__Primary__MethodCallAssignment_8 )
                    {
                     before(grammarAccess.getPrimaryAccess().getMethodCallAssignment_8()); 
                    // InternalMiniJava.g:698:3: ( rule__Primary__MethodCallAssignment_8 )
                    // InternalMiniJava.g:698:4: rule__Primary__MethodCallAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__MethodCallAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getMethodCallAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMiniJava.g:702:2: ( ( rule__Primary__NumberAssignment_9 ) )
                    {
                    // InternalMiniJava.g:702:2: ( ( rule__Primary__NumberAssignment_9 ) )
                    // InternalMiniJava.g:703:3: ( rule__Primary__NumberAssignment_9 )
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberAssignment_9()); 
                    // InternalMiniJava.g:704:3: ( rule__Primary__NumberAssignment_9 )
                    // InternalMiniJava.g:704:4: rule__Primary__NumberAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__NumberAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getNumberAssignment_9()); 

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


    // $ANTLR start "rule__Program__Group__0"
    // InternalMiniJava.g:712:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:716:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMiniJava.g:717:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalMiniJava.g:724:1: rule__Program__Group__0__Impl : ( ( rule__Program__ClassDeclarationsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:728:1: ( ( ( rule__Program__ClassDeclarationsAssignment_0 ) ) )
            // InternalMiniJava.g:729:1: ( ( rule__Program__ClassDeclarationsAssignment_0 ) )
            {
            // InternalMiniJava.g:729:1: ( ( rule__Program__ClassDeclarationsAssignment_0 ) )
            // InternalMiniJava.g:730:2: ( rule__Program__ClassDeclarationsAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getClassDeclarationsAssignment_0()); 
            // InternalMiniJava.g:731:2: ( rule__Program__ClassDeclarationsAssignment_0 )
            // InternalMiniJava.g:731:3: rule__Program__ClassDeclarationsAssignment_0
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
    // InternalMiniJava.g:739:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:743:1: ( rule__Program__Group__1__Impl )
            // InternalMiniJava.g:744:2: rule__Program__Group__1__Impl
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
    // InternalMiniJava.g:750:1: rule__Program__Group__1__Impl : ( ( rule__Program__ClassDeclarationsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:754:1: ( ( ( rule__Program__ClassDeclarationsAssignment_1 )* ) )
            // InternalMiniJava.g:755:1: ( ( rule__Program__ClassDeclarationsAssignment_1 )* )
            {
            // InternalMiniJava.g:755:1: ( ( rule__Program__ClassDeclarationsAssignment_1 )* )
            // InternalMiniJava.g:756:2: ( rule__Program__ClassDeclarationsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getClassDeclarationsAssignment_1()); 
            // InternalMiniJava.g:757:2: ( rule__Program__ClassDeclarationsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMiniJava.g:757:3: rule__Program__ClassDeclarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ClassDeclarationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMiniJava.g:766:1: rule__MainClass__Group__0 : rule__MainClass__Group__0__Impl rule__MainClass__Group__1 ;
    public final void rule__MainClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:770:1: ( rule__MainClass__Group__0__Impl rule__MainClass__Group__1 )
            // InternalMiniJava.g:771:2: rule__MainClass__Group__0__Impl rule__MainClass__Group__1
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
    // InternalMiniJava.g:778:1: rule__MainClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__MainClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:782:1: ( ( 'class' ) )
            // InternalMiniJava.g:783:1: ( 'class' )
            {
            // InternalMiniJava.g:783:1: ( 'class' )
            // InternalMiniJava.g:784:2: 'class'
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
    // InternalMiniJava.g:793:1: rule__MainClass__Group__1 : rule__MainClass__Group__1__Impl rule__MainClass__Group__2 ;
    public final void rule__MainClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:797:1: ( rule__MainClass__Group__1__Impl rule__MainClass__Group__2 )
            // InternalMiniJava.g:798:2: rule__MainClass__Group__1__Impl rule__MainClass__Group__2
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
    // InternalMiniJava.g:805:1: rule__MainClass__Group__1__Impl : ( ( rule__MainClass__NameAssignment_1 ) ) ;
    public final void rule__MainClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:809:1: ( ( ( rule__MainClass__NameAssignment_1 ) ) )
            // InternalMiniJava.g:810:1: ( ( rule__MainClass__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:810:1: ( ( rule__MainClass__NameAssignment_1 ) )
            // InternalMiniJava.g:811:2: ( rule__MainClass__NameAssignment_1 )
            {
             before(grammarAccess.getMainClassAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:812:2: ( rule__MainClass__NameAssignment_1 )
            // InternalMiniJava.g:812:3: rule__MainClass__NameAssignment_1
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
    // InternalMiniJava.g:820:1: rule__MainClass__Group__2 : rule__MainClass__Group__2__Impl rule__MainClass__Group__3 ;
    public final void rule__MainClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:824:1: ( rule__MainClass__Group__2__Impl rule__MainClass__Group__3 )
            // InternalMiniJava.g:825:2: rule__MainClass__Group__2__Impl rule__MainClass__Group__3
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
    // InternalMiniJava.g:832:1: rule__MainClass__Group__2__Impl : ( '{' ) ;
    public final void rule__MainClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:836:1: ( ( '{' ) )
            // InternalMiniJava.g:837:1: ( '{' )
            {
            // InternalMiniJava.g:837:1: ( '{' )
            // InternalMiniJava.g:838:2: '{'
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
    // InternalMiniJava.g:847:1: rule__MainClass__Group__3 : rule__MainClass__Group__3__Impl rule__MainClass__Group__4 ;
    public final void rule__MainClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:851:1: ( rule__MainClass__Group__3__Impl rule__MainClass__Group__4 )
            // InternalMiniJava.g:852:2: rule__MainClass__Group__3__Impl rule__MainClass__Group__4
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
    // InternalMiniJava.g:859:1: rule__MainClass__Group__3__Impl : ( 'public' ) ;
    public final void rule__MainClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:863:1: ( ( 'public' ) )
            // InternalMiniJava.g:864:1: ( 'public' )
            {
            // InternalMiniJava.g:864:1: ( 'public' )
            // InternalMiniJava.g:865:2: 'public'
            {
             before(grammarAccess.getMainClassAccess().getPublicKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getPublicKeyword_3()); 

            }


            }

        }
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
    // InternalMiniJava.g:874:1: rule__MainClass__Group__4 : rule__MainClass__Group__4__Impl rule__MainClass__Group__5 ;
    public final void rule__MainClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:878:1: ( rule__MainClass__Group__4__Impl rule__MainClass__Group__5 )
            // InternalMiniJava.g:879:2: rule__MainClass__Group__4__Impl rule__MainClass__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MainClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMiniJava.g:886:1: rule__MainClass__Group__4__Impl : ( 'static' ) ;
    public final void rule__MainClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:890:1: ( ( 'static' ) )
            // InternalMiniJava.g:891:1: ( 'static' )
            {
            // InternalMiniJava.g:891:1: ( 'static' )
            // InternalMiniJava.g:892:2: 'static'
            {
             before(grammarAccess.getMainClassAccess().getStaticKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getStaticKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__MainClass__Group__5"
    // InternalMiniJava.g:901:1: rule__MainClass__Group__5 : rule__MainClass__Group__5__Impl rule__MainClass__Group__6 ;
    public final void rule__MainClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:905:1: ( rule__MainClass__Group__5__Impl rule__MainClass__Group__6 )
            // InternalMiniJava.g:906:2: rule__MainClass__Group__5__Impl rule__MainClass__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__MainClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__5"


    // $ANTLR start "rule__MainClass__Group__5__Impl"
    // InternalMiniJava.g:913:1: rule__MainClass__Group__5__Impl : ( 'void' ) ;
    public final void rule__MainClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:917:1: ( ( 'void' ) )
            // InternalMiniJava.g:918:1: ( 'void' )
            {
            // InternalMiniJava.g:918:1: ( 'void' )
            // InternalMiniJava.g:919:2: 'void'
            {
             before(grammarAccess.getMainClassAccess().getVoidKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getVoidKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__5__Impl"


    // $ANTLR start "rule__MainClass__Group__6"
    // InternalMiniJava.g:928:1: rule__MainClass__Group__6 : rule__MainClass__Group__6__Impl rule__MainClass__Group__7 ;
    public final void rule__MainClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:932:1: ( rule__MainClass__Group__6__Impl rule__MainClass__Group__7 )
            // InternalMiniJava.g:933:2: rule__MainClass__Group__6__Impl rule__MainClass__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__MainClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__6"


    // $ANTLR start "rule__MainClass__Group__6__Impl"
    // InternalMiniJava.g:940:1: rule__MainClass__Group__6__Impl : ( 'main' ) ;
    public final void rule__MainClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:944:1: ( ( 'main' ) )
            // InternalMiniJava.g:945:1: ( 'main' )
            {
            // InternalMiniJava.g:945:1: ( 'main' )
            // InternalMiniJava.g:946:2: 'main'
            {
             before(grammarAccess.getMainClassAccess().getMainKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getMainKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__6__Impl"


    // $ANTLR start "rule__MainClass__Group__7"
    // InternalMiniJava.g:955:1: rule__MainClass__Group__7 : rule__MainClass__Group__7__Impl rule__MainClass__Group__8 ;
    public final void rule__MainClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:959:1: ( rule__MainClass__Group__7__Impl rule__MainClass__Group__8 )
            // InternalMiniJava.g:960:2: rule__MainClass__Group__7__Impl rule__MainClass__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__MainClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__7"


    // $ANTLR start "rule__MainClass__Group__7__Impl"
    // InternalMiniJava.g:967:1: rule__MainClass__Group__7__Impl : ( '(' ) ;
    public final void rule__MainClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:971:1: ( ( '(' ) )
            // InternalMiniJava.g:972:1: ( '(' )
            {
            // InternalMiniJava.g:972:1: ( '(' )
            // InternalMiniJava.g:973:2: '('
            {
             before(grammarAccess.getMainClassAccess().getLeftParenthesisKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__7__Impl"


    // $ANTLR start "rule__MainClass__Group__8"
    // InternalMiniJava.g:982:1: rule__MainClass__Group__8 : rule__MainClass__Group__8__Impl rule__MainClass__Group__9 ;
    public final void rule__MainClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:986:1: ( rule__MainClass__Group__8__Impl rule__MainClass__Group__9 )
            // InternalMiniJava.g:987:2: rule__MainClass__Group__8__Impl rule__MainClass__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__MainClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__8"


    // $ANTLR start "rule__MainClass__Group__8__Impl"
    // InternalMiniJava.g:994:1: rule__MainClass__Group__8__Impl : ( 'String' ) ;
    public final void rule__MainClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:998:1: ( ( 'String' ) )
            // InternalMiniJava.g:999:1: ( 'String' )
            {
            // InternalMiniJava.g:999:1: ( 'String' )
            // InternalMiniJava.g:1000:2: 'String'
            {
             before(grammarAccess.getMainClassAccess().getStringKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getStringKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__8__Impl"


    // $ANTLR start "rule__MainClass__Group__9"
    // InternalMiniJava.g:1009:1: rule__MainClass__Group__9 : rule__MainClass__Group__9__Impl rule__MainClass__Group__10 ;
    public final void rule__MainClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1013:1: ( rule__MainClass__Group__9__Impl rule__MainClass__Group__10 )
            // InternalMiniJava.g:1014:2: rule__MainClass__Group__9__Impl rule__MainClass__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__MainClass__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__9"


    // $ANTLR start "rule__MainClass__Group__9__Impl"
    // InternalMiniJava.g:1021:1: rule__MainClass__Group__9__Impl : ( '[' ) ;
    public final void rule__MainClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1025:1: ( ( '[' ) )
            // InternalMiniJava.g:1026:1: ( '[' )
            {
            // InternalMiniJava.g:1026:1: ( '[' )
            // InternalMiniJava.g:1027:2: '['
            {
             before(grammarAccess.getMainClassAccess().getLeftSquareBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getLeftSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__9__Impl"


    // $ANTLR start "rule__MainClass__Group__10"
    // InternalMiniJava.g:1036:1: rule__MainClass__Group__10 : rule__MainClass__Group__10__Impl rule__MainClass__Group__11 ;
    public final void rule__MainClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1040:1: ( rule__MainClass__Group__10__Impl rule__MainClass__Group__11 )
            // InternalMiniJava.g:1041:2: rule__MainClass__Group__10__Impl rule__MainClass__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__MainClass__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__10"


    // $ANTLR start "rule__MainClass__Group__10__Impl"
    // InternalMiniJava.g:1048:1: rule__MainClass__Group__10__Impl : ( ']' ) ;
    public final void rule__MainClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1052:1: ( ( ']' ) )
            // InternalMiniJava.g:1053:1: ( ']' )
            {
            // InternalMiniJava.g:1053:1: ( ']' )
            // InternalMiniJava.g:1054:2: ']'
            {
             before(grammarAccess.getMainClassAccess().getRightSquareBracketKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__10__Impl"


    // $ANTLR start "rule__MainClass__Group__11"
    // InternalMiniJava.g:1063:1: rule__MainClass__Group__11 : rule__MainClass__Group__11__Impl rule__MainClass__Group__12 ;
    public final void rule__MainClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1067:1: ( rule__MainClass__Group__11__Impl rule__MainClass__Group__12 )
            // InternalMiniJava.g:1068:2: rule__MainClass__Group__11__Impl rule__MainClass__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__MainClass__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__11"


    // $ANTLR start "rule__MainClass__Group__11__Impl"
    // InternalMiniJava.g:1075:1: rule__MainClass__Group__11__Impl : ( RULE_ID ) ;
    public final void rule__MainClass__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1079:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1080:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1080:1: ( RULE_ID )
            // InternalMiniJava.g:1081:2: RULE_ID
            {
             before(grammarAccess.getMainClassAccess().getIDTerminalRuleCall_11()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getIDTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__11__Impl"


    // $ANTLR start "rule__MainClass__Group__12"
    // InternalMiniJava.g:1090:1: rule__MainClass__Group__12 : rule__MainClass__Group__12__Impl rule__MainClass__Group__13 ;
    public final void rule__MainClass__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1094:1: ( rule__MainClass__Group__12__Impl rule__MainClass__Group__13 )
            // InternalMiniJava.g:1095:2: rule__MainClass__Group__12__Impl rule__MainClass__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__MainClass__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__12"


    // $ANTLR start "rule__MainClass__Group__12__Impl"
    // InternalMiniJava.g:1102:1: rule__MainClass__Group__12__Impl : ( ')' ) ;
    public final void rule__MainClass__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1106:1: ( ( ')' ) )
            // InternalMiniJava.g:1107:1: ( ')' )
            {
            // InternalMiniJava.g:1107:1: ( ')' )
            // InternalMiniJava.g:1108:2: ')'
            {
             before(grammarAccess.getMainClassAccess().getRightParenthesisKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__12__Impl"


    // $ANTLR start "rule__MainClass__Group__13"
    // InternalMiniJava.g:1117:1: rule__MainClass__Group__13 : rule__MainClass__Group__13__Impl rule__MainClass__Group__14 ;
    public final void rule__MainClass__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1121:1: ( rule__MainClass__Group__13__Impl rule__MainClass__Group__14 )
            // InternalMiniJava.g:1122:2: rule__MainClass__Group__13__Impl rule__MainClass__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__MainClass__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__13"


    // $ANTLR start "rule__MainClass__Group__13__Impl"
    // InternalMiniJava.g:1129:1: rule__MainClass__Group__13__Impl : ( '{' ) ;
    public final void rule__MainClass__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1133:1: ( ( '{' ) )
            // InternalMiniJava.g:1134:1: ( '{' )
            {
            // InternalMiniJava.g:1134:1: ( '{' )
            // InternalMiniJava.g:1135:2: '{'
            {
             before(grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__13__Impl"


    // $ANTLR start "rule__MainClass__Group__14"
    // InternalMiniJava.g:1144:1: rule__MainClass__Group__14 : rule__MainClass__Group__14__Impl rule__MainClass__Group__15 ;
    public final void rule__MainClass__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1148:1: ( rule__MainClass__Group__14__Impl rule__MainClass__Group__15 )
            // InternalMiniJava.g:1149:2: rule__MainClass__Group__14__Impl rule__MainClass__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__MainClass__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__14"


    // $ANTLR start "rule__MainClass__Group__14__Impl"
    // InternalMiniJava.g:1156:1: rule__MainClass__Group__14__Impl : ( ( rule__MainClass__StatementAssignment_14 ) ) ;
    public final void rule__MainClass__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1160:1: ( ( ( rule__MainClass__StatementAssignment_14 ) ) )
            // InternalMiniJava.g:1161:1: ( ( rule__MainClass__StatementAssignment_14 ) )
            {
            // InternalMiniJava.g:1161:1: ( ( rule__MainClass__StatementAssignment_14 ) )
            // InternalMiniJava.g:1162:2: ( rule__MainClass__StatementAssignment_14 )
            {
             before(grammarAccess.getMainClassAccess().getStatementAssignment_14()); 
            // InternalMiniJava.g:1163:2: ( rule__MainClass__StatementAssignment_14 )
            // InternalMiniJava.g:1163:3: rule__MainClass__StatementAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__StatementAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMainClassAccess().getStatementAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__14__Impl"


    // $ANTLR start "rule__MainClass__Group__15"
    // InternalMiniJava.g:1171:1: rule__MainClass__Group__15 : rule__MainClass__Group__15__Impl rule__MainClass__Group__16 ;
    public final void rule__MainClass__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1175:1: ( rule__MainClass__Group__15__Impl rule__MainClass__Group__16 )
            // InternalMiniJava.g:1176:2: rule__MainClass__Group__15__Impl rule__MainClass__Group__16
            {
            pushFollow(FOLLOW_17);
            rule__MainClass__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClass__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__15"


    // $ANTLR start "rule__MainClass__Group__15__Impl"
    // InternalMiniJava.g:1183:1: rule__MainClass__Group__15__Impl : ( '}' ) ;
    public final void rule__MainClass__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1187:1: ( ( '}' ) )
            // InternalMiniJava.g:1188:1: ( '}' )
            {
            // InternalMiniJava.g:1188:1: ( '}' )
            // InternalMiniJava.g:1189:2: '}'
            {
             before(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_15()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__15__Impl"


    // $ANTLR start "rule__MainClass__Group__16"
    // InternalMiniJava.g:1198:1: rule__MainClass__Group__16 : rule__MainClass__Group__16__Impl ;
    public final void rule__MainClass__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1202:1: ( rule__MainClass__Group__16__Impl )
            // InternalMiniJava.g:1203:2: rule__MainClass__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainClass__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__16"


    // $ANTLR start "rule__MainClass__Group__16__Impl"
    // InternalMiniJava.g:1209:1: rule__MainClass__Group__16__Impl : ( '}' ) ;
    public final void rule__MainClass__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1213:1: ( ( '}' ) )
            // InternalMiniJava.g:1214:1: ( '}' )
            {
            // InternalMiniJava.g:1214:1: ( '}' )
            // InternalMiniJava.g:1215:2: '}'
            {
             before(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_16()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__Group__16__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalMiniJava.g:1225:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1229:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalMiniJava.g:1230:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
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
    // InternalMiniJava.g:1237:1: rule__ClassDeclaration__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1241:1: ( ( 'class' ) )
            // InternalMiniJava.g:1242:1: ( 'class' )
            {
            // InternalMiniJava.g:1242:1: ( 'class' )
            // InternalMiniJava.g:1243:2: 'class'
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
    // InternalMiniJava.g:1252:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1256:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalMiniJava.g:1257:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalMiniJava.g:1264:1: rule__ClassDeclaration__Group__1__Impl : ( ( rule__ClassDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1268:1: ( ( ( rule__ClassDeclaration__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1269:1: ( ( rule__ClassDeclaration__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1269:1: ( ( rule__ClassDeclaration__NameAssignment_1 ) )
            // InternalMiniJava.g:1270:2: ( rule__ClassDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:1271:2: ( rule__ClassDeclaration__NameAssignment_1 )
            // InternalMiniJava.g:1271:3: rule__ClassDeclaration__NameAssignment_1
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
    // InternalMiniJava.g:1279:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1283:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalMiniJava.g:1284:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
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
    // InternalMiniJava.g:1291:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__Group_2__0 )? ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1295:1: ( ( ( rule__ClassDeclaration__Group_2__0 )? ) )
            // InternalMiniJava.g:1296:1: ( ( rule__ClassDeclaration__Group_2__0 )? )
            {
            // InternalMiniJava.g:1296:1: ( ( rule__ClassDeclaration__Group_2__0 )? )
            // InternalMiniJava.g:1297:2: ( rule__ClassDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_2()); 
            // InternalMiniJava.g:1298:2: ( rule__ClassDeclaration__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:1298:3: rule__ClassDeclaration__Group_2__0
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
    // InternalMiniJava.g:1306:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1310:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalMiniJava.g:1311:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
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
    // InternalMiniJava.g:1318:1: rule__ClassDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1322:1: ( ( '{' ) )
            // InternalMiniJava.g:1323:1: ( '{' )
            {
            // InternalMiniJava.g:1323:1: ( '{' )
            // InternalMiniJava.g:1324:2: '{'
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
    // InternalMiniJava.g:1333:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1337:1: ( rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 )
            // InternalMiniJava.g:1338:2: rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5
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
    // InternalMiniJava.g:1345:1: rule__ClassDeclaration__Group__4__Impl : ( ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )* ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1349:1: ( ( ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )* ) )
            // InternalMiniJava.g:1350:1: ( ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )* )
            {
            // InternalMiniJava.g:1350:1: ( ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )* )
            // InternalMiniJava.g:1351:2: ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getVarDeclarationsAssignment_4()); 
            // InternalMiniJava.g:1352:2: ( rule__ClassDeclaration__VarDeclarationsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==28||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMiniJava.g:1352:3: rule__ClassDeclaration__VarDeclarationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ClassDeclaration__VarDeclarationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMiniJava.g:1360:1: rule__ClassDeclaration__Group__5 : rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6 ;
    public final void rule__ClassDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1364:1: ( rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6 )
            // InternalMiniJava.g:1365:2: rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6
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
    // InternalMiniJava.g:1372:1: rule__ClassDeclaration__Group__5__Impl : ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )* ) ;
    public final void rule__ClassDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1376:1: ( ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )* ) )
            // InternalMiniJava.g:1377:1: ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )* )
            {
            // InternalMiniJava.g:1377:1: ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )* )
            // InternalMiniJava.g:1378:2: ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsAssignment_5()); 
            // InternalMiniJava.g:1379:2: ( rule__ClassDeclaration__MethodDeclarationsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMiniJava.g:1379:3: rule__ClassDeclaration__MethodDeclarationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ClassDeclaration__MethodDeclarationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMiniJava.g:1387:1: rule__ClassDeclaration__Group__6 : rule__ClassDeclaration__Group__6__Impl ;
    public final void rule__ClassDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1391:1: ( rule__ClassDeclaration__Group__6__Impl )
            // InternalMiniJava.g:1392:2: rule__ClassDeclaration__Group__6__Impl
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
    // InternalMiniJava.g:1398:1: rule__ClassDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1402:1: ( ( '}' ) )
            // InternalMiniJava.g:1403:1: ( '}' )
            {
            // InternalMiniJava.g:1403:1: ( '}' )
            // InternalMiniJava.g:1404:2: '}'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMiniJava.g:1414:1: rule__ClassDeclaration__Group_2__0 : rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1 ;
    public final void rule__ClassDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1418:1: ( rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1 )
            // InternalMiniJava.g:1419:2: rule__ClassDeclaration__Group_2__0__Impl rule__ClassDeclaration__Group_2__1
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
    // InternalMiniJava.g:1426:1: rule__ClassDeclaration__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1430:1: ( ( 'extends' ) )
            // InternalMiniJava.g:1431:1: ( 'extends' )
            {
            // InternalMiniJava.g:1431:1: ( 'extends' )
            // InternalMiniJava.g:1432:2: 'extends'
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
    // InternalMiniJava.g:1441:1: rule__ClassDeclaration__Group_2__1 : rule__ClassDeclaration__Group_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1445:1: ( rule__ClassDeclaration__Group_2__1__Impl )
            // InternalMiniJava.g:1446:2: rule__ClassDeclaration__Group_2__1__Impl
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
    // InternalMiniJava.g:1452:1: rule__ClassDeclaration__Group_2__1__Impl : ( ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1456:1: ( ( ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 ) ) )
            // InternalMiniJava.g:1457:1: ( ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 ) )
            {
            // InternalMiniJava.g:1457:1: ( ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 ) )
            // InternalMiniJava.g:1458:2: ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendedClassAssignment_2_1()); 
            // InternalMiniJava.g:1459:2: ( rule__ClassDeclaration__ExtendedClassAssignment_2_1 )
            // InternalMiniJava.g:1459:3: rule__ClassDeclaration__ExtendedClassAssignment_2_1
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
    // InternalMiniJava.g:1468:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1472:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalMiniJava.g:1473:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMiniJava.g:1480:1: rule__Type__Group_0__0__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1484:1: ( ( 'int' ) )
            // InternalMiniJava.g:1485:1: ( 'int' )
            {
            // InternalMiniJava.g:1485:1: ( 'int' )
            // InternalMiniJava.g:1486:2: 'int'
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
    // InternalMiniJava.g:1495:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl rule__Type__Group_0__2 ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1499:1: ( rule__Type__Group_0__1__Impl rule__Type__Group_0__2 )
            // InternalMiniJava.g:1500:2: rule__Type__Group_0__1__Impl rule__Type__Group_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMiniJava.g:1507:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__TypeNameAssignment_0_1 ) ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1511:1: ( ( ( rule__Type__TypeNameAssignment_0_1 ) ) )
            // InternalMiniJava.g:1512:1: ( ( rule__Type__TypeNameAssignment_0_1 ) )
            {
            // InternalMiniJava.g:1512:1: ( ( rule__Type__TypeNameAssignment_0_1 ) )
            // InternalMiniJava.g:1513:2: ( rule__Type__TypeNameAssignment_0_1 )
            {
             before(grammarAccess.getTypeAccess().getTypeNameAssignment_0_1()); 
            // InternalMiniJava.g:1514:2: ( rule__Type__TypeNameAssignment_0_1 )
            // InternalMiniJava.g:1514:3: rule__Type__TypeNameAssignment_0_1
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
    // InternalMiniJava.g:1522:1: rule__Type__Group_0__2 : rule__Type__Group_0__2__Impl ;
    public final void rule__Type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1526:1: ( rule__Type__Group_0__2__Impl )
            // InternalMiniJava.g:1527:2: rule__Type__Group_0__2__Impl
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
    // InternalMiniJava.g:1533:1: rule__Type__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1537:1: ( ( ']' ) )
            // InternalMiniJava.g:1538:1: ( ']' )
            {
            // InternalMiniJava.g:1538:1: ( ']' )
            // InternalMiniJava.g:1539:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMiniJava.g:1549:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1553:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalMiniJava.g:1554:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalMiniJava.g:1561:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VariableAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1565:1: ( ( ( rule__VarDeclaration__VariableAssignment_0 ) ) )
            // InternalMiniJava.g:1566:1: ( ( rule__VarDeclaration__VariableAssignment_0 ) )
            {
            // InternalMiniJava.g:1566:1: ( ( rule__VarDeclaration__VariableAssignment_0 ) )
            // InternalMiniJava.g:1567:2: ( rule__VarDeclaration__VariableAssignment_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVariableAssignment_0()); 
            // InternalMiniJava.g:1568:2: ( rule__VarDeclaration__VariableAssignment_0 )
            // InternalMiniJava.g:1568:3: rule__VarDeclaration__VariableAssignment_0
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
    // InternalMiniJava.g:1576:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1580:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalMiniJava.g:1581:2: rule__VarDeclaration__Group__1__Impl
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
    // InternalMiniJava.g:1587:1: rule__VarDeclaration__Group__1__Impl : ( ';' ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1591:1: ( ( ';' ) )
            // InternalMiniJava.g:1592:1: ( ';' )
            {
            // InternalMiniJava.g:1592:1: ( ';' )
            // InternalMiniJava.g:1593:2: ';'
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
    // InternalMiniJava.g:1603:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1607:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMiniJava.g:1608:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalMiniJava.g:1615:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VariableTypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1619:1: ( ( ( rule__Variable__VariableTypeAssignment_0 ) ) )
            // InternalMiniJava.g:1620:1: ( ( rule__Variable__VariableTypeAssignment_0 ) )
            {
            // InternalMiniJava.g:1620:1: ( ( rule__Variable__VariableTypeAssignment_0 ) )
            // InternalMiniJava.g:1621:2: ( rule__Variable__VariableTypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getVariableTypeAssignment_0()); 
            // InternalMiniJava.g:1622:2: ( rule__Variable__VariableTypeAssignment_0 )
            // InternalMiniJava.g:1622:3: rule__Variable__VariableTypeAssignment_0
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
    // InternalMiniJava.g:1630:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1634:1: ( rule__Variable__Group__1__Impl )
            // InternalMiniJava.g:1635:2: rule__Variable__Group__1__Impl
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
    // InternalMiniJava.g:1641:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1645:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1646:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1646:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalMiniJava.g:1647:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:1648:2: ( rule__Variable__NameAssignment_1 )
            // InternalMiniJava.g:1648:3: rule__Variable__NameAssignment_1
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
    // InternalMiniJava.g:1657:1: rule__MethodDeclaration__Group__0 : rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1 ;
    public final void rule__MethodDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1661:1: ( rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1 )
            // InternalMiniJava.g:1662:2: rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1
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
    // InternalMiniJava.g:1669:1: rule__MethodDeclaration__Group__0__Impl : ( 'public' ) ;
    public final void rule__MethodDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1673:1: ( ( 'public' ) )
            // InternalMiniJava.g:1674:1: ( 'public' )
            {
            // InternalMiniJava.g:1674:1: ( 'public' )
            // InternalMiniJava.g:1675:2: 'public'
            {
             before(grammarAccess.getMethodDeclarationAccess().getPublicKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMiniJava.g:1684:1: rule__MethodDeclaration__Group__1 : rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2 ;
    public final void rule__MethodDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1688:1: ( rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2 )
            // InternalMiniJava.g:1689:2: rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2
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
    // InternalMiniJava.g:1696:1: rule__MethodDeclaration__Group__1__Impl : ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) ) ;
    public final void rule__MethodDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1700:1: ( ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) ) )
            // InternalMiniJava.g:1701:1: ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) )
            {
            // InternalMiniJava.g:1701:1: ( ( rule__MethodDeclaration__MethodTypeAssignment_1 ) )
            // InternalMiniJava.g:1702:2: ( rule__MethodDeclaration__MethodTypeAssignment_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getMethodTypeAssignment_1()); 
            // InternalMiniJava.g:1703:2: ( rule__MethodDeclaration__MethodTypeAssignment_1 )
            // InternalMiniJava.g:1703:3: rule__MethodDeclaration__MethodTypeAssignment_1
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
    // InternalMiniJava.g:1711:1: rule__MethodDeclaration__Group__2 : rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3 ;
    public final void rule__MethodDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1715:1: ( rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3 )
            // InternalMiniJava.g:1716:2: rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:1723:1: rule__MethodDeclaration__Group__2__Impl : ( ( rule__MethodDeclaration__NameAssignment_2 ) ) ;
    public final void rule__MethodDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1727:1: ( ( ( rule__MethodDeclaration__NameAssignment_2 ) ) )
            // InternalMiniJava.g:1728:1: ( ( rule__MethodDeclaration__NameAssignment_2 ) )
            {
            // InternalMiniJava.g:1728:1: ( ( rule__MethodDeclaration__NameAssignment_2 ) )
            // InternalMiniJava.g:1729:2: ( rule__MethodDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getNameAssignment_2()); 
            // InternalMiniJava.g:1730:2: ( rule__MethodDeclaration__NameAssignment_2 )
            // InternalMiniJava.g:1730:3: rule__MethodDeclaration__NameAssignment_2
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
    // InternalMiniJava.g:1738:1: rule__MethodDeclaration__Group__3 : rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4 ;
    public final void rule__MethodDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1742:1: ( rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4 )
            // InternalMiniJava.g:1743:2: rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4
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
    // InternalMiniJava.g:1750:1: rule__MethodDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1754:1: ( ( '(' ) )
            // InternalMiniJava.g:1755:1: ( '(' )
            {
            // InternalMiniJava.g:1755:1: ( '(' )
            // InternalMiniJava.g:1756:2: '('
            {
             before(grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMiniJava.g:1765:1: rule__MethodDeclaration__Group__4 : rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5 ;
    public final void rule__MethodDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1769:1: ( rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5 )
            // InternalMiniJava.g:1770:2: rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5
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
    // InternalMiniJava.g:1777:1: rule__MethodDeclaration__Group__4__Impl : ( ( rule__MethodDeclaration__Group_4__0 )? ) ;
    public final void rule__MethodDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1781:1: ( ( ( rule__MethodDeclaration__Group_4__0 )? ) )
            // InternalMiniJava.g:1782:1: ( ( rule__MethodDeclaration__Group_4__0 )? )
            {
            // InternalMiniJava.g:1782:1: ( ( rule__MethodDeclaration__Group_4__0 )? )
            // InternalMiniJava.g:1783:2: ( rule__MethodDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup_4()); 
            // InternalMiniJava.g:1784:2: ( rule__MethodDeclaration__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==28||LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMiniJava.g:1784:3: rule__MethodDeclaration__Group_4__0
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
    // InternalMiniJava.g:1792:1: rule__MethodDeclaration__Group__5 : rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6 ;
    public final void rule__MethodDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1796:1: ( rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6 )
            // InternalMiniJava.g:1797:2: rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6
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
    // InternalMiniJava.g:1804:1: rule__MethodDeclaration__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1808:1: ( ( ')' ) )
            // InternalMiniJava.g:1809:1: ( ')' )
            {
            // InternalMiniJava.g:1809:1: ( ')' )
            // InternalMiniJava.g:1810:2: ')'
            {
             before(grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMiniJava.g:1819:1: rule__MethodDeclaration__Group__6 : rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7 ;
    public final void rule__MethodDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1823:1: ( rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7 )
            // InternalMiniJava.g:1824:2: rule__MethodDeclaration__Group__6__Impl rule__MethodDeclaration__Group__7
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
    // InternalMiniJava.g:1831:1: rule__MethodDeclaration__Group__6__Impl : ( '{' ) ;
    public final void rule__MethodDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1835:1: ( ( '{' ) )
            // InternalMiniJava.g:1836:1: ( '{' )
            {
            // InternalMiniJava.g:1836:1: ( '{' )
            // InternalMiniJava.g:1837:2: '{'
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
    // InternalMiniJava.g:1846:1: rule__MethodDeclaration__Group__7 : rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8 ;
    public final void rule__MethodDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1850:1: ( rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8 )
            // InternalMiniJava.g:1851:2: rule__MethodDeclaration__Group__7__Impl rule__MethodDeclaration__Group__8
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
    // InternalMiniJava.g:1858:1: rule__MethodDeclaration__Group__7__Impl : ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* ) ;
    public final void rule__MethodDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1862:1: ( ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* ) )
            // InternalMiniJava.g:1863:1: ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* )
            {
            // InternalMiniJava.g:1863:1: ( ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )* )
            // InternalMiniJava.g:1864:2: ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsAssignment_7()); 
            // InternalMiniJava.g:1865:2: ( rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==28||LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMiniJava.g:1865:3: rule__MethodDeclaration__LocalVarDeclarationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MethodDeclaration__LocalVarDeclarationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMiniJava.g:1873:1: rule__MethodDeclaration__Group__8 : rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9 ;
    public final void rule__MethodDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1877:1: ( rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9 )
            // InternalMiniJava.g:1878:2: rule__MethodDeclaration__Group__8__Impl rule__MethodDeclaration__Group__9
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
    // InternalMiniJava.g:1885:1: rule__MethodDeclaration__Group__8__Impl : ( ( rule__MethodDeclaration__StatementsAssignment_8 )* ) ;
    public final void rule__MethodDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1889:1: ( ( ( rule__MethodDeclaration__StatementsAssignment_8 )* ) )
            // InternalMiniJava.g:1890:1: ( ( rule__MethodDeclaration__StatementsAssignment_8 )* )
            {
            // InternalMiniJava.g:1890:1: ( ( rule__MethodDeclaration__StatementsAssignment_8 )* )
            // InternalMiniJava.g:1891:2: ( rule__MethodDeclaration__StatementsAssignment_8 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getStatementsAssignment_8()); 
            // InternalMiniJava.g:1892:2: ( rule__MethodDeclaration__StatementsAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==16||(LA13_0>=34 && LA13_0<=36)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMiniJava.g:1892:3: rule__MethodDeclaration__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__MethodDeclaration__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMiniJava.g:1900:1: rule__MethodDeclaration__Group__9 : rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10 ;
    public final void rule__MethodDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1904:1: ( rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10 )
            // InternalMiniJava.g:1905:2: rule__MethodDeclaration__Group__9__Impl rule__MethodDeclaration__Group__10
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:1912:1: rule__MethodDeclaration__Group__9__Impl : ( 'return' ) ;
    public final void rule__MethodDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1916:1: ( ( 'return' ) )
            // InternalMiniJava.g:1917:1: ( 'return' )
            {
            // InternalMiniJava.g:1917:1: ( 'return' )
            // InternalMiniJava.g:1918:2: 'return'
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9()); 

            }


            }

        }
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
    // InternalMiniJava.g:1927:1: rule__MethodDeclaration__Group__10 : rule__MethodDeclaration__Group__10__Impl rule__MethodDeclaration__Group__11 ;
    public final void rule__MethodDeclaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1931:1: ( rule__MethodDeclaration__Group__10__Impl rule__MethodDeclaration__Group__11 )
            // InternalMiniJava.g:1932:2: rule__MethodDeclaration__Group__10__Impl rule__MethodDeclaration__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__MethodDeclaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__11();

            state._fsp--;


            }

        }
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
    // InternalMiniJava.g:1939:1: rule__MethodDeclaration__Group__10__Impl : ( ( rule__MethodDeclaration__ReturnExpressionAssignment_10 ) ) ;
    public final void rule__MethodDeclaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1943:1: ( ( ( rule__MethodDeclaration__ReturnExpressionAssignment_10 ) ) )
            // InternalMiniJava.g:1944:1: ( ( rule__MethodDeclaration__ReturnExpressionAssignment_10 ) )
            {
            // InternalMiniJava.g:1944:1: ( ( rule__MethodDeclaration__ReturnExpressionAssignment_10 ) )
            // InternalMiniJava.g:1945:2: ( rule__MethodDeclaration__ReturnExpressionAssignment_10 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnExpressionAssignment_10()); 
            // InternalMiniJava.g:1946:2: ( rule__MethodDeclaration__ReturnExpressionAssignment_10 )
            // InternalMiniJava.g:1946:3: rule__MethodDeclaration__ReturnExpressionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__ReturnExpressionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getReturnExpressionAssignment_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__MethodDeclaration__Group__11"
    // InternalMiniJava.g:1954:1: rule__MethodDeclaration__Group__11 : rule__MethodDeclaration__Group__11__Impl rule__MethodDeclaration__Group__12 ;
    public final void rule__MethodDeclaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1958:1: ( rule__MethodDeclaration__Group__11__Impl rule__MethodDeclaration__Group__12 )
            // InternalMiniJava.g:1959:2: rule__MethodDeclaration__Group__11__Impl rule__MethodDeclaration__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__MethodDeclaration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__11"


    // $ANTLR start "rule__MethodDeclaration__Group__11__Impl"
    // InternalMiniJava.g:1966:1: rule__MethodDeclaration__Group__11__Impl : ( ';' ) ;
    public final void rule__MethodDeclaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1970:1: ( ( ';' ) )
            // InternalMiniJava.g:1971:1: ( ';' )
            {
            // InternalMiniJava.g:1971:1: ( ';' )
            // InternalMiniJava.g:1972:2: ';'
            {
             before(grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__11__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__12"
    // InternalMiniJava.g:1981:1: rule__MethodDeclaration__Group__12 : rule__MethodDeclaration__Group__12__Impl ;
    public final void rule__MethodDeclaration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1985:1: ( rule__MethodDeclaration__Group__12__Impl )
            // InternalMiniJava.g:1986:2: rule__MethodDeclaration__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__12"


    // $ANTLR start "rule__MethodDeclaration__Group__12__Impl"
    // InternalMiniJava.g:1992:1: rule__MethodDeclaration__Group__12__Impl : ( '}' ) ;
    public final void rule__MethodDeclaration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1996:1: ( ( '}' ) )
            // InternalMiniJava.g:1997:1: ( '}' )
            {
            // InternalMiniJava.g:1997:1: ( '}' )
            // InternalMiniJava.g:1998:2: '}'
            {
             before(grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__12__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_4__0"
    // InternalMiniJava.g:2008:1: rule__MethodDeclaration__Group_4__0 : rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1 ;
    public final void rule__MethodDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2012:1: ( rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1 )
            // InternalMiniJava.g:2013:2: rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMiniJava.g:2020:1: rule__MethodDeclaration__Group_4__0__Impl : ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 ) ) ;
    public final void rule__MethodDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2024:1: ( ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 ) ) )
            // InternalMiniJava.g:2025:1: ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 ) )
            {
            // InternalMiniJava.g:2025:1: ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 ) )
            // InternalMiniJava.g:2026:2: ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsAssignment_4_0()); 
            // InternalMiniJava.g:2027:2: ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 )
            // InternalMiniJava.g:2027:3: rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0
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
    // InternalMiniJava.g:2035:1: rule__MethodDeclaration__Group_4__1 : rule__MethodDeclaration__Group_4__1__Impl ;
    public final void rule__MethodDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2039:1: ( rule__MethodDeclaration__Group_4__1__Impl )
            // InternalMiniJava.g:2040:2: rule__MethodDeclaration__Group_4__1__Impl
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
    // InternalMiniJava.g:2046:1: rule__MethodDeclaration__Group_4__1__Impl : ( ( rule__MethodDeclaration__Group_4_1__0 )* ) ;
    public final void rule__MethodDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2050:1: ( ( ( rule__MethodDeclaration__Group_4_1__0 )* ) )
            // InternalMiniJava.g:2051:1: ( ( rule__MethodDeclaration__Group_4_1__0 )* )
            {
            // InternalMiniJava.g:2051:1: ( ( rule__MethodDeclaration__Group_4_1__0 )* )
            // InternalMiniJava.g:2052:2: ( rule__MethodDeclaration__Group_4_1__0 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup_4_1()); 
            // InternalMiniJava.g:2053:2: ( rule__MethodDeclaration__Group_4_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMiniJava.g:2053:3: rule__MethodDeclaration__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__MethodDeclaration__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMiniJava.g:2062:1: rule__MethodDeclaration__Group_4_1__0 : rule__MethodDeclaration__Group_4_1__0__Impl rule__MethodDeclaration__Group_4_1__1 ;
    public final void rule__MethodDeclaration__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2066:1: ( rule__MethodDeclaration__Group_4_1__0__Impl rule__MethodDeclaration__Group_4_1__1 )
            // InternalMiniJava.g:2067:2: rule__MethodDeclaration__Group_4_1__0__Impl rule__MethodDeclaration__Group_4_1__1
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
    // InternalMiniJava.g:2074:1: rule__MethodDeclaration__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MethodDeclaration__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2078:1: ( ( ',' ) )
            // InternalMiniJava.g:2079:1: ( ',' )
            {
            // InternalMiniJava.g:2079:1: ( ',' )
            // InternalMiniJava.g:2080:2: ','
            {
             before(grammarAccess.getMethodDeclarationAccess().getCommaKeyword_4_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMiniJava.g:2089:1: rule__MethodDeclaration__Group_4_1__1 : rule__MethodDeclaration__Group_4_1__1__Impl ;
    public final void rule__MethodDeclaration__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2093:1: ( rule__MethodDeclaration__Group_4_1__1__Impl )
            // InternalMiniJava.g:2094:2: rule__MethodDeclaration__Group_4_1__1__Impl
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
    // InternalMiniJava.g:2100:1: rule__MethodDeclaration__Group_4_1__1__Impl : ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 ) ) ;
    public final void rule__MethodDeclaration__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2104:1: ( ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 ) ) )
            // InternalMiniJava.g:2105:1: ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 ) )
            {
            // InternalMiniJava.g:2105:1: ( ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 ) )
            // InternalMiniJava.g:2106:2: ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsAssignment_4_1_1()); 
            // InternalMiniJava.g:2107:2: ( rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 )
            // InternalMiniJava.g:2107:3: rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1
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


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalMiniJava.g:2116:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2120:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalMiniJava.g:2121:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
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
    // InternalMiniJava.g:2128:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__StatementTypeAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2132:1: ( ( ( rule__Statement__StatementTypeAssignment_0_0 ) ) )
            // InternalMiniJava.g:2133:1: ( ( rule__Statement__StatementTypeAssignment_0_0 ) )
            {
            // InternalMiniJava.g:2133:1: ( ( rule__Statement__StatementTypeAssignment_0_0 ) )
            // InternalMiniJava.g:2134:2: ( rule__Statement__StatementTypeAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_0_0()); 
            // InternalMiniJava.g:2135:2: ( rule__Statement__StatementTypeAssignment_0_0 )
            // InternalMiniJava.g:2135:3: rule__Statement__StatementTypeAssignment_0_0
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
    // InternalMiniJava.g:2143:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2147:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // InternalMiniJava.g:2148:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
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
    // InternalMiniJava.g:2155:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__StatementsAssignment_0_1 )* ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2159:1: ( ( ( rule__Statement__StatementsAssignment_0_1 )* ) )
            // InternalMiniJava.g:2160:1: ( ( rule__Statement__StatementsAssignment_0_1 )* )
            {
            // InternalMiniJava.g:2160:1: ( ( rule__Statement__StatementsAssignment_0_1 )* )
            // InternalMiniJava.g:2161:2: ( rule__Statement__StatementsAssignment_0_1 )*
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_0_1()); 
            // InternalMiniJava.g:2162:2: ( rule__Statement__StatementsAssignment_0_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==16||(LA15_0>=34 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMiniJava.g:2162:3: rule__Statement__StatementsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Statement__StatementsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMiniJava.g:2170:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2174:1: ( rule__Statement__Group_0__2__Impl )
            // InternalMiniJava.g:2175:2: rule__Statement__Group_0__2__Impl
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
    // InternalMiniJava.g:2181:1: rule__Statement__Group_0__2__Impl : ( '}' ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2185:1: ( ( '}' ) )
            // InternalMiniJava.g:2186:1: ( '}' )
            {
            // InternalMiniJava.g:2186:1: ( '}' )
            // InternalMiniJava.g:2187:2: '}'
            {
             before(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMiniJava.g:2197:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2201:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalMiniJava.g:2202:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:2209:1: rule__Statement__Group_1__0__Impl : ( ( rule__Statement__StatementTypeAssignment_1_0 ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2213:1: ( ( ( rule__Statement__StatementTypeAssignment_1_0 ) ) )
            // InternalMiniJava.g:2214:1: ( ( rule__Statement__StatementTypeAssignment_1_0 ) )
            {
            // InternalMiniJava.g:2214:1: ( ( rule__Statement__StatementTypeAssignment_1_0 ) )
            // InternalMiniJava.g:2215:2: ( rule__Statement__StatementTypeAssignment_1_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_1_0()); 
            // InternalMiniJava.g:2216:2: ( rule__Statement__StatementTypeAssignment_1_0 )
            // InternalMiniJava.g:2216:3: rule__Statement__StatementTypeAssignment_1_0
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
    // InternalMiniJava.g:2224:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2228:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalMiniJava.g:2229:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:2236:1: rule__Statement__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2240:1: ( ( '(' ) )
            // InternalMiniJava.g:2241:1: ( '(' )
            {
            // InternalMiniJava.g:2241:1: ( '(' )
            // InternalMiniJava.g:2242:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMiniJava.g:2251:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2255:1: ( rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 )
            // InternalMiniJava.g:2256:2: rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMiniJava.g:2263:1: rule__Statement__Group_1__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_1_2 ) ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2267:1: ( ( ( rule__Statement__FirstExpressionAssignment_1_2 ) ) )
            // InternalMiniJava.g:2268:1: ( ( rule__Statement__FirstExpressionAssignment_1_2 ) )
            {
            // InternalMiniJava.g:2268:1: ( ( rule__Statement__FirstExpressionAssignment_1_2 ) )
            // InternalMiniJava.g:2269:2: ( rule__Statement__FirstExpressionAssignment_1_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_1_2()); 
            // InternalMiniJava.g:2270:2: ( rule__Statement__FirstExpressionAssignment_1_2 )
            // InternalMiniJava.g:2270:3: rule__Statement__FirstExpressionAssignment_1_2
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
    // InternalMiniJava.g:2278:1: rule__Statement__Group_1__3 : rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4 ;
    public final void rule__Statement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2282:1: ( rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4 )
            // InternalMiniJava.g:2283:2: rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMiniJava.g:2290:1: rule__Statement__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Statement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2294:1: ( ( ')' ) )
            // InternalMiniJava.g:2295:1: ( ')' )
            {
            // InternalMiniJava.g:2295:1: ( ')' )
            // InternalMiniJava.g:2296:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMiniJava.g:2305:1: rule__Statement__Group_1__4 : rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5 ;
    public final void rule__Statement__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2309:1: ( rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5 )
            // InternalMiniJava.g:2310:2: rule__Statement__Group_1__4__Impl rule__Statement__Group_1__5
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
    // InternalMiniJava.g:2317:1: rule__Statement__Group_1__4__Impl : ( ( rule__Statement__StatementsAssignment_1_4 ) ) ;
    public final void rule__Statement__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2321:1: ( ( ( rule__Statement__StatementsAssignment_1_4 ) ) )
            // InternalMiniJava.g:2322:1: ( ( rule__Statement__StatementsAssignment_1_4 ) )
            {
            // InternalMiniJava.g:2322:1: ( ( rule__Statement__StatementsAssignment_1_4 ) )
            // InternalMiniJava.g:2323:2: ( rule__Statement__StatementsAssignment_1_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_1_4()); 
            // InternalMiniJava.g:2324:2: ( rule__Statement__StatementsAssignment_1_4 )
            // InternalMiniJava.g:2324:3: rule__Statement__StatementsAssignment_1_4
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
    // InternalMiniJava.g:2332:1: rule__Statement__Group_1__5 : rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6 ;
    public final void rule__Statement__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2336:1: ( rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6 )
            // InternalMiniJava.g:2337:2: rule__Statement__Group_1__5__Impl rule__Statement__Group_1__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalMiniJava.g:2344:1: rule__Statement__Group_1__5__Impl : ( 'else' ) ;
    public final void rule__Statement__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2348:1: ( ( 'else' ) )
            // InternalMiniJava.g:2349:1: ( 'else' )
            {
            // InternalMiniJava.g:2349:1: ( 'else' )
            // InternalMiniJava.g:2350:2: 'else'
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
    // InternalMiniJava.g:2359:1: rule__Statement__Group_1__6 : rule__Statement__Group_1__6__Impl ;
    public final void rule__Statement__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2363:1: ( rule__Statement__Group_1__6__Impl )
            // InternalMiniJava.g:2364:2: rule__Statement__Group_1__6__Impl
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
    // InternalMiniJava.g:2370:1: rule__Statement__Group_1__6__Impl : ( ( rule__Statement__StatementsAssignment_1_6 ) ) ;
    public final void rule__Statement__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2374:1: ( ( ( rule__Statement__StatementsAssignment_1_6 ) ) )
            // InternalMiniJava.g:2375:1: ( ( rule__Statement__StatementsAssignment_1_6 ) )
            {
            // InternalMiniJava.g:2375:1: ( ( rule__Statement__StatementsAssignment_1_6 ) )
            // InternalMiniJava.g:2376:2: ( rule__Statement__StatementsAssignment_1_6 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_1_6()); 
            // InternalMiniJava.g:2377:2: ( rule__Statement__StatementsAssignment_1_6 )
            // InternalMiniJava.g:2377:3: rule__Statement__StatementsAssignment_1_6
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
    // InternalMiniJava.g:2386:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2390:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // InternalMiniJava.g:2391:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:2398:1: rule__Statement__Group_2__0__Impl : ( ( rule__Statement__StatementTypeAssignment_2_0 ) ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2402:1: ( ( ( rule__Statement__StatementTypeAssignment_2_0 ) ) )
            // InternalMiniJava.g:2403:1: ( ( rule__Statement__StatementTypeAssignment_2_0 ) )
            {
            // InternalMiniJava.g:2403:1: ( ( rule__Statement__StatementTypeAssignment_2_0 ) )
            // InternalMiniJava.g:2404:2: ( rule__Statement__StatementTypeAssignment_2_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_2_0()); 
            // InternalMiniJava.g:2405:2: ( rule__Statement__StatementTypeAssignment_2_0 )
            // InternalMiniJava.g:2405:3: rule__Statement__StatementTypeAssignment_2_0
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
    // InternalMiniJava.g:2413:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2417:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // InternalMiniJava.g:2418:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:2425:1: rule__Statement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2429:1: ( ( '(' ) )
            // InternalMiniJava.g:2430:1: ( '(' )
            {
            // InternalMiniJava.g:2430:1: ( '(' )
            // InternalMiniJava.g:2431:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMiniJava.g:2440:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2444:1: ( rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 )
            // InternalMiniJava.g:2445:2: rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMiniJava.g:2452:1: rule__Statement__Group_2__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_2_2 ) ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2456:1: ( ( ( rule__Statement__FirstExpressionAssignment_2_2 ) ) )
            // InternalMiniJava.g:2457:1: ( ( rule__Statement__FirstExpressionAssignment_2_2 ) )
            {
            // InternalMiniJava.g:2457:1: ( ( rule__Statement__FirstExpressionAssignment_2_2 ) )
            // InternalMiniJava.g:2458:2: ( rule__Statement__FirstExpressionAssignment_2_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_2_2()); 
            // InternalMiniJava.g:2459:2: ( rule__Statement__FirstExpressionAssignment_2_2 )
            // InternalMiniJava.g:2459:3: rule__Statement__FirstExpressionAssignment_2_2
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
    // InternalMiniJava.g:2467:1: rule__Statement__Group_2__3 : rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4 ;
    public final void rule__Statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2471:1: ( rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4 )
            // InternalMiniJava.g:2472:2: rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMiniJava.g:2479:1: rule__Statement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2483:1: ( ( ')' ) )
            // InternalMiniJava.g:2484:1: ( ')' )
            {
            // InternalMiniJava.g:2484:1: ( ')' )
            // InternalMiniJava.g:2485:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_2_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMiniJava.g:2494:1: rule__Statement__Group_2__4 : rule__Statement__Group_2__4__Impl ;
    public final void rule__Statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2498:1: ( rule__Statement__Group_2__4__Impl )
            // InternalMiniJava.g:2499:2: rule__Statement__Group_2__4__Impl
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
    // InternalMiniJava.g:2505:1: rule__Statement__Group_2__4__Impl : ( ( rule__Statement__StatementsAssignment_2_4 ) ) ;
    public final void rule__Statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2509:1: ( ( ( rule__Statement__StatementsAssignment_2_4 ) ) )
            // InternalMiniJava.g:2510:1: ( ( rule__Statement__StatementsAssignment_2_4 ) )
            {
            // InternalMiniJava.g:2510:1: ( ( rule__Statement__StatementsAssignment_2_4 ) )
            // InternalMiniJava.g:2511:2: ( rule__Statement__StatementsAssignment_2_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_2_4()); 
            // InternalMiniJava.g:2512:2: ( rule__Statement__StatementsAssignment_2_4 )
            // InternalMiniJava.g:2512:3: rule__Statement__StatementsAssignment_2_4
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
    // InternalMiniJava.g:2521:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2525:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // InternalMiniJava.g:2526:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:2533:1: rule__Statement__Group_3__0__Impl : ( ( rule__Statement__StatementTypeAssignment_3_0 ) ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2537:1: ( ( ( rule__Statement__StatementTypeAssignment_3_0 ) ) )
            // InternalMiniJava.g:2538:1: ( ( rule__Statement__StatementTypeAssignment_3_0 ) )
            {
            // InternalMiniJava.g:2538:1: ( ( rule__Statement__StatementTypeAssignment_3_0 ) )
            // InternalMiniJava.g:2539:2: ( rule__Statement__StatementTypeAssignment_3_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_3_0()); 
            // InternalMiniJava.g:2540:2: ( rule__Statement__StatementTypeAssignment_3_0 )
            // InternalMiniJava.g:2540:3: rule__Statement__StatementTypeAssignment_3_0
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
    // InternalMiniJava.g:2548:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2552:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // InternalMiniJava.g:2553:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:2560:1: rule__Statement__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2564:1: ( ( '(' ) )
            // InternalMiniJava.g:2565:1: ( '(' )
            {
            // InternalMiniJava.g:2565:1: ( '(' )
            // InternalMiniJava.g:2566:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMiniJava.g:2575:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2579:1: ( rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 )
            // InternalMiniJava.g:2580:2: rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMiniJava.g:2587:1: rule__Statement__Group_3__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_3_2 ) ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2591:1: ( ( ( rule__Statement__FirstExpressionAssignment_3_2 ) ) )
            // InternalMiniJava.g:2592:1: ( ( rule__Statement__FirstExpressionAssignment_3_2 ) )
            {
            // InternalMiniJava.g:2592:1: ( ( rule__Statement__FirstExpressionAssignment_3_2 ) )
            // InternalMiniJava.g:2593:2: ( rule__Statement__FirstExpressionAssignment_3_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_3_2()); 
            // InternalMiniJava.g:2594:2: ( rule__Statement__FirstExpressionAssignment_3_2 )
            // InternalMiniJava.g:2594:3: rule__Statement__FirstExpressionAssignment_3_2
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
    // InternalMiniJava.g:2602:1: rule__Statement__Group_3__3 : rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4 ;
    public final void rule__Statement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2606:1: ( rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4 )
            // InternalMiniJava.g:2607:2: rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4
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
    // InternalMiniJava.g:2614:1: rule__Statement__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Statement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2618:1: ( ( ')' ) )
            // InternalMiniJava.g:2619:1: ( ')' )
            {
            // InternalMiniJava.g:2619:1: ( ')' )
            // InternalMiniJava.g:2620:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMiniJava.g:2629:1: rule__Statement__Group_3__4 : rule__Statement__Group_3__4__Impl ;
    public final void rule__Statement__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2633:1: ( rule__Statement__Group_3__4__Impl )
            // InternalMiniJava.g:2634:2: rule__Statement__Group_3__4__Impl
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
    // InternalMiniJava.g:2640:1: rule__Statement__Group_3__4__Impl : ( ';' ) ;
    public final void rule__Statement__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2644:1: ( ( ';' ) )
            // InternalMiniJava.g:2645:1: ( ';' )
            {
            // InternalMiniJava.g:2645:1: ( ';' )
            // InternalMiniJava.g:2646:2: ';'
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
    // InternalMiniJava.g:2656:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2660:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // InternalMiniJava.g:2661:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
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
    // InternalMiniJava.g:2668:1: rule__Statement__Group_4__0__Impl : ( ( rule__Statement__VariableAssignment_4_0 ) ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2672:1: ( ( ( rule__Statement__VariableAssignment_4_0 ) ) )
            // InternalMiniJava.g:2673:1: ( ( rule__Statement__VariableAssignment_4_0 ) )
            {
            // InternalMiniJava.g:2673:1: ( ( rule__Statement__VariableAssignment_4_0 ) )
            // InternalMiniJava.g:2674:2: ( rule__Statement__VariableAssignment_4_0 )
            {
             before(grammarAccess.getStatementAccess().getVariableAssignment_4_0()); 
            // InternalMiniJava.g:2675:2: ( rule__Statement__VariableAssignment_4_0 )
            // InternalMiniJava.g:2675:3: rule__Statement__VariableAssignment_4_0
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
    // InternalMiniJava.g:2683:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2687:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // InternalMiniJava.g:2688:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:2695:1: rule__Statement__Group_4__1__Impl : ( ( rule__Statement__StatementTypeAssignment_4_1 ) ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2699:1: ( ( ( rule__Statement__StatementTypeAssignment_4_1 ) ) )
            // InternalMiniJava.g:2700:1: ( ( rule__Statement__StatementTypeAssignment_4_1 ) )
            {
            // InternalMiniJava.g:2700:1: ( ( rule__Statement__StatementTypeAssignment_4_1 ) )
            // InternalMiniJava.g:2701:2: ( rule__Statement__StatementTypeAssignment_4_1 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_4_1()); 
            // InternalMiniJava.g:2702:2: ( rule__Statement__StatementTypeAssignment_4_1 )
            // InternalMiniJava.g:2702:3: rule__Statement__StatementTypeAssignment_4_1
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
    // InternalMiniJava.g:2710:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2714:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // InternalMiniJava.g:2715:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
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
    // InternalMiniJava.g:2722:1: rule__Statement__Group_4__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_4_2 ) ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2726:1: ( ( ( rule__Statement__FirstExpressionAssignment_4_2 ) ) )
            // InternalMiniJava.g:2727:1: ( ( rule__Statement__FirstExpressionAssignment_4_2 ) )
            {
            // InternalMiniJava.g:2727:1: ( ( rule__Statement__FirstExpressionAssignment_4_2 ) )
            // InternalMiniJava.g:2728:2: ( rule__Statement__FirstExpressionAssignment_4_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_4_2()); 
            // InternalMiniJava.g:2729:2: ( rule__Statement__FirstExpressionAssignment_4_2 )
            // InternalMiniJava.g:2729:3: rule__Statement__FirstExpressionAssignment_4_2
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
    // InternalMiniJava.g:2737:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2741:1: ( rule__Statement__Group_4__3__Impl )
            // InternalMiniJava.g:2742:2: rule__Statement__Group_4__3__Impl
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
    // InternalMiniJava.g:2748:1: rule__Statement__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2752:1: ( ( ';' ) )
            // InternalMiniJava.g:2753:1: ( ';' )
            {
            // InternalMiniJava.g:2753:1: ( ';' )
            // InternalMiniJava.g:2754:2: ';'
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
    // InternalMiniJava.g:2764:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2768:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // InternalMiniJava.g:2769:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMiniJava.g:2776:1: rule__Statement__Group_5__0__Impl : ( ( rule__Statement__VariableAssignment_5_0 ) ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2780:1: ( ( ( rule__Statement__VariableAssignment_5_0 ) ) )
            // InternalMiniJava.g:2781:1: ( ( rule__Statement__VariableAssignment_5_0 ) )
            {
            // InternalMiniJava.g:2781:1: ( ( rule__Statement__VariableAssignment_5_0 ) )
            // InternalMiniJava.g:2782:2: ( rule__Statement__VariableAssignment_5_0 )
            {
             before(grammarAccess.getStatementAccess().getVariableAssignment_5_0()); 
            // InternalMiniJava.g:2783:2: ( rule__Statement__VariableAssignment_5_0 )
            // InternalMiniJava.g:2783:3: rule__Statement__VariableAssignment_5_0
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
    // InternalMiniJava.g:2791:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2795:1: ( rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 )
            // InternalMiniJava.g:2796:2: rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:2803:1: rule__Statement__Group_5__1__Impl : ( ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 ) ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2807:1: ( ( ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 ) ) )
            // InternalMiniJava.g:2808:1: ( ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 ) )
            {
            // InternalMiniJava.g:2808:1: ( ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 ) )
            // InternalMiniJava.g:2809:2: ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 )
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentAssignment_5_1()); 
            // InternalMiniJava.g:2810:2: ( rule__Statement__IsArrayElementAssignmentAssignment_5_1 )
            // InternalMiniJava.g:2810:3: rule__Statement__IsArrayElementAssignmentAssignment_5_1
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
    // InternalMiniJava.g:2818:1: rule__Statement__Group_5__2 : rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 ;
    public final void rule__Statement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2822:1: ( rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 )
            // InternalMiniJava.g:2823:2: rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMiniJava.g:2830:1: rule__Statement__Group_5__2__Impl : ( ( rule__Statement__FirstExpressionAssignment_5_2 ) ) ;
    public final void rule__Statement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2834:1: ( ( ( rule__Statement__FirstExpressionAssignment_5_2 ) ) )
            // InternalMiniJava.g:2835:1: ( ( rule__Statement__FirstExpressionAssignment_5_2 ) )
            {
            // InternalMiniJava.g:2835:1: ( ( rule__Statement__FirstExpressionAssignment_5_2 ) )
            // InternalMiniJava.g:2836:2: ( rule__Statement__FirstExpressionAssignment_5_2 )
            {
             before(grammarAccess.getStatementAccess().getFirstExpressionAssignment_5_2()); 
            // InternalMiniJava.g:2837:2: ( rule__Statement__FirstExpressionAssignment_5_2 )
            // InternalMiniJava.g:2837:3: rule__Statement__FirstExpressionAssignment_5_2
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
    // InternalMiniJava.g:2845:1: rule__Statement__Group_5__3 : rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 ;
    public final void rule__Statement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2849:1: ( rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 )
            // InternalMiniJava.g:2850:2: rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4
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
    // InternalMiniJava.g:2857:1: rule__Statement__Group_5__3__Impl : ( ']' ) ;
    public final void rule__Statement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2861:1: ( ( ']' ) )
            // InternalMiniJava.g:2862:1: ( ']' )
            {
            // InternalMiniJava.g:2862:1: ( ']' )
            // InternalMiniJava.g:2863:2: ']'
            {
             before(grammarAccess.getStatementAccess().getRightSquareBracketKeyword_5_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMiniJava.g:2872:1: rule__Statement__Group_5__4 : rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5 ;
    public final void rule__Statement__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2876:1: ( rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5 )
            // InternalMiniJava.g:2877:2: rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:2884:1: rule__Statement__Group_5__4__Impl : ( ( rule__Statement__StatementTypeAssignment_5_4 ) ) ;
    public final void rule__Statement__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2888:1: ( ( ( rule__Statement__StatementTypeAssignment_5_4 ) ) )
            // InternalMiniJava.g:2889:1: ( ( rule__Statement__StatementTypeAssignment_5_4 ) )
            {
            // InternalMiniJava.g:2889:1: ( ( rule__Statement__StatementTypeAssignment_5_4 ) )
            // InternalMiniJava.g:2890:2: ( rule__Statement__StatementTypeAssignment_5_4 )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeAssignment_5_4()); 
            // InternalMiniJava.g:2891:2: ( rule__Statement__StatementTypeAssignment_5_4 )
            // InternalMiniJava.g:2891:3: rule__Statement__StatementTypeAssignment_5_4
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
    // InternalMiniJava.g:2899:1: rule__Statement__Group_5__5 : rule__Statement__Group_5__5__Impl rule__Statement__Group_5__6 ;
    public final void rule__Statement__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2903:1: ( rule__Statement__Group_5__5__Impl rule__Statement__Group_5__6 )
            // InternalMiniJava.g:2904:2: rule__Statement__Group_5__5__Impl rule__Statement__Group_5__6
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
    // InternalMiniJava.g:2911:1: rule__Statement__Group_5__5__Impl : ( ( rule__Statement__SecondExpressionAssignment_5_5 ) ) ;
    public final void rule__Statement__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2915:1: ( ( ( rule__Statement__SecondExpressionAssignment_5_5 ) ) )
            // InternalMiniJava.g:2916:1: ( ( rule__Statement__SecondExpressionAssignment_5_5 ) )
            {
            // InternalMiniJava.g:2916:1: ( ( rule__Statement__SecondExpressionAssignment_5_5 ) )
            // InternalMiniJava.g:2917:2: ( rule__Statement__SecondExpressionAssignment_5_5 )
            {
             before(grammarAccess.getStatementAccess().getSecondExpressionAssignment_5_5()); 
            // InternalMiniJava.g:2918:2: ( rule__Statement__SecondExpressionAssignment_5_5 )
            // InternalMiniJava.g:2918:3: rule__Statement__SecondExpressionAssignment_5_5
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
    // InternalMiniJava.g:2926:1: rule__Statement__Group_5__6 : rule__Statement__Group_5__6__Impl ;
    public final void rule__Statement__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2930:1: ( rule__Statement__Group_5__6__Impl )
            // InternalMiniJava.g:2931:2: rule__Statement__Group_5__6__Impl
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
    // InternalMiniJava.g:2937:1: rule__Statement__Group_5__6__Impl : ( ';' ) ;
    public final void rule__Statement__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2941:1: ( ( ';' ) )
            // InternalMiniJava.g:2942:1: ( ';' )
            {
            // InternalMiniJava.g:2942:1: ( ';' )
            // InternalMiniJava.g:2943:2: ';'
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
    // InternalMiniJava.g:2953:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2957:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMiniJava.g:2958:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalMiniJava.g:2965:1: rule__Expression__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2969:1: ( ( ruleAddition ) )
            // InternalMiniJava.g:2970:1: ( ruleAddition )
            {
            // InternalMiniJava.g:2970:1: ( ruleAddition )
            // InternalMiniJava.g:2971:2: ruleAddition
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
    // InternalMiniJava.g:2980:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2984:1: ( rule__Expression__Group__1__Impl )
            // InternalMiniJava.g:2985:2: rule__Expression__Group__1__Impl
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
    // InternalMiniJava.g:2991:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2995:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalMiniJava.g:2996:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalMiniJava.g:2996:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalMiniJava.g:2997:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalMiniJava.g:2998:2: ( rule__Expression__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniJava.g:2998:3: rule__Expression__Group_1__0
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
    // InternalMiniJava.g:3007:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3011:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMiniJava.g:3012:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalMiniJava.g:3019:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3023:1: ( ( () ) )
            // InternalMiniJava.g:3024:1: ( () )
            {
            // InternalMiniJava.g:3024:1: ( () )
            // InternalMiniJava.g:3025:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 
            // InternalMiniJava.g:3026:2: ()
            // InternalMiniJava.g:3026:3: 
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
    // InternalMiniJava.g:3034:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3038:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalMiniJava.g:3039:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3046:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3050:1: ( ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3051:1: ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3051:1: ( ( rule__Expression__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3052:2: ( rule__Expression__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3053:2: ( rule__Expression__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3053:3: rule__Expression__ExpressionTypeAssignment_1_1
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
    // InternalMiniJava.g:3061:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3065:1: ( rule__Expression__Group_1__2__Impl )
            // InternalMiniJava.g:3066:2: rule__Expression__Group_1__2__Impl
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
    // InternalMiniJava.g:3072:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3076:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3077:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3077:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3078:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3079:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalMiniJava.g:3079:3: rule__Expression__RightAssignment_1_2
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
    // InternalMiniJava.g:3088:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3092:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalMiniJava.g:3093:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalMiniJava.g:3100:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3104:1: ( ( ruleMultiplication ) )
            // InternalMiniJava.g:3105:1: ( ruleMultiplication )
            {
            // InternalMiniJava.g:3105:1: ( ruleMultiplication )
            // InternalMiniJava.g:3106:2: ruleMultiplication
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
    // InternalMiniJava.g:3115:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3119:1: ( rule__Addition__Group__1__Impl )
            // InternalMiniJava.g:3120:2: rule__Addition__Group__1__Impl
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
    // InternalMiniJava.g:3126:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3130:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalMiniJava.g:3131:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalMiniJava.g:3131:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalMiniJava.g:3132:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalMiniJava.g:3133:2: ( rule__Addition__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=11 && LA17_0<=12)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiniJava.g:3133:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMiniJava.g:3142:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3146:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalMiniJava.g:3147:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
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
    // InternalMiniJava.g:3154:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3158:1: ( ( () ) )
            // InternalMiniJava.g:3159:1: ( () )
            {
            // InternalMiniJava.g:3159:1: ( () )
            // InternalMiniJava.g:3160:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalMiniJava.g:3161:2: ()
            // InternalMiniJava.g:3161:3: 
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
    // InternalMiniJava.g:3169:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3173:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalMiniJava.g:3174:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3181:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3185:1: ( ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3186:1: ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3186:1: ( ( rule__Addition__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3187:2: ( rule__Addition__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3188:2: ( rule__Addition__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3188:3: rule__Addition__ExpressionTypeAssignment_1_1
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
    // InternalMiniJava.g:3196:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3200:1: ( rule__Addition__Group_1__2__Impl )
            // InternalMiniJava.g:3201:2: rule__Addition__Group_1__2__Impl
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
    // InternalMiniJava.g:3207:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3211:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3212:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3212:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3213:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3214:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalMiniJava.g:3214:3: rule__Addition__RightAssignment_1_2
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
    // InternalMiniJava.g:3223:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3227:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalMiniJava.g:3228:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalMiniJava.g:3235:1: rule__Multiplication__Group__0__Impl : ( ruleNegationOrPointExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3239:1: ( ( ruleNegationOrPointExpression ) )
            // InternalMiniJava.g:3240:1: ( ruleNegationOrPointExpression )
            {
            // InternalMiniJava.g:3240:1: ( ruleNegationOrPointExpression )
            // InternalMiniJava.g:3241:2: ruleNegationOrPointExpression
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
    // InternalMiniJava.g:3250:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3254:1: ( rule__Multiplication__Group__1__Impl )
            // InternalMiniJava.g:3255:2: rule__Multiplication__Group__1__Impl
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
    // InternalMiniJava.g:3261:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3265:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalMiniJava.g:3266:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalMiniJava.g:3266:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalMiniJava.g:3267:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalMiniJava.g:3268:2: ( rule__Multiplication__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=13 && LA18_0<=14)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMiniJava.g:3268:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMiniJava.g:3277:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3281:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalMiniJava.g:3282:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
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
    // InternalMiniJava.g:3289:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3293:1: ( ( () ) )
            // InternalMiniJava.g:3294:1: ( () )
            {
            // InternalMiniJava.g:3294:1: ( () )
            // InternalMiniJava.g:3295:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalMiniJava.g:3296:2: ()
            // InternalMiniJava.g:3296:3: 
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
    // InternalMiniJava.g:3304:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3308:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalMiniJava.g:3309:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3316:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3320:1: ( ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3321:1: ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3321:1: ( ( rule__Multiplication__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3322:2: ( rule__Multiplication__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3323:2: ( rule__Multiplication__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3323:3: rule__Multiplication__ExpressionTypeAssignment_1_1
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
    // InternalMiniJava.g:3331:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3335:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalMiniJava.g:3336:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalMiniJava.g:3342:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3346:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3347:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3347:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3348:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3349:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalMiniJava.g:3349:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalMiniJava.g:3358:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3362:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // InternalMiniJava.g:3363:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3370:1: rule__Negation__Group__0__Impl : ( ( rule__Negation__ExpressionTypeAssignment_0 ) ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3374:1: ( ( ( rule__Negation__ExpressionTypeAssignment_0 ) ) )
            // InternalMiniJava.g:3375:1: ( ( rule__Negation__ExpressionTypeAssignment_0 ) )
            {
            // InternalMiniJava.g:3375:1: ( ( rule__Negation__ExpressionTypeAssignment_0 ) )
            // InternalMiniJava.g:3376:2: ( rule__Negation__ExpressionTypeAssignment_0 )
            {
             before(grammarAccess.getNegationAccess().getExpressionTypeAssignment_0()); 
            // InternalMiniJava.g:3377:2: ( rule__Negation__ExpressionTypeAssignment_0 )
            // InternalMiniJava.g:3377:3: rule__Negation__ExpressionTypeAssignment_0
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
    // InternalMiniJava.g:3385:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3389:1: ( rule__Negation__Group__1__Impl )
            // InternalMiniJava.g:3390:2: rule__Negation__Group__1__Impl
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
    // InternalMiniJava.g:3396:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__RightAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3400:1: ( ( ( rule__Negation__RightAssignment_1 ) ) )
            // InternalMiniJava.g:3401:1: ( ( rule__Negation__RightAssignment_1 ) )
            {
            // InternalMiniJava.g:3401:1: ( ( rule__Negation__RightAssignment_1 ) )
            // InternalMiniJava.g:3402:2: ( rule__Negation__RightAssignment_1 )
            {
             before(grammarAccess.getNegationAccess().getRightAssignment_1()); 
            // InternalMiniJava.g:3403:2: ( rule__Negation__RightAssignment_1 )
            // InternalMiniJava.g:3403:3: rule__Negation__RightAssignment_1
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
    // InternalMiniJava.g:3412:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3416:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalMiniJava.g:3417:2: rule__Point__Group__0__Impl rule__Point__Group__1
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
    // InternalMiniJava.g:3424:1: rule__Point__Group__0__Impl : ( ruleSquareBrackets ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3428:1: ( ( ruleSquareBrackets ) )
            // InternalMiniJava.g:3429:1: ( ruleSquareBrackets )
            {
            // InternalMiniJava.g:3429:1: ( ruleSquareBrackets )
            // InternalMiniJava.g:3430:2: ruleSquareBrackets
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
    // InternalMiniJava.g:3439:1: rule__Point__Group__1 : rule__Point__Group__1__Impl ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3443:1: ( rule__Point__Group__1__Impl )
            // InternalMiniJava.g:3444:2: rule__Point__Group__1__Impl
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
    // InternalMiniJava.g:3450:1: rule__Point__Group__1__Impl : ( ( rule__Point__Group_1__0 )* ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3454:1: ( ( ( rule__Point__Group_1__0 )* ) )
            // InternalMiniJava.g:3455:1: ( ( rule__Point__Group_1__0 )* )
            {
            // InternalMiniJava.g:3455:1: ( ( rule__Point__Group_1__0 )* )
            // InternalMiniJava.g:3456:2: ( rule__Point__Group_1__0 )*
            {
             before(grammarAccess.getPointAccess().getGroup_1()); 
            // InternalMiniJava.g:3457:2: ( rule__Point__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniJava.g:3457:3: rule__Point__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Point__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMiniJava.g:3466:1: rule__Point__Group_1__0 : rule__Point__Group_1__0__Impl rule__Point__Group_1__1 ;
    public final void rule__Point__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3470:1: ( rule__Point__Group_1__0__Impl rule__Point__Group_1__1 )
            // InternalMiniJava.g:3471:2: rule__Point__Group_1__0__Impl rule__Point__Group_1__1
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
    // InternalMiniJava.g:3478:1: rule__Point__Group_1__0__Impl : ( () ) ;
    public final void rule__Point__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3482:1: ( ( () ) )
            // InternalMiniJava.g:3483:1: ( () )
            {
            // InternalMiniJava.g:3483:1: ( () )
            // InternalMiniJava.g:3484:2: ()
            {
             before(grammarAccess.getPointAccess().getPointLeftAction_1_0()); 
            // InternalMiniJava.g:3485:2: ()
            // InternalMiniJava.g:3485:3: 
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
    // InternalMiniJava.g:3493:1: rule__Point__Group_1__1 : rule__Point__Group_1__1__Impl rule__Point__Group_1__2 ;
    public final void rule__Point__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3497:1: ( rule__Point__Group_1__1__Impl rule__Point__Group_1__2 )
            // InternalMiniJava.g:3498:2: rule__Point__Group_1__1__Impl rule__Point__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3505:1: rule__Point__Group_1__1__Impl : ( ( rule__Point__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__Point__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3509:1: ( ( ( rule__Point__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3510:1: ( ( rule__Point__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3510:1: ( ( rule__Point__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3511:2: ( rule__Point__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getPointAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3512:2: ( rule__Point__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3512:3: rule__Point__ExpressionTypeAssignment_1_1
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
    // InternalMiniJava.g:3520:1: rule__Point__Group_1__2 : rule__Point__Group_1__2__Impl ;
    public final void rule__Point__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3524:1: ( rule__Point__Group_1__2__Impl )
            // InternalMiniJava.g:3525:2: rule__Point__Group_1__2__Impl
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
    // InternalMiniJava.g:3531:1: rule__Point__Group_1__2__Impl : ( ( rule__Point__RightAssignment_1_2 ) ) ;
    public final void rule__Point__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3535:1: ( ( ( rule__Point__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3536:1: ( ( rule__Point__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3536:1: ( ( rule__Point__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3537:2: ( rule__Point__RightAssignment_1_2 )
            {
             before(grammarAccess.getPointAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3538:2: ( rule__Point__RightAssignment_1_2 )
            // InternalMiniJava.g:3538:3: rule__Point__RightAssignment_1_2
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
    // InternalMiniJava.g:3547:1: rule__SquareBrackets__Group__0 : rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1 ;
    public final void rule__SquareBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3551:1: ( rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1 )
            // InternalMiniJava.g:3552:2: rule__SquareBrackets__Group__0__Impl rule__SquareBrackets__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMiniJava.g:3559:1: rule__SquareBrackets__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__SquareBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3563:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:3564:1: ( rulePrimary )
            {
            // InternalMiniJava.g:3564:1: ( rulePrimary )
            // InternalMiniJava.g:3565:2: rulePrimary
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
    // InternalMiniJava.g:3574:1: rule__SquareBrackets__Group__1 : rule__SquareBrackets__Group__1__Impl ;
    public final void rule__SquareBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3578:1: ( rule__SquareBrackets__Group__1__Impl )
            // InternalMiniJava.g:3579:2: rule__SquareBrackets__Group__1__Impl
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
    // InternalMiniJava.g:3585:1: rule__SquareBrackets__Group__1__Impl : ( ( rule__SquareBrackets__Group_1__0 )? ) ;
    public final void rule__SquareBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3589:1: ( ( ( rule__SquareBrackets__Group_1__0 )? ) )
            // InternalMiniJava.g:3590:1: ( ( rule__SquareBrackets__Group_1__0 )? )
            {
            // InternalMiniJava.g:3590:1: ( ( rule__SquareBrackets__Group_1__0 )? )
            // InternalMiniJava.g:3591:2: ( rule__SquareBrackets__Group_1__0 )?
            {
             before(grammarAccess.getSquareBracketsAccess().getGroup_1()); 
            // InternalMiniJava.g:3592:2: ( rule__SquareBrackets__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMiniJava.g:3592:3: rule__SquareBrackets__Group_1__0
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
    // InternalMiniJava.g:3601:1: rule__SquareBrackets__Group_1__0 : rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1 ;
    public final void rule__SquareBrackets__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3605:1: ( rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1 )
            // InternalMiniJava.g:3606:2: rule__SquareBrackets__Group_1__0__Impl rule__SquareBrackets__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMiniJava.g:3613:1: rule__SquareBrackets__Group_1__0__Impl : ( () ) ;
    public final void rule__SquareBrackets__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3617:1: ( ( () ) )
            // InternalMiniJava.g:3618:1: ( () )
            {
            // InternalMiniJava.g:3618:1: ( () )
            // InternalMiniJava.g:3619:2: ()
            {
             before(grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0()); 
            // InternalMiniJava.g:3620:2: ()
            // InternalMiniJava.g:3620:3: 
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
    // InternalMiniJava.g:3628:1: rule__SquareBrackets__Group_1__1 : rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2 ;
    public final void rule__SquareBrackets__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3632:1: ( rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2 )
            // InternalMiniJava.g:3633:2: rule__SquareBrackets__Group_1__1__Impl rule__SquareBrackets__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3640:1: rule__SquareBrackets__Group_1__1__Impl : ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) ) ;
    public final void rule__SquareBrackets__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3644:1: ( ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) ) )
            // InternalMiniJava.g:3645:1: ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) )
            {
            // InternalMiniJava.g:3645:1: ( ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 ) )
            // InternalMiniJava.g:3646:2: ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 )
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeAssignment_1_1()); 
            // InternalMiniJava.g:3647:2: ( rule__SquareBrackets__ExpressionTypeAssignment_1_1 )
            // InternalMiniJava.g:3647:3: rule__SquareBrackets__ExpressionTypeAssignment_1_1
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
    // InternalMiniJava.g:3655:1: rule__SquareBrackets__Group_1__2 : rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3 ;
    public final void rule__SquareBrackets__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3659:1: ( rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3 )
            // InternalMiniJava.g:3660:2: rule__SquareBrackets__Group_1__2__Impl rule__SquareBrackets__Group_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMiniJava.g:3667:1: rule__SquareBrackets__Group_1__2__Impl : ( ( rule__SquareBrackets__RightAssignment_1_2 ) ) ;
    public final void rule__SquareBrackets__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3671:1: ( ( ( rule__SquareBrackets__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:3672:1: ( ( rule__SquareBrackets__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3672:1: ( ( rule__SquareBrackets__RightAssignment_1_2 ) )
            // InternalMiniJava.g:3673:2: ( rule__SquareBrackets__RightAssignment_1_2 )
            {
             before(grammarAccess.getSquareBracketsAccess().getRightAssignment_1_2()); 
            // InternalMiniJava.g:3674:2: ( rule__SquareBrackets__RightAssignment_1_2 )
            // InternalMiniJava.g:3674:3: rule__SquareBrackets__RightAssignment_1_2
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
    // InternalMiniJava.g:3682:1: rule__SquareBrackets__Group_1__3 : rule__SquareBrackets__Group_1__3__Impl ;
    public final void rule__SquareBrackets__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3686:1: ( rule__SquareBrackets__Group_1__3__Impl )
            // InternalMiniJava.g:3687:2: rule__SquareBrackets__Group_1__3__Impl
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
    // InternalMiniJava.g:3693:1: rule__SquareBrackets__Group_1__3__Impl : ( ']' ) ;
    public final void rule__SquareBrackets__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3697:1: ( ( ']' ) )
            // InternalMiniJava.g:3698:1: ( ']' )
            {
            // InternalMiniJava.g:3698:1: ( ']' )
            // InternalMiniJava.g:3699:2: ']'
            {
             before(grammarAccess.getSquareBracketsAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMiniJava.g:3709:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3713:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalMiniJava.g:3714:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMiniJava.g:3721:1: rule__Primary__Group_3__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3725:1: ( ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) ) )
            // InternalMiniJava.g:3726:1: ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) )
            {
            // InternalMiniJava.g:3726:1: ( ( rule__Primary__ExpressionTypeAssignment_3_0 ) )
            // InternalMiniJava.g:3727:2: ( rule__Primary__ExpressionTypeAssignment_3_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_3_0()); 
            // InternalMiniJava.g:3728:2: ( rule__Primary__ExpressionTypeAssignment_3_0 )
            // InternalMiniJava.g:3728:3: rule__Primary__ExpressionTypeAssignment_3_0
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
    // InternalMiniJava.g:3736:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3740:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalMiniJava.g:3741:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMiniJava.g:3748:1: rule__Primary__Group_3__1__Impl : ( 'int' ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3752:1: ( ( 'int' ) )
            // InternalMiniJava.g:3753:1: ( 'int' )
            {
            // InternalMiniJava.g:3753:1: ( 'int' )
            // InternalMiniJava.g:3754:2: 'int'
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
    // InternalMiniJava.g:3763:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3767:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalMiniJava.g:3768:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3775:1: rule__Primary__Group_3__2__Impl : ( '[' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3779:1: ( ( '[' ) )
            // InternalMiniJava.g:3780:1: ( '[' )
            {
            // InternalMiniJava.g:3780:1: ( '[' )
            // InternalMiniJava.g:3781:2: '['
            {
             before(grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_3_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMiniJava.g:3790:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3794:1: ( rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 )
            // InternalMiniJava.g:3795:2: rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalMiniJava.g:3802:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__ExpressionAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3806:1: ( ( ( rule__Primary__ExpressionAssignment_3_3 ) ) )
            // InternalMiniJava.g:3807:1: ( ( rule__Primary__ExpressionAssignment_3_3 ) )
            {
            // InternalMiniJava.g:3807:1: ( ( rule__Primary__ExpressionAssignment_3_3 ) )
            // InternalMiniJava.g:3808:2: ( rule__Primary__ExpressionAssignment_3_3 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_3_3()); 
            // InternalMiniJava.g:3809:2: ( rule__Primary__ExpressionAssignment_3_3 )
            // InternalMiniJava.g:3809:3: rule__Primary__ExpressionAssignment_3_3
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
    // InternalMiniJava.g:3817:1: rule__Primary__Group_3__4 : rule__Primary__Group_3__4__Impl ;
    public final void rule__Primary__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3821:1: ( rule__Primary__Group_3__4__Impl )
            // InternalMiniJava.g:3822:2: rule__Primary__Group_3__4__Impl
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
    // InternalMiniJava.g:3828:1: rule__Primary__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Primary__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3832:1: ( ( ']' ) )
            // InternalMiniJava.g:3833:1: ( ']' )
            {
            // InternalMiniJava.g:3833:1: ( ']' )
            // InternalMiniJava.g:3834:2: ']'
            {
             before(grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMiniJava.g:3844:1: rule__Primary__Group_4__0 : rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 ;
    public final void rule__Primary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3848:1: ( rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 )
            // InternalMiniJava.g:3849:2: rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1
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
    // InternalMiniJava.g:3856:1: rule__Primary__Group_4__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) ) ;
    public final void rule__Primary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3860:1: ( ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) ) )
            // InternalMiniJava.g:3861:1: ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) )
            {
            // InternalMiniJava.g:3861:1: ( ( rule__Primary__ExpressionTypeAssignment_4_0 ) )
            // InternalMiniJava.g:3862:2: ( rule__Primary__ExpressionTypeAssignment_4_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_4_0()); 
            // InternalMiniJava.g:3863:2: ( rule__Primary__ExpressionTypeAssignment_4_0 )
            // InternalMiniJava.g:3863:3: rule__Primary__ExpressionTypeAssignment_4_0
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
    // InternalMiniJava.g:3871:1: rule__Primary__Group_4__1 : rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 ;
    public final void rule__Primary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3875:1: ( rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 )
            // InternalMiniJava.g:3876:2: rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:3883:1: rule__Primary__Group_4__1__Impl : ( ( rule__Primary__TypeAssignment_4_1 ) ) ;
    public final void rule__Primary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3887:1: ( ( ( rule__Primary__TypeAssignment_4_1 ) ) )
            // InternalMiniJava.g:3888:1: ( ( rule__Primary__TypeAssignment_4_1 ) )
            {
            // InternalMiniJava.g:3888:1: ( ( rule__Primary__TypeAssignment_4_1 ) )
            // InternalMiniJava.g:3889:2: ( rule__Primary__TypeAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryAccess().getTypeAssignment_4_1()); 
            // InternalMiniJava.g:3890:2: ( rule__Primary__TypeAssignment_4_1 )
            // InternalMiniJava.g:3890:3: rule__Primary__TypeAssignment_4_1
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
    // InternalMiniJava.g:3898:1: rule__Primary__Group_4__2 : rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3 ;
    public final void rule__Primary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3902:1: ( rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3 )
            // InternalMiniJava.g:3903:2: rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMiniJava.g:3910:1: rule__Primary__Group_4__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3914:1: ( ( '(' ) )
            // InternalMiniJava.g:3915:1: ( '(' )
            {
            // InternalMiniJava.g:3915:1: ( '(' )
            // InternalMiniJava.g:3916:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMiniJava.g:3925:1: rule__Primary__Group_4__3 : rule__Primary__Group_4__3__Impl ;
    public final void rule__Primary__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3929:1: ( rule__Primary__Group_4__3__Impl )
            // InternalMiniJava.g:3930:2: rule__Primary__Group_4__3__Impl
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
    // InternalMiniJava.g:3936:1: rule__Primary__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3940:1: ( ( ')' ) )
            // InternalMiniJava.g:3941:1: ( ')' )
            {
            // InternalMiniJava.g:3941:1: ( ')' )
            // InternalMiniJava.g:3942:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMiniJava.g:3952:1: rule__Primary__Group_5__0 : rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1 ;
    public final void rule__Primary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3956:1: ( rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1 )
            // InternalMiniJava.g:3957:2: rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3964:1: rule__Primary__Group_5__0__Impl : ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) ) ;
    public final void rule__Primary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3968:1: ( ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) ) )
            // InternalMiniJava.g:3969:1: ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) )
            {
            // InternalMiniJava.g:3969:1: ( ( rule__Primary__ExpressionTypeAssignment_5_0 ) )
            // InternalMiniJava.g:3970:2: ( rule__Primary__ExpressionTypeAssignment_5_0 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeAssignment_5_0()); 
            // InternalMiniJava.g:3971:2: ( rule__Primary__ExpressionTypeAssignment_5_0 )
            // InternalMiniJava.g:3971:3: rule__Primary__ExpressionTypeAssignment_5_0
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
    // InternalMiniJava.g:3979:1: rule__Primary__Group_5__1 : rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2 ;
    public final void rule__Primary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3983:1: ( rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2 )
            // InternalMiniJava.g:3984:2: rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMiniJava.g:3991:1: rule__Primary__Group_5__1__Impl : ( ( rule__Primary__ExpressionAssignment_5_1 ) ) ;
    public final void rule__Primary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3995:1: ( ( ( rule__Primary__ExpressionAssignment_5_1 ) ) )
            // InternalMiniJava.g:3996:1: ( ( rule__Primary__ExpressionAssignment_5_1 ) )
            {
            // InternalMiniJava.g:3996:1: ( ( rule__Primary__ExpressionAssignment_5_1 ) )
            // InternalMiniJava.g:3997:2: ( rule__Primary__ExpressionAssignment_5_1 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_5_1()); 
            // InternalMiniJava.g:3998:2: ( rule__Primary__ExpressionAssignment_5_1 )
            // InternalMiniJava.g:3998:3: rule__Primary__ExpressionAssignment_5_1
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
    // InternalMiniJava.g:4006:1: rule__Primary__Group_5__2 : rule__Primary__Group_5__2__Impl ;
    public final void rule__Primary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4010:1: ( rule__Primary__Group_5__2__Impl )
            // InternalMiniJava.g:4011:2: rule__Primary__Group_5__2__Impl
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
    // InternalMiniJava.g:4017:1: rule__Primary__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4021:1: ( ( ')' ) )
            // InternalMiniJava.g:4022:1: ( ')' )
            {
            // InternalMiniJava.g:4022:1: ( ')' )
            // InternalMiniJava.g:4023:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMiniJava.g:4033:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4037:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // InternalMiniJava.g:4038:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMiniJava.g:4045:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__MethodAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4049:1: ( ( ( rule__MethodCall__MethodAssignment_0 ) ) )
            // InternalMiniJava.g:4050:1: ( ( rule__MethodCall__MethodAssignment_0 ) )
            {
            // InternalMiniJava.g:4050:1: ( ( rule__MethodCall__MethodAssignment_0 ) )
            // InternalMiniJava.g:4051:2: ( rule__MethodCall__MethodAssignment_0 )
            {
             before(grammarAccess.getMethodCallAccess().getMethodAssignment_0()); 
            // InternalMiniJava.g:4052:2: ( rule__MethodCall__MethodAssignment_0 )
            // InternalMiniJava.g:4052:3: rule__MethodCall__MethodAssignment_0
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
    // InternalMiniJava.g:4060:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4064:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // InternalMiniJava.g:4065:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMiniJava.g:4072:1: rule__MethodCall__Group__1__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4076:1: ( ( '(' ) )
            // InternalMiniJava.g:4077:1: ( '(' )
            {
            // InternalMiniJava.g:4077:1: ( '(' )
            // InternalMiniJava.g:4078:2: '('
            {
             before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMiniJava.g:4087:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4091:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // InternalMiniJava.g:4092:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMiniJava.g:4099:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__Group_2__0 )? ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4103:1: ( ( ( rule__MethodCall__Group_2__0 )? ) )
            // InternalMiniJava.g:4104:1: ( ( rule__MethodCall__Group_2__0 )? )
            {
            // InternalMiniJava.g:4104:1: ( ( rule__MethodCall__Group_2__0 )? )
            // InternalMiniJava.g:4105:2: ( rule__MethodCall__Group_2__0 )?
            {
             before(grammarAccess.getMethodCallAccess().getGroup_2()); 
            // InternalMiniJava.g:4106:2: ( rule__MethodCall__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==21||LA21_0==39||(LA21_0>=41 && LA21_0<=45)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMiniJava.g:4106:3: rule__MethodCall__Group_2__0
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
    // InternalMiniJava.g:4114:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4118:1: ( rule__MethodCall__Group__3__Impl )
            // InternalMiniJava.g:4119:2: rule__MethodCall__Group__3__Impl
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
    // InternalMiniJava.g:4125:1: rule__MethodCall__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4129:1: ( ( ')' ) )
            // InternalMiniJava.g:4130:1: ( ')' )
            {
            // InternalMiniJava.g:4130:1: ( ')' )
            // InternalMiniJava.g:4131:2: ')'
            {
             before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMiniJava.g:4141:1: rule__MethodCall__Group_2__0 : rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 ;
    public final void rule__MethodCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4145:1: ( rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1 )
            // InternalMiniJava.g:4146:2: rule__MethodCall__Group_2__0__Impl rule__MethodCall__Group_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMiniJava.g:4153:1: rule__MethodCall__Group_2__0__Impl : ( ( rule__MethodCall__ParametersAssignment_2_0 ) ) ;
    public final void rule__MethodCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4157:1: ( ( ( rule__MethodCall__ParametersAssignment_2_0 ) ) )
            // InternalMiniJava.g:4158:1: ( ( rule__MethodCall__ParametersAssignment_2_0 ) )
            {
            // InternalMiniJava.g:4158:1: ( ( rule__MethodCall__ParametersAssignment_2_0 ) )
            // InternalMiniJava.g:4159:2: ( rule__MethodCall__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getMethodCallAccess().getParametersAssignment_2_0()); 
            // InternalMiniJava.g:4160:2: ( rule__MethodCall__ParametersAssignment_2_0 )
            // InternalMiniJava.g:4160:3: rule__MethodCall__ParametersAssignment_2_0
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
    // InternalMiniJava.g:4168:1: rule__MethodCall__Group_2__1 : rule__MethodCall__Group_2__1__Impl ;
    public final void rule__MethodCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4172:1: ( rule__MethodCall__Group_2__1__Impl )
            // InternalMiniJava.g:4173:2: rule__MethodCall__Group_2__1__Impl
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
    // InternalMiniJava.g:4179:1: rule__MethodCall__Group_2__1__Impl : ( ( rule__MethodCall__Group_2_1__0 )* ) ;
    public final void rule__MethodCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4183:1: ( ( ( rule__MethodCall__Group_2_1__0 )* ) )
            // InternalMiniJava.g:4184:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            {
            // InternalMiniJava.g:4184:1: ( ( rule__MethodCall__Group_2_1__0 )* )
            // InternalMiniJava.g:4185:2: ( rule__MethodCall__Group_2_1__0 )*
            {
             before(grammarAccess.getMethodCallAccess().getGroup_2_1()); 
            // InternalMiniJava.g:4186:2: ( rule__MethodCall__Group_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMiniJava.g:4186:3: rule__MethodCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__MethodCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMiniJava.g:4195:1: rule__MethodCall__Group_2_1__0 : rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 ;
    public final void rule__MethodCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4199:1: ( rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1 )
            // InternalMiniJava.g:4200:2: rule__MethodCall__Group_2_1__0__Impl rule__MethodCall__Group_2_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:4207:1: rule__MethodCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__MethodCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4211:1: ( ( ',' ) )
            // InternalMiniJava.g:4212:1: ( ',' )
            {
            // InternalMiniJava.g:4212:1: ( ',' )
            // InternalMiniJava.g:4213:2: ','
            {
             before(grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMiniJava.g:4222:1: rule__MethodCall__Group_2_1__1 : rule__MethodCall__Group_2_1__1__Impl ;
    public final void rule__MethodCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4226:1: ( rule__MethodCall__Group_2_1__1__Impl )
            // InternalMiniJava.g:4227:2: rule__MethodCall__Group_2_1__1__Impl
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
    // InternalMiniJava.g:4233:1: rule__MethodCall__Group_2_1__1__Impl : ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__MethodCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4237:1: ( ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) ) )
            // InternalMiniJava.g:4238:1: ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) )
            {
            // InternalMiniJava.g:4238:1: ( ( rule__MethodCall__ParametersAssignment_2_1_1 ) )
            // InternalMiniJava.g:4239:2: ( rule__MethodCall__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getMethodCallAccess().getParametersAssignment_2_1_1()); 
            // InternalMiniJava.g:4240:2: ( rule__MethodCall__ParametersAssignment_2_1_1 )
            // InternalMiniJava.g:4240:3: rule__MethodCall__ParametersAssignment_2_1_1
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
    // InternalMiniJava.g:4249:1: rule__Program__ClassDeclarationsAssignment_0 : ( ruleMainClass ) ;
    public final void rule__Program__ClassDeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4253:1: ( ( ruleMainClass ) )
            // InternalMiniJava.g:4254:2: ( ruleMainClass )
            {
            // InternalMiniJava.g:4254:2: ( ruleMainClass )
            // InternalMiniJava.g:4255:3: ruleMainClass
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
    // InternalMiniJava.g:4264:1: rule__Program__ClassDeclarationsAssignment_1 : ( ruleClassDeclaration ) ;
    public final void rule__Program__ClassDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4268:1: ( ( ruleClassDeclaration ) )
            // InternalMiniJava.g:4269:2: ( ruleClassDeclaration )
            {
            // InternalMiniJava.g:4269:2: ( ruleClassDeclaration )
            // InternalMiniJava.g:4270:3: ruleClassDeclaration
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
    // InternalMiniJava.g:4279:1: rule__MainClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MainClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4283:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4284:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4284:2: ( RULE_ID )
            // InternalMiniJava.g:4285:3: RULE_ID
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


    // $ANTLR start "rule__MainClass__StatementAssignment_14"
    // InternalMiniJava.g:4294:1: rule__MainClass__StatementAssignment_14 : ( ruleStatement ) ;
    public final void rule__MainClass__StatementAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4298:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4299:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4299:2: ( ruleStatement )
            // InternalMiniJava.g:4300:3: ruleStatement
            {
             before(grammarAccess.getMainClassAccess().getStatementStatementParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMainClassAccess().getStatementStatementParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClass__StatementAssignment_14"


    // $ANTLR start "rule__ClassDeclaration__NameAssignment_1"
    // InternalMiniJava.g:4309:1: rule__ClassDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4313:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4314:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4314:2: ( RULE_ID )
            // InternalMiniJava.g:4315:3: RULE_ID
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
    // InternalMiniJava.g:4324:1: rule__ClassDeclaration__ExtendedClassAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassDeclaration__ExtendedClassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4328:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:4329:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:4329:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:4330:3: ( RULE_ID )
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendedClassClassDeclCrossReference_2_1_0()); 
            // InternalMiniJava.g:4331:3: ( RULE_ID )
            // InternalMiniJava.g:4332:4: RULE_ID
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
    // InternalMiniJava.g:4343:1: rule__ClassDeclaration__VarDeclarationsAssignment_4 : ( ruleVarDeclaration ) ;
    public final void rule__ClassDeclaration__VarDeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4347:1: ( ( ruleVarDeclaration ) )
            // InternalMiniJava.g:4348:2: ( ruleVarDeclaration )
            {
            // InternalMiniJava.g:4348:2: ( ruleVarDeclaration )
            // InternalMiniJava.g:4349:3: ruleVarDeclaration
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
    // InternalMiniJava.g:4358:1: rule__ClassDeclaration__MethodDeclarationsAssignment_5 : ( ruleMethodDeclaration ) ;
    public final void rule__ClassDeclaration__MethodDeclarationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4362:1: ( ( ruleMethodDeclaration ) )
            // InternalMiniJava.g:4363:2: ( ruleMethodDeclaration )
            {
            // InternalMiniJava.g:4363:2: ( ruleMethodDeclaration )
            // InternalMiniJava.g:4364:3: ruleMethodDeclaration
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
    // InternalMiniJava.g:4373:1: rule__Type__TypeNameAssignment_0_1 : ( ( '[' ) ) ;
    public final void rule__Type__TypeNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4377:1: ( ( ( '[' ) ) )
            // InternalMiniJava.g:4378:2: ( ( '[' ) )
            {
            // InternalMiniJava.g:4378:2: ( ( '[' ) )
            // InternalMiniJava.g:4379:3: ( '[' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 
            // InternalMiniJava.g:4380:3: ( '[' )
            // InternalMiniJava.g:4381:4: '['
            {
             before(grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMiniJava.g:4392:1: rule__Type__TypeNameAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Type__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4396:1: ( ( ( 'int' ) ) )
            // InternalMiniJava.g:4397:2: ( ( 'int' ) )
            {
            // InternalMiniJava.g:4397:2: ( ( 'int' ) )
            // InternalMiniJava.g:4398:3: ( 'int' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0()); 
            // InternalMiniJava.g:4399:3: ( 'int' )
            // InternalMiniJava.g:4400:4: 'int'
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
    // InternalMiniJava.g:4411:1: rule__Type__TypeNameAssignment_2 : ( ( 'boolean' ) ) ;
    public final void rule__Type__TypeNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4415:1: ( ( ( 'boolean' ) ) )
            // InternalMiniJava.g:4416:2: ( ( 'boolean' ) )
            {
            // InternalMiniJava.g:4416:2: ( ( 'boolean' ) )
            // InternalMiniJava.g:4417:3: ( 'boolean' )
            {
             before(grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0()); 
            // InternalMiniJava.g:4418:3: ( 'boolean' )
            // InternalMiniJava.g:4419:4: 'boolean'
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
    // InternalMiniJava.g:4430:1: rule__Type__ClassDeclAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Type__ClassDeclAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4434:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:4435:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:4435:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:4436:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getClassDeclClassDeclCrossReference_3_0()); 
            // InternalMiniJava.g:4437:3: ( RULE_ID )
            // InternalMiniJava.g:4438:4: RULE_ID
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
    // InternalMiniJava.g:4449:1: rule__VarDeclaration__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__VarDeclaration__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4453:1: ( ( ruleVariable ) )
            // InternalMiniJava.g:4454:2: ( ruleVariable )
            {
            // InternalMiniJava.g:4454:2: ( ruleVariable )
            // InternalMiniJava.g:4455:3: ruleVariable
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
    // InternalMiniJava.g:4464:1: rule__Variable__VariableTypeAssignment_0 : ( ruleType ) ;
    public final void rule__Variable__VariableTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4468:1: ( ( ruleType ) )
            // InternalMiniJava.g:4469:2: ( ruleType )
            {
            // InternalMiniJava.g:4469:2: ( ruleType )
            // InternalMiniJava.g:4470:3: ruleType
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
    // InternalMiniJava.g:4479:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4483:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4484:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4484:2: ( RULE_ID )
            // InternalMiniJava.g:4485:3: RULE_ID
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
    // InternalMiniJava.g:4494:1: rule__MethodDeclaration__MethodTypeAssignment_1 : ( ruleType ) ;
    public final void rule__MethodDeclaration__MethodTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4498:1: ( ( ruleType ) )
            // InternalMiniJava.g:4499:2: ( ruleType )
            {
            // InternalMiniJava.g:4499:2: ( ruleType )
            // InternalMiniJava.g:4500:3: ruleType
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
    // InternalMiniJava.g:4509:1: rule__MethodDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MethodDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4513:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4514:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4514:2: ( RULE_ID )
            // InternalMiniJava.g:4515:3: RULE_ID
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
    // InternalMiniJava.g:4524:1: rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0 : ( ruleVariable ) ;
    public final void rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4528:1: ( ( ruleVariable ) )
            // InternalMiniJava.g:4529:2: ( ruleVariable )
            {
            // InternalMiniJava.g:4529:2: ( ruleVariable )
            // InternalMiniJava.g:4530:3: ruleVariable
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
    // InternalMiniJava.g:4539:1: rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1 : ( ruleVariable ) ;
    public final void rule__MethodDeclaration__FormalVarDeclarationsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4543:1: ( ( ruleVariable ) )
            // InternalMiniJava.g:4544:2: ( ruleVariable )
            {
            // InternalMiniJava.g:4544:2: ( ruleVariable )
            // InternalMiniJava.g:4545:3: ruleVariable
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
    // InternalMiniJava.g:4554:1: rule__MethodDeclaration__LocalVarDeclarationsAssignment_7 : ( ruleVarDeclaration ) ;
    public final void rule__MethodDeclaration__LocalVarDeclarationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4558:1: ( ( ruleVarDeclaration ) )
            // InternalMiniJava.g:4559:2: ( ruleVarDeclaration )
            {
            // InternalMiniJava.g:4559:2: ( ruleVarDeclaration )
            // InternalMiniJava.g:4560:3: ruleVarDeclaration
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
    // InternalMiniJava.g:4569:1: rule__MethodDeclaration__StatementsAssignment_8 : ( ruleStatement ) ;
    public final void rule__MethodDeclaration__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4573:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4574:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4574:2: ( ruleStatement )
            // InternalMiniJava.g:4575:3: ruleStatement
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


    // $ANTLR start "rule__MethodDeclaration__ReturnExpressionAssignment_10"
    // InternalMiniJava.g:4584:1: rule__MethodDeclaration__ReturnExpressionAssignment_10 : ( ruleExpression ) ;
    public final void rule__MethodDeclaration__ReturnExpressionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4588:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4589:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4589:2: ( ruleExpression )
            // InternalMiniJava.g:4590:3: ruleExpression
            {
             before(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__ReturnExpressionAssignment_10"


    // $ANTLR start "rule__Statement__StatementTypeAssignment_0_0"
    // InternalMiniJava.g:4599:1: rule__Statement__StatementTypeAssignment_0_0 : ( ( '{' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4603:1: ( ( ( '{' ) ) )
            // InternalMiniJava.g:4604:2: ( ( '{' ) )
            {
            // InternalMiniJava.g:4604:2: ( ( '{' ) )
            // InternalMiniJava.g:4605:3: ( '{' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0()); 
            // InternalMiniJava.g:4606:3: ( '{' )
            // InternalMiniJava.g:4607:4: '{'
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
    // InternalMiniJava.g:4618:1: rule__Statement__StatementsAssignment_0_1 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4622:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4623:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4623:2: ( ruleStatement )
            // InternalMiniJava.g:4624:3: ruleStatement
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
    // InternalMiniJava.g:4633:1: rule__Statement__StatementTypeAssignment_1_0 : ( ( 'if' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4637:1: ( ( ( 'if' ) ) )
            // InternalMiniJava.g:4638:2: ( ( 'if' ) )
            {
            // InternalMiniJava.g:4638:2: ( ( 'if' ) )
            // InternalMiniJava.g:4639:3: ( 'if' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0()); 
            // InternalMiniJava.g:4640:3: ( 'if' )
            // InternalMiniJava.g:4641:4: 'if'
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
    // InternalMiniJava.g:4652:1: rule__Statement__FirstExpressionAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4656:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4657:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4657:2: ( ruleExpression )
            // InternalMiniJava.g:4658:3: ruleExpression
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
    // InternalMiniJava.g:4667:1: rule__Statement__StatementsAssignment_1_4 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4671:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4672:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4672:2: ( ruleStatement )
            // InternalMiniJava.g:4673:3: ruleStatement
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
    // InternalMiniJava.g:4682:1: rule__Statement__StatementsAssignment_1_6 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4686:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4687:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4687:2: ( ruleStatement )
            // InternalMiniJava.g:4688:3: ruleStatement
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
    // InternalMiniJava.g:4697:1: rule__Statement__StatementTypeAssignment_2_0 : ( ( 'while' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4701:1: ( ( ( 'while' ) ) )
            // InternalMiniJava.g:4702:2: ( ( 'while' ) )
            {
            // InternalMiniJava.g:4702:2: ( ( 'while' ) )
            // InternalMiniJava.g:4703:3: ( 'while' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0()); 
            // InternalMiniJava.g:4704:3: ( 'while' )
            // InternalMiniJava.g:4705:4: 'while'
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
    // InternalMiniJava.g:4716:1: rule__Statement__FirstExpressionAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4720:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4721:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4721:2: ( ruleExpression )
            // InternalMiniJava.g:4722:3: ruleExpression
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
    // InternalMiniJava.g:4731:1: rule__Statement__StatementsAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4735:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4736:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4736:2: ( ruleStatement )
            // InternalMiniJava.g:4737:3: ruleStatement
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
    // InternalMiniJava.g:4746:1: rule__Statement__StatementTypeAssignment_3_0 : ( ( 'System.out.println' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4750:1: ( ( ( 'System.out.println' ) ) )
            // InternalMiniJava.g:4751:2: ( ( 'System.out.println' ) )
            {
            // InternalMiniJava.g:4751:2: ( ( 'System.out.println' ) )
            // InternalMiniJava.g:4752:3: ( 'System.out.println' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeSystemOutPrintlnKeyword_3_0_0()); 
            // InternalMiniJava.g:4753:3: ( 'System.out.println' )
            // InternalMiniJava.g:4754:4: 'System.out.println'
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
    // InternalMiniJava.g:4765:1: rule__Statement__FirstExpressionAssignment_3_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4769:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4770:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4770:2: ( ruleExpression )
            // InternalMiniJava.g:4771:3: ruleExpression
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
    // InternalMiniJava.g:4780:1: rule__Statement__VariableAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Statement__VariableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4784:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:4785:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:4785:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:4786:3: ( RULE_ID )
            {
             before(grammarAccess.getStatementAccess().getVariableVariableCrossReference_4_0_0()); 
            // InternalMiniJava.g:4787:3: ( RULE_ID )
            // InternalMiniJava.g:4788:4: RULE_ID
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
    // InternalMiniJava.g:4799:1: rule__Statement__StatementTypeAssignment_4_1 : ( ( '=' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4803:1: ( ( ( '=' ) ) )
            // InternalMiniJava.g:4804:2: ( ( '=' ) )
            {
            // InternalMiniJava.g:4804:2: ( ( '=' ) )
            // InternalMiniJava.g:4805:3: ( '=' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_1_0()); 
            // InternalMiniJava.g:4806:3: ( '=' )
            // InternalMiniJava.g:4807:4: '='
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
    // InternalMiniJava.g:4818:1: rule__Statement__FirstExpressionAssignment_4_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4822:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4823:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4823:2: ( ruleExpression )
            // InternalMiniJava.g:4824:3: ruleExpression
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
    // InternalMiniJava.g:4833:1: rule__Statement__VariableAssignment_5_0 : ( ( RULE_ID ) ) ;
    public final void rule__Statement__VariableAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4837:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:4838:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:4838:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:4839:3: ( RULE_ID )
            {
             before(grammarAccess.getStatementAccess().getVariableVariableCrossReference_5_0_0()); 
            // InternalMiniJava.g:4840:3: ( RULE_ID )
            // InternalMiniJava.g:4841:4: RULE_ID
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
    // InternalMiniJava.g:4852:1: rule__Statement__IsArrayElementAssignmentAssignment_5_1 : ( ( '[' ) ) ;
    public final void rule__Statement__IsArrayElementAssignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4856:1: ( ( ( '[' ) ) )
            // InternalMiniJava.g:4857:2: ( ( '[' ) )
            {
            // InternalMiniJava.g:4857:2: ( ( '[' ) )
            // InternalMiniJava.g:4858:3: ( '[' )
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_5_1_0()); 
            // InternalMiniJava.g:4859:3: ( '[' )
            // InternalMiniJava.g:4860:4: '['
            {
             before(grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_5_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMiniJava.g:4871:1: rule__Statement__FirstExpressionAssignment_5_2 : ( ruleExpression ) ;
    public final void rule__Statement__FirstExpressionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4875:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4876:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4876:2: ( ruleExpression )
            // InternalMiniJava.g:4877:3: ruleExpression
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
    // InternalMiniJava.g:4886:1: rule__Statement__StatementTypeAssignment_5_4 : ( ( '=' ) ) ;
    public final void rule__Statement__StatementTypeAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4890:1: ( ( ( '=' ) ) )
            // InternalMiniJava.g:4891:2: ( ( '=' ) )
            {
            // InternalMiniJava.g:4891:2: ( ( '=' ) )
            // InternalMiniJava.g:4892:3: ( '=' )
            {
             before(grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_5_4_0()); 
            // InternalMiniJava.g:4893:3: ( '=' )
            // InternalMiniJava.g:4894:4: '='
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
    // InternalMiniJava.g:4905:1: rule__Statement__SecondExpressionAssignment_5_5 : ( ruleExpression ) ;
    public final void rule__Statement__SecondExpressionAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4909:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4910:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4910:2: ( ruleExpression )
            // InternalMiniJava.g:4911:3: ruleExpression
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
    // InternalMiniJava.g:4920:1: rule__Expression__ExpressionTypeAssignment_1_1 : ( ( '<' ) ) ;
    public final void rule__Expression__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4924:1: ( ( ( '<' ) ) )
            // InternalMiniJava.g:4925:2: ( ( '<' ) )
            {
            // InternalMiniJava.g:4925:2: ( ( '<' ) )
            // InternalMiniJava.g:4926:3: ( '<' )
            {
             before(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0()); 
            // InternalMiniJava.g:4927:3: ( '<' )
            // InternalMiniJava.g:4928:4: '<'
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
    // InternalMiniJava.g:4939:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4943:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4944:2: ( ruleExpression )
            {
            // InternalMiniJava.g:4944:2: ( ruleExpression )
            // InternalMiniJava.g:4945:3: ruleExpression
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
    // InternalMiniJava.g:4954:1: rule__Addition__ExpressionTypeAssignment_1_1 : ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4958:1: ( ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) ) )
            // InternalMiniJava.g:4959:2: ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) )
            {
            // InternalMiniJava.g:4959:2: ( ( rule__Addition__ExpressionTypeAlternatives_1_1_0 ) )
            // InternalMiniJava.g:4960:3: ( rule__Addition__ExpressionTypeAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getExpressionTypeAlternatives_1_1_0()); 
            // InternalMiniJava.g:4961:3: ( rule__Addition__ExpressionTypeAlternatives_1_1_0 )
            // InternalMiniJava.g:4961:4: rule__Addition__ExpressionTypeAlternatives_1_1_0
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
    // InternalMiniJava.g:4969:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4973:1: ( ( ruleMultiplication ) )
            // InternalMiniJava.g:4974:2: ( ruleMultiplication )
            {
            // InternalMiniJava.g:4974:2: ( ruleMultiplication )
            // InternalMiniJava.g:4975:3: ruleMultiplication
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
    // InternalMiniJava.g:4984:1: rule__Multiplication__ExpressionTypeAssignment_1_1 : ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4988:1: ( ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) ) )
            // InternalMiniJava.g:4989:2: ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) )
            {
            // InternalMiniJava.g:4989:2: ( ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 ) )
            // InternalMiniJava.g:4990:3: ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getExpressionTypeAlternatives_1_1_0()); 
            // InternalMiniJava.g:4991:3: ( rule__Multiplication__ExpressionTypeAlternatives_1_1_0 )
            // InternalMiniJava.g:4991:4: rule__Multiplication__ExpressionTypeAlternatives_1_1_0
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
    // InternalMiniJava.g:4999:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNegationOrPointExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5003:1: ( ( ruleNegationOrPointExpression ) )
            // InternalMiniJava.g:5004:2: ( ruleNegationOrPointExpression )
            {
            // InternalMiniJava.g:5004:2: ( ruleNegationOrPointExpression )
            // InternalMiniJava.g:5005:3: ruleNegationOrPointExpression
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
    // InternalMiniJava.g:5014:1: rule__Negation__ExpressionTypeAssignment_0 : ( ( '!' ) ) ;
    public final void rule__Negation__ExpressionTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5018:1: ( ( ( '!' ) ) )
            // InternalMiniJava.g:5019:2: ( ( '!' ) )
            {
            // InternalMiniJava.g:5019:2: ( ( '!' ) )
            // InternalMiniJava.g:5020:3: ( '!' )
            {
             before(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0()); 
            // InternalMiniJava.g:5021:3: ( '!' )
            // InternalMiniJava.g:5022:4: '!'
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
    // InternalMiniJava.g:5033:1: rule__Negation__RightAssignment_1 : ( rulePoint ) ;
    public final void rule__Negation__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5037:1: ( ( rulePoint ) )
            // InternalMiniJava.g:5038:2: ( rulePoint )
            {
            // InternalMiniJava.g:5038:2: ( rulePoint )
            // InternalMiniJava.g:5039:3: rulePoint
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
    // InternalMiniJava.g:5048:1: rule__Point__ExpressionTypeAssignment_1_1 : ( ( '.' ) ) ;
    public final void rule__Point__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5052:1: ( ( ( '.' ) ) )
            // InternalMiniJava.g:5053:2: ( ( '.' ) )
            {
            // InternalMiniJava.g:5053:2: ( ( '.' ) )
            // InternalMiniJava.g:5054:3: ( '.' )
            {
             before(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0()); 
            // InternalMiniJava.g:5055:3: ( '.' )
            // InternalMiniJava.g:5056:4: '.'
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
    // InternalMiniJava.g:5067:1: rule__Point__RightAssignment_1_2 : ( ruleSquareBrackets ) ;
    public final void rule__Point__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5071:1: ( ( ruleSquareBrackets ) )
            // InternalMiniJava.g:5072:2: ( ruleSquareBrackets )
            {
            // InternalMiniJava.g:5072:2: ( ruleSquareBrackets )
            // InternalMiniJava.g:5073:3: ruleSquareBrackets
            {
             before(grammarAccess.getPointAccess().getRightSquareBracketsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSquareBrackets();

            state._fsp--;

             after(grammarAccess.getPointAccess().getRightSquareBracketsParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalMiniJava.g:5082:1: rule__SquareBrackets__ExpressionTypeAssignment_1_1 : ( ( '[' ) ) ;
    public final void rule__SquareBrackets__ExpressionTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5086:1: ( ( ( '[' ) ) )
            // InternalMiniJava.g:5087:2: ( ( '[' ) )
            {
            // InternalMiniJava.g:5087:2: ( ( '[' ) )
            // InternalMiniJava.g:5088:3: ( '[' )
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 
            // InternalMiniJava.g:5089:3: ( '[' )
            // InternalMiniJava.g:5090:4: '['
            {
             before(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMiniJava.g:5101:1: rule__SquareBrackets__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__SquareBrackets__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5105:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:5106:2: ( rulePrimary )
            {
            // InternalMiniJava.g:5106:2: ( rulePrimary )
            // InternalMiniJava.g:5107:3: rulePrimary
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
    // InternalMiniJava.g:5116:1: rule__Primary__ExpressionTypeAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5120:1: ( ( ( 'true' ) ) )
            // InternalMiniJava.g:5121:2: ( ( 'true' ) )
            {
            // InternalMiniJava.g:5121:2: ( ( 'true' ) )
            // InternalMiniJava.g:5122:3: ( 'true' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0()); 
            // InternalMiniJava.g:5123:3: ( 'true' )
            // InternalMiniJava.g:5124:4: 'true'
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
    // InternalMiniJava.g:5135:1: rule__Primary__ExpressionTypeAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5139:1: ( ( ( 'false' ) ) )
            // InternalMiniJava.g:5140:2: ( ( 'false' ) )
            {
            // InternalMiniJava.g:5140:2: ( ( 'false' ) )
            // InternalMiniJava.g:5141:3: ( 'false' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0()); 
            // InternalMiniJava.g:5142:3: ( 'false' )
            // InternalMiniJava.g:5143:4: 'false'
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
    // InternalMiniJava.g:5154:1: rule__Primary__ExpressionTypeAssignment_2 : ( ( 'this' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5158:1: ( ( ( 'this' ) ) )
            // InternalMiniJava.g:5159:2: ( ( 'this' ) )
            {
            // InternalMiniJava.g:5159:2: ( ( 'this' ) )
            // InternalMiniJava.g:5160:3: ( 'this' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0()); 
            // InternalMiniJava.g:5161:3: ( 'this' )
            // InternalMiniJava.g:5162:4: 'this'
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
    // InternalMiniJava.g:5173:1: rule__Primary__ExpressionTypeAssignment_3_0 : ( ( 'new' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5177:1: ( ( ( 'new' ) ) )
            // InternalMiniJava.g:5178:2: ( ( 'new' ) )
            {
            // InternalMiniJava.g:5178:2: ( ( 'new' ) )
            // InternalMiniJava.g:5179:3: ( 'new' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0()); 
            // InternalMiniJava.g:5180:3: ( 'new' )
            // InternalMiniJava.g:5181:4: 'new'
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
    // InternalMiniJava.g:5192:1: rule__Primary__ExpressionAssignment_3_3 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5196:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5197:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5197:2: ( ruleExpression )
            // InternalMiniJava.g:5198:3: ruleExpression
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
    // InternalMiniJava.g:5207:1: rule__Primary__ExpressionTypeAssignment_4_0 : ( ( 'new' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5211:1: ( ( ( 'new' ) ) )
            // InternalMiniJava.g:5212:2: ( ( 'new' ) )
            {
            // InternalMiniJava.g:5212:2: ( ( 'new' ) )
            // InternalMiniJava.g:5213:3: ( 'new' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0()); 
            // InternalMiniJava.g:5214:3: ( 'new' )
            // InternalMiniJava.g:5215:4: 'new'
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
    // InternalMiniJava.g:5226:1: rule__Primary__TypeAssignment_4_1 : ( ruleType ) ;
    public final void rule__Primary__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5230:1: ( ( ruleType ) )
            // InternalMiniJava.g:5231:2: ( ruleType )
            {
            // InternalMiniJava.g:5231:2: ( ruleType )
            // InternalMiniJava.g:5232:3: ruleType
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
    // InternalMiniJava.g:5241:1: rule__Primary__ExpressionTypeAssignment_5_0 : ( ( '(' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5245:1: ( ( ( '(' ) ) )
            // InternalMiniJava.g:5246:2: ( ( '(' ) )
            {
            // InternalMiniJava.g:5246:2: ( ( '(' ) )
            // InternalMiniJava.g:5247:3: ( '(' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 
            // InternalMiniJava.g:5248:3: ( '(' )
            // InternalMiniJava.g:5249:4: '('
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMiniJava.g:5260:1: rule__Primary__ExpressionAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5264:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5265:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5265:2: ( ruleExpression )
            // InternalMiniJava.g:5266:3: ruleExpression
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


    // $ANTLR start "rule__Primary__ExpressionTypeAssignment_6"
    // InternalMiniJava.g:5275:1: rule__Primary__ExpressionTypeAssignment_6 : ( ( 'length' ) ) ;
    public final void rule__Primary__ExpressionTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5279:1: ( ( ( 'length' ) ) )
            // InternalMiniJava.g:5280:2: ( ( 'length' ) )
            {
            // InternalMiniJava.g:5280:2: ( ( 'length' ) )
            // InternalMiniJava.g:5281:3: ( 'length' )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeLengthKeyword_6_0()); 
            // InternalMiniJava.g:5282:3: ( 'length' )
            // InternalMiniJava.g:5283:4: 'length'
            {
             before(grammarAccess.getPrimaryAccess().getExpressionTypeLengthKeyword_6_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExpressionTypeLengthKeyword_6_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getExpressionTypeLengthKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionTypeAssignment_6"


    // $ANTLR start "rule__Primary__VariableAssignment_7"
    // InternalMiniJava.g:5294:1: rule__Primary__VariableAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__VariableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5298:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:5299:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:5299:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:5300:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_7_0()); 
            // InternalMiniJava.g:5301:3: ( RULE_ID )
            // InternalMiniJava.g:5302:4: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getVariableVariableIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getVariableVariableIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__VariableAssignment_7"


    // $ANTLR start "rule__Primary__MethodCallAssignment_8"
    // InternalMiniJava.g:5313:1: rule__Primary__MethodCallAssignment_8 : ( ruleMethodCall ) ;
    public final void rule__Primary__MethodCallAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5317:1: ( ( ruleMethodCall ) )
            // InternalMiniJava.g:5318:2: ( ruleMethodCall )
            {
            // InternalMiniJava.g:5318:2: ( ruleMethodCall )
            // InternalMiniJava.g:5319:3: ruleMethodCall
            {
             before(grammarAccess.getPrimaryAccess().getMethodCallMethodCallParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getMethodCallMethodCallParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__MethodCallAssignment_8"


    // $ANTLR start "rule__Primary__NumberAssignment_9"
    // InternalMiniJava.g:5328:1: rule__Primary__NumberAssignment_9 : ( ruleNumberValue ) ;
    public final void rule__Primary__NumberAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5332:1: ( ( ruleNumberValue ) )
            // InternalMiniJava.g:5333:2: ( ruleNumberValue )
            {
            // InternalMiniJava.g:5333:2: ( ruleNumberValue )
            // InternalMiniJava.g:5334:3: ruleNumberValue
            {
             before(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__NumberAssignment_9"


    // $ANTLR start "rule__MethodCall__MethodAssignment_0"
    // InternalMiniJava.g:5343:1: rule__MethodCall__MethodAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5347:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:5348:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:5348:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:5349:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodCallAccess().getMethodMethodCrossReference_0_0()); 
            // InternalMiniJava.g:5350:3: ( RULE_ID )
            // InternalMiniJava.g:5351:4: RULE_ID
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
    // InternalMiniJava.g:5362:1: rule__MethodCall__ParametersAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5366:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5367:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5367:2: ( ruleExpression )
            // InternalMiniJava.g:5368:3: ruleExpression
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
    // InternalMiniJava.g:5377:1: rule__MethodCall__ParametersAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__MethodCall__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5381:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5382:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5382:2: ( ruleExpression )
            // InternalMiniJava.g:5383:3: ruleExpression
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
    // InternalMiniJava.g:5392:1: rule__NumberValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5396:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:5397:2: ( RULE_INT )
            {
            // InternalMiniJava.g:5397:2: ( RULE_INT )
            // InternalMiniJava.g:5398:3: RULE_INT
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
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\7\uffff\1\13\7\uffff";
    static final String dfa_3s = "\1\4\3\uffff\1\4\2\uffff\1\13\1\uffff\1\25\3\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\55\3\uffff\1\41\2\uffff\1\50\1\uffff\1\27\3\uffff\1\55\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\uffff\1\12\1\uffff\1\5\1\10\1\11\1\uffff\1\4";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\10\17\uffff\1\5\23\uffff\1\1\1\2\1\3\1\4\1\6",
            "",
            "",
            "",
            "\1\12\27\uffff\1\11\4\uffff\1\12",
            "",
            "",
            "\4\13\6\uffff\1\14\1\uffff\3\13\3\uffff\1\13\1\uffff\1\13\6\uffff\1\13\1\uffff\1\13",
            "",
            "\1\12\1\uffff\1\15",
            "",
            "",
            "",
            "\2\16\17\uffff\1\16\2\uffff\1\12\16\uffff\1\16\1\uffff\5\16",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "643:1: rule__Primary__Alternatives : ( ( ( rule__Primary__ExpressionTypeAssignment_0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_1 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__ExpressionTypeAssignment_6 ) ) | ( ( rule__Primary__VariableAssignment_7 ) ) | ( ( rule__Primary__MethodCallAssignment_8 ) ) | ( ( rule__Primary__NumberAssignment_9 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001C00010010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000214020010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000210000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000210000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000212000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001E50010010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001C00010012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00003E8000200030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001C04010010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00003E8002200030L});

}