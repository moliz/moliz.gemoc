/**
 */
package imlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import imlTrace.States.iml.TracedState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iml State Activate</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see imlTrace.Steps.StepsPackage#getIml_State_Activate()
 * @model
 * @generated
 */
public interface Iml_State_Activate extends Iml_Header_Execute_AbstractSubStep, SpecificStep, SequentialStep<Iml_State_Activate_AbstractSubStep>, Iml_SelectionConvergence_DoFire_AbstractSubStep, Iml_StateTransition_DoFire_AbstractSubStep, Iml_SimultaneousConvergence_DoFire_AbstractSubStep, Iml_SimultaneousDivergence_DoFire_AbstractSubStep, Iml_SelectionDivergence_DoFire_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (imlTrace.States.iml.TracedState) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedState getCaller();

} // Iml_State_Activate
