/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value;
import umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value;
import umlTrace.States.ActivityEdgeInstance_offers_Value;
import umlTrace.States.ActivityEdgeInstance_source_Value;
import umlTrace.States.ActivityEdgeInstance_target_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getEdge_ActivityEdgeInstanceSequence <em>Edge Activity Edge Instance Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getGroup_ActivityEdgeInstanceSequence <em>Group Activity Edge Instance Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOffersSequence <em>Offers Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getSourceSequence <em>Source Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getTargetSequence <em>Target Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityEdgeInstance()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityEdgeInstance'"
 * @generated
 */
public interface TracedActivityEdgeInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Edge Activity Edge Instance Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Activity Edge Instance Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Activity Edge Instance Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityEdgeInstance_Edge_ActivityEdgeInstanceSequence()
	 * @see umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdgeInstance_edge_ActivityEdgeInstance_Value> getEdge_ActivityEdgeInstanceSequence();

	/**
	 * Returns the value of the '<em><b>Group Activity Edge Instance Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Activity Edge Instance Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Activity Edge Instance Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityEdgeInstance_Group_ActivityEdgeInstanceSequence()
	 * @see umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdgeInstance_group_ActivityEdgeInstance_Value> getGroup_ActivityEdgeInstanceSequence();

	/**
	 * Returns the value of the '<em><b>Offers Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityEdgeInstance_offers_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityEdgeInstance_offers_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityEdgeInstance_OffersSequence()
	 * @see umlTrace.States.ActivityEdgeInstance_offers_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdgeInstance_offers_Value> getOffersSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ActivityEdgeInstance)
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityEdgeInstance_OriginalObject()
	 * @model
	 * @generated
	 */
	ActivityEdgeInstance getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ActivityEdgeInstance value);

	/**
	 * Returns the value of the '<em><b>Source Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityEdgeInstance_source_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityEdgeInstance_source_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityEdgeInstance_SourceSequence()
	 * @see umlTrace.States.ActivityEdgeInstance_source_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdgeInstance_source_Value> getSourceSequence();

	/**
	 * Returns the value of the '<em><b>Target Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ActivityEdgeInstance_target_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ActivityEdgeInstance_target_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedActivityEdgeInstance_TargetSequence()
	 * @see umlTrace.States.ActivityEdgeInstance_target_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdgeInstance_target_Value> getTargetSequence();

} // TracedActivityEdgeInstance
