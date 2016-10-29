/**
 */
package petrinetConfigurationTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
 * @see petrinetConfigurationTrace.Steps.StepsFactory
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
	String eNS_URI = "petrinetConfigurationTrace_Steps";

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
	StepsPackage eINSTANCE = petrinetConfigurationTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.SpecificStep
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_MainImpl <em>Petrinet Configuration Net Configuration Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_MainImpl
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Main()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep <em>Petrinet Configuration Net Configuration Main Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Main_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Main Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Main_ImplicitStepImpl <em>Petrinet Configuration Net Configuration Main Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Main_ImplicitStepImpl
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Main_ImplicitStep()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_IMPLICIT_STEP__ENDING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_IMPLICIT_STEP__STARTING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Main Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_RunImpl <em>Petrinet Configuration Net Configuration Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_RunImpl
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN__MSEOCCURRENCE = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN__ENDING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN__STARTING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN__SUB_STEPS = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_FEATURE_COUNT = PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep <em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl <em>Petrinet Configuration Net Configuration Run Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP__ENDING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP__STARTING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Net Configuration Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_TransitionConfiguration_FireImpl <em>Petrinet Configuration Transition Configuration Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_TransitionConfiguration_FireImpl
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_TransitionConfiguration_Fire()
	 * @generated
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__MSEOCCURRENCE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__ENDING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE__STARTING_STATE = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Configuration Transition Configuration Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE_FEATURE_COUNT = PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetConfigurationTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetConfigurationTrace.Steps.impl.RootImplicitStepImpl
	 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main <em>Petrinet Configuration Net Configuration Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Main</em>'.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Main();

	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep <em>Petrinet Configuration Net Configuration Main Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Main Abstract Sub Step</em>'.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Main_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_ImplicitStep <em>Petrinet Configuration Net Configuration Main Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Main Implicit Step</em>'.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_ImplicitStep
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Main_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run <em>Petrinet Configuration Net Configuration Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Run</em>'.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Run();

	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep <em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>'.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_ImplicitStep <em>Petrinet Configuration Net Configuration Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Net Configuration Run Implicit Step</em>'.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_ImplicitStep
	 * @generated
	 */
	EClass getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire <em>Petrinet Configuration Transition Configuration Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Configuration Transition Configuration Fire</em>'.
	 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire
	 * @generated
	 */
	EClass getPetrinetConfiguration_TransitionConfiguration_Fire();

	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see petrinetConfigurationTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetConfigurationTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see petrinetConfigurationTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link petrinetConfigurationTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see petrinetConfigurationTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link petrinetConfigurationTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see petrinetConfigurationTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

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
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_MainImpl <em>Petrinet Configuration Net Configuration Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_MainImpl
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Main()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Main();

		/**
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep <em>Petrinet Configuration Net Configuration Main Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_AbstractSubStep
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Main_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Main_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Main_ImplicitStepImpl <em>Petrinet Configuration Net Configuration Main Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Main_ImplicitStepImpl
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Main_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_MAIN_IMPLICIT_STEP = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Main_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_RunImpl <em>Petrinet Configuration Net Configuration Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_RunImpl
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Run();

		/**
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep <em>Petrinet Configuration Net Configuration Run Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Run_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl <em>Petrinet Configuration Net Configuration Run Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_NetConfiguration_Run_ImplicitStepImpl
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_NET_CONFIGURATION_RUN_IMPLICIT_STEP = eINSTANCE.getPetrinetConfiguration_NetConfiguration_Run_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_TransitionConfiguration_FireImpl <em>Petrinet Configuration Transition Configuration Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.impl.PetrinetConfiguration_TransitionConfiguration_FireImpl
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getPetrinetConfiguration_TransitionConfiguration_Fire()
		 * @generated
		 */
		EClass PETRINET_CONFIGURATION_TRANSITION_CONFIGURATION_FIRE = eINSTANCE.getPetrinetConfiguration_TransitionConfiguration_Fire();

		/**
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.impl.RootImplicitStepImpl
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetConfigurationTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetConfigurationTrace.Steps.SpecificStep
		 * @see petrinetConfigurationTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
