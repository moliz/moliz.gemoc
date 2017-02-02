/**
 */
package petrinetConfigurationTrace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetConfigurationTrace.Steps.*;

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
			case StepsPackage.PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN: return createPetrinetConfiguration_NetConfiguration_Main();
			case StepsPackage.PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_IMPLICIT_STEP: return createPetrinetConfiguration_NetConfiguration_Main_ImplicitStep();
			case StepsPackage.PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN: return createPetrinetConfiguration_NetConfiguration_Run();
			case StepsPackage.PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP: return createPetrinetConfiguration_NetConfiguration_Run_ImplicitStep();
			case StepsPackage.PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE: return createPetrinetConfiguration_TransitionConfiguration_Fire();
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
	public PetrinetConfiguration_NetConfiguration_Main createPetrinetConfiguration_NetConfiguration_Main() {
		PetrinetConfiguration_NetConfiguration_MainImpl petrinetConfiguration_NetConfiguration_Main = new PetrinetConfiguration_NetConfiguration_MainImpl();
		return petrinetConfiguration_NetConfiguration_Main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetConfiguration_NetConfiguration_Main_ImplicitStep createPetrinetConfiguration_NetConfiguration_Main_ImplicitStep() {
		PetrinetConfiguration_NetConfiguration_Main_ImplicitStepImpl petrinetConfiguration_NetConfiguration_Main_ImplicitStep = new PetrinetConfiguration_NetConfiguration_Main_ImplicitStepImpl();
		return petrinetConfiguration_NetConfiguration_Main_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetConfiguration_NetConfiguration_Run createPetrinetConfiguration_NetConfiguration_Run() {
		PetrinetConfiguration_NetConfiguration_RunImpl petrinetConfiguration_NetConfiguration_Run = new PetrinetConfiguration_NetConfiguration_RunImpl();
		return petrinetConfiguration_NetConfiguration_Run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetConfiguration_NetConfiguration_Run_ImplicitStep createPetrinetConfiguration_NetConfiguration_Run_ImplicitStep() {
		PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl petrinetConfiguration_NetConfiguration_Run_ImplicitStep = new PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl();
		return petrinetConfiguration_NetConfiguration_Run_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetConfiguration_TransitionConfiguration_Fire createPetrinetConfiguration_TransitionConfiguration_Fire() {
		PetrinetConfiguration_TransitionConfiguration_FireImpl petrinetConfiguration_TransitionConfiguration_Fire = new PetrinetConfiguration_TransitionConfiguration_FireImpl();
		return petrinetConfiguration_TransitionConfiguration_Fire;
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
