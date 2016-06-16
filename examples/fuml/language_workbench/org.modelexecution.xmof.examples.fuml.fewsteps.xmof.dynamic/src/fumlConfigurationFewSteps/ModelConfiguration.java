/**
 */
package fumlConfigurationFewSteps;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.ParameterValue;

import fumlConfigurationFewSteps.LociFewSteps.ExecutionEnvironment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage#getModelConfiguration()
 * @model
 * @generated
 */
public interface ModelConfiguration extends Model, PackageConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model executionEnvironmentRequired="true" behaviorRequired="true" inputsMany="true" outputsMany="true"
	 * @generated
	 */
	void main(ExecutionEnvironment executionEnvironment, Behavior behavior, fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object context, EList<ParameterValue> inputs, EList<ParameterValue> outputs);

} // ModelConfiguration
