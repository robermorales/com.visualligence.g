/**
 */
package com.visualligence.g.model.visualligence.impl;

import com.visualligence.g.model.visualligence.Module;
import com.visualligence.g.model.visualligence.ModuleInstances;
import com.visualligence.g.model.visualligence.Stream;
import com.visualligence.g.model.visualligence.VisualligencePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.model.visualligence.impl.ModuleInstancesImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link com.visualligence.g.model.visualligence.impl.ModuleInstancesImpl#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleInstancesImpl extends NamedElementImpl implements ModuleInstances {
	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected Module desc;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<Stream> left;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualligencePackage.Literals.MODULE_INSTANCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getDesc() {
		if (desc != null && desc.eIsProxy()) {
			InternalEObject oldDesc = (InternalEObject)desc;
			desc = (Module)eResolveProxy(oldDesc);
			if (desc != oldDesc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualligencePackage.MODULE_INSTANCES__DESC, oldDesc, desc));
			}
		}
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(Module newDesc) {
		Module oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualligencePackage.MODULE_INSTANCES__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stream> getLeft() {
		if (left == null) {
			left = new EObjectContainmentEList<Stream>(Stream.class, this, VisualligencePackage.MODULE_INSTANCES__LEFT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualligencePackage.MODULE_INSTANCES__LEFT:
				return ((InternalEList<?>)getLeft()).basicRemove(otherEnd, msgs);
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
			case VisualligencePackage.MODULE_INSTANCES__DESC:
				if (resolve) return getDesc();
				return basicGetDesc();
			case VisualligencePackage.MODULE_INSTANCES__LEFT:
				return getLeft();
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
			case VisualligencePackage.MODULE_INSTANCES__DESC:
				setDesc((Module)newValue);
				return;
			case VisualligencePackage.MODULE_INSTANCES__LEFT:
				getLeft().clear();
				getLeft().addAll((Collection<? extends Stream>)newValue);
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
			case VisualligencePackage.MODULE_INSTANCES__DESC:
				setDesc((Module)null);
				return;
			case VisualligencePackage.MODULE_INSTANCES__LEFT:
				getLeft().clear();
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
			case VisualligencePackage.MODULE_INSTANCES__DESC:
				return desc != null;
			case VisualligencePackage.MODULE_INSTANCES__LEFT:
				return left != null && !left.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleInstancesImpl
