/**
 */
package fsmConfigurationTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmConfiguration.FsmConfigurationPackage;

import fsmConfigurationTrace.FsmConfigurationTracePackage;

import fsmConfigurationTrace.States.StatesPackage;

import fsmConfigurationTrace.States.fsm.FsmPackage;

import fsmConfigurationTrace.States.fsm.impl.FsmPackageImpl;

import fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl;

import fsmConfigurationTrace.States.impl.StatesPackageImpl;

import fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run;
import fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_AbstractSubStep;
import fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_ImplicitStep;
import fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire;
import fsmConfigurationTrace.Steps.RootImplicitStep;
import fsmConfigurationTrace.Steps.SpecificRootStep;
import fsmConfigurationTrace.Steps.SpecificStep;
import fsmConfigurationTrace.Steps.StepsFactory;
import fsmConfigurationTrace.Steps.StepsPackage;

import fsmConfigurationTrace.impl.FsmConfigurationTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_FSMConfiguration_RunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_FSMConfiguration_Run_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_FSMConfiguration_Run_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfiguration_TransitionConfiguration_FireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificRootStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

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
	 * @see fsmConfigurationTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		FsmConfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmConfigurationTracePackageImpl theFsmConfigurationTracePackage = (FsmConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI) instanceof FsmConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI) : FsmConfigurationTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) : FsmPackage.eINSTANCE);
		FsmConfigurationPackageImpl theFsmConfigurationPackage_1 = (FsmConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI) instanceof FsmConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI) : fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theFsmConfigurationTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFsmPackage.createPackageContents();
		theFsmConfigurationPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theFsmConfigurationTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFsmPackage.initializePackageContents();
		theFsmConfigurationPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsmConfiguration_FSMConfiguration_Run() {
		return fsmConfiguration_FSMConfiguration_RunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsmConfiguration_FSMConfiguration_Run_AbstractSubStep() {
		return fsmConfiguration_FSMConfiguration_Run_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsmConfiguration_FSMConfiguration_Run_ImplicitStep() {
		return fsmConfiguration_FSMConfiguration_Run_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsmConfiguration_TransitionConfiguration_Fire() {
		return fsmConfiguration_TransitionConfiguration_FireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificRootStep() {
		return specificRootStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
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
		fsmConfiguration_FSMConfiguration_RunEClass = createEClass(FSM_CONFIGURATION_FSM_CONFIGURATION_RUN);

		fsmConfiguration_FSMConfiguration_Run_AbstractSubStepEClass = createEClass(FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP);

		fsmConfiguration_FSMConfiguration_Run_ImplicitStepEClass = createEClass(FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP);

		fsmConfiguration_TransitionConfiguration_FireEClass = createEClass(FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificRootStepEClass = createEClass(SPECIFIC_ROOT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
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
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage theFsmConfigurationPackage_1 = (fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI);
		FsmConfigurationPackage theFsmConfigurationPackage = (FsmConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		fsmConfiguration_FSMConfiguration_RunEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getFsmConfiguration_FSMConfiguration_Run_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		fsmConfiguration_FSMConfiguration_RunEClass.getEGenericSuperTypes().add(g1);
		fsmConfiguration_FSMConfiguration_Run_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getFsmConfiguration_FSMConfiguration_Run_AbstractSubStep());
		fsmConfiguration_FSMConfiguration_Run_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		fsmConfiguration_FSMConfiguration_Run_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFsmConfiguration_FSMConfiguration_Run_AbstractSubStep());
		fsmConfiguration_TransitionConfiguration_FireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		fsmConfiguration_TransitionConfiguration_FireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		fsmConfiguration_TransitionConfiguration_FireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		rootImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificRootStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		specificRootStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificStepEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(fsmConfiguration_FSMConfiguration_RunEClass, FsmConfiguration_FSMConfiguration_Run.class, "FsmConfiguration_FSMConfiguration_Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsmConfiguration_FSMConfiguration_RunEClass, theFsmConfigurationPackage_1.getTracedFSMConfiguration(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsmConfiguration_FSMConfiguration_Run_AbstractSubStepEClass, FsmConfiguration_FSMConfiguration_Run_AbstractSubStep.class, "FsmConfiguration_FSMConfiguration_Run_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsmConfiguration_FSMConfiguration_Run_ImplicitStepEClass, FsmConfiguration_FSMConfiguration_Run_ImplicitStep.class, "FsmConfiguration_FSMConfiguration_Run_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsmConfiguration_TransitionConfiguration_FireEClass, FsmConfiguration_TransitionConfiguration_Fire.class, "FsmConfiguration_TransitionConfiguration_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsmConfiguration_TransitionConfiguration_FireEClass, theFsmConfigurationPackage.getTransitionConfiguration(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificRootStepEClass, SpecificRootStep.class, "SpecificRootStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StepsPackageImpl
