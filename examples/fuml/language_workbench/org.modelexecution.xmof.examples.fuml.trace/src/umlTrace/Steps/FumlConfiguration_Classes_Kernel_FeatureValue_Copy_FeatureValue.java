/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Feature Value Copy Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue extends FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedFeatureValue getCaller();

} // FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue
