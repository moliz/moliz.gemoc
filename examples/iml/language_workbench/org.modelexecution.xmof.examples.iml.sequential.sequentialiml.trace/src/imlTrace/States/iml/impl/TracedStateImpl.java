/**
 */
package imlTrace.States.iml.impl;

import imlTrace.States.ConnectionPoint_firing_Value;
import imlTrace.States.State_current_Value;
import imlTrace.States.StatesPackage;

import imlTrace.States.iml.ImlPackage;
import imlTrace.States.iml.TracedConnectionPoint;
import imlTrace.States.iml.TracedState;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.impl.TracedStateImpl#getFiringSequence <em>Firing Sequence</em>}</li>
 *   <li>{@link imlTrace.States.iml.impl.TracedStateImpl#getCurrentSequence <em>Current Sequence</em>}</li>
 *   <li>{@link imlTrace.States.iml.impl.TracedStateImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedStateImpl extends TracedIdentifyableElementImpl implements TracedState {
	/**
	 * The cached value of the '{@link #getFiringSequence() <em>Firing Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiringSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPoint_firing_Value> firingSequence;

	/**
	 * The cached value of the '{@link #getCurrentSequence() <em>Current Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<State_current_Value> currentSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected State originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.TRACED_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint_firing_Value> getFiringSequence() {
		if (firingSequence == null) {
			firingSequence = new EObjectContainmentWithInverseEList<ConnectionPoint_firing_Value>(ConnectionPoint_firing_Value.class, this, ImlPackage.TRACED_STATE__FIRING_SEQUENCE, StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT);
		}
		return firingSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State_current_Value> getCurrentSequence() {
		if (currentSequence == null) {
			currentSequence = new EObjectContainmentWithInverseEList<State_current_Value>(State_current_Value.class, this, ImlPackage.TRACED_STATE__CURRENT_SEQUENCE, StatesPackage.STATE_CURRENT_VALUE__PARENT);
		}
		return currentSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (State)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImlPackage.TRACED_STATE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(State newOriginalObject) {
		State oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.TRACED_STATE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case ImlPackage.TRACED_STATE__FIRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiringSequence()).basicAdd(otherEnd, msgs);
			case ImlPackage.TRACED_STATE__CURRENT_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentSequence()).basicAdd(otherEnd, msgs);
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
			case ImlPackage.TRACED_STATE__FIRING_SEQUENCE:
				return ((InternalEList<?>)getFiringSequence()).basicRemove(otherEnd, msgs);
			case ImlPackage.TRACED_STATE__CURRENT_SEQUENCE:
				return ((InternalEList<?>)getCurrentSequence()).basicRemove(otherEnd, msgs);
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
			case ImlPackage.TRACED_STATE__FIRING_SEQUENCE:
				return getFiringSequence();
			case ImlPackage.TRACED_STATE__CURRENT_SEQUENCE:
				return getCurrentSequence();
			case ImlPackage.TRACED_STATE__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case ImlPackage.TRACED_STATE__FIRING_SEQUENCE:
				getFiringSequence().clear();
				getFiringSequence().addAll((Collection<? extends ConnectionPoint_firing_Value>)newValue);
				return;
			case ImlPackage.TRACED_STATE__CURRENT_SEQUENCE:
				getCurrentSequence().clear();
				getCurrentSequence().addAll((Collection<? extends State_current_Value>)newValue);
				return;
			case ImlPackage.TRACED_STATE__ORIGINAL_OBJECT:
				setOriginalObject((State)newValue);
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
			case ImlPackage.TRACED_STATE__FIRING_SEQUENCE:
				getFiringSequence().clear();
				return;
			case ImlPackage.TRACED_STATE__CURRENT_SEQUENCE:
				getCurrentSequence().clear();
				return;
			case ImlPackage.TRACED_STATE__ORIGINAL_OBJECT:
				setOriginalObject((State)null);
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
			case ImlPackage.TRACED_STATE__FIRING_SEQUENCE:
				return firingSequence != null && !firingSequence.isEmpty();
			case ImlPackage.TRACED_STATE__CURRENT_SEQUENCE:
				return currentSequence != null && !currentSequence.isEmpty();
			case ImlPackage.TRACED_STATE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TracedConnectionPoint.class) {
			switch (derivedFeatureID) {
				case ImlPackage.TRACED_STATE__FIRING_SEQUENCE: return ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TracedConnectionPoint.class) {
			switch (baseFeatureID) {
				case ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE: return ImlPackage.TRACED_STATE__FIRING_SEQUENCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TracedStateImpl
