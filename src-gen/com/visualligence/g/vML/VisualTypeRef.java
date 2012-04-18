/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.VisualTypeRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getVisualTypeRef()
 * @model
 * @generated
 */
public interface VisualTypeRef extends PlainTypeRef
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * The literals are from the enumeration {@link com.visualligence.g.vML.VisualType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see com.visualligence.g.vML.VisualType
   * @see #setRef(VisualType)
   * @see com.visualligence.g.vML.VMLPackage#getVisualTypeRef_Ref()
   * @model
   * @generated
   */
  VisualType getRef();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.VisualTypeRef#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see com.visualligence.g.vML.VisualType
   * @see #getRef()
   * @generated
   */
  void setRef(VisualType value);

} // VisualTypeRef
