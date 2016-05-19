/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Object Get Types Object</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Object_GetTypes_Object extends FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStep, FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_AbstractSubStep, SpecificStep, SmallStep, FumlConfiguration_Classes_Kernel_Value_Equals_Value_AbstractSubStep, FumlConfiguration_Classes_Kernel_Value_HasType_Value_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Classes.Kernel.Object) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	fumlConfiguration.Classes.Kernel.Object getCaller();

} // FumlConfiguration_Classes_Kernel_Object_GetTypes_Object
