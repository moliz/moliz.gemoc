/**
 */
package imlTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import imlTrace.Steps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see imlTrace.Steps.StepsPackage
 * @generated
 */
public class StepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsSwitch<Adapter> modelSwitch =
		new StepsSwitch<Adapter>() {
			@Override
			public Adapter caseIml_Activity_DoExecute(Iml_Activity_DoExecute object) {
				return createIml_Activity_DoExecuteAdapter();
			}
			@Override
			public Adapter caseIml_Header_Execute(Iml_Header_Execute object) {
				return createIml_Header_ExecuteAdapter();
			}
			@Override
			public Adapter caseIml_Header_Execute_AbstractSubStep(Iml_Header_Execute_AbstractSubStep object) {
				return createIml_Header_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseIml_Header_Execute_ImplicitStep(Iml_Header_Execute_ImplicitStep object) {
				return createIml_Header_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseIml_SelectionConvergence_DoFire(Iml_SelectionConvergence_DoFire object) {
				return createIml_SelectionConvergence_DoFireAdapter();
			}
			@Override
			public Adapter caseIml_SelectionConvergence_DoFire_AbstractSubStep(Iml_SelectionConvergence_DoFire_AbstractSubStep object) {
				return createIml_SelectionConvergence_DoFire_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseIml_SelectionConvergence_DoFire_ImplicitStep(Iml_SelectionConvergence_DoFire_ImplicitStep object) {
				return createIml_SelectionConvergence_DoFire_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseIml_SelectionDivergence_DoFire(Iml_SelectionDivergence_DoFire object) {
				return createIml_SelectionDivergence_DoFireAdapter();
			}
			@Override
			public Adapter caseIml_SelectionDivergence_DoFire_AbstractSubStep(Iml_SelectionDivergence_DoFire_AbstractSubStep object) {
				return createIml_SelectionDivergence_DoFire_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseIml_SelectionDivergence_DoFire_ImplicitStep(Iml_SelectionDivergence_DoFire_ImplicitStep object) {
				return createIml_SelectionDivergence_DoFire_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseIml_SimultaneousConvergence_DoFire(Iml_SimultaneousConvergence_DoFire object) {
				return createIml_SimultaneousConvergence_DoFireAdapter();
			}
			@Override
			public Adapter caseIml_SimultaneousConvergence_DoFire_AbstractSubStep(Iml_SimultaneousConvergence_DoFire_AbstractSubStep object) {
				return createIml_SimultaneousConvergence_DoFire_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseIml_SimultaneousConvergence_DoFire_ImplicitStep(Iml_SimultaneousConvergence_DoFire_ImplicitStep object) {
				return createIml_SimultaneousConvergence_DoFire_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseIml_SimultaneousDivergence_DoFire(Iml_SimultaneousDivergence_DoFire object) {
				return createIml_SimultaneousDivergence_DoFireAdapter();
			}
			@Override
			public Adapter caseIml_SimultaneousDivergence_DoFire_AbstractSubStep(Iml_SimultaneousDivergence_DoFire_AbstractSubStep object) {
				return createIml_SimultaneousDivergence_DoFire_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseIml_SimultaneousDivergence_DoFire_ImplicitStep(Iml_SimultaneousDivergence_DoFire_ImplicitStep object) {
				return createIml_SimultaneousDivergence_DoFire_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseIml_StateTransition_DoFire(Iml_StateTransition_DoFire object) {
				return createIml_StateTransition_DoFireAdapter();
			}
			@Override
			public Adapter caseIml_StateTransition_DoFire_AbstractSubStep(Iml_StateTransition_DoFire_AbstractSubStep object) {
				return createIml_StateTransition_DoFire_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseIml_StateTransition_DoFire_ImplicitStep(Iml_StateTransition_DoFire_ImplicitStep object) {
				return createIml_StateTransition_DoFire_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseIml_State_Activate(Iml_State_Activate object) {
				return createIml_State_ActivateAdapter();
			}
			@Override
			public Adapter caseIml_State_Activate_AbstractSubStep(Iml_State_Activate_AbstractSubStep object) {
				return createIml_State_Activate_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseIml_State_Activate_ImplicitStep(Iml_State_Activate_ImplicitStep object) {
				return createIml_State_Activate_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseIml_State_Deactivate(Iml_State_Deactivate object) {
				return createIml_State_DeactivateAdapter();
			}
			@Override
			public Adapter caseIml_State_ExecuteActivities(Iml_State_ExecuteActivities object) {
				return createIml_State_ExecuteActivitiesAdapter();
			}
			@Override
			public Adapter caseIml_State_ExecuteActivities_AbstractSubStep(Iml_State_ExecuteActivities_AbstractSubStep object) {
				return createIml_State_ExecuteActivities_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseIml_State_ExecuteActivities_ImplicitStep(Iml_State_ExecuteActivities_ImplicitStep object) {
				return createIml_State_ExecuteActivities_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSpecificStep(SpecificStep object) {
				return createSpecificStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseBigStep(BigStep<StepSubtype> object) {
				return createBigStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseSequentialStep(SequentialStep<StepSubtype> object) {
				return createSequentialStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_Activity_DoExecute <em>Iml Activity Do Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_Activity_DoExecute
	 * @generated
	 */
	public Adapter createIml_Activity_DoExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_Header_Execute <em>Iml Header Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_Header_Execute
	 * @generated
	 */
	public Adapter createIml_Header_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_Header_Execute_AbstractSubStep <em>Iml Header Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_Header_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createIml_Header_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_Header_Execute_ImplicitStep <em>Iml Header Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_Header_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createIml_Header_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire <em>Iml Selection Convergence Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire
	 * @generated
	 */
	public Adapter createIml_SelectionConvergence_DoFireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep <em>Iml Selection Convergence Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire_AbstractSubStep
	 * @generated
	 */
	public Adapter createIml_SelectionConvergence_DoFire_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SelectionConvergence_DoFire_ImplicitStep <em>Iml Selection Convergence Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SelectionConvergence_DoFire_ImplicitStep
	 * @generated
	 */
	public Adapter createIml_SelectionConvergence_DoFire_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire <em>Iml Selection Divergence Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire
	 * @generated
	 */
	public Adapter createIml_SelectionDivergence_DoFireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep <em>Iml Selection Divergence Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire_AbstractSubStep
	 * @generated
	 */
	public Adapter createIml_SelectionDivergence_DoFire_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SelectionDivergence_DoFire_ImplicitStep <em>Iml Selection Divergence Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SelectionDivergence_DoFire_ImplicitStep
	 * @generated
	 */
	public Adapter createIml_SelectionDivergence_DoFire_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire <em>Iml Simultaneous Convergence Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire
	 * @generated
	 */
	public Adapter createIml_SimultaneousConvergence_DoFireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep <em>Iml Simultaneous Convergence Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_AbstractSubStep
	 * @generated
	 */
	public Adapter createIml_SimultaneousConvergence_DoFire_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_ImplicitStep <em>Iml Simultaneous Convergence Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_ImplicitStep
	 * @generated
	 */
	public Adapter createIml_SimultaneousConvergence_DoFire_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire <em>Iml Simultaneous Divergence Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire
	 * @generated
	 */
	public Adapter createIml_SimultaneousDivergence_DoFireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep <em>Iml Simultaneous Divergence Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_AbstractSubStep
	 * @generated
	 */
	public Adapter createIml_SimultaneousDivergence_DoFire_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_ImplicitStep <em>Iml Simultaneous Divergence Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_ImplicitStep
	 * @generated
	 */
	public Adapter createIml_SimultaneousDivergence_DoFire_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_StateTransition_DoFire <em>Iml State Transition Do Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_StateTransition_DoFire
	 * @generated
	 */
	public Adapter createIml_StateTransition_DoFireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep <em>Iml State Transition Do Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_StateTransition_DoFire_AbstractSubStep
	 * @generated
	 */
	public Adapter createIml_StateTransition_DoFire_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_StateTransition_DoFire_ImplicitStep <em>Iml State Transition Do Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_StateTransition_DoFire_ImplicitStep
	 * @generated
	 */
	public Adapter createIml_StateTransition_DoFire_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_State_Activate <em>Iml State Activate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_State_Activate
	 * @generated
	 */
	public Adapter createIml_State_ActivateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_State_Activate_AbstractSubStep <em>Iml State Activate Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_State_Activate_AbstractSubStep
	 * @generated
	 */
	public Adapter createIml_State_Activate_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_State_Activate_ImplicitStep <em>Iml State Activate Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_State_Activate_ImplicitStep
	 * @generated
	 */
	public Adapter createIml_State_Activate_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_State_Deactivate <em>Iml State Deactivate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_State_Deactivate
	 * @generated
	 */
	public Adapter createIml_State_DeactivateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_State_ExecuteActivities <em>Iml State Execute Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_State_ExecuteActivities
	 * @generated
	 */
	public Adapter createIml_State_ExecuteActivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep <em>Iml State Execute Activities Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_State_ExecuteActivities_AbstractSubStep
	 * @generated
	 */
	public Adapter createIml_State_ExecuteActivities_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.Iml_State_ExecuteActivities_ImplicitStep <em>Iml State Execute Activities Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.Iml_State_ExecuteActivities_ImplicitStep
	 * @generated
	 */
	public Adapter createIml_State_ExecuteActivities_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.Steps.SpecificStep
	 * @generated
	 */
	public Adapter createSpecificStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.SequentialStep <em>Sequential Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.SequentialStep
	 * @generated
	 */
	public Adapter createSequentialStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StepsAdapterFactory
