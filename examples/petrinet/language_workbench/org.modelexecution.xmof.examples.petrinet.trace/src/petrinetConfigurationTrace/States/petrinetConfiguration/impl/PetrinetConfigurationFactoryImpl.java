/**
 */
package petrinetConfigurationTrace.States.petrinetConfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetConfigurationTrace.States.petrinetConfiguration.*;

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
			case PetrinetConfigurationPackage.TRACED_PLACE_CONFIGURATION: return createTracedPlaceConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPlaceConfiguration createTracedPlaceConfiguration() {
		TracedPlaceConfigurationImpl tracedPlaceConfiguration = new TracedPlaceConfigurationImpl();
		return tracedPlaceConfiguration;
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
