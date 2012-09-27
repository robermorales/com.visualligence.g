package com.visualligence.g.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.visualligence.g.services.VMLGrammarAccess;
import com.visualligence.g.vML.Hash;
import com.visualligence.g.vML.HashItem;
import com.visualligence.g.vML.Input;
import com.visualligence.g.vML.List;
import com.visualligence.g.vML.Literal;
import com.visualligence.g.vML.Module;
import com.visualligence.g.vML.ModuleInstances;
import com.visualligence.g.vML.NativeType;
import com.visualligence.g.vML.Output;
import com.visualligence.g.vML.Stream;
import com.visualligence.g.vML.VMLPackage;
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
			case VMLPackage.HASH:
				if(context == grammarAccess.getHashRule() ||
				   context == grammarAccess.getTypeDeclRule()) {
					sequence_Hash(context, (Hash) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.HASH_ITEM:
				if(context == grammarAccess.getHashItemRule()) {
					sequence_HashItem(context, (HashItem) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.INPUT:
				if(context == grammarAccess.getInputRule() ||
				   context == grammarAccess.getStreamRule()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.LIST:
				if(context == grammarAccess.getListRule() ||
				   context == grammarAccess.getTypeDeclRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStreamRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.MODULE_INSTANCES:
				if(context == grammarAccess.getModuleInstancesRule()) {
					sequence_ModuleInstances(context, (ModuleInstances) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.NATIVE_TYPE:
				if(context == grammarAccess.getNativeTypeRule() ||
				   context == grammarAccess.getTypeDeclRule()) {
					sequence_NativeType(context, (NativeType) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.OUTPUT:
				if(context == grammarAccess.getOutputRule() ||
				   context == grammarAccess.getStreamRule()) {
					sequence_Output(context, (Output) semanticObject); 
					return; 
				}
				else break;
			case VMLPackage.STREAM:
				if(context == grammarAccess.getStreamRule() ||
				   context == grammarAccess.getStream_ImplRule()) {
					sequence_Stream_Impl(context, (Stream) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString type=[TypeDecl|EString])
	 */
	protected void sequence_HashItem(EObject context, HashItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.HASH_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.HASH_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.HASH_ITEM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.HASH_ITEM__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHashItemAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHashItemAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (items+=HashItem items+=HashItem*)?)
	 */
	protected void sequence_Hash(EObject context, Hash semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=[TypeDecl|EString])
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.STREAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.STREAM__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.STREAM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.STREAM__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInputAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=[TypeDecl|EString])
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.TYPE_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.TYPE_DECL__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.LIST__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.LIST__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getListAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString value=EString? type=[TypeDecl|EString])
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString desc=[Module|EString] (left+=Stream left+=Stream*)?)
	 */
	protected void sequence_ModuleInstances(EObject context, ModuleInstances semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (input+=Input input+=Input*)? 
	 *         (output+=Output output+=Output*)? 
	 *         (instances+=ModuleInstances instances+=ModuleInstances*)? 
	 *         (types+=TypeDecl types+=TypeDecl*)?
	 *     )
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=NativeTypeOptions)
	 */
	protected void sequence_NativeType(EObject context, NativeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.TYPE_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.TYPE_DECL__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.NATIVE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.NATIVE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNativeTypeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNativeTypeAccess().getTypeNativeTypeOptionsParserRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=[TypeDecl|EString] left=[Stream|EString]?)
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=[TypeDecl|EString])
	 */
	protected void sequence_Stream_Impl(EObject context, Stream semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.STREAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.STREAM__NAME));
			if(transientValues.isValueTransient(semanticObject, VMLPackage.Literals.STREAM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMLPackage.Literals.STREAM__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStream_ImplAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStream_ImplAccess().getTypeTypeDeclEStringParserRuleCall_4_0_1(), semanticObject.getType());
		feeder.finish();
	}
}
