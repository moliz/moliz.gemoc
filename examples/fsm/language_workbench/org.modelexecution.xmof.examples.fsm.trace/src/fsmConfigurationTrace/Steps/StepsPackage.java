/**
 */
package fsmConfigurationTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see fsmConfigurationTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmConfigurationTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = fsmConfigurationTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.Steps.impl.SpecificStepImpl <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.Steps.impl.SpecificStepImpl
	 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.Steps.impl.FsmConfiguration_FSMConfiguration_RunImpl <em>Fsm Configuration FSM Configuration Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.Steps.impl.FsmConfiguration_FSMConfiguration_RunImpl
	 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getFsmConfiguration_FSMConfiguration_Run()
	 * @generated
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fsm Configuration FSM Configuration Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_AbstractSubStep <em>Fsm Configuration FSM Configuration Run Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_AbstractSubStep
	 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getFsmConfiguration_FSMConfiguration_Run_AbstractSubStep()
	 * @generated
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Configuration FSM Configuration Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.Steps.impl.FsmConfiguration_FSMConfiguration_Run_ImplicitStepImpl <em>Fsm Configuration FSM Configuration Run Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.Steps.impl.FsmConfiguration_FSMConfiguration_Run_ImplicitStepImpl
	 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getFsmConfiguration_FSMConfiguration_Run_ImplicitStep()
	 * @generated
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP__MSEOCCURRENCE = FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP__STARTING_STATE = FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP__ENDING_STATE = FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Configuration FSM Configuration Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP_FEATURE_COUNT = FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.Steps.impl.FsmConfiguration_TransitionConfiguration_FireImpl <em>Fsm Configuration Transition Configuration Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.Steps.impl.FsmConfiguration_TransitionConfiguration_FireImpl
	 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getFsmConfiguration_TransitionConfiguration_Fire()
	 * @generated
	 */
	int FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__MSEOCCURRENCE = FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__STARTING_STATE = FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__ENDING_STATE = FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Configuration Transition Configuration Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_FEATURE_COUNT = FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.Steps.impl.RootImplicitStepImpl
	 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__STARTING_STATE = TracePackage.SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__ENDING_STATE = TracePackage.SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmConfigurationTrace.Steps.impl.SpecificRootStepImpl <em>Specific Root Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmConfigurationTrace.Steps.impl.SpecificRootStepImpl
	 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getSpecificRootStep()
	 * @generated
	 */
	int SPECIFIC_ROOT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__MSEOCCURRENCE = TracePackage.SEQUENTIAL_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__STARTING_STATE = TracePackage.SEQUENTIAL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__ENDING_STATE = TracePackage.SEQUENTIAL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__SUB_STEPS = TracePackage.SEQUENTIAL_STEP__SUB_STEPS;

	/**
	 * The number of structural features of the '<em>Specific Root Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP_FEATURE_COUNT = TracePackage.SEQUENTIAL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run <em>Fsm Configuration FSM Configuration Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Configuration FSM Configuration Run</em>'.
	 * @see fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run
	 * @generated
	 */
	EClass getFsmConfiguration_FSMConfiguration_Run();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_AbstractSubStep <em>Fsm Configuration FSM Configuration Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Configuration FSM Configuration Run Abstract Sub Step</em>'.
	 * @see fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_AbstractSubStep
	 * @generated
	 */
	EClass getFsmConfiguration_FSMConfiguration_Run_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_ImplicitStep <em>Fsm Configuration FSM Configuration Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Configuration FSM Configuration Run Implicit Step</em>'.
	 * @see fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_ImplicitStep
	 * @generated
	 */
	EClass getFsmConfiguration_FSMConfiguration_Run_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire <em>Fsm Configuration Transition Configuration Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Configuration Transition Configuration Fire</em>'.
	 * @see fsmConfigurationTrace.Steps.FsmConfiguration_TransitionConfiguration_Fire
	 * @generated
	 */
	EClass getFsmConfiguration_TransitionConfiguration_Fire();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see fsmConfigurationTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.Steps.SpecificRootStep <em>Specific Root Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Root Step</em>'.
	 * @see fsmConfigurationTrace.Steps.SpecificRootStep
	 * @generated
	 */
	EClass getSpecificRootStep();

	/**
	 * Returns the meta object for class '{@link fsmConfigurationTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see fsmConfigurationTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link fsmConfigurationTrace.Steps.impl.FsmConfiguration_FSMConfiguration_RunImpl <em>Fsm Configuration FSM Configuration Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.Steps.impl.FsmConfiguration_FSMConfiguration_RunImpl
		 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getFsmConfiguration_FSMConfiguration_Run()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_FSM_CONFIGURATION_RUN = eINSTANCE.getFsmConfiguration_FSMConfiguration_Run();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_AbstractSubStep <em>Fsm Configuration FSM Configuration Run Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.Steps.FsmConfiguration_FSMConfiguration_Run_AbstractSubStep
		 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getFsmConfiguration_FSMConfiguration_Run_AbstractSubStep()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_ABSTRACT_SUB_STEP = eINSTANCE.getFsmConfiguration_FSMConfiguration_Run_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.Steps.impl.FsmConfiguration_FSMConfiguration_Run_ImplicitStepImpl <em>Fsm Configuration FSM Configuration Run Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.Steps.impl.FsmConfiguration_FSMConfiguration_Run_ImplicitStepImpl
		 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getFsmConfiguration_FSMConfiguration_Run_ImplicitStep()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_FSM_CONFIGURATION_RUN_IMPLICIT_STEP = eINSTANCE.getFsmConfiguration_FSMConfiguration_Run_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.Steps.impl.FsmConfiguration_TransitionConfiguration_FireImpl <em>Fsm Configuration Transition Configuration Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.Steps.impl.FsmConfiguration_TransitionConfiguration_FireImpl
		 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getFsmConfiguration_TransitionConfiguration_Fire()
		 * @generated
		 */
		EClass FSM_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE = eINSTANCE.getFsmConfiguration_TransitionConfiguration_Fire();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.Steps.impl.RootImplicitStepImpl
		 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.Steps.impl.SpecificRootStepImpl <em>Specific Root Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.Steps.impl.SpecificRootStepImpl
		 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getSpecificRootStep()
		 * @generated
		 */
		EClass SPECIFIC_ROOT_STEP = eINSTANCE.getSpecificRootStep();

		/**
		 * The meta object literal for the '{@link fsmConfigurationTrace.Steps.impl.SpecificStepImpl <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmConfigurationTrace.Steps.impl.SpecificStepImpl
		 * @see fsmConfigurationTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

	}

} //StepsPackage
