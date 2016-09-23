/**
 */
package imlTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import imlTrace.States.State;

import imlTrace.States.iml.TracedActivity;
import imlTrace.States.iml.TracedAddData;
import imlTrace.States.iml.TracedConnection;
import imlTrace.States.iml.TracedEvent;
import imlTrace.States.iml.TracedHeader;
import imlTrace.States.iml.TracedJump;
import imlTrace.States.iml.TracedSelectionConvergence;
import imlTrace.States.iml.TracedSelectionDivergence;
import imlTrace.States.iml.TracedSimultaneousConvergence;
import imlTrace.States.iml.TracedSimultaneousDivergence;
import imlTrace.States.iml.TracedState;
import imlTrace.States.iml.TracedStateTransition;
import imlTrace.States.iml.TracedVariable;

import imlTrace.Steps.Iml_Activity_DoExecute;
import imlTrace.Steps.Iml_Header_Execute;
import imlTrace.Steps.Iml_SelectionConvergence_DoFire;
import imlTrace.Steps.Iml_SelectionDivergence_DoFire;
import imlTrace.Steps.Iml_SimultaneousConvergence_DoFire;
import imlTrace.Steps.Iml_SimultaneousDivergence_DoFire;
import imlTrace.Steps.Iml_StateTransition_DoFire;
import imlTrace.Steps.Iml_State_Activate;
import imlTrace.Steps.Iml_State_Deactivate;
import imlTrace.Steps.Iml_State_ExecuteActivities;
import imlTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.SpecificTrace#getIml_Activity_DoExecute_Sequence <em>Iml Activity Do Execute Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_Header_Execute_Sequence <em>Iml Header Execute Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_SelectionConvergence_DoFire_Sequence <em>Iml Selection Convergence Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_SelectionDivergence_DoFire_Sequence <em>Iml Selection Divergence Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_SimultaneousConvergence_DoFire_Sequence <em>Iml Simultaneous Convergence Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_SimultaneousDivergence_DoFire_Sequence <em>Iml Simultaneous Divergence Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_StateTransition_DoFire_Sequence <em>Iml State Transition Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_State_Activate_Sequence <em>Iml State Activate Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_State_Deactivate_Sequence <em>Iml State Deactivate Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_State_ExecuteActivities_Sequence <em>Iml State Execute Activities Sequence</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedActivitys <em>Iml traced Activitys</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedAddDatas <em>Iml traced Add Datas</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedConnections <em>Iml traced Connections</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedEvents <em>Iml traced Events</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedHeaders <em>Iml traced Headers</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedJumps <em>Iml traced Jumps</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedSelectionConvergences <em>Iml traced Selection Convergences</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedSelectionDivergences <em>Iml traced Selection Divergences</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedSimultaneousConvergences <em>Iml traced Simultaneous Convergences</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedSimultaneousDivergences <em>Iml traced Simultaneous Divergences</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedStateTransitions <em>Iml traced State Transitions</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedStates <em>Iml traced States</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getIml_tracedVariables <em>Iml traced Variables</em>}</li>
 *   <li>{@link imlTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see imlTrace.ImlTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Iml Activity Do Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_Activity_DoExecute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml Activity Do Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml Activity Do Execute Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_Activity_DoExecute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_Activity_DoExecute> getIml_Activity_DoExecute_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml Header Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_Header_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml Header Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml Header Execute Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_Header_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_Header_Execute> getIml_Header_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml Selection Convergence Do Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_SelectionConvergence_DoFire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml Selection Convergence Do Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml Selection Convergence Do Fire Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_SelectionConvergence_DoFire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_SelectionConvergence_DoFire> getIml_SelectionConvergence_DoFire_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml Selection Divergence Do Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_SelectionDivergence_DoFire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml Selection Divergence Do Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml Selection Divergence Do Fire Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_SelectionDivergence_DoFire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_SelectionDivergence_DoFire> getIml_SelectionDivergence_DoFire_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml Simultaneous Convergence Do Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml Simultaneous Convergence Do Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml Simultaneous Convergence Do Fire Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_SimultaneousConvergence_DoFire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_SimultaneousConvergence_DoFire> getIml_SimultaneousConvergence_DoFire_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml Simultaneous Divergence Do Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml Simultaneous Divergence Do Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml Simultaneous Divergence Do Fire Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_SimultaneousDivergence_DoFire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_SimultaneousDivergence_DoFire> getIml_SimultaneousDivergence_DoFire_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml State Transition Do Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_StateTransition_DoFire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml State Transition Do Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml State Transition Do Fire Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_StateTransition_DoFire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_StateTransition_DoFire> getIml_StateTransition_DoFire_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml State Activate Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_State_Activate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml State Activate Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml State Activate Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_State_Activate_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_State_Activate> getIml_State_Activate_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml State Deactivate Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_State_Deactivate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml State Deactivate Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml State Deactivate Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_State_Deactivate_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_State_Deactivate> getIml_State_Deactivate_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml State Execute Activities Sequence</b></em>' reference list.
	 * The list contents are of type {@link imlTrace.Steps.Iml_State_ExecuteActivities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml State Execute Activities Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml State Execute Activities Sequence</em>' reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_State_ExecuteActivities_Sequence()
	 * @model
	 * @generated
	 */
	EList<Iml_State_ExecuteActivities> getIml_State_ExecuteActivities_Sequence();

	/**
	 * Returns the value of the '<em><b>Iml traced Activitys</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Activitys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Activitys</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedActivitys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivity> getIml_tracedActivitys();

	/**
	 * Returns the value of the '<em><b>Iml traced Add Datas</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedAddData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Add Datas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Add Datas</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedAddDatas()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedAddData> getIml_tracedAddDatas();

	/**
	 * Returns the value of the '<em><b>Iml traced Connections</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Connections</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedConnections()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedConnection> getIml_tracedConnections();

	/**
	 * Returns the value of the '<em><b>Iml traced Events</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Events</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedEvents()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedEvent> getIml_tracedEvents();

	/**
	 * Returns the value of the '<em><b>Iml traced Headers</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Headers</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedHeaders()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedHeader> getIml_tracedHeaders();

	/**
	 * Returns the value of the '<em><b>Iml traced Jumps</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedJump}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Jumps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Jumps</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedJumps()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedJump> getIml_tracedJumps();

	/**
	 * Returns the value of the '<em><b>Iml traced Selection Convergences</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedSelectionConvergence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Selection Convergences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Selection Convergences</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedSelectionConvergences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedSelectionConvergence> getIml_tracedSelectionConvergences();

	/**
	 * Returns the value of the '<em><b>Iml traced Selection Divergences</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedSelectionDivergence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Selection Divergences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Selection Divergences</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedSelectionDivergences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedSelectionDivergence> getIml_tracedSelectionDivergences();

	/**
	 * Returns the value of the '<em><b>Iml traced Simultaneous Convergences</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedSimultaneousConvergence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Simultaneous Convergences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Simultaneous Convergences</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedSimultaneousConvergences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedSimultaneousConvergence> getIml_tracedSimultaneousConvergences();

	/**
	 * Returns the value of the '<em><b>Iml traced Simultaneous Divergences</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedSimultaneousDivergence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Simultaneous Divergences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Simultaneous Divergences</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedSimultaneousDivergences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedSimultaneousDivergence> getIml_tracedSimultaneousDivergences();

	/**
	 * Returns the value of the '<em><b>Iml traced State Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedStateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced State Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced State Transitions</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedStateTransitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedStateTransition> getIml_tracedStateTransitions();

	/**
	 * Returns the value of the '<em><b>Iml traced States</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced States</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedStates()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedState> getIml_tracedStates();

	/**
	 * Returns the value of the '<em><b>Iml traced Variables</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.iml.TracedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iml traced Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iml traced Variables</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_Iml_tracedVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedVariable> getIml_tracedVariables();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link imlTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see imlTrace.ImlTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
