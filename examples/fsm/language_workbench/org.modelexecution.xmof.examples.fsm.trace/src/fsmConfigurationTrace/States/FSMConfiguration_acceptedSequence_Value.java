/**
 */
package fsmConfigurationTrace.States;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM Configuration accepted Sequence Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Value#getAcceptedSequence <em>Accepted Sequence</em>}</li>
 * </ul>
 *
 * @see fsmConfigurationTrace.States.StatesPackage#getFSMConfiguration_acceptedSequence_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface FSMConfiguration_acceptedSequence_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Accepted Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted Sequence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Sequence</em>' attribute list.
	 * @see fsmConfigurationTrace.States.StatesPackage#getFSMConfiguration_acceptedSequence_Value_AcceptedSequence()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAcceptedSequence();

} // FSMConfiguration_acceptedSequence_Value
