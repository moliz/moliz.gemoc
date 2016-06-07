/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value;
import fumlConfigurationTrace.States.ActivityNodeActivation_running_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Node Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl#getGroup_ActivityNodeActivationSequence <em>Group Activity Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl#getHeldTokensSequence <em>Held Tokens Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl#getIncomingEdgesSequence <em>Incoming Edges Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl#getIsRunningSequence <em>Is Running Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl#getNode_ActivityNodeActivationSequence <em>Node Activity Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl#getOutgoingEdgesSequence <em>Outgoing Edges Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl#getRunningSequence <em>Running Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityNodeActivationImpl extends TracedSemanticVisitorImpl implements TracedActivityNodeActivation {
	/**
	 * The cached value of the '{@link #getGroup_ActivityNodeActivationSequence() <em>Group Activity Node Activation Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup_ActivityNodeActivationSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_group_ActivityNodeActivation_Value> group_ActivityNodeActivationSequence;

	/**
	 * The cached value of the '{@link #getHeldTokensSequence() <em>Held Tokens Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldTokensSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_heldTokens_Value> heldTokensSequence;

	/**
	 * The cached value of the '{@link #getIncomingEdgesSequence() <em>Incoming Edges Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdgesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_incomingEdges_Value> incomingEdgesSequence;

	/**
	 * The cached value of the '{@link #getIsRunningSequence() <em>Is Running Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRunningSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_isRunning_Value> isRunningSequence;

	/**
	 * The cached value of the '{@link #getNode_ActivityNodeActivationSequence() <em>Node Activity Node Activation Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_ActivityNodeActivationSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_node_ActivityNodeActivation_Value> node_ActivityNodeActivationSequence;

	/**
	 * The cached value of the '{@link #getOutgoingEdgesSequence() <em>Outgoing Edges Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdgesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_outgoingEdges_Value> outgoingEdgesSequence;

	/**
	 * The cached value of the '{@link #getRunningSequence() <em>Running Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation_running_Value> runningSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityNodeActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.TRACED_ACTIVITY_NODE_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_group_ActivityNodeActivation_Value> getGroup_ActivityNodeActivationSequence() {
		if (group_ActivityNodeActivationSequence == null) {
			group_ActivityNodeActivationSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivation_group_ActivityNodeActivation_Value>(ActivityNodeActivation_group_ActivityNodeActivation_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_NODE_ACTIVATION_VALUE__PARENT);
		}
		return group_ActivityNodeActivationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_heldTokens_Value> getHeldTokensSequence() {
		if (heldTokensSequence == null) {
			heldTokensSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivation_heldTokens_Value>(ActivityNodeActivation_heldTokens_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_HELD_TOKENS_VALUE__PARENT);
		}
		return heldTokensSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_incomingEdges_Value> getIncomingEdgesSequence() {
		if (incomingEdgesSequence == null) {
			incomingEdgesSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivation_incomingEdges_Value>(ActivityNodeActivation_incomingEdges_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_INCOMING_EDGES_VALUE__PARENT);
		}
		return incomingEdgesSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_isRunning_Value> getIsRunningSequence() {
		if (isRunningSequence == null) {
			isRunningSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivation_isRunning_Value>(ActivityNodeActivation_isRunning_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_IS_RUNNING_VALUE__PARENT);
		}
		return isRunningSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_node_ActivityNodeActivation_Value> getNode_ActivityNodeActivationSequence() {
		if (node_ActivityNodeActivationSequence == null) {
			node_ActivityNodeActivationSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivation_node_ActivityNodeActivation_Value>(ActivityNodeActivation_node_ActivityNodeActivation_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_NODE_ACTIVITY_NODE_ACTIVATION_VALUE__PARENT);
		}
		return node_ActivityNodeActivationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_outgoingEdges_Value> getOutgoingEdgesSequence() {
		if (outgoingEdgesSequence == null) {
			outgoingEdgesSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivation_outgoingEdges_Value>(ActivityNodeActivation_outgoingEdges_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_OUTGOING_EDGES_VALUE__PARENT);
		}
		return outgoingEdgesSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation_running_Value> getRunningSequence() {
		if (runningSequence == null) {
			runningSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivation_running_Value>(ActivityNodeActivation_running_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_RUNNING_VALUE__PARENT);
		}
		return runningSequence;
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroup_ActivityNodeActivationSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeldTokensSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingEdgesSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRunningSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode_ActivityNodeActivationSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdgesSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRunningSequence()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return ((InternalEList<?>)getGroup_ActivityNodeActivationSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE:
				return ((InternalEList<?>)getHeldTokensSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE:
				return ((InternalEList<?>)getIncomingEdgesSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE:
				return ((InternalEList<?>)getIsRunningSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return ((InternalEList<?>)getNode_ActivityNodeActivationSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE:
				return ((InternalEList<?>)getOutgoingEdgesSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE:
				return ((InternalEList<?>)getRunningSequence()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return getGroup_ActivityNodeActivationSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE:
				return getHeldTokensSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE:
				return getIncomingEdgesSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE:
				return getIsRunningSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return getNode_ActivityNodeActivationSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE:
				return getOutgoingEdgesSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE:
				return getRunningSequence();
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				getGroup_ActivityNodeActivationSequence().clear();
				getGroup_ActivityNodeActivationSequence().addAll((Collection<? extends ActivityNodeActivation_group_ActivityNodeActivation_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE:
				getHeldTokensSequence().clear();
				getHeldTokensSequence().addAll((Collection<? extends ActivityNodeActivation_heldTokens_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE:
				getIncomingEdgesSequence().clear();
				getIncomingEdgesSequence().addAll((Collection<? extends ActivityNodeActivation_incomingEdges_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE:
				getIsRunningSequence().clear();
				getIsRunningSequence().addAll((Collection<? extends ActivityNodeActivation_isRunning_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				getNode_ActivityNodeActivationSequence().clear();
				getNode_ActivityNodeActivationSequence().addAll((Collection<? extends ActivityNodeActivation_node_ActivityNodeActivation_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE:
				getOutgoingEdgesSequence().clear();
				getOutgoingEdgesSequence().addAll((Collection<? extends ActivityNodeActivation_outgoingEdges_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE:
				getRunningSequence().clear();
				getRunningSequence().addAll((Collection<? extends ActivityNodeActivation_running_Value>)newValue);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				getGroup_ActivityNodeActivationSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE:
				getHeldTokensSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE:
				getIncomingEdgesSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE:
				getIsRunningSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				getNode_ActivityNodeActivationSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE:
				getOutgoingEdgesSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE:
				getRunningSequence().clear();
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return group_ActivityNodeActivationSequence != null && !group_ActivityNodeActivationSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__HELD_TOKENS_SEQUENCE:
				return heldTokensSequence != null && !heldTokensSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES_SEQUENCE:
				return incomingEdgesSequence != null && !incomingEdgesSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__IS_RUNNING_SEQUENCE:
				return isRunningSequence != null && !isRunningSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return node_ActivityNodeActivationSequence != null && !node_ActivityNodeActivationSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES_SEQUENCE:
				return outgoingEdgesSequence != null && !outgoingEdgesSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION__RUNNING_SEQUENCE:
				return runningSequence != null && !runningSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityNodeActivationImpl
