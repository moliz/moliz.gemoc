/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Action Activation Put Token Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation extends FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation
