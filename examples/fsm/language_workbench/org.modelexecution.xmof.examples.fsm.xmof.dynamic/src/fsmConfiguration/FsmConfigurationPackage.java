/**
 */
package fsmConfiguration;

import fsm.FsmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fsmConfiguration.FsmConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface FsmConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsmConfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fsm/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsmConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmConfigurationPackage eINSTANCE = fsmConfiguration.impl.FsmConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmConfiguration.impl.FSMConfigurationImpl <em>FSM Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfiguration.impl.FSMConfigurationImpl
	 * @see fsmConfiguration.impl.FsmConfigurationPackageImpl#getFSMConfiguration()
	 * @generated
	 */
	int FSM_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION__NAME = FsmPackage.FSM__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION__STATES = FsmPackage.FSM__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION__TRANSITIONS = FsmPackage.FSM__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION__INITIAL_STATE = FsmPackage.FSM__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION__CURRENT_STATE = FsmPackage.FSM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produced Sequence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION__PRODUCED_SEQUENCE = FsmPackage.FSM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accepted Sequence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION__ACCEPTED_SEQUENCE = FsmPackage.FSM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FSM Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FEATURE_COUNT = FsmPackage.FSM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmConfiguration.impl.StateConfigurationImpl <em>State Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfiguration.impl.StateConfigurationImpl
	 * @see fsmConfiguration.impl.FsmConfigurationPackageImpl#getStateConfiguration()
	 * @generated
	 */
	int STATE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONFIGURATION__NAME = FsmPackage.STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONFIGURATION__OUTGOING_TRANSITIONS = FsmPackage.STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONFIGURATION__INCOMING_TRANSITIONS = FsmPackage.STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Containing FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONFIGURATION__CONTAINING_FSM = FsmPackage.STATE__CONTAINING_FSM;

	/**
	 * The number of structural features of the '<em>State Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONFIGURATION_FEATURE_COUNT = FsmPackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfiguration.impl.TransitionConfigurationImpl <em>Transition Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfiguration.impl.TransitionConfigurationImpl
	 * @see fsmConfiguration.impl.FsmConfigurationPackageImpl#getTransitionConfiguration()
	 * @generated
	 */
	int TRANSITION_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__INPUT = FsmPackage.TRANSITION__INPUT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__TARGET = FsmPackage.TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__OUTPUT = FsmPackage.TRANSITION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__SOURCE = FsmPackage.TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Containing FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION__CONTAINING_FSM = FsmPackage.TRANSITION__CONTAINING_FSM;

	/**
	 * The number of structural features of the '<em>Transition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CONFIGURATION_FEATURE_COUNT = FsmPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfiguration.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfiguration.impl.InputImpl
	 * @see fsmConfiguration.impl.FsmConfigurationPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 3;

	/**
	 * The feature id for the '<em><b>String Seq</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__STRING_SEQ = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link fsmConfiguration.FSMConfiguration <em>FSM Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Configuration</em>'.
	 * @see fsmConfiguration.FSMConfiguration
	 * @generated
	 */
	EClass getFSMConfiguration();

	/**
	 * Returns the meta object for the reference '{@link fsmConfiguration.FSMConfiguration#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see fsmConfiguration.FSMConfiguration#getCurrentState()
	 * @see #getFSMConfiguration()
	 * @generated
	 */
	EReference getFSMConfiguration_CurrentState();

	/**
	 * Returns the meta object for the attribute list '{@link fsmConfiguration.FSMConfiguration#getProducedSequence <em>Produced Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produced Sequence</em>'.
	 * @see fsmConfiguration.FSMConfiguration#getProducedSequence()
	 * @see #getFSMConfiguration()
	 * @generated
	 */
	EAttribute getFSMConfiguration_ProducedSequence();

	/**
	 * Returns the meta object for the attribute list '{@link fsmConfiguration.FSMConfiguration#getAcceptedSequence <em>Accepted Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Sequence</em>'.
	 * @see fsmConfiguration.FSMConfiguration#getAcceptedSequence()
	 * @see #getFSMConfiguration()
	 * @generated
	 */
	EAttribute getFSMConfiguration_AcceptedSequence();

	/**
	 * Returns the meta object for class '{@link fsmConfiguration.StateConfiguration <em>State Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Configuration</em>'.
	 * @see fsmConfiguration.StateConfiguration
	 * @generated
	 */
	EClass getStateConfiguration();

	/**
	 * Returns the meta object for class '{@link fsmConfiguration.TransitionConfiguration <em>Transition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Configuration</em>'.
	 * @see fsmConfiguration.TransitionConfiguration
	 * @generated
	 */
	EClass getTransitionConfiguration();

	/**
	 * Returns the meta object for class '{@link fsmConfiguration.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see fsmConfiguration.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute list '{@link fsmConfiguration.Input#getStringSeq <em>String Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Seq</em>'.
	 * @see fsmConfiguration.Input#getStringSeq()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_StringSeq();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmConfigurationFactory getFsmConfigurationFactory();

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
		 * The meta object literal for the '{@link fsmConfiguration.impl.FSMConfigurationImpl <em>FSM Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfiguration.impl.FSMConfigurationImpl
		 * @see fsmConfiguration.impl.FsmConfigurationPackageImpl#getFSMConfiguration()
		 * @generated
		 */
		EClass FSM_CONFIGURATION = eINSTANCE.getFSMConfiguration();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM_CONFIGURATION__CURRENT_STATE = eINSTANCE.getFSMConfiguration_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Produced Sequence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM_CONFIGURATION__PRODUCED_SEQUENCE = eINSTANCE.getFSMConfiguration_ProducedSequence();

		/**
		 * The meta object literal for the '<em><b>Accepted Sequence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM_CONFIGURATION__ACCEPTED_SEQUENCE = eINSTANCE.getFSMConfiguration_AcceptedSequence();

		/**
		 * The meta object literal for the '{@link fsmConfiguration.impl.StateConfigurationImpl <em>State Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfiguration.impl.StateConfigurationImpl
		 * @see fsmConfiguration.impl.FsmConfigurationPackageImpl#getStateConfiguration()
		 * @generated
		 */
		EClass STATE_CONFIGURATION = eINSTANCE.getStateConfiguration();

		/**
		 * The meta object literal for the '{@link fsmConfiguration.impl.TransitionConfigurationImpl <em>Transition Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfiguration.impl.TransitionConfigurationImpl
		 * @see fsmConfiguration.impl.FsmConfigurationPackageImpl#getTransitionConfiguration()
		 * @generated
		 */
		EClass TRANSITION_CONFIGURATION = eINSTANCE.getTransitionConfiguration();

		/**
		 * The meta object literal for the '{@link fsmConfiguration.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfiguration.impl.InputImpl
		 * @see fsmConfiguration.impl.FsmConfigurationPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>String Seq</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__STRING_SEQ = eINSTANCE.getInput_StringSeq();

	}

} //FsmConfigurationPackage
