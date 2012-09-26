package com.visualligence.g.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.visualligence.g.services.VMLGrammarAccess;
import com.visualligence.g.vML.AutoTypeRef;
import com.visualligence.g.vML.AuxTypeRef;
import com.visualligence.g.vML.Block;
import com.visualligence.g.vML.Box;
import com.visualligence.g.vML.BoxRef;
import com.visualligence.g.vML.Canvas;
import com.visualligence.g.vML.CollectionRef;
import com.visualligence.g.vML.Constant;
import com.visualligence.g.vML.ConstantRef;
import com.visualligence.g.vML.DUnit;
import com.visualligence.g.vML.Factory;
import com.visualligence.g.vML.File;
import com.visualligence.g.vML.Import;
import com.visualligence.g.vML.InputRef;
import com.visualligence.g.vML.Invokation;
import com.visualligence.g.vML.InvokationParam;
import com.visualligence.g.vML.Loop;
import com.visualligence.g.vML.LoopSentence;
import com.visualligence.g.vML.Member;
import com.visualligence.g.vML.MemberRef;
import com.visualligence.g.vML.Module;
import com.visualligence.g.vML.Multi;
import com.visualligence.g.vML.NUnit;
import com.visualligence.g.vML.NodeRef;
import com.visualligence.g.vML.Noop;
import com.visualligence.g.vML.NumberTypeRef;
import com.visualligence.g.vML.Operation;
import com.visualligence.g.vML.OutputRef;
import com.visualligence.g.vML.Pair;
import com.visualligence.g.vML.SequenceLiteralPlain;
import com.visualligence.g.vML.SequenceLiteralSerie;
import com.visualligence.g.vML.SequenceTypeRef;
import com.visualligence.g.vML.SetTypeRef;
import com.visualligence.g.vML.Shape;
import com.visualligence.g.vML.ShapeRef;
import com.visualligence.g.vML.SingleLiteral;
import com.visualligence.g.vML.Stream;
import com.visualligence.g.vML.Switch;
import com.visualligence.g.vML.TupleItem;
import com.visualligence.g.vML.TupleLiteral;
import com.visualligence.g.vML.TupleTypeRef;
import com.visualligence.g.vML.TupleTypeRefItem;
import com.visualligence.g.vML.TypeAlias;
import com.visualligence.g.vML.TypeAliasRef;
import com.visualligence.g.vML.UnaryOperation;
import com.visualligence.g.vML.UnitRef;
import com.visualligence.g.vML.VMLPackage;
import com.visualligence.g.vML.VisualTypeRef;
import com.visualligence.g.vML.VoidTypeRef;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractVMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VMLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VMLPackage.AUTO_TYPE_REF:
				if(context == grammarAccess.getAutoTypeRefRule() ||
				   context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_AutoTypeRef(context, (AutoTypeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.AUX_TYPE_REF:
				if(context == grammarAccess.getAuxTypeRefRule() ||
				   context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_AuxTypeRef(context, (AuxTypeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.BOX:
				if(context == grammarAccess.getBoxRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Box(context, (Box) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.BOX_REF:
				if(context == grammarAccess.getBoxRefRule() ||
				   context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_BoxRef(context, (BoxRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.CANVAS:
				if(context == grammarAccess.getCanvasRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Canvas(context, (Canvas) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.COLLECTION_REF:
				if(context == grammarAccess.getCollectionRefRule() ||
				   context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_CollectionRef(context, (CollectionRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.CONSTANT_REF:
				if(context == grammarAccess.getConstantRefRule() ||
				   context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionAddRule() ||
				   context == grammarAccess.getLiteralExpressionAddAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionBinRule() ||
				   context == grammarAccess.getLiteralExpressionBinAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionCompRule() ||
				   context == grammarAccess.getLiteralExpressionCompAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionExpRule() ||
				   context == grammarAccess.getLiteralExpressionExpAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionMultiRule() ||
				   context == grammarAccess.getLiteralExpressionMultiAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionSignedRule() ||
				   context == grammarAccess.getLiteralExpressionTerminalRule() ||
				   context == grammarAccess.getRStreamValueRule() ||
				   context == grammarAccess.getRValueRule()) {
					sequence_ConstantRef(context, (ConstantRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.DUNIT:
				if(context == grammarAccess.getDUnitRule() ||
				   context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_DUnit(context, (DUnit) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.FACTORY:
				if(context == grammarAccess.getFactoryRule() ||
				   context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Factory(context, (Factory) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.FILE:
				if(context == grammarAccess.getFileRule() ||
				   context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_File(context, (File) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.INPUT_REF:
				if(context == grammarAccess.getInputRefRule() ||
				   context == grammarAccess.getRStreamValueRule()) {
					sequence_InputRef(context, (InputRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.INVOKATION:
				if(context == grammarAccess.getInvokationRule() ||
				   context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Invokation(context, (Invokation) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.INVOKATION_PARAM:
				if(context == grammarAccess.getInvokationParamRule()) {
					sequence_InvokationParam(context, (InvokationParam) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.LOOP:
				if(context == grammarAccess.getLoopRule() ||
				   context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Loop(context, (Loop) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.LOOP_SENTENCE:
				if(context == grammarAccess.getLoopSentenceRule()) {
					sequence_LoopSentence(context, (LoopSentence) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.MEMBER:
				if(context == grammarAccess.getMemberRule()) {
					sequence_Member(context, (Member) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.MEMBER_REF:
				if(context == grammarAccess.getMemberRefRule()) {
					sequence_MemberRef(context, (MemberRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.MULTI:
				if(context == grammarAccess.getMultiRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Multi(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.NUNIT:
				if(context == grammarAccess.getNUnitRule() ||
				   context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getUnitRule()) {
					sequence_NUnit(context, (NUnit) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.NODE_REF:
				if(context == grammarAccess.getNodeRefRule()) {
					sequence_NodeRef(context, (NodeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.NOOP:
				if(context == grammarAccess.getNoopRule() ||
				   context == grammarAccess.getSentenceRule()) {
					sequence_Noop(context, (Noop) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.NUMBER_TYPE_REF:
				if(context == grammarAccess.getNumberTypeRefRule() ||
				   context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_NumberTypeRef(context, (NumberTypeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.OPERATION:
				if(context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionAddRule() ||
				   context == grammarAccess.getLiteralExpressionAddAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionBinRule() ||
				   context == grammarAccess.getLiteralExpressionBinAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionCompRule() ||
				   context == grammarAccess.getLiteralExpressionCompAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionExpRule() ||
				   context == grammarAccess.getLiteralExpressionExpAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionMultiRule() ||
				   context == grammarAccess.getLiteralExpressionMultiAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionSignedRule() ||
				   context == grammarAccess.getLiteralExpressionTerminalRule() ||
				   context == grammarAccess.getRStreamValueRule()) {
					sequence_LiteralExpressionAdd_LiteralExpressionBin_LiteralExpressionComp_LiteralExpressionExp_LiteralExpressionMulti(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.OUTPUT_REF:
				if(context == grammarAccess.getLStreamValueRule() ||
				   context == grammarAccess.getOutputRefRule()) {
					sequence_OutputRef(context, (OutputRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.PAIR:
				if(context == grammarAccess.getPairRule()) {
					sequence_Pair(context, (Pair) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.SEQUENCE_LITERAL_PLAIN:
				if(context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionAddRule() ||
				   context == grammarAccess.getLiteralExpressionAddAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionBinRule() ||
				   context == grammarAccess.getLiteralExpressionBinAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionCompRule() ||
				   context == grammarAccess.getLiteralExpressionCompAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionExpRule() ||
				   context == grammarAccess.getLiteralExpressionExpAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionMultiRule() ||
				   context == grammarAccess.getLiteralExpressionMultiAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionSignedRule() ||
				   context == grammarAccess.getLiteralExpressionTerminalRule() ||
				   context == grammarAccess.getLoopForRule() ||
				   context == grammarAccess.getRStreamValueRule() ||
				   context == grammarAccess.getRValueRule() ||
				   context == grammarAccess.getSequenceLiteralRule() ||
				   context == grammarAccess.getSequenceLiteralPlainRule()) {
					sequence_SequenceLiteralPlain(context, (SequenceLiteralPlain) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.SEQUENCE_LITERAL_SERIE:
				if(context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionAddRule() ||
				   context == grammarAccess.getLiteralExpressionAddAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionBinRule() ||
				   context == grammarAccess.getLiteralExpressionBinAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionCompRule() ||
				   context == grammarAccess.getLiteralExpressionCompAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionExpRule() ||
				   context == grammarAccess.getLiteralExpressionExpAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionMultiRule() ||
				   context == grammarAccess.getLiteralExpressionMultiAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionSignedRule() ||
				   context == grammarAccess.getLiteralExpressionTerminalRule() ||
				   context == grammarAccess.getLoopForRule() ||
				   context == grammarAccess.getRStreamValueRule() ||
				   context == grammarAccess.getRValueRule() ||
				   context == grammarAccess.getSequenceLiteralRule() ||
				   context == grammarAccess.getSequenceLiteralSerieRule()) {
					sequence_SequenceLiteralSerie(context, (SequenceLiteralSerie) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.SEQUENCE_TYPE_REF:
				if(context == grammarAccess.getCompositeTypeRefRule() ||
				   context == grammarAccess.getSequenceTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_SequenceTypeRef(context, (SequenceTypeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.SET_TYPE_REF:
				if(context == grammarAccess.getCompositeTypeRefRule() ||
				   context == grammarAccess.getSetTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_SetTypeRef(context, (SetTypeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.SHAPE:
				if(context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getShapeRule()) {
					sequence_Shape(context, (Shape) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.SHAPE_REF:
				if(context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getShapeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_ShapeRef(context, (ShapeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.SINGLE_LITERAL:
				if(context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionAddRule() ||
				   context == grammarAccess.getLiteralExpressionAddAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionBinRule() ||
				   context == grammarAccess.getLiteralExpressionBinAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionCompRule() ||
				   context == grammarAccess.getLiteralExpressionCompAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionExpRule() ||
				   context == grammarAccess.getLiteralExpressionExpAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionMultiRule() ||
				   context == grammarAccess.getLiteralExpressionMultiAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionSignedRule() ||
				   context == grammarAccess.getLiteralExpressionTerminalRule() ||
				   context == grammarAccess.getRStreamValueRule() ||
				   context == grammarAccess.getRValueRule() ||
				   context == grammarAccess.getSingleLiteralRule()) {
					sequence_SingleLiteral(context, (SingleLiteral) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.STREAM:
				if(context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getStreamRule()) {
					sequence_Stream(context, (Stream) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.SWITCH:
				if(context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getSwitchRule()) {
					sequence_Switch(context, (Switch) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.TUPLE_ITEM:
				if(context == grammarAccess.getTupleItemRule()) {
					sequence_TupleItem(context, (TupleItem) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.TUPLE_LITERAL:
				if(context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionAddRule() ||
				   context == grammarAccess.getLiteralExpressionAddAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionBinRule() ||
				   context == grammarAccess.getLiteralExpressionBinAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionCompRule() ||
				   context == grammarAccess.getLiteralExpressionCompAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionExpRule() ||
				   context == grammarAccess.getLiteralExpressionExpAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionMultiRule() ||
				   context == grammarAccess.getLiteralExpressionMultiAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionSignedRule() ||
				   context == grammarAccess.getLiteralExpressionTerminalRule() ||
				   context == grammarAccess.getRStreamValueRule() ||
				   context == grammarAccess.getRValueRule() ||
				   context == grammarAccess.getTupleLiteralRule()) {
					sequence_TupleLiteral(context, (TupleLiteral) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.TUPLE_TYPE_REF:
				if(context == grammarAccess.getCompositeTypeRefRule() ||
				   context == grammarAccess.getTupleTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_TupleTypeRef(context, (TupleTypeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.TUPLE_TYPE_REF_ITEM:
				if(context == grammarAccess.getTupleTypeRefItemRule()) {
					sequence_TupleTypeRefItem(context, (TupleTypeRefItem) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.TYPE_ALIAS:
				if(context == grammarAccess.getSentenceRule() ||
				   context == grammarAccess.getTypeAliasRule()) {
					sequence_TypeAlias(context, (TypeAlias) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.TYPE_ALIAS_REF:
				if(context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeAliasRefRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_TypeAliasRef(context, (TypeAliasRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.UNARY_OPERATION:
				if(context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionAddRule() ||
				   context == grammarAccess.getLiteralExpressionAddAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionBinRule() ||
				   context == grammarAccess.getLiteralExpressionBinAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionCompRule() ||
				   context == grammarAccess.getLiteralExpressionCompAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionExpRule() ||
				   context == grammarAccess.getLiteralExpressionExpAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionMultiRule() ||
				   context == grammarAccess.getLiteralExpressionMultiAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralExpressionSignedRule() ||
				   context == grammarAccess.getLiteralExpressionTerminalRule() ||
				   context == grammarAccess.getRStreamValueRule()) {
					sequence_LiteralExpressionSigned(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.UNIT_REF:
				if(context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule() ||
				   context == grammarAccess.getUnitRefRule()) {
					sequence_UnitRef(context, (UnitRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.VISUAL_TYPE_REF:
				if(context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule() ||
				   context == grammarAccess.getVisualTypeRefRule()) {
					sequence_VisualTypeRef(context, (VisualTypeRef) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.VOID_TYPE_REF:
				if(context == grammarAccess.getPlainTypeRefRule() ||
				   context == grammarAccess.getTypeRefRule() ||
				   context == grammarAccess.getVoidTypeRefRule()) {
					sequence_VoidTypeRef(context, (VoidTypeRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {AutoTypeRef}
	 */
	protected void sequence_AutoTypeRef(EObject context, AutoTypeRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=AuxType
	 */
	protected void sequence_AuxTypeRef(EObject context, AuxTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.AUX_TYPE_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.AUX_TYPE_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAuxTypeRefAccess().getRefAuxTypeEnumRuleCall_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? sentences+=Sentence*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Box|ID]
	 */
	protected void sequence_BoxRef(EObject context, BoxRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.BOX_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.BOX_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoxRefAccess().getRefBoxIDTerminalRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID members+=Member*)
	 */
	protected void sequence_Box(EObject context, Box semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=Pair*)
	 */
	protected void sequence_Canvas(EObject context, Canvas semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (collection=CollectionType typeref=TypeRef)
	 */
	protected void sequence_CollectionRef(EObject context, CollectionRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.COLLECTION_REF__COLLECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.COLLECTION_REF__COLLECTION));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.COLLECTION_REF__TYPEREF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.COLLECTION_REF__TYPEREF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCollectionRefAccess().getCollectionCollectionTypeEnumRuleCall_0_0(), semanticObject.getCollection());
		feeder.accept(grammarAccess.getCollectionRefAccess().getTyperefTypeRefParserRuleCall_2_0(), semanticObject.getTyperef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     constantref=[Constant|ID]
	 */
	protected void sequence_ConstantRef(EObject context, ConstantRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.CONSTANT_REF__CONSTANTREF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.CONSTANT_REF__CONSTANTREF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantRefAccess().getConstantrefConstantIDTerminalRuleCall_0_1(), semanticObject.getConstantref());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef value=LiteralExpression)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SENTENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SENTENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.CONSTANT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.CONSTANT__TYPE));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantAccess().getTypeTypeRefParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConstantAccess().getValueLiteralExpressionParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID op=MultiOp? factor=INT multi=[Multi|ID]? parent=[Unit|ID])
	 */
	protected void sequence_DUnit(EObject context, DUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef)
	 */
	protected void sequence_Factory(EObject context, Factory semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SENTENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SENTENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.FACTORY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.FACTORY__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFactoryAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFactoryAccess().getTypeTypeRefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID isinput?='<-'? path=STRING)
	 */
	protected void sequence_File(EObject context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {InputRef}
	 */
	protected void sequence_InputRef(EObject context, InputRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID source=LiteralExpression)
	 */
	protected void sequence_InvokationParam(EObject context, InvokationParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.INVOKATION_PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.INVOKATION_PARAM__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.INVOKATION_PARAM__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.INVOKATION_PARAM__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInvokationParamAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInvokationParamAccess().getSourceLiteralExpressionParserRuleCall_2_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (module=ID name=ID sentences+=InvokationParam*)
	 */
	protected void sequence_Invokation(EObject context, Invokation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=LiteralExpressionMulti_Operation_1_0 op=MultiOp right=LiteralExpressionMulti) | 
	 *         (left=LiteralExpressionExp_Operation_1_0 op=ExpOp right=LiteralExpressionExp) | 
	 *         (left=LiteralExpressionAdd_Operation_1_0 op=AddOp right=LiteralExpressionAdd) | 
	 *         (left=LiteralExpressionComp_Operation_1_0 op=CompOp right=LiteralExpressionComp) | 
	 *         (left=LiteralExpressionBin_Operation_1_0 op=BinOp right=LiteralExpressionBin)
	 *     )
	 */
	protected void sequence_LiteralExpressionAdd_LiteralExpressionBin_LiteralExpressionComp_LiteralExpressionExp_LiteralExpressionMulti(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((op=AddOp | op=NegationOp) right=LiteralExpressionTerminal)
	 */
	protected void sequence_LiteralExpressionSigned(EObject context, UnaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef o=LiteralExpression i=LiteralExpression?)
	 */
	protected void sequence_LoopSentence(EObject context, LoopSentence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (it=LoopFor? name=ID sentences+=LoopSentence*)
	 */
	protected void sequence_Loop(EObject context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     member=[LoopSentence|ID]
	 */
	protected void sequence_MemberRef(EObject context, MemberRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.MEMBER_REF__MEMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.MEMBER_REF__MEMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMemberRefAccess().getMemberLoopSentenceIDTerminalRuleCall_0_1(), semanticObject.getMember());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef)
	 */
	protected void sequence_Member(EObject context, Member semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.MEMBER__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.MEMBER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMemberAccess().getTypeTypeRefParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         inputtype=TypeRef? 
	 *         outputtype=TypeRef? 
	 *         author=STRING? 
	 *         creation=STRING? 
	 *         link=STRING? 
	 *         imports+=Import* 
	 *         sentences+=Sentence*
	 *     )
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID op=MultiOp? factor=INT parent=[Multi|ID]?)
	 */
	protected void sequence_Multi(EObject context, Multi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID numbertype=NumberType)
	 */
	protected void sequence_NUnit(EObject context, NUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SENTENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SENTENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.NUNIT__NUMBERTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.NUNIT__NUMBERTYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNUnitAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNUnitAccess().getNumbertypeNumberTypeEnumRuleCall_2_0(), semanticObject.getNumbertype());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     node=[Node|ID]
	 */
	protected void sequence_NodeRef(EObject context, NodeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.NODE_REF__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.NODE_REF__NODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeRefAccess().getNodeNodeIDTerminalRuleCall_0_1(), semanticObject.getNode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='noop'
	 */
	protected void sequence_Noop(EObject context, Noop semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SENTENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SENTENCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoopAccess().getNameNoopKeyword_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=NumberType
	 */
	protected void sequence_NumberTypeRef(EObject context, NumberTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.NUMBER_TYPE_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.NUMBER_TYPE_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberTypeRefAccess().getRefNumberTypeEnumRuleCall_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {OutputRef}
	 */
	protected void sequence_OutputRef(EObject context, OutputRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_Pair(EObject context, Pair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.PAIR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.PAIR__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.PAIR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPairAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((items+=LiteralExpression items+=LiteralExpression*)?)
	 */
	protected void sequence_SequenceLiteralPlain(EObject context, SequenceLiteralPlain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (init=LiteralExpression end=LiteralExpression inc=LiteralExpression?)
	 */
	protected void sequence_SequenceLiteralSerie(EObject context, SequenceLiteralSerie semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=TypeRef
	 */
	protected void sequence_SequenceTypeRef(EObject context, SequenceTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SEQUENCE_TYPE_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SEQUENCE_TYPE_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSequenceTypeRefAccess().getTypeTypeRefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=TypeRef
	 */
	protected void sequence_SetTypeRef(EObject context, SetTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SET_TYPE_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SET_TYPE_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetTypeRefAccess().getTypeTypeRefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Shape|ID]
	 */
	protected void sequence_ShapeRef(EObject context, ShapeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SHAPE_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SHAPE_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShapeRefAccess().getRefShapeIDTerminalRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Shape(EObject context, Shape semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SENTENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SENTENCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShapeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=SingleLiteralDT
	 */
	protected void sequence_SingleLiteral(EObject context, SingleLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SINGLE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SINGLE_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleLiteralAccess().getValueSingleLiteralDTParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='stream'? left=LStreamValue right=RStreamValue)
	 */
	protected void sequence_Stream(EObject context, Stream semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID test=LiteralExpression a=LiteralExpression b=LiteralExpression)
	 */
	protected void sequence_Switch(EObject context, Switch semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SENTENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SENTENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SWITCH__TEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SWITCH__TEST));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SWITCH__A) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SWITCH__A));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SWITCH__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SWITCH__B));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSwitchAccess().getTestLiteralExpressionParserRuleCall_2_0(), semanticObject.getTest());
		feeder.accept(grammarAccess.getSwitchAccess().getALiteralExpressionParserRuleCall_4_0(), semanticObject.getA());
		feeder.accept(grammarAccess.getSwitchAccess().getBLiteralExpressionParserRuleCall_6_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=LiteralExpression)
	 */
	protected void sequence_TupleItem(EObject context, TupleItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.TUPLE_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.TUPLE_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.TUPLE_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.TUPLE_ITEM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTupleItemAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTupleItemAccess().getValueLiteralExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((items+=TupleItem items+=TupleItem*)?)
	 */
	protected void sequence_TupleLiteral(EObject context, TupleLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef)
	 */
	protected void sequence_TupleTypeRefItem(EObject context, TupleTypeRefItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.TUPLE_TYPE_REF_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.TUPLE_TYPE_REF_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.TUPLE_TYPE_REF_ITEM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.TUPLE_TYPE_REF_ITEM__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTupleTypeRefItemAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTupleTypeRefItemAccess().getTypeTypeRefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((items+=TupleTypeRefItem items+=TupleTypeRefItem*)?)
	 */
	protected void sequence_TupleTypeRef(EObject context, TupleTypeRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[TypeAlias|ID]
	 */
	protected void sequence_TypeAliasRef(EObject context, TypeAliasRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.TYPE_ALIAS_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.TYPE_ALIAS_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAliasRefAccess().getRefTypeAliasIDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef)
	 */
	protected void sequence_TypeAlias(EObject context, TypeAlias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.SENTENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.SENTENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.TYPE_ALIAS__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.TYPE_ALIAS__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeAliasAccess().getTypeTypeRefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     unittype=[Unit|ID]
	 */
	protected void sequence_UnitRef(EObject context, UnitRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.UNIT_REF__UNITTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.UNIT_REF__UNITTYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnitRefAccess().getUnittypeUnitIDTerminalRuleCall_1_0_1(), semanticObject.getUnittype());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=VisualType
	 */
	protected void sequence_VisualTypeRef(EObject context, VisualTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.VISUAL_TYPE_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.VISUAL_TYPE_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVisualTypeRefAccess().getRefVisualTypeEnumRuleCall_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='void'
	 */
	protected void sequence_VoidTypeRef(EObject context, VoidTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.VOID_TYPE_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.VOID_TYPE_REF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVoidTypeRefAccess().getNameVoidKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
}
