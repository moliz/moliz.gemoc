/**
 */
package imlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import imlTrace.States.iml.TracedSelectionConvergence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iml Selection Convergence Do Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see imlTrace.Steps.StepsPackage#getIml_SelectionConvergence_DoFire()
 * @model
 * @generated
 */
public interface Iml_SelectionConvergence_DoFire extends Iml_Header_Execute_AbstractSubStep, SpecificStep, SequentialStep<Iml_SelectionConvergence_DoFire_AbstractSubStep>, Iml_StateTransition_DoFire_AbstractSubStep, Iml_SimultaneousConvergence_DoFire_AbstractSubStep, Iml_SelectionDivergence_DoFire_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (imlTrace.States.iml.TracedSelectionConvergence) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedSelectionConvergence getCaller();

} // Iml_SelectionConvergence_DoFire
