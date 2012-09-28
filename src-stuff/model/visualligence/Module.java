/**
 */
package com.visualligence.g.model.visualligence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.model.visualligence.Module#getInput <em>Input</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.Module#getOutput <em>Output</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.Module#getInstances <em>Instances</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.Module#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link com.visualligence.g.model.visualligence.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModule_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link com.visualligence.g.model.visualligence.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModule_Output()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link com.visualligence.g.model.visualligence.ModuleInstances}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModule_Instances()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModuleInstances> getInstances();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.visualligence.g.model.visualligence.TypeDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModule_Types()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TypeDecl> getTypes();

} // Module
