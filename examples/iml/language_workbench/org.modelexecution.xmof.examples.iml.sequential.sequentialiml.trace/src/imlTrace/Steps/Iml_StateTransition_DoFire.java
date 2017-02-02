/**
 */
package imlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import imlTrace.States.iml.TracedStateTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iml State Transition Do Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see imlTrace.Steps.StepsPackage#getIml_StateTransition_DoFire()
 * @model
 * @generated
 */
public interface Iml_StateTransition_DoFire extends Iml_Header_Execute_AbstractSubStep, SpecificStep, SequentialStep<Iml_StateTransition_DoFire_AbstractSubStep>, Iml_StateTransition_DoFire_AbstractSubStep, Iml_SimultaneousConvergence_DoFire_AbstractSubStep, Iml_SelectionDivergence_DoFire_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (imlTrace.States.iml.TracedStateTransition) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedStateTransition getCaller();

} // Iml_StateTransition_DoFire
