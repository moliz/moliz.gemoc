/**
 */
package fumlConfigurationTrace.States.impl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import fumlConfiguration.FumlConfigurationPackage;

import fumlConfigurationTrace.FumlConfigurationTracePackage;

import fumlConfigurationTrace.States.StatesFactory;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Input.InputPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Input.impl.InputPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.impl.IntegerFunctionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl;

import fumlConfigurationTrace.Steps.StepsPackage;

import fumlConfigurationTrace.Steps.impl.StepsPackageImpl;

import fumlConfigurationTrace.impl.FumlConfigurationTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionActivation_firing_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionActivation_pinActivations_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeInstance_offers_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeInstance_source_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeInstance_target_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExecution_activationGroup_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivationGroup_activityExecution_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivationGroup_edgeInstances_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivationGroup_nodeActivations_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivation_group_ActivityNodeActivation_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivation_heldTokens_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivation_incomingEdges_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivation_isRunning_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivation_node_ActivityNodeActivation_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivation_outgoingEdges_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivation_running_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValue_value_BooleanValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionActivation_callExecutions_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundValue_featureValues_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementConfiguration_semanticVisitor_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluation_locus_Evaluation_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluation_specification_Evaluation_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironment_locus_ExecutionEnvironment_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFactory_builtInTypes_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFactory_locus_ExecutionFactory_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFactory_primitiveBehaviorPrototypes_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execution_context_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execution_parameterValues_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executor_locus_Executor_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionalValue_locus_ExtensionalValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValue_feature_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValue_position_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValue_values_FeatureValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedToken_baseTokenIsWithdrawn_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedToken_baseToken_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedToken_remainingOffersCount_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterValues_name_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterValues_parameterValues_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValue_value_IntegerValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locus_executor_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locus_extensionalValues_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locus_factory_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeActivation_offeredTokenCount_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectToken_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_types_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offer_offeredTokens_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValue_parameter_ParameterValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValue_values_ParameterValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinActivation_actionActivation_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinActivation_count_temp_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveValue_type_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reference_referent_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticVisitor_runtimeModelElement_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass token_holder_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

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
	 * @see fumlConfigurationTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationTracePackageImpl theFumlConfigurationTracePackage = (FumlConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI) instanceof FumlConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI) : FumlConfigurationTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		FumlConfigurationPackageImpl theFumlConfigurationPackage_1 = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) : fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		IntegerFunctionsPackageImpl theIntegerFunctionsPackage = (IntegerFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) instanceof IntegerFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) : IntegerFunctionsPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationTracePackage.loadPackage();

		// Fix loaded packages
		theStatesPackage.fixPackageContents();
		theFumlConfigurationTracePackage.fixPackageContents();
		theStepsPackage.fixPackageContents();
		theFumlConfigurationPackage_1.fixPackageContents();
		theLociPackage.fixPackageContents();
		theIntermediateActivitiesPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theBasicActionsPackage.fixPackageContents();
		theIntermediateActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();
		theIntegerFunctionsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionActivation_firing_Value() {
		if (actionActivation_firing_ValueEClass == null) {
			actionActivation_firing_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return actionActivation_firing_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionActivation_firing_Value_Firing() {
        return (EAttribute)getActionActivation_firing_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_firing_Value_Parent() {
        return (EReference)getActionActivation_firing_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_firing_Value_States() {
        return (EReference)getActionActivation_firing_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation_firing_Value__GetStatesNoOpposite() {
        return getActionActivation_firing_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionActivation_pinActivations_Value() {
		if (actionActivation_pinActivations_ValueEClass == null) {
			actionActivation_pinActivations_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return actionActivation_pinActivations_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_pinActivations_Value_Parent() {
        return (EReference)getActionActivation_pinActivations_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_pinActivations_Value_PinActivations() {
        return (EReference)getActionActivation_pinActivations_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_pinActivations_Value_States() {
        return (EReference)getActionActivation_pinActivations_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation_pinActivations_Value__GetStatesNoOpposite() {
        return getActionActivation_pinActivations_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_edge_ActivityEdgeInstance_Value() {
		if (activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass == null) {
			activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Edge_ActivityEdgeInstance() {
        return (EReference)getActivityEdgeInstance_edge_ActivityEdgeInstance_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Parent() {
        return (EReference)getActivityEdgeInstance_edge_ActivityEdgeInstance_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_States() {
        return (EReference)getActivityEdgeInstance_edge_ActivityEdgeInstance_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_edge_ActivityEdgeInstance_Value__GetStatesNoOpposite() {
        return getActivityEdgeInstance_edge_ActivityEdgeInstance_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_group_ActivityEdgeInstance_Value() {
		if (activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass == null) {
			activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Group_ActivityEdgeInstance() {
        return (EReference)getActivityEdgeInstance_group_ActivityEdgeInstance_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Parent() {
        return (EReference)getActivityEdgeInstance_group_ActivityEdgeInstance_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_States() {
        return (EReference)getActivityEdgeInstance_group_ActivityEdgeInstance_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_group_ActivityEdgeInstance_Value__GetStatesNoOpposite() {
        return getActivityEdgeInstance_group_ActivityEdgeInstance_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_offers_Value() {
		if (activityEdgeInstance_offers_ValueEClass == null) {
			activityEdgeInstance_offers_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return activityEdgeInstance_offers_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_offers_Value_Offers() {
        return (EReference)getActivityEdgeInstance_offers_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_offers_Value_Parent() {
        return (EReference)getActivityEdgeInstance_offers_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_offers_Value_States() {
        return (EReference)getActivityEdgeInstance_offers_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_offers_Value__GetStatesNoOpposite() {
        return getActivityEdgeInstance_offers_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_source_Value() {
		if (activityEdgeInstance_source_ValueEClass == null) {
			activityEdgeInstance_source_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return activityEdgeInstance_source_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_source_Value_Parent() {
        return (EReference)getActivityEdgeInstance_source_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_source_Value_Source() {
        return (EReference)getActivityEdgeInstance_source_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_source_Value_States() {
        return (EReference)getActivityEdgeInstance_source_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_source_Value__GetStatesNoOpposite() {
        return getActivityEdgeInstance_source_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_target_Value() {
		if (activityEdgeInstance_target_ValueEClass == null) {
			activityEdgeInstance_target_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return activityEdgeInstance_target_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_target_Value_Parent() {
        return (EReference)getActivityEdgeInstance_target_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_target_Value_States() {
        return (EReference)getActivityEdgeInstance_target_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_target_Value_Target() {
        return (EReference)getActivityEdgeInstance_target_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_target_Value__GetStatesNoOpposite() {
        return getActivityEdgeInstance_target_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExecution_activationGroup_Value() {
		if (activityExecution_activationGroup_ValueEClass == null) {
			activityExecution_activationGroup_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return activityExecution_activationGroup_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_activationGroup_Value_ActivationGroup() {
        return (EReference)getActivityExecution_activationGroup_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_activationGroup_Value_Parent() {
        return (EReference)getActivityExecution_activationGroup_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_activationGroup_Value_States() {
        return (EReference)getActivityExecution_activationGroup_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityExecution_activationGroup_Value__GetStatesNoOpposite() {
        return getActivityExecution_activationGroup_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivationGroup_activityExecution_Value() {
		if (activityNodeActivationGroup_activityExecution_ValueEClass == null) {
			activityNodeActivationGroup_activityExecution_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return activityNodeActivationGroup_activityExecution_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_activityExecution_Value_ActivityExecution() {
        return (EReference)getActivityNodeActivationGroup_activityExecution_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_activityExecution_Value_Parent() {
        return (EReference)getActivityNodeActivationGroup_activityExecution_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_activityExecution_Value_States() {
        return (EReference)getActivityNodeActivationGroup_activityExecution_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivationGroup_activityExecution_Value__GetStatesNoOpposite() {
        return getActivityNodeActivationGroup_activityExecution_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivationGroup_edgeInstances_Value() {
		if (activityNodeActivationGroup_edgeInstances_ValueEClass == null) {
			activityNodeActivationGroup_edgeInstances_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return activityNodeActivationGroup_edgeInstances_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_edgeInstances_Value_EdgeInstances() {
        return (EReference)getActivityNodeActivationGroup_edgeInstances_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_edgeInstances_Value_Parent() {
        return (EReference)getActivityNodeActivationGroup_edgeInstances_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_edgeInstances_Value_States() {
        return (EReference)getActivityNodeActivationGroup_edgeInstances_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivationGroup_edgeInstances_Value__GetStatesNoOpposite() {
        return getActivityNodeActivationGroup_edgeInstances_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivationGroup_nodeActivations_Value() {
		if (activityNodeActivationGroup_nodeActivations_ValueEClass == null) {
			activityNodeActivationGroup_nodeActivations_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(10);
		}
		return activityNodeActivationGroup_nodeActivations_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_nodeActivations_Value_NodeActivations() {
        return (EReference)getActivityNodeActivationGroup_nodeActivations_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_nodeActivations_Value_Parent() {
        return (EReference)getActivityNodeActivationGroup_nodeActivations_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_nodeActivations_Value_States() {
        return (EReference)getActivityNodeActivationGroup_nodeActivations_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivationGroup_nodeActivations_Value__GetStatesNoOpposite() {
        return getActivityNodeActivationGroup_nodeActivations_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_group_ActivityNodeActivation_Value() {
		if (activityNodeActivation_group_ActivityNodeActivation_ValueEClass == null) {
			activityNodeActivation_group_ActivityNodeActivation_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return activityNodeActivation_group_ActivityNodeActivation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_Group_ActivityNodeActivation() {
        return (EReference)getActivityNodeActivation_group_ActivityNodeActivation_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_Parent() {
        return (EReference)getActivityNodeActivation_group_ActivityNodeActivation_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_States() {
        return (EReference)getActivityNodeActivation_group_ActivityNodeActivation_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_group_ActivityNodeActivation_Value__GetStatesNoOpposite() {
        return getActivityNodeActivation_group_ActivityNodeActivation_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_heldTokens_Value() {
		if (activityNodeActivation_heldTokens_ValueEClass == null) {
			activityNodeActivation_heldTokens_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return activityNodeActivation_heldTokens_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_heldTokens_Value_HeldTokens() {
        return (EReference)getActivityNodeActivation_heldTokens_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_heldTokens_Value_Parent() {
        return (EReference)getActivityNodeActivation_heldTokens_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_heldTokens_Value_States() {
        return (EReference)getActivityNodeActivation_heldTokens_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_heldTokens_Value__GetStatesNoOpposite() {
        return getActivityNodeActivation_heldTokens_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_incomingEdges_Value() {
		if (activityNodeActivation_incomingEdges_ValueEClass == null) {
			activityNodeActivation_incomingEdges_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return activityNodeActivation_incomingEdges_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_incomingEdges_Value_IncomingEdges() {
        return (EReference)getActivityNodeActivation_incomingEdges_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_incomingEdges_Value_Parent() {
        return (EReference)getActivityNodeActivation_incomingEdges_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_incomingEdges_Value_States() {
        return (EReference)getActivityNodeActivation_incomingEdges_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_incomingEdges_Value__GetStatesNoOpposite() {
        return getActivityNodeActivation_incomingEdges_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_isRunning_Value() {
		if (activityNodeActivation_isRunning_ValueEClass == null) {
			activityNodeActivation_isRunning_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(14);
		}
		return activityNodeActivation_isRunning_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNodeActivation_isRunning_Value_IsRunning() {
        return (EAttribute)getActivityNodeActivation_isRunning_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_isRunning_Value_Parent() {
        return (EReference)getActivityNodeActivation_isRunning_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_isRunning_Value_States() {
        return (EReference)getActivityNodeActivation_isRunning_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_isRunning_Value__GetStatesNoOpposite() {
        return getActivityNodeActivation_isRunning_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_node_ActivityNodeActivation_Value() {
		if (activityNodeActivation_node_ActivityNodeActivation_ValueEClass == null) {
			activityNodeActivation_node_ActivityNodeActivation_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return activityNodeActivation_node_ActivityNodeActivation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_Node_ActivityNodeActivation() {
        return (EReference)getActivityNodeActivation_node_ActivityNodeActivation_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_Parent() {
        return (EReference)getActivityNodeActivation_node_ActivityNodeActivation_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_States() {
        return (EReference)getActivityNodeActivation_node_ActivityNodeActivation_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_node_ActivityNodeActivation_Value__GetStatesNoOpposite() {
        return getActivityNodeActivation_node_ActivityNodeActivation_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_outgoingEdges_Value() {
		if (activityNodeActivation_outgoingEdges_ValueEClass == null) {
			activityNodeActivation_outgoingEdges_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(16);
		}
		return activityNodeActivation_outgoingEdges_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_outgoingEdges_Value_OutgoingEdges() {
        return (EReference)getActivityNodeActivation_outgoingEdges_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_outgoingEdges_Value_Parent() {
        return (EReference)getActivityNodeActivation_outgoingEdges_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_outgoingEdges_Value_States() {
        return (EReference)getActivityNodeActivation_outgoingEdges_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_outgoingEdges_Value__GetStatesNoOpposite() {
        return getActivityNodeActivation_outgoingEdges_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_running_Value() {
		if (activityNodeActivation_running_ValueEClass == null) {
			activityNodeActivation_running_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(17);
		}
		return activityNodeActivation_running_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_running_Value_Parent() {
        return (EReference)getActivityNodeActivation_running_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNodeActivation_running_Value_Running() {
        return (EAttribute)getActivityNodeActivation_running_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_running_Value_States() {
        return (EReference)getActivityNodeActivation_running_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_running_Value__GetStatesNoOpposite() {
        return getActivityNodeActivation_running_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue_value_BooleanValue_Value() {
		if (booleanValue_value_BooleanValue_ValueEClass == null) {
			booleanValue_value_BooleanValue_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(18);
		}
		return booleanValue_value_BooleanValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_BooleanValue_Value_Parent() {
        return (EReference)getBooleanValue_value_BooleanValue_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_BooleanValue_Value_States() {
        return (EReference)getBooleanValue_value_BooleanValue_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_value_BooleanValue_Value_Value_BooleanValue() {
        return (EAttribute)getBooleanValue_value_BooleanValue_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooleanValue_value_BooleanValue_Value__GetStatesNoOpposite() {
        return getBooleanValue_value_BooleanValue_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallActionActivation_callExecutions_Value() {
		if (callActionActivation_callExecutions_ValueEClass == null) {
			callActionActivation_callExecutions_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(19);
		}
		return callActionActivation_callExecutions_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActionActivation_callExecutions_Value_CallExecutions() {
        return (EReference)getCallActionActivation_callExecutions_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActionActivation_callExecutions_Value_Parent() {
        return (EReference)getCallActionActivation_callExecutions_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActionActivation_callExecutions_Value_States() {
        return (EReference)getCallActionActivation_callExecutions_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallActionActivation_callExecutions_Value__GetStatesNoOpposite() {
        return getCallActionActivation_callExecutions_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundValue_featureValues_Value() {
		if (compoundValue_featureValues_ValueEClass == null) {
			compoundValue_featureValues_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(20);
		}
		return compoundValue_featureValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundValue_featureValues_Value_FeatureValues() {
        return (EReference)getCompoundValue_featureValues_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundValue_featureValues_Value_Parent() {
        return (EReference)getCompoundValue_featureValues_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundValue_featureValues_Value_States() {
        return (EReference)getCompoundValue_featureValues_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompoundValue_featureValues_Value__GetStatesNoOpposite() {
        return getCompoundValue_featureValues_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementConfiguration_semanticVisitor_Value() {
		if (elementConfiguration_semanticVisitor_ValueEClass == null) {
			elementConfiguration_semanticVisitor_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(21);
		}
		return elementConfiguration_semanticVisitor_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementConfiguration_semanticVisitor_Value_Parent() {
        return (EReference)getElementConfiguration_semanticVisitor_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementConfiguration_semanticVisitor_Value_SemanticVisitor() {
        return (EReference)getElementConfiguration_semanticVisitor_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementConfiguration_semanticVisitor_Value_States() {
        return (EReference)getElementConfiguration_semanticVisitor_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementConfiguration_semanticVisitor_Value__GetStatesNoOpposite() {
        return getElementConfiguration_semanticVisitor_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation_locus_Evaluation_Value() {
		if (evaluation_locus_Evaluation_ValueEClass == null) {
			evaluation_locus_Evaluation_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(22);
		}
		return evaluation_locus_Evaluation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_locus_Evaluation_Value_Locus_Evaluation() {
        return (EReference)getEvaluation_locus_Evaluation_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_locus_Evaluation_Value_Parent() {
        return (EReference)getEvaluation_locus_Evaluation_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_locus_Evaluation_Value_States() {
        return (EReference)getEvaluation_locus_Evaluation_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEvaluation_locus_Evaluation_Value__GetStatesNoOpposite() {
        return getEvaluation_locus_Evaluation_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation_specification_Evaluation_Value() {
		if (evaluation_specification_Evaluation_ValueEClass == null) {
			evaluation_specification_Evaluation_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(23);
		}
		return evaluation_specification_Evaluation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_specification_Evaluation_Value_Parent() {
        return (EReference)getEvaluation_specification_Evaluation_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_specification_Evaluation_Value_Specification_Evaluation() {
        return (EReference)getEvaluation_specification_Evaluation_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_specification_Evaluation_Value_States() {
        return (EReference)getEvaluation_specification_Evaluation_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEvaluation_specification_Evaluation_Value__GetStatesNoOpposite() {
        return getEvaluation_specification_Evaluation_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironment_locus_ExecutionEnvironment_Value() {
		if (executionEnvironment_locus_ExecutionEnvironment_ValueEClass == null) {
			executionEnvironment_locus_ExecutionEnvironment_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(24);
		}
		return executionEnvironment_locus_ExecutionEnvironment_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_Locus_ExecutionEnvironment() {
        return (EReference)getExecutionEnvironment_locus_ExecutionEnvironment_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_Parent() {
        return (EReference)getExecutionEnvironment_locus_ExecutionEnvironment_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_States() {
        return (EReference)getExecutionEnvironment_locus_ExecutionEnvironment_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionEnvironment_locus_ExecutionEnvironment_Value__GetStatesNoOpposite() {
        return getExecutionEnvironment_locus_ExecutionEnvironment_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFactory_builtInTypes_Value() {
		if (executionFactory_builtInTypes_ValueEClass == null) {
			executionFactory_builtInTypes_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(25);
		}
		return executionFactory_builtInTypes_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_builtInTypes_Value_BuiltInTypes() {
        return (EReference)getExecutionFactory_builtInTypes_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_builtInTypes_Value_Parent() {
        return (EReference)getExecutionFactory_builtInTypes_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_builtInTypes_Value_States() {
        return (EReference)getExecutionFactory_builtInTypes_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionFactory_builtInTypes_Value__GetStatesNoOpposite() {
        return getExecutionFactory_builtInTypes_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFactory_locus_ExecutionFactory_Value() {
		if (executionFactory_locus_ExecutionFactory_ValueEClass == null) {
			executionFactory_locus_ExecutionFactory_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(26);
		}
		return executionFactory_locus_ExecutionFactory_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_locus_ExecutionFactory_Value_Locus_ExecutionFactory() {
        return (EReference)getExecutionFactory_locus_ExecutionFactory_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_locus_ExecutionFactory_Value_Parent() {
        return (EReference)getExecutionFactory_locus_ExecutionFactory_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_locus_ExecutionFactory_Value_States() {
        return (EReference)getExecutionFactory_locus_ExecutionFactory_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionFactory_locus_ExecutionFactory_Value__GetStatesNoOpposite() {
        return getExecutionFactory_locus_ExecutionFactory_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFactory_primitiveBehaviorPrototypes_Value() {
		if (executionFactory_primitiveBehaviorPrototypes_ValueEClass == null) {
			executionFactory_primitiveBehaviorPrototypes_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(27);
		}
		return executionFactory_primitiveBehaviorPrototypes_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_Parent() {
        return (EReference)getExecutionFactory_primitiveBehaviorPrototypes_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_PrimitiveBehaviorPrototypes() {
        return (EReference)getExecutionFactory_primitiveBehaviorPrototypes_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_States() {
        return (EReference)getExecutionFactory_primitiveBehaviorPrototypes_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionFactory_primitiveBehaviorPrototypes_Value__GetStatesNoOpposite() {
        return getExecutionFactory_primitiveBehaviorPrototypes_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution_context_Value() {
		if (execution_context_ValueEClass == null) {
			execution_context_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(28);
		}
		return execution_context_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_context_Value_Context() {
        return (EReference)getExecution_context_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_context_Value_Parent() {
        return (EReference)getExecution_context_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_context_Value_States() {
        return (EReference)getExecution_context_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution_context_Value__GetStatesNoOpposite() {
        return getExecution_context_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution_parameterValues_Value() {
		if (execution_parameterValues_ValueEClass == null) {
			execution_parameterValues_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(29);
		}
		return execution_parameterValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_parameterValues_Value_ParameterValues() {
        return (EReference)getExecution_parameterValues_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_parameterValues_Value_Parent() {
        return (EReference)getExecution_parameterValues_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_parameterValues_Value_States() {
        return (EReference)getExecution_parameterValues_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution_parameterValues_Value__GetStatesNoOpposite() {
        return getExecution_parameterValues_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutor_locus_Executor_Value() {
		if (executor_locus_Executor_ValueEClass == null) {
			executor_locus_Executor_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(30);
		}
		return executor_locus_Executor_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_locus_Executor_Value_Locus_Executor() {
        return (EReference)getExecutor_locus_Executor_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_locus_Executor_Value_Parent() {
        return (EReference)getExecutor_locus_Executor_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_locus_Executor_Value_States() {
        return (EReference)getExecutor_locus_Executor_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutor_locus_Executor_Value__GetStatesNoOpposite() {
        return getExecutor_locus_Executor_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionalValue_locus_ExtensionalValue_Value() {
		if (extensionalValue_locus_ExtensionalValue_ValueEClass == null) {
			extensionalValue_locus_ExtensionalValue_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(31);
		}
		return extensionalValue_locus_ExtensionalValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionalValue_locus_ExtensionalValue_Value_Locus_ExtensionalValue() {
        return (EReference)getExtensionalValue_locus_ExtensionalValue_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionalValue_locus_ExtensionalValue_Value_Parent() {
        return (EReference)getExtensionalValue_locus_ExtensionalValue_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionalValue_locus_ExtensionalValue_Value_States() {
        return (EReference)getExtensionalValue_locus_ExtensionalValue_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtensionalValue_locus_ExtensionalValue_Value__GetStatesNoOpposite() {
        return getExtensionalValue_locus_ExtensionalValue_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValue_feature_Value() {
		if (featureValue_feature_ValueEClass == null) {
			featureValue_feature_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(32);
		}
		return featureValue_feature_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_feature_Value_Feature() {
        return (EReference)getFeatureValue_feature_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_feature_Value_Parent() {
        return (EReference)getFeatureValue_feature_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_feature_Value_States() {
        return (EReference)getFeatureValue_feature_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValue_feature_Value__GetStatesNoOpposite() {
        return getFeatureValue_feature_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValue_position_Value() {
		if (featureValue_position_ValueEClass == null) {
			featureValue_position_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(33);
		}
		return featureValue_position_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_position_Value_Parent() {
        return (EReference)getFeatureValue_position_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureValue_position_Value_Position() {
        return (EAttribute)getFeatureValue_position_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_position_Value_States() {
        return (EReference)getFeatureValue_position_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValue_position_Value__GetStatesNoOpposite() {
        return getFeatureValue_position_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValue_values_FeatureValue_Value() {
		if (featureValue_values_FeatureValue_ValueEClass == null) {
			featureValue_values_FeatureValue_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(34);
		}
		return featureValue_values_FeatureValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_values_FeatureValue_Value_Parent() {
        return (EReference)getFeatureValue_values_FeatureValue_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_values_FeatureValue_Value_States() {
        return (EReference)getFeatureValue_values_FeatureValue_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_values_FeatureValue_Value_Values_FeatureValue() {
        return (EReference)getFeatureValue_values_FeatureValue_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValue_values_FeatureValue_Value__GetStatesNoOpposite() {
        return getFeatureValue_values_FeatureValue_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_baseTokenIsWithdrawn_Value() {
		if (forkedToken_baseTokenIsWithdrawn_ValueEClass == null) {
			forkedToken_baseTokenIsWithdrawn_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(35);
		}
		return forkedToken_baseTokenIsWithdrawn_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_baseTokenIsWithdrawn_Value_BaseTokenIsWithdrawn() {
        return (EAttribute)getForkedToken_baseTokenIsWithdrawn_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseTokenIsWithdrawn_Value_Parent() {
        return (EReference)getForkedToken_baseTokenIsWithdrawn_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseTokenIsWithdrawn_Value_States() {
        return (EReference)getForkedToken_baseTokenIsWithdrawn_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForkedToken_baseTokenIsWithdrawn_Value__GetStatesNoOpposite() {
        return getForkedToken_baseTokenIsWithdrawn_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_baseToken_Value() {
		if (forkedToken_baseToken_ValueEClass == null) {
			forkedToken_baseToken_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(36);
		}
		return forkedToken_baseToken_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_BaseToken() {
        return (EReference)getForkedToken_baseToken_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_Parent() {
        return (EReference)getForkedToken_baseToken_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_States() {
        return (EReference)getForkedToken_baseToken_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForkedToken_baseToken_Value__GetStatesNoOpposite() {
        return getForkedToken_baseToken_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_remainingOffersCount_Value() {
		if (forkedToken_remainingOffersCount_ValueEClass == null) {
			forkedToken_remainingOffersCount_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(37);
		}
		return forkedToken_remainingOffersCount_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_remainingOffersCount_Value_Parent() {
        return (EReference)getForkedToken_remainingOffersCount_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_remainingOffersCount_Value_RemainingOffersCount() {
        return (EAttribute)getForkedToken_remainingOffersCount_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_remainingOffersCount_Value_States() {
        return (EReference)getForkedToken_remainingOffersCount_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForkedToken_remainingOffersCount_Value__GetStatesNoOpposite() {
        return getForkedToken_remainingOffersCount_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameterValues_name_Value() {
		if (inputParameterValues_name_ValueEClass == null) {
			inputParameterValues_name_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(38);
		}
		return inputParameterValues_name_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputParameterValues_name_Value_Name() {
        return (EAttribute)getInputParameterValues_name_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_name_Value_Parent() {
        return (EReference)getInputParameterValues_name_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_name_Value_States() {
        return (EReference)getInputParameterValues_name_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputParameterValues_name_Value__GetStatesNoOpposite() {
        return getInputParameterValues_name_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameterValues_parameterValues_Value() {
		if (inputParameterValues_parameterValues_ValueEClass == null) {
			inputParameterValues_parameterValues_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(39);
		}
		return inputParameterValues_parameterValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_parameterValues_Value_ParameterValues() {
        return (EReference)getInputParameterValues_parameterValues_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_parameterValues_Value_Parent() {
        return (EReference)getInputParameterValues_parameterValues_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_parameterValues_Value_States() {
        return (EReference)getInputParameterValues_parameterValues_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputParameterValues_parameterValues_Value__GetStatesNoOpposite() {
        return getInputParameterValues_parameterValues_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue_value_IntegerValue_Value() {
		if (integerValue_value_IntegerValue_ValueEClass == null) {
			integerValue_value_IntegerValue_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(40);
		}
		return integerValue_value_IntegerValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValue_value_IntegerValue_Value_Parent() {
        return (EReference)getIntegerValue_value_IntegerValue_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValue_value_IntegerValue_Value_States() {
        return (EReference)getIntegerValue_value_IntegerValue_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_value_IntegerValue_Value_Value_IntegerValue() {
        return (EAttribute)getIntegerValue_value_IntegerValue_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerValue_value_IntegerValue_Value__GetStatesNoOpposite() {
        return getIntegerValue_value_IntegerValue_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocus_executor_Value() {
		if (locus_executor_ValueEClass == null) {
			locus_executor_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(41);
		}
		return locus_executor_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_executor_Value_Executor() {
        return (EReference)getLocus_executor_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_executor_Value_Parent() {
        return (EReference)getLocus_executor_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_executor_Value_States() {
        return (EReference)getLocus_executor_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocus_executor_Value__GetStatesNoOpposite() {
        return getLocus_executor_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocus_extensionalValues_Value() {
		if (locus_extensionalValues_ValueEClass == null) {
			locus_extensionalValues_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(42);
		}
		return locus_extensionalValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_extensionalValues_Value_ExtensionalValues() {
        return (EReference)getLocus_extensionalValues_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_extensionalValues_Value_Parent() {
        return (EReference)getLocus_extensionalValues_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_extensionalValues_Value_States() {
        return (EReference)getLocus_extensionalValues_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocus_extensionalValues_Value__GetStatesNoOpposite() {
        return getLocus_extensionalValues_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocus_factory_Value() {
		if (locus_factory_ValueEClass == null) {
			locus_factory_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(43);
		}
		return locus_factory_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_factory_Value_Factory() {
        return (EReference)getLocus_factory_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_factory_Value_Parent() {
        return (EReference)getLocus_factory_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_factory_Value_States() {
        return (EReference)getLocus_factory_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocus_factory_Value__GetStatesNoOpposite() {
        return getLocus_factory_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNodeActivation_offeredTokenCount_Value() {
		if (objectNodeActivation_offeredTokenCount_ValueEClass == null) {
			objectNodeActivation_offeredTokenCount_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(44);
		}
		return objectNodeActivation_offeredTokenCount_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNodeActivation_offeredTokenCount_Value_OfferedTokenCount() {
        return (EAttribute)getObjectNodeActivation_offeredTokenCount_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNodeActivation_offeredTokenCount_Value_Parent() {
        return (EReference)getObjectNodeActivation_offeredTokenCount_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNodeActivation_offeredTokenCount_Value_States() {
        return (EReference)getObjectNodeActivation_offeredTokenCount_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectNodeActivation_offeredTokenCount_Value__GetStatesNoOpposite() {
        return getObjectNodeActivation_offeredTokenCount_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectToken_value_Value() {
		if (objectToken_value_ValueEClass == null) {
			objectToken_value_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(45);
		}
		return objectToken_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectToken_value_Value_Parent() {
        return (EReference)getObjectToken_value_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectToken_value_Value_States() {
        return (EReference)getObjectToken_value_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectToken_value_Value_Value() {
        return (EReference)getObjectToken_value_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectToken_value_Value__GetStatesNoOpposite() {
        return getObjectToken_value_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_types_Value() {
		if (object_types_ValueEClass == null) {
			object_types_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(46);
		}
		return object_types_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_types_Value_Parent() {
        return (EReference)getObject_types_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_types_Value_States() {
        return (EReference)getObject_types_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_types_Value_Types() {
        return (EReference)getObject_types_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_types_Value__GetStatesNoOpposite() {
        return getObject_types_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffer_offeredTokens_Value() {
		if (offer_offeredTokens_ValueEClass == null) {
			offer_offeredTokens_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(47);
		}
		return offer_offeredTokens_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_OfferedTokens() {
        return (EReference)getOffer_offeredTokens_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_Parent() {
        return (EReference)getOffer_offeredTokens_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_States() {
        return (EReference)getOffer_offeredTokens_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOffer_offeredTokens_Value__GetStatesNoOpposite() {
        return getOffer_offeredTokens_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue_parameter_ParameterValue_Value() {
		if (parameterValue_parameter_ParameterValue_ValueEClass == null) {
			parameterValue_parameter_ParameterValue_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(48);
		}
		return parameterValue_parameter_ParameterValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_parameter_ParameterValue_Value_Parameter_ParameterValue() {
        return (EReference)getParameterValue_parameter_ParameterValue_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_parameter_ParameterValue_Value_Parent() {
        return (EReference)getParameterValue_parameter_ParameterValue_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_parameter_ParameterValue_Value_States() {
        return (EReference)getParameterValue_parameter_ParameterValue_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterValue_parameter_ParameterValue_Value__GetStatesNoOpposite() {
        return getParameterValue_parameter_ParameterValue_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue_values_ParameterValue_Value() {
		if (parameterValue_values_ParameterValue_ValueEClass == null) {
			parameterValue_values_ParameterValue_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(49);
		}
		return parameterValue_values_ParameterValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_values_ParameterValue_Value_Parent() {
        return (EReference)getParameterValue_values_ParameterValue_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_values_ParameterValue_Value_States() {
        return (EReference)getParameterValue_values_ParameterValue_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_values_ParameterValue_Value_Values_ParameterValue() {
        return (EReference)getParameterValue_values_ParameterValue_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterValue_values_ParameterValue_Value__GetStatesNoOpposite() {
        return getParameterValue_values_ParameterValue_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinActivation_actionActivation_Value() {
		if (pinActivation_actionActivation_ValueEClass == null) {
			pinActivation_actionActivation_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(50);
		}
		return pinActivation_actionActivation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_actionActivation_Value_ActionActivation() {
        return (EReference)getPinActivation_actionActivation_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_actionActivation_Value_Parent() {
        return (EReference)getPinActivation_actionActivation_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_actionActivation_Value_States() {
        return (EReference)getPinActivation_actionActivation_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPinActivation_actionActivation_Value__GetStatesNoOpposite() {
        return getPinActivation_actionActivation_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinActivation_count_temp_Value() {
		if (pinActivation_count_temp_ValueEClass == null) {
			pinActivation_count_temp_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(51);
		}
		return pinActivation_count_temp_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPinActivation_count_temp_Value_Count_temp() {
        return (EAttribute)getPinActivation_count_temp_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_count_temp_Value_Parent() {
        return (EReference)getPinActivation_count_temp_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_count_temp_Value_States() {
        return (EReference)getPinActivation_count_temp_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPinActivation_count_temp_Value__GetStatesNoOpposite() {
        return getPinActivation_count_temp_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveValue_type_Value() {
		if (primitiveValue_type_ValueEClass == null) {
			primitiveValue_type_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(52);
		}
		return primitiveValue_type_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveValue_type_Value_Parent() {
        return (EReference)getPrimitiveValue_type_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveValue_type_Value_States() {
        return (EReference)getPrimitiveValue_type_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveValue_type_Value_Type() {
        return (EReference)getPrimitiveValue_type_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveValue_type_Value__GetStatesNoOpposite() {
        return getPrimitiveValue_type_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference_referent_Value() {
		if (reference_referent_ValueEClass == null) {
			reference_referent_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(53);
		}
		return reference_referent_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_referent_Value_Parent() {
        return (EReference)getReference_referent_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_referent_Value_Referent() {
        return (EReference)getReference_referent_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_referent_Value_States() {
        return (EReference)getReference_referent_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReference_referent_Value__GetStatesNoOpposite() {
        return getReference_referent_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticVisitor_runtimeModelElement_Value() {
		if (semanticVisitor_runtimeModelElement_ValueEClass == null) {
			semanticVisitor_runtimeModelElement_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(54);
		}
		return semanticVisitor_runtimeModelElement_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_Parent() {
        return (EReference)getSemanticVisitor_runtimeModelElement_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement() {
        return (EReference)getSemanticVisitor_runtimeModelElement_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_States() {
        return (EReference)getSemanticVisitor_runtimeModelElement_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite() {
        return getSemanticVisitor_runtimeModelElement_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		if (stateEClass == null) {
			stateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(55);
		}
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActionActivation_firing_Values() {
        return (EReference)getState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActionActivation_pinActivations_Values() {
        return (EReference)getState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_edge_ActivityEdgeInstance_Values() {
        return (EReference)getState().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_group_ActivityEdgeInstance_Values() {
        return (EReference)getState().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_offers_Values() {
        return (EReference)getState().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_source_Values() {
        return (EReference)getState().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_target_Values() {
        return (EReference)getState().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityExecution_activationGroup_Values() {
        return (EReference)getState().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivationGroup_activityExecution_Values() {
        return (EReference)getState().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivationGroup_edgeInstances_Values() {
        return (EReference)getState().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivationGroup_nodeActivations_Values() {
        return (EReference)getState().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_group_ActivityNodeActivation_Values() {
        return (EReference)getState().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_heldTokens_Values() {
        return (EReference)getState().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_incomingEdges_Values() {
        return (EReference)getState().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_isRunning_Values() {
        return (EReference)getState().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_node_ActivityNodeActivation_Values() {
        return (EReference)getState().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_outgoingEdges_Values() {
        return (EReference)getState().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_running_Values() {
        return (EReference)getState().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanValue_value_BooleanValue_Values() {
        return (EReference)getState().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_CallActionActivation_callExecutions_Values() {
        return (EReference)getState().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_CompoundValue_featureValues_Values() {
        return (EReference)getState().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ElementConfiguration_semanticVisitor_Values() {
        return (EReference)getState().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
        return (EReference)getState().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Evaluation_locus_Evaluation_Values() {
        return (EReference)getState().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Evaluation_specification_Evaluation_Values() {
        return (EReference)getState().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExecutionEnvironment_locus_ExecutionEnvironment_Values() {
        return (EReference)getState().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExecutionFactory_builtInTypes_Values() {
        return (EReference)getState().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExecutionFactory_locus_ExecutionFactory_Values() {
        return (EReference)getState().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExecutionFactory_primitiveBehaviorPrototypes_Values() {
        return (EReference)getState().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Execution_context_Values() {
        return (EReference)getState().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Execution_parameterValues_Values() {
        return (EReference)getState().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Executor_locus_Executor_Values() {
        return (EReference)getState().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExtensionalValue_locus_ExtensionalValue_Values() {
        return (EReference)getState().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FeatureValue_feature_Values() {
        return (EReference)getState().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FeatureValue_position_Values() {
        return (EReference)getState().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FeatureValue_values_FeatureValue_Values() {
        return (EReference)getState().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ForkedToken_baseTokenIsWithdrawn_Values() {
        return (EReference)getState().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ForkedToken_baseToken_Values() {
        return (EReference)getState().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ForkedToken_remainingOffersCount_Values() {
        return (EReference)getState().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InputParameterValues_name_Values() {
        return (EReference)getState().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InputParameterValues_parameterValues_Values() {
        return (EReference)getState().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerValue_value_IntegerValue_Values() {
        return (EReference)getState().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Locus_executor_Values() {
        return (EReference)getState().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Locus_extensionalValues_Values() {
        return (EReference)getState().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Locus_factory_Values() {
        return (EReference)getState().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ObjectNodeActivation_offeredTokenCount_Values() {
        return (EReference)getState().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ObjectToken_value_Values() {
        return (EReference)getState().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Object_types_Values() {
        return (EReference)getState().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Offer_offeredTokens_Values() {
        return (EReference)getState().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ParameterValue_parameter_ParameterValue_Values() {
        return (EReference)getState().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ParameterValue_values_ParameterValue_Values() {
        return (EReference)getState().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_PinActivation_actionActivation_Values() {
        return (EReference)getState().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_PinActivation_count_temp_Values() {
        return (EReference)getState().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_PrimitiveValue_type_Values() {
        return (EReference)getState().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Reference_referent_Values() {
        return (EReference)getState().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_SemanticVisitor_runtimeModelElement_Values() {
        return (EReference)getState().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
        return (EReference)getState().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Token_holder_Values() {
        return (EReference)getState().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken_holder_Value() {
		if (token_holder_ValueEClass == null) {
			token_holder_ValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(56);
		}
		return token_holder_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_Holder() {
        return (EReference)getToken_holder_Value().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_Parent() {
        return (EReference)getToken_holder_Value().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_States() {
        return (EReference)getToken_holder_Value().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken_holder_Value__GetStatesNoOpposite() {
        return getToken_holder_Value().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		if (valueEClass == null) {
			valueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI).getEClassifiers().get(57);
		}
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_StatesNoOpposite() {
        return (EReference)getValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("fumlConfigurationTrace.States." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //StatesPackageImpl
