/**
 */
package fumlConfiguration.CommonBehaviors.BasicBehaviors;

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
 *   <li>{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getContext <em>Context</em>}</li>
 *   <li>{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getExecution()
 * @model abstract="true"
 * @generated
 */
public interface Execution extends fumlConfiguration.Classes.Kernel.Object {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(fumlConfiguration.Classes.Kernel.Object)
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getExecution_Context()
	 * @model required="true"
	 * @generated
	 */
	fumlConfiguration.Classes.Kernel.Object getContext();

	/**
	 * Sets the value of the '{@link fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(fumlConfiguration.Classes.Kernel.Object value);

	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' containment reference list.
	 * @see fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getExecution_ParameterValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameterValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterValueRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void setParameterValue(ParameterValue parameterValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model outputParameterValuesMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getOutputParameterValues(EList<ParameterValue> outputParameterValues);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getParameterValue(Parameter parameter, ParameterValue parameterValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void terminate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model behaviorRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getBehavior(Behavior behavior);

} // Execution
