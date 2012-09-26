/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VMLFactoryImpl extends EFactoryImpl implements VMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VMLFactory init()
  {
    try
    {
      VMLFactory theVMLFactory = (VMLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.visualligence.com/g/VML"); 
      if (theVMLFactory != null)
      {
        return theVMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VMLPackage.MODULE: return createModule();
      case VMLPackage.IMPORT: return createImport();
      case VMLPackage.SENTENCE: return createSentence();
      case VMLPackage.NODE: return createNode();
      case VMLPackage.SWITCH: return createSwitch();
      case VMLPackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case VMLPackage.RVALUE: return createRValue();
      case VMLPackage.NODE_REF: return createNodeRef();
      case VMLPackage.MEMBER_REF: return createMemberRef();
      case VMLPackage.CONSTANT_REF: return createConstantRef();
      case VMLPackage.SINGLE_LITERAL: return createSingleLiteral();
      case VMLPackage.SEQUENCE_LITERAL: return createSequenceLiteral();
      case VMLPackage.SEQUENCE_LITERAL_SERIE: return createSequenceLiteralSerie();
      case VMLPackage.SEQUENCE_LITERAL_PLAIN: return createSequenceLiteralPlain();
      case VMLPackage.TUPLE_LITERAL: return createTupleLiteral();
      case VMLPackage.TUPLE_ITEM: return createTupleItem();
      case VMLPackage.BLOCK: return createBlock();
      case VMLPackage.NOOP: return createNoop();
      case VMLPackage.PAIR: return createPair();
      case VMLPackage.CONSTANT: return createConstant();
      case VMLPackage.MULTI: return createMulti();
      case VMLPackage.UNIT: return createUnit();
      case VMLPackage.DUNIT: return createDUnit();
      case VMLPackage.NUNIT: return createNUnit();
      case VMLPackage.BOX: return createBox();
      case VMLPackage.SHAPE: return createShape();
      case VMLPackage.MEMBER: return createMember();
      case VMLPackage.TYPE_REF: return createTypeRef();
      case VMLPackage.PLAIN_TYPE_REF: return createPlainTypeRef();
      case VMLPackage.COMPOSITE_TYPE_REF: return createCompositeTypeRef();
      case VMLPackage.SEQUENCE_TYPE_REF: return createSequenceTypeRef();
      case VMLPackage.TUPLE_TYPE_REF: return createTupleTypeRef();
      case VMLPackage.TUPLE_TYPE_REF_ITEM: return createTupleTypeRefItem();
      case VMLPackage.SET_TYPE_REF: return createSetTypeRef();
      case VMLPackage.VOID_TYPE_REF: return createVoidTypeRef();
      case VMLPackage.AUTO_TYPE_REF: return createAutoTypeRef();
      case VMLPackage.COLLECTION_REF: return createCollectionRef();
      case VMLPackage.UNIT_REF: return createUnitRef();
      case VMLPackage.BOX_REF: return createBoxRef();
      case VMLPackage.TYPE_ALIAS_REF: return createTypeAliasRef();
      case VMLPackage.AUX_TYPE_REF: return createAuxTypeRef();
      case VMLPackage.SHAPE_REF: return createShapeRef();
      case VMLPackage.NUMBER_TYPE_REF: return createNumberTypeRef();
      case VMLPackage.VISUAL_TYPE_REF: return createVisualTypeRef();
      case VMLPackage.TYPE_ALIAS: return createTypeAlias();
      case VMLPackage.STREAM: return createStream();
      case VMLPackage.LSTREAM_VALUE: return createLStreamValue();
      case VMLPackage.RSTREAM_VALUE: return createRStreamValue();
      case VMLPackage.INPUT_REF: return createInputRef();
      case VMLPackage.OUTPUT_REF: return createOutputRef();
      case VMLPackage.INVOKATION: return createInvokation();
      case VMLPackage.INVOKATION_PARAM: return createInvokationParam();
      case VMLPackage.LOOP: return createLoop();
      case VMLPackage.LOOP_SENTENCE: return createLoopSentence();
      case VMLPackage.LOOP_FOR: return createLoopFor();
      case VMLPackage.FACTORY: return createFactory();
      case VMLPackage.FILE: return createFile();
      case VMLPackage.CANVAS: return createCanvas();
      case VMLPackage.OPERATION: return createOperation();
      case VMLPackage.UNARY_OPERATION: return createUnaryOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case VMLPackage.OP:
        return createOpFromString(eDataType, initialValue);
      case VMLPackage.NUMBER_TYPE:
        return createNumberTypeFromString(eDataType, initialValue);
      case VMLPackage.VISUAL_TYPE:
        return createVisualTypeFromString(eDataType, initialValue);
      case VMLPackage.AUX_TYPE:
        return createAuxTypeFromString(eDataType, initialValue);
      case VMLPackage.COLLECTION_TYPE:
        return createCollectionTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case VMLPackage.OP:
        return convertOpToString(eDataType, instanceValue);
      case VMLPackage.NUMBER_TYPE:
        return convertNumberTypeToString(eDataType, instanceValue);
      case VMLPackage.VISUAL_TYPE:
        return convertVisualTypeToString(eDataType, instanceValue);
      case VMLPackage.AUX_TYPE:
        return convertAuxTypeToString(eDataType, instanceValue);
      case VMLPackage.COLLECTION_TYPE:
        return convertCollectionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sentence createSentence()
  {
    SentenceImpl sentence = new SentenceImpl();
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RValue createRValue()
  {
    RValueImpl rValue = new RValueImpl();
    return rValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeRef createNodeRef()
  {
    NodeRefImpl nodeRef = new NodeRefImpl();
    return nodeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberRef createMemberRef()
  {
    MemberRefImpl memberRef = new MemberRefImpl();
    return memberRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantRef createConstantRef()
  {
    ConstantRefImpl constantRef = new ConstantRefImpl();
    return constantRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleLiteral createSingleLiteral()
  {
    SingleLiteralImpl singleLiteral = new SingleLiteralImpl();
    return singleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceLiteral createSequenceLiteral()
  {
    SequenceLiteralImpl sequenceLiteral = new SequenceLiteralImpl();
    return sequenceLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceLiteralSerie createSequenceLiteralSerie()
  {
    SequenceLiteralSerieImpl sequenceLiteralSerie = new SequenceLiteralSerieImpl();
    return sequenceLiteralSerie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceLiteralPlain createSequenceLiteralPlain()
  {
    SequenceLiteralPlainImpl sequenceLiteralPlain = new SequenceLiteralPlainImpl();
    return sequenceLiteralPlain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleLiteral createTupleLiteral()
  {
    TupleLiteralImpl tupleLiteral = new TupleLiteralImpl();
    return tupleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleItem createTupleItem()
  {
    TupleItemImpl tupleItem = new TupleItemImpl();
    return tupleItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Noop createNoop()
  {
    NoopImpl noop = new NoopImpl();
    return noop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pair createPair()
  {
    PairImpl pair = new PairImpl();
    return pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit createUnit()
  {
    UnitImpl unit = new UnitImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DUnit createDUnit()
  {
    DUnitImpl dUnit = new DUnitImpl();
    return dUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NUnit createNUnit()
  {
    NUnitImpl nUnit = new NUnitImpl();
    return nUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Box createBox()
  {
    BoxImpl box = new BoxImpl();
    return box;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape createShape()
  {
    ShapeImpl shape = new ShapeImpl();
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlainTypeRef createPlainTypeRef()
  {
    PlainTypeRefImpl plainTypeRef = new PlainTypeRefImpl();
    return plainTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeTypeRef createCompositeTypeRef()
  {
    CompositeTypeRefImpl compositeTypeRef = new CompositeTypeRefImpl();
    return compositeTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceTypeRef createSequenceTypeRef()
  {
    SequenceTypeRefImpl sequenceTypeRef = new SequenceTypeRefImpl();
    return sequenceTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleTypeRef createTupleTypeRef()
  {
    TupleTypeRefImpl tupleTypeRef = new TupleTypeRefImpl();
    return tupleTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleTypeRefItem createTupleTypeRefItem()
  {
    TupleTypeRefItemImpl tupleTypeRefItem = new TupleTypeRefItemImpl();
    return tupleTypeRefItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetTypeRef createSetTypeRef()
  {
    SetTypeRefImpl setTypeRef = new SetTypeRefImpl();
    return setTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidTypeRef createVoidTypeRef()
  {
    VoidTypeRefImpl voidTypeRef = new VoidTypeRefImpl();
    return voidTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoTypeRef createAutoTypeRef()
  {
    AutoTypeRefImpl autoTypeRef = new AutoTypeRefImpl();
    return autoTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionRef createCollectionRef()
  {
    CollectionRefImpl collectionRef = new CollectionRefImpl();
    return collectionRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitRef createUnitRef()
  {
    UnitRefImpl unitRef = new UnitRefImpl();
    return unitRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxRef createBoxRef()
  {
    BoxRefImpl boxRef = new BoxRefImpl();
    return boxRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAliasRef createTypeAliasRef()
  {
    TypeAliasRefImpl typeAliasRef = new TypeAliasRefImpl();
    return typeAliasRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuxTypeRef createAuxTypeRef()
  {
    AuxTypeRefImpl auxTypeRef = new AuxTypeRefImpl();
    return auxTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeRef createShapeRef()
  {
    ShapeRefImpl shapeRef = new ShapeRefImpl();
    return shapeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberTypeRef createNumberTypeRef()
  {
    NumberTypeRefImpl numberTypeRef = new NumberTypeRefImpl();
    return numberTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualTypeRef createVisualTypeRef()
  {
    VisualTypeRefImpl visualTypeRef = new VisualTypeRefImpl();
    return visualTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAlias createTypeAlias()
  {
    TypeAliasImpl typeAlias = new TypeAliasImpl();
    return typeAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stream createStream()
  {
    StreamImpl stream = new StreamImpl();
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LStreamValue createLStreamValue()
  {
    LStreamValueImpl lStreamValue = new LStreamValueImpl();
    return lStreamValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RStreamValue createRStreamValue()
  {
    RStreamValueImpl rStreamValue = new RStreamValueImpl();
    return rStreamValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputRef createInputRef()
  {
    InputRefImpl inputRef = new InputRefImpl();
    return inputRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputRef createOutputRef()
  {
    OutputRefImpl outputRef = new OutputRefImpl();
    return outputRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invokation createInvokation()
  {
    InvokationImpl invokation = new InvokationImpl();
    return invokation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokationParam createInvokationParam()
  {
    InvokationParamImpl invokationParam = new InvokationParamImpl();
    return invokationParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopSentence createLoopSentence()
  {
    LoopSentenceImpl loopSentence = new LoopSentenceImpl();
    return loopSentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopFor createLoopFor()
  {
    LoopForImpl loopFor = new LoopForImpl();
    return loopFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factory createFactory()
  {
    FactoryImpl factory = new FactoryImpl();
    return factory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Canvas createCanvas()
  {
    CanvasImpl canvas = new CanvasImpl();
    return canvas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperation createUnaryOperation()
  {
    UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
    return unaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Op createOpFromString(EDataType eDataType, String initialValue)
  {
    Op result = Op.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberType createNumberTypeFromString(EDataType eDataType, String initialValue)
  {
    NumberType result = NumberType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNumberTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualType createVisualTypeFromString(EDataType eDataType, String initialValue)
  {
    VisualType result = VisualType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisualTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuxType createAuxTypeFromString(EDataType eDataType, String initialValue)
  {
    AuxType result = AuxType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAuxTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionType createCollectionTypeFromString(EDataType eDataType, String initialValue)
  {
    CollectionType result = CollectionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCollectionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMLPackage getVMLPackage()
  {
    return (VMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VMLPackage getPackage()
  {
    return VMLPackage.eINSTANCE;
  }

} //VMLFactoryImpl
