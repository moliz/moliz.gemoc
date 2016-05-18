/**
 */
package umlTrace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.engine.mse.MsePackage;

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
 * @see umlTrace.UmlTraceFactory
 * @model kind="package"
 * @generated
 */
public interface UmlTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "umlTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "umlTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "umlTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlTracePackage eINSTANCE = umlTrace.impl.UmlTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.impl.SpecificTraceImpl
	 * @see umlTrace.impl.UmlTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = MsePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = MsePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Basic Behaviors traced Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES = MsePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS = MsePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input traced Input Parameter Valuess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS = MsePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Edge Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES = MsePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS = MsePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Node Activation Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS = MsePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Forked Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Object Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS = MsePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Kernel traced Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES = MsePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Kernel traced Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES = MsePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Kernel traced Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS = MsePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Kernel traced References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES = MsePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Loci traced Execution Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS = MsePackage.TRACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Loci traced Execution Factorys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS = MsePackage.TRACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Loci traced Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS = MsePackage.TRACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Loci traced Locuss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_LOCUSS = MsePackage.TRACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Loci traced Semantic Visitors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS = MsePackage.TRACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = MsePackage.TRACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Uml traced Classs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__UML_TRACED_CLASSS = MsePackage.TRACE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Uml traced Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__UML_TRACED_PARAMETERS = MsePackage.TRACE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Uml traced Primitive Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__UML_TRACED_PRIMITIVE_TYPES = MsePackage.TRACE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = MsePackage.TRACE_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_OPERATION_COUNT = MsePackage.TRACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link umlTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see umlTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getBasicBehaviors_tracedParameterValues <em>Basic Behaviors traced Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Behaviors traced Parameter Values</em>'.
	 * @see umlTrace.SpecificTrace#getBasicBehaviors_tracedParameterValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicBehaviors_tracedParameterValues();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_tracedElementConfigurations <em>Fuml Configuration traced Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Element Configurations</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_tracedElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getInput_tracedInputParameterValuess <em>Input traced Input Parameter Valuess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input traced Input Parameter Valuess</em>'.
	 * @see umlTrace.SpecificTrace#getInput_tracedInputParameterValuess()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Input_tracedInputParameterValuess();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityEdgeInstances <em>Intermediate Activities traced Activity Edge Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Edge Instances</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityEdgeInstances()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityEdgeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityExecutions <em>Intermediate Activities traced Activity Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Executions</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivationGroups <em>Intermediate Activities traced Activity Node Activation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Node Activation Groups</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivationGroups()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityNodeActivationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivations <em>Intermediate Activities traced Activity Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedForkedTokens <em>Intermediate Activities traced Forked Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Forked Tokens</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedForkedTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedForkedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedObjectTokens <em>Intermediate Activities traced Object Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Object Tokens</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedObjectTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedObjectTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedOffers <em>Intermediate Activities traced Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Offers</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedOffers()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedOffers();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedTokens <em>Intermediate Activities traced Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Tokens</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedBooleanValues <em>Kernel traced Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Boolean Values</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedBooleanValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedBooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedIntegerValues <em>Kernel traced Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Integer Values</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedIntegerValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedIntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedObjects <em>Kernel traced Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Objects</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedObjects()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedReferences <em>Kernel traced References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced References</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedReferences()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedExecutionEnvironments <em>Loci traced Execution Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Execution Environments</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedExecutionEnvironments()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutionEnvironments();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedExecutionFactorys <em>Loci traced Execution Factorys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Execution Factorys</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedExecutionFactorys()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutionFactorys();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedExecutors <em>Loci traced Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Executors</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedExecutors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutors();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedLocuss <em>Loci traced Locuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Locuss</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedLocuss()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedLocuss();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedSemanticVisitors <em>Loci traced Semantic Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Semantic Visitors</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedSemanticVisitors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedSemanticVisitors();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see umlTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getUml_tracedClasss <em>Uml traced Classs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uml traced Classs</em>'.
	 * @see umlTrace.SpecificTrace#getUml_tracedClasss()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Uml_tracedClasss();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getUml_tracedParameters <em>Uml traced Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uml traced Parameters</em>'.
	 * @see umlTrace.SpecificTrace#getUml_tracedParameters()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Uml_tracedParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getUml_tracedPrimitiveTypes <em>Uml traced Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uml traced Primitive Types</em>'.
	 * @see umlTrace.SpecificTrace#getUml_tracedPrimitiveTypes()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Uml_tracedPrimitiveTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UmlTraceFactory getUmlTraceFactory();

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
		 * The meta object literal for the '{@link umlTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.impl.SpecificTraceImpl
		 * @see umlTrace.impl.UmlTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Basic Behaviors traced Parameter Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES = eINSTANCE.getSpecificTrace_BasicBehaviors_tracedParameterValues();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Input traced Input Parameter Valuess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS = eINSTANCE.getSpecificTrace_Input_tracedInputParameterValuess();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Edge Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityEdgeInstances();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityExecutions();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Node Activation Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityNodeActivationGroups();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Forked Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedForkedTokens();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Object Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedObjectTokens();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedOffers();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedTokens();

		/**
		 * The meta object literal for the '<em><b>Kernel traced Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES = eINSTANCE.getSpecificTrace_Kernel_tracedBooleanValues();

		/**
		 * The meta object literal for the '<em><b>Kernel traced Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES = eINSTANCE.getSpecificTrace_Kernel_tracedIntegerValues();

		/**
		 * The meta object literal for the '<em><b>Kernel traced Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS = eINSTANCE.getSpecificTrace_Kernel_tracedObjects();

		/**
		 * The meta object literal for the '<em><b>Kernel traced References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES = eINSTANCE.getSpecificTrace_Kernel_tracedReferences();

		/**
		 * The meta object literal for the '<em><b>Loci traced Execution Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS = eINSTANCE.getSpecificTrace_Loci_tracedExecutionEnvironments();

		/**
		 * The meta object literal for the '<em><b>Loci traced Execution Factorys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS = eINSTANCE.getSpecificTrace_Loci_tracedExecutionFactorys();

		/**
		 * The meta object literal for the '<em><b>Loci traced Executors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS = eINSTANCE.getSpecificTrace_Loci_tracedExecutors();

		/**
		 * The meta object literal for the '<em><b>Loci traced Locuss</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_LOCUSS = eINSTANCE.getSpecificTrace_Loci_tracedLocuss();

		/**
		 * The meta object literal for the '<em><b>Loci traced Semantic Visitors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS = eINSTANCE.getSpecificTrace_Loci_tracedSemanticVisitors();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

		/**
		 * The meta object literal for the '<em><b>Uml traced Classs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__UML_TRACED_CLASSS = eINSTANCE.getSpecificTrace_Uml_tracedClasss();

		/**
		 * The meta object literal for the '<em><b>Uml traced Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__UML_TRACED_PARAMETERS = eINSTANCE.getSpecificTrace_Uml_tracedParameters();

		/**
		 * The meta object literal for the '<em><b>Uml traced Primitive Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__UML_TRACED_PRIMITIVE_TYPES = eINSTANCE.getSpecificTrace_Uml_tracedPrimitiveTypes();

	}

} //UmlTracePackage
