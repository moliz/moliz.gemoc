/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;
import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.CallActionActivation;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Action Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.CallActionActivationImpl#getCallExecutions <em>Call Executions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallActionActivationImpl extends InvocationActionActivationImpl implements CallActionActivation {
	/**
	 * The cached value of the '{@link #getCallExecutions() <em>Call Executions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution> callExecutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActionActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActionsFewStepsPackage.Literals.CALL_ACTION_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Execution> getCallExecutions() {
		if (callExecutions == null) {
			callExecutions = new EObjectContainmentEList<Execution>(Execution.class, this, BasicActionsFewStepsPackage.CALL_ACTION_ACTIVATION__CALL_EXECUTIONS);
		}
		return callExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCallExecution(Execution execution) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCallExecution(Execution execution) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeInputParameterValues(Execution callExecution) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void collectOutputParameterValues(Execution callExecution) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicActionsFewStepsPackage.CALL_ACTION_ACTIVATION__CALL_EXECUTIONS:
				return ((InternalEList<?>)getCallExecutions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicActionsFewStepsPackage.CALL_ACTION_ACTIVATION__CALL_EXECUTIONS:
				return getCallExecutions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicActionsFewStepsPackage.CALL_ACTION_ACTIVATION__CALL_EXECUTIONS:
				getCallExecutions().clear();
				getCallExecutions().addAll((Collection<? extends Execution>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicActionsFewStepsPackage.CALL_ACTION_ACTIVATION__CALL_EXECUTIONS:
				getCallExecutions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicActionsFewStepsPackage.CALL_ACTION_ACTIVATION__CALL_EXECUTIONS:
				return callExecutions != null && !callExecutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallActionActivationImpl
