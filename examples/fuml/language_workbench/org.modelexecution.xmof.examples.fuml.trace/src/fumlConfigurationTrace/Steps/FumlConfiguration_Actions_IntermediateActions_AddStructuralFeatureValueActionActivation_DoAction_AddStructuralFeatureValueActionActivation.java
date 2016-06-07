/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Intermediate Actions Add Structural Feature Value Action Activation Do Action Add Structural Feature Value Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation extends FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedAddStructuralFeatureValueActionActivation getCaller();

} // FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation
