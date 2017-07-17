/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Action Activation Put Tokens Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation extends FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation
