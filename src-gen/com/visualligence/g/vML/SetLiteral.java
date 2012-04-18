/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.SetLiteral#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getSetLiteral()
 * @model
 * @generated
 */
public interface SetLiteral extends RValue
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link com.visualligence.g.vML.LiteralExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see com.visualligence.g.vML.VMLPackage#getSetLiteral_Items()
   * @model containment="true"
   * @generated
   */
  EList<LiteralExpression> getItems();

} // SetLiteral
