/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.NumberTypeRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getNumberTypeRef()
 * @model
 * @generated
 */
public interface NumberTypeRef extends PlainTypeRef
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * The literals are from the enumeration {@link com.visualligence.g.vML.NumberType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see com.visualligence.g.vML.NumberType
   * @see #setRef(NumberType)
   * @see com.visualligence.g.vML.VMLPackage#getNumberTypeRef_Ref()
   * @model
   * @generated
   */
  NumberType getRef();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.NumberTypeRef#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see com.visualligence.g.vML.NumberType
   * @see #getRef()
   * @generated
   */
  void setRef(NumberType value);

} // NumberTypeRef
