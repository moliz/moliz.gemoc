/**
 */
package fsmConfigurationTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmConfiguration.FsmConfigurationPackage;

import fsmConfigurationTrace.FsmConfigurationTraceFactory;
import fsmConfigurationTrace.FsmConfigurationTracePackage;
import fsmConfigurationTrace.SpecificTrace;

import fsmConfigurationTrace.States.StatesPackage;

import fsmConfigurationTrace.States.fsm.FsmPackage;

import fsmConfigurationTrace.States.fsm.impl.FsmPackageImpl;

import fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl;

import fsmConfigurationTrace.States.impl.StatesPackageImpl;

import fsmConfigurationTrace.Steps.StepsPackage;

import fsmConfigurationTrace.Steps.impl.StepsPackageImpl;

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
public class FsmConfigurationTracePackageImpl extends EPackageImpl implements FsmConfigurationTracePackage {
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
	 * @see fsmConfigurationTrace.FsmConfigurationTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FsmConfigurationTracePackageImpl() {
		super(eNS_URI, FsmConfigurationTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FsmConfigurationTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FsmConfigurationTracePackage init() {
		if (isInited) return (FsmConfigurationTracePackage)EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI);

		// Obtain or create and register package
		FsmConfigurationTracePackageImpl theFsmConfigurationTracePackage = (FsmConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FsmConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FsmConfigurationTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		FsmConfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) : FsmPackage.eINSTANCE);
		FsmConfigurationPackageImpl theFsmConfigurationPackage_1 = (FsmConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI) instanceof FsmConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI) : fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theFsmConfigurationTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFsmPackage.createPackageContents();
		theFsmConfigurationPackage_1.createPackageContents();

		// Initialize created meta-data
		theFsmConfigurationTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFsmPackage.initializePackageContents();
		theFsmConfigurationPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFsmConfigurationTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FsmConfigurationTracePackage.eNS_URI, theFsmConfigurationTracePackage);
		return theFsmConfigurationTracePackage;
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
	public EReference getSpecificTrace_FsmConfiguration_FSMConfiguration_Run_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_FsmConfiguration_TransitionConfiguration_Fire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfigurationTraceFactory getFsmConfigurationTraceFactory() {
		return (FsmConfigurationTraceFactory)getEFactoryInstance();
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
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE);
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

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTracePackage.getTrace());
		EGenericType g2 = createEGenericType(theTracePackage.getSequentialStep());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		EGenericType g4 = createEGenericType(theStepsPackage.getSpecificStep());
		g3.setEUpperBound(g4);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g4 = createEGenericType(theStatesPackage.getSpecificState());
		g3.setEUpperBound(g4);
		g2 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g4 = createEGenericType(theStatesPackage.getSpecificDimension());
		g3.setEUpperBound(g4);
		EGenericType g5 = createEGenericType();
		g4.getETypeArguments().add(g5);
		EGenericType g6 = createEGenericType(theStatesPackage.getSpecificValue());
		g5.setEUpperBound(g6);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificTraceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(specificTraceEClass, SpecificTrace.class, "SpecificTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificTrace_FsmConfiguration_FSMConfiguration_Run_Sequence(), theStepsPackage.getFsmConfiguration_FSMConfiguration_Run(), null, "FsmConfiguration_FSMConfiguration_Run_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_FsmConfiguration_TransitionConfiguration_Fire_Sequence(), theStepsPackage.getFsmConfiguration_TransitionConfiguration_Fire(), null, "FsmConfiguration_TransitionConfiguration_Fire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FsmConfigurationTracePackageImpl
