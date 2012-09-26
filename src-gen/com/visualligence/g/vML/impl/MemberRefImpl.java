/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.LoopSentence;
import com.visualligence.g.vML.MemberRef;
import com.visualligence.g.vML.VMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.MemberRefImpl#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberRefImpl extends MinimalEObjectImpl.Container implements MemberRef
{
  /**
   * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected LoopSentence member;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemberRefImpl()
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
    return VMLPackage.Literals.MEMBER_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopSentence getMember()
  {
    if (member != null && member.eIsProxy())
    {
      InternalEObject oldMember = (InternalEObject)member;
      member = (LoopSentence)eResolveProxy(oldMember);
      if (member != oldMember)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMLPackage.MEMBER_REF__MEMBER, oldMember, member));
      }
    }
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopSentence basicGetMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(LoopSentence newMember)
  {
    LoopSentence oldMember = member;
    member = newMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.MEMBER_REF__MEMBER, oldMember, member));
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
      case VMLPackage.MEMBER_REF__MEMBER:
        if (resolve) return getMember();
        return basicGetMember();
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
      case VMLPackage.MEMBER_REF__MEMBER:
        setMember((LoopSentence)newValue);
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
      case VMLPackage.MEMBER_REF__MEMBER:
        setMember((LoopSentence)null);
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
      case VMLPackage.MEMBER_REF__MEMBER:
        return member != null;
    }
    return super.eIsSet(featureID);
  }

} //MemberRefImpl
