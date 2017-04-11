/**
 */
package fsmConfigurationTrace.States.fsmConfiguration.impl;

import fsmConfigurationTrace.States.FSMConfiguration_acceptedSequence_Dimension;
import fsmConfigurationTrace.States.FSMConfiguration_currentState_Dimension;
import fsmConfigurationTrace.States.FSMConfiguration_producedSequence_Dimension;
import fsmConfigurationTrace.States.SpecificDimension;

import fsmConfigurationTrace.States.fsm.impl.TracedFSMImpl;

import fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage;
import fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced FSM Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedFSMConfigurationImpl#getFSMConfiguration_acceptedSequence_Dimension <em>FSM Configuration accepted Sequence Dimension</em>}</li>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedFSMConfigurationImpl#getFSMConfiguration_currentState_Dimension <em>FSM Configuration current State Dimension</em>}</li>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedFSMConfigurationImpl#getFSMConfiguration_producedSequence_Dimension <em>FSM Configuration produced Sequence Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedFSMConfigurationImpl extends TracedFSMImpl implements TracedFSMConfiguration {
	/**
	 * The cached value of the '{@link #getFSMConfiguration_acceptedSequence_Dimension() <em>FSM Configuration accepted Sequence Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSMConfiguration_acceptedSequence_Dimension()
	 * @generated
	 * @ordered
	 */
	protected FSMConfiguration_acceptedSequence_Dimension fSMConfiguration_acceptedSequence_Dimension;

	/**
	 * The cached value of the '{@link #getFSMConfiguration_currentState_Dimension() <em>FSM Configuration current State Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSMConfiguration_currentState_Dimension()
	 * @generated
	 * @ordered
	 */
	protected FSMConfiguration_currentState_Dimension fSMConfiguration_currentState_Dimension;

	/**
	 * The cached value of the '{@link #getFSMConfiguration_producedSequence_Dimension() <em>FSM Configuration produced Sequence Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSMConfiguration_producedSequence_Dimension()
	 * @generated
	 * @ordered
	 */
	protected FSMConfiguration_producedSequence_Dimension fSMConfiguration_producedSequence_Dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedFSMConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmConfigurationPackage.Literals.TRACED_FSM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_acceptedSequence_Dimension getFSMConfiguration_acceptedSequence_Dimension() {
		return fSMConfiguration_acceptedSequence_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFSMConfiguration_acceptedSequence_Dimension(FSMConfiguration_acceptedSequence_Dimension newFSMConfiguration_acceptedSequence_Dimension, NotificationChain msgs) {
		FSMConfiguration_acceptedSequence_Dimension oldFSMConfiguration_acceptedSequence_Dimension = fSMConfiguration_acceptedSequence_Dimension;
		fSMConfiguration_acceptedSequence_Dimension = newFSMConfiguration_acceptedSequence_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION, oldFSMConfiguration_acceptedSequence_Dimension, newFSMConfiguration_acceptedSequence_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFSMConfiguration_acceptedSequence_Dimension(FSMConfiguration_acceptedSequence_Dimension newFSMConfiguration_acceptedSequence_Dimension) {
		if (newFSMConfiguration_acceptedSequence_Dimension != fSMConfiguration_acceptedSequence_Dimension) {
			NotificationChain msgs = null;
			if (fSMConfiguration_acceptedSequence_Dimension != null)
				msgs = ((InternalEObject)fSMConfiguration_acceptedSequence_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION, null, msgs);
			if (newFSMConfiguration_acceptedSequence_Dimension != null)
				msgs = ((InternalEObject)newFSMConfiguration_acceptedSequence_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION, null, msgs);
			msgs = basicSetFSMConfiguration_acceptedSequence_Dimension(newFSMConfiguration_acceptedSequence_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION, newFSMConfiguration_acceptedSequence_Dimension, newFSMConfiguration_acceptedSequence_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_currentState_Dimension getFSMConfiguration_currentState_Dimension() {
		return fSMConfiguration_currentState_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFSMConfiguration_currentState_Dimension(FSMConfiguration_currentState_Dimension newFSMConfiguration_currentState_Dimension, NotificationChain msgs) {
		FSMConfiguration_currentState_Dimension oldFSMConfiguration_currentState_Dimension = fSMConfiguration_currentState_Dimension;
		fSMConfiguration_currentState_Dimension = newFSMConfiguration_currentState_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION, oldFSMConfiguration_currentState_Dimension, newFSMConfiguration_currentState_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFSMConfiguration_currentState_Dimension(FSMConfiguration_currentState_Dimension newFSMConfiguration_currentState_Dimension) {
		if (newFSMConfiguration_currentState_Dimension != fSMConfiguration_currentState_Dimension) {
			NotificationChain msgs = null;
			if (fSMConfiguration_currentState_Dimension != null)
				msgs = ((InternalEObject)fSMConfiguration_currentState_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION, null, msgs);
			if (newFSMConfiguration_currentState_Dimension != null)
				msgs = ((InternalEObject)newFSMConfiguration_currentState_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION, null, msgs);
			msgs = basicSetFSMConfiguration_currentState_Dimension(newFSMConfiguration_currentState_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION, newFSMConfiguration_currentState_Dimension, newFSMConfiguration_currentState_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration_producedSequence_Dimension getFSMConfiguration_producedSequence_Dimension() {
		return fSMConfiguration_producedSequence_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFSMConfiguration_producedSequence_Dimension(FSMConfiguration_producedSequence_Dimension newFSMConfiguration_producedSequence_Dimension, NotificationChain msgs) {
		FSMConfiguration_producedSequence_Dimension oldFSMConfiguration_producedSequence_Dimension = fSMConfiguration_producedSequence_Dimension;
		fSMConfiguration_producedSequence_Dimension = newFSMConfiguration_producedSequence_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION, oldFSMConfiguration_producedSequence_Dimension, newFSMConfiguration_producedSequence_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFSMConfiguration_producedSequence_Dimension(FSMConfiguration_producedSequence_Dimension newFSMConfiguration_producedSequence_Dimension) {
		if (newFSMConfiguration_producedSequence_Dimension != fSMConfiguration_producedSequence_Dimension) {
			NotificationChain msgs = null;
			if (fSMConfiguration_producedSequence_Dimension != null)
				msgs = ((InternalEObject)fSMConfiguration_producedSequence_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION, null, msgs);
			if (newFSMConfiguration_producedSequence_Dimension != null)
				msgs = ((InternalEObject)newFSMConfiguration_producedSequence_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION, null, msgs);
			msgs = basicSetFSMConfiguration_producedSequence_Dimension(newFSMConfiguration_producedSequence_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION, newFSMConfiguration_producedSequence_Dimension, newFSMConfiguration_producedSequence_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getFSMConfiguration_currentState_Dimension());
		result.add(getFSMConfiguration_acceptedSequence_Dimension());
		result.add(getFSMConfiguration_producedSequence_Dimension());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION:
				return basicSetFSMConfiguration_acceptedSequence_Dimension(null, msgs);
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION:
				return basicSetFSMConfiguration_currentState_Dimension(null, msgs);
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION:
				return basicSetFSMConfiguration_producedSequence_Dimension(null, msgs);
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
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION:
				return getFSMConfiguration_acceptedSequence_Dimension();
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION:
				return getFSMConfiguration_currentState_Dimension();
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION:
				return getFSMConfiguration_producedSequence_Dimension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION:
				setFSMConfiguration_acceptedSequence_Dimension((FSMConfiguration_acceptedSequence_Dimension)newValue);
				return;
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION:
				setFSMConfiguration_currentState_Dimension((FSMConfiguration_currentState_Dimension)newValue);
				return;
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION:
				setFSMConfiguration_producedSequence_Dimension((FSMConfiguration_producedSequence_Dimension)newValue);
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
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION:
				setFSMConfiguration_acceptedSequence_Dimension((FSMConfiguration_acceptedSequence_Dimension)null);
				return;
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION:
				setFSMConfiguration_currentState_Dimension((FSMConfiguration_currentState_Dimension)null);
				return;
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION:
				setFSMConfiguration_producedSequence_Dimension((FSMConfiguration_producedSequence_Dimension)null);
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
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION:
				return fSMConfiguration_acceptedSequence_Dimension != null;
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION:
				return fSMConfiguration_currentState_Dimension != null;
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION:
				return fSMConfiguration_producedSequence_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedFSMConfigurationImpl
