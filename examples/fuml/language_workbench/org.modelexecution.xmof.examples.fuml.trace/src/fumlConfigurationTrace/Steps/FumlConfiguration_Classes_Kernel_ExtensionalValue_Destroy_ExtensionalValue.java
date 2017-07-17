/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Extensional Value Destroy Extensional Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue extends SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_AbstractSubStep>, FumlConfiguration_Classes_Kernel_Object_Destroy_Object_AbstractSubStep, FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedExtensionalValue getCaller();

} // FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue
