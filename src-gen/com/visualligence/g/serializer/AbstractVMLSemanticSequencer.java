package com.visualligence.g.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.visualligence.g.model.visualligence.Hash;
import com.visualligence.g.model.visualligence.HashItem;
import com.visualligence.g.model.visualligence.Input;
import com.visualligence.g.model.visualligence.Module;
import com.visualligence.g.model.visualligence.Output;
import com.visualligence.g.model.visualligence.VisualligencePackage;
import com.visualligence.g.services.VMLGrammarAccess;
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
		if(semanticObject.eClass().getEPackage() == VisualligencePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VisualligencePackage.HASH:
				if(context == grammarAccess.getHashRule()) {
					sequence_Hash(context, (Hash) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeDeclRule()) {
					sequence_Hash_TypeDecl(context, (Hash) semanticObject); 
					return; 
				}
				else break;
			case VisualligencePackage.HASH_ITEM:
				if(context == grammarAccess.getHashItemRule()) {
					sequence_HashItem(context, (HashItem) semanticObject); 
					return; 
				}
				else break;
			case VisualligencePackage.INPUT:
				if(context == grammarAccess.getInputRule()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case VisualligencePackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case VisualligencePackage.OUTPUT:
				if(context == grammarAccess.getOutputRule()) {
					sequence_Output(context, (Output) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING type=[TypeDecl|ID])
	 */
	protected void sequence_HashItem(EObject context, HashItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VisualligencePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualligencePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, VisualligencePackage.Literals.TYPED_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualligencePackage.Literals.TYPED_ELEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHashItemAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHashItemAccess().getTypeTypeDeclIDTerminalRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((items+=HashItem items+=HashItem*)?)
	 */
	protected void sequence_Hash(EObject context, Hash semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((items+=HashItem items+=HashItem*)? name=STRING)
	 */
	protected void sequence_Hash_TypeDecl(EObject context, Hash semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING type=[TypeDecl|ID])
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VisualligencePackage.Literals.TYPED_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualligencePackage.Literals.TYPED_ELEMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, VisualligencePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualligencePackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInputAccess().getTypeTypeDeclIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (types+=TypeDecl* input+=Input* output+=Output*)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING type=[TypeDecl|ID])
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
