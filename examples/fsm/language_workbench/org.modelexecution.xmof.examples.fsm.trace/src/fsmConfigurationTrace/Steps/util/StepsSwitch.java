/**
 */
package fsmConfigurationTrace.Steps.util;

import org.eclipse.gemoc.trace.commons.model.trace.BigStep;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;
import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fsmConfigurationTrace.Steps.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fsmConfigurationTrace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.FSM_CONFIGURATION_FSM_CONFIGURATION_RUN: {
				FsmConfiguration_FSMConfiguration_Run fsmConfiguration_FSMConfiguration_Run = (FsmConfiguration_FSMConfiguration_Run)theEObject;
				T result = caseFsmConfiguration_FSMConfiguration_Run(fsmConfiguration_FSMConfiguration_Run);
				if (result == null) result = caseSpecificStep(fsmConfiguration_FSMConfiguration_Run);
				if (result == null) result = caseSequentialStep(fsmConfiguration_FSMConfiguration_Run);
				if (result == null) result = caseBigStep(fsmConfiguration_FSMConfiguration_Run);
				if (result == null) result = caseStep(fsmConfiguration_FSMConfiguration_Run);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP: {
				FsmConfiguration_FSMConfiguration_Run_AbstractSubStep fsmConfiguration_FSMConfiguration_Run_AbstractSubStep = (FsmConfiguration_FSMConfiguration_Run_AbstractSubStep)theEObject;
				T result = caseFsmConfiguration_FSMConfiguration_Run_AbstractSubStep(fsmConfiguration_FSMConfiguration_Run_AbstractSubStep);
				if (result == null) result = caseSpecificStep(fsmConfiguration_FSMConfiguration_Run_AbstractSubStep);
				if (result == null) result = caseStep(fsmConfiguration_FSMConfiguration_Run_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP: {
				FsmConfiguration_FSMConfiguration_Run_ImplicitStep fsmConfiguration_FSMConfiguration_Run_ImplicitStep = (FsmConfiguration_FSMConfiguration_Run_ImplicitStep)theEObject;
				T result = caseFsmConfiguration_FSMConfiguration_Run_ImplicitStep(fsmConfiguration_FSMConfiguration_Run_ImplicitStep);
				if (result == null) result = caseFsmConfiguration_FSMConfiguration_Run_AbstractSubStep(fsmConfiguration_FSMConfiguration_Run_ImplicitStep);
				if (result == null) result = caseSmallStep(fsmConfiguration_FSMConfiguration_Run_ImplicitStep);
				if (result == null) result = caseSpecificStep(fsmConfiguration_FSMConfiguration_Run_ImplicitStep);
				if (result == null) result = caseStep(fsmConfiguration_FSMConfiguration_Run_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE: {
				FsmConfiguration_TransitionConfiguration_Fire fsmConfiguration_TransitionConfiguration_Fire = (FsmConfiguration_TransitionConfiguration_Fire)theEObject;
				T result = caseFsmConfiguration_TransitionConfiguration_Fire(fsmConfiguration_TransitionConfiguration_Fire);
				if (result == null) result = caseFsmConfiguration_FSMConfiguration_Run_AbstractSubStep(fsmConfiguration_TransitionConfiguration_Fire);
				if (result == null) result = caseSmallStep(fsmConfiguration_TransitionConfiguration_Fire);
				if (result == null) result = caseSpecificStep(fsmConfiguration_TransitionConfiguration_Fire);
				if (result == null) result = caseStep(fsmConfiguration_TransitionConfiguration_Fire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_ROOT_STEP: {
				SpecificRootStep specificRootStep = (SpecificRootStep)theEObject;
				T result = caseSpecificRootStep(specificRootStep);
				if (result == null) result = caseSequentialStep(specificRootStep);
				if (result == null) result = caseSpecificStep(specificRootStep);
				if (result == null) result = caseBigStep(specificRootStep);
				if (result == null) result = caseStep(specificRootStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_STEP: {
				SpecificStep specificStep = (SpecificStep)theEObject;
				T result = caseSpecificStep(specificStep);
				if (result == null) result = caseStep(specificStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Configuration FSM Configuration Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Configuration FSM Configuration Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsmConfiguration_FSMConfiguration_Run(FsmConfiguration_FSMConfiguration_Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Configuration FSM Configuration Run Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Configuration FSM Configuration Run Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsmConfiguration_FSMConfiguration_Run_AbstractSubStep(FsmConfiguration_FSMConfiguration_Run_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Configuration FSM Configuration Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Configuration FSM Configuration Run Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsmConfiguration_FSMConfiguration_Run_ImplicitStep(FsmConfiguration_FSMConfiguration_Run_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Configuration Transition Configuration Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Configuration Transition Configuration Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsmConfiguration_TransitionConfiguration_Fire(FsmConfiguration_TransitionConfiguration_Fire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Root Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Root Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificRootStep(SpecificRootStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificStep(SpecificStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StateSubType extends State<?, ?>> T caseStep(Step<StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step<StateSubType>, StateSubType extends State<?, ?>> T caseBigStep(BigStep<StepSubtype, StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step<StateSubType>, StateSubType extends State<?, ?>> T caseSequentialStep(SequentialStep<StepSubtype, StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StateSubType extends State<?, ?>> T caseSmallStep(SmallStep<StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StepsSwitch
