/**
 */
package com.visualligence.g.vML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visual Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.visualligence.g.vML.VMLPackage#getVisualType()
 * @model
 * @generated
 */
public enum VisualType implements Enumerator
{
  /**
   * The '<em><b>Shape</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHAPE_VALUE
   * @generated
   * @ordered
   */
  SHAPE(0, "shape", "shape"),

  /**
   * The '<em><b>Color</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLOR_VALUE
   * @generated
   * @ordered
   */
  COLOR(1, "color", "color"),

  /**
   * The '<em><b>Angle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANGLE_VALUE
   * @generated
   * @ordered
   */
  ANGLE(2, "angle", "angle"),

  /**
   * The '<em><b>Size</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIZE_VALUE
   * @generated
   * @ordered
   */
  SIZE(3, "size", "size"),

  /**
   * The '<em><b>Position</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSITION_VALUE
   * @generated
   * @ordered
   */
  POSITION(4, "position", "position"),

  /**
   * The '<em><b>Texture</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXTURE_VALUE
   * @generated
   * @ordered
   */
  TEXTURE(5, "texture", "texture");

  /**
   * The '<em><b>Shape</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Shape</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SHAPE
   * @model name="shape"
   * @generated
   * @ordered
   */
  public static final int SHAPE_VALUE = 0;

  /**
   * The '<em><b>Color</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Color</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLOR
   * @model name="color"
   * @generated
   * @ordered
   */
  public static final int COLOR_VALUE = 1;

  /**
   * The '<em><b>Angle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Angle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANGLE
   * @model name="angle"
   * @generated
   * @ordered
   */
  public static final int ANGLE_VALUE = 2;

  /**
   * The '<em><b>Size</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Size</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIZE
   * @model name="size"
   * @generated
   * @ordered
   */
  public static final int SIZE_VALUE = 3;

  /**
   * The '<em><b>Position</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Position</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSITION
   * @model name="position"
   * @generated
   * @ordered
   */
  public static final int POSITION_VALUE = 4;

  /**
   * The '<em><b>Texture</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Texture</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXTURE
   * @model name="texture"
   * @generated
   * @ordered
   */
  public static final int TEXTURE_VALUE = 5;

  /**
   * An array of all the '<em><b>Visual Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VisualType[] VALUES_ARRAY =
    new VisualType[]
    {
      SHAPE,
      COLOR,
      ANGLE,
      SIZE,
      POSITION,
      TEXTURE,
    };

  /**
   * A public read-only list of all the '<em><b>Visual Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VisualType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Visual Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisualType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VisualType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Visual Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisualType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VisualType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Visual Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisualType get(int value)
  {
    switch (value)
    {
      case SHAPE_VALUE: return SHAPE;
      case COLOR_VALUE: return COLOR;
      case ANGLE_VALUE: return ANGLE;
      case SIZE_VALUE: return SIZE;
      case POSITION_VALUE: return POSITION;
      case TEXTURE_VALUE: return TEXTURE;
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
  private VisualType(int value, String name, String literal)
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
  
} //VisualType
