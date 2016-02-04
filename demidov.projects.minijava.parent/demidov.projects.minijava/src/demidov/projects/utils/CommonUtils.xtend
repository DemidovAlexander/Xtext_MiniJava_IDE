package demidov.projects.utils

import demidov.projects.miniJava.ClassDecl
import demidov.projects.miniJava.Method
import java.util.HashSet
import org.eclipse.xtext.EcoreUtil2
import demidov.projects.miniJava.MiniJavaFactory
import demidov.projects.miniJava.Type
import demidov.projects.miniJava.Expr

class CommonUtils {
	
	def public static getMethodsForClass(ClassDecl classDecl) {
		var methodsNames = new HashSet<String>();			
		var classMethods = new HashSet<Method>();
		
		var currentClass = classDecl;
			        	
        do {
			val currentClassMethods = currentClass.methodDeclarations;
        	
        	for (currentClassMethod : currentClassMethods) {
        		if (!methodsNames.contains(currentClassMethod.name)) {
        			methodsNames.add(currentClassMethod.name)
        			classMethods.add(currentClassMethod);
        		}
        	}
        		
        	currentClass = currentClass.extendedClass;         		       		
        } while (currentClass != null)
			
		return classMethods;
	}
	
	def public static checkMethodForClass(ClassDecl classDecl, Method method) {
		if ( !getMethodsForClass(classDecl).contains(method) ) {
        	return false;
        } else {
        	return true;
        }
	}
	
	def public static Type getExpressionType(Expr expression) {
		if ( expression.number != null
			|| ( expression.expressionType != null
				&& expression.expressionType.matches('\\+|-|\\*|\\[')	) ) {
				
			val type = MiniJavaFactory.eINSTANCE.createType()
			type.setTypeName('int');
			return type;
		}
		
		if ( expression.expressionType != null
			 &&	( expression.expressionType.matches('true|false')
				|| expression.expressionType.matches('<|&&|!') ) ) {
				
			val type = MiniJavaFactory.eINSTANCE.createType()
			type.setTypeName('boolean');
			return type;
		}
		
		if (expression.variable != null) {
			return expression.variable.variableType;
		}
		
		if ( expression.expressionType != null && expression.expressionType.equals('this') ) {
			val classDecl = EcoreUtil2.getContainerOfType(expression, ClassDecl);
			val type = MiniJavaFactory.eINSTANCE.createType()
			type.setClassDecl(classDecl);
			return type;
		}
		
		if ( (expression.expressionType != null) && expression.expressionType.equals('(') ) {
			return getExpressionType(expression.expression);
		}
		
		if ( (expression.expressionType != null) && expression.expressionType.equals('new') ) {
			if (expression.type != null) {
				return expression.type;
			} else {
				val type = MiniJavaFactory.eINSTANCE.createType()
				type.setTypeName('[');
				return type;
			}
		}
		
		if ( (expression.expressionType != null) && expression.expressionType.equals('.') ) {
			if (expression.right.methodCall != null) {
				return expression.right.methodCall.method.methodType;
			} else {
				val type = MiniJavaFactory.eINSTANCE.createType()
				type.setTypeName('int');
				return type;
			}
		}
		
		return null;
	}
	
	def public static checkCompatibleClassTypes(ClassDecl targetClass, ClassDecl parameterClass) {
		if ( targetClass == null && parameterClass == null) {
			return true;
		}
		
		if ( targetClass != null && parameterClass != null) {
			var currentClass = parameterClass;
			do {
				if (targetClass == currentClass) {
					return true;
				}
				
				currentClass = currentClass.extendedClass;
			} while(currentClass != null);
		}
		
		return false;
	}
	
}