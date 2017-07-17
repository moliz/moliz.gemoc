/**
 */
package petrinetConfigurationTrace.Steps.util;

import org.eclipse.gemoc.trace.commons.model.trace.BigStep;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import petrinetConfigurationTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see petrinetConfigurationTrace.Steps.StepsPackage
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
			public Adapter casePetrinetConfiguration_NetConfiguration_Main(PetrinetConfiguration_NetConfiguration_Main object) {
				return createPetrinetConfiguration_NetConfiguration_MainAdapter();
			}
			@Override
			public Adapter casePetrinetConfiguration_NetConfiguration_Main_AbstractSubStep(PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep object) {
				return createPetrinetConfiguration_NetConfiguration_Main_AbstractSubStepAdapter();
			}
			@Override
			public Adapter casePetrinetConfiguration_NetConfiguration_Main_ImplicitStep(PetrinetConfiguration_NetConfiguration_Main_ImplicitStep object) {
				return createPetrinetConfiguration_NetConfiguration_Main_ImplicitStepAdapter();
			}
			@Override
			public Adapter casePetrinetConfiguration_NetConfiguration_Run(PetrinetConfiguration_NetConfiguration_Run object) {
				return createPetrinetConfiguration_NetConfiguration_RunAdapter();
			}
			@Override
			public Adapter casePetrinetConfiguration_NetConfiguration_Run_AbstractSubStep(PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep object) {
				return createPetrinetConfiguration_NetConfiguration_Run_AbstractSubStepAdapter();
			}
			@Override
			public Adapter casePetrinetConfiguration_NetConfiguration_Run_ImplicitStep(PetrinetConfiguration_NetConfiguration_Run_ImplicitStep object) {
				return createPetrinetConfiguration_NetConfiguration_Run_ImplicitStepAdapter();
			}
			@Override
			public Adapter casePetrinetConfiguration_TransitionConfiguration_Fire(PetrinetConfiguration_TransitionConfiguration_Fire object) {
				return createPetrinetConfiguration_TransitionConfiguration_FireAdapter();
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
			public <StepSubtype extends Step> Adapter caseBigStep(BigStep<StepSubtype> object) {
				return createBigStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseSequentialStep(SequentialStep<StepSubtype> object) {
				return createSequentialStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
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
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main <em>Petrinet Configuration Net Configuration Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main
	 * @generated
	 */
	public Adapter createPetrinetConfiguration_NetConfiguration_MainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep <em>Petrinet Configuration Net Configuration Main Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep
	 * @generated
	 */
	public Adapter createPetrinetConfiguration_NetConfiguration_Main_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_ImplicitStep <em>Petrinet Configuration Net Configuration Main Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_ImplicitStep
	 * @generated
	 */
	public Adapter createPetrinetConfiguration_NetConfiguration_Main_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run <em>Petrinet Configuration Net Configuration Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run
	 * @generated
	 */
	public Adapter createPetrinetConfiguration_NetConfiguration_RunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep <em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep
	 * @generated
	 */
	public Adapter createPetrinetConfiguration_NetConfiguration_Run_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_ImplicitStep <em>Petrinet Configuration Net Configuration Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_ImplicitStep
	 * @generated
	 */
	public Adapter createPetrinetConfiguration_NetConfiguration_Run_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire <em>Petrinet Configuration Transition Configuration Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire
	 * @generated
	 */
	public Adapter createPetrinetConfiguration_TransitionConfiguration_FireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetConfigurationTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetConfigurationTrace.Steps.SpecificStep
	 * @generated
	 */
	public Adapter createSpecificStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.SequentialStep <em>Sequential Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.SequentialStep
	 * @generated
	 */
	public Adapter createSequentialStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
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
