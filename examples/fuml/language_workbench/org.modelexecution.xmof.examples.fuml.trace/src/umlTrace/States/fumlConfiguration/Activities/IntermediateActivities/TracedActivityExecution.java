/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.ActivityExecution_activationGroup_Value;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution#getActivationGroupSequence <em>Activation Group Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityExecution()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityExecution'"
 * @generated
 */
public interface TracedActivityExecution extends TracedExecution {
	/**
	 * Returns the value of the '<em><b>Activation Group Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityExecution_activationGroup_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityExecution_activationGroup_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Group Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Group Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityExecution_ActivationGroupSequence()
	 * @see umlTrace.States.ActivityExecution_activationGroup_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityExecution_activationGroup_Value> getActivationGroupSequence();

} // TracedActivityExecution
