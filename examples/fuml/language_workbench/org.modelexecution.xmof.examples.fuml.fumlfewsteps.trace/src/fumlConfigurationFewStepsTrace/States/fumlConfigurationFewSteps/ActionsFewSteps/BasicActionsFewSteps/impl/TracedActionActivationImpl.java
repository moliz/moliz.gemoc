/**
 */
package fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl;

import fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value;
import fumlConfigurationFewStepsTrace.States.StatesPackage;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.impl.TracedActivityNodeActivationImpl;

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
 *   <li>{@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.impl.TracedActionActivationImpl#getFiringSequence <em>Firing Sequence</em>}</li>
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
		return BasicActionsFewStepsPackage.Literals.TRACED_ACTION_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionActivation_firing_Value> getFiringSequence() {
		if (firingSequence == null) {
			firingSequence = new EObjectContainmentWithInverseEList<ActionActivation_firing_Value>(ActionActivation_firing_Value.class, this, BasicActionsFewStepsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE, StatesPackage.ACTION_ACTIVATION_FIRING_VALUE__PARENT);
		}
		return firingSequence;
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
			case BasicActionsFewStepsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiringSequence()).basicAdd(otherEnd, msgs);
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
			case BasicActionsFewStepsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				return ((InternalEList<?>)getFiringSequence()).basicRemove(otherEnd, msgs);
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
			case BasicActionsFewStepsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				return getFiringSequence();
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
			case BasicActionsFewStepsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				getFiringSequence().clear();
				getFiringSequence().addAll((Collection<? extends ActionActivation_firing_Value>)newValue);
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
			case BasicActionsFewStepsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				getFiringSequence().clear();
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
			case BasicActionsFewStepsPackage.TRACED_ACTION_ACTIVATION__FIRING_SEQUENCE:
				return firingSequence != null && !firingSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActionActivationImpl
