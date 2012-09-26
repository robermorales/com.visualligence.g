/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.Constant;
import com.visualligence.g.vML.ConstantRef;
import com.visualligence.g.vML.VMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.ConstantRefImpl#getConstantref <em>Constantref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantRefImpl extends RValueImpl implements ConstantRef
{
  /**
   * The cached value of the '{@link #getConstantref() <em>Constantref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantref()
   * @generated
   * @ordered
   */
  protected Constant constantref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantRefImpl()
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
    return VMLPackage.Literals.CONSTANT_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant getConstantref()
  {
    if (constantref != null && constantref.eIsProxy())
    {
      InternalEObject oldConstantref = (InternalEObject)constantref;
      constantref = (Constant)eResolveProxy(oldConstantref);
      if (constantref != oldConstantref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMLPackage.CONSTANT_REF__CONSTANTREF, oldConstantref, constantref));
      }
    }
    return constantref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant basicGetConstantref()
  {
    return constantref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantref(Constant newConstantref)
  {
    Constant oldConstantref = constantref;
    constantref = newConstantref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.CONSTANT_REF__CONSTANTREF, oldConstantref, constantref));
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
      case VMLPackage.CONSTANT_REF__CONSTANTREF:
        if (resolve) return getConstantref();
        return basicGetConstantref();
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
      case VMLPackage.CONSTANT_REF__CONSTANTREF:
        setConstantref((Constant)newValue);
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
      case VMLPackage.CONSTANT_REF__CONSTANTREF:
        setConstantref((Constant)null);
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
      case VMLPackage.CONSTANT_REF__CONSTANTREF:
        return constantref != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstantRefImpl
