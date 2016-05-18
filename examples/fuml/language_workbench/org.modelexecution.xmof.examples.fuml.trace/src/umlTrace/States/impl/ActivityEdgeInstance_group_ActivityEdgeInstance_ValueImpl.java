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

import umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge Instance group Activity Edge Instance Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}</li>
 *   <li>{@link umlTrace.States.impl.ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl extends MinimalEObjectImpl.Container implements ActivityEdgeInstance_group_ActivityEdgeInstance_Value {
	/**
	 * The cached value of the '{@link #getGroup_ActivityEdgeInstance() <em>Group Activity Edge Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup_ActivityEdgeInstance()
	 * @generated
	 * @ordered
	 */
	protected TracedActivityNodeActivationGroup group_ActivityEdgeInstance;

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
	protected ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE;
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
	public TracedActivityNodeActivationGroup getGroup_ActivityEdgeInstance() {
		if (group_ActivityEdgeInstance != null && group_ActivityEdgeInstance.eIsProxy()) {
			InternalEObject oldGroup_ActivityEdgeInstance = (InternalEObject)group_ActivityEdgeInstance;
			group_ActivityEdgeInstance = (TracedActivityNodeActivationGroup)eResolveProxy(oldGroup_ActivityEdgeInstance);
			if (group_ActivityEdgeInstance != oldGroup_ActivityEdgeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE, oldGroup_ActivityEdgeInstance, group_ActivityEdgeInstance));
			}
		}
		return group_ActivityEdgeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNodeActivationGroup basicGetGroup_ActivityEdgeInstance() {
		return group_ActivityEdgeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup_ActivityEdgeInstance(TracedActivityNodeActivationGroup newGroup_ActivityEdgeInstance) {
		TracedActivityNodeActivationGroup oldGroup_ActivityEdgeInstance = group_ActivityEdgeInstance;
		group_ActivityEdgeInstance = newGroup_ActivityEdgeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE, oldGroup_ActivityEdgeInstance, group_ActivityEdgeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityEdgeInstance getParent() {
		if (eContainerFeatureID() != StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT) return null;
		return (TracedActivityEdgeInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedActivityEdgeInstance newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedActivityEdgeInstance newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE, TracedActivityEdgeInstance.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES, StatesPackage.STATE__ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUES);
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
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedActivityEdgeInstance)otherEnd, msgs);
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE, TracedActivityEdgeInstance.class, msgs);
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
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE:
				if (resolve) return getGroup_ActivityEdgeInstance();
				return basicGetGroup_ActivityEdgeInstance();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT:
				return getParent();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE:
				setGroup_ActivityEdgeInstance((TracedActivityNodeActivationGroup)newValue);
				return;
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT:
				setParent((TracedActivityEdgeInstance)newValue);
				return;
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE:
				setGroup_ActivityEdgeInstance((TracedActivityNodeActivationGroup)null);
				return;
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT:
				setParent((TracedActivityEdgeInstance)null);
				return;
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__GROUP_ACTIVITY_EDGE_INSTANCE:
				return group_ActivityEdgeInstance != null;
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityEdgeInstance_group_ActivityEdgeInstance_ValueImpl
