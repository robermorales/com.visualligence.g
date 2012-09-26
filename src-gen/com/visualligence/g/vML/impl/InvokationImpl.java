/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.Invokation;
import com.visualligence.g.vML.InvokationParam;
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
 * An implementation of the model object '<em><b>Invokation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.InvokationImpl#getModule <em>Module</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.InvokationImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokationImpl extends NodeImpl implements Invokation
{
  /**
   * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected static final String MODULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected String module = MODULE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentences()
   * @generated
   * @ordered
   */
  protected EList<InvokationParam> sentences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvokationImpl()
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
    return VMLPackage.Literals.INVOKATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule(String newModule)
  {
    String oldModule = module;
    module = newModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.INVOKATION__MODULE, oldModule, module));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InvokationParam> getSentences()
  {
    if (sentences == null)
    {
      sentences = new EObjectContainmentEList<InvokationParam>(InvokationParam.class, this, VMLPackage.INVOKATION__SENTENCES);
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
      case VMLPackage.INVOKATION__SENTENCES:
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
      case VMLPackage.INVOKATION__MODULE:
        return getModule();
      case VMLPackage.INVOKATION__SENTENCES:
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
      case VMLPackage.INVOKATION__MODULE:
        setModule((String)newValue);
        return;
      case VMLPackage.INVOKATION__SENTENCES:
        getSentences().clear();
        getSentences().addAll((Collection<? extends InvokationParam>)newValue);
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
      case VMLPackage.INVOKATION__MODULE:
        setModule(MODULE_EDEFAULT);
        return;
      case VMLPackage.INVOKATION__SENTENCES:
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
      case VMLPackage.INVOKATION__MODULE:
        return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
      case VMLPackage.INVOKATION__SENTENCES:
        return sentences != null && !sentences.isEmpty();
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
    result.append(" (module: ");
    result.append(module);
    result.append(')');
    return result.toString();
  }

} //InvokationImpl
