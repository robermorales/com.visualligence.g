/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aux Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.AuxTypeRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getAuxTypeRef()
 * @model
 * @generated
 */
public interface AuxTypeRef extends PlainTypeRef
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * The literals are from the enumeration {@link com.visualligence.g.vML.AuxType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see com.visualligence.g.vML.AuxType
   * @see #setRef(AuxType)
   * @see com.visualligence.g.vML.VMLPackage#getAuxTypeRef_Ref()
   * @model
   * @generated
   */
  AuxType getRef();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.AuxTypeRef#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see com.visualligence.g.vML.AuxType
   * @see #getRef()
   * @generated
   */
  void setRef(AuxType value);

} // AuxTypeRef
