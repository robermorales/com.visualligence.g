/**
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.Switch#getTest <em>Test</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Switch#getA <em>A</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Switch#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Node
{
  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getSwitch_Test()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getTest();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Switch#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(LiteralExpression value);

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getSwitch_A()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getA();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Switch#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(LiteralExpression value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(LiteralExpression)
   * @see com.visualligence.g.vML.VMLPackage#getSwitch_B()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getB();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Switch#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(LiteralExpression value);

} // Switch
