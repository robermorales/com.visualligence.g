/**
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NUnit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.NUnit#getNumbertype <em>Numbertype</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getNUnit()
 * @model
 * @generated
 */
public interface NUnit extends Unit
{
  /**
   * Returns the value of the '<em><b>Numbertype</b></em>' attribute.
   * The literals are from the enumeration {@link com.visualligence.g.vML.NumberType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numbertype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numbertype</em>' attribute.
   * @see com.visualligence.g.vML.NumberType
   * @see #setNumbertype(NumberType)
   * @see com.visualligence.g.vML.VMLPackage#getNUnit_Numbertype()
   * @model
   * @generated
   */
  NumberType getNumbertype();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.NUnit#getNumbertype <em>Numbertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numbertype</em>' attribute.
   * @see com.visualligence.g.vML.NumberType
   * @see #getNumbertype()
   * @generated
   */
  void setNumbertype(NumberType value);

} // NUnit
