/**
 */
package petrinetTrace.States.petrinetConfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;
import petrinetTrace.PetrinetTracePackage;
import petrinetTrace.States.StatesPackage;
import petrinetTrace.States.impl.StatesPackageImpl;
import petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationFactory;
import petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage;
import petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration;
import petrinetTrace.Steps.StepsPackage;
import petrinetTrace.Steps.impl.StepsPackageImpl;
import petrinetTrace.impl.PetrinetTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetConfigurationPackageImpl extends EPackageImpl implements PetrinetConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPlaceConfigurationEClass = null;

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
	 * @see petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetrinetConfigurationPackageImpl() {
		super(eNS_URI, PetrinetConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PetrinetConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetrinetConfigurationPackage init() {
		if (isInited) return (PetrinetConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		PetrinetConfigurationPackageImpl thePetrinetConfigurationPackage = (PetrinetConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetrinetConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetrinetConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		petrinetConfiguration.PetrinetConfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PetrinetTracePackageImpl thePetrinetTracePackage = (PetrinetTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PetrinetTracePackage.eNS_URI) instanceof PetrinetTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PetrinetTracePackage.eNS_URI) : PetrinetTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		thePetrinetConfigurationPackage.createPackageContents();
		thePetrinetTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetConfigurationPackage.initializePackageContents();
		thePetrinetTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetrinetConfigurationPackage.eNS_URI, thePetrinetConfigurationPackage);
		return thePetrinetConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPlaceConfiguration() {
		return tracedPlaceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPlaceConfiguration_OriginalObject() {
		return (EReference)tracedPlaceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPlaceConfiguration_TokensSequence() {
		return (EReference)tracedPlaceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetConfigurationFactory getPetrinetConfigurationFactory() {
		return (PetrinetConfigurationFactory)getEFactoryInstance();
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
		tracedPlaceConfigurationEClass = createEClass(TRACED_PLACE_CONFIGURATION);
		createEReference(tracedPlaceConfigurationEClass, TRACED_PLACE_CONFIGURATION__ORIGINAL_OBJECT);
		createEReference(tracedPlaceConfigurationEClass, TRACED_PLACE_CONFIGURATION__TOKENS_SEQUENCE);
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
		petrinetConfiguration.PetrinetConfigurationPackage thePetrinetConfigurationPackage_1 = (petrinetConfiguration.PetrinetConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(petrinetConfiguration.PetrinetConfigurationPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedPlaceConfigurationEClass, TracedPlaceConfiguration.class, "TracedPlaceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPlaceConfiguration_OriginalObject(), thePetrinetConfigurationPackage_1.getPlaceConfiguration(), null, "originalObject", null, 0, 1, TracedPlaceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedPlaceConfiguration_TokensSequence(), theStatesPackage.getPlaceConfiguration_tokens_Value(), theStatesPackage.getPlaceConfiguration_tokens_Value_Parent(), "tokensSequence", null, 0, -1, TracedPlaceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (tracedPlaceConfigurationEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", "//PlaceConfiguration"
		   });
	}

} //PetrinetConfigurationPackageImpl
