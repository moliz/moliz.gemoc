/**
 */
package fumlConfiguration.Loci;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see fumlConfiguration.Loci.LociFactory
 * @model kind="package"
 * @generated
 */
public interface LociPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Loci";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/loci";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LociConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LociPackage eINSTANCE = fumlConfiguration.Loci.impl.LociPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfiguration.Loci.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Loci.impl.ExecutionEnvironmentImpl
	 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getExecutionEnvironment()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Locus Execution Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT = 0;

	/**
	 * The number of structural features of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Loci.impl.LocusImpl <em>Locus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Loci.impl.LocusImpl
	 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getLocus()
	 * @generated
	 */
	int LOCUS = 1;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS__FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS__EXECUTOR = 1;

	/**
	 * The feature id for the '<em><b>Extensional Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS__EXTENSIONAL_VALUES = 2;

	/**
	 * The number of structural features of the '<em>Locus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS___REMOVE__EXTENSIONALVALUE = 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS___ADD__EXTENSIONALVALUE = 1;

	/**
	 * The operation id for the '<em>Instantiate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS___INSTANTIATE__CLASS_OBJECT = 2;

	/**
	 * The number of operations of the '<em>Locus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Loci.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Loci.impl.ExecutorImpl
	 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 2;

	/**
	 * The feature id for the '<em><b>Locus Executor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__LOCUS_EXECUTOR = 0;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR___EXECUTE__BEHAVIOR_OBJECT_ELIST_ELIST = 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR___EVALUATE__VALUESPECIFICATION_VALUE = 1;

	/**
	 * The number of operations of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Loci.impl.ExecutionFactoryImpl <em>Execution Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Loci.impl.ExecutionFactoryImpl
	 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getExecutionFactory()
	 * @generated
	 */
	int EXECUTION_FACTORY = 3;

	/**
	 * The feature id for the '<em><b>Locus Execution Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Primitive Behavior Prototypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES = 1;

	/**
	 * The feature id for the '<em><b>Built In Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY__BUILT_IN_TYPES = 2;

	/**
	 * The number of structural features of the '<em>Execution Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY___CREATE_EXECUTION__BEHAVIOR_OBJECT_EXECUTION = 0;

	/**
	 * The operation id for the '<em>Instantiate Visitor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY___INSTANTIATE_VISITOR__ELEMENT_SEMANTICVISITOR = 1;

	/**
	 * The operation id for the '<em>Create Evaluation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY___CREATE_EVALUATION__EVALUATION_VALUESPECIFICATION = 2;

	/**
	 * The operation id for the '<em>Get Built In Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY___GET_BUILT_IN_TYPE__STRING_PRIMITIVETYPE = 3;

	/**
	 * The operation id for the '<em>Instantiate Opaque Behavior Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY___INSTANTIATE_OPAQUE_BEHAVIOR_EXECUTION__OPAQUEBEHAVIOR_OPAQUEBEHAVIOREXECUTION = 4;

	/**
	 * The number of operations of the '<em>Execution Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FACTORY_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link fumlConfiguration.Loci.impl.SemanticVisitorImpl <em>Semantic Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfiguration.Loci.impl.SemanticVisitorImpl
	 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getSemanticVisitor()
	 * @generated
	 */
	int SEMANTIC_VISITOR = 4;

	/**
	 * The feature id for the '<em><b>Runtime Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Semantic Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR___INITIALIZE = 0;

	/**
	 * The number of operations of the '<em>Semantic Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Loci.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environment</em>'.
	 * @see fumlConfiguration.Loci.ExecutionEnvironment
	 * @generated
	 */
	EClass getExecutionEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link fumlConfiguration.Loci.ExecutionEnvironment#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locus Execution Environment</em>'.
	 * @see fumlConfiguration.Loci.ExecutionEnvironment#getLocus_ExecutionEnvironment()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_Locus_ExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Loci.Locus <em>Locus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locus</em>'.
	 * @see fumlConfiguration.Loci.Locus
	 * @generated
	 */
	EClass getLocus();

	/**
	 * Returns the meta object for the containment reference '{@link fumlConfiguration.Loci.Locus#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factory</em>'.
	 * @see fumlConfiguration.Loci.Locus#getFactory()
	 * @see #getLocus()
	 * @generated
	 */
	EReference getLocus_Factory();

	/**
	 * Returns the meta object for the containment reference '{@link fumlConfiguration.Loci.Locus#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see fumlConfiguration.Loci.Locus#getExecutor()
	 * @see #getLocus()
	 * @generated
	 */
	EReference getLocus_Executor();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfiguration.Loci.Locus#getExtensionalValues <em>Extensional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensional Values</em>'.
	 * @see fumlConfiguration.Loci.Locus#getExtensionalValues()
	 * @see #getLocus()
	 * @generated
	 */
	EReference getLocus_ExtensionalValues();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.Locus#remove(fumlConfiguration.Classes.Kernel.ExtensionalValue) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see fumlConfiguration.Loci.Locus#remove(fumlConfiguration.Classes.Kernel.ExtensionalValue)
	 * @generated
	 */
	EOperation getLocus__Remove__ExtensionalValue();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.Locus#add(fumlConfiguration.Classes.Kernel.ExtensionalValue) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see fumlConfiguration.Loci.Locus#add(fumlConfiguration.Classes.Kernel.ExtensionalValue)
	 * @generated
	 */
	EOperation getLocus__Add__ExtensionalValue();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.Locus#instantiate(org.eclipse.uml2.uml.Class, fumlConfiguration.Classes.Kernel.Object) <em>Instantiate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instantiate</em>' operation.
	 * @see fumlConfiguration.Loci.Locus#instantiate(org.eclipse.uml2.uml.Class, fumlConfiguration.Classes.Kernel.Object)
	 * @generated
	 */
	EOperation getLocus__Instantiate__Class_Object();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Loci.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see fumlConfiguration.Loci.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfiguration.Loci.Executor#getLocus_Executor <em>Locus Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Locus Executor</em>'.
	 * @see fumlConfiguration.Loci.Executor#getLocus_Executor()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_Locus_Executor();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.Executor#execute(org.eclipse.uml2.uml.Behavior, fumlConfiguration.Classes.Kernel.Object, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see fumlConfiguration.Loci.Executor#execute(org.eclipse.uml2.uml.Behavior, fumlConfiguration.Classes.Kernel.Object, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getExecutor__Execute__Behavior_Object_EList_EList();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.Executor#evaluate(org.eclipse.uml2.uml.ValueSpecification, fumlConfiguration.Classes.Kernel.Value) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see fumlConfiguration.Loci.Executor#evaluate(org.eclipse.uml2.uml.ValueSpecification, fumlConfiguration.Classes.Kernel.Value)
	 * @generated
	 */
	EOperation getExecutor__Evaluate__ValueSpecification_Value();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Loci.ExecutionFactory <em>Execution Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Factory</em>'.
	 * @see fumlConfiguration.Loci.ExecutionFactory
	 * @generated
	 */
	EClass getExecutionFactory();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfiguration.Loci.ExecutionFactory#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Locus Execution Factory</em>'.
	 * @see fumlConfiguration.Loci.ExecutionFactory#getLocus_ExecutionFactory()
	 * @see #getExecutionFactory()
	 * @generated
	 */
	EReference getExecutionFactory_Locus_ExecutionFactory();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfiguration.Loci.ExecutionFactory#getPrimitiveBehaviorPrototypes <em>Primitive Behavior Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primitive Behavior Prototypes</em>'.
	 * @see fumlConfiguration.Loci.ExecutionFactory#getPrimitiveBehaviorPrototypes()
	 * @see #getExecutionFactory()
	 * @generated
	 */
	EReference getExecutionFactory_PrimitiveBehaviorPrototypes();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfiguration.Loci.ExecutionFactory#getBuiltInTypes <em>Built In Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Built In Types</em>'.
	 * @see fumlConfiguration.Loci.ExecutionFactory#getBuiltInTypes()
	 * @see #getExecutionFactory()
	 * @generated
	 */
	EReference getExecutionFactory_BuiltInTypes();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.ExecutionFactory#createExecution(org.eclipse.uml2.uml.Behavior, fumlConfiguration.Classes.Kernel.Object, fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) <em>Create Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Execution</em>' operation.
	 * @see fumlConfiguration.Loci.ExecutionFactory#createExecution(org.eclipse.uml2.uml.Behavior, fumlConfiguration.Classes.Kernel.Object, fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution)
	 * @generated
	 */
	EOperation getExecutionFactory__CreateExecution__Behavior_Object_Execution();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.ExecutionFactory#instantiateVisitor(org.eclipse.uml2.uml.Element, fumlConfiguration.Loci.SemanticVisitor) <em>Instantiate Visitor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instantiate Visitor</em>' operation.
	 * @see fumlConfiguration.Loci.ExecutionFactory#instantiateVisitor(org.eclipse.uml2.uml.Element, fumlConfiguration.Loci.SemanticVisitor)
	 * @generated
	 */
	EOperation getExecutionFactory__InstantiateVisitor__Element_SemanticVisitor();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.ExecutionFactory#createEvaluation(fumlConfiguration.Classes.Kernel.Evaluation, org.eclipse.uml2.uml.ValueSpecification) <em>Create Evaluation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Evaluation</em>' operation.
	 * @see fumlConfiguration.Loci.ExecutionFactory#createEvaluation(fumlConfiguration.Classes.Kernel.Evaluation, org.eclipse.uml2.uml.ValueSpecification)
	 * @generated
	 */
	EOperation getExecutionFactory__CreateEvaluation__Evaluation_ValueSpecification();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.ExecutionFactory#getBuiltInType(java.lang.String, org.eclipse.uml2.uml.PrimitiveType) <em>Get Built In Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Built In Type</em>' operation.
	 * @see fumlConfiguration.Loci.ExecutionFactory#getBuiltInType(java.lang.String, org.eclipse.uml2.uml.PrimitiveType)
	 * @generated
	 */
	EOperation getExecutionFactory__GetBuiltInType__String_PrimitiveType();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.ExecutionFactory#instantiateOpaqueBehaviorExecution(org.eclipse.uml2.uml.OpaqueBehavior, fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution) <em>Instantiate Opaque Behavior Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instantiate Opaque Behavior Execution</em>' operation.
	 * @see fumlConfiguration.Loci.ExecutionFactory#instantiateOpaqueBehaviorExecution(org.eclipse.uml2.uml.OpaqueBehavior, fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution)
	 * @generated
	 */
	EOperation getExecutionFactory__InstantiateOpaqueBehaviorExecution__OpaqueBehavior_OpaqueBehaviorExecution();

	/**
	 * Returns the meta object for class '{@link fumlConfiguration.Loci.SemanticVisitor <em>Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Visitor</em>'.
	 * @see fumlConfiguration.Loci.SemanticVisitor
	 * @generated
	 */
	EClass getSemanticVisitor();

	/**
	 * Returns the meta object for the reference '{@link fumlConfiguration.Loci.SemanticVisitor#getRuntimeModelElement <em>Runtime Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Model Element</em>'.
	 * @see fumlConfiguration.Loci.SemanticVisitor#getRuntimeModelElement()
	 * @see #getSemanticVisitor()
	 * @generated
	 */
	EReference getSemanticVisitor_RuntimeModelElement();

	/**
	 * Returns the meta object for the '{@link fumlConfiguration.Loci.SemanticVisitor#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see fumlConfiguration.Loci.SemanticVisitor#initialize()
	 * @generated
	 */
	EOperation getSemanticVisitor__Initialize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LociFactory getLociFactory();

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
		 * The meta object literal for the '{@link fumlConfiguration.Loci.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Loci.impl.ExecutionEnvironmentImpl
		 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getExecutionEnvironment()
		 * @generated
		 */
		EClass EXECUTION_ENVIRONMENT = eINSTANCE.getExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Locus Execution Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT = eINSTANCE.getExecutionEnvironment_Locus_ExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Loci.impl.LocusImpl <em>Locus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Loci.impl.LocusImpl
		 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getLocus()
		 * @generated
		 */
		EClass LOCUS = eINSTANCE.getLocus();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS__FACTORY = eINSTANCE.getLocus_Factory();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS__EXECUTOR = eINSTANCE.getLocus_Executor();

		/**
		 * The meta object literal for the '<em><b>Extensional Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS__EXTENSIONAL_VALUES = eINSTANCE.getLocus_ExtensionalValues();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCUS___REMOVE__EXTENSIONALVALUE = eINSTANCE.getLocus__Remove__ExtensionalValue();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCUS___ADD__EXTENSIONALVALUE = eINSTANCE.getLocus__Add__ExtensionalValue();

		/**
		 * The meta object literal for the '<em><b>Instantiate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCUS___INSTANTIATE__CLASS_OBJECT = eINSTANCE.getLocus__Instantiate__Class_Object();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Loci.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Loci.impl.ExecutorImpl
		 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

		/**
		 * The meta object literal for the '<em><b>Locus Executor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__LOCUS_EXECUTOR = eINSTANCE.getExecutor_Locus_Executor();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTOR___EXECUTE__BEHAVIOR_OBJECT_ELIST_ELIST = eINSTANCE.getExecutor__Execute__Behavior_Object_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTOR___EVALUATE__VALUESPECIFICATION_VALUE = eINSTANCE.getExecutor__Evaluate__ValueSpecification_Value();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Loci.impl.ExecutionFactoryImpl <em>Execution Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Loci.impl.ExecutionFactoryImpl
		 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getExecutionFactory()
		 * @generated
		 */
		EClass EXECUTION_FACTORY = eINSTANCE.getExecutionFactory();

		/**
		 * The meta object literal for the '<em><b>Locus Execution Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY = eINSTANCE.getExecutionFactory_Locus_ExecutionFactory();

		/**
		 * The meta object literal for the '<em><b>Primitive Behavior Prototypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES = eINSTANCE.getExecutionFactory_PrimitiveBehaviorPrototypes();

		/**
		 * The meta object literal for the '<em><b>Built In Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FACTORY__BUILT_IN_TYPES = eINSTANCE.getExecutionFactory_BuiltInTypes();

		/**
		 * The meta object literal for the '<em><b>Create Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_FACTORY___CREATE_EXECUTION__BEHAVIOR_OBJECT_EXECUTION = eINSTANCE.getExecutionFactory__CreateExecution__Behavior_Object_Execution();

		/**
		 * The meta object literal for the '<em><b>Instantiate Visitor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_FACTORY___INSTANTIATE_VISITOR__ELEMENT_SEMANTICVISITOR = eINSTANCE.getExecutionFactory__InstantiateVisitor__Element_SemanticVisitor();

		/**
		 * The meta object literal for the '<em><b>Create Evaluation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_FACTORY___CREATE_EVALUATION__EVALUATION_VALUESPECIFICATION = eINSTANCE.getExecutionFactory__CreateEvaluation__Evaluation_ValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Get Built In Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_FACTORY___GET_BUILT_IN_TYPE__STRING_PRIMITIVETYPE = eINSTANCE.getExecutionFactory__GetBuiltInType__String_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Instantiate Opaque Behavior Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_FACTORY___INSTANTIATE_OPAQUE_BEHAVIOR_EXECUTION__OPAQUEBEHAVIOR_OPAQUEBEHAVIOREXECUTION = eINSTANCE.getExecutionFactory__InstantiateOpaqueBehaviorExecution__OpaqueBehavior_OpaqueBehaviorExecution();

		/**
		 * The meta object literal for the '{@link fumlConfiguration.Loci.impl.SemanticVisitorImpl <em>Semantic Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfiguration.Loci.impl.SemanticVisitorImpl
		 * @see fumlConfiguration.Loci.impl.LociPackageImpl#getSemanticVisitor()
		 * @generated
		 */
		EClass SEMANTIC_VISITOR = eINSTANCE.getSemanticVisitor();

		/**
		 * The meta object literal for the '<em><b>Runtime Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT = eINSTANCE.getSemanticVisitor_RuntimeModelElement();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMANTIC_VISITOR___INITIALIZE = eINSTANCE.getSemanticVisitor__Initialize();

	}

} //LociPackage
