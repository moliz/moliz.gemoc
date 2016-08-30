/**
 */
package imlTrace.States.iml.impl;

import imlTrace.States.ConnectionPoint_firing_Value;
import imlTrace.States.StatesPackage;

import imlTrace.States.iml.ImlPackage;
import imlTrace.States.iml.TracedConnectionPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Connection Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.iml.impl.TracedConnectionPointImpl#getFiringSequence <em>Firing Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedConnectionPointImpl extends MinimalEObjectImpl.Container implements TracedConnectionPoint {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedConnectionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.TRACED_CONNECTION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint_firing_Value> getFiringSequence() {
		if (firingSequence == null) {
			firingSequence = new EObjectContainmentWithInverseEList<ConnectionPoint_firing_Value>(ConnectionPoint_firing_Value.class, this, ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE, StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT);
		}
		return firingSequence;
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
			case ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiringSequence()).basicAdd(otherEnd, msgs);
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
			case ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE:
				return ((InternalEList<?>)getFiringSequence()).basicRemove(otherEnd, msgs);
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
			case ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE:
				return getFiringSequence();
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
			case ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE:
				getFiringSequence().clear();
				getFiringSequence().addAll((Collection<? extends ConnectionPoint_firing_Value>)newValue);
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
			case ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE:
				getFiringSequence().clear();
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
			case ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE:
				return firingSequence != null && !firingSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedConnectionPointImpl
