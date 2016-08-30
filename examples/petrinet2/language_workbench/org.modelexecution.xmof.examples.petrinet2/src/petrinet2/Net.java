/**
 */
package petrinet2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet2.Net#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinet2.Net#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinet2.Net#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet2.Petrinet2Package#getNet()
 * @model
 * @generated
 */
public interface Net extends EObject {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet2.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see petrinet2.Petrinet2Package#getNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet2.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see petrinet2.Petrinet2Package#getNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet2.Petrinet2Package#getNet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet2.Net#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Net
