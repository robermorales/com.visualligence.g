/**
 */
package com.visualligence.g.vML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invokation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.Invokation#getModule <em>Module</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Invokation#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getInvokation()
 * @model
 * @generated
 */
public interface Invokation extends Node
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' attribute.
   * @see #setModule(String)
   * @see com.visualligence.g.vML.VMLPackage#getInvokation_Module()
   * @model
   * @generated
   */
  String getModule();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Invokation#getModule <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' attribute.
   * @see #getModule()
   * @generated
   */
  void setModule(String value);

  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link com.visualligence.g.vML.InvokationParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see com.visualligence.g.vML.VMLPackage#getInvokation_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<InvokationParam> getSentences();

} // Invokation
