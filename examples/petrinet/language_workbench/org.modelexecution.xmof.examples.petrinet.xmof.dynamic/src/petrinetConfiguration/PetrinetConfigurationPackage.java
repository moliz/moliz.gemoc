/**
 */
package petrinetConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petrinetConfiguration.PetrinetConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetConfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinet/1.0/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetConfigurationPackage eINSTANCE = petrinetConfiguration.impl.PetrinetConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetConfiguration.impl.NetConfigurationImpl <em>Net Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfiguration.impl.NetConfigurationImpl
	 * @see petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getNetConfiguration()
	 * @generated
	 */
	int NET_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION__PLACES = PetrinetPackage.NET__PLACES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION__TRANSITIONS = PetrinetPackage.NET__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION__NAME = PetrinetPackage.NET__NAME;

	/**
	 * The number of structural features of the '<em>Net Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION_FEATURE_COUNT = PetrinetPackage.NET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetConfiguration.impl.PlaceConfigurationImpl <em>Place Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfiguration.impl.PlaceConfigurationImpl
	 * @see petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getPlaceConfiguration()
	 * @generated
	 */
	int PLACE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Initial Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION__INITIAL_TOKENS = PetrinetPackage.PLACE__INITIAL_TOKENS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION__NAME = PetrinetPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION__TOKENS = PetrinetPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_FEATURE_COUNT = PetrinetPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetConfiguration.impl.TransitionConfigurationImpl <em>Transition Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfiguration.impl.TransitionConfigurationImpl
	 * @see petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getTransitionConfiguration()
	 * @generated
	 */
	int TRANSITION_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__INPUT = PetrinetPackage.TRANSITION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__OUTPUT = PetrinetPackage.TRANSITION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__NAME = PetrinetPackage.TRANSITION__NAME;

	/**
	 * The number of structural features of the '<em>Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION_FEATURE_COUNT = PetrinetPackage.TRANSITION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link petrinetConfiguration.NetConfiguration <em>Net Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Configuration</em>'.
	 * @see petrinetConfiguration.NetConfiguration
	 * @generated
	 */
	EClass getNetConfiguration();

	/**
	 * Returns the meta object for class '{@link petrinetConfiguration.PlaceConfiguration <em>Place Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Configuration</em>'.
	 * @see petrinetConfiguration.PlaceConfiguration
	 * @generated
	 */
	EClass getPlaceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link petrinetConfiguration.PlaceConfiguration#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see petrinetConfiguration.PlaceConfiguration#getTokens()
	 * @see #getPlaceConfiguration()
	 * @generated
	 */
	EAttribute getPlaceConfiguration_Tokens();

	/**
	 * Returns the meta object for class '{@link petrinetConfiguration.TransitionConfiguration <em>Transition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Configuration</em>'.
	 * @see petrinetConfiguration.TransitionConfiguration
	 * @generated
	 */
	EClass getTransitionConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetConfigurationFactory getPetrinetConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petrinetConfiguration.impl.NetConfigurationImpl <em>Net Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfiguration.impl.NetConfigurationImpl
		 * @see petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getNetConfiguration()
		 * @generated
		 */
		EClass NET_CONFIGURATION = eINSTANCE.getNetConfiguration();

		/**
		 * The meta object literal for the '{@link petrinetConfiguration.impl.PlaceConfigurationImpl <em>Place Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfiguration.impl.PlaceConfigurationImpl
		 * @see petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getPlaceConfiguration()
		 * @generated
		 */
		EClass PLACE_CONFIGURATION = eINSTANCE.getPlaceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_CONFIGURATION__TOKENS = eINSTANCE.getPlaceConfiguration_Tokens();

		/**
		 * The meta object literal for the '{@link petrinetConfiguration.impl.TransitionConfigurationImpl <em>Transition Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfiguration.impl.TransitionConfigurationImpl
		 * @see petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getTransitionConfiguration()
		 * @generated
		 */
		EClass TRANSITION_CONFIGURATION = eINSTANCE.getTransitionConfiguration();

	}

} //PetrinetConfigurationPackage
