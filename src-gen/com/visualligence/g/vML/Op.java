/**
 */
package com.visualligence.g.vML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.visualligence.g.vML.VMLPackage#getOp()
 * @model
 * @generated
 */
public enum Op implements Enumerator
{
  /**
   * The '<em><b>And</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AND_VALUE
   * @generated
   * @ordered
   */
  AND(0, "and", "&&"),

  /**
   * The '<em><b>Or</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OR_VALUE
   * @generated
   * @ordered
   */
  OR(1, "or", "||"),

  /**
   * The '<em><b>Neg</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEG_VALUE
   * @generated
   * @ordered
   */
  NEG(0, "neg", "!"),

  /**
   * The '<em><b>Eq</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQ_VALUE
   * @generated
   * @ordered
   */
  EQ(0, "eq", "=="),

  /**
   * The '<em><b>Ne</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NE_VALUE
   * @generated
   * @ordered
   */
  NE(1, "ne", "!="),

  /**
   * The '<em><b>Lt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LT_VALUE
   * @generated
   * @ordered
   */
  LT(2, "lt", "<"),

  /**
   * The '<em><b>Gt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GT_VALUE
   * @generated
   * @ordered
   */
  GT(3, "gt", ">"),

  /**
   * The '<em><b>Le</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LE_VALUE
   * @generated
   * @ordered
   */
  LE(4, "le", "<="),

  /**
   * The '<em><b>Ge</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GE_VALUE
   * @generated
   * @ordered
   */
  GE(5, "ge", ">="),

  /**
   * The '<em><b>Plus</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLUS_VALUE
   * @generated
   * @ordered
   */
  PLUS(0, "plus", "+"),

  /**
   * The '<em><b>Minus</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINUS_VALUE
   * @generated
   * @ordered
   */
  MINUS(1, "minus", "-"),

  /**
   * The '<em><b>Times</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIMES_VALUE
   * @generated
   * @ordered
   */
  TIMES(0, "times", "*"),

  /**
   * The '<em><b>Modulo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MODULO_VALUE
   * @generated
   * @ordered
   */
  MODULO(1, "modulo", "%"),

  /**
   * The '<em><b>Intdivision</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTDIVISION_VALUE
   * @generated
   * @ordered
   */
  INTDIVISION(2, "intdivision", "//"),

  /**
   * The '<em><b>Divideby</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIVIDEBY_VALUE
   * @generated
   * @ordered
   */
  DIVIDEBY(3, "divideby", "/"),

  /**
   * The '<em><b>Exp</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXP_VALUE
   * @generated
   * @ordered
   */
  EXP(0, "exp", "**");

  /**
   * The '<em><b>And</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>And</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AND
   * @model name="and" literal="&&"
   * @generated
   * @ordered
   */
  public static final int AND_VALUE = 0;

  /**
   * The '<em><b>Or</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Or</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OR
   * @model name="or" literal="||"
   * @generated
   * @ordered
   */
  public static final int OR_VALUE = 1;

  /**
   * The '<em><b>Neg</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Neg</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEG
   * @model name="neg" literal="!"
   * @generated
   * @ordered
   */
  public static final int NEG_VALUE = 0;

  /**
   * The '<em><b>Eq</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Eq</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQ
   * @model name="eq" literal="=="
   * @generated
   * @ordered
   */
  public static final int EQ_VALUE = 0;

  /**
   * The '<em><b>Ne</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ne</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NE
   * @model name="ne" literal="!="
   * @generated
   * @ordered
   */
  public static final int NE_VALUE = 1;

  /**
   * The '<em><b>Lt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LT
   * @model name="lt" literal="<"
   * @generated
   * @ordered
   */
  public static final int LT_VALUE = 2;

  /**
   * The '<em><b>Gt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Gt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GT
   * @model name="gt" literal=">"
   * @generated
   * @ordered
   */
  public static final int GT_VALUE = 3;

  /**
   * The '<em><b>Le</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Le</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LE
   * @model name="le" literal="<="
   * @generated
   * @ordered
   */
  public static final int LE_VALUE = 4;

  /**
   * The '<em><b>Ge</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ge</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GE
   * @model name="ge" literal=">="
   * @generated
   * @ordered
   */
  public static final int GE_VALUE = 5;

  /**
   * The '<em><b>Plus</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Plus</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLUS
   * @model name="plus" literal="+"
   * @generated
   * @ordered
   */
  public static final int PLUS_VALUE = 0;

  /**
   * The '<em><b>Minus</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Minus</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINUS
   * @model name="minus" literal="-"
   * @generated
   * @ordered
   */
  public static final int MINUS_VALUE = 1;

  /**
   * The '<em><b>Times</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Times</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIMES
   * @model name="times" literal="*"
   * @generated
   * @ordered
   */
  public static final int TIMES_VALUE = 0;

  /**
   * The '<em><b>Modulo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Modulo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MODULO
   * @model name="modulo" literal="%"
   * @generated
   * @ordered
   */
  public static final int MODULO_VALUE = 1;

  /**
   * The '<em><b>Intdivision</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Intdivision</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTDIVISION
   * @model name="intdivision" literal="//"
   * @generated
   * @ordered
   */
  public static final int INTDIVISION_VALUE = 2;

  /**
   * The '<em><b>Divideby</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Divideby</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIVIDEBY
   * @model name="divideby" literal="/"
   * @generated
   * @ordered
   */
  public static final int DIVIDEBY_VALUE = 3;

  /**
   * The '<em><b>Exp</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Exp</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXP
   * @model name="exp" literal="**"
   * @generated
   * @ordered
   */
  public static final int EXP_VALUE = 0;

  /**
   * An array of all the '<em><b>Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Op[] VALUES_ARRAY =
    new Op[]
    {
      AND,
      OR,
      NEG,
      EQ,
      NE,
      LT,
      GT,
      LE,
      GE,
      PLUS,
      MINUS,
      TIMES,
      MODULO,
      INTDIVISION,
      DIVIDEBY,
      EXP,
    };

  /**
   * A public read-only list of all the '<em><b>Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Op> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Op</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Op get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Op result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Op</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Op getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Op result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Op</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Op get(int value)
  {
    switch (value)
    {
      case AND_VALUE: return AND;
      case OR_VALUE: return OR;
      case LT_VALUE: return LT;
      case GT_VALUE: return GT;
      case LE_VALUE: return LE;
      case GE_VALUE: return GE;
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
  private Op(int value, String name, String literal)
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
  
} //Op
