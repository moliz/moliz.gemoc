/**
 */
package fsmConfigurationTrace.States;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input string Seq Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.Input_stringSeq_Value#getStringSeq <em>String Seq</em>}</li>
 * </ul>
 *
 * @see fsmConfigurationTrace.States.StatesPackage#getInput_stringSeq_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Input_stringSeq_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>String Seq</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Seq</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Seq</em>' attribute list.
	 * @see fsmConfigurationTrace.States.StatesPackage#getInput_stringSeq_Value_StringSeq()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStringSeq();

} // Input_stringSeq_Value
