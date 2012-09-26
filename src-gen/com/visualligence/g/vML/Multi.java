/**
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.Multi#getOp <em>Op</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Multi#getFactor <em>Factor</em>}</li>
 *   <li>{@link com.visualligence.g.vML.Multi#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getMulti()
 * @model
 * @generated
 */
public interface Multi extends Sentence
{
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
   * @see com.visualligence.g.vML.VMLPackage#getMulti_Op()
   * @model
   * @generated
   */
  Op getOp();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Multi#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see com.visualligence.g.vML.Op
   * @see #getOp()
   * @generated
   */
  void setOp(Op value);

  /**
   * Returns the value of the '<em><b>Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' attribute.
   * @see #setFactor(int)
   * @see com.visualligence.g.vML.VMLPackage#getMulti_Factor()
   * @model
   * @generated
   */
  int getFactor();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Multi#getFactor <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' attribute.
   * @see #getFactor()
   * @generated
   */
  void setFactor(int value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Multi)
   * @see com.visualligence.g.vML.VMLPackage#getMulti_Parent()
   * @model
   * @generated
   */
  Multi getParent();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.Multi#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Multi value);

} // Multi
