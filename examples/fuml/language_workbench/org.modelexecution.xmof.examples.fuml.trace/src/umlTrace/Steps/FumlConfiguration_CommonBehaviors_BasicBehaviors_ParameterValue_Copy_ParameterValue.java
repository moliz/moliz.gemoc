/**
 */
package umlTrace.Steps;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Parameter Value Copy Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue extends FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ParameterValue getCaller();

} // FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue
