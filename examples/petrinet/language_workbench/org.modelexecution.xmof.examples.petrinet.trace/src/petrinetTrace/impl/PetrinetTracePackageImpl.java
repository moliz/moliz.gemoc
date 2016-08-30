/**
 */
package petrinetTrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;
import petrinetConfiguration.PetrinetConfigurationPackage;

import petrinetTrace.PetrinetTraceFactory;
import petrinetTrace.PetrinetTracePackage;
import petrinetTrace.SpecificTrace;

import petrinetTrace.States.StatesPackage;

import petrinetTrace.States.impl.StatesPackageImpl;

import petrinetTrace.States.petrinetConfiguration.impl.PetrinetConfigurationPackageImpl;

import petrinetTrace.Steps.StepsPackage;

import petrinetTrace.Steps.impl.StepsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetTracePackageImpl extends EPackageImpl implements PetrinetTracePackage {
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
	 * @see petrinetTrace.PetrinetTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetrinetTracePackageImpl() {
		super(eNS_URI, PetrinetTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PetrinetTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetrinetTracePackage init() {
		if (isInited) return (PetrinetTracePackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetTracePackage.eNS_URI);

		// Obtain or create and register package
		PetrinetTracePackageImpl thePetrinetTracePackage = (PetrinetTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetrinetTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetrinetTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		PetrinetConfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		PetrinetConfigurationPackageImpl thePetrinetConfigurationPackage_1 = (PetrinetConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage.eNS_URI) instanceof PetrinetConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage.eNS_URI) : petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		thePetrinetTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		thePetrinetConfigurationPackage_1.createPackageContents();

		// Initialize created meta-data
		thePetrinetTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		thePetrinetConfigurationPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetrinetTracePackage.eNS_URI, thePetrinetTracePackage);
		return thePetrinetTracePackage;
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
	public EReference getSpecificTrace_PetrinetConfiguration_NetConfiguration_Run_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_PetrinetConfiguration_TransitionConfiguration_Fire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_PetrinetConfiguration_tracedPlaceConfigurations() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_StatesTrace() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetTraceFactory getPetrinetTraceFactory() {
		return (PetrinetTraceFactory)getEFactoryInstance();
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
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_CONFIGURATION_TRACED_PLACE_CONFIGURATIONS);
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
		TracePackage theMsePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage thePetrinetConfigurationPackage_1 = (petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theMsePackage.getTrace());
		EGenericType g2 = createEGenericType(theMsePackage.getSequentialStep());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theStepsPackage.getSpecificStep());
		g2.getETypeArguments().add(g3);
		specificTraceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(specificTraceEClass, SpecificTrace.class, "SpecificTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificTrace_PetrinetConfiguration_NetConfiguration_Run_Sequence(), theStepsPackage.getPetrinetConfiguration_NetConfiguration_Run(), null, "PetrinetConfiguration_NetConfiguration_Run_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_PetrinetConfiguration_TransitionConfiguration_Fire_Sequence(), theStepsPackage.getPetrinetConfiguration_TransitionConfiguration_Fire(), null, "PetrinetConfiguration_TransitionConfiguration_Fire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_PetrinetConfiguration_tracedPlaceConfigurations(), thePetrinetConfigurationPackage_1.getTracedPlaceConfiguration(), null, "petrinetConfiguration_tracedPlaceConfigurations", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PetrinetTracePackageImpl
