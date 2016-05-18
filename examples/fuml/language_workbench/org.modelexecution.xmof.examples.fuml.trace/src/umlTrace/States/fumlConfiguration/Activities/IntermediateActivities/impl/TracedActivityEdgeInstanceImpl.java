/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value;
import umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value;
import umlTrace.States.ActivityEdgeInstance_offers_Value;
import umlTrace.States.ActivityEdgeInstance_source_Value;
import umlTrace.States.ActivityEdgeInstance_target_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl#getEdge_ActivityEdgeInstanceSequence <em>Edge Activity Edge Instance Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl#getGroup_ActivityEdgeInstanceSequence <em>Group Activity Edge Instance Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl#getOffersSequence <em>Offers Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl#getSourceSequence <em>Source Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityEdgeInstanceImpl#getTargetSequence <em>Target Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityEdgeInstanceImpl extends MinimalEObjectImpl.Container implements TracedActivityEdgeInstance {
	/**
	 * The cached value of the '{@link #getEdge_ActivityEdgeInstanceSequence() <em>Edge Activity Edge Instance Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge_ActivityEdgeInstanceSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_edge_ActivityEdgeInstance_Value> edge_ActivityEdgeInstanceSequence;

	/**
	 * The cached value of the '{@link #getGroup_ActivityEdgeInstanceSequence() <em>Group Activity Edge Instance Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup_ActivityEdgeInstanceSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_group_ActivityEdgeInstance_Value> group_ActivityEdgeInstanceSequence;

	/**
	 * The cached value of the '{@link #getOffersSequence() <em>Offers Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffersSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_offers_Value> offersSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdgeInstance originalObject;

	/**
	 * The cached value of the '{@link #getSourceSequence() <em>Source Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_source_Value> sourceSequence;

	/**
	 * The cached value of the '{@link #getTargetSequence() <em>Target Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdgeInstance_target_Value> targetSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityEdgeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.TRACED_ACTIVITY_EDGE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_edge_ActivityEdgeInstance_Value> getEdge_ActivityEdgeInstanceSequence() {
		if (edge_ActivityEdgeInstanceSequence == null) {
			edge_ActivityEdgeInstanceSequence = new EObjectContainmentWithInverseEList<ActivityEdgeInstance_edge_ActivityEdgeInstance_Value>(ActivityEdgeInstance_edge_ActivityEdgeInstance_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE, StatesPackage.ACTIVITY_EDGE_INSTANCE_EDGE_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT);
		}
		return edge_ActivityEdgeInstanceSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_group_ActivityEdgeInstance_Value> getGroup_ActivityEdgeInstanceSequence() {
		if (group_ActivityEdgeInstanceSequence == null) {
			group_ActivityEdgeInstanceSequence = new EObjectContainmentWithInverseEList<ActivityEdgeInstance_group_ActivityEdgeInstance_Value>(ActivityEdgeInstance_group_ActivityEdgeInstance_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE, StatesPackage.ACTIVITY_EDGE_INSTANCE_GROUP_ACTIVITY_EDGE_INSTANCE_VALUE__PARENT);
		}
		return group_ActivityEdgeInstanceSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_offers_Value> getOffersSequence() {
		if (offersSequence == null) {
			offersSequence = new EObjectContainmentWithInverseEList<ActivityEdgeInstance_offers_Value>(ActivityEdgeInstance_offers_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE, StatesPackage.ACTIVITY_EDGE_INSTANCE_OFFERS_VALUE__PARENT);
		}
		return offersSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeInstance getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (ActivityEdgeInstance)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeInstance basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(ActivityEdgeInstance newOriginalObject) {
		ActivityEdgeInstance oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_source_Value> getSourceSequence() {
		if (sourceSequence == null) {
			sourceSequence = new EObjectContainmentWithInverseEList<ActivityEdgeInstance_source_Value>(ActivityEdgeInstance_source_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE, StatesPackage.ACTIVITY_EDGE_INSTANCE_SOURCE_VALUE__PARENT);
		}
		return sourceSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdgeInstance_target_Value> getTargetSequence() {
		if (targetSequence == null) {
			targetSequence = new EObjectContainmentWithInverseEList<ActivityEdgeInstance_target_Value>(ActivityEdgeInstance_target_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE, StatesPackage.ACTIVITY_EDGE_INSTANCE_TARGET_VALUE__PARENT);
		}
		return targetSequence;
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge_ActivityEdgeInstanceSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroup_ActivityEdgeInstanceSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffersSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceSequence()).basicAdd(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetSequence()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return ((InternalEList<?>)getEdge_ActivityEdgeInstanceSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return ((InternalEList<?>)getGroup_ActivityEdgeInstanceSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE:
				return ((InternalEList<?>)getOffersSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE:
				return ((InternalEList<?>)getSourceSequence()).basicRemove(otherEnd, msgs);
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE:
				return ((InternalEList<?>)getTargetSequence()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return getEdge_ActivityEdgeInstanceSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return getGroup_ActivityEdgeInstanceSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE:
				return getOffersSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE:
				return getSourceSequence();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE:
				return getTargetSequence();
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				getEdge_ActivityEdgeInstanceSequence().clear();
				getEdge_ActivityEdgeInstanceSequence().addAll((Collection<? extends ActivityEdgeInstance_edge_ActivityEdgeInstance_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				getGroup_ActivityEdgeInstanceSequence().clear();
				getGroup_ActivityEdgeInstanceSequence().addAll((Collection<? extends ActivityEdgeInstance_group_ActivityEdgeInstance_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE:
				getOffersSequence().clear();
				getOffersSequence().addAll((Collection<? extends ActivityEdgeInstance_offers_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT:
				setOriginalObject((ActivityEdgeInstance)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE:
				getSourceSequence().clear();
				getSourceSequence().addAll((Collection<? extends ActivityEdgeInstance_source_Value>)newValue);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE:
				getTargetSequence().clear();
				getTargetSequence().addAll((Collection<? extends ActivityEdgeInstance_target_Value>)newValue);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				getEdge_ActivityEdgeInstanceSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				getGroup_ActivityEdgeInstanceSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE:
				getOffersSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT:
				setOriginalObject((ActivityEdgeInstance)null);
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE:
				getSourceSequence().clear();
				return;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE:
				getTargetSequence().clear();
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__EDGE_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return edge_ActivityEdgeInstanceSequence != null && !edge_ActivityEdgeInstanceSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__GROUP_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return group_ActivityEdgeInstanceSequence != null && !group_ActivityEdgeInstanceSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__OFFERS_SEQUENCE:
				return offersSequence != null && !offersSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__ORIGINAL_OBJECT:
				return originalObject != null;
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__SOURCE_SEQUENCE:
				return sourceSequence != null && !sourceSequence.isEmpty();
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EDGE_INSTANCE__TARGET_SEQUENCE:
				return targetSequence != null && !targetSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityEdgeInstanceImpl
