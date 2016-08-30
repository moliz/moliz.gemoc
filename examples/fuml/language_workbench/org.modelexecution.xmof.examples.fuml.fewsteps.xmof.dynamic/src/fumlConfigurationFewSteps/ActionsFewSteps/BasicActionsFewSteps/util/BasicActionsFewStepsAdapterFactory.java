/**
 */
package fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.util;

import fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.*;

import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation;
import fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ObjectNodeActivation;

import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.BasicActionsFewStepsPackage
 * @generated
 */
public class BasicActionsFewStepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicActionsFewStepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActionsFewStepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasicActionsFewStepsPackage.eINSTANCE;
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
	protected BasicActionsFewStepsSwitch<Adapter> modelSwitch =
		new BasicActionsFewStepsSwitch<Adapter>() {
			@Override
			public Adapter caseActionActivation(ActionActivation object) {
				return createActionActivationAdapter();
			}
			@Override
			public Adapter casePinActivation(PinActivation object) {
				return createPinActivationAdapter();
			}
			@Override
			public Adapter caseInputPinActivation(InputPinActivation object) {
				return createInputPinActivationAdapter();
			}
			@Override
			public Adapter caseOpaqueActionActivation(OpaqueActionActivation object) {
				return createOpaqueActionActivationAdapter();
			}
			@Override
			public Adapter caseOutputPinActivation(OutputPinActivation object) {
				return createOutputPinActivationAdapter();
			}
			@Override
			public Adapter caseCallActionActivation(CallActionActivation object) {
				return createCallActionActivationAdapter();
			}
			@Override
			public Adapter caseInvocationActionActivation(InvocationActionActivation object) {
				return createInvocationActionActivationAdapter();
			}
			@Override
			public Adapter caseCallBehaviorActionActivation(CallBehaviorActionActivation object) {
				return createCallBehaviorActionActivationAdapter();
			}
			@Override
			public Adapter caseSemanticVisitor(SemanticVisitor object) {
				return createSemanticVisitorAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivation(ActivityNodeActivation object) {
				return createActivityNodeActivationAdapter();
			}
			@Override
			public Adapter caseObjectNodeActivation(ObjectNodeActivation object) {
				return createObjectNodeActivationAdapter();
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
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation <em>Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.ActionActivation
	 * @generated
	 */
	public Adapter createActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation <em>Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.PinActivation
	 * @generated
	 */
	public Adapter createPinActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.InputPinActivation <em>Input Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.InputPinActivation
	 * @generated
	 */
	public Adapter createInputPinActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.OpaqueActionActivation <em>Opaque Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.OpaqueActionActivation
	 * @generated
	 */
	public Adapter createOpaqueActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.OutputPinActivation <em>Output Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.OutputPinActivation
	 * @generated
	 */
	public Adapter createOutputPinActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.CallActionActivation <em>Call Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.CallActionActivation
	 * @generated
	 */
	public Adapter createCallActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.InvocationActionActivation <em>Invocation Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.InvocationActionActivation
	 * @generated
	 */
	public Adapter createInvocationActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.CallBehaviorActionActivation <em>Call Behavior Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.CallBehaviorActionActivation
	 * @generated
	 */
	public Adapter createCallBehaviorActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor <em>Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor
	 * @generated
	 */
	public Adapter createSemanticVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation <em>Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ActivityNodeActivation
	 * @generated
	 */
	public Adapter createActivityNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ObjectNodeActivation <em>Object Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.ObjectNodeActivation
	 * @generated
	 */
	public Adapter createObjectNodeActivationAdapter() {
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

} //BasicActionsFewStepsAdapterFactory
