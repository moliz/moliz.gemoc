/**
 */
package petrinet2Configuration;

import org.eclipse.emf.common.util.EList;

import petrinet2.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet2Configuration.PlaceConfiguration#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#getPlaceConfiguration()
 * @model
 * @generated
 */
public interface PlaceConfiguration extends Place {
	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet2Configuration.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' containment reference list.
	 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#getPlaceConfiguration_HeldTokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getHeldTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addToken();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeToken();

} // PlaceConfiguration
