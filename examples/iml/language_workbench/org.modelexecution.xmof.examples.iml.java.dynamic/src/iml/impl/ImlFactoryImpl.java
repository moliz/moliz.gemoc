/**
 */
package iml.impl;

import iml.*;

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
			case ImlPackage.HEADER: return createHeader();
			case ImlPackage.COMMENT: return createComment();
			case ImlPackage.ADD_DATA: return createAddData();
			case ImlPackage.STATE: return createState();
			case ImlPackage.STATE_TRANSITION: return createStateTransition();
			case ImlPackage.JUMP: return createJump();
			case ImlPackage.ACTIVITY: return createActivity();
			case ImlPackage.VARIABLE: return createVariable();
			case ImlPackage.EVENT: return createEvent();
			case ImlPackage.SIMULTANEOUS_DIVERGENCE: return createSimultaneousDivergence();
			case ImlPackage.SIMULTANEOUS_CONVERGENCE: return createSimultaneousConvergence();
			case ImlPackage.SELECTION_DIVERGENCE: return createSelectionDivergence();
			case ImlPackage.SELECTION_CONVERGENCE: return createSelectionConvergence();
			case ImlPackage.CONNECTION: return createConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddData createAddData() {
		AddDataImpl addData = new AddDataImpl();
		return addData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition createStateTransition() {
		StateTransitionImpl stateTransition = new StateTransitionImpl();
		return stateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jump createJump() {
		JumpImpl jump = new JumpImpl();
		return jump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimultaneousDivergence createSimultaneousDivergence() {
		SimultaneousDivergenceImpl simultaneousDivergence = new SimultaneousDivergenceImpl();
		return simultaneousDivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimultaneousConvergence createSimultaneousConvergence() {
		SimultaneousConvergenceImpl simultaneousConvergence = new SimultaneousConvergenceImpl();
		return simultaneousConvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDivergence createSelectionDivergence() {
		SelectionDivergenceImpl selectionDivergence = new SelectionDivergenceImpl();
		return selectionDivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConvergence createSelectionConvergence() {
		SelectionConvergenceImpl selectionConvergence = new SelectionConvergenceImpl();
		return selectionConvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
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
