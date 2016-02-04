/**
 * generated by Xtext 2.9.1
 */
package demidov.projects.miniJava.impl;

import demidov.projects.miniJava.Expr;
import demidov.projects.miniJava.Method;
import demidov.projects.miniJava.MiniJavaPackage;
import demidov.projects.miniJava.Statement;
import demidov.projects.miniJava.Type;
import demidov.projects.miniJava.VarDeclaration;
import demidov.projects.miniJava.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demidov.projects.miniJava.impl.MethodImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.MethodImpl#getFormalVarDeclarations <em>Formal Var Declarations</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.MethodImpl#getLocalVarDeclarations <em>Local Var Declarations</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.MethodImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.MethodImpl#getReturnExpression <em>Return Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method
{
  /**
   * The cached value of the '{@link #getMethodType() <em>Method Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodType()
   * @generated
   * @ordered
   */
  protected Type methodType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormalVarDeclarations() <em>Formal Var Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalVarDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Variable> formalVarDeclarations;

  /**
   * The cached value of the '{@link #getLocalVarDeclarations() <em>Local Var Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalVarDeclarations()
   * @generated
   * @ordered
   */
  protected EList<VarDeclaration> localVarDeclarations;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getReturnExpression() <em>Return Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnExpression()
   * @generated
   * @ordered
   */
  protected Expr returnExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
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
    return MiniJavaPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getMethodType()
  {
    return methodType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodType(Type newMethodType, NotificationChain msgs)
  {
    Type oldMethodType = methodType;
    methodType = newMethodType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__METHOD_TYPE, oldMethodType, newMethodType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodType(Type newMethodType)
  {
    if (newMethodType != methodType)
    {
      NotificationChain msgs = null;
      if (methodType != null)
        msgs = ((InternalEObject)methodType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD__METHOD_TYPE, null, msgs);
      if (newMethodType != null)
        msgs = ((InternalEObject)newMethodType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD__METHOD_TYPE, null, msgs);
      msgs = basicSetMethodType(newMethodType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__METHOD_TYPE, newMethodType, newMethodType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getFormalVarDeclarations()
  {
    if (formalVarDeclarations == null)
    {
      formalVarDeclarations = new EObjectContainmentEList<Variable>(Variable.class, this, MiniJavaPackage.METHOD__FORMAL_VAR_DECLARATIONS);
    }
    return formalVarDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarDeclaration> getLocalVarDeclarations()
  {
    if (localVarDeclarations == null)
    {
      localVarDeclarations = new EObjectContainmentEList<VarDeclaration>(VarDeclaration.class, this, MiniJavaPackage.METHOD__LOCAL_VAR_DECLARATIONS);
    }
    return localVarDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, MiniJavaPackage.METHOD__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getReturnExpression()
  {
    return returnExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnExpression(Expr newReturnExpression, NotificationChain msgs)
  {
    Expr oldReturnExpression = returnExpression;
    returnExpression = newReturnExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__RETURN_EXPRESSION, oldReturnExpression, newReturnExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnExpression(Expr newReturnExpression)
  {
    if (newReturnExpression != returnExpression)
    {
      NotificationChain msgs = null;
      if (returnExpression != null)
        msgs = ((InternalEObject)returnExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD__RETURN_EXPRESSION, null, msgs);
      if (newReturnExpression != null)
        msgs = ((InternalEObject)newReturnExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD__RETURN_EXPRESSION, null, msgs);
      msgs = basicSetReturnExpression(newReturnExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__RETURN_EXPRESSION, newReturnExpression, newReturnExpression));
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
      case MiniJavaPackage.METHOD__METHOD_TYPE:
        return basicSetMethodType(null, msgs);
      case MiniJavaPackage.METHOD__FORMAL_VAR_DECLARATIONS:
        return ((InternalEList<?>)getFormalVarDeclarations()).basicRemove(otherEnd, msgs);
      case MiniJavaPackage.METHOD__LOCAL_VAR_DECLARATIONS:
        return ((InternalEList<?>)getLocalVarDeclarations()).basicRemove(otherEnd, msgs);
      case MiniJavaPackage.METHOD__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case MiniJavaPackage.METHOD__RETURN_EXPRESSION:
        return basicSetReturnExpression(null, msgs);
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
      case MiniJavaPackage.METHOD__METHOD_TYPE:
        return getMethodType();
      case MiniJavaPackage.METHOD__NAME:
        return getName();
      case MiniJavaPackage.METHOD__FORMAL_VAR_DECLARATIONS:
        return getFormalVarDeclarations();
      case MiniJavaPackage.METHOD__LOCAL_VAR_DECLARATIONS:
        return getLocalVarDeclarations();
      case MiniJavaPackage.METHOD__STATEMENTS:
        return getStatements();
      case MiniJavaPackage.METHOD__RETURN_EXPRESSION:
        return getReturnExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniJavaPackage.METHOD__METHOD_TYPE:
        setMethodType((Type)newValue);
        return;
      case MiniJavaPackage.METHOD__NAME:
        setName((String)newValue);
        return;
      case MiniJavaPackage.METHOD__FORMAL_VAR_DECLARATIONS:
        getFormalVarDeclarations().clear();
        getFormalVarDeclarations().addAll((Collection<? extends Variable>)newValue);
        return;
      case MiniJavaPackage.METHOD__LOCAL_VAR_DECLARATIONS:
        getLocalVarDeclarations().clear();
        getLocalVarDeclarations().addAll((Collection<? extends VarDeclaration>)newValue);
        return;
      case MiniJavaPackage.METHOD__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case MiniJavaPackage.METHOD__RETURN_EXPRESSION:
        setReturnExpression((Expr)newValue);
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
      case MiniJavaPackage.METHOD__METHOD_TYPE:
        setMethodType((Type)null);
        return;
      case MiniJavaPackage.METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MiniJavaPackage.METHOD__FORMAL_VAR_DECLARATIONS:
        getFormalVarDeclarations().clear();
        return;
      case MiniJavaPackage.METHOD__LOCAL_VAR_DECLARATIONS:
        getLocalVarDeclarations().clear();
        return;
      case MiniJavaPackage.METHOD__STATEMENTS:
        getStatements().clear();
        return;
      case MiniJavaPackage.METHOD__RETURN_EXPRESSION:
        setReturnExpression((Expr)null);
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
      case MiniJavaPackage.METHOD__METHOD_TYPE:
        return methodType != null;
      case MiniJavaPackage.METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MiniJavaPackage.METHOD__FORMAL_VAR_DECLARATIONS:
        return formalVarDeclarations != null && !formalVarDeclarations.isEmpty();
      case MiniJavaPackage.METHOD__LOCAL_VAR_DECLARATIONS:
        return localVarDeclarations != null && !localVarDeclarations.isEmpty();
      case MiniJavaPackage.METHOD__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case MiniJavaPackage.METHOD__RETURN_EXPRESSION:
        return returnExpression != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MethodImpl