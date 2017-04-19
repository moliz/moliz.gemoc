/**
 */
package fsmConfigurationTrace.Steps.impl;

import fsmConfigurationTrace.Steps.*;

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
			case StepsPackage.FSM_CONFIGURATION_FSM_CONFIGURATION_RUN: return createFsmConfiguration_FSMConfiguration_Run();
			case StepsPackage.FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP: return createFsmConfiguration_FSMConfiguration_Run_ImplicitStep();
			case StepsPackage.FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE: return createFsmConfiguration_TransitionConfiguration_Fire();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			case StepsPackage.SPECIFIC_ROOT_STEP: return createSpecificRootStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfiguration_FSMConfiguration_Run createFsmConfiguration_FSMConfiguration_Run() {
		FsmConfiguration_FSMConfiguration_RunImpl fsmConfiguration_FSMConfiguration_Run = new FsmConfiguration_FSMConfiguration_RunImpl();
		return fsmConfiguration_FSMConfiguration_Run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfiguration_FSMConfiguration_Run_ImplicitStep createFsmConfiguration_FSMConfiguration_Run_ImplicitStep() {
		FsmConfiguration_FSMConfiguration_Run_ImplicitStepImpl fsmConfiguration_FSMConfiguration_Run_ImplicitStep = new FsmConfiguration_FSMConfiguration_Run_ImplicitStepImpl();
		return fsmConfiguration_FSMConfiguration_Run_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfiguration_TransitionConfiguration_Fire createFsmConfiguration_TransitionConfiguration_Fire() {
		FsmConfiguration_TransitionConfiguration_FireImpl fsmConfiguration_TransitionConfiguration_Fire = new FsmConfiguration_TransitionConfiguration_FireImpl();
		return fsmConfiguration_TransitionConfiguration_Fire;
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
	public SpecificRootStep createSpecificRootStep() {
		SpecificRootStepImpl specificRootStep = new SpecificRootStepImpl();
		return specificRootStep;
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
