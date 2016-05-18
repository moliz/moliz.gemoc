/**
 */
package umlTrace.States.fumlConfiguration.Actions.BasicActions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.CallActionActivation_callExecutions_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Call Action Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedCallActionActivationImpl#getCallExecutionsSequence <em>Call Executions Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedCallActionActivationImpl extends TracedInvocationActionActivationImpl implements TracedCallActionActivation {
	/**
	 * The cached value of the '{@link #getCallExecutionsSequence() <em>Call Executions Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallExecutionsSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<CallActionActivation_callExecutions_Value> callExecutionsSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedCallActionActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActionsPackage.Literals.TRACED_CALL_ACTION_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallActionActivation_callExecutions_Value> getCallExecutionsSequence() {
		if (callExecutionsSequence == null) {
			callExecutionsSequence = new EObjectContainmentWithInverseEList<CallActionActivation_callExecutions_Value>(CallActionActivation_callExecutions_Value.class, this, BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE, StatesPackage.CALL_ACTION_ACTIVATION_CALL_EXECUTIONS_VALUE__PARENT);
		}
		return callExecutionsSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallExecutionsSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE:
				return ((InternalEList<?>)getCallExecutionsSequence()).basicRemove(otherEnd, msgs);
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
			case BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE:
				return getCallExecutionsSequence();
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
			case BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE:
				getCallExecutionsSequence().clear();
				getCallExecutionsSequence().addAll((Collection<? extends CallActionActivation_callExecutions_Value>)newValue);
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
			case BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE:
				getCallExecutionsSequence().clear();
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
			case BasicActionsPackage.TRACED_CALL_ACTION_ACTIVATION__CALL_EXECUTIONS_SEQUENCE:
				return callExecutionsSequence != null && !callExecutionsSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedCallActionActivationImpl
