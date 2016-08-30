/**
 */
package fumlConfiguration.Classes.Kernel;

import fumlConfiguration.Loci.LociPackage;

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
 * @see fumlConfiguration.Classes.Kernel.KernelFactory
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
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/classes/kernel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "KernelConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelPackage eINSTANCE = fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.ValueImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 4;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__RUNTIME_MODEL_ELEMENT = LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.StructuredValueImpl <em>Structured Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.StructuredValueImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getStructuredValue()
	 * @generated
	 */
	int STRUCTURED_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_VALUE__RUNTIME_MODEL_ELEMENT = VALUE__RUNTIME_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Structured Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.CompoundValueImpl <em>Compound Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.CompoundValueImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getCompoundValue()
	 * @generated
	 */
	int COMPOUND_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE__RUNTIME_MODEL_ELEMENT = STRUCTURED_VALUE__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE__FEATURE_VALUES = STRUCTURED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_COUNT = STRUCTURED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.ExtensionalValueImpl <em>Extensional Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.ExtensionalValueImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getExtensionalValue()
	 * @generated
	 */
	int EXTENSIONAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE__RUNTIME_MODEL_ELEMENT = COMPOUND_VALUE__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE__FEATURE_VALUES = COMPOUND_VALUE__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE = COMPOUND_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extensional Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_FEATURE_COUNT = COMPOUND_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.ObjectImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__RUNTIME_MODEL_ELEMENT = EXTENSIONAL_VALUE__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__FEATURE_VALUES = EXTENSIONAL_VALUE__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Locus Extensional Value</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__LOCUS_EXTENSIONAL_VALUE = EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TYPES = EXTENSIONAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = EXTENSIONAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.EvaluationImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 5;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__RUNTIME_MODEL_ELEMENT = LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__SPECIFICATION_EVALUATION = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locus Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__LOCUS_EVALUATION = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = LociPackage.SEMANTIC_VISITOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.LiteralEvaluationImpl <em>Literal Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.LiteralEvaluationImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getLiteralEvaluation()
	 * @generated
	 */
	int LITERAL_EVALUATION = 7;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EVALUATION__RUNTIME_MODEL_ELEMENT = EVALUATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EVALUATION__SPECIFICATION_EVALUATION = EVALUATION__SPECIFICATION_EVALUATION;

	/**
	 * The feature id for the '<em><b>Locus Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EVALUATION__LOCUS_EVALUATION = EVALUATION__LOCUS_EVALUATION;

	/**
	 * The number of structural features of the '<em>Literal Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EVALUATION_FEATURE_COUNT = EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.LiteralIntegerEvaluationImpl <em>Literal Integer Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.LiteralIntegerEvaluationImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getLiteralIntegerEvaluation()
	 * @generated
	 */
	int LITERAL_INTEGER_EVALUATION = 6;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_EVALUATION__RUNTIME_MODEL_ELEMENT = LITERAL_EVALUATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_EVALUATION__SPECIFICATION_EVALUATION = LITERAL_EVALUATION__SPECIFICATION_EVALUATION;

	/**
	 * The feature id for the '<em><b>Locus Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_EVALUATION__LOCUS_EVALUATION = LITERAL_EVALUATION__LOCUS_EVALUATION;

	/**
	 * The number of structural features of the '<em>Literal Integer Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_EVALUATION_FEATURE_COUNT = LITERAL_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.PrimitiveValueImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getPrimitiveValue()
	 * @generated
	 */
	int PRIMITIVE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__RUNTIME_MODEL_ELEMENT = VALUE__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__TYPE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.IntegerValueImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__RUNTIME_MODEL_ELEMENT = PRIMITIVE_VALUE__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__TYPE = PRIMITIVE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE_INTEGER_VALUE = PRIMITIVE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = PRIMITIVE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.FeatureValueImpl <em>Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.FeatureValueImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getFeatureValue()
	 * @generated
	 */
	int FEATURE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Values Feature Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__VALUES_FEATURE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__POSITION = 2;

	/**
	 * The number of structural features of the '<em>Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.BooleanValueImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__RUNTIME_MODEL_ELEMENT = PRIMITIVE_VALUE__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__TYPE = PRIMITIVE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE = PRIMITIVE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = PRIMITIVE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.LiteralBooleanEvaluationImpl <em>Literal Boolean Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.LiteralBooleanEvaluationImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getLiteralBooleanEvaluation()
	 * @generated
	 */
	int LITERAL_BOOLEAN_EVALUATION = 12;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_EVALUATION__RUNTIME_MODEL_ELEMENT = LITERAL_EVALUATION__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_EVALUATION__SPECIFICATION_EVALUATION = LITERAL_EVALUATION__SPECIFICATION_EVALUATION;

	/**
	 * The feature id for the '<em><b>Locus Evaluation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_EVALUATION__LOCUS_EVALUATION = LITERAL_EVALUATION__LOCUS_EVALUATION;

	/**
	 * The number of structural features of the '<em>Literal Boolean Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_EVALUATION_FEATURE_COUNT = LITERAL_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Classes.Kernel.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Classes.Kernel.impl.ReferenceImpl
	 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__RUNTIME_MODEL_ELEMENT = STRUCTURED_VALUE__RUNTIME_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENT = STRUCTURED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = STRUCTURED_VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.ExtensionalValue <em>Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensional Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.ExtensionalValue
	 * @generated
	 */
	EClass getExtensionalValue();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfiguration.Classes.Kernel.ExtensionalValue#getLocus_ExtensionalValue <em>Locus Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Locus Extensional Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.ExtensionalValue#getLocus_ExtensionalValue()
	 * @see #getExtensionalValue()
	 * @generated
	 */
	EReference getExtensionalValue_Locus_ExtensionalValue();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see fumlConfiguration.Classes.Kernel.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfiguration.Classes.Kernel.Object#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see fumlConfiguration.Classes.Kernel.Object#getTypes()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Types();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.StructuredValue <em>Structured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.StructuredValue
	 * @generated
	 */
	EClass getStructuredValue();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.CompoundValue <em>Compound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.CompoundValue
	 * @generated
	 */
	EClass getCompoundValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.Classes.Kernel.CompoundValue#getFeatureValues <em>Feature Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Values</em>'.
	 * @see fumlConfiguration.Classes.Kernel.CompoundValue#getFeatureValues()
	 * @see #getCompoundValue()
	 * @generated
	 */
	EReference getCompoundValue_FeatureValues();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see fumlConfiguration.Classes.Kernel.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Classes.Kernel.Evaluation#getSpecification_Evaluation <em>Specification Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification Evaluation</em>'.
	 * @see fumlConfiguration.Classes.Kernel.Evaluation#getSpecification_Evaluation()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Specification_Evaluation();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Classes.Kernel.Evaluation#getLocus_Evaluation <em>Locus Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locus Evaluation</em>'.
	 * @see fumlConfiguration.Classes.Kernel.Evaluation#getLocus_Evaluation()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Locus_Evaluation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation <em>Literal Integer Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer Evaluation</em>'.
	 * @see fumlConfiguration.Classes.Kernel.LiteralIntegerEvaluation
	 * @generated
	 */
	EClass getLiteralIntegerEvaluation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.LiteralEvaluation <em>Literal Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Evaluation</em>'.
	 * @see fumlConfiguration.Classes.Kernel.LiteralEvaluation
	 * @generated
	 */
	EClass getLiteralEvaluation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.PrimitiveValue <em>Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.PrimitiveValue
	 * @generated
	 */
	EClass getPrimitiveValue();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Classes.Kernel.PrimitiveValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fumlConfiguration.Classes.Kernel.PrimitiveValue#getType()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EReference getPrimitiveValue_Type();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Classes.Kernel.IntegerValue#getValue_IntegerValue <em>Value Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Integer Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.IntegerValue#getValue_IntegerValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value_IntegerValue();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.FeatureValue
	 * @generated
	 */
	EClass getFeatureValue();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Classes.Kernel.FeatureValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see fumlConfiguration.Classes.Kernel.FeatureValue#getFeature()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.Classes.Kernel.FeatureValue#getValues_FeatureValue <em>Values Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values Feature Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.FeatureValue#getValues_FeatureValue()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Values_FeatureValue();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Classes.Kernel.FeatureValue#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see fumlConfiguration.Classes.Kernel.FeatureValue#getPosition()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EAttribute getFeatureValue_Position();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link fumlConfiguration.Classes.Kernel.BooleanValue#isValue_BooleanValue <em>Value Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Boolean Value</em>'.
	 * @see fumlConfiguration.Classes.Kernel.BooleanValue#isValue_BooleanValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value_BooleanValue();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation <em>Literal Boolean Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean Evaluation</em>'.
	 * @see fumlConfiguration.Classes.Kernel.LiteralBooleanEvaluation
	 * @generated
	 */
	EClass getLiteralBooleanEvaluation();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Classes.Kernel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see fumlConfiguration.Classes.Kernel.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Classes.Kernel.Reference#getReferent <em>Referent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referent</em>'.
	 * @see fumlConfiguration.Classes.Kernel.Reference#getReferent()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Referent();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.ExtensionalValueImpl <em>Extensional Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.ExtensionalValueImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getExtensionalValue()
		 * @generated
		 */
		EClass EXTENSIONAL_VALUE = eINSTANCE.getExtensionalValue();

		/**
		 * The meta object literal for the '<em><b>Locus Extensional Value</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONAL_VALUE__LOCUS_EXTENSIONAL_VALUE = eINSTANCE.getExtensionalValue_Locus_ExtensionalValue();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.ObjectImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__TYPES = eINSTANCE.getObject_Types();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.StructuredValueImpl <em>Structured Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.StructuredValueImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getStructuredValue()
		 * @generated
		 */
		EClass STRUCTURED_VALUE = eINSTANCE.getStructuredValue();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.CompoundValueImpl <em>Compound Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.CompoundValueImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getCompoundValue()
		 * @generated
		 */
		EClass COMPOUND_VALUE = eINSTANCE.getCompoundValue();

		/**
		 * The meta object literal for the '<em><b>Feature Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_VALUE__FEATURE_VALUES = eINSTANCE.getCompoundValue_FeatureValues();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.ValueImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.EvaluationImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Specification Evaluation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__SPECIFICATION_EVALUATION = eINSTANCE.getEvaluation_Specification_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Locus Evaluation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__LOCUS_EVALUATION = eINSTANCE.getEvaluation_Locus_Evaluation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.LiteralIntegerEvaluationImpl <em>Literal Integer Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.LiteralIntegerEvaluationImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getLiteralIntegerEvaluation()
		 * @generated
		 */
		EClass LITERAL_INTEGER_EVALUATION = eINSTANCE.getLiteralIntegerEvaluation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.LiteralEvaluationImpl <em>Literal Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.LiteralEvaluationImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getLiteralEvaluation()
		 * @generated
		 */
		EClass LITERAL_EVALUATION = eINSTANCE.getLiteralEvaluation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.PrimitiveValueImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getPrimitiveValue()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE = eINSTANCE.getPrimitiveValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VALUE__TYPE = eINSTANCE.getPrimitiveValue_Type();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.IntegerValueImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE_INTEGER_VALUE = eINSTANCE.getIntegerValue_Value_IntegerValue();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.FeatureValueImpl <em>Feature Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.FeatureValueImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getFeatureValue()
		 * @generated
		 */
		EClass FEATURE_VALUE = eINSTANCE.getFeatureValue();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE__FEATURE = eINSTANCE.getFeatureValue_Feature();

		/**
		 * The meta object literal for the '<em><b>Values Feature Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE__VALUES_FEATURE_VALUE = eINSTANCE.getFeatureValue_Values_FeatureValue();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_VALUE__POSITION = eINSTANCE.getFeatureValue_Position();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.BooleanValueImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE_BOOLEAN_VALUE = eINSTANCE.getBooleanValue_Value_BooleanValue();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.LiteralBooleanEvaluationImpl <em>Literal Boolean Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.LiteralBooleanEvaluationImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getLiteralBooleanEvaluation()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN_EVALUATION = eINSTANCE.getLiteralBooleanEvaluation();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Classes.Kernel.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Classes.Kernel.impl.ReferenceImpl
		 * @see fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Referent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENT = eINSTANCE.getReference_Referent();

	}

} //KernelPackage
