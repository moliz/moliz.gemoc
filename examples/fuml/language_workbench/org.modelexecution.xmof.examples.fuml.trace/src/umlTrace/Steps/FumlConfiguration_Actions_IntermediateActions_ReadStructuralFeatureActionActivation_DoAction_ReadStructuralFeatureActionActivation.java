/**
 */
package umlTrace.Steps;

import fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Intermediate Actions Read Structural Feature Action Activation Do Action Read Structural Feature Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation extends FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Actions.IntermediateActions.ReadStructuralFeatureActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ReadStructuralFeatureActionActivation getCaller();

} // FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation
