/**
 */
package petrinet2Configuration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.modelexecution.xmof.Syntax.Classes.Kernel.KernelFactory;
import org.modelexecution.xmof.Syntax.Classes.Kernel.impl.BehavioredEClassImpl;
import org.modelexecution.xmof.Syntax.Classes.Kernel.impl.BehavioredEOperationImpl;

import petrinet2.Petrinet2Package;
import petrinet2Configuration.NetConfiguration;
import petrinet2Configuration.Petrinet2ConfigurationFactory;
import petrinet2Configuration.Petrinet2ConfigurationPackage;
import petrinet2Configuration.PlaceConfiguration;
import petrinet2Configuration.Token;
import petrinet2Configuration.TokenDistribution;
import petrinet2Configuration.TransitionConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class Petrinet2ConfigurationPackageImpl extends EPackageImpl implements
		Petrinet2ConfigurationPackage {
	
	protected KernelFactory xmofKernelFactory = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenDistributionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated not
	 */
	private Petrinet2ConfigurationPackageImpl() {
		super(eNS_URI, Petrinet2ConfigurationFactory.eINSTANCE);
		xmofKernelFactory = KernelFactory.eINSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Petrinet2ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Petrinet2ConfigurationPackage init() {
		if (isInited) return (Petrinet2ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(Petrinet2ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		Petrinet2ConfigurationPackageImpl thePetrinet2ConfigurationPackage = (Petrinet2ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Petrinet2ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Petrinet2ConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Petrinet2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		thePetrinet2ConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinet2ConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinet2ConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinet2ConfigurationPackage.eNS_URI, thePetrinet2ConfigurationPackage);
		return thePetrinet2ConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetConfiguration() {
		return netConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetConfiguration__Run() {
		return netConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetConfiguration__Main__EList() {
		return netConfigurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetConfiguration__InitializeMarking__EList() {
		return netConfigurationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceConfiguration() {
		return placeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceConfiguration_HeldTokens() {
		return (EReference)placeConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlaceConfiguration__AddToken() {
		return placeConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlaceConfiguration__RemoveToken() {
		return placeConfigurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionConfiguration() {
		return transitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransitionConfiguration__Fire() {
		return transitionConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransitionConfiguration__IsEnabled() {
		return transitionConfigurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenDistribution() {
		return tokenDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenDistribution_InitialTokens() {
		return (EReference)tokenDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_HoldingPlace() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet2ConfigurationFactory getPetrinet2ConfigurationFactory() {
		return (Petrinet2ConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		createEOperation(netConfigurationEClass, NET_CONFIGURATION___RUN);
		createEOperation(netConfigurationEClass, NET_CONFIGURATION___MAIN__ELIST);
		createEOperation(netConfigurationEClass, NET_CONFIGURATION___INITIALIZE_MARKING__ELIST);

		placeConfigurationEClass = createEClass(PLACE_CONFIGURATION);
		createEReference(placeConfigurationEClass, PLACE_CONFIGURATION__HELD_TOKENS);
		createEOperation(placeConfigurationEClass, PLACE_CONFIGURATION___ADD_TOKEN);
		createEOperation(placeConfigurationEClass, PLACE_CONFIGURATION___REMOVE_TOKEN);

		transitionConfigurationEClass = createEClass(TRANSITION_CONFIGURATION);
		createEOperation(transitionConfigurationEClass, TRANSITION_CONFIGURATION___FIRE);
		createEOperation(transitionConfigurationEClass, TRANSITION_CONFIGURATION___IS_ENABLED);

		tokenDistributionEClass = createEClass(TOKEN_DISTRIBUTION);
		createEReference(tokenDistributionEClass, TOKEN_DISTRIBUTION__INITIAL_TOKENS);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__HOLDING_PLACE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		Petrinet2Package thePetrinet2Package = (Petrinet2Package)EPackage.Registry.INSTANCE.getEPackage(Petrinet2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		netConfigurationEClass.getESuperTypes().add(thePetrinet2Package.getNet());
		placeConfigurationEClass.getESuperTypes().add(thePetrinet2Package.getPlace());
		transitionConfigurationEClass.getESuperTypes().add(thePetrinet2Package.getTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(netConfigurationEClass, NetConfiguration.class, "NetConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNetConfiguration__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getNetConfiguration__Main__EList(), null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "initialTokens", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNetConfiguration__InitializeMarking__EList(), null, "initializeMarking", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getToken(), "initialTokens", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(placeConfigurationEClass, PlaceConfiguration.class, "PlaceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceConfiguration_HeldTokens(), this.getToken(), null, "heldTokens", null, 0, -1, PlaceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlaceConfiguration__AddToken(), null, "addToken", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlaceConfiguration__RemoveToken(), null, "removeToken", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionConfigurationEClass, TransitionConfiguration.class, "TransitionConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTransitionConfiguration__Fire(), null, "fire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransitionConfiguration__IsEnabled(), ecorePackage.getEBoolean(), "isEnabled", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tokenDistributionEClass, TokenDistribution.class, "TokenDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenDistribution_InitialTokens(), this.getToken(), null, "initialTokens", null, 0, -1, TokenDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_HoldingPlace(), thePetrinet2Package.getPlace(), null, "holdingPlace", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

	// TODO: for now added manually
	@Override
	protected EClass createEClass(int id) {
		BehavioredEClassImpl c = (BehavioredEClassImpl) xmofKernelFactory
				.createBehavioredEClass();
		c.setClassifierID(id);
		getEClassifiers().add(c);
		return c;
	}

	// TODO: for now added manually
	@Override
	protected void createEOperation(EClass owner, int id) {
		BehavioredEOperationImpl o = (BehavioredEOperationImpl) xmofKernelFactory
				.createBehavioredEOperation();
		o.setOperationID(id);
		owner.getEOperations().add(o);
	}

} // Petrinet2ConfigurationPackageImpl
