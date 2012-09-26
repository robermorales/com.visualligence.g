/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.CollectionRef;
import com.visualligence.g.vML.CollectionType;
import com.visualligence.g.vML.TypeRef;
import com.visualligence.g.vML.VMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.CollectionRefImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.CollectionRefImpl#getTyperef <em>Typeref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionRefImpl extends PlainTypeRefImpl implements CollectionRef
{
  /**
   * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected static final CollectionType COLLECTION_EDEFAULT = CollectionType.SET;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected CollectionType collection = COLLECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getTyperef() <em>Typeref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyperef()
   * @generated
   * @ordered
   */
  protected TypeRef typeref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionRefImpl()
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
    return VMLPackage.Literals.COLLECTION_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionType getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollection(CollectionType newCollection)
  {
    CollectionType oldCollection = collection;
    collection = newCollection == null ? COLLECTION_EDEFAULT : newCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.COLLECTION_REF__COLLECTION, oldCollection, collection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getTyperef()
  {
    return typeref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTyperef(TypeRef newTyperef, NotificationChain msgs)
  {
    TypeRef oldTyperef = typeref;
    typeref = newTyperef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.COLLECTION_REF__TYPEREF, oldTyperef, newTyperef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTyperef(TypeRef newTyperef)
  {
    if (newTyperef != typeref)
    {
      NotificationChain msgs = null;
      if (typeref != null)
        msgs = ((InternalEObject)typeref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.COLLECTION_REF__TYPEREF, null, msgs);
      if (newTyperef != null)
        msgs = ((InternalEObject)newTyperef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.COLLECTION_REF__TYPEREF, null, msgs);
      msgs = basicSetTyperef(newTyperef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.COLLECTION_REF__TYPEREF, newTyperef, newTyperef));
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
      case VMLPackage.COLLECTION_REF__TYPEREF:
        return basicSetTyperef(null, msgs);
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
      case VMLPackage.COLLECTION_REF__COLLECTION:
        return getCollection();
      case VMLPackage.COLLECTION_REF__TYPEREF:
        return getTyperef();
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
      case VMLPackage.COLLECTION_REF__COLLECTION:
        setCollection((CollectionType)newValue);
        return;
      case VMLPackage.COLLECTION_REF__TYPEREF:
        setTyperef((TypeRef)newValue);
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
      case VMLPackage.COLLECTION_REF__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
        return;
      case VMLPackage.COLLECTION_REF__TYPEREF:
        setTyperef((TypeRef)null);
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
      case VMLPackage.COLLECTION_REF__COLLECTION:
        return collection != COLLECTION_EDEFAULT;
      case VMLPackage.COLLECTION_REF__TYPEREF:
        return typeref != null;
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
    result.append(" (collection: ");
    result.append(collection);
    result.append(')');
    return result.toString();
  }

} //CollectionRefImpl
