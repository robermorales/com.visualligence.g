/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.UnitRef#getUnittype <em>Unittype</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getUnitRef()
 * @model
 * @generated
 */
public interface UnitRef extends PlainTypeRef
{
  /**
   * Returns the value of the '<em><b>Unittype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unittype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unittype</em>' reference.
   * @see #setUnittype(Unit)
   * @see com.visualligence.g.vML.VMLPackage#getUnitRef_Unittype()
   * @model
   * @generated
   */
  Unit getUnittype();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.UnitRef#getUnittype <em>Unittype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unittype</em>' reference.
   * @see #getUnittype()
   * @generated
   */
  void setUnittype(Unit value);

} // UnitRef
