/**
 */
package com.visualligence.g.vML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Collection Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.visualligence.g.vML.VMLPackage#getCollectionType()
 * @model
 * @generated
 */
public enum CollectionType implements Enumerator
{
  /**
   * The '<em><b>Set</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SET_VALUE
   * @generated
   * @ordered
   */
  SET(0, "set", "set"),

  /**
   * The '<em><b>Bag</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BAG_VALUE
   * @generated
   * @ordered
   */
  BAG(1, "bag", "bag"),

  /**
   * The '<em><b>List</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIST_VALUE
   * @generated
   * @ordered
   */
  LIST(2, "list", "list"),

  /**
   * The '<em><b>Graph</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GRAPH_VALUE
   * @generated
   * @ordered
   */
  GRAPH(3, "graph", "graph"),

  /**
   * The '<em><b>Single</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SINGLE_VALUE
   * @generated
   * @ordered
   */
  SINGLE(4, "single", "single");

  /**
   * The '<em><b>Set</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Set</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SET
   * @model name="set"
   * @generated
   * @ordered
   */
  public static final int SET_VALUE = 0;

  /**
   * The '<em><b>Bag</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bag</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BAG
   * @model name="bag"
   * @generated
   * @ordered
   */
  public static final int BAG_VALUE = 1;

  /**
   * The '<em><b>List</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>List</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LIST
   * @model name="list"
   * @generated
   * @ordered
   */
  public static final int LIST_VALUE = 2;

  /**
   * The '<em><b>Graph</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Graph</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GRAPH
   * @model name="graph"
   * @generated
   * @ordered
   */
  public static final int GRAPH_VALUE = 3;

  /**
   * The '<em><b>Single</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Single</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SINGLE
   * @model name="single"
   * @generated
   * @ordered
   */
  public static final int SINGLE_VALUE = 4;

  /**
   * An array of all the '<em><b>Collection Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CollectionType[] VALUES_ARRAY =
    new CollectionType[]
    {
      SET,
      BAG,
      LIST,
      GRAPH,
      SINGLE,
    };

  /**
   * A public read-only list of all the '<em><b>Collection Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CollectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Collection Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CollectionType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CollectionType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Collection Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CollectionType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CollectionType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Collection Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CollectionType get(int value)
  {
    switch (value)
    {
      case SET_VALUE: return SET;
      case BAG_VALUE: return BAG;
      case LIST_VALUE: return LIST;
      case GRAPH_VALUE: return GRAPH;
      case SINGLE_VALUE: return SINGLE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private CollectionType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //CollectionType
