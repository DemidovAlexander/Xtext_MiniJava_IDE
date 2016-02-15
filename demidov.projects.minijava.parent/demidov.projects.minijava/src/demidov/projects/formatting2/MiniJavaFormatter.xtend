/*
 * generated by Xtext 2.9.1
 */
package demidov.projects.formatting2

import demidov.projects.miniJava.ClassDecl
import demidov.projects.miniJava.Method
import demidov.projects.miniJava.Program
import demidov.projects.miniJava.VarDeclaration
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import demidov.projects.miniJava.MiniJavaPackage
import demidov.projects.miniJava.Variable
import demidov.projects.miniJava.Statement
import demidov.projects.miniJava.MethodCall
import demidov.projects.miniJava.Expr
import demidov.projects.miniJava.MainMethod
import demidov.projects.miniJava.Type

class MiniJavaFormatter extends AbstractFormatter2 {

	def dispatch void format(Program program, extension IFormattableDocument document) {
		program.prepend[setNewLines(0, 0, 2); noSpace; highPriority].append[newLine]
		for (ClassDecl classDeclaration : program.classDeclarations) {
			classDeclaration.format
		}
	}

	def dispatch void format(ClassDecl classDecl, extension IFormattableDocument document) {
		classDecl.regionFor.keyword('class').prepend[setNewLines(2, 2, 3); noSpace]
		classDecl.regionFor.feature(MiniJavaPackage.Literals.CLASS_DECL__NAME).surround[oneSpace]
		classDecl.regionFor.feature(MiniJavaPackage.Literals.CLASS_DECL__EXTENDED_CLASS).surround[oneSpace]

		val open = classDecl.regionFor.keyword('{')
		val close = classDecl.regionFor.keyword('}')

		open.append[setNewLines(1, 1, 2)]
		interior(open, close)[indent]
		close.prepend[setNewLines(1, 1, 2)]

		classDecl.mainMethod.format

		for (VarDeclaration varDeclarations : classDecl.varDeclarations) {
			varDeclarations.format
		}
		for (Method methodDeclarations : classDecl.getMethodDeclarations()) {
			methodDeclarations.format
		}
	}

	def dispatch void format(MainMethod mainMethod, extension IFormattableDocument document) {
		mainMethod.regionFor.keyword('public').prepend[setNewLines(1, 1, 2)].append[oneSpace]
		mainMethod.regionFor.keyword('void').surround[oneSpace]

		val open = mainMethod.regionFor.keyword('{')
		val close = mainMethod.regionFor.keyword('}')

		open.append[setNewLines(1, 2, 2)]
		interior(open, close)[indent]
		close.prepend[setNewLines(1, 1, 2)]

		mainMethod.regionFor.keyword('(').surround[noSpace]
		mainMethod.regionFor.keyword('[').surround[noSpace]
		mainMethod.regionFor.keyword(']').append[oneSpace]
		mainMethod.regionFor.keyword(')').prepend[noSpace].append[oneSpace]

		mainMethod.statement.format
	}

	def dispatch void format(VarDeclaration varDeclaration, extension IFormattableDocument document) {
		varDeclaration.regionFor.keyword(';').prepend[noSpace].append[setNewLines(1, 1, 2)]		
		varDeclaration.variable.format
	}

	def dispatch void format(Variable variable, extension IFormattableDocument document) {
		variable.regionFor.feature(MiniJavaPackage.Literals.VARIABLE__NAME).prepend[oneSpace]
		variable.variableType.format
	}

	def dispatch void format(Method method, extension IFormattableDocument document) {
		method.regionFor.keyword('public').prepend[setNewLines(1, 1, 2); noSpace].append[oneSpace]
		method.regionFor.feature(MiniJavaPackage.Literals.METHOD__NAME).prepend[oneSpace]

		val open = method.regionFor.keyword('{')
		val close = method.regionFor.keyword('}')

		open.append[setNewLines(1, 1, 2)]
		interior(open, close)[indent]
		close.prepend[newLine]

		method.regionFor.keyword('(').surround[noSpace]
		method.regionFor.keyword(')').prepend[noSpace].append[oneSpace]

		for (comma : method.regionFor.keywords(',')) {
			comma.prepend[noSpace].append[oneSpace]
		}

		for (Variable variable : method.formalVarDeclarations) {
			variable.format
		}

		for (VarDeclaration varDeclaration : method.localVarDeclarations) {
			varDeclaration.format
		}

		for (Statement statement : method.statements) {
			statement.format
		}

		method.regionFor.keyword('return').append[oneSpace]
		method.regionFor.keyword(';').prepend[noSpace]
		
		method.methodType.format
		method.returnExpression.format
	}

	def dispatch void format(Statement statement, extension IFormattableDocument document) {
		if (statement.statementType.equals('=')) {
			statement.regionFor.feature(MiniJavaPackage.Literals.STATEMENT__STATEMENT_TYPE).surround[oneSpace]
		} else if (statement.statementType.equals('{')) {
			val open = statement.regionFor.feature(MiniJavaPackage.Literals.STATEMENT__STATEMENT_TYPE)
			val close = statement.regionFor.keyword('}')

			open.append[setNewLines(1, 1, 2)]
			interior(open, close)[indent]			
			close.prepend[setNewLines(1, 1, 2)].append[setNewLines(1, 1, 2)]
			
		}  else if (statement.statementType.equals('if')) {

			statement.regionFor.keyword('(').prepend[oneSpace].append[noSpace]
			
			if ( !statement.statements.get(0).statementType.equals('{') ) {	
				val begin = statement.regionFor.keyword(')')
				begin.prepend[noSpace].append[newLine]
				
				val end = statement.regionFor.keyword('else')	
						
				interior(begin, end)[indent]
			} else {
				statement.regionFor.keyword(')').prepend[noSpace].append[oneSpace]
			}
			
			if ( !statement.statements.get(1).statementType.equals('{') ) {			
				val begin = statement.regionFor.keyword('else')
				begin.prepend[setNewLines(1, 1, 2)].append[newLine]

				statement.statements.get(1).surround[indent].append[setNewLines(1, 1, 2)]
			} else {
				statement.regionFor.keyword('else').prepend[setNewLines(1, 1, 2)].append[oneSpace]
			}
					
		} else if (statement.statementType.equals('while')) {
			statement.regionFor.keyword('(').prepend[oneSpace].append[noSpace]
			
			if ( !statement.statements.get(0).statementType.equals('{') ) {
				val begin = statement.regionFor.keyword(')')
				begin.prepend[noSpace].append[newLine]
				
				statement.statements.get(0).surround[indent].append[setNewLines(1, 1, 2)]				
			} else {
				statement.regionFor.keyword(')').prepend[noSpace].append[oneSpace]
			}			
			
		} else {
			statement.regionFor.keyword('(').surround[noSpace]
			statement.regionFor.keyword(')').surround[noSpace]
		}
		
		for (innerStatement: statement.statements) {
			innerStatement.format
		}
		
		statement.firstExpression.format
		statement.secondExpression.format

		statement.regionFor.feature(MiniJavaPackage.Literals.STATEMENT__IS_ARRAY_ELEMENT_ASSIGNMENT).surround[noSpace]

		statement.regionFor.keyword(';').prepend[noSpace].append[setNewLines(1, 1, 2)]

		statement.regionFor.keyword(']').surround[noSpace]
	}

	def dispatch void format(Expr expression, extension IFormattableDocument document) {
		if (expression.expressionType != null 
			&& expression.expressionType.matches('\\+|-|\\*|&&|<') ) {
				
			expression.regionFor.feature(MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE).surround[oneSpace]
		}

		if (expression.expressionType != null 
			&& expression.expressionType.equals('!') ) {
				
			expression.regionFor.feature(MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE).append[noSpace]
		}

		if ((expression.expressionType != null) 
			&& expression.expressionType.equals('.') ) {
				
			expression.regionFor.feature(MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE).surround[noSpace]
		}

		if ((expression.expressionType != null) 
			&& expression.expressionType.equals('[') ) {
				
			expression.regionFor.feature(MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE).surround[noSpace]
			expression.regionFor.keyword(']').append[noSpace]
		}

		if ((expression.expressionType != null) 
			&& expression.expressionType.equals('(') ) {
				
			expression.regionFor.feature(MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE).append[noSpace]
			expression.regionFor.keyword(')').prepend[noSpace]
		}

		if ((expression.expressionType != null) 
			&& expression.expressionType.equals('new') ) {
				
			expression.regionFor.feature(MiniJavaPackage.Literals.EXPR__EXPRESSION_TYPE).append[oneSpace]
			expression.regionFor.keyword('(').surround[noSpace]
			expression.regionFor.keyword('[').surround[noSpace]
			expression.regionFor.keyword(']').surround[noSpace]
		}
		
		expression.left.format
		expression.right.format
		expression.expression.format
		expression.methodCall.format
		expression.type.format
	}
	
	def dispatch void format(Type type, extension IFormattableDocument document) {
		if (type.typeName != null
			&& type.typeName.equals('[') ) {
				
			type.regionFor.feature(MiniJavaPackage.Literals.TYPE__TYPE_NAME).surround[noSpace]
		}
	}

	def dispatch void format(MethodCall methodCall, extension IFormattableDocument document) {
		methodCall.regionFor.keyword('(').surround[noSpace]
		methodCall.regionFor.keyword(')').prepend[noSpace]

		for (comma : methodCall.regionFor.keywords(',')) {
			comma.prepend[noSpace].append[oneSpace]
		}
		
		for (Expr parameter : methodCall.parameters) {
			parameter.format
		}
	}
}