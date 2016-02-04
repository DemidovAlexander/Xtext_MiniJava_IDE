/**
 * generated by Xtext 2.9.1
 */
package demidov.projects.miniJava.impl;

import demidov.projects.miniJava.Expr;
import demidov.projects.miniJava.Method;
import demidov.projects.miniJava.MethodCall;
import demidov.projects.miniJava.MiniJavaPackage;

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
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demidov.projects.miniJava.impl.MethodCallImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link demidov.projects.miniJava.impl.MethodCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallImpl extends MinimalEObjectImpl.Container implements MethodCall
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Method method;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Expr> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodCallImpl()
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
    return MiniJavaPackage.Literals.METHOD_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getMethod()
  {
    if (method != null && method.eIsProxy())
    {
      InternalEObject oldMethod = (InternalEObject)method;
      method = (Method)eResolveProxy(oldMethod);
      if (method != oldMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.METHOD_CALL__METHOD, oldMethod, method));
      }
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method basicGetMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Method newMethod)
  {
    Method oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD_CALL__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Expr>(Expr.class, this, MiniJavaPackage.METHOD_CALL__PARAMETERS);
    }
    return parameters;
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
      case MiniJavaPackage.METHOD_CALL__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case MiniJavaPackage.METHOD_CALL__METHOD:
        if (resolve) return getMethod();
        return basicGetMethod();
      case MiniJavaPackage.METHOD_CALL__PARAMETERS:
        return getParameters();
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
      case MiniJavaPackage.METHOD_CALL__METHOD:
        setMethod((Method)newValue);
        return;
      case MiniJavaPackage.METHOD_CALL__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Expr>)newValue);
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
      case MiniJavaPackage.METHOD_CALL__METHOD:
        setMethod((Method)null);
        return;
      case MiniJavaPackage.METHOD_CALL__PARAMETERS:
        getParameters().clear();
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
      case MiniJavaPackage.METHOD_CALL__METHOD:
        return method != null;
      case MiniJavaPackage.METHOD_CALL__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodCallImpl
