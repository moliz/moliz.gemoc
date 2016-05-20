/**
 */
package umlTrace.States.fumlConfiguration.Actions.BasicActions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.fumlConfiguration.Actions.BasicActions.*;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation;

import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage
 * @generated
 */
public class BasicActionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicActionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasicActionsPackage.eINSTANCE;
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
	protected BasicActionsSwitch<Adapter> modelSwitch =
		new BasicActionsSwitch<Adapter>() {
			@Override
			public Adapter caseTracedActionActivation(TracedActionActivation object) {
				return createTracedActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedCallActionActivation(TracedCallActionActivation object) {
				return createTracedCallActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedCallBehaviorActionActivation(TracedCallBehaviorActionActivation object) {
				return createTracedCallBehaviorActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedInputPinActivation(TracedInputPinActivation object) {
				return createTracedInputPinActivationAdapter();
			}
			@Override
			public Adapter caseTracedInvocationActionActivation(TracedInvocationActionActivation object) {
				return createTracedInvocationActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedOpaqueActionActivation(TracedOpaqueActionActivation object) {
				return createTracedOpaqueActionActivationAdapter();
			}
			@Override
			public Adapter caseTracedOutputPinActivation(TracedOutputPinActivation object) {
				return createTracedOutputPinActivationAdapter();
			}
			@Override
			public Adapter caseTracedPinActivation(TracedPinActivation object) {
				return createTracedPinActivationAdapter();
			}
			@Override
			public Adapter caseTracedSemanticVisitor(TracedSemanticVisitor object) {
				return createTracedSemanticVisitorAdapter();
			}
			@Override
			public Adapter caseTracedActivityNodeActivation(TracedActivityNodeActivation object) {
				return createTracedActivityNodeActivationAdapter();
			}
			@Override
			public Adapter caseTracedObjectNodeActivation(TracedObjectNodeActivation object) {
				return createTracedObjectNodeActivationAdapter();
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
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation <em>Traced Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedActionActivation
	 * @generated
	 */
	public Adapter createTracedActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation <em>Traced Call Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallActionActivation
	 * @generated
	 */
	public Adapter createTracedCallActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation <em>Traced Call Behavior Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation
	 * @generated
	 */
	public Adapter createTracedCallBehaviorActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation <em>Traced Input Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation
	 * @generated
	 */
	public Adapter createTracedInputPinActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInvocationActionActivation <em>Traced Invocation Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInvocationActionActivation
	 * @generated
	 */
	public Adapter createTracedInvocationActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation <em>Traced Opaque Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation
	 * @generated
	 */
	public Adapter createTracedOpaqueActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation <em>Traced Output Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation
	 * @generated
	 */
	public Adapter createTracedOutputPinActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation <em>Traced Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation
	 * @generated
	 */
	public Adapter createTracedPinActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor <em>Traced Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor
	 * @generated
	 */
	public Adapter createTracedSemanticVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation <em>Traced Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation
	 * @generated
	 */
	public Adapter createTracedActivityNodeActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation <em>Traced Object Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation
	 * @generated
	 */
	public Adapter createTracedObjectNodeActivationAdapter() {
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

} //BasicActionsAdapterFactory
