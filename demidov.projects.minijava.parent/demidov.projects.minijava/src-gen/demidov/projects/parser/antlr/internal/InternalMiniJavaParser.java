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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'}'", "'extends'", "'int'", "'boolean'", "';'", "','", "'return'", "'if'", "'else'", "'while'", "'System.out.println'", "'='", "'<'", "'+'", "'-'", "'*'", "'&&'", "'!'", "'.'", "'true'", "'false'", "'this'", "'new'", "'length'"
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
    // InternalMiniJava.g:128:1: ruleMainClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( (lv_statement_14_0= ruleStatement ) ) otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleMainClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_ID_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_statement_14_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:134:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( (lv_statement_14_0= ruleStatement ) ) otherlv_15= '}' otherlv_16= '}' ) )
            // InternalMiniJava.g:135:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( (lv_statement_14_0= ruleStatement ) ) otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalMiniJava.g:135:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( (lv_statement_14_0= ruleStatement ) ) otherlv_15= '}' otherlv_16= '}' )
            // InternalMiniJava.g:136:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'public' otherlv_4= 'static' otherlv_5= 'void' otherlv_6= 'main' otherlv_7= '(' otherlv_8= 'String' otherlv_9= '[' otherlv_10= ']' this_ID_11= RULE_ID otherlv_12= ')' otherlv_13= '{' ( (lv_statement_14_0= ruleStatement ) ) otherlv_15= '}' otherlv_16= '}'
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMainClassAccess().getPublicKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMainClassAccess().getStaticKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMainClassAccess().getVoidKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getMainClassAccess().getMainKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getMainClassAccess().getLeftParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getMainClassAccess().getStringKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getMainClassAccess().getLeftSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getMainClassAccess().getRightSquareBracketKeyword_10());
            		
            this_ID_11=(Token)match(input,RULE_ID,FOLLOW_14); 

            			newLeafNode(this_ID_11, grammarAccess.getMainClassAccess().getIDTerminalRuleCall_11());
            		
            otherlv_12=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_12, grammarAccess.getMainClassAccess().getRightParenthesisKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_13, grammarAccess.getMainClassAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalMiniJava.g:206:3: ( (lv_statement_14_0= ruleStatement ) )
            // InternalMiniJava.g:207:4: (lv_statement_14_0= ruleStatement )
            {
            // InternalMiniJava.g:207:4: (lv_statement_14_0= ruleStatement )
            // InternalMiniJava.g:208:5: lv_statement_14_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getMainClassAccess().getStatementStatementParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_16);
            lv_statement_14_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainClassRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_14_0,
            						"demidov.projects.MiniJava.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_15, grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getMainClassAccess().getRightCurlyBracketKeyword_16());
            		

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


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalMiniJava.g:237:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalMiniJava.g:237:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalMiniJava.g:238:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalMiniJava.g:244:1: ruleClassDeclaration returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' ) ;
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
            // InternalMiniJava.g:250:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' ) )
            // InternalMiniJava.g:251:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' )
            {
            // InternalMiniJava.g:251:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' )
            // InternalMiniJava.g:252:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )* ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassDeclarationAccess().getClassKeyword_0());
            		
            // InternalMiniJava.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:258:5: lv_name_1_0= RULE_ID
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

            // InternalMiniJava.g:274:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:275:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMiniJava.g:279:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMiniJava.g:280:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMiniJava.g:280:5: (otherlv_3= RULE_ID )
                    // InternalMiniJava.g:281:6: otherlv_3= RULE_ID
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
            		
            // InternalMiniJava.g:297:3: ( (lv_varDeclarations_5_0= ruleVarDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=24 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMiniJava.g:298:4: (lv_varDeclarations_5_0= ruleVarDeclaration )
            	    {
            	    // InternalMiniJava.g:298:4: (lv_varDeclarations_5_0= ruleVarDeclaration )
            	    // InternalMiniJava.g:299:5: lv_varDeclarations_5_0= ruleVarDeclaration
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

            // InternalMiniJava.g:316:3: ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMiniJava.g:317:4: (lv_methodDeclarations_6_0= ruleMethodDeclaration )
            	    {
            	    // InternalMiniJava.g:317:4: (lv_methodDeclarations_6_0= ruleMethodDeclaration )
            	    // InternalMiniJava.g:318:5: lv_methodDeclarations_6_0= ruleMethodDeclaration
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

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMiniJava.g:343:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMiniJava.g:343:45: (iv_ruleType= ruleType EOF )
            // InternalMiniJava.g:344:2: iv_ruleType= ruleType EOF
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
    // InternalMiniJava.g:350:1: ruleType returns [EObject current=null] : ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (otherlv_5= RULE_ID ) ) ) ;
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
            // InternalMiniJava.g:356:2: ( ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMiniJava.g:357:2: ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMiniJava.g:357:2: ( (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_typeName_3_0= 'int' ) ) | ( (lv_typeName_4_0= 'boolean' ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==17) ) {
                    alt5=2;
                }
                else if ( (LA5_1==19) ) {
                    alt5=1;
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
                    // InternalMiniJava.g:358:3: (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' )
                    {
                    // InternalMiniJava.g:358:3: (otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']' )
                    // InternalMiniJava.g:359:4: otherlv_0= 'int' ( (lv_typeName_1_0= '[' ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getIntKeyword_0_0());
                    			
                    // InternalMiniJava.g:363:4: ( (lv_typeName_1_0= '[' ) )
                    // InternalMiniJava.g:364:5: (lv_typeName_1_0= '[' )
                    {
                    // InternalMiniJava.g:364:5: (lv_typeName_1_0= '[' )
                    // InternalMiniJava.g:365:6: lv_typeName_1_0= '['
                    {
                    lv_typeName_1_0=(Token)match(input,19,FOLLOW_13); 

                    						newLeafNode(lv_typeName_1_0, grammarAccess.getTypeAccess().getTypeNameLeftSquareBracketKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "typeName", lv_typeName_1_0, "[");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:383:3: ( (lv_typeName_3_0= 'int' ) )
                    {
                    // InternalMiniJava.g:383:3: ( (lv_typeName_3_0= 'int' ) )
                    // InternalMiniJava.g:384:4: (lv_typeName_3_0= 'int' )
                    {
                    // InternalMiniJava.g:384:4: (lv_typeName_3_0= 'int' )
                    // InternalMiniJava.g:385:5: lv_typeName_3_0= 'int'
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
                    // InternalMiniJava.g:398:3: ( (lv_typeName_4_0= 'boolean' ) )
                    {
                    // InternalMiniJava.g:398:3: ( (lv_typeName_4_0= 'boolean' ) )
                    // InternalMiniJava.g:399:4: (lv_typeName_4_0= 'boolean' )
                    {
                    // InternalMiniJava.g:399:4: (lv_typeName_4_0= 'boolean' )
                    // InternalMiniJava.g:400:5: lv_typeName_4_0= 'boolean'
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
                    // InternalMiniJava.g:413:3: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalMiniJava.g:413:3: ( (otherlv_5= RULE_ID ) )
                    // InternalMiniJava.g:414:4: (otherlv_5= RULE_ID )
                    {
                    // InternalMiniJava.g:414:4: (otherlv_5= RULE_ID )
                    // InternalMiniJava.g:415:5: otherlv_5= RULE_ID
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
    // InternalMiniJava.g:430:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalMiniJava.g:430:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalMiniJava.g:431:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalMiniJava.g:437:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:443:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' ) )
            // InternalMiniJava.g:444:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' )
            {
            // InternalMiniJava.g:444:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';' )
            // InternalMiniJava.g:445:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ';'
            {
            // InternalMiniJava.g:445:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalMiniJava.g:446:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalMiniJava.g:446:4: (lv_variable_0_0= ruleVariable )
            // InternalMiniJava.g:447:5: lv_variable_0_0= ruleVariable
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
    // InternalMiniJava.g:472:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMiniJava.g:472:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMiniJava.g:473:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMiniJava.g:479:1: ruleVariable returns [EObject current=null] : ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_variableType_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:485:2: ( ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava.g:486:2: ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava.g:486:2: ( ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava.g:487:3: ( (lv_variableType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava.g:487:3: ( (lv_variableType_0_0= ruleType ) )
            // InternalMiniJava.g:488:4: (lv_variableType_0_0= ruleType )
            {
            // InternalMiniJava.g:488:4: (lv_variableType_0_0= ruleType )
            // InternalMiniJava.g:489:5: lv_variableType_0_0= ruleType
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

            // InternalMiniJava.g:506:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:507:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:507:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:508:5: lv_name_1_0= RULE_ID
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
    // InternalMiniJava.g:528:1: entryRuleMethodDeclaration returns [EObject current=null] : iv_ruleMethodDeclaration= ruleMethodDeclaration EOF ;
    public final EObject entryRuleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDeclaration = null;


        try {
            // InternalMiniJava.g:528:58: (iv_ruleMethodDeclaration= ruleMethodDeclaration EOF )
            // InternalMiniJava.g:529:2: iv_ruleMethodDeclaration= ruleMethodDeclaration EOF
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
    // InternalMiniJava.g:535:1: ruleMethodDeclaration returns [EObject current=null] : (otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' otherlv_14= '}' ) ;
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
            // InternalMiniJava.g:541:2: ( (otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' otherlv_14= '}' ) )
            // InternalMiniJava.g:542:2: (otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' otherlv_14= '}' )
            {
            // InternalMiniJava.g:542:2: (otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' otherlv_14= '}' )
            // InternalMiniJava.g:543:3: otherlv_0= 'public' ( (lv_methodType_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )* ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= 'return' ( (lv_returnExpression_12_0= ruleExpression ) ) otherlv_13= ';' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodDeclarationAccess().getPublicKeyword_0());
            		
            // InternalMiniJava.g:547:3: ( (lv_methodType_1_0= ruleType ) )
            // InternalMiniJava.g:548:4: (lv_methodType_1_0= ruleType )
            {
            // InternalMiniJava.g:548:4: (lv_methodType_1_0= ruleType )
            // InternalMiniJava.g:549:5: lv_methodType_1_0= ruleType
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

            // InternalMiniJava.g:566:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiniJava.g:567:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiniJava.g:567:4: (lv_name_2_0= RULE_ID )
            // InternalMiniJava.g:568:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMiniJava.g:588:3: ( ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=24 && LA7_0<=25)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:589:4: ( (lv_formalVarDeclarations_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )*
                    {
                    // InternalMiniJava.g:589:4: ( (lv_formalVarDeclarations_4_0= ruleVariable ) )
                    // InternalMiniJava.g:590:5: (lv_formalVarDeclarations_4_0= ruleVariable )
                    {
                    // InternalMiniJava.g:590:5: (lv_formalVarDeclarations_4_0= ruleVariable )
                    // InternalMiniJava.g:591:6: lv_formalVarDeclarations_4_0= ruleVariable
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

                    // InternalMiniJava.g:608:4: (otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMiniJava.g:609:5: otherlv_5= ',' ( (lv_formalVarDeclarations_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_21); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMethodDeclarationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalMiniJava.g:613:5: ( (lv_formalVarDeclarations_6_0= ruleVariable ) )
                    	    // InternalMiniJava.g:614:6: (lv_formalVarDeclarations_6_0= ruleVariable )
                    	    {
                    	    // InternalMiniJava.g:614:6: (lv_formalVarDeclarations_6_0= ruleVariable )
                    	    // InternalMiniJava.g:615:7: lv_formalVarDeclarations_6_0= ruleVariable
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

            otherlv_7=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodDeclarationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMiniJava.g:642:3: ( (lv_localVarDeclarations_9_0= ruleVarDeclaration ) )*
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
            	    // InternalMiniJava.g:643:4: (lv_localVarDeclarations_9_0= ruleVarDeclaration )
            	    {
            	    // InternalMiniJava.g:643:4: (lv_localVarDeclarations_9_0= ruleVarDeclaration )
            	    // InternalMiniJava.g:644:5: lv_localVarDeclarations_9_0= ruleVarDeclaration
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

            // InternalMiniJava.g:661:3: ( (lv_statements_10_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==12||LA9_0==29||(LA9_0>=31 && LA9_0<=32)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMiniJava.g:662:4: (lv_statements_10_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:662:4: (lv_statements_10_0= ruleStatement )
            	    // InternalMiniJava.g:663:5: lv_statements_10_0= ruleStatement
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

            otherlv_11=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getMethodDeclarationAccess().getReturnKeyword_9());
            		
            // InternalMiniJava.g:684:3: ( (lv_returnExpression_12_0= ruleExpression ) )
            // InternalMiniJava.g:685:4: (lv_returnExpression_12_0= ruleExpression )
            {
            // InternalMiniJava.g:685:4: (lv_returnExpression_12_0= ruleExpression )
            // InternalMiniJava.g:686:5: lv_returnExpression_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getReturnExpressionExpressionParserRuleCall_10_0());
            				
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

            otherlv_13=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_13, grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_11());
            		
            otherlv_14=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMethodDeclarationAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalMiniJava.g:715:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMiniJava.g:715:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMiniJava.g:716:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMiniJava.g:722:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' ) ) ;
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
            // InternalMiniJava.g:728:2: ( ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' ) ) )
            // InternalMiniJava.g:729:2: ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' ) )
            {
            // InternalMiniJava.g:729:2: ( ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) | ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) ) | ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) ) | ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' ) | ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case RULE_ID:
                {
                int LA11_5 = input.LA(2);

                if ( (LA11_5==19) ) {
                    alt11=6;
                }
                else if ( (LA11_5==33) ) {
                    alt11=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMiniJava.g:730:3: ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
                    {
                    // InternalMiniJava.g:730:3: ( ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
                    // InternalMiniJava.g:731:4: ( (lv_statementType_0_0= '{' ) ) ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
                    {
                    // InternalMiniJava.g:731:4: ( (lv_statementType_0_0= '{' ) )
                    // InternalMiniJava.g:732:5: (lv_statementType_0_0= '{' )
                    {
                    // InternalMiniJava.g:732:5: (lv_statementType_0_0= '{' )
                    // InternalMiniJava.g:733:6: lv_statementType_0_0= '{'
                    {
                    lv_statementType_0_0=(Token)match(input,12,FOLLOW_27); 

                    						newLeafNode(lv_statementType_0_0, grammarAccess.getStatementAccess().getStatementTypeLeftCurlyBracketKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_0_0, "{");
                    					

                    }


                    }

                    // InternalMiniJava.g:745:4: ( (lv_statements_1_0= ruleStatement ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==12||LA10_0==29||(LA10_0>=31 && LA10_0<=32)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMiniJava.g:746:5: (lv_statements_1_0= ruleStatement )
                    	    {
                    	    // InternalMiniJava.g:746:5: (lv_statements_1_0= ruleStatement )
                    	    // InternalMiniJava.g:747:6: lv_statements_1_0= ruleStatement
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
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:770:3: ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) )
                    {
                    // InternalMiniJava.g:770:3: ( ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) ) )
                    // InternalMiniJava.g:771:4: ( (lv_statementType_3_0= 'if' ) ) otherlv_4= '(' ( (lv_firstExpression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) ) otherlv_8= 'else' ( (lv_statements_9_0= ruleStatement ) )
                    {
                    // InternalMiniJava.g:771:4: ( (lv_statementType_3_0= 'if' ) )
                    // InternalMiniJava.g:772:5: (lv_statementType_3_0= 'if' )
                    {
                    // InternalMiniJava.g:772:5: (lv_statementType_3_0= 'if' )
                    // InternalMiniJava.g:773:6: lv_statementType_3_0= 'if'
                    {
                    lv_statementType_3_0=(Token)match(input,29,FOLLOW_10); 

                    						newLeafNode(lv_statementType_3_0, grammarAccess.getStatementAccess().getStatementTypeIfKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_3_0, "if");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMiniJava.g:789:4: ( (lv_firstExpression_5_0= ruleExpression ) )
                    // InternalMiniJava.g:790:5: (lv_firstExpression_5_0= ruleExpression )
                    {
                    // InternalMiniJava.g:790:5: (lv_firstExpression_5_0= ruleExpression )
                    // InternalMiniJava.g:791:6: lv_firstExpression_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_6=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalMiniJava.g:812:4: ( (lv_statements_7_0= ruleStatement ) )
                    // InternalMiniJava.g:813:5: (lv_statements_7_0= ruleStatement )
                    {
                    // InternalMiniJava.g:813:5: (lv_statements_7_0= ruleStatement )
                    // InternalMiniJava.g:814:6: lv_statements_7_0= ruleStatement
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

                    otherlv_8=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getElseKeyword_1_5());
                    			
                    // InternalMiniJava.g:835:4: ( (lv_statements_9_0= ruleStatement ) )
                    // InternalMiniJava.g:836:5: (lv_statements_9_0= ruleStatement )
                    {
                    // InternalMiniJava.g:836:5: (lv_statements_9_0= ruleStatement )
                    // InternalMiniJava.g:837:6: lv_statements_9_0= ruleStatement
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
                    // InternalMiniJava.g:856:3: ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) )
                    {
                    // InternalMiniJava.g:856:3: ( ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) ) )
                    // InternalMiniJava.g:857:4: ( (lv_statementType_10_0= 'while' ) ) otherlv_11= '(' ( (lv_firstExpression_12_0= ruleExpression ) ) otherlv_13= ')' ( (lv_statements_14_0= ruleStatement ) )
                    {
                    // InternalMiniJava.g:857:4: ( (lv_statementType_10_0= 'while' ) )
                    // InternalMiniJava.g:858:5: (lv_statementType_10_0= 'while' )
                    {
                    // InternalMiniJava.g:858:5: (lv_statementType_10_0= 'while' )
                    // InternalMiniJava.g:859:6: lv_statementType_10_0= 'while'
                    {
                    lv_statementType_10_0=(Token)match(input,31,FOLLOW_10); 

                    						newLeafNode(lv_statementType_10_0, grammarAccess.getStatementAccess().getStatementTypeWhileKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_10_0, "while");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMiniJava.g:875:4: ( (lv_firstExpression_12_0= ruleExpression ) )
                    // InternalMiniJava.g:876:5: (lv_firstExpression_12_0= ruleExpression )
                    {
                    // InternalMiniJava.g:876:5: (lv_firstExpression_12_0= ruleExpression )
                    // InternalMiniJava.g:877:6: lv_firstExpression_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_13=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getRightParenthesisKeyword_2_3());
                    			
                    // InternalMiniJava.g:898:4: ( (lv_statements_14_0= ruleStatement ) )
                    // InternalMiniJava.g:899:5: (lv_statements_14_0= ruleStatement )
                    {
                    // InternalMiniJava.g:899:5: (lv_statements_14_0= ruleStatement )
                    // InternalMiniJava.g:900:6: lv_statements_14_0= ruleStatement
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
                    // InternalMiniJava.g:919:3: ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' )
                    {
                    // InternalMiniJava.g:919:3: ( ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';' )
                    // InternalMiniJava.g:920:4: ( (lv_statementType_15_0= 'System.out.println' ) ) otherlv_16= '(' ( (lv_firstExpression_17_0= ruleExpression ) ) otherlv_18= ')' otherlv_19= ';'
                    {
                    // InternalMiniJava.g:920:4: ( (lv_statementType_15_0= 'System.out.println' ) )
                    // InternalMiniJava.g:921:5: (lv_statementType_15_0= 'System.out.println' )
                    {
                    // InternalMiniJava.g:921:5: (lv_statementType_15_0= 'System.out.println' )
                    // InternalMiniJava.g:922:6: lv_statementType_15_0= 'System.out.println'
                    {
                    lv_statementType_15_0=(Token)match(input,32,FOLLOW_10); 

                    						newLeafNode(lv_statementType_15_0, grammarAccess.getStatementAccess().getStatementTypeSystemOutPrintlnKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_15_0, "System.out.println");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,17,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMiniJava.g:938:4: ( (lv_firstExpression_17_0= ruleExpression ) )
                    // InternalMiniJava.g:939:5: (lv_firstExpression_17_0= ruleExpression )
                    {
                    // InternalMiniJava.g:939:5: (lv_firstExpression_17_0= ruleExpression )
                    // InternalMiniJava.g:940:6: lv_firstExpression_17_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_18=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_3());
                    			
                    otherlv_19=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getSemicolonKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:967:3: ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' )
                    {
                    // InternalMiniJava.g:967:3: ( ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';' )
                    // InternalMiniJava.g:968:4: ( (otherlv_20= RULE_ID ) ) ( (lv_statementType_21_0= '=' ) ) ( (lv_firstExpression_22_0= ruleExpression ) ) otherlv_23= ';'
                    {
                    // InternalMiniJava.g:968:4: ( (otherlv_20= RULE_ID ) )
                    // InternalMiniJava.g:969:5: (otherlv_20= RULE_ID )
                    {
                    // InternalMiniJava.g:969:5: (otherlv_20= RULE_ID )
                    // InternalMiniJava.g:970:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getVariableVariableCrossReference_4_0_0());
                    					

                    }


                    }

                    // InternalMiniJava.g:981:4: ( (lv_statementType_21_0= '=' ) )
                    // InternalMiniJava.g:982:5: (lv_statementType_21_0= '=' )
                    {
                    // InternalMiniJava.g:982:5: (lv_statementType_21_0= '=' )
                    // InternalMiniJava.g:983:6: lv_statementType_21_0= '='
                    {
                    lv_statementType_21_0=(Token)match(input,33,FOLLOW_26); 

                    						newLeafNode(lv_statementType_21_0, grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_21_0, "=");
                    					

                    }


                    }

                    // InternalMiniJava.g:995:4: ( (lv_firstExpression_22_0= ruleExpression ) )
                    // InternalMiniJava.g:996:5: (lv_firstExpression_22_0= ruleExpression )
                    {
                    // InternalMiniJava.g:996:5: (lv_firstExpression_22_0= ruleExpression )
                    // InternalMiniJava.g:997:6: lv_firstExpression_22_0= ruleExpression
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
                    // InternalMiniJava.g:1020:3: ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' )
                    {
                    // InternalMiniJava.g:1020:3: ( ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';' )
                    // InternalMiniJava.g:1021:4: ( (otherlv_24= RULE_ID ) ) ( (lv_isArrayElementAssignment_25_0= '[' ) ) ( (lv_firstExpression_26_0= ruleExpression ) ) otherlv_27= ']' ( (lv_statementType_28_0= '=' ) ) ( (lv_secondExpression_29_0= ruleExpression ) ) otherlv_30= ';'
                    {
                    // InternalMiniJava.g:1021:4: ( (otherlv_24= RULE_ID ) )
                    // InternalMiniJava.g:1022:5: (otherlv_24= RULE_ID )
                    {
                    // InternalMiniJava.g:1022:5: (otherlv_24= RULE_ID )
                    // InternalMiniJava.g:1023:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getVariableVariableCrossReference_5_0_0());
                    					

                    }


                    }

                    // InternalMiniJava.g:1034:4: ( (lv_isArrayElementAssignment_25_0= '[' ) )
                    // InternalMiniJava.g:1035:5: (lv_isArrayElementAssignment_25_0= '[' )
                    {
                    // InternalMiniJava.g:1035:5: (lv_isArrayElementAssignment_25_0= '[' )
                    // InternalMiniJava.g:1036:6: lv_isArrayElementAssignment_25_0= '['
                    {
                    lv_isArrayElementAssignment_25_0=(Token)match(input,19,FOLLOW_26); 

                    						newLeafNode(lv_isArrayElementAssignment_25_0, grammarAccess.getStatementAccess().getIsArrayElementAssignmentLeftSquareBracketKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "isArrayElementAssignment", true, "[");
                    					

                    }


                    }

                    // InternalMiniJava.g:1048:4: ( (lv_firstExpression_26_0= ruleExpression ) )
                    // InternalMiniJava.g:1049:5: (lv_firstExpression_26_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1049:5: (lv_firstExpression_26_0= ruleExpression )
                    // InternalMiniJava.g:1050:6: lv_firstExpression_26_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getFirstExpressionExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    otherlv_27=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_27, grammarAccess.getStatementAccess().getRightSquareBracketKeyword_5_3());
                    			
                    // InternalMiniJava.g:1071:4: ( (lv_statementType_28_0= '=' ) )
                    // InternalMiniJava.g:1072:5: (lv_statementType_28_0= '=' )
                    {
                    // InternalMiniJava.g:1072:5: (lv_statementType_28_0= '=' )
                    // InternalMiniJava.g:1073:6: lv_statementType_28_0= '='
                    {
                    lv_statementType_28_0=(Token)match(input,33,FOLLOW_26); 

                    						newLeafNode(lv_statementType_28_0, grammarAccess.getStatementAccess().getStatementTypeEqualsSignKeyword_5_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "statementType", lv_statementType_28_0, "=");
                    					

                    }


                    }

                    // InternalMiniJava.g:1085:4: ( (lv_secondExpression_29_0= ruleExpression ) )
                    // InternalMiniJava.g:1086:5: (lv_secondExpression_29_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1086:5: (lv_secondExpression_29_0= ruleExpression )
                    // InternalMiniJava.g:1087:6: lv_secondExpression_29_0= ruleExpression
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
    // InternalMiniJava.g:1113:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniJava.g:1113:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniJava.g:1114:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMiniJava.g:1120:1: ruleExpression returns [EObject current=null] : (this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1126:2: ( (this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // InternalMiniJava.g:1127:2: (this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // InternalMiniJava.g:1127:2: (this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // InternalMiniJava.g:1128:3: this_Addition_0= ruleAddition ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Addition_0=ruleAddition();

            state._fsp--;


            			current = this_Addition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1136:3: ( () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:1137:4: () ( (lv_expressionType_2_0= '<' ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // InternalMiniJava.g:1137:4: ()
                    // InternalMiniJava.g:1138:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMiniJava.g:1144:4: ( (lv_expressionType_2_0= '<' ) )
                    // InternalMiniJava.g:1145:5: (lv_expressionType_2_0= '<' )
                    {
                    // InternalMiniJava.g:1145:5: (lv_expressionType_2_0= '<' )
                    // InternalMiniJava.g:1146:6: lv_expressionType_2_0= '<'
                    {
                    lv_expressionType_2_0=(Token)match(input,34,FOLLOW_26); 

                    						newLeafNode(lv_expressionType_2_0, grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, "<");
                    					

                    }


                    }

                    // InternalMiniJava.g:1158:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalMiniJava.g:1159:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1159:5: (lv_right_3_0= ruleExpression )
                    // InternalMiniJava.g:1160:6: lv_right_3_0= ruleExpression
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
    // InternalMiniJava.g:1182:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalMiniJava.g:1182:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalMiniJava.g:1183:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalMiniJava.g:1189:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_1=null;
        Token lv_expressionType_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1195:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalMiniJava.g:1196:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalMiniJava.g:1196:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalMiniJava.g:1197:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1205:3: ( () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMiniJava.g:1206:4: () ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalMiniJava.g:1206:4: ()
            	    // InternalMiniJava.g:1207:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMiniJava.g:1213:4: ( ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) ) )
            	    // InternalMiniJava.g:1214:5: ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) )
            	    {
            	    // InternalMiniJava.g:1214:5: ( (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' ) )
            	    // InternalMiniJava.g:1215:6: (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' )
            	    {
            	    // InternalMiniJava.g:1215:6: (lv_expressionType_2_1= '+' | lv_expressionType_2_2= '-' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==35) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==36) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalMiniJava.g:1216:7: lv_expressionType_2_1= '+'
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
            	            // InternalMiniJava.g:1227:7: lv_expressionType_2_2= '-'
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

            	    // InternalMiniJava.g:1240:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalMiniJava.g:1241:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalMiniJava.g:1241:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalMiniJava.g:1242:6: lv_right_3_0= ruleMultiplication
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
            	    break loop14;
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
    // InternalMiniJava.g:1264:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalMiniJava.g:1264:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalMiniJava.g:1265:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalMiniJava.g:1271:1: ruleMultiplication returns [EObject current=null] : (this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_1=null;
        Token lv_expressionType_2_2=null;
        EObject this_NegationOrPointExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1277:2: ( (this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* ) )
            // InternalMiniJava.g:1278:2: (this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* )
            {
            // InternalMiniJava.g:1278:2: (this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )* )
            // InternalMiniJava.g:1279:3: this_NegationOrPointExpression_0= ruleNegationOrPointExpression ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getNegationOrPointExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_NegationOrPointExpression_0=ruleNegationOrPointExpression();

            state._fsp--;


            			current = this_NegationOrPointExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1287:3: ( () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=37 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMiniJava.g:1288:4: () ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) ) ( (lv_right_3_0= ruleNegationOrPointExpression ) )
            	    {
            	    // InternalMiniJava.g:1288:4: ()
            	    // InternalMiniJava.g:1289:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMiniJava.g:1295:4: ( ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) ) )
            	    // InternalMiniJava.g:1296:5: ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) )
            	    {
            	    // InternalMiniJava.g:1296:5: ( (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' ) )
            	    // InternalMiniJava.g:1297:6: (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' )
            	    {
            	    // InternalMiniJava.g:1297:6: (lv_expressionType_2_1= '*' | lv_expressionType_2_2= '&&' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==37) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==38) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalMiniJava.g:1298:7: lv_expressionType_2_1= '*'
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
            	            // InternalMiniJava.g:1309:7: lv_expressionType_2_2= '&&'
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

            	    // InternalMiniJava.g:1322:4: ( (lv_right_3_0= ruleNegationOrPointExpression ) )
            	    // InternalMiniJava.g:1323:5: (lv_right_3_0= ruleNegationOrPointExpression )
            	    {
            	    // InternalMiniJava.g:1323:5: (lv_right_3_0= ruleNegationOrPointExpression )
            	    // InternalMiniJava.g:1324:6: lv_right_3_0= ruleNegationOrPointExpression
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
            	    break loop16;
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
    // InternalMiniJava.g:1346:1: entryRuleNegationOrPointExpression returns [EObject current=null] : iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF ;
    public final EObject entryRuleNegationOrPointExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationOrPointExpression = null;


        try {
            // InternalMiniJava.g:1346:66: (iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF )
            // InternalMiniJava.g:1347:2: iv_ruleNegationOrPointExpression= ruleNegationOrPointExpression EOF
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
    // InternalMiniJava.g:1353:1: ruleNegationOrPointExpression returns [EObject current=null] : (this_Negation_0= ruleNegation | this_Point_1= rulePoint ) ;
    public final EObject ruleNegationOrPointExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_Point_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1359:2: ( (this_Negation_0= ruleNegation | this_Point_1= rulePoint ) )
            // InternalMiniJava.g:1360:2: (this_Negation_0= ruleNegation | this_Point_1= rulePoint )
            {
            // InternalMiniJava.g:1360:2: (this_Negation_0= ruleNegation | this_Point_1= rulePoint )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==17||(LA17_0>=41 && LA17_0<=45)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:1361:3: this_Negation_0= ruleNegation
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
                    // InternalMiniJava.g:1370:3: this_Point_1= rulePoint
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
    // InternalMiniJava.g:1382:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalMiniJava.g:1382:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalMiniJava.g:1383:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalMiniJava.g:1389:1: ruleNegation returns [EObject current=null] : ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1395:2: ( ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) ) )
            // InternalMiniJava.g:1396:2: ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) )
            {
            // InternalMiniJava.g:1396:2: ( ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) ) )
            // InternalMiniJava.g:1397:3: ( (lv_expressionType_0_0= '!' ) ) ( (lv_right_1_0= rulePoint ) )
            {
            // InternalMiniJava.g:1397:3: ( (lv_expressionType_0_0= '!' ) )
            // InternalMiniJava.g:1398:4: (lv_expressionType_0_0= '!' )
            {
            // InternalMiniJava.g:1398:4: (lv_expressionType_0_0= '!' )
            // InternalMiniJava.g:1399:5: lv_expressionType_0_0= '!'
            {
            lv_expressionType_0_0=(Token)match(input,39,FOLLOW_26); 

            					newLeafNode(lv_expressionType_0_0, grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNegationRule());
            					}
            					setWithLastConsumed(current, "expressionType", lv_expressionType_0_0, "!");
            				

            }


            }

            // InternalMiniJava.g:1411:3: ( (lv_right_1_0= rulePoint ) )
            // InternalMiniJava.g:1412:4: (lv_right_1_0= rulePoint )
            {
            // InternalMiniJava.g:1412:4: (lv_right_1_0= rulePoint )
            // InternalMiniJava.g:1413:5: lv_right_1_0= rulePoint
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
    // InternalMiniJava.g:1434:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalMiniJava.g:1434:46: (iv_rulePoint= rulePoint EOF )
            // InternalMiniJava.g:1435:2: iv_rulePoint= rulePoint EOF
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
    // InternalMiniJava.g:1441:1: rulePoint returns [EObject current=null] : (this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleSquareBrackets ) ) )* ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        EObject this_SquareBrackets_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1447:2: ( (this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleSquareBrackets ) ) )* ) )
            // InternalMiniJava.g:1448:2: (this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleSquareBrackets ) ) )* )
            {
            // InternalMiniJava.g:1448:2: (this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleSquareBrackets ) ) )* )
            // InternalMiniJava.g:1449:3: this_SquareBrackets_0= ruleSquareBrackets ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleSquareBrackets ) ) )*
            {

            			newCompositeNode(grammarAccess.getPointAccess().getSquareBracketsParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_SquareBrackets_0=ruleSquareBrackets();

            state._fsp--;


            			current = this_SquareBrackets_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1457:3: ( () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleSquareBrackets ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMiniJava.g:1458:4: () ( (lv_expressionType_2_0= '.' ) ) ( (lv_right_3_0= ruleSquareBrackets ) )
            	    {
            	    // InternalMiniJava.g:1458:4: ()
            	    // InternalMiniJava.g:1459:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPointAccess().getPointLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMiniJava.g:1465:4: ( (lv_expressionType_2_0= '.' ) )
            	    // InternalMiniJava.g:1466:5: (lv_expressionType_2_0= '.' )
            	    {
            	    // InternalMiniJava.g:1466:5: (lv_expressionType_2_0= '.' )
            	    // InternalMiniJava.g:1467:6: lv_expressionType_2_0= '.'
            	    {
            	    lv_expressionType_2_0=(Token)match(input,40,FOLLOW_26); 

            	    						newLeafNode(lv_expressionType_2_0, grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPointRule());
            	    						}
            	    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, ".");
            	    					

            	    }


            	    }

            	    // InternalMiniJava.g:1479:4: ( (lv_right_3_0= ruleSquareBrackets ) )
            	    // InternalMiniJava.g:1480:5: (lv_right_3_0= ruleSquareBrackets )
            	    {
            	    // InternalMiniJava.g:1480:5: (lv_right_3_0= ruleSquareBrackets )
            	    // InternalMiniJava.g:1481:6: lv_right_3_0= ruleSquareBrackets
            	    {

            	    						newCompositeNode(grammarAccess.getPointAccess().getRightSquareBracketsParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleSquareBrackets();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPointRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"demidov.projects.MiniJava.SquareBrackets");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMiniJava.g:1503:1: entryRuleSquareBrackets returns [EObject current=null] : iv_ruleSquareBrackets= ruleSquareBrackets EOF ;
    public final EObject entryRuleSquareBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBrackets = null;


        try {
            // InternalMiniJava.g:1503:55: (iv_ruleSquareBrackets= ruleSquareBrackets EOF )
            // InternalMiniJava.g:1504:2: iv_ruleSquareBrackets= ruleSquareBrackets EOF
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
    // InternalMiniJava.g:1510:1: ruleSquareBrackets returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleSquareBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_expressionType_2_0=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1516:2: ( (this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? ) )
            // InternalMiniJava.g:1517:2: (this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? )
            {
            // InternalMiniJava.g:1517:2: (this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )? )
            // InternalMiniJava.g:1518:3: this_Primary_0= rulePrimary ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )?
            {

            			newCompositeNode(grammarAccess.getSquareBracketsAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniJava.g:1526:3: ( () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMiniJava.g:1527:4: () ( (lv_expressionType_2_0= '[' ) ) ( (lv_right_3_0= rulePrimary ) ) otherlv_4= ']'
                    {
                    // InternalMiniJava.g:1527:4: ()
                    // InternalMiniJava.g:1528:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMiniJava.g:1534:4: ( (lv_expressionType_2_0= '[' ) )
                    // InternalMiniJava.g:1535:5: (lv_expressionType_2_0= '[' )
                    {
                    // InternalMiniJava.g:1535:5: (lv_expressionType_2_0= '[' )
                    // InternalMiniJava.g:1536:6: lv_expressionType_2_0= '['
                    {
                    lv_expressionType_2_0=(Token)match(input,19,FOLLOW_26); 

                    						newLeafNode(lv_expressionType_2_0, grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSquareBracketsRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_2_0, "[");
                    					

                    }


                    }

                    // InternalMiniJava.g:1548:4: ( (lv_right_3_0= rulePrimary ) )
                    // InternalMiniJava.g:1549:5: (lv_right_3_0= rulePrimary )
                    {
                    // InternalMiniJava.g:1549:5: (lv_right_3_0= rulePrimary )
                    // InternalMiniJava.g:1550:6: lv_right_3_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getSquareBracketsAccess().getRightPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMiniJava.g:1576:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMiniJava.g:1576:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMiniJava.g:1577:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMiniJava.g:1583:1: rulePrimary returns [EObject current=null] : ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (lv_expressionType_15_0= 'length' ) ) | ( (otherlv_16= RULE_ID ) ) | ( (lv_methodCall_17_0= ruleMethodCall ) ) | ( (lv_number_18_0= ruleNumberValue ) ) ) ;
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
        Token lv_expressionType_15_0=null;
        Token otherlv_16=null;
        EObject lv_expression_6_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_expression_13_0 = null;

        EObject lv_methodCall_17_0 = null;

        EObject lv_number_18_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1589:2: ( ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (lv_expressionType_15_0= 'length' ) ) | ( (otherlv_16= RULE_ID ) ) | ( (lv_methodCall_17_0= ruleMethodCall ) ) | ( (lv_number_18_0= ruleNumberValue ) ) ) )
            // InternalMiniJava.g:1590:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (lv_expressionType_15_0= 'length' ) ) | ( (otherlv_16= RULE_ID ) ) | ( (lv_methodCall_17_0= ruleMethodCall ) ) | ( (lv_number_18_0= ruleNumberValue ) ) )
            {
            // InternalMiniJava.g:1590:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (lv_expressionType_15_0= 'length' ) ) | ( (otherlv_16= RULE_ID ) ) | ( (lv_methodCall_17_0= ruleMethodCall ) ) | ( (lv_number_18_0= ruleNumberValue ) ) )
            int alt20=10;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalMiniJava.g:1591:3: ( (lv_expressionType_0_0= 'true' ) )
                    {
                    // InternalMiniJava.g:1591:3: ( (lv_expressionType_0_0= 'true' ) )
                    // InternalMiniJava.g:1592:4: (lv_expressionType_0_0= 'true' )
                    {
                    // InternalMiniJava.g:1592:4: (lv_expressionType_0_0= 'true' )
                    // InternalMiniJava.g:1593:5: lv_expressionType_0_0= 'true'
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
                    // InternalMiniJava.g:1606:3: ( (lv_expressionType_1_0= 'false' ) )
                    {
                    // InternalMiniJava.g:1606:3: ( (lv_expressionType_1_0= 'false' ) )
                    // InternalMiniJava.g:1607:4: (lv_expressionType_1_0= 'false' )
                    {
                    // InternalMiniJava.g:1607:4: (lv_expressionType_1_0= 'false' )
                    // InternalMiniJava.g:1608:5: lv_expressionType_1_0= 'false'
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
                    // InternalMiniJava.g:1621:3: ( (lv_expressionType_2_0= 'this' ) )
                    {
                    // InternalMiniJava.g:1621:3: ( (lv_expressionType_2_0= 'this' ) )
                    // InternalMiniJava.g:1622:4: (lv_expressionType_2_0= 'this' )
                    {
                    // InternalMiniJava.g:1622:4: (lv_expressionType_2_0= 'this' )
                    // InternalMiniJava.g:1623:5: lv_expressionType_2_0= 'this'
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
                    // InternalMiniJava.g:1636:3: ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' )
                    {
                    // InternalMiniJava.g:1636:3: ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' )
                    // InternalMiniJava.g:1637:4: ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']'
                    {
                    // InternalMiniJava.g:1637:4: ( (lv_expressionType_3_0= 'new' ) )
                    // InternalMiniJava.g:1638:5: (lv_expressionType_3_0= 'new' )
                    {
                    // InternalMiniJava.g:1638:5: (lv_expressionType_3_0= 'new' )
                    // InternalMiniJava.g:1639:6: lv_expressionType_3_0= 'new'
                    {
                    lv_expressionType_3_0=(Token)match(input,44,FOLLOW_35); 

                    						newLeafNode(lv_expressionType_3_0, grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_3_0, "new");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getIntKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_3_2());
                    			
                    // InternalMiniJava.g:1659:4: ( (lv_expression_6_0= ruleExpression ) )
                    // InternalMiniJava.g:1660:5: (lv_expression_6_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1660:5: (lv_expression_6_0= ruleExpression )
                    // InternalMiniJava.g:1661:6: lv_expression_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1684:3: ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' )
                    {
                    // InternalMiniJava.g:1684:3: ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' )
                    // InternalMiniJava.g:1685:4: ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')'
                    {
                    // InternalMiniJava.g:1685:4: ( (lv_expressionType_8_0= 'new' ) )
                    // InternalMiniJava.g:1686:5: (lv_expressionType_8_0= 'new' )
                    {
                    // InternalMiniJava.g:1686:5: (lv_expressionType_8_0= 'new' )
                    // InternalMiniJava.g:1687:6: lv_expressionType_8_0= 'new'
                    {
                    lv_expressionType_8_0=(Token)match(input,44,FOLLOW_21); 

                    						newLeafNode(lv_expressionType_8_0, grammarAccess.getPrimaryAccess().getExpressionTypeNewKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_8_0, "new");
                    					

                    }


                    }

                    // InternalMiniJava.g:1699:4: ( (lv_type_9_0= ruleType ) )
                    // InternalMiniJava.g:1700:5: (lv_type_9_0= ruleType )
                    {
                    // InternalMiniJava.g:1700:5: (lv_type_9_0= ruleType )
                    // InternalMiniJava.g:1701:6: lv_type_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    otherlv_10=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1728:3: ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' )
                    {
                    // InternalMiniJava.g:1728:3: ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' )
                    // InternalMiniJava.g:1729:4: ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalMiniJava.g:1729:4: ( (lv_expressionType_12_0= '(' ) )
                    // InternalMiniJava.g:1730:5: (lv_expressionType_12_0= '(' )
                    {
                    // InternalMiniJava.g:1730:5: (lv_expressionType_12_0= '(' )
                    // InternalMiniJava.g:1731:6: lv_expressionType_12_0= '('
                    {
                    lv_expressionType_12_0=(Token)match(input,17,FOLLOW_26); 

                    						newLeafNode(lv_expressionType_12_0, grammarAccess.getPrimaryAccess().getExpressionTypeLeftParenthesisKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "expressionType", lv_expressionType_12_0, "(");
                    					

                    }


                    }

                    // InternalMiniJava.g:1743:4: ( (lv_expression_13_0= ruleExpression ) )
                    // InternalMiniJava.g:1744:5: (lv_expression_13_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1744:5: (lv_expression_13_0= ruleExpression )
                    // InternalMiniJava.g:1745:6: lv_expression_13_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_14=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1768:3: ( (lv_expressionType_15_0= 'length' ) )
                    {
                    // InternalMiniJava.g:1768:3: ( (lv_expressionType_15_0= 'length' ) )
                    // InternalMiniJava.g:1769:4: (lv_expressionType_15_0= 'length' )
                    {
                    // InternalMiniJava.g:1769:4: (lv_expressionType_15_0= 'length' )
                    // InternalMiniJava.g:1770:5: lv_expressionType_15_0= 'length'
                    {
                    lv_expressionType_15_0=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_expressionType_15_0, grammarAccess.getPrimaryAccess().getExpressionTypeLengthKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    					setWithLastConsumed(current, "expressionType", lv_expressionType_15_0, "length");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1783:3: ( (otherlv_16= RULE_ID ) )
                    {
                    // InternalMiniJava.g:1783:3: ( (otherlv_16= RULE_ID ) )
                    // InternalMiniJava.g:1784:4: (otherlv_16= RULE_ID )
                    {
                    // InternalMiniJava.g:1784:4: (otherlv_16= RULE_ID )
                    // InternalMiniJava.g:1785:5: otherlv_16= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    				
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_16, grammarAccess.getPrimaryAccess().getVariableVariableCrossReference_7_0());
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:1797:3: ( (lv_methodCall_17_0= ruleMethodCall ) )
                    {
                    // InternalMiniJava.g:1797:3: ( (lv_methodCall_17_0= ruleMethodCall ) )
                    // InternalMiniJava.g:1798:4: (lv_methodCall_17_0= ruleMethodCall )
                    {
                    // InternalMiniJava.g:1798:4: (lv_methodCall_17_0= ruleMethodCall )
                    // InternalMiniJava.g:1799:5: lv_methodCall_17_0= ruleMethodCall
                    {

                    					newCompositeNode(grammarAccess.getPrimaryAccess().getMethodCallMethodCallParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_methodCall_17_0=ruleMethodCall();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"methodCall",
                    						lv_methodCall_17_0,
                    						"demidov.projects.MiniJava.MethodCall");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMiniJava.g:1817:3: ( (lv_number_18_0= ruleNumberValue ) )
                    {
                    // InternalMiniJava.g:1817:3: ( (lv_number_18_0= ruleNumberValue ) )
                    // InternalMiniJava.g:1818:4: (lv_number_18_0= ruleNumberValue )
                    {
                    // InternalMiniJava.g:1818:4: (lv_number_18_0= ruleNumberValue )
                    // InternalMiniJava.g:1819:5: lv_number_18_0= ruleNumberValue
                    {

                    					newCompositeNode(grammarAccess.getPrimaryAccess().getNumberNumberValueParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_18_0=ruleNumberValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_18_0,
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


    // $ANTLR start "entryRuleMethodCall"
    // InternalMiniJava.g:1840:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalMiniJava.g:1840:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalMiniJava.g:1841:2: iv_ruleMethodCall= ruleMethodCall EOF
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
    // InternalMiniJava.g:1847:1: ruleMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalMiniJava.g:1853:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalMiniJava.g:1854:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalMiniJava.g:1854:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalMiniJava.g:1855:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalMiniJava.g:1855:3: ( (otherlv_0= RULE_ID ) )
            // InternalMiniJava.g:1856:4: (otherlv_0= RULE_ID )
            {
            // InternalMiniJava.g:1856:4: (otherlv_0= RULE_ID )
            // InternalMiniJava.g:1857:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getMethodMethodCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniJava.g:1872:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==17||LA22_0==39||(LA22_0>=41 && LA22_0<=45)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMiniJava.g:1873:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalMiniJava.g:1873:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalMiniJava.g:1874:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1874:5: (lv_parameters_2_0= ruleExpression )
                    // InternalMiniJava.g:1875:6: lv_parameters_2_0= ruleExpression
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

                    // InternalMiniJava.g:1892:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==27) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMiniJava.g:1893:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_26); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMiniJava.g:1897:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalMiniJava.g:1898:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalMiniJava.g:1898:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalMiniJava.g:1899:7: lv_parameters_4_0= ruleExpression
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMiniJava.g:1926:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalMiniJava.g:1926:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalMiniJava.g:1927:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalMiniJava.g:1933:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1939:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMiniJava.g:1940:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMiniJava.g:1940:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMiniJava.g:1941:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMiniJava.g:1941:3: (lv_value_0_0= RULE_INT )
            // InternalMiniJava.g:1942:4: lv_value_0_0= RULE_INT
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


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\7\uffff\1\13\7\uffff";
    static final String dfa_3s = "\1\4\3\uffff\1\4\2\uffff\1\21\1\uffff\1\21\3\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\55\3\uffff\1\31\2\uffff\1\50\1\uffff\1\23\3\uffff\1\55\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\uffff\1\12\1\uffff\1\5\1\10\1\11\1\uffff\1\4";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\10\13\uffff\1\5\27\uffff\1\1\1\2\1\3\1\4\1\6",
            "",
            "",
            "",
            "\1\12\23\uffff\1\11\1\12",
            "",
            "",
            "\1\14\1\uffff\3\13\4\uffff\2\13\6\uffff\5\13\1\uffff\1\13",
            "",
            "\1\12\1\uffff\1\15",
            "",
            "",
            "",
            "\2\16\13\uffff\1\16\2\uffff\1\12\22\uffff\1\16\1\uffff\5\16",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1590:2: ( ( (lv_expressionType_0_0= 'true' ) ) | ( (lv_expressionType_1_0= 'false' ) ) | ( (lv_expressionType_2_0= 'this' ) ) | ( ( (lv_expressionType_3_0= 'new' ) ) otherlv_4= 'int' otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( ( (lv_expressionType_8_0= 'new' ) ) ( (lv_type_9_0= ruleType ) ) otherlv_10= '(' otherlv_11= ')' ) | ( ( (lv_expressionType_12_0= '(' ) ) ( (lv_expression_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( (lv_expressionType_15_0= 'length' ) ) | ( (otherlv_16= RULE_ID ) ) | ( (lv_methodCall_17_0= ruleMethodCall ) ) | ( (lv_number_18_0= ruleNumberValue ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001A0001010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003402010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003200010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001B3001010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001B0001010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00003E8000020030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000001A0401010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00003E8000220030L});

}