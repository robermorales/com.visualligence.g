/**
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.NativeType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getNativeType()
 * @model
 * @generated
 */
public interface NativeType extends TypeDecl {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(NativeTypeOptions)
	 * @see com.visualligence.g.vML.VMLPackage#getNativeType_Type()
	 * @model containment="true"
	 * @generated
	 */
	NativeTypeOptions getType();

	/**
	 * Sets the value of the '{@link com.visualligence.g.vML.NativeType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NativeTypeOptions value);

} // NativeType
