/**
 */
package fumlConfigurationFewStepsTrace.States.impl;

import fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value;
import fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value;
import fumlConfigurationFewStepsTrace.States.State;
import fumlConfigurationFewStepsTrace.States.StatesPackage;

import fumlConfigurationFewStepsTrace.Steps.SpecificStep;
import fumlConfigurationFewStepsTrace.Steps.StepsPackage;

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
 *   <li>{@link fumlConfigurationFewStepsTrace.States.impl.StateImpl#getActionActivation_firing_Values <em>Action Activation firing Values</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.impl.StateImpl#getSemanticVisitor_runtimeModelElement_Values <em>Semantic Visitor runtime Model Element Values</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getActionActivation_firing_Values() <em>Action Activation firing Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionActivation_firing_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionActivation_firing_Value> actionActivation_firing_Values;

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
	 * The cached value of the '{@link #getSemanticVisitor_runtimeModelElement_Values() <em>Semantic Visitor runtime Model Element Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticVisitor_runtimeModelElement_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticVisitor_runtimeModelElement_Value> semanticVisitor_runtimeModelElement_Values;

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
	public EList<ActionActivation_firing_Value> getActionActivation_firing_Values() {
		if (actionActivation_firing_Values == null) {
			actionActivation_firing_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActionActivation_firing_Value>(ActionActivation_firing_Value.class, this, StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES, StatesPackage.ACTION_ACTIVATION_FIRING_VALUE__STATES);
		}
		return actionActivation_firing_Values;
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
	public EList<SemanticVisitor_runtimeModelElement_Value> getSemanticVisitor_runtimeModelElement_Values() {
		if (semanticVisitor_runtimeModelElement_Values == null) {
			semanticVisitor_runtimeModelElement_Values = new EObjectWithInverseResolvingEList.ManyInverse<SemanticVisitor_runtimeModelElement_Value>(SemanticVisitor_runtimeModelElement_Value.class, this, StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES, StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES);
		}
		return semanticVisitor_runtimeModelElement_Values;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActionActivation_firing_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemanticVisitor_runtimeModelElement_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				return ((InternalEList<?>)getActionActivation_firing_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				return ((InternalEList<?>)getSemanticVisitor_runtimeModelElement_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				return getActionActivation_firing_Values();
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				return getSemanticVisitor_runtimeModelElement_Values();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
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
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				getActionActivation_firing_Values().clear();
				getActionActivation_firing_Values().addAll((Collection<? extends ActionActivation_firing_Value>)newValue);
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				getSemanticVisitor_runtimeModelElement_Values().clear();
				getSemanticVisitor_runtimeModelElement_Values().addAll((Collection<? extends SemanticVisitor_runtimeModelElement_Value>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
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
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				getActionActivation_firing_Values().clear();
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				getSemanticVisitor_runtimeModelElement_Values().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
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
			case StatesPackage.STATE__ACTION_ACTIVATION_FIRING_VALUES:
				return actionActivation_firing_Values != null && !actionActivation_firing_Values.isEmpty();
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES:
				return semanticVisitor_runtimeModelElement_Values != null && !semanticVisitor_runtimeModelElement_Values.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
