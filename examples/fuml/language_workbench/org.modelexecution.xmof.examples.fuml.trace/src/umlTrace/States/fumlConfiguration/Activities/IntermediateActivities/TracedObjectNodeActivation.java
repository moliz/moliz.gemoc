/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Object Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation#getOfferedTokenCountSequence <em>Offered Token Count Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedObjectNodeActivation()
 * @model abstract="true"
 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ObjectNodeActivation'"
 * @generated
 */
public interface TracedObjectNodeActivation extends TracedActivityNodeActivation {
	/**
	 * Returns the value of the '<em><b>Offered Token Count Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Token Count Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Token Count Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedObjectNodeActivation_OfferedTokenCountSequence()
	 * @see umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ObjectNodeActivation_offeredTokenCount_Value> getOfferedTokenCountSequence();

} // TracedObjectNodeActivation
