/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value;
import umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value;
import umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Node Activation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationGroupImpl#getActivityExecutionSequence <em>Activity Execution Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationGroupImpl#getEdgeInstancesSequence <em>Edge Instances Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationGroupImpl#getNodeActivationsSequence <em>Node Activations Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityNodeActivationGroupImpl extends MinimalEObjectImpl.Container implements TracedActivityNodeActivationGroup {
	/**
	 * The cached value of the '{@link #getActivityExecutionSequence() <em>Activity Execution Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityExecutionSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivationGroup_activityExecution_Value> activityExecutionSequence;

	/**
	 * The cached value of the '{@link #getEdgeInstancesSequence() <em>Edge Instances Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeInstancesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivationGroup_edgeInstances_Value> edgeInstancesSequence;

	/**
	 * The cached value of the '{@link #getNodeActivationsSequence() <em>Node Activations Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeActivationsSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivationGroup_nodeActivations_Value> nodeActivationsSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityNodeActivationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivationGroup_activityExecution_Value> getActivityExecutionSequence() {
		if (activityExecutionSequence == null) {
			activityExecutionSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivationGroup_activityExecution_Value>(ActivityNodeActivationGroup_activityExecution_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVITY_EXECUTION_VALUE__PARENT);
		}
		return activityExecutionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivationGroup_edgeInstances_Value> getEdgeInstancesSequence() {
		if (edgeInstancesSequence == null) {
			edgeInstancesSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivationGroup_edgeInstances_Value>(ActivityNodeActivationGroup_edgeInstances_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_EDGE_INSTANCES_VALUE__PARENT);
		}
		return edgeInstancesSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivationGroup_nodeActivations_Value> getNodeActivationsSequence() {
		if (nodeActivationsSequence == null) {
			nodeActivationsSequence = new EObjectContainmentWithInverseEList<ActivityNodeActivationGroup_nodeActivations_Value>(ActivityNodeActivationGroup_nodeActivations_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVATION_GROUP_NODE_ACTIVATIONS_VALUE__PARENT);
		}
		return nodeActivationsSequence;
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityExecutionSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdgeInstancesSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodeActivationsSequence()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE:
				return ((InternalEList<?>)getActivityExecutionSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE:
				return ((InternalEList<?>)getEdgeInstancesSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE:
				return ((InternalEList<?>)getNodeActivationsSequence()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE:
				return getActivityExecutionSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE:
				return getEdgeInstancesSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE:
				return getNodeActivationsSequence();
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE:
				getActivityExecutionSequence().clear();
				getActivityExecutionSequence().addAll((Collection<? extends ActivityNodeActivationGroup_activityExecution_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE:
				getEdgeInstancesSequence().clear();
				getEdgeInstancesSequence().addAll((Collection<? extends ActivityNodeActivationGroup_edgeInstances_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE:
				getNodeActivationsSequence().clear();
				getNodeActivationsSequence().addAll((Collection<? extends ActivityNodeActivationGroup_nodeActivations_Value>)newValue);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE:
				getActivityExecutionSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE:
				getEdgeInstancesSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE:
				getNodeActivationsSequence().clear();
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION_SEQUENCE:
				return activityExecutionSequence != null && !activityExecutionSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES_SEQUENCE:
				return edgeInstancesSequence != null && !edgeInstancesSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS_SEQUENCE:
				return nodeActivationsSequence != null && !nodeActivationsSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityNodeActivationGroupImpl
