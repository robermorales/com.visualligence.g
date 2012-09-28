/**
 */
package com.visualligence.g.model.visualligence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.model.visualligence.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDecl)
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getTypedElement_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TypeDecl getType();

	/**
	 * Sets the value of the '{@link com.visualligence.g.model.visualligence.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDecl value);

} // TypedElement
