/**
 */
package imlTrace.States.impl;

import imlTrace.States.ConnectionPoint_firing_Value;
import imlTrace.States.State;
import imlTrace.States.StatesPackage;

import imlTrace.States.iml.ImlPackage;
import imlTrace.States.iml.TracedConnectionPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point firing Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.impl.ConnectionPoint_firing_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link imlTrace.States.impl.ConnectionPoint_firing_ValueImpl#isFiring <em>Firing</em>}</li>
 *   <li>{@link imlTrace.States.impl.ConnectionPoint_firing_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link imlTrace.States.impl.ConnectionPoint_firing_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPoint_firing_ValueImpl extends MinimalEObjectImpl.Container implements ConnectionPoint_firing_Value {
	/**
	 * The default value of the '{@link #isFiring() <em>Firing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFiring() <em>Firing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiring()
	 * @generated
	 * @ordered
	 */
	protected boolean firing = FIRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPoint_firing_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.CONNECTION_POINT_FIRING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFiring() {
		return firing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiring(boolean newFiring) {
		boolean oldFiring = firing;
		firing = newFiring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.CONNECTION_POINT_FIRING_VALUE__FIRING, oldFiring, firing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConnectionPoint getParent() {
		if (eContainerFeatureID() != StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT) return null;
		return (TracedConnectionPoint)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedConnectionPoint newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedConnectionPoint newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE, TracedConnectionPoint.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES, StatesPackage.STATE__CONNECTION_POINT_FIRING_VALUES);
		}
		return states;
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
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedConnectionPoint)otherEnd, msgs);
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ImlPackage.TRACED_CONNECTION_POINT__FIRING_SEQUENCE, TracedConnectionPoint.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__FIRING:
				return isFiring();
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT:
				return getParent();
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES:
				return getStates();
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
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__FIRING:
				setFiring((Boolean)newValue);
				return;
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT:
				setParent((TracedConnectionPoint)newValue);
				return;
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__FIRING:
				setFiring(FIRING_EDEFAULT);
				return;
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT:
				setParent((TracedConnectionPoint)null);
				return;
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__FIRING:
				return firing != FIRING_EDEFAULT;
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES:
				return states != null && !states.isEmpty();
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
		result.append(" (firing: ");
		result.append(firing);
		result.append(')');
		return result.toString();
	}

} //ConnectionPoint_firing_ValueImpl
