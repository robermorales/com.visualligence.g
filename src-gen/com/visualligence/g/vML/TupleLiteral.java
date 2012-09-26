/**
 */
package com.visualligence.g.vML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.TupleLiteral#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getTupleLiteral()
 * @model
 * @generated
 */
public interface TupleLiteral extends RValue
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link com.visualligence.g.vML.TupleItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see com.visualligence.g.vML.VMLPackage#getTupleLiteral_Items()
   * @model containment="true"
   * @generated
   */
  EList<TupleItem> getItems();

} // TupleLiteral
