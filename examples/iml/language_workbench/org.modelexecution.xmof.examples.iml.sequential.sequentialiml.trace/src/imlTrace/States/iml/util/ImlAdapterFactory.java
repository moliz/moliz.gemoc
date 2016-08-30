/**
 */
package imlTrace.States.iml.util;

import imlTrace.States.iml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see imlTrace.States.iml.ImlPackage
 * @generated
 */
public class ImlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImlPackage.eINSTANCE;
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
	protected ImlSwitch<Adapter> modelSwitch =
		new ImlSwitch<Adapter>() {
			@Override
			public Adapter caseTracedActivity(TracedActivity object) {
				return createTracedActivityAdapter();
			}
			@Override
			public Adapter caseTracedAddData(TracedAddData object) {
				return createTracedAddDataAdapter();
			}
			@Override
			public Adapter caseTracedConnection(TracedConnection object) {
				return createTracedConnectionAdapter();
			}
			@Override
			public Adapter caseTracedConnectionPoint(TracedConnectionPoint object) {
				return createTracedConnectionPointAdapter();
			}
			@Override
			public Adapter caseTracedElement(TracedElement object) {
				return createTracedElementAdapter();
			}
			@Override
			public Adapter caseTracedEvent(TracedEvent object) {
				return createTracedEventAdapter();
			}
			@Override
			public Adapter caseTracedHeader(TracedHeader object) {
				return createTracedHeaderAdapter();
			}
			@Override
			public Adapter caseTracedIdentifyableElement(TracedIdentifyableElement object) {
				return createTracedIdentifyableElementAdapter();
			}
			@Override
			public Adapter caseTracedJump(TracedJump object) {
				return createTracedJumpAdapter();
			}
			@Override
			public Adapter caseTracedSelectionConvergence(TracedSelectionConvergence object) {
				return createTracedSelectionConvergenceAdapter();
			}
			@Override
			public Adapter caseTracedSelectionDivergence(TracedSelectionDivergence object) {
				return createTracedSelectionDivergenceAdapter();
			}
			@Override
			public Adapter caseTracedSimultaneousConvergence(TracedSimultaneousConvergence object) {
				return createTracedSimultaneousConvergenceAdapter();
			}
			@Override
			public Adapter caseTracedSimultaneousDivergence(TracedSimultaneousDivergence object) {
				return createTracedSimultaneousDivergenceAdapter();
			}
			@Override
			public Adapter caseTracedState(TracedState object) {
				return createTracedStateAdapter();
			}
			@Override
			public Adapter caseTracedStateTransition(TracedStateTransition object) {
				return createTracedStateTransitionAdapter();
			}
			@Override
			public Adapter caseTracedVariable(TracedVariable object) {
				return createTracedVariableAdapter();
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
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedActivity <em>Traced Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedActivity
	 * @generated
	 */
	public Adapter createTracedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedAddData <em>Traced Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedAddData
	 * @generated
	 */
	public Adapter createTracedAddDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedConnection <em>Traced Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedConnection
	 * @generated
	 */
	public Adapter createTracedConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedConnectionPoint <em>Traced Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedConnectionPoint
	 * @generated
	 */
	public Adapter createTracedConnectionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedElement <em>Traced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedElement
	 * @generated
	 */
	public Adapter createTracedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedEvent <em>Traced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedEvent
	 * @generated
	 */
	public Adapter createTracedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedHeader <em>Traced Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedHeader
	 * @generated
	 */
	public Adapter createTracedHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedIdentifyableElement <em>Traced Identifyable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedIdentifyableElement
	 * @generated
	 */
	public Adapter createTracedIdentifyableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedJump <em>Traced Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedJump
	 * @generated
	 */
	public Adapter createTracedJumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedSelectionConvergence <em>Traced Selection Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedSelectionConvergence
	 * @generated
	 */
	public Adapter createTracedSelectionConvergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedSelectionDivergence <em>Traced Selection Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedSelectionDivergence
	 * @generated
	 */
	public Adapter createTracedSelectionDivergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedSimultaneousConvergence <em>Traced Simultaneous Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedSimultaneousConvergence
	 * @generated
	 */
	public Adapter createTracedSimultaneousConvergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedSimultaneousDivergence <em>Traced Simultaneous Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedSimultaneousDivergence
	 * @generated
	 */
	public Adapter createTracedSimultaneousDivergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedState <em>Traced State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedState
	 * @generated
	 */
	public Adapter createTracedStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedStateTransition <em>Traced State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedStateTransition
	 * @generated
	 */
	public Adapter createTracedStateTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imlTrace.States.iml.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imlTrace.States.iml.TracedVariable
	 * @generated
	 */
	public Adapter createTracedVariableAdapter() {
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

} //ImlAdapterFactory
