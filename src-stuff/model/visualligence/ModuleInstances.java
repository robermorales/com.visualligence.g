/**
 */
package com.visualligence.g.model.visualligence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.model.visualligence.ModuleInstances#getDesc <em>Desc</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.ModuleInstances#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModuleInstances()
 * @model
 * @generated
 */
public interface ModuleInstances extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' reference.
	 * @see #setDesc(Module)
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModuleInstances_Desc()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Module getDesc();

	/**
	 * Sets the value of the '{@link com.visualligence.g.model.visualligence.ModuleInstances#getDesc <em>Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' reference.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(Module value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link com.visualligence.g.model.visualligence.Stream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModuleInstances_Left()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stream> getLeft();

} // ModuleInstances
