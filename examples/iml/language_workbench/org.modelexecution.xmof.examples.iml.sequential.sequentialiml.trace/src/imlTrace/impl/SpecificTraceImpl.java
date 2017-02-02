/**
 */
package imlTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import imlTrace.ImlTracePackage;
import imlTrace.SpecificTrace;

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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_Activity_DoExecute_Sequence <em>Iml Activity Do Execute Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_Header_Execute_Sequence <em>Iml Header Execute Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_SelectionConvergence_DoFire_Sequence <em>Iml Selection Convergence Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_SelectionDivergence_DoFire_Sequence <em>Iml Selection Divergence Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_SimultaneousConvergence_DoFire_Sequence <em>Iml Simultaneous Convergence Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_SimultaneousDivergence_DoFire_Sequence <em>Iml Simultaneous Divergence Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_StateTransition_DoFire_Sequence <em>Iml State Transition Do Fire Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_State_Activate_Sequence <em>Iml State Activate Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_State_Deactivate_Sequence <em>Iml State Deactivate Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_State_ExecuteActivities_Sequence <em>Iml State Execute Activities Sequence</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedActivitys <em>Iml traced Activitys</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedAddDatas <em>Iml traced Add Datas</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedConnections <em>Iml traced Connections</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedEvents <em>Iml traced Events</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedHeaders <em>Iml traced Headers</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedJumps <em>Iml traced Jumps</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedSelectionConvergences <em>Iml traced Selection Convergences</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedSelectionDivergences <em>Iml traced Selection Divergences</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedSimultaneousConvergences <em>Iml traced Simultaneous Convergences</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedSimultaneousDivergences <em>Iml traced Simultaneous Divergences</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedStateTransitions <em>Iml traced State Transitions</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedStates <em>Iml traced States</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getIml_tracedVariables <em>Iml traced Variables</em>}</li>
 *   <li>{@link imlTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getIml_Activity_DoExecute_Sequence() <em>Iml Activity Do Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_Activity_DoExecute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_Activity_DoExecute> iml_Activity_DoExecute_Sequence;

	/**
	 * The cached value of the '{@link #getIml_Header_Execute_Sequence() <em>Iml Header Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_Header_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_Header_Execute> iml_Header_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getIml_SelectionConvergence_DoFire_Sequence() <em>Iml Selection Convergence Do Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_SelectionConvergence_DoFire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_SelectionConvergence_DoFire> iml_SelectionConvergence_DoFire_Sequence;

	/**
	 * The cached value of the '{@link #getIml_SelectionDivergence_DoFire_Sequence() <em>Iml Selection Divergence Do Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_SelectionDivergence_DoFire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_SelectionDivergence_DoFire> iml_SelectionDivergence_DoFire_Sequence;

	/**
	 * The cached value of the '{@link #getIml_SimultaneousConvergence_DoFire_Sequence() <em>Iml Simultaneous Convergence Do Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_SimultaneousConvergence_DoFire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_SimultaneousConvergence_DoFire> iml_SimultaneousConvergence_DoFire_Sequence;

	/**
	 * The cached value of the '{@link #getIml_SimultaneousDivergence_DoFire_Sequence() <em>Iml Simultaneous Divergence Do Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_SimultaneousDivergence_DoFire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_SimultaneousDivergence_DoFire> iml_SimultaneousDivergence_DoFire_Sequence;

	/**
	 * The cached value of the '{@link #getIml_StateTransition_DoFire_Sequence() <em>Iml State Transition Do Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_StateTransition_DoFire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_StateTransition_DoFire> iml_StateTransition_DoFire_Sequence;

	/**
	 * The cached value of the '{@link #getIml_State_Activate_Sequence() <em>Iml State Activate Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_State_Activate_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_State_Activate> iml_State_Activate_Sequence;

	/**
	 * The cached value of the '{@link #getIml_State_Deactivate_Sequence() <em>Iml State Deactivate Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_State_Deactivate_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_State_Deactivate> iml_State_Deactivate_Sequence;

	/**
	 * The cached value of the '{@link #getIml_State_ExecuteActivities_Sequence() <em>Iml State Execute Activities Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_State_ExecuteActivities_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Iml_State_ExecuteActivities> iml_State_ExecuteActivities_Sequence;

	/**
	 * The cached value of the '{@link #getIml_tracedActivitys() <em>Iml traced Activitys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedActivitys()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivity> iml_tracedActivitys;

	/**
	 * The cached value of the '{@link #getIml_tracedAddDatas() <em>Iml traced Add Datas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedAddDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedAddData> iml_tracedAddDatas;

	/**
	 * The cached value of the '{@link #getIml_tracedConnections() <em>Iml traced Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedConnection> iml_tracedConnections;

	/**
	 * The cached value of the '{@link #getIml_tracedEvents() <em>Iml traced Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedEvent> iml_tracedEvents;

	/**
	 * The cached value of the '{@link #getIml_tracedHeaders() <em>Iml traced Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedHeader> iml_tracedHeaders;

	/**
	 * The cached value of the '{@link #getIml_tracedJumps() <em>Iml traced Jumps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedJumps()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedJump> iml_tracedJumps;

	/**
	 * The cached value of the '{@link #getIml_tracedSelectionConvergences() <em>Iml traced Selection Convergences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedSelectionConvergences()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSelectionConvergence> iml_tracedSelectionConvergences;

	/**
	 * The cached value of the '{@link #getIml_tracedSelectionDivergences() <em>Iml traced Selection Divergences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedSelectionDivergences()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSelectionDivergence> iml_tracedSelectionDivergences;

	/**
	 * The cached value of the '{@link #getIml_tracedSimultaneousConvergences() <em>Iml traced Simultaneous Convergences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedSimultaneousConvergences()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSimultaneousConvergence> iml_tracedSimultaneousConvergences;

	/**
	 * The cached value of the '{@link #getIml_tracedSimultaneousDivergences() <em>Iml traced Simultaneous Divergences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedSimultaneousDivergences()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSimultaneousDivergence> iml_tracedSimultaneousDivergences;

	/**
	 * The cached value of the '{@link #getIml_tracedStateTransitions() <em>Iml traced State Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedStateTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedStateTransition> iml_tracedStateTransitions;

	/**
	 * The cached value of the '{@link #getIml_tracedStates() <em>Iml traced States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedState> iml_tracedStates;

	/**
	 * The cached value of the '{@link #getIml_tracedVariables() <em>Iml traced Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIml_tracedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedVariable> iml_tracedVariables;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_Activity_DoExecute> getIml_Activity_DoExecute_Sequence() {
		if (iml_Activity_DoExecute_Sequence == null) {
			iml_Activity_DoExecute_Sequence = new EObjectResolvingEList<Iml_Activity_DoExecute>(Iml_Activity_DoExecute.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_ACTIVITY_DO_EXECUTE_SEQUENCE);
		}
		return iml_Activity_DoExecute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_Header_Execute> getIml_Header_Execute_Sequence() {
		if (iml_Header_Execute_Sequence == null) {
			iml_Header_Execute_Sequence = new EObjectResolvingEList<Iml_Header_Execute>(Iml_Header_Execute.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_HEADER_EXECUTE_SEQUENCE);
		}
		return iml_Header_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_SelectionConvergence_DoFire> getIml_SelectionConvergence_DoFire_Sequence() {
		if (iml_SelectionConvergence_DoFire_Sequence == null) {
			iml_SelectionConvergence_DoFire_Sequence = new EObjectResolvingEList<Iml_SelectionConvergence_DoFire>(Iml_SelectionConvergence_DoFire.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_CONVERGENCE_DO_FIRE_SEQUENCE);
		}
		return iml_SelectionConvergence_DoFire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_SelectionDivergence_DoFire> getIml_SelectionDivergence_DoFire_Sequence() {
		if (iml_SelectionDivergence_DoFire_Sequence == null) {
			iml_SelectionDivergence_DoFire_Sequence = new EObjectResolvingEList<Iml_SelectionDivergence_DoFire>(Iml_SelectionDivergence_DoFire.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_DIVERGENCE_DO_FIRE_SEQUENCE);
		}
		return iml_SelectionDivergence_DoFire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_SimultaneousConvergence_DoFire> getIml_SimultaneousConvergence_DoFire_Sequence() {
		if (iml_SimultaneousConvergence_DoFire_Sequence == null) {
			iml_SimultaneousConvergence_DoFire_Sequence = new EObjectResolvingEList<Iml_SimultaneousConvergence_DoFire>(Iml_SimultaneousConvergence_DoFire.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_SEQUENCE);
		}
		return iml_SimultaneousConvergence_DoFire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_SimultaneousDivergence_DoFire> getIml_SimultaneousDivergence_DoFire_Sequence() {
		if (iml_SimultaneousDivergence_DoFire_Sequence == null) {
			iml_SimultaneousDivergence_DoFire_Sequence = new EObjectResolvingEList<Iml_SimultaneousDivergence_DoFire>(Iml_SimultaneousDivergence_DoFire.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_SEQUENCE);
		}
		return iml_SimultaneousDivergence_DoFire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_StateTransition_DoFire> getIml_StateTransition_DoFire_Sequence() {
		if (iml_StateTransition_DoFire_Sequence == null) {
			iml_StateTransition_DoFire_Sequence = new EObjectResolvingEList<Iml_StateTransition_DoFire>(Iml_StateTransition_DoFire.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_STATE_TRANSITION_DO_FIRE_SEQUENCE);
		}
		return iml_StateTransition_DoFire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_State_Activate> getIml_State_Activate_Sequence() {
		if (iml_State_Activate_Sequence == null) {
			iml_State_Activate_Sequence = new EObjectResolvingEList<Iml_State_Activate>(Iml_State_Activate.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_STATE_ACTIVATE_SEQUENCE);
		}
		return iml_State_Activate_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_State_Deactivate> getIml_State_Deactivate_Sequence() {
		if (iml_State_Deactivate_Sequence == null) {
			iml_State_Deactivate_Sequence = new EObjectResolvingEList<Iml_State_Deactivate>(Iml_State_Deactivate.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_STATE_DEACTIVATE_SEQUENCE);
		}
		return iml_State_Deactivate_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iml_State_ExecuteActivities> getIml_State_ExecuteActivities_Sequence() {
		if (iml_State_ExecuteActivities_Sequence == null) {
			iml_State_ExecuteActivities_Sequence = new EObjectResolvingEList<Iml_State_ExecuteActivities>(Iml_State_ExecuteActivities.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_STATE_EXECUTE_ACTIVITIES_SEQUENCE);
		}
		return iml_State_ExecuteActivities_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivity> getIml_tracedActivitys() {
		if (iml_tracedActivitys == null) {
			iml_tracedActivitys = new EObjectContainmentEList<TracedActivity>(TracedActivity.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ACTIVITYS);
		}
		return iml_tracedActivitys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedAddData> getIml_tracedAddDatas() {
		if (iml_tracedAddDatas == null) {
			iml_tracedAddDatas = new EObjectContainmentEList<TracedAddData>(TracedAddData.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ADD_DATAS);
		}
		return iml_tracedAddDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedConnection> getIml_tracedConnections() {
		if (iml_tracedConnections == null) {
			iml_tracedConnections = new EObjectContainmentEList<TracedConnection>(TracedConnection.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_CONNECTIONS);
		}
		return iml_tracedConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedEvent> getIml_tracedEvents() {
		if (iml_tracedEvents == null) {
			iml_tracedEvents = new EObjectContainmentEList<TracedEvent>(TracedEvent.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_EVENTS);
		}
		return iml_tracedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedHeader> getIml_tracedHeaders() {
		if (iml_tracedHeaders == null) {
			iml_tracedHeaders = new EObjectContainmentEList<TracedHeader>(TracedHeader.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_HEADERS);
		}
		return iml_tracedHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedJump> getIml_tracedJumps() {
		if (iml_tracedJumps == null) {
			iml_tracedJumps = new EObjectContainmentEList<TracedJump>(TracedJump.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_JUMPS);
		}
		return iml_tracedJumps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSelectionConvergence> getIml_tracedSelectionConvergences() {
		if (iml_tracedSelectionConvergences == null) {
			iml_tracedSelectionConvergences = new EObjectContainmentEList<TracedSelectionConvergence>(TracedSelectionConvergence.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES);
		}
		return iml_tracedSelectionConvergences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSelectionDivergence> getIml_tracedSelectionDivergences() {
		if (iml_tracedSelectionDivergences == null) {
			iml_tracedSelectionDivergences = new EObjectContainmentEList<TracedSelectionDivergence>(TracedSelectionDivergence.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES);
		}
		return iml_tracedSelectionDivergences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSimultaneousConvergence> getIml_tracedSimultaneousConvergences() {
		if (iml_tracedSimultaneousConvergences == null) {
			iml_tracedSimultaneousConvergences = new EObjectContainmentEList<TracedSimultaneousConvergence>(TracedSimultaneousConvergence.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES);
		}
		return iml_tracedSimultaneousConvergences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSimultaneousDivergence> getIml_tracedSimultaneousDivergences() {
		if (iml_tracedSimultaneousDivergences == null) {
			iml_tracedSimultaneousDivergences = new EObjectContainmentEList<TracedSimultaneousDivergence>(TracedSimultaneousDivergence.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES);
		}
		return iml_tracedSimultaneousDivergences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedStateTransition> getIml_tracedStateTransitions() {
		if (iml_tracedStateTransitions == null) {
			iml_tracedStateTransitions = new EObjectContainmentEList<TracedStateTransition>(TracedStateTransition.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS);
		}
		return iml_tracedStateTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedState> getIml_tracedStates() {
		if (iml_tracedStates == null) {
			iml_tracedStates = new EObjectContainmentEList<TracedState>(TracedState.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATES);
		}
		return iml_tracedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedVariable> getIml_tracedVariables() {
		if (iml_tracedVariables == null) {
			iml_tracedVariables = new EObjectContainmentEList<TracedVariable>(TracedVariable.class, this, ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_VARIABLES);
		}
		return iml_tracedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, ImlTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ACTIVITYS:
				return ((InternalEList<?>)getIml_tracedActivitys()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ADD_DATAS:
				return ((InternalEList<?>)getIml_tracedAddDatas()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_CONNECTIONS:
				return ((InternalEList<?>)getIml_tracedConnections()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_EVENTS:
				return ((InternalEList<?>)getIml_tracedEvents()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_HEADERS:
				return ((InternalEList<?>)getIml_tracedHeaders()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_JUMPS:
				return ((InternalEList<?>)getIml_tracedJumps()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES:
				return ((InternalEList<?>)getIml_tracedSelectionConvergences()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES:
				return ((InternalEList<?>)getIml_tracedSelectionDivergences()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES:
				return ((InternalEList<?>)getIml_tracedSimultaneousConvergences()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES:
				return ((InternalEList<?>)getIml_tracedSimultaneousDivergences()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS:
				return ((InternalEList<?>)getIml_tracedStateTransitions()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATES:
				return ((InternalEList<?>)getIml_tracedStates()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_VARIABLES:
				return ((InternalEList<?>)getIml_tracedVariables()).basicRemove(otherEnd, msgs);
			case ImlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImlTracePackage.SPECIFIC_TRACE__IML_ACTIVITY_DO_EXECUTE_SEQUENCE:
				return getIml_Activity_DoExecute_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_HEADER_EXECUTE_SEQUENCE:
				return getIml_Header_Execute_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_CONVERGENCE_DO_FIRE_SEQUENCE:
				return getIml_SelectionConvergence_DoFire_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_DIVERGENCE_DO_FIRE_SEQUENCE:
				return getIml_SelectionDivergence_DoFire_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_SEQUENCE:
				return getIml_SimultaneousConvergence_DoFire_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_SEQUENCE:
				return getIml_SimultaneousDivergence_DoFire_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_TRANSITION_DO_FIRE_SEQUENCE:
				return getIml_StateTransition_DoFire_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_ACTIVATE_SEQUENCE:
				return getIml_State_Activate_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_DEACTIVATE_SEQUENCE:
				return getIml_State_Deactivate_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_EXECUTE_ACTIVITIES_SEQUENCE:
				return getIml_State_ExecuteActivities_Sequence();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ACTIVITYS:
				return getIml_tracedActivitys();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ADD_DATAS:
				return getIml_tracedAddDatas();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_CONNECTIONS:
				return getIml_tracedConnections();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_EVENTS:
				return getIml_tracedEvents();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_HEADERS:
				return getIml_tracedHeaders();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_JUMPS:
				return getIml_tracedJumps();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES:
				return getIml_tracedSelectionConvergences();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES:
				return getIml_tracedSelectionDivergences();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES:
				return getIml_tracedSimultaneousConvergences();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES:
				return getIml_tracedSimultaneousDivergences();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS:
				return getIml_tracedStateTransitions();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATES:
				return getIml_tracedStates();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_VARIABLES:
				return getIml_tracedVariables();
			case ImlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImlTracePackage.SPECIFIC_TRACE__IML_ACTIVITY_DO_EXECUTE_SEQUENCE:
				getIml_Activity_DoExecute_Sequence().clear();
				getIml_Activity_DoExecute_Sequence().addAll((Collection<? extends Iml_Activity_DoExecute>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_HEADER_EXECUTE_SEQUENCE:
				getIml_Header_Execute_Sequence().clear();
				getIml_Header_Execute_Sequence().addAll((Collection<? extends Iml_Header_Execute>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_CONVERGENCE_DO_FIRE_SEQUENCE:
				getIml_SelectionConvergence_DoFire_Sequence().clear();
				getIml_SelectionConvergence_DoFire_Sequence().addAll((Collection<? extends Iml_SelectionConvergence_DoFire>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_DIVERGENCE_DO_FIRE_SEQUENCE:
				getIml_SelectionDivergence_DoFire_Sequence().clear();
				getIml_SelectionDivergence_DoFire_Sequence().addAll((Collection<? extends Iml_SelectionDivergence_DoFire>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_SEQUENCE:
				getIml_SimultaneousConvergence_DoFire_Sequence().clear();
				getIml_SimultaneousConvergence_DoFire_Sequence().addAll((Collection<? extends Iml_SimultaneousConvergence_DoFire>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_SEQUENCE:
				getIml_SimultaneousDivergence_DoFire_Sequence().clear();
				getIml_SimultaneousDivergence_DoFire_Sequence().addAll((Collection<? extends Iml_SimultaneousDivergence_DoFire>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_TRANSITION_DO_FIRE_SEQUENCE:
				getIml_StateTransition_DoFire_Sequence().clear();
				getIml_StateTransition_DoFire_Sequence().addAll((Collection<? extends Iml_StateTransition_DoFire>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_ACTIVATE_SEQUENCE:
				getIml_State_Activate_Sequence().clear();
				getIml_State_Activate_Sequence().addAll((Collection<? extends Iml_State_Activate>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_DEACTIVATE_SEQUENCE:
				getIml_State_Deactivate_Sequence().clear();
				getIml_State_Deactivate_Sequence().addAll((Collection<? extends Iml_State_Deactivate>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_EXECUTE_ACTIVITIES_SEQUENCE:
				getIml_State_ExecuteActivities_Sequence().clear();
				getIml_State_ExecuteActivities_Sequence().addAll((Collection<? extends Iml_State_ExecuteActivities>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ACTIVITYS:
				getIml_tracedActivitys().clear();
				getIml_tracedActivitys().addAll((Collection<? extends TracedActivity>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ADD_DATAS:
				getIml_tracedAddDatas().clear();
				getIml_tracedAddDatas().addAll((Collection<? extends TracedAddData>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_CONNECTIONS:
				getIml_tracedConnections().clear();
				getIml_tracedConnections().addAll((Collection<? extends TracedConnection>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_EVENTS:
				getIml_tracedEvents().clear();
				getIml_tracedEvents().addAll((Collection<? extends TracedEvent>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_HEADERS:
				getIml_tracedHeaders().clear();
				getIml_tracedHeaders().addAll((Collection<? extends TracedHeader>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_JUMPS:
				getIml_tracedJumps().clear();
				getIml_tracedJumps().addAll((Collection<? extends TracedJump>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES:
				getIml_tracedSelectionConvergences().clear();
				getIml_tracedSelectionConvergences().addAll((Collection<? extends TracedSelectionConvergence>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES:
				getIml_tracedSelectionDivergences().clear();
				getIml_tracedSelectionDivergences().addAll((Collection<? extends TracedSelectionDivergence>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES:
				getIml_tracedSimultaneousConvergences().clear();
				getIml_tracedSimultaneousConvergences().addAll((Collection<? extends TracedSimultaneousConvergence>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES:
				getIml_tracedSimultaneousDivergences().clear();
				getIml_tracedSimultaneousDivergences().addAll((Collection<? extends TracedSimultaneousDivergence>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS:
				getIml_tracedStateTransitions().clear();
				getIml_tracedStateTransitions().addAll((Collection<? extends TracedStateTransition>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATES:
				getIml_tracedStates().clear();
				getIml_tracedStates().addAll((Collection<? extends TracedState>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_VARIABLES:
				getIml_tracedVariables().clear();
				getIml_tracedVariables().addAll((Collection<? extends TracedVariable>)newValue);
				return;
			case ImlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImlTracePackage.SPECIFIC_TRACE__IML_ACTIVITY_DO_EXECUTE_SEQUENCE:
				getIml_Activity_DoExecute_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_HEADER_EXECUTE_SEQUENCE:
				getIml_Header_Execute_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_CONVERGENCE_DO_FIRE_SEQUENCE:
				getIml_SelectionConvergence_DoFire_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_DIVERGENCE_DO_FIRE_SEQUENCE:
				getIml_SelectionDivergence_DoFire_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_SEQUENCE:
				getIml_SimultaneousConvergence_DoFire_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_SEQUENCE:
				getIml_SimultaneousDivergence_DoFire_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_TRANSITION_DO_FIRE_SEQUENCE:
				getIml_StateTransition_DoFire_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_ACTIVATE_SEQUENCE:
				getIml_State_Activate_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_DEACTIVATE_SEQUENCE:
				getIml_State_Deactivate_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_EXECUTE_ACTIVITIES_SEQUENCE:
				getIml_State_ExecuteActivities_Sequence().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ACTIVITYS:
				getIml_tracedActivitys().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ADD_DATAS:
				getIml_tracedAddDatas().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_CONNECTIONS:
				getIml_tracedConnections().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_EVENTS:
				getIml_tracedEvents().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_HEADERS:
				getIml_tracedHeaders().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_JUMPS:
				getIml_tracedJumps().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES:
				getIml_tracedSelectionConvergences().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES:
				getIml_tracedSelectionDivergences().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES:
				getIml_tracedSimultaneousConvergences().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES:
				getIml_tracedSimultaneousDivergences().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS:
				getIml_tracedStateTransitions().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATES:
				getIml_tracedStates().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_VARIABLES:
				getIml_tracedVariables().clear();
				return;
			case ImlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImlTracePackage.SPECIFIC_TRACE__IML_ACTIVITY_DO_EXECUTE_SEQUENCE:
				return iml_Activity_DoExecute_Sequence != null && !iml_Activity_DoExecute_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_HEADER_EXECUTE_SEQUENCE:
				return iml_Header_Execute_Sequence != null && !iml_Header_Execute_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_CONVERGENCE_DO_FIRE_SEQUENCE:
				return iml_SelectionConvergence_DoFire_Sequence != null && !iml_SelectionConvergence_DoFire_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_SELECTION_DIVERGENCE_DO_FIRE_SEQUENCE:
				return iml_SelectionDivergence_DoFire_Sequence != null && !iml_SelectionDivergence_DoFire_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_SEQUENCE:
				return iml_SimultaneousConvergence_DoFire_Sequence != null && !iml_SimultaneousConvergence_DoFire_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_SEQUENCE:
				return iml_SimultaneousDivergence_DoFire_Sequence != null && !iml_SimultaneousDivergence_DoFire_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_TRANSITION_DO_FIRE_SEQUENCE:
				return iml_StateTransition_DoFire_Sequence != null && !iml_StateTransition_DoFire_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_ACTIVATE_SEQUENCE:
				return iml_State_Activate_Sequence != null && !iml_State_Activate_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_DEACTIVATE_SEQUENCE:
				return iml_State_Deactivate_Sequence != null && !iml_State_Deactivate_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_STATE_EXECUTE_ACTIVITIES_SEQUENCE:
				return iml_State_ExecuteActivities_Sequence != null && !iml_State_ExecuteActivities_Sequence.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ACTIVITYS:
				return iml_tracedActivitys != null && !iml_tracedActivitys.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_ADD_DATAS:
				return iml_tracedAddDatas != null && !iml_tracedAddDatas.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_CONNECTIONS:
				return iml_tracedConnections != null && !iml_tracedConnections.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_EVENTS:
				return iml_tracedEvents != null && !iml_tracedEvents.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_HEADERS:
				return iml_tracedHeaders != null && !iml_tracedHeaders.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_JUMPS:
				return iml_tracedJumps != null && !iml_tracedJumps.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_CONVERGENCES:
				return iml_tracedSelectionConvergences != null && !iml_tracedSelectionConvergences.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SELECTION_DIVERGENCES:
				return iml_tracedSelectionDivergences != null && !iml_tracedSelectionDivergences.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_CONVERGENCES:
				return iml_tracedSimultaneousConvergences != null && !iml_tracedSimultaneousConvergences.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_SIMULTANEOUS_DIVERGENCES:
				return iml_tracedSimultaneousDivergences != null && !iml_tracedSimultaneousDivergences.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATE_TRANSITIONS:
				return iml_tracedStateTransitions != null && !iml_tracedStateTransitions.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_STATES:
				return iml_tracedStates != null && !iml_tracedStates.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__IML_TRACED_VARIABLES:
				return iml_tracedVariables != null && !iml_tracedVariables.isEmpty();
			case ImlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
