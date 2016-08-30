/**
 */
package fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfiguration.Activities.IntermediateActivities.ActivityExecution;
import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup;
import fumlConfiguration.Activities.IntermediateActivities.ActivityParameterNodeActivation;
import fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.ExecutionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Activities.IntermediateActivities.impl.ActivityExecutionImpl#getActivationGroup <em>Activation Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityExecutionImpl extends ExecutionImpl implements ActivityExecution {
	/**
	 * The cached value of the '{@link #getActivationGroup() <em>Activation Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationGroup()
	 * @generated
	 * @ordered
	 */
	protected ActivityNodeActivationGroup activationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.ACTIVITY_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivationGroup getActivationGroup() {
		return activationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationGroup(ActivityNodeActivationGroup newActivationGroup, NotificationChain msgs) {
		ActivityNodeActivationGroup oldActivationGroup = activationGroup;
		activationGroup = newActivationGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP, oldActivationGroup, newActivationGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationGroup(ActivityNodeActivationGroup newActivationGroup) {
		if (newActivationGroup != activationGroup) {
			NotificationChain msgs = null;
			if (activationGroup != null)
				msgs = ((InternalEObject)activationGroup).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION, ActivityNodeActivationGroup.class, msgs);
			if (newActivationGroup != null)
				msgs = ((InternalEObject)newActivationGroup).eInverseAdd(this, IntermediateActivitiesPackage.ACTIVITY_NODE_ACTIVATION_GROUP__ACTIVITY_EXECUTION, ActivityNodeActivationGroup.class, msgs);
			msgs = basicSetActivationGroup(newActivationGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP, newActivationGroup, newActivationGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void collectOutputParameterValues() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterValueValues(ParameterValue parameterValue, ActivityParameterNodeActivation outputActivation) {
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
			case IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP:
				if (activationGroup != null)
					msgs = ((InternalEObject)activationGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP, null, msgs);
				return basicSetActivationGroup((ActivityNodeActivationGroup)otherEnd, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP:
				return basicSetActivationGroup(null, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP:
				return getActivationGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP:
				setActivationGroup((ActivityNodeActivationGroup)newValue);
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
			case IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP:
				setActivationGroup((ActivityNodeActivationGroup)null);
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
			case IntermediateActivitiesPackage.ACTIVITY_EXECUTION__ACTIVATION_GROUP:
				return activationGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityExecutionImpl
