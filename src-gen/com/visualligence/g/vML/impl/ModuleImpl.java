/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.Import;
import com.visualligence.g.vML.Module;
import com.visualligence.g.vML.Sentence;
import com.visualligence.g.vML.TypeRef;
import com.visualligence.g.vML.VMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.ModuleImpl#getInputtype <em>Inputtype</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.ModuleImpl#getOutputtype <em>Outputtype</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.ModuleImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.ModuleImpl#getCreation <em>Creation</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.ModuleImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.ModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.visualligence.g.vML.impl.ModuleImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
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
   * The cached value of the '{@link #getInputtype() <em>Inputtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputtype()
   * @generated
   * @ordered
   */
  protected TypeRef inputtype;

  /**
   * The cached value of the '{@link #getOutputtype() <em>Outputtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputtype()
   * @generated
   * @ordered
   */
  protected TypeRef outputtype;

  /**
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected static final String AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected String author = AUTHOR_EDEFAULT;

  /**
   * The default value of the '{@link #getCreation() <em>Creation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreation()
   * @generated
   * @ordered
   */
  protected static final String CREATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreation() <em>Creation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreation()
   * @generated
   * @ordered
   */
  protected String creation = CREATION_EDEFAULT;

  /**
   * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected static final String LINK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected String link = LINK_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentences()
   * @generated
   * @ordered
   */
  protected EList<Sentence> sentences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return VMLPackage.Literals.MODULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getInputtype()
  {
    return inputtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputtype(TypeRef newInputtype, NotificationChain msgs)
  {
    TypeRef oldInputtype = inputtype;
    inputtype = newInputtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.MODULE__INPUTTYPE, oldInputtype, newInputtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputtype(TypeRef newInputtype)
  {
    if (newInputtype != inputtype)
    {
      NotificationChain msgs = null;
      if (inputtype != null)
        msgs = ((InternalEObject)inputtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.MODULE__INPUTTYPE, null, msgs);
      if (newInputtype != null)
        msgs = ((InternalEObject)newInputtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.MODULE__INPUTTYPE, null, msgs);
      msgs = basicSetInputtype(newInputtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.MODULE__INPUTTYPE, newInputtype, newInputtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getOutputtype()
  {
    return outputtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputtype(TypeRef newOutputtype, NotificationChain msgs)
  {
    TypeRef oldOutputtype = outputtype;
    outputtype = newOutputtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMLPackage.MODULE__OUTPUTTYPE, oldOutputtype, newOutputtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputtype(TypeRef newOutputtype)
  {
    if (newOutputtype != outputtype)
    {
      NotificationChain msgs = null;
      if (outputtype != null)
        msgs = ((InternalEObject)outputtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMLPackage.MODULE__OUTPUTTYPE, null, msgs);
      if (newOutputtype != null)
        msgs = ((InternalEObject)newOutputtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMLPackage.MODULE__OUTPUTTYPE, null, msgs);
      msgs = basicSetOutputtype(newOutputtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.MODULE__OUTPUTTYPE, newOutputtype, newOutputtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(String newAuthor)
  {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.MODULE__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCreation()
  {
    return creation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreation(String newCreation)
  {
    String oldCreation = creation;
    creation = newCreation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.MODULE__CREATION, oldCreation, creation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(String newLink)
  {
    String oldLink = link;
    link = newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMLPackage.MODULE__LINK, oldLink, link));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, VMLPackage.MODULE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sentence> getSentences()
  {
    if (sentences == null)
    {
      sentences = new EObjectContainmentEList<Sentence>(Sentence.class, this, VMLPackage.MODULE__SENTENCES);
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
      case VMLPackage.MODULE__INPUTTYPE:
        return basicSetInputtype(null, msgs);
      case VMLPackage.MODULE__OUTPUTTYPE:
        return basicSetOutputtype(null, msgs);
      case VMLPackage.MODULE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case VMLPackage.MODULE__SENTENCES:
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
      case VMLPackage.MODULE__NAME:
        return getName();
      case VMLPackage.MODULE__INPUTTYPE:
        return getInputtype();
      case VMLPackage.MODULE__OUTPUTTYPE:
        return getOutputtype();
      case VMLPackage.MODULE__AUTHOR:
        return getAuthor();
      case VMLPackage.MODULE__CREATION:
        return getCreation();
      case VMLPackage.MODULE__LINK:
        return getLink();
      case VMLPackage.MODULE__IMPORTS:
        return getImports();
      case VMLPackage.MODULE__SENTENCES:
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
      case VMLPackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case VMLPackage.MODULE__INPUTTYPE:
        setInputtype((TypeRef)newValue);
        return;
      case VMLPackage.MODULE__OUTPUTTYPE:
        setOutputtype((TypeRef)newValue);
        return;
      case VMLPackage.MODULE__AUTHOR:
        setAuthor((String)newValue);
        return;
      case VMLPackage.MODULE__CREATION:
        setCreation((String)newValue);
        return;
      case VMLPackage.MODULE__LINK:
        setLink((String)newValue);
        return;
      case VMLPackage.MODULE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case VMLPackage.MODULE__SENTENCES:
        getSentences().clear();
        getSentences().addAll((Collection<? extends Sentence>)newValue);
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
      case VMLPackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VMLPackage.MODULE__INPUTTYPE:
        setInputtype((TypeRef)null);
        return;
      case VMLPackage.MODULE__OUTPUTTYPE:
        setOutputtype((TypeRef)null);
        return;
      case VMLPackage.MODULE__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case VMLPackage.MODULE__CREATION:
        setCreation(CREATION_EDEFAULT);
        return;
      case VMLPackage.MODULE__LINK:
        setLink(LINK_EDEFAULT);
        return;
      case VMLPackage.MODULE__IMPORTS:
        getImports().clear();
        return;
      case VMLPackage.MODULE__SENTENCES:
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
      case VMLPackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VMLPackage.MODULE__INPUTTYPE:
        return inputtype != null;
      case VMLPackage.MODULE__OUTPUTTYPE:
        return outputtype != null;
      case VMLPackage.MODULE__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case VMLPackage.MODULE__CREATION:
        return CREATION_EDEFAULT == null ? creation != null : !CREATION_EDEFAULT.equals(creation);
      case VMLPackage.MODULE__LINK:
        return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
      case VMLPackage.MODULE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case VMLPackage.MODULE__SENTENCES:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", author: ");
    result.append(author);
    result.append(", creation: ");
    result.append(creation);
    result.append(", link: ");
    result.append(link);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
