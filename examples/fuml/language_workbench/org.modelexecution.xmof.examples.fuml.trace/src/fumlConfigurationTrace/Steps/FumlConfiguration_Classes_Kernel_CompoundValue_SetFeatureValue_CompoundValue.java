/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Compound Value Set Feature Value Compound Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue extends FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStep>, FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedCompoundValue getCaller();

} // FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue
