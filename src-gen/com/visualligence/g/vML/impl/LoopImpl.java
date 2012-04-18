/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.Loop;
import com.visualligence.g.vML.LoopFor;
import com.visualligence.g.vML.LoopSentence;
import com.visualligence.g.vML.VMLPackage;

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
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.LoopImpl#getIt <em>It</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.LoopImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopImpl extends NodeImpl implements Loop
{
  /**
   * The cached value of the '{@link #getIt() <em>It</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIt()
   * @generated
   * @ordered
   */
  protected LoopFor it;

  /**
   * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentences()
   * @generated
   * @ordered
   */
  protected EList<LoopSentence> sentences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopImpl()
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
    return VMLPackage.Literals.LOOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopFor getIt()
  {
    return it;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIt(LoopFor newIt, NotificationChain msgs)
  {
    LoopFor oldIt = it;
    it = newIt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP__IT, oldIt, newIt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIt(LoopFor newIt)
  {
    if (newIt != it)
    {
      NotificationChain msgs = null;
      if (it != null)
        msgs = ((InternalEObject)it).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.LOOP__IT, null, msgs);
      if (newIt != null)
        msgs = ((InternalEObject)newIt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.LOOP__IT, null, msgs);
      msgs = basicSetIt(newIt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.LOOP__IT, newIt, newIt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LoopSentence> getSentences()
  {
    if (sentences == null)
    {
      sentences = new EObjectContainmentEList<LoopSentence>(LoopSentence.class, this, VMLPackage.LOOP__SENTENCES);
    }
    return sentences;
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
      case VMLPackage.LOOP__IT:
        return basicSetIt(null, msgs);
      case VMLPackage.LOOP__SENTENCES:
        return ((InternalEList<?>)getSentences()).basicRemove(otherEnd, msgs);
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
      case VMLPackage.LOOP__IT:
        return getIt();
      case VMLPackage.LOOP__SENTENCES:
        return getSentences();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VMLPackage.LOOP__IT:
        setIt((LoopFor)newValue);
        return;
      case VMLPackage.LOOP__SENTENCES:
        getSentences().clear();
        getSentences().addAll((Collection<? extends LoopSentence>)newValue);
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
      case VMLPackage.LOOP__IT:
        setIt((LoopFor)null);
        return;
      case VMLPackage.LOOP__SENTENCES:
        getSentences().clear();
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
      case VMLPackage.LOOP__IT:
        return it != null;
      case VMLPackage.LOOP__SENTENCES:
        return sentences != null && !sentences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LoopImpl
