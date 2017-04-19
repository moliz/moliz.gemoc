/**
 */
package fsmConfigurationTrace.States.fsm.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmConfiguration.FsmConfigurationPackage;

import fsmConfigurationTrace.FsmConfigurationTracePackage;

import fsmConfigurationTrace.States.StatesPackage;

import fsmConfigurationTrace.States.fsm.FsmFactory;
import fsmConfigurationTrace.States.fsm.FsmPackage;
import fsmConfigurationTrace.States.fsm.TracedFSM;

import fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl;

import fsmConfigurationTrace.States.impl.StatesPackageImpl;

import fsmConfigurationTrace.Steps.StepsPackage;

import fsmConfigurationTrace.Steps.impl.StepsPackageImpl;

import fsmConfigurationTrace.impl.FsmConfigurationTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmPackageImpl extends EPackageImpl implements FsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFSMEClass = null;

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
	 * @see fsmConfigurationTrace.States.fsm.FsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FsmPackageImpl() {
		super(eNS_URI, FsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FsmPackage init() {
		if (isInited) return (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);

		// Obtain or create and register package
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		FsmConfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmConfigurationTracePackageImpl theFsmConfigurationTracePackage = (FsmConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI) instanceof FsmConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationTracePackage.eNS_URI) : FsmConfigurationTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FsmConfigurationPackageImpl theFsmConfigurationPackage_1 = (FsmConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI) instanceof FsmConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eNS_URI) : fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theFsmPackage.createPackageContents();
		theFsmConfigurationTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFsmConfigurationPackage_1.createPackageContents();

		// Initialize created meta-data
		theFsmPackage.initializePackageContents();
		theFsmConfigurationTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFsmConfigurationPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, theFsmPackage);
		return theFsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFSM() {
		return tracedFSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFSM_OriginalObject_FSM() {
		return (EReference)tracedFSMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmFactory getFsmFactory() {
		return (FsmFactory)getEFactoryInstance();
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
		tracedFSMEClass = createEClass(TRACED_FSM);
		createEReference(tracedFSMEClass, TRACED_FSM__ORIGINAL_OBJECT_FSM);
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
		fsm.FsmPackage theFsmPackage_1 = (fsm.FsmPackage)EPackage.Registry.INSTANCE.getEPackage(fsm.FsmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		EGenericType g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedFSMEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(tracedFSMEClass, TracedFSM.class, "TracedFSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedFSM_OriginalObject_FSM(), theFsmPackage_1.getFSM(), null, "originalObject_FSM", null, 0, 1, TracedFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(tracedFSMEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);
	}

} //FsmPackageImpl
