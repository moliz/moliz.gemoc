/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.CallActionActivation#getCallExecutions <em>Call Executions</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getCallActionActivation()
 * @model abstract="true"
 * @generated
 */
public interface CallActionActivation extends InvocationActionActivation {
	/**
	 * Returns the value of the '<em><b>Call Executions</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Executions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Executions</em>' containment reference list.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage#getCallActionActivation_CallExecutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Execution> getCallExecutions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model executionRequired="true"
	 * @generated
	 */
	void getCallExecution(Execution execution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model executionRequired="true"
	 * @generated
	 */
	void removeCallExecution(Execution execution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model callExecutionRequired="true"
	 * @generated
	 */
	void initializeInputParameterValues(Execution callExecution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model callExecutionRequired="true"
	 * @generated
	 */
	void collectOutputParameterValues(Execution callExecution);

} // CallActionActivation
