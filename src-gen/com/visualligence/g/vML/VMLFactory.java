/**
 * <copyright>
 * </copyright>
 *
 */
package com.visualligence.g.vML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.visualligence.g.vML.VMLPackage
 * @generated
 */
public interface VMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VMLFactory eINSTANCE = com.visualligence.g.vML.impl.VMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sentence</em>'.
   * @generated
   */
  Sentence createSentence();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch</em>'.
   * @generated
   */
  Switch createSwitch();

  /**
   * Returns a new object of class '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Expression</em>'.
   * @generated
   */
  LiteralExpression createLiteralExpression();

  /**
   * Returns a new object of class '<em>RValue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RValue</em>'.
   * @generated
   */
  RValue createRValue();

  /**
   * Returns a new object of class '<em>Node Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Ref</em>'.
   * @generated
   */
  NodeRef createNodeRef();

  /**
   * Returns a new object of class '<em>Member Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Ref</em>'.
   * @generated
   */
  MemberRef createMemberRef();

  /**
   * Returns a new object of class '<em>Constant Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Ref</em>'.
   * @generated
   */
  ConstantRef createConstantRef();

  /**
   * Returns a new object of class '<em>Single Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Literal</em>'.
   * @generated
   */
  SingleLiteral createSingleLiteral();

  /**
   * Returns a new object of class '<em>Sequence Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Literal</em>'.
   * @generated
   */
  SequenceLiteral createSequenceLiteral();

  /**
   * Returns a new object of class '<em>Sequence Literal Serie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Literal Serie</em>'.
   * @generated
   */
  SequenceLiteralSerie createSequenceLiteralSerie();

  /**
   * Returns a new object of class '<em>Sequence Literal Plain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Literal Plain</em>'.
   * @generated
   */
  SequenceLiteralPlain createSequenceLiteralPlain();

  /**
   * Returns a new object of class '<em>Tuple Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Literal</em>'.
   * @generated
   */
  TupleLiteral createTupleLiteral();

  /**
   * Returns a new object of class '<em>Tuple Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Item</em>'.
   * @generated
   */
  TupleItem createTupleItem();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Noop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Noop</em>'.
   * @generated
   */
  Noop createNoop();

  /**
   * Returns a new object of class '<em>Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pair</em>'.
   * @generated
   */
  Pair createPair();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi</em>'.
   * @generated
   */
  Multi createMulti();

  /**
   * Returns a new object of class '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit</em>'.
   * @generated
   */
  Unit createUnit();

  /**
   * Returns a new object of class '<em>DUnit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DUnit</em>'.
   * @generated
   */
  DUnit createDUnit();

  /**
   * Returns a new object of class '<em>NUnit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NUnit</em>'.
   * @generated
   */
  NUnit createNUnit();

  /**
   * Returns a new object of class '<em>Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Box</em>'.
   * @generated
   */
  Box createBox();

  /**
   * Returns a new object of class '<em>Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape</em>'.
   * @generated
   */
  Shape createShape();

  /**
   * Returns a new object of class '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member</em>'.
   * @generated
   */
  Member createMember();

  /**
   * Returns a new object of class '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Ref</em>'.
   * @generated
   */
  TypeRef createTypeRef();

  /**
   * Returns a new object of class '<em>Plain Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plain Type Ref</em>'.
   * @generated
   */
  PlainTypeRef createPlainTypeRef();

  /**
   * Returns a new object of class '<em>Composite Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Type Ref</em>'.
   * @generated
   */
  CompositeTypeRef createCompositeTypeRef();

  /**
   * Returns a new object of class '<em>Sequence Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Type Ref</em>'.
   * @generated
   */
  SequenceTypeRef createSequenceTypeRef();

  /**
   * Returns a new object of class '<em>Tuple Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type Ref</em>'.
   * @generated
   */
  TupleTypeRef createTupleTypeRef();

  /**
   * Returns a new object of class '<em>Tuple Type Ref Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type Ref Item</em>'.
   * @generated
   */
  TupleTypeRefItem createTupleTypeRefItem();

  /**
   * Returns a new object of class '<em>Set Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Type Ref</em>'.
   * @generated
   */
  SetTypeRef createSetTypeRef();

  /**
   * Returns a new object of class '<em>Void Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Void Type Ref</em>'.
   * @generated
   */
  VoidTypeRef createVoidTypeRef();

  /**
   * Returns a new object of class '<em>Auto Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Auto Type Ref</em>'.
   * @generated
   */
  AutoTypeRef createAutoTypeRef();

  /**
   * Returns a new object of class '<em>Collection Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Ref</em>'.
   * @generated
   */
  CollectionRef createCollectionRef();

  /**
   * Returns a new object of class '<em>Unit Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit Ref</em>'.
   * @generated
   */
  UnitRef createUnitRef();

  /**
   * Returns a new object of class '<em>Box Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Box Ref</em>'.
   * @generated
   */
  BoxRef createBoxRef();

  /**
   * Returns a new object of class '<em>Type Alias Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Alias Ref</em>'.
   * @generated
   */
  TypeAliasRef createTypeAliasRef();

  /**
   * Returns a new object of class '<em>Aux Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aux Type Ref</em>'.
   * @generated
   */
  AuxTypeRef createAuxTypeRef();

  /**
   * Returns a new object of class '<em>Shape Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Ref</em>'.
   * @generated
   */
  ShapeRef createShapeRef();

  /**
   * Returns a new object of class '<em>Number Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Type Ref</em>'.
   * @generated
   */
  NumberTypeRef createNumberTypeRef();

  /**
   * Returns a new object of class '<em>Visual Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual Type Ref</em>'.
   * @generated
   */
  VisualTypeRef createVisualTypeRef();

  /**
   * Returns a new object of class '<em>Type Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Alias</em>'.
   * @generated
   */
  TypeAlias createTypeAlias();

  /**
   * Returns a new object of class '<em>Stream</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream</em>'.
   * @generated
   */
  Stream createStream();

  /**
   * Returns a new object of class '<em>LStream Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LStream Value</em>'.
   * @generated
   */
  LStreamValue createLStreamValue();

  /**
   * Returns a new object of class '<em>RStream Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RStream Value</em>'.
   * @generated
   */
  RStreamValue createRStreamValue();

  /**
   * Returns a new object of class '<em>Input Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Ref</em>'.
   * @generated
   */
  InputRef createInputRef();

  /**
   * Returns a new object of class '<em>Output Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Ref</em>'.
   * @generated
   */
  OutputRef createOutputRef();

  /**
   * Returns a new object of class '<em>Invokation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invokation</em>'.
   * @generated
   */
  Invokation createInvokation();

  /**
   * Returns a new object of class '<em>Invokation Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invokation Param</em>'.
   * @generated
   */
  InvokationParam createInvokationParam();

  /**
   * Returns a new object of class '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop</em>'.
   * @generated
   */
  Loop createLoop();

  /**
   * Returns a new object of class '<em>Loop Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Sentence</em>'.
   * @generated
   */
  LoopSentence createLoopSentence();

  /**
   * Returns a new object of class '<em>Loop For</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop For</em>'.
   * @generated
   */
  LoopFor createLoopFor();

  /**
   * Returns a new object of class '<em>Factory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Factory</em>'.
   * @generated
   */
  Factory createFactory();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  File createFile();

  /**
   * Returns a new object of class '<em>Canvas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Canvas</em>'.
   * @generated
   */
  Canvas createCanvas();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Unary Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Operation</em>'.
   * @generated
   */
  UnaryOperation createUnaryOperation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VMLPackage getVMLPackage();

} //VMLFactory
