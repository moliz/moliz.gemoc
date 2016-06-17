/**
 */
package fumlConfigurationFewStepsTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fumlConfigurationFewStepsTrace.Steps.StepsFactory
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
	String eNS_URI = "fumlConfigurationFewStepsTrace_Steps";

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
	StepsPackage eINSTANCE = fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.SpecificStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 39;

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
	 * The number of operations of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_OPERATION_COUNT = TracePackage.STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP = 21;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_IMPLICIT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_IMPLICIT_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_IMPLICIT_STEP = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION = 15;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION = 16;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION = 17;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP = 18;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_IMPLICIT_STEP = 19;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION = 20;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_IMPLICIT_STEP = 22;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION = 23;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP = 24;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_IMPLICIT_STEP = 25;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION = 26;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP = 27;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_IMPLICIT_STEP = 28;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION = 29;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP = 30;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_IMPLICIT_STEP = 31;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION = 32;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP = 33;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_IMPLICIT_STEP = 34;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivationImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION = 35;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION__SUB_STEPS = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION___GET_CALLER = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP = 36;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep()
	 * @generated
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_IMPLICIT_STEP = 37;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_IMPLICIT_STEP__MSEOCCURRENCE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_IMPLICIT_STEP__ENDING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_IMPLICIT_STEP__STARTING_STATE = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_IMPLICIT_STEP_FEATURE_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_IMPLICIT_STEP_OPERATION_COUNT = FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.RootImplicitStepImpl
	 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 38;

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
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = TracePackage.SMALL_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation();

	/**
	 * Returns the meta object for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation#getCaller()
	 * @generated
	 */
	EOperation getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation__GetCaller();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Abstract Sub Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep
	 * @generated
	 */
	EClass getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link fumlConfigurationFewStepsTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link fumlConfigurationFewStepsTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link fumlConfigurationFewStepsTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see fumlConfigurationFewStepsTrace.Steps.SpecificStep#getStartingState()
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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivationImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstanceImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstanceImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivationImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivationImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION___GET_CALLER = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation__GetCaller();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_ABSTRACT_SUB_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepImpl <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep()
		 * @generated
		 */
		EClass FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_IMPLICIT_STEP = eINSTANCE.getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.RootImplicitStepImpl
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link fumlConfigurationFewStepsTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationFewStepsTrace.Steps.SpecificStep
		 * @see fumlConfigurationFewStepsTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
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
