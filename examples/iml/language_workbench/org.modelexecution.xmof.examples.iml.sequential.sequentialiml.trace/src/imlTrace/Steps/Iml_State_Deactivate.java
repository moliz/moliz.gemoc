/**
 */
package imlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import imlTrace.States.iml.TracedState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iml State Deactivate</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see imlTrace.Steps.StepsPackage#getIml_State_Deactivate()
 * @model
 * @generated
 */
public interface Iml_State_Deactivate extends SpecificStep, SmallStep, Iml_Header_Execute_AbstractSubStep, Iml_StateTransition_DoFire_AbstractSubStep, Iml_SimultaneousConvergence_DoFire_AbstractSubStep, Iml_SelectionDivergence_DoFire_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (imlTrace.States.iml.TracedState) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedState getCaller();

} // Iml_State_Deactivate
