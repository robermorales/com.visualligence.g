/**
 */
package com.visualligence.g.vML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.visualligence.g.vML.VMLFactory
 * @model kind="package"
 * @generated
 */
public interface VMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.visualligence.com/g/VML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VMLPackage eINSTANCE = com.visualligence.g.vML.impl.VMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.ModuleImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INSTANCES = 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TYPES = 4;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.TypeDeclImpl <em>Type Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.TypeDeclImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTypeDecl()
	 * @generated
	 */
	int TYPE_DECL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.StreamImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.InputImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = STREAM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = STREAM__TYPE;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = STREAM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.OutputImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = STREAM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = STREAM__TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LEFT = STREAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = STREAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.ModuleInstancesImpl <em>Module Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.ModuleInstancesImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getModuleInstances()
	 * @generated
	 */
	int MODULE_INSTANCES = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCES__DESC = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCES__LEFT = 2;

	/**
	 * The number of structural features of the '<em>Module Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.LiteralImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = STREAM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TYPE = STREAM__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = STREAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = STREAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.NativeTypeImpl <em>Native Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.NativeTypeImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNativeType()
	 * @generated
	 */
	int NATIVE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__NAME = TYPE_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__TYPE = TYPE_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Native Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.ListImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getList()
	 * @generated
	 */
	int LIST = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = TYPE_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TYPE = TYPE_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.HashImpl <em>Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.HashImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getHash()
	 * @generated
	 */
	int HASH = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__NAME = TYPE_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__ITEMS = TYPE_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.NativeTypeOptionsImpl <em>Native Type Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.NativeTypeOptionsImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNativeTypeOptions()
	 * @generated
	 */
	int NATIVE_TYPE_OPTIONS = 10;

	/**
	 * The number of structural features of the '<em>Native Type Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE_OPTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.visualligence.g.vML.impl.HashItemImpl <em>Hash Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.vML.impl.HashItemImpl
	 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getHashItem()
	 * @generated
	 */
	int HASH_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ITEM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Hash Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ITEM_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see com.visualligence.g.vML.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.visualligence.g.vML.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Module#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see com.visualligence.g.vML.Module#getInput()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Module#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see com.visualligence.g.vML.Module#getOutput()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Module#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see com.visualligence.g.vML.Module#getInstances()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Module#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.visualligence.g.vML.Module#getTypes()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Types();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.TypeDecl <em>Type Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Decl</em>'.
	 * @see com.visualligence.g.vML.TypeDecl
	 * @generated
	 */
	EClass getTypeDecl();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.vML.TypeDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.visualligence.g.vML.TypeDecl#getName()
	 * @see #getTypeDecl()
	 * @generated
	 */
	EAttribute getTypeDecl_Name();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see com.visualligence.g.vML.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Stream#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.visualligence.g.vML.Stream#getName()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_Name();

	/**
	 * Returns the meta object for the reference '{@link com.visualligence.g.vML.Stream#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.visualligence.g.vML.Stream#getType()
	 * @see #getStream()
	 * @generated
	 */
	EReference getStream_Type();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see com.visualligence.g.vML.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see com.visualligence.g.vML.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link com.visualligence.g.vML.Output#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see com.visualligence.g.vML.Output#getLeft()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Left();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.ModuleInstances <em>Module Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Instances</em>'.
	 * @see com.visualligence.g.vML.ModuleInstances
	 * @generated
	 */
	EClass getModuleInstances();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.vML.ModuleInstances#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.visualligence.g.vML.ModuleInstances#getName()
	 * @see #getModuleInstances()
	 * @generated
	 */
	EAttribute getModuleInstances_Name();

	/**
	 * Returns the meta object for the reference '{@link com.visualligence.g.vML.ModuleInstances#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Desc</em>'.
	 * @see com.visualligence.g.vML.ModuleInstances#getDesc()
	 * @see #getModuleInstances()
	 * @generated
	 */
	EReference getModuleInstances_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.ModuleInstances#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see com.visualligence.g.vML.ModuleInstances#getLeft()
	 * @see #getModuleInstances()
	 * @generated
	 */
	EReference getModuleInstances_Left();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.visualligence.g.vML.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.visualligence.g.vML.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Type</em>'.
	 * @see com.visualligence.g.vML.NativeType
	 * @generated
	 */
	EClass getNativeType();

	/**
	 * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.NativeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see com.visualligence.g.vML.NativeType#getType()
	 * @see #getNativeType()
	 * @generated
	 */
	EReference getNativeType_Type();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see com.visualligence.g.vML.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the reference '{@link com.visualligence.g.vML.List#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.visualligence.g.vML.List#getType()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Type();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash</em>'.
	 * @see com.visualligence.g.vML.Hash
	 * @generated
	 */
	EClass getHash();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Hash#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.visualligence.g.vML.Hash#getItems()
	 * @see #getHash()
	 * @generated
	 */
	EReference getHash_Items();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.NativeTypeOptions <em>Native Type Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Type Options</em>'.
	 * @see com.visualligence.g.vML.NativeTypeOptions
	 * @generated
	 */
	EClass getNativeTypeOptions();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.vML.HashItem <em>Hash Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Item</em>'.
	 * @see com.visualligence.g.vML.HashItem
	 * @generated
	 */
	EClass getHashItem();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.vML.HashItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.visualligence.g.vML.HashItem#getName()
	 * @see #getHashItem()
	 * @generated
	 */
	EAttribute getHashItem_Name();

	/**
	 * Returns the meta object for the reference '{@link com.visualligence.g.vML.HashItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.visualligence.g.vML.HashItem#getType()
	 * @see #getHashItem()
	 * @generated
	 */
	EReference getHashItem_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VMLFactory getVMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.ModuleImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__INPUT = eINSTANCE.getModule_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OUTPUT = eINSTANCE.getModule_Output();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__INSTANCES = eINSTANCE.getModule_Instances();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__TYPES = eINSTANCE.getModule_Types();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.TypeDeclImpl <em>Type Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.TypeDeclImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTypeDecl()
		 * @generated
		 */
		EClass TYPE_DECL = eINSTANCE.getTypeDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DECL__NAME = eINSTANCE.getTypeDecl_Name();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.StreamImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM__NAME = eINSTANCE.getStream_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM__TYPE = eINSTANCE.getStream_Type();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.InputImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.OutputImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__LEFT = eINSTANCE.getOutput_Left();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.ModuleInstancesImpl <em>Module Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.ModuleInstancesImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getModuleInstances()
		 * @generated
		 */
		EClass MODULE_INSTANCES = eINSTANCE.getModuleInstances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_INSTANCES__NAME = eINSTANCE.getModuleInstances_Name();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCES__DESC = eINSTANCE.getModuleInstances_Desc();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTANCES__LEFT = eINSTANCE.getModuleInstances_Left();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.LiteralImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.NativeTypeImpl <em>Native Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.NativeTypeImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNativeType()
		 * @generated
		 */
		EClass NATIVE_TYPE = eINSTANCE.getNativeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATIVE_TYPE__TYPE = eINSTANCE.getNativeType_Type();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.ListImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__TYPE = eINSTANCE.getList_Type();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.HashImpl <em>Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.HashImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getHash()
		 * @generated
		 */
		EClass HASH = eINSTANCE.getHash();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH__ITEMS = eINSTANCE.getHash_Items();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.NativeTypeOptionsImpl <em>Native Type Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.NativeTypeOptionsImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNativeTypeOptions()
		 * @generated
		 */
		EClass NATIVE_TYPE_OPTIONS = eINSTANCE.getNativeTypeOptions();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.vML.impl.HashItemImpl <em>Hash Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.vML.impl.HashItemImpl
		 * @see com.visualligence.g.vML.impl.VMLPackageImpl#getHashItem()
		 * @generated
		 */
		EClass HASH_ITEM = eINSTANCE.getHashItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_ITEM__NAME = eINSTANCE.getHashItem_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_ITEM__TYPE = eINSTANCE.getHashItem_Type();

	}

} //VMLPackage
