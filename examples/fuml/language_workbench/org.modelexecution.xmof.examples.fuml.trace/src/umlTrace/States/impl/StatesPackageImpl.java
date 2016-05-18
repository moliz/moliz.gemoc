/**
 */
package umlTrace.States.impl;

import fumlConfiguration.FumlConfigurationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import umlTrace.States.ActionActivation_firing_Value;
import umlTrace.States.ActionActivation_pinActivations_Value;
import umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value;
import umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value;
import umlTrace.States.ActivityEdgeInstance_offers_Value;
import umlTrace.States.ActivityEdgeInstance_source_Value;
import umlTrace.States.ActivityEdgeInstance_target_Value;
import umlTrace.States.ActivityExecution_activationGroup_Value;
import umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value;
import umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value;
import umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value;
import umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value;
import umlTrace.States.ActivityNodeActivation_heldTokens_Value;
import umlTrace.States.ActivityNodeActivation_incomingEdges_Value;
import umlTrace.States.ActivityNodeActivation_isRunning_Value;
import umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value;
import umlTrace.States.ActivityNodeActivation_outgoingEdges_Value;
import umlTrace.States.ActivityNodeActivation_running_Value;
import umlTrace.States.BooleanValue_value_BooleanValue_Value;
import umlTrace.States.CallActionActivation_callExecutions_Value;
import umlTrace.States.CompoundValue_featureValues_Value;
import umlTrace.States.ElementConfiguration_semanticVisitor_Value;
import umlTrace.States.Evaluation_locus_Evaluation_Value;
import umlTrace.States.Evaluation_specification_Evaluation_Value;
import umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value;
import umlTrace.States.ExecutionFactory_builtInTypes_Value;
import umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value;
import umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value;
import umlTrace.States.Execution_context_Value;
import umlTrace.States.Execution_parameterValues_Value;
import umlTrace.States.Executor_locus_Executor_Value;
import umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value;
import umlTrace.States.FeatureValue_feature_Value;
import umlTrace.States.FeatureValue_position_Value;
import umlTrace.States.FeatureValue_values_FeatureValue_Value;
import umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value;
import umlTrace.States.ForkedToken_baseToken_Value;
import umlTrace.States.ForkedToken_remainingOffersCount_Value;
import umlTrace.States.InputParameterValues_name_Value;
import umlTrace.States.InputParameterValues_parameterValues_Value;
import umlTrace.States.IntegerValue_value_IntegerValue_Value;
import umlTrace.States.Locus_executor_Value;
import umlTrace.States.Locus_extensionalValues_Value;
import umlTrace.States.Locus_factory_Value;
import umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value;
import umlTrace.States.ObjectToken_value_Value;
import umlTrace.States.Object_types_Value;
import umlTrace.States.Offer_offeredTokens_Value;
import umlTrace.States.ParameterValue_parameter_ParameterValue_Value;
import umlTrace.States.ParameterValue_values_ParameterValue_Value;
import umlTrace.States.PinActivation_actionActivation_Value;
import umlTrace.States.PinActivation_count_temp_Value;
import umlTrace.States.PrimitiveValue_type_Value;
import umlTrace.States.Reference_referent_Value;
import umlTrace.States.SemanticVisitor_runtimeModelElement_Value;
import umlTrace.States.State;
import umlTrace.States.StatesFactory;
import umlTrace.States.StatesPackage;
import umlTrace.States.Token_holder_Value;
import umlTrace.States.Value;

import umlTrace.States.ecore.EcorePackage;

import umlTrace.States.ecore.impl.EcorePackageImpl;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

import umlTrace.States.fumlConfiguration.Input.InputPackage;

import umlTrace.States.fumlConfiguration.Input.impl.InputPackageImpl;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;

import umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl;

import umlTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl;

import umlTrace.States.uml.UmlPackage;

import umlTrace.States.uml.impl.UmlPackageImpl;

import umlTrace.Steps.StepsPackage;

import umlTrace.Steps.impl.StepsPackageImpl;

import umlTrace.UmlTracePackage;

import umlTrace.impl.UmlTracePackageImpl;

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
	 * @see umlTrace.States.StatesPackage#eNS_URI
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
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UmlTracePackageImpl theUmlTracePackage = (UmlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) instanceof UmlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) : UmlTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		FumlConfigurationPackageImpl theFumlConfigurationPackage_1 = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) : umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theUmlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theFumlConfigurationPackage_1.createPackageContents();
		theLociPackage.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theBasicBehaviorsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theInputPackage.createPackageContents();
		theUmlPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theUmlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theFumlConfigurationPackage_1.initializePackageContents();
		theLociPackage.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theBasicBehaviorsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theInputPackage.initializePackageContents();
		theUmlPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

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
		return actionActivation_firing_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionActivation_firing_Value_Firing() {
		return (EAttribute)actionActivation_firing_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_firing_Value_Parent() {
		return (EReference)actionActivation_firing_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_firing_Value_States() {
		return (EReference)actionActivation_firing_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation_firing_Value__GetStatesNoOpposite() {
		return actionActivation_firing_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionActivation_pinActivations_Value() {
		return actionActivation_pinActivations_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_pinActivations_Value_Parent() {
		return (EReference)actionActivation_pinActivations_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_pinActivations_Value_PinActivations() {
		return (EReference)actionActivation_pinActivations_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionActivation_pinActivations_Value_States() {
		return (EReference)actionActivation_pinActivations_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionActivation_pinActivations_Value__GetStatesNoOpposite() {
		return actionActivation_pinActivations_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_edge_ActivityEdgeInstance_Value() {
		return activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Edge_ActivityEdgeInstance() {
		return (EReference)activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Parent() {
		return (EReference)activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_States() {
		return (EReference)activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_edge_ActivityEdgeInstance_Value__GetStatesNoOpposite() {
		return activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_group_ActivityEdgeInstance_Value() {
		return activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Group_ActivityEdgeInstance() {
		return (EReference)activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Parent() {
		return (EReference)activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_group_ActivityEdgeInstance_Value_States() {
		return (EReference)activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_group_ActivityEdgeInstance_Value__GetStatesNoOpposite() {
		return activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_offers_Value() {
		return activityEdgeInstance_offers_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_offers_Value_Offers() {
		return (EReference)activityEdgeInstance_offers_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_offers_Value_Parent() {
		return (EReference)activityEdgeInstance_offers_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_offers_Value_States() {
		return (EReference)activityEdgeInstance_offers_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_offers_Value__GetStatesNoOpposite() {
		return activityEdgeInstance_offers_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_source_Value() {
		return activityEdgeInstance_source_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_source_Value_Parent() {
		return (EReference)activityEdgeInstance_source_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_source_Value_Source() {
		return (EReference)activityEdgeInstance_source_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_source_Value_States() {
		return (EReference)activityEdgeInstance_source_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_source_Value__GetStatesNoOpposite() {
		return activityEdgeInstance_source_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeInstance_target_Value() {
		return activityEdgeInstance_target_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_target_Value_Parent() {
		return (EReference)activityEdgeInstance_target_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_target_Value_States() {
		return (EReference)activityEdgeInstance_target_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeInstance_target_Value_Target() {
		return (EReference)activityEdgeInstance_target_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdgeInstance_target_Value__GetStatesNoOpposite() {
		return activityEdgeInstance_target_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExecution_activationGroup_Value() {
		return activityExecution_activationGroup_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_activationGroup_Value_ActivationGroup() {
		return (EReference)activityExecution_activationGroup_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_activationGroup_Value_Parent() {
		return (EReference)activityExecution_activationGroup_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_activationGroup_Value_States() {
		return (EReference)activityExecution_activationGroup_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityExecution_activationGroup_Value__GetStatesNoOpposite() {
		return activityExecution_activationGroup_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivationGroup_activityExecution_Value() {
		return activityNodeActivationGroup_activityExecution_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_activityExecution_Value_ActivityExecution() {
		return (EReference)activityNodeActivationGroup_activityExecution_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_activityExecution_Value_Parent() {
		return (EReference)activityNodeActivationGroup_activityExecution_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_activityExecution_Value_States() {
		return (EReference)activityNodeActivationGroup_activityExecution_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivationGroup_activityExecution_Value__GetStatesNoOpposite() {
		return activityNodeActivationGroup_activityExecution_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivationGroup_edgeInstances_Value() {
		return activityNodeActivationGroup_edgeInstances_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_edgeInstances_Value_EdgeInstances() {
		return (EReference)activityNodeActivationGroup_edgeInstances_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_edgeInstances_Value_Parent() {
		return (EReference)activityNodeActivationGroup_edgeInstances_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_edgeInstances_Value_States() {
		return (EReference)activityNodeActivationGroup_edgeInstances_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivationGroup_edgeInstances_Value__GetStatesNoOpposite() {
		return activityNodeActivationGroup_edgeInstances_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivationGroup_nodeActivations_Value() {
		return activityNodeActivationGroup_nodeActivations_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_nodeActivations_Value_NodeActivations() {
		return (EReference)activityNodeActivationGroup_nodeActivations_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_nodeActivations_Value_Parent() {
		return (EReference)activityNodeActivationGroup_nodeActivations_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivationGroup_nodeActivations_Value_States() {
		return (EReference)activityNodeActivationGroup_nodeActivations_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivationGroup_nodeActivations_Value__GetStatesNoOpposite() {
		return activityNodeActivationGroup_nodeActivations_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_group_ActivityNodeActivation_Value() {
		return activityNodeActivation_group_ActivityNodeActivation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_Group_ActivityNodeActivation() {
		return (EReference)activityNodeActivation_group_ActivityNodeActivation_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_Parent() {
		return (EReference)activityNodeActivation_group_ActivityNodeActivation_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_group_ActivityNodeActivation_Value_States() {
		return (EReference)activityNodeActivation_group_ActivityNodeActivation_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_group_ActivityNodeActivation_Value__GetStatesNoOpposite() {
		return activityNodeActivation_group_ActivityNodeActivation_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_heldTokens_Value() {
		return activityNodeActivation_heldTokens_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_heldTokens_Value_HeldTokens() {
		return (EReference)activityNodeActivation_heldTokens_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_heldTokens_Value_Parent() {
		return (EReference)activityNodeActivation_heldTokens_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_heldTokens_Value_States() {
		return (EReference)activityNodeActivation_heldTokens_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_heldTokens_Value__GetStatesNoOpposite() {
		return activityNodeActivation_heldTokens_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_incomingEdges_Value() {
		return activityNodeActivation_incomingEdges_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_incomingEdges_Value_IncomingEdges() {
		return (EReference)activityNodeActivation_incomingEdges_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_incomingEdges_Value_Parent() {
		return (EReference)activityNodeActivation_incomingEdges_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_incomingEdges_Value_States() {
		return (EReference)activityNodeActivation_incomingEdges_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_incomingEdges_Value__GetStatesNoOpposite() {
		return activityNodeActivation_incomingEdges_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_isRunning_Value() {
		return activityNodeActivation_isRunning_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNodeActivation_isRunning_Value_IsRunning() {
		return (EAttribute)activityNodeActivation_isRunning_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_isRunning_Value_Parent() {
		return (EReference)activityNodeActivation_isRunning_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_isRunning_Value_States() {
		return (EReference)activityNodeActivation_isRunning_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_isRunning_Value__GetStatesNoOpposite() {
		return activityNodeActivation_isRunning_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_node_ActivityNodeActivation_Value() {
		return activityNodeActivation_node_ActivityNodeActivation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_Node_ActivityNodeActivation() {
		return (EReference)activityNodeActivation_node_ActivityNodeActivation_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_Parent() {
		return (EReference)activityNodeActivation_node_ActivityNodeActivation_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_node_ActivityNodeActivation_Value_States() {
		return (EReference)activityNodeActivation_node_ActivityNodeActivation_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_node_ActivityNodeActivation_Value__GetStatesNoOpposite() {
		return activityNodeActivation_node_ActivityNodeActivation_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_outgoingEdges_Value() {
		return activityNodeActivation_outgoingEdges_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_outgoingEdges_Value_OutgoingEdges() {
		return (EReference)activityNodeActivation_outgoingEdges_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_outgoingEdges_Value_Parent() {
		return (EReference)activityNodeActivation_outgoingEdges_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_outgoingEdges_Value_States() {
		return (EReference)activityNodeActivation_outgoingEdges_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_outgoingEdges_Value__GetStatesNoOpposite() {
		return activityNodeActivation_outgoingEdges_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivation_running_Value() {
		return activityNodeActivation_running_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_running_Value_Parent() {
		return (EReference)activityNodeActivation_running_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNodeActivation_running_Value_Running() {
		return (EAttribute)activityNodeActivation_running_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeActivation_running_Value_States() {
		return (EReference)activityNodeActivation_running_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNodeActivation_running_Value__GetStatesNoOpposite() {
		return activityNodeActivation_running_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue_value_BooleanValue_Value() {
		return booleanValue_value_BooleanValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_BooleanValue_Value_Parent() {
		return (EReference)booleanValue_value_BooleanValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_BooleanValue_Value_States() {
		return (EReference)booleanValue_value_BooleanValue_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_value_BooleanValue_Value_Value_BooleanValue() {
		return (EAttribute)booleanValue_value_BooleanValue_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooleanValue_value_BooleanValue_Value__GetStatesNoOpposite() {
		return booleanValue_value_BooleanValue_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallActionActivation_callExecutions_Value() {
		return callActionActivation_callExecutions_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActionActivation_callExecutions_Value_CallExecutions() {
		return (EReference)callActionActivation_callExecutions_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActionActivation_callExecutions_Value_Parent() {
		return (EReference)callActionActivation_callExecutions_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActionActivation_callExecutions_Value_States() {
		return (EReference)callActionActivation_callExecutions_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallActionActivation_callExecutions_Value__GetStatesNoOpposite() {
		return callActionActivation_callExecutions_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundValue_featureValues_Value() {
		return compoundValue_featureValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundValue_featureValues_Value_FeatureValues() {
		return (EReference)compoundValue_featureValues_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundValue_featureValues_Value_Parent() {
		return (EReference)compoundValue_featureValues_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundValue_featureValues_Value_States() {
		return (EReference)compoundValue_featureValues_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompoundValue_featureValues_Value__GetStatesNoOpposite() {
		return compoundValue_featureValues_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementConfiguration_semanticVisitor_Value() {
		return elementConfiguration_semanticVisitor_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementConfiguration_semanticVisitor_Value_Parent() {
		return (EReference)elementConfiguration_semanticVisitor_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementConfiguration_semanticVisitor_Value_SemanticVisitor() {
		return (EReference)elementConfiguration_semanticVisitor_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementConfiguration_semanticVisitor_Value_States() {
		return (EReference)elementConfiguration_semanticVisitor_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementConfiguration_semanticVisitor_Value__GetStatesNoOpposite() {
		return elementConfiguration_semanticVisitor_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation_locus_Evaluation_Value() {
		return evaluation_locus_Evaluation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_locus_Evaluation_Value_Locus_Evaluation() {
		return (EReference)evaluation_locus_Evaluation_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_locus_Evaluation_Value_Parent() {
		return (EReference)evaluation_locus_Evaluation_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_locus_Evaluation_Value_States() {
		return (EReference)evaluation_locus_Evaluation_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEvaluation_locus_Evaluation_Value__GetStatesNoOpposite() {
		return evaluation_locus_Evaluation_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation_specification_Evaluation_Value() {
		return evaluation_specification_Evaluation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_specification_Evaluation_Value_Parent() {
		return (EReference)evaluation_specification_Evaluation_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_specification_Evaluation_Value_Specification_Evaluation() {
		return (EReference)evaluation_specification_Evaluation_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_specification_Evaluation_Value_States() {
		return (EReference)evaluation_specification_Evaluation_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEvaluation_specification_Evaluation_Value__GetStatesNoOpposite() {
		return evaluation_specification_Evaluation_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironment_locus_ExecutionEnvironment_Value() {
		return executionEnvironment_locus_ExecutionEnvironment_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_Locus_ExecutionEnvironment() {
		return (EReference)executionEnvironment_locus_ExecutionEnvironment_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_Parent() {
		return (EReference)executionEnvironment_locus_ExecutionEnvironment_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionEnvironment_locus_ExecutionEnvironment_Value_States() {
		return (EReference)executionEnvironment_locus_ExecutionEnvironment_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionEnvironment_locus_ExecutionEnvironment_Value__GetStatesNoOpposite() {
		return executionEnvironment_locus_ExecutionEnvironment_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFactory_builtInTypes_Value() {
		return executionFactory_builtInTypes_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_builtInTypes_Value_BuiltInTypes() {
		return (EReference)executionFactory_builtInTypes_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_builtInTypes_Value_Parent() {
		return (EReference)executionFactory_builtInTypes_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_builtInTypes_Value_States() {
		return (EReference)executionFactory_builtInTypes_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionFactory_builtInTypes_Value__GetStatesNoOpposite() {
		return executionFactory_builtInTypes_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFactory_locus_ExecutionFactory_Value() {
		return executionFactory_locus_ExecutionFactory_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_locus_ExecutionFactory_Value_Locus_ExecutionFactory() {
		return (EReference)executionFactory_locus_ExecutionFactory_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_locus_ExecutionFactory_Value_Parent() {
		return (EReference)executionFactory_locus_ExecutionFactory_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_locus_ExecutionFactory_Value_States() {
		return (EReference)executionFactory_locus_ExecutionFactory_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionFactory_locus_ExecutionFactory_Value__GetStatesNoOpposite() {
		return executionFactory_locus_ExecutionFactory_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFactory_primitiveBehaviorPrototypes_Value() {
		return executionFactory_primitiveBehaviorPrototypes_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_Parent() {
		return (EReference)executionFactory_primitiveBehaviorPrototypes_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_PrimitiveBehaviorPrototypes() {
		return (EReference)executionFactory_primitiveBehaviorPrototypes_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFactory_primitiveBehaviorPrototypes_Value_States() {
		return (EReference)executionFactory_primitiveBehaviorPrototypes_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionFactory_primitiveBehaviorPrototypes_Value__GetStatesNoOpposite() {
		return executionFactory_primitiveBehaviorPrototypes_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution_context_Value() {
		return execution_context_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_context_Value_Context() {
		return (EReference)execution_context_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_context_Value_Parent() {
		return (EReference)execution_context_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_context_Value_States() {
		return (EReference)execution_context_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution_context_Value__GetStatesNoOpposite() {
		return execution_context_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution_parameterValues_Value() {
		return execution_parameterValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_parameterValues_Value_ParameterValues() {
		return (EReference)execution_parameterValues_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_parameterValues_Value_Parent() {
		return (EReference)execution_parameterValues_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_parameterValues_Value_States() {
		return (EReference)execution_parameterValues_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution_parameterValues_Value__GetStatesNoOpposite() {
		return execution_parameterValues_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutor_locus_Executor_Value() {
		return executor_locus_Executor_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_locus_Executor_Value_Locus_Executor() {
		return (EReference)executor_locus_Executor_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_locus_Executor_Value_Parent() {
		return (EReference)executor_locus_Executor_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_locus_Executor_Value_States() {
		return (EReference)executor_locus_Executor_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutor_locus_Executor_Value__GetStatesNoOpposite() {
		return executor_locus_Executor_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionalValue_locus_ExtensionalValue_Value() {
		return extensionalValue_locus_ExtensionalValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionalValue_locus_ExtensionalValue_Value_Locus_ExtensionalValue() {
		return (EReference)extensionalValue_locus_ExtensionalValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionalValue_locus_ExtensionalValue_Value_Parent() {
		return (EReference)extensionalValue_locus_ExtensionalValue_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionalValue_locus_ExtensionalValue_Value_States() {
		return (EReference)extensionalValue_locus_ExtensionalValue_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtensionalValue_locus_ExtensionalValue_Value__GetStatesNoOpposite() {
		return extensionalValue_locus_ExtensionalValue_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValue_feature_Value() {
		return featureValue_feature_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_feature_Value_Feature() {
		return (EReference)featureValue_feature_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_feature_Value_Parent() {
		return (EReference)featureValue_feature_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_feature_Value_States() {
		return (EReference)featureValue_feature_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValue_feature_Value__GetStatesNoOpposite() {
		return featureValue_feature_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValue_position_Value() {
		return featureValue_position_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_position_Value_Parent() {
		return (EReference)featureValue_position_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureValue_position_Value_Position() {
		return (EAttribute)featureValue_position_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_position_Value_States() {
		return (EReference)featureValue_position_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValue_position_Value__GetStatesNoOpposite() {
		return featureValue_position_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValue_values_FeatureValue_Value() {
		return featureValue_values_FeatureValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_values_FeatureValue_Value_Parent() {
		return (EReference)featureValue_values_FeatureValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_values_FeatureValue_Value_States() {
		return (EReference)featureValue_values_FeatureValue_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_values_FeatureValue_Value_Values_FeatureValue() {
		return (EReference)featureValue_values_FeatureValue_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValue_values_FeatureValue_Value__GetStatesNoOpposite() {
		return featureValue_values_FeatureValue_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_baseTokenIsWithdrawn_Value() {
		return forkedToken_baseTokenIsWithdrawn_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_baseTokenIsWithdrawn_Value_BaseTokenIsWithdrawn() {
		return (EAttribute)forkedToken_baseTokenIsWithdrawn_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseTokenIsWithdrawn_Value_Parent() {
		return (EReference)forkedToken_baseTokenIsWithdrawn_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseTokenIsWithdrawn_Value_States() {
		return (EReference)forkedToken_baseTokenIsWithdrawn_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForkedToken_baseTokenIsWithdrawn_Value__GetStatesNoOpposite() {
		return forkedToken_baseTokenIsWithdrawn_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_baseToken_Value() {
		return forkedToken_baseToken_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_BaseToken() {
		return (EReference)forkedToken_baseToken_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_Parent() {
		return (EReference)forkedToken_baseToken_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_States() {
		return (EReference)forkedToken_baseToken_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForkedToken_baseToken_Value__GetStatesNoOpposite() {
		return forkedToken_baseToken_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_remainingOffersCount_Value() {
		return forkedToken_remainingOffersCount_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_remainingOffersCount_Value_Parent() {
		return (EReference)forkedToken_remainingOffersCount_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_remainingOffersCount_Value_RemainingOffersCount() {
		return (EAttribute)forkedToken_remainingOffersCount_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_remainingOffersCount_Value_States() {
		return (EReference)forkedToken_remainingOffersCount_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForkedToken_remainingOffersCount_Value__GetStatesNoOpposite() {
		return forkedToken_remainingOffersCount_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameterValues_name_Value() {
		return inputParameterValues_name_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputParameterValues_name_Value_Name() {
		return (EAttribute)inputParameterValues_name_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_name_Value_Parent() {
		return (EReference)inputParameterValues_name_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_name_Value_States() {
		return (EReference)inputParameterValues_name_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputParameterValues_name_Value__GetStatesNoOpposite() {
		return inputParameterValues_name_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameterValues_parameterValues_Value() {
		return inputParameterValues_parameterValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_parameterValues_Value_ParameterValues() {
		return (EReference)inputParameterValues_parameterValues_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_parameterValues_Value_Parent() {
		return (EReference)inputParameterValues_parameterValues_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameterValues_parameterValues_Value_States() {
		return (EReference)inputParameterValues_parameterValues_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputParameterValues_parameterValues_Value__GetStatesNoOpposite() {
		return inputParameterValues_parameterValues_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue_value_IntegerValue_Value() {
		return integerValue_value_IntegerValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValue_value_IntegerValue_Value_Parent() {
		return (EReference)integerValue_value_IntegerValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValue_value_IntegerValue_Value_States() {
		return (EReference)integerValue_value_IntegerValue_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_value_IntegerValue_Value_Value_IntegerValue() {
		return (EAttribute)integerValue_value_IntegerValue_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerValue_value_IntegerValue_Value__GetStatesNoOpposite() {
		return integerValue_value_IntegerValue_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocus_executor_Value() {
		return locus_executor_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_executor_Value_Executor() {
		return (EReference)locus_executor_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_executor_Value_Parent() {
		return (EReference)locus_executor_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_executor_Value_States() {
		return (EReference)locus_executor_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocus_executor_Value__GetStatesNoOpposite() {
		return locus_executor_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocus_extensionalValues_Value() {
		return locus_extensionalValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_extensionalValues_Value_ExtensionalValues() {
		return (EReference)locus_extensionalValues_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_extensionalValues_Value_Parent() {
		return (EReference)locus_extensionalValues_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_extensionalValues_Value_States() {
		return (EReference)locus_extensionalValues_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocus_extensionalValues_Value__GetStatesNoOpposite() {
		return locus_extensionalValues_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocus_factory_Value() {
		return locus_factory_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_factory_Value_Factory() {
		return (EReference)locus_factory_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_factory_Value_Parent() {
		return (EReference)locus_factory_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocus_factory_Value_States() {
		return (EReference)locus_factory_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocus_factory_Value__GetStatesNoOpposite() {
		return locus_factory_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNodeActivation_offeredTokenCount_Value() {
		return objectNodeActivation_offeredTokenCount_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNodeActivation_offeredTokenCount_Value_OfferedTokenCount() {
		return (EAttribute)objectNodeActivation_offeredTokenCount_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNodeActivation_offeredTokenCount_Value_Parent() {
		return (EReference)objectNodeActivation_offeredTokenCount_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNodeActivation_offeredTokenCount_Value_States() {
		return (EReference)objectNodeActivation_offeredTokenCount_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectNodeActivation_offeredTokenCount_Value__GetStatesNoOpposite() {
		return objectNodeActivation_offeredTokenCount_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectToken_value_Value() {
		return objectToken_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectToken_value_Value_Parent() {
		return (EReference)objectToken_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectToken_value_Value_States() {
		return (EReference)objectToken_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectToken_value_Value_Value() {
		return (EReference)objectToken_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectToken_value_Value__GetStatesNoOpposite() {
		return objectToken_value_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_types_Value() {
		return object_types_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_types_Value_Parent() {
		return (EReference)object_types_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_types_Value_States() {
		return (EReference)object_types_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_types_Value_Types() {
		return (EReference)object_types_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_types_Value__GetStatesNoOpposite() {
		return object_types_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffer_offeredTokens_Value() {
		return offer_offeredTokens_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_OfferedTokens() {
		return (EReference)offer_offeredTokens_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_Parent() {
		return (EReference)offer_offeredTokens_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_States() {
		return (EReference)offer_offeredTokens_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOffer_offeredTokens_Value__GetStatesNoOpposite() {
		return offer_offeredTokens_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue_parameter_ParameterValue_Value() {
		return parameterValue_parameter_ParameterValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_parameter_ParameterValue_Value_Parameter_ParameterValue() {
		return (EReference)parameterValue_parameter_ParameterValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_parameter_ParameterValue_Value_Parent() {
		return (EReference)parameterValue_parameter_ParameterValue_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_parameter_ParameterValue_Value_States() {
		return (EReference)parameterValue_parameter_ParameterValue_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterValue_parameter_ParameterValue_Value__GetStatesNoOpposite() {
		return parameterValue_parameter_ParameterValue_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue_values_ParameterValue_Value() {
		return parameterValue_values_ParameterValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_values_ParameterValue_Value_Parent() {
		return (EReference)parameterValue_values_ParameterValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_values_ParameterValue_Value_States() {
		return (EReference)parameterValue_values_ParameterValue_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_values_ParameterValue_Value_Values_ParameterValue() {
		return (EReference)parameterValue_values_ParameterValue_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterValue_values_ParameterValue_Value__GetStatesNoOpposite() {
		return parameterValue_values_ParameterValue_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinActivation_actionActivation_Value() {
		return pinActivation_actionActivation_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_actionActivation_Value_ActionActivation() {
		return (EReference)pinActivation_actionActivation_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_actionActivation_Value_Parent() {
		return (EReference)pinActivation_actionActivation_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_actionActivation_Value_States() {
		return (EReference)pinActivation_actionActivation_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPinActivation_actionActivation_Value__GetStatesNoOpposite() {
		return pinActivation_actionActivation_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinActivation_count_temp_Value() {
		return pinActivation_count_temp_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPinActivation_count_temp_Value_Count_temp() {
		return (EAttribute)pinActivation_count_temp_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_count_temp_Value_Parent() {
		return (EReference)pinActivation_count_temp_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinActivation_count_temp_Value_States() {
		return (EReference)pinActivation_count_temp_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPinActivation_count_temp_Value__GetStatesNoOpposite() {
		return pinActivation_count_temp_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveValue_type_Value() {
		return primitiveValue_type_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveValue_type_Value_Parent() {
		return (EReference)primitiveValue_type_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveValue_type_Value_States() {
		return (EReference)primitiveValue_type_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveValue_type_Value_Type() {
		return (EReference)primitiveValue_type_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveValue_type_Value__GetStatesNoOpposite() {
		return primitiveValue_type_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference_referent_Value() {
		return reference_referent_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_referent_Value_Parent() {
		return (EReference)reference_referent_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_referent_Value_Referent() {
		return (EReference)reference_referent_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_referent_Value_States() {
		return (EReference)reference_referent_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReference_referent_Value__GetStatesNoOpposite() {
		return reference_referent_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticVisitor_runtimeModelElement_Value() {
		return semanticVisitor_runtimeModelElement_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_Parent() {
		return (EReference)semanticVisitor_runtimeModelElement_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement() {
		return (EReference)semanticVisitor_runtimeModelElement_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticVisitor_runtimeModelElement_Value_States() {
		return (EReference)semanticVisitor_runtimeModelElement_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite() {
		return semanticVisitor_runtimeModelElement_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActionActivation_firing_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActionActivation_pinActivations_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_edge_ActivityEdgeInstance_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_group_ActivityEdgeInstance_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_offers_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_source_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdgeInstance_target_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityExecution_activationGroup_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivationGroup_activityExecution_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivationGroup_edgeInstances_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivationGroup_nodeActivations_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_group_ActivityNodeActivation_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_heldTokens_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_incomingEdges_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_isRunning_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_node_ActivityNodeActivation_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_outgoingEdges_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNodeActivation_running_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanValue_value_BooleanValue_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_CallActionActivation_callExecutions_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_CompoundValue_featureValues_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ElementConfiguration_semanticVisitor_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Evaluation_locus_Evaluation_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Evaluation_specification_Evaluation_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExecutionEnvironment_locus_ExecutionEnvironment_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExecutionFactory_builtInTypes_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExecutionFactory_locus_ExecutionFactory_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExecutionFactory_primitiveBehaviorPrototypes_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Execution_context_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Execution_parameterValues_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Executor_locus_Executor_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ExtensionalValue_locus_ExtensionalValue_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FeatureValue_feature_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FeatureValue_position_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FeatureValue_values_FeatureValue_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ForkedToken_baseTokenIsWithdrawn_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ForkedToken_baseToken_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ForkedToken_remainingOffersCount_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InputParameterValues_name_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InputParameterValues_parameterValues_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerValue_value_IntegerValue_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Locus_executor_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Locus_extensionalValues_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Locus_factory_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ObjectNodeActivation_offeredTokenCount_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ObjectToken_value_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Object_types_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Offer_offeredTokens_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ParameterValue_parameter_ParameterValue_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ParameterValue_values_ParameterValue_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_PinActivation_actionActivation_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_PinActivation_count_temp_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_PrimitiveValue_type_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Reference_referent_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_SemanticVisitor_runtimeModelElement_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Token_holder_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken_holder_Value() {
		return token_holder_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_Holder() {
		return (EReference)token_holder_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_Parent() {
		return (EReference)token_holder_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_States() {
		return (EReference)token_holder_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken_holder_Value__GetStatesNoOpposite() {
		return token_holder_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_StatesNoOpposite() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
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
		actionActivation_firing_ValueEClass = createEClass(ACTION_ACTIVATION_FIRING_VALUE);
		createEAttribute(actionActivation_firing_ValueEClass, ACTION_ACTIVATION_FIRING_VALUE__FIRING);
		createEReference(actionActivation_firing_ValueEClass, ACTION_ACTIVATION_FIRING_VALUE__PARENT);
		createEReference(actionActivation_firing_ValueEClass, ACTION_ACTIVATION_FIRING_VALUE__STATES);
		createEOperation(actionActivation_firing_ValueEClass, ACTION_ACTIVATION_FIRING_VALUE___GET_STATES_NO_OPPOSITE);

		actionActivation_pinActivations_ValueEClass = createEClass(ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE);
		createEReference(actionActivation_pinActivations_ValueEClass, ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT);
		createEReference(actionActivation_pinActivations_ValueEClass, ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PIN_ACTIVATIONS);
		createEReference(actionActivation_pinActivations_ValueEClass, ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__STATES);
		createEOperation(actionActivation_pinActivations_ValueEClass, ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE___GET_STATES_NO_OPPOSITE);

		activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass = createEClass(ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE);
		createEReference(activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass, ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__EDGE_ACTIVITY_EDGE_INSTANCE);
		createEReference(activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass, ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT);
		createEReference(activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass, ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__STATES);
		createEOperation(activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass, ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE___GET_STATES_NO_OPPOSITE);

		activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass = createEClass(ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE);
		createEReference(activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass, ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE);
		createEReference(activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass, ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT);
		createEReference(activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass, ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES);
		createEOperation(activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass, ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE___GET_STATES_NO_OPPOSITE);

		activityEdgeInstance_offers_ValueEClass = createEClass(ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE);
		createEReference(activityEdgeInstance_offers_ValueEClass, ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__OFFERS);
		createEReference(activityEdgeInstance_offers_ValueEClass, ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__PARENT);
		createEReference(activityEdgeInstance_offers_ValueEClass, ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__STATES);
		createEOperation(activityEdgeInstance_offers_ValueEClass, ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE___GET_STATES_NO_OPPOSITE);

		activityEdgeInstance_source_ValueEClass = createEClass(ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE);
		createEReference(activityEdgeInstance_source_ValueEClass, ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__PARENT);
		createEReference(activityEdgeInstance_source_ValueEClass, ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__SOURCE);
		createEReference(activityEdgeInstance_source_ValueEClass, ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__STATES);
		createEOperation(activityEdgeInstance_source_ValueEClass, ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE___GET_STATES_NO_OPPOSITE);

		activityEdgeInstance_target_ValueEClass = createEClass(ACTIVITY_EDGE_INSTANCE_TARGET_VALUE);
		createEReference(activityEdgeInstance_target_ValueEClass, ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__PARENT);
		createEReference(activityEdgeInstance_target_ValueEClass, ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__STATES);
		createEReference(activityEdgeInstance_target_ValueEClass, ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__TARGET);
		createEOperation(activityEdgeInstance_target_ValueEClass, ACTIVITY_EDGE_INSTANCE_TARGET_VALUE___GET_STATES_NO_OPPOSITE);

		activityExecution_activationGroup_ValueEClass = createEClass(ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE);
		createEReference(activityExecution_activationGroup_ValueEClass, ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__ACTIVATION_GROUP);
		createEReference(activityExecution_activationGroup_ValueEClass, ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__PARENT);
		createEReference(activityExecution_activationGroup_ValueEClass, ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__STATES);
		createEOperation(activityExecution_activationGroup_ValueEClass, ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivationGroup_activityExecution_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE);
		createEReference(activityNodeActivationGroup_activityExecution_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__ACTIVITY_EXECUTION);
		createEReference(activityNodeActivationGroup_activityExecution_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__PARENT);
		createEReference(activityNodeActivationGroup_activityExecution_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__STATES);
		createEOperation(activityNodeActivationGroup_activityExecution_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivationGroup_edgeInstances_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE);
		createEReference(activityNodeActivationGroup_edgeInstances_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__EDGE_INSTANCES);
		createEReference(activityNodeActivationGroup_edgeInstances_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT);
		createEReference(activityNodeActivationGroup_edgeInstances_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES);
		createEOperation(activityNodeActivationGroup_edgeInstances_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivationGroup_nodeActivations_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE);
		createEReference(activityNodeActivationGroup_nodeActivations_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__NODE_ACTIVATIONS);
		createEReference(activityNodeActivationGroup_nodeActivations_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__PARENT);
		createEReference(activityNodeActivationGroup_nodeActivations_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__STATES);
		createEOperation(activityNodeActivationGroup_nodeActivations_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivation_group_ActivityNodeActivation_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE);
		createEReference(activityNodeActivation_group_ActivityNodeActivation_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__GROUP_ACTIVITY_NODE_ACTIVATION);
		createEReference(activityNodeActivation_group_ActivityNodeActivation_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__PARENT);
		createEReference(activityNodeActivation_group_ActivityNodeActivation_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__STATES);
		createEOperation(activityNodeActivation_group_ActivityNodeActivation_ValueEClass, ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivation_heldTokens_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE);
		createEReference(activityNodeActivation_heldTokens_ValueEClass, ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__HELD_TOKENS);
		createEReference(activityNodeActivation_heldTokens_ValueEClass, ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__PARENT);
		createEReference(activityNodeActivation_heldTokens_ValueEClass, ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__STATES);
		createEOperation(activityNodeActivation_heldTokens_ValueEClass, ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivation_incomingEdges_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE);
		createEReference(activityNodeActivation_incomingEdges_ValueEClass, ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__INCOMING_EDGES);
		createEReference(activityNodeActivation_incomingEdges_ValueEClass, ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__PARENT);
		createEReference(activityNodeActivation_incomingEdges_ValueEClass, ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__STATES);
		createEOperation(activityNodeActivation_incomingEdges_ValueEClass, ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivation_isRunning_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE);
		createEAttribute(activityNodeActivation_isRunning_ValueEClass, ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__IS_RUNNING);
		createEReference(activityNodeActivation_isRunning_ValueEClass, ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__PARENT);
		createEReference(activityNodeActivation_isRunning_ValueEClass, ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__STATES);
		createEOperation(activityNodeActivation_isRunning_ValueEClass, ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivation_node_ActivityNodeActivation_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE);
		createEReference(activityNodeActivation_node_ActivityNodeActivation_ValueEClass, ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__NODE_ACTIVITY_NODE_ACTIVATION);
		createEReference(activityNodeActivation_node_ActivityNodeActivation_ValueEClass, ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__PARENT);
		createEReference(activityNodeActivation_node_ActivityNodeActivation_ValueEClass, ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__STATES);
		createEOperation(activityNodeActivation_node_ActivityNodeActivation_ValueEClass, ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivation_outgoingEdges_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE);
		createEReference(activityNodeActivation_outgoingEdges_ValueEClass, ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__OUTGOING_EDGES);
		createEReference(activityNodeActivation_outgoingEdges_ValueEClass, ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT);
		createEReference(activityNodeActivation_outgoingEdges_ValueEClass, ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES);
		createEOperation(activityNodeActivation_outgoingEdges_ValueEClass, ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE___GET_STATES_NO_OPPOSITE);

		activityNodeActivation_running_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE);
		createEReference(activityNodeActivation_running_ValueEClass, ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__PARENT);
		createEAttribute(activityNodeActivation_running_ValueEClass, ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__RUNNING);
		createEReference(activityNodeActivation_running_ValueEClass, ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__STATES);
		createEOperation(activityNodeActivation_running_ValueEClass, ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE___GET_STATES_NO_OPPOSITE);

		booleanValue_value_BooleanValue_ValueEClass = createEClass(BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE);
		createEReference(booleanValue_value_BooleanValue_ValueEClass, BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__PARENT);
		createEReference(booleanValue_value_BooleanValue_ValueEClass, BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__STATES);
		createEAttribute(booleanValue_value_BooleanValue_ValueEClass, BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE__VALUE_BOOLEAN_VALUE);
		createEOperation(booleanValue_value_BooleanValue_ValueEClass, BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUE___GET_STATES_NO_OPPOSITE);

		callActionActivation_callExecutions_ValueEClass = createEClass(CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE);
		createEReference(callActionActivation_callExecutions_ValueEClass, CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__CALL_EXECUTIONS);
		createEReference(callActionActivation_callExecutions_ValueEClass, CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT);
		createEReference(callActionActivation_callExecutions_ValueEClass, CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__STATES);
		createEOperation(callActionActivation_callExecutions_ValueEClass, CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE___GET_STATES_NO_OPPOSITE);

		compoundValue_featureValues_ValueEClass = createEClass(COMPOUND_VALUE_FEATURE_VALUES_VALUE);
		createEReference(compoundValue_featureValues_ValueEClass, COMPOUND_VALUE_FEATURE_VALUES_VALUE__FEATURE_VALUES);
		createEReference(compoundValue_featureValues_ValueEClass, COMPOUND_VALUE_FEATURE_VALUES_VALUE__PARENT);
		createEReference(compoundValue_featureValues_ValueEClass, COMPOUND_VALUE_FEATURE_VALUES_VALUE__STATES);
		createEOperation(compoundValue_featureValues_ValueEClass, COMPOUND_VALUE_FEATURE_VALUES_VALUE___GET_STATES_NO_OPPOSITE);

		elementConfiguration_semanticVisitor_ValueEClass = createEClass(ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE);
		createEReference(elementConfiguration_semanticVisitor_ValueEClass, ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT);
		createEReference(elementConfiguration_semanticVisitor_ValueEClass, ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__SEMANTIC_VISITOR);
		createEReference(elementConfiguration_semanticVisitor_ValueEClass, ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES);
		createEOperation(elementConfiguration_semanticVisitor_ValueEClass, ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE___GET_STATES_NO_OPPOSITE);

		evaluation_locus_Evaluation_ValueEClass = createEClass(EVALUATION_LOCUS_EVALUATION_VALUE);
		createEReference(evaluation_locus_Evaluation_ValueEClass, EVALUATION_LOCUS_EVALUATION_VALUE__LOCUS_EVALUATION);
		createEReference(evaluation_locus_Evaluation_ValueEClass, EVALUATION_LOCUS_EVALUATION_VALUE__PARENT);
		createEReference(evaluation_locus_Evaluation_ValueEClass, EVALUATION_LOCUS_EVALUATION_VALUE__STATES);
		createEOperation(evaluation_locus_Evaluation_ValueEClass, EVALUATION_LOCUS_EVALUATION_VALUE___GET_STATES_NO_OPPOSITE);

		evaluation_specification_Evaluation_ValueEClass = createEClass(EVALUATION_SPECIFICATION_EVALUATION_VALUE);
		createEReference(evaluation_specification_Evaluation_ValueEClass, EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT);
		createEReference(evaluation_specification_Evaluation_ValueEClass, EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION);
		createEReference(evaluation_specification_Evaluation_ValueEClass, EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES);
		createEOperation(evaluation_specification_Evaluation_ValueEClass, EVALUATION_SPECIFICATION_EVALUATION_VALUE___GET_STATES_NO_OPPOSITE);

		executionEnvironment_locus_ExecutionEnvironment_ValueEClass = createEClass(EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE);
		createEReference(executionEnvironment_locus_ExecutionEnvironment_ValueEClass, EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__LOCUS_EXECUTION_ENVIRONMENT);
		createEReference(executionEnvironment_locus_ExecutionEnvironment_ValueEClass, EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT);
		createEReference(executionEnvironment_locus_ExecutionEnvironment_ValueEClass, EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__STATES);
		createEOperation(executionEnvironment_locus_ExecutionEnvironment_ValueEClass, EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE___GET_STATES_NO_OPPOSITE);

		executionFactory_builtInTypes_ValueEClass = createEClass(EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE);
		createEReference(executionFactory_builtInTypes_ValueEClass, EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__BUILT_IN_TYPES);
		createEReference(executionFactory_builtInTypes_ValueEClass, EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT);
		createEReference(executionFactory_builtInTypes_ValueEClass, EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES);
		createEOperation(executionFactory_builtInTypes_ValueEClass, EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE___GET_STATES_NO_OPPOSITE);

		executionFactory_locus_ExecutionFactory_ValueEClass = createEClass(EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE);
		createEReference(executionFactory_locus_ExecutionFactory_ValueEClass, EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__LOCUS_EXECUTION_FACTORY);
		createEReference(executionFactory_locus_ExecutionFactory_ValueEClass, EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT);
		createEReference(executionFactory_locus_ExecutionFactory_ValueEClass, EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__STATES);
		createEOperation(executionFactory_locus_ExecutionFactory_ValueEClass, EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE___GET_STATES_NO_OPPOSITE);

		executionFactory_primitiveBehaviorPrototypes_ValueEClass = createEClass(EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE);
		createEReference(executionFactory_primitiveBehaviorPrototypes_ValueEClass, EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__PARENT);
		createEReference(executionFactory_primitiveBehaviorPrototypes_ValueEClass, EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__PRIMITIVE_BEHAVIOR_PROTOTYPES);
		createEReference(executionFactory_primitiveBehaviorPrototypes_ValueEClass, EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__STATES);
		createEOperation(executionFactory_primitiveBehaviorPrototypes_ValueEClass, EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE___GET_STATES_NO_OPPOSITE);

		execution_context_ValueEClass = createEClass(EXECUTION_CONTEXT_VALUE);
		createEReference(execution_context_ValueEClass, EXECUTION_CONTEXT_VALUE__CONTEXT);
		createEReference(execution_context_ValueEClass, EXECUTION_CONTEXT_VALUE__PARENT);
		createEReference(execution_context_ValueEClass, EXECUTION_CONTEXT_VALUE__STATES);
		createEOperation(execution_context_ValueEClass, EXECUTION_CONTEXT_VALUE___GET_STATES_NO_OPPOSITE);

		execution_parameterValues_ValueEClass = createEClass(EXECUTION_PARAMETER_VALUES_VALUE);
		createEReference(execution_parameterValues_ValueEClass, EXECUTION_PARAMETER_VALUES_VALUE__PARAMETER_VALUES);
		createEReference(execution_parameterValues_ValueEClass, EXECUTION_PARAMETER_VALUES_VALUE__PARENT);
		createEReference(execution_parameterValues_ValueEClass, EXECUTION_PARAMETER_VALUES_VALUE__STATES);
		createEOperation(execution_parameterValues_ValueEClass, EXECUTION_PARAMETER_VALUES_VALUE___GET_STATES_NO_OPPOSITE);

		executor_locus_Executor_ValueEClass = createEClass(EXECUTOR_LOCUS_EXECUTOR_VALUE);
		createEReference(executor_locus_Executor_ValueEClass, EXECUTOR_LOCUS_EXECUTOR_VALUE__LOCUS_EXECUTOR);
		createEReference(executor_locus_Executor_ValueEClass, EXECUTOR_LOCUS_EXECUTOR_VALUE__PARENT);
		createEReference(executor_locus_Executor_ValueEClass, EXECUTOR_LOCUS_EXECUTOR_VALUE__STATES);
		createEOperation(executor_locus_Executor_ValueEClass, EXECUTOR_LOCUS_EXECUTOR_VALUE___GET_STATES_NO_OPPOSITE);

		extensionalValue_locus_ExtensionalValue_ValueEClass = createEClass(EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE);
		createEReference(extensionalValue_locus_ExtensionalValue_ValueEClass, EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__LOCUS_EXTENSIONAL_VALUE);
		createEReference(extensionalValue_locus_ExtensionalValue_ValueEClass, EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__PARENT);
		createEReference(extensionalValue_locus_ExtensionalValue_ValueEClass, EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE__STATES);
		createEOperation(extensionalValue_locus_ExtensionalValue_ValueEClass, EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUE___GET_STATES_NO_OPPOSITE);

		featureValue_feature_ValueEClass = createEClass(FEATURE_VALUE_FEATURE_VALUE);
		createEReference(featureValue_feature_ValueEClass, FEATURE_VALUE_FEATURE_VALUE__FEATURE);
		createEReference(featureValue_feature_ValueEClass, FEATURE_VALUE_FEATURE_VALUE__PARENT);
		createEReference(featureValue_feature_ValueEClass, FEATURE_VALUE_FEATURE_VALUE__STATES);
		createEOperation(featureValue_feature_ValueEClass, FEATURE_VALUE_FEATURE_VALUE___GET_STATES_NO_OPPOSITE);

		featureValue_position_ValueEClass = createEClass(FEATURE_VALUE_POSITION_VALUE);
		createEReference(featureValue_position_ValueEClass, FEATURE_VALUE_POSITION_VALUE__PARENT);
		createEAttribute(featureValue_position_ValueEClass, FEATURE_VALUE_POSITION_VALUE__POSITION);
		createEReference(featureValue_position_ValueEClass, FEATURE_VALUE_POSITION_VALUE__STATES);
		createEOperation(featureValue_position_ValueEClass, FEATURE_VALUE_POSITION_VALUE___GET_STATES_NO_OPPOSITE);

		featureValue_values_FeatureValue_ValueEClass = createEClass(FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE);
		createEReference(featureValue_values_FeatureValue_ValueEClass, FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__PARENT);
		createEReference(featureValue_values_FeatureValue_ValueEClass, FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__STATES);
		createEReference(featureValue_values_FeatureValue_ValueEClass, FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE__VALUES_FEATURE_VALUE);
		createEOperation(featureValue_values_FeatureValue_ValueEClass, FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUE___GET_STATES_NO_OPPOSITE);

		forkedToken_baseTokenIsWithdrawn_ValueEClass = createEClass(FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE);
		createEAttribute(forkedToken_baseTokenIsWithdrawn_ValueEClass, FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__BASE_TOKEN_IS_WITHDRAWN);
		createEReference(forkedToken_baseTokenIsWithdrawn_ValueEClass, FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__PARENT);
		createEReference(forkedToken_baseTokenIsWithdrawn_ValueEClass, FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE__STATES);
		createEOperation(forkedToken_baseTokenIsWithdrawn_ValueEClass, FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUE___GET_STATES_NO_OPPOSITE);

		forkedToken_baseToken_ValueEClass = createEClass(FORKED_TOKEN_BASE_TOKEN_VALUE);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__STATES);
		createEOperation(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE___GET_STATES_NO_OPPOSITE);

		forkedToken_remainingOffersCount_ValueEClass = createEClass(FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE);
		createEReference(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT);
		createEAttribute(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT);
		createEReference(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES);
		createEOperation(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE___GET_STATES_NO_OPPOSITE);

		inputParameterValues_name_ValueEClass = createEClass(INPUT_PARAMETER_VALUES_NAME_VALUE);
		createEAttribute(inputParameterValues_name_ValueEClass, INPUT_PARAMETER_VALUES_NAME_VALUE__NAME);
		createEReference(inputParameterValues_name_ValueEClass, INPUT_PARAMETER_VALUES_NAME_VALUE__PARENT);
		createEReference(inputParameterValues_name_ValueEClass, INPUT_PARAMETER_VALUES_NAME_VALUE__STATES);
		createEOperation(inputParameterValues_name_ValueEClass, INPUT_PARAMETER_VALUES_NAME_VALUE___GET_STATES_NO_OPPOSITE);

		inputParameterValues_parameterValues_ValueEClass = createEClass(INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE);
		createEReference(inputParameterValues_parameterValues_ValueEClass, INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARAMETER_VALUES);
		createEReference(inputParameterValues_parameterValues_ValueEClass, INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__PARENT);
		createEReference(inputParameterValues_parameterValues_ValueEClass, INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE__STATES);
		createEOperation(inputParameterValues_parameterValues_ValueEClass, INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUE___GET_STATES_NO_OPPOSITE);

		integerValue_value_IntegerValue_ValueEClass = createEClass(INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE);
		createEReference(integerValue_value_IntegerValue_ValueEClass, INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__PARENT);
		createEReference(integerValue_value_IntegerValue_ValueEClass, INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__STATES);
		createEAttribute(integerValue_value_IntegerValue_ValueEClass, INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE__VALUE_INTEGER_VALUE);
		createEOperation(integerValue_value_IntegerValue_ValueEClass, INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUE___GET_STATES_NO_OPPOSITE);

		locus_executor_ValueEClass = createEClass(LOCUS_EXECUTOR_VALUE);
		createEReference(locus_executor_ValueEClass, LOCUS_EXECUTOR_VALUE__EXECUTOR);
		createEReference(locus_executor_ValueEClass, LOCUS_EXECUTOR_VALUE__PARENT);
		createEReference(locus_executor_ValueEClass, LOCUS_EXECUTOR_VALUE__STATES);
		createEOperation(locus_executor_ValueEClass, LOCUS_EXECUTOR_VALUE___GET_STATES_NO_OPPOSITE);

		locus_extensionalValues_ValueEClass = createEClass(LOCUS_EXTENSIONAL_VALUES_VALUE);
		createEReference(locus_extensionalValues_ValueEClass, LOCUS_EXTENSIONAL_VALUES_VALUE__EXTENSIONAL_VALUES);
		createEReference(locus_extensionalValues_ValueEClass, LOCUS_EXTENSIONAL_VALUES_VALUE__PARENT);
		createEReference(locus_extensionalValues_ValueEClass, LOCUS_EXTENSIONAL_VALUES_VALUE__STATES);
		createEOperation(locus_extensionalValues_ValueEClass, LOCUS_EXTENSIONAL_VALUES_VALUE___GET_STATES_NO_OPPOSITE);

		locus_factory_ValueEClass = createEClass(LOCUS_FACTORY_VALUE);
		createEReference(locus_factory_ValueEClass, LOCUS_FACTORY_VALUE__FACTORY);
		createEReference(locus_factory_ValueEClass, LOCUS_FACTORY_VALUE__PARENT);
		createEReference(locus_factory_ValueEClass, LOCUS_FACTORY_VALUE__STATES);
		createEOperation(locus_factory_ValueEClass, LOCUS_FACTORY_VALUE___GET_STATES_NO_OPPOSITE);

		objectNodeActivation_offeredTokenCount_ValueEClass = createEClass(OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE);
		createEAttribute(objectNodeActivation_offeredTokenCount_ValueEClass, OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__OFFERED_TOKEN_COUNT);
		createEReference(objectNodeActivation_offeredTokenCount_ValueEClass, OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT);
		createEReference(objectNodeActivation_offeredTokenCount_ValueEClass, OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES);
		createEOperation(objectNodeActivation_offeredTokenCount_ValueEClass, OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE___GET_STATES_NO_OPPOSITE);

		objectToken_value_ValueEClass = createEClass(OBJECT_TOKEN_VALUE_VALUE);
		createEReference(objectToken_value_ValueEClass, OBJECT_TOKEN_VALUE_VALUE__PARENT);
		createEReference(objectToken_value_ValueEClass, OBJECT_TOKEN_VALUE_VALUE__STATES);
		createEReference(objectToken_value_ValueEClass, OBJECT_TOKEN_VALUE_VALUE__VALUE);
		createEOperation(objectToken_value_ValueEClass, OBJECT_TOKEN_VALUE_VALUE___GET_STATES_NO_OPPOSITE);

		object_types_ValueEClass = createEClass(OBJECT_TYPES_VALUE);
		createEReference(object_types_ValueEClass, OBJECT_TYPES_VALUE__PARENT);
		createEReference(object_types_ValueEClass, OBJECT_TYPES_VALUE__STATES);
		createEReference(object_types_ValueEClass, OBJECT_TYPES_VALUE__TYPES);
		createEOperation(object_types_ValueEClass, OBJECT_TYPES_VALUE___GET_STATES_NO_OPPOSITE);

		offer_offeredTokens_ValueEClass = createEClass(OFFER_OFFERED_TOKENS_VALUE);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__PARENT);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__STATES);
		createEOperation(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE___GET_STATES_NO_OPPOSITE);

		parameterValue_parameter_ParameterValue_ValueEClass = createEClass(PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE);
		createEReference(parameterValue_parameter_ParameterValue_ValueEClass, PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARAMETER_PARAMETER_VALUE);
		createEReference(parameterValue_parameter_ParameterValue_ValueEClass, PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__PARENT);
		createEReference(parameterValue_parameter_ParameterValue_ValueEClass, PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE__STATES);
		createEOperation(parameterValue_parameter_ParameterValue_ValueEClass, PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUE___GET_STATES_NO_OPPOSITE);

		parameterValue_values_ParameterValue_ValueEClass = createEClass(PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE);
		createEReference(parameterValue_values_ParameterValue_ValueEClass, PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__PARENT);
		createEReference(parameterValue_values_ParameterValue_ValueEClass, PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__STATES);
		createEReference(parameterValue_values_ParameterValue_ValueEClass, PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE__VALUES_PARAMETER_VALUE);
		createEOperation(parameterValue_values_ParameterValue_ValueEClass, PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUE___GET_STATES_NO_OPPOSITE);

		pinActivation_actionActivation_ValueEClass = createEClass(PIN_ACTIVATION_ACTION_ACTIVATION_VALUE);
		createEReference(pinActivation_actionActivation_ValueEClass, PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__ACTION_ACTIVATION);
		createEReference(pinActivation_actionActivation_ValueEClass, PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT);
		createEReference(pinActivation_actionActivation_ValueEClass, PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__STATES);
		createEOperation(pinActivation_actionActivation_ValueEClass, PIN_ACTIVATION_ACTION_ACTIVATION_VALUE___GET_STATES_NO_OPPOSITE);

		pinActivation_count_temp_ValueEClass = createEClass(PIN_ACTIVATION_COUNT_TEMP_VALUE);
		createEAttribute(pinActivation_count_temp_ValueEClass, PIN_ACTIVATION_COUNT_TEMP_VALUE__COUNT_TEMP);
		createEReference(pinActivation_count_temp_ValueEClass, PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT);
		createEReference(pinActivation_count_temp_ValueEClass, PIN_ACTIVATION_COUNT_TEMP_VALUE__STATES);
		createEOperation(pinActivation_count_temp_ValueEClass, PIN_ACTIVATION_COUNT_TEMP_VALUE___GET_STATES_NO_OPPOSITE);

		primitiveValue_type_ValueEClass = createEClass(PRIMITIVE_VALUE_TYPE_VALUE);
		createEReference(primitiveValue_type_ValueEClass, PRIMITIVE_VALUE_TYPE_VALUE__PARENT);
		createEReference(primitiveValue_type_ValueEClass, PRIMITIVE_VALUE_TYPE_VALUE__STATES);
		createEReference(primitiveValue_type_ValueEClass, PRIMITIVE_VALUE_TYPE_VALUE__TYPE);
		createEOperation(primitiveValue_type_ValueEClass, PRIMITIVE_VALUE_TYPE_VALUE___GET_STATES_NO_OPPOSITE);

		reference_referent_ValueEClass = createEClass(REFERENCE_REFERENT_VALUE);
		createEReference(reference_referent_ValueEClass, REFERENCE_REFERENT_VALUE__PARENT);
		createEReference(reference_referent_ValueEClass, REFERENCE_REFERENT_VALUE__REFERENT);
		createEReference(reference_referent_ValueEClass, REFERENCE_REFERENT_VALUE__STATES);
		createEOperation(reference_referent_ValueEClass, REFERENCE_REFERENT_VALUE___GET_STATES_NO_OPPOSITE);

		semanticVisitor_runtimeModelElement_ValueEClass = createEClass(SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE);
		createEReference(semanticVisitor_runtimeModelElement_ValueEClass, SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT);
		createEReference(semanticVisitor_runtimeModelElement_ValueEClass, SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT);
		createEReference(semanticVisitor_runtimeModelElement_ValueEClass, SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES);
		createEOperation(semanticVisitor_runtimeModelElement_ValueEClass, SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE___GET_STATES_NO_OPPOSITE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTION_ACTIVATION_FIRING_VALUES);
		createEReference(stateEClass, STATE__ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EDGE_INSTANCE_OFFERS_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EDGE_INSTANCE_SOURCE_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EDGE_INSTANCE_TARGET_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVATION_RUNNING_VALUES);
		createEReference(stateEClass, STATE__BOOLEAN_VALUE_VALUE_BOOLEAN_VALUE_VALUES);
		createEReference(stateEClass, STATE__CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUES);
		createEReference(stateEClass, STATE__COMPOUND_VALUE_FEATURE_VALUES_VALUES);
		createEReference(stateEClass, STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__EVALUATION_LOCUS_EVALUATION_VALUES);
		createEReference(stateEClass, STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES);
		createEReference(stateEClass, STATE__EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUES);
		createEReference(stateEClass, STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES);
		createEReference(stateEClass, STATE__EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUES);
		createEReference(stateEClass, STATE__EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUES);
		createEReference(stateEClass, STATE__EXECUTION_CONTEXT_VALUES);
		createEReference(stateEClass, STATE__EXECUTION_PARAMETER_VALUES_VALUES);
		createEReference(stateEClass, STATE__EXECUTOR_LOCUS_EXECUTOR_VALUES);
		createEReference(stateEClass, STATE__EXTENSIONAL_VALUE_LOCUS_EXTENSIONAL_VALUE_VALUES);
		createEReference(stateEClass, STATE__FEATURE_VALUE_FEATURE_VALUES);
		createEReference(stateEClass, STATE__FEATURE_VALUE_POSITION_VALUES);
		createEReference(stateEClass, STATE__FEATURE_VALUE_VALUES_FEATURE_VALUE_VALUES);
		createEReference(stateEClass, STATE__FORKED_TOKEN_BASE_TOKEN_IS_WITHDRAWN_VALUES);
		createEReference(stateEClass, STATE__FORKED_TOKEN_BASE_TOKEN_VALUES);
		createEReference(stateEClass, STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES);
		createEReference(stateEClass, STATE__INPUT_PARAMETER_VALUES_NAME_VALUES);
		createEReference(stateEClass, STATE__INPUT_PARAMETER_VALUES_PARAMETER_VALUES_VALUES);
		createEReference(stateEClass, STATE__INTEGER_VALUE_VALUE_INTEGER_VALUE_VALUES);
		createEReference(stateEClass, STATE__LOCUS_EXECUTOR_VALUES);
		createEReference(stateEClass, STATE__LOCUS_EXTENSIONAL_VALUES_VALUES);
		createEReference(stateEClass, STATE__LOCUS_FACTORY_VALUES);
		createEReference(stateEClass, STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES);
		createEReference(stateEClass, STATE__OBJECT_TOKEN_VALUE_VALUES);
		createEReference(stateEClass, STATE__OBJECT_TYPES_VALUES);
		createEReference(stateEClass, STATE__OFFER_OFFERED_TOKENS_VALUES);
		createEReference(stateEClass, STATE__PARAMETER_VALUE_PARAMETER_PARAMETER_VALUE_VALUES);
		createEReference(stateEClass, STATE__PARAMETER_VALUE_VALUES_PARAMETER_VALUE_VALUES);
		createEReference(stateEClass, STATE__PIN_ACTIVATION_ACTION_ACTIVATION_VALUES);
		createEReference(stateEClass, STATE__PIN_ACTIVATION_COUNT_TEMP_VALUES);
		createEReference(stateEClass, STATE__PRIMITIVE_VALUE_TYPE_VALUES);
		createEReference(stateEClass, STATE__REFERENCE_REFERENT_VALUES);
		createEReference(stateEClass, STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES);
		createEReference(stateEClass, STATE__STARTED_STEPS);
		createEReference(stateEClass, STATE__TOKEN_HOLDER_VALUES);

		token_holder_ValueEClass = createEClass(TOKEN_HOLDER_VALUE);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__HOLDER);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__PARENT);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__STATES);
		createEOperation(token_holder_ValueEClass, TOKEN_HOLDER_VALUE___GET_STATES_NO_OPPOSITE);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__STATES_NO_OPPOSITE);
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
		umlTrace.States.fumlConfiguration.FumlConfigurationPackage theFumlConfigurationPackage_1 = (umlTrace.States.fumlConfiguration.FumlConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI);
		UmlPackage theUmlPackage = (UmlPackage)EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		BasicActionsPackage theBasicActionsPackage = (BasicActionsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI);
		IntermediateActivitiesPackage theIntermediateActivitiesPackage = (IntermediateActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI);
		KernelPackage theKernelPackage = (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		BasicBehaviorsPackage theBasicBehaviorsPackage = (BasicBehaviorsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI);
		LociPackage theLociPackage = (LociPackage)EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI);
		InputPackage theInputPackage = (InputPackage)EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFumlConfigurationPackage_1);
		getESubpackages().add(theUmlPackage);
		getESubpackages().add(theEcorePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionActivation_firing_ValueEClass.getESuperTypes().add(this.getValue());
		actionActivation_pinActivations_ValueEClass.getESuperTypes().add(this.getValue());
		activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass.getESuperTypes().add(this.getValue());
		activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass.getESuperTypes().add(this.getValue());
		activityEdgeInstance_offers_ValueEClass.getESuperTypes().add(this.getValue());
		activityEdgeInstance_source_ValueEClass.getESuperTypes().add(this.getValue());
		activityEdgeInstance_target_ValueEClass.getESuperTypes().add(this.getValue());
		activityExecution_activationGroup_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivationGroup_activityExecution_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivationGroup_edgeInstances_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivationGroup_nodeActivations_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivation_group_ActivityNodeActivation_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivation_heldTokens_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivation_incomingEdges_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivation_isRunning_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivation_node_ActivityNodeActivation_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivation_outgoingEdges_ValueEClass.getESuperTypes().add(this.getValue());
		activityNodeActivation_running_ValueEClass.getESuperTypes().add(this.getValue());
		booleanValue_value_BooleanValue_ValueEClass.getESuperTypes().add(this.getValue());
		callActionActivation_callExecutions_ValueEClass.getESuperTypes().add(this.getValue());
		compoundValue_featureValues_ValueEClass.getESuperTypes().add(this.getValue());
		elementConfiguration_semanticVisitor_ValueEClass.getESuperTypes().add(this.getValue());
		evaluation_locus_Evaluation_ValueEClass.getESuperTypes().add(this.getValue());
		evaluation_specification_Evaluation_ValueEClass.getESuperTypes().add(this.getValue());
		executionEnvironment_locus_ExecutionEnvironment_ValueEClass.getESuperTypes().add(this.getValue());
		executionFactory_builtInTypes_ValueEClass.getESuperTypes().add(this.getValue());
		executionFactory_locus_ExecutionFactory_ValueEClass.getESuperTypes().add(this.getValue());
		executionFactory_primitiveBehaviorPrototypes_ValueEClass.getESuperTypes().add(this.getValue());
		execution_context_ValueEClass.getESuperTypes().add(this.getValue());
		execution_parameterValues_ValueEClass.getESuperTypes().add(this.getValue());
		executor_locus_Executor_ValueEClass.getESuperTypes().add(this.getValue());
		extensionalValue_locus_ExtensionalValue_ValueEClass.getESuperTypes().add(this.getValue());
		featureValue_feature_ValueEClass.getESuperTypes().add(this.getValue());
		featureValue_position_ValueEClass.getESuperTypes().add(this.getValue());
		featureValue_values_FeatureValue_ValueEClass.getESuperTypes().add(this.getValue());
		forkedToken_baseTokenIsWithdrawn_ValueEClass.getESuperTypes().add(this.getValue());
		forkedToken_baseToken_ValueEClass.getESuperTypes().add(this.getValue());
		forkedToken_remainingOffersCount_ValueEClass.getESuperTypes().add(this.getValue());
		inputParameterValues_name_ValueEClass.getESuperTypes().add(this.getValue());
		inputParameterValues_parameterValues_ValueEClass.getESuperTypes().add(this.getValue());
		integerValue_value_IntegerValue_ValueEClass.getESuperTypes().add(this.getValue());
		locus_executor_ValueEClass.getESuperTypes().add(this.getValue());
		locus_extensionalValues_ValueEClass.getESuperTypes().add(this.getValue());
		locus_factory_ValueEClass.getESuperTypes().add(this.getValue());
		objectNodeActivation_offeredTokenCount_ValueEClass.getESuperTypes().add(this.getValue());
		objectToken_value_ValueEClass.getESuperTypes().add(this.getValue());
		object_types_ValueEClass.getESuperTypes().add(this.getValue());
		offer_offeredTokens_ValueEClass.getESuperTypes().add(this.getValue());
		parameterValue_parameter_ParameterValue_ValueEClass.getESuperTypes().add(this.getValue());
		parameterValue_values_ParameterValue_ValueEClass.getESuperTypes().add(this.getValue());
		pinActivation_actionActivation_ValueEClass.getESuperTypes().add(this.getValue());
		pinActivation_count_temp_ValueEClass.getESuperTypes().add(this.getValue());
		primitiveValue_type_ValueEClass.getESuperTypes().add(this.getValue());
		reference_referent_ValueEClass.getESuperTypes().add(this.getValue());
		semanticVisitor_runtimeModelElement_ValueEClass.getESuperTypes().add(this.getValue());
		token_holder_ValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionActivation_firing_ValueEClass, ActionActivation_firing_Value.class, "ActionActivation_firing_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionActivation_firing_Value_Firing(), ecorePackage.getEBoolean(), "firing", null, 1, 1, ActionActivation_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionActivation_firing_Value_Parent(), theBasicActionsPackage.getTracedActionActivation(), theBasicActionsPackage.getTracedActionActivation_FiringSequence(), "parent", null, 1, 1, ActionActivation_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionActivation_firing_Value_States(), this.getState(), this.getState_ActionActivation_firing_Values(), "states", null, 1, -1, ActionActivation_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActionActivation_firing_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionActivation_pinActivations_ValueEClass, ActionActivation_pinActivations_Value.class, "ActionActivation_pinActivations_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionActivation_pinActivations_Value_Parent(), theBasicActionsPackage.getTracedActionActivation(), theBasicActionsPackage.getTracedActionActivation_PinActivationsSequence(), "parent", null, 1, 1, ActionActivation_pinActivations_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionActivation_pinActivations_Value_PinActivations(), theBasicActionsPackage.getTracedPinActivation(), null, "pinActivations", null, 0, -1, ActionActivation_pinActivations_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionActivation_pinActivations_Value_States(), this.getState(), this.getState_ActionActivation_pinActivations_Values(), "states", null, 1, -1, ActionActivation_pinActivations_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActionActivation_pinActivations_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass, ActivityEdgeInstance_edge_ActivityEdgeInstance_Value.class, "ActivityEdgeInstance_edge_ActivityEdgeInstance_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Edge_ActivityEdgeInstance(), theUmlPackage.getTracedActivityEdge(), null, "edge_ActivityEdgeInstance", null, 0, 1, ActivityEdgeInstance_edge_ActivityEdgeInstance_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance_Edge_ActivityEdgeInstanceSequence(), "parent", null, 1, 1, ActivityEdgeInstance_edge_ActivityEdgeInstance_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_States(), this.getState(), this.getState_ActivityEdgeInstance_edge_ActivityEdgeInstance_Values(), "states", null, 1, -1, ActivityEdgeInstance_edge_ActivityEdgeInstance_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityEdgeInstance_edge_ActivityEdgeInstance_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass, ActivityEdgeInstance_group_ActivityEdgeInstance_Value.class, "ActivityEdgeInstance_group_ActivityEdgeInstance_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Group_ActivityEdgeInstance(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup(), null, "group_ActivityEdgeInstance", null, 1, 1, ActivityEdgeInstance_group_ActivityEdgeInstance_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance_Group_ActivityEdgeInstanceSequence(), "parent", null, 1, 1, ActivityEdgeInstance_group_ActivityEdgeInstance_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_group_ActivityEdgeInstance_Value_States(), this.getState(), this.getState_ActivityEdgeInstance_group_ActivityEdgeInstance_Values(), "states", null, 1, -1, ActivityEdgeInstance_group_ActivityEdgeInstance_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityEdgeInstance_group_ActivityEdgeInstance_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEdgeInstance_offers_ValueEClass, ActivityEdgeInstance_offers_Value.class, "ActivityEdgeInstance_offers_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdgeInstance_offers_Value_Offers(), theIntermediateActivitiesPackage.getTracedOffer(), null, "offers", null, 0, -1, ActivityEdgeInstance_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_offers_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance_OffersSequence(), "parent", null, 1, 1, ActivityEdgeInstance_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_offers_Value_States(), this.getState(), this.getState_ActivityEdgeInstance_offers_Values(), "states", null, 1, -1, ActivityEdgeInstance_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityEdgeInstance_offers_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEdgeInstance_source_ValueEClass, ActivityEdgeInstance_source_Value.class, "ActivityEdgeInstance_source_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdgeInstance_source_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance_SourceSequence(), "parent", null, 1, 1, ActivityEdgeInstance_source_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_source_Value_Source(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), null, "source", null, 1, 1, ActivityEdgeInstance_source_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_source_Value_States(), this.getState(), this.getState_ActivityEdgeInstance_source_Values(), "states", null, 1, -1, ActivityEdgeInstance_source_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityEdgeInstance_source_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEdgeInstance_target_ValueEClass, ActivityEdgeInstance_target_Value.class, "ActivityEdgeInstance_target_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdgeInstance_target_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance_TargetSequence(), "parent", null, 1, 1, ActivityEdgeInstance_target_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_target_Value_States(), this.getState(), this.getState_ActivityEdgeInstance_target_Values(), "states", null, 1, -1, ActivityEdgeInstance_target_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdgeInstance_target_Value_Target(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), null, "target", null, 1, 1, ActivityEdgeInstance_target_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityEdgeInstance_target_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityExecution_activationGroup_ValueEClass, ActivityExecution_activationGroup_Value.class, "ActivityExecution_activationGroup_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityExecution_activationGroup_Value_ActivationGroup(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup(), null, "activationGroup", null, 1, 1, ActivityExecution_activationGroup_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityExecution_activationGroup_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityExecution(), theIntermediateActivitiesPackage.getTracedActivityExecution_ActivationGroupSequence(), "parent", null, 1, 1, ActivityExecution_activationGroup_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityExecution_activationGroup_Value_States(), this.getState(), this.getState_ActivityExecution_activationGroup_Values(), "states", null, 1, -1, ActivityExecution_activationGroup_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityExecution_activationGroup_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivationGroup_activityExecution_ValueEClass, ActivityNodeActivationGroup_activityExecution_Value.class, "ActivityNodeActivationGroup_activityExecution_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivationGroup_activityExecution_Value_ActivityExecution(), theIntermediateActivitiesPackage.getTracedActivityExecution(), null, "activityExecution", null, 0, 1, ActivityNodeActivationGroup_activityExecution_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivationGroup_activityExecution_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup_ActivityExecutionSequence(), "parent", null, 1, 1, ActivityNodeActivationGroup_activityExecution_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivationGroup_activityExecution_Value_States(), this.getState(), this.getState_ActivityNodeActivationGroup_activityExecution_Values(), "states", null, 1, -1, ActivityNodeActivationGroup_activityExecution_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivationGroup_activityExecution_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivationGroup_edgeInstances_ValueEClass, ActivityNodeActivationGroup_edgeInstances_Value.class, "ActivityNodeActivationGroup_edgeInstances_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivationGroup_edgeInstances_Value_EdgeInstances(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance(), null, "edgeInstances", null, 0, -1, ActivityNodeActivationGroup_edgeInstances_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivationGroup_edgeInstances_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup_EdgeInstancesSequence(), "parent", null, 1, 1, ActivityNodeActivationGroup_edgeInstances_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivationGroup_edgeInstances_Value_States(), this.getState(), this.getState_ActivityNodeActivationGroup_edgeInstances_Values(), "states", null, 1, -1, ActivityNodeActivationGroup_edgeInstances_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivationGroup_edgeInstances_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivationGroup_nodeActivations_ValueEClass, ActivityNodeActivationGroup_nodeActivations_Value.class, "ActivityNodeActivationGroup_nodeActivations_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivationGroup_nodeActivations_Value_NodeActivations(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), null, "nodeActivations", null, 0, -1, ActivityNodeActivationGroup_nodeActivations_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivationGroup_nodeActivations_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup_NodeActivationsSequence(), "parent", null, 1, 1, ActivityNodeActivationGroup_nodeActivations_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivationGroup_nodeActivations_Value_States(), this.getState(), this.getState_ActivityNodeActivationGroup_nodeActivations_Values(), "states", null, 1, -1, ActivityNodeActivationGroup_nodeActivations_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivationGroup_nodeActivations_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivation_group_ActivityNodeActivation_ValueEClass, ActivityNodeActivation_group_ActivityNodeActivation_Value.class, "ActivityNodeActivation_group_ActivityNodeActivation_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivation_group_ActivityNodeActivation_Value_Group_ActivityNodeActivation(), theIntermediateActivitiesPackage.getTracedActivityNodeActivationGroup(), null, "group_ActivityNodeActivation", null, 0, 1, ActivityNodeActivation_group_ActivityNodeActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_group_ActivityNodeActivation_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation_Group_ActivityNodeActivationSequence(), "parent", null, 1, 1, ActivityNodeActivation_group_ActivityNodeActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_group_ActivityNodeActivation_Value_States(), this.getState(), this.getState_ActivityNodeActivation_group_ActivityNodeActivation_Values(), "states", null, 1, -1, ActivityNodeActivation_group_ActivityNodeActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivation_group_ActivityNodeActivation_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivation_heldTokens_ValueEClass, ActivityNodeActivation_heldTokens_Value.class, "ActivityNodeActivation_heldTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivation_heldTokens_Value_HeldTokens(), theIntermediateActivitiesPackage.getTracedToken(), null, "heldTokens", null, 0, -1, ActivityNodeActivation_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_heldTokens_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation_HeldTokensSequence(), "parent", null, 1, 1, ActivityNodeActivation_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_heldTokens_Value_States(), this.getState(), this.getState_ActivityNodeActivation_heldTokens_Values(), "states", null, 1, -1, ActivityNodeActivation_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivation_heldTokens_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivation_incomingEdges_ValueEClass, ActivityNodeActivation_incomingEdges_Value.class, "ActivityNodeActivation_incomingEdges_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivation_incomingEdges_Value_IncomingEdges(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance(), null, "incomingEdges", null, 0, -1, ActivityNodeActivation_incomingEdges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_incomingEdges_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation_IncomingEdgesSequence(), "parent", null, 1, 1, ActivityNodeActivation_incomingEdges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_incomingEdges_Value_States(), this.getState(), this.getState_ActivityNodeActivation_incomingEdges_Values(), "states", null, 1, -1, ActivityNodeActivation_incomingEdges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivation_incomingEdges_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivation_isRunning_ValueEClass, ActivityNodeActivation_isRunning_Value.class, "ActivityNodeActivation_isRunning_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityNodeActivation_isRunning_Value_IsRunning(), ecorePackage.getEBoolean(), "isRunning", null, 1, 1, ActivityNodeActivation_isRunning_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_isRunning_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation_IsRunningSequence(), "parent", null, 1, 1, ActivityNodeActivation_isRunning_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_isRunning_Value_States(), this.getState(), this.getState_ActivityNodeActivation_isRunning_Values(), "states", null, 1, -1, ActivityNodeActivation_isRunning_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivation_isRunning_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivation_node_ActivityNodeActivation_ValueEClass, ActivityNodeActivation_node_ActivityNodeActivation_Value.class, "ActivityNodeActivation_node_ActivityNodeActivation_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivation_node_ActivityNodeActivation_Value_Node_ActivityNodeActivation(), theUmlPackage.getTracedActivityNode(), null, "node_ActivityNodeActivation", null, 0, 1, ActivityNodeActivation_node_ActivityNodeActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_node_ActivityNodeActivation_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation_Node_ActivityNodeActivationSequence(), "parent", null, 1, 1, ActivityNodeActivation_node_ActivityNodeActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_node_ActivityNodeActivation_Value_States(), this.getState(), this.getState_ActivityNodeActivation_node_ActivityNodeActivation_Values(), "states", null, 1, -1, ActivityNodeActivation_node_ActivityNodeActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivation_node_ActivityNodeActivation_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivation_outgoingEdges_ValueEClass, ActivityNodeActivation_outgoingEdges_Value.class, "ActivityNodeActivation_outgoingEdges_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivation_outgoingEdges_Value_OutgoingEdges(), theIntermediateActivitiesPackage.getTracedActivityEdgeInstance(), null, "outgoingEdges", null, 0, -1, ActivityNodeActivation_outgoingEdges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_outgoingEdges_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation_OutgoingEdgesSequence(), "parent", null, 1, 1, ActivityNodeActivation_outgoingEdges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_outgoingEdges_Value_States(), this.getState(), this.getState_ActivityNodeActivation_outgoingEdges_Values(), "states", null, 1, -1, ActivityNodeActivation_outgoingEdges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivation_outgoingEdges_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityNodeActivation_running_ValueEClass, ActivityNodeActivation_running_Value.class, "ActivityNodeActivation_running_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNodeActivation_running_Value_Parent(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation_RunningSequence(), "parent", null, 1, 1, ActivityNodeActivation_running_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityNodeActivation_running_Value_Running(), ecorePackage.getEBoolean(), "running", null, 1, 1, ActivityNodeActivation_running_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNodeActivation_running_Value_States(), this.getState(), this.getState_ActivityNodeActivation_running_Values(), "states", null, 1, -1, ActivityNodeActivation_running_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivityNodeActivation_running_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanValue_value_BooleanValue_ValueEClass, BooleanValue_value_BooleanValue_Value.class, "BooleanValue_value_BooleanValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanValue_value_BooleanValue_Value_Parent(), theKernelPackage.getTracedBooleanValue(), theKernelPackage.getTracedBooleanValue_Value_BooleanValueSequence(), "parent", null, 1, 1, BooleanValue_value_BooleanValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanValue_value_BooleanValue_Value_States(), this.getState(), this.getState_BooleanValue_value_BooleanValue_Values(), "states", null, 1, -1, BooleanValue_value_BooleanValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanValue_value_BooleanValue_Value_Value_BooleanValue(), ecorePackage.getEBoolean(), "value_BooleanValue", null, 1, 1, BooleanValue_value_BooleanValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBooleanValue_value_BooleanValue_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(callActionActivation_callExecutions_ValueEClass, CallActionActivation_callExecutions_Value.class, "CallActionActivation_callExecutions_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallActionActivation_callExecutions_Value_CallExecutions(), theBasicBehaviorsPackage.getTracedExecution(), null, "callExecutions", null, 0, -1, CallActionActivation_callExecutions_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallActionActivation_callExecutions_Value_Parent(), theBasicActionsPackage.getTracedCallActionActivation(), theBasicActionsPackage.getTracedCallActionActivation_CallExecutionsSequence(), "parent", null, 1, 1, CallActionActivation_callExecutions_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallActionActivation_callExecutions_Value_States(), this.getState(), this.getState_CallActionActivation_callExecutions_Values(), "states", null, 1, -1, CallActionActivation_callExecutions_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCallActionActivation_callExecutions_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(compoundValue_featureValues_ValueEClass, CompoundValue_featureValues_Value.class, "CompoundValue_featureValues_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundValue_featureValues_Value_FeatureValues(), theKernelPackage.getTracedFeatureValue(), null, "featureValues", null, 0, -1, CompoundValue_featureValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundValue_featureValues_Value_Parent(), theKernelPackage.getTracedCompoundValue(), theKernelPackage.getTracedCompoundValue_FeatureValuesSequence(), "parent", null, 1, 1, CompoundValue_featureValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundValue_featureValues_Value_States(), this.getState(), this.getState_CompoundValue_featureValues_Values(), "states", null, 1, -1, CompoundValue_featureValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompoundValue_featureValues_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementConfiguration_semanticVisitor_ValueEClass, ElementConfiguration_semanticVisitor_Value.class, "ElementConfiguration_semanticVisitor_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementConfiguration_semanticVisitor_Value_Parent(), theFumlConfigurationPackage_1.getTracedElementConfiguration(), theFumlConfigurationPackage_1.getTracedElementConfiguration_SemanticVisitorSequence(), "parent", null, 1, 1, ElementConfiguration_semanticVisitor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementConfiguration_semanticVisitor_Value_SemanticVisitor(), theLociPackage.getTracedSemanticVisitor(), null, "semanticVisitor", null, 0, -1, ElementConfiguration_semanticVisitor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementConfiguration_semanticVisitor_Value_States(), this.getState(), this.getState_ElementConfiguration_semanticVisitor_Values(), "states", null, 1, -1, ElementConfiguration_semanticVisitor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElementConfiguration_semanticVisitor_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(evaluation_locus_Evaluation_ValueEClass, Evaluation_locus_Evaluation_Value.class, "Evaluation_locus_Evaluation_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluation_locus_Evaluation_Value_Locus_Evaluation(), theLociPackage.getTracedLocus(), null, "locus_Evaluation", null, 1, 1, Evaluation_locus_Evaluation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_locus_Evaluation_Value_Parent(), theKernelPackage.getTracedEvaluation(), theKernelPackage.getTracedEvaluation_Locus_EvaluationSequence(), "parent", null, 1, 1, Evaluation_locus_Evaluation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_locus_Evaluation_Value_States(), this.getState(), this.getState_Evaluation_locus_Evaluation_Values(), "states", null, 1, -1, Evaluation_locus_Evaluation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEvaluation_locus_Evaluation_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(evaluation_specification_Evaluation_ValueEClass, Evaluation_specification_Evaluation_Value.class, "Evaluation_specification_Evaluation_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluation_specification_Evaluation_Value_Parent(), theKernelPackage.getTracedEvaluation(), theKernelPackage.getTracedEvaluation_Specification_EvaluationSequence(), "parent", null, 1, 1, Evaluation_specification_Evaluation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_specification_Evaluation_Value_Specification_Evaluation(), theUmlPackage.getTracedValueSpecification(), null, "specification_Evaluation", null, 1, 1, Evaluation_specification_Evaluation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_specification_Evaluation_Value_States(), this.getState(), this.getState_Evaluation_specification_Evaluation_Values(), "states", null, 1, -1, Evaluation_specification_Evaluation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEvaluation_specification_Evaluation_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(executionEnvironment_locus_ExecutionEnvironment_ValueEClass, ExecutionEnvironment_locus_ExecutionEnvironment_Value.class, "ExecutionEnvironment_locus_ExecutionEnvironment_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionEnvironment_locus_ExecutionEnvironment_Value_Locus_ExecutionEnvironment(), theLociPackage.getTracedLocus(), null, "locus_ExecutionEnvironment", null, 1, 1, ExecutionEnvironment_locus_ExecutionEnvironment_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionEnvironment_locus_ExecutionEnvironment_Value_Parent(), theLociPackage.getTracedExecutionEnvironment(), theLociPackage.getTracedExecutionEnvironment_Locus_ExecutionEnvironmentSequence(), "parent", null, 1, 1, ExecutionEnvironment_locus_ExecutionEnvironment_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionEnvironment_locus_ExecutionEnvironment_Value_States(), this.getState(), this.getState_ExecutionEnvironment_locus_ExecutionEnvironment_Values(), "states", null, 1, -1, ExecutionEnvironment_locus_ExecutionEnvironment_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExecutionEnvironment_locus_ExecutionEnvironment_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(executionFactory_builtInTypes_ValueEClass, ExecutionFactory_builtInTypes_Value.class, "ExecutionFactory_builtInTypes_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionFactory_builtInTypes_Value_BuiltInTypes(), theUmlPackage.getTracedPrimitiveType(), null, "builtInTypes", null, 0, -1, ExecutionFactory_builtInTypes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionFactory_builtInTypes_Value_Parent(), theLociPackage.getTracedExecutionFactory(), theLociPackage.getTracedExecutionFactory_BuiltInTypesSequence(), "parent", null, 1, 1, ExecutionFactory_builtInTypes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionFactory_builtInTypes_Value_States(), this.getState(), this.getState_ExecutionFactory_builtInTypes_Values(), "states", null, 1, -1, ExecutionFactory_builtInTypes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExecutionFactory_builtInTypes_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(executionFactory_locus_ExecutionFactory_ValueEClass, ExecutionFactory_locus_ExecutionFactory_Value.class, "ExecutionFactory_locus_ExecutionFactory_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionFactory_locus_ExecutionFactory_Value_Locus_ExecutionFactory(), theLociPackage.getTracedLocus(), null, "locus_ExecutionFactory", null, 0, 1, ExecutionFactory_locus_ExecutionFactory_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionFactory_locus_ExecutionFactory_Value_Parent(), theLociPackage.getTracedExecutionFactory(), theLociPackage.getTracedExecutionFactory_Locus_ExecutionFactorySequence(), "parent", null, 1, 1, ExecutionFactory_locus_ExecutionFactory_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionFactory_locus_ExecutionFactory_Value_States(), this.getState(), this.getState_ExecutionFactory_locus_ExecutionFactory_Values(), "states", null, 1, -1, ExecutionFactory_locus_ExecutionFactory_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExecutionFactory_locus_ExecutionFactory_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(executionFactory_primitiveBehaviorPrototypes_ValueEClass, ExecutionFactory_primitiveBehaviorPrototypes_Value.class, "ExecutionFactory_primitiveBehaviorPrototypes_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionFactory_primitiveBehaviorPrototypes_Value_Parent(), theLociPackage.getTracedExecutionFactory(), theLociPackage.getTracedExecutionFactory_PrimitiveBehaviorPrototypesSequence(), "parent", null, 1, 1, ExecutionFactory_primitiveBehaviorPrototypes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionFactory_primitiveBehaviorPrototypes_Value_PrimitiveBehaviorPrototypes(), theBasicBehaviorsPackage.getTracedOpaqueBehaviorExecution(), null, "primitiveBehaviorPrototypes", null, 0, -1, ExecutionFactory_primitiveBehaviorPrototypes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionFactory_primitiveBehaviorPrototypes_Value_States(), this.getState(), this.getState_ExecutionFactory_primitiveBehaviorPrototypes_Values(), "states", null, 1, -1, ExecutionFactory_primitiveBehaviorPrototypes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExecutionFactory_primitiveBehaviorPrototypes_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(execution_context_ValueEClass, Execution_context_Value.class, "Execution_context_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecution_context_Value_Context(), theKernelPackage.getTracedObject(), null, "context", null, 1, 1, Execution_context_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_context_Value_Parent(), theBasicBehaviorsPackage.getTracedExecution(), theBasicBehaviorsPackage.getTracedExecution_ContextSequence(), "parent", null, 1, 1, Execution_context_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_context_Value_States(), this.getState(), this.getState_Execution_context_Values(), "states", null, 1, -1, Execution_context_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExecution_context_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(execution_parameterValues_ValueEClass, Execution_parameterValues_Value.class, "Execution_parameterValues_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecution_parameterValues_Value_ParameterValues(), theBasicBehaviorsPackage.getTracedParameterValue(), null, "parameterValues", null, 0, -1, Execution_parameterValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_parameterValues_Value_Parent(), theBasicBehaviorsPackage.getTracedExecution(), theBasicBehaviorsPackage.getTracedExecution_ParameterValuesSequence(), "parent", null, 1, 1, Execution_parameterValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_parameterValues_Value_States(), this.getState(), this.getState_Execution_parameterValues_Values(), "states", null, 1, -1, Execution_parameterValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExecution_parameterValues_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(executor_locus_Executor_ValueEClass, Executor_locus_Executor_Value.class, "Executor_locus_Executor_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutor_locus_Executor_Value_Locus_Executor(), theLociPackage.getTracedLocus(), null, "locus_Executor", null, 0, 1, Executor_locus_Executor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_locus_Executor_Value_Parent(), theLociPackage.getTracedExecutor(), theLociPackage.getTracedExecutor_Locus_ExecutorSequence(), "parent", null, 1, 1, Executor_locus_Executor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_locus_Executor_Value_States(), this.getState(), this.getState_Executor_locus_Executor_Values(), "states", null, 1, -1, Executor_locus_Executor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExecutor_locus_Executor_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensionalValue_locus_ExtensionalValue_ValueEClass, ExtensionalValue_locus_ExtensionalValue_Value.class, "ExtensionalValue_locus_ExtensionalValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionalValue_locus_ExtensionalValue_Value_Locus_ExtensionalValue(), theLociPackage.getTracedLocus(), null, "locus_ExtensionalValue", null, 0, 1, ExtensionalValue_locus_ExtensionalValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionalValue_locus_ExtensionalValue_Value_Parent(), theKernelPackage.getTracedExtensionalValue(), theKernelPackage.getTracedExtensionalValue_Locus_ExtensionalValueSequence(), "parent", null, 1, 1, ExtensionalValue_locus_ExtensionalValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionalValue_locus_ExtensionalValue_Value_States(), this.getState(), this.getState_ExtensionalValue_locus_ExtensionalValue_Values(), "states", null, 1, -1, ExtensionalValue_locus_ExtensionalValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExtensionalValue_locus_ExtensionalValue_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureValue_feature_ValueEClass, FeatureValue_feature_Value.class, "FeatureValue_feature_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_feature_Value_Feature(), theUmlPackage.getTracedStructuralFeature(), null, "feature", null, 1, 1, FeatureValue_feature_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValue_feature_Value_Parent(), theKernelPackage.getTracedFeatureValue(), theKernelPackage.getTracedFeatureValue_FeatureSequence(), "parent", null, 1, 1, FeatureValue_feature_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValue_feature_Value_States(), this.getState(), this.getState_FeatureValue_feature_Values(), "states", null, 1, -1, FeatureValue_feature_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeatureValue_feature_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureValue_position_ValueEClass, FeatureValue_position_Value.class, "FeatureValue_position_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_position_Value_Parent(), theKernelPackage.getTracedFeatureValue(), theKernelPackage.getTracedFeatureValue_PositionSequence(), "parent", null, 1, 1, FeatureValue_position_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureValue_position_Value_Position(), ecorePackage.getEInt(), "position", null, 0, 1, FeatureValue_position_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValue_position_Value_States(), this.getState(), this.getState_FeatureValue_position_Values(), "states", null, 1, -1, FeatureValue_position_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeatureValue_position_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureValue_values_FeatureValue_ValueEClass, FeatureValue_values_FeatureValue_Value.class, "FeatureValue_values_FeatureValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_values_FeatureValue_Value_Parent(), theKernelPackage.getTracedFeatureValue(), theKernelPackage.getTracedFeatureValue_Values_FeatureValueSequence(), "parent", null, 1, 1, FeatureValue_values_FeatureValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValue_values_FeatureValue_Value_States(), this.getState(), this.getState_FeatureValue_values_FeatureValue_Values(), "states", null, 1, -1, FeatureValue_values_FeatureValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValue_values_FeatureValue_Value_Values_FeatureValue(), theKernelPackage.getTracedValue(), null, "values_FeatureValue", null, 0, -1, FeatureValue_values_FeatureValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeatureValue_values_FeatureValue_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(forkedToken_baseTokenIsWithdrawn_ValueEClass, ForkedToken_baseTokenIsWithdrawn_Value.class, "ForkedToken_baseTokenIsWithdrawn_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForkedToken_baseTokenIsWithdrawn_Value_BaseTokenIsWithdrawn(), ecorePackage.getEBoolean(), "baseTokenIsWithdrawn", null, 1, 1, ForkedToken_baseTokenIsWithdrawn_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_baseTokenIsWithdrawn_Value_Parent(), theIntermediateActivitiesPackage.getTracedForkedToken(), theIntermediateActivitiesPackage.getTracedForkedToken_BaseTokenIsWithdrawnSequence(), "parent", null, 1, 1, ForkedToken_baseTokenIsWithdrawn_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_baseTokenIsWithdrawn_Value_States(), this.getState(), this.getState_ForkedToken_baseTokenIsWithdrawn_Values(), "states", null, 1, -1, ForkedToken_baseTokenIsWithdrawn_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getForkedToken_baseTokenIsWithdrawn_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(forkedToken_baseToken_ValueEClass, ForkedToken_baseToken_Value.class, "ForkedToken_baseToken_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_baseToken_Value_BaseToken(), theIntermediateActivitiesPackage.getTracedToken(), null, "baseToken", null, 1, 1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_baseToken_Value_Parent(), theIntermediateActivitiesPackage.getTracedForkedToken(), theIntermediateActivitiesPackage.getTracedForkedToken_BaseTokenSequence(), "parent", null, 1, 1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_baseToken_Value_States(), this.getState(), this.getState_ForkedToken_baseToken_Values(), "states", null, 1, -1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getForkedToken_baseToken_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(forkedToken_remainingOffersCount_ValueEClass, ForkedToken_remainingOffersCount_Value.class, "ForkedToken_remainingOffersCount_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_remainingOffersCount_Value_Parent(), theIntermediateActivitiesPackage.getTracedForkedToken(), theIntermediateActivitiesPackage.getTracedForkedToken_RemainingOffersCountSequence(), "parent", null, 1, 1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForkedToken_remainingOffersCount_Value_RemainingOffersCount(), ecorePackage.getEInt(), "remainingOffersCount", null, 1, 1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_remainingOffersCount_Value_States(), this.getState(), this.getState_ForkedToken_remainingOffersCount_Values(), "states", null, 1, -1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getForkedToken_remainingOffersCount_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputParameterValues_name_ValueEClass, InputParameterValues_name_Value.class, "InputParameterValues_name_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputParameterValues_name_Value_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputParameterValues_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputParameterValues_name_Value_Parent(), theInputPackage.getTracedInputParameterValues(), theInputPackage.getTracedInputParameterValues_NameSequence(), "parent", null, 1, 1, InputParameterValues_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputParameterValues_name_Value_States(), this.getState(), this.getState_InputParameterValues_name_Values(), "states", null, 1, -1, InputParameterValues_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInputParameterValues_name_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputParameterValues_parameterValues_ValueEClass, InputParameterValues_parameterValues_Value.class, "InputParameterValues_parameterValues_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputParameterValues_parameterValues_Value_ParameterValues(), theBasicBehaviorsPackage.getTracedParameterValue(), null, "parameterValues", null, 0, -1, InputParameterValues_parameterValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputParameterValues_parameterValues_Value_Parent(), theInputPackage.getTracedInputParameterValues(), theInputPackage.getTracedInputParameterValues_ParameterValuesSequence(), "parent", null, 1, 1, InputParameterValues_parameterValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputParameterValues_parameterValues_Value_States(), this.getState(), this.getState_InputParameterValues_parameterValues_Values(), "states", null, 1, -1, InputParameterValues_parameterValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInputParameterValues_parameterValues_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerValue_value_IntegerValue_ValueEClass, IntegerValue_value_IntegerValue_Value.class, "IntegerValue_value_IntegerValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerValue_value_IntegerValue_Value_Parent(), theKernelPackage.getTracedIntegerValue(), theKernelPackage.getTracedIntegerValue_Value_IntegerValueSequence(), "parent", null, 1, 1, IntegerValue_value_IntegerValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerValue_value_IntegerValue_Value_States(), this.getState(), this.getState_IntegerValue_value_IntegerValue_Values(), "states", null, 1, -1, IntegerValue_value_IntegerValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerValue_value_IntegerValue_Value_Value_IntegerValue(), ecorePackage.getEInt(), "value_IntegerValue", null, 1, 1, IntegerValue_value_IntegerValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIntegerValue_value_IntegerValue_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(locus_executor_ValueEClass, Locus_executor_Value.class, "Locus_executor_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocus_executor_Value_Executor(), theLociPackage.getTracedExecutor(), null, "executor", null, 0, 1, Locus_executor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocus_executor_Value_Parent(), theLociPackage.getTracedLocus(), theLociPackage.getTracedLocus_ExecutorSequence(), "parent", null, 1, 1, Locus_executor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocus_executor_Value_States(), this.getState(), this.getState_Locus_executor_Values(), "states", null, 1, -1, Locus_executor_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLocus_executor_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(locus_extensionalValues_ValueEClass, Locus_extensionalValues_Value.class, "Locus_extensionalValues_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocus_extensionalValues_Value_ExtensionalValues(), theKernelPackage.getTracedExtensionalValue(), null, "extensionalValues", null, 0, -1, Locus_extensionalValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocus_extensionalValues_Value_Parent(), theLociPackage.getTracedLocus(), theLociPackage.getTracedLocus_ExtensionalValuesSequence(), "parent", null, 1, 1, Locus_extensionalValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocus_extensionalValues_Value_States(), this.getState(), this.getState_Locus_extensionalValues_Values(), "states", null, 1, -1, Locus_extensionalValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLocus_extensionalValues_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(locus_factory_ValueEClass, Locus_factory_Value.class, "Locus_factory_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocus_factory_Value_Factory(), theLociPackage.getTracedExecutionFactory(), null, "factory", null, 0, 1, Locus_factory_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocus_factory_Value_Parent(), theLociPackage.getTracedLocus(), theLociPackage.getTracedLocus_FactorySequence(), "parent", null, 1, 1, Locus_factory_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocus_factory_Value_States(), this.getState(), this.getState_Locus_factory_Values(), "states", null, 1, -1, Locus_factory_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLocus_factory_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectNodeActivation_offeredTokenCount_ValueEClass, ObjectNodeActivation_offeredTokenCount_Value.class, "ObjectNodeActivation_offeredTokenCount_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectNodeActivation_offeredTokenCount_Value_OfferedTokenCount(), ecorePackage.getEInt(), "offeredTokenCount", null, 1, 1, ObjectNodeActivation_offeredTokenCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectNodeActivation_offeredTokenCount_Value_Parent(), theIntermediateActivitiesPackage.getTracedObjectNodeActivation(), theIntermediateActivitiesPackage.getTracedObjectNodeActivation_OfferedTokenCountSequence(), "parent", null, 1, 1, ObjectNodeActivation_offeredTokenCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectNodeActivation_offeredTokenCount_Value_States(), this.getState(), this.getState_ObjectNodeActivation_offeredTokenCount_Values(), "states", null, 1, -1, ObjectNodeActivation_offeredTokenCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObjectNodeActivation_offeredTokenCount_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectToken_value_ValueEClass, ObjectToken_value_Value.class, "ObjectToken_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectToken_value_Value_Parent(), theIntermediateActivitiesPackage.getTracedObjectToken(), theIntermediateActivitiesPackage.getTracedObjectToken_ValueSequence(), "parent", null, 1, 1, ObjectToken_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectToken_value_Value_States(), this.getState(), this.getState_ObjectToken_value_Values(), "states", null, 1, -1, ObjectToken_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectToken_value_Value_Value(), theKernelPackage.getTracedValue(), null, "value", null, 0, 1, ObjectToken_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObjectToken_value_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(object_types_ValueEClass, Object_types_Value.class, "Object_types_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_types_Value_Parent(), theKernelPackage.getTracedObject(), theKernelPackage.getTracedObject_TypesSequence(), "parent", null, 1, 1, Object_types_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_types_Value_States(), this.getState(), this.getState_Object_types_Values(), "states", null, 1, -1, Object_types_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_types_Value_Types(), theUmlPackage.getTracedClass(), null, "types", null, 0, -1, Object_types_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObject_types_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(offer_offeredTokens_ValueEClass, Offer_offeredTokens_Value.class, "Offer_offeredTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffer_offeredTokens_Value_OfferedTokens(), theIntermediateActivitiesPackage.getTracedToken(), null, "offeredTokens", null, 0, -1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_offeredTokens_Value_Parent(), theIntermediateActivitiesPackage.getTracedOffer(), theIntermediateActivitiesPackage.getTracedOffer_OfferedTokensSequence(), "parent", null, 1, 1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_offeredTokens_Value_States(), this.getState(), this.getState_Offer_offeredTokens_Values(), "states", null, 1, -1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOffer_offeredTokens_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterValue_parameter_ParameterValue_ValueEClass, ParameterValue_parameter_ParameterValue_Value.class, "ParameterValue_parameter_ParameterValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_parameter_ParameterValue_Value_Parameter_ParameterValue(), theUmlPackage.getTracedParameter(), null, "parameter_ParameterValue", null, 1, 1, ParameterValue_parameter_ParameterValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_parameter_ParameterValue_Value_Parent(), theBasicBehaviorsPackage.getTracedParameterValue(), theBasicBehaviorsPackage.getTracedParameterValue_Parameter_ParameterValueSequence(), "parent", null, 1, 1, ParameterValue_parameter_ParameterValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_parameter_ParameterValue_Value_States(), this.getState(), this.getState_ParameterValue_parameter_ParameterValue_Values(), "states", null, 1, -1, ParameterValue_parameter_ParameterValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameterValue_parameter_ParameterValue_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterValue_values_ParameterValue_ValueEClass, ParameterValue_values_ParameterValue_Value.class, "ParameterValue_values_ParameterValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_values_ParameterValue_Value_Parent(), theBasicBehaviorsPackage.getTracedParameterValue(), theBasicBehaviorsPackage.getTracedParameterValue_Values_ParameterValueSequence(), "parent", null, 1, 1, ParameterValue_values_ParameterValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_values_ParameterValue_Value_States(), this.getState(), this.getState_ParameterValue_values_ParameterValue_Values(), "states", null, 1, -1, ParameterValue_values_ParameterValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_values_ParameterValue_Value_Values_ParameterValue(), theKernelPackage.getTracedValue(), null, "values_ParameterValue", null, 0, -1, ParameterValue_values_ParameterValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameterValue_values_ParameterValue_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(pinActivation_actionActivation_ValueEClass, PinActivation_actionActivation_Value.class, "PinActivation_actionActivation_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPinActivation_actionActivation_Value_ActionActivation(), theBasicActionsPackage.getTracedActionActivation(), null, "actionActivation", null, 0, 1, PinActivation_actionActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPinActivation_actionActivation_Value_Parent(), theBasicActionsPackage.getTracedPinActivation(), theBasicActionsPackage.getTracedPinActivation_ActionActivationSequence(), "parent", null, 1, 1, PinActivation_actionActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPinActivation_actionActivation_Value_States(), this.getState(), this.getState_PinActivation_actionActivation_Values(), "states", null, 1, -1, PinActivation_actionActivation_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPinActivation_actionActivation_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(pinActivation_count_temp_ValueEClass, PinActivation_count_temp_Value.class, "PinActivation_count_temp_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPinActivation_count_temp_Value_Count_temp(), ecorePackage.getEInt(), "count_temp", null, 0, 1, PinActivation_count_temp_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPinActivation_count_temp_Value_Parent(), theBasicActionsPackage.getTracedPinActivation(), theBasicActionsPackage.getTracedPinActivation_Count_tempSequence(), "parent", null, 1, 1, PinActivation_count_temp_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPinActivation_count_temp_Value_States(), this.getState(), this.getState_PinActivation_count_temp_Values(), "states", null, 1, -1, PinActivation_count_temp_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPinActivation_count_temp_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(primitiveValue_type_ValueEClass, PrimitiveValue_type_Value.class, "PrimitiveValue_type_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveValue_type_Value_Parent(), theKernelPackage.getTracedPrimitiveValue(), theKernelPackage.getTracedPrimitiveValue_TypeSequence(), "parent", null, 1, 1, PrimitiveValue_type_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveValue_type_Value_States(), this.getState(), this.getState_PrimitiveValue_type_Values(), "states", null, 1, -1, PrimitiveValue_type_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveValue_type_Value_Type(), theUmlPackage.getTracedPrimitiveType(), null, "type", null, 1, 1, PrimitiveValue_type_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPrimitiveValue_type_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(reference_referent_ValueEClass, Reference_referent_Value.class, "Reference_referent_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_referent_Value_Parent(), theKernelPackage.getTracedReference(), theKernelPackage.getTracedReference_ReferentSequence(), "parent", null, 1, 1, Reference_referent_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_referent_Value_Referent(), theKernelPackage.getTracedObject(), null, "referent", null, 1, 1, Reference_referent_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_referent_Value_States(), this.getState(), this.getState_Reference_referent_Values(), "states", null, 1, -1, Reference_referent_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReference_referent_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(semanticVisitor_runtimeModelElement_ValueEClass, SemanticVisitor_runtimeModelElement_Value.class, "SemanticVisitor_runtimeModelElement_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticVisitor_runtimeModelElement_Value_Parent(), theLociPackage.getTracedSemanticVisitor(), theLociPackage.getTracedSemanticVisitor_RuntimeModelElementSequence(), "parent", null, 1, 1, SemanticVisitor_runtimeModelElement_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement(), theFumlConfigurationPackage_1.getTracedElementConfiguration(), null, "runtimeModelElement", null, 0, 1, SemanticVisitor_runtimeModelElement_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticVisitor_runtimeModelElement_Value_States(), this.getState(), this.getState_SemanticVisitor_runtimeModelElement_Values(), "states", null, 1, -1, SemanticVisitor_runtimeModelElement_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSemanticVisitor_runtimeModelElement_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_ActionActivation_firing_Values(), this.getActionActivation_firing_Value(), this.getActionActivation_firing_Value_States(), "actionActivation_firing_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActionActivation_pinActivations_Values(), this.getActionActivation_pinActivations_Value(), this.getActionActivation_pinActivations_Value_States(), "actionActivation_pinActivations_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityEdgeInstance_edge_ActivityEdgeInstance_Values(), this.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value(), this.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_States(), "activityEdgeInstance_edge_ActivityEdgeInstance_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityEdgeInstance_group_ActivityEdgeInstance_Values(), this.getActivityEdgeInstance_group_ActivityEdgeInstance_Value(), this.getActivityEdgeInstance_group_ActivityEdgeInstance_Value_States(), "activityEdgeInstance_group_ActivityEdgeInstance_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityEdgeInstance_offers_Values(), this.getActivityEdgeInstance_offers_Value(), this.getActivityEdgeInstance_offers_Value_States(), "activityEdgeInstance_offers_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityEdgeInstance_source_Values(), this.getActivityEdgeInstance_source_Value(), this.getActivityEdgeInstance_source_Value_States(), "activityEdgeInstance_source_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityEdgeInstance_target_Values(), this.getActivityEdgeInstance_target_Value(), this.getActivityEdgeInstance_target_Value_States(), "activityEdgeInstance_target_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityExecution_activationGroup_Values(), this.getActivityExecution_activationGroup_Value(), this.getActivityExecution_activationGroup_Value_States(), "activityExecution_activationGroup_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivationGroup_activityExecution_Values(), this.getActivityNodeActivationGroup_activityExecution_Value(), this.getActivityNodeActivationGroup_activityExecution_Value_States(), "activityNodeActivationGroup_activityExecution_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivationGroup_edgeInstances_Values(), this.getActivityNodeActivationGroup_edgeInstances_Value(), this.getActivityNodeActivationGroup_edgeInstances_Value_States(), "activityNodeActivationGroup_edgeInstances_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivationGroup_nodeActivations_Values(), this.getActivityNodeActivationGroup_nodeActivations_Value(), this.getActivityNodeActivationGroup_nodeActivations_Value_States(), "activityNodeActivationGroup_nodeActivations_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivation_group_ActivityNodeActivation_Values(), this.getActivityNodeActivation_group_ActivityNodeActivation_Value(), this.getActivityNodeActivation_group_ActivityNodeActivation_Value_States(), "activityNodeActivation_group_ActivityNodeActivation_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivation_heldTokens_Values(), this.getActivityNodeActivation_heldTokens_Value(), this.getActivityNodeActivation_heldTokens_Value_States(), "activityNodeActivation_heldTokens_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivation_incomingEdges_Values(), this.getActivityNodeActivation_incomingEdges_Value(), this.getActivityNodeActivation_incomingEdges_Value_States(), "activityNodeActivation_incomingEdges_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivation_isRunning_Values(), this.getActivityNodeActivation_isRunning_Value(), this.getActivityNodeActivation_isRunning_Value_States(), "activityNodeActivation_isRunning_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivation_node_ActivityNodeActivation_Values(), this.getActivityNodeActivation_node_ActivityNodeActivation_Value(), this.getActivityNodeActivation_node_ActivityNodeActivation_Value_States(), "activityNodeActivation_node_ActivityNodeActivation_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivation_outgoingEdges_Values(), this.getActivityNodeActivation_outgoingEdges_Value(), this.getActivityNodeActivation_outgoingEdges_Value_States(), "activityNodeActivation_outgoingEdges_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNodeActivation_running_Values(), this.getActivityNodeActivation_running_Value(), this.getActivityNodeActivation_running_Value_States(), "activityNodeActivation_running_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_BooleanValue_value_BooleanValue_Values(), this.getBooleanValue_value_BooleanValue_Value(), this.getBooleanValue_value_BooleanValue_Value_States(), "booleanValue_value_BooleanValue_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_CallActionActivation_callExecutions_Values(), this.getCallActionActivation_callExecutions_Value(), this.getCallActionActivation_callExecutions_Value_States(), "callActionActivation_callExecutions_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_CompoundValue_featureValues_Values(), this.getCompoundValue_featureValues_Value(), this.getCompoundValue_featureValues_Value_States(), "compoundValue_featureValues_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ElementConfiguration_semanticVisitor_Values(), this.getElementConfiguration_semanticVisitor_Value(), this.getElementConfiguration_semanticVisitor_Value_States(), "elementConfiguration_semanticVisitor_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_EndedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Evaluation_locus_Evaluation_Values(), this.getEvaluation_locus_Evaluation_Value(), this.getEvaluation_locus_Evaluation_Value_States(), "evaluation_locus_Evaluation_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Evaluation_specification_Evaluation_Values(), this.getEvaluation_specification_Evaluation_Value(), this.getEvaluation_specification_Evaluation_Value_States(), "evaluation_specification_Evaluation_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ExecutionEnvironment_locus_ExecutionEnvironment_Values(), this.getExecutionEnvironment_locus_ExecutionEnvironment_Value(), this.getExecutionEnvironment_locus_ExecutionEnvironment_Value_States(), "executionEnvironment_locus_ExecutionEnvironment_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ExecutionFactory_builtInTypes_Values(), this.getExecutionFactory_builtInTypes_Value(), this.getExecutionFactory_builtInTypes_Value_States(), "executionFactory_builtInTypes_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ExecutionFactory_locus_ExecutionFactory_Values(), this.getExecutionFactory_locus_ExecutionFactory_Value(), this.getExecutionFactory_locus_ExecutionFactory_Value_States(), "executionFactory_locus_ExecutionFactory_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ExecutionFactory_primitiveBehaviorPrototypes_Values(), this.getExecutionFactory_primitiveBehaviorPrototypes_Value(), this.getExecutionFactory_primitiveBehaviorPrototypes_Value_States(), "executionFactory_primitiveBehaviorPrototypes_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Execution_context_Values(), this.getExecution_context_Value(), this.getExecution_context_Value_States(), "execution_context_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Execution_parameterValues_Values(), this.getExecution_parameterValues_Value(), this.getExecution_parameterValues_Value_States(), "execution_parameterValues_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Executor_locus_Executor_Values(), this.getExecutor_locus_Executor_Value(), this.getExecutor_locus_Executor_Value_States(), "executor_locus_Executor_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ExtensionalValue_locus_ExtensionalValue_Values(), this.getExtensionalValue_locus_ExtensionalValue_Value(), this.getExtensionalValue_locus_ExtensionalValue_Value_States(), "extensionalValue_locus_ExtensionalValue_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FeatureValue_feature_Values(), this.getFeatureValue_feature_Value(), this.getFeatureValue_feature_Value_States(), "featureValue_feature_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FeatureValue_position_Values(), this.getFeatureValue_position_Value(), this.getFeatureValue_position_Value_States(), "featureValue_position_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FeatureValue_values_FeatureValue_Values(), this.getFeatureValue_values_FeatureValue_Value(), this.getFeatureValue_values_FeatureValue_Value_States(), "featureValue_values_FeatureValue_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ForkedToken_baseTokenIsWithdrawn_Values(), this.getForkedToken_baseTokenIsWithdrawn_Value(), this.getForkedToken_baseTokenIsWithdrawn_Value_States(), "forkedToken_baseTokenIsWithdrawn_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ForkedToken_baseToken_Values(), this.getForkedToken_baseToken_Value(), this.getForkedToken_baseToken_Value_States(), "forkedToken_baseToken_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ForkedToken_remainingOffersCount_Values(), this.getForkedToken_remainingOffersCount_Value(), this.getForkedToken_remainingOffersCount_Value_States(), "forkedToken_remainingOffersCount_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_InputParameterValues_name_Values(), this.getInputParameterValues_name_Value(), this.getInputParameterValues_name_Value_States(), "inputParameterValues_name_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_InputParameterValues_parameterValues_Values(), this.getInputParameterValues_parameterValues_Value(), this.getInputParameterValues_parameterValues_Value_States(), "inputParameterValues_parameterValues_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_IntegerValue_value_IntegerValue_Values(), this.getIntegerValue_value_IntegerValue_Value(), this.getIntegerValue_value_IntegerValue_Value_States(), "integerValue_value_IntegerValue_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Locus_executor_Values(), this.getLocus_executor_Value(), this.getLocus_executor_Value_States(), "locus_executor_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Locus_extensionalValues_Values(), this.getLocus_extensionalValues_Value(), this.getLocus_extensionalValues_Value_States(), "locus_extensionalValues_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Locus_factory_Values(), this.getLocus_factory_Value(), this.getLocus_factory_Value_States(), "locus_factory_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ObjectNodeActivation_offeredTokenCount_Values(), this.getObjectNodeActivation_offeredTokenCount_Value(), this.getObjectNodeActivation_offeredTokenCount_Value_States(), "objectNodeActivation_offeredTokenCount_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ObjectToken_value_Values(), this.getObjectToken_value_Value(), this.getObjectToken_value_Value_States(), "objectToken_value_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Object_types_Values(), this.getObject_types_Value(), this.getObject_types_Value_States(), "object_types_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Offer_offeredTokens_Values(), this.getOffer_offeredTokens_Value(), this.getOffer_offeredTokens_Value_States(), "offer_offeredTokens_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ParameterValue_parameter_ParameterValue_Values(), this.getParameterValue_parameter_ParameterValue_Value(), this.getParameterValue_parameter_ParameterValue_Value_States(), "parameterValue_parameter_ParameterValue_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ParameterValue_values_ParameterValue_Values(), this.getParameterValue_values_ParameterValue_Value(), this.getParameterValue_values_ParameterValue_Value_States(), "parameterValue_values_ParameterValue_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_PinActivation_actionActivation_Values(), this.getPinActivation_actionActivation_Value(), this.getPinActivation_actionActivation_Value_States(), "pinActivation_actionActivation_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_PinActivation_count_temp_Values(), this.getPinActivation_count_temp_Value(), this.getPinActivation_count_temp_Value_States(), "pinActivation_count_temp_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_PrimitiveValue_type_Values(), this.getPrimitiveValue_type_Value(), this.getPrimitiveValue_type_Value_States(), "primitiveValue_type_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Reference_referent_Values(), this.getReference_referent_Value(), this.getReference_referent_Value_States(), "reference_referent_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_SemanticVisitor_runtimeModelElement_Values(), this.getSemanticVisitor_runtimeModelElement_Value(), this.getSemanticVisitor_runtimeModelElement_Value_States(), "semanticVisitor_runtimeModelElement_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Token_holder_Values(), this.getToken_holder_Value(), this.getToken_holder_Value_States(), "token_holder_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(token_holder_ValueEClass, Token_holder_Value.class, "Token_holder_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_holder_Value_Holder(), theIntermediateActivitiesPackage.getTracedActivityNodeActivation(), null, "holder", null, 0, 1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_holder_Value_Parent(), theIntermediateActivitiesPackage.getTracedToken(), theIntermediateActivitiesPackage.getTracedToken_HolderSequence(), "parent", null, 1, 1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_holder_Value_States(), this.getState(), this.getState_Token_holder_Values(), "states", null, 1, -1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getToken_holder_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_StatesNoOpposite(), this.getState(), null, "statesNoOpposite", null, 1, -1, Value.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (actionActivation_firing_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/ActionActivation/firing"
		   });	
		addAnnotation
		  (getActionActivation_firing_Value_Firing(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/ActionActivation/firing"
		   });	
		addAnnotation
		  (actionActivation_pinActivations_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/ActionActivation/pinActivations"
		   });	
		addAnnotation
		  (getActionActivation_pinActivations_Value_PinActivations(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/ActionActivation/pinActivations"
		   });	
		addAnnotation
		  (activityEdgeInstance_edge_ActivityEdgeInstance_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/edge_ActivityEdgeInstance"
		   });	
		addAnnotation
		  (getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Edge_ActivityEdgeInstance(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/edge_ActivityEdgeInstance"
		   });	
		addAnnotation
		  (activityEdgeInstance_group_ActivityEdgeInstance_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/group_ActivityEdgeInstance"
		   });	
		addAnnotation
		  (getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Group_ActivityEdgeInstance(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/group_ActivityEdgeInstance"
		   });	
		addAnnotation
		  (activityEdgeInstance_offers_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/offers"
		   });	
		addAnnotation
		  (getActivityEdgeInstance_offers_Value_Offers(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/offers"
		   });	
		addAnnotation
		  (activityEdgeInstance_source_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/source"
		   });	
		addAnnotation
		  (getActivityEdgeInstance_source_Value_Source(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/source"
		   });	
		addAnnotation
		  (activityEdgeInstance_target_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/target"
		   });	
		addAnnotation
		  (getActivityEdgeInstance_target_Value_Target(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance/target"
		   });	
		addAnnotation
		  (activityExecution_activationGroup_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityExecution/activationGroup"
		   });	
		addAnnotation
		  (getActivityExecution_activationGroup_Value_ActivationGroup(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityExecution/activationGroup"
		   });	
		addAnnotation
		  (activityNodeActivationGroup_activityExecution_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivationGroup/activityExecution"
		   });	
		addAnnotation
		  (getActivityNodeActivationGroup_activityExecution_Value_ActivityExecution(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivationGroup/activityExecution"
		   });	
		addAnnotation
		  (activityNodeActivationGroup_edgeInstances_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivationGroup/edgeInstances"
		   });	
		addAnnotation
		  (getActivityNodeActivationGroup_edgeInstances_Value_EdgeInstances(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivationGroup/edgeInstances"
		   });	
		addAnnotation
		  (activityNodeActivationGroup_nodeActivations_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivationGroup/nodeActivations"
		   });	
		addAnnotation
		  (getActivityNodeActivationGroup_nodeActivations_Value_NodeActivations(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivationGroup/nodeActivations"
		   });	
		addAnnotation
		  (activityNodeActivation_group_ActivityNodeActivation_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/group_ActivityNodeActivation"
		   });	
		addAnnotation
		  (getActivityNodeActivation_group_ActivityNodeActivation_Value_Group_ActivityNodeActivation(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/group_ActivityNodeActivation"
		   });	
		addAnnotation
		  (activityNodeActivation_heldTokens_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/heldTokens"
		   });	
		addAnnotation
		  (getActivityNodeActivation_heldTokens_Value_HeldTokens(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/heldTokens"
		   });	
		addAnnotation
		  (activityNodeActivation_incomingEdges_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/incomingEdges"
		   });	
		addAnnotation
		  (getActivityNodeActivation_incomingEdges_Value_IncomingEdges(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/incomingEdges"
		   });	
		addAnnotation
		  (activityNodeActivation_isRunning_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/isRunning.1"
		   });	
		addAnnotation
		  (getActivityNodeActivation_isRunning_Value_IsRunning(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/isRunning.1"
		   });	
		addAnnotation
		  (activityNodeActivation_node_ActivityNodeActivation_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/node_ActivityNodeActivation"
		   });	
		addAnnotation
		  (getActivityNodeActivation_node_ActivityNodeActivation_Value_Node_ActivityNodeActivation(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/node_ActivityNodeActivation"
		   });	
		addAnnotation
		  (activityNodeActivation_outgoingEdges_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/outgoingEdges"
		   });	
		addAnnotation
		  (getActivityNodeActivation_outgoingEdges_Value_OutgoingEdges(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/outgoingEdges"
		   });	
		addAnnotation
		  (activityNodeActivation_running_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/running"
		   });	
		addAnnotation
		  (getActivityNodeActivation_running_Value_Running(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation/running"
		   });	
		addAnnotation
		  (booleanValue_value_BooleanValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/BooleanValue/value_BooleanValue"
		   });	
		addAnnotation
		  (getBooleanValue_value_BooleanValue_Value_Value_BooleanValue(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/BooleanValue/value_BooleanValue"
		   });	
		addAnnotation
		  (callActionActivation_callExecutions_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/CallActionActivation/callExecutions"
		   });	
		addAnnotation
		  (getCallActionActivation_callExecutions_Value_CallExecutions(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/CallActionActivation/callExecutions"
		   });	
		addAnnotation
		  (compoundValue_featureValues_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/CompoundValue/featureValues"
		   });	
		addAnnotation
		  (getCompoundValue_featureValues_Value_FeatureValues(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/CompoundValue/featureValues"
		   });	
		addAnnotation
		  (elementConfiguration_semanticVisitor_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//ElementConfiguration/semanticVisitor"
		   });	
		addAnnotation
		  (getElementConfiguration_semanticVisitor_Value_SemanticVisitor(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//ElementConfiguration/semanticVisitor"
		   });	
		addAnnotation
		  (evaluation_locus_Evaluation_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Evaluation/locus_Evaluation"
		   });	
		addAnnotation
		  (getEvaluation_locus_Evaluation_Value_Locus_Evaluation(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Evaluation/locus_Evaluation"
		   });	
		addAnnotation
		  (evaluation_specification_Evaluation_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Evaluation/specification_Evaluation"
		   });	
		addAnnotation
		  (getEvaluation_specification_Evaluation_Value_Specification_Evaluation(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Evaluation/specification_Evaluation"
		   });	
		addAnnotation
		  (executionEnvironment_locus_ExecutionEnvironment_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionEnvironment/locus_ExecutionEnvironment"
		   });	
		addAnnotation
		  (getExecutionEnvironment_locus_ExecutionEnvironment_Value_Locus_ExecutionEnvironment(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionEnvironment/locus_ExecutionEnvironment"
		   });	
		addAnnotation
		  (executionFactory_builtInTypes_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionFactory/builtInTypes"
		   });	
		addAnnotation
		  (getExecutionFactory_builtInTypes_Value_BuiltInTypes(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionFactory/builtInTypes"
		   });	
		addAnnotation
		  (executionFactory_locus_ExecutionFactory_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionFactory/locus_ExecutionFactory"
		   });	
		addAnnotation
		  (getExecutionFactory_locus_ExecutionFactory_Value_Locus_ExecutionFactory(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionFactory/locus_ExecutionFactory"
		   });	
		addAnnotation
		  (executionFactory_primitiveBehaviorPrototypes_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionFactory/primitiveBehaviorPrototypes"
		   });	
		addAnnotation
		  (getExecutionFactory_primitiveBehaviorPrototypes_Value_PrimitiveBehaviorPrototypes(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/ExecutionFactory/primitiveBehaviorPrototypes"
		   });	
		addAnnotation
		  (execution_context_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/Execution/context"
		   });	
		addAnnotation
		  (getExecution_context_Value_Context(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/Execution/context"
		   });	
		addAnnotation
		  (execution_parameterValues_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/Execution/parameterValues"
		   });	
		addAnnotation
		  (getExecution_parameterValues_Value_ParameterValues(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/Execution/parameterValues"
		   });	
		addAnnotation
		  (executor_locus_Executor_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Executor/locus_Executor"
		   });	
		addAnnotation
		  (getExecutor_locus_Executor_Value_Locus_Executor(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Executor/locus_Executor"
		   });	
		addAnnotation
		  (extensionalValue_locus_ExtensionalValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/ExtensionalValue/locus_ExtensionalValue"
		   });	
		addAnnotation
		  (getExtensionalValue_locus_ExtensionalValue_Value_Locus_ExtensionalValue(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/ExtensionalValue/locus_ExtensionalValue"
		   });	
		addAnnotation
		  (featureValue_feature_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/FeatureValue/feature"
		   });	
		addAnnotation
		  (getFeatureValue_feature_Value_Feature(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/FeatureValue/feature"
		   });	
		addAnnotation
		  (featureValue_position_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/FeatureValue/position"
		   });	
		addAnnotation
		  (getFeatureValue_position_Value_Position(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/FeatureValue/position"
		   });	
		addAnnotation
		  (featureValue_values_FeatureValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/FeatureValue/values_FeatureValue"
		   });	
		addAnnotation
		  (getFeatureValue_values_FeatureValue_Value_Values_FeatureValue(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/FeatureValue/values_FeatureValue"
		   });	
		addAnnotation
		  (forkedToken_baseTokenIsWithdrawn_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ForkedToken/baseTokenIsWithdrawn"
		   });	
		addAnnotation
		  (getForkedToken_baseTokenIsWithdrawn_Value_BaseTokenIsWithdrawn(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ForkedToken/baseTokenIsWithdrawn"
		   });	
		addAnnotation
		  (forkedToken_baseToken_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ForkedToken/baseToken"
		   });	
		addAnnotation
		  (getForkedToken_baseToken_Value_BaseToken(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ForkedToken/baseToken"
		   });	
		addAnnotation
		  (forkedToken_remainingOffersCount_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ForkedToken/remainingOffersCount"
		   });	
		addAnnotation
		  (getForkedToken_remainingOffersCount_Value_RemainingOffersCount(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ForkedToken/remainingOffersCount"
		   });	
		addAnnotation
		  (inputParameterValues_name_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Input/InputParameterValues/name"
		   });	
		addAnnotation
		  (getInputParameterValues_name_Value_Name(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Input/InputParameterValues/name"
		   });	
		addAnnotation
		  (inputParameterValues_parameterValues_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Input/InputParameterValues/parameterValues"
		   });	
		addAnnotation
		  (getInputParameterValues_parameterValues_Value_ParameterValues(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Input/InputParameterValues/parameterValues"
		   });	
		addAnnotation
		  (integerValue_value_IntegerValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/IntegerValue/value_IntegerValue"
		   });	
		addAnnotation
		  (getIntegerValue_value_IntegerValue_Value_Value_IntegerValue(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/IntegerValue/value_IntegerValue"
		   });	
		addAnnotation
		  (locus_executor_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Locus/executor"
		   });	
		addAnnotation
		  (getLocus_executor_Value_Executor(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Locus/executor"
		   });	
		addAnnotation
		  (locus_extensionalValues_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Locus/extensionalValues"
		   });	
		addAnnotation
		  (getLocus_extensionalValues_Value_ExtensionalValues(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Locus/extensionalValues"
		   });	
		addAnnotation
		  (locus_factory_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Locus/factory"
		   });	
		addAnnotation
		  (getLocus_factory_Value_Factory(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/Locus/factory"
		   });	
		addAnnotation
		  (objectNodeActivation_offeredTokenCount_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ObjectNodeActivation/offeredTokenCount"
		   });	
		addAnnotation
		  (getObjectNodeActivation_offeredTokenCount_Value_OfferedTokenCount(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ObjectNodeActivation/offeredTokenCount"
		   });	
		addAnnotation
		  (objectToken_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ObjectToken/value"
		   });	
		addAnnotation
		  (getObjectToken_value_Value_Value(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ObjectToken/value"
		   });	
		addAnnotation
		  (object_types_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Object/types"
		   });	
		addAnnotation
		  (getObject_types_Value_Types(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Object/types"
		   });	
		addAnnotation
		  (offer_offeredTokens_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/Offer/offeredTokens"
		   });	
		addAnnotation
		  (getOffer_offeredTokens_Value_OfferedTokens(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/Offer/offeredTokens"
		   });	
		addAnnotation
		  (parameterValue_parameter_ParameterValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/ParameterValue/parameter_ParameterValue"
		   });	
		addAnnotation
		  (getParameterValue_parameter_ParameterValue_Value_Parameter_ParameterValue(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/ParameterValue/parameter_ParameterValue"
		   });	
		addAnnotation
		  (parameterValue_values_ParameterValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/ParameterValue/values_ParameterValue"
		   });	
		addAnnotation
		  (getParameterValue_values_ParameterValue_Value_Values_ParameterValue(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//CommonBehaviors/BasicBehaviors/ParameterValue/values_ParameterValue"
		   });	
		addAnnotation
		  (pinActivation_actionActivation_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/PinActivation/actionActivation"
		   });	
		addAnnotation
		  (getPinActivation_actionActivation_Value_ActionActivation(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/PinActivation/actionActivation"
		   });	
		addAnnotation
		  (pinActivation_count_temp_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/PinActivation/count_temp"
		   });	
		addAnnotation
		  (getPinActivation_count_temp_Value_Count_temp(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Actions/BasicActions/PinActivation/count_temp"
		   });	
		addAnnotation
		  (primitiveValue_type_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/PrimitiveValue/type"
		   });	
		addAnnotation
		  (getPrimitiveValue_type_Value_Type(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/PrimitiveValue/type"
		   });	
		addAnnotation
		  (reference_referent_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Reference/referent"
		   });	
		addAnnotation
		  (getReference_referent_Value_Referent(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Classes/Kernel/Reference/referent"
		   });	
		addAnnotation
		  (semanticVisitor_runtimeModelElement_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/SemanticVisitor/runtimeModelElement"
		   });	
		addAnnotation
		  (getSemanticVisitor_runtimeModelElement_Value_RuntimeModelElement(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Loci/SemanticVisitor/runtimeModelElement"
		   });	
		addAnnotation
		  (token_holder_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/Token/holder"
		   });	
		addAnnotation
		  (getToken_holder_Value_Holder(), 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/Token/holder"
		   });
	}

} //StatesPackageImpl
