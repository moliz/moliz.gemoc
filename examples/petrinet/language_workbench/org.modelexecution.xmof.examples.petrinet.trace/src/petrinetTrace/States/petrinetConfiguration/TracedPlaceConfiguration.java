/**
 */
package petrinetTrace.States.petrinetConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetConfiguration.PlaceConfiguration;

import petrinetTrace.States.PlaceConfiguration_tokens_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Place Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getTokensSequence <em>Tokens Sequence</em>}</li>
 * </ul>
 *
 * @see petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage#getTracedPlaceConfiguration()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//PlaceConfiguration'"
 * @generated
 */
public interface TracedPlaceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(PlaceConfiguration)
	 * @see petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage#getTracedPlaceConfiguration_OriginalObject()
	 * @model
	 * @generated
	 */
	PlaceConfiguration getOriginalObject();

	/**
	 * Sets the value of the '{@link petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(PlaceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Tokens Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetTrace.States.PlaceConfiguration_tokens_Value}.
	 * It is bidirectional and its opposite is '{@link petrinetTrace.States.PlaceConfiguration_tokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens Sequence</em>' containment reference list.
	 * @see petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationPackage#getTracedPlaceConfiguration_TokensSequence()
	 * @see petrinetTrace.States.PlaceConfiguration_tokens_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PlaceConfiguration_tokens_Value> getTokensSequence();

} // TracedPlaceConfiguration
