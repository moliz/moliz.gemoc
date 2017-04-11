/**
 */
package fsmConfigurationTrace.States.fsmConfiguration.impl;

import fsmConfigurationTrace.States.fsmConfiguration.*;

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
			case FsmConfigurationPackage.TRACED_FSM_CONFIGURATION: return createTracedFSMConfiguration();
			case FsmConfigurationPackage.TRACED_INPUT: return createTracedInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFSMConfiguration createTracedFSMConfiguration() {
		TracedFSMConfigurationImpl tracedFSMConfiguration = new TracedFSMConfigurationImpl();
		return tracedFSMConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInput createTracedInput() {
		TracedInputImpl tracedInput = new TracedInputImpl();
		return tracedInput;
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
