/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Reference Get Feature Value Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference extends FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStep>, FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedReference getCaller();

} // FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference
