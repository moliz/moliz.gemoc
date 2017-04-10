/**
 */
package fsmConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfiguration.Input#getStringSeq <em>String Seq</em>}</li>
 * </ul>
 *
 * @see fsmConfiguration.FsmConfigurationPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
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
	 * @see fsmConfiguration.FsmConfigurationPackage#getInput_StringSeq()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStringSeq();

} // Input
