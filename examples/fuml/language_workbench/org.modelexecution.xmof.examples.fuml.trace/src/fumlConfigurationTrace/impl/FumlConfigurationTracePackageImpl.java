/**
 */
package fumlConfigurationTrace.impl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import fumlConfiguration.FumlConfigurationPackage;

import fumlConfigurationTrace.FumlConfigurationTraceFactory;
import fumlConfigurationTrace.FumlConfigurationTracePackage;

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

import fumlConfigurationTrace.States.impl.StatesPackageImpl;

import fumlConfigurationTrace.Steps.StepsPackage;

import fumlConfigurationTrace.Steps.impl.StepsPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FumlConfigurationTracePackageImpl extends EPackageImpl implements FumlConfigurationTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "fumlConfigurationTrace.ecore";

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
	 * @see fumlConfigurationTrace.FumlConfigurationTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FumlConfigurationTracePackageImpl() {
		super(eNS_URI, FumlConfigurationTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FumlConfigurationTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static FumlConfigurationTracePackage init() {
		if (isInited) return (FumlConfigurationTracePackage)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI);

		// Obtain or create and register package
		FumlConfigurationTracePackageImpl theFumlConfigurationTracePackage = (FumlConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FumlConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FumlConfigurationTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
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
		theFumlConfigurationTracePackage.fixPackageContents();
		theStepsPackage.fixPackageContents();
		theStatesPackage.fixPackageContents();
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
		theFumlConfigurationTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FumlConfigurationTracePackage.eNS_URI, theFumlConfigurationTracePackage);
		return theFumlConfigurationTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTrace() {
		if (specificTraceEClass == null) {
			specificTraceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI).getEClassifiers().get(0);
		}
		return specificTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_New_Object_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_New_Value_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_Executor_Execute_Executor_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Add_Locus_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Remove_Locus_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_ModelConfiguration_Main_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_BasicActions_tracedCallBehaviorActionActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_BasicActions_tracedInputPinActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_BasicActions_tracedOpaqueActionActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_BasicActions_tracedOutputPinActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_BasicBehaviors_tracedParameterValues() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedAbstractionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedAcceptCallActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedAcceptEventActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActionExecutionSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActionInputPinConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActivityConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActivityContentConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActivityEdgeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActivityFinalNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActivityGroupConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActivityNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActivityParameterNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActivityPartitionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedActorConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedAddStructuralFeatureValueActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedAddVariableValueActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedAnyReceiveEventConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedArtifactConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedAssociationClassConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedAssociationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedBehaviorConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedBehaviorExecutionSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedBehavioralFeatureConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedBehavioredClassifierConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedBroadcastSignalActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCallActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCallBehaviorActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCallEventConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCallOperationActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCentralBufferNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedChangeEventConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedClassConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedClassifierConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedClassifierTemplateParameterConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedClauseConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedClearAssociationActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedClearStructuralFeatureActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedClearVariableActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCollaborationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCollaborationUseConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCombinedFragmentConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCommentConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCommunicationPathConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedComponentConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedComponentRealizationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedConditionalNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedConnectableElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedConnectableElementTemplateParameterConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedConnectionPointReferenceConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedConnectorConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedConnectorEndConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedConsiderIgnoreFragmentConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedConstraintConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedContinuationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedControlFlowConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedControlNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCreateLinkActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCreateLinkObjectActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedCreateObjectActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDataStoreNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDataTypeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDecisionNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDependencyConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDeployedArtifactConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDeploymentConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDeploymentSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDeploymentTargetConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDestroyLinkActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDestroyObjectActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDestructionOccurrenceSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDeviceConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDirectedRelationshipConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDurationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDurationConstraintConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDurationIntervalConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedDurationObservationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedElementImportConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedEncapsulatedClassifierConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedEnumerationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedEnumerationLiteralConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedEventConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExceptionHandlerConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExecutableNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExecutionEnvironmentConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExecutionOccurrenceSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExecutionSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExpansionNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExpansionRegionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExpressionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExtendConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExtensionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExtensionEndConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedExtensionPointConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedFeatureConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedFinalNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedFinalStateConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedFlowFinalNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedForkNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedFunctionBehaviorConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedGateConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedGeneralOrderingConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedGeneralizationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedGeneralizationSetConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedImageConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedIncludeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInformationFlowConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInformationItemConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInitialNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInputPinConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInstanceSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInstanceValueConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInteractionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInteractionConstraintConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInteractionFragmentConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInteractionOperandConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInteractionUseConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInterfaceConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInterfaceRealizationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInterruptibleActivityRegionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedIntervalConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedIntervalConstraintConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedInvocationActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedJoinNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLifelineConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLinkActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLinkEndCreationDataConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLinkEndDataConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLinkEndDestructionDataConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLiteralBooleanConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLiteralIntegerConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLiteralNullConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLiteralRealConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLiteralSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLiteralStringConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLiteralUnlimitedNaturalConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedLoopNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedManifestationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedMergeNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedMessageConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedMessageEndConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedMessageEventConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedMessageOccurrenceSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedModelConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedMultiplicityElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedNamedElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedNamespaceConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedObjectFlowConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedObjectNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedObservationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedOccurrenceSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedOpaqueActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedOpaqueBehaviorConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedOpaqueExpressionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(336);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedOperationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(337);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedOperationTemplateParameterConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(338);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedOutputPinConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(339);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPackageConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(340);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPackageImportConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(341);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPackageMergeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(342);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPackageableElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(343);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedParameterConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(344);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedParameterSetConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(345);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedParameterableElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(346);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPartDecompositionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(347);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPinConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(348);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPortConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(349);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPrimitiveTypeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(350);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedProfileApplicationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(351);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedProfileConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(352);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPropertyConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(353);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedProtocolConformanceConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(354);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedProtocolStateMachineConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(355);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedProtocolTransitionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(356);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedPseudostateConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(357);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedQualifierValueConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(358);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedRaiseExceptionActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(359);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReadExtentActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(360);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReadIsClassifiedObjectActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(361);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReadLinkActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(362);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReadLinkObjectEndActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(363);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReadLinkObjectEndQualifierActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(364);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReadSelfActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(365);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReadStructuralFeatureActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(366);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReadVariableActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(367);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedRealizationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(368);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReceptionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(369);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReclassifyObjectActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(370);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedRedefinableElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(371);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedRedefinableTemplateSignatureConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(372);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReduceActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(373);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedRegionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(374);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedRelationshipConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(375);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedRemoveStructuralFeatureValueActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(376);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedRemoveVariableValueActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(377);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedReplyActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(378);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedSendObjectActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(379);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedSendSignalActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(380);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedSequenceNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(381);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedSignalConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(382);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedSignalEventConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(383);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedSlotConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(384);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStartClassifierBehaviorActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(385);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStartObjectBehaviorActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(386);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStateConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(387);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStateInvariantConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(388);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStateMachineConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(389);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStereotypeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(390);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStringExpressionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(391);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStructuralFeatureActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(392);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStructuralFeatureConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(393);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStructuredActivityNodeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(394);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedStructuredClassifierConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(395);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedSubstitutionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(396);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTemplateBindingConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(397);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTemplateParameterConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(398);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTemplateParameterSubstitutionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(399);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTemplateSignatureConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(400);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTemplateableElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(401);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTestIdentityActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(402);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTimeConstraintConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(403);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTimeEventConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(404);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTimeExpressionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(405);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTimeIntervalConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(406);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTimeObservationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(407);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTransitionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(408);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTriggerConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(409);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTypeConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(410);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedTypedElementConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(411);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedUnmarshallActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(412);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedUsageConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(413);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedUseCaseConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(414);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedValuePinConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(415);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedValueSpecificationActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(416);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedValueSpecificationConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(417);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedVariableActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(418);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedVariableConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(419);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedVertexConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(420);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedWriteLinkActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(421);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedWriteStructuralFeatureActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(422);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FumlConfiguration_tracedWriteVariableActionConfigurations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(423);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Input_tracedInputParameterValuess() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(424);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(425);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(426);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(427);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActions_tracedAddStructuralFeatureValueActionActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(428);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActions_tracedCreateObjectActionActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(429);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActions_tracedReadStructuralFeatureActionActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(430);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActions_tracedValueSpecificationActionActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(431);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedActivityEdgeInstances() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(432);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedActivityExecutions() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(433);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedActivityFinalNodeActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(434);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedActivityNodeActivationGroups() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(435);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedActivityNodeActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(436);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedActivityParameterNodeActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(437);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedControlTokens() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(438);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedDecisionNodeActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(439);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedForkNodeActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(440);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedForkedTokens() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(441);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedInitialNodeActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(442);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedJoinNodeActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(443);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedMergeNodeActivations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(444);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedObjectTokens() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(445);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedOffers() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(446);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_IntermediateActivities_tracedTokens() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(447);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Kernel_tracedBooleanValues() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(448);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Kernel_tracedIntegerValues() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(449);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Kernel_tracedLiteralBooleanEvaluations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(450);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Kernel_tracedLiteralIntegerEvaluations() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(451);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Kernel_tracedObjects() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(452);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Kernel_tracedReferences() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(453);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Loci_tracedExecutionEnvironments() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(454);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Loci_tracedExecutionFactorys() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(455);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Loci_tracedExecutors() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(456);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Loci_tracedLocuss() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(457);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Loci_tracedSemanticVisitors() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(458);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_StatesTrace() {
        return (EReference)getSpecificTrace().getEStructuralFeatures().get(459);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationTraceFactory getFumlConfigurationTraceFactory() {
		return (FumlConfigurationTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
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
			eClassifier.setInstanceClassName("fumlConfigurationTrace." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //FumlConfigurationTracePackageImpl
