/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.FumlConfigurationPackage;

import fumlConfigurationTrace.FumlConfigurationTracePackage;

import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

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

import fumlConfigurationTrace.impl.FumlConfigurationTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateActivitiesPackageImpl extends EPackageImpl implements IntermediateActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityEdgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityFinalNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityNodeActivationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityParameterNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedControlNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedControlTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDecisionNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedForkNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedForkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInitialNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedJoinNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMergeNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObjectNodeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObjectTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTokenEClass = null;

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
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateActivitiesPackageImpl() {
		super(eNS_URI, IntermediateActivitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediateActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static IntermediateActivitiesPackage init() {
		if (isInited) return (IntermediateActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateActivitiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationTracePackageImpl theFumlConfigurationTracePackage = (FumlConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI) instanceof FumlConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI) : FumlConfigurationTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FumlConfigurationPackageImpl theFumlConfigurationPackage_1 = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) : fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		IntegerFunctionsPackageImpl theIntegerFunctionsPackage = (IntegerFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) instanceof IntegerFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) : IntegerFunctionsPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationTracePackage.loadPackage();

		// Fix loaded packages
		theIntermediateActivitiesPackage.fixPackageContents();
		theFumlConfigurationTracePackage.fixPackageContents();
		theStepsPackage.fixPackageContents();
		theStatesPackage.fixPackageContents();
		theFumlConfigurationPackage_1.fixPackageContents();
		theLociPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theBasicActionsPackage.fixPackageContents();
		theIntermediateActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();
		theIntegerFunctionsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateActivitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateActivitiesPackage.eNS_URI, theIntermediateActivitiesPackage);
		return theIntermediateActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityEdgeInstance() {
		if (tracedActivityEdgeInstanceEClass == null) {
			tracedActivityEdgeInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return tracedActivityEdgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_Edge_ActivityEdgeInstanceSequence() {
        return (EReference)getTracedActivityEdgeInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_Group_ActivityEdgeInstanceSequence() {
        return (EReference)getTracedActivityEdgeInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_OffersSequence() {
        return (EReference)getTracedActivityEdgeInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_SourceSequence() {
        return (EReference)getTracedActivityEdgeInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_TargetSequence() {
        return (EReference)getTracedActivityEdgeInstance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityExecution() {
		if (tracedActivityExecutionEClass == null) {
			tracedActivityExecutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return tracedActivityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityExecution_ActivationGroupSequence() {
        return (EReference)getTracedActivityExecution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityFinalNodeActivation() {
		if (tracedActivityFinalNodeActivationEClass == null) {
			tracedActivityFinalNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return tracedActivityFinalNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityNodeActivation() {
		if (tracedActivityNodeActivationEClass == null) {
			tracedActivityNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return tracedActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_Group_ActivityNodeActivationSequence() {
        return (EReference)getTracedActivityNodeActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_HeldTokensSequence() {
        return (EReference)getTracedActivityNodeActivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_IncomingEdgesSequence() {
        return (EReference)getTracedActivityNodeActivation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_IsRunningSequence() {
        return (EReference)getTracedActivityNodeActivation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_Node_ActivityNodeActivationSequence() {
        return (EReference)getTracedActivityNodeActivation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_OutgoingEdgesSequence() {
        return (EReference)getTracedActivityNodeActivation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_RunningSequence() {
        return (EReference)getTracedActivityNodeActivation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityNodeActivationGroup() {
		if (tracedActivityNodeActivationGroupEClass == null) {
			tracedActivityNodeActivationGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return tracedActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivationGroup_ActivityExecutionSequence() {
        return (EReference)getTracedActivityNodeActivationGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivationGroup_EdgeInstancesSequence() {
        return (EReference)getTracedActivityNodeActivationGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivationGroup_NodeActivationsSequence() {
        return (EReference)getTracedActivityNodeActivationGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityParameterNodeActivation() {
		if (tracedActivityParameterNodeActivationEClass == null) {
			tracedActivityParameterNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return tracedActivityParameterNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControlNodeActivation() {
		if (tracedControlNodeActivationEClass == null) {
			tracedControlNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return tracedControlNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControlToken() {
		if (tracedControlTokenEClass == null) {
			tracedControlTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return tracedControlTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDecisionNodeActivation() {
		if (tracedDecisionNodeActivationEClass == null) {
			tracedDecisionNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return tracedDecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedForkNodeActivation() {
		if (tracedForkNodeActivationEClass == null) {
			tracedForkNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return tracedForkNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedForkedToken() {
		if (tracedForkedTokenEClass == null) {
			tracedForkedTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(10);
		}
		return tracedForkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_BaseTokenIsWithdrawnSequence() {
        return (EReference)getTracedForkedToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_BaseTokenSequence() {
        return (EReference)getTracedForkedToken().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_RemainingOffersCountSequence() {
        return (EReference)getTracedForkedToken().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInitialNodeActivation() {
		if (tracedInitialNodeActivationEClass == null) {
			tracedInitialNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return tracedInitialNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedJoinNodeActivation() {
		if (tracedJoinNodeActivationEClass == null) {
			tracedJoinNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return tracedJoinNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMergeNodeActivation() {
		if (tracedMergeNodeActivationEClass == null) {
			tracedMergeNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return tracedMergeNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjectNodeActivation() {
		if (tracedObjectNodeActivationEClass == null) {
			tracedObjectNodeActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(14);
		}
		return tracedObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjectNodeActivation_OfferedTokenCountSequence() {
        return (EReference)getTracedObjectNodeActivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjectToken() {
		if (tracedObjectTokenEClass == null) {
			tracedObjectTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return tracedObjectTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjectToken_ValueSequence() {
        return (EReference)getTracedObjectToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOffer() {
		if (tracedOfferEClass == null) {
			tracedOfferEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(16);
		}
		return tracedOfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedOffer_OfferedTokensSequence() {
        return (EReference)getTracedOffer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedToken() {
		if (tracedTokenEClass == null) {
			tracedTokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI).getEClassifiers().get(17);
		}
		return tracedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedToken_HolderSequence() {
        return (EReference)getTracedToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActivitiesFactory getIntermediateActivitiesFactory() {
		return (IntermediateActivitiesFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IntermediateActivitiesPackageImpl
