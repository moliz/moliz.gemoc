/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl;

import fumlConfigurationTrace.States.ActionActivation_firing_Value;
import fumlConfigurationTrace.States.ActionActivation_pinActivations_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedActivityNodeActivationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Action Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl#getFiringSequence <em>Firing Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedActionActivationImpl#getPinActivationsSequence <em>Pin Activations Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedActionActivationImpl extends TracedActivityNodeActivationImpl implements TracedActionActivation {
	/**
	 * The cached value of the '{@link #getFiringSequence() <em>Firing Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiringSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionActivation_firing_Value> firingSequence;

	/**
	 * The cached value of the '{@link #getPinActivationsSequence() <em>Pin Activations Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinActivationsSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionActivation_pinActivations_Value> pinActivationsSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActionActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActionsPackage.Literals.TRACED_ACTION_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionActivation_firing_Value> getFiringSequence() {
		if (firingSequence == null) {
			firingSequence = new EObjectContainmentWithInverseEList<ActionActivation_firing_Value>(ActionActivation_firing_Value.class, this, BasicActionsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE, StatesPackage.ACTION_ACTIVATION_FIRING_VALUE__PARENT);
		}
		return firingSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionActivation_pinActivations_Value> getPinActivationsSequence() {
		if (pinActivationsSequence == null) {
			pinActivationsSequence = new EObjectContainmentWithInverseEList<ActionActivation_pinActivations_Value>(ActionActivation_pinActivations_Value.class, this, BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE, StatesPackage.ACTION_ACTIVATION_PIN_ACTIVATIONS_VALUE__PARENT);
		}
		return pinActivationsSequence;
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
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiringSequence()).basicAdd(otherEnd, msgs);
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPinActivationsSequence()).basicAdd(otherEnd, msgs);
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
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				return ((InternalEList<?>)getFiringSequence()).basicRemove(otherEnd, msgs);
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE:
				return ((InternalEList<?>)getPinActivationsSequence()).basicRemove(otherEnd, msgs);
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
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				return getFiringSequence();
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE:
				return getPinActivationsSequence();
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
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				getFiringSequence().clear();
				getFiringSequence().addAll((Collection<? extends ActionActivation_firing_Value>)newValue);
				return;
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE:
				getPinActivationsSequence().clear();
				getPinActivationsSequence().addAll((Collection<? extends ActionActivation_pinActivations_Value>)newValue);
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
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				getFiringSequence().clear();
				return;
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE:
				getPinActivationsSequence().clear();
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
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				return firingSequence != null && !firingSequence.isEmpty();
			case BasicActionsPackage.TRACED_ACTION_ACTIVATION__PIN_ACTIVATIONS_SEQUENCE:
				return pinActivationsSequence != null && !pinActivationsSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActionActivationImpl
