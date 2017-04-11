/**
 */
package fsmConfigurationTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fsmConfiguration.TransitionConfiguration;

import fsmConfigurationTrace.States.SpecificState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Configuration Transition Configuration Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmConfigurationTrace.Steps.StepsPackage#getFsmConfiguration_TransitionConfiguration_Fire()
 * @model
 * @generated
 */
public interface FsmConfiguration_TransitionConfiguration_Fire extends FsmConfiguration_FSMConfiguration_Run_AbstractSubStep, SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fsmConfiguration.TransitionConfiguration) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TransitionConfiguration getCaller();

} // FsmConfiguration_TransitionConfiguration_Fire
