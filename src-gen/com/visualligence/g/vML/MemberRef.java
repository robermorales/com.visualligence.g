/**
 */
package com.visualligence.g.vML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.MemberRef#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getMemberRef()
 * @model
 * @generated
 */
public interface MemberRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' reference.
   * @see #setMember(LoopSentence)
   * @see com.visualligence.g.vML.VMLPackage#getMemberRef_Member()
   * @model
   * @generated
   */
  LoopSentence getMember();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.MemberRef#getMember <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' reference.
   * @see #getMember()
   * @generated
   */
  void setMember(LoopSentence value);

} // MemberRef
