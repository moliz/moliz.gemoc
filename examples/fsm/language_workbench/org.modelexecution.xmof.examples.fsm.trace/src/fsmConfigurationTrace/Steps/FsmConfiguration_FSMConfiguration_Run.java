/**
 */
package fsmConfigurationTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fsmConfigurationTrace.States.SpecificState;

import fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Configuration FSM Configuration Run</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmConfigurationTrace.Steps.StepsPackage#getFsmConfiguration_FSMConfiguration_Run()
 * @model
 * @generated
 */
public interface FsmConfiguration_FSMConfiguration_Run extends SpecificStep, SequentialStep<FsmConfiguration_FSMConfiguration_Run_AbstractSubStep, SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedFSMConfiguration getCaller();

} // FsmConfiguration_FSMConfiguration_Run
