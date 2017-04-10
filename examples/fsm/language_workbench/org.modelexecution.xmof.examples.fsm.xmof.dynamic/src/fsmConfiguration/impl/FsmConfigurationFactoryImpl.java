/**
 */
package fsmConfiguration.impl;

import fsmConfiguration.*;

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
public class FsmConfigurationFactoryImpl extends EFactoryImpl implements FsmConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FsmConfigurationFactory init() {
		try {
			FsmConfigurationFactory theFsmConfigurationFactory = (FsmConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(FsmConfigurationPackage.eNS_URI);
			if (theFsmConfigurationFactory != null) {
				return theFsmConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FsmConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfigurationFactoryImpl() {
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
			case FsmConfigurationPackage.FSM_CONFIGURATION: return createFSMConfiguration();
			case FsmConfigurationPackage.STATE_CONFIGURATION: return createStateConfiguration();
			case FsmConfigurationPackage.TRANSITION_CONFIGURATION: return createTransitionConfiguration();
			case FsmConfigurationPackage.INPUT: return createInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMConfiguration createFSMConfiguration() {
		FSMConfigurationImpl fsmConfiguration = new FSMConfigurationImpl();
		return fsmConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateConfiguration createStateConfiguration() {
		StateConfigurationImpl stateConfiguration = new StateConfigurationImpl();
		return stateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionConfiguration createTransitionConfiguration() {
		TransitionConfigurationImpl transitionConfiguration = new TransitionConfigurationImpl();
		return transitionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfigurationPackage getFsmConfigurationPackage() {
		return (FsmConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FsmConfigurationPackage getPackage() {
		return FsmConfigurationPackage.eINSTANCE;
	}

} //FsmConfigurationFactoryImpl
