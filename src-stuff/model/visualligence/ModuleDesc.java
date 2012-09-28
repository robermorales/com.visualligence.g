/**
 */
package com.visualligence.g.model.visualligence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Desc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.model.visualligence.ModuleDesc#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.ModuleDesc#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.ModuleDesc#getInstances <em>Instances</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.ModuleDesc#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModuleDesc()
 * @model
 * @generated
 */
public interface ModuleDesc extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.visualligence.g.model.visualligence.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModuleDesc_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.visualligence.g.model.visualligence.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModuleDesc_Outputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Output> getOutputs();

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
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModuleDesc_Instances()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModuleInstances> getInstances();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(Type)
	 * @see com.visualligence.g.model.visualligence.VisualligencePackage#getModuleDesc_Types()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Type getTypes();

	/**
	 * Sets the value of the '{@link com.visualligence.g.model.visualligence.ModuleDesc#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(Type value);

} // ModuleDesc
