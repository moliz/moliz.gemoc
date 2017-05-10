/**
 */
package fumlConfigurationFewSteps.LociFewSteps;

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
 * @see fumlConfigurationFewSteps.LociFewSteps.LociFewStepsFactory
 * @model kind="package"
 * @generated
 */
public interface LociFewStepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LociFewSteps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/xmof/example/fuml/configuration/lociFewSteps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LociConfFewSteps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LociFewStepsPackage eINSTANCE = fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionEnvironmentImpl
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getExecutionEnvironment()
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
	 * The meta object id for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.LocusImpl <em>Locus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LocusImpl
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getLocus()
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
	 * The meta object id for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.ExecutorImpl
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getExecutor()
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
	 * The meta object id for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionFactoryImpl <em>Execution Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionFactoryImpl
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getExecutionFactory()
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
	 * The meta object id for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.SemanticVisitorImpl <em>Semantic Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.SemanticVisitorImpl
	 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getSemanticVisitor()
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
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.LociFewSteps.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environment</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.ExecutionEnvironment
	 * @generated
	 */
	EClass getExecutionEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link fumlConfigurationFewSteps.LociFewSteps.ExecutionEnvironment#getLocus_ExecutionEnvironment <em>Locus Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locus Execution Environment</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.ExecutionEnvironment#getLocus_ExecutionEnvironment()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_Locus_ExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.LociFewSteps.Locus <em>Locus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locus</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.Locus
	 * @generated
	 */
	EClass getLocus();

	/**
	 * Returns the meta object for the containment reference '{@link fumlConfigurationFewSteps.LociFewSteps.Locus#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factory</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.Locus#getFactory()
	 * @see #getLocus()
	 * @generated
	 */
	EReference getLocus_Factory();

	/**
	 * Returns the meta object for the containment reference '{@link fumlConfigurationFewSteps.LociFewSteps.Locus#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.Locus#getExecutor()
	 * @see #getLocus()
	 * @generated
	 */
	EReference getLocus_Executor();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationFewSteps.LociFewSteps.Locus#getExtensionalValues <em>Extensional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensional Values</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.Locus#getExtensionalValues()
	 * @see #getLocus()
	 * @generated
	 */
	EReference getLocus_ExtensionalValues();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.LociFewSteps.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfigurationFewSteps.LociFewSteps.Executor#getLocus_Executor <em>Locus Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Locus Executor</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.Executor#getLocus_Executor()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_Locus_Executor();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory <em>Execution Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Factory</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory
	 * @generated
	 */
	EClass getExecutionFactory();

	/**
	 * Returns the meta object for the container reference '{@link fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Locus Execution Factory</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory#getLocus_ExecutionFactory()
	 * @see #getExecutionFactory()
	 * @generated
	 */
	EReference getExecutionFactory_Locus_ExecutionFactory();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory#getPrimitiveBehaviorPrototypes <em>Primitive Behavior Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primitive Behavior Prototypes</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory#getPrimitiveBehaviorPrototypes()
	 * @see #getExecutionFactory()
	 * @generated
	 */
	EReference getExecutionFactory_PrimitiveBehaviorPrototypes();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory#getBuiltInTypes <em>Built In Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Built In Types</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory#getBuiltInTypes()
	 * @see #getExecutionFactory()
	 * @generated
	 */
	EReference getExecutionFactory_BuiltInTypes();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor <em>Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Visitor</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor
	 * @generated
	 */
	EClass getSemanticVisitor();

	/**
	 * Returns the meta object for the reference '{@link fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor#getRuntimeModelElement <em>Runtime Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Model Element</em>'.
	 * @see fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor#getRuntimeModelElement()
	 * @see #getSemanticVisitor()
	 * @generated
	 */
	EReference getSemanticVisitor_RuntimeModelElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LociFewStepsFactory getLociFewStepsFactory();

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
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionEnvironmentImpl
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getExecutionEnvironment()
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
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.LocusImpl <em>Locus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LocusImpl
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getLocus()
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
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.ExecutorImpl
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getExecutor()
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
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionFactoryImpl <em>Execution Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionFactoryImpl
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getExecutionFactory()
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
		 * The meta object literal for the '{@link fumlConfigurationFewSteps.LociFewSteps.impl.SemanticVisitorImpl <em>Semantic Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.SemanticVisitorImpl
		 * @see fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl#getSemanticVisitor()
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

	}

} //LociFewStepsPackage
