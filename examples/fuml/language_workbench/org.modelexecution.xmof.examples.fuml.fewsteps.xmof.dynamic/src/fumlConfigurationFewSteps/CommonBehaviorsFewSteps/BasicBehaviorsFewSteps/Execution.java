/**
 */
package fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution#getContext <em>Context</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.BasicBehaviorsFewStepsPackage#getExecution()
 * @model abstract="true"
 * @generated
 */
public interface Execution extends fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object)
	 * @see fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.BasicBehaviorsFewStepsPackage#getExecution_Context()
	 * @model required="true"
	 * @generated
	 */
	fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object getContext();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object value);

	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' containment reference list.
	 * @see fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.BasicBehaviorsFewStepsPackage#getExecution_ParameterValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameterValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterValueRequired="true"
	 * @generated
	 */
	void setParameterValue(ParameterValue parameterValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model outputParameterValuesMany="true"
	 * @generated
	 */
	void getOutputParameterValues(EList<ParameterValue> outputParameterValues);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterRequired="true"
	 * @generated
	 */
	void getParameterValue(Parameter parameter, ParameterValue parameterValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void terminate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model behaviorRequired="true"
	 * @generated
	 */
	void getBehavior(Behavior behavior);

} // Execution
