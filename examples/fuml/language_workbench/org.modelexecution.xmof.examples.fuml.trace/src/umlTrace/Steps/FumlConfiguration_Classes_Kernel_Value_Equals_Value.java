/**
 */
package umlTrace.Steps;

import fumlConfiguration.Classes.Kernel.Value;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Value Equals Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Value_Equals_Value()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Value_Equals_Value extends SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_Value_Equals_Value_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Classes.Kernel.Value) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Value getCaller();

} // FumlConfiguration_Classes_Kernel_Value_Equals_Value
