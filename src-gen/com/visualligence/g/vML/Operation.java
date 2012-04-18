/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.Operation#getLeft <em>Left</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Operation#getOp <em>Op</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Operation#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends LiteralExpression
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
   * @see #setLeft(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getOperation_Left()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getLeft();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Operation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LiteralExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link com.visualligence.g.vML.Op}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see com.visualligence.g.vML.Op
   * @see #setOp(Op)
   * @see com.visualligence.g.vML.VMLPackage#getOperation_Op()
   * @model
   * @generated
   */
  Op getOp();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Operation#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see com.visualligence.g.vML.Op
   * @see #getOp()
   * @generated
   */
  void setOp(Op value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getOperation_Right()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getRight();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Operation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(LiteralExpression value);

} // Operation
