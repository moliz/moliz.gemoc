/**
 */
package fumlConfigurationTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue extends FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStep, SpecificStep, SmallStep, FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedCompoundValue getCaller();

} // FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue
