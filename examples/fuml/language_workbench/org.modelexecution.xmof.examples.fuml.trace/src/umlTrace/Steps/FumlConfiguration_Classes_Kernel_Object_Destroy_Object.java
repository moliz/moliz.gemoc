/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Object Destroy Object</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Object_Destroy_Object()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Object_Destroy_Object extends SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_Object_Destroy_Object_AbstractSubStep>, FumlConfiguration_Classes_Kernel_Object_Destroy_Object_AbstractSubStep, FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedObject getCaller();

} // FumlConfiguration_Classes_Kernel_Object_Destroy_Object
