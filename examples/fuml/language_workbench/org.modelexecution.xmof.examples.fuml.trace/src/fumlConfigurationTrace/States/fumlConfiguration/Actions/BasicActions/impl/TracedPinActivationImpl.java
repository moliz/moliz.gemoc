/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl;

import fumlConfigurationTrace.States.PinActivation_actionActivation_Value;
import fumlConfigurationTrace.States.PinActivation_count_temp_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.TracedObjectNodeActivationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl#getActionActivationSequence <em>Action Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.TracedPinActivationImpl#getCount_tempSequence <em>Count temp Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedPinActivationImpl extends TracedObjectNodeActivationImpl implements TracedPinActivation {
	/**
	 * The cached value of the '{@link #getActionActivationSequence() <em>Action Activation Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionActivationSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PinActivation_actionActivation_Value> actionActivationSequence;

	/**
	 * The cached value of the '{@link #getCount_tempSequence() <em>Count temp Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount_tempSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PinActivation_count_temp_Value> count_tempSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedPinActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActionsPackage.Literals.TRACED_PIN_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinActivation_actionActivation_Value> getActionActivationSequence() {
		if (actionActivationSequence == null) {
			actionActivationSequence = new EObjectContainmentWithInverseEList<PinActivation_actionActivation_Value>(PinActivation_actionActivation_Value.class, this, BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE, StatesPackage.PIN_ACTIVATION_ACTION_ACTIVATION_VALUE__PARENT);
		}
		return actionActivationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinActivation_count_temp_Value> getCount_tempSequence() {
		if (count_tempSequence == null) {
			count_tempSequence = new EObjectContainmentWithInverseEList<PinActivation_count_temp_Value>(PinActivation_count_temp_Value.class, this, BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE, StatesPackage.PIN_ACTIVATION_COUNT_TEMP_VALUE__PARENT);
		}
		return count_tempSequence;
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
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActionActivationSequence()).basicAdd(otherEnd, msgs);
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCount_tempSequence()).basicAdd(otherEnd, msgs);
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
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE:
				return ((InternalEList<?>)getActionActivationSequence()).basicRemove(otherEnd, msgs);
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE:
				return ((InternalEList<?>)getCount_tempSequence()).basicRemove(otherEnd, msgs);
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
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE:
				return getActionActivationSequence();
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE:
				return getCount_tempSequence();
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
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE:
				getActionActivationSequence().clear();
				getActionActivationSequence().addAll((Collection<? extends PinActivation_actionActivation_Value>)newValue);
				return;
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE:
				getCount_tempSequence().clear();
				getCount_tempSequence().addAll((Collection<? extends PinActivation_count_temp_Value>)newValue);
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
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE:
				getActionActivationSequence().clear();
				return;
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE:
				getCount_tempSequence().clear();
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
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__ACTION_ACTIVATION_SEQUENCE:
				return actionActivationSequence != null && !actionActivationSequence.isEmpty();
			case BasicActionsPackage.TRACED_PIN_ACTIVATION__COUNT_TEMP_SEQUENCE:
				return count_tempSequence != null && !count_tempSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedPinActivationImpl
