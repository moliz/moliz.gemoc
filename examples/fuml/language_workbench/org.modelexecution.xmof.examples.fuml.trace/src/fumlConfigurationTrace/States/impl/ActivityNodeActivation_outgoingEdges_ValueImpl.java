/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

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
 * An implementation of the model object '<em><b>Activity Node Activation outgoing Edges Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActivityNodeActivation_outgoingEdges_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActivityNodeActivation_outgoingEdges_ValueImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActivityNodeActivation_outgoingEdges_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ActivityNodeActivation_outgoingEdges_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeActivation_outgoingEdges_ValueImpl extends MinimalEObjectImpl.Container implements ActivityNodeActivation_outgoingEdges_Value {
	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityEdgeInstance> outgoingEdges;

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
	protected ActivityNodeActivation_outgoingEdges_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE;
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
	public EList<TracedActivityEdgeInstance> getOutgoingEdges() {
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectResolvingEList<TracedActivityEdgeInstance>(TracedActivityEdgeInstance.class, this, StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__OUTGOING_EDGES);
		}
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNodeActivation getParent() {
		if (eContainerFeatureID() != StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT) return null;
		return (TracedActivityNodeActivation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedActivityNodeActivation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedActivityNodeActivation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE, TracedActivityNodeActivation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES, StatesPackage.STATE__ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUES);
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedActivityNodeActivation)otherEnd, msgs);
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE, TracedActivityNodeActivation.class, msgs);
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__OUTGOING_EDGES:
				return getOutgoingEdges();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT:
				return getParent();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends TracedActivityEdgeInstance>)newValue);
				return;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT:
				setParent((TracedActivityNodeActivation)newValue);
				return;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT:
				setParent((TracedActivityNodeActivation)null);
				return;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityNodeActivation_outgoingEdges_ValueImpl
