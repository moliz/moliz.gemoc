/**
 */
package fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityEdgeInstance;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityExecution;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivationGroup;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.IntermediateActivitiesFewStepsPackage;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.Token;

import fumlConfigurationFewSteps.LociFewSteps.Locus;

import fumlConfigurationFewSteps.LociFewSteps.impl.SemanticVisitorImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationImpl#getGroup_ActivityNodeActivation <em>Group Activity Node Activation</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationImpl#getNode_ActivityNodeActivation <em>Node Activity Node Activation</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationImpl#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationImpl#isIsRunning <em>Is Running</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.ActivityNodeActivationImpl#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeActivationImpl extends SemanticVisitorImpl implements ActivityNodeActivation {
	/**
	 * The cached value of the '{@link #getNode_ActivityNodeActivation() <em>Node Activity Node Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_ActivityNodeActivation()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode node_ActivityNodeActivation;

	/**
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingEdges() <em>Incoming Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance> incomingEdges;

	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance> outgoingEdges;

	/**
	 * The default value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean isRunning = IS_RUNNING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeldTokens() <em>Held Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> heldTokens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesFewStepsPackage.Literals.ACTIVITY_NODE_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivationGroup getGroup_ActivityNodeActivation() {
		if (eContainerFeatureID() != IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION) return null;
		return (ActivityNodeActivationGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup_ActivityNodeActivation(ActivityNodeActivationGroup newGroup_ActivityNodeActivation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup_ActivityNodeActivation, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup_ActivityNodeActivation(ActivityNodeActivationGroup newGroup_ActivityNodeActivation) {
		if (newGroup_ActivityNodeActivation != eInternalContainer() || (eContainerFeatureID() != IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION && newGroup_ActivityNodeActivation != null)) {
			if (EcoreUtil.isAncestor(this, newGroup_ActivityNodeActivation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup_ActivityNodeActivation != null)
				msgs = ((InternalEObject)newGroup_ActivityNodeActivation).eInverseAdd(this, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS, ActivityNodeActivationGroup.class, msgs);
			msgs = basicSetGroup_ActivityNodeActivation(newGroup_ActivityNodeActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION, newGroup_ActivityNodeActivation, newGroup_ActivityNodeActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode_ActivityNodeActivation() {
		if (node_ActivityNodeActivation != null && node_ActivityNodeActivation.eIsProxy()) {
			InternalEObject oldNode_ActivityNodeActivation = (InternalEObject)node_ActivityNodeActivation;
			node_ActivityNodeActivation = (ActivityNode)eResolveProxy(oldNode_ActivityNodeActivation);
			if (node_ActivityNodeActivation != oldNode_ActivityNodeActivation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION, oldNode_ActivityNodeActivation, node_ActivityNodeActivation));
			}
		}
		return node_ActivityNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetNode_ActivityNodeActivation() {
		return node_ActivityNodeActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode_ActivityNodeActivation(ActivityNode newNode_ActivityNodeActivation) {
		ActivityNode oldNode_ActivityNodeActivation = node_ActivityNodeActivation;
		node_ActivityNodeActivation = newNode_ActivityNodeActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION, oldNode_ActivityNodeActivation, node_ActivityNodeActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning) {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance> getIncomingEdges() {
		if (incomingEdges == null) {
			incomingEdges = new EObjectWithInverseResolvingEList<ActivityEdgeInstance>(ActivityEdgeInstance.class, this, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES, IntermediateActivitiesFewStepsPackage.ACTIVITY_EDGE_INSTANCE__TARGET);
		}
		return incomingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance> getOutgoingEdges() {
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectWithInverseResolvingEList<ActivityEdgeInstance>(ActivityEdgeInstance.class, this, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES, IntermediateActivitiesFewStepsPackage.ACTIVITY_EDGE_INSTANCE__SOURCE);
		}
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRunning() {
		return isRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRunning(boolean newIsRunning) {
		boolean oldIsRunning = isRunning;
		isRunning = newIsRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__IS_RUNNING, oldIsRunning, isRunning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getHeldTokens() {
		if (heldTokens == null) {
			heldTokens = new EObjectContainmentWithInverseEList<Token>(Token.class, this, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__HELD_TOKENS, IntermediateActivitiesFewStepsPackage.TOKEN__HOLDER);
		}
		return heldTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getTokens(EList<Token> tokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createNodeActivations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createEdgeInstances() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveOffer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isReady(boolean isReady) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void takeOfferedTokens(EList<Token> tokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fire(EList<Token> incomingTokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isRunning(boolean isRunning) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void hasOffers(boolean hasOffers) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeToken(Token token, int position) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTokens(EList<Token> tokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendOffers(EList<Token> tokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addToken(Token token) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isSourceFor(boolean isSourceFor, ActivityEdgeInstance edgeInstance) {
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
	public void terminate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearTokens() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getExecutionLocus(Locus locus) {
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
	public void getExecutionContext(fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object context) {
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup_ActivityNodeActivation((ActivityNodeActivationGroup)otherEnd, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingEdges()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdges()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__HELD_TOKENS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeldTokens()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION:
				return basicSetGroup_ActivityNodeActivation(null, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES:
				return ((InternalEList<?>)getIncomingEdges()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES:
				return ((InternalEList<?>)getOutgoingEdges()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__HELD_TOKENS:
				return ((InternalEList<?>)getHeldTokens()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION_GROUP__NODE_ACTIVATIONS, ActivityNodeActivationGroup.class, msgs);
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION:
				return getGroup_ActivityNodeActivation();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION:
				if (resolve) return getNode_ActivityNodeActivation();
				return basicGetNode_ActivityNodeActivation();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__RUNNING:
				return isRunning();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES:
				return getIncomingEdges();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES:
				return getOutgoingEdges();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__IS_RUNNING:
				return isIsRunning();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__HELD_TOKENS:
				return getHeldTokens();
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION:
				setGroup_ActivityNodeActivation((ActivityNodeActivationGroup)newValue);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION:
				setNode_ActivityNodeActivation((ActivityNode)newValue);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES:
				getIncomingEdges().clear();
				getIncomingEdges().addAll((Collection<? extends ActivityEdgeInstance>)newValue);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends ActivityEdgeInstance>)newValue);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__IS_RUNNING:
				setIsRunning((Boolean)newValue);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__HELD_TOKENS:
				getHeldTokens().clear();
				getHeldTokens().addAll((Collection<? extends Token>)newValue);
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION:
				setGroup_ActivityNodeActivation((ActivityNodeActivationGroup)null);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION:
				setNode_ActivityNodeActivation((ActivityNode)null);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES:
				getIncomingEdges().clear();
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__IS_RUNNING:
				setIsRunning(IS_RUNNING_EDEFAULT);
				return;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__HELD_TOKENS:
				getHeldTokens().clear();
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
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__GROUP_ACTIVITY_NODE_ACTIVATION:
				return getGroup_ActivityNodeActivation() != null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__NODE_ACTIVITY_NODE_ACTIVATION:
				return node_ActivityNodeActivation != null;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__RUNNING:
				return running != RUNNING_EDEFAULT;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES:
				return incomingEdges != null && !incomingEdges.isEmpty();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__IS_RUNNING:
				return isRunning != IS_RUNNING_EDEFAULT;
			case IntermediateActivitiesFewStepsPackage.ACTIVITY_NODE_ACTIVATION__HELD_TOKENS:
				return heldTokens != null && !heldTokens.isEmpty();
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
		result.append(" (running: ");
		result.append(running);
		result.append(", isRunning: ");
		result.append(isRunning);
		result.append(')');
		return result.toString();
	}

} //ActivityNodeActivationImpl
