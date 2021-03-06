/**
 * generated by Xtext 2.9.1
 */
package demidov.projects.miniJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demidov.projects.miniJava.MethodCall#getMethod <em>Method</em>}</li>
 *   <li>{@link demidov.projects.miniJava.MethodCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see demidov.projects.miniJava.MiniJavaPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(Method)
   * @see demidov.projects.miniJava.MiniJavaPackage#getMethodCall_Method()
   * @model
   * @generated
   */
  Method getMethod();

  /**
   * Sets the value of the '{@link demidov.projects.miniJava.MethodCall#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Method value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link demidov.projects.miniJava.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see demidov.projects.miniJava.MiniJavaPackage#getMethodCall_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getParameters();

} // MethodCall
