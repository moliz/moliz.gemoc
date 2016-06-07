/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation is Running Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#isIsRunning <em>Is Running</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_isRunning_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/isRunning.1'"
 * @generated
 */
public interface ActivityNodeActivation_isRunning_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Running</em>' attribute.
	 * @see #setIsRunning(boolean)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_isRunning_Value_IsRunning()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/isRunning.1'"
	 * @generated
	 */
	boolean isIsRunning();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#isIsRunning <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Running</em>' attribute.
	 * @see #isIsRunning()
	 * @generated
	 */
	void setIsRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIsRunningSequence <em>Is Running Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNodeActivation)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_isRunning_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIsRunningSequence
	 * @model opposite="isRunningSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNodeActivation getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNodeActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_isRunning_Values <em>Activity Node Activation is Running Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_isRunning_Value_States()
	 * @see fumlConfigurationTrace.States.State#getActivityNodeActivation_isRunning_Values
	 * @model opposite="activityNodeActivation_isRunning_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // ActivityNodeActivation_isRunning_Value
