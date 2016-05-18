/**
 */
package umlTrace.States.fumlConfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlTrace.States.fumlConfiguration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FumlConfigurationFactoryImpl extends EFactoryImpl implements FumlConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FumlConfigurationFactory init() {
		try {
			FumlConfigurationFactory theFumlConfigurationFactory = (FumlConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(FumlConfigurationPackage.eNS_URI);
			if (theFumlConfigurationFactory != null) {
				return theFumlConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FumlConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationFactoryImpl() {
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
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION: return createTracedElementConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedElementConfiguration createTracedElementConfiguration() {
		TracedElementConfigurationImpl tracedElementConfiguration = new TracedElementConfigurationImpl();
		return tracedElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationPackage getFumlConfigurationPackage() {
		return (FumlConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FumlConfigurationPackage getPackage() {
		return FumlConfigurationPackage.eINSTANCE;
	}

} //FumlConfigurationFactoryImpl
