/**
 */
package imlTrace.States.iml.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import imlTrace.ImlTracePackage;

import imlTrace.States.StatesPackage;

import imlTrace.States.iml.ImlFactory;
import imlTrace.States.iml.ImlPackage;
import imlTrace.States.iml.TracedActivity;
import imlTrace.States.iml.TracedAddData;
import imlTrace.States.iml.TracedConnection;
import imlTrace.States.iml.TracedConnectionPoint;
import imlTrace.States.iml.TracedElement;
import imlTrace.States.iml.TracedEvent;
import imlTrace.States.iml.TracedHeader;
import imlTrace.States.iml.TracedIdentifyableElement;
import imlTrace.States.iml.TracedJump;
import imlTrace.States.iml.TracedSelectionConvergence;
import imlTrace.States.iml.TracedSelectionDivergence;
import imlTrace.States.iml.TracedSimultaneousConvergence;
import imlTrace.States.iml.TracedSimultaneousDivergence;
import imlTrace.States.iml.TracedState;
import imlTrace.States.iml.TracedStateTransition;
import imlTrace.States.iml.TracedVariable;

import imlTrace.States.impl.StatesPackageImpl;

import imlTrace.Steps.StepsPackage;

import imlTrace.Steps.impl.StepsPackageImpl;

import imlTrace.impl.ImlTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImlPackageImpl extends EPackageImpl implements ImlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAddDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConnectionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIdentifyableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedJumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSelectionConvergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSelectionDivergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSimultaneousConvergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSimultaneousDivergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableEClass = null;

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
	 * @see imlTrace.States.iml.ImlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImlPackageImpl() {
		super(eNS_URI, ImlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImlPackage init() {
		if (isInited) return (ImlPackage)EPackage.Registry.INSTANCE.getEPackage(ImlPackage.eNS_URI);

		// Obtain or create and register package
		ImlPackageImpl theImlPackage = (ImlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ImlTracePackageImpl theImlTracePackage = (ImlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImlTracePackage.eNS_URI) instanceof ImlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImlTracePackage.eNS_URI) : ImlTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theImlPackage.createPackageContents();
		theImlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theImlPackage.initializePackageContents();
		theImlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImlPackage.eNS_URI, theImlPackage);
		return theImlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivity() {
		return tracedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_CurrentSequence() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_OriginalObject() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAddData() {
		return tracedAddDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAddData_OriginalObject() {
		return (EReference)tracedAddDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConnection() {
		return tracedConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedConnection_OriginalObject() {
		return (EReference)tracedConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConnectionPoint() {
		return tracedConnectionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedConnectionPoint_FiringSequence() {
		return (EReference)tracedConnectionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedElement() {
		return tracedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedEvent() {
		return tracedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedEvent_OriginalObject() {
		return (EReference)tracedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedHeader() {
		return tracedHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedHeader_OriginalObject() {
		return (EReference)tracedHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIdentifyableElement() {
		return tracedIdentifyableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedJump() {
		return tracedJumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedJump_OriginalObject() {
		return (EReference)tracedJumpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSelectionConvergence() {
		return tracedSelectionConvergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSelectionConvergence_OriginalObject() {
		return (EReference)tracedSelectionConvergenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSelectionDivergence() {
		return tracedSelectionDivergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSelectionDivergence_OriginalObject() {
		return (EReference)tracedSelectionDivergenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSimultaneousConvergence() {
		return tracedSimultaneousConvergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSimultaneousConvergence_OriginalObject() {
		return (EReference)tracedSimultaneousConvergenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSimultaneousDivergence() {
		return tracedSimultaneousDivergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSimultaneousDivergence_OriginalObject() {
		return (EReference)tracedSimultaneousDivergenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedState() {
		return tracedStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedState_CurrentSequence() {
		return (EReference)tracedStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedState_OriginalObject() {
		return (EReference)tracedStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStateTransition() {
		return tracedStateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedStateTransition_OriginalObject() {
		return (EReference)tracedStateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVariable() {
		return tracedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_OriginalObject() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_ValueSequence() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImlFactory getImlFactory() {
		return (ImlFactory)getEFactoryInstance();
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
		tracedActivityEClass = createEClass(TRACED_ACTIVITY);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__CURRENT_SEQUENCE);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__ORIGINAL_OBJECT);

		tracedAddDataEClass = createEClass(TRACED_ADD_DATA);
		createEReference(tracedAddDataEClass, TRACED_ADD_DATA__ORIGINAL_OBJECT);

		tracedConnectionEClass = createEClass(TRACED_CONNECTION);
		createEReference(tracedConnectionEClass, TRACED_CONNECTION__ORIGINAL_OBJECT);

		tracedConnectionPointEClass = createEClass(TRACED_CONNECTION_POINT);
		createEReference(tracedConnectionPointEClass, TRACED_CONNECTION_POINT__FIRING_SEQUENCE);

		tracedElementEClass = createEClass(TRACED_ELEMENT);

		tracedEventEClass = createEClass(TRACED_EVENT);
		createEReference(tracedEventEClass, TRACED_EVENT__ORIGINAL_OBJECT);

		tracedHeaderEClass = createEClass(TRACED_HEADER);
		createEReference(tracedHeaderEClass, TRACED_HEADER__ORIGINAL_OBJECT);

		tracedIdentifyableElementEClass = createEClass(TRACED_IDENTIFYABLE_ELEMENT);

		tracedJumpEClass = createEClass(TRACED_JUMP);
		createEReference(tracedJumpEClass, TRACED_JUMP__ORIGINAL_OBJECT);

		tracedSelectionConvergenceEClass = createEClass(TRACED_SELECTION_CONVERGENCE);
		createEReference(tracedSelectionConvergenceEClass, TRACED_SELECTION_CONVERGENCE__ORIGINAL_OBJECT);

		tracedSelectionDivergenceEClass = createEClass(TRACED_SELECTION_DIVERGENCE);
		createEReference(tracedSelectionDivergenceEClass, TRACED_SELECTION_DIVERGENCE__ORIGINAL_OBJECT);

		tracedSimultaneousConvergenceEClass = createEClass(TRACED_SIMULTANEOUS_CONVERGENCE);
		createEReference(tracedSimultaneousConvergenceEClass, TRACED_SIMULTANEOUS_CONVERGENCE__ORIGINAL_OBJECT);

		tracedSimultaneousDivergenceEClass = createEClass(TRACED_SIMULTANEOUS_DIVERGENCE);
		createEReference(tracedSimultaneousDivergenceEClass, TRACED_SIMULTANEOUS_DIVERGENCE__ORIGINAL_OBJECT);

		tracedStateEClass = createEClass(TRACED_STATE);
		createEReference(tracedStateEClass, TRACED_STATE__CURRENT_SEQUENCE);
		createEReference(tracedStateEClass, TRACED_STATE__ORIGINAL_OBJECT);

		tracedStateTransitionEClass = createEClass(TRACED_STATE_TRANSITION);
		createEReference(tracedStateTransitionEClass, TRACED_STATE_TRANSITION__ORIGINAL_OBJECT);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__ORIGINAL_OBJECT);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__VALUE_SEQUENCE);
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
		org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage theImlPackage_1 = (org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage)EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.xmof.examples.iml.sequentialiml.iml.ImlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedActivityEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedAddDataEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedConnectionEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedEventEClass.getESuperTypes().add(this.getTracedElement());
		tracedHeaderEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedIdentifyableElementEClass.getESuperTypes().add(this.getTracedElement());
		tracedJumpEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedJumpEClass.getESuperTypes().add(this.getTracedConnectionPoint());
		tracedSelectionConvergenceEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedSelectionConvergenceEClass.getESuperTypes().add(this.getTracedConnectionPoint());
		tracedSelectionDivergenceEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedSelectionDivergenceEClass.getESuperTypes().add(this.getTracedConnectionPoint());
		tracedSimultaneousConvergenceEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedSimultaneousConvergenceEClass.getESuperTypes().add(this.getTracedConnectionPoint());
		tracedSimultaneousDivergenceEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedSimultaneousDivergenceEClass.getESuperTypes().add(this.getTracedConnectionPoint());
		tracedStateEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedStateEClass.getESuperTypes().add(this.getTracedConnectionPoint());
		tracedStateTransitionEClass.getESuperTypes().add(this.getTracedIdentifyableElement());
		tracedStateTransitionEClass.getESuperTypes().add(this.getTracedConnectionPoint());
		tracedVariableEClass.getESuperTypes().add(this.getTracedIdentifyableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedActivityEClass, TracedActivity.class, "TracedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivity_CurrentSequence(), theStatesPackage.getActivity_current_Value(), theStatesPackage.getActivity_current_Value_Parent(), "currentSequence", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_OriginalObject(), theImlPackage_1.getActivity(), null, "originalObject", null, 0, 1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedAddDataEClass, TracedAddData.class, "TracedAddData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAddData_OriginalObject(), theImlPackage_1.getAddData(), null, "originalObject", null, 0, 1, TracedAddData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedConnectionEClass, TracedConnection.class, "TracedConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedConnection_OriginalObject(), theImlPackage_1.getConnection(), null, "originalObject", null, 0, 1, TracedConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedConnectionPointEClass, TracedConnectionPoint.class, "TracedConnectionPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedConnectionPoint_FiringSequence(), theStatesPackage.getConnectionPoint_firing_Value(), theStatesPackage.getConnectionPoint_firing_Value_Parent(), "firingSequence", null, 0, -1, TracedConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedElementEClass, TracedElement.class, "TracedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedEventEClass, TracedEvent.class, "TracedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedEvent_OriginalObject(), theImlPackage_1.getEvent(), null, "originalObject", null, 0, 1, TracedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedHeaderEClass, TracedHeader.class, "TracedHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedHeader_OriginalObject(), theImlPackage_1.getHeader(), null, "originalObject", null, 0, 1, TracedHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIdentifyableElementEClass, TracedIdentifyableElement.class, "TracedIdentifyableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedJumpEClass, TracedJump.class, "TracedJump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedJump_OriginalObject(), theImlPackage_1.getJump(), null, "originalObject", null, 0, 1, TracedJump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedSelectionConvergenceEClass, TracedSelectionConvergence.class, "TracedSelectionConvergence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSelectionConvergence_OriginalObject(), theImlPackage_1.getSelectionConvergence(), null, "originalObject", null, 0, 1, TracedSelectionConvergence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedSelectionDivergenceEClass, TracedSelectionDivergence.class, "TracedSelectionDivergence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSelectionDivergence_OriginalObject(), theImlPackage_1.getSelectionDivergence(), null, "originalObject", null, 0, 1, TracedSelectionDivergence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedSimultaneousConvergenceEClass, TracedSimultaneousConvergence.class, "TracedSimultaneousConvergence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSimultaneousConvergence_OriginalObject(), theImlPackage_1.getSimultaneousConvergence(), null, "originalObject", null, 0, 1, TracedSimultaneousConvergence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedSimultaneousDivergenceEClass, TracedSimultaneousDivergence.class, "TracedSimultaneousDivergence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSimultaneousDivergence_OriginalObject(), theImlPackage_1.getSimultaneousDivergence(), null, "originalObject", null, 0, 1, TracedSimultaneousDivergence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedStateEClass, TracedState.class, "TracedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedState_CurrentSequence(), theStatesPackage.getState_current_Value(), theStatesPackage.getState_current_Value_Parent(), "currentSequence", null, 0, -1, TracedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedState_OriginalObject(), theImlPackage_1.getState(), null, "originalObject", null, 0, 1, TracedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedStateTransitionEClass, TracedStateTransition.class, "TracedStateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedStateTransition_OriginalObject(), theImlPackage_1.getStateTransition(), null, "originalObject", null, 0, 1, TracedStateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVariable_OriginalObject(), theImlPackage_1.getVariable(), null, "originalObject", null, 0, 1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedVariable_ValueSequence(), theStatesPackage.getVariable_value_Value(), theStatesPackage.getVariable_value_Value_Parent(), "valueSequence", null, 0, -1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ImlPackageImpl
