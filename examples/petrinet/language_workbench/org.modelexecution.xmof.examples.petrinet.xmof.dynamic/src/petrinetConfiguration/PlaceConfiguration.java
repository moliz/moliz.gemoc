/**
 */
package petrinetConfiguration;

import petrinet.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetConfiguration.PlaceConfiguration#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetConfiguration.PetrinetConfigurationPackage#getPlaceConfiguration()
 * @model
 * @generated
 */
public interface PlaceConfiguration extends Place {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see petrinetConfiguration.PetrinetConfigurationPackage#getPlaceConfiguration_Tokens()
	 * @model
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link petrinetConfiguration.PlaceConfiguration#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeToken();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addToken();

} // PlaceConfiguration
