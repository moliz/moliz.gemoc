/**
 */
package fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage#getDecisionNodeActivation()
 * @model
 * @generated
 */
public interface DecisionNodeActivation extends ControlNodeActivation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model incomingTokensMany="true" removedControlTokensMany="true" incomingTokens_joinedControlTokensRemovedMany="true"
	 * @generated
	 */
	void removeJoinedControlTokens(EList<Token> incomingTokens, EList<Token> removedControlTokens, EList<Token> incomingTokens_joinedControlTokensRemoved);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model incomingTokensMany="true" decisionValuesMany="true"
	 * @generated
	 */
	void getDecisionValues(EList<Token> incomingTokens, EList<Value> decisionValues);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model incomingTokensMany="true" decisionValuesMany="true" edgeInstanceRequired="true" offeredTokensMany="true" receivesOfferRequired="true"
	 * @generated
	 */
	void determineOfferedTokens(EList<Token> incomingTokens, EList<Value> decisionValues, ActivityEdgeInstance edgeInstance, EList<Token> offeredTokens, boolean receivesOffer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guardRequired="true" valueRequired="true" resultRequired="true"
	 * @generated
	 */
	void test(ValueSpecification guard, Value value, boolean result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model returnRequired="true"
	 * @generated
	 */
	void hasObjectFlowInput(boolean return_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getDecisionInputFlowValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inputValueRequired="true" decisionInputResultRequired="true"
	 * @generated
	 */
	void executeDecisionInputBehavior(Value inputValue, Value decisionInputValue, Value decisionInputResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getDecisionInputFlowInstance(ActivityEdgeInstance edgeInstance);

} // DecisionNodeActivation
