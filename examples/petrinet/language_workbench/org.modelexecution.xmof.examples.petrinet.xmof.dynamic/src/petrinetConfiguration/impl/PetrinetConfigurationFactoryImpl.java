/**
 */
package petrinetConfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetConfiguration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetConfigurationFactoryImpl extends EFactoryImpl implements PetrinetConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetConfigurationFactory init() {
		try {
			PetrinetConfigurationFactory thePetrinetConfigurationFactory = (PetrinetConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(PetrinetConfigurationPackage.eNS_URI);
			if (thePetrinetConfigurationFactory != null) {
				return thePetrinetConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetConfigurationFactoryImpl() {
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
			case PetrinetConfigurationPackage.NET_CONFIGURATION: return createNetConfiguration();
			case PetrinetConfigurationPackage.PLACE_CONFIGURATION: return createPlaceConfiguration();
			case PetrinetConfigurationPackage.TRANSITION_CONFIGURATION: return createTransitionConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetConfiguration createNetConfiguration() {
		NetConfigurationImpl netConfiguration = new NetConfigurationImpl();
		return netConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceConfiguration createPlaceConfiguration() {
		PlaceConfigurationImpl placeConfiguration = new PlaceConfigurationImpl();
		return placeConfiguration;
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
	public PetrinetConfigurationPackage getPetrinetConfigurationPackage() {
		return (PetrinetConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetConfigurationPackage getPackage() {
		return PetrinetConfigurationPackage.eINSTANCE;
	}

} //PetrinetConfigurationFactoryImpl
