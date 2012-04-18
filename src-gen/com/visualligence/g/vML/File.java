/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.visualligence.g.vML.File#isIsinput <em>Isinput</em>}</li>
 *   <li>{@link com.visualligence.g.vML.File#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.visualligence.g.vML.VMLPackage#getFile()
 * @model
 * @generated
 */
public interface File extends Node
{
  /**
   * Returns the value of the '<em><b>Isinput</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isinput</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isinput</em>' attribute.
   * @see #setIsinput(boolean)
   * @see com.visualligence.g.vML.VMLPackage#getFile_Isinput()
   * @model
   * @generated
   */
  boolean isIsinput();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.File#isIsinput <em>Isinput</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isinput</em>' attribute.
   * @see #isIsinput()
   * @generated
   */
  void setIsinput(boolean value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see com.visualligence.g.vML.VMLPackage#getFile_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link com.visualligence.g.vML.File#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // File
