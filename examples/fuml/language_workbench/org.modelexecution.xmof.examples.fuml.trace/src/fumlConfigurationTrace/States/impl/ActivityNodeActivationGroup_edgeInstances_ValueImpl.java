/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node Activation Group edge Instances Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActivityNodeActivationGroup_edgeInstances_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActivityNodeActivationGroup_edgeInstances_ValueImpl#getEdgeInstances <em>Edge Instances</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActivityNodeActivationGroup_edgeInstances_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActivityNodeActivationGroup_edgeInstances_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeActivationGroup_edgeInstances_ValueImpl extends MinimalEObjectImpl.Container implements ActivityNodeActivationGroup_edgeInstances_Value {
	/**
	 * The cached value of the '{@link #getEdgeInstances() <em>Edge Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityEdgeInstance> edgeInstances;

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
	protected ActivityNodeActivationGroup_edgeInstances_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE;
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
	public EList<TracedActivityEdgeInstance> getEdgeInstances() {
		if (edgeInstances == null) {
			edgeInstances = new EObjectResolvingEList<TracedActivityEdgeInstance>(TracedActivityEdgeInstance.class, this, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__EDGE_INSTANCES);
		}
		return edgeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNodeActivationGroup getParent() {
		if (eContainerFeatureID() != StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT) return null;
		return (TracedActivityNodeActivationGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedActivityNodeActivationGroup newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedActivityNodeActivationGroup newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE, TracedActivityNodeActivationGroup.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUES);
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedActivityNodeActivationGroup)otherEnd, msgs);
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE, TracedActivityNodeActivationGroup.class, msgs);
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__EDGE_INSTANCES:
				return getEdgeInstances();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT:
				return getParent();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__EDGE_INSTANCES:
				getEdgeInstances().clear();
				getEdgeInstances().addAll((Collection<? extends TracedActivityEdgeInstance>)newValue);
				return;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT:
				setParent((TracedActivityNodeActivationGroup)newValue);
				return;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__EDGE_INSTANCES:
				getEdgeInstances().clear();
				return;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT:
				setParent((TracedActivityNodeActivationGroup)null);
				return;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__EDGE_INSTANCES:
				return edgeInstances != null && !edgeInstances.isEmpty();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityNodeActivationGroup_edgeInstances_ValueImpl
