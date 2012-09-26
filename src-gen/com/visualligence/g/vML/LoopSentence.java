/**
 */
package com.visualligence.g.vML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.LoopSentence#getName <em>Name</em>}</li>
 *   <li>{@link com.visualligence.g.vML.LoopSentence#getType <em>Type</em>}</li>
 *   <li>{@link com.visualligence.g.vML.LoopSentence#getO <em>O</em>}</li>
 *   <li>{@link com.visualligence.g.vML.LoopSentence#getI <em>I</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getLoopSentence()
 * @model
 * @generated
 */
public interface LoopSentence extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.visualligence.g.vML.VMLPackage#getLoopSentence_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.LoopSentence#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeRef)
   * @see com.visualligence.g.vML.VMLPackage#getLoopSentence_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.LoopSentence#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

  /**
   * Returns the value of the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>O</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>O</em>' containment reference.
   * @see #setO(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getLoopSentence_O()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getO();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.LoopSentence#getO <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>O</em>' containment reference.
   * @see #getO()
   * @generated
   */
  void setO(LiteralExpression value);

  /**
   * Returns the value of the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' containment reference.
   * @see #setI(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getLoopSentence_I()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getI();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.LoopSentence#getI <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' containment reference.
   * @see #getI()
   * @generated
   */
  void setI(LiteralExpression value);

} // LoopSentence
