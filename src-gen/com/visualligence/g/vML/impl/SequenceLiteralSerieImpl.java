/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.LiteralExpression;
import com.visualligence.g.vML.SequenceLiteralSerie;
import com.visualligence.g.vML.VMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Literal Serie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.SequenceLiteralSerieImpl#getInit <em>Init</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.SequenceLiteralSerieImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.SequenceLiteralSerieImpl#getInc <em>Inc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceLiteralSerieImpl extends SequenceLiteralImpl implements SequenceLiteralSerie
{
  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected LiteralExpression init;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected LiteralExpression end;

  /**
   * The cached value of the '{@link #getInc() <em>Inc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInc()
   * @generated
   * @ordered
   */
  protected LiteralExpression inc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceLiteralSerieImpl()
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
    return VMLPackage.Literals.SEQUENCE_LITERAL_SERIE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(LiteralExpression newInit, NotificationChain msgs)
  {
    LiteralExpression oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.SEQUENCE_LITERAL_SERIE__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(LiteralExpression newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SEQUENCE_LITERAL_SERIE__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SEQUENCE_LITERAL_SERIE__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.SEQUENCE_LITERAL_SERIE__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(LiteralExpression newEnd, NotificationChain msgs)
  {
    LiteralExpression oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.SEQUENCE_LITERAL_SERIE__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(LiteralExpression newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SEQUENCE_LITERAL_SERIE__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SEQUENCE_LITERAL_SERIE__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.SEQUENCE_LITERAL_SERIE__END, newEnd, newEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getInc()
  {
    return inc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInc(LiteralExpression newInc, NotificationChain msgs)
  {
    LiteralExpression oldInc = inc;
    inc = newInc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.SEQUENCE_LITERAL_SERIE__INC, oldInc, newInc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInc(LiteralExpression newInc)
  {
    if (newInc != inc)
    {
      NotificationChain msgs = null;
      if (inc != null)
        msgs = ((InternalEObject)inc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SEQUENCE_LITERAL_SERIE__INC, null, msgs);
      if (newInc != null)
        msgs = ((InternalEObject)newInc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.SEQUENCE_LITERAL_SERIE__INC, null, msgs);
      msgs = basicSetInc(newInc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.SEQUENCE_LITERAL_SERIE__INC, newInc, newInc));
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
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INIT:
        return basicSetInit(null, msgs);
      case VMLPackage.SEQUENCE_LITERAL_SERIE__END:
        return basicSetEnd(null, msgs);
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INC:
        return basicSetInc(null, msgs);
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
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INIT:
        return getInit();
      case VMLPackage.SEQUENCE_LITERAL_SERIE__END:
        return getEnd();
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INC:
        return getInc();
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
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INIT:
        setInit((LiteralExpression)newValue);
        return;
      case VMLPackage.SEQUENCE_LITERAL_SERIE__END:
        setEnd((LiteralExpression)newValue);
        return;
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INC:
        setInc((LiteralExpression)newValue);
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
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INIT:
        setInit((LiteralExpression)null);
        return;
      case VMLPackage.SEQUENCE_LITERAL_SERIE__END:
        setEnd((LiteralExpression)null);
        return;
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INC:
        setInc((LiteralExpression)null);
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
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INIT:
        return init != null;
      case VMLPackage.SEQUENCE_LITERAL_SERIE__END:
        return end != null;
      case VMLPackage.SEQUENCE_LITERAL_SERIE__INC:
        return inc != null;
    }
    return super.eIsSet(featureID);
  }

} //SequenceLiteralSerieImpl
