/**
 */
package fsmConfigurationTrace;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Trace;

import fsmConfigurationTrace.States.SpecificDimension;
import fsmConfigurationTrace.States.SpecificState;
import fsmConfigurationTrace.States.SpecificTracedObject;
import fsmConfigurationTrace.States.SpecificValue;

import fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run;
import fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire;
import fsmConfigurationTrace.Steps.SpecificStep;

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
 *   <li>{@link fsmConfigurationTrace.SpecificTrace#getFsmConfiguration_FSMConfiguration_Run_Sequence <em>Fsm Configuration FSM Configuration Run Sequence</em>}</li>
 *   <li>{@link fsmConfigurationTrace.SpecificTrace#getFsmConfiguration_TransitionConfiguration_Fire_Sequence <em>Fsm Configuration Transition Configuration Fire Sequence</em>}</li>
 * </ul>
 *
 * @see fsmConfigurationTrace.FsmConfigurationTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<? extends SpecificStep, ? extends SpecificState>, SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>, SpecificState> {
	/**
	 * Returns the value of the '<em><b>Fsm Configuration FSM Configuration Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Configuration FSM Configuration Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Configuration FSM Configuration Run Sequence</em>' reference list.
	 * @see fsmConfigurationTrace.FsmConfigurationTracePackage#getSpecificTrace_FsmConfiguration_FSMConfiguration_Run_Sequence()
	 * @model
	 * @generated
	 */
	EList<FsmConfiguration_FSMConfiguration_Run> getFsmConfiguration_FSMConfiguration_Run_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Configuration Transition Configuration Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Configuration Transition Configuration Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Configuration Transition Configuration Fire Sequence</em>' reference list.
	 * @see fsmConfigurationTrace.FsmConfigurationTracePackage#getSpecificTrace_FsmConfiguration_TransitionConfiguration_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<FsmConfiguration_TransitionConfiguration_Fire> getFsmConfiguration_TransitionConfiguration_Fire_Sequence();

} // SpecificTrace
