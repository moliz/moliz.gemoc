/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.FumlConfigurationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import umlTrace.States.StatesPackage;

import umlTrace.States.ecore.EcorePackage;

import umlTrace.States.ecore.impl.EcorePackageImpl;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

import umlTrace.States.fumlConfiguration.Input.InputPackage;

import umlTrace.States.fumlConfiguration.Input.impl.InputPackageImpl;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;

import umlTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl;

import umlTrace.States.fumlConfiguration.impl.FumlConfigurationPackageImpl;

import umlTrace.States.impl.StatesPackageImpl;

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
	private EClass tracedForkedTokenEClass = null;

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
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#eNS_URI
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
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
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
		UmlTracePackageImpl theUmlTracePackage = (UmlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) instanceof UmlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI) : UmlTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FumlConfigurationPackageImpl theFumlConfigurationPackage_1 = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eNS_URI) : umlTrace.States.fumlConfiguration.FumlConfigurationPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theIntermediateActivitiesPackage.createPackageContents();
		theUmlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFumlConfigurationPackage_1.createPackageContents();
		theLociPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theBasicBehaviorsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theInputPackage.createPackageContents();
		theUmlPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theIntermediateActivitiesPackage.initializePackageContents();
		theUmlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFumlConfigurationPackage_1.initializePackageContents();
		theLociPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theBasicBehaviorsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theInputPackage.initializePackageContents();
		theUmlPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

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
		return tracedActivityEdgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_Edge_ActivityEdgeInstanceSequence() {
		return (EReference)tracedActivityEdgeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_Group_ActivityEdgeInstanceSequence() {
		return (EReference)tracedActivityEdgeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_OffersSequence() {
		return (EReference)tracedActivityEdgeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_OriginalObject() {
		return (EReference)tracedActivityEdgeInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_SourceSequence() {
		return (EReference)tracedActivityEdgeInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdgeInstance_TargetSequence() {
		return (EReference)tracedActivityEdgeInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityExecution() {
		return tracedActivityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityExecution_ActivationGroupSequence() {
		return (EReference)tracedActivityExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityNodeActivation() {
		return tracedActivityNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_Group_ActivityNodeActivationSequence() {
		return (EReference)tracedActivityNodeActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_HeldTokensSequence() {
		return (EReference)tracedActivityNodeActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_IncomingEdgesSequence() {
		return (EReference)tracedActivityNodeActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_IsRunningSequence() {
		return (EReference)tracedActivityNodeActivationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_Node_ActivityNodeActivationSequence() {
		return (EReference)tracedActivityNodeActivationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_OutgoingEdgesSequence() {
		return (EReference)tracedActivityNodeActivationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivation_RunningSequence() {
		return (EReference)tracedActivityNodeActivationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityNodeActivationGroup() {
		return tracedActivityNodeActivationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivationGroup_ActivityExecutionSequence() {
		return (EReference)tracedActivityNodeActivationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivationGroup_EdgeInstancesSequence() {
		return (EReference)tracedActivityNodeActivationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivationGroup_NodeActivationsSequence() {
		return (EReference)tracedActivityNodeActivationGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNodeActivationGroup_OriginalObject() {
		return (EReference)tracedActivityNodeActivationGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedForkedToken() {
		return tracedForkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_BaseTokenIsWithdrawnSequence() {
		return (EReference)tracedForkedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_BaseTokenSequence() {
		return (EReference)tracedForkedTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_RemainingOffersCountSequence() {
		return (EReference)tracedForkedTokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjectNodeActivation() {
		return tracedObjectNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjectNodeActivation_OfferedTokenCountSequence() {
		return (EReference)tracedObjectNodeActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjectToken() {
		return tracedObjectTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjectToken_ValueSequence() {
		return (EReference)tracedObjectTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOffer() {
		return tracedOfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedOffer_OfferedTokensSequence() {
		return (EReference)tracedOfferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedOffer_OriginalObject() {
		return (EReference)tracedOfferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedToken() {
		return tracedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedToken_HolderSequence() {
		return (EReference)tracedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedToken_OriginalObject_Token() {
		return (EReference)tracedTokenEClass.getEStructuralFeatures().get(1);
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
		tracedActivityEdgeInstanceEClass = createEClass(TRACED_ACTIVITY_EDGE_INSTANCE);
		createEReference(tracedActivityEdgeInstanceEClass, TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE);
		createEReference(tracedActivityEdgeInstanceEClass, TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE);
		createEReference(tracedActivityEdgeInstanceEClass, TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE);
		createEReference(tracedActivityEdgeInstanceEClass, TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT);
		createEReference(tracedActivityEdgeInstanceEClass, TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE);
		createEReference(tracedActivityEdgeInstanceEClass, TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE);

		tracedActivityExecutionEClass = createEClass(TRACED_ACTIVITY_EXECUTION);
		createEReference(tracedActivityExecutionEClass, TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE);

		tracedActivityNodeActivationEClass = createEClass(TRACED_ACTIVITY_NODE_ACTIVATION);
		createEReference(tracedActivityNodeActivationEClass, TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE);
		createEReference(tracedActivityNodeActivationEClass, TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE);
		createEReference(tracedActivityNodeActivationEClass, TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE);
		createEReference(tracedActivityNodeActivationEClass, TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE);
		createEReference(tracedActivityNodeActivationEClass, TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE);
		createEReference(tracedActivityNodeActivationEClass, TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE);
		createEReference(tracedActivityNodeActivationEClass, TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE);

		tracedActivityNodeActivationGroupEClass = createEClass(TRACED_ACTIVITY_NODE_ACTIVATION_GROUP);
		createEReference(tracedActivityNodeActivationGroupEClass, TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE);
		createEReference(tracedActivityNodeActivationGroupEClass, TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE);
		createEReference(tracedActivityNodeActivationGroupEClass, TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE);
		createEReference(tracedActivityNodeActivationGroupEClass, TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ORIGINAL_OBJECT);

		tracedForkedTokenEClass = createEClass(TRACED_FORKED_TOKEN);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__BASE_TOKEN_IS_WITHDRAWN_SEQUENCE);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE);

		tracedObjectNodeActivationEClass = createEClass(TRACED_OBJECT_NODE_ACTIVATION);
		createEReference(tracedObjectNodeActivationEClass, TRACED_OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE);

		tracedObjectTokenEClass = createEClass(TRACED_OBJECT_TOKEN);
		createEReference(tracedObjectTokenEClass, TRACED_OBJECT_TOKEN__VALUE_SEQUENCE);

		tracedOfferEClass = createEClass(TRACED_OFFER);
		createEReference(tracedOfferEClass, TRACED_OFFER__OFFERED_TOKENS_SEQUENCE);
		createEReference(tracedOfferEClass, TRACED_OFFER__ORIGINAL_OBJECT);

		tracedTokenEClass = createEClass(TRACED_TOKEN);
		createEReference(tracedTokenEClass, TRACED_TOKEN__HOLDER_SEQUENCE);
		createEReference(tracedTokenEClass, TRACED_TOKEN__ORIGINAL_OBJECT_TOKEN);
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
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage theIntermediateActivitiesPackage_1 = (fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eNS_URI);
		BasicBehaviorsPackage theBasicBehaviorsPackage = (BasicBehaviorsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI);
		LociPackage theLociPackage = (LociPackage)EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedActivityExecutionEClass.getESuperTypes().add(theBasicBehaviorsPackage.getTracedExecution());
		tracedActivityNodeActivationEClass.getESuperTypes().add(theLociPackage.getTracedSemanticVisitor());
		tracedForkedTokenEClass.getESuperTypes().add(this.getTracedToken());
		tracedObjectNodeActivationEClass.getESuperTypes().add(this.getTracedActivityNodeActivation());
		tracedObjectTokenEClass.getESuperTypes().add(this.getTracedToken());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedActivityEdgeInstanceEClass, TracedActivityEdgeInstance.class, "TracedActivityEdgeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityEdgeInstance_Edge_ActivityEdgeInstanceSequence(), theStatesPackage.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value(), theStatesPackage.getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Parent(), "edge_ActivityEdgeInstanceSequence", null, 0, -1, TracedActivityEdgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdgeInstance_Group_ActivityEdgeInstanceSequence(), theStatesPackage.getActivityEdgeInstance_group_ActivityEdgeInstance_Value(), theStatesPackage.getActivityEdgeInstance_group_ActivityEdgeInstance_Value_Parent(), "group_ActivityEdgeInstanceSequence", null, 0, -1, TracedActivityEdgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdgeInstance_OffersSequence(), theStatesPackage.getActivityEdgeInstance_offers_Value(), theStatesPackage.getActivityEdgeInstance_offers_Value_Parent(), "offersSequence", null, 0, -1, TracedActivityEdgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdgeInstance_OriginalObject(), theIntermediateActivitiesPackage_1.getActivityEdgeInstance(), null, "originalObject", null, 0, 1, TracedActivityEdgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdgeInstance_SourceSequence(), theStatesPackage.getActivityEdgeInstance_source_Value(), theStatesPackage.getActivityEdgeInstance_source_Value_Parent(), "sourceSequence", null, 0, -1, TracedActivityEdgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdgeInstance_TargetSequence(), theStatesPackage.getActivityEdgeInstance_target_Value(), theStatesPackage.getActivityEdgeInstance_target_Value_Parent(), "targetSequence", null, 0, -1, TracedActivityEdgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityExecutionEClass, TracedActivityExecution.class, "TracedActivityExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityExecution_ActivationGroupSequence(), theStatesPackage.getActivityExecution_activationGroup_Value(), theStatesPackage.getActivityExecution_activationGroup_Value_Parent(), "activationGroupSequence", null, 0, -1, TracedActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityNodeActivationEClass, TracedActivityNodeActivation.class, "TracedActivityNodeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityNodeActivation_Group_ActivityNodeActivationSequence(), theStatesPackage.getActivityNodeActivation_group_ActivityNodeActivation_Value(), theStatesPackage.getActivityNodeActivation_group_ActivityNodeActivation_Value_Parent(), "group_ActivityNodeActivationSequence", null, 0, -1, TracedActivityNodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivation_HeldTokensSequence(), theStatesPackage.getActivityNodeActivation_heldTokens_Value(), theStatesPackage.getActivityNodeActivation_heldTokens_Value_Parent(), "heldTokensSequence", null, 0, -1, TracedActivityNodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivation_IncomingEdgesSequence(), theStatesPackage.getActivityNodeActivation_incomingEdges_Value(), theStatesPackage.getActivityNodeActivation_incomingEdges_Value_Parent(), "incomingEdgesSequence", null, 0, -1, TracedActivityNodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivation_IsRunningSequence(), theStatesPackage.getActivityNodeActivation_isRunning_Value(), theStatesPackage.getActivityNodeActivation_isRunning_Value_Parent(), "isRunningSequence", null, 0, -1, TracedActivityNodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivation_Node_ActivityNodeActivationSequence(), theStatesPackage.getActivityNodeActivation_node_ActivityNodeActivation_Value(), theStatesPackage.getActivityNodeActivation_node_ActivityNodeActivation_Value_Parent(), "node_ActivityNodeActivationSequence", null, 0, -1, TracedActivityNodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivation_OutgoingEdgesSequence(), theStatesPackage.getActivityNodeActivation_outgoingEdges_Value(), theStatesPackage.getActivityNodeActivation_outgoingEdges_Value_Parent(), "outgoingEdgesSequence", null, 0, -1, TracedActivityNodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivation_RunningSequence(), theStatesPackage.getActivityNodeActivation_running_Value(), theStatesPackage.getActivityNodeActivation_running_Value_Parent(), "runningSequence", null, 0, -1, TracedActivityNodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityNodeActivationGroupEClass, TracedActivityNodeActivationGroup.class, "TracedActivityNodeActivationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityNodeActivationGroup_ActivityExecutionSequence(), theStatesPackage.getActivityNodeActivationGroup_activityExecution_Value(), theStatesPackage.getActivityNodeActivationGroup_activityExecution_Value_Parent(), "activityExecutionSequence", null, 0, -1, TracedActivityNodeActivationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivationGroup_EdgeInstancesSequence(), theStatesPackage.getActivityNodeActivationGroup_edgeInstances_Value(), theStatesPackage.getActivityNodeActivationGroup_edgeInstances_Value_Parent(), "edgeInstancesSequence", null, 0, -1, TracedActivityNodeActivationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivationGroup_NodeActivationsSequence(), theStatesPackage.getActivityNodeActivationGroup_nodeActivations_Value(), theStatesPackage.getActivityNodeActivationGroup_nodeActivations_Value_Parent(), "nodeActivationsSequence", null, 0, -1, TracedActivityNodeActivationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNodeActivationGroup_OriginalObject(), theIntermediateActivitiesPackage_1.getActivityNodeActivationGroup(), null, "originalObject", null, 0, 1, TracedActivityNodeActivationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedForkedTokenEClass, TracedForkedToken.class, "TracedForkedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedForkedToken_BaseTokenIsWithdrawnSequence(), theStatesPackage.getForkedToken_baseTokenIsWithdrawn_Value(), theStatesPackage.getForkedToken_baseTokenIsWithdrawn_Value_Parent(), "baseTokenIsWithdrawnSequence", null, 0, -1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedForkedToken_BaseTokenSequence(), theStatesPackage.getForkedToken_baseToken_Value(), theStatesPackage.getForkedToken_baseToken_Value_Parent(), "baseTokenSequence", null, 0, -1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedForkedToken_RemainingOffersCountSequence(), theStatesPackage.getForkedToken_remainingOffersCount_Value(), theStatesPackage.getForkedToken_remainingOffersCount_Value_Parent(), "remainingOffersCountSequence", null, 0, -1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedObjectNodeActivationEClass, TracedObjectNodeActivation.class, "TracedObjectNodeActivation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedObjectNodeActivation_OfferedTokenCountSequence(), theStatesPackage.getObjectNodeActivation_offeredTokenCount_Value(), theStatesPackage.getObjectNodeActivation_offeredTokenCount_Value_Parent(), "offeredTokenCountSequence", null, 0, -1, TracedObjectNodeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedObjectTokenEClass, TracedObjectToken.class, "TracedObjectToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedObjectToken_ValueSequence(), theStatesPackage.getObjectToken_value_Value(), theStatesPackage.getObjectToken_value_Value_Parent(), "valueSequence", null, 0, -1, TracedObjectToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedOfferEClass, TracedOffer.class, "TracedOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedOffer_OfferedTokensSequence(), theStatesPackage.getOffer_offeredTokens_Value(), theStatesPackage.getOffer_offeredTokens_Value_Parent(), "offeredTokensSequence", null, 0, -1, TracedOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedOffer_OriginalObject(), theIntermediateActivitiesPackage_1.getOffer(), null, "originalObject", null, 0, 1, TracedOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedTokenEClass, TracedToken.class, "TracedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedToken_HolderSequence(), theStatesPackage.getToken_holder_Value(), theStatesPackage.getToken_holder_Value_Parent(), "holderSequence", null, 0, -1, TracedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedToken_OriginalObject_Token(), theIntermediateActivitiesPackage_1.getToken(), null, "originalObject_Token", null, 0, 1, TracedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (tracedActivityEdgeInstanceEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityEdgeInstance"
		   });	
		addAnnotation
		  (tracedActivityExecutionEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityExecution"
		   });	
		addAnnotation
		  (tracedActivityNodeActivationEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivation"
		   });	
		addAnnotation
		  (tracedActivityNodeActivationGroupEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ActivityNodeActivationGroup"
		   });	
		addAnnotation
		  (tracedForkedTokenEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ForkedToken"
		   });	
		addAnnotation
		  (tracedObjectNodeActivationEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ObjectNodeActivation"
		   });	
		addAnnotation
		  (tracedObjectTokenEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/ObjectToken"
		   });	
		addAnnotation
		  (tracedOfferEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/Offer"
		   });	
		addAnnotation
		  (tracedTokenEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//Activities/IntermediateActivities/Token"
		   });
	}

} //IntermediateActivitiesPackageImpl
