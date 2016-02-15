package demidov.projects.utils;

import com.google.common.base.Objects;
import demidov.projects.miniJava.ClassDecl;
import demidov.projects.miniJava.Expr;
import demidov.projects.miniJava.Method;
import demidov.projects.miniJava.MethodCall;
import demidov.projects.miniJava.MiniJavaFactory;
import demidov.projects.miniJava.NumberValue;
import demidov.projects.miniJava.Type;
import demidov.projects.miniJava.Variable;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;

@SuppressWarnings("all")
public class CommonUtils {
  public static HashSet<Method> getMethodsForClass(final ClassDecl classDecl) {
    HashSet<String> methodsNames = new HashSet<String>();
    HashSet<Method> classMethods = new HashSet<Method>();
    ClassDecl currentClass = classDecl;
    do {
      {
        final EList<Method> currentClassMethods = currentClass.getMethodDeclarations();
        for (final Method currentClassMethod : currentClassMethods) {
          String _name = currentClassMethod.getName();
          boolean _contains = methodsNames.contains(_name);
          boolean _not = (!_contains);
          if (_not) {
            String _name_1 = currentClassMethod.getName();
            methodsNames.add(_name_1);
            classMethods.add(currentClassMethod);
          }
        }
        ClassDecl _extendedClass = currentClass.getExtendedClass();
        currentClass = _extendedClass;
      }
    } while((!Objects.equal(currentClass, null)));
    return classMethods;
  }
  
  public static boolean checkMethodForClass(final ClassDecl classDecl, final Method method) {
    HashSet<Method> _methodsForClass = CommonUtils.getMethodsForClass(classDecl);
    boolean _contains = _methodsForClass.contains(method);
    boolean _not = (!_contains);
    if (_not) {
      return false;
    } else {
      return true;
    }
  }
  
  public static Type getExpressionType(final Expr expression) {
    boolean _or = false;
    NumberValue _number = expression.getNumber();
    boolean _notEquals = (!Objects.equal(_number, null));
    if (_notEquals) {
      _or = true;
    } else {
      boolean _and = false;
      String _expressionType = expression.getExpressionType();
      boolean _notEquals_1 = (!Objects.equal(_expressionType, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        String _expressionType_1 = expression.getExpressionType();
        boolean _matches = _expressionType_1.matches("\\+|-|\\*|\\[");
        _and = _matches;
      }
      _or = _and;
    }
    if (_or) {
      final Type type = MiniJavaFactory.eINSTANCE.createType();
      type.setTypeName("int");
      return type;
    }
    boolean _and_1 = false;
    String _expressionType_2 = expression.getExpressionType();
    boolean _notEquals_2 = (!Objects.equal(_expressionType_2, null));
    if (!_notEquals_2) {
      _and_1 = false;
    } else {
      boolean _or_1 = false;
      String _expressionType_3 = expression.getExpressionType();
      boolean _matches_1 = _expressionType_3.matches("true|false");
      if (_matches_1) {
        _or_1 = true;
      } else {
        String _expressionType_4 = expression.getExpressionType();
        boolean _matches_2 = _expressionType_4.matches("<|&&|!");
        _or_1 = _matches_2;
      }
      _and_1 = _or_1;
    }
    if (_and_1) {
      final Type type_1 = MiniJavaFactory.eINSTANCE.createType();
      type_1.setTypeName("boolean");
      return type_1;
    }
    Variable _variable = expression.getVariable();
    boolean _notEquals_3 = (!Objects.equal(_variable, null));
    if (_notEquals_3) {
      Variable _variable_1 = expression.getVariable();
      return _variable_1.getVariableType();
    }
    boolean _and_2 = false;
    String _expressionType_5 = expression.getExpressionType();
    boolean _notEquals_4 = (!Objects.equal(_expressionType_5, null));
    if (!_notEquals_4) {
      _and_2 = false;
    } else {
      String _expressionType_6 = expression.getExpressionType();
      boolean _equals = _expressionType_6.equals("this");
      _and_2 = _equals;
    }
    if (_and_2) {
      final ClassDecl classDecl = EcoreUtil2.<ClassDecl>getContainerOfType(expression, ClassDecl.class);
      final Type type_2 = MiniJavaFactory.eINSTANCE.createType();
      type_2.setClassDecl(classDecl);
      return type_2;
    }
    boolean _and_3 = false;
    String _expressionType_7 = expression.getExpressionType();
    boolean _notEquals_5 = (!Objects.equal(_expressionType_7, null));
    if (!_notEquals_5) {
      _and_3 = false;
    } else {
      String _expressionType_8 = expression.getExpressionType();
      boolean _equals_1 = _expressionType_8.equals("(");
      _and_3 = _equals_1;
    }
    if (_and_3) {
      Expr _expression = expression.getExpression();
      return CommonUtils.getExpressionType(_expression);
    }
    boolean _and_4 = false;
    String _expressionType_9 = expression.getExpressionType();
    boolean _notEquals_6 = (!Objects.equal(_expressionType_9, null));
    if (!_notEquals_6) {
      _and_4 = false;
    } else {
      String _expressionType_10 = expression.getExpressionType();
      boolean _equals_2 = _expressionType_10.equals("new");
      _and_4 = _equals_2;
    }
    if (_and_4) {
      Type _type = expression.getType();
      boolean _notEquals_7 = (!Objects.equal(_type, null));
      if (_notEquals_7) {
        return expression.getType();
      } else {
        final Type type_3 = MiniJavaFactory.eINSTANCE.createType();
        type_3.setTypeName("[");
        return type_3;
      }
    }
    boolean _and_5 = false;
    String _expressionType_11 = expression.getExpressionType();
    boolean _notEquals_8 = (!Objects.equal(_expressionType_11, null));
    if (!_notEquals_8) {
      _and_5 = false;
    } else {
      String _expressionType_12 = expression.getExpressionType();
      boolean _equals_3 = _expressionType_12.equals(".");
      _and_5 = _equals_3;
    }
    if (_and_5) {
      Expr _right = expression.getRight();
      MethodCall _methodCall = _right.getMethodCall();
      boolean _notEquals_9 = (!Objects.equal(_methodCall, null));
      if (_notEquals_9) {
        Expr _right_1 = expression.getRight();
        MethodCall _methodCall_1 = _right_1.getMethodCall();
        Method _method = _methodCall_1.getMethod();
        return _method.getMethodType();
      } else {
        final Type type_4 = MiniJavaFactory.eINSTANCE.createType();
        type_4.setTypeName("int");
        return type_4;
      }
    }
    return MiniJavaFactory.eINSTANCE.createType();
  }
  
  public static boolean checkCompatibleClassTypes(final ClassDecl targetClass, final ClassDecl parameterClass) {
    boolean _and = false;
    boolean _equals = Objects.equal(targetClass, null);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(parameterClass, null);
      _and = _equals_1;
    }
    if (_and) {
      return true;
    }
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(targetClass, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(parameterClass, null));
      _and_1 = _notEquals_1;
    }
    if (_and_1) {
      ClassDecl currentClass = parameterClass;
      do {
        {
          boolean _equals_2 = Objects.equal(targetClass, currentClass);
          if (_equals_2) {
            return true;
          }
          ClassDecl _extendedClass = currentClass.getExtendedClass();
          currentClass = _extendedClass;
        }
      } while((!Objects.equal(currentClass, null)));
    }
    return false;
  }
}
