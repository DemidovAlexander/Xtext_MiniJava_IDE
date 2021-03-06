/*
 * generated by Xtext 2.9.1
 */
package demidov.projects.serializer;

import com.google.inject.Inject;
import demidov.projects.miniJava.Addition;
import demidov.projects.miniJava.ClassDecl;
import demidov.projects.miniJava.Expr;
import demidov.projects.miniJava.Expression;
import demidov.projects.miniJava.MainMethod;
import demidov.projects.miniJava.Method;
import demidov.projects.miniJava.MethodCall;
import demidov.projects.miniJava.MiniJavaPackage;
import demidov.projects.miniJava.Multiplication;
import demidov.projects.miniJava.NumberValue;
import demidov.projects.miniJava.Point;
import demidov.projects.miniJava.Program;
import demidov.projects.miniJava.SquareBrackets;
import demidov.projects.miniJava.Statement;
import demidov.projects.miniJava.Type;
import demidov.projects.miniJava.VarDeclaration;
import demidov.projects.miniJava.Variable;
import demidov.projects.services.MiniJavaGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MiniJavaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MiniJavaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MiniJavaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MiniJavaPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case MiniJavaPackage.CLASS_DECL:
				if (rule == grammarAccess.getClassDeclarationRule()) {
					sequence_ClassDeclaration(context, (ClassDecl) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMainClassRule()) {
					sequence_MainClass(context, (ClassDecl) semanticObject); 
					return; 
				}
				else break;
			case MiniJavaPackage.EXPR:
				if (rule == grammarAccess.getMethodCallExprRule()) {
					sequence_MethodCallExpr(context, (Expr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNegationRule()) {
					sequence_Negation(context, (Expr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionRule()
						|| action == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()
						|| rule == grammarAccess.getAdditionRule()
						|| action == grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()
						|| rule == grammarAccess.getMultiplicationRule()
						|| action == grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()
						|| rule == grammarAccess.getNegationOrPointExpressionRule()) {
					sequence_Negation_Primary(context, (Expr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPointRule()
						|| action == grammarAccess.getPointAccess().getPointLeftAction_1_0()
						|| rule == grammarAccess.getSquareBracketsRule()
						|| action == grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case MiniJavaPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case MiniJavaPackage.MAIN_METHOD:
				sequence_MainMethod(context, (MainMethod) semanticObject); 
				return; 
			case MiniJavaPackage.METHOD:
				sequence_MethodDeclaration(context, (Method) semanticObject); 
				return; 
			case MiniJavaPackage.METHOD_CALL:
				sequence_MethodCall(context, (MethodCall) semanticObject); 
				return; 
			case MiniJavaPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case MiniJavaPackage.NUMBER_VALUE:
				sequence_NumberValue(context, (NumberValue) semanticObject); 
				return; 
			case MiniJavaPackage.POINT:
				sequence_Point(context, (Point) semanticObject); 
				return; 
			case MiniJavaPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case MiniJavaPackage.SQUARE_BRACKETS:
				sequence_SquareBrackets(context, (SquareBrackets) semanticObject); 
				return; 
			case MiniJavaPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case MiniJavaPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case MiniJavaPackage.VAR_DECLARATION:
				sequence_VarDeclaration(context, (VarDeclaration) semanticObject); 
				return; 
			case MiniJavaPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns Addition
	 *     Expression.Expression_1_0 returns Addition
	 *     Addition returns Addition
	 *     Addition.Addition_1_0 returns Addition
	 *
	 * Constraint:
	 *     (left=Addition_Addition_1_0 (expressionType='+' | expressionType='-') right=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDeclaration returns ClassDecl
	 *
	 * Constraint:
	 *     (name=ID extendedClass=[ClassDecl|ID]? varDeclarations+=VarDeclaration* methodDeclarations+=MethodDeclaration*)
	 */
	protected void sequence_ClassDeclaration(ISerializationContext context, ClassDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (left=Expression_Expression_1_0 expressionType='<' right=Expression)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionTypeLessThanSignKeyword_1_1_0(), semanticObject.getExpressionType());
		feeder.accept(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MainClass returns ClassDecl
	 *
	 * Constraint:
	 *     (name=ID mainMethod=MainMethod)
	 */
	protected void sequence_MainClass(ISerializationContext context, ClassDecl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.CLASS_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.CLASS_DECL__NAME));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.CLASS_DECL__MAIN_METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.CLASS_DECL__MAIN_METHOD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMainClassAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMainClassAccess().getMainMethodMainMethodParserRuleCall_3_0(), semanticObject.getMainMethod());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MainMethod returns MainMethod
	 *
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_MainMethod(ISerializationContext context, MainMethod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.MAIN_METHOD__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.MAIN_METHOD__STATEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMainMethodAccess().getStatementStatementParserRuleCall_11_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodCallExpr returns Expr
	 *
	 * Constraint:
	 *     (expressionType='length' | methodCall=MethodCall)
	 */
	protected void sequence_MethodCallExpr(ISerializationContext context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MethodCall returns MethodCall
	 *
	 * Constraint:
	 *     (method=[Method|ID] (parameters+=Expression parameters+=Expression*)?)
	 */
	protected void sequence_MethodCall(ISerializationContext context, MethodCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MethodDeclaration returns Method
	 *
	 * Constraint:
	 *     (
	 *         methodType=Type 
	 *         name=ID 
	 *         (formalVarDeclarations+=Variable formalVarDeclarations+=Variable*)? 
	 *         localVarDeclarations+=VarDeclaration* 
	 *         statements+=Statement* 
	 *         returnExpression=Expression?
	 *     )
	 */
	protected void sequence_MethodDeclaration(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Multiplication
	 *     Expression.Expression_1_0 returns Multiplication
	 *     Addition returns Multiplication
	 *     Addition.Addition_1_0 returns Multiplication
	 *     Multiplication returns Multiplication
	 *     Multiplication.Multiplication_1_0 returns Multiplication
	 *
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 (expressionType='*' | expressionType='&&') right=NegationOrPointExpression)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Negation returns Expr
	 *
	 * Constraint:
	 *     (expressionType='!' right=Point)
	 */
	protected void sequence_Negation(ISerializationContext context, Expr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNegationAccess().getExpressionTypeExclamationMarkKeyword_0_0(), semanticObject.getExpressionType());
		feeder.accept(grammarAccess.getNegationAccess().getRightPointParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expr
	 *     Expression.Expression_1_0 returns Expr
	 *     Addition returns Expr
	 *     Addition.Addition_1_0 returns Expr
	 *     Multiplication returns Expr
	 *     Multiplication.Multiplication_1_0 returns Expr
	 *     NegationOrPointExpression returns Expr
	 *
	 * Constraint:
	 *     (
	 *         (expressionType='!' right=Point) | 
	 *         expressionType='true' | 
	 *         expressionType='false' | 
	 *         expressionType='this' | 
	 *         (expressionType='new' expression=Expression) | 
	 *         (expressionType='new' type=Type) | 
	 *         (expressionType='(' expression=Expression) | 
	 *         variable=[Variable|ID] | 
	 *         number=NumberValue
	 *     )
	 */
	protected void sequence_Negation_Primary(ISerializationContext context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NumberValue returns NumberValue
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_NumberValue(ISerializationContext context, NumberValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.NUMBER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.NUMBER_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Point
	 *     Expression.Expression_1_0 returns Point
	 *     Addition returns Point
	 *     Addition.Addition_1_0 returns Point
	 *     Multiplication returns Point
	 *     Multiplication.Multiplication_1_0 returns Point
	 *     NegationOrPointExpression returns Point
	 *     Point returns Point
	 *     Point.Point_1_0 returns Point
	 *
	 * Constraint:
	 *     (left=Point_Point_1_0 expressionType='.' right=MethodCallExpr)
	 */
	protected void sequence_Point(ISerializationContext context, Point semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPointAccess().getPointLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPointAccess().getExpressionTypeFullStopKeyword_1_1_0(), semanticObject.getExpressionType());
		feeder.accept(grammarAccess.getPointAccess().getRightMethodCallExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Expr
	 *     Point.Point_1_0 returns Expr
	 *     SquareBrackets returns Expr
	 *     SquareBrackets.SquareBrackets_1_0 returns Expr
	 *     Primary returns Expr
	 *
	 * Constraint:
	 *     (
	 *         expressionType='true' | 
	 *         expressionType='false' | 
	 *         expressionType='this' | 
	 *         (expressionType='new' expression=Expression) | 
	 *         (expressionType='new' type=Type) | 
	 *         (expressionType='(' expression=Expression) | 
	 *         variable=[Variable|ID] | 
	 *         number=NumberValue
	 *     )
	 */
	protected void sequence_Primary(ISerializationContext context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (classDeclarations+=MainClass classDeclarations+=ClassDeclaration*)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns SquareBrackets
	 *     Expression.Expression_1_0 returns SquareBrackets
	 *     Addition returns SquareBrackets
	 *     Addition.Addition_1_0 returns SquareBrackets
	 *     Multiplication returns SquareBrackets
	 *     Multiplication.Multiplication_1_0 returns SquareBrackets
	 *     NegationOrPointExpression returns SquareBrackets
	 *     Point returns SquareBrackets
	 *     Point.Point_1_0 returns SquareBrackets
	 *     SquareBrackets returns SquareBrackets
	 *
	 * Constraint:
	 *     (left=SquareBrackets_SquareBrackets_1_0 expressionType='[' right=Primary)
	 */
	protected void sequence_SquareBrackets(ISerializationContext context, SquareBrackets semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSquareBracketsAccess().getSquareBracketsLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSquareBracketsAccess().getExpressionTypeLeftSquareBracketKeyword_1_1_0(), semanticObject.getExpressionType());
		feeder.accept(grammarAccess.getSquareBracketsAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Statement
	 *
	 * Constraint:
	 *     (
	 *         (statementType='{' statements+=Statement*) | 
	 *         (statementType='if' firstExpression=Expression statements+=Statement statements+=Statement) | 
	 *         (statementType='while' firstExpression=Expression statements+=Statement) | 
	 *         (statementType='System.out.println' firstExpression=Expression) | 
	 *         (variable=[Variable|ID] statementType='=' firstExpression=Expression) | 
	 *         (variable=[Variable|ID] isArrayElementAssignment?='[' firstExpression=Expression statementType='=' secondExpression=Expression)
	 *     )
	 */
	protected void sequence_Statement(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (typeName='[' | typeName='int' | typeName='boolean' | classDecl=[ClassDecl|ID])
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VarDeclaration returns VarDeclaration
	 *
	 * Constraint:
	 *     variable=Variable
	 */
	protected void sequence_VarDeclaration(ISerializationContext context, VarDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.VAR_DECLARATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.VAR_DECLARATION__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarDeclarationAccess().getVariableVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (variableType=Type name=ID)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.VARIABLE__VARIABLE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.VARIABLE__VARIABLE_TYPE));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getVariableTypeTypeParserRuleCall_0_0(), semanticObject.getVariableType());
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
