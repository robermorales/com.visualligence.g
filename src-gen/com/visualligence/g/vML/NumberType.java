/**
 */
package com.visualligence.g.vML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Number Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.visualligence.g.vML.VMLPackage#getNumberType()
 * @model
 * @generated
 */
public enum NumberType implements Enumerator
{
  /**
   * The '<em><b>Positive</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSITIVE_VALUE
   * @generated
   * @ordered
   */
  POSITIVE(0, "positive", "positive"),

  /**
   * The '<em><b>Natural</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NATURAL_VALUE
   * @generated
   * @ordered
   */
  NATURAL(1, "natural", "natural"),

  /**
   * The '<em><b>Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(2, "integer", "integer"),

  /**
   * The '<em><b>Rational</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RATIONAL_VALUE
   * @generated
   * @ordered
   */
  RATIONAL(3, "rational", "rational");

  /**
   * The '<em><b>Positive</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Positive</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSITIVE
   * @model name="positive"
   * @generated
   * @ordered
   */
  public static final int POSITIVE_VALUE = 0;

  /**
   * The '<em><b>Natural</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Natural</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NATURAL
   * @model name="natural"
   * @generated
   * @ordered
   */
  public static final int NATURAL_VALUE = 1;

  /**
   * The '<em><b>Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model name="integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 2;

  /**
   * The '<em><b>Rational</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rational</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RATIONAL
   * @model name="rational"
   * @generated
   * @ordered
   */
  public static final int RATIONAL_VALUE = 3;

  /**
   * An array of all the '<em><b>Number Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NumberType[] VALUES_ARRAY =
    new NumberType[]
    {
      POSITIVE,
      NATURAL,
      INTEGER,
      RATIONAL,
    };

  /**
   * A public read-only list of all the '<em><b>Number Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NumberType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Number Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NumberType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NumberType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Number Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NumberType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NumberType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Number Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NumberType get(int value)
  {
    switch (value)
    {
      case POSITIVE_VALUE: return POSITIVE;
      case NATURAL_VALUE: return NATURAL;
      case INTEGER_VALUE: return INTEGER;
      case RATIONAL_VALUE: return RATIONAL;
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
  private NumberType(int value, String name, String literal)
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
  
} //NumberType
