/**
 */
package imlTrace;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imlTrace.ImlTraceFactory
 * @model kind="package"
 * @generated
 */
public interface ImlTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imlTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "imlTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imlTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImlTracePackage eINSTANCE = imlTrace.impl.ImlTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link imlTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imlTrace.impl.SpecificTraceImpl
	 * @see imlTrace.impl.ImlTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Iml Activity Do Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_ACTIVITY_DO_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iml Header Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_HEADER_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iml Selection Convergence Do Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_SELECTION_CONVERGENCE_DO_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iml Selection Divergence Do Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_SELECTION_DIVERGENCE_DO_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Iml Simultaneous Convergence Do Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Iml Simultaneous Divergence Do Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Iml State Transition Do Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_STATE_TRANSITION_DO_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Iml State Activate Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_STATE_ACTIVATE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Iml State Deactivate Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_STATE_DEACTIVATE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Iml State Execute Activities Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_STATE_EXECUTE_ACTIVITIES_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Iml traced Activitys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_ACTIVITYS = TracePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Iml traced Add Datas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_ADD_DATAS = TracePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Iml traced Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_CONNECTIONS = TracePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Iml traced Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_EVENTS = TracePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Iml traced Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_HEADERS = TracePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Iml traced Jumps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_JUMPS = TracePackage.TRACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Iml traced Selection Convergences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES = TracePackage.TRACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Iml traced Selection Divergences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES = TracePackage.TRACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Iml traced Simultaneous Convergences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES = TracePackage.TRACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Iml traced Simultaneous Divergences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES = TracePackage.TRACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Iml traced State Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS = TracePackage.TRACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Iml traced States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_STATES = TracePackage.TRACE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Iml traced Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__IML_TRACED_VARIABLES = TracePackage.TRACE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_OPERATION_COUNT = TracePackage.TRACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link imlTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see imlTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_Activity_DoExecute_Sequence <em>Iml Activity Do Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml Activity Do Execute Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_Activity_DoExecute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_Activity_DoExecute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_Header_Execute_Sequence <em>Iml Header Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml Header Execute Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_Header_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_Header_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_SelectionConvergence_DoFire_Sequence <em>Iml Selection Convergence Do Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml Selection Convergence Do Fire Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_SelectionConvergence_DoFire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_SelectionConvergence_DoFire_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_SelectionDivergence_DoFire_Sequence <em>Iml Selection Divergence Do Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml Selection Divergence Do Fire Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_SelectionDivergence_DoFire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_SelectionDivergence_DoFire_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_SimultaneousConvergence_DoFire_Sequence <em>Iml Simultaneous Convergence Do Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml Simultaneous Convergence Do Fire Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_SimultaneousConvergence_DoFire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_SimultaneousConvergence_DoFire_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_SimultaneousDivergence_DoFire_Sequence <em>Iml Simultaneous Divergence Do Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml Simultaneous Divergence Do Fire Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_SimultaneousDivergence_DoFire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_SimultaneousDivergence_DoFire_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_StateTransition_DoFire_Sequence <em>Iml State Transition Do Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml State Transition Do Fire Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_StateTransition_DoFire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_StateTransition_DoFire_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_State_Activate_Sequence <em>Iml State Activate Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml State Activate Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_State_Activate_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_State_Activate_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_State_Deactivate_Sequence <em>Iml State Deactivate Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml State Deactivate Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_State_Deactivate_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_State_Deactivate_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link imlTrace.SpecificTrace#getIml_State_ExecuteActivities_Sequence <em>Iml State Execute Activities Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iml State Execute Activities Sequence</em>'.
	 * @see imlTrace.SpecificTrace#getIml_State_ExecuteActivities_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_State_ExecuteActivities_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedActivitys <em>Iml traced Activitys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Activitys</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedActivitys()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedActivitys();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedAddDatas <em>Iml traced Add Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Add Datas</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedAddDatas()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedAddDatas();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedConnections <em>Iml traced Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Connections</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedConnections()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedEvents <em>Iml traced Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Events</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedEvents()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedHeaders <em>Iml traced Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Headers</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedHeaders()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedHeaders();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedJumps <em>Iml traced Jumps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Jumps</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedJumps()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedJumps();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedSelectionConvergences <em>Iml traced Selection Convergences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Selection Convergences</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedSelectionConvergences()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedSelectionConvergences();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedSelectionDivergences <em>Iml traced Selection Divergences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Selection Divergences</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedSelectionDivergences()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedSelectionDivergences();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedSimultaneousConvergences <em>Iml traced Simultaneous Convergences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Simultaneous Convergences</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedSimultaneousConvergences()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedSimultaneousConvergences();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedSimultaneousDivergences <em>Iml traced Simultaneous Divergences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Simultaneous Divergences</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedSimultaneousDivergences()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedSimultaneousDivergences();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedStateTransitions <em>Iml traced State Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced State Transitions</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedStateTransitions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedStateTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedStates <em>Iml traced States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced States</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedStates()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedStates();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getIml_tracedVariables <em>Iml traced Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iml traced Variables</em>'.
	 * @see imlTrace.SpecificTrace#getIml_tracedVariables()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Iml_tracedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link imlTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see imlTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImlTraceFactory getImlTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link imlTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imlTrace.impl.SpecificTraceImpl
		 * @see imlTrace.impl.ImlTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Iml Activity Do Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_ACTIVITY_DO_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_Activity_DoExecute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml Header Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_HEADER_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_Header_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml Selection Convergence Do Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_SELECTION_CONVERGENCE_DO_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_SelectionConvergence_DoFire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml Selection Divergence Do Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_SELECTION_DIVERGENCE_DO_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_SelectionDivergence_DoFire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml Simultaneous Convergence Do Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_SimultaneousConvergence_DoFire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml Simultaneous Divergence Do Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_SimultaneousDivergence_DoFire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml State Transition Do Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_STATE_TRANSITION_DO_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_StateTransition_DoFire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml State Activate Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_STATE_ACTIVATE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_State_Activate_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml State Deactivate Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_STATE_DEACTIVATE_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_State_Deactivate_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml State Execute Activities Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_STATE_EXECUTE_ACTIVITIES_SEQUENCE = eINSTANCE.getSpecificTrace_Iml_State_ExecuteActivities_Sequence();

		/**
		 * The meta object literal for the '<em><b>Iml traced Activitys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_ACTIVITYS = eINSTANCE.getSpecificTrace_Iml_tracedActivitys();

		/**
		 * The meta object literal for the '<em><b>Iml traced Add Datas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_ADD_DATAS = eINSTANCE.getSpecificTrace_Iml_tracedAddDatas();

		/**
		 * The meta object literal for the '<em><b>Iml traced Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_CONNECTIONS = eINSTANCE.getSpecificTrace_Iml_tracedConnections();

		/**
		 * The meta object literal for the '<em><b>Iml traced Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_EVENTS = eINSTANCE.getSpecificTrace_Iml_tracedEvents();

		/**
		 * The meta object literal for the '<em><b>Iml traced Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_HEADERS = eINSTANCE.getSpecificTrace_Iml_tracedHeaders();

		/**
		 * The meta object literal for the '<em><b>Iml traced Jumps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_JUMPS = eINSTANCE.getSpecificTrace_Iml_tracedJumps();

		/**
		 * The meta object literal for the '<em><b>Iml traced Selection Convergences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES = eINSTANCE.getSpecificTrace_Iml_tracedSelectionConvergences();

		/**
		 * The meta object literal for the '<em><b>Iml traced Selection Divergences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES = eINSTANCE.getSpecificTrace_Iml_tracedSelectionDivergences();

		/**
		 * The meta object literal for the '<em><b>Iml traced Simultaneous Convergences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES = eINSTANCE.getSpecificTrace_Iml_tracedSimultaneousConvergences();

		/**
		 * The meta object literal for the '<em><b>Iml traced Simultaneous Divergences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES = eINSTANCE.getSpecificTrace_Iml_tracedSimultaneousDivergences();

		/**
		 * The meta object literal for the '<em><b>Iml traced State Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS = eINSTANCE.getSpecificTrace_Iml_tracedStateTransitions();

		/**
		 * The meta object literal for the '<em><b>Iml traced States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_STATES = eINSTANCE.getSpecificTrace_Iml_tracedStates();

		/**
		 * The meta object literal for the '<em><b>Iml traced Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__IML_TRACED_VARIABLES = eINSTANCE.getSpecificTrace_Iml_tracedVariables();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //ImlTracePackage
