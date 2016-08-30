/**
 */
package petrinet2Configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet2Configuration.TokenDistribution#getInitialTokens <em>Initial Tokens</em>}</li>
 * </ul>
 *
 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#getTokenDistribution()
 * @model
 * @generated
 */
public interface TokenDistribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet2Configuration.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Tokens</em>' containment reference list.
	 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#getTokenDistribution_InitialTokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getInitialTokens();

} // TokenDistribution
