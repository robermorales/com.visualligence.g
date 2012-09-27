/**
 */
package com.visualligence.g.vML.impl;

import com.visualligence.g.vML.*;

import org.eclipse.emf.ecore.EClass;
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
public class VMLFactoryImpl extends EFactoryImpl implements VMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VMLFactory init() {
		try {
			VMLFactory theVMLFactory = (VMLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.visualligence.com/g/VML"); 
			if (theVMLFactory != null) {
				return theVMLFactory;
			}
		}
		catch (Exception exception) {
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
	public VMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VMLPackage.MODULE: return createModule();
			case VMLPackage.TYPE_DECL: return createTypeDecl();
			case VMLPackage.STREAM: return createStream();
			case VMLPackage.INPUT: return createInput();
			case VMLPackage.OUTPUT: return createOutput();
			case VMLPackage.MODULE_INSTANCES: return createModuleInstances();
			case VMLPackage.LITERAL: return createLiteral();
			case VMLPackage.NATIVE_TYPE: return createNativeType();
			case VMLPackage.LIST: return createList();
			case VMLPackage.HASH: return createHash();
			case VMLPackage.NATIVE_TYPE_OPTIONS: return createNativeTypeOptions();
			case VMLPackage.HASH_ITEM: return createHashItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDecl createTypeDecl() {
		TypeDeclImpl typeDecl = new TypeDeclImpl();
		return typeDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stream createStream() {
		StreamImpl stream = new StreamImpl();
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleInstances createModuleInstances() {
		ModuleInstancesImpl moduleInstances = new ModuleInstancesImpl();
		return moduleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeType createNativeType() {
		NativeTypeImpl nativeType = new NativeTypeImpl();
		return nativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hash createHash() {
		HashImpl hash = new HashImpl();
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeTypeOptions createNativeTypeOptions() {
		NativeTypeOptionsImpl nativeTypeOptions = new NativeTypeOptionsImpl();
		return nativeTypeOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashItem createHashItem() {
		HashItemImpl hashItem = new HashItemImpl();
		return hashItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMLPackage getVMLPackage() {
		return (VMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VMLPackage getPackage() {
		return VMLPackage.eINSTANCE;
	}

} //VMLFactoryImpl
