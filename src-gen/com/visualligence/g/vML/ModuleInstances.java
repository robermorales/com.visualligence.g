/**
 */
package com.visualligence.g.vML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.ModuleInstances#getName <em>Name</em>}</li>
 *   <li>{@link com.visualligence.g.vML.ModuleInstances#getDesc <em>Desc</em>}</li>
 *   <li>{@link com.visualligence.g.vML.ModuleInstances#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getModuleInstances()
 * @model
 * @generated
 */
public interface ModuleInstances extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.visualligence.g.vML.VMLPackage#getModuleInstances_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.visualligence.g.vML.ModuleInstances#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see com.visualligence.g.vML.VMLPackage#getModuleInstances_Desc()
	 * @model
	 * @generated
	 */
	Module getDesc();

	/**
	 * Sets the value of the '{@link com.visualligence.g.vML.ModuleInstances#getDesc <em>Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' reference.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(Module value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link com.visualligence.g.vML.Stream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see com.visualligence.g.vML.VMLPackage#getModuleInstances_Left()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stream> getLeft();

} // ModuleInstances
