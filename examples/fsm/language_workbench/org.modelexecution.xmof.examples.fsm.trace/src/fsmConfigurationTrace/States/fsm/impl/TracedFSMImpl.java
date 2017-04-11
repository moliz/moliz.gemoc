/**
 */
package fsmConfigurationTrace.States.fsm.impl;

import fsm.FSM;

import fsmConfigurationTrace.States.SpecificDimension;

import fsmConfigurationTrace.States.fsm.FsmPackage;
import fsmConfigurationTrace.States.fsm.TracedFSM;

import fsmConfigurationTrace.States.impl.SpecificTracedObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.fsm.impl.TracedFSMImpl#getOriginalObject_FSM <em>Original Object FSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedFSMImpl extends SpecificTracedObjectImpl<SpecificDimension<?>> implements TracedFSM {
	/**
	 * The cached value of the '{@link #getOriginalObject_FSM() <em>Original Object FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_FSM()
	 * @generated
	 * @ordered
	 */
	protected FSM originalObject_FSM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.TRACED_FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getOriginalObject_FSM() {
		if (originalObject_FSM != null && originalObject_FSM.eIsProxy()) {
			InternalEObject oldOriginalObject_FSM = (InternalEObject)originalObject_FSM;
			originalObject_FSM = (FSM)eResolveProxy(oldOriginalObject_FSM);
			if (originalObject_FSM != oldOriginalObject_FSM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRACED_FSM__ORIGINAL_OBJECT_FSM, oldOriginalObject_FSM, originalObject_FSM));
			}
		}
		return originalObject_FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM basicGetOriginalObject_FSM() {
		return originalObject_FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_FSM(FSM newOriginalObject_FSM) {
		FSM oldOriginalObject_FSM = originalObject_FSM;
		originalObject_FSM = newOriginalObject_FSM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_FSM__ORIGINAL_OBJECT_FSM, oldOriginalObject_FSM, originalObject_FSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmPackage.TRACED_FSM__ORIGINAL_OBJECT_FSM:
				if (resolve) return getOriginalObject_FSM();
				return basicGetOriginalObject_FSM();
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
			case FsmPackage.TRACED_FSM__ORIGINAL_OBJECT_FSM:
				setOriginalObject_FSM((FSM)newValue);
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
			case FsmPackage.TRACED_FSM__ORIGINAL_OBJECT_FSM:
				setOriginalObject_FSM((FSM)null);
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
			case FsmPackage.TRACED_FSM__ORIGINAL_OBJECT_FSM:
				return originalObject_FSM != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedFSMImpl
