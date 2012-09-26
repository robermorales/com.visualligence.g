/**
 */
package com.visualligence.g.vML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.Module#getName <em>Name</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Module#getInputtype <em>Inputtype</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Module#getOutputtype <em>Outputtype</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Module#getAuthor <em>Author</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Module#getCreation <em>Creation</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Module#getLink <em>Link</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Module#getImports <em>Imports</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Module#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.visualligence.g.vML.VMLPackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inputtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputtype</em>' containment reference.
   * @see #setInputtype(TypeRef)
   * @see com.visualligence.g.vML.VMLPackage#getModule_Inputtype()
   * @model containment="true"
   * @generated
   */
  TypeRef getInputtype();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Module#getInputtype <em>Inputtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputtype</em>' containment reference.
   * @see #getInputtype()
   * @generated
   */
  void setInputtype(TypeRef value);

  /**
   * Returns the value of the '<em><b>Outputtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputtype</em>' containment reference.
   * @see #setOutputtype(TypeRef)
   * @see com.visualligence.g.vML.VMLPackage#getModule_Outputtype()
   * @model containment="true"
   * @generated
   */
  TypeRef getOutputtype();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Module#getOutputtype <em>Outputtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outputtype</em>' containment reference.
   * @see #getOutputtype()
   * @generated
   */
  void setOutputtype(TypeRef value);

  /**
   * Returns the value of the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' attribute.
   * @see #setAuthor(String)
   * @see com.visualligence.g.vML.VMLPackage#getModule_Author()
   * @model
   * @generated
   */
  String getAuthor();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Module#getAuthor <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' attribute.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(String value);

  /**
   * Returns the value of the '<em><b>Creation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creation</em>' attribute.
   * @see #setCreation(String)
   * @see com.visualligence.g.vML.VMLPackage#getModule_Creation()
   * @model
   * @generated
   */
  String getCreation();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Module#getCreation <em>Creation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creation</em>' attribute.
   * @see #getCreation()
   * @generated
   */
  void setCreation(String value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' attribute.
   * @see #setLink(String)
   * @see com.visualligence.g.vML.VMLPackage#getModule_Link()
   * @model
   * @generated
   */
  String getLink();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Module#getLink <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' attribute.
   * @see #getLink()
   * @generated
   */
  void setLink(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.visualligence.g.vML.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.visualligence.g.vML.VMLPackage#getModule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link com.visualligence.g.vML.Sentence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see com.visualligence.g.vML.VMLPackage#getModule_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<Sentence> getSentences();

} // Module
