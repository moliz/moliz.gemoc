/**
 */
package petrinet2Configuration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import petrinet2.Petrinet2Package;

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
 * @see petrinet2Configuration.Petrinet2ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface Petrinet2ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinet2Configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinet2/1.0/configuration";

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
	Petrinet2ConfigurationPackage eINSTANCE = petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinet2Configuration.impl.NetConfigurationImpl <em>Net Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet2Configuration.impl.NetConfigurationImpl
	 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getNetConfiguration()
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
	int NET_CONFIGURATION__PLACES = Petrinet2Package.NET__PLACES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION__TRANSITIONS = Petrinet2Package.NET__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION__NAME = Petrinet2Package.NET__NAME;

	/**
	 * The number of structural features of the '<em>Net Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION_FEATURE_COUNT = Petrinet2Package.NET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION___RUN = 0;

	/**
	 * The operation id for the '<em>Main</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION___MAIN__ELIST = 1;

	/**
	 * The operation id for the '<em>Initialize Marking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION___INITIALIZE_MARKING__ELIST = 2;

	/**
	 * The number of operations of the '<em>Net Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONFIGURATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link petrinet2Configuration.impl.PlaceConfigurationImpl <em>Place Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet2Configuration.impl.PlaceConfigurationImpl
	 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getPlaceConfiguration()
	 * @generated
	 */
	int PLACE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION__NAME = Petrinet2Package.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION__HELD_TOKENS = Petrinet2Package.PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_FEATURE_COUNT = Petrinet2Package.PLACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION___ADD_TOKEN = 0;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION___REMOVE_TOKEN = 1;

	/**
	 * The number of operations of the '<em>Place Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_CONFIGURATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link petrinet2Configuration.impl.TransitionConfigurationImpl <em>Transition Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet2Configuration.impl.TransitionConfigurationImpl
	 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getTransitionConfiguration()
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
	int TRANSITION_CONFIGURATION__INPUT = Petrinet2Package.TRANSITION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__OUTPUT = Petrinet2Package.TRANSITION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__NAME = Petrinet2Package.TRANSITION__NAME;

	/**
	 * The number of structural features of the '<em>Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION_FEATURE_COUNT = Petrinet2Package.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION___FIRE = 0;

	/**
	 * The operation id for the '<em>Is Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION___IS_ENABLED = 1;

	/**
	 * The number of operations of the '<em>Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link petrinet2Configuration.impl.TokenDistributionImpl <em>Token Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet2Configuration.impl.TokenDistributionImpl
	 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getTokenDistribution()
	 * @generated
	 */
	int TOKEN_DISTRIBUTION = 3;

	/**
	 * The feature id for the '<em><b>Initial Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_DISTRIBUTION__INITIAL_TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Token Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_DISTRIBUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinet2Configuration.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet2Configuration.impl.TokenImpl
	 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Holding Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__HOLDING_PLACE = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinet2Configuration.NetConfiguration <em>Net Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Configuration</em>'.
	 * @see petrinet2Configuration.NetConfiguration
	 * @generated
	 */
	EClass getNetConfiguration();

	/**
	 * Returns the meta object for the '{@link petrinet2Configuration.NetConfiguration#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see petrinet2Configuration.NetConfiguration#run()
	 * @generated
	 */
	EOperation getNetConfiguration__Run();

	/**
	 * Returns the meta object for the '{@link petrinet2Configuration.NetConfiguration#main(org.eclipse.emf.common.util.EList) <em>Main</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Main</em>' operation.
	 * @see petrinet2Configuration.NetConfiguration#main(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNetConfiguration__Main__EList();

	/**
	 * Returns the meta object for the '{@link petrinet2Configuration.NetConfiguration#initializeMarking(org.eclipse.emf.common.util.EList) <em>Initialize Marking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Marking</em>' operation.
	 * @see petrinet2Configuration.NetConfiguration#initializeMarking(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNetConfiguration__InitializeMarking__EList();

	/**
	 * Returns the meta object for class '{@link petrinet2Configuration.PlaceConfiguration <em>Place Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Configuration</em>'.
	 * @see petrinet2Configuration.PlaceConfiguration
	 * @generated
	 */
	EClass getPlaceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinet2Configuration.PlaceConfiguration#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens</em>'.
	 * @see petrinet2Configuration.PlaceConfiguration#getHeldTokens()
	 * @see #getPlaceConfiguration()
	 * @generated
	 */
	EReference getPlaceConfiguration_HeldTokens();

	/**
	 * Returns the meta object for the '{@link petrinet2Configuration.PlaceConfiguration#addToken() <em>Add Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Token</em>' operation.
	 * @see petrinet2Configuration.PlaceConfiguration#addToken()
	 * @generated
	 */
	EOperation getPlaceConfiguration__AddToken();

	/**
	 * Returns the meta object for the '{@link petrinet2Configuration.PlaceConfiguration#removeToken() <em>Remove Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Token</em>' operation.
	 * @see petrinet2Configuration.PlaceConfiguration#removeToken()
	 * @generated
	 */
	EOperation getPlaceConfiguration__RemoveToken();

	/**
	 * Returns the meta object for class '{@link petrinet2Configuration.TransitionConfiguration <em>Transition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Configuration</em>'.
	 * @see petrinet2Configuration.TransitionConfiguration
	 * @generated
	 */
	EClass getTransitionConfiguration();

	/**
	 * Returns the meta object for the '{@link petrinet2Configuration.TransitionConfiguration#fire() <em>Fire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire</em>' operation.
	 * @see petrinet2Configuration.TransitionConfiguration#fire()
	 * @generated
	 */
	EOperation getTransitionConfiguration__Fire();

	/**
	 * Returns the meta object for the '{@link petrinet2Configuration.TransitionConfiguration#isEnabled() <em>Is Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Enabled</em>' operation.
	 * @see petrinet2Configuration.TransitionConfiguration#isEnabled()
	 * @generated
	 */
	EOperation getTransitionConfiguration__IsEnabled();

	/**
	 * Returns the meta object for class '{@link petrinet2Configuration.TokenDistribution <em>Token Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Distribution</em>'.
	 * @see petrinet2Configuration.TokenDistribution
	 * @generated
	 */
	EClass getTokenDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinet2Configuration.TokenDistribution#getInitialTokens <em>Initial Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Tokens</em>'.
	 * @see petrinet2Configuration.TokenDistribution#getInitialTokens()
	 * @see #getTokenDistribution()
	 * @generated
	 */
	EReference getTokenDistribution_InitialTokens();

	/**
	 * Returns the meta object for class '{@link petrinet2Configuration.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see petrinet2Configuration.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link petrinet2Configuration.Token#getHoldingPlace <em>Holding Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holding Place</em>'.
	 * @see petrinet2Configuration.Token#getHoldingPlace()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_HoldingPlace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Petrinet2ConfigurationFactory getPetrinet2ConfigurationFactory();

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
		 * The meta object literal for the '{@link petrinet2Configuration.impl.NetConfigurationImpl <em>Net Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet2Configuration.impl.NetConfigurationImpl
		 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getNetConfiguration()
		 * @generated
		 */
		EClass NET_CONFIGURATION = eINSTANCE.getNetConfiguration();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NET_CONFIGURATION___RUN = eINSTANCE.getNetConfiguration__Run();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NET_CONFIGURATION___MAIN__ELIST = eINSTANCE.getNetConfiguration__Main__EList();

		/**
		 * The meta object literal for the '<em><b>Initialize Marking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NET_CONFIGURATION___INITIALIZE_MARKING__ELIST = eINSTANCE.getNetConfiguration__InitializeMarking__EList();

		/**
		 * The meta object literal for the '{@link petrinet2Configuration.impl.PlaceConfigurationImpl <em>Place Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet2Configuration.impl.PlaceConfigurationImpl
		 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getPlaceConfiguration()
		 * @generated
		 */
		EClass PLACE_CONFIGURATION = eINSTANCE.getPlaceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_CONFIGURATION__HELD_TOKENS = eINSTANCE.getPlaceConfiguration_HeldTokens();

		/**
		 * The meta object literal for the '<em><b>Add Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE_CONFIGURATION___ADD_TOKEN = eINSTANCE.getPlaceConfiguration__AddToken();

		/**
		 * The meta object literal for the '<em><b>Remove Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE_CONFIGURATION___REMOVE_TOKEN = eINSTANCE.getPlaceConfiguration__RemoveToken();

		/**
		 * The meta object literal for the '{@link petrinet2Configuration.impl.TransitionConfigurationImpl <em>Transition Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet2Configuration.impl.TransitionConfigurationImpl
		 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getTransitionConfiguration()
		 * @generated
		 */
		EClass TRANSITION_CONFIGURATION = eINSTANCE.getTransitionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_CONFIGURATION___FIRE = eINSTANCE.getTransitionConfiguration__Fire();

		/**
		 * The meta object literal for the '<em><b>Is Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_CONFIGURATION___IS_ENABLED = eINSTANCE.getTransitionConfiguration__IsEnabled();

		/**
		 * The meta object literal for the '{@link petrinet2Configuration.impl.TokenDistributionImpl <em>Token Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet2Configuration.impl.TokenDistributionImpl
		 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getTokenDistribution()
		 * @generated
		 */
		EClass TOKEN_DISTRIBUTION = eINSTANCE.getTokenDistribution();

		/**
		 * The meta object literal for the '<em><b>Initial Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_DISTRIBUTION__INITIAL_TOKENS = eINSTANCE.getTokenDistribution_InitialTokens();

		/**
		 * The meta object literal for the '{@link petrinet2Configuration.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet2Configuration.impl.TokenImpl
		 * @see petrinet2Configuration.impl.Petrinet2ConfigurationPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Holding Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__HOLDING_PLACE = eINSTANCE.getToken_HoldingPlace();

	}

} //Petrinet2ConfigurationPackage
