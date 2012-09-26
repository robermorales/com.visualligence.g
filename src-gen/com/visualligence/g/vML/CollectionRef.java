/**
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.CollectionRef#getCollection <em>Collection</em>}</li>
 *   <li>{@link com.visualligence.g.vML.CollectionRef#getTyperef <em>Typeref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getCollectionRef()
 * @model
 * @generated
 */
public interface CollectionRef extends PlainTypeRef
{
  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * The literals are from the enumeration {@link com.visualligence.g.vML.CollectionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see com.visualligence.g.vML.CollectionType
   * @see #setCollection(CollectionType)
   * @see com.visualligence.g.vML.VMLPackage#getCollectionRef_Collection()
   * @model
   * @generated
   */
  CollectionType getCollection();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.CollectionRef#getCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see com.visualligence.g.vML.CollectionType
   * @see #getCollection()
   * @generated
   */
  void setCollection(CollectionType value);

  /**
   * Returns the value of the '<em><b>Typeref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typeref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typeref</em>' containment reference.
   * @see #setTyperef(TypeRef)
   * @see com.visualligence.g.vML.VMLPackage#getCollectionRef_Typeref()
   * @model containment="true"
   * @generated
   */
  TypeRef getTyperef();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.CollectionRef#getTyperef <em>Typeref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeref</em>' containment reference.
   * @see #getTyperef()
   * @generated
   */
  void setTyperef(TypeRef value);

} // CollectionRef
