/**
 */
package fumlConfigurationTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Execution Factory Get Built In Type Execution Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory extends SpecificStep, SmallStep, FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedExecutionFactory getCaller();

} // FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory
