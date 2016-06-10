/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl;

import fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.TracedExecutionImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityExecutionImpl#getActivationGroupSequence <em>Activation Group Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityExecutionImpl extends TracedExecutionImpl implements TracedActivityExecution {
	/**
	 * The cached value of the '{@link #getActivationGroupSequence() <em>Activation Group Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationGroupSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityExecution_activationGroup_Value> activationGroupSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.TRACED_ACTIVITY_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityExecution_activationGroup_Value> getActivationGroupSequence() {
		if (activationGroupSequence == null) {
			activationGroupSequence = new EObjectContainmentWithInverseEList<ActivityExecution_activationGroup_Value>(ActivityExecution_activationGroup_Value.class, this, IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE, StatesPackage.ACTIVITY_EXECUTION_ACTIVATION_GROUP_VALUE__PARENT);
		}
		return activationGroupSequence;
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivationGroupSequence()).basicAdd(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE:
				return ((InternalEList<?>)getActivationGroupSequence()).basicRemove(otherEnd, msgs);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE:
				return getActivationGroupSequence();
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE:
				getActivationGroupSequence().clear();
				getActivationGroupSequence().addAll((Collection<? extends ActivityExecution_activationGroup_Value>)newValue);
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE:
				getActivationGroupSequence().clear();
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
			case IntermediateActivitiesPackage.TRACED_ACTIVITY_EXECUTION__ACTIVATION_GROUP_SEQUENCE:
				return activationGroupSequence != null && !activationGroupSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityExecutionImpl
