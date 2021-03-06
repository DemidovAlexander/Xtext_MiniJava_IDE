/**
 * generated by Xtext 2.9.1
 */
package demidov.projects.miniJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demidov.projects.miniJava.Type#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link demidov.projects.miniJava.Type#getClassDecl <em>Class Decl</em>}</li>
 * </ul>
 *
 * @see demidov.projects.miniJava.MiniJavaPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' attribute.
   * @see #setTypeName(String)
   * @see demidov.projects.miniJava.MiniJavaPackage#getType_TypeName()
   * @model
   * @generated
   */
  String getTypeName();

  /**
   * Sets the value of the '{@link demidov.projects.miniJava.Type#getTypeName <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' attribute.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(String value);

  /**
   * Returns the value of the '<em><b>Class Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Decl</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Decl</em>' reference.
   * @see #setClassDecl(ClassDecl)
   * @see demidov.projects.miniJava.MiniJavaPackage#getType_ClassDecl()
   * @model
   * @generated
   */
  ClassDecl getClassDecl();

  /**
   * Sets the value of the '{@link demidov.projects.miniJava.Type#getClassDecl <em>Class Decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Decl</em>' reference.
   * @see #getClassDecl()
   * @generated
   */
  void setClassDecl(ClassDecl value);

} // Type
