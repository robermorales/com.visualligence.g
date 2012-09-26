/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.NUnit;
import com.visualligence.g.vML.NumberType;
import com.visualligence.g.vML.VMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NUnit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.NUnitImpl#getNumbertype <em>Numbertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUnitImpl extends UnitImpl implements NUnit
{
  /**
   * The default value of the '{@link #getNumbertype() <em>Numbertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumbertype()
   * @generated
   * @ordered
   */
  protected static final NumberType NUMBERTYPE_EDEFAULT = NumberType.POSITIVE;

  /**
   * The cached value of the '{@link #getNumbertype() <em>Numbertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumbertype()
   * @generated
   * @ordered
   */
  protected NumberType numbertype = NUMBERTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NUnitImpl()
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
    return VMLPackage.Literals.NUNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberType getNumbertype()
  {
    return numbertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumbertype(NumberType newNumbertype)
  {
    NumberType oldNumbertype = numbertype;
    numbertype = newNumbertype == null ? NUMBERTYPE_EDEFAULT : newNumbertype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.NUNIT__NUMBERTYPE, oldNumbertype, numbertype));
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
      case VMLPackage.NUNIT__NUMBERTYPE:
        return getNumbertype();
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
      case VMLPackage.NUNIT__NUMBERTYPE:
        setNumbertype((NumberType)newValue);
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
      case VMLPackage.NUNIT__NUMBERTYPE:
        setNumbertype(NUMBERTYPE_EDEFAULT);
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
      case VMLPackage.NUNIT__NUMBERTYPE:
        return numbertype != NUMBERTYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (numbertype: ");
    result.append(numbertype);
    result.append(')');
    return result.toString();
  }

} //NUnitImpl
