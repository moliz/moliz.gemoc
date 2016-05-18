/**
 */
package umlTrace.States.impl;

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

import umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node Activation offered Token Count Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.ObjectNodeActivation_offeredTokenCount_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.ObjectNodeActivation_offeredTokenCount_ValueImpl#getOfferedTokenCount <em>Offered Token Count</em>}</li>
 *   <li>{@link umlTrace.States.impl.ObjectNodeActivation_offeredTokenCount_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.ObjectNodeActivation_offeredTokenCount_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectNodeActivation_offeredTokenCount_ValueImpl extends MinimalEObjectImpl.Container implements ObjectNodeActivation_offeredTokenCount_Value {
	/**
	 * The default value of the '{@link #getOfferedTokenCount() <em>Offered Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokenCount()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFERED_TOKEN_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOfferedTokenCount() <em>Offered Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokenCount()
	 * @generated
	 * @ordered
	 */
	protected int offeredTokenCount = OFFERED_TOKEN_COUNT_EDEFAULT;

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
	protected ObjectNodeActivation_offeredTokenCount_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE;
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
	public int getOfferedTokenCount() {
		return offeredTokenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfferedTokenCount(int newOfferedTokenCount) {
		int oldOfferedTokenCount = offeredTokenCount;
		offeredTokenCount = newOfferedTokenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__OFFERED_TOKEN_COUNT, oldOfferedTokenCount, offeredTokenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObjectNodeActivation getParent() {
		if (eContainerFeatureID() != StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT) return null;
		return (TracedObjectNodeActivation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedObjectNodeActivation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedObjectNodeActivation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE, TracedObjectNodeActivation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES, StatesPackage.STATE__OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUES);
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
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedObjectNodeActivation)otherEnd, msgs);
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES:
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
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES:
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
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesPackage.TRACED_OBJECT_NODE_ACTIVATION__OFFERED_TOKEN_COUNT_SEQUENCE, TracedObjectNodeActivation.class, msgs);
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
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__OFFERED_TOKEN_COUNT:
				return getOfferedTokenCount();
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT:
				return getParent();
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES:
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
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__OFFERED_TOKEN_COUNT:
				setOfferedTokenCount((Integer)newValue);
				return;
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT:
				setParent((TracedObjectNodeActivation)newValue);
				return;
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES:
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
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__OFFERED_TOKEN_COUNT:
				setOfferedTokenCount(OFFERED_TOKEN_COUNT_EDEFAULT);
				return;
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT:
				setParent((TracedObjectNodeActivation)null);
				return;
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES:
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
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__OFFERED_TOKEN_COUNT:
				return offeredTokenCount != OFFERED_TOKEN_COUNT_EDEFAULT;
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.OBJECT_NODE_ACTIVATION_OFFERED_TOKEN_COUNT_VALUE__STATES:
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
		result.append(" (offeredTokenCount: ");
		result.append(offeredTokenCount);
		result.append(')');
		return result.toString();
	}

} //ObjectNodeActivation_offeredTokenCount_ValueImpl
