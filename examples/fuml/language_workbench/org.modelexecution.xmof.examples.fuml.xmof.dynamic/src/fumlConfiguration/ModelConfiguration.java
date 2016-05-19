/**
 */
package fumlConfiguration;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue;

import fumlConfiguration.Loci.ExecutionEnvironment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfiguration.FumlConfigurationPackage#getModelConfiguration()
 * @model
 * @generated
 */
public interface ModelConfiguration extends Model, PackageConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model executionEnvironmentRequired="true" behaviorRequired="true" inputsMany="true" outputsMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void main(ExecutionEnvironment executionEnvironment, Behavior behavior, fumlConfiguration.Classes.Kernel.Object context, EList<ParameterValue> inputs, EList<ParameterValue> outputs);

} // ModelConfiguration
