/**
 */
package fsmConfigurationTrace.States.fsmConfiguration;

import fsmConfigurationTrace.States.StatesPackage;

import fsmConfigurationTrace.States.fsm.FsmPackage;

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
 * @see fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationFactory
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
	String eNS_URI = "fsmConfigurationTrace_fsmConfiguration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmConfigurationPackage eINSTANCE = fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedFSMConfigurationImpl <em>Traced FSM Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.fsmConfiguration.impl.TracedFSMConfigurationImpl
	 * @see fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl#getTracedFSMConfiguration()
	 * @generated
	 */
	int TRACED_FSM_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM_CONFIGURATION__DIMENSIONS = FsmPackage.TRACED_FSM__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object FSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM_CONFIGURATION__ORIGINAL_OBJECT_FSM = FsmPackage.TRACED_FSM__ORIGINAL_OBJECT_FSM;

	/**
	 * The feature id for the '<em><b>FSM Configuration accepted Sequence Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION = FsmPackage.TRACED_FSM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FSM Configuration current State Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION = FsmPackage.TRACED_FSM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>FSM Configuration produced Sequence Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION = FsmPackage.TRACED_FSM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced FSM Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM_CONFIGURATION_FEATURE_COUNT = FsmPackage.TRACED_FSM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedInputImpl <em>Traced Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.States.fsmConfiguration.impl.TracedInputImpl
	 * @see fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl#getTracedInput()
	 * @generated
	 */
	int TRACED_INPUT = 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Input string Seq Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__ORIGINAL_OBJECT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration <em>Traced FSM Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced FSM Configuration</em>'.
	 * @see fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration
	 * @generated
	 */
	EClass getTracedFSMConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_acceptedSequence_Dimension <em>FSM Configuration accepted Sequence Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FSM Configuration accepted Sequence Dimension</em>'.
	 * @see fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_acceptedSequence_Dimension()
	 * @see #getTracedFSMConfiguration()
	 * @generated
	 */
	EReference getTracedFSMConfiguration_FSMConfiguration_acceptedSequence_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_currentState_Dimension <em>FSM Configuration current State Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FSM Configuration current State Dimension</em>'.
	 * @see fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_currentState_Dimension()
	 * @see #getTracedFSMConfiguration()
	 * @generated
	 */
	EReference getTracedFSMConfiguration_FSMConfiguration_currentState_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_producedSequence_Dimension <em>FSM Configuration produced Sequence Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FSM Configuration produced Sequence Dimension</em>'.
	 * @see fsmConfigurationTrace.States.fsmConfiguration.TracedFSMConfiguration#getFSMConfiguration_producedSequence_Dimension()
	 * @see #getTracedFSMConfiguration()
	 * @generated
	 */
	EReference getTracedFSMConfiguration_FSMConfiguration_producedSequence_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedInput <em>Traced Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Input</em>'.
	 * @see fsmConfigurationTrace.States.fsmConfiguration.TracedInput
	 * @generated
	 */
	EClass getTracedInput();

	/**
	 * Returns the meta object for the containment reference '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedInput#getInput_stringSeq_Dimension <em>Input string Seq Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input string Seq Dimension</em>'.
	 * @see fsmConfigurationTrace.States.fsmConfiguration.TracedInput#getInput_stringSeq_Dimension()
	 * @see #getTracedInput()
	 * @generated
	 */
	EReference getTracedInput_Input_stringSeq_Dimension();

	/**
	 * Returns the meta object for the reference '{@link fsmConfigurationTrace.States.fsmConfiguration.TracedInput#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see fsmConfigurationTrace.States.fsmConfiguration.TracedInput#getOriginalObject()
	 * @see #getTracedInput()
	 * @generated
	 */
	EReference getTracedInput_OriginalObject();

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
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedFSMConfigurationImpl <em>Traced FSM Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.fsmConfiguration.impl.TracedFSMConfigurationImpl
		 * @see fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl#getTracedFSMConfiguration()
		 * @generated
		 */
		EClass TRACED_FSM_CONFIGURATION = eINSTANCE.getTracedFSMConfiguration();

		/**
		 * The meta object literal for the '<em><b>FSM Configuration accepted Sequence Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_ACCEPTED_SEQUENCE_DIMENSION = eINSTANCE.getTracedFSMConfiguration_FSMConfiguration_acceptedSequence_Dimension();

		/**
		 * The meta object literal for the '<em><b>FSM Configuration current State Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_CURRENT_STATE_DIMENSION = eINSTANCE.getTracedFSMConfiguration_FSMConfiguration_currentState_Dimension();

		/**
		 * The meta object literal for the '<em><b>FSM Configuration produced Sequence Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM_CONFIGURATION__FSM_CONFIGURATION_PRODUCED_SEQUENCE_DIMENSION = eINSTANCE.getTracedFSMConfiguration_FSMConfiguration_producedSequence_Dimension();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedInputImpl <em>Traced Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.States.fsmConfiguration.impl.TracedInputImpl
		 * @see fsmConfigurationTrace.States.fsmConfiguration.impl.FsmConfigurationPackageImpl#getTracedInput()
		 * @generated
		 */
		EClass TRACED_INPUT = eINSTANCE.getTracedInput();

		/**
		 * The meta object literal for the '<em><b>Input string Seq Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION = eINSTANCE.getTracedInput_Input_stringSeq_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT__ORIGINAL_OBJECT = eINSTANCE.getTracedInput_OriginalObject();

	}

} //FsmConfigurationPackage
