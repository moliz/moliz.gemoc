/**
 */
package fsmConfigurationTrace.States;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM Configuration produced Sequence Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Value#getProducedSequence <em>Produced Sequence</em>}</li>
 * </ul>
 *
 * @see fsmConfigurationTrace.States.StatesPackage#getFSMConfiguration_producedSequence_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface FSMConfiguration_producedSequence_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Produced Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Sequence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Sequence</em>' attribute list.
	 * @see fsmConfigurationTrace.States.StatesPackage#getFSMConfiguration_producedSequence_Value_ProducedSequence()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getProducedSequence();

} // FSMConfiguration_producedSequence_Value
