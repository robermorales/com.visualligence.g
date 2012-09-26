/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.Unit;
import com.visualligence.g.vML.UnitRef;
import com.visualligence.g.vML.VMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.UnitRefImpl#getUnittype <em>Unittype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitRefImpl extends PlainTypeRefImpl implements UnitRef
{
  /**
   * The cached value of the '{@link #getUnittype() <em>Unittype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnittype()
   * @generated
   * @ordered
   */
  protected Unit unittype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnitRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VMLPackage.Literals.UNIT_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit getUnittype()
  {
    if (unittype != null && unittype.eIsProxy())
    {
      InternalEObject oldUnittype = (InternalEObject)unittype;
      unittype = (Unit)eResolveProxy(oldUnittype);
      if (unittype != oldUnittype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMLPackage.UNIT_REF__UNITTYPE, oldUnittype, unittype));
      }
    }
    return unittype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit basicGetUnittype()
  {
    return unittype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnittype(Unit newUnittype)
  {
    Unit oldUnittype = unittype;
    unittype = newUnittype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.UNIT_REF__UNITTYPE, oldUnittype, unittype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VMLPackage.UNIT_REF__UNITTYPE:
        if (resolve) return getUnittype();
        return basicGetUnittype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VMLPackage.UNIT_REF__UNITTYPE:
        setUnittype((Unit)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VMLPackage.UNIT_REF__UNITTYPE:
        setUnittype((Unit)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VMLPackage.UNIT_REF__UNITTYPE:
        return unittype != null;
    }
    return super.eIsSet(featureID);
  }

} //UnitRefImpl
