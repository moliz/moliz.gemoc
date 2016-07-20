/**
 */
package imlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import imlTrace.States.iml.TracedActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iml Activity Do Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see imlTrace.Steps.StepsPackage#getIml_Activity_DoExecute()
 * @model
 * @generated
 */
public interface Iml_Activity_DoExecute extends Iml_State_ExecuteActivities_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (imlTrace.States.iml.TracedActivity) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivity getCaller();

} // Iml_Activity_DoExecute
