/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge Instance target Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_target_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_target_Value#getStates <em>States</em>}</li>
 *   <li>{@link umlTrace.States.ActivityEdgeInstance_target_Value#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_target_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance/target'"
 * @generated
 */
public interface ActivityEdgeInstance_target_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getTargetSequence <em>Target Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityEdgeInstance)
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_target_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getTargetSequence
	 * @model opposite="targetSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityEdgeInstance getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityEdgeInstance_target_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityEdgeInstance value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getActivityEdgeInstance_target_Values <em>Activity Edge Instance target Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_target_Value_States()
	 * @see umlTrace.States.State#getActivityEdgeInstance_target_Values
	 * @model opposite="activityEdgeInstance_target_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TracedActivityNodeActivation)
	 * @see umlTrace.States.StatesPackage#getActivityEdgeInstance_target_Value_Target()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance/target'"
	 * @generated
	 */
	TracedActivityNodeActivation getTarget();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityEdgeInstance_target_Value#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TracedActivityNodeActivation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // ActivityEdgeInstance_target_Value
