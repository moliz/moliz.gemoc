/**
 */
package fumlConfigurationTrace.Steps;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Object New Object</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Object_New_Object()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Object_New_Object extends FumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedObject getCaller();

} // FumlConfiguration_Classes_Kernel_Object_New_Object
