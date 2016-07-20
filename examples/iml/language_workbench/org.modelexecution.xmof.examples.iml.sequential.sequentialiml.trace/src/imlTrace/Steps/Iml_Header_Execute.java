/**
 */
package imlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import imlTrace.States.iml.TracedHeader;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iml Header Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see imlTrace.Steps.StepsPackage#getIml_Header_Execute()
 * @model
 * @generated
 */
public interface Iml_Header_Execute extends SpecificStep, SequentialStep<Iml_Header_Execute_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (imlTrace.States.iml.TracedHeader) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedHeader getCaller();

} // Iml_Header_Execute
