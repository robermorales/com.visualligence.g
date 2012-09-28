/**
 */
package com.visualligence.g.model.visualligence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.model.visualligence.NativeType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getNativeType()
 * @model
 * @generated
 */
public interface NativeType extends TypeDecl {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.visualligence.g.model.visualligence.NativeTypeOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.visualligence.g.model.visualligence.NativeTypeOptions
	 * @see #setType(NativeTypeOptions)
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getNativeType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NativeTypeOptions getType();

	/**
	 * Sets the value of the '{@link com.visualligence.g.model.visualligence.NativeType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.visualligence.g.model.visualligence.NativeTypeOptions
	 * @see #getType()
	 * @generated
	 */
	void setType(NativeTypeOptions value);

} // NativeType
