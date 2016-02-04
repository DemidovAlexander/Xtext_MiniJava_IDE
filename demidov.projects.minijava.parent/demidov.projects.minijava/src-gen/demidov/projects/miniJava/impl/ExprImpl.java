/**
 * generated by Xtext 2.9.1
 */
package demidov.projects.miniJava.impl;

import demidov.projects.miniJava.Expr;
import demidov.projects.miniJava.MethodCall;
import demidov.projects.miniJava.MiniJavaPackage;
import demidov.projects.miniJava.NumberValue;
import demidov.projects.miniJava.Type;
import demidov.projects.miniJava.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demidov.projects.miniJava.impl.ExprImpl#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.ExprImpl#getRight <em>Right</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.ExprImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.ExprImpl#getType <em>Type</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.ExprImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.ExprImpl#getMethodCall <em>Method Call</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.ExprImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.ExprImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The default value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionType()
   * @generated
   * @ordered
   */
  protected static final String EXPRESSION_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionType()
   * @generated
   * @ordered
   */
  protected String expressionType = EXPRESSION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expr right;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expr expression;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * The cached value of the '{@link #getMethodCall() <em>Method Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodCall()
   * @generated
   * @ordered
   */
  protected MethodCall methodCall;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected NumberValue number;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expr left;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MiniJavaPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpressionType()
  {
    return expressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionType(String newExpressionType)
  {
    String oldExpressionType = expressionType;
    expressionType = newExpressionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__EXPRESSION_TYPE, oldExpressionType, expressionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expr newRight, NotificationChain msgs)
  {
    Expr oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expr newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expr newExpression, NotificationChain msgs)
  {
    Expr oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expr newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (Variable)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.EXPR__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable newVariable)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall getMethodCall()
  {
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodCall(MethodCall newMethodCall, NotificationChain msgs)
  {
    MethodCall oldMethodCall = methodCall;
    methodCall = newMethodCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__METHOD_CALL, oldMethodCall, newMethodCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodCall(MethodCall newMethodCall)
  {
    if (newMethodCall != methodCall)
    {
      NotificationChain msgs = null;
      if (methodCall != null)
        msgs = ((InternalEObject)methodCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__METHOD_CALL, null, msgs);
      if (newMethodCall != null)
        msgs = ((InternalEObject)newMethodCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__METHOD_CALL, null, msgs);
      msgs = basicSetMethodCall(newMethodCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__METHOD_CALL, newMethodCall, newMethodCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(NumberValue newNumber, NotificationChain msgs)
  {
    NumberValue oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(NumberValue newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expr newLeft, NotificationChain msgs)
  {
    Expr oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expr newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.EXPR__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.EXPR__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MiniJavaPackage.EXPR__RIGHT:
        return basicSetRight(null, msgs);
      case MiniJavaPackage.EXPR__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MiniJavaPackage.EXPR__TYPE:
        return basicSetType(null, msgs);
      case MiniJavaPackage.EXPR__METHOD_CALL:
        return basicSetMethodCall(null, msgs);
      case MiniJavaPackage.EXPR__NUMBER:
        return basicSetNumber(null, msgs);
      case MiniJavaPackage.EXPR__LEFT:
        return basicSetLeft(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MiniJavaPackage.EXPR__EXPRESSION_TYPE:
        return getExpressionType();
      case MiniJavaPackage.EXPR__RIGHT:
        return getRight();
      case MiniJavaPackage.EXPR__EXPRESSION:
        return getExpression();
      case MiniJavaPackage.EXPR__TYPE:
        return getType();
      case MiniJavaPackage.EXPR__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case MiniJavaPackage.EXPR__METHOD_CALL:
        return getMethodCall();
      case MiniJavaPackage.EXPR__NUMBER:
        return getNumber();
      case MiniJavaPackage.EXPR__LEFT:
        return getLeft();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniJavaPackage.EXPR__EXPRESSION_TYPE:
        setExpressionType((String)newValue);
        return;
      case MiniJavaPackage.EXPR__RIGHT:
        setRight((Expr)newValue);
        return;
      case MiniJavaPackage.EXPR__EXPRESSION:
        setExpression((Expr)newValue);
        return;
      case MiniJavaPackage.EXPR__TYPE:
        setType((Type)newValue);
        return;
      case MiniJavaPackage.EXPR__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case MiniJavaPackage.EXPR__METHOD_CALL:
        setMethodCall((MethodCall)newValue);
        return;
      case MiniJavaPackage.EXPR__NUMBER:
        setNumber((NumberValue)newValue);
        return;
      case MiniJavaPackage.EXPR__LEFT:
        setLeft((Expr)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MiniJavaPackage.EXPR__EXPRESSION_TYPE:
        setExpressionType(EXPRESSION_TYPE_EDEFAULT);
        return;
      case MiniJavaPackage.EXPR__RIGHT:
        setRight((Expr)null);
        return;
      case MiniJavaPackage.EXPR__EXPRESSION:
        setExpression((Expr)null);
        return;
      case MiniJavaPackage.EXPR__TYPE:
        setType((Type)null);
        return;
      case MiniJavaPackage.EXPR__VARIABLE:
        setVariable((Variable)null);
        return;
      case MiniJavaPackage.EXPR__METHOD_CALL:
        setMethodCall((MethodCall)null);
        return;
      case MiniJavaPackage.EXPR__NUMBER:
        setNumber((NumberValue)null);
        return;
      case MiniJavaPackage.EXPR__LEFT:
        setLeft((Expr)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MiniJavaPackage.EXPR__EXPRESSION_TYPE:
        return EXPRESSION_TYPE_EDEFAULT == null ? expressionType != null : !EXPRESSION_TYPE_EDEFAULT.equals(expressionType);
      case MiniJavaPackage.EXPR__RIGHT:
        return right != null;
      case MiniJavaPackage.EXPR__EXPRESSION:
        return expression != null;
      case MiniJavaPackage.EXPR__TYPE:
        return type != null;
      case MiniJavaPackage.EXPR__VARIABLE:
        return variable != null;
      case MiniJavaPackage.EXPR__METHOD_CALL:
        return methodCall != null;
      case MiniJavaPackage.EXPR__NUMBER:
        return number != null;
      case MiniJavaPackage.EXPR__LEFT:
        return left != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (expressionType: ");
    result.append(expressionType);
    result.append(')');
    return result.toString();
  }

} //ExprImpl