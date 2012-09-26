/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.LiteralExpression;
import com.visualligence.g.vML.LoopSentence;
import com.visualligence.g.vML.TypeRef;
import com.visualligence.g.vML.VMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.LoopSentenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.LoopSentenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.LoopSentenceImpl#getO <em>O</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.LoopSentenceImpl#getI <em>I</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopSentenceImpl extends MinimalEObjectImpl.Container implements LoopSentence
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeRef type;

  /**
   * The cached value of the '{@link #getO() <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected LiteralExpression o;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected LiteralExpression i;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopSentenceImpl()
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
    return VMLPackage.Literals.LOOP_SENTENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP_SENTENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeRef newType, NotificationChain msgs)
  {
    TypeRef oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP_SENTENCE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeRef newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.LOOP_SENTENCE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.LOOP_SENTENCE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP_SENTENCE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getO()
  {
    return o;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetO(LiteralExpression newO, NotificationChain msgs)
  {
    LiteralExpression oldO = o;
    o = newO;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP_SENTENCE__O, oldO, newO);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setO(LiteralExpression newO)
  {
    if (newO != o)
    {
      NotificationChain msgs = null;
      if (o != null)
        msgs = ((InternalEObject)o).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.LOOP_SENTENCE__O, null, msgs);
      if (newO != null)
        msgs = ((InternalEObject)newO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.LOOP_SENTENCE__O, null, msgs);
      msgs = basicSetO(newO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP_SENTENCE__O, newO, newO));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI(LiteralExpression newI, NotificationChain msgs)
  {
    LiteralExpression oldI = i;
    i = newI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP_SENTENCE__I, oldI, newI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(LiteralExpression newI)
  {
    if (newI != i)
    {
      NotificationChain msgs = null;
      if (i != null)
        msgs = ((InternalEObject)i).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.LOOP_SENTENCE__I, null, msgs);
      if (newI != null)
        msgs = ((InternalEObject)newI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.LOOP_SENTENCE__I, null, msgs);
      msgs = basicSetI(newI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP_SENTENCE__I, newI, newI));
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
      case VMLPackage.LOOP_SENTENCE__TYPE:
        return basicSetType(null, msgs);
      case VMLPackage.LOOP_SENTENCE__O:
        return basicSetO(null, msgs);
      case VMLPackage.LOOP_SENTENCE__I:
        return basicSetI(null, msgs);
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
      case VMLPackage.LOOP_SENTENCE__NAME:
        return getName();
      case VMLPackage.LOOP_SENTENCE__TYPE:
        return getType();
      case VMLPackage.LOOP_SENTENCE__O:
        return getO();
      case VMLPackage.LOOP_SENTENCE__I:
        return getI();
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
      case VMLPackage.LOOP_SENTENCE__NAME:
        setName((String)newValue);
        return;
      case VMLPackage.LOOP_SENTENCE__TYPE:
        setType((TypeRef)newValue);
        return;
      case VMLPackage.LOOP_SENTENCE__O:
        setO((LiteralExpression)newValue);
        return;
      case VMLPackage.LOOP_SENTENCE__I:
        setI((LiteralExpression)newValue);
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
      case VMLPackage.LOOP_SENTENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VMLPackage.LOOP_SENTENCE__TYPE:
        setType((TypeRef)null);
        return;
      case VMLPackage.LOOP_SENTENCE__O:
        setO((LiteralExpression)null);
        return;
      case VMLPackage.LOOP_SENTENCE__I:
        setI((LiteralExpression)null);
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
      case VMLPackage.LOOP_SENTENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VMLPackage.LOOP_SENTENCE__TYPE:
        return type != null;
      case VMLPackage.LOOP_SENTENCE__O:
        return o != null;
      case VMLPackage.LOOP_SENTENCE__I:
        return i != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LoopSentenceImpl
