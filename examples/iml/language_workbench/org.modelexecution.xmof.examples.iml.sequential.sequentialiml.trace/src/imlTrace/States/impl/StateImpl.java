/**
 */
package imlTrace.States.impl;

import imlTrace.States.Activity_current_Value;
import imlTrace.States.ConnectionPoint_firing_Value;
import imlTrace.States.State;
import imlTrace.States.State_current_Value;
import imlTrace.States.StatesPackage;
import imlTrace.States.Variable_value_Value;

import imlTrace.Steps.SpecificStep;
import imlTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imlTrace.States.impl.StateImpl#getActivity_current_Values <em>Activity current Values</em>}</li>
 *   <li>{@link imlTrace.States.impl.StateImpl#getConnectionPoint_firing_Values <em>Connection Point firing Values</em>}</li>
 *   <li>{@link imlTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link imlTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link imlTrace.States.impl.StateImpl#getState_current_Values <em>State current Values</em>}</li>
 *   <li>{@link imlTrace.States.impl.StateImpl#getVariable_value_Values <em>Variable value Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getActivity_current_Values() <em>Activity current Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_current_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_current_Value> activity_current_Values;

	/**
	 * The cached value of the '{@link #getConnectionPoint_firing_Values() <em>Connection Point firing Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoint_firing_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPoint_firing_Value> connectionPoint_firing_Values;

	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * The cached value of the '{@link #getState_current_Values() <em>State current Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_current_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<State_current_Value> state_current_Values;

	/**
	 * The cached value of the '{@link #getVariable_value_Values() <em>Variable value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_value_Value> variable_value_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_current_Value> getActivity_current_Values() {
		if (activity_current_Values == null) {
			activity_current_Values = new EObjectWithInverseResolvingEList.ManyInverse<Activity_current_Value>(Activity_current_Value.class, this, StatesPackage.STATE__ACTIVITY_CURRENT_VALUES, StatesPackage.ACTIVITY_CURRENT_VALUE__STATES);
		}
		return activity_current_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint_firing_Value> getConnectionPoint_firing_Values() {
		if (connectionPoint_firing_Values == null) {
			connectionPoint_firing_Values = new EObjectWithInverseResolvingEList.ManyInverse<ConnectionPoint_firing_Value>(ConnectionPoint_firing_Value.class, this, StatesPackage.STATE__CONNECTION_POINT_FIRING_VALUES, StatesPackage.CONNECTION_POINT_FIRING_VALUE__STATES);
		}
		return connectionPoint_firing_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State_current_Value> getState_current_Values() {
		if (state_current_Values == null) {
			state_current_Values = new EObjectWithInverseResolvingEList.ManyInverse<State_current_Value>(State_current_Value.class, this, StatesPackage.STATE__STATE_CURRENT_VALUES, StatesPackage.STATE_CURRENT_VALUE__STATES);
		}
		return state_current_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_value_Value> getVariable_value_Values() {
		if (variable_value_Values == null) {
			variable_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<Variable_value_Value>(Variable_value_Value.class, this, StatesPackage.STATE__VARIABLE_VALUE_VALUES, StatesPackage.VARIABLE_VALUE_VALUE__STATES);
		}
		return variable_value_Values;
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
			case StatesPackage.STATE__ACTIVITY_CURRENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity_current_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__CONNECTION_POINT_FIRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectionPoint_firing_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STATE_CURRENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getState_current_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable_value_Values()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.STATE__ACTIVITY_CURRENT_VALUES:
				return ((InternalEList<?>)getActivity_current_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__CONNECTION_POINT_FIRING_VALUES:
				return ((InternalEList<?>)getConnectionPoint_firing_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STATE_CURRENT_VALUES:
				return ((InternalEList<?>)getState_current_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				return ((InternalEList<?>)getVariable_value_Values()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__ACTIVITY_CURRENT_VALUES:
				return getActivity_current_Values();
			case StatesPackage.STATE__CONNECTION_POINT_FIRING_VALUES:
				return getConnectionPoint_firing_Values();
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
			case StatesPackage.STATE__STATE_CURRENT_VALUES:
				return getState_current_Values();
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				return getVariable_value_Values();
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
			case StatesPackage.STATE__ACTIVITY_CURRENT_VALUES:
				getActivity_current_Values().clear();
				getActivity_current_Values().addAll((Collection<? extends Activity_current_Value>)newValue);
				return;
			case StatesPackage.STATE__CONNECTION_POINT_FIRING_VALUES:
				getConnectionPoint_firing_Values().clear();
				getConnectionPoint_firing_Values().addAll((Collection<? extends ConnectionPoint_firing_Value>)newValue);
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__STATE_CURRENT_VALUES:
				getState_current_Values().clear();
				getState_current_Values().addAll((Collection<? extends State_current_Value>)newValue);
				return;
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				getVariable_value_Values().clear();
				getVariable_value_Values().addAll((Collection<? extends Variable_value_Value>)newValue);
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
			case StatesPackage.STATE__ACTIVITY_CURRENT_VALUES:
				getActivity_current_Values().clear();
				return;
			case StatesPackage.STATE__CONNECTION_POINT_FIRING_VALUES:
				getConnectionPoint_firing_Values().clear();
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				return;
			case StatesPackage.STATE__STATE_CURRENT_VALUES:
				getState_current_Values().clear();
				return;
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				getVariable_value_Values().clear();
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
			case StatesPackage.STATE__ACTIVITY_CURRENT_VALUES:
				return activity_current_Values != null && !activity_current_Values.isEmpty();
			case StatesPackage.STATE__CONNECTION_POINT_FIRING_VALUES:
				return connectionPoint_firing_Values != null && !connectionPoint_firing_Values.isEmpty();
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
			case StatesPackage.STATE__STATE_CURRENT_VALUES:
				return state_current_Values != null && !state_current_Values.isEmpty();
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				return variable_value_Values != null && !variable_value_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
