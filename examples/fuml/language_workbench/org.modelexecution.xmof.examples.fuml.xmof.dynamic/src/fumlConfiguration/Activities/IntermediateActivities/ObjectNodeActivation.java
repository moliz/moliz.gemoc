/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#getOfferedTokenCount <em>Offered Token Count</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getObjectNodeActivation()
 * @model abstract="true"
 * @generated
 */
public interface ObjectNodeActivation extends ActivityNodeActivation {
	/**
	 * Returns the value of the '<em><b>Offered Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Token Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Token Count</em>' attribute.
	 * @see #setOfferedTokenCount(int)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getObjectNodeActivation_OfferedTokenCount()
	 * @model required="true"
	 * @generated
	 */
	int getOfferedTokenCount();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation#getOfferedTokenCount <em>Offered Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offered Token Count</em>' attribute.
	 * @see #getOfferedTokenCount()
	 * @generated
	 */
	void setOfferedTokenCount(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model countRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void countUnofferedTokens(int count);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void sendUnofferedTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unofferedTokensMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getUnofferedTokens(EList<Token> unofferedTokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model countRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void countOfferedValues(int count);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensMany="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void takeUnofferedTokens(EList<Token> tokens);

} // ObjectNodeActivation
