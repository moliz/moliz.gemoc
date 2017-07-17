/**
 */
package petrinetConfigurationTrace.Steps.impl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelexecution.xmof.standardlibrary.XMOF.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage;

import org.modelexecution.xmof.standardlibrary.XMOF.PrimitiveBehaviors.ListFunctions.ListFunctionsPackage;

import petrinetConfiguration.PetrinetConfigurationPackage;

import petrinetConfigurationTrace.PetrinetConfigurationTracePackage;

import petrinetConfigurationTrace.States.StatesPackage;

import petrinetConfigurationTrace.States.impl.StatesPackageImpl;

import petrinetConfigurationTrace.States.petrinetConfiguration.impl.PetrinetConfigurationPackageImpl;

import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_ImplicitStep;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_ImplicitStep;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire;
import petrinetConfigurationTrace.Steps.RootImplicitStep;
import petrinetConfigurationTrace.Steps.SpecificStep;
import petrinetConfigurationTrace.Steps.StepsFactory;
import petrinetConfigurationTrace.Steps.StepsPackage;

import petrinetConfigurationTrace.impl.PetrinetConfigurationTracePackageImpl;

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
	private EClass petrinetConfiguration_NetConfiguration_MainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetConfiguration_NetConfiguration_Main_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetConfiguration_NetConfiguration_Main_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetConfiguration_NetConfiguration_RunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetConfiguration_NetConfiguration_Run_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetConfiguration_NetConfiguration_Run_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetConfiguration_TransitionConfiguration_FireEClass = null;

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
	 * @see petrinetConfigurationTrace.Steps.StepsPackage#eNS_URI
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
		PetrinetConfigurationPackage.eINSTANCE.eClass();
		ListFunctionsPackage.eINSTANCE.eClass();
		IntegerFunctionsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PetrinetConfigurationTracePackageImpl thePetrinetConfigurationTracePackage = (PetrinetConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PetrinetConfigurationTracePackage.eNS_URI) instanceof PetrinetConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PetrinetConfigurationTracePackage.eNS_URI) : PetrinetConfigurationTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		PetrinetConfigurationPackageImpl thePetrinetConfigurationPackage_1 = (PetrinetConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(petrinetConfigurationTrace.States.petrinetConfiguration.PetrinetConfigurationPackage.eNS_URI) instanceof PetrinetConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(petrinetConfigurationTrace.States.petrinetConfiguration.PetrinetConfigurationPackage.eNS_URI) : petrinetConfigurationTrace.States.petrinetConfiguration.PetrinetConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		thePetrinetConfigurationTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		thePetrinetConfigurationPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		thePetrinetConfigurationTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		thePetrinetConfigurationPackage_1.initializePackageContents();

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
	public EClass getPetrinetConfiguration_NetConfiguration_Main() {
		return petrinetConfiguration_NetConfiguration_MainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetConfiguration_NetConfiguration_Main_AbstractSubStep() {
		return petrinetConfiguration_NetConfiguration_Main_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetConfiguration_NetConfiguration_Main_ImplicitStep() {
		return petrinetConfiguration_NetConfiguration_Main_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetConfiguration_NetConfiguration_Run() {
		return petrinetConfiguration_NetConfiguration_RunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep() {
		return petrinetConfiguration_NetConfiguration_Run_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep() {
		return petrinetConfiguration_NetConfiguration_Run_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetConfiguration_TransitionConfiguration_Fire() {
		return petrinetConfiguration_TransitionConfiguration_FireEClass;
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
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
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
		petrinetConfiguration_NetConfiguration_MainEClass = createEClass(PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN);

		petrinetConfiguration_NetConfiguration_Main_AbstractSubStepEClass = createEClass(PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP);

		petrinetConfiguration_NetConfiguration_Main_ImplicitStepEClass = createEClass(PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_IMPLICIT_STEP);

		petrinetConfiguration_NetConfiguration_RunEClass = createEClass(PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN);

		petrinetConfiguration_NetConfiguration_Run_AbstractSubStepEClass = createEClass(PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP);

		petrinetConfiguration_NetConfiguration_Run_ImplicitStepEClass = createEClass(PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP);

		petrinetConfiguration_TransitionConfiguration_FireEClass = createEClass(PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);
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
		PetrinetConfigurationPackage thePetrinetConfigurationPackage = (PetrinetConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetConfigurationPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		petrinetConfiguration_NetConfiguration_MainEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getPetrinetConfiguration_NetConfiguration_Main_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		petrinetConfiguration_NetConfiguration_MainEClass.getEGenericSuperTypes().add(g1);
		petrinetConfiguration_NetConfiguration_Main_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		petrinetConfiguration_NetConfiguration_Main_ImplicitStepEClass.getESuperTypes().add(this.getPetrinetConfiguration_NetConfiguration_Main_AbstractSubStep());
		petrinetConfiguration_NetConfiguration_Main_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getPetrinetConfiguration_NetConfiguration_Main_AbstractSubStep());
		petrinetConfiguration_NetConfiguration_RunEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		petrinetConfiguration_NetConfiguration_RunEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		petrinetConfiguration_NetConfiguration_RunEClass.getEGenericSuperTypes().add(g1);
		petrinetConfiguration_NetConfiguration_Run_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		petrinetConfiguration_NetConfiguration_Run_ImplicitStepEClass.getESuperTypes().add(this.getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep());
		petrinetConfiguration_NetConfiguration_Run_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		petrinetConfiguration_TransitionConfiguration_FireEClass.getESuperTypes().add(this.getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep());
		petrinetConfiguration_TransitionConfiguration_FireEClass.getESuperTypes().add(this.getSpecificStep());
		petrinetConfiguration_TransitionConfiguration_FireEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());

		// Initialize classes and features; add operations and parameters
		initEClass(petrinetConfiguration_NetConfiguration_MainEClass, PetrinetConfiguration_NetConfiguration_Main.class, "PetrinetConfiguration_NetConfiguration_Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinetConfiguration_NetConfiguration_MainEClass, thePetrinetConfigurationPackage.getNetConfiguration(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinetConfiguration_NetConfiguration_Main_AbstractSubStepEClass, PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep.class, "PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetConfiguration_NetConfiguration_Main_ImplicitStepEClass, PetrinetConfiguration_NetConfiguration_Main_ImplicitStep.class, "PetrinetConfiguration_NetConfiguration_Main_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetConfiguration_NetConfiguration_RunEClass, PetrinetConfiguration_NetConfiguration_Run.class, "PetrinetConfiguration_NetConfiguration_Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinetConfiguration_NetConfiguration_RunEClass, thePetrinetConfigurationPackage.getNetConfiguration(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinetConfiguration_NetConfiguration_Run_AbstractSubStepEClass, PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep.class, "PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetConfiguration_NetConfiguration_Run_ImplicitStepEClass, PetrinetConfiguration_NetConfiguration_Run_ImplicitStep.class, "PetrinetConfiguration_NetConfiguration_Run_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetConfiguration_TransitionConfiguration_FireEClass, PetrinetConfiguration_TransitionConfiguration_Fire.class, "PetrinetConfiguration_TransitionConfiguration_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinetConfiguration_TransitionConfiguration_FireEClass, thePetrinetConfigurationPackage.getTransitionConfiguration(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
