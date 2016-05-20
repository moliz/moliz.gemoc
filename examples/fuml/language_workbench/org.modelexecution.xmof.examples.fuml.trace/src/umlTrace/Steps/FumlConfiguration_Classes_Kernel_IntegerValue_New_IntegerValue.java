/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SmallStep;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Integer Value New Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue extends FumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedIntegerValue getCaller();

} // FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue
