/**
 */
package fumlConfigurationTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Compound Value Copy Compound Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue extends FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStep>, FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_AbstractSubStep, FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_AbstractSubStep, FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_AbstractSubStep, FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_AbstractSubStep, FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedCompoundValue getCaller();

} // FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue
