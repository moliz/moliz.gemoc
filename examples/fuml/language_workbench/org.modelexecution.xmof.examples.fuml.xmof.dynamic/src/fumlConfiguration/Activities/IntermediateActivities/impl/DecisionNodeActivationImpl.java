/**
 */
package fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance;
import fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation;
import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfiguration.Activities.IntermediateActivities.Token;

import fumlConfiguration.Classes.Kernel.Value;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DecisionNodeActivationImpl extends ControlNodeActivationImpl implements DecisionNodeActivation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.DECISION_NODE_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeJoinedControlTokens(EList<Token> incomingTokens, EList<Token> removedControlTokens, EList<Token> incomingTokens_joinedControlTokensRemoved) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getDecisionValues(EList<Token> incomingTokens, EList<Value> decisionValues) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void determineOfferedTokens(EList<Token> incomingTokens, EList<Value> decisionValues, ActivityEdgeInstance edgeInstance, EList<Token> offeredTokens, boolean receivesOffer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test(ValueSpecification guard, Value value, boolean result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void hasObjectFlowInput(boolean return_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getDecisionInputFlowValue(Value value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void executeDecisionInputBehavior(Value inputValue, Value decisionInputValue, Value decisionInputResult) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getDecisionInputFlowInstance(ActivityEdgeInstance edgeInstance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION___REMOVE_JOINED_CONTROL_TOKENS__ELIST_ELIST_ELIST:
				removeJoinedControlTokens((EList<Token>)arguments.get(0), (EList<Token>)arguments.get(1), (EList<Token>)arguments.get(2));
				return null;
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION___GET_DECISION_VALUES__ELIST_ELIST:
				getDecisionValues((EList<Token>)arguments.get(0), (EList<Value>)arguments.get(1));
				return null;
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION___DETERMINE_OFFERED_TOKENS__ELIST_ELIST_ACTIVITYEDGEINSTANCE_ELIST_BOOLEAN:
				determineOfferedTokens((EList<Token>)arguments.get(0), (EList<Value>)arguments.get(1), (ActivityEdgeInstance)arguments.get(2), (EList<Token>)arguments.get(3), (Boolean)arguments.get(4));
				return null;
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION___TEST__VALUESPECIFICATION_VALUE_BOOLEAN:
				test((ValueSpecification)arguments.get(0), (Value)arguments.get(1), (Boolean)arguments.get(2));
				return null;
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION___HAS_OBJECT_FLOW_INPUT__BOOLEAN:
				hasObjectFlowInput((Boolean)arguments.get(0));
				return null;
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION___GET_DECISION_INPUT_FLOW_VALUE__VALUE:
				getDecisionInputFlowValue((Value)arguments.get(0));
				return null;
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION___EXECUTE_DECISION_INPUT_BEHAVIOR__VALUE_VALUE_VALUE:
				executeDecisionInputBehavior((Value)arguments.get(0), (Value)arguments.get(1), (Value)arguments.get(2));
				return null;
			case IntermediateActivitiesPackage.DECISION_NODE_ACTIVATION___GET_DECISION_INPUT_FLOW_INSTANCE__ACTIVITYEDGEINSTANCE:
				getDecisionInputFlowInstance((ActivityEdgeInstance)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DecisionNodeActivationImpl
