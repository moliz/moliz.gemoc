/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;

import fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge Instance edge Activity Edge Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getEdge_ActivityEdgeInstance <em>Edge Activity Edge Instance</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getActivityEdgeInstance_edge_ActivityEdgeInstance_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance/edge_ActivityEdgeInstance'"
 * @generated
 */
public interface ActivityEdgeInstance_edge_ActivityEdgeInstance_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Edge Activity Edge Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Activity Edge Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Activity Edge Instance</em>' reference.
	 * @see #setEdge_ActivityEdgeInstance(TracedActivityEdgeConfiguration)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Edge_ActivityEdgeInstance()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance/edge_ActivityEdgeInstance'"
	 * @generated
	 */
	TracedActivityEdgeConfiguration getEdge_ActivityEdgeInstance();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getEdge_ActivityEdgeInstance <em>Edge Activity Edge Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Activity Edge Instance</em>' reference.
	 * @see #getEdge_ActivityEdgeInstance()
	 * @generated
	 */
	void setEdge_ActivityEdgeInstance(TracedActivityEdgeConfiguration value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getEdge_ActivityEdgeInstanceSequence <em>Edge Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityEdgeInstance)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getEdge_ActivityEdgeInstanceSequence
	 * @model opposite="edge_ActivityEdgeInstanceSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityEdgeInstance getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityEdgeInstance value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getActivityEdgeInstance_edge_ActivityEdgeInstance_Values <em>Activity Edge Instance edge Activity Edge Instance Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityEdgeInstance_edge_ActivityEdgeInstance_Value_States()
	 * @see fumlConfigurationTrace.States.State#getActivityEdgeInstance_edge_ActivityEdgeInstance_Values
	 * @model opposite="activityEdgeInstance_edge_ActivityEdgeInstance_Values" required="true"
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

} // ActivityEdgeInstance_edge_ActivityEdgeInstance_Value
