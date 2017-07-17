/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Remove Call Execution Call Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation extends FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedCallActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation
