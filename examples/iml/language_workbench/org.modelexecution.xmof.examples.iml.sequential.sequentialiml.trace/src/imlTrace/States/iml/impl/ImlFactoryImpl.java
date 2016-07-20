/**
 */
package imlTrace.States.iml.impl;

import imlTrace.States.iml.*;

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
public class ImlFactoryImpl extends EFactoryImpl implements ImlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImlFactory init() {
		try {
			ImlFactory theImlFactory = (ImlFactory)EPackage.Registry.INSTANCE.getEFactory(ImlPackage.eNS_URI);
			if (theImlFactory != null) {
				return theImlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImlFactoryImpl() {
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
			case ImlPackage.TRACED_ACTIVITY: return createTracedActivity();
			case ImlPackage.TRACED_ADD_DATA: return createTracedAddData();
			case ImlPackage.TRACED_CONNECTION: return createTracedConnection();
			case ImlPackage.TRACED_EVENT: return createTracedEvent();
			case ImlPackage.TRACED_HEADER: return createTracedHeader();
			case ImlPackage.TRACED_JUMP: return createTracedJump();
			case ImlPackage.TRACED_SELECTION_CONVERGENCE: return createTracedSelectionConvergence();
			case ImlPackage.TRACED_SELECTION_DIVERGENCE: return createTracedSelectionDivergence();
			case ImlPackage.TRACED_SIMULTANEOUS_CONVERGENCE: return createTracedSimultaneousConvergence();
			case ImlPackage.TRACED_SIMULTANEOUS_DIVERGENCE: return createTracedSimultaneousDivergence();
			case ImlPackage.TRACED_STATE: return createTracedState();
			case ImlPackage.TRACED_STATE_TRANSITION: return createTracedStateTransition();
			case ImlPackage.TRACED_VARIABLE: return createTracedVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivity createTracedActivity() {
		TracedActivityImpl tracedActivity = new TracedActivityImpl();
		return tracedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAddData createTracedAddData() {
		TracedAddDataImpl tracedAddData = new TracedAddDataImpl();
		return tracedAddData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConnection createTracedConnection() {
		TracedConnectionImpl tracedConnection = new TracedConnectionImpl();
		return tracedConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedEvent createTracedEvent() {
		TracedEventImpl tracedEvent = new TracedEventImpl();
		return tracedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedHeader createTracedHeader() {
		TracedHeaderImpl tracedHeader = new TracedHeaderImpl();
		return tracedHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedJump createTracedJump() {
		TracedJumpImpl tracedJump = new TracedJumpImpl();
		return tracedJump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSelectionConvergence createTracedSelectionConvergence() {
		TracedSelectionConvergenceImpl tracedSelectionConvergence = new TracedSelectionConvergenceImpl();
		return tracedSelectionConvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSelectionDivergence createTracedSelectionDivergence() {
		TracedSelectionDivergenceImpl tracedSelectionDivergence = new TracedSelectionDivergenceImpl();
		return tracedSelectionDivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSimultaneousConvergence createTracedSimultaneousConvergence() {
		TracedSimultaneousConvergenceImpl tracedSimultaneousConvergence = new TracedSimultaneousConvergenceImpl();
		return tracedSimultaneousConvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSimultaneousDivergence createTracedSimultaneousDivergence() {
		TracedSimultaneousDivergenceImpl tracedSimultaneousDivergence = new TracedSimultaneousDivergenceImpl();
		return tracedSimultaneousDivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedState createTracedState() {
		TracedStateImpl tracedState = new TracedStateImpl();
		return tracedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStateTransition createTracedStateTransition() {
		TracedStateTransitionImpl tracedStateTransition = new TracedStateTransitionImpl();
		return tracedStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariable createTracedVariable() {
		TracedVariableImpl tracedVariable = new TracedVariableImpl();
		return tracedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImlPackage getImlPackage() {
		return (ImlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImlPackage getPackage() {
		return ImlPackage.eINSTANCE;
	}

} //ImlFactoryImpl
