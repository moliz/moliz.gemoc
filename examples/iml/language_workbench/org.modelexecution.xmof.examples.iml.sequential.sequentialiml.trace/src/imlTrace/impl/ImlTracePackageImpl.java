/**
 */
package imlTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import imlTrace.ImlTraceFactory;
import imlTrace.ImlTracePackage;
import imlTrace.SpecificTrace;

import imlTrace.States.StatesPackage;

import imlTrace.States.iml.impl.ImlPackageImpl;

import imlTrace.States.impl.StatesPackageImpl;

import imlTrace.Steps.StepsPackage;

import imlTrace.Steps.impl.StepsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImlTracePackageImpl extends EPackageImpl implements ImlTracePackage {
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
	 * @see imlTrace.ImlTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImlTracePackageImpl() {
		super(eNS_URI, ImlTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImlTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImlTracePackage init() {
		if (isInited) return (ImlTracePackage)EPackage.Registry.INSTANCE.getEPackage(ImlTracePackage.eNS_URI);

		// Obtain or create and register package
		ImlTracePackageImpl theImlTracePackage = (ImlTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImlTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImlTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		ImlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		ImlPackageImpl theImlPackage_1 = (ImlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI) instanceof ImlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI) : imlTrace.States.iml.ImlPackage.eINSTANCE);

		// Create package meta-data objects
		theImlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theImlPackage_1.createPackageContents();

		// Initialize created meta-data
		theImlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theImlPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImlTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImlTracePackage.eNS_URI, theImlTracePackage);
		return theImlTracePackage;
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
	public EReference getSpecificTrace_Iml_Activity_DoExecute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_Header_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_SelectionConvergence_DoFire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_SelectionDivergence_DoFire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_SimultaneousConvergence_DoFire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_SimultaneousDivergence_DoFire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_StateTransition_DoFire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_State_Activate_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_State_Deactivate_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_State_ExecuteActivities_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedActivitys() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedAddDatas() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedConnections() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedEvents() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedHeaders() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedJumps() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedSelectionConvergences() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedSelectionDivergences() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedSimultaneousConvergences() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedSimultaneousDivergences() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedStateTransitions() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedStates() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Iml_tracedVariables() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_StatesTrace() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImlTraceFactory getImlTraceFactory() {
		return (ImlTraceFactory)getEFactoryInstance();
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
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_ACTIVITY_DO_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_HEADER_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_SELECTION_CONVERGENCE_DO_FIRE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_SELECTION_DIVERGENCE_DO_FIRE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_STATE_TRANSITION_DO_FIRE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_STATE_ACTIVATE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_STATE_DEACTIVATE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_STATE_EXECUTE_ACTIVITIES_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_ACTIVITYS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_ADD_DATAS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_CONNECTIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_EVENTS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_HEADERS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_JUMPS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_STATES);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__IML_TRACED_VARIABLES);
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
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		imlTrace.States.iml.ImlPackage theImlPackage_1 = (imlTrace.States.iml.ImlPackage)EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTracePackage.getTrace());
		EGenericType g2 = createEGenericType(theTracePackage.getSequentialStep());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theStepsPackage.getSpecificStep());
		g2.getETypeArguments().add(g3);
		specificTraceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(specificTraceEClass, SpecificTrace.class, "SpecificTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificTrace_Iml_Activity_DoExecute_Sequence(), theStepsPackage.getIml_Activity_DoExecute(), null, "Iml_Activity_DoExecute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_Header_Execute_Sequence(), theStepsPackage.getIml_Header_Execute(), null, "Iml_Header_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_SelectionConvergence_DoFire_Sequence(), theStepsPackage.getIml_SelectionConvergence_DoFire(), null, "Iml_SelectionConvergence_DoFire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_SelectionDivergence_DoFire_Sequence(), theStepsPackage.getIml_SelectionDivergence_DoFire(), null, "Iml_SelectionDivergence_DoFire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_SimultaneousConvergence_DoFire_Sequence(), theStepsPackage.getIml_SimultaneousConvergence_DoFire(), null, "Iml_SimultaneousConvergence_DoFire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_SimultaneousDivergence_DoFire_Sequence(), theStepsPackage.getIml_SimultaneousDivergence_DoFire(), null, "Iml_SimultaneousDivergence_DoFire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_StateTransition_DoFire_Sequence(), theStepsPackage.getIml_StateTransition_DoFire(), null, "Iml_StateTransition_DoFire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_State_Activate_Sequence(), theStepsPackage.getIml_State_Activate(), null, "Iml_State_Activate_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_State_Deactivate_Sequence(), theStepsPackage.getIml_State_Deactivate(), null, "Iml_State_Deactivate_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_State_ExecuteActivities_Sequence(), theStepsPackage.getIml_State_ExecuteActivities(), null, "Iml_State_ExecuteActivities_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedActivitys(), theImlPackage_1.getTracedActivity(), null, "iml_tracedActivitys", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedAddDatas(), theImlPackage_1.getTracedAddData(), null, "iml_tracedAddDatas", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedConnections(), theImlPackage_1.getTracedConnection(), null, "iml_tracedConnections", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedEvents(), theImlPackage_1.getTracedEvent(), null, "iml_tracedEvents", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedHeaders(), theImlPackage_1.getTracedHeader(), null, "iml_tracedHeaders", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedJumps(), theImlPackage_1.getTracedJump(), null, "iml_tracedJumps", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedSelectionConvergences(), theImlPackage_1.getTracedSelectionConvergence(), null, "iml_tracedSelectionConvergences", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedSelectionDivergences(), theImlPackage_1.getTracedSelectionDivergence(), null, "iml_tracedSelectionDivergences", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedSimultaneousConvergences(), theImlPackage_1.getTracedSimultaneousConvergence(), null, "iml_tracedSimultaneousConvergences", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedSimultaneousDivergences(), theImlPackage_1.getTracedSimultaneousDivergence(), null, "iml_tracedSimultaneousDivergences", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedStateTransitions(), theImlPackage_1.getTracedStateTransition(), null, "iml_tracedStateTransitions", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedStates(), theImlPackage_1.getTracedState(), null, "iml_tracedStates", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Iml_tracedVariables(), theImlPackage_1.getTracedVariable(), null, "iml_tracedVariables", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ImlTracePackageImpl
