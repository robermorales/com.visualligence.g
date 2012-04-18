/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Literal Serie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.SequenceLiteralSerie#getInit <em>Init</em>}</li>
 *   <li>{@link com.visualligence.g.vML.SequenceLiteralSerie#getEnd <em>End</em>}</li>
 *   <li>{@link com.visualligence.g.vML.SequenceLiteralSerie#getInc <em>Inc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getSequenceLiteralSerie()
 * @model
 * @generated
 */
public interface SequenceLiteralSerie extends SequenceLiteral
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getSequenceLiteralSerie_Init()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getInit();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.SequenceLiteralSerie#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(LiteralExpression value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getSequenceLiteralSerie_End()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getEnd();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.SequenceLiteralSerie#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(LiteralExpression value);

  /**
   * Returns the value of the '<em><b>Inc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc</em>' containment reference.
   * @see #setInc(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getSequenceLiteralSerie_Inc()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getInc();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.SequenceLiteralSerie#getInc <em>Inc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc</em>' containment reference.
   * @see #getInc()
   * @generated
   */
  void setInc(LiteralExpression value);

} // SequenceLiteralSerie
