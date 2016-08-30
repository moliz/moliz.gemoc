/**
 */
package imlTrace.States.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import imlTrace.ImlTracePackage;

import imlTrace.States.Activity_current_Value;
import imlTrace.States.ConnectionPoint_firing_Value;
import imlTrace.States.State;
import imlTrace.States.State_current_Value;
import imlTrace.States.StatesFactory;
import imlTrace.States.StatesPackage;
import imlTrace.States.Value;
import imlTrace.States.Variable_value_Value;

import imlTrace.States.iml.impl.ImlPackageImpl;

import imlTrace.Steps.StepsPackage;

import imlTrace.Steps.impl.StepsPackageImpl;

import imlTrace.impl.ImlTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activity_current_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPoint_firing_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass state_current_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variable_value_ValueEClass = null;

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
	 * @see imlTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		ImlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ImlTracePackageImpl theImlTracePackage = (ImlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImlTracePackage.eNS_URI) instanceof ImlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImlTracePackage.eNS_URI) : ImlTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ImlPackageImpl theImlPackage_1 = (ImlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI) instanceof ImlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI) : imlTrace.States.iml.ImlPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theImlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theImlPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theImlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theImlPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity_current_Value() {
		return activity_current_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_current_Value_Current() {
		return (EAttribute)activity_current_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_current_Value_Parent() {
		return (EReference)activity_current_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_current_Value_States() {
		return (EReference)activity_current_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity_current_Value__GetStatesNoOpposite() {
		return activity_current_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPoint_firing_Value() {
		return connectionPoint_firing_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_firing_Value_Firing() {
		return (EAttribute)connectionPoint_firing_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_firing_Value_Parent() {
		return (EReference)connectionPoint_firing_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_firing_Value_States() {
		return (EReference)connectionPoint_firing_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectionPoint_firing_Value__GetStatesNoOpposite() {
		return connectionPoint_firing_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Activity_current_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ConnectionPoint_firing_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_State_current_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Variable_value_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState_current_Value() {
		return state_current_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_current_Value_Current() {
		return (EAttribute)state_current_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_current_Value_Parent() {
		return (EReference)state_current_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_current_Value_States() {
		return (EReference)state_current_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState_current_Value__GetStatesNoOpposite() {
		return state_current_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_StatesNoOpposite() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable_value_Value() {
		return variable_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_value_Value_Parent() {
		return (EReference)variable_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_value_Value_States() {
		return (EReference)variable_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_value_Value_Value() {
		return (EAttribute)variable_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable_value_Value__GetStatesNoOpposite() {
		return variable_value_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
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
		activity_current_ValueEClass = createEClass(ACTIVITY_CURRENT_VALUE);
		createEAttribute(activity_current_ValueEClass, ACTIVITY_CURRENT_VALUE__CURRENT);
		createEReference(activity_current_ValueEClass, ACTIVITY_CURRENT_VALUE__PARENT);
		createEReference(activity_current_ValueEClass, ACTIVITY_CURRENT_VALUE__STATES);
		createEOperation(activity_current_ValueEClass, ACTIVITY_CURRENT_VALUE___GET_STATES_NO_OPPOSITE);

		connectionPoint_firing_ValueEClass = createEClass(CONNECTION_POINT_FIRING_VALUE);
		createEAttribute(connectionPoint_firing_ValueEClass, CONNECTION_POINT_FIRING_VALUE__FIRING);
		createEReference(connectionPoint_firing_ValueEClass, CONNECTION_POINT_FIRING_VALUE__PARENT);
		createEReference(connectionPoint_firing_ValueEClass, CONNECTION_POINT_FIRING_VALUE__STATES);
		createEOperation(connectionPoint_firing_ValueEClass, CONNECTION_POINT_FIRING_VALUE___GET_STATES_NO_OPPOSITE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTIVITY_CURRENT_VALUES);
		createEReference(stateEClass, STATE__CONNECTION_POINT_FIRING_VALUES);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__STARTED_STEPS);
		createEReference(stateEClass, STATE__STATE_CURRENT_VALUES);
		createEReference(stateEClass, STATE__VARIABLE_VALUE_VALUES);

		state_current_ValueEClass = createEClass(STATE_CURRENT_VALUE);
		createEAttribute(state_current_ValueEClass, STATE_CURRENT_VALUE__CURRENT);
		createEReference(state_current_ValueEClass, STATE_CURRENT_VALUE__PARENT);
		createEReference(state_current_ValueEClass, STATE_CURRENT_VALUE__STATES);
		createEOperation(state_current_ValueEClass, STATE_CURRENT_VALUE___GET_STATES_NO_OPPOSITE);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__STATES_NO_OPPOSITE);

		variable_value_ValueEClass = createEClass(VARIABLE_VALUE_VALUE);
		createEReference(variable_value_ValueEClass, VARIABLE_VALUE_VALUE__PARENT);
		createEReference(variable_value_ValueEClass, VARIABLE_VALUE_VALUE__STATES);
		createEAttribute(variable_value_ValueEClass, VARIABLE_VALUE_VALUE__VALUE);
		createEOperation(variable_value_ValueEClass, VARIABLE_VALUE_VALUE___GET_STATES_NO_OPPOSITE);
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
		imlTrace.States.iml.ImlPackage theImlPackage_1 = (imlTrace.States.iml.ImlPackage)EPackage.Registry.INSTANCE.getEPackage(imlTrace.States.iml.ImlPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theImlPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activity_current_ValueEClass.getESuperTypes().add(this.getValue());
		connectionPoint_firing_ValueEClass.getESuperTypes().add(this.getValue());
		state_current_ValueEClass.getESuperTypes().add(this.getValue());
		variable_value_ValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(activity_current_ValueEClass, Activity_current_Value.class, "Activity_current_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_current_Value_Current(), ecorePackage.getEBoolean(), "current", null, 0, 1, Activity_current_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_current_Value_Parent(), theImlPackage_1.getTracedActivity(), theImlPackage_1.getTracedActivity_CurrentSequence(), "parent", null, 1, 1, Activity_current_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_current_Value_States(), this.getState(), this.getState_Activity_current_Values(), "states", null, 1, -1, Activity_current_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivity_current_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionPoint_firing_ValueEClass, ConnectionPoint_firing_Value.class, "ConnectionPoint_firing_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionPoint_firing_Value_Firing(), ecorePackage.getEBoolean(), "firing", null, 0, 1, ConnectionPoint_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPoint_firing_Value_Parent(), theImlPackage_1.getTracedConnectionPoint(), theImlPackage_1.getTracedConnectionPoint_FiringSequence(), "parent", null, 1, 1, ConnectionPoint_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPoint_firing_Value_States(), this.getState(), this.getState_ConnectionPoint_firing_Values(), "states", null, 1, -1, ConnectionPoint_firing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConnectionPoint_firing_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Activity_current_Values(), this.getActivity_current_Value(), this.getActivity_current_Value_States(), "activity_current_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ConnectionPoint_firing_Values(), this.getConnectionPoint_firing_Value(), this.getConnectionPoint_firing_Value_States(), "connectionPoint_firing_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_EndedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_State_current_Values(), this.getState_current_Value(), this.getState_current_Value_States(), "state_current_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Variable_value_Values(), this.getVariable_value_Value(), this.getVariable_value_Value_States(), "variable_value_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(state_current_ValueEClass, State_current_Value.class, "State_current_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_current_Value_Current(), ecorePackage.getEBoolean(), "current", null, 0, 1, State_current_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_current_Value_Parent(), theImlPackage_1.getTracedState(), theImlPackage_1.getTracedState_CurrentSequence(), "parent", null, 1, 1, State_current_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_current_Value_States(), this.getState(), this.getState_State_current_Values(), "states", null, 1, -1, State_current_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getState_current_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_StatesNoOpposite(), this.getState(), null, "statesNoOpposite", null, 1, -1, Value.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(variable_value_ValueEClass, Variable_value_Value.class, "Variable_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_value_Value_Parent(), theImlPackage_1.getTracedVariable(), theImlPackage_1.getTracedVariable_ValueSequence(), "parent", null, 1, 1, Variable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_value_Value_States(), this.getState(), this.getState_Variable_value_Values(), "states", null, 1, -1, Variable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_value_Value_Value(), ecorePackage.getEString(), "value", null, 0, 1, Variable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVariable_value_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// aspect
		createAspectAnnotations();
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
		  (activity_current_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (connectionPoint_firing_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (state_current_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (variable_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getActivity_current_Value_Current(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConnectionPoint_firing_Value_Firing(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_current_Value_Current(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_value_Value_Value(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl
