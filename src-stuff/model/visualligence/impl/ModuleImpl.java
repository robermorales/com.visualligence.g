/**
 */
package com.visualligence.g.model.visualligence.impl;

import com.visualligence.g.model.visualligence.Input;
import com.visualligence.g.model.visualligence.Module;
import com.visualligence.g.model.visualligence.ModuleInstances;
import com.visualligence.g.model.visualligence.Output;
import com.visualligence.g.model.visualligence.TypeDecl;
import com.visualligence.g.model.visualligence.VisualligencePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.model.visualligence.impl.ModuleImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.impl.ModuleImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.impl.ModuleImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.impl.ModuleImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends NamedElementImpl implements Module {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleInstances> instances;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDecl> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualligencePackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Input>(Input.class, this, VisualligencePackage.MODULE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Output>(Output.class, this, VisualligencePackage.MODULE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleInstances> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<ModuleInstances>(ModuleInstances.class, this, VisualligencePackage.MODULE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDecl> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<TypeDecl>(TypeDecl.class, this, VisualligencePackage.MODULE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualligencePackage.MODULE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case VisualligencePackage.MODULE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case VisualligencePackage.MODULE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case VisualligencePackage.MODULE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualligencePackage.MODULE__INPUT:
				return getInput();
			case VisualligencePackage.MODULE__OUTPUT:
				return getOutput();
			case VisualligencePackage.MODULE__INSTANCES:
				return getInstances();
			case VisualligencePackage.MODULE__TYPES:
				return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualligencePackage.MODULE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Input>)newValue);
				return;
			case VisualligencePackage.MODULE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Output>)newValue);
				return;
			case VisualligencePackage.MODULE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ModuleInstances>)newValue);
				return;
			case VisualligencePackage.MODULE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TypeDecl>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisualligencePackage.MODULE__INPUT:
				getInput().clear();
				return;
			case VisualligencePackage.MODULE__OUTPUT:
				getOutput().clear();
				return;
			case VisualligencePackage.MODULE__INSTANCES:
				getInstances().clear();
				return;
			case VisualligencePackage.MODULE__TYPES:
				getTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisualligencePackage.MODULE__INPUT:
				return input != null && !input.isEmpty();
			case VisualligencePackage.MODULE__OUTPUT:
				return output != null && !output.isEmpty();
			case VisualligencePackage.MODULE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case VisualligencePackage.MODULE__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
