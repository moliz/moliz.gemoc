/**
 */
package petrinet2Configuration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinet2Configuration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinet2ConfigurationFactoryImpl extends EFactoryImpl implements Petrinet2ConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Petrinet2ConfigurationFactory init() {
		try {
			Petrinet2ConfigurationFactory thePetrinet2ConfigurationFactory = (Petrinet2ConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(Petrinet2ConfigurationPackage.eNS_URI);
			if (thePetrinet2ConfigurationFactory != null) {
				return thePetrinet2ConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Petrinet2ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet2ConfigurationFactoryImpl() {
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
			case Petrinet2ConfigurationPackage.NET_CONFIGURATION: return createNetConfiguration();
			case Petrinet2ConfigurationPackage.PLACE_CONFIGURATION: return createPlaceConfiguration();
			case Petrinet2ConfigurationPackage.TRANSITION_CONFIGURATION: return createTransitionConfiguration();
			case Petrinet2ConfigurationPackage.TOKEN_DISTRIBUTION: return createTokenDistribution();
			case Petrinet2ConfigurationPackage.TOKEN: return createToken();
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
	public TokenDistribution createTokenDistribution() {
		TokenDistributionImpl tokenDistribution = new TokenDistributionImpl();
		return tokenDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet2ConfigurationPackage getPetrinet2ConfigurationPackage() {
		return (Petrinet2ConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Petrinet2ConfigurationPackage getPackage() {
		return Petrinet2ConfigurationPackage.eINSTANCE;
	}

} //Petrinet2ConfigurationFactoryImpl
