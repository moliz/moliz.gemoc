/**
 */
package fumlConfigurationFewStepsTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage;

import fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTraceFactory;
import fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage;
import fumlConfigurationFewStepsTrace.SpecificTrace;

import fumlConfigurationFewStepsTrace.States.StatesPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.IntermediateActivitiesFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl;

import fumlConfigurationFewStepsTrace.Steps.StepsPackage;

import fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FumlConfigurationFewStepsTracePackageImpl extends EPackageImpl implements FumlConfigurationFewStepsTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTraceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FumlConfigurationFewStepsTracePackageImpl() {
		super(eNS_URI, FumlConfigurationFewStepsTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FumlConfigurationFewStepsTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FumlConfigurationFewStepsTracePackage init() {
		if (isInited) return (FumlConfigurationFewStepsTracePackage)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsTracePackage.eNS_URI);

		// Obtain or create and register package
		FumlConfigurationFewStepsTracePackageImpl theFumlConfigurationFewStepsTracePackage = (FumlConfigurationFewStepsTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FumlConfigurationFewStepsTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FumlConfigurationFewStepsTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationFewStepsPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		LociFewStepsPackageImpl theLociFewStepsPackage = (LociFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) instanceof LociFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) : LociFewStepsPackage.eINSTANCE);
		IntermediateActivitiesFewStepsPackageImpl theIntermediateActivitiesFewStepsPackage = (IntermediateActivitiesFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI) instanceof IntermediateActivitiesFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI) : IntermediateActivitiesFewStepsPackage.eINSTANCE);
		BasicActionsFewStepsPackageImpl theBasicActionsFewStepsPackage = (BasicActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI) instanceof BasicActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI) : BasicActionsFewStepsPackage.eINSTANCE);

		// Create package meta-data objects
		theFumlConfigurationFewStepsTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theLociFewStepsPackage.createPackageContents();
		theIntermediateActivitiesFewStepsPackage.createPackageContents();
		theBasicActionsFewStepsPackage.createPackageContents();

		// Initialize created meta-data
		theFumlConfigurationFewStepsTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theLociFewStepsPackage.initializePackageContents();
		theIntermediateActivitiesFewStepsPackage.initializePackageContents();
		theBasicActionsFewStepsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFumlConfigurationFewStepsTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FumlConfigurationFewStepsTracePackage.eNS_URI, theFumlConfigurationFewStepsTracePackage);
		return theFumlConfigurationFewStepsTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTrace() {
		return specificTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_BasicActionsFewSteps_tracedActionActivations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_BasicActionsFewSteps_tracedPinActivations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityEdgeInstances() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityNodeActivations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivitiesFewSteps_tracedDecisionNodeActivations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivitiesFewSteps_tracedForkNodeActivations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivitiesFewSteps_tracedInitialNodeActivations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivitiesFewSteps_tracedTokens() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_LociFewSteps_tracedSemanticVisitors() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_StatesTrace() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationFewStepsTraceFactory getFumlConfigurationFewStepsTraceFactory() {
		return (FumlConfigurationFewStepsTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		specificTraceEClass = createEClass(SPECIFIC_TRACE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_ACTION_ACTIVATIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_PIN_ACTIVATIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_EDGE_INSTANCES);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_NODE_ACTIVATIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_DECISION_NODE_ACTIVATIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_FORK_NODE_ACTIVATIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_INITIAL_NODE_ACTIVATIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_TOKENS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__LOCI_FEW_STEPS_TRACED_SEMANTIC_VISITORS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__STATES_TRACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		BasicActionsFewStepsPackage theBasicActionsFewStepsPackage = (BasicActionsFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI);
		IntermediateActivitiesFewStepsPackage theIntermediateActivitiesFewStepsPackage = (IntermediateActivitiesFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI);
		LociFewStepsPackage theLociFewStepsPackage = (LociFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTracePackage.getTrace());
		EGenericType g2 = createEGenericType(theTracePackage.getSequentialStep());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theStepsPackage.getSpecificStep());
		g2.getETypeArguments().add(g3);
		specificTraceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(specificTraceEClass, SpecificTrace.class, "SpecificTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation(), null, "FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation(), null, "FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation(), null, "FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation(), null, "FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation(), null, "FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence(), theStepsPackage.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation(), null, "FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_BasicActionsFewSteps_tracedActionActivations(), theBasicActionsFewStepsPackage.getTracedActionActivation(), null, "basicActionsFewSteps_tracedActionActivations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_BasicActionsFewSteps_tracedPinActivations(), theBasicActionsFewStepsPackage.getTracedPinActivation(), null, "basicActionsFewSteps_tracedPinActivations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityEdgeInstances(), theIntermediateActivitiesFewStepsPackage.getTracedActivityEdgeInstance(), null, "intermediateActivitiesFewSteps_tracedActivityEdgeInstances", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations(), theIntermediateActivitiesFewStepsPackage.getTracedActivityFinalNodeActivation(), null, "intermediateActivitiesFewSteps_tracedActivityFinalNodeActivations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityNodeActivations(), theIntermediateActivitiesFewStepsPackage.getTracedActivityNodeActivation(), null, "intermediateActivitiesFewSteps_tracedActivityNodeActivations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations(), theIntermediateActivitiesFewStepsPackage.getTracedActivityParameterNodeActivation(), null, "intermediateActivitiesFewSteps_tracedActivityParameterNodeActivations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_IntermediateActivitiesFewSteps_tracedDecisionNodeActivations(), theIntermediateActivitiesFewStepsPackage.getTracedDecisionNodeActivation(), null, "intermediateActivitiesFewSteps_tracedDecisionNodeActivations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_IntermediateActivitiesFewSteps_tracedForkNodeActivations(), theIntermediateActivitiesFewStepsPackage.getTracedForkNodeActivation(), null, "intermediateActivitiesFewSteps_tracedForkNodeActivations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_IntermediateActivitiesFewSteps_tracedInitialNodeActivations(), theIntermediateActivitiesFewStepsPackage.getTracedInitialNodeActivation(), null, "intermediateActivitiesFewSteps_tracedInitialNodeActivations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_IntermediateActivitiesFewSteps_tracedTokens(), theIntermediateActivitiesFewStepsPackage.getTracedToken(), null, "intermediateActivitiesFewSteps_tracedTokens", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_LociFewSteps_tracedSemanticVisitors(), theLociFewStepsPackage.getTracedSemanticVisitor(), null, "lociFewSteps_tracedSemanticVisitors", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FumlConfigurationFewStepsTracePackageImpl
