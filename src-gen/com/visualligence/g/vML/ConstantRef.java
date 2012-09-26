/**
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.ConstantRef#getConstantref <em>Constantref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getConstantRef()
 * @model
 * @generated
 */
public interface ConstantRef extends RValue
{
  /**
   * Returns the value of the '<em><b>Constantref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constantref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constantref</em>' reference.
   * @see #setConstantref(Constant)
   * @see com.visualligence.g.vML.VMLPackage#getConstantRef_Constantref()
   * @model
   * @generated
   */
  Constant getConstantref();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.ConstantRef#getConstantref <em>Constantref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constantref</em>' reference.
   * @see #getConstantref()
   * @generated
   */
  void setConstantref(Constant value);

} // ConstantRef
