package demidov.projects.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import demidov.projects.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'{'", "'}'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'extends'", "'int'", "'boolean'", "';'", "','", "'return'", "'if'", "'else'", "'while'", "'System.out.println'", "'='", "'<'", "'+'", "'-'", "'*'", "'&&'", "'!'", "'.'", "'true'", "'false'", "'this'", "'new'", "'length'"
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

        public InternalMiniJavaParser(TokenStream input, MiniJavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MiniJavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMiniJava.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMiniJava.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMiniJava.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniJava.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_classDeclarations_0_0= ruleMainClass ) ) ( (lv_classDeclarations_1_0= ruleClassDeclaration ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_classDeclarations_0_0 = null;

        EObject lv_classDeclarations_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:77:2: ( ( ( (lv_classDeclarations_0_0= ruleMainClass ) ) ( (lv_classDeclarations_1_0= ruleClassDeclaration ) )* ) )
            // InternalMiniJava.g:78:2: ( ( (lv_classDeclarations_0_0= ruleMainClass ) ) ( (lv_classDeclarations_1_0= ruleClassDeclaration ) )* )
            {
            // InternalMiniJava.g:78:2: ( ( (lv_classDeclarations_0_0= ruleMainClass ) ) ( (lv_classDeclarations_1_0= ruleClassDeclaration ) )* )
            // InternalMiniJava.g:79:3: ( (lv_classDeclarations_0_0= ruleMainClass ) ) ( (lv_classDeclarations_1_0= ruleClassDeclaration ) )*
            {
            // InternalMiniJava.g:79:3: ( (lv_classDeclarations_0_0= ruleMainClass ) )
            // InternalMiniJava.g:80:4: (lv_classDeclarations_0_0= ruleMainClass )
            {
            // InternalMiniJava.g:80:4: (lv_classDeclarations_0_0= ruleMainClass )
            // InternalMiniJava.g:81:5: lv_classDeclarations_0_0= ruleMainClass
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getClassDeclarationsMainClassParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_classDeclarations_0_0=ruleMainClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					add(
            						current,
            						"classDeclarations",
            						lv_classDeclarations_0_0,
            						"demidov.projects.MiniJava.MainClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:98:3: ( (lv_classDeclarations_1_0= ruleClassDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMiniJava.g:99:4: (lv_classDeclarations_1_0= ruleClassDeclaration )
            	    {
            	    // InternalMiniJava.g:99:4: (lv_classDeclarations_1_0= ruleClassDeclaration )
            	    // InternalMiniJava.g:100:5: lv_classDeclarations_1_0= ruleClassDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getClassDeclarationsClassDeclarationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_classDeclarations_1_0=ruleClassDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classDeclarations",
            	    						lv_classDeclarations_1_0,
            	    						"demidov.projects.MiniJava.ClassDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMainClass"
    // InternalMiniJava.g:121:1: entryRuleMainClass returns [EObject current=null] : iv_ruleMainClass= ruleMainClass EOF ;
    public final EObject entryRuleMainClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainClass = null;


        try {
            // InternalMiniJava.g:121:50: (iv_ruleMainClass= ruleMainClass EOF )
            // InternalMiniJava.g:122:2: iv_ruleMainClass= ruleMainClass EOF
            {
             newCompositeNode(grammarAccess.getMainClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainClass=ruleMainClass();

            state._fsp--;

             current =iv_ruleMainClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMainClass"


    // $ANTLR start "ruleMainClass"
    // InternalMiniJava.g:128:1: ruleMainClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mainMethod_3_0= ruleMainMethod ) ) otherlv_4= '}' ) ;
    public final EObject ruleMainClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mainMethod_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:134:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mainMethod_3_0= ruleMainMethod ) ) otherlv_4= '}' ) )
            // InternalMiniJava.g:135:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mainMethod_3_0= ruleMainMethod ) ) otherlv_4= '}' )
            {
            // InternalMiniJava.g:135:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mainMethod_3_0= ruleMainMethod ) ) otherlv_4= '}' )
            // InternalMiniJava.g:136:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mainMethod_3_0= ruleMainMethod ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMainClassAccess().getClassKeyword_0());
            		
            // InternalMiniJava.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMainClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMiniJava.g:162:3: ( (lv_mainMethod_3_0= ruleMainMethod ) )
            // InternalMiniJava.g:163:4: (lv_mainMethod_3_0= ruleMainMethod )
            {
            // InternalMiniJava.g:163:4: (lv_mainMethod_3_0= ruleMainMethod )
            // InternalMiniJava.g:164:5: lv_mainMethod_3_0= ruleMainMethod
            {

            					newCompositeNode(grammarAccess.getMainClassAccess().getMainMethodMainMethodParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_mainMethod_3_0=ruleMainMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainClassRule());
            					}
            					set(
            						current,
            						"mainMethod",
            						lv_mainMethod_3_0,
            						"demidov.projects.MiniJava.MainMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMainClass"


    // $ANTLR start "entryRuleMainMethod"
    // InternalMiniJava.g:189:1: entryRuleMainMethod returns [EObject current=null] : iv_ruleMainMethod= ruleMainMethod EOF ;
    public final EObject entryRuleMainMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainMethod = null;


        try {
            // InternalMiniJava.g:189:51: (iv_ruleMainMethod= ruleMainMethod EOF )
            // InternalMiniJava.g:190:2: iv_ruleMainMethod= ruleMainMethod EOF
            {
             newCompositeNode(grammarAccess.getMainMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainMethod=ruleMainMethod();

            state._fsp--;

             current =iv_ruleMainMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMainMethod"


    // $ANTLR start "ruleMainMethod"
    // InternalMiniJava.g:196:1: ruleMainMethod returns [EObject current=null] : (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' otherlv_10= '{' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= '}' ) ;
    public final EObject ruleMainMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_ID_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_statement_11_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:202:2: ( (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' otherlv_10= '{' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= '}' ) )
            // InternalMiniJava.g:203:2: (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' otherlv_10= '{' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= '}' )
            {
            // InternalMiniJava.g:203:2: (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' otherlv_10= '{' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= '}' )
            // InternalMiniJava.g:204:3: otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' this_ID_8= RULE_ID otherlv_9= ')' otherlv_10= '{' ( (lv_statement_11_0= ruleStatement ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMainMethodAccess().getPublicKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMainMethodAccess().getStaticKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMainMethodAccess().getVoidKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getMainMethodAccess().getMainKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getMainMethodAccess().getLeftParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getMainMethodAccess().getStringKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getMainMethodAccess().getLeftSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getMainMethodAccess().getRightSquareBracketKeyword_7());
            		
            this_ID_8=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(this_ID_8, grammarAccess.getMainMethodAccess().getIDTerminalRuleCall_8());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getMainMethodAccess().getRightParenthesisKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getMainMethodAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMiniJava.g:248:3: ( (lv_statement_11_0= ruleStatement ) )
            // InternalMiniJava.g:249:4: (lv_statement_11_0= ruleStatement )
            {
            // InternalMiniJava.g:249:4: (lv_statement_11_0= ruleStatement )
            // InternalMiniJava.g:250:5: lv_statement_11_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getMainMethodAccess().getStatementStatementParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_7);
            lv_statement_11_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainMethodRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_11_0,
            						"demidov.projects.MiniJava.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMainMethodAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleMainMethod"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalMiniJava.g:275:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalMiniJava.g:275:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalMiniJava.g:276:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalMiniJava.g:282:1: ruleClassDeclaration returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_varDeclarations_5_0 = null;

        EObject lv_methodDeclarations_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:288:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' ) )
            // InternalMiniJava.g:289:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' )
            {
            // InternalMiniJava.g:289:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' )
            // InternalMiniJava.g:290:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassDeclarationAccess().getClassKeyword_0());
            		
            // InternalMiniJava.g:294:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:295:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:295:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:296:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMiniJava.g:312:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:313:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMiniJava.g:317:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMiniJava.g:318:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMiniJava.g:318:5: (otherlv_3= RULE_ID )
                    // InternalMiniJava.g:319:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDeclarationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getExtendedClassClassDeclCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMiniJava.g:335:3: ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=24 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMiniJava.g:336:4: (lv_varDeclarations_5_0= ruleVarDeclaration )
            	    {
            	    // InternalMiniJava.g:336:4: (lv_varDeclarations_5_0= ruleVarDeclaration )
            	    // InternalMiniJava.g:337:5: lv_varDeclarations_5_0= ruleVarDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getClassDeclarationAccess().getVarDeclarationsVarDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_varDeclarations_5_0=ruleVarDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"varDeclarations",
            	    						lv_varDeclarations_5_0,
            	    						"demidov.projects.MiniJava.VarDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMiniJava.g:354:3: ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMiniJava.g:355:4: (lv_methodDeclarations_6_0= ruleMethodDeclaration )
            	    {
            	    // InternalMiniJava.g:355:4: (lv_methodDeclarations_6_0= ruleMethodDeclaration )
            	    // InternalMiniJava.g:356:5: lv_methodDeclarations_6_0= ruleMethodDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_methodDeclarations_6_0=ruleMethodDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methodDeclarations",
            	    						lv_methodDeclarations_6_0,
            	    						"demidov.projects.MiniJava.MethodDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalMiniJava.g:381:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMiniJava.g:381:45: (iv_ruleType= ruleType EOF )
            // InternalMiniJava.g:382:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMiniJava.g:388:1: ruleType returns [EObject current=null] : ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_typeName_1_0=null;
        Token otherlv_2=null;
        Token lv_typeName_3_0=null;
        Token lv_typeName_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMiniJava.g:394:2: ( ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMiniJava.g:395:2: ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMiniJava.g:395:2: ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==20) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==18) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
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
                    // InternalMiniJava.g:396:3: (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' )
                    {
                    // InternalMiniJava.g:396:3: (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' )
                    // InternalMiniJava.g:397:4: otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getIntKeyword_0_0());
                    			
                    // InternalMiniJava.g:401:4: ( (lv_typeName_1_0= '[' ) )
                    // InternalMiniJava.g:402:5: (lv_typeName_1_0= '[' )
                    {
                    // InternalMiniJava.g:402:5: (lv_typeName_1_0= '[' )
                    // InternalMiniJava.g:403:6: lv_typeName_1_0= '['
                    {
                    lv_typeName_1_0=(Token)match(input,20,FOLLOW_14); 

                    						newLeafNode(lv_typeName_1_0, grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "typeName", lv_typeName_1_0, "[");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:421:3: ( (lv_typeName_3_0= 'int' ) )
                    {
                    // InternalMiniJava.g:421:3: ( (lv_typeName_3_0= 'int' ) )
                    // InternalMiniJava.g:422:4: (lv_typeName_3_0= 'int' )
                    {
                    // InternalMiniJava.g:422:4: (lv_typeName_3_0= 'int' )
                    // InternalMiniJava.g:423:5: lv_typeName_3_0= 'int'
                    {
                    lv_typeName_3_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_typeName_3_0, grammarAccess.getTypeAccess().getTypeNameIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_3_0, "int");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:436:3: ( (lv_typeName_4_0= 'boolean' ) )
                    {
                    // InternalMiniJava.g:436:3: ( (lv_typeName_4_0= 'boolean' ) )
                    // InternalMiniJava.g:437:4: (lv_typeName_4_0= 'boolean' )
                    {
                    // InternalMiniJava.g:437:4: (lv_typeName_4_0= 'boolean' )
                    // InternalMiniJava.g:438:5: lv_typeName_4_0= 'boolean'
                    {
                    lv_typeName_4_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_typeName_4_0, grammarAccess.getTypeAccess().getTypeNameBooleanKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_4_0, "boolean");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:451:3: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalMiniJava.g:451:3: ( (otherlv_5= RULE_ID ) )
                    // InternalMiniJava.g:452:4: (otherlv_5= RULE_ID )
                    {
                    // InternalMiniJava.g:452:4: (otherlv_5= RULE_ID )
                    // InternalMiniJava.g:453:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getClassDeclClassDeclCrossReference_3_0());
                    				

                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalMiniJava.g:468:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalMiniJava.g:468:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalMiniJava.g:469:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalMiniJava.g:475:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:481:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' ) )
            // InternalMiniJava.g:482:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' )
            {
            // InternalMiniJava.g:482:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' )
            // InternalMiniJava.g:483:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';'
            {
            // InternalMiniJava.g:483:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalMiniJava.g:484:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalMiniJava.g:484:4: (lv_variable_0_0= ruleVariable )
            // InternalMiniJava.g:485:5: lv_variable_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"demidov.projects.MiniJava.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVariable"
    // InternalMiniJava.g:510:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMiniJava.g:510:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMiniJava.g:511:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMiniJava.g:517:1: ruleVariable returns [EObject current=null] : ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_variableType_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:523:2: ( ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava.g:524:2: ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava.g:524:2: ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava.g:525:3: ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava.g:525:3: ( (lv_variableType_0_0= ruleType ) )
            // InternalMiniJava.g:526:4: (lv_variableType_0_0= ruleType )
            {
            // InternalMiniJava.g:526:4: (lv_variableType_0_0= ruleType )
            // InternalMiniJava.g:527:5: lv_variableType_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_variableType_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"variableType",
            						lv_variableType_0_0,
            						"demidov.projects.MiniJava.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:544:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:545:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:545:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:546:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleMethodDeclaration"
    // InternalMiniJava.g:566:1: entryRuleMethodDeclaration returns [EObject current=null] : iv_ruleMethodDeclaration= ruleMethodDeclaration EOF ;
    public final EObject entryRuleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDeclaration = null;


        try {
            // InternalMiniJava.g:566:58: (iv_ruleMethodDeclaration= ruleMethodDeclaration EOF )
            // InternalMiniJava.g:567:2: iv_ruleMethodDeclaration= ruleMethodDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMethodDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodDeclaration=ruleMethodDeclaration();

            state._fsp--;

             current =iv_ruleMethodDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodDeclaration"


    // $ANTLR start "ruleMethodDeclaration"
    // InternalMiniJava.g:573:1: ruleMethodDeclaration returns [EObject current=null] : (otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}' ) ;
    public final EObject ruleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_methodType_1_0 = null;

        EObject lv_formalVarDeclarations_4_0 = null;

        EObject lv_formalVarDeclarations_6_0 = null;

        EObject lv_localVarDeclarations_9_0 = null;

        EObject lv_statements_10_0 = null;

        EObject lv_returnExpression_12_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:579:2: ( (otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}' ) )
            // InternalMiniJava.g:580:2: (otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}' )
            {
            // InternalMiniJava.g:580:2: (otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}' )
            // InternalMiniJava.g:581:3: otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodDeclarationAccess().getPublicKeyword_0());
            		
            // InternalMiniJava.g:585:3: ( (lv_methodType_1_0= ruleType ) )
            // InternalMiniJava.g:586:4: (lv_methodType_1_0= ruleType )
            {
            // InternalMiniJava.g:586:4: (lv_methodType_1_0= ruleType )
            // InternalMiniJava.g:587:5: lv_methodType_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getMethodTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_methodType_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
            					}
            					set(
            						current,
            						"methodType",
            						lv_methodType_1_0,
            						"demidov.projects.MiniJava.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:604:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiniJava.g:605:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiniJava.g:605:4: (lv_name_2_0= RULE_ID )
            // InternalMiniJava.g:606:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMethodDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMiniJava.g:626:3: ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=24 && LA7_0<=25)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:627:4: ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )*
                    {
                    // InternalMiniJava.g:627:4: ( (lv_formalVarDeclarations_4_0= ruleVariable ) )
                    // InternalMiniJava.g:628:5: (lv_formalVarDeclarations_4_0= ruleVariable )
                    {
                    // InternalMiniJava.g:628:5: (lv_formalVarDeclarations_4_0= ruleVariable )
                    // InternalMiniJava.g:629:6: lv_formalVarDeclarations_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsVariableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_formalVarDeclarations_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"formalVarDeclarations",
                    							lv_formalVarDeclarations_4_0,
                    							"demidov.projects.MiniJava.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiniJava.g:646:4: (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMiniJava.g:647:5: otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_21); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodDeclarationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalMiniJava.g:651:5: ( (lv_formalVarDeclarations_6_0= ruleVariable ) )
                    	    // InternalMiniJava.g:652:6: (lv_formalVarDeclarations_6_0= ruleVariable )
                    	    {
                    	    // InternalMiniJava.g:652:6: (lv_formalVarDeclarations_6_0= ruleVariable )
                    	    // InternalMiniJava.g:653:7: lv_formalVarDeclarations_6_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodDeclarationAccess().getFormalVarDeclarationsVariableParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_formalVarDeclarations_6_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"formalVarDeclarations",
                    	    								lv_formalVarDeclarations_6_0,
                    	    								"demidov.projects.MiniJava.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodDeclarationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMiniJava.g:680:3: ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMiniJava.g:681:4: (lv_localVarDeclarations_9_0= ruleVarDeclaration )
            	    {
            	    // InternalMiniJava.g:681:4: (lv_localVarDeclarations_9_0= ruleVarDeclaration )
            	    // InternalMiniJava.g:682:5: lv_localVarDeclarations_9_0= ruleVarDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getLocalVarDeclarationsVarDeclarationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_localVarDeclarations_9_0=ruleVarDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"localVarDeclarations",
            	    						lv_localVarDeclarations_9_0,
            	    						"demidov.projects.MiniJava.VarDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMiniJava.g:699:3: ( (lv_statements_10_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==12||LA9_0==29||(LA9_0>=31 && LA9_0<=32)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMiniJava.g:700:4: (lv_statements_10_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:700:4: (lv_statements_10_0= ruleStatement )
            	    // InternalMiniJava.g:701:5: lv_statements_10_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getStatementsStatementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_statements_10_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_10_0,
            	    						"demidov.projects.MiniJava.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMiniJava.g:718:3: (otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMiniJava.g:719:4: otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9_0());
                    			
                    // InternalMiniJava.g:723:4: ( (lv_returnExpression_12_0= ruleExpression ) )
                    // InternalMiniJava.g:724:5: (lv_returnExpression_12_0= ruleExpression )
                    {
                    // InternalMiniJava.g:724:5: (lv_returnExpression_12_0= ruleExpression )
                    // InternalMiniJava.g:725:6: lv_returnExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_returnExpression_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"returnExpression",
                    							lv_returnExpression_12_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_9_2());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleMethodDeclaration"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:755:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMiniJava.g:755:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMiniJava.g:756:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniJava.g:762:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_statementType_0_0=null;
        Token otherlv_2=null;
        Token lv_statementType_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_statementType_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_statementType_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_statementType_21_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_isArrayElementAssignment_25_0=null;
        Token otherlv_27=null;
        Token lv_statementType_28_0=null;
        Token otherlv_30=null;
        EObject lv_statements_1_0 = null;

        EObject lv_firstExpression_5_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_firstExpression_12_0 = null;

        EObject lv_statements_14_0 = null;

        EObject lv_firstExpression_17_0 = null;

        EObject lv_firstExpression_22_0 = null;

        EObject lv_firstExpression_26_0 = null;

        EObject lv_secondExpression_29_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:768:2: ( ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' ) ) )
            // InternalMiniJava.g:769:2: ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' ) )
            {
            // InternalMiniJava.g:769:2: ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case RULE_ID:
                {
                int LA12_5 = input.LA(2);

                if ( (LA12_5==20) ) {
                    alt12=6;
                }
                else if ( (LA12_5==33) ) {
                    alt12=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:770:3: ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
                    {
                    // InternalMiniJava.g:770:3: ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
                    // InternalMiniJava.g:771:4: ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
                    {
                    // InternalMiniJava.g:771:4: ( (lv_statementType_0_0= '{' ) )
                    // InternalMiniJava.g:772:5: (lv_statementType_0_0= '{' )
                    {
                    // InternalMiniJava.g:772:5: (lv_statementType_0_0= '{' )
                    // InternalMiniJava.g:773:6: lv_statementType_0_0= '{'
                    {
                    lv_statementType_0_0=(Token)match(input,12,FOLLOW_27); 

                    						newLeafNode(lv_statementType_0_0, grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_0_0, "{");
                    					

                    }


                    }

                    // InternalMiniJava.g:785:4: ( (lv_statements_1_0= ruleStatement ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==12||LA11_0==29||(LA11_0>=31 && LA11_0<=32)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMiniJava.g:786:5: (lv_statements_1_0= ruleStatement )
                    	    {
                    	    // InternalMiniJava.g:786:5: (lv_statements_1_0= ruleStatement )
                    	    // InternalMiniJava.g:787:6: lv_statements_1_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_statements_1_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_1_0,
                    	    							"demidov.projects.MiniJava.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:810:3: ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) )
                    {
                    // InternalMiniJava.g:810:3: ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) )
                    // InternalMiniJava.g:811:4: ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) )
                    {
                    // InternalMiniJava.g:811:4: ( (lv_statementType_3_0= 'if' ) )
                    // InternalMiniJava.g:812:5: (lv_statementType_3_0= 'if' )
                    {
                    // InternalMiniJava.g:812:5: (lv_statementType_3_0= 'if' )
                    // InternalMiniJava.g:813:6: lv_statementType_3_0= 'if'
                    {
                    lv_statementType_3_0=(Token)match(input,29,FOLLOW_11); 

                    						newLeafNode(lv_statementType_3_0, grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_3_0, "if");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMiniJava.g:829:4: ( (lv_firstExpression_5_0= ruleExpression ) )
                    // InternalMiniJava.g:830:5: (lv_firstExpression_5_0= ruleExpression )
                    {
                    // InternalMiniJava.g:830:5: (lv_firstExpression_5_0= ruleExpression )
                    // InternalMiniJava.g:831:6: lv_firstExpression_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_firstExpression_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_5_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalMiniJava.g:852:4: ( (lv_statements_7_0= ruleStatement ) )
                    // InternalMiniJava.g:853:5: (lv_statements_7_0= ruleStatement )
                    {
                    // InternalMiniJava.g:853:5: (lv_statements_7_0= ruleStatement )
                    // InternalMiniJava.g:854:6: lv_statements_7_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_statements_7_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_7_0,
                    							"demidov.projects.MiniJava.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,30,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getElseKeyword_1_5());
                    			
                    // InternalMiniJava.g:875:4: ( (lv_statements_9_0= ruleStatement ) )
                    // InternalMiniJava.g:876:5: (lv_statements_9_0= ruleStatement )
                    {
                    // InternalMiniJava.g:876:5: (lv_statements_9_0= ruleStatement )
                    // InternalMiniJava.g:877:6: lv_statements_9_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_statements_9_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_9_0,
                    							"demidov.projects.MiniJava.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:896:3: ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) )
                    {
                    // InternalMiniJava.g:896:3: ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) )
                    // InternalMiniJava.g:897:4: ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) )
                    {
                    // InternalMiniJava.g:897:4: ( (lv_statementType_10_0= 'while' ) )
                    // InternalMiniJava.g:898:5: (lv_statementType_10_0= 'while' )
                    {
                    // InternalMiniJava.g:898:5: (lv_statementType_10_0= 'while' )
                    // InternalMiniJava.g:899:6: lv_statementType_10_0= 'while'
                    {
                    lv_statementType_10_0=(Token)match(input,31,FOLLOW_11); 

                    						newLeafNode(lv_statementType_10_0, grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_10_0, "while");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMiniJava.g:915:4: ( (lv_firstExpression_12_0= ruleExpression ) )
                    // InternalMiniJava.g:916:5: (lv_firstExpression_12_0= ruleExpression )
                    {
                    // InternalMiniJava.g:916:5: (lv_firstExpression_12_0= ruleExpression )
                    // InternalMiniJava.g:917:6: lv_firstExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_firstExpression_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_12_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getRightParenthesisKeyword_2_3());
                    			
                    // InternalMiniJava.g:938:4: ( (lv_statements_14_0= ruleStatement ) )
                    // InternalMiniJava.g:939:5: (lv_statements_14_0= ruleStatement )
                    {
                    // InternalMiniJava.g:939:5: (lv_statements_14_0= ruleStatement )
                    // InternalMiniJava.g:940:6: lv_statements_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_statements_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_14_0,
                    							"demidov.projects.MiniJava.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:959:3: ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' )
                    {
                    // InternalMiniJava.g:959:3: ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' )
                    // InternalMiniJava.g:960:4: ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';'
                    {
                    // InternalMiniJava.g:960:4: ( (lv_statementType_15_0= 'System.out.println' ) )
                    // InternalMiniJava.g:961:5: (lv_statementType_15_0= 'System.out.println' )
                    {
                    // InternalMiniJava.g:961:5: (lv_statementType_15_0= 'System.out.println' )
                    // InternalMiniJava.g:962:6: lv_statementType_15_0= 'System.out.println'
                    {
                    lv_statementType_15_0=(Token)match(input,32,FOLLOW_11); 

                    						newLeafNode(lv_statementType_15_0, grammarAccess.getStatementAccess().getStatementTypeSystemOutPrintlnKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_15_0, "System.out.println");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMiniJava.g:978:4: ( (lv_firstExpression_17_0= ruleExpression ) )
                    // InternalMiniJava.g:979:5: (lv_firstExpression_17_0= ruleExpression )
                    {
                    // InternalMiniJava.g:979:5: (lv_firstExpression_17_0= ruleExpression )
                    // InternalMiniJava.g:980:6: lv_firstExpression_17_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_firstExpression_17_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_17_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_3());
                    			
                    otherlv_19=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getSemicolonKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1007:3: ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' )
                    {
                    // InternalMiniJava.g:1007:3: ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' )
                    // InternalMiniJava.g:1008:4: ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';'
                    {
                    // InternalMiniJava.g:1008:4: ( (otherlv_20= RULE_ID ) )
                    // InternalMiniJava.g:1009:5: (otherlv_20= RULE_ID )
                    {
                    // InternalMiniJava.g:1009:5: (otherlv_20= RULE_ID )
                    // InternalMiniJava.g:1010:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getVariableVariableCrossReference_4_0_0());
                    					

                    }


                    }

                    // InternalMiniJava.g:1021:4: ( (lv_statementType_21_0= '=' ) )
                    // InternalMiniJava.g:1022:5: (lv_statementType_21_0= '=' )
                    {
                    // InternalMiniJava.g:1022:5: (lv_statementType_21_0= '=' )
                    // InternalMiniJava.g:1023:6: lv_statementType_21_0= '='
                    {
                    lv_statementType_21_0=(Token)match(input,33,FOLLOW_26); 

                    						newLeafNode(lv_statementType_21_0, grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_21_0, "=");
                    					

                    }


                    }

                    // InternalMiniJava.g:1035:4: ( (lv_firstExpression_22_0= ruleExpression ) )
                    // InternalMiniJava.g:1036:5: (lv_firstExpression_22_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1036:5: (lv_firstExpression_22_0= ruleExpression )
                    // InternalMiniJava.g:1037:6: lv_firstExpression_22_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_firstExpression_22_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_22_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getStatementAccess().getSemicolonKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1060:3: ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' )
                    {
                    // InternalMiniJava.g:1060:3: ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' )
                    // InternalMiniJava.g:1061:4: ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';'
                    {
                    // InternalMiniJava.g:1061:4: ( (otherlv_24= RULE_ID ) )
                    // InternalMiniJava.g:1062:5: (otherlv_24= RULE_ID )
                    {
                    // InternalMiniJava.g:1062:5: (otherlv_24= RULE_ID )
                    // InternalMiniJava.g:1063:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getVariableVariableCrossReference_5_0_0());
                    					

                    }


                    }

                    // InternalMiniJava.g:1074:4: ( (lv_isArrayElementAssignment_25_0= '[' ) )
                    // InternalMiniJava.g:1075:5: (lv_isArrayElementAssignment_25_0= '[' )
                    {
                    // InternalMiniJava.g:1075:5: (lv_isArrayElementAssignment_25_0= '[' )
                    // InternalMiniJava.g:1076:6: lv_isArrayElementAssignment_25_0= '['
                    {
                    lv_isArrayElementAssignment_25_0=(Token)match(input,20,FOLLOW_26); 

                    						newLeafNode(lv_isArrayElementAssignment_25_0, grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "isArrayElementAssignment", true, "[");
                    					

                    }


                    }

                    // InternalMiniJava.g:1088:4: ( (lv_firstExpression_26_0= ruleExpression ) )
                    // InternalMiniJava.g:1089:5: (lv_firstExpression_26_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1089:5: (lv_firstExpression_26_0= ruleExpression )
                    // InternalMiniJava.g:1090:6: lv_firstExpression_26_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_firstExpression_26_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"firstExpression",
                    							lv_firstExpression_26_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,21,FOLLOW_29); 

                    				newLeafNode(otherlv_27, grammarAccess.getStatementAccess().getRightSquareBracketKeyword_5_3());
                    			
                    // InternalMiniJava.g:1111:4: ( (lv_statementType_28_0= '=' ) )
                    // InternalMiniJava.g:1112:5: (lv_statementType_28_0= '=' )
                    {
                    // InternalMiniJava.g:1112:5: (lv_statementType_28_0= '=' )
                    // InternalMiniJava.g:1113:6: lv_statementType_28_0= '='
                    {
                    lv_statementType_28_0=(Token)match(input,33,FOLLOW_26); 

                    						newLeafNode(lv_statementType_28_0, grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_5_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_28_0, "=");
                    					

                    }


                    }

                    // InternalMiniJava.g:1125:4: ( (lv_secondExpression_29_0= ruleExpression ) )
                    // InternalMiniJava.g:1126:5: (lv_secondExpression_29_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1126:5: (lv_secondExpression_29_0= ruleExpression )
                    // InternalMiniJava.g:1127:6: lv_secondExpression_29_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getSecondExpressionExpressionParserRuleCall_5_5_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_secondExpression_29_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"secondExpression",
                    							lv_secondExpression_29_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_30=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_30, grammarAccess.getStatementAccess().getSemicolonKeyword_5_6());
                    			

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:1153:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniJava.g:1153:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniJava.g:1154:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniJava.g:1160:1: ruleExpression returns [EObject current=null] : (this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1166:2: ( (this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // InternalMiniJava.g:1167:2: (this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // InternalMiniJava.g:1167:2: (this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // InternalMiniJava.g:1168:3: this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Addition_0=ruleAddition();

            state._fsp--;


            			current = this_Addition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1176:3: ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniJava.g:1177:4: () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // InternalMiniJava.g:1177:4: ()
                    // InternalMiniJava.g:1178:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMiniJava.g:1184:4: ( (lv_expressionType_2_0= '<' ) )
                    // InternalMiniJava.g:1185:5: (lv_expressionType_2_0= '<' )
                    {
                    // InternalMiniJava.g:1185:5: (lv_expressionType_2_0= '<' )
                    // InternalMiniJava.g:1186:6: lv_expressionType_2_0= '<'
                    {
                    lv_expressionType_2_0=(Token)match(input,34,FOLLOW_26); 

                    						newLeafNode(lv_expressionType_2_0, grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, "<");
                    					

                    }


                    }

                    // InternalMiniJava.g:1198:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalMiniJava.g:1199:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1199:5: (lv_right_3_0= ruleExpression )
                    // InternalMiniJava.g:1200:6: lv_right_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"demidov.projects.MiniJava.Expression");
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalMiniJava.g:1222:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalMiniJava.g:1222:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalMiniJava.g:1223:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMiniJava.g:1229:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_1=null;
        Token lv_expressionType_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1235:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalMiniJava.g:1236:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalMiniJava.g:1236:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalMiniJava.g:1237:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1245:3: ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=35 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMiniJava.g:1246:4: () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalMiniJava.g:1246:4: ()
            	    // InternalMiniJava.g:1247:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMiniJava.g:1253:4: ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) )
            	    // InternalMiniJava.g:1254:5: ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) )
            	    {
            	    // InternalMiniJava.g:1254:5: ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) )
            	    // InternalMiniJava.g:1255:6: (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' )
            	    {
            	    // InternalMiniJava.g:1255:6: (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==35) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==36) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalMiniJava.g:1256:7: lv_expressionType_2_1= '+'
            	            {
            	            lv_expressionType_2_1=(Token)match(input,35,FOLLOW_26); 

            	            							newLeafNode(lv_expressionType_2_1, grammarAccess.getAdditionAccess().getExpressionTypePlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "expressionType", lv_expressionType_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava.g:1267:7: lv_expressionType_2_2= '-'
            	            {
            	            lv_expressionType_2_2=(Token)match(input,36,FOLLOW_26); 

            	            							newLeafNode(lv_expressionType_2_2, grammarAccess.getAdditionAccess().getExpressionTypeHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "expressionType", lv_expressionType_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMiniJava.g:1280:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalMiniJava.g:1281:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalMiniJava.g:1281:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalMiniJava.g:1282:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"demidov.projects.MiniJava.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMiniJava.g:1304:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalMiniJava.g:1304:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalMiniJava.g:1305:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMiniJava.g:1311:1: ruleMultiplication returns [EObject current=null] : (this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_1=null;
        Token lv_expressionType_2_2=null;
        EObject this_NegationOrPointExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1317:2: ( (this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* ) )
            // InternalMiniJava.g:1318:2: (this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* )
            {
            // InternalMiniJava.g:1318:2: (this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* )
            // InternalMiniJava.g:1319:3: this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_NegationOrPointExpression_0=ruleNegationOrPointExpression();

            state._fsp--;


            			current = this_NegationOrPointExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1327:3: ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=37 && LA17_0<=38)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiniJava.g:1328:4: () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) )
            	    {
            	    // InternalMiniJava.g:1328:4: ()
            	    // InternalMiniJava.g:1329:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMiniJava.g:1335:4: ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) )
            	    // InternalMiniJava.g:1336:5: ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) )
            	    {
            	    // InternalMiniJava.g:1336:5: ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) )
            	    // InternalMiniJava.g:1337:6: (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' )
            	    {
            	    // InternalMiniJava.g:1337:6: (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==37) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==38) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalMiniJava.g:1338:7: lv_expressionType_2_1= '*'
            	            {
            	            lv_expressionType_2_1=(Token)match(input,37,FOLLOW_26); 

            	            							newLeafNode(lv_expressionType_2_1, grammarAccess.getMultiplicationAccess().getExpressionTypeAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "expressionType", lv_expressionType_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava.g:1349:7: lv_expressionType_2_2= '&&'
            	            {
            	            lv_expressionType_2_2=(Token)match(input,38,FOLLOW_26); 

            	            							newLeafNode(lv_expressionType_2_2, grammarAccess.getMultiplicationAccess().getExpressionTypeAmpersandAmpersandKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "expressionType", lv_expressionType_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMiniJava.g:1362:4: ( (lv_right_3_0= ruleNegationOrPointExpression ) )
            	    // InternalMiniJava.g:1363:5: (lv_right_3_0= ruleNegationOrPointExpression )
            	    {
            	    // InternalMiniJava.g:1363:5: (lv_right_3_0= ruleNegationOrPointExpression )
            	    // InternalMiniJava.g:1364:6: lv_right_3_0= ruleNegationOrPointExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNegationOrPointExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleNegationOrPointExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"demidov.projects.MiniJava.NegationOrPointExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNegationOrPointExpression"
    // InternalMiniJava.g:1386:1: entryRuleNegationOrPointExpression returns [EObject current=null] : iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF ;
    public final EObject entryRuleNegationOrPointExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationOrPointExpression = null;


        try {
            // InternalMiniJava.g:1386:66: (iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF )
            // InternalMiniJava.g:1387:2: iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF
            {
             newCompositeNode(grammarAccess.getNegationOrPointExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegationOrPointExpression=ruleNegationOrPointExpression();

            state._fsp--;

             current =iv_ruleNegationOrPointExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegationOrPointExpression"


    // $ANTLR start "ruleNegationOrPointExpression"
    // InternalMiniJava.g:1393:1: ruleNegationOrPointExpression returns [EObject current=null] : (this_Negation_0= ruleNegation | this_Point_1= rulePoint ) ;
    public final EObject ruleNegationOrPointExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_Point_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1399:2: ( (this_Negation_0= ruleNegation | this_Point_1= rulePoint ) )
            // InternalMiniJava.g:1400:2: (this_Negation_0= ruleNegation | this_Point_1= rulePoint )
            {
            // InternalMiniJava.g:1400:2: (this_Negation_0= ruleNegation | this_Point_1= rulePoint )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||LA18_0==18||(LA18_0>=41 && LA18_0<=44)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:1401:3: this_Negation_0= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getNegationOrPointExpressionAccess().getNegationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_0=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1410:3: this_Point_1= rulePoint
                    {

                    			newCompositeNode(grammarAccess.getNegationOrPointExpressionAccess().getPointParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Point_1=rulePoint();

                    state._fsp--;


                    			current = this_Point_1;
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
    // $ANTLR end "ruleNegationOrPointExpression"


    // $ANTLR start "entryRuleNegation"
    // InternalMiniJava.g:1422:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalMiniJava.g:1422:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalMiniJava.g:1423:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMiniJava.g:1429:1: ruleNegation returns [EObject current=null] : ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1435:2: ( ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) ) )
            // InternalMiniJava.g:1436:2: ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) )
            {
            // InternalMiniJava.g:1436:2: ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) )
            // InternalMiniJava.g:1437:3: ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) )
            {
            // InternalMiniJava.g:1437:3: ( (lv_expressionType_0_0= '!' ) )
            // InternalMiniJava.g:1438:4: (lv_expressionType_0_0= '!' )
            {
            // InternalMiniJava.g:1438:4: (lv_expressionType_0_0= '!' )
            // InternalMiniJava.g:1439:5: lv_expressionType_0_0= '!'
            {
            lv_expressionType_0_0=(Token)match(input,39,FOLLOW_26); 

            					newLeafNode(lv_expressionType_0_0, grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNegationRule());
            					}
            					setWithLastConsumed(current, "expressionType", lv_expressionType_0_0, "!");
            				

            }


            }

            // InternalMiniJava.g:1451:3: ( (lv_right_1_0= rulePoint ) )
            // InternalMiniJava.g:1452:4: (lv_right_1_0= rulePoint )
            {
            // InternalMiniJava.g:1452:4: (lv_right_1_0= rulePoint )
            // InternalMiniJava.g:1453:5: lv_right_1_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getRightPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_1_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"demidov.projects.MiniJava.Point");
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRulePoint"
    // InternalMiniJava.g:1474:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalMiniJava.g:1474:46: (iv_rulePoint= rulePoint EOF )
            // InternalMiniJava.g:1475:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalMiniJava.g:1481:1: rulePoint returns [EObject current=null] : (this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )* ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        EObject this_SquareBrackets_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1487:2: ( (this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )* ) )
            // InternalMiniJava.g:1488:2: (this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )* )
            {
            // InternalMiniJava.g:1488:2: (this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )* )
            // InternalMiniJava.g:1489:3: this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getPointAccess().getSquareBracketsParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_SquareBrackets_0=ruleSquareBrackets();

            state._fsp--;


            			current = this_SquareBrackets_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1497:3: ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniJava.g:1498:4: () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleMethodCallExpr ) )
            	    {
            	    // InternalMiniJava.g:1498:4: ()
            	    // InternalMiniJava.g:1499:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPointAccess().getPointLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMiniJava.g:1505:4: ( (lv_expressionType_2_0= '.' ) )
            	    // InternalMiniJava.g:1506:5: (lv_expressionType_2_0= '.' )
            	    {
            	    // InternalMiniJava.g:1506:5: (lv_expressionType_2_0= '.' )
            	    // InternalMiniJava.g:1507:6: lv_expressionType_2_0= '.'
            	    {
            	    lv_expressionType_2_0=(Token)match(input,40,FOLLOW_34); 

            	    						newLeafNode(lv_expressionType_2_0, grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPointRule());
            	    						}
            	    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, ".");
            	    					

            	    }


            	    }

            	    // InternalMiniJava.g:1519:4: ( (lv_right_3_0= ruleMethodCallExpr ) )
            	    // InternalMiniJava.g:1520:5: (lv_right_3_0= ruleMethodCallExpr )
            	    {
            	    // InternalMiniJava.g:1520:5: (lv_right_3_0= ruleMethodCallExpr )
            	    // InternalMiniJava.g:1521:6: lv_right_3_0= ruleMethodCallExpr
            	    {

            	    						newCompositeNode(grammarAccess.getPointAccess().getRightMethodCallExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleMethodCallExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPointRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"demidov.projects.MiniJava.MethodCallExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleSquareBrackets"
    // InternalMiniJava.g:1543:1: entryRuleSquareBrackets returns [EObject current=null] : iv_ruleSquareBrackets= ruleSquareBrackets EOF ;
    public final EObject entryRuleSquareBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBrackets = null;


        try {
            // InternalMiniJava.g:1543:55: (iv_ruleSquareBrackets= ruleSquareBrackets EOF )
            // InternalMiniJava.g:1544:2: iv_ruleSquareBrackets= ruleSquareBrackets EOF
            {
             newCompositeNode(grammarAccess.getSquareBracketsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquareBrackets=ruleSquareBrackets();

            state._fsp--;

             current =iv_ruleSquareBrackets; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSquareBrackets"


    // $ANTLR start "ruleSquareBrackets"
    // InternalMiniJava.g:1550:1: ruleSquareBrackets returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleSquareBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1556:2: ( (this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? ) )
            // InternalMiniJava.g:1557:2: (this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? )
            {
            // InternalMiniJava.g:1557:2: (this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? )
            // InternalMiniJava.g:1558:3: this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )?
            {

            			newCompositeNode(grammarAccess.getSquareBracketsAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1566:3: ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMiniJava.g:1567:4: () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']'
                    {
                    // InternalMiniJava.g:1567:4: ()
                    // InternalMiniJava.g:1568:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMiniJava.g:1574:4: ( (lv_expressionType_2_0= '[' ) )
                    // InternalMiniJava.g:1575:5: (lv_expressionType_2_0= '[' )
                    {
                    // InternalMiniJava.g:1575:5: (lv_expressionType_2_0= '[' )
                    // InternalMiniJava.g:1576:6: lv_expressionType_2_0= '['
                    {
                    lv_expressionType_2_0=(Token)match(input,20,FOLLOW_26); 

                    						newLeafNode(lv_expressionType_2_0, grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSquareBracketsRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, "[");
                    					

                    }


                    }

                    // InternalMiniJava.g:1588:4: ( (lv_right_3_0= rulePrimary ) )
                    // InternalMiniJava.g:1589:5: (lv_right_3_0= rulePrimary )
                    {
                    // InternalMiniJava.g:1589:5: (lv_right_3_0= rulePrimary )
                    // InternalMiniJava.g:1590:6: lv_right_3_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getSquareBracketsAccess().getRightPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_right_3_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSquareBracketsRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"demidov.projects.MiniJava.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSquareBracketsAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleSquareBrackets"


    // $ANTLR start "entryRulePrimary"
    // InternalMiniJava.g:1616:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMiniJava.g:1616:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMiniJava.g:1617:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMiniJava.g:1623:1: rulePrimary returns [EObject current=null] : ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_0_0=null;
        Token lv_expressionType_1_0=null;
        Token lv_expressionType_2_0=null;
        Token lv_expressionType_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_expressionType_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_expressionType_12_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_expression_6_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_expression_13_0 = null;

        EObject lv_number_16_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1629:2: ( ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) ) )
            // InternalMiniJava.g:1630:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) )
            {
            // InternalMiniJava.g:1630:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) )
            int alt21=8;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalMiniJava.g:1631:3: ( (lv_expressionType_0_0= 'true' ) )
                    {
                    // InternalMiniJava.g:1631:3: ( (lv_expressionType_0_0= 'true' ) )
                    // InternalMiniJava.g:1632:4: (lv_expressionType_0_0= 'true' )
                    {
                    // InternalMiniJava.g:1632:4: (lv_expressionType_0_0= 'true' )
                    // InternalMiniJava.g:1633:5: lv_expressionType_0_0= 'true'
                    {
                    lv_expressionType_0_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_0_0, grammarAccess.getPrimaryAccess().getExpressionTypeTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1646:3: ( (lv_expressionType_1_0= 'false' ) )
                    {
                    // InternalMiniJava.g:1646:3: ( (lv_expressionType_1_0= 'false' ) )
                    // InternalMiniJava.g:1647:4: (lv_expressionType_1_0= 'false' )
                    {
                    // InternalMiniJava.g:1647:4: (lv_expressionType_1_0= 'false' )
                    // InternalMiniJava.g:1648:5: lv_expressionType_1_0= 'false'
                    {
                    lv_expressionType_1_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_1_0, grammarAccess.getPrimaryAccess().getExpressionTypeFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_1_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1661:3: ( (lv_expressionType_2_0= 'this' ) )
                    {
                    // InternalMiniJava.g:1661:3: ( (lv_expressionType_2_0= 'this' ) )
                    // InternalMiniJava.g:1662:4: (lv_expressionType_2_0= 'this' )
                    {
                    // InternalMiniJava.g:1662:4: (lv_expressionType_2_0= 'this' )
                    // InternalMiniJava.g:1663:5: lv_expressionType_2_0= 'this'
                    {
                    lv_expressionType_2_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_2_0, grammarAccess.getPrimaryAccess().getExpressionTypeThisKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, "this");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1676:3: ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' )
                    {
                    // InternalMiniJava.g:1676:3: ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' )
                    // InternalMiniJava.g:1677:4: ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']'
                    {
                    // InternalMiniJava.g:1677:4: ( (lv_expressionType_3_0= 'new' ) )
                    // InternalMiniJava.g:1678:5: (lv_expressionType_3_0= 'new' )
                    {
                    // InternalMiniJava.g:1678:5: (lv_expressionType_3_0= 'new' )
                    // InternalMiniJava.g:1679:6: lv_expressionType_3_0= 'new'
                    {
                    lv_expressionType_3_0=(Token)match(input,44,FOLLOW_36); 

                    						newLeafNode(lv_expressionType_3_0, grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_3_0, "new");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getIntKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_3_2());
                    			
                    // InternalMiniJava.g:1699:4: ( (lv_expression_6_0= ruleExpression ) )
                    // InternalMiniJava.g:1700:5: (lv_expression_6_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1700:5: (lv_expression_6_0= ruleExpression )
                    // InternalMiniJava.g:1701:6: lv_expression_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_expression_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1724:3: ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' )
                    {
                    // InternalMiniJava.g:1724:3: ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' )
                    // InternalMiniJava.g:1725:4: ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')'
                    {
                    // InternalMiniJava.g:1725:4: ( (lv_expressionType_8_0= 'new' ) )
                    // InternalMiniJava.g:1726:5: (lv_expressionType_8_0= 'new' )
                    {
                    // InternalMiniJava.g:1726:5: (lv_expressionType_8_0= 'new' )
                    // InternalMiniJava.g:1727:6: lv_expressionType_8_0= 'new'
                    {
                    lv_expressionType_8_0=(Token)match(input,44,FOLLOW_21); 

                    						newLeafNode(lv_expressionType_8_0, grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_8_0, "new");
                    					

                    }


                    }

                    // InternalMiniJava.g:1739:4: ( (lv_type_9_0= ruleType ) )
                    // InternalMiniJava.g:1740:5: (lv_type_9_0= ruleType )
                    {
                    // InternalMiniJava.g:1740:5: (lv_type_9_0= ruleType )
                    // InternalMiniJava.g:1741:6: lv_type_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"demidov.projects.MiniJava.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1768:3: ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' )
                    {
                    // InternalMiniJava.g:1768:3: ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' )
                    // InternalMiniJava.g:1769:4: ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalMiniJava.g:1769:4: ( (lv_expressionType_12_0= '(' ) )
                    // InternalMiniJava.g:1770:5: (lv_expressionType_12_0= '(' )
                    {
                    // InternalMiniJava.g:1770:5: (lv_expressionType_12_0= '(' )
                    // InternalMiniJava.g:1771:6: lv_expressionType_12_0= '('
                    {
                    lv_expressionType_12_0=(Token)match(input,18,FOLLOW_26); 

                    						newLeafNode(lv_expressionType_12_0, grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_12_0, "(");
                    					

                    }


                    }

                    // InternalMiniJava.g:1783:4: ( (lv_expression_13_0= ruleExpression ) )
                    // InternalMiniJava.g:1784:5: (lv_expression_13_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1784:5: (lv_expression_13_0= ruleExpression )
                    // InternalMiniJava.g:1785:6: lv_expression_13_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_expression_13_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_13_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1808:3: ( (otherlv_15= RULE_ID ) )
                    {
                    // InternalMiniJava.g:1808:3: ( (otherlv_15= RULE_ID ) )
                    // InternalMiniJava.g:1809:4: (otherlv_15= RULE_ID )
                    {
                    // InternalMiniJava.g:1809:4: (otherlv_15= RULE_ID )
                    // InternalMiniJava.g:1810:5: otherlv_15= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    				
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_6_0());
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1822:3: ( (lv_number_16_0= ruleNumberValue ) )
                    {
                    // InternalMiniJava.g:1822:3: ( (lv_number_16_0= ruleNumberValue ) )
                    // InternalMiniJava.g:1823:4: (lv_number_16_0= ruleNumberValue )
                    {
                    // InternalMiniJava.g:1823:4: (lv_number_16_0= ruleNumberValue )
                    // InternalMiniJava.g:1824:5: lv_number_16_0= ruleNumberValue
                    {

                    					newCompositeNode(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_16_0=ruleNumberValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_16_0,
                    						"demidov.projects.MiniJava.NumberValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMethodCallExpr"
    // InternalMiniJava.g:1845:1: entryRuleMethodCallExpr returns [EObject current=null] : iv_ruleMethodCallExpr= ruleMethodCallExpr EOF ;
    public final EObject entryRuleMethodCallExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCallExpr = null;


        try {
            // InternalMiniJava.g:1845:55: (iv_ruleMethodCallExpr= ruleMethodCallExpr EOF )
            // InternalMiniJava.g:1846:2: iv_ruleMethodCallExpr= ruleMethodCallExpr EOF
            {
             newCompositeNode(grammarAccess.getMethodCallExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCallExpr=ruleMethodCallExpr();

            state._fsp--;

             current =iv_ruleMethodCallExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodCallExpr"


    // $ANTLR start "ruleMethodCallExpr"
    // InternalMiniJava.g:1852:1: ruleMethodCallExpr returns [EObject current=null] : ( ( (lv_expressionType_0_0= 'length' ) ) | ( (lv_methodCall_1_0= ruleMethodCall ) ) ) ;
    public final EObject ruleMethodCallExpr() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_0_0=null;
        EObject lv_methodCall_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1858:2: ( ( ( (lv_expressionType_0_0= 'length' ) ) | ( (lv_methodCall_1_0= ruleMethodCall ) ) ) )
            // InternalMiniJava.g:1859:2: ( ( (lv_expressionType_0_0= 'length' ) ) | ( (lv_methodCall_1_0= ruleMethodCall ) ) )
            {
            // InternalMiniJava.g:1859:2: ( ( (lv_expressionType_0_0= 'length' ) ) | ( (lv_methodCall_1_0= ruleMethodCall ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMiniJava.g:1860:3: ( (lv_expressionType_0_0= 'length' ) )
                    {
                    // InternalMiniJava.g:1860:3: ( (lv_expressionType_0_0= 'length' ) )
                    // InternalMiniJava.g:1861:4: (lv_expressionType_0_0= 'length' )
                    {
                    // InternalMiniJava.g:1861:4: (lv_expressionType_0_0= 'length' )
                    // InternalMiniJava.g:1862:5: lv_expressionType_0_0= 'length'
                    {
                    lv_expressionType_0_0=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_0_0, grammarAccess.getMethodCallExprAccess().getExpressionTypeLengthKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodCallExprRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_0_0, "length");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1875:3: ( (lv_methodCall_1_0= ruleMethodCall ) )
                    {
                    // InternalMiniJava.g:1875:3: ( (lv_methodCall_1_0= ruleMethodCall ) )
                    // InternalMiniJava.g:1876:4: (lv_methodCall_1_0= ruleMethodCall )
                    {
                    // InternalMiniJava.g:1876:4: (lv_methodCall_1_0= ruleMethodCall )
                    // InternalMiniJava.g:1877:5: lv_methodCall_1_0= ruleMethodCall
                    {

                    					newCompositeNode(grammarAccess.getMethodCallExprAccess().getMethodCallMethodCallParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_methodCall_1_0=ruleMethodCall();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodCallExprRule());
                    					}
                    					set(
                    						current,
                    						"methodCall",
                    						lv_methodCall_1_0,
                    						"demidov.projects.MiniJava.MethodCall");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleMethodCallExpr"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMiniJava.g:1898:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalMiniJava.g:1898:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalMiniJava.g:1899:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             newCompositeNode(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;

             current =iv_ruleMethodCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMiniJava.g:1905:1: ruleMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1911:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalMiniJava.g:1912:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalMiniJava.g:1912:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalMiniJava.g:1913:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalMiniJava.g:1913:3: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:1914:4: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:1914:4: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:1915:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getMethodMethodCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniJava.g:1930:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||LA24_0==18||LA24_0==39||(LA24_0>=41 && LA24_0<=44)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMiniJava.g:1931:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalMiniJava.g:1931:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalMiniJava.g:1932:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1932:5: (lv_parameters_2_0= ruleExpression )
                    // InternalMiniJava.g:1933:6: lv_parameters_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_parameters_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"demidov.projects.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiniJava.g:1950:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==27) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMiniJava.g:1951:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_26); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMiniJava.g:1955:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalMiniJava.g:1956:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalMiniJava.g:1956:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalMiniJava.g:1957:7: lv_parameters_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_parameters_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"demidov.projects.MiniJava.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleNumberValue"
    // InternalMiniJava.g:1984:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalMiniJava.g:1984:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalMiniJava.g:1985:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalMiniJava.g:1991:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1997:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMiniJava.g:1998:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMiniJava.g:1998:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMiniJava.g:1999:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMiniJava.g:1999:3: (lv_value_0_0= RULE_INT )
            // InternalMiniJava.g:2000:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumberValue"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\3\uffff\1\22\1\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\54\3\uffff\1\31\3\uffff\1\24\1\uffff\1\54\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\uffff\1\5\1\uffff\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\7\14\uffff\1\5\26\uffff\1\1\1\2\1\3\1\4",
            "",
            "",
            "",
            "\1\11\23\uffff\1\10\1\11",
            "",
            "",
            "",
            "\1\11\1\uffff\1\12",
            "",
            "\2\13\14\uffff\1\13\2\uffff\1\11\21\uffff\1\13\1\uffff\4\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1630:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (otherlv_15= RULE_ID ) ) | ( (lv_number_16_0= ruleNumberValue ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001A0001010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003006010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003400010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001B3003010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001B0003010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00001E8000040030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000001A0003010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00001E8000440030L});

}