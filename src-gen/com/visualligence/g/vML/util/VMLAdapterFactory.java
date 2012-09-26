/**
 */
package com.visualligence.g.vML.util;

import com.visualligence.g.vML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.visualligence.g.vML.VMLPackage
 * @generated
 */
public class VMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VMLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VMLSwitch<Adapter> modelSwitch =
    new VMLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseSentence(Sentence object)
      {
        return createSentenceAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter caseLiteralExpression(LiteralExpression object)
      {
        return createLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseRValue(RValue object)
      {
        return createRValueAdapter();
      }
      @Override
      public Adapter caseNodeRef(NodeRef object)
      {
        return createNodeRefAdapter();
      }
      @Override
      public Adapter caseMemberRef(MemberRef object)
      {
        return createMemberRefAdapter();
      }
      @Override
      public Adapter caseConstantRef(ConstantRef object)
      {
        return createConstantRefAdapter();
      }
      @Override
      public Adapter caseSingleLiteral(SingleLiteral object)
      {
        return createSingleLiteralAdapter();
      }
      @Override
      public Adapter caseSequenceLiteral(SequenceLiteral object)
      {
        return createSequenceLiteralAdapter();
      }
      @Override
      public Adapter caseSequenceLiteralSerie(SequenceLiteralSerie object)
      {
        return createSequenceLiteralSerieAdapter();
      }
      @Override
      public Adapter caseSequenceLiteralPlain(SequenceLiteralPlain object)
      {
        return createSequenceLiteralPlainAdapter();
      }
      @Override
      public Adapter caseTupleLiteral(TupleLiteral object)
      {
        return createTupleLiteralAdapter();
      }
      @Override
      public Adapter caseTupleItem(TupleItem object)
      {
        return createTupleItemAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseNoop(Noop object)
      {
        return createNoopAdapter();
      }
      @Override
      public Adapter casePair(Pair object)
      {
        return createPairAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseUnit(Unit object)
      {
        return createUnitAdapter();
      }
      @Override
      public Adapter caseDUnit(DUnit object)
      {
        return createDUnitAdapter();
      }
      @Override
      public Adapter caseNUnit(NUnit object)
      {
        return createNUnitAdapter();
      }
      @Override
      public Adapter caseBox(Box object)
      {
        return createBoxAdapter();
      }
      @Override
      public Adapter caseShape(Shape object)
      {
        return createShapeAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseTypeRef(TypeRef object)
      {
        return createTypeRefAdapter();
      }
      @Override
      public Adapter casePlainTypeRef(PlainTypeRef object)
      {
        return createPlainTypeRefAdapter();
      }
      @Override
      public Adapter caseCompositeTypeRef(CompositeTypeRef object)
      {
        return createCompositeTypeRefAdapter();
      }
      @Override
      public Adapter caseSequenceTypeRef(SequenceTypeRef object)
      {
        return createSequenceTypeRefAdapter();
      }
      @Override
      public Adapter caseTupleTypeRef(TupleTypeRef object)
      {
        return createTupleTypeRefAdapter();
      }
      @Override
      public Adapter caseTupleTypeRefItem(TupleTypeRefItem object)
      {
        return createTupleTypeRefItemAdapter();
      }
      @Override
      public Adapter caseSetTypeRef(SetTypeRef object)
      {
        return createSetTypeRefAdapter();
      }
      @Override
      public Adapter caseVoidTypeRef(VoidTypeRef object)
      {
        return createVoidTypeRefAdapter();
      }
      @Override
      public Adapter caseAutoTypeRef(AutoTypeRef object)
      {
        return createAutoTypeRefAdapter();
      }
      @Override
      public Adapter caseCollectionRef(CollectionRef object)
      {
        return createCollectionRefAdapter();
      }
      @Override
      public Adapter caseUnitRef(UnitRef object)
      {
        return createUnitRefAdapter();
      }
      @Override
      public Adapter caseBoxRef(BoxRef object)
      {
        return createBoxRefAdapter();
      }
      @Override
      public Adapter caseTypeAliasRef(TypeAliasRef object)
      {
        return createTypeAliasRefAdapter();
      }
      @Override
      public Adapter caseAuxTypeRef(AuxTypeRef object)
      {
        return createAuxTypeRefAdapter();
      }
      @Override
      public Adapter caseShapeRef(ShapeRef object)
      {
        return createShapeRefAdapter();
      }
      @Override
      public Adapter caseNumberTypeRef(NumberTypeRef object)
      {
        return createNumberTypeRefAdapter();
      }
      @Override
      public Adapter caseVisualTypeRef(VisualTypeRef object)
      {
        return createVisualTypeRefAdapter();
      }
      @Override
      public Adapter caseTypeAlias(TypeAlias object)
      {
        return createTypeAliasAdapter();
      }
      @Override
      public Adapter caseStream(Stream object)
      {
        return createStreamAdapter();
      }
      @Override
      public Adapter caseLStreamValue(LStreamValue object)
      {
        return createLStreamValueAdapter();
      }
      @Override
      public Adapter caseRStreamValue(RStreamValue object)
      {
        return createRStreamValueAdapter();
      }
      @Override
      public Adapter caseInputRef(InputRef object)
      {
        return createInputRefAdapter();
      }
      @Override
      public Adapter caseOutputRef(OutputRef object)
      {
        return createOutputRefAdapter();
      }
      @Override
      public Adapter caseInvokation(Invokation object)
      {
        return createInvokationAdapter();
      }
      @Override
      public Adapter caseInvokationParam(InvokationParam object)
      {
        return createInvokationParamAdapter();
      }
      @Override
      public Adapter caseLoop(Loop object)
      {
        return createLoopAdapter();
      }
      @Override
      public Adapter caseLoopSentence(LoopSentence object)
      {
        return createLoopSentenceAdapter();
      }
      @Override
      public Adapter caseLoopFor(LoopFor object)
      {
        return createLoopForAdapter();
      }
      @Override
      public Adapter caseFactory(Factory object)
      {
        return createFactoryAdapter();
      }
      @Override
      public Adapter caseFile(File object)
      {
        return createFileAdapter();
      }
      @Override
      public Adapter caseCanvas(Canvas object)
      {
        return createCanvasAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseUnaryOperation(UnaryOperation object)
      {
        return createUnaryOperationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Sentence
   * @generated
   */
  public Adapter createSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.LiteralExpression
   * @generated
   */
  public Adapter createLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.RValue <em>RValue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.RValue
   * @generated
   */
  public Adapter createRValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.NodeRef <em>Node Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.NodeRef
   * @generated
   */
  public Adapter createNodeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.MemberRef <em>Member Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.MemberRef
   * @generated
   */
  public Adapter createMemberRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.ConstantRef <em>Constant Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.ConstantRef
   * @generated
   */
  public Adapter createConstantRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.SingleLiteral <em>Single Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.SingleLiteral
   * @generated
   */
  public Adapter createSingleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.SequenceLiteral <em>Sequence Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.SequenceLiteral
   * @generated
   */
  public Adapter createSequenceLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.SequenceLiteralSerie <em>Sequence Literal Serie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.SequenceLiteralSerie
   * @generated
   */
  public Adapter createSequenceLiteralSerieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.SequenceLiteralPlain <em>Sequence Literal Plain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.SequenceLiteralPlain
   * @generated
   */
  public Adapter createSequenceLiteralPlainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.TupleLiteral <em>Tuple Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.TupleLiteral
   * @generated
   */
  public Adapter createTupleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.TupleItem <em>Tuple Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.TupleItem
   * @generated
   */
  public Adapter createTupleItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Noop <em>Noop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Noop
   * @generated
   */
  public Adapter createNoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Pair
   * @generated
   */
  public Adapter createPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Unit
   * @generated
   */
  public Adapter createUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.DUnit <em>DUnit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.DUnit
   * @generated
   */
  public Adapter createDUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.NUnit <em>NUnit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.NUnit
   * @generated
   */
  public Adapter createNUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Box <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Box
   * @generated
   */
  public Adapter createBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Shape
   * @generated
   */
  public Adapter createShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.TypeRef
   * @generated
   */
  public Adapter createTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.PlainTypeRef <em>Plain Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.PlainTypeRef
   * @generated
   */
  public Adapter createPlainTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.CompositeTypeRef <em>Composite Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.CompositeTypeRef
   * @generated
   */
  public Adapter createCompositeTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.SequenceTypeRef <em>Sequence Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.SequenceTypeRef
   * @generated
   */
  public Adapter createSequenceTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.TupleTypeRef <em>Tuple Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.TupleTypeRef
   * @generated
   */
  public Adapter createTupleTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.TupleTypeRefItem <em>Tuple Type Ref Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.TupleTypeRefItem
   * @generated
   */
  public Adapter createTupleTypeRefItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.SetTypeRef <em>Set Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.SetTypeRef
   * @generated
   */
  public Adapter createSetTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.VoidTypeRef <em>Void Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.VoidTypeRef
   * @generated
   */
  public Adapter createVoidTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.AutoTypeRef <em>Auto Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.AutoTypeRef
   * @generated
   */
  public Adapter createAutoTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.CollectionRef <em>Collection Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.CollectionRef
   * @generated
   */
  public Adapter createCollectionRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.UnitRef <em>Unit Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.UnitRef
   * @generated
   */
  public Adapter createUnitRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.BoxRef <em>Box Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.BoxRef
   * @generated
   */
  public Adapter createBoxRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.TypeAliasRef <em>Type Alias Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.TypeAliasRef
   * @generated
   */
  public Adapter createTypeAliasRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.AuxTypeRef <em>Aux Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.AuxTypeRef
   * @generated
   */
  public Adapter createAuxTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.ShapeRef <em>Shape Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.ShapeRef
   * @generated
   */
  public Adapter createShapeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.NumberTypeRef <em>Number Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.NumberTypeRef
   * @generated
   */
  public Adapter createNumberTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.VisualTypeRef <em>Visual Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.VisualTypeRef
   * @generated
   */
  public Adapter createVisualTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.TypeAlias <em>Type Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.TypeAlias
   * @generated
   */
  public Adapter createTypeAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Stream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Stream
   * @generated
   */
  public Adapter createStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.LStreamValue <em>LStream Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.LStreamValue
   * @generated
   */
  public Adapter createLStreamValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.RStreamValue <em>RStream Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.RStreamValue
   * @generated
   */
  public Adapter createRStreamValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.InputRef <em>Input Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.InputRef
   * @generated
   */
  public Adapter createInputRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.OutputRef <em>Output Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.OutputRef
   * @generated
   */
  public Adapter createOutputRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Invokation <em>Invokation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Invokation
   * @generated
   */
  public Adapter createInvokationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.InvokationParam <em>Invokation Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.InvokationParam
   * @generated
   */
  public Adapter createInvokationParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Loop
   * @generated
   */
  public Adapter createLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.LoopSentence <em>Loop Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.LoopSentence
   * @generated
   */
  public Adapter createLoopSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.LoopFor <em>Loop For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.LoopFor
   * @generated
   */
  public Adapter createLoopForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Factory <em>Factory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Factory
   * @generated
   */
  public Adapter createFactoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.File
   * @generated
   */
  public Adapter createFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Canvas <em>Canvas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Canvas
   * @generated
   */
  public Adapter createCanvasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.visualligence.g.vML.UnaryOperation <em>Unary Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.visualligence.g.vML.UnaryOperation
   * @generated
   */
  public Adapter createUnaryOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VMLAdapterFactory
