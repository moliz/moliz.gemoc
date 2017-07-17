/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Boolean Value New Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue extends FumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedBooleanValue getCaller();

} // FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue
