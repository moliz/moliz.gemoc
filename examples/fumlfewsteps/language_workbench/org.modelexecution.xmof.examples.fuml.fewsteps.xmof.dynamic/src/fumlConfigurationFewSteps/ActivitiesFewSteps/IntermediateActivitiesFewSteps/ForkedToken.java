/**
 */
package fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkedToken#getBaseToken <em>Base Token</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkedToken#getRemainingOffersCount <em>Remaining Offers Count</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkedToken#isBaseTokenIsWithdrawn <em>Base Token Is Withdrawn</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getForkedToken()
 * @model
 * @generated
 */
public interface ForkedToken extends Token {
	/**
	 * Returns the value of the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token</em>' reference.
	 * @see #setBaseToken(Token)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getForkedToken_BaseToken()
	 * @model required="true"
	 * @generated
	 */
	Token getBaseToken();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkedToken#getBaseToken <em>Base Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Token</em>' reference.
	 * @see #getBaseToken()
	 * @generated
	 */
	void setBaseToken(Token value);

	/**
	 * Returns the value of the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Offers Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Offers Count</em>' attribute.
	 * @see #setRemainingOffersCount(int)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getForkedToken_RemainingOffersCount()
	 * @model required="true"
	 * @generated
	 */
	int getRemainingOffersCount();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkedToken#getRemainingOffersCount <em>Remaining Offers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Offers Count</em>' attribute.
	 * @see #getRemainingOffersCount()
	 * @generated
	 */
	void setRemainingOffersCount(int value);

	/**
	 * Returns the value of the '<em><b>Base Token Is Withdrawn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token Is Withdrawn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token Is Withdrawn</em>' attribute.
	 * @see #setBaseTokenIsWithdrawn(boolean)
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getForkedToken_BaseTokenIsWithdrawn()
	 * @model required="true"
	 * @generated
	 */
	boolean isBaseTokenIsWithdrawn();

	/**
	 * Sets the value of the '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ForkedToken#isBaseTokenIsWithdrawn <em>Base Token Is Withdrawn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Token Is Withdrawn</em>' attribute.
	 * @see #isBaseTokenIsWithdrawn()
	 * @generated
	 */
	void setBaseTokenIsWithdrawn(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // ForkedToken
