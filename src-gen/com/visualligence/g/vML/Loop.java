/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.Loop#getIt <em>It</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Loop#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Node
{
  /**
   * Returns the value of the '<em><b>It</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>It</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>It</em>' containment reference.
   * @see #setIt(LoopFor)
   * @see com.visualligence.g.vML.VMLPackage#getLoop_It()
   * @model containment="true"
   * @generated
   */
  LoopFor getIt();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Loop#getIt <em>It</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>It</em>' containment reference.
   * @see #getIt()
   * @generated
   */
  void setIt(LoopFor value);

  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link com.visualligence.g.vML.LoopSentence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see com.visualligence.g.vML.VMLPackage#getLoop_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<LoopSentence> getSentences();

} // Loop
