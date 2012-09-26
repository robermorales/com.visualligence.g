/**
 */
package com.visualligence.g.model.visualligence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.visualligence.g.model.visualligence.VisualligenceFactory
 * @model kind="package"
 * @generated
 */
public interface VisualligencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visualligence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.visualligence.com/vml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualligencePackage eINSTANCE = com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.NamedElementImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.ModuleImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getModule()
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
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INPUT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.ModuleInstancesImpl <em>Module Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.ModuleInstancesImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getModuleInstances()
	 * @generated
	 */
	int MODULE_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCES__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCES__DESC = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCES__LEFT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTANCES_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.TypeDeclImpl <em>Type Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.TypeDeclImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getTypeDecl()
	 * @generated
	 */
	int TYPE_DECL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.NativeTypeImpl <em>Native Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.NativeTypeImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getNativeType()
	 * @generated
	 */
	int NATIVE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__NAME = TYPE_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
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
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.ListImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getList()
	 * @generated
	 */
	int LIST = 5;

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
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.TypedElementImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.HashImpl <em>Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.HashImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getHash()
	 * @generated
	 */
	int HASH = 7;

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
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.HashItemImpl <em>Hash Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.HashItemImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getHashItem()
	 * @generated
	 */
	int HASH_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ITEM__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hash Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.StreamImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.LiteralImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TYPE = STREAM__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = STREAM__NAME;

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
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.InputImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = STREAM__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = STREAM__NAME;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = STREAM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.impl.OutputImpl
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = STREAM__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = STREAM__NAME;

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
	 * The meta object id for the '{@link com.visualligence.g.model.visualligence.NativeTypeOptions <em>Native Type Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.visualligence.g.model.visualligence.NativeTypeOptions
	 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getNativeTypeOptions()
	 * @generated
	 */
	int NATIVE_TYPE_OPTIONS = 13;


	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see com.visualligence.g.model.visualligence.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.model.visualligence.Module#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see com.visualligence.g.model.visualligence.Module#getInput()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.model.visualligence.Module#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see com.visualligence.g.model.visualligence.Module#getOutput()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.model.visualligence.Module#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see com.visualligence.g.model.visualligence.Module#getInstances()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.model.visualligence.Module#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.visualligence.g.model.visualligence.Module#getTypes()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Types();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.ModuleInstances <em>Module Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Instances</em>'.
	 * @see com.visualligence.g.model.visualligence.ModuleInstances
	 * @generated
	 */
	EClass getModuleInstances();

	/**
	 * Returns the meta object for the reference '{@link com.visualligence.g.model.visualligence.ModuleInstances#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Desc</em>'.
	 * @see com.visualligence.g.model.visualligence.ModuleInstances#getDesc()
	 * @see #getModuleInstances()
	 * @generated
	 */
	EReference getModuleInstances_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.model.visualligence.ModuleInstances#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see com.visualligence.g.model.visualligence.ModuleInstances#getLeft()
	 * @see #getModuleInstances()
	 * @generated
	 */
	EReference getModuleInstances_Left();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.TypeDecl <em>Type Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Decl</em>'.
	 * @see com.visualligence.g.model.visualligence.TypeDecl
	 * @generated
	 */
	EClass getTypeDecl();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.visualligence.g.model.visualligence.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.model.visualligence.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.visualligence.g.model.visualligence.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Type</em>'.
	 * @see com.visualligence.g.model.visualligence.NativeType
	 * @generated
	 */
	EClass getNativeType();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.model.visualligence.NativeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.visualligence.g.model.visualligence.NativeType#getType()
	 * @see #getNativeType()
	 * @generated
	 */
	EAttribute getNativeType_Type();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see com.visualligence.g.model.visualligence.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see com.visualligence.g.model.visualligence.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link com.visualligence.g.model.visualligence.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.visualligence.g.model.visualligence.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash</em>'.
	 * @see com.visualligence.g.model.visualligence.Hash
	 * @generated
	 */
	EClass getHash();

	/**
	 * Returns the meta object for the containment reference list '{@link com.visualligence.g.model.visualligence.Hash#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.visualligence.g.model.visualligence.Hash#getItems()
	 * @see #getHash()
	 * @generated
	 */
	EReference getHash_Items();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.HashItem <em>Hash Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Item</em>'.
	 * @see com.visualligence.g.model.visualligence.HashItem
	 * @generated
	 */
	EClass getHashItem();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see com.visualligence.g.model.visualligence.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.visualligence.g.model.visualligence.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.visualligence.g.model.visualligence.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.visualligence.g.model.visualligence.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see com.visualligence.g.model.visualligence.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link com.visualligence.g.model.visualligence.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see com.visualligence.g.model.visualligence.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link com.visualligence.g.model.visualligence.Output#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see com.visualligence.g.model.visualligence.Output#getLeft()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Left();

	/**
	 * Returns the meta object for enum '{@link com.visualligence.g.model.visualligence.NativeTypeOptions <em>Native Type Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Native Type Options</em>'.
	 * @see com.visualligence.g.model.visualligence.NativeTypeOptions
	 * @generated
	 */
	EEnum getNativeTypeOptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualligenceFactory getVisualligenceFactory();

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
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.ModuleImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

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
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.ModuleInstancesImpl <em>Module Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.ModuleInstancesImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getModuleInstances()
		 * @generated
		 */
		EClass MODULE_INSTANCES = eINSTANCE.getModuleInstances();

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
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.TypeDeclImpl <em>Type Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.TypeDeclImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getTypeDecl()
		 * @generated
		 */
		EClass TYPE_DECL = eINSTANCE.getTypeDecl();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.NamedElementImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.NativeTypeImpl <em>Native Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.NativeTypeImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getNativeType()
		 * @generated
		 */
		EClass NATIVE_TYPE = eINSTANCE.getNativeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_TYPE__TYPE = eINSTANCE.getNativeType_Type();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.ListImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.TypedElementImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.HashImpl <em>Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.HashImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getHash()
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
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.HashItemImpl <em>Hash Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.HashItemImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getHashItem()
		 * @generated
		 */
		EClass HASH_ITEM = eINSTANCE.getHashItem();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.StreamImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.LiteralImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getLiteral()
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
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.InputImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.impl.OutputImpl
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getOutput()
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
		 * The meta object literal for the '{@link com.visualligence.g.model.visualligence.NativeTypeOptions <em>Native Type Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.visualligence.g.model.visualligence.NativeTypeOptions
		 * @see com.visualligence.g.model.visualligence.impl.VisualligencePackageImpl#getNativeTypeOptions()
		 * @generated
		 */
		EEnum NATIVE_TYPE_OPTIONS = eINSTANCE.getNativeTypeOptions();

	}

} //VisualligencePackage
