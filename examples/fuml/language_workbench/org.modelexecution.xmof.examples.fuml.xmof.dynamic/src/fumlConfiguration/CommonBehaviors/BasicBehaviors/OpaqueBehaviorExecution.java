/**
 */
package fumlConfiguration.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getOpaqueBehaviorExecution()
 * @model abstract="true"
 * @generated
 */
public interface OpaqueBehaviorExecution extends Execution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inputParametersMany="true" outputParametersMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void doBody(EList<ParameterValue> inputParameters, EList<ParameterValue> outputParameters);

} // OpaqueBehaviorExecution
