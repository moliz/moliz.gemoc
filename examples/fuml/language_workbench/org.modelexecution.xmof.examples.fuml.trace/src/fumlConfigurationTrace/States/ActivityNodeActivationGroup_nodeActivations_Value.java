/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation Group node Activations Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getNodeActivations <em>Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivationGroup_nodeActivations_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivationGroup/nodeActivations'"
 * @generated
 */
public interface ActivityNodeActivationGroup_nodeActivations_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Node Activations</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Activations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Activations</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivationGroup_nodeActivations_Value_NodeActivations()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivationGroup/nodeActivations'"
	 * @generated
	 */
	EList<TracedActivityNodeActivation> getNodeActivations();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getNodeActivationsSequence <em>Node Activations Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNodeActivationGroup)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivationGroup_nodeActivations_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup#getNodeActivationsSequence
	 * @model opposite="nodeActivationsSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNodeActivationGroup getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNodeActivationGroup value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getActivityNodeActivationGroup_nodeActivations_Values <em>Activity Node Activation Group node Activations Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivationGroup_nodeActivations_Value_States()
	 * @see fumlConfigurationTrace.States.State#getActivityNodeActivationGroup_nodeActivations_Values
	 * @model opposite="activityNodeActivationGroup_nodeActivations_Values" required="true"
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

} // ActivityNodeActivationGroup_nodeActivations_Value
