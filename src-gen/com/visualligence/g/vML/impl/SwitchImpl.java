/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.LiteralExpression;
import com.visualligence.g.vML.Switch;
import com.visualligence.g.vML.VMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.SwitchImpl#getTest <em>Test</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.SwitchImpl#getA <em>A</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.SwitchImpl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends NodeImpl implements Switch
{
  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected LiteralExpression test;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected LiteralExpression a;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected LiteralExpression b;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchImpl()
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
    return VMLPackage.Literals.SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTest(LiteralExpression newTest, NotificationChain msgs)
  {
    LiteralExpression oldTest = test;
    test = newTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.SWITCH__TEST, oldTest, newTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest(LiteralExpression newTest)
  {
    if (newTest != test)
    {
      NotificationChain msgs = null;
      if (test != null)
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SWITCH__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SWITCH__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.SWITCH__TEST, newTest, newTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(LiteralExpression newA, NotificationChain msgs)
  {
    LiteralExpression oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.SWITCH__A, oldA, newA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(LiteralExpression newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SWITCH__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SWITCH__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.SWITCH__A, newA, newA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(LiteralExpression newB, NotificationChain msgs)
  {
    LiteralExpression oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.SWITCH__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(LiteralExpression newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SWITCH__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SWITCH__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.SWITCH__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VMLPackage.SWITCH__TEST:
        return basicSetTest(null, msgs);
      case VMLPackage.SWITCH__A:
        return basicSetA(null, msgs);
      case VMLPackage.SWITCH__B:
        return basicSetB(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case VMLPackage.SWITCH__TEST:
        return getTest();
      case VMLPackage.SWITCH__A:
        return getA();
      case VMLPackage.SWITCH__B:
        return getB();
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
      case VMLPackage.SWITCH__TEST:
        setTest((LiteralExpression)newValue);
        return;
      case VMLPackage.SWITCH__A:
        setA((LiteralExpression)newValue);
        return;
      case VMLPackage.SWITCH__B:
        setB((LiteralExpression)newValue);
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
      case VMLPackage.SWITCH__TEST:
        setTest((LiteralExpression)null);
        return;
      case VMLPackage.SWITCH__A:
        setA((LiteralExpression)null);
        return;
      case VMLPackage.SWITCH__B:
        setB((LiteralExpression)null);
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
      case VMLPackage.SWITCH__TEST:
        return test != null;
      case VMLPackage.SWITCH__A:
        return a != null;
      case VMLPackage.SWITCH__B:
        return b != null;
    }
    return super.eIsSet(featureID);
  }

} //SwitchImpl
