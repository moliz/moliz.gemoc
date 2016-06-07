/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory
 * @model kind="package"
 * @generated
 */
public interface KernelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Kernel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fumlConfigurationTrace_Kernel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelPackage eINSTANCE = fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedValueImpl <em>Traced Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedValueImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedValue()
	 * @generated
	 */
	int TRACED_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_FEATURE_COUNT = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_OPERATION_COUNT = LociPackage.TRACED_SEMANTIC_VISITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedPrimitiveValueImpl <em>Traced Primitive Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedPrimitiveValueImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedPrimitiveValue()
	 * @generated
	 */
	int TRACED_PRIMITIVE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Type Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PRIMITIVE_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedBooleanValueImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedBooleanValue()
	 * @generated
	 */
	int TRACED_BOOLEAN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_PRIMITIVE_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Type Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__TYPE_SEQUENCE = TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Value Boolean Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE = TRACED_PRIMITIVE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_FEATURE_COUNT = TRACED_PRIMITIVE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_OPERATION_COUNT = TRACED_PRIMITIVE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedStructuredValueImpl <em>Traced Structured Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedStructuredValueImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedStructuredValue()
	 * @generated
	 */
	int TRACED_STRUCTURED_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Structured Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Structured Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRUCTURED_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedCompoundValueImpl <em>Traced Compound Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedCompoundValueImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedCompoundValue()
	 * @generated
	 */
	int TRACED_COMPOUND_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPOUND_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_STRUCTURED_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Feature Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE = TRACED_STRUCTURED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Compound Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPOUND_VALUE_FEATURE_COUNT = TRACED_STRUCTURED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Compound Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_COMPOUND_VALUE_OPERATION_COUNT = TRACED_STRUCTURED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedEvaluationImpl <em>Traced Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedEvaluationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedEvaluation()
	 * @generated
	 */
	int TRACED_EVALUATION = 2;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVALUATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Evaluation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Evaluation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVALUATION_FEATURE_COUNT = LociPackage.TRACED_SEMANTIC_VISITOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EVALUATION_OPERATION_COUNT = LociPackage.TRACED_SEMANTIC_VISITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedExtensionalValueImpl <em>Traced Extensional Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedExtensionalValueImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedExtensionalValue()
	 * @generated
	 */
	int TRACED_EXTENSIONAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSIONAL_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_COMPOUND_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Feature Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSIONAL_VALUE__FEATURE_VALUES_SEQUENCE = TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE = TRACED_COMPOUND_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Extensional Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSIONAL_VALUE_FEATURE_COUNT = TRACED_COMPOUND_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Extensional Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXTENSIONAL_VALUE_OPERATION_COUNT = TRACED_COMPOUND_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedFeatureValueImpl <em>Traced Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedFeatureValueImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedFeatureValue()
	 * @generated
	 */
	int TRACED_FEATURE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Feature Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_VALUE__FEATURE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Position Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_VALUE__POSITION_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Values Feature Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE = 2;

	/**
	 * The number of structural features of the '<em>Traced Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traced Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FEATURE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedIntegerValueImpl <em>Traced Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedIntegerValueImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedIntegerValue()
	 * @generated
	 */
	int TRACED_INTEGER_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_PRIMITIVE_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Type Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE__TYPE_SEQUENCE = TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Value Integer Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE = TRACED_PRIMITIVE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE_FEATURE_COUNT = TRACED_PRIMITIVE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE_OPERATION_COUNT = TRACED_PRIMITIVE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralEvaluationImpl <em>Traced Literal Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralEvaluationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedLiteralEvaluation()
	 * @generated
	 */
	int TRACED_LITERAL_EVALUATION = 7;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_EVALUATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_EVALUATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Evaluation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_EVALUATION__LOCUS_EVALUATION_SEQUENCE = TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Specification Evaluation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE = TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_EVALUATION_FEATURE_COUNT = TRACED_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_EVALUATION_OPERATION_COUNT = TRACED_EVALUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralBooleanEvaluationImpl <em>Traced Literal Boolean Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralBooleanEvaluationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedLiteralBooleanEvaluation()
	 * @generated
	 */
	int TRACED_LITERAL_BOOLEAN_EVALUATION = 6;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_EVALUATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_LITERAL_EVALUATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Evaluation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_EVALUATION__LOCUS_EVALUATION_SEQUENCE = TRACED_LITERAL_EVALUATION__LOCUS_EVALUATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Specification Evaluation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE = TRACED_LITERAL_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Boolean Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_EVALUATION_FEATURE_COUNT = TRACED_LITERAL_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Boolean Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_BOOLEAN_EVALUATION_OPERATION_COUNT = TRACED_LITERAL_EVALUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralIntegerEvaluationImpl <em>Traced Literal Integer Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralIntegerEvaluationImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedLiteralIntegerEvaluation()
	 * @generated
	 */
	int TRACED_LITERAL_INTEGER_EVALUATION = 8;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_EVALUATION__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_LITERAL_EVALUATION__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Evaluation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_EVALUATION__LOCUS_EVALUATION_SEQUENCE = TRACED_LITERAL_EVALUATION__LOCUS_EVALUATION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Specification Evaluation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE = TRACED_LITERAL_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Literal Integer Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_EVALUATION_FEATURE_COUNT = TRACED_LITERAL_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Literal Integer Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LITERAL_INTEGER_EVALUATION_OPERATION_COUNT = TRACED_LITERAL_EVALUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedObjectImpl <em>Traced Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedObjectImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedObject()
	 * @generated
	 */
	int TRACED_OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_EXTENSIONAL_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Feature Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT__FEATURE_VALUES_SEQUENCE = TRACED_EXTENSIONAL_VALUE__FEATURE_VALUES_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT__LOCUS_EXTENSIONAL_VALUE_SEQUENCE = TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Types Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT__TYPES_SEQUENCE = TRACED_EXTENSIONAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_FEATURE_COUNT = TRACED_EXTENSIONAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_OPERATION_COUNT = TRACED_EXTENSIONAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedReferenceImpl <em>Traced Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedReferenceImpl
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedReference()
	 * @generated
	 */
	int TRACED_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REFERENCE__RUNTIME_MODEL_ELEMENT_SEQUENCE = TRACED_STRUCTURED_VALUE__RUNTIME_MODEL_ELEMENT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Referent Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REFERENCE__REFERENT_SEQUENCE = TRACED_STRUCTURED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REFERENCE_FEATURE_COUNT = TRACED_STRUCTURED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REFERENCE_OPERATION_COUNT = TRACED_STRUCTURED_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue <em>Traced Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Value</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue
	 * @generated
	 */
	EClass getTracedBooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue#getValue_BooleanValueSequence <em>Value Boolean Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Boolean Value Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue#getValue_BooleanValueSequence()
	 * @see #getTracedBooleanValue()
	 * @generated
	 */
	EReference getTracedBooleanValue_Value_BooleanValueSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue <em>Traced Compound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Compound Value</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue
	 * @generated
	 */
	EClass getTracedCompoundValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue#getFeatureValuesSequence <em>Feature Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Values Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue#getFeatureValuesSequence()
	 * @see #getTracedCompoundValue()
	 * @generated
	 */
	EReference getTracedCompoundValue_FeatureValuesSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation <em>Traced Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Evaluation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation
	 * @generated
	 */
	EClass getTracedEvaluation();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getLocus_EvaluationSequence <em>Locus Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locus Evaluation Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getLocus_EvaluationSequence()
	 * @see #getTracedEvaluation()
	 * @generated
	 */
	EReference getTracedEvaluation_Locus_EvaluationSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getSpecification_EvaluationSequence <em>Specification Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Evaluation Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation#getSpecification_EvaluationSequence()
	 * @see #getTracedEvaluation()
	 * @generated
	 */
	EReference getTracedEvaluation_Specification_EvaluationSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue <em>Traced Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Extensional Value</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue
	 * @generated
	 */
	EClass getTracedExtensionalValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue#getLocus_ExtensionalValueSequence <em>Locus Extensional Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locus Extensional Value Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue#getLocus_ExtensionalValueSequence()
	 * @see #getTracedExtensionalValue()
	 * @generated
	 */
	EReference getTracedExtensionalValue_Locus_ExtensionalValueSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue <em>Traced Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Feature Value</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue
	 * @generated
	 */
	EClass getTracedFeatureValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getFeatureSequence <em>Feature Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getFeatureSequence()
	 * @see #getTracedFeatureValue()
	 * @generated
	 */
	EReference getTracedFeatureValue_FeatureSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getPositionSequence <em>Position Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getPositionSequence()
	 * @see #getTracedFeatureValue()
	 * @generated
	 */
	EReference getTracedFeatureValue_PositionSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getValues_FeatureValueSequence <em>Values Feature Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values Feature Value Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue#getValues_FeatureValueSequence()
	 * @see #getTracedFeatureValue()
	 * @generated
	 */
	EReference getTracedFeatureValue_Values_FeatureValueSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue <em>Traced Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Value</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue
	 * @generated
	 */
	EClass getTracedIntegerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue#getValue_IntegerValueSequence <em>Value Integer Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Integer Value Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue#getValue_IntegerValueSequence()
	 * @see #getTracedIntegerValue()
	 * @generated
	 */
	EReference getTracedIntegerValue_Value_IntegerValueSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation <em>Traced Literal Boolean Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Boolean Evaluation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation
	 * @generated
	 */
	EClass getTracedLiteralBooleanEvaluation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralEvaluation <em>Traced Literal Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Evaluation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralEvaluation
	 * @generated
	 */
	EClass getTracedLiteralEvaluation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation <em>Traced Literal Integer Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Literal Integer Evaluation</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation
	 * @generated
	 */
	EClass getTracedLiteralIntegerEvaluation();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject <em>Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Object</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject
	 * @generated
	 */
	EClass getTracedObject();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject#getTypesSequence <em>Types Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject#getTypesSequence()
	 * @see #getTracedObject()
	 * @generated
	 */
	EReference getTracedObject_TypesSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue <em>Traced Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Primitive Value</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue
	 * @generated
	 */
	EClass getTracedPrimitiveValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue#getTypeSequence <em>Type Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedPrimitiveValue#getTypeSequence()
	 * @see #getTracedPrimitiveValue()
	 * @generated
	 */
	EReference getTracedPrimitiveValue_TypeSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference <em>Traced Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Reference</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference
	 * @generated
	 */
	EClass getTracedReference();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference#getReferentSequence <em>Referent Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referent Sequence</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference#getReferentSequence()
	 * @see #getTracedReference()
	 * @generated
	 */
	EReference getTracedReference_ReferentSequence();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue <em>Traced Structured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Structured Value</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue
	 * @generated
	 */
	EClass getTracedStructuredValue();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue <em>Traced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Value</em>'.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedValue
	 * @generated
	 */
	EClass getTracedValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KernelFactory getKernelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedBooleanValueImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedBooleanValue()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VALUE = eINSTANCE.getTracedBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value Boolean Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE_SEQUENCE = eINSTANCE.getTracedBooleanValue_Value_BooleanValueSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedCompoundValueImpl <em>Traced Compound Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedCompoundValueImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedCompoundValue()
		 * @generated
		 */
		EClass TRACED_COMPOUND_VALUE = eINSTANCE.getTracedCompoundValue();

		/**
		 * The meta object literal for the '<em><b>Feature Values Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_COMPOUND_VALUE__FEATURE_VALUES_SEQUENCE = eINSTANCE.getTracedCompoundValue_FeatureValuesSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedEvaluationImpl <em>Traced Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedEvaluationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedEvaluation()
		 * @generated
		 */
		EClass TRACED_EVALUATION = eINSTANCE.getTracedEvaluation();

		/**
		 * The meta object literal for the '<em><b>Locus Evaluation Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE = eINSTANCE.getTracedEvaluation_Locus_EvaluationSequence();

		/**
		 * The meta object literal for the '<em><b>Specification Evaluation Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE = eINSTANCE.getTracedEvaluation_Specification_EvaluationSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedExtensionalValueImpl <em>Traced Extensional Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedExtensionalValueImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedExtensionalValue()
		 * @generated
		 */
		EClass TRACED_EXTENSIONAL_VALUE = eINSTANCE.getTracedExtensionalValue();

		/**
		 * The meta object literal for the '<em><b>Locus Extensional Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE_SEQUENCE = eINSTANCE.getTracedExtensionalValue_Locus_ExtensionalValueSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedFeatureValueImpl <em>Traced Feature Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedFeatureValueImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedFeatureValue()
		 * @generated
		 */
		EClass TRACED_FEATURE_VALUE = eINSTANCE.getTracedFeatureValue();

		/**
		 * The meta object literal for the '<em><b>Feature Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FEATURE_VALUE__FEATURE_SEQUENCE = eINSTANCE.getTracedFeatureValue_FeatureSequence();

		/**
		 * The meta object literal for the '<em><b>Position Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FEATURE_VALUE__POSITION_SEQUENCE = eINSTANCE.getTracedFeatureValue_PositionSequence();

		/**
		 * The meta object literal for the '<em><b>Values Feature Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FEATURE_VALUE__VALUES_FEATURE_VALUE_SEQUENCE = eINSTANCE.getTracedFeatureValue_Values_FeatureValueSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedIntegerValueImpl <em>Traced Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedIntegerValueImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedIntegerValue()
		 * @generated
		 */
		EClass TRACED_INTEGER_VALUE = eINSTANCE.getTracedIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value Integer Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VALUE__VALUE_INTEGER_VALUE_SEQUENCE = eINSTANCE.getTracedIntegerValue_Value_IntegerValueSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralBooleanEvaluationImpl <em>Traced Literal Boolean Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralBooleanEvaluationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedLiteralBooleanEvaluation()
		 * @generated
		 */
		EClass TRACED_LITERAL_BOOLEAN_EVALUATION = eINSTANCE.getTracedLiteralBooleanEvaluation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralEvaluationImpl <em>Traced Literal Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralEvaluationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedLiteralEvaluation()
		 * @generated
		 */
		EClass TRACED_LITERAL_EVALUATION = eINSTANCE.getTracedLiteralEvaluation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralIntegerEvaluationImpl <em>Traced Literal Integer Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedLiteralIntegerEvaluationImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedLiteralIntegerEvaluation()
		 * @generated
		 */
		EClass TRACED_LITERAL_INTEGER_EVALUATION = eINSTANCE.getTracedLiteralIntegerEvaluation();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedObjectImpl <em>Traced Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedObjectImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedObject()
		 * @generated
		 */
		EClass TRACED_OBJECT = eINSTANCE.getTracedObject();

		/**
		 * The meta object literal for the '<em><b>Types Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECT__TYPES_SEQUENCE = eINSTANCE.getTracedObject_TypesSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedPrimitiveValueImpl <em>Traced Primitive Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedPrimitiveValueImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedPrimitiveValue()
		 * @generated
		 */
		EClass TRACED_PRIMITIVE_VALUE = eINSTANCE.getTracedPrimitiveValue();

		/**
		 * The meta object literal for the '<em><b>Type Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PRIMITIVE_VALUE__TYPE_SEQUENCE = eINSTANCE.getTracedPrimitiveValue_TypeSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedReferenceImpl <em>Traced Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedReferenceImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedReference()
		 * @generated
		 */
		EClass TRACED_REFERENCE = eINSTANCE.getTracedReference();

		/**
		 * The meta object literal for the '<em><b>Referent Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_REFERENCE__REFERENT_SEQUENCE = eINSTANCE.getTracedReference_ReferentSequence();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedStructuredValueImpl <em>Traced Structured Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedStructuredValueImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedStructuredValue()
		 * @generated
		 */
		EClass TRACED_STRUCTURED_VALUE = eINSTANCE.getTracedStructuredValue();

		/**
		 * The meta object literal for the '{@link fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedValueImpl <em>Traced Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedValueImpl
		 * @see fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getTracedValue()
		 * @generated
		 */
		EClass TRACED_VALUE = eINSTANCE.getTracedValue();

	}

} //KernelPackage
