/**
 */
package imlTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import imlTrace.Steps.*;

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
 * @see imlTrace.Steps.StepsPackage
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
			case StepsPackage.IML_ACTIVITY_DO_EXECUTE: {
				Iml_Activity_DoExecute iml_Activity_DoExecute = (Iml_Activity_DoExecute)theEObject;
				T result = caseIml_Activity_DoExecute(iml_Activity_DoExecute);
				if (result == null) result = caseIml_State_ExecuteActivities_AbstractSubStep(iml_Activity_DoExecute);
				if (result == null) result = caseSmallStep(iml_Activity_DoExecute);
				if (result == null) result = caseSpecificStep(iml_Activity_DoExecute);
				if (result == null) result = caseStep(iml_Activity_DoExecute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_HEADER_EXECUTE: {
				Iml_Header_Execute iml_Header_Execute = (Iml_Header_Execute)theEObject;
				T result = caseIml_Header_Execute(iml_Header_Execute);
				if (result == null) result = caseSpecificStep(iml_Header_Execute);
				if (result == null) result = caseSequentialStep(iml_Header_Execute);
				if (result == null) result = caseBigStep(iml_Header_Execute);
				if (result == null) result = caseStep(iml_Header_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_HEADER_EXECUTE_ABSTRACT_SUB_STEP: {
				Iml_Header_Execute_AbstractSubStep iml_Header_Execute_AbstractSubStep = (Iml_Header_Execute_AbstractSubStep)theEObject;
				T result = caseIml_Header_Execute_AbstractSubStep(iml_Header_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(iml_Header_Execute_AbstractSubStep);
				if (result == null) result = caseStep(iml_Header_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_HEADER_EXECUTE_IMPLICIT_STEP: {
				Iml_Header_Execute_ImplicitStep iml_Header_Execute_ImplicitStep = (Iml_Header_Execute_ImplicitStep)theEObject;
				T result = caseIml_Header_Execute_ImplicitStep(iml_Header_Execute_ImplicitStep);
				if (result == null) result = caseIml_Header_Execute_AbstractSubStep(iml_Header_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(iml_Header_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(iml_Header_Execute_ImplicitStep);
				if (result == null) result = caseStep(iml_Header_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SELECTION_CONVERGENCE_DO_FIRE: {
				Iml_SelectionConvergence_DoFire iml_SelectionConvergence_DoFire = (Iml_SelectionConvergence_DoFire)theEObject;
				T result = caseIml_SelectionConvergence_DoFire(iml_SelectionConvergence_DoFire);
				if (result == null) result = caseIml_Header_Execute_AbstractSubStep(iml_SelectionConvergence_DoFire);
				if (result == null) result = caseSequentialStep(iml_SelectionConvergence_DoFire);
				if (result == null) result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_SelectionConvergence_DoFire);
				if (result == null) result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_SelectionConvergence_DoFire);
				if (result == null) result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_SelectionConvergence_DoFire);
				if (result == null) result = caseSpecificStep(iml_SelectionConvergence_DoFire);
				if (result == null) result = caseBigStep(iml_SelectionConvergence_DoFire);
				if (result == null) result = caseStep(iml_SelectionConvergence_DoFire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SELECTION_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP: {
				Iml_SelectionConvergence_DoFire_AbstractSubStep iml_SelectionConvergence_DoFire_AbstractSubStep = (Iml_SelectionConvergence_DoFire_AbstractSubStep)theEObject;
				T result = caseIml_SelectionConvergence_DoFire_AbstractSubStep(iml_SelectionConvergence_DoFire_AbstractSubStep);
				if (result == null) result = caseSpecificStep(iml_SelectionConvergence_DoFire_AbstractSubStep);
				if (result == null) result = caseStep(iml_SelectionConvergence_DoFire_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP: {
				Iml_SelectionConvergence_DoFire_ImplicitStep iml_SelectionConvergence_DoFire_ImplicitStep = (Iml_SelectionConvergence_DoFire_ImplicitStep)theEObject;
				T result = caseIml_SelectionConvergence_DoFire_ImplicitStep(iml_SelectionConvergence_DoFire_ImplicitStep);
				if (result == null) result = caseIml_SelectionConvergence_DoFire_AbstractSubStep(iml_SelectionConvergence_DoFire_ImplicitStep);
				if (result == null) result = caseSmallStep(iml_SelectionConvergence_DoFire_ImplicitStep);
				if (result == null) result = caseSpecificStep(iml_SelectionConvergence_DoFire_ImplicitStep);
				if (result == null) result = caseStep(iml_SelectionConvergence_DoFire_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SELECTION_DIVERGENCE_DO_FIRE: {
				Iml_SelectionDivergence_DoFire iml_SelectionDivergence_DoFire = (Iml_SelectionDivergence_DoFire)theEObject;
				T result = caseIml_SelectionDivergence_DoFire(iml_SelectionDivergence_DoFire);
				if (result == null) result = caseIml_Header_Execute_AbstractSubStep(iml_SelectionDivergence_DoFire);
				if (result == null) result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_SelectionDivergence_DoFire);
				if (result == null) result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_SelectionDivergence_DoFire);
				if (result == null) result = caseSequentialStep(iml_SelectionDivergence_DoFire);
				if (result == null) result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_SelectionDivergence_DoFire);
				if (result == null) result = caseSpecificStep(iml_SelectionDivergence_DoFire);
				if (result == null) result = caseBigStep(iml_SelectionDivergence_DoFire);
				if (result == null) result = caseStep(iml_SelectionDivergence_DoFire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SELECTION_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP: {
				Iml_SelectionDivergence_DoFire_AbstractSubStep iml_SelectionDivergence_DoFire_AbstractSubStep = (Iml_SelectionDivergence_DoFire_AbstractSubStep)theEObject;
				T result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_SelectionDivergence_DoFire_AbstractSubStep);
				if (result == null) result = caseSpecificStep(iml_SelectionDivergence_DoFire_AbstractSubStep);
				if (result == null) result = caseStep(iml_SelectionDivergence_DoFire_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP: {
				Iml_SelectionDivergence_DoFire_ImplicitStep iml_SelectionDivergence_DoFire_ImplicitStep = (Iml_SelectionDivergence_DoFire_ImplicitStep)theEObject;
				T result = caseIml_SelectionDivergence_DoFire_ImplicitStep(iml_SelectionDivergence_DoFire_ImplicitStep);
				if (result == null) result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_SelectionDivergence_DoFire_ImplicitStep);
				if (result == null) result = caseSmallStep(iml_SelectionDivergence_DoFire_ImplicitStep);
				if (result == null) result = caseSpecificStep(iml_SelectionDivergence_DoFire_ImplicitStep);
				if (result == null) result = caseStep(iml_SelectionDivergence_DoFire_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE: {
				Iml_SimultaneousConvergence_DoFire iml_SimultaneousConvergence_DoFire = (Iml_SimultaneousConvergence_DoFire)theEObject;
				T result = caseIml_SimultaneousConvergence_DoFire(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = caseIml_Header_Execute_AbstractSubStep(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = caseSequentialStep(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = caseSpecificStep(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = caseBigStep(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = caseStep(iml_SimultaneousConvergence_DoFire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP: {
				Iml_SimultaneousConvergence_DoFire_AbstractSubStep iml_SimultaneousConvergence_DoFire_AbstractSubStep = (Iml_SimultaneousConvergence_DoFire_AbstractSubStep)theEObject;
				T result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_SimultaneousConvergence_DoFire_AbstractSubStep);
				if (result == null) result = caseSpecificStep(iml_SimultaneousConvergence_DoFire_AbstractSubStep);
				if (result == null) result = caseStep(iml_SimultaneousConvergence_DoFire_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP: {
				Iml_SimultaneousConvergence_DoFire_ImplicitStep iml_SimultaneousConvergence_DoFire_ImplicitStep = (Iml_SimultaneousConvergence_DoFire_ImplicitStep)theEObject;
				T result = caseIml_SimultaneousConvergence_DoFire_ImplicitStep(iml_SimultaneousConvergence_DoFire_ImplicitStep);
				if (result == null) result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_SimultaneousConvergence_DoFire_ImplicitStep);
				if (result == null) result = caseSmallStep(iml_SimultaneousConvergence_DoFire_ImplicitStep);
				if (result == null) result = caseSpecificStep(iml_SimultaneousConvergence_DoFire_ImplicitStep);
				if (result == null) result = caseStep(iml_SimultaneousConvergence_DoFire_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE: {
				Iml_SimultaneousDivergence_DoFire iml_SimultaneousDivergence_DoFire = (Iml_SimultaneousDivergence_DoFire)theEObject;
				T result = caseIml_SimultaneousDivergence_DoFire(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = caseIml_Header_Execute_AbstractSubStep(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = caseSequentialStep(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = caseSpecificStep(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = caseBigStep(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = caseStep(iml_SimultaneousDivergence_DoFire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_ABSTRACT_SUB_STEP: {
				Iml_SimultaneousDivergence_DoFire_AbstractSubStep iml_SimultaneousDivergence_DoFire_AbstractSubStep = (Iml_SimultaneousDivergence_DoFire_AbstractSubStep)theEObject;
				T result = caseIml_SimultaneousDivergence_DoFire_AbstractSubStep(iml_SimultaneousDivergence_DoFire_AbstractSubStep);
				if (result == null) result = caseSpecificStep(iml_SimultaneousDivergence_DoFire_AbstractSubStep);
				if (result == null) result = caseStep(iml_SimultaneousDivergence_DoFire_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP: {
				Iml_SimultaneousDivergence_DoFire_ImplicitStep iml_SimultaneousDivergence_DoFire_ImplicitStep = (Iml_SimultaneousDivergence_DoFire_ImplicitStep)theEObject;
				T result = caseIml_SimultaneousDivergence_DoFire_ImplicitStep(iml_SimultaneousDivergence_DoFire_ImplicitStep);
				if (result == null) result = caseIml_SimultaneousDivergence_DoFire_AbstractSubStep(iml_SimultaneousDivergence_DoFire_ImplicitStep);
				if (result == null) result = caseSmallStep(iml_SimultaneousDivergence_DoFire_ImplicitStep);
				if (result == null) result = caseSpecificStep(iml_SimultaneousDivergence_DoFire_ImplicitStep);
				if (result == null) result = caseStep(iml_SimultaneousDivergence_DoFire_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_TRANSITION_DO_FIRE: {
				Iml_StateTransition_DoFire iml_StateTransition_DoFire = (Iml_StateTransition_DoFire)theEObject;
				T result = caseIml_StateTransition_DoFire(iml_StateTransition_DoFire);
				if (result == null) result = caseIml_Header_Execute_AbstractSubStep(iml_StateTransition_DoFire);
				if (result == null) result = caseSequentialStep(iml_StateTransition_DoFire);
				if (result == null) result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_StateTransition_DoFire);
				if (result == null) result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_StateTransition_DoFire);
				if (result == null) result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_StateTransition_DoFire);
				if (result == null) result = caseSpecificStep(iml_StateTransition_DoFire);
				if (result == null) result = caseBigStep(iml_StateTransition_DoFire);
				if (result == null) result = caseStep(iml_StateTransition_DoFire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_TRANSITION_DO_FIRE_ABSTRACT_SUB_STEP: {
				Iml_StateTransition_DoFire_AbstractSubStep iml_StateTransition_DoFire_AbstractSubStep = (Iml_StateTransition_DoFire_AbstractSubStep)theEObject;
				T result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_StateTransition_DoFire_AbstractSubStep);
				if (result == null) result = caseSpecificStep(iml_StateTransition_DoFire_AbstractSubStep);
				if (result == null) result = caseStep(iml_StateTransition_DoFire_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP: {
				Iml_StateTransition_DoFire_ImplicitStep iml_StateTransition_DoFire_ImplicitStep = (Iml_StateTransition_DoFire_ImplicitStep)theEObject;
				T result = caseIml_StateTransition_DoFire_ImplicitStep(iml_StateTransition_DoFire_ImplicitStep);
				if (result == null) result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_StateTransition_DoFire_ImplicitStep);
				if (result == null) result = caseSmallStep(iml_StateTransition_DoFire_ImplicitStep);
				if (result == null) result = caseSpecificStep(iml_StateTransition_DoFire_ImplicitStep);
				if (result == null) result = caseStep(iml_StateTransition_DoFire_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_ACTIVATE: {
				Iml_State_Activate iml_State_Activate = (Iml_State_Activate)theEObject;
				T result = caseIml_State_Activate(iml_State_Activate);
				if (result == null) result = caseIml_Header_Execute_AbstractSubStep(iml_State_Activate);
				if (result == null) result = caseSequentialStep(iml_State_Activate);
				if (result == null) result = caseIml_SelectionConvergence_DoFire_AbstractSubStep(iml_State_Activate);
				if (result == null) result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_State_Activate);
				if (result == null) result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_State_Activate);
				if (result == null) result = caseIml_SimultaneousDivergence_DoFire_AbstractSubStep(iml_State_Activate);
				if (result == null) result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_State_Activate);
				if (result == null) result = caseSpecificStep(iml_State_Activate);
				if (result == null) result = caseBigStep(iml_State_Activate);
				if (result == null) result = caseStep(iml_State_Activate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_ACTIVATE_ABSTRACT_SUB_STEP: {
				Iml_State_Activate_AbstractSubStep iml_State_Activate_AbstractSubStep = (Iml_State_Activate_AbstractSubStep)theEObject;
				T result = caseIml_State_Activate_AbstractSubStep(iml_State_Activate_AbstractSubStep);
				if (result == null) result = caseSpecificStep(iml_State_Activate_AbstractSubStep);
				if (result == null) result = caseStep(iml_State_Activate_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_ACTIVATE_IMPLICIT_STEP: {
				Iml_State_Activate_ImplicitStep iml_State_Activate_ImplicitStep = (Iml_State_Activate_ImplicitStep)theEObject;
				T result = caseIml_State_Activate_ImplicitStep(iml_State_Activate_ImplicitStep);
				if (result == null) result = caseIml_State_Activate_AbstractSubStep(iml_State_Activate_ImplicitStep);
				if (result == null) result = caseSmallStep(iml_State_Activate_ImplicitStep);
				if (result == null) result = caseSpecificStep(iml_State_Activate_ImplicitStep);
				if (result == null) result = caseStep(iml_State_Activate_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_DEACTIVATE: {
				Iml_State_Deactivate iml_State_Deactivate = (Iml_State_Deactivate)theEObject;
				T result = caseIml_State_Deactivate(iml_State_Deactivate);
				if (result == null) result = caseSmallStep(iml_State_Deactivate);
				if (result == null) result = caseIml_Header_Execute_AbstractSubStep(iml_State_Deactivate);
				if (result == null) result = caseIml_StateTransition_DoFire_AbstractSubStep(iml_State_Deactivate);
				if (result == null) result = caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(iml_State_Deactivate);
				if (result == null) result = caseIml_SelectionDivergence_DoFire_AbstractSubStep(iml_State_Deactivate);
				if (result == null) result = caseSpecificStep(iml_State_Deactivate);
				if (result == null) result = caseStep(iml_State_Deactivate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_EXECUTE_ACTIVITIES: {
				Iml_State_ExecuteActivities iml_State_ExecuteActivities = (Iml_State_ExecuteActivities)theEObject;
				T result = caseIml_State_ExecuteActivities(iml_State_ExecuteActivities);
				if (result == null) result = caseSequentialStep(iml_State_ExecuteActivities);
				if (result == null) result = caseIml_State_Activate_AbstractSubStep(iml_State_ExecuteActivities);
				if (result == null) result = caseSpecificStep(iml_State_ExecuteActivities);
				if (result == null) result = caseBigStep(iml_State_ExecuteActivities);
				if (result == null) result = caseStep(iml_State_ExecuteActivities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_EXECUTE_ACTIVITIES_ABSTRACT_SUB_STEP: {
				Iml_State_ExecuteActivities_AbstractSubStep iml_State_ExecuteActivities_AbstractSubStep = (Iml_State_ExecuteActivities_AbstractSubStep)theEObject;
				T result = caseIml_State_ExecuteActivities_AbstractSubStep(iml_State_ExecuteActivities_AbstractSubStep);
				if (result == null) result = caseSpecificStep(iml_State_ExecuteActivities_AbstractSubStep);
				if (result == null) result = caseStep(iml_State_ExecuteActivities_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP: {
				Iml_State_ExecuteActivities_ImplicitStep iml_State_ExecuteActivities_ImplicitStep = (Iml_State_ExecuteActivities_ImplicitStep)theEObject;
				T result = caseIml_State_ExecuteActivities_ImplicitStep(iml_State_ExecuteActivities_ImplicitStep);
				if (result == null) result = caseIml_State_ExecuteActivities_AbstractSubStep(iml_State_ExecuteActivities_ImplicitStep);
				if (result == null) result = caseSmallStep(iml_State_ExecuteActivities_ImplicitStep);
				if (result == null) result = caseSpecificStep(iml_State_ExecuteActivities_ImplicitStep);
				if (result == null) result = caseStep(iml_State_ExecuteActivities_ImplicitStep);
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
	 * Returns the result of interpreting the object as an instance of '<em>Iml Activity Do Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Activity Do Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_Activity_DoExecute(Iml_Activity_DoExecute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Header Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Header Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_Header_Execute(Iml_Header_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Header Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Header Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_Header_Execute_AbstractSubStep(Iml_Header_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Header Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Header Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_Header_Execute_ImplicitStep(Iml_Header_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Selection Convergence Do Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Selection Convergence Do Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SelectionConvergence_DoFire(Iml_SelectionConvergence_DoFire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Selection Convergence Do Fire Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Selection Convergence Do Fire Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SelectionConvergence_DoFire_AbstractSubStep(Iml_SelectionConvergence_DoFire_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Selection Convergence Do Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Selection Convergence Do Fire Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SelectionConvergence_DoFire_ImplicitStep(Iml_SelectionConvergence_DoFire_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Selection Divergence Do Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Selection Divergence Do Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SelectionDivergence_DoFire(Iml_SelectionDivergence_DoFire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Selection Divergence Do Fire Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Selection Divergence Do Fire Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SelectionDivergence_DoFire_AbstractSubStep(Iml_SelectionDivergence_DoFire_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Selection Divergence Do Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Selection Divergence Do Fire Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SelectionDivergence_DoFire_ImplicitStep(Iml_SelectionDivergence_DoFire_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Simultaneous Convergence Do Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Simultaneous Convergence Do Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SimultaneousConvergence_DoFire(Iml_SimultaneousConvergence_DoFire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(Iml_SimultaneousConvergence_DoFire_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Simultaneous Convergence Do Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Simultaneous Convergence Do Fire Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SimultaneousConvergence_DoFire_ImplicitStep(Iml_SimultaneousConvergence_DoFire_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Simultaneous Divergence Do Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Simultaneous Divergence Do Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SimultaneousDivergence_DoFire(Iml_SimultaneousDivergence_DoFire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SimultaneousDivergence_DoFire_AbstractSubStep(Iml_SimultaneousDivergence_DoFire_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml Simultaneous Divergence Do Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml Simultaneous Divergence Do Fire Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_SimultaneousDivergence_DoFire_ImplicitStep(Iml_SimultaneousDivergence_DoFire_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Transition Do Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Transition Do Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_StateTransition_DoFire(Iml_StateTransition_DoFire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Transition Do Fire Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Transition Do Fire Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_StateTransition_DoFire_AbstractSubStep(Iml_StateTransition_DoFire_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Transition Do Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Transition Do Fire Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_StateTransition_DoFire_ImplicitStep(Iml_StateTransition_DoFire_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Activate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Activate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_State_Activate(Iml_State_Activate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Activate Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Activate Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_State_Activate_AbstractSubStep(Iml_State_Activate_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Activate Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Activate Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_State_Activate_ImplicitStep(Iml_State_Activate_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Deactivate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Deactivate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_State_Deactivate(Iml_State_Deactivate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Execute Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Execute Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_State_ExecuteActivities(Iml_State_ExecuteActivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Execute Activities Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Execute Activities Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_State_ExecuteActivities_AbstractSubStep(Iml_State_ExecuteActivities_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iml State Execute Activities Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iml State Execute Activities Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIml_State_ExecuteActivities_ImplicitStep(Iml_State_ExecuteActivities_ImplicitStep object) {
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
	public T caseStep(Step object) {
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
	public T caseSmallStep(SmallStep object) {
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
	public <StepSubtype extends Step> T caseBigStep(BigStep<StepSubtype> object) {
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
	public <StepSubtype extends Step> T caseSequentialStep(SequentialStep<StepSubtype> object) {
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
