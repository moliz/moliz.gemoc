/**
 */
package petrinetConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
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
	 * The operation id for the '<em>Main</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int NET_CONFIGURATION___MAIN = 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int NET_CONFIGURATION___RUN = 1;

	/**
	 * The number of operations of the '<em>Net Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int NET_CONFIGURATION_OPERATION_COUNT = 2;

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
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int PLACE_CONFIGURATION___REMOVE_TOKEN = 0;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int PLACE_CONFIGURATION___ADD_TOKEN = 1;

	/**
	 * The number of operations of the '<em>Place Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int PLACE_CONFIGURATION_OPERATION_COUNT = 2;

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
	 * The operation id for the '<em>Is Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION___IS_ENABLED = 0;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION___FIRE = 1;

	/**
	 * The number of operations of the '<em>Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION_OPERATION_COUNT = 2;


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
	 * Returns the meta object for the '{@link petrinetConfiguration.NetConfiguration#main() <em>Main</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Main</em>' operation.
	 * @see petrinetConfiguration.NetConfiguration#main()
	 * @generated
	 */
	EOperation getNetConfiguration__Main();

	/**
	 * Returns the meta object for the '{@link petrinetConfiguration.NetConfiguration#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see petrinetConfiguration.NetConfiguration#run()
	 * @generated
	 */
	EOperation getNetConfiguration__Run();

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
	 * Returns the meta object for the '{@link petrinetConfiguration.PlaceConfiguration#removeToken() <em>Remove Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Token</em>' operation.
	 * @see petrinetConfiguration.PlaceConfiguration#removeToken()
	 * @generated
	 */
	EOperation getPlaceConfiguration__RemoveToken();

	/**
	 * Returns the meta object for the '{@link petrinetConfiguration.PlaceConfiguration#addToken() <em>Add Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Token</em>' operation.
	 * @see petrinetConfiguration.PlaceConfiguration#addToken()
	 * @generated
	 */
	EOperation getPlaceConfiguration__AddToken();

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
	 * Returns the meta object for the '{@link petrinetConfiguration.TransitionConfiguration#isEnabled() <em>Is Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Enabled</em>' operation.
	 * @see petrinetConfiguration.TransitionConfiguration#isEnabled()
	 * @generated
	 */
	EOperation getTransitionConfiguration__IsEnabled();

	/**
	 * Returns the meta object for the '{@link petrinetConfiguration.TransitionConfiguration#fire() <em>Fire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire</em>' operation.
	 * @see petrinetConfiguration.TransitionConfiguration#fire()
	 * @generated
	 */
	EOperation getTransitionConfiguration__Fire();

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
	 *   <li>each operation of each class,</li>
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
		 * The meta object literal for the '<em><b>Main</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NET_CONFIGURATION___MAIN = eINSTANCE.getNetConfiguration__Main();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NET_CONFIGURATION___RUN = eINSTANCE.getNetConfiguration__Run();

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
		 * The meta object literal for the '<em><b>Remove Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE_CONFIGURATION___REMOVE_TOKEN = eINSTANCE.getPlaceConfiguration__RemoveToken();

		/**
		 * The meta object literal for the '<em><b>Add Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE_CONFIGURATION___ADD_TOKEN = eINSTANCE.getPlaceConfiguration__AddToken();

		/**
		 * The meta object literal for the '{@link petrinetConfiguration.impl.TransitionConfigurationImpl <em>Transition Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfiguration.impl.TransitionConfigurationImpl
		 * @see petrinetConfiguration.impl.PetrinetConfigurationPackageImpl#getTransitionConfiguration()
		 * @generated
		 */
		EClass TRANSITION_CONFIGURATION = eINSTANCE.getTransitionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Is Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_CONFIGURATION___IS_ENABLED = eINSTANCE.getTransitionConfiguration__IsEnabled();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_CONFIGURATION___FIRE = eINSTANCE.getTransitionConfiguration__Fire();

	}

} //PetrinetConfigurationPackage
