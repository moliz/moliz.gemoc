/**
 */
package fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.Classes.Kernel.Value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.Token#getHolder <em>Holder</em>}</li>
 * </ul>
 *
 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' container reference.
	 * @see #setHolder(ActivityNodeActivation)
	 * @see fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getToken_Holder()
	 * @see fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation#getHeldTokens
	 * @model opposite="heldTokens" transient="false"
	 * @generated
	 */
	ActivityNodeActivation getHolder();

	/**
	 * Sets the value of the '{@link fumlConfiguration.Activities.IntermediateActivities.Token#getHolder <em>Holder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' container reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(ActivityNodeActivation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void withdraw();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model isWithdrawnRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void isWithdrawn(boolean isWithdrawn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model holderRequired="true" tokenRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void transfer(ActivityNodeActivation holder, Token token);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model isControlRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void isControl(boolean isControl);

} // Token
