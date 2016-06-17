/**
 */
package fumlConfigurationFewStepsTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import fumlConfigurationFewStepsTrace.Steps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewStepsTrace.Steps.StepsPackage
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
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivationAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep object) {
				return createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepAdapter();
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
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep
	 * @generated
	 */
	public Adapter createFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewStepsTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewStepsTrace.Steps.SpecificStep
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
