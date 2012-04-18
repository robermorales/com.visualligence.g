/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML.util;

import com.visualligence.g.vML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.visualligence.g.vML.VMLPackage
 * @generated
 */
public class VMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VMLPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SENTENCE:
      {
        Sentence sentence = (Sentence)theEObject;
        T result = caseSentence(sentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = caseSentence(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SWITCH:
      {
        com.visualligence.g.vML.Switch switch_ = (com.visualligence.g.vML.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = caseNode(switch_);
        if (result == null) result = caseSentence(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.LITERAL_EXPRESSION:
      {
        LiteralExpression literalExpression = (LiteralExpression)theEObject;
        T result = caseLiteralExpression(literalExpression);
        if (result == null) result = caseRStreamValue(literalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.RVALUE:
      {
        RValue rValue = (RValue)theEObject;
        T result = caseRValue(rValue);
        if (result == null) result = caseLiteralExpression(rValue);
        if (result == null) result = caseRStreamValue(rValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.NODE_REF:
      {
        NodeRef nodeRef = (NodeRef)theEObject;
        T result = caseNodeRef(nodeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.MEMBER_REF:
      {
        MemberRef memberRef = (MemberRef)theEObject;
        T result = caseMemberRef(memberRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.CONSTANT_REF:
      {
        ConstantRef constantRef = (ConstantRef)theEObject;
        T result = caseConstantRef(constantRef);
        if (result == null) result = caseRValue(constantRef);
        if (result == null) result = caseLiteralExpression(constantRef);
        if (result == null) result = caseRStreamValue(constantRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SINGLE_LITERAL:
      {
        SingleLiteral singleLiteral = (SingleLiteral)theEObject;
        T result = caseSingleLiteral(singleLiteral);
        if (result == null) result = caseRValue(singleLiteral);
        if (result == null) result = caseLiteralExpression(singleLiteral);
        if (result == null) result = caseRStreamValue(singleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SEQUENCE_LITERAL:
      {
        SequenceLiteral sequenceLiteral = (SequenceLiteral)theEObject;
        T result = caseSequenceLiteral(sequenceLiteral);
        if (result == null) result = caseRValue(sequenceLiteral);
        if (result == null) result = caseLoopFor(sequenceLiteral);
        if (result == null) result = caseLiteralExpression(sequenceLiteral);
        if (result == null) result = caseRStreamValue(sequenceLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SEQUENCE_LITERAL_SERIE:
      {
        SequenceLiteralSerie sequenceLiteralSerie = (SequenceLiteralSerie)theEObject;
        T result = caseSequenceLiteralSerie(sequenceLiteralSerie);
        if (result == null) result = caseSequenceLiteral(sequenceLiteralSerie);
        if (result == null) result = caseRValue(sequenceLiteralSerie);
        if (result == null) result = caseLoopFor(sequenceLiteralSerie);
        if (result == null) result = caseLiteralExpression(sequenceLiteralSerie);
        if (result == null) result = caseRStreamValue(sequenceLiteralSerie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SEQUENCE_LITERAL_PLAIN:
      {
        SequenceLiteralPlain sequenceLiteralPlain = (SequenceLiteralPlain)theEObject;
        T result = caseSequenceLiteralPlain(sequenceLiteralPlain);
        if (result == null) result = caseSequenceLiteral(sequenceLiteralPlain);
        if (result == null) result = caseRValue(sequenceLiteralPlain);
        if (result == null) result = caseLoopFor(sequenceLiteralPlain);
        if (result == null) result = caseLiteralExpression(sequenceLiteralPlain);
        if (result == null) result = caseRStreamValue(sequenceLiteralPlain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.TUPLE_LITERAL:
      {
        TupleLiteral tupleLiteral = (TupleLiteral)theEObject;
        T result = caseTupleLiteral(tupleLiteral);
        if (result == null) result = caseRValue(tupleLiteral);
        if (result == null) result = caseLiteralExpression(tupleLiteral);
        if (result == null) result = caseRStreamValue(tupleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.TUPLE_ITEM:
      {
        TupleItem tupleItem = (TupleItem)theEObject;
        T result = caseTupleItem(tupleItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SET_LITERAL:
      {
        SetLiteral setLiteral = (SetLiteral)theEObject;
        T result = caseSetLiteral(setLiteral);
        if (result == null) result = caseRValue(setLiteral);
        if (result == null) result = caseLiteralExpression(setLiteral);
        if (result == null) result = caseRStreamValue(setLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseSentence(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.NOOP:
      {
        Noop noop = (Noop)theEObject;
        T result = caseNoop(noop);
        if (result == null) result = caseSentence(noop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.PAIR:
      {
        Pair pair = (Pair)theEObject;
        T result = casePair(pair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseSentence(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.MULTI:
      {
        Multi multi = (Multi)theEObject;
        T result = caseMulti(multi);
        if (result == null) result = caseSentence(multi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.UNIT:
      {
        Unit unit = (Unit)theEObject;
        T result = caseUnit(unit);
        if (result == null) result = caseSentence(unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.DUNIT:
      {
        DUnit dUnit = (DUnit)theEObject;
        T result = caseDUnit(dUnit);
        if (result == null) result = caseUnit(dUnit);
        if (result == null) result = caseSentence(dUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.NUNIT:
      {
        NUnit nUnit = (NUnit)theEObject;
        T result = caseNUnit(nUnit);
        if (result == null) result = caseUnit(nUnit);
        if (result == null) result = caseSentence(nUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.BOX:
      {
        Box box = (Box)theEObject;
        T result = caseBox(box);
        if (result == null) result = caseSentence(box);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SHAPE:
      {
        Shape shape = (Shape)theEObject;
        T result = caseShape(shape);
        if (result == null) result = caseSentence(shape);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.TYPE_REF:
      {
        TypeRef typeRef = (TypeRef)theEObject;
        T result = caseTypeRef(typeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.PLAIN_TYPE_REF:
      {
        PlainTypeRef plainTypeRef = (PlainTypeRef)theEObject;
        T result = casePlainTypeRef(plainTypeRef);
        if (result == null) result = caseTypeRef(plainTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.COMPOSITE_TYPE_REF:
      {
        CompositeTypeRef compositeTypeRef = (CompositeTypeRef)theEObject;
        T result = caseCompositeTypeRef(compositeTypeRef);
        if (result == null) result = caseTypeRef(compositeTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SEQUENCE_TYPE_REF:
      {
        SequenceTypeRef sequenceTypeRef = (SequenceTypeRef)theEObject;
        T result = caseSequenceTypeRef(sequenceTypeRef);
        if (result == null) result = caseCompositeTypeRef(sequenceTypeRef);
        if (result == null) result = caseTypeRef(sequenceTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.TUPLE_TYPE_REF:
      {
        TupleTypeRef tupleTypeRef = (TupleTypeRef)theEObject;
        T result = caseTupleTypeRef(tupleTypeRef);
        if (result == null) result = caseCompositeTypeRef(tupleTypeRef);
        if (result == null) result = caseTypeRef(tupleTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.TUPLE_TYPE_REF_ITEM:
      {
        TupleTypeRefItem tupleTypeRefItem = (TupleTypeRefItem)theEObject;
        T result = caseTupleTypeRefItem(tupleTypeRefItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SET_TYPE_REF:
      {
        SetTypeRef setTypeRef = (SetTypeRef)theEObject;
        T result = caseSetTypeRef(setTypeRef);
        if (result == null) result = caseCompositeTypeRef(setTypeRef);
        if (result == null) result = caseTypeRef(setTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.VOID_TYPE_REF:
      {
        VoidTypeRef voidTypeRef = (VoidTypeRef)theEObject;
        T result = caseVoidTypeRef(voidTypeRef);
        if (result == null) result = casePlainTypeRef(voidTypeRef);
        if (result == null) result = caseTypeRef(voidTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.AUTO_TYPE_REF:
      {
        AutoTypeRef autoTypeRef = (AutoTypeRef)theEObject;
        T result = caseAutoTypeRef(autoTypeRef);
        if (result == null) result = casePlainTypeRef(autoTypeRef);
        if (result == null) result = caseTypeRef(autoTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.COLLECTION_REF:
      {
        CollectionRef collectionRef = (CollectionRef)theEObject;
        T result = caseCollectionRef(collectionRef);
        if (result == null) result = casePlainTypeRef(collectionRef);
        if (result == null) result = caseTypeRef(collectionRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.UNIT_REF:
      {
        UnitRef unitRef = (UnitRef)theEObject;
        T result = caseUnitRef(unitRef);
        if (result == null) result = casePlainTypeRef(unitRef);
        if (result == null) result = caseTypeRef(unitRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.BOX_REF:
      {
        BoxRef boxRef = (BoxRef)theEObject;
        T result = caseBoxRef(boxRef);
        if (result == null) result = casePlainTypeRef(boxRef);
        if (result == null) result = caseTypeRef(boxRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.TYPE_ALIAS_REF:
      {
        TypeAliasRef typeAliasRef = (TypeAliasRef)theEObject;
        T result = caseTypeAliasRef(typeAliasRef);
        if (result == null) result = casePlainTypeRef(typeAliasRef);
        if (result == null) result = caseTypeRef(typeAliasRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.AUX_TYPE_REF:
      {
        AuxTypeRef auxTypeRef = (AuxTypeRef)theEObject;
        T result = caseAuxTypeRef(auxTypeRef);
        if (result == null) result = casePlainTypeRef(auxTypeRef);
        if (result == null) result = caseTypeRef(auxTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.SHAPE_REF:
      {
        ShapeRef shapeRef = (ShapeRef)theEObject;
        T result = caseShapeRef(shapeRef);
        if (result == null) result = casePlainTypeRef(shapeRef);
        if (result == null) result = caseTypeRef(shapeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.NUMBER_TYPE_REF:
      {
        NumberTypeRef numberTypeRef = (NumberTypeRef)theEObject;
        T result = caseNumberTypeRef(numberTypeRef);
        if (result == null) result = casePlainTypeRef(numberTypeRef);
        if (result == null) result = caseTypeRef(numberTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.VISUAL_TYPE_REF:
      {
        VisualTypeRef visualTypeRef = (VisualTypeRef)theEObject;
        T result = caseVisualTypeRef(visualTypeRef);
        if (result == null) result = casePlainTypeRef(visualTypeRef);
        if (result == null) result = caseTypeRef(visualTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.TYPE_ALIAS:
      {
        TypeAlias typeAlias = (TypeAlias)theEObject;
        T result = caseTypeAlias(typeAlias);
        if (result == null) result = caseSentence(typeAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.STREAM:
      {
        Stream stream = (Stream)theEObject;
        T result = caseStream(stream);
        if (result == null) result = caseSentence(stream);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.LSTREAM_VALUE:
      {
        LStreamValue lStreamValue = (LStreamValue)theEObject;
        T result = caseLStreamValue(lStreamValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.RSTREAM_VALUE:
      {
        RStreamValue rStreamValue = (RStreamValue)theEObject;
        T result = caseRStreamValue(rStreamValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.INPUT_REF:
      {
        InputRef inputRef = (InputRef)theEObject;
        T result = caseInputRef(inputRef);
        if (result == null) result = caseRStreamValue(inputRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.OUTPUT_REF:
      {
        OutputRef outputRef = (OutputRef)theEObject;
        T result = caseOutputRef(outputRef);
        if (result == null) result = caseLStreamValue(outputRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.INVOKATION:
      {
        Invokation invokation = (Invokation)theEObject;
        T result = caseInvokation(invokation);
        if (result == null) result = caseNode(invokation);
        if (result == null) result = caseSentence(invokation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.INVOKATION_PARAM:
      {
        InvokationParam invokationParam = (InvokationParam)theEObject;
        T result = caseInvokationParam(invokationParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.LOOP:
      {
        Loop loop = (Loop)theEObject;
        T result = caseLoop(loop);
        if (result == null) result = caseNode(loop);
        if (result == null) result = caseSentence(loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.LOOP_SENTENCE:
      {
        LoopSentence loopSentence = (LoopSentence)theEObject;
        T result = caseLoopSentence(loopSentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.LOOP_FOR:
      {
        LoopFor loopFor = (LoopFor)theEObject;
        T result = caseLoopFor(loopFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.FACTORY:
      {
        Factory factory = (Factory)theEObject;
        T result = caseFactory(factory);
        if (result == null) result = caseNode(factory);
        if (result == null) result = caseSentence(factory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.FILE:
      {
        File file = (File)theEObject;
        T result = caseFile(file);
        if (result == null) result = caseNode(file);
        if (result == null) result = caseSentence(file);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.CANVAS:
      {
        Canvas canvas = (Canvas)theEObject;
        T result = caseCanvas(canvas);
        if (result == null) result = caseSentence(canvas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseLiteralExpression(operation);
        if (result == null) result = caseRStreamValue(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMLPackage.UNARY_OPERATION:
      {
        UnaryOperation unaryOperation = (UnaryOperation)theEObject;
        T result = caseUnaryOperation(unaryOperation);
        if (result == null) result = caseLiteralExpression(unaryOperation);
        if (result == null) result = caseRStreamValue(unaryOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentence(Sentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(com.visualligence.g.vML.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralExpression(LiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RValue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RValue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRValue(RValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeRef(NodeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberRef(MemberRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantRef(ConstantRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleLiteral(SingleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceLiteral(SequenceLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Literal Serie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Literal Serie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceLiteralSerie(SequenceLiteralSerie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Literal Plain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Literal Plain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceLiteralPlain(SequenceLiteralPlain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleLiteral(TupleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleItem(TupleItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetLiteral(SetLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Noop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Noop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoop(Noop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePair(Pair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulti(Multi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnit(Unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DUnit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DUnit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDUnit(DUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NUnit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NUnit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNUnit(NUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBox(Box object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShape(Shape object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRef(TypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plain Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plain Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlainTypeRef(PlainTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeTypeRef(CompositeTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceTypeRef(SequenceTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleTypeRef(TupleTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Type Ref Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Type Ref Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleTypeRefItem(TupleTypeRefItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetTypeRef(SetTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoidTypeRef(VoidTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Auto Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Auto Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAutoTypeRef(AutoTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionRef(CollectionRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitRef(UnitRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoxRef(BoxRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Alias Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Alias Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeAliasRef(TypeAliasRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aux Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aux Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAuxTypeRef(AuxTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeRef(ShapeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberTypeRef(NumberTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualTypeRef(VisualTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeAlias(TypeAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStream(Stream object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LStream Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LStream Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLStreamValue(LStreamValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RStream Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RStream Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRStreamValue(RStreamValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputRef(InputRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputRef(OutputRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invokation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invokation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvokation(Invokation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invokation Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invokation Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvokationParam(InvokationParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoop(Loop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopSentence(LoopSentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopFor(LoopFor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Factory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Factory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactory(Factory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFile(File object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Canvas</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Canvas</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCanvas(Canvas object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryOperation(UnaryOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VMLSwitch
