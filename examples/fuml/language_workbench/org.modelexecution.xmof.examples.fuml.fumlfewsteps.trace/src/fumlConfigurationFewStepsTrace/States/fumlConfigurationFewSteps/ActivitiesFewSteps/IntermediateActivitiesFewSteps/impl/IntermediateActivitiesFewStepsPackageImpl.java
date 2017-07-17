/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage;

import fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage;

import fumlConfigurationFewStepsTrace.States.StatesPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.BasicActionsFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsFactory;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityEdgeInstance;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityFinalNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityParameterNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedControlNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedDecisionNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedForkNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedInitialNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedToken;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.impl.LociFewStepsPackageImpl;

import fumlConfigurationFewStepsTrace.States.impl.StatesPackageImpl;

import fumlConfigurationFewStepsTrace.Steps.StepsPackage;

import fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl;

import fumlConfigurationFewStepsTrace.impl.FumlConfigurationFewStepsTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateActivitiesFewStepsPackageImpl extends EPackageImpl implements IntermediateActivitiesFewStepsPackage {
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
	private EClass tracedInitialNodeActivationEClass = null;

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
	 * @see fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateActivitiesFewStepsPackageImpl() {
		super(eNS_URI, IntermediateActivitiesFewStepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediateActivitiesFewStepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntermediateActivitiesFewStepsPackage init() {
		if (isInited) return (IntermediateActivitiesFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesFewStepsPackage.eNS_URI);

		// Obtain or create and register package
		IntermediateActivitiesFewStepsPackageImpl theIntermediateActivitiesFewStepsPackage = (IntermediateActivitiesFewStepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateActivitiesFewStepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateActivitiesFewStepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FumlConfigurationFewStepsPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationFewStepsTracePackageImpl theFumlConfigurationFewStepsTracePackage = (FumlConfigurationFewStepsTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsTracePackage.eNS_URI) instanceof FumlConfigurationFewStepsTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationFewStepsTracePackage.eNS_URI) : FumlConfigurationFewStepsTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		LociFewStepsPackageImpl theLociFewStepsPackage = (LociFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) instanceof LociFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI) : LociFewStepsPackage.eINSTANCE);
		BasicActionsFewStepsPackageImpl theBasicActionsFewStepsPackage = (BasicActionsFewStepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI) instanceof BasicActionsFewStepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsFewStepsPackage.eNS_URI) : BasicActionsFewStepsPackage.eINSTANCE);

		// Create package meta-data objects
		theIntermediateActivitiesFewStepsPackage.createPackageContents();
		theFumlConfigurationFewStepsTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theLociFewStepsPackage.createPackageContents();
		theBasicActionsFewStepsPackage.createPackageContents();

		// Initialize created meta-data
		theIntermediateActivitiesFewStepsPackage.initializePackageContents();
		theFumlConfigurationFewStepsTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theLociFewStepsPackage.initializePackageContents();
		theBasicActionsFewStepsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateActivitiesFewStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateActivitiesFewStepsPackage.eNS_URI, theIntermediateActivitiesFewStepsPackage);
		return theIntermediateActivitiesFewStepsPackage;
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
	public EClass getTracedActivityFinalNodeActivation() {
		return tracedActivityFinalNodeActivationEClass;
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
	public EClass getTracedActivityParameterNodeActivation() {
		return tracedActivityParameterNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControlNodeActivation() {
		return tracedControlNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDecisionNodeActivation() {
		return tracedDecisionNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedForkNodeActivation() {
		return tracedForkNodeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInitialNodeActivation() {
		return tracedInitialNodeActivationEClass;
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
	public IntermediateActivitiesFewStepsFactory getIntermediateActivitiesFewStepsFactory() {
		return (IntermediateActivitiesFewStepsFactory)getEFactoryInstance();
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

		tracedActivityFinalNodeActivationEClass = createEClass(TRACED_ACTIVITY_FINAL_NODE_ACTIVATION);

		tracedActivityNodeActivationEClass = createEClass(TRACED_ACTIVITY_NODE_ACTIVATION);

		tracedActivityParameterNodeActivationEClass = createEClass(TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATION);

		tracedControlNodeActivationEClass = createEClass(TRACED_CONTROL_NODE_ACTIVATION);

		tracedDecisionNodeActivationEClass = createEClass(TRACED_DECISION_NODE_ACTIVATION);

		tracedForkNodeActivationEClass = createEClass(TRACED_FORK_NODE_ACTIVATION);

		tracedInitialNodeActivationEClass = createEClass(TRACED_INITIAL_NODE_ACTIVATION);

		tracedTokenEClass = createEClass(TRACED_TOKEN);
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
		LociFewStepsPackage theLociFewStepsPackage = (LociFewStepsPackage)EPackage.Registry.INSTANCE.getEPackage(LociFewStepsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedActivityFinalNodeActivationEClass.getESuperTypes().add(this.getTracedControlNodeActivation());
		tracedActivityNodeActivationEClass.getESuperTypes().add(theLociFewStepsPackage.getTracedSemanticVisitor());
		tracedActivityParameterNodeActivationEClass.getESuperTypes().add(theLociFewStepsPackage.getTracedSemanticVisitor());
		tracedActivityParameterNodeActivationEClass.getESuperTypes().add(this.getTracedActivityNodeActivation());
		tracedControlNodeActivationEClass.getESuperTypes().add(this.getTracedActivityNodeActivation());
		tracedDecisionNodeActivationEClass.getESuperTypes().add(this.getTracedControlNodeActivation());
		tracedForkNodeActivationEClass.getESuperTypes().add(this.getTracedControlNodeActivation());
		tracedInitialNodeActivationEClass.getESuperTypes().add(this.getTracedControlNodeActivation());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedActivityEdgeInstanceEClass, TracedActivityEdgeInstance.class, "TracedActivityEdgeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedActivityFinalNodeActivationEClass, TracedActivityFinalNodeActivation.class, "TracedActivityFinalNodeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedActivityNodeActivationEClass, TracedActivityNodeActivation.class, "TracedActivityNodeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedActivityParameterNodeActivationEClass, TracedActivityParameterNodeActivation.class, "TracedActivityParameterNodeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedControlNodeActivationEClass, TracedControlNodeActivation.class, "TracedControlNodeActivation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedDecisionNodeActivationEClass, TracedDecisionNodeActivation.class, "TracedDecisionNodeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedForkNodeActivationEClass, TracedForkNodeActivation.class, "TracedForkNodeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedInitialNodeActivationEClass, TracedInitialNodeActivation.class, "TracedInitialNodeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedTokenEClass, TracedToken.class, "TracedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //IntermediateActivitiesFewStepsPackageImpl
