/**
 */
package fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityExecution;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node Activation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationGroupImpl#getActivityExecution <em>Activity Execution</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationGroupImpl#getEdgeInstances <em>Edge Instances</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationGroupImpl#getNodeActivations <em>Node Activations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeActivationGroupImpl extends MinimalEObjectImpl.Container implements ActivityNodeActivationGroup {
	/**
	 * The cached value of the '{@link #getEdgeInstances() <em>Edge Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance> edgeInstances;

	/**
	 * The cached value of the '{@link #getNodeActivations() <em>Node Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNodeActivation> nodeActivations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeActivationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesFewStepsPackage.Literals.ACTIVITY_NODE_ACTIVATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityExecution getActivityExecution() {
		if (eContainerFeatureID() != IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION) return null;
		return (ActivityExecution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityExecution(ActivityExecution newActivityExecution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityExecution, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityExecution(ActivityExecution newActivityExecution) {
		if (newActivityExecution != eInternalContainer() || (eContainerFeatureID() != IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION && newActivityExecution != null)) {
			if (EcoreUtil.isAncestor(this, newActivityExecution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityExecution != null)
				msgs = ((InternalEObject)newActivityExecution).eInverseAdd(this, IntermediateActivitiesFewStepsPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP, ActivityExecution.class, msgs);
			msgs = basicSetActivityExecution(newActivityExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION, newActivityExecution, newActivityExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance> getEdgeInstances() {
		if (edgeInstances == null) {
			edgeInstances = new EObjectContainmentWithInverseEList<ActivityEdgeInstance>(ActivityEdgeInstance.class, this, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES, IntermediateActivitiesFewStepsPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE);
		}
		return edgeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNodeActivation> getNodeActivations() {
		if (nodeActivations == null) {
			nodeActivations = new EObjectContainmentWithInverseEList<ActivityNodeActivation>(ActivityNodeActivation.class, this, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION);
		}
		return nodeActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void activate(EList<ActivityNode> nodes, EList<ActivityEdge> edges) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOutputParameterNodeActivations(EList<EObject> outputParameterNodeActivations) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createNodeActivations(EList<ActivityNode> nodes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createEdgeInstances(EList<ActivityEdge> edges) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run(EList<ActivityNodeActivation> activations) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createNodeActivation(ActivityNode node, ActivityNodeActivation activation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getActivityExecution(ActivityExecution activityExecution) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getNodeActivation(ActivityNode node, ActivityNodeActivation activation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void runNodes(EList<ActivityNodeActivation> activations) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getInitiallyEnabledNodeActivations(EList<ActivityNodeActivation> activations, EList<ActivityNodeActivation> enabledActivations) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIncomingEdges(EList<ActivityNodeActivation> activation, EList<ActivityNodeActivation> activations, boolean return_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getSourceActivations(EList<ActivityNodeActivation> activations, ActivityEdgeInstance incomingEdge, EList<ActivityNodeActivation> sourceActivations) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void terminateAll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityExecution((ActivityExecution)otherEnd, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdgeInstances()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodeActivations()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION:
				return basicSetActivityExecution(null, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES:
				return ((InternalEList<?>)getEdgeInstances()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS:
				return ((InternalEList<?>)getNodeActivations()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesFewStepsPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP, ActivityExecution.class, msgs);
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION:
				return getActivityExecution();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES:
				return getEdgeInstances();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS:
				return getNodeActivations();
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION:
				setActivityExecution((ActivityExecution)newValue);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES:
				getEdgeInstances().clear();
				getEdgeInstances().addAll((Collection<? extends ActivityEdgeInstance>)newValue);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS:
				getNodeActivations().clear();
				getNodeActivations().addAll((Collection<? extends ActivityNodeActivation>)newValue);
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION:
				setActivityExecution((ActivityExecution)null);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES:
				getEdgeInstances().clear();
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS:
				getNodeActivations().clear();
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION:
				return getActivityExecution() != null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES:
				return edgeInstances != null && !edgeInstances.isEmpty();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS:
				return nodeActivations != null && !nodeActivations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___ACTIVATE__ELIST_ELIST:
				activate((EList<ActivityNode>)arguments.get(0), (EList<ActivityEdge>)arguments.get(1));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___GET_OUTPUT_PARAMETER_NODE_ACTIVATIONS__ELIST:
				return getOutputParameterNodeActivations((EList<EObject>)arguments.get(0));
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_NODE_ACTIVATIONS__ELIST:
				createNodeActivations((EList<ActivityNode>)arguments.get(0));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_EDGE_INSTANCES__ELIST:
				createEdgeInstances((EList<ActivityEdge>)arguments.get(0));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___RUN__ELIST:
				run((EList<ActivityNodeActivation>)arguments.get(0));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___CREATE_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION:
				createNodeActivation((ActivityNode)arguments.get(0), (ActivityNodeActivation)arguments.get(1));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___GET_ACTIVITY_EXECUTION__ACTIVITYEXECUTION:
				getActivityExecution((ActivityExecution)arguments.get(0));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___GET_NODE_ACTIVATION__ACTIVITYNODE_ACTIVITYNODEACTIVATION:
				getNodeActivation((ActivityNode)arguments.get(0), (ActivityNodeActivation)arguments.get(1));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___RUN_NODES__ELIST:
				runNodes((EList<ActivityNodeActivation>)arguments.get(0));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___GET_INITIALLY_ENABLED_NODE_ACTIVATIONS__ELIST_ELIST:
				getInitiallyEnabledNodeActivations((EList<ActivityNodeActivation>)arguments.get(0), (EList<ActivityNodeActivation>)arguments.get(1));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___CHECK_INCOMING_EDGES__ELIST_ELIST_BOOLEAN:
				checkIncomingEdges((EList<ActivityNodeActivation>)arguments.get(0), (EList<ActivityNodeActivation>)arguments.get(1), (Boolean)arguments.get(2));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___GET_SOURCE_ACTIVATIONS__ELIST_ACTIVITYEDGEINSTANCE_ELIST:
				getSourceActivations((EList<ActivityNodeActivation>)arguments.get(0), (ActivityEdgeInstance)arguments.get(1), (EList<ActivityNodeActivation>)arguments.get(2));
				return null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP___TERMINATE_ALL:
				terminateAll();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActivityNodeActivationGroupImpl
