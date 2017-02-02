/**
 */
package imlTrace.Steps.impl;

import imlTrace.Steps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.IML_ACTIVITY_DO_EXECUTE: return createIml_Activity_DoExecute();
			case StepsPackage.IML_HEADER_EXECUTE: return createIml_Header_Execute();
			case StepsPackage.IML_HEADER_EXECUTE_IMPLICIT_STEP: return createIml_Header_Execute_ImplicitStep();
			case StepsPackage.IML_SELECTION_CONVERGENCE_DO_FIRE: return createIml_SelectionConvergence_DoFire();
			case StepsPackage.IML_SELECTION_CONVERGENCE_DO_FIRE_IMPLICIT_STEP: return createIml_SelectionConvergence_DoFire_ImplicitStep();
			case StepsPackage.IML_SELECTION_DIVERGENCE_DO_FIRE: return createIml_SelectionDivergence_DoFire();
			case StepsPackage.IML_SELECTION_DIVERGENCE_DO_FIRE_IMPLICIT_STEP: return createIml_SelectionDivergence_DoFire_ImplicitStep();
			case StepsPackage.IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE: return createIml_SimultaneousConvergence_DoFire();
			case StepsPackage.IML_SIMULTANEOUS_CONVERGENCE_DO_FIRE_IMPLICIT_STEP: return createIml_SimultaneousConvergence_DoFire_ImplicitStep();
			case StepsPackage.IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE: return createIml_SimultaneousDivergence_DoFire();
			case StepsPackage.IML_SIMULTANEOUS_DIVERGENCE_DO_FIRE_IMPLICIT_STEP: return createIml_SimultaneousDivergence_DoFire_ImplicitStep();
			case StepsPackage.IML_STATE_TRANSITION_DO_FIRE: return createIml_StateTransition_DoFire();
			case StepsPackage.IML_STATE_TRANSITION_DO_FIRE_IMPLICIT_STEP: return createIml_StateTransition_DoFire_ImplicitStep();
			case StepsPackage.IML_STATE_ACTIVATE: return createIml_State_Activate();
			case StepsPackage.IML_STATE_ACTIVATE_IMPLICIT_STEP: return createIml_State_Activate_ImplicitStep();
			case StepsPackage.IML_STATE_DEACTIVATE: return createIml_State_Deactivate();
			case StepsPackage.IML_STATE_EXECUTE_ACTIVITIES: return createIml_State_ExecuteActivities();
			case StepsPackage.IML_STATE_EXECUTE_ACTIVITIES_IMPLICIT_STEP: return createIml_State_ExecuteActivities_ImplicitStep();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_Activity_DoExecute createIml_Activity_DoExecute() {
		Iml_Activity_DoExecuteImpl iml_Activity_DoExecute = new Iml_Activity_DoExecuteImpl();
		return iml_Activity_DoExecute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_Header_Execute createIml_Header_Execute() {
		Iml_Header_ExecuteImpl iml_Header_Execute = new Iml_Header_ExecuteImpl();
		return iml_Header_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_Header_Execute_ImplicitStep createIml_Header_Execute_ImplicitStep() {
		Iml_Header_Execute_ImplicitStepImpl iml_Header_Execute_ImplicitStep = new Iml_Header_Execute_ImplicitStepImpl();
		return iml_Header_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_SelectionConvergence_DoFire createIml_SelectionConvergence_DoFire() {
		Iml_SelectionConvergence_DoFireImpl iml_SelectionConvergence_DoFire = new Iml_SelectionConvergence_DoFireImpl();
		return iml_SelectionConvergence_DoFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_SelectionConvergence_DoFire_ImplicitStep createIml_SelectionConvergence_DoFire_ImplicitStep() {
		Iml_SelectionConvergence_DoFire_ImplicitStepImpl iml_SelectionConvergence_DoFire_ImplicitStep = new Iml_SelectionConvergence_DoFire_ImplicitStepImpl();
		return iml_SelectionConvergence_DoFire_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_SelectionDivergence_DoFire createIml_SelectionDivergence_DoFire() {
		Iml_SelectionDivergence_DoFireImpl iml_SelectionDivergence_DoFire = new Iml_SelectionDivergence_DoFireImpl();
		return iml_SelectionDivergence_DoFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_SelectionDivergence_DoFire_ImplicitStep createIml_SelectionDivergence_DoFire_ImplicitStep() {
		Iml_SelectionDivergence_DoFire_ImplicitStepImpl iml_SelectionDivergence_DoFire_ImplicitStep = new Iml_SelectionDivergence_DoFire_ImplicitStepImpl();
		return iml_SelectionDivergence_DoFire_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_SimultaneousConvergence_DoFire createIml_SimultaneousConvergence_DoFire() {
		Iml_SimultaneousConvergence_DoFireImpl iml_SimultaneousConvergence_DoFire = new Iml_SimultaneousConvergence_DoFireImpl();
		return iml_SimultaneousConvergence_DoFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_SimultaneousConvergence_DoFire_ImplicitStep createIml_SimultaneousConvergence_DoFire_ImplicitStep() {
		Iml_SimultaneousConvergence_DoFire_ImplicitStepImpl iml_SimultaneousConvergence_DoFire_ImplicitStep = new Iml_SimultaneousConvergence_DoFire_ImplicitStepImpl();
		return iml_SimultaneousConvergence_DoFire_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_SimultaneousDivergence_DoFire createIml_SimultaneousDivergence_DoFire() {
		Iml_SimultaneousDivergence_DoFireImpl iml_SimultaneousDivergence_DoFire = new Iml_SimultaneousDivergence_DoFireImpl();
		return iml_SimultaneousDivergence_DoFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_SimultaneousDivergence_DoFire_ImplicitStep createIml_SimultaneousDivergence_DoFire_ImplicitStep() {
		Iml_SimultaneousDivergence_DoFire_ImplicitStepImpl iml_SimultaneousDivergence_DoFire_ImplicitStep = new Iml_SimultaneousDivergence_DoFire_ImplicitStepImpl();
		return iml_SimultaneousDivergence_DoFire_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_StateTransition_DoFire createIml_StateTransition_DoFire() {
		Iml_StateTransition_DoFireImpl iml_StateTransition_DoFire = new Iml_StateTransition_DoFireImpl();
		return iml_StateTransition_DoFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_StateTransition_DoFire_ImplicitStep createIml_StateTransition_DoFire_ImplicitStep() {
		Iml_StateTransition_DoFire_ImplicitStepImpl iml_StateTransition_DoFire_ImplicitStep = new Iml_StateTransition_DoFire_ImplicitStepImpl();
		return iml_StateTransition_DoFire_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_State_Activate createIml_State_Activate() {
		Iml_State_ActivateImpl iml_State_Activate = new Iml_State_ActivateImpl();
		return iml_State_Activate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_State_Activate_ImplicitStep createIml_State_Activate_ImplicitStep() {
		Iml_State_Activate_ImplicitStepImpl iml_State_Activate_ImplicitStep = new Iml_State_Activate_ImplicitStepImpl();
		return iml_State_Activate_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_State_Deactivate createIml_State_Deactivate() {
		Iml_State_DeactivateImpl iml_State_Deactivate = new Iml_State_DeactivateImpl();
		return iml_State_Deactivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_State_ExecuteActivities createIml_State_ExecuteActivities() {
		Iml_State_ExecuteActivitiesImpl iml_State_ExecuteActivities = new Iml_State_ExecuteActivitiesImpl();
		return iml_State_ExecuteActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iml_State_ExecuteActivities_ImplicitStep createIml_State_ExecuteActivities_ImplicitStep() {
		Iml_State_ExecuteActivities_ImplicitStepImpl iml_State_ExecuteActivities_ImplicitStep = new Iml_State_ExecuteActivities_ImplicitStepImpl();
		return iml_State_ExecuteActivities_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
