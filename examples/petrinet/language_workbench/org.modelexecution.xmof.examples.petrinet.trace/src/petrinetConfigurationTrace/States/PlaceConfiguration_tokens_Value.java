/**
 */
package petrinetConfigurationTrace.States;

import org.eclipse.emf.common.util.EList;

import petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Configuration tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value#getStates <em>States</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see petrinetConfigurationTrace.States.StatesPackage#getPlaceConfiguration_tokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//PlaceConfiguration/tokens'"
 * @generated
 */
public interface PlaceConfiguration_tokens_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedPlaceConfiguration)
	 * @see petrinetConfigurationTrace.States.StatesPackage#getPlaceConfiguration_tokens_Value_Parent()
	 * @see petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration#getTokensSequence
	 * @model opposite="tokensSequence" required="true" transient="false"
	 * @generated
	 */
	TracedPlaceConfiguration getParent();

	/**
	 * Sets the value of the '{@link petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedPlaceConfiguration value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link petrinetConfigurationTrace.States.State#getPlaceConfiguration_tokens_Values <em>Place Configuration tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see petrinetConfigurationTrace.States.StatesPackage#getPlaceConfiguration_tokens_Value_States()
	 * @see petrinetConfigurationTrace.States.State#getPlaceConfiguration_tokens_Values
	 * @model opposite="placeConfiguration_tokens_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

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
	 * @see petrinetConfigurationTrace.States.StatesPackage#getPlaceConfiguration_tokens_Value_Tokens()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//PlaceConfiguration/tokens'"
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value#getTokens <em>Tokens</em>}' attribute.
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
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // PlaceConfiguration_tokens_Value
