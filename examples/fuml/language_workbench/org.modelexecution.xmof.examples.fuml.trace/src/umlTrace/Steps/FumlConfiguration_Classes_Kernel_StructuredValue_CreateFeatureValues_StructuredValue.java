/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Structured Value Create Feature Values Structured Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue extends FumlConfiguration_Loci_Locus_Instantiate_Locus_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStep>, FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedStructuredValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedStructuredValue getCaller();

} // FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue
