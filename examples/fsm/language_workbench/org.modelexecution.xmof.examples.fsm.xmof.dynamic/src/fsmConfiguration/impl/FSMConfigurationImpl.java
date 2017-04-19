/**
 */
package fsmConfiguration.impl;

import fsm.State;

import fsm.impl.FSMImpl;

import fsmConfiguration.FSMConfiguration;
import fsmConfiguration.FsmConfigurationPackage;
import fsmConfiguration.Input;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmConfiguration.impl.FSMConfigurationImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link fsmConfiguration.impl.FSMConfigurationImpl#getProducedSequence <em>Produced Sequence</em>}</li>
 *   <li>{@link fsmConfiguration.impl.FSMConfigurationImpl#getAcceptedSequence <em>Accepted Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMConfigurationImpl extends FSMImpl implements FSMConfiguration {
	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

	/**
	 * The cached value of the '{@link #getProducedSequence() <em>Produced Sequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> producedSequence;

	/**
	 * The cached value of the '{@link #getAcceptedSequence() <em>Accepted Sequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> acceptedSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmConfigurationPackage.Literals.FSM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject)currentState;
			currentState = (State)eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmConfigurationPackage.FSM_CONFIGURATION__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.FSM_CONFIGURATION__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProducedSequence() {
		if (producedSequence == null) {
			producedSequence = new EDataTypeEList<String>(String.class, this, FsmConfigurationPackage.FSM_CONFIGURATION__PRODUCED_SEQUENCE);
		}
		return producedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAcceptedSequence() {
		if (acceptedSequence == null) {
			acceptedSequence = new EDataTypeEList<String>(String.class, this, FsmConfigurationPackage.FSM_CONFIGURATION__ACCEPTED_SEQUENCE);
		}
		return acceptedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main(Input input) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run(EObject input) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmConfigurationPackage.FSM_CONFIGURATION__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
			case FsmConfigurationPackage.FSM_CONFIGURATION__PRODUCED_SEQUENCE:
				return getProducedSequence();
			case FsmConfigurationPackage.FSM_CONFIGURATION__ACCEPTED_SEQUENCE:
				return getAcceptedSequence();
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
			case FsmConfigurationPackage.FSM_CONFIGURATION__CURRENT_STATE:
				setCurrentState((State)newValue);
				return;
			case FsmConfigurationPackage.FSM_CONFIGURATION__PRODUCED_SEQUENCE:
				getProducedSequence().clear();
				getProducedSequence().addAll((Collection<? extends String>)newValue);
				return;
			case FsmConfigurationPackage.FSM_CONFIGURATION__ACCEPTED_SEQUENCE:
				getAcceptedSequence().clear();
				getAcceptedSequence().addAll((Collection<? extends String>)newValue);
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
			case FsmConfigurationPackage.FSM_CONFIGURATION__CURRENT_STATE:
				setCurrentState((State)null);
				return;
			case FsmConfigurationPackage.FSM_CONFIGURATION__PRODUCED_SEQUENCE:
				getProducedSequence().clear();
				return;
			case FsmConfigurationPackage.FSM_CONFIGURATION__ACCEPTED_SEQUENCE:
				getAcceptedSequence().clear();
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
			case FsmConfigurationPackage.FSM_CONFIGURATION__CURRENT_STATE:
				return currentState != null;
			case FsmConfigurationPackage.FSM_CONFIGURATION__PRODUCED_SEQUENCE:
				return producedSequence != null && !producedSequence.isEmpty();
			case FsmConfigurationPackage.FSM_CONFIGURATION__ACCEPTED_SEQUENCE:
				return acceptedSequence != null && !acceptedSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (producedSequence: ");
		result.append(producedSequence);
		result.append(", acceptedSequence: ");
		result.append(acceptedSequence);
		result.append(')');
		return result.toString();
	}

} //FSMConfigurationImpl
