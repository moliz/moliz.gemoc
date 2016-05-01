/**
 */
package petrinetConfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.modelexecution.xmof.Syntax.Classes.Kernel.KernelFactory;
import org.modelexecution.xmof.Syntax.Classes.Kernel.impl.BehavioredEClassImpl;
import org.modelexecution.xmof.Syntax.Classes.Kernel.impl.BehavioredEOperationImpl;

import petrinet.PetrinetPackage;
import petrinetConfiguration.NetConfiguration;
import petrinetConfiguration.PetrinetConfigurationFactory;
import petrinetConfiguration.PetrinetConfigurationPackage;
import petrinetConfiguration.PlaceConfiguration;
import petrinetConfiguration.TransitionConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetConfigurationPackageImpl extends EPackageImpl implements PetrinetConfigurationPackage {
	
	protected KernelFactory xmofKernelFactory = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionConfigurationEClass = null;

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
	 * @see petrinetConfiguration.PetrinetConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated not
	 */
	private PetrinetConfigurationPackageImpl() {
		super(eNS_URI, PetrinetConfigurationFactory.eINSTANCE);
		xmofKernelFactory = KernelFactory.eINSTANCE;
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
		PetrinetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePetrinetConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetConfigurationPackage.initializePackageContents();

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
	public EClass getNetConfiguration() {
		return netConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetConfiguration__Main() {
		return netConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetConfiguration__Run() {
		return netConfigurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceConfiguration() {
		return placeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceConfiguration_Tokens() {
		return (EAttribute)placeConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlaceConfiguration__RemoveToken() {
		return placeConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlaceConfiguration__AddToken() {
		return placeConfigurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionConfiguration() {
		return transitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransitionConfiguration__IsEnabled() {
		return transitionConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransitionConfiguration__Fire() {
		return transitionConfigurationEClass.getEOperations().get(1);
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
		netConfigurationEClass = createEClass(NET_CONFIGURATION);
		createEOperation(netConfigurationEClass, NET_CONFIGURATION___MAIN);
		createEOperation(netConfigurationEClass, NET_CONFIGURATION___RUN);

		placeConfigurationEClass = createEClass(PLACE_CONFIGURATION);
		createEAttribute(placeConfigurationEClass, PLACE_CONFIGURATION__TOKENS);
		createEOperation(placeConfigurationEClass, PLACE_CONFIGURATION___REMOVE_TOKEN);
		createEOperation(placeConfigurationEClass, PLACE_CONFIGURATION___ADD_TOKEN);

		transitionConfigurationEClass = createEClass(TRANSITION_CONFIGURATION);
		createEOperation(transitionConfigurationEClass, TRANSITION_CONFIGURATION___IS_ENABLED);
		createEOperation(transitionConfigurationEClass, TRANSITION_CONFIGURATION___FIRE);
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
		PetrinetPackage thePetrinetPackage = (PetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		netConfigurationEClass.getESuperTypes().add(thePetrinetPackage.getNet());
		placeConfigurationEClass.getESuperTypes().add(thePetrinetPackage.getPlace());
		transitionConfigurationEClass.getESuperTypes().add(thePetrinetPackage.getTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(netConfigurationEClass, NetConfiguration.class, "NetConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNetConfiguration__Main(), null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNetConfiguration__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(placeConfigurationEClass, PlaceConfiguration.class, "PlaceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceConfiguration_Tokens(), ecorePackage.getEInt(), "tokens", null, 0, 1, PlaceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlaceConfiguration__RemoveToken(), null, "removeToken", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlaceConfiguration__AddToken(), null, "addToken", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionConfigurationEClass, TransitionConfiguration.class, "TransitionConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTransitionConfiguration__IsEnabled(), ecorePackage.getEBoolean(), "isEnabled", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransitionConfiguration__Fire(), null, "fire", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelexecution.org/xmof
		createXmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/xmof</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXmofAnnotations() {
		String source = "http://www.modelexecution.org/xmof";	
		addAnnotation
		  (getNetConfiguration__Run(), 
		   source, 
		   new String[] {
			 "Step", "true"
		   });	
		addAnnotation
		  (getTransitionConfiguration__Fire(), 
		   source, 
		   new String[] {
			 "Step", "true"
		   });
	}

	//TODO: for now added manually
	@Override
	protected EClass createEClass(int id) {
		BehavioredEClassImpl c = (BehavioredEClassImpl)xmofKernelFactory.createBehavioredEClass();
		c.setClassifierID(id);
		getEClassifiers().add(c);
		return c;
	}
	
	//TODO: for now added manually
	@Override
	protected void createEOperation(EClass owner, int id) {
		BehavioredEOperationImpl o = (BehavioredEOperationImpl) xmofKernelFactory
				.createBehavioredEOperation();
		o.setOperationID(id);
		owner.getEOperations().add(o);
	}
	
} //PetrinetConfigurationPackageImpl
