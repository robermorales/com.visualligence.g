/**
 */
package com.visualligence.g.vML;

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
 * @see com.visualligence.g.vML.VMLFactory
 * @model kind="package"
 * @generated
 */
public interface VMLPackage extends EPackage
{
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
   * The feature id for the '<em><b>Inputtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INPUTTYPE = 1;

  /**
   * The feature id for the '<em><b>Outputtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__OUTPUTTYPE = 2;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__AUTHOR = 3;

  /**
   * The feature id for the '<em><b>Creation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__CREATION = 4;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__LINK = 5;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__IMPORTS = 6;

  /**
   * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__SENTENCES = 7;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.ImportImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.SentenceImpl <em>Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.SentenceImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSentence()
   * @generated
   */
  int SENTENCE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.NodeImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNode()
   * @generated
   */
  int NODE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = SENTENCE__NAME;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.SwitchImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__TEST = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__A = NODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__B = NODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.RStreamValueImpl <em>RStream Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.RStreamValueImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getRStreamValue()
   * @generated
   */
  int RSTREAM_VALUE = 47;

  /**
   * The number of structural features of the '<em>RStream Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSTREAM_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.LiteralExpressionImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLiteralExpression()
   * @generated
   */
  int LITERAL_EXPRESSION = 5;

  /**
   * The number of structural features of the '<em>Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION_FEATURE_COUNT = RSTREAM_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.RValueImpl <em>RValue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.RValueImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getRValue()
   * @generated
   */
  int RVALUE = 6;

  /**
   * The number of structural features of the '<em>RValue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RVALUE_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.NodeRefImpl <em>Node Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.NodeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNodeRef()
   * @generated
   */
  int NODE_REF = 7;

  /**
   * The feature id for the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_REF__NODE = 0;

  /**
   * The number of structural features of the '<em>Node Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.MemberRefImpl <em>Member Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.MemberRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getMemberRef()
   * @generated
   */
  int MEMBER_REF = 8;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_REF__MEMBER = 0;

  /**
   * The number of structural features of the '<em>Member Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.ConstantRefImpl <em>Constant Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.ConstantRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getConstantRef()
   * @generated
   */
  int CONSTANT_REF = 9;

  /**
   * The feature id for the '<em><b>Constantref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_REF__CONSTANTREF = RVALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_REF_FEATURE_COUNT = RVALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.SingleLiteralImpl <em>Single Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.SingleLiteralImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSingleLiteral()
   * @generated
   */
  int SINGLE_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_LITERAL__VALUE = RVALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_LITERAL_FEATURE_COUNT = RVALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.SequenceLiteralImpl <em>Sequence Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.SequenceLiteralImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSequenceLiteral()
   * @generated
   */
  int SEQUENCE_LITERAL = 11;

  /**
   * The number of structural features of the '<em>Sequence Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_LITERAL_FEATURE_COUNT = RVALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.SequenceLiteralSerieImpl <em>Sequence Literal Serie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.SequenceLiteralSerieImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSequenceLiteralSerie()
   * @generated
   */
  int SEQUENCE_LITERAL_SERIE = 12;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_LITERAL_SERIE__INIT = SEQUENCE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_LITERAL_SERIE__END = SEQUENCE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_LITERAL_SERIE__INC = SEQUENCE_LITERAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sequence Literal Serie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_LITERAL_SERIE_FEATURE_COUNT = SEQUENCE_LITERAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.SequenceLiteralPlainImpl <em>Sequence Literal Plain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.SequenceLiteralPlainImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSequenceLiteralPlain()
   * @generated
   */
  int SEQUENCE_LITERAL_PLAIN = 13;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_LITERAL_PLAIN__ITEMS = SEQUENCE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence Literal Plain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_LITERAL_PLAIN_FEATURE_COUNT = SEQUENCE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.TupleLiteralImpl <em>Tuple Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.TupleLiteralImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTupleLiteral()
   * @generated
   */
  int TUPLE_LITERAL = 14;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_LITERAL__ITEMS = RVALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_LITERAL_FEATURE_COUNT = RVALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.TupleItemImpl <em>Tuple Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.TupleItemImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTupleItem()
   * @generated
   */
  int TUPLE_ITEM = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_ITEM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Tuple Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.BlockImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__NAME = SENTENCE__NAME;

  /**
   * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__SENTENCES = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.NoopImpl <em>Noop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.NoopImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNoop()
   * @generated
   */
  int NOOP = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOOP__NAME = SENTENCE__NAME;

  /**
   * The number of structural features of the '<em>Noop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOOP_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.PairImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getPair()
   * @generated
   */
  int PAIR = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.ConstantImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = SENTENCE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__TYPE = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.MultiImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__NAME = SENTENCE__NAME;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__OP = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__FACTOR = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__PARENT = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.UnitImpl <em>Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.UnitImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getUnit()
   * @generated
   */
  int UNIT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__NAME = SENTENCE__NAME;

  /**
   * The number of structural features of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.DUnitImpl <em>DUnit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.DUnitImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getDUnit()
   * @generated
   */
  int DUNIT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUNIT__NAME = UNIT__NAME;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUNIT__OP = UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUNIT__FACTOR = UNIT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Multi</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUNIT__MULTI = UNIT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUNIT__PARENT = UNIT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>DUnit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.NUnitImpl <em>NUnit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.NUnitImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNUnit()
   * @generated
   */
  int NUNIT = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUNIT__NAME = UNIT__NAME;

  /**
   * The feature id for the '<em><b>Numbertype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUNIT__NUMBERTYPE = UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>NUnit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.BoxImpl <em>Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.BoxImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getBox()
   * @generated
   */
  int BOX = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX__NAME = SENTENCE__NAME;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX__MEMBERS = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.ShapeImpl <em>Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.ShapeImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getShape()
   * @generated
   */
  int SHAPE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE__NAME = SENTENCE__NAME;

  /**
   * The number of structural features of the '<em>Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.MemberImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.TypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 27;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.PlainTypeRefImpl <em>Plain Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.PlainTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getPlainTypeRef()
   * @generated
   */
  int PLAIN_TYPE_REF = 28;

  /**
   * The number of structural features of the '<em>Plain Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_TYPE_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.CompositeTypeRefImpl <em>Composite Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.CompositeTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getCompositeTypeRef()
   * @generated
   */
  int COMPOSITE_TYPE_REF = 29;

  /**
   * The number of structural features of the '<em>Composite Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_TYPE_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.SequenceTypeRefImpl <em>Sequence Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.SequenceTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSequenceTypeRef()
   * @generated
   */
  int SEQUENCE_TYPE_REF = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE_REF__TYPE = COMPOSITE_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE_REF_FEATURE_COUNT = COMPOSITE_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.TupleTypeRefImpl <em>Tuple Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.TupleTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTupleTypeRef()
   * @generated
   */
  int TUPLE_TYPE_REF = 31;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_REF__ITEMS = COMPOSITE_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_REF_FEATURE_COUNT = COMPOSITE_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.TupleTypeRefItemImpl <em>Tuple Type Ref Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.TupleTypeRefItemImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTupleTypeRefItem()
   * @generated
   */
  int TUPLE_TYPE_REF_ITEM = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_REF_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_REF_ITEM__TYPE = 1;

  /**
   * The number of structural features of the '<em>Tuple Type Ref Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_REF_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.SetTypeRefImpl <em>Set Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.SetTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSetTypeRef()
   * @generated
   */
  int SET_TYPE_REF = 33;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_REF__TYPE = COMPOSITE_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_REF_FEATURE_COUNT = COMPOSITE_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.VoidTypeRefImpl <em>Void Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.VoidTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getVoidTypeRef()
   * @generated
   */
  int VOID_TYPE_REF = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_REF__NAME = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Void Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.AutoTypeRefImpl <em>Auto Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.AutoTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getAutoTypeRef()
   * @generated
   */
  int AUTO_TYPE_REF = 35;

  /**
   * The number of structural features of the '<em>Auto Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_TYPE_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.CollectionRefImpl <em>Collection Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.CollectionRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getCollectionRef()
   * @generated
   */
  int COLLECTION_REF = 36;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_REF__COLLECTION = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Typeref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_REF__TYPEREF = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Collection Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.UnitRefImpl <em>Unit Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.UnitRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getUnitRef()
   * @generated
   */
  int UNIT_REF = 37;

  /**
   * The feature id for the '<em><b>Unittype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_REF__UNITTYPE = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unit Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.BoxRefImpl <em>Box Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.BoxRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getBoxRef()
   * @generated
   */
  int BOX_REF = 38;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_REF__REF = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Box Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.TypeAliasRefImpl <em>Type Alias Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.TypeAliasRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTypeAliasRef()
   * @generated
   */
  int TYPE_ALIAS_REF = 39;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS_REF__REF = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Alias Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.AuxTypeRefImpl <em>Aux Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.AuxTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getAuxTypeRef()
   * @generated
   */
  int AUX_TYPE_REF = 40;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX_TYPE_REF__REF = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Aux Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUX_TYPE_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.ShapeRefImpl <em>Shape Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.ShapeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getShapeRef()
   * @generated
   */
  int SHAPE_REF = 41;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_REF__REF = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Shape Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.NumberTypeRefImpl <em>Number Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.NumberTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNumberTypeRef()
   * @generated
   */
  int NUMBER_TYPE_REF = 42;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_TYPE_REF__REF = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_TYPE_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.VisualTypeRefImpl <em>Visual Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.VisualTypeRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getVisualTypeRef()
   * @generated
   */
  int VISUAL_TYPE_REF = 43;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_TYPE_REF__REF = PLAIN_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Visual Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUAL_TYPE_REF_FEATURE_COUNT = PLAIN_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.TypeAliasImpl <em>Type Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.TypeAliasImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTypeAlias()
   * @generated
   */
  int TYPE_ALIAS = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS__NAME = SENTENCE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS__TYPE = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.StreamImpl <em>Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.StreamImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getStream()
   * @generated
   */
  int STREAM = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__NAME = SENTENCE__NAME;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__LEFT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__RIGHT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.LStreamValueImpl <em>LStream Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.LStreamValueImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLStreamValue()
   * @generated
   */
  int LSTREAM_VALUE = 46;

  /**
   * The number of structural features of the '<em>LStream Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSTREAM_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.InputRefImpl <em>Input Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.InputRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getInputRef()
   * @generated
   */
  int INPUT_REF = 48;

  /**
   * The number of structural features of the '<em>Input Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_REF_FEATURE_COUNT = RSTREAM_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.OutputRefImpl <em>Output Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.OutputRefImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getOutputRef()
   * @generated
   */
  int OUTPUT_REF = 49;

  /**
   * The number of structural features of the '<em>Output Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_REF_FEATURE_COUNT = LSTREAM_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.InvokationImpl <em>Invokation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.InvokationImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getInvokation()
   * @generated
   */
  int INVOKATION = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKATION__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Module</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKATION__MODULE = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKATION__SENTENCES = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Invokation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKATION_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.InvokationParamImpl <em>Invokation Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.InvokationParamImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getInvokationParam()
   * @generated
   */
  int INVOKATION_PARAM = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKATION_PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKATION_PARAM__SOURCE = 1;

  /**
   * The number of structural features of the '<em>Invokation Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKATION_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.LoopImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>It</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__IT = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__SENTENCES = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.LoopSentenceImpl <em>Loop Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.LoopSentenceImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLoopSentence()
   * @generated
   */
  int LOOP_SENTENCE = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_SENTENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_SENTENCE__TYPE = 1;

  /**
   * The feature id for the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_SENTENCE__O = 2;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_SENTENCE__I = 3;

  /**
   * The number of structural features of the '<em>Loop Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_SENTENCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.LoopForImpl <em>Loop For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.LoopForImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLoopFor()
   * @generated
   */
  int LOOP_FOR = 54;

  /**
   * The number of structural features of the '<em>Loop For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.FactoryImpl <em>Factory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.FactoryImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getFactory()
   * @generated
   */
  int FACTORY = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORY__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORY__TYPE = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Factory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORY_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.FileImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getFile()
   * @generated
   */
  int FILE = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Isinput</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__ISINPUT = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__PATH = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.CanvasImpl <em>Canvas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.CanvasImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getCanvas()
   * @generated
   */
  int CANVAS = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__NAME = SENTENCE__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__PROPERTIES = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Canvas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.OperationImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 58;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = LITERAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.impl.UnaryOperationImpl
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getUnaryOperation()
   * @generated
   */
  int UNARY_OPERATION = 59;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION__OP = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION__RIGHT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.Op <em>Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.Op
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getOp()
   * @generated
   */
  int OP = 60;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.NumberType <em>Number Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.NumberType
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNumberType()
   * @generated
   */
  int NUMBER_TYPE = 61;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.VisualType <em>Visual Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.VisualType
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getVisualType()
   * @generated
   */
  int VISUAL_TYPE = 62;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.AuxType <em>Aux Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.AuxType
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getAuxType()
   * @generated
   */
  int AUX_TYPE = 63;

  /**
   * The meta object id for the '{@link com.visualligence.g.vML.CollectionType <em>Collection Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visualligence.g.vML.CollectionType
   * @see com.visualligence.g.vML.impl.VMLPackageImpl#getCollectionType()
   * @generated
   */
  int COLLECTION_TYPE = 64;


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
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Module#getInputtype <em>Inputtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inputtype</em>'.
   * @see com.visualligence.g.vML.Module#getInputtype()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Inputtype();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Module#getOutputtype <em>Outputtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Outputtype</em>'.
   * @see com.visualligence.g.vML.Module#getOutputtype()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Outputtype();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Module#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author</em>'.
   * @see com.visualligence.g.vML.Module#getAuthor()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Author();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Module#getCreation <em>Creation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Creation</em>'.
   * @see com.visualligence.g.vML.Module#getCreation()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Creation();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Module#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link</em>'.
   * @see com.visualligence.g.vML.Module#getLink()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Link();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Module#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.visualligence.g.vML.Module#getImports()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Module#getSentences <em>Sentences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentences</em>'.
   * @see com.visualligence.g.vML.Module#getSentences()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Sentences();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.visualligence.g.vML.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.visualligence.g.vML.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence</em>'.
   * @see com.visualligence.g.vML.Sentence
   * @generated
   */
  EClass getSentence();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Sentence#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visualligence.g.vML.Sentence#getName()
   * @see #getSentence()
   * @generated
   */
  EAttribute getSentence_Name();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see com.visualligence.g.vML.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see com.visualligence.g.vML.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Switch#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see com.visualligence.g.vML.Switch#getTest()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Test();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Switch#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see com.visualligence.g.vML.Switch#getA()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_A();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Switch#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see com.visualligence.g.vML.Switch#getB()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_B();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Expression</em>'.
   * @see com.visualligence.g.vML.LiteralExpression
   * @generated
   */
  EClass getLiteralExpression();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.RValue <em>RValue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RValue</em>'.
   * @see com.visualligence.g.vML.RValue
   * @generated
   */
  EClass getRValue();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.NodeRef <em>Node Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Ref</em>'.
   * @see com.visualligence.g.vML.NodeRef
   * @generated
   */
  EClass getNodeRef();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.NodeRef#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node</em>'.
   * @see com.visualligence.g.vML.NodeRef#getNode()
   * @see #getNodeRef()
   * @generated
   */
  EReference getNodeRef_Node();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.MemberRef <em>Member Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Ref</em>'.
   * @see com.visualligence.g.vML.MemberRef
   * @generated
   */
  EClass getMemberRef();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.MemberRef#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member</em>'.
   * @see com.visualligence.g.vML.MemberRef#getMember()
   * @see #getMemberRef()
   * @generated
   */
  EReference getMemberRef_Member();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.ConstantRef <em>Constant Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Ref</em>'.
   * @see com.visualligence.g.vML.ConstantRef
   * @generated
   */
  EClass getConstantRef();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.ConstantRef#getConstantref <em>Constantref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Constantref</em>'.
   * @see com.visualligence.g.vML.ConstantRef#getConstantref()
   * @see #getConstantRef()
   * @generated
   */
  EReference getConstantRef_Constantref();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.SingleLiteral <em>Single Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Literal</em>'.
   * @see com.visualligence.g.vML.SingleLiteral
   * @generated
   */
  EClass getSingleLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.SingleLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.visualligence.g.vML.SingleLiteral#getValue()
   * @see #getSingleLiteral()
   * @generated
   */
  EAttribute getSingleLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.SequenceLiteral <em>Sequence Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Literal</em>'.
   * @see com.visualligence.g.vML.SequenceLiteral
   * @generated
   */
  EClass getSequenceLiteral();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.SequenceLiteralSerie <em>Sequence Literal Serie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Literal Serie</em>'.
   * @see com.visualligence.g.vML.SequenceLiteralSerie
   * @generated
   */
  EClass getSequenceLiteralSerie();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.SequenceLiteralSerie#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see com.visualligence.g.vML.SequenceLiteralSerie#getInit()
   * @see #getSequenceLiteralSerie()
   * @generated
   */
  EReference getSequenceLiteralSerie_Init();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.SequenceLiteralSerie#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see com.visualligence.g.vML.SequenceLiteralSerie#getEnd()
   * @see #getSequenceLiteralSerie()
   * @generated
   */
  EReference getSequenceLiteralSerie_End();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.SequenceLiteralSerie#getInc <em>Inc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inc</em>'.
   * @see com.visualligence.g.vML.SequenceLiteralSerie#getInc()
   * @see #getSequenceLiteralSerie()
   * @generated
   */
  EReference getSequenceLiteralSerie_Inc();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.SequenceLiteralPlain <em>Sequence Literal Plain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Literal Plain</em>'.
   * @see com.visualligence.g.vML.SequenceLiteralPlain
   * @generated
   */
  EClass getSequenceLiteralPlain();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.SequenceLiteralPlain#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.visualligence.g.vML.SequenceLiteralPlain#getItems()
   * @see #getSequenceLiteralPlain()
   * @generated
   */
  EReference getSequenceLiteralPlain_Items();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.TupleLiteral <em>Tuple Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Literal</em>'.
   * @see com.visualligence.g.vML.TupleLiteral
   * @generated
   */
  EClass getTupleLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.TupleLiteral#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.visualligence.g.vML.TupleLiteral#getItems()
   * @see #getTupleLiteral()
   * @generated
   */
  EReference getTupleLiteral_Items();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.TupleItem <em>Tuple Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Item</em>'.
   * @see com.visualligence.g.vML.TupleItem
   * @generated
   */
  EClass getTupleItem();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.TupleItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visualligence.g.vML.TupleItem#getName()
   * @see #getTupleItem()
   * @generated
   */
  EAttribute getTupleItem_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.TupleItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.visualligence.g.vML.TupleItem#getValue()
   * @see #getTupleItem()
   * @generated
   */
  EReference getTupleItem_Value();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see com.visualligence.g.vML.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Block#getSentences <em>Sentences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentences</em>'.
   * @see com.visualligence.g.vML.Block#getSentences()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Sentences();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Noop <em>Noop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Noop</em>'.
   * @see com.visualligence.g.vML.Noop
   * @generated
   */
  EClass getNoop();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair</em>'.
   * @see com.visualligence.g.vML.Pair
   * @generated
   */
  EClass getPair();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Pair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visualligence.g.vML.Pair#getName()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Name();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Pair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.visualligence.g.vML.Pair#getValue()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Value();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see com.visualligence.g.vML.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Constant#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.visualligence.g.vML.Constant#getType()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.visualligence.g.vML.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Value();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see com.visualligence.g.vML.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Multi#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.visualligence.g.vML.Multi#getOp()
   * @see #getMulti()
   * @generated
   */
  EAttribute getMulti_Op();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Multi#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor</em>'.
   * @see com.visualligence.g.vML.Multi#getFactor()
   * @see #getMulti()
   * @generated
   */
  EAttribute getMulti_Factor();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.Multi#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see com.visualligence.g.vML.Multi#getParent()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Parent();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit</em>'.
   * @see com.visualligence.g.vML.Unit
   * @generated
   */
  EClass getUnit();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.DUnit <em>DUnit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DUnit</em>'.
   * @see com.visualligence.g.vML.DUnit
   * @generated
   */
  EClass getDUnit();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.DUnit#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.visualligence.g.vML.DUnit#getOp()
   * @see #getDUnit()
   * @generated
   */
  EAttribute getDUnit_Op();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.DUnit#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor</em>'.
   * @see com.visualligence.g.vML.DUnit#getFactor()
   * @see #getDUnit()
   * @generated
   */
  EAttribute getDUnit_Factor();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.DUnit#getMulti <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Multi</em>'.
   * @see com.visualligence.g.vML.DUnit#getMulti()
   * @see #getDUnit()
   * @generated
   */
  EReference getDUnit_Multi();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.DUnit#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see com.visualligence.g.vML.DUnit#getParent()
   * @see #getDUnit()
   * @generated
   */
  EReference getDUnit_Parent();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.NUnit <em>NUnit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NUnit</em>'.
   * @see com.visualligence.g.vML.NUnit
   * @generated
   */
  EClass getNUnit();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.NUnit#getNumbertype <em>Numbertype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numbertype</em>'.
   * @see com.visualligence.g.vML.NUnit#getNumbertype()
   * @see #getNUnit()
   * @generated
   */
  EAttribute getNUnit_Numbertype();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Box <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Box</em>'.
   * @see com.visualligence.g.vML.Box
   * @generated
   */
  EClass getBox();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Box#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.visualligence.g.vML.Box#getMembers()
   * @see #getBox()
   * @generated
   */
  EReference getBox_Members();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape</em>'.
   * @see com.visualligence.g.vML.Shape
   * @generated
   */
  EClass getShape();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see com.visualligence.g.vML.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visualligence.g.vML.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Member#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.visualligence.g.vML.Member#getType()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Type();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see com.visualligence.g.vML.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.PlainTypeRef <em>Plain Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plain Type Ref</em>'.
   * @see com.visualligence.g.vML.PlainTypeRef
   * @generated
   */
  EClass getPlainTypeRef();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.CompositeTypeRef <em>Composite Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Type Ref</em>'.
   * @see com.visualligence.g.vML.CompositeTypeRef
   * @generated
   */
  EClass getCompositeTypeRef();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.SequenceTypeRef <em>Sequence Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Type Ref</em>'.
   * @see com.visualligence.g.vML.SequenceTypeRef
   * @generated
   */
  EClass getSequenceTypeRef();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.SequenceTypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.visualligence.g.vML.SequenceTypeRef#getType()
   * @see #getSequenceTypeRef()
   * @generated
   */
  EReference getSequenceTypeRef_Type();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.TupleTypeRef <em>Tuple Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Type Ref</em>'.
   * @see com.visualligence.g.vML.TupleTypeRef
   * @generated
   */
  EClass getTupleTypeRef();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.TupleTypeRef#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.visualligence.g.vML.TupleTypeRef#getItems()
   * @see #getTupleTypeRef()
   * @generated
   */
  EReference getTupleTypeRef_Items();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.TupleTypeRefItem <em>Tuple Type Ref Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Type Ref Item</em>'.
   * @see com.visualligence.g.vML.TupleTypeRefItem
   * @generated
   */
  EClass getTupleTypeRefItem();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.TupleTypeRefItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visualligence.g.vML.TupleTypeRefItem#getName()
   * @see #getTupleTypeRefItem()
   * @generated
   */
  EAttribute getTupleTypeRefItem_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.TupleTypeRefItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.visualligence.g.vML.TupleTypeRefItem#getType()
   * @see #getTupleTypeRefItem()
   * @generated
   */
  EReference getTupleTypeRefItem_Type();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.SetTypeRef <em>Set Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Type Ref</em>'.
   * @see com.visualligence.g.vML.SetTypeRef
   * @generated
   */
  EClass getSetTypeRef();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.SetTypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.visualligence.g.vML.SetTypeRef#getType()
   * @see #getSetTypeRef()
   * @generated
   */
  EReference getSetTypeRef_Type();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.VoidTypeRef <em>Void Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void Type Ref</em>'.
   * @see com.visualligence.g.vML.VoidTypeRef
   * @generated
   */
  EClass getVoidTypeRef();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.VoidTypeRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visualligence.g.vML.VoidTypeRef#getName()
   * @see #getVoidTypeRef()
   * @generated
   */
  EAttribute getVoidTypeRef_Name();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.AutoTypeRef <em>Auto Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auto Type Ref</em>'.
   * @see com.visualligence.g.vML.AutoTypeRef
   * @generated
   */
  EClass getAutoTypeRef();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.CollectionRef <em>Collection Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Ref</em>'.
   * @see com.visualligence.g.vML.CollectionRef
   * @generated
   */
  EClass getCollectionRef();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.CollectionRef#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see com.visualligence.g.vML.CollectionRef#getCollection()
   * @see #getCollectionRef()
   * @generated
   */
  EAttribute getCollectionRef_Collection();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.CollectionRef#getTyperef <em>Typeref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typeref</em>'.
   * @see com.visualligence.g.vML.CollectionRef#getTyperef()
   * @see #getCollectionRef()
   * @generated
   */
  EReference getCollectionRef_Typeref();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.UnitRef <em>Unit Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit Ref</em>'.
   * @see com.visualligence.g.vML.UnitRef
   * @generated
   */
  EClass getUnitRef();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.UnitRef#getUnittype <em>Unittype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unittype</em>'.
   * @see com.visualligence.g.vML.UnitRef#getUnittype()
   * @see #getUnitRef()
   * @generated
   */
  EReference getUnitRef_Unittype();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.BoxRef <em>Box Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Box Ref</em>'.
   * @see com.visualligence.g.vML.BoxRef
   * @generated
   */
  EClass getBoxRef();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.BoxRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.visualligence.g.vML.BoxRef#getRef()
   * @see #getBoxRef()
   * @generated
   */
  EReference getBoxRef_Ref();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.TypeAliasRef <em>Type Alias Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Alias Ref</em>'.
   * @see com.visualligence.g.vML.TypeAliasRef
   * @generated
   */
  EClass getTypeAliasRef();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.TypeAliasRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.visualligence.g.vML.TypeAliasRef#getRef()
   * @see #getTypeAliasRef()
   * @generated
   */
  EReference getTypeAliasRef_Ref();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.AuxTypeRef <em>Aux Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aux Type Ref</em>'.
   * @see com.visualligence.g.vML.AuxTypeRef
   * @generated
   */
  EClass getAuxTypeRef();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.AuxTypeRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see com.visualligence.g.vML.AuxTypeRef#getRef()
   * @see #getAuxTypeRef()
   * @generated
   */
  EAttribute getAuxTypeRef_Ref();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.ShapeRef <em>Shape Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Ref</em>'.
   * @see com.visualligence.g.vML.ShapeRef
   * @generated
   */
  EClass getShapeRef();

  /**
   * Returns the meta object for the reference '{@link com.visualligence.g.vML.ShapeRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.visualligence.g.vML.ShapeRef#getRef()
   * @see #getShapeRef()
   * @generated
   */
  EReference getShapeRef_Ref();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.NumberTypeRef <em>Number Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Type Ref</em>'.
   * @see com.visualligence.g.vML.NumberTypeRef
   * @generated
   */
  EClass getNumberTypeRef();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.NumberTypeRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see com.visualligence.g.vML.NumberTypeRef#getRef()
   * @see #getNumberTypeRef()
   * @generated
   */
  EAttribute getNumberTypeRef_Ref();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.VisualTypeRef <em>Visual Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visual Type Ref</em>'.
   * @see com.visualligence.g.vML.VisualTypeRef
   * @generated
   */
  EClass getVisualTypeRef();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.VisualTypeRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see com.visualligence.g.vML.VisualTypeRef#getRef()
   * @see #getVisualTypeRef()
   * @generated
   */
  EAttribute getVisualTypeRef_Ref();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.TypeAlias <em>Type Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Alias</em>'.
   * @see com.visualligence.g.vML.TypeAlias
   * @generated
   */
  EClass getTypeAlias();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.TypeAlias#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.visualligence.g.vML.TypeAlias#getType()
   * @see #getTypeAlias()
   * @generated
   */
  EReference getTypeAlias_Type();

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
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Stream#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.visualligence.g.vML.Stream#getLeft()
   * @see #getStream()
   * @generated
   */
  EReference getStream_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Stream#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.visualligence.g.vML.Stream#getRight()
   * @see #getStream()
   * @generated
   */
  EReference getStream_Right();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.LStreamValue <em>LStream Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LStream Value</em>'.
   * @see com.visualligence.g.vML.LStreamValue
   * @generated
   */
  EClass getLStreamValue();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.RStreamValue <em>RStream Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RStream Value</em>'.
   * @see com.visualligence.g.vML.RStreamValue
   * @generated
   */
  EClass getRStreamValue();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.InputRef <em>Input Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Ref</em>'.
   * @see com.visualligence.g.vML.InputRef
   * @generated
   */
  EClass getInputRef();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.OutputRef <em>Output Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Ref</em>'.
   * @see com.visualligence.g.vML.OutputRef
   * @generated
   */
  EClass getOutputRef();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Invokation <em>Invokation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invokation</em>'.
   * @see com.visualligence.g.vML.Invokation
   * @generated
   */
  EClass getInvokation();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Invokation#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Module</em>'.
   * @see com.visualligence.g.vML.Invokation#getModule()
   * @see #getInvokation()
   * @generated
   */
  EAttribute getInvokation_Module();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Invokation#getSentences <em>Sentences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentences</em>'.
   * @see com.visualligence.g.vML.Invokation#getSentences()
   * @see #getInvokation()
   * @generated
   */
  EReference getInvokation_Sentences();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.InvokationParam <em>Invokation Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invokation Param</em>'.
   * @see com.visualligence.g.vML.InvokationParam
   * @generated
   */
  EClass getInvokationParam();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.InvokationParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visualligence.g.vML.InvokationParam#getName()
   * @see #getInvokationParam()
   * @generated
   */
  EAttribute getInvokationParam_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.InvokationParam#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.visualligence.g.vML.InvokationParam#getSource()
   * @see #getInvokationParam()
   * @generated
   */
  EReference getInvokationParam_Source();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see com.visualligence.g.vML.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Loop#getIt <em>It</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>It</em>'.
   * @see com.visualligence.g.vML.Loop#getIt()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_It();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Loop#getSentences <em>Sentences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentences</em>'.
   * @see com.visualligence.g.vML.Loop#getSentences()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Sentences();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.LoopSentence <em>Loop Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Sentence</em>'.
   * @see com.visualligence.g.vML.LoopSentence
   * @generated
   */
  EClass getLoopSentence();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.LoopSentence#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visualligence.g.vML.LoopSentence#getName()
   * @see #getLoopSentence()
   * @generated
   */
  EAttribute getLoopSentence_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.LoopSentence#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.visualligence.g.vML.LoopSentence#getType()
   * @see #getLoopSentence()
   * @generated
   */
  EReference getLoopSentence_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.LoopSentence#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>O</em>'.
   * @see com.visualligence.g.vML.LoopSentence#getO()
   * @see #getLoopSentence()
   * @generated
   */
  EReference getLoopSentence_O();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.LoopSentence#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>I</em>'.
   * @see com.visualligence.g.vML.LoopSentence#getI()
   * @see #getLoopSentence()
   * @generated
   */
  EReference getLoopSentence_I();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.LoopFor <em>Loop For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop For</em>'.
   * @see com.visualligence.g.vML.LoopFor
   * @generated
   */
  EClass getLoopFor();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Factory <em>Factory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factory</em>'.
   * @see com.visualligence.g.vML.Factory
   * @generated
   */
  EClass getFactory();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Factory#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.visualligence.g.vML.Factory#getType()
   * @see #getFactory()
   * @generated
   */
  EReference getFactory_Type();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see com.visualligence.g.vML.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.File#isIsinput <em>Isinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isinput</em>'.
   * @see com.visualligence.g.vML.File#isIsinput()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Isinput();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.File#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see com.visualligence.g.vML.File#getPath()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Path();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Canvas <em>Canvas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Canvas</em>'.
   * @see com.visualligence.g.vML.Canvas
   * @generated
   */
  EClass getCanvas();

  /**
   * Returns the meta object for the containment reference list '{@link com.visualligence.g.vML.Canvas#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.visualligence.g.vML.Canvas#getProperties()
   * @see #getCanvas()
   * @generated
   */
  EReference getCanvas_Properties();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see com.visualligence.g.vML.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.visualligence.g.vML.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.Operation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.visualligence.g.vML.Operation#getOp()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.visualligence.g.vML.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the meta object for class '{@link com.visualligence.g.vML.UnaryOperation <em>Unary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Operation</em>'.
   * @see com.visualligence.g.vML.UnaryOperation
   * @generated
   */
  EClass getUnaryOperation();

  /**
   * Returns the meta object for the attribute '{@link com.visualligence.g.vML.UnaryOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.visualligence.g.vML.UnaryOperation#getOp()
   * @see #getUnaryOperation()
   * @generated
   */
  EAttribute getUnaryOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.visualligence.g.vML.UnaryOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.visualligence.g.vML.UnaryOperation#getRight()
   * @see #getUnaryOperation()
   * @generated
   */
  EReference getUnaryOperation_Right();

  /**
   * Returns the meta object for enum '{@link com.visualligence.g.vML.Op <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op</em>'.
   * @see com.visualligence.g.vML.Op
   * @generated
   */
  EEnum getOp();

  /**
   * Returns the meta object for enum '{@link com.visualligence.g.vML.NumberType <em>Number Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Number Type</em>'.
   * @see com.visualligence.g.vML.NumberType
   * @generated
   */
  EEnum getNumberType();

  /**
   * Returns the meta object for enum '{@link com.visualligence.g.vML.VisualType <em>Visual Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visual Type</em>'.
   * @see com.visualligence.g.vML.VisualType
   * @generated
   */
  EEnum getVisualType();

  /**
   * Returns the meta object for enum '{@link com.visualligence.g.vML.AuxType <em>Aux Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Aux Type</em>'.
   * @see com.visualligence.g.vML.AuxType
   * @generated
   */
  EEnum getAuxType();

  /**
   * Returns the meta object for enum '{@link com.visualligence.g.vML.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Collection Type</em>'.
   * @see com.visualligence.g.vML.CollectionType
   * @generated
   */
  EEnum getCollectionType();

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
  interface Literals
  {
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
     * The meta object literal for the '<em><b>Inputtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INPUTTYPE = eINSTANCE.getModule_Inputtype();

    /**
     * The meta object literal for the '<em><b>Outputtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__OUTPUTTYPE = eINSTANCE.getModule_Outputtype();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__AUTHOR = eINSTANCE.getModule_Author();

    /**
     * The meta object literal for the '<em><b>Creation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__CREATION = eINSTANCE.getModule_Creation();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__LINK = eINSTANCE.getModule_Link();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__IMPORTS = eINSTANCE.getModule_Imports();

    /**
     * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__SENTENCES = eINSTANCE.getModule_Sentences();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.ImportImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.SentenceImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSentence()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSentence();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENTENCE__NAME = eINSTANCE.getSentence_Name();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.NodeImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.SwitchImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__TEST = eINSTANCE.getSwitch_Test();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__A = eINSTANCE.getSwitch_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__B = eINSTANCE.getSwitch_B();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.LiteralExpressionImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLiteralExpression()
     * @generated
     */
    EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.RValueImpl <em>RValue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.RValueImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getRValue()
     * @generated
     */
    EClass RVALUE = eINSTANCE.getRValue();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.NodeRefImpl <em>Node Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.NodeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNodeRef()
     * @generated
     */
    EClass NODE_REF = eINSTANCE.getNodeRef();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_REF__NODE = eINSTANCE.getNodeRef_Node();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.MemberRefImpl <em>Member Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.MemberRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getMemberRef()
     * @generated
     */
    EClass MEMBER_REF = eINSTANCE.getMemberRef();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_REF__MEMBER = eINSTANCE.getMemberRef_Member();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.ConstantRefImpl <em>Constant Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.ConstantRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getConstantRef()
     * @generated
     */
    EClass CONSTANT_REF = eINSTANCE.getConstantRef();

    /**
     * The meta object literal for the '<em><b>Constantref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_REF__CONSTANTREF = eINSTANCE.getConstantRef_Constantref();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.SingleLiteralImpl <em>Single Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.SingleLiteralImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSingleLiteral()
     * @generated
     */
    EClass SINGLE_LITERAL = eINSTANCE.getSingleLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_LITERAL__VALUE = eINSTANCE.getSingleLiteral_Value();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.SequenceLiteralImpl <em>Sequence Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.SequenceLiteralImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSequenceLiteral()
     * @generated
     */
    EClass SEQUENCE_LITERAL = eINSTANCE.getSequenceLiteral();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.SequenceLiteralSerieImpl <em>Sequence Literal Serie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.SequenceLiteralSerieImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSequenceLiteralSerie()
     * @generated
     */
    EClass SEQUENCE_LITERAL_SERIE = eINSTANCE.getSequenceLiteralSerie();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_LITERAL_SERIE__INIT = eINSTANCE.getSequenceLiteralSerie_Init();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_LITERAL_SERIE__END = eINSTANCE.getSequenceLiteralSerie_End();

    /**
     * The meta object literal for the '<em><b>Inc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_LITERAL_SERIE__INC = eINSTANCE.getSequenceLiteralSerie_Inc();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.SequenceLiteralPlainImpl <em>Sequence Literal Plain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.SequenceLiteralPlainImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSequenceLiteralPlain()
     * @generated
     */
    EClass SEQUENCE_LITERAL_PLAIN = eINSTANCE.getSequenceLiteralPlain();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_LITERAL_PLAIN__ITEMS = eINSTANCE.getSequenceLiteralPlain_Items();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.TupleLiteralImpl <em>Tuple Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.TupleLiteralImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTupleLiteral()
     * @generated
     */
    EClass TUPLE_LITERAL = eINSTANCE.getTupleLiteral();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_LITERAL__ITEMS = eINSTANCE.getTupleLiteral_Items();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.TupleItemImpl <em>Tuple Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.TupleItemImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTupleItem()
     * @generated
     */
    EClass TUPLE_ITEM = eINSTANCE.getTupleItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TUPLE_ITEM__NAME = eINSTANCE.getTupleItem_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_ITEM__VALUE = eINSTANCE.getTupleItem_Value();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.BlockImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__SENTENCES = eINSTANCE.getBlock_Sentences();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.NoopImpl <em>Noop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.NoopImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNoop()
     * @generated
     */
    EClass NOOP = eINSTANCE.getNoop();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.PairImpl <em>Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.PairImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getPair()
     * @generated
     */
    EClass PAIR = eINSTANCE.getPair();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__NAME = eINSTANCE.getPair_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__VALUE = eINSTANCE.getPair_Value();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.ConstantImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.MultiImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI__OP = eINSTANCE.getMulti_Op();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI__FACTOR = eINSTANCE.getMulti_Factor();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__PARENT = eINSTANCE.getMulti_Parent();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.UnitImpl <em>Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.UnitImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getUnit()
     * @generated
     */
    EClass UNIT = eINSTANCE.getUnit();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.DUnitImpl <em>DUnit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.DUnitImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getDUnit()
     * @generated
     */
    EClass DUNIT = eINSTANCE.getDUnit();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUNIT__OP = eINSTANCE.getDUnit_Op();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUNIT__FACTOR = eINSTANCE.getDUnit_Factor();

    /**
     * The meta object literal for the '<em><b>Multi</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUNIT__MULTI = eINSTANCE.getDUnit_Multi();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUNIT__PARENT = eINSTANCE.getDUnit_Parent();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.NUnitImpl <em>NUnit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.NUnitImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNUnit()
     * @generated
     */
    EClass NUNIT = eINSTANCE.getNUnit();

    /**
     * The meta object literal for the '<em><b>Numbertype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUNIT__NUMBERTYPE = eINSTANCE.getNUnit_Numbertype();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.BoxImpl <em>Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.BoxImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getBox()
     * @generated
     */
    EClass BOX = eINSTANCE.getBox();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOX__MEMBERS = eINSTANCE.getBox_Members();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.ShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.ShapeImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getShape()
     * @generated
     */
    EClass SHAPE = eINSTANCE.getShape();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.MemberImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__TYPE = eINSTANCE.getMember_Type();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.TypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.PlainTypeRefImpl <em>Plain Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.PlainTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getPlainTypeRef()
     * @generated
     */
    EClass PLAIN_TYPE_REF = eINSTANCE.getPlainTypeRef();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.CompositeTypeRefImpl <em>Composite Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.CompositeTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getCompositeTypeRef()
     * @generated
     */
    EClass COMPOSITE_TYPE_REF = eINSTANCE.getCompositeTypeRef();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.SequenceTypeRefImpl <em>Sequence Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.SequenceTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSequenceTypeRef()
     * @generated
     */
    EClass SEQUENCE_TYPE_REF = eINSTANCE.getSequenceTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_TYPE_REF__TYPE = eINSTANCE.getSequenceTypeRef_Type();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.TupleTypeRefImpl <em>Tuple Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.TupleTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTupleTypeRef()
     * @generated
     */
    EClass TUPLE_TYPE_REF = eINSTANCE.getTupleTypeRef();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_TYPE_REF__ITEMS = eINSTANCE.getTupleTypeRef_Items();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.TupleTypeRefItemImpl <em>Tuple Type Ref Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.TupleTypeRefItemImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTupleTypeRefItem()
     * @generated
     */
    EClass TUPLE_TYPE_REF_ITEM = eINSTANCE.getTupleTypeRefItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TUPLE_TYPE_REF_ITEM__NAME = eINSTANCE.getTupleTypeRefItem_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_TYPE_REF_ITEM__TYPE = eINSTANCE.getTupleTypeRefItem_Type();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.SetTypeRefImpl <em>Set Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.SetTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getSetTypeRef()
     * @generated
     */
    EClass SET_TYPE_REF = eINSTANCE.getSetTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_TYPE_REF__TYPE = eINSTANCE.getSetTypeRef_Type();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.VoidTypeRefImpl <em>Void Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.VoidTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getVoidTypeRef()
     * @generated
     */
    EClass VOID_TYPE_REF = eINSTANCE.getVoidTypeRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOID_TYPE_REF__NAME = eINSTANCE.getVoidTypeRef_Name();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.AutoTypeRefImpl <em>Auto Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.AutoTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getAutoTypeRef()
     * @generated
     */
    EClass AUTO_TYPE_REF = eINSTANCE.getAutoTypeRef();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.CollectionRefImpl <em>Collection Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.CollectionRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getCollectionRef()
     * @generated
     */
    EClass COLLECTION_REF = eINSTANCE.getCollectionRef();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION_REF__COLLECTION = eINSTANCE.getCollectionRef_Collection();

    /**
     * The meta object literal for the '<em><b>Typeref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_REF__TYPEREF = eINSTANCE.getCollectionRef_Typeref();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.UnitRefImpl <em>Unit Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.UnitRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getUnitRef()
     * @generated
     */
    EClass UNIT_REF = eINSTANCE.getUnitRef();

    /**
     * The meta object literal for the '<em><b>Unittype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT_REF__UNITTYPE = eINSTANCE.getUnitRef_Unittype();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.BoxRefImpl <em>Box Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.BoxRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getBoxRef()
     * @generated
     */
    EClass BOX_REF = eINSTANCE.getBoxRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOX_REF__REF = eINSTANCE.getBoxRef_Ref();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.TypeAliasRefImpl <em>Type Alias Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.TypeAliasRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTypeAliasRef()
     * @generated
     */
    EClass TYPE_ALIAS_REF = eINSTANCE.getTypeAliasRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ALIAS_REF__REF = eINSTANCE.getTypeAliasRef_Ref();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.AuxTypeRefImpl <em>Aux Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.AuxTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getAuxTypeRef()
     * @generated
     */
    EClass AUX_TYPE_REF = eINSTANCE.getAuxTypeRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUX_TYPE_REF__REF = eINSTANCE.getAuxTypeRef_Ref();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.ShapeRefImpl <em>Shape Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.ShapeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getShapeRef()
     * @generated
     */
    EClass SHAPE_REF = eINSTANCE.getShapeRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_REF__REF = eINSTANCE.getShapeRef_Ref();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.NumberTypeRefImpl <em>Number Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.NumberTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNumberTypeRef()
     * @generated
     */
    EClass NUMBER_TYPE_REF = eINSTANCE.getNumberTypeRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_TYPE_REF__REF = eINSTANCE.getNumberTypeRef_Ref();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.VisualTypeRefImpl <em>Visual Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.VisualTypeRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getVisualTypeRef()
     * @generated
     */
    EClass VISUAL_TYPE_REF = eINSTANCE.getVisualTypeRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUAL_TYPE_REF__REF = eINSTANCE.getVisualTypeRef_Ref();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.TypeAliasImpl <em>Type Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.TypeAliasImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getTypeAlias()
     * @generated
     */
    EClass TYPE_ALIAS = eINSTANCE.getTypeAlias();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ALIAS__TYPE = eINSTANCE.getTypeAlias_Type();

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
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__LEFT = eINSTANCE.getStream_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__RIGHT = eINSTANCE.getStream_Right();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.LStreamValueImpl <em>LStream Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.LStreamValueImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLStreamValue()
     * @generated
     */
    EClass LSTREAM_VALUE = eINSTANCE.getLStreamValue();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.RStreamValueImpl <em>RStream Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.RStreamValueImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getRStreamValue()
     * @generated
     */
    EClass RSTREAM_VALUE = eINSTANCE.getRStreamValue();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.InputRefImpl <em>Input Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.InputRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getInputRef()
     * @generated
     */
    EClass INPUT_REF = eINSTANCE.getInputRef();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.OutputRefImpl <em>Output Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.OutputRefImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getOutputRef()
     * @generated
     */
    EClass OUTPUT_REF = eINSTANCE.getOutputRef();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.InvokationImpl <em>Invokation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.InvokationImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getInvokation()
     * @generated
     */
    EClass INVOKATION = eINSTANCE.getInvokation();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVOKATION__MODULE = eINSTANCE.getInvokation_Module();

    /**
     * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKATION__SENTENCES = eINSTANCE.getInvokation_Sentences();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.InvokationParamImpl <em>Invokation Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.InvokationParamImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getInvokationParam()
     * @generated
     */
    EClass INVOKATION_PARAM = eINSTANCE.getInvokationParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVOKATION_PARAM__NAME = eINSTANCE.getInvokationParam_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKATION_PARAM__SOURCE = eINSTANCE.getInvokationParam_Source();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.LoopImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>It</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__IT = eINSTANCE.getLoop_It();

    /**
     * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__SENTENCES = eINSTANCE.getLoop_Sentences();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.LoopSentenceImpl <em>Loop Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.LoopSentenceImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLoopSentence()
     * @generated
     */
    EClass LOOP_SENTENCE = eINSTANCE.getLoopSentence();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP_SENTENCE__NAME = eINSTANCE.getLoopSentence_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_SENTENCE__TYPE = eINSTANCE.getLoopSentence_Type();

    /**
     * The meta object literal for the '<em><b>O</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_SENTENCE__O = eINSTANCE.getLoopSentence_O();

    /**
     * The meta object literal for the '<em><b>I</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_SENTENCE__I = eINSTANCE.getLoopSentence_I();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.LoopForImpl <em>Loop For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.LoopForImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getLoopFor()
     * @generated
     */
    EClass LOOP_FOR = eINSTANCE.getLoopFor();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.FactoryImpl <em>Factory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.FactoryImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getFactory()
     * @generated
     */
    EClass FACTORY = eINSTANCE.getFactory();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTORY__TYPE = eINSTANCE.getFactory_Type();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.FileImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Isinput</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__ISINPUT = eINSTANCE.getFile_Isinput();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__PATH = eINSTANCE.getFile_Path();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.CanvasImpl <em>Canvas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.CanvasImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getCanvas()
     * @generated
     */
    EClass CANVAS = eINSTANCE.getCanvas();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CANVAS__PROPERTIES = eINSTANCE.getCanvas_Properties();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.OperationImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OP = eINSTANCE.getOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.impl.UnaryOperationImpl
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getUnaryOperation()
     * @generated
     */
    EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_OPERATION__OP = eINSTANCE.getUnaryOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_OPERATION__RIGHT = eINSTANCE.getUnaryOperation_Right();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.Op <em>Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.Op
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getOp()
     * @generated
     */
    EEnum OP = eINSTANCE.getOp();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.NumberType <em>Number Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.NumberType
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getNumberType()
     * @generated
     */
    EEnum NUMBER_TYPE = eINSTANCE.getNumberType();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.VisualType <em>Visual Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.VisualType
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getVisualType()
     * @generated
     */
    EEnum VISUAL_TYPE = eINSTANCE.getVisualType();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.AuxType <em>Aux Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.AuxType
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getAuxType()
     * @generated
     */
    EEnum AUX_TYPE = eINSTANCE.getAuxType();

    /**
     * The meta object literal for the '{@link com.visualligence.g.vML.CollectionType <em>Collection Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visualligence.g.vML.CollectionType
     * @see com.visualligence.g.vML.impl.VMLPackageImpl#getCollectionType()
     * @generated
     */
    EEnum COLLECTION_TYPE = eINSTANCE.getCollectionType();

  }

} //VMLPackage
