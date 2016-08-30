/**
 */
package fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance;
import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation;
import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup;
import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfiguration.Activities.IntermediateActivities.Offer;
import fumlConfiguration.Activities.IntermediateActivities.Token;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.ActivityEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl#getGroup_ActivityEdgeInstance <em>Group Activity Edge Instance</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl#getEdge_ActivityEdgeInstance <em>Edge Activity Edge Instance</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityEdgeInstanceImpl#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityEdgeInstanceImpl extends MinimalEObjectImpl.Container implements ActivityEdgeInstance {
	/**
	 * The cached value of the '{@link #getEdge_ActivityEdgeInstance() <em>Edge Activity Edge Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge_ActivityEdgeInstance()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdge edge_ActivityEdgeInstance;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNodeActivation source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNodeActivation target;

	/**
	 * The cached value of the '{@link #getOffers() <em>Offers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer> offers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.ACTIVITY_EDGE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivationGroup getGroup_ActivityEdgeInstance() {
		if (eContainerFeatureID() != IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE) return null;
		return (ActivityNodeActivationGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup_ActivityEdgeInstance(ActivityNodeActivationGroup newGroup_ActivityEdgeInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup_ActivityEdgeInstance, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup_ActivityEdgeInstance(ActivityNodeActivationGroup newGroup_ActivityEdgeInstance) {
		if (newGroup_ActivityEdgeInstance != eInternalContainer() || (eContainerFeatureID() != IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE && newGroup_ActivityEdgeInstance != null)) {
			if (EcoreUtil.isAncestor(this, newGroup_ActivityEdgeInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup_ActivityEdgeInstance != null)
				msgs = ((InternalEObject)newGroup_ActivityEdgeInstance).eInverseAdd(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES, ActivityNodeActivationGroup.class, msgs);
			msgs = basicSetGroup_ActivityEdgeInstance(newGroup_ActivityEdgeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE, newGroup_ActivityEdgeInstance, newGroup_ActivityEdgeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge_ActivityEdgeInstance() {
		if (edge_ActivityEdgeInstance != null && edge_ActivityEdgeInstance.eIsProxy()) {
			InternalEObject oldEdge_ActivityEdgeInstance = (InternalEObject)edge_ActivityEdgeInstance;
			edge_ActivityEdgeInstance = (ActivityEdge)eResolveProxy(oldEdge_ActivityEdgeInstance);
			if (edge_ActivityEdgeInstance != oldEdge_ActivityEdgeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE, oldEdge_ActivityEdgeInstance, edge_ActivityEdgeInstance));
			}
		}
		return edge_ActivityEdgeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge basicGetEdge_ActivityEdgeInstance() {
		return edge_ActivityEdgeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge_ActivityEdgeInstance(ActivityEdge newEdge_ActivityEdgeInstance) {
		ActivityEdge oldEdge_ActivityEdgeInstance = edge_ActivityEdgeInstance;
		edge_ActivityEdgeInstance = newEdge_ActivityEdgeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE, oldEdge_ActivityEdgeInstance, edge_ActivityEdgeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNodeActivation)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ActivityNodeActivation newSource, NotificationChain msgs) {
		ActivityNodeActivation oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ActivityNodeActivation newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES, ActivityNodeActivation.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES, ActivityNodeActivation.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNodeActivation)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivation basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ActivityNodeActivation newTarget, NotificationChain msgs) {
		ActivityNodeActivation oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ActivityNodeActivation newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES, ActivityNodeActivation.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES, ActivityNodeActivation.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offer> getOffers() {
		if (offers == null) {
			offers = new EObjectResolvingEList<Offer>(Offer.class, this, IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__OFFERS);
		}
		return offers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void hasOffer(boolean hasOffer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void takeOfferedTokens(EList<Token> offeredTokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void countOfferedValues(int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void takeOfferedTokens(EList<Token> offeredTokens, int maxCount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendOffer(EList<Token> tokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup_ActivityEdgeInstance((ActivityNodeActivationGroup)otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__OUTGOING_EDGES, ActivityNodeActivation.class, msgs);
				return basicSetSource((ActivityNodeActivation)otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION__INCOMING_EDGES, ActivityNodeActivation.class, msgs);
				return basicSetTarget((ActivityNodeActivation)otherEnd, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE:
				return basicSetGroup_ActivityEdgeInstance(null, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE:
				return basicSetSource(null, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET:
				return basicSetTarget(null, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_GROUP__EDGE_INSTANCES, ActivityNodeActivationGroup.class, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE:
				return getGroup_ActivityEdgeInstance();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE:
				if (resolve) return getEdge_ActivityEdgeInstance();
				return basicGetEdge_ActivityEdgeInstance();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__OFFERS:
				return getOffers();
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE:
				setGroup_ActivityEdgeInstance((ActivityNodeActivationGroup)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE:
				setEdge_ActivityEdgeInstance((ActivityEdge)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE:
				setSource((ActivityNodeActivation)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET:
				setTarget((ActivityNodeActivation)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__OFFERS:
				getOffers().clear();
				getOffers().addAll((Collection<? extends Offer>)newValue);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE:
				setGroup_ActivityEdgeInstance((ActivityNodeActivationGroup)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE:
				setEdge_ActivityEdgeInstance((ActivityEdge)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE:
				setSource((ActivityNodeActivation)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET:
				setTarget((ActivityNodeActivation)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__OFFERS:
				getOffers().clear();
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE:
				return getGroup_ActivityEdgeInstance() != null;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE:
				return edge_ActivityEdgeInstance != null;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__SOURCE:
				return source != null;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__TARGET:
				return target != null;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE_INSTANCE__OFFERS:
				return offers != null && !offers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityEdgeInstanceImpl
