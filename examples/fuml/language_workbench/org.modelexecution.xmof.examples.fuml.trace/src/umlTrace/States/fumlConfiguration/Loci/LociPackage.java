/**
 */
package umlTrace.States.fumlConfiguration.Loci;

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
 * @see umlTrace.States.fumlConfiguration.Loci.LociFactory
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
	String eNS_URI = "umlTrace_Loci";

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
	LociPackage eINSTANCE = umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionEnvironmentImpl <em>Traced Execution Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionEnvironmentImpl
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedExecutionEnvironment()
	 * @generated
	 */
	int TRACED_EXECUTION_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Locus Execution Environment Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Traced Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_ENVIRONMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionFactoryImpl <em>Traced Execution Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionFactoryImpl
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedExecutionFactory()
	 * @generated
	 */
	int TRACED_EXECUTION_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Built In Types Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Locus Execution Factory Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Primitive Behavior Prototypes Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE = 2;

	/**
	 * The number of structural features of the '<em>Traced Execution Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traced Execution Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTION_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutorImpl <em>Traced Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutorImpl
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedExecutor()
	 * @generated
	 */
	int TRACED_EXECUTOR = 2;

	/**
	 * The feature id for the '<em><b>Locus Executor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Traced Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedLocusImpl <em>Traced Locus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedLocusImpl
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedLocus()
	 * @generated
	 */
	int TRACED_LOCUS = 3;

	/**
	 * The feature id for the '<em><b>Executor Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOCUS__EXECUTOR_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Extensional Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Factory Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOCUS__FACTORY_SEQUENCE = 2;

	/**
	 * The number of structural features of the '<em>Traced Locus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOCUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traced Locus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LOCUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl <em>Traced Semantic Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl
	 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedSemanticVisitor()
	 * @generated
	 */
	int TRACED_SEMANTIC_VISITOR = 4;

	/**
	 * The feature id for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Traced Semantic Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEMANTIC_VISITOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Semantic Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEMANTIC_VISITOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment <em>Traced Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Execution Environment</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment
	 * @generated
	 */
	EClass getTracedExecutionEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment#getLocus_ExecutionEnvironmentSequence <em>Locus Execution Environment Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locus Execution Environment Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment#getLocus_ExecutionEnvironmentSequence()
	 * @see #getTracedExecutionEnvironment()
	 * @generated
	 */
	EReference getTracedExecutionEnvironment_Locus_ExecutionEnvironmentSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory <em>Traced Execution Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Execution Factory</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory
	 * @generated
	 */
	EClass getTracedExecutionFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getBuiltInTypesSequence <em>Built In Types Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Built In Types Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getBuiltInTypesSequence()
	 * @see #getTracedExecutionFactory()
	 * @generated
	 */
	EReference getTracedExecutionFactory_BuiltInTypesSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getLocus_ExecutionFactorySequence <em>Locus Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locus Execution Factory Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getLocus_ExecutionFactorySequence()
	 * @see #getTracedExecutionFactory()
	 * @generated
	 */
	EReference getTracedExecutionFactory_Locus_ExecutionFactorySequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getPrimitiveBehaviorPrototypesSequence <em>Primitive Behavior Prototypes Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Behavior Prototypes Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory#getPrimitiveBehaviorPrototypesSequence()
	 * @see #getTracedExecutionFactory()
	 * @generated
	 */
	EReference getTracedExecutionFactory_PrimitiveBehaviorPrototypesSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutor <em>Traced Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Executor</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutor
	 * @generated
	 */
	EClass getTracedExecutor();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutor#getLocus_ExecutorSequence <em>Locus Executor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locus Executor Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedExecutor#getLocus_ExecutorSequence()
	 * @see #getTracedExecutor()
	 * @generated
	 */
	EReference getTracedExecutor_Locus_ExecutorSequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus <em>Traced Locus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Locus</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedLocus
	 * @generated
	 */
	EClass getTracedLocus();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getExecutorSequence <em>Executor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executor Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedLocus#getExecutorSequence()
	 * @see #getTracedLocus()
	 * @generated
	 */
	EReference getTracedLocus_ExecutorSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getExtensionalValuesSequence <em>Extensional Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensional Values Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedLocus#getExtensionalValuesSequence()
	 * @see #getTracedLocus()
	 * @generated
	 */
	EReference getTracedLocus_ExtensionalValuesSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedLocus#getFactorySequence <em>Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factory Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedLocus#getFactorySequence()
	 * @see #getTracedLocus()
	 * @generated
	 */
	EReference getTracedLocus_FactorySequence();

	/**
	 * Returns the meta object for class '{@link umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor <em>Traced Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Semantic Visitor</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor
	 * @generated
	 */
	EClass getTracedSemanticVisitor();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor#getRuntimeModelElementSequence <em>Runtime Model Element Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Model Element Sequence</em>'.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor#getRuntimeModelElementSequence()
	 * @see #getTracedSemanticVisitor()
	 * @generated
	 */
	EReference getTracedSemanticVisitor_RuntimeModelElementSequence();

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
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionEnvironmentImpl <em>Traced Execution Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionEnvironmentImpl
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedExecutionEnvironment()
		 * @generated
		 */
		EClass TRACED_EXECUTION_ENVIRONMENT = eINSTANCE.getTracedExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Locus Execution Environment Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE = eINSTANCE.getTracedExecutionEnvironment_Locus_ExecutionEnvironmentSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionFactoryImpl <em>Traced Execution Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionFactoryImpl
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedExecutionFactory()
		 * @generated
		 */
		EClass TRACED_EXECUTION_FACTORY = eINSTANCE.getTracedExecutionFactory();

		/**
		 * The meta object literal for the '<em><b>Built In Types Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE = eINSTANCE.getTracedExecutionFactory_BuiltInTypesSequence();

		/**
		 * The meta object literal for the '<em><b>Locus Execution Factory Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE = eINSTANCE.getTracedExecutionFactory_Locus_ExecutionFactorySequence();

		/**
		 * The meta object literal for the '<em><b>Primitive Behavior Prototypes Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE = eINSTANCE.getTracedExecutionFactory_PrimitiveBehaviorPrototypesSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutorImpl <em>Traced Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutorImpl
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedExecutor()
		 * @generated
		 */
		EClass TRACED_EXECUTOR = eINSTANCE.getTracedExecutor();

		/**
		 * The meta object literal for the '<em><b>Locus Executor Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_EXECUTOR__LOCUS_EXECUTOR_SEQUENCE = eINSTANCE.getTracedExecutor_Locus_ExecutorSequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedLocusImpl <em>Traced Locus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedLocusImpl
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedLocus()
		 * @generated
		 */
		EClass TRACED_LOCUS = eINSTANCE.getTracedLocus();

		/**
		 * The meta object literal for the '<em><b>Executor Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_LOCUS__EXECUTOR_SEQUENCE = eINSTANCE.getTracedLocus_ExecutorSequence();

		/**
		 * The meta object literal for the '<em><b>Extensional Values Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_LOCUS__EXTENSIONAL_VALUES_SEQUENCE = eINSTANCE.getTracedLocus_ExtensionalValuesSequence();

		/**
		 * The meta object literal for the '<em><b>Factory Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_LOCUS__FACTORY_SEQUENCE = eINSTANCE.getTracedLocus_FactorySequence();

		/**
		 * The meta object literal for the '{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl <em>Traced Semantic Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl
		 * @see umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl#getTracedSemanticVisitor()
		 * @generated
		 */
		EClass TRACED_SEMANTIC_VISITOR = eINSTANCE.getTracedSemanticVisitor();

		/**
		 * The meta object literal for the '<em><b>Runtime Model Element Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE = eINSTANCE.getTracedSemanticVisitor_RuntimeModelElementSequence();

	}

} //LociPackage
