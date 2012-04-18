/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.Canvas#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getCanvas()
 * @model
 * @generated
 */
public interface Canvas extends Sentence
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.visualligence.g.vML.Pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.visualligence.g.vML.VMLPackage#getCanvas_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Pair> getProperties();

} // Canvas
