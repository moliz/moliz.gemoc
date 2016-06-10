/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Object Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation#getOfferedTokenCountSequence <em>Offered Token Count Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedObjectNodeActivation()
 * @model abstract="true"
 * @generated
 */
public interface TracedObjectNodeActivation extends TracedActivityNodeActivation {
	/**
	 * Returns the value of the '<em><b>Offered Token Count Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Token Count Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Token Count Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedObjectNodeActivation_OfferedTokenCountSequence()
	 * @see fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ObjectNodeActivation_offeredTokenCount_Value> getOfferedTokenCountSequence();

} // TracedObjectNodeActivation
