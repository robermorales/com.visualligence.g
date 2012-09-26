/**
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.Stream#getLeft <em>Left</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Stream#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getStream()
 * @model
 * @generated
 */
public interface Stream extends Sentence
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LStreamValue)
   * @see com.visualligence.g.vML.VMLPackage#getStream_Left()
   * @model containment="true"
   * @generated
   */
  LStreamValue getLeft();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Stream#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LStreamValue value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(RStreamValue)
   * @see com.visualligence.g.vML.VMLPackage#getStream_Right()
   * @model containment="true"
   * @generated
   */
  RStreamValue getRight();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Stream#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(RStreamValue value);

} // Stream
