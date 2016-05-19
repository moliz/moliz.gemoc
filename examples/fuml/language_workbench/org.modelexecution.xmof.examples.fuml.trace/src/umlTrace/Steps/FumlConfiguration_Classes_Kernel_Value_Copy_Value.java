/**
 */
package umlTrace.Steps;

import fumlConfiguration.Classes.Kernel.Value;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Value Copy Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Value_Copy_Value()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Value_Copy_Value extends FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStep>, FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStep, FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_AbstractSubStep, FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStep, FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Classes.Kernel.Value) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Value getCaller();

} // FumlConfiguration_Classes_Kernel_Value_Copy_Value
