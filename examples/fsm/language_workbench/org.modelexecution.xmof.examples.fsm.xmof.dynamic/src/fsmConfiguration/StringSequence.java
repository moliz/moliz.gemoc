/**
 */
package fsmConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmConfiguration.StringSequence#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see fsmConfiguration.FsmConfigurationPackage#getStringSequence()
 * @model
 * @generated
 */
public interface StringSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link fsmConfiguration.StringLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see fsmConfiguration.FsmConfigurationPackage#getStringSequence_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringLiteral> getLiterals();

} // StringSequence
