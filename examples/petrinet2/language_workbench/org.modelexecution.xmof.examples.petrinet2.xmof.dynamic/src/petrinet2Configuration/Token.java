/**
 */
package petrinet2Configuration;

import org.eclipse.emf.ecore.EObject;

import petrinet2.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet2Configuration.Token#getHoldingPlace <em>Holding Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Holding Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holding Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holding Place</em>' reference.
	 * @see #setHoldingPlace(Place)
	 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#getToken_HoldingPlace()
	 * @model required="true"
	 * @generated
	 */
	Place getHoldingPlace();

	/**
	 * Sets the value of the '{@link petrinet2Configuration.Token#getHoldingPlace <em>Holding Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holding Place</em>' reference.
	 * @see #getHoldingPlace()
	 * @generated
	 */
	void setHoldingPlace(Place value);

} // Token
